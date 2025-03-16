package com.bsdate;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

public class BSDateDisplay {
    private static JLabel dateLabel;
    private static TrayIcon trayIcon;
    private static JWindow window; // Using JWindow instead of JFrame (No taskbar icon)

    public static void main(String[] args) {
        if (!SystemTray.isSupported()) {
            JOptionPane.showMessageDialog(null, "System tray not supported!");
            return;
        }

        // Create system tray
        SystemTray tray = SystemTray.getSystemTray();
        PopupMenu popupMenu = new PopupMenu();

        // Create Exit menu item
        MenuItem exitItem = new MenuItem("Exit");
        exitItem.addActionListener(e -> System.exit(0));
        popupMenu.add(exitItem);

        // Create Tray Icon
        Image icon = Toolkit.getDefaultToolkit().getImage("icon.png"); // Use your own icon
        trayIcon = new TrayIcon(icon, "BS Date Display", popupMenu);
        trayIcon.setImageAutoSize(true);

        try {
            tray.add(trayIcon);
        } catch (AWTException e) {
            e.printStackTrace();
        }

        // Create JWindow (No taskbar icon)
        window = new JWindow();
        window.setAlwaysOnTop(true);
        window.setSize(200, 50);
        window.setLayout(new BorderLayout());

        // Label for date
        dateLabel = new JLabel("Loading...", SwingConstants.CENTER);
        dateLabel.setFont(new Font("Arial", Font.BOLD, 14));
        dateLabel.setForeground(Color.WHITE);
        dateLabel.setBackground(new Color(0, 0, 0, 180));
        dateLabel.setOpaque(true);
        window.add(dateLabel, BorderLayout.CENTER);

        // Position the floating label
        positionWindow(window);

        // Update the date every second
        Timer timer = new Timer(true);
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                SwingUtilities.invokeLater(() -> dateLabel.setText(getBikramSambatDate()));
            }
        }, 0, 1000);

        // Show or hide window when clicking the tray icon
        trayIcon.addActionListener(e -> {
            if (window.isVisible()) {
                window.setVisible(false);
            } else {
                window.setVisible(true);
                positionWindow(window); // Reposition in case of screen size changes
            }
        });

        // Show the floating window automatically on startup
        window.setVisible(true);
    }

    // Position the window at bottom-right
    private static void positionWindow(Window frame) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = screenSize.width - frame.getWidth() - 0;
        int y = screenSize.height - frame.getHeight() - 47;
        frame.setLocation(x, y);
    }

    // Function to manually convert Gregorian Date to Bikram Sambat (BS) Date
    private static String getBikramSambatDate() {
        // Current Gregorian Date
        Date today = new Date();

        // Get current Gregorian year, month, and day
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateStr = sdf.format(today);
        int gYear = Integer.parseInt(dateStr.substring(0, 4));
        int gMonth = Integer.parseInt(dateStr.substring(5, 7));
        int gDay = Integer.parseInt(dateStr.substring(8, 10));

        // Bikram Sambat conversion logic
        int bsYear = gYear + 57; // BS year is roughly 57 years ahead of Gregorian year
        int bsMonth = 0;
        int bsDay = gDay;

        // BS Months start from Baisakh (mid-April in Gregorian)
        // If before mid-April, use previous year BS months
        if (gMonth > 3) { // After mid-April
            bsMonth = gMonth - 3; // Baisakh starts from mid-April
        } else { // Before April
            bsMonth = gMonth + 9; // Convert Jan-Mar to the previous year months (Ashad, Shrawan...)
            bsYear -= 1; // BS year is one less for these months
        }

        // Format the BS date
        String[] bsMonthNames = {
                "Baisakh", "Jestha", "Ashadh", "Shrawan", "Bhadra", "Ashwin", "Kartik", "Mangsir", "Poush", "Magh", "Falgun", "Chaitra"
        };

        String bsDate = bsYear + " " + bsMonthNames[bsMonth - 1] + " " + 3;
        return bsDate;  // Return in format: "2081 Baisakh 20"
    }
}

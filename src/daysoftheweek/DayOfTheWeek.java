/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daysoftheweek;

import java.util.Scanner;

/**
 *
 * @author Developer
 */
public class DayOfTheWeek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int value = 0;
        int newValue = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter year");
        int year = sc.nextInt();
        System.out.println("Please enter month in number (reference: January being 1)");
        int month = sc.nextInt();
        System.out.println("Please enter day number");
        int day = sc.nextInt();

        if (year % 4 == 0) {
            value = ((((year - 1900)) % 7) + ((year - 1900) / 4)) % 7;
            if (month == 1 || month == 4 || month == 7) {
                if (day > 1) {
                    newValue = (value + (day - 1)) % 7;
                } else if (day < 1) {
                    newValue = value + day;
                } else {
                    newValue = value;
                }

            }
            if (month == 2 || month == 8) {
                if (day > 5) {
                    newValue = (value + (day - 5)) % 7;
                } else if (day < 5) {
                    newValue = value + day;
                } else {
                    newValue = value;
                }
            }
            if (month == 3 || month == 11) {
                if (day > 4) {
                    newValue = (value + (day - 4)) % 7;
                } else if (day < 4) {
                    newValue = value + day;
                } else {
                    newValue = value;
                }
            }
            if (month == 5) {
                if (day > 6) {
                    newValue = (value + (day - 6)) % 7;
                } else if (day < 6) {
                    newValue = value + day;
                } else {
                    newValue = value;
                }
            }
            if (month == 6) {
                if (day > 3) {
                    newValue = (value + (day - 3)) % 7;
                } else if (day < 3) {
                    newValue = value + day;
                } else {
                    newValue = value;
                }
            }
            if (month == 10) {
                if (day > 7) {
                    newValue = (value + (day - 7)) % 7;
                } else if (day < 7) {
                    newValue = value + day;
                } else {
                    newValue = value;
                }
            }
            if (month == 9 || month == 12) {
                if (day > 2) {
                    newValue = (value + (day - 2)) % 7;
                } else if (day < 2) {
                    newValue = value + day;
                } else {
                    newValue = value;
                }
            }

        } else {
            value = (((1 + (year - 1900)) % 7) + ((year - 1900) / 4)) % 7;
            if (month == 1 || month == 10) {
                if (day > 1) {
                    newValue = (value + (day - 1)) % 7;
                } else if (day < 1) {
                    newValue = value + day;
                } else {
                    newValue = value;
                }

            }
            if (month == 2 || month == 3 || month == 11) {
                if (day > 5) {
                    newValue = (value + (day - 5)) % 7;
                } else if (day < 5) {
                    newValue = value + day;
                } else {
                    newValue = value;
                }
            }
            if (month == 4 || month == 7) {
                if (day > 2) {
                    newValue = (value + (day - 2)) % 7;
                } else if (day < 2) {
                    newValue = value + day;
                } else {
                    newValue = value;
                }
            }
            if (month == 5) {
                if (day > 7) {
                    newValue = (value + (day - 7)) % 7;
                } else if (day < 7) {
                    newValue = value + day;
                } else {
                    newValue = value;
                }
            }
            if (month == 6) {
                if (day > 4) {
                    newValue = (value + (day - 4)) % 7;
                } else if (day < 4) {
                    newValue = value + day;
                } else {
                    newValue = value;
                }
            }
            if (month == 8) {
                if (day > 6) {
                    newValue = (value + (day - 6)) % 7;
                } else if (day < 6) {
                    newValue = value + day;
                } else {
                    newValue = value;
                }
            }
            if (month == 9 || month == 12) {
                if (day > 3) {
                    newValue = (value + (day - 3)) % 7;
                } else if (day < 3) {
                    newValue = value + day;
                } else {
                    newValue = value;
                }
            }

        }
        if (newValue == 0) {
            System.out.println("Sunday");
        }
        if (newValue == 1) {
            System.out.println("Monday");
        }
        if (newValue == 2) {
            System.out.println("Tuesday");
        }
        if (newValue == 3) {
            System.out.println("Wednesday");
        }
        if (newValue == 4) {
            System.out.println("Thursday");
        }
        if (newValue == 5) {
            System.out.println("Friday");
        }
        if (newValue == 6) {
            System.out.println("Saturday");
        }
    }

}

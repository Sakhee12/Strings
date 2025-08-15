package strings;

public class OrderDate {

    public static void main(String[] args) {
        
        String[] dates = {"12-Jan-2023", "05-Mar-2023", "25-Dec-2022", "14-Aug-2025"};

        bubbleSort(dates);

        for (String date : dates) {
            System.out.print(date + " ");
        }
    }

    public static void bubbleSort(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (compare(arr[j], arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static int monthToNumber(String month) {
        switch (month.toLowerCase()) {
            case "jan": return 1;
            case "feb": return 2;
            case "mar": return 3;
            case "apr": return 4;
            case "may": return 5;
            case "jun": return 6;
            case "jul": return 7;
            case "aug": return 8;
            case "sep": return 9;
            case "oct": return 10;
            case "nov": return 11;
            case "dec": return 12;
            default: return 0; 
        }
    }

    public static int compare(String d1, String d2) {
        String[] s1 = d1.split("-");
        String[] s2 = d2.split("-");

        int day1 = Integer.parseInt(s1[0]);
        int month1 = monthToNumber(s1[1]);
        int year1 = Integer.parseInt(s1[2]);

        int day2 = Integer.parseInt(s2[0]);
        int month2 = monthToNumber(s2[1]);
        int year2 = Integer.parseInt(s2[2]);

        return (year1 != year2) ? (year1 > year2 ? 1 : -1)
                : (month1 != month2) ? (month1 > month2 ? 1 : -1)
                : (day1 != day2) ? (day1 > day2 ? 1 : -1)
                : 0;
    }
}

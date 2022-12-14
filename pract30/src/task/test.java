package task;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class test {
    static JFrame frame = new JFrame();
    static InternetOrder internetOrder;
    static TableOrder tableOrder;
    public static void main(String[] args) {
        JButton button1 = new JButton("Place an online order");
        JButton button2 = new JButton("Choose a table");
        JPanel panel = new JPanel();
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                internetOrder = new InternetOrder();
                JButton buttonX1 = new JButton("add");
                JButton buttonX2 = new JButton("remove");
                JButton buttonX3 = new JButton("Get total cost");
                JButton buttonX4 = new JButton("Get items");
                JPanel moves = new JPanel();
                moves.setLayout(new GridLayout());
                moves.add(buttonX1);
                moves.add(buttonX2);
                moves.add(buttonX3);
                moves.add(buttonX4);
                frame.add(moves);
                buttonX1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        moves.setVisible(false);
                        JButton button_dr = new JButton("Drinks");
                        JButton button_di = new JButton("Dishes");
                        JPanel ord = new JPanel();
                        ord.setLayout(new GridLayout());
                        button_di.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                ord.setVisible(false);
                                JPanel dishes = new JPanel();
                                dishes.setLayout(new GridLayout());
                                MenuItem item1;
                                JButton borch = new JButton("Borch, 100");
                                item1 = new Dish(100, "Borch", "123");
                                MenuItem item2;
                                JButton pelmeni = new JButton("Pelmeni, 300");
                                item2 = new Dish(300, "Pelmeni", "123");
                                MenuItem item3;
                                JButton makaroni = new JButton("Makaroni, 50");
                                item3 = new Dish(50, "Makaroni", "123");
                                dishes.add(borch);
                                dishes.add(pelmeni);
                                dishes.add(makaroni);
                                borch.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        internetOrder.add(item1);
                                        dishes.setVisible(false);
                                        moves.setVisible(true);
                                    }
                                });
                                pelmeni.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        internetOrder.add(item2);
                                        dishes.setVisible(false);
                                        moves.setVisible(true);
                                    }
                                });
                                makaroni.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        internetOrder.add(item3);
                                        dishes.setVisible(false);
                                        moves.setVisible(true);
                                    }
                                });
                                frame.add(dishes);
                            }
                        });
                        button_dr.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                ord.setVisible(false);
                                JPanel drinks = new JPanel();
                                drinks.setLayout(new GridLayout());
                                MenuItem item1;
                                JButton borch = new JButton("Tequila, 500");
                                item1 = new Drink(DrinkTypeEnum.Tequila, 30,500,"Tequila", "123");
                                MenuItem item2;
                                JButton pelmeni = new JButton("Black_tea, 100");
                                item2 = new Drink(DrinkTypeEnum.Black_tea, 0,100,"Black_tea", "123");
                                MenuItem item3;
                                JButton makaroni = new JButton("Vodka, 300");
                                item3 = new Drink(DrinkTypeEnum.Vodka, 40,300,"Vodka", "123");
                                drinks.add(borch);
                                drinks.add(pelmeni);
                                drinks.add(makaroni);
                                borch.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        internetOrder.add(item1);
                                        drinks.setVisible(false);
                                        moves.setVisible(true);
                                    }
                                });
                                pelmeni.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        internetOrder.add(item2);
                                        drinks.setVisible(false);
                                        moves.setVisible(true);
                                    }
                                });
                                makaroni.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        internetOrder.add(item3);
                                        drinks.setVisible(false);
                                        moves.setVisible(true);
                                    }
                                });
                                frame.add(drinks);
                            }
                        });
                        ord.add(button_dr);
                        ord.add(button_di);
                        frame.add(ord);
                    }
                });
                buttonX2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JTextArea textArea = new JTextArea("Input here");
                        JPanel remove = new JPanel();
                        JButton confirm = new JButton("Confirm");
                        confirm.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if (internetOrder.remove(textArea.getText()))
                                {
                                    remove.setVisible(false);
                                    moves.setVisible(true);
                                }
                                else {
                                    JDialog dialog = new JDialog();
                                    dialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                                    dialog.setSize(180, 90);
                                    JLabel label = new JLabel("No such item");
                                    dialog.add(label);
                                    dialog.setLocationRelativeTo(null);
                                    dialog.setVisible(true);
                                    remove.setVisible(false);
                                    moves.setVisible(true);
                                }
                            }
                        });
                        remove.setLayout(new GridLayout());
                        remove.add(textArea);
                        remove.add(confirm);
                        frame.add(remove);
                        moves.setVisible(false);
                    }
                });
                buttonX3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JDialog dialog = new JDialog();
                        dialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                        dialog.setSize(180, 90);
                        JLabel label = new JLabel("Total cost: " + internetOrder.costTotal());
                        dialog.add(label);
                        dialog.setLocationRelativeTo(null);
                        dialog.setVisible(true);
                    }
                });
                buttonX4.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JDialog dialog = new JDialog();
                        JPanel s = new JPanel();
                        dialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                        for (int i = 0; i < internetOrder.itemsQuantity(); i++) {
                            JLabel label = new JLabel(internetOrder.getItems()[i].getName() + "  ");
                            s.add(label);
                        }
                        dialog.add(s);
                        dialog.setSize(300,300);
                        dialog.setLocationRelativeTo(null);
                        dialog.setVisible(true);
                    }
                });
                button1.setVisible(false);
                button2.setVisible(false);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tableOrder = new TableOrder();
                JButton table1 = new JButton("1");
                JButton table2 = new JButton("2");
                JButton table3 = new JButton("3");
                JButton table4 = new JButton("4");
                JButton table5 = new JButton("5");
                JButton table6 = new JButton("6");
                JPanel tables = new JPanel();
                tables.setLayout(new GridLayout(2,3));
                tables.add(table1);
                tables.add(table2);
                tables.add(table3);
                tables.add(table4);
                tables.add(table5);
                tables.add(table6);
                table1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        tables.setVisible(false);
                        JButton buttonX1 = new JButton("add");
                        JButton buttonX2 = new JButton("remove");
                        JButton buttonX3 = new JButton("Get total cost");
                        JButton buttonX4 = new JButton("Get items");
                        JPanel moves = new JPanel();
                        moves.setLayout(new GridLayout());
                        moves.add(buttonX1);
                        moves.add(buttonX2);
                        moves.add(buttonX3);
                        moves.add(buttonX4);
                        frame.add(moves);
                        buttonX1.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                moves.setVisible(false);
                                JButton button_dr = new JButton("Drinks");
                                JButton button_di = new JButton("Dishes");
                                JPanel ord = new JPanel();
                                ord.setLayout(new GridLayout());
                                button_di.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        ord.setVisible(false);
                                        JPanel dishes = new JPanel();
                                        dishes.setLayout(new GridLayout());
                                        MenuItem item1;
                                        JButton borch = new JButton("Borch, 100");
                                        item1 = new Dish(100, "Borch", "123");
                                        MenuItem item2;
                                        JButton pelmeni = new JButton("Pelmeni, 300");
                                        item2 = new Dish(300, "Pelmeni", "123");
                                        MenuItem item3;
                                        JButton makaroni = new JButton("Makaroni, 50");
                                        item3 = new Dish(50, "Makaroni", "123");
                                        dishes.add(borch);
                                        dishes.add(pelmeni);
                                        dishes.add(makaroni);
                                        borch.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                tableOrder.add(item1);
                                                dishes.setVisible(false);
                                                moves.setVisible(true);
                                            }
                                        });
                                        pelmeni.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                tableOrder.add(item2);
                                                dishes.setVisible(false);
                                                moves.setVisible(true);
                                            }
                                        });
                                        makaroni.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                tableOrder.add(item3);
                                                dishes.setVisible(false);
                                                moves.setVisible(true);
                                            }
                                        });
                                        frame.add(dishes);
                                    }
                                });
                                button_dr.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        ord.setVisible(false);
                                        JPanel drinks = new JPanel();
                                        drinks.setLayout(new GridLayout());
                                        MenuItem item1;
                                        JButton borch = new JButton("Tequila, 500");
                                        item1 = new Drink(DrinkTypeEnum.Tequila, 30, 500, "Tequila", "123");
                                        MenuItem item2;
                                        JButton pelmeni = new JButton("Black_tea, 100");
                                        item2 = new Drink(DrinkTypeEnum.Black_tea, 0, 100, "Black_tea", "123");
                                        MenuItem item3;
                                        JButton makaroni = new JButton("Vodka, 300");
                                        item3 = new Drink(DrinkTypeEnum.Vodka, 40, 300, "Vodka", "123");
                                        drinks.add(borch);
                                        drinks.add(pelmeni);
                                        drinks.add(makaroni);
                                        borch.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                tableOrder.add(item1);
                                                drinks.setVisible(false);
                                                moves.setVisible(true);
                                            }
                                        });
                                        pelmeni.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                tableOrder.add(item2);
                                                drinks.setVisible(false);
                                                moves.setVisible(true);
                                            }
                                        });
                                        makaroni.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                tableOrder.add(item3);
                                                drinks.setVisible(false);
                                                moves.setVisible(true);
                                            }
                                        });
                                        frame.add(drinks);
                                    }
                                });
                                ord.add(button_dr);
                                ord.add(button_di);
                                frame.add(ord);
                            }
                        });
                        buttonX2.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                JTextArea textArea = new JTextArea("Input here");
                                JPanel remove = new JPanel();
                                JButton confirm = new JButton("Confirm");
                                confirm.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        if (tableOrder.remove(textArea.getText()))
                                        {
                                            remove.setVisible(false);
                                            moves.setVisible(true);
                                        }
                                        else {
                                            JDialog dialog = new JDialog();
                                            dialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                                            dialog.setSize(180, 90);
                                            JLabel label = new JLabel("No such item");
                                            dialog.add(label);
                                            dialog.setLocationRelativeTo(null);
                                            dialog.setVisible(true);
                                            remove.setVisible(false);
                                            moves.setVisible(true);
                                        }
                                    }
                                });
                                remove.setLayout(new GridLayout());
                                remove.add(textArea);
                                remove.add(confirm);
                                frame.add(remove);
                                moves.setVisible(false);
                            }
                        });
                        buttonX3.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                JDialog dialog = new JDialog();
                                dialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                                dialog.setSize(180, 90);
                                JLabel label = new JLabel("Total cost: " + tableOrder.costTotal());
                                dialog.add(label);
                                dialog.setLocationRelativeTo(null);
                                dialog.setVisible(true);
                            }
                        });
                        buttonX4.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                JDialog dialog = new JDialog();
                                JPanel s = new JPanel();
                                dialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                                for (int i = 0; i < tableOrder.itemsQuantity(); i++) {
                                    JLabel label = new JLabel(tableOrder.getItems()[i].getName() + "  ");
                                    s.add(label);
                                }
                                dialog.add(s);
                                dialog.setSize(300,300);
                                dialog.setLocationRelativeTo(null);
                                dialog.setVisible(true);
                            }
                        });
                        button1.setVisible(false);
                        button2.setVisible(false);
                    }
                });
                table2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        tables.setVisible(false);
                        JButton buttonX1 = new JButton("add");
                        JButton buttonX2 = new JButton("remove");
                        JButton buttonX3 = new JButton("Get total cost");
                        JButton buttonX4 = new JButton("Get items");
                        JPanel moves = new JPanel();
                        moves.setLayout(new GridLayout());
                        moves.add(buttonX1);
                        moves.add(buttonX2);
                        moves.add(buttonX3);
                        moves.add(buttonX4);
                        frame.add(moves);
                        buttonX1.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                moves.setVisible(false);
                                JButton button_dr = new JButton("Drinks");
                                JButton button_di = new JButton("Dishes");
                                JPanel ord = new JPanel();
                                ord.setLayout(new GridLayout());
                                button_di.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        ord.setVisible(false);
                                        JPanel dishes = new JPanel();
                                        dishes.setLayout(new GridLayout());
                                        MenuItem item1;
                                        JButton borch = new JButton("Borch, 100");
                                        item1 = new Dish(100, "Borch", "123");
                                        MenuItem item2;
                                        JButton pelmeni = new JButton("Pelmeni, 300");
                                        item2 = new Dish(300, "Pelmeni", "123");
                                        MenuItem item3;
                                        JButton makaroni = new JButton("Makaroni, 50");
                                        item3 = new Dish(50, "Makaroni", "123");
                                        dishes.add(borch);
                                        dishes.add(pelmeni);
                                        dishes.add(makaroni);
                                        borch.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                tableOrder.add(item1);
                                                dishes.setVisible(false);
                                                moves.setVisible(true);
                                            }
                                        });
                                        pelmeni.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                tableOrder.add(item2);
                                                dishes.setVisible(false);
                                                moves.setVisible(true);
                                            }
                                        });
                                        makaroni.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                tableOrder.add(item3);
                                                dishes.setVisible(false);
                                                moves.setVisible(true);
                                            }
                                        });
                                        frame.add(dishes);
                                    }
                                });
                                button_dr.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        ord.setVisible(false);
                                        JPanel drinks = new JPanel();
                                        drinks.setLayout(new GridLayout());
                                        MenuItem item1;
                                        JButton borch = new JButton("Tequila, 500");
                                        item1 = new Drink(DrinkTypeEnum.Tequila, 30, 500, "Tequila", "123");
                                        MenuItem item2;
                                        JButton pelmeni = new JButton("Black_tea, 100");
                                        item2 = new Drink(DrinkTypeEnum.Black_tea, 0, 100, "Black_tea", "123");
                                        MenuItem item3;
                                        JButton makaroni = new JButton("Vodka, 300");
                                        item3 = new Drink(DrinkTypeEnum.Vodka, 40, 300, "Vodka", "123");
                                        drinks.add(borch);
                                        drinks.add(pelmeni);
                                        drinks.add(makaroni);
                                        borch.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                tableOrder.add(item1);
                                                drinks.setVisible(false);
                                                moves.setVisible(true);
                                            }
                                        });
                                        pelmeni.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                tableOrder.add(item2);
                                                drinks.setVisible(false);
                                                moves.setVisible(true);
                                            }
                                        });
                                        makaroni.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                tableOrder.add(item3);
                                                drinks.setVisible(false);
                                                moves.setVisible(true);
                                            }
                                        });
                                        frame.add(drinks);
                                    }
                                });
                                ord.add(button_dr);
                                ord.add(button_di);
                                frame.add(ord);
                            }
                        });
                        buttonX2.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                JTextArea textArea = new JTextArea("Input here");
                                JPanel remove = new JPanel();
                                JButton confirm = new JButton("Confirm");
                                confirm.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        if (tableOrder.remove(textArea.getText()))
                                        {
                                            remove.setVisible(false);
                                            moves.setVisible(true);
                                        }
                                        else {
                                            JDialog dialog = new JDialog();
                                            dialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                                            dialog.setSize(180, 90);
                                            JLabel label = new JLabel("No such item");
                                            dialog.add(label);
                                            dialog.setLocationRelativeTo(null);
                                            dialog.setVisible(true);
                                            remove.setVisible(false);
                                            moves.setVisible(true);
                                        }
                                    }
                                });
                                remove.setLayout(new GridLayout());
                                remove.add(textArea);
                                remove.add(confirm);
                                frame.add(remove);
                                moves.setVisible(false);
                            }
                        });
                        buttonX3.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                JDialog dialog = new JDialog();
                                dialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                                dialog.setSize(180, 90);
                                JLabel label = new JLabel("Total cost: " + tableOrder.costTotal());
                                dialog.add(label);
                                dialog.setLocationRelativeTo(null);
                                dialog.setVisible(true);
                            }
                        });
                        buttonX4.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                JDialog dialog = new JDialog();
                                JPanel s = new JPanel();
                                dialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                                for (int i = 0; i < tableOrder.itemsQuantity(); i++) {
                                    JLabel label = new JLabel(tableOrder.getItems()[i].getName() + "  ");
                                    s.add(label);
                                }
                                dialog.add(s);
                                dialog.setSize(300,300);
                                dialog.setLocationRelativeTo(null);
                                dialog.setVisible(true);
                            }
                        });
                        button1.setVisible(false);
                        button2.setVisible(false);
                    }
                });
                table3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        tables.setVisible(false);
                        JButton buttonX1 = new JButton("add");
                        JButton buttonX2 = new JButton("remove");
                        JButton buttonX3 = new JButton("Get total cost");
                        JButton buttonX4 = new JButton("Get items");
                        JPanel moves = new JPanel();
                        moves.setLayout(new GridLayout());
                        moves.add(buttonX1);
                        moves.add(buttonX2);
                        moves.add(buttonX3);
                        moves.add(buttonX4);
                        frame.add(moves);
                        buttonX1.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                moves.setVisible(false);
                                JButton button_dr = new JButton("Drinks");
                                JButton button_di = new JButton("Dishes");
                                JPanel ord = new JPanel();
                                ord.setLayout(new GridLayout());
                                button_di.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        ord.setVisible(false);
                                        JPanel dishes = new JPanel();
                                        dishes.setLayout(new GridLayout());
                                        MenuItem item1;
                                        JButton borch = new JButton("Borch, 100");
                                        item1 = new Dish(100, "Borch", "123");
                                        MenuItem item2;
                                        JButton pelmeni = new JButton("Pelmeni, 300");
                                        item2 = new Dish(300, "Pelmeni", "123");
                                        MenuItem item3;
                                        JButton makaroni = new JButton("Makaroni, 50");
                                        item3 = new Dish(50, "Makaroni", "123");
                                        dishes.add(borch);
                                        dishes.add(pelmeni);
                                        dishes.add(makaroni);
                                        borch.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                tableOrder.add(item1);
                                                dishes.setVisible(false);
                                                moves.setVisible(true);
                                            }
                                        });
                                        pelmeni.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                tableOrder.add(item2);
                                                dishes.setVisible(false);
                                                moves.setVisible(true);
                                            }
                                        });
                                        makaroni.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                tableOrder.add(item3);
                                                dishes.setVisible(false);
                                                moves.setVisible(true);
                                            }
                                        });
                                        frame.add(dishes);
                                    }
                                });
                                button_dr.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        ord.setVisible(false);
                                        JPanel drinks = new JPanel();
                                        drinks.setLayout(new GridLayout());
                                        MenuItem item1;
                                        JButton borch = new JButton("Tequila, 500");
                                        item1 = new Drink(DrinkTypeEnum.Tequila, 30, 500, "Tequila", "123");
                                        MenuItem item2;
                                        JButton pelmeni = new JButton("Black_tea, 100");
                                        item2 = new Drink(DrinkTypeEnum.Black_tea, 0, 100, "Black_tea", "123");
                                        MenuItem item3;
                                        JButton makaroni = new JButton("Vodka, 300");
                                        item3 = new Drink(DrinkTypeEnum.Vodka, 40, 300, "Vodka", "123");
                                        drinks.add(borch);
                                        drinks.add(pelmeni);
                                        drinks.add(makaroni);
                                        borch.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                tableOrder.add(item1);
                                                drinks.setVisible(false);
                                                moves.setVisible(true);
                                            }
                                        });
                                        pelmeni.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                tableOrder.add(item2);
                                                drinks.setVisible(false);
                                                moves.setVisible(true);
                                            }
                                        });
                                        makaroni.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                tableOrder.add(item3);
                                                drinks.setVisible(false);
                                                moves.setVisible(true);
                                            }
                                        });
                                        frame.add(drinks);
                                    }
                                });
                                ord.add(button_dr);
                                ord.add(button_di);
                                frame.add(ord);
                            }
                        });
                        buttonX2.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                JTextArea textArea = new JTextArea("Input here");
                                JPanel remove = new JPanel();
                                JButton confirm = new JButton("Confirm");
                                confirm.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        if (tableOrder.remove(textArea.getText()))
                                        {
                                            remove.setVisible(false);
                                            moves.setVisible(true);
                                        }
                                        else {
                                            JDialog dialog = new JDialog();
                                            dialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                                            dialog.setSize(180, 90);
                                            JLabel label = new JLabel("No such item");
                                            dialog.add(label);
                                            dialog.setLocationRelativeTo(null);
                                            dialog.setVisible(true);
                                            remove.setVisible(false);
                                            moves.setVisible(true);
                                        }
                                    }
                                });
                                remove.setLayout(new GridLayout());
                                remove.add(textArea);
                                remove.add(confirm);
                                frame.add(remove);
                                moves.setVisible(false);
                            }
                        });
                        buttonX3.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                JDialog dialog = new JDialog();
                                dialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                                dialog.setSize(180, 90);
                                JLabel label = new JLabel("Total cost: " + tableOrder.costTotal());
                                dialog.add(label);
                                dialog.setLocationRelativeTo(null);
                                dialog.setVisible(true);
                            }
                        });
                        buttonX4.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                JDialog dialog = new JDialog();
                                JPanel s = new JPanel();
                                dialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                                for (int i = 0; i < tableOrder.itemsQuantity(); i++) {
                                    JLabel label = new JLabel(tableOrder.getItems()[i].getName() + "  ");
                                    s.add(label);
                                }
                                dialog.add(s);
                                dialog.setSize(300,300);
                                dialog.setLocationRelativeTo(null);
                                dialog.setVisible(true);
                            }
                        });
                        button1.setVisible(false);
                        button2.setVisible(false);
                    }
                });
                table4.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        tables.setVisible(false);
                        JButton buttonX1 = new JButton("add");
                        JButton buttonX2 = new JButton("remove");
                        JButton buttonX3 = new JButton("Get total cost");
                        JButton buttonX4 = new JButton("Get items");
                        JPanel moves = new JPanel();
                        moves.setLayout(new GridLayout());
                        moves.add(buttonX1);
                        moves.add(buttonX2);
                        moves.add(buttonX3);
                        moves.add(buttonX4);
                        frame.add(moves);
                        buttonX1.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                moves.setVisible(false);
                                JButton button_dr = new JButton("Drinks");
                                JButton button_di = new JButton("Dishes");
                                JPanel ord = new JPanel();
                                ord.setLayout(new GridLayout());
                                button_di.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        ord.setVisible(false);
                                        JPanel dishes = new JPanel();
                                        dishes.setLayout(new GridLayout());
                                        MenuItem item1;
                                        JButton borch = new JButton("Borch, 100");
                                        item1 = new Dish(100, "Borch", "123");
                                        MenuItem item2;
                                        JButton pelmeni = new JButton("Pelmeni, 300");
                                        item2 = new Dish(300, "Pelmeni", "123");
                                        MenuItem item3;
                                        JButton makaroni = new JButton("Makaroni, 50");
                                        item3 = new Dish(50, "Makaroni", "123");
                                        dishes.add(borch);
                                        dishes.add(pelmeni);
                                        dishes.add(makaroni);
                                        borch.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                tableOrder.add(item1);
                                                dishes.setVisible(false);
                                                moves.setVisible(true);
                                            }
                                        });
                                        pelmeni.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                tableOrder.add(item2);
                                                dishes.setVisible(false);
                                                moves.setVisible(true);
                                            }
                                        });
                                        makaroni.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                tableOrder.add(item3);
                                                dishes.setVisible(false);
                                                moves.setVisible(true);
                                            }
                                        });
                                        frame.add(dishes);
                                    }
                                });
                                button_dr.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        ord.setVisible(false);
                                        JPanel drinks = new JPanel();
                                        drinks.setLayout(new GridLayout());
                                        MenuItem item1;
                                        JButton borch = new JButton("Tequila, 500");
                                        item1 = new Drink(DrinkTypeEnum.Tequila, 30, 500, "Tequila", "123");
                                        MenuItem item2;
                                        JButton pelmeni = new JButton("Black_tea, 100");
                                        item2 = new Drink(DrinkTypeEnum.Black_tea, 0, 100, "Black_tea", "123");
                                        MenuItem item3;
                                        JButton makaroni = new JButton("Vodka, 300");
                                        item3 = new Drink(DrinkTypeEnum.Vodka, 40, 300, "Vodka", "123");
                                        drinks.add(borch);
                                        drinks.add(pelmeni);
                                        drinks.add(makaroni);
                                        borch.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                tableOrder.add(item1);
                                                drinks.setVisible(false);
                                                moves.setVisible(true);
                                            }
                                        });
                                        pelmeni.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                tableOrder.add(item2);
                                                drinks.setVisible(false);
                                                moves.setVisible(true);
                                            }
                                        });
                                        makaroni.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                tableOrder.add(item3);
                                                drinks.setVisible(false);
                                                moves.setVisible(true);
                                            }
                                        });
                                        frame.add(drinks);
                                    }
                                });
                                ord.add(button_dr);
                                ord.add(button_di);
                                frame.add(ord);
                            }
                        });
                        buttonX2.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                JTextArea textArea = new JTextArea("Input here");
                                JPanel remove = new JPanel();
                                JButton confirm = new JButton("Confirm");
                                confirm.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        if (tableOrder.remove(textArea.getText()))
                                        {
                                            remove.setVisible(false);
                                            moves.setVisible(true);
                                        }
                                        else {
                                            JDialog dialog = new JDialog();
                                            dialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                                            dialog.setSize(180, 90);
                                            JLabel label = new JLabel("No such item");
                                            dialog.add(label);
                                            dialog.setLocationRelativeTo(null);
                                            dialog.setVisible(true);
                                            remove.setVisible(false);
                                            moves.setVisible(true);
                                        }
                                    }
                                });
                                remove.setLayout(new GridLayout());
                                remove.add(textArea);
                                remove.add(confirm);
                                frame.add(remove);
                                moves.setVisible(false);
                            }
                        });
                        buttonX3.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                JDialog dialog = new JDialog();
                                dialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                                dialog.setSize(180, 90);
                                JLabel label = new JLabel("Total cost: " + tableOrder.costTotal());
                                dialog.add(label);
                                dialog.setLocationRelativeTo(null);
                                dialog.setVisible(true);
                            }
                        });
                        buttonX4.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                JDialog dialog = new JDialog();
                                JPanel s = new JPanel();
                                dialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                                for (int i = 0; i < tableOrder.itemsQuantity(); i++) {
                                    JLabel label = new JLabel(tableOrder.getItems()[i].getName() + "  ");
                                    s.add(label);
                                }
                                dialog.add(s);
                                dialog.setSize(300,300);
                                dialog.setLocationRelativeTo(null);
                                dialog.setVisible(true);
                            }
                        });
                        button1.setVisible(false);
                        button2.setVisible(false);
                    }
                });
                table5.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        tables.setVisible(false);
                        JButton buttonX1 = new JButton("add");
                        JButton buttonX2 = new JButton("remove");
                        JButton buttonX3 = new JButton("Get total cost");
                        JButton buttonX4 = new JButton("Get items");
                        JPanel moves = new JPanel();
                        moves.setLayout(new GridLayout());
                        moves.add(buttonX1);
                        moves.add(buttonX2);
                        moves.add(buttonX3);
                        moves.add(buttonX4);
                        frame.add(moves);
                        buttonX1.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                moves.setVisible(false);
                                JButton button_dr = new JButton("Drinks");
                                JButton button_di = new JButton("Dishes");
                                JPanel ord = new JPanel();
                                ord.setLayout(new GridLayout());
                                button_di.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        ord.setVisible(false);
                                        JPanel dishes = new JPanel();
                                        dishes.setLayout(new GridLayout());
                                        MenuItem item1;
                                        JButton borch = new JButton("Borch, 100");
                                        item1 = new Dish(100, "Borch", "123");
                                        MenuItem item2;
                                        JButton pelmeni = new JButton("Pelmeni, 300");
                                        item2 = new Dish(300, "Pelmeni", "123");
                                        MenuItem item3;
                                        JButton makaroni = new JButton("Makaroni, 50");
                                        item3 = new Dish(50, "Makaroni", "123");
                                        dishes.add(borch);
                                        dishes.add(pelmeni);
                                        dishes.add(makaroni);
                                        borch.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                tableOrder.add(item1);
                                                dishes.setVisible(false);
                                                moves.setVisible(true);
                                            }
                                        });
                                        pelmeni.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                tableOrder.add(item2);
                                                dishes.setVisible(false);
                                                moves.setVisible(true);
                                            }
                                        });
                                        makaroni.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                tableOrder.add(item3);
                                                dishes.setVisible(false);
                                                moves.setVisible(true);
                                            }
                                        });
                                        frame.add(dishes);
                                    }
                                });
                                button_dr.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        ord.setVisible(false);
                                        JPanel drinks = new JPanel();
                                        drinks.setLayout(new GridLayout());
                                        MenuItem item1;
                                        JButton borch = new JButton("Tequila, 500");
                                        item1 = new Drink(DrinkTypeEnum.Tequila, 30, 500, "Tequila", "123");
                                        MenuItem item2;
                                        JButton pelmeni = new JButton("Black_tea, 100");
                                        item2 = new Drink(DrinkTypeEnum.Black_tea, 0, 100, "Black_tea", "123");
                                        MenuItem item3;
                                        JButton makaroni = new JButton("Vodka, 300");
                                        item3 = new Drink(DrinkTypeEnum.Vodka, 40, 300, "Vodka", "123");
                                        drinks.add(borch);
                                        drinks.add(pelmeni);
                                        drinks.add(makaroni);
                                        borch.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                tableOrder.add(item1);
                                                drinks.setVisible(false);
                                                moves.setVisible(true);
                                            }
                                        });
                                        pelmeni.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                tableOrder.add(item2);
                                                drinks.setVisible(false);
                                                moves.setVisible(true);
                                            }
                                        });
                                        makaroni.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                tableOrder.add(item3);
                                                drinks.setVisible(false);
                                                moves.setVisible(true);
                                            }
                                        });
                                        frame.add(drinks);
                                    }
                                });
                                ord.add(button_dr);
                                ord.add(button_di);
                                frame.add(ord);
                            }
                        });
                        buttonX2.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                JTextArea textArea = new JTextArea("Input here");
                                JPanel remove = new JPanel();
                                JButton confirm = new JButton("Confirm");
                                confirm.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        if (tableOrder.remove(textArea.getText()))
                                        {
                                            remove.setVisible(false);
                                            moves.setVisible(true);
                                        }
                                        else {
                                            JDialog dialog = new JDialog();
                                            dialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                                            dialog.setSize(180, 90);
                                            JLabel label = new JLabel("No such item");
                                            dialog.add(label);
                                            dialog.setLocationRelativeTo(null);
                                            dialog.setVisible(true);
                                            remove.setVisible(false);
                                            moves.setVisible(true);
                                        }
                                    }
                                });
                                remove.setLayout(new GridLayout());
                                remove.add(textArea);
                                remove.add(confirm);
                                frame.add(remove);
                                moves.setVisible(false);
                            }
                        });
                        buttonX3.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                JDialog dialog = new JDialog();
                                dialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                                dialog.setSize(180, 90);
                                JLabel label = new JLabel("Total cost: " + tableOrder.costTotal());
                                dialog.add(label);
                                dialog.setLocationRelativeTo(null);
                                dialog.setVisible(true);
                            }
                        });
                        buttonX4.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                JDialog dialog = new JDialog();
                                JPanel s = new JPanel();
                                dialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                                for (int i = 0; i < tableOrder.itemsQuantity(); i++) {
                                    JLabel label = new JLabel(tableOrder.getItems()[i].getName() + "  ");
                                    s.add(label);
                                }
                                dialog.add(s);
                                dialog.setSize(300,300);
                                dialog.setLocationRelativeTo(null);
                                dialog.setVisible(true);
                            }
                        });
                        button1.setVisible(false);
                        button2.setVisible(false);
                    }
                });
                table6.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        tables.setVisible(false);
                        JButton buttonX1 = new JButton("add");
                        JButton buttonX2 = new JButton("remove");
                        JButton buttonX3 = new JButton("Get total cost");
                        JButton buttonX4 = new JButton("Get items");
                        JPanel moves = new JPanel();
                        moves.setLayout(new GridLayout());
                        moves.add(buttonX1);
                        moves.add(buttonX2);
                        moves.add(buttonX3);
                        moves.add(buttonX4);
                        frame.add(moves);
                        buttonX1.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                moves.setVisible(false);
                                JButton button_dr = new JButton("Drinks");
                                JButton button_di = new JButton("Dishes");
                                JPanel ord = new JPanel();
                                ord.setLayout(new GridLayout());
                                button_di.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        ord.setVisible(false);
                                        JPanel dishes = new JPanel();
                                        dishes.setLayout(new GridLayout());
                                        MenuItem item1;
                                        JButton borch = new JButton("Borch, 100");
                                        item1 = new Dish(100, "Borch", "123");
                                        MenuItem item2;
                                        JButton pelmeni = new JButton("Pelmeni, 300");
                                        item2 = new Dish(300, "Pelmeni", "123");
                                        MenuItem item3;
                                        JButton makaroni = new JButton("Makaroni, 50");
                                        item3 = new Dish(50, "Makaroni", "123");
                                        dishes.add(borch);
                                        dishes.add(pelmeni);
                                        dishes.add(makaroni);
                                        borch.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                tableOrder.add(item1);
                                                dishes.setVisible(false);
                                                moves.setVisible(true);
                                            }
                                        });
                                        pelmeni.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                tableOrder.add(item2);
                                                dishes.setVisible(false);
                                                moves.setVisible(true);
                                            }
                                        });
                                        makaroni.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                tableOrder.add(item3);
                                                dishes.setVisible(false);
                                                moves.setVisible(true);
                                            }
                                        });
                                        frame.add(dishes);
                                    }
                                });
                                button_dr.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        ord.setVisible(false);
                                        JPanel drinks = new JPanel();
                                        drinks.setLayout(new GridLayout());
                                        MenuItem item1;
                                        JButton borch = new JButton("Tequila, 500");
                                        item1 = new Drink(DrinkTypeEnum.Tequila, 30, 500, "Tequila", "123");
                                        MenuItem item2;
                                        JButton pelmeni = new JButton("Black_tea, 100");
                                        item2 = new Drink(DrinkTypeEnum.Black_tea, 0, 100, "Black_tea", "123");
                                        MenuItem item3;
                                        JButton makaroni = new JButton("Vodka, 300");
                                        item3 = new Drink(DrinkTypeEnum.Vodka, 40, 300, "Vodka", "123");
                                        drinks.add(borch);
                                        drinks.add(pelmeni);
                                        drinks.add(makaroni);
                                        borch.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                tableOrder.add(item1);
                                                drinks.setVisible(false);
                                                moves.setVisible(true);
                                            }
                                        });
                                        pelmeni.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                tableOrder.add(item2);
                                                drinks.setVisible(false);
                                                moves.setVisible(true);
                                            }
                                        });
                                        makaroni.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                tableOrder.add(item3);
                                                drinks.setVisible(false);
                                                moves.setVisible(true);
                                            }
                                        });
                                        frame.add(drinks);
                                    }
                                });
                                ord.add(button_dr);
                                ord.add(button_di);
                                frame.add(ord);
                            }
                        });
                        buttonX2.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                JTextArea textArea = new JTextArea("Input here");
                                JPanel remove = new JPanel();
                                JButton confirm = new JButton("Confirm");
                                confirm.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        if (tableOrder.remove(textArea.getText()))
                                        {
                                            remove.setVisible(false);
                                            moves.setVisible(true);
                                        }
                                        else {
                                            JDialog dialog = new JDialog();
                                            dialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                                            dialog.setSize(180, 90);
                                            JLabel label = new JLabel("No such item");
                                            dialog.add(label);
                                            dialog.setLocationRelativeTo(null);
                                            dialog.setVisible(true);
                                            remove.setVisible(false);
                                            moves.setVisible(true);
                                        }
                                    }
                                });
                                remove.setLayout(new GridLayout());
                                remove.add(textArea);
                                remove.add(confirm);
                                frame.add(remove);
                                moves.setVisible(false);
                            }
                        });
                        buttonX3.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                JDialog dialog = new JDialog();
                                dialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                                dialog.setSize(180, 90);
                                JLabel label = new JLabel("Total cost: " + tableOrder.costTotal());
                                dialog.add(label);
                                dialog.setLocationRelativeTo(null);
                                dialog.setVisible(true);
                            }
                        });
                        buttonX4.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                JDialog dialog = new JDialog();
                                JPanel s = new JPanel();
                                dialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                                for (int i = 0; i < tableOrder.itemsQuantity(); i++) {
                                    JLabel label = new JLabel(tableOrder.getItems()[i].getName() + "  ");
                                    s.add(label);
                                }
                                dialog.add(s);
                                dialog.setSize(300,300);
                                dialog.setLocationRelativeTo(null);
                                dialog.setVisible(true);
                            }
                        });
                        button1.setVisible(false);
                        button2.setVisible(false);
                    }
                });
                frame.add(tables);
                button1.setVisible(false);
                button2.setVisible(false);
            }
        });
        panel.add(button1);
        panel.add(button2);
        frame.add(panel);
        frame.setSize(600,400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
//        System.out.println("InternetOrder: ");
//        Order order = new InternetOrder();
//        order.add(new Drink(DrinkTypeEnum.Brandy, 25, 100, "desc", "Good Brandy"));
//        order.add(new Dish(500, "dish", "desc2"));
//        System.out.print("Count of desk1: ");
//        System.out.println(order.itemQuantity("dish1"));
//        System.out.print("Order size: ");
//        System.out.println(order.itemsQuantity());
//        System.out.print("Names: ");
//        for(int i = 0; i<order.itemsQuantity();i++)
//        {
//            System.out.print(order.getItems()[i].getName());
//            System.out.print(' ');
//        }
//        System.out.println();
//        System.out.print("Sorted names by cost: ");
//        for(int i = 0; i<order.itemsQuantity();i++)
//        {
//            System.out.print(order.sortedItemsByCostDesc()[i].getName());
//            System.out.print(' ');
//        }
//        System.out.println();
//        order.remove("dish1");
//        System.out.print("Size after remove: ");
//        System.out.println(order.itemsQuantity());
//
//        System.out.println();
//        System.out.println("TableOrder: ");
//        Order order2 = new TableOrder();
//        order2.add(new Drink(DrinkTypeEnum.Vodka, 20, 70, "desc2", "Good vodka"));
//        order2.add(new Dish(500, "dish2", "desc3"));
//        System.out.print("Count of desk2: ");
//        System.out.println(order2.itemQuantity("dish2"));
//        System.out.print("Order size: ");
//        System.out.println(order2.itemsQuantity());
//        System.out.print("Names: ");
//        for(int i = 0; i<order2.itemsQuantity();i++)
//        {
//            System.out.print(order2.getItems()[i].getName());
//            System.out.print(' ');
//        }
//        System.out.println();
//        System.out.print("Sorted names by cost: ");
//        for(int i = 0; i<order2.itemsQuantity();i++)
//        {
//            System.out.print(order2.sortedItemsByCostDesc()[i].getName());
//            System.out.print(' ');
//        }
//        System.out.println();
//        order2.remove("dish2");
//        System.out.print("Size after remove: ");
//        System.out.println(order2.itemsQuantity());
//
//        System.out.println();
//        System.out.println("TableOrdersManager: ");
//        TableOrdersManager order_list = new TableOrdersManager();
//        order_list.add(order,0);
//        order_list.add(order2,1);
//        System.out.print("Count of desk2: ");
//        System.out.println(order_list.itemsQuantity(order.getItems()[1]));
//        System.out.print("Count of orders: ");
//        System.out.println(order_list.ordersQuantity());
//        System.out.print("First free table: ");
//        System.out.println(order_list.freeTableNumber());
//        System.out.print("Names of order2: ");
//        for(int i = 0; i<order2.itemsQuantity();i++)
//        {
//            System.out.print(order_list.getOrder(1).getItems()[i].getName());
//            System.out.print(' ');
//        }
//        System.out.println();
//        System.out.print("Orders cost summary: ");
//        System.out.println(order_list.ordersCostSummary());
//        order_list.remove(order);
//        System.out.print("Size after remove: ");
//        System.out.println(order_list.ordersQuantity());
//
//        System.out.println();
//        System.out.println("InternetOrdersManager: ");
//        InternetOrdersManager order_list2 = new InternetOrdersManager();
//        order_list2.add(order);
//        order_list2.add(order2);
//        System.out.print("Count of desk2: ");
//        System.out.println(order_list2.itemsQuantity(order.getItems()[1]));
//        System.out.print("Count of orders: ");
//        System.out.println(order_list2.ordersQuantity());
//        System.out.print("Orders cost summary: ");
//        System.out.println(order_list2.ordersCostSummary());
//        order_list2.remove();
//        System.out.print("Size after remove: ");
//        System.out.println(order_list2.ordersQuantity());
    }
}

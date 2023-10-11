import Modes.Edge;
import Modes.Node;

import java.util.*;

public class Astar {

    public static  double R(){
        return  (500*(new Random()).nextDouble());
    }

// the optimal time route is laid in a graph that simulates the transport network of a
  //  large city district, using  A-star algorithm

        static Node a1_2 = new Node("a1_2-Liberty avenue", 1250);
        static Node b1_2 = new Node("b1_2-Liberty avenue", 1250);
        static Node a2_1 = new Node("a2_1-Liberty avenue", 1150);
        static Node b2_1 = new Node("b2_1-Liberty avenue", 1150);
        static Node a2_3 = new Node("a2_3-Broad street", 1150);
        static Node b2_3 = new Node("b2_3-Broad street", 1150);
        static Node a2_8 = new Node("a2_8-High street", 1150);
        static Node a3_2 = new Node("a3_2-Broad street", 1400);
        static Node a3_1 = new Node("a3_1- Outskirt street", 1400);
        static Node a1_3 = new Node("a1_3- Outskirt street", 1250);
        static Node b3_2 = new Node("b3_2-Broad street", 1400);
        static Node a1_4 = new Node("a1_4-Baker street", 1250);
        static Node a4_1 = new Node("a4_1-Baker street", 1250);
        static Node a2_5 = new Node("a2_5-Heroes street", 1130);
        static Node a5_2 = new Node("a5_2-Heroes street", 850);
        static Node a3_6 = new Node("a3_6-Valley street", 1750);
        static Node a6_3 = new Node("a6_3-Valley street", 1600);
        static Node a4_5 = new Node("a4_5-Short street", 850);
        static Node b4_5 = new Node("b4_5-Short street", 850);
        static Node a5_4 = new Node("a5_4-Short street", 1020);
        static Node b5_4 = new Node("b5_4-Short street", 1020);
        static Node a5_6 = new Node("a5_6-Monreal street", 1000);
        static Node b5_6 = new Node("b5_6-Monreal street", 1000);
        static Node a6_5 = new Node("a6_5-Monreal street", 1600);
        static Node b6_5 = new Node("b6_5-Monreal street", 1600);
        static Node c6_5 = new Node("c6_5-Monreal street", 1600);
        static Node a4_7 = new Node("a4_7-Long street", 850);
        static Node a7_4 = new Node("a7_4-Long street", 550);
        static Node a5_8 = new Node("a5_8-Victory street", 1000);
        static Node a8_5 = new Node("a8_5-Victory street", 790);
        static Node a5_17 = new Node("a5_17-Middle street", 1010);
        static Node a17_5 = new Node("a17_5-Middle street", 1120);
        static Node a17_8 = new Node("a17_8-Corona street", 1120);
        static Node a6_17 = new Node("a6_17-Freedom street", 1600);
        static Node a17_6 = new Node("a17_6-Freedom street", 1100);
        static Node a7_8 = new Node("a7_8-Happy street", 570);
        static Node b7_8 = new Node("b7_8-Happy street", 570);
        static Node a8_7 = new Node("a8_7-Happy street", 800);
        static Node a8_2 = new Node("a8_2-High street", 800);
        static Node a7_9 = new Node("a7_9-Trump street", 550);
        static Node b7_9 = new Node("b7_9-Trump street", 550);
        static Node a9_7 = new Node("a9_7-Trump street", 270);
        static Node a8_10 = new Node("a8_10-Lincoln street", 780);
        static Node a8_17 = new Node("a8_17-Corona street", 780);
        static Node a10_8 = new Node("a10_8-Lincoln street", 620);
        static Node a17_10 = new Node("a17_10-Life avenue", 1110);
        static Node a17_11 = new Node("a17_11-Lewis street", 1110);
        static Node a10_17 = new Node("a10_17-Life avenue", 610);
        static Node a17_12 = new Node("a17_12-Free street", 1110);
        static Node a12_17 = new Node("a12_17-Free street", 1380);
        static Node a12_6 = new Node("a12_6-Journey street", 1400);
        static Node b12_6 = new Node("b12_6-Journey street", 1400);
        static Node a6_12 = new Node("a6_12-Journey street", 1400);
        static Node b6_12 = new Node("b6_12-Journey street", 1400);
        static Node a9_10 = new Node("a9_10-Kennedy street", 280);
        static Node b9_10 = new Node("b9_10-Kennedy street", 280);
        static Node a10_9 = new Node("a10_9-Kennedy street", 620);
        static Node b10_9 = new Node("b10_9-Kennedy street", 620);
        static Node a10_11 = new Node("a10_11-Apple street", 620);
        static Node b10_11 = new Node("b10_11-Apple street", 620);
        static Node a11_10 = new Node("a11_10-Apple street", 1000);
        static Node a11_12 = new Node("a11_12-Long street", 1000);
        static Node a11_17 = new Node("a11_17-Lewis street", 1000);
        static Node b11_12 = new Node("b11_12-Long street", 1000);
        static Node a12_11 = new Node("a12_11-Long street", 1380);
        static Node a9_13 = new Node("a9_13-Welly street", 270);
        static Node a13_9 = new Node("a13_9-Welly street", 0);
        static Node a10_14 = new Node("a10_14-Candy street", 670);
        static Node a14_10 = new Node("a14_10-Candy street", 550);
        static Node a11_15 = new Node("a11_15-Bayden street", 1010);
        static Node b11_15 = new Node("b11_15-Bayden street", 1010);
        static Node a15_11 = new Node("a15_11-Bayden street", 970);
        static Node a12_16 = new Node("a12_16-Hard street", 1390);
        static Node a16_12 = new Node("a16_12-Hard street", 1370);
        static Node a13_14 = new Node("a13_14-Cherry street", 0);
        static Node a14_13 = new Node("a14_13-Cherry street", 550);
        static Node b14_13 = new Node("b14_13-Cherry street", 550);
        static Node a14_15 = new Node("a14_15-Yellow street", 550);
        static Node b14_15 = new Node("b14_15-Yellow street", 550);
        static Node a15_14 = new Node("a15_14-Yellow street", 960);
        static Node a15_16 = new Node("a15_16-Green street", 960);
        static Node a16_15 = new Node("a16_15-Green street", 1350);


        static Node nodes[] = new Node[]{
                a1_2, b1_2, a2_1, b2_1, a2_3, b2_3,a2_8, a3_2, b3_2, a1_4, a4_1, a2_5, a5_2, a3_6, a6_3, a4_5, b4_5, a5_4, b5_4, a5_6, b5_6, a6_5, b6_5, c6_5,
                a4_7, a7_4, a5_8, a8_5, a5_17,   a17_5, a6_17, a17_6, a6_12, b6_12, a12_6, b12_6, a7_8, b7_8, a8_7,a8_2, a7_9, b7_9, a9_7, a8_10, a10_8,
                a10_17, a17_10, a17_12, a12_17, a9_10, b9_10, a10_9, b10_9, a10_11, b10_11, a11_10, a11_12, b11_12, a12_11, a9_13, a13_9, a10_14, a14_10,
                a11_15, b11_15, a15_11, a12_16, a16_12, a13_14, a14_13, b14_13, a14_15, b14_15, a15_14, a15_16, a16_15,a17_8, a8_17, a17_11, a11_17, a1_3, a3_1  };


        public static void initGraph() {

            int L2_1 = 520;
            int L2_3 = 670;
            int L2_8 = 570;
            double Wa2_1 = R()*10 + L2_1;
            double Wb2_1 = R()*10 + L2_1;
            double Wb1_2 = R()*10 + L2_1;
            double Wa2_3 = R()*10 + L2_3;
            double Wb2_3 = R()*10 + L2_3;
            a1_2.adjacencies = new Edge[]{
                    new Edge(a2_1, Wa2_1),
                    new Edge(b2_1, Wb2_1),
                    new Edge(b1_2, Wb1_2),
                    new Edge(a2_3, Wa2_3),
                    new Edge(b2_3, Wb2_3),};

            int L1_3=790;
            int L3_6= 260;
            double Wa3_1 = R()*10 + L1_3;
            double Wa3_6 = R()*10 + L3_6;
            double Wa3_2 = R()*10 + L2_3;
            double Wb3_2 = R()*10 + L2_3;
            a1_3.adjacencies = new Edge[]{
                    new Edge(a3_1, Wa3_1),
                    new Edge(a3_6, Wa3_6),
                    new Edge(a3_2, Wa3_2),
                    new Edge(b3_2, Wb3_2),};

            int L1_2 = L2_1;
            int L2_5 = 275;
            double Wa1_2 = R()*10 + L1_2;
            double Wa2_5 = R()*10 + L2_5;
            double Wa2_8 = R()*10 + L2_8;
            b1_2.adjacencies = new Edge[]{
                    new Edge(a1_2, Wa1_2),
                    new Edge(a2_5, Wa2_5),
                    new Edge(a2_3, Wa2_3),
                    new Edge(b2_3, Wb2_3),
                    new Edge(a2_8, Wa2_8),};

            int L1_4 = 245;
            double Wa1_4 = R()*10 + L1_4;
            a2_1.adjacencies = new Edge[]{
                    new Edge(b2_1, Wb2_1),
                    new Edge(a1_2, Wa1_2),
                    new Edge(b1_2, Wb1_2),
                    new Edge(a1_4, Wa1_4),};

            b2_1.adjacencies = new Edge[]{
                    new Edge(a2_1, Wa2_1),};


            a2_3.adjacencies = new Edge[]{
                    new Edge(a3_2, Wa3_2),
                    new Edge(b3_2, Wb3_2),
                    new Edge(b2_3, Wb2_3),};

            b2_3.adjacencies = new Edge[]{
                    new Edge(a2_3, Wa2_3),
                    new Edge(a3_6, Wa3_6),};


            a3_2.adjacencies = new Edge[]{
                    new Edge(a2_3, Wa2_3),
                    new Edge(b2_3, Wb2_3),
                    new Edge(b3_2, Wb3_2),
                    new Edge(a2_1, Wa2_1),
                    new Edge(b2_1, Wb2_1),
                    new Edge(a2_5, Wa2_5),
                    new Edge(a2_8, Wa2_8),};

            double Wa1_3 = R()*10 + L1_3;
            a3_1.adjacencies = new Edge[]{
                    new Edge(a1_3, Wa1_3),
                    new Edge(a1_2, Wa1_2),
                    new Edge(b1_2, Wb1_2),
                    new Edge(a1_4, Wa1_4),};

            b3_2.adjacencies = new Edge[]{
                    new Edge(a3_2, Wa3_2),
                    new Edge(b2_1, Wb2_1),
                    new Edge(a2_1, Wa2_1),};

            int L4_1 = 280;
            int L4_5 = 470;
            int L4_7 = 275;
            double Wa4_1 = R()*10 + L4_1;
            double Wa4_5 = R()*10 + L4_5;
            double Wb4_5 = R()*10 + L4_5;
            double Wa4_7 = R()*10 + L4_7;
            a1_4.adjacencies = new Edge[]{
                    new Edge(a4_1, Wa4_1),
                    new Edge(a4_5, Wa4_5),
                    new Edge(b4_5, Wb4_5),
                    new Edge(a4_7, Wa4_7),};

            a4_1.adjacencies = new Edge[]{
                    new Edge(a1_4, Wa1_4),
                    new Edge(a1_2, Wa1_2),
                    new Edge(b1_2, Wb1_2),};


            int L5_2 = 300;
            int L5_4 = 470;
            int L5_6 = 770;
            int L5_8 = 270;
            double Wa5_2 = R()*10 + L5_2;
            double Wa5_4 = R()*10 + L5_4;
            double Wb5_4 = R()*10 + L5_4;
            double Wa5_6 = R()*10 + L5_6;
            double Wb5_6 = R()*10 + L5_6;
            double Wa5_8 = R()*10 + L5_8;
            a2_5.adjacencies = new Edge[]{
                    new Edge(a5_2, Wa5_2),
                    new Edge(a5_4, Wa5_4),
                    new Edge(b5_4, Wb5_4),
                    new Edge(a5_6, Wa5_6),
                    new Edge(b5_6, Wb5_6),
                    new Edge(a5_8, Wa5_8),};

            a5_2.adjacencies = new Edge[]{
                    new Edge(a2_5, Wa2_5),
                    new Edge(a2_1, Wa2_1),
                    new Edge(b2_1, Wb2_1),
                    new Edge(a2_3, Wa2_3),
                    new Edge(b2_3, Wb2_3),};


            int L8_5 = 270;
            int L8_7 = 550;
            int L8_10 = 295;
            double Wa8_5 = R()*10 + L8_5;
            double Wa8_2 = R()*10 + L2_8;
            double Wa8_7 = R()*10 + L8_7;
            double Wa8_10 = R()*10 + L8_10;
            a2_8.adjacencies = new Edge[]{
                    new Edge(a8_5, Wa8_5),
                    new Edge(a8_2, Wa8_2),
                    new Edge(a8_7, Wa8_7),
                    new Edge(a8_10, Wa8_10),};

            int L6_3 = 310;
            int L6_5 = L5_6;
            int L6_17 = 380;
            int L6_12 = 610;
            double Wa6_3 = R()*10 + L6_3;
            double Wa6_5 = R()*10 + L6_5;
            double Wb6_5 = R()*10 + L6_5;
            double Wc6_5 = R()*10 + L6_5;
            double Wa6_17 = R()*10 + L6_17;
            double Wa6_12 = R()*10 + L6_12;
            double Wb6_12 = R()*10 + L6_12;

            a3_6.adjacencies = new Edge[]{
                    new Edge(a6_3, Wa6_3),
                    new Edge(a6_5, Wa6_5),
                    new Edge(b6_5, Wb6_5),
                    new Edge(c6_5, Wc6_5),
                    new Edge(a6_17, Wa6_17),
                    new Edge(a6_12, Wa6_12),
                    new Edge(b6_12, Wb6_12),};

            a6_3.adjacencies = new Edge[]{
                    new Edge(a3_6, Wa3_6),
                    new Edge(a3_2, Wa3_2),
                    new Edge(b3_2, Wb3_2),};


            a4_5.adjacencies = new Edge[]{
                    new Edge(b4_5, Wb4_5),
                    new Edge(a5_4, Wa5_4),
                    new Edge(b5_4, Wb5_4),
                    new Edge(a5_2, Wa5_2),
                    new Edge(a5_6, Wa5_6),
                    new Edge(b5_6, Wb5_6),};


            int L5_17 = 480;
            double Wa5_17 = R()*10 + L5_17;
            b4_5.adjacencies = new Edge[]{
                    new Edge(a4_5, Wa4_5),
                    new Edge(a5_8, Wa5_8),
                    new Edge(a5_17, Wa5_17),};

            a5_4.adjacencies = new Edge[]{
                    new Edge(b5_4, Wb5_4),
                    new Edge(a4_5, Wa4_5),
                    new Edge(b4_5, Wb4_5),
                    new Edge(a4_7, Wa4_7),};

            b5_4.adjacencies = new Edge[]{
                    new Edge(a5_4, Wa5_4),
                    new Edge(a4_1, Wa4_1),};


            a5_6.adjacencies = new Edge[]{
                    new Edge(b5_6, Wb5_6),
                    new Edge(a6_5, Wa6_5),
                    new Edge(b6_5, Wb6_5),
                    new Edge(c6_5, Wc6_5),
                    new Edge(a6_3, Wa6_3),};


            b5_6.adjacencies = new Edge[]{
                    new Edge(a5_6, Wa5_6),
                    new Edge(a6_17, Wa6_17),
                    new Edge(a6_12, Wa6_12),
                    new Edge(b6_12, Wb6_12),};

            a6_5.adjacencies = new Edge[]{
                    new Edge(b6_5, Wb6_5),
                    new Edge(a5_6, Wa5_6),
                    new Edge(b5_6, Wb5_6),
                    new Edge(a5_17, Wa5_17),
                    new Edge(a5_8, Wa5_8),
                    new Edge(a5_4, Wa5_4),
                    new Edge(b5_4, Wb5_4),};

            b6_5.adjacencies = new Edge[]{
                    new Edge(a6_5, Wa6_5),
                    new Edge(c6_5, Wc6_5),
                    new Edge(a5_4, Wa5_4),
                    new Edge(b5_4, Wb5_4),};

            c6_5.adjacencies = new Edge[]{
                    new Edge(b6_5, Wb6_5),
                    new Edge(a5_2, Wa5_2),};

            int L7_4 = L4_7;
            int L7_9 = 225;
            int L7_8 = 550;
            double Wa7_4 = R()*10 + L7_4;
            double Wa7_9 = R()*10 + L7_9;
            double Wb7_9 = R()*10 + L7_9;
            double Wa7_8 = R()*10 + L7_8;
            double Wb7_8 = R()*10 + L7_8;
            a4_7.adjacencies = new Edge[]{
                    new Edge(a7_4, Wa7_4),
                    new Edge(a7_9, Wa7_9),
                    new Edge(b7_9, Wb7_9),
                    new Edge(a7_8, Wa7_8),
                    new Edge(b7_8, Wb7_8),};

            a7_4.adjacencies = new Edge[]{
                    new Edge(a4_7, Wa4_7),
                    new Edge(a4_5, Wa4_5),
                    new Edge(b4_5, Wb4_5),
                    new Edge(a4_1, Wa4_1),};

            a5_8.adjacencies = new Edge[]{
                    new Edge(a8_5, Wa8_5),
                    new Edge(a8_7, Wa8_7),
                    new Edge(a8_10, Wa8_10),};

            a8_5.adjacencies = new Edge[]{
                    new Edge(a5_8, Wa5_8),
                    new Edge(a5_17, Wa5_17),
                    new Edge(a5_6, Wa5_6),
                    new Edge(b5_6, Wb5_6),
                    new Edge(a5_2, Wa5_2),
                    new Edge(a5_4, Wa5_4),
                    new Edge(b5_4, Wb5_4),};

            int L17_12 = 480;
            int L17_10 = 490;
            int L11_17 = 280;
            int L8_17 = 280;
            double Wa17_5 = R()*10 + L5_17;
            double Wa17_6 = R()*10 + L6_17;
            double Wa17_12 = R()*10 + L17_12;
            double Wa17_10 = R()*10 + L17_10;
            double Wa17_11 = R()*10 + L11_17;
            double Wa17_8 =  R()*10 + L8_17;
            a5_17.adjacencies = new Edge[]{
                    new Edge(a17_5, Wa17_5),
                    new Edge(a17_6, Wa17_6),
                    new Edge(a17_12, Wa17_12),
                    new Edge(a17_11, Wa17_11),
                    new Edge(a17_10, Wa17_10),
                    new Edge(a17_8, Wa17_8),

            };

            a17_5.adjacencies = new Edge[]{
                    new Edge(a5_17, Wa5_17),
                    new Edge(a5_6, Wa5_6),
                    new Edge(b5_6, Wb5_6),
                    new Edge(a5_8, Wa5_8),
                    new Edge(a5_2, Wa5_2),
                    new Edge(a5_4, Wa5_4),
                    new Edge(b5_4, Wb5_4),};

            a17_6.adjacencies = new Edge[]{
                    new Edge(a6_17, Wa6_17),
                    new Edge(a6_5, Wa6_5),
                    new Edge(b6_5, Wb6_5),
                    new Edge(c6_5, Wc6_5),
                    new Edge(a6_12, Wa6_12),
                    new Edge(b6_12, Wb6_12),
                    new Edge(a6_3, Wa6_3),};

            a6_17.adjacencies = new Edge[]{
                    new Edge(a17_6, Wa17_6),
                    new Edge(a17_5, Wa17_5),
                    new Edge(a17_8, Wa17_8),
                    new Edge(a17_10, Wa17_10),
                    new Edge(a17_11, Wa17_11),
                    new Edge(a17_12, Wa17_12),};

            int L12_16 = 295;
            double Wa12_6 = R()*10 + L6_12;
            double Wb12_6 = R()*10 + L6_12;
            double Wa12_16 = R()*10 + L12_16;
            a6_12.adjacencies = new Edge[]{
                    new Edge(b6_12, Wb6_12),
                    new Edge(a12_6, Wa12_6),
                    new Edge(b12_6, Wb12_6),
                    new Edge(a12_16, Wa12_16),};



            double Wa12_17 = R()*10 + L17_12;
            double Wa12_11 = R()*10 + L11_17;
            b6_12.adjacencies = new Edge[]{
                    new Edge(a6_12, Wa6_12),
                    new Edge(a12_17, Wa12_17),
                    new Edge(a12_11, Wa12_11),
                    new Edge(a12_16, Wa12_16),};

            a12_6.adjacencies = new Edge[]{
                    new Edge(b12_6, Wb12_6),
                    new Edge(a6_12, Wa6_12),
                    new Edge(a6_3, Wa6_3),
                    new Edge(b6_12, Wb6_12),
                    new Edge(a6_5, Wa6_5),
                    new Edge(b6_5, Wb6_5),
                    new Edge(c6_5, Wc6_5),
                    new Edge(a6_17, Wa6_17),};

            b12_6.adjacencies = new Edge[]{
                    new Edge(a12_6, Wa12_6),
                    new Edge(a6_3, Wa6_3),};


            int L9_7 = 260;
            int L9_13 = 280;
            int L9_10 = 680;
            double Wa9_7 = R()*10 + L9_7;
            double Wa9_13 = R()*10 + L9_13;
            double Wa9_10 = R()*10 + L9_10;
            double Wb9_10 = R()*10 + L9_10;
            a7_9.adjacencies = new Edge[]{
                    new Edge(b7_9, Wb7_9),
                    new Edge(a9_7, Wa9_7),
                    new Edge(a9_13, Wa9_13),
                    new Edge(a9_10, Wa9_10),
                    new Edge(b9_10, Wb9_10),};

            b7_9.adjacencies = new Edge[]{
                    new Edge(a7_9, Wa7_9),
                    new Edge(a9_13, Wa9_13),};

            a9_7.adjacencies = new Edge[]{
                    new Edge(a7_9, Wa7_9),
                    new Edge(b7_9, Wb7_9),
                    new Edge(a7_4, Wa7_4),
                    new Edge(a7_8, Wa7_8),
                    new Edge(b7_8, Wb7_8),};


            int L10_17 = L17_10;
            int L10_11 = 330;
            double Wa10_9 = R()*10 + L9_10;
            double Wb10_9 = R()*10 + L9_10;
            double Wa10_8 = R()*10 + L9_10;
            double Wa10_17 = R()*10 + L10_17;
            double Wa10_11 = R()*10 + L10_11;
            double Wb10_11 = R()*10 + L10_11;

            a7_8.adjacencies = new Edge[]{
                    new Edge(b7_8, Wb7_8),
                    new Edge(a8_7, Wa8_7),
                    new Edge(a5_8, Wa5_8),
                    new Edge(a8_2, Wa8_2),};

            b7_8.adjacencies = new Edge[]{
                    new Edge(a7_8, Wb7_8),
                    new Edge(a8_10, Wa8_10),};

            a8_7.adjacencies = new Edge[]{
                    new Edge(a7_8, Wa7_8),
                    new Edge(b7_8, Wb7_8),
                    new Edge(a7_4, Wa7_4),
                    new Edge(a7_9, Wa7_9),
                    new Edge(b7_9, Wb7_9),};

            int L10_14 = 275;
            double Wa10_14 = R()*10 + L10_14;
            a8_10.adjacencies = new Edge[]{
                    new Edge(a10_8, Wa10_8),
                    new Edge(a10_9, Wa10_9),
                    new Edge(b10_9, Wb10_9),
                    new Edge(a10_14, Wa10_14),
                    new Edge(a10_11, Wa10_11),
                    new Edge(b10_11, Wb10_11),
                    new Edge(a10_17, Wa10_17),};


            a8_17.adjacencies = new Edge[]{
                    new Edge(a17_8, Wa17_8),
                    new Edge(a17_10, Wa17_10),
                    new Edge(a17_11, Wa17_11),
                    new Edge(a17_12, Wa17_12),
                    new Edge(a17_6, Wa17_6),
                    new Edge(a17_5, Wa17_5), };

            a10_8.adjacencies = new Edge[]{
                    new Edge(a8_10, Wa8_10),
                    new Edge(a8_5, Wa8_5),
                    new Edge(a8_7, Wa8_7),
                    new Edge(a8_2, Wa8_2),};

            a10_17.adjacencies = new Edge[]{
                    new Edge(a17_10, Wa17_10),
                    new Edge(a17_11, Wa17_11),
                    new Edge(a17_12, Wa17_12),
                    new Edge(a17_6, Wa17_6),
                    new Edge(a17_5, Wa17_5),
                    new Edge(a17_8, Wa17_8), };

            a17_10.adjacencies = new Edge[]{
                    new Edge(a10_17, Wa10_17),
                    new Edge(a10_8, Wa10_8),
                    new Edge(a10_9, Wa10_9),
                    new Edge(b10_9, Wb10_9),
                    new Edge(a10_14, Wa10_14),};

            a8_2.adjacencies = new Edge[]{
                    new Edge(a2_5, Wa2_5),
                    new Edge(a2_8, Wa2_8),
                    new Edge(a2_3, Wa2_3),
                    new Edge(b2_3, Wb2_3),};


            double Wa8_17 = R()*10 + L8_17;
            a17_8.adjacencies = new Edge[]{
                    new Edge(a8_17, Wa8_17),
                    new Edge(a8_5, Wa8_5),
                    new Edge(a8_7, Wa8_7),
                    new Edge(a8_10, Wa8_10),
                    new Edge(a8_2, Wa8_2), };

            int L11_15 = 268;
            int L11_12 = 279;
            double Wa11_17 = R()*10 + L11_17;
            double Wa11_10 = R()*10 + L10_11;
            double Wa11_15 = R()*10 + L11_15;
            double Wb11_15 = R()*10 + L11_15;
            double Wa11_12 = R()*10 + L11_12;
            double Wb11_12 = R()*10 + L11_12;
            a17_11.adjacencies = new Edge[]{
                    new Edge(a11_17, Wa11_17),
                    new Edge(a11_10, Wa11_10),
                    new Edge(a11_15, Wa11_15),
                    new Edge(b11_15, Wb11_15),
                    new Edge(a11_12, Wa11_12),
                    new Edge(b11_12, Wb11_12),};

            a17_12.adjacencies = new Edge[]{
                    new Edge(a11_17, Wa11_17),
                    new Edge(a12_6, Wa12_6),
                    new Edge(b12_6, Wb12_6),
                    new Edge(a12_11, Wa12_11),
                    new Edge(a12_16, Wa12_16),};


            a12_17.adjacencies = new Edge[]{
                    new Edge(a17_12, Wa17_12),
                    new Edge(a17_6, Wa17_6),
                    new Edge(a17_5, Wa17_5),
                    new Edge(a17_8, Wa17_8),
                    new Edge(a17_10, Wa17_10),
                    new Edge(a17_11, Wa17_11), };

            a9_10.adjacencies = new Edge[]{
                    new Edge(b9_10, Wb9_10),
                    new Edge(a10_9, Wa10_9),
                    new Edge(b10_9, Wb10_9),
                    new Edge(a10_8, Wa10_8),
                    new Edge(a10_17, Wa10_17),
                    new Edge(a10_11, Wa10_11),
                    new Edge(b10_11, Wb10_11),};


            b9_10.adjacencies = new Edge[]{
                    new Edge(a9_10, Wa9_10),
                    new Edge(a10_14, Wa10_14),
                    new Edge(a10_11, Wa10_11),
                    new Edge(b10_11, Wb10_11),};


            a10_9.adjacencies = new Edge[]{
                    new Edge(b10_9, Wb10_9),
                    new Edge(a9_10, Wa9_10),
                    new Edge(b9_10, Wb9_10),
                    new Edge(a9_13, Wa9_13),};


            b10_9.adjacencies = new Edge[]{
                    new Edge(a10_9, Wa10_9),
                    new Edge(a9_7, Wa9_7),};


            a10_11.adjacencies = new Edge[]{
                    new Edge(b10_11, Wb10_11),
                    new Edge(a11_10, Wa11_10),
                    new Edge(a11_12, Wa11_12),
                    new Edge(b11_12, Wb11_12),};


            b10_11.adjacencies = new Edge[]{
                    new Edge(a10_11, Wa10_11),
                    new Edge(a11_15, Wa11_15),
                    new Edge(b11_15, Wb11_15),
                    new Edge(a11_12, Wa11_12),
                    new Edge(b11_12, Wb11_12),};


            a11_10.adjacencies = new Edge[]{
                    new Edge(a10_17, Wa10_17),
                    new Edge(a10_8, Wa10_8),
                    new Edge(a10_9, Wa10_9),
                    new Edge(b10_9, Wb10_9),
                    new Edge(a10_11, Wa10_11),
                    new Edge(b10_11, Wb10_11),};

            a11_12.adjacencies = new Edge[]{
                    new Edge(b11_12, Wb11_12),
                    new Edge(a12_11, Wa12_11),
                    new Edge(a12_17, Wa12_17),
                    new Edge(a12_6, Wa12_6),
                    new Edge(b12_6, Wb12_6),};

            a11_17.adjacencies = new Edge[]{
                    new Edge(a17_11, Wa17_11),
                    new Edge(a17_12, Wa17_12),
                    new Edge(a17_6, Wa17_6),
                    new Edge(a17_5, Wa17_5),
                    new Edge(a17_8, Wa17_8),
                    new Edge(a17_10, Wa17_10),};

            b11_12.adjacencies = new Edge[]{
                    new Edge(a11_12, Wa11_12),
                    new Edge(a12_16, Wa12_16),};

            a12_11.adjacencies = new Edge[]{
                    new Edge(a11_10, Wa11_10),
                    new Edge(a11_12, Wa11_12),
                    new Edge(b11_12, Wb11_12),
                    new Edge(a11_15, Wa11_15),
                    new Edge(b11_15, Wb11_15),};

            int L13_9 = 275;
            int L13_14 = 490;
            double Wa13_9 = R()*10 + L13_9;
            double Wa13_14 = R()*10 + L13_14;
            a9_13.adjacencies = new Edge[]{
                    new Edge(a13_9, Wa13_9),
                    new Edge(a13_14, Wa13_14),};


            a13_9.adjacencies = new Edge[]{
                    new Edge(a9_13, Wa9_13),
                    new Edge(a9_7, Wa9_7),
                    new Edge(a9_10, Wa9_10),
                    new Edge(b9_10, Wb9_10),};

            int L14_10 = 305;
            int L14_13 = L13_14;
            int L14_15 = 350;
            double Wa14_10 = R()*10 + L14_10;
            double Wa14_13 = R()*10 + L14_13;
            double Wb14_13 = R()*10 + L14_13;
            double Wa14_15 = R()*10 + L14_15;
            double Wb14_15 = R()*10 + L14_15;
            a10_14.adjacencies = new Edge[]{
                    new Edge(a14_10, Wa14_10),
                    new Edge(a14_13, Wa14_13),
                    new Edge(b14_13, Wb14_13),
                    new Edge(a14_15, Wa14_15),
                    new Edge(b14_15, Wb14_15),};


            a14_10.adjacencies = new Edge[]{
                    new Edge(a10_14, Wa10_14),
                    new Edge(a10_11, Wa10_11),
                    new Edge(b10_11, Wb10_11),
                    new Edge(a10_17, Wa10_17),
                    new Edge(a10_8, Wa10_8),
                    new Edge(a10_9, Wa10_9),
                    new Edge(b10_9, Wb10_9),};


            int L15_11 = 270;
            int L15_16 = 350;
            double Wa15_11 = R()*10 + L15_11;
            double Wa15_16 = R()*10 + L15_16;
            a11_15.adjacencies = new Edge[]{
                    new Edge(b11_15, Wb11_15),
                    new Edge(a15_11, Wa15_11),
                    new Edge(a15_16, Wa15_16),};

            double Wa15_14 = R()*10 + L14_15;
            b11_15.adjacencies = new Edge[]{
                    new Edge(a11_15, Wa11_15),
                    new Edge(a15_14, Wa15_14),};

            a15_11.adjacencies = new Edge[]{
                    new Edge(a11_15, Wa11_15),
                    new Edge(b11_15, Wb11_15),
                    new Edge(a11_12, Wa11_12),
                    new Edge(b11_12, Wb11_12),
                    new Edge(a11_10, Wa11_10),};


            int L16_12 = 285;
            int L16_15 = 325;
            double Wa16_12 = R()*10 + L16_12;
            double Wa16_15 = R()*10 + L16_15;
            a12_16.adjacencies = new Edge[]{
                    new Edge(a16_12, Wa16_12),
                    new Edge(a16_15, Wa16_15),};

            a16_12.adjacencies = new Edge[]{
                    new Edge(a12_16, Wa12_16),
                    new Edge(a12_6, Wa12_6),
                    new Edge(b12_6, Wb12_6),
                    new Edge(a12_17, Wa12_17),
                    new Edge(a12_11, Wa12_11),};


            a13_14.adjacencies = new Edge[]{
                    new Edge(a14_13, Wa14_13),
                    new Edge(b14_13, Wb14_13),
                    new Edge(a14_10, Wa14_10),
                    new Edge(a14_15, Wa14_15),
                    new Edge(b14_15, Wb14_15),};


            a14_13.adjacencies = new Edge[]{
                    new Edge(b14_13, Wb14_13),
                    new Edge(a13_14, Wa13_14),};

            b14_13.adjacencies = new Edge[]{
                    new Edge(a14_13, Wa14_13),
                    new Edge(a13_9, Wa13_9),};

            a14_15.adjacencies = new Edge[]{
                    new Edge(b14_15, Wb14_15),
                    new Edge(a15_14, Wa15_14),
                    new Edge(a15_16, Wa15_16),
                    new Edge(a15_11, Wa15_11)};

            b14_15.adjacencies = new Edge[]{
                    new Edge(a14_15, Wa14_15),
                    new Edge(a15_16, Wa15_16),};

            a15_14.adjacencies = new Edge[]{
                    new Edge(a14_15, Wa14_15),
                    new Edge(b14_15, Wb14_15),
                    new Edge(a14_10, Wa14_10),
                    new Edge(a14_13, Wa14_13),
                    new Edge(b14_13, Wb14_13),};

            a15_16.adjacencies = new Edge[]{
                    new Edge(a16_15, Wa16_15),
                    new Edge(a16_12, Wa16_12),};


            a16_15.adjacencies = new Edge[]{
                    new Edge(a15_16, Wa15_16),
                    new Edge(a15_11, Wa15_11),
                    new Edge(a15_14, Wa15_14),};

        }

        public static void main(String[] args) throws InterruptedException {


            //initialize the graph map
            initGraph();
            AstarSearch(a2_3, a13_14);
            List<Node> path = printPath(a13_14);
            System.out.println("Course: " + path);
            Thread.sleep(1000);
            while (path.size() > 1) {
                Node node = path.get(1);


                node.parent = null;
                for (Node n : nodes) {
                    n.parent = null;
                }

                AstarSearch(path.get(1), a13_14);

                path = printPath(a13_14);


                System.out.println("Course: " + path);
                double t1 = 0;
                double t2 = 5000;
                Thread.sleep((long) (t2-t1));
            }
        }
        public static List<Node> printPath(Node target) {
            ArrayList<Node> path = new ArrayList<Node>();
            for (Node node = target; node != null; node = node.parent) {
                path.add(node);
            }
            Collections.reverse(path);
            return path;
        }
        public static void AstarSearch(Node source, Node goal) {
            Set<Node> explored = new HashSet<Node>();
            PriorityQueue<Node> queue = new PriorityQueue<Node>(10000, new Comparator<Node>() {
                //override compare method
                public int compare(Node i, Node j) {
                    if (i.f_scores > j.f_scores) {
                        return 1;
                    } else if (i.f_scores < j.f_scores) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
            });
            //cost from start
            source.g_scores = 0;
            queue.add(source);
            boolean found = false;
            while ((!queue.isEmpty()) && (!found)) {
                //the node in having the lowest f_score value
                Node current = queue.poll();
                explored.add(current);
                //goal found
                if (current.value.equals(goal.value)) {
                    found = true;
                }
                //check every child of current node
                for (Edge e : current.adjacencies) {
                    Node child = e.target;
                    double cost = e.cost;
                    double temp_g_scores = current.g_scores + cost;
                    double temp_f_scores = temp_g_scores + child.h_scores;
  /*if child node has been evaluated and
   the newer f_score is higher, skip*/
                    if ((explored.contains(child)) &&
                            (temp_f_scores >= child.f_scores)) {
                        continue;
                    } else if ((!queue.contains(child)) ||
                            (temp_f_scores < child.f_scores)) {
                        child.parent = current;
                        child.g_scores = temp_g_scores;
                        child.f_scores = temp_f_scores;
                        if (queue.contains(child)) {
                            queue.remove(child);
                        }
                        queue.add(child);
                    }
                }
            }
        }
    }









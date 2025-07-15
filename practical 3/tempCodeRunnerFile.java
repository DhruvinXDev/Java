String s1 = s.trim();
        System.out.println("After trim Function : " + s1 + ", Length is : " + s1.length());
        System.out.println("Enter Replace Word in String 1st(original) & 2nd(Replace) : ");
        String original = in.next();
        String replace = in.next();
        System.out.println("After the Replace the String form : "+ s +" To : "+ s.replace(original, replace));
        System.out.println("Enter Char for Find : ");
        String index = in.next();
        System.out.println("Char at index : " + s.indexOf(index));
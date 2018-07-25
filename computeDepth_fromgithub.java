class computeDepth_fromgithub {

  public static void main(String[] args) {

    System.out.println(computeDepth(13));

  }
	/**
     * [computeDepth description]
     * @param  n [description]
     * @return  integer 1 if true otherwise 0 [description]
     */
    public static int computeDepth(int n) {

        int i = 1;
        int j = 0;
        int k = 0;

        boolean hasContribute = false;
        boolean search = true;
        int[] contribute = new int[10];

        for (int a = 0; a < contribute.length; a++) {
            contribute[a] = -1;
        }

        int count = 0;
        int digits = 0;

        while (search) {

            j = n * i;

            while (j > 0) {

                k = j % 10;
                j = j / 10;


                hasContribute = false;

                for (int l = 0; l < contribute.length; l++) {

                    if (contribute[l] == k) {
                        hasContribute = true;
                        l = contribute.length;
                    }
                }

                if (!hasContribute) {
                    contribute[count] = k;
                    count++;
                }

                digits = 0;

                for (int m = 0; m <= 9; m++) {

                    for (int x = 0; x < contribute.length; x++) {

                        if (m == contribute[x]) {

                            digits++;
                            x = contribute.length;
                        }
                    }

                }

            }

            if (digits == 10) {

                search = false;
                return i;

            }

            i++;

        }

        return 0;

    }

     /**
     * [matches description]
     * @param  a [description]
     * @param  p [description]
     * @return  integer 1 if true otherwise 0 [description]
     */
    public static int matches(int[ ] a, int[ ] p) {

        int start = 0;
        int end = 0;
        int len = 0;

        for (int i = 0; i < p.length; i++) {

            if (p[i] < 0)
                len = p[i] * ( -1 );
            else
                len = p[i];

            end += len;

            for (int j = start; j < end; j++) {

                if (p[i] > 0) {

                    if (a[j] < 0) return 0;

                } else {

                    if (a[j] > 0) return 0;
                }
            }

            start += len;
        }


        return 1;

    }


    /**
     * [isStacked description]
     * @param  n [description]
     * @return  integer 1 if true otherwise 0 [description]
     */
    public static int isStacked(int n) {

        int i = 1;
        int sum = 0;
        while (i <= n) {

            sum += i;

            if (sum == n) {
                return 1;
            }


            i++;

        }

        return 0;
    }
}

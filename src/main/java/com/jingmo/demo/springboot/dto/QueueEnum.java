�}QV  �>  A�����\��v
  !�rO*�'Vk����O�LH�"������]�A�3�3ܦ�&�)-����:�R��� NԄ�SQ%(++(��M�5`Vj�Ϥ�\��;2�8�n��۠�fG��`|�u�ZɄŜĐ�QĦG(�.{h�];��B˷�Aї�t��$���V���a����Ë⷇_�A�8�a>X/�9����Z�����i��~��$_����#����p^�ev['��bk"�ڐW�[Lr
R�y�)pB���Y�4�`;���azo���U�&I�_�K��:|ȍf�y�O���a]ô������?�fڲ��F�z�>n9V��~_!��>SvC��n{J�g��(9`��1q�
�Z�6�G���\a+&�Ƈ^�y��H�w$M�rִ]e�!F��ʣ�s��/G�����%�ߎ�ج���t�RT�|��o���ei@IU��4���]k�gr�e�aa��>���֧�#�s����e String exchange;
    /**
     * 队列名称
     */
    private String name;
    /**
     * 路由键
     */
    private String routeKey;

    QueueEnum(String exchange, String name, String routeKey) {
        this.exchange = exchange;
        this.name = name;
        this.routeKey = routeKey;
    }
}

�}^V  �>  10�,�qg7�v
  3�r��nj+0��(��g�gE�M��{��4��v$��]��.�Ԫ�G���.���Io����<�R���H�����X�m�����!:d��Q
Q@�"g�蝋�-Zf��NA" ��b
"د�����1DS^{8پ�ls �\GD���w���w�y�u5o�y&F��<��DE�����)��������� Y�k0M�]��0g��N���M?�@`����@)ޫ�x=G0�|��>K���\E'��)Ң���<WRJ������Xӷn�w�х&2������=hPI_����-���R�	fڲ��F�z�>n9V��~_!��>SvC��n{J�g��(9`��1q�
�Z�6�G���\a+&�Ƈ^�y��H�w$M�rִ]e�!F��ʣ�s��/G�����%�ߎ�ج���t�RT�|��o���ei@IU��4���]k�gr�e�aa��>���֧�#�s����l�2U~b�Ϫ�|{�׈6Fjb|="U��X����d�C�	�Qy�Ձ4u����lRs��(�}@®��k��V�y=�&i�뇣��z�}Z���ͫ������X.�)�_�*�ce��V�w�Lr�,/T|�ԩp������VL�ٕ�nz�>9�s/|-��ϵ��gKB`����y�NZ����){0u�n<k5a�)�)|��ӆ�{S3�ї]����j�¹��m�$�	\��)������"l���AK��~�D�H3��L��/�G��p�#�m$�MmL���;�+�A��������7�[�AЅ|��3l��K��Bt!�������&EXg��w��~�.΀��Rc��[�� ��^A��e&48�O��[��
�:�֫tM�T>�<�������r��~�Y��=)����FT�����5��!�(��;	���F9�hTV�P�x�=V6�S���b����H����� ��u��^xg��%&���x�O�R��E���ϨS0�k callback = new DefaultShellCallback(overwrite);
        //创建 MBG
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        //执行生成代码
        myBatisGenerator.generate(null);
        //输出警告信息
        for (String warning : warnings) {
            System.out.println(warning);
        }
    }
}

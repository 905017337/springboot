�}�V  �>  �)�[�v
  � �r���K�*(��5p,ǒaV�ڧ�����F&�Y���&��P}3u�?	�#�1lQbW��??�zm�A"���uzL#a��g�`�X~5��Ss�,(Q�{e>+^g*m�i��֜h�R�JC����2��kz��1���cEW�ֳF�Q!�ѭԺ)�ܱ��} ^ ��,�	�|�hA	i6��x=�0YXI,���R������y&Sfa4ov��:��P����iM0}v7�����ڕ9Eb!y�cM����l}�$�rk�R�*J��k�Z��p^�x�Zx_���yS@&(�a]ô������?�fڲ��F�z�>n9V��~_!��>SvC��n{J�g��(9`��1q�
�Z�6�G���\a+&�Ƈ^�y��H�w$M�rִ]e�!F��ʣ�s��/G�����%�ߎ�ج���t�RT�|��o���ei@IU��4���]k�gr�e�aa��>���֧�#�s����lD6-�;����bf����IǨ�c�xK���~�n��"���c_K�g�}k�I�%��jA�FM��E=�6�[������&p�nvP�m�yX����X�[p(xB0)�|!��儙�_y�Q7���\����N�����T�>%��j$��h��	��?_�s��
�0Ϗ%A,�R�w�q�v��:ʛz��~ ?%�$1/���J!!R�:���fŋ�e�Al�{FDWcء����8�4����<n]y&�Zѓ;RS�^Ju2��!��#"]�!D;�m9,�\.{�ݩ����y���\��'a���K��R
fm�4 G�p|u�[ut|7������?$���հ~��B�ٍ���PZ�˸e�^�8<O6�?�� �ח]d���-�P@���+2f4�������Oݖ�p�ß3�ԧ�#�'��p�=G�e)���I��1��	��(foW��ruI<&Ub�ETh�3Uw�%jn}�W{��i`�G<�~�:�N'�%��!)���4El�)���XA�)mJ�q�K�a��ϓ>
��:����K?�(��Qu��.=T#�_�"����uoA=J�ag����l��V]EZm��a��GP��}I�9/�o������_sIV>�=�rև���-�&�����!#�&]&I���܏!����~�$�ϓ�ĉ�?����\����E�����C�D�c�� �œ�Yf��~d��^��ơoh��M@ ��4���;ga?�d��vY@�����7��+�a&�(����Y�4<̠!ȿ�W��V�o�c���~�E{`:�Msi�_p�_o� m%;���ސ.�v�i�w\1#u`�L�e����c_�%$����ܗgg9u?������KR�`�k̰~N��y�a6�خ?ø��� ��/��<�E�"��9 ��R��ﰈ�9� 9��N����-�K�4�3����h`ʃc�6_��h��Nڃ ۖڮF��9{n4��`���n��KϒfM�t��ś�(�%�Q��l�*���E�2�:�������0lf�[�������2A��\ް{�ֽ0s�;�yrL���hc*���آ3���]�,P��ȩ�$���h�iR%ښM��$�1�\<\ƭ�a��$��>��䀜��س�	�j	̮� 1���')��uJ�����+�`�eR�B�za�j�
#+��H�u_P-m3�]�.WՉ�u�ǰ#u.�	�
��������
���_a��π�*Oo/H3���;t-�e�pg�8h ���-2�c'��8A{y��C�b�$��Eu#3�D�V8������y$~(+JydĚG�`�\�~�n���9��@Q�w�*�r��dK����V/'@����n���{/�% �q̱{(dƐ�=Dn��s�}L�*ܓ_
yP��=7P�nH�a�ۥ�̥ڱIzP�e\^�W��X��\���tlTjzm����,�P�_�x�u�{rɥ��;�;���9�H[��=<��J������ߙPR����Ǿ�?��l�*���)�����%��}U�y��<�3��H�K(]Ϛ��ʾ�;��KCE�Q�cB��c���5lEB���SGls�S�eس±�HzH}�ty����G�(��Mв��E˿X	���2��;�x���ؑ�b��7Q�����Pg����í]�'��B�za�Q\�<'��A�o!_N*v�T^�!�[!�6m���A��q�-..�U����^��F�q}�◤�k- vV3���n8y�x�>"�8!���-5�|��q.5:�E��$�!��I!*k�&�8��(҆�n� &;0PFwوUQДz�#�0�x���8��S]�1�g�DH��eV��&�U�V/'@�ڞB*�:���?*�ep�(Ū3&NƐ�=n��g�}r�+��c,��9o?�+�]�˥��ű4\[�>Q�-�K�4�3����h`ʃc�6_��h��Nڃ ۖڮF��9{n4��`���n��KϒfM�t��ś�(�%�Q��        List<SecurityReference> result = new ArrayList<>();
        AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything");
        AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
        authorizationScopes[0] = authorizationScope;
        result.add(new SecurityReference("Authorization", authorizationScopes));
        return result;
    }
}

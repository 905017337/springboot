�}"V  �>  �崽1��v
  � �r�3�7�*(�����2�B�OE���6VX�Hm^�Y~�)�$p�2WM�Q�����TJj(rkvF
C�$
ʞC���'r�iZ�aӸИ�$ L�>4� �6Pu�y�z�k%��3�y�?����S��`��o�}�H�]py�%�+����,1��n����Dno?^q�iVc� �ڇŦ��bL���;�~���֫�mQQM��JY���>����� g��:��P����iM0}v7�����ڕ9Eb!y�cM����l}�$�rk�R�*J��k�Z��p^�x�Zx_���yS@&(�a]ô������?�fڲ��F�z�>n9V��~_!��>SvC��n{J�g��(9`��1q�
�Z�6�G���\a+&�Ƈ^�y��H�w$M�rִ]e�!F��ʣ�s��/G�����%�ߎ�ج���t�RT�|��o���ei@IU��4���]k�gr�e�aa��>���֧�#�s����l%?4n�AaZD3j�N����A���j��j�u��b�.�[�?{�gK�=��+�������e�pȶ�����8^+z��M�b�Ko��?g;`e'L��.<�R�1��o�X/�T�0|��&�xz762�FZ�v�Gyy.V���SGsD��H>��+��F����鲍,��?�#�nE�y��UJ �A7]�l#̭	'C'H4	U��R�ra��U�Ֆǵ�H���D���:�v��N�j��\� ���\�Pk|�es����P��q�5�;��:��!D��-C>�|�Z+���ԻcM�%M^�2�Td嫼U��$��'G�#���6M �����%�,-H��X{����t����#�z�v�dc�f
�˚���b �B&���vp�P����t�Ó+���z��rV�j�fC��T&�ζXR4�_V �I�w�}tp��4h(u >��������+�9<���������4���EVK�!.G�Gtu�lD(�V �2o	���?����tMU5CO��DGǏ����\	��7%P�ݦ��ڠ)gɿ�`��z���	�*��`��z��x������ ������h6�A�趖�G ��ܧ���r�+d��L�vDs]�Cri~`���Iµ�손�ݯ.Q����^g�B��*/gB���I�\�gt$��l	��tbgB��q6�'rL��T�П��ƾ_��[�Uoa^4�5o���n(;Ryf�|�~�R����?C�'1�F�( wo[�X�|�m�[�n�6J] ���X
|V�
M�;j^�{!�\F��4�j\b�u�/O�@g*{�Y�]����f��}Q���Q�̑��
T�_�Q��#C祷K��e�;�/�i�0��b����сQ������&�`
lTn Ҙ�m���mWV��z�s��P��V����]p�f��ږU#���Ez��ݞ8(E<�P��*B�-L)��A<�ϒ�F�e�l��MJ�l '4�q��i���c�'
���ًn�� M�c >�-D��o�)�4}�<L������F)�9���qɮ���t�TՅ|v�3�J�q�ׇ���y�os�8�W'E��x� P�e���~�Gg,ړ����:���u��*�����<6��9p�J�)G�d�Q|�KA����)W|��O�n,׎y��`���yQ��CS��1Lu>�uJ���+v�=�ő�+цQ63j�]�3�;�����9B�)�(��Ǣ}���.���(,#��̲�>#�hB;^��<��7���H#[ ��w�}�g_s���N���,
E��a�`�i�Oa�c�5��.���xJi�X��͔?��	1	}�/��~+�mzxY��smw�m2�{��*.� � ��y��_��#�K�Ye�>O|��-;=T"+2��\p�Eî�` 8�Uۇ����M����mƗ�,3ۤ�(>����4����1|��N��J���D	=u���ɇU2�T�b?b�c��H��!�7�apl�,na]0h͎��*�m�=y7�Yn�,M�_ҷ���F�#a�S�)���r[����6y��\;��wl�ђ=f��'�=߇�}�p��U��P`N?AT,��
�uO���N&�p�g�c6�p�aE����f�t��T]6�	�"�n��I�ɣ�'7��9`n*OVY/�V'4itB�[�%�x	WL��}�\�U�i@��mDMrZOH
sȦ��	`dQ���'���t�o�J5�oo=� 4)U�#*o	DS���`���Z�꼪�PF�ٔ؄�X}���v$��?��'��R>t�YF�����ߢ�&A	����9W*
��.�-L���'8z^ �$����\ށ`����4>�������Q���(�TdB�8l.�G���a�U�k6CwU7�$��}|�����sӉ_x�l���=�N�⧵�πHޫI���,'�+�� �WXCߝ7���~��o"2S9�B��ј+
	��ME�P%fV΋��!�Q��	��������g�w�c���W��g>ation = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
                    authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                    LOGGER.info("authenticated user:{}", username);
                    SecurityContextHolder.getContext().setAuthentication(authentication);
                }
            }
        }
        chain.doFilter(request, response);
    }
}

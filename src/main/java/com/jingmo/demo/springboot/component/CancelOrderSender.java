�}0V  �>  �{�$�f-�v
  � �r��j[4��B�/�����1�d�Qd��:����Z��0}O�?����BG����ې��B�h߳ւa���.�{�Yƃ�q���?� ����`�zވ묐�+:H�Y5�YOX��N5ޫ�:� /�wqȜ�{��O��̔����"ۂn�1ߟ���Y�%Te$x�7d��|��`�9����M����f�Ju���pW%���K�㡍�_jm�7�P$q�#�P�����x@�۴��^b!y�cM����l}�$�rk�R�*J��k�Z��p^�x�Zx_���yS@&(�a]ô������?�fڲ��F�z�>n9V��~_!��>SvC��n{J�g��(9`��1q�
�Z�6�G���\a+&�Ƈ^�y��H�w$M�rִ]e�!F��ʣ�s��/G�����%�ߎ�ج���t�RT�|��o���ei@IU��4���]k�gr�e�aa��>���֧�#�s����lD0Y�j[0�X�W�is��H[;7xXSD���z��L�'��hH��Y?��K��eWR}14�k�͐ʌ?`�o����GjTSc����IL_�\�AڕV�E�EbprY��Y��_t�?1Z�<�=i�����fS�)�i���<�`��زe�%� ��S�-�jM�o�Xe"���=<V8�B�"���.�9-�sy>ɳ� ݂++XJ���!|V�'�h}��|f�9������k�wn�8	�$�CKdՏ���P鱳{���o	�Ш�ٝ@��w �/ΏΉ���s�]���c�[7��� ^k�:|��P5 e��9@�4�܀��`?>�+_Zk��s6���kHY�+�sHY3S�6):�eX��q&��%�ӵ�@�:",���<,R<s�T��ŧx��G�����̢m���lO�cc��rm��O�#�@/ Pf{E7�HL��'���̫���a��{�aS���	��Q��uH��V0�����
            @Override
            public Message postProcessMessage(Message message) throws AmqpException {
                //给消息设置延迟毫秒值
                message.getMessageProperties().setExpiration(String.valueOf(delayTimes));
                return message;
            }
        });
        LOGGER.info("send delay message orderId:{}",orderId);
    }
}

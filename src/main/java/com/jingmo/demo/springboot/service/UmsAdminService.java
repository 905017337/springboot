�}�V  �>  ��r�29�	�v
  �r�2n�Z0���6Qݷ}_اU�VQ��A(�޶��$׳V�/.�~LA���\N��ˆP�2,��,C-3���6�� �B:GO8)�F��ճH��Ɂlz�4��O�~�h�������@X��u5 ��N�a2L����t��{��Pēk��wXC�����%T�e�-<����9p|%��K�W����&4�O,t�+Y��,r�s(�xNL\|���<�M�Z�Fø�pEƍKxnn�!F� �:x�9�Y8��ΰ�o5���n;��n�$Bzc\�ۨ��yS@&(�a]ô������?�fڲ��F�z�>n9V��~_!��>SvC��n{J�g��(9`��1q�
�Z�6�G���\a+&�Ƈ^�y��H�w$M�rִ]e�!F��ʣ�s��/G�����%�ߎ�ج���t�RT�|��o���ei@IU��4���]k�gr�e�aa��>���֧�#�s����sword 密码
     * @return 生成的JWT的token
     */
    String login(String username, String password);

    /**
     * 获取用户所有权限（包括角色权限和+-权限）
     */
    List<UmsPermission> getPermissionList(Long adminId);
}

�}�V  �>  YPfO��v
  �r��j�Z4����w[���ʽ"��}N_��#
C��'3~kJ3c싴7��W_C6N�n@�%a�#��&9��R�1�3��#�	&W��_CNn�MILe�7�-O�)�:���-NG\3-F�����0�7x�3@��Z��J�>��f���ީ4_U���\ޭ>�6)��6�sv@��9���<������($�A���١� $���G�I���3ȝ1�7"O�I{(qO��O�g �z���?"��|�̓��o%Y�b�΁�{�[�~�x�Zx_���yS@&(�a]ô������?�fڲ��F�z�>n9V��~_!��>SvC��n{J�g��(9`��1q�
�Z�6�G���\a+&�Ƈ^�y��H�w$M�rִ]e�!F��ʣ�s��/G�����%�ߎ�ج���t�RT�|��o���ei@IU��4���]k�gr�e�aa��>���֧�#�s����t
@RabbitListener(queues = "mall.order.cancel")
public class CancelOrderReceiver {
    private static Logger LOGGER =LoggerFactory.getLogger(CancelOrderReceiver.class);
    @Autowired
    private OmsPortalOrderService portalOrderService;
    @RabbitHandler
    public void handle(Long orderId){
        LOGGER.info("receive delay message orderId:{}",orderId);
        portalOrderService.cancelOrder(orderId);
    }
}

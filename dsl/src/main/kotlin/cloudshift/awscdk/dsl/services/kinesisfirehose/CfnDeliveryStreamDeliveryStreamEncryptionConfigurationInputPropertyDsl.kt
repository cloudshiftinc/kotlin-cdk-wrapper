@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@CdkDslMarker
public class CfnDeliveryStreamDeliveryStreamEncryptionConfigurationInputPropertyDsl {
  private val cdkBuilder:
      CfnDeliveryStream.DeliveryStreamEncryptionConfigurationInputProperty.Builder =
      CfnDeliveryStream.DeliveryStreamEncryptionConfigurationInputProperty.builder()

  /**
   * @param keyArn If you set `KeyType` to `CUSTOMER_MANAGED_CMK` , you must specify the Amazon
   * Resource Name (ARN) of the CMK.
   * If you set `KeyType` to `AWS _OWNED_CMK` , Kinesis Data Firehose uses a service-account CMK.
   */
  public fun keyArn(keyArn: String) {
    cdkBuilder.keyArn(keyArn)
  }

  /**
   * @param keyType Indicates the type of customer master key (CMK) to use for encryption. 
   * The default setting is `AWS_OWNED_CMK` . For more information about CMKs, see [Customer Master
   * Keys (CMKs)](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#master_keys) .
   *
   * You can use a CMK of type CUSTOMER_MANAGED_CMK to encrypt up to 500 delivery streams.
   *
   *
   * To encrypt your delivery stream, use symmetric CMKs. Kinesis Data Firehose doesn't support
   * asymmetric CMKs. For information about symmetric and asymmetric CMKs, see [About Symmetric and
   * Asymmetric CMKs](https://docs.aws.amazon.com/kms/latest/developerguide/symm-asymm-concepts.html)
   * in the AWS Key Management Service developer guide.
   */
  public fun keyType(keyType: String) {
    cdkBuilder.keyType(keyType)
  }

  public fun build(): CfnDeliveryStream.DeliveryStreamEncryptionConfigurationInputProperty =
      cdkBuilder.build()
}

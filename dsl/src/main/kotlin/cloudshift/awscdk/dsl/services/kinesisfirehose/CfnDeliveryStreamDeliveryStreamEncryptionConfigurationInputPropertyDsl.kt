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

  public fun keyArn(keyArn: String) {
    cdkBuilder.keyArn(keyArn)
  }

  public fun keyType(keyType: String) {
    cdkBuilder.keyType(keyType)
  }

  public fun build(): CfnDeliveryStream.DeliveryStreamEncryptionConfigurationInputProperty =
      cdkBuilder.build()
}

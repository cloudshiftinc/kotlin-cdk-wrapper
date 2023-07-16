@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@CdkDslMarker
public class CfnDeliveryStreamEncryptionConfigurationPropertyDsl {
  private val cdkBuilder: CfnDeliveryStream.EncryptionConfigurationProperty.Builder =
      CfnDeliveryStream.EncryptionConfigurationProperty.builder()

  public fun kmsEncryptionConfig(kmsEncryptionConfig: IResolvable) {
    cdkBuilder.kmsEncryptionConfig(kmsEncryptionConfig)
  }

  public
      fun kmsEncryptionConfig(kmsEncryptionConfig: CfnDeliveryStream.KMSEncryptionConfigProperty) {
    cdkBuilder.kmsEncryptionConfig(kmsEncryptionConfig)
  }

  public fun noEncryptionConfig(noEncryptionConfig: String) {
    cdkBuilder.noEncryptionConfig(noEncryptionConfig)
  }

  public fun build(): CfnDeliveryStream.EncryptionConfigurationProperty = cdkBuilder.build()
}

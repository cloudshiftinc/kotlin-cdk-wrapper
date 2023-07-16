@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.nimblestudio

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.nimblestudio.CfnStreamingImage

@CdkDslMarker
public class CfnStreamingImageStreamingImageEncryptionConfigurationPropertyDsl {
  private val cdkBuilder: CfnStreamingImage.StreamingImageEncryptionConfigurationProperty.Builder =
      CfnStreamingImage.StreamingImageEncryptionConfigurationProperty.builder()

  public fun keyArn(keyArn: String) {
    cdkBuilder.keyArn(keyArn)
  }

  public fun keyType(keyType: String) {
    cdkBuilder.keyType(keyType)
  }

  public fun build(): CfnStreamingImage.StreamingImageEncryptionConfigurationProperty =
      cdkBuilder.build()
}

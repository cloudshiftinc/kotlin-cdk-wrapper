@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.nimblestudio

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.nimblestudio.CfnStudio

@CdkDslMarker
public class CfnStudioStudioEncryptionConfigurationPropertyDsl {
  private val cdkBuilder: CfnStudio.StudioEncryptionConfigurationProperty.Builder =
      CfnStudio.StudioEncryptionConfigurationProperty.builder()

  /**
   * @param keyArn The ARN for a KMS key that is used to encrypt studio data.
   */
  public fun keyArn(keyArn: String) {
    cdkBuilder.keyArn(keyArn)
  }

  /**
   * @param keyType The type of KMS key that is used to encrypt studio data. 
   */
  public fun keyType(keyType: String) {
    cdkBuilder.keyType(keyType)
  }

  public fun build(): CfnStudio.StudioEncryptionConfigurationProperty = cdkBuilder.build()
}

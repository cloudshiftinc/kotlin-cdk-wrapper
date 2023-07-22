@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.nimblestudio

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.nimblestudio.CfnStudio

/**
 * Configuration of the encryption method that is used for the studio.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.nimblestudio.*;
 * StudioEncryptionConfigurationProperty studioEncryptionConfigurationProperty =
 * StudioEncryptionConfigurationProperty.builder()
 * .keyType("keyType")
 * // the properties below are optional
 * .keyArn("keyArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studio-studioencryptionconfiguration.html)
 */
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

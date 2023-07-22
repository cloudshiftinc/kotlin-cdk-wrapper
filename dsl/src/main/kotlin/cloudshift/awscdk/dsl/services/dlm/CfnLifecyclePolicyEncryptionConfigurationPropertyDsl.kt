@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dlm

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy

/**
 * *[Event-based policies only]* Specifies the encryption settings for cross-Region snapshot copies
 * created by event-based policies.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dlm.*;
 * EncryptionConfigurationProperty encryptionConfigurationProperty =
 * EncryptionConfigurationProperty.builder()
 * .encrypted(false)
 * // the properties below are optional
 * .cmkArn("cmkArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-encryptionconfiguration.html)
 */
@CdkDslMarker
public class CfnLifecyclePolicyEncryptionConfigurationPropertyDsl {
  private val cdkBuilder: CfnLifecyclePolicy.EncryptionConfigurationProperty.Builder =
      CfnLifecyclePolicy.EncryptionConfigurationProperty.builder()

  /**
   * @param cmkArn The Amazon Resource Name (ARN) of the AWS KMS key to use for EBS encryption.
   * If this parameter is not specified, the default KMS key for the account is used.
   */
  public fun cmkArn(cmkArn: String) {
    cdkBuilder.cmkArn(cmkArn)
  }

  /**
   * @param encrypted To encrypt a copy of an unencrypted snapshot when encryption by default is not
   * enabled, enable encryption using this parameter. 
   * Copies of encrypted snapshots are encrypted, even if this parameter is false or when encryption
   * by default is not enabled.
   */
  public fun encrypted(encrypted: Boolean) {
    cdkBuilder.encrypted(encrypted)
  }

  /**
   * @param encrypted To encrypt a copy of an unencrypted snapshot when encryption by default is not
   * enabled, enable encryption using this parameter. 
   * Copies of encrypted snapshots are encrypted, even if this parameter is false or when encryption
   * by default is not enabled.
   */
  public fun encrypted(encrypted: IResolvable) {
    cdkBuilder.encrypted(encrypted)
  }

  public fun build(): CfnLifecyclePolicy.EncryptionConfigurationProperty = cdkBuilder.build()
}

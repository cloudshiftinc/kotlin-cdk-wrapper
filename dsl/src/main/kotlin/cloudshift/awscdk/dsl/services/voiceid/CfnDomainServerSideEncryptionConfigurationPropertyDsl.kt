@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.voiceid

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.voiceid.CfnDomain

/**
 * The configuration containing information about the customer managed key used for encrypting
 * customer data.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.voiceid.*;
 * ServerSideEncryptionConfigurationProperty serverSideEncryptionConfigurationProperty =
 * ServerSideEncryptionConfigurationProperty.builder()
 * .kmsKeyId("kmsKeyId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-voiceid-domain-serversideencryptionconfiguration.html)
 */
@CdkDslMarker
public class CfnDomainServerSideEncryptionConfigurationPropertyDsl {
  private val cdkBuilder: CfnDomain.ServerSideEncryptionConfigurationProperty.Builder =
      CfnDomain.ServerSideEncryptionConfigurationProperty.builder()

  /**
   * @param kmsKeyId The identifier of the KMS key to use to encrypt data stored by Voice ID. 
   * Voice ID doesn't support asymmetric customer managed keys .
   */
  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  public fun build(): CfnDomain.ServerSideEncryptionConfigurationProperty = cdkBuilder.build()
}

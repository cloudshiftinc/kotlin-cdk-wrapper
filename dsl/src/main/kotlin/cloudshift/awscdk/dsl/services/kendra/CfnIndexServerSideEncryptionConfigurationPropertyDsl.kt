@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kendra.CfnIndex

/**
 * Provides the identifier of the AWS KMS customer master key (CMK) used to encrypt data indexed by
 * Amazon Kendra.
 *
 * We suggest that you use a CMK from your account to help secure your index. Amazon Kendra doesn't
 * support asymmetric CMKs.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kendra.*;
 * ServerSideEncryptionConfigurationProperty serverSideEncryptionConfigurationProperty =
 * ServerSideEncryptionConfigurationProperty.builder()
 * .kmsKeyId("kmsKeyId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-serversideencryptionconfiguration.html)
 */
@CdkDslMarker
public class CfnIndexServerSideEncryptionConfigurationPropertyDsl {
  private val cdkBuilder: CfnIndex.ServerSideEncryptionConfigurationProperty.Builder =
      CfnIndex.ServerSideEncryptionConfigurationProperty.builder()

  /**
   * @param kmsKeyId The identifier of the AWS KMS key .
   * Amazon Kendra doesn't support asymmetric keys.
   */
  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  public fun build(): CfnIndex.ServerSideEncryptionConfigurationProperty = cdkBuilder.build()
}

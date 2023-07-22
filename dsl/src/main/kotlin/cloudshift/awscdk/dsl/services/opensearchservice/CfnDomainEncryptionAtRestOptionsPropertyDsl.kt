@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opensearchservice

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.opensearchservice.CfnDomain

/**
 * Whether the domain should encrypt data at rest, and if so, the AWS Key Management Service key to
 * use.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.opensearchservice.*;
 * EncryptionAtRestOptionsProperty encryptionAtRestOptionsProperty =
 * EncryptionAtRestOptionsProperty.builder()
 * .enabled(false)
 * .kmsKeyId("kmsKeyId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-encryptionatrestoptions.html)
 */
@CdkDslMarker
public class CfnDomainEncryptionAtRestOptionsPropertyDsl {
  private val cdkBuilder: CfnDomain.EncryptionAtRestOptionsProperty.Builder =
      CfnDomain.EncryptionAtRestOptionsProperty.builder()

  /**
   * @param enabled Specify `true` to enable encryption at rest.
   * Required if you enable fine-grained access control in
   * [AdvancedSecurityOptionsInput](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-advancedsecurityoptionsinput.html)
   * .
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled Specify `true` to enable encryption at rest.
   * Required if you enable fine-grained access control in
   * [AdvancedSecurityOptionsInput](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-advancedsecurityoptionsinput.html)
   * .
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param kmsKeyId The KMS key ID. Takes the form `1a2a3a4-1a2a-3a4a-5a6a-1a2a3a4a5a6a` . Required
   * if you enable encryption at rest.
   * You can also use `keyAlias` as a value.
   */
  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  public fun build(): CfnDomain.EncryptionAtRestOptionsProperty = cdkBuilder.build()
}

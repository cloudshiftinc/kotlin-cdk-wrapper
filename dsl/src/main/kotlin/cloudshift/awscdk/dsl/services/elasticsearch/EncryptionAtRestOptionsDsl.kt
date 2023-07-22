@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticsearch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Deprecated
import software.amazon.awscdk.services.elasticsearch.EncryptionAtRestOptions
import software.amazon.awscdk.services.kms.IKey

/**
 * (deprecated) Whether the domain should encrypt data at rest, and if so, the AWS Key Management
 * Service (KMS) key to use.
 *
 * Can only be used to create a new domain,
 * not update an existing one. Requires Elasticsearch version 5.1 or later.
 *
 * Example:
 *
 * ```
 * Domain domain = Domain.Builder.create(this, "Domain")
 * .version(ElasticsearchVersion.V7_1)
 * .enforceHttps(true)
 * .nodeToNodeEncryption(true)
 * .encryptionAtRest(EncryptionAtRestOptions.builder()
 * .enabled(true)
 * .build())
 * .fineGrainedAccessControl(AdvancedSecurityOptions.builder()
 * .masterUserName("master-user")
 * .build())
 * .build();
 * SecretValue masterUserPassword = domain.getMasterUserPassword();
 * ```
 *
 * @deprecated use opensearchservice module instead
 */
@CdkDslMarker
@Deprecated(message = "deprecated in CDK")
public class EncryptionAtRestOptionsDsl {
  private val cdkBuilder: EncryptionAtRestOptions.Builder = EncryptionAtRestOptions.builder()

  /**
   * @param enabled Specify true to enable encryption at rest.
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param kmsKey Supply if using KMS key for encryption at rest.
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun kmsKey(kmsKey: IKey) {
    cdkBuilder.kmsKey(kmsKey)
  }

  public fun build(): EncryptionAtRestOptions = cdkBuilder.build()
}

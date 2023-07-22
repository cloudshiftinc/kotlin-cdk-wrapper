@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opensearchservice

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.SecretValue
import software.amazon.awscdk.services.opensearchservice.AdvancedSecurityOptions

/**
 * Specifies options for fine-grained access control.
 *
 * Example:
 *
 * ```
 * Domain domain = Domain.Builder.create(this, "Domain")
 * .version(EngineVersion.OPENSEARCH_1_0)
 * .enforceHttps(true)
 * .nodeToNodeEncryption(true)
 * .encryptionAtRest(EncryptionAtRestOptions.builder()
 * .enabled(true)
 * .build())
 * .fineGrainedAccessControl(AdvancedSecurityOptions.builder()
 * .masterUserName("master-user")
 * .build())
 * .logging(LoggingOptions.builder()
 * .auditLogEnabled(true)
 * .slowSearchLogEnabled(true)
 * .appLogEnabled(true)
 * .slowIndexLogEnabled(true)
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class AdvancedSecurityOptionsDsl {
  private val cdkBuilder: AdvancedSecurityOptions.Builder = AdvancedSecurityOptions.builder()

  /**
   * @param masterUserArn ARN for the master user.
   * Only specify this or masterUserName, but not both.
   */
  public fun masterUserArn(masterUserArn: String) {
    cdkBuilder.masterUserArn(masterUserArn)
  }

  /**
   * @param masterUserName Username for the master user.
   * Only specify this or masterUserArn, but not both.
   */
  public fun masterUserName(masterUserName: String) {
    cdkBuilder.masterUserName(masterUserName)
  }

  /**
   * @param masterUserPassword Password for the master user.
   * You can use `SecretValue.unsafePlainText` to specify a password in plain text or
   * use `secretsmanager.Secret.fromSecretAttributes` to reference a secret in
   * Secrets Manager.
   */
  public fun masterUserPassword(masterUserPassword: SecretValue) {
    cdkBuilder.masterUserPassword(masterUserPassword)
  }

  public fun build(): AdvancedSecurityOptions = cdkBuilder.build()
}

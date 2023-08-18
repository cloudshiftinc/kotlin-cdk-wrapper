@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.elasticsearch

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Deprecated
import kotlin.String
import software.amazon.awscdk.SecretValue
import software.amazon.awscdk.services.elasticsearch.AdvancedSecurityOptions

/**
 * (deprecated) Specifies options for fine-grained access control.
 *
 * Example:
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
public class AdvancedSecurityOptionsDsl {
    private val cdkBuilder: AdvancedSecurityOptions.Builder = AdvancedSecurityOptions.builder()

    /**
     * @param masterUserArn ARN for the master user. Only specify this or masterUserName, but not
     *   both.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun masterUserArn(masterUserArn: String) {
        cdkBuilder.masterUserArn(masterUserArn)
    }

    /**
     * @param masterUserName Username for the master user. Only specify this or masterUserArn, but
     *   not both.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun masterUserName(masterUserName: String) {
        cdkBuilder.masterUserName(masterUserName)
    }

    /**
     * @param masterUserPassword Password for the master user. You can use
     *   `SecretValue.unsafePlainText` to specify a password in plain text or use
     *   `secretsmanager.Secret.fromSecretAttributes` to reference a secret in Secrets Manager.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun masterUserPassword(masterUserPassword: SecretValue) {
        cdkBuilder.masterUserPassword(masterUserPassword)
    }

    public fun build(): AdvancedSecurityOptions = cdkBuilder.build()
}

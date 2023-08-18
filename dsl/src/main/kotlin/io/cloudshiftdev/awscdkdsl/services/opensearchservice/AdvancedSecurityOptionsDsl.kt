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

package io.cloudshiftdev.awscdkdsl.services.opensearchservice

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.SecretValue
import software.amazon.awscdk.services.opensearchservice.AdvancedSecurityOptions
import software.amazon.awscdk.services.opensearchservice.SAMLOptionsProperty

/**
 * Specifies options for fine-grained access control.
 *
 * Example:
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
 * .samlAuthenticationEnabled(true)
 * .samlAuthenticationOptions(SAMLOptionsProperty.builder()
 * .idpEntityId("entity-id")
 * .idpMetadataContent("metadata-content-with-quotes-escaped")
 * .build())
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class AdvancedSecurityOptionsDsl {
    private val cdkBuilder: AdvancedSecurityOptions.Builder = AdvancedSecurityOptions.builder()

    /**
     * @param masterUserArn ARN for the master user. Only specify this or masterUserName, but not
     *   both.
     */
    public fun masterUserArn(masterUserArn: String) {
        cdkBuilder.masterUserArn(masterUserArn)
    }

    /**
     * @param masterUserName Username for the master user. Only specify this or masterUserArn, but
     *   not both.
     */
    public fun masterUserName(masterUserName: String) {
        cdkBuilder.masterUserName(masterUserName)
    }

    /**
     * @param masterUserPassword Password for the master user. You can use
     *   `SecretValue.unsafePlainText` to specify a password in plain text or use
     *   `secretsmanager.Secret.fromSecretAttributes` to reference a secret in Secrets Manager.
     */
    public fun masterUserPassword(masterUserPassword: SecretValue) {
        cdkBuilder.masterUserPassword(masterUserPassword)
    }

    /** @param samlAuthenticationEnabled True to enable SAML authentication for a domain. */
    public fun samlAuthenticationEnabled(samlAuthenticationEnabled: Boolean) {
        cdkBuilder.samlAuthenticationEnabled(samlAuthenticationEnabled)
    }

    /**
     * @param samlAuthenticationOptions Container for information about the SAML configuration for
     *   OpenSearch Dashboards. If set, `samlAuthenticationEnabled` will be enabled.
     */
    public fun samlAuthenticationOptions(
        samlAuthenticationOptions: SAMLOptionsPropertyDsl.() -> Unit = {}
    ) {
        val builder = SAMLOptionsPropertyDsl()
        builder.apply(samlAuthenticationOptions)
        cdkBuilder.samlAuthenticationOptions(builder.build())
    }

    /**
     * @param samlAuthenticationOptions Container for information about the SAML configuration for
     *   OpenSearch Dashboards. If set, `samlAuthenticationEnabled` will be enabled.
     */
    public fun samlAuthenticationOptions(samlAuthenticationOptions: SAMLOptionsProperty) {
        cdkBuilder.samlAuthenticationOptions(samlAuthenticationOptions)
    }

    public fun build(): AdvancedSecurityOptions = cdkBuilder.build()
}

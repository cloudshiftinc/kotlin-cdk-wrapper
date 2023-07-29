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

package cloudshift.awscdk.dsl.services.opensearchservice

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.opensearchservice.CfnDomain

/**
 * Specifies options for fine-grained access control.
 *
 * If you specify advanced security options, you must also enable node-to-node encryption (
 * [NodeToNodeEncryptionOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-nodetonodeencryptionoptions.html)
 * ) and encryption at rest (
 * [EncryptionAtRestOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-encryptionatrestoptions.html)
 * ). You must also enable `EnforceHTTPS` within
 * [DomainEndpointOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-domainendpointoptions.html)
 * , which requires HTTPS for all traffic to the domain.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.opensearchservice.*;
 * AdvancedSecurityOptionsInputProperty advancedSecurityOptionsInputProperty =
 * AdvancedSecurityOptionsInputProperty.builder()
 * .anonymousAuthDisableDate("anonymousAuthDisableDate")
 * .anonymousAuthEnabled(false)
 * .enabled(false)
 * .internalUserDatabaseEnabled(false)
 * .masterUserOptions(MasterUserOptionsProperty.builder()
 * .masterUserArn("masterUserArn")
 * .masterUserName("masterUserName")
 * .masterUserPassword("masterUserPassword")
 * .build())
 * .samlOptions(SAMLOptionsProperty.builder()
 * .enabled(false)
 * .idp(IdpProperty.builder()
 * .entityId("entityId")
 * .metadataContent("metadataContent")
 * .build())
 * .masterBackendRole("masterBackendRole")
 * .masterUserName("masterUserName")
 * .rolesKey("rolesKey")
 * .sessionTimeoutMinutes(123)
 * .subjectKey("subjectKey")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-advancedsecurityoptionsinput.html)
 */
@CdkDslMarker
public class CfnDomainAdvancedSecurityOptionsInputPropertyDsl {
    private val cdkBuilder: CfnDomain.AdvancedSecurityOptionsInputProperty.Builder =
        CfnDomain.AdvancedSecurityOptionsInputProperty.builder()

    /**
     * @param anonymousAuthDisableDate Date and time when the migration period will be disabled.
     *   Only necessary when
     *   [enabling fine-grained access control on an existing domain](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/fgac.html#fgac-enabling-existing)
     *   .
     */
    public fun anonymousAuthDisableDate(anonymousAuthDisableDate: String) {
        cdkBuilder.anonymousAuthDisableDate(anonymousAuthDisableDate)
    }

    /**
     * @param anonymousAuthEnabled True to enable a 30-day migration period during which
     *   administrators can create role mappings. Only necessary when
     *   [enabling fine-grained access control on an existing domain](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/fgac.html#fgac-enabling-existing)
     *   .
     */
    public fun anonymousAuthEnabled(anonymousAuthEnabled: Boolean) {
        cdkBuilder.anonymousAuthEnabled(anonymousAuthEnabled)
    }

    /**
     * @param anonymousAuthEnabled True to enable a 30-day migration period during which
     *   administrators can create role mappings. Only necessary when
     *   [enabling fine-grained access control on an existing domain](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/fgac.html#fgac-enabling-existing)
     *   .
     */
    public fun anonymousAuthEnabled(anonymousAuthEnabled: IResolvable) {
        cdkBuilder.anonymousAuthEnabled(anonymousAuthEnabled)
    }

    /**
     * @param enabled True to enable fine-grained access control. You must also enable encryption of
     *   data at rest and node-to-node encryption. See
     *   [Fine-grained access control in Amazon OpenSearch Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/fgac.html)
     *   .
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled True to enable fine-grained access control. You must also enable encryption of
     *   data at rest and node-to-node encryption. See
     *   [Fine-grained access control in Amazon OpenSearch Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/fgac.html)
     *   .
     */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /** @param internalUserDatabaseEnabled True to enable the internal user database. */
    public fun internalUserDatabaseEnabled(internalUserDatabaseEnabled: Boolean) {
        cdkBuilder.internalUserDatabaseEnabled(internalUserDatabaseEnabled)
    }

    /** @param internalUserDatabaseEnabled True to enable the internal user database. */
    public fun internalUserDatabaseEnabled(internalUserDatabaseEnabled: IResolvable) {
        cdkBuilder.internalUserDatabaseEnabled(internalUserDatabaseEnabled)
    }

    /** @param masterUserOptions Specifies information about the master user. */
    public fun masterUserOptions(masterUserOptions: IResolvable) {
        cdkBuilder.masterUserOptions(masterUserOptions)
    }

    /** @param masterUserOptions Specifies information about the master user. */
    public fun masterUserOptions(masterUserOptions: CfnDomain.MasterUserOptionsProperty) {
        cdkBuilder.masterUserOptions(masterUserOptions)
    }

    /**
     * @param samlOptions Container for information about the SAML configuration for OpenSearch
     *   Dashboards.
     */
    public fun samlOptions(samlOptions: IResolvable) {
        cdkBuilder.samlOptions(samlOptions)
    }

    /**
     * @param samlOptions Container for information about the SAML configuration for OpenSearch
     *   Dashboards.
     */
    public fun samlOptions(samlOptions: CfnDomain.SAMLOptionsProperty) {
        cdkBuilder.samlOptions(samlOptions)
    }

    public fun build(): CfnDomain.AdvancedSecurityOptionsInputProperty = cdkBuilder.build()
}

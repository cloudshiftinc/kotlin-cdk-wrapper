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
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.opensearchservice.SAMLOptionsProperty

/**
 * Container for information about the SAML configuration for OpenSearch Dashboards.
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
public class SAMLOptionsPropertyDsl {
    private val cdkBuilder: SAMLOptionsProperty.Builder = SAMLOptionsProperty.builder()

    /** @param idpEntityId The unique entity ID of the application in the SAML identity provider. */
    public fun idpEntityId(idpEntityId: String) {
        cdkBuilder.idpEntityId(idpEntityId)
    }

    /** @param idpMetadataContent The metadata of the SAML application, in XML format. */
    public fun idpMetadataContent(idpMetadataContent: String) {
        cdkBuilder.idpMetadataContent(idpMetadataContent)
    }

    /**
     * @param masterBackendRole The backend role that the SAML master user is mapped to. Any users
     *   with this backend role receives full permission in OpenSearch Dashboards/Kibana. To use a
     *   SAML master backend role, configure the `rolesKey` property.
     */
    public fun masterBackendRole(masterBackendRole: String) {
        cdkBuilder.masterBackendRole(masterBackendRole)
    }

    /**
     * @param masterUserName The SAML master username, which is stored in the domain's internal user
     *   database. This SAML user receives full permission in OpenSearch Dashboards/Kibana. Creating
     *   a new master username does not delete any existing master usernames.
     */
    public fun masterUserName(masterUserName: String) {
        cdkBuilder.masterUserName(masterUserName)
    }

    /** @param rolesKey Element of the SAML assertion to use for backend roles. */
    public fun rolesKey(rolesKey: String) {
        cdkBuilder.rolesKey(rolesKey)
    }

    /**
     * @param sessionTimeoutMinutes The duration, in minutes, after which a user session becomes
     *   inactive.
     */
    public fun sessionTimeoutMinutes(sessionTimeoutMinutes: Number) {
        cdkBuilder.sessionTimeoutMinutes(sessionTimeoutMinutes)
    }

    /** @param subjectKey Element of the SAML assertion to use for the user name. */
    public fun subjectKey(subjectKey: String) {
        cdkBuilder.subjectKey(subjectKey)
    }

    public fun build(): SAMLOptionsProperty = cdkBuilder.build()
}

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
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.opensearchservice.CfnDomain

/**
 * Container for information about the SAML configuration for OpenSearch Dashboards.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.opensearchservice.*;
 * SAMLOptionsProperty sAMLOptionsProperty = SAMLOptionsProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-samloptions.html)
 */
@CdkDslMarker
public class CfnDomainSAMLOptionsPropertyDsl {
    private val cdkBuilder: CfnDomain.SAMLOptionsProperty.Builder =
        CfnDomain.SAMLOptionsProperty.builder()

    /** @param enabled True to enable SAML authentication for a domain. */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /** @param enabled True to enable SAML authentication for a domain. */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /** @param idp The SAML Identity Provider's information. */
    public fun idp(idp: IResolvable) {
        cdkBuilder.idp(idp)
    }

    /** @param idp The SAML Identity Provider's information. */
    public fun idp(idp: CfnDomain.IdpProperty) {
        cdkBuilder.idp(idp)
    }

    /** @param masterBackendRole The backend role that the SAML master user is mapped to. */
    public fun masterBackendRole(masterBackendRole: String) {
        cdkBuilder.masterBackendRole(masterBackendRole)
    }

    /**
     * @param masterUserName The SAML master user name, which is stored in the domain's internal
     *   user database.
     */
    public fun masterUserName(masterUserName: String) {
        cdkBuilder.masterUserName(masterUserName)
    }

    /**
     * @param rolesKey Element of the SAML assertion to use for backend roles. Default is `roles` .
     */
    public fun rolesKey(rolesKey: String) {
        cdkBuilder.rolesKey(rolesKey)
    }

    /**
     * @param sessionTimeoutMinutes The duration, in minutes, after which a user session becomes
     *   inactive. Acceptable values are between 1 and 1440, and the default value is 60.
     */
    public fun sessionTimeoutMinutes(sessionTimeoutMinutes: Number) {
        cdkBuilder.sessionTimeoutMinutes(sessionTimeoutMinutes)
    }

    /**
     * @param subjectKey Element of the SAML assertion to use for the user name. Default is `NameID`
     *   .
     */
    public fun subjectKey(subjectKey: String) {
        cdkBuilder.subjectKey(subjectKey)
    }

    public fun build(): CfnDomain.SAMLOptionsProperty = cdkBuilder.build()
}

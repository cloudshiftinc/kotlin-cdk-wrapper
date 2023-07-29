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

package cloudshift.awscdk.dsl.services.opensearchserverless

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfig

/**
 * Describes SAML options for an OpenSearch Serverless security configuration in the form of a
 * key-value map.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.opensearchserverless.*;
 * SamlConfigOptionsProperty samlConfigOptionsProperty = SamlConfigOptionsProperty.builder()
 * .metadata("metadata")
 * // the properties below are optional
 * .groupAttribute("groupAttribute")
 * .sessionTimeout(123)
 * .userAttribute("userAttribute")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-securityconfig-samlconfigoptions.html)
 */
@CdkDslMarker
public class CfnSecurityConfigSamlConfigOptionsPropertyDsl {
    private val cdkBuilder: CfnSecurityConfig.SamlConfigOptionsProperty.Builder =
        CfnSecurityConfig.SamlConfigOptionsProperty.builder()

    /** @param groupAttribute The group attribute for this SAML integration. */
    public fun groupAttribute(groupAttribute: String) {
        cdkBuilder.groupAttribute(groupAttribute)
    }

    /** @param metadata The XML IdP metadata file generated from your identity provider. */
    public fun metadata(metadata: String) {
        cdkBuilder.metadata(metadata)
    }

    /** @param sessionTimeout The session timeout, in minutes. Default is 60 minutes (12 hours). */
    public fun sessionTimeout(sessionTimeout: Number) {
        cdkBuilder.sessionTimeout(sessionTimeout)
    }

    /** @param userAttribute A user attribute for this SAML integration. */
    public fun userAttribute(userAttribute: String) {
        cdkBuilder.userAttribute(userAttribute)
    }

    public fun build(): CfnSecurityConfig.SamlConfigOptionsProperty = cdkBuilder.build()
}

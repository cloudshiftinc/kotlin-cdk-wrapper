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

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.eks.CfnIdentityProviderConfig
import software.amazon.awscdk.services.eks.CfnIdentityProviderConfigProps

/**
 * Properties for defining a `CfnIdentityProviderConfig`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.eks.*;
 * CfnIdentityProviderConfigProps cfnIdentityProviderConfigProps =
 * CfnIdentityProviderConfigProps.builder()
 * .clusterName("clusterName")
 * .type("type")
 * // the properties below are optional
 * .identityProviderConfigName("identityProviderConfigName")
 * .oidc(OidcIdentityProviderConfigProperty.builder()
 * .clientId("clientId")
 * .issuerUrl("issuerUrl")
 * // the properties below are optional
 * .groupsClaim("groupsClaim")
 * .groupsPrefix("groupsPrefix")
 * .requiredClaims(List.of(RequiredClaimProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .usernameClaim("usernameClaim")
 * .usernamePrefix("usernamePrefix")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-identityproviderconfig.html)
 */
@CdkDslMarker
public class CfnIdentityProviderConfigPropsDsl {
    private val cdkBuilder: CfnIdentityProviderConfigProps.Builder =
        CfnIdentityProviderConfigProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param clusterName The cluster that the configuration is associated to. */
    public fun clusterName(clusterName: String) {
        cdkBuilder.clusterName(clusterName)
    }

    /** @param identityProviderConfigName The name of the configuration. */
    public fun identityProviderConfigName(identityProviderConfigName: String) {
        cdkBuilder.identityProviderConfigName(identityProviderConfigName)
    }

    /**
     * @param oidc An object representing an OpenID Connect (OIDC) identity provider configuration.
     */
    public fun oidc(oidc: IResolvable) {
        cdkBuilder.oidc(oidc)
    }

    /**
     * @param oidc An object representing an OpenID Connect (OIDC) identity provider configuration.
     */
    public fun oidc(oidc: CfnIdentityProviderConfig.OidcIdentityProviderConfigProperty) {
        cdkBuilder.oidc(oidc)
    }

    /**
     * @param tags The metadata to apply to the provider configuration to assist with categorization
     *   and organization. Each tag consists of a key and an optional value. You define both.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags The metadata to apply to the provider configuration to assist with categorization
     *   and organization. Each tag consists of a key and an optional value. You define both.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param type The type of the identity provider configuration. The only type available is
     *   `oidc` .
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnIdentityProviderConfigProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}

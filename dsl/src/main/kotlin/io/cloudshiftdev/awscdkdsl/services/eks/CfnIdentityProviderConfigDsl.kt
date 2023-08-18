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

package io.cloudshiftdev.awscdkdsl.services.eks

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.eks.CfnIdentityProviderConfig
import software.constructs.Construct

/**
 * Associate an identity provider configuration to a cluster.
 *
 * If you want to authenticate identities using an identity provider, you can create an identity
 * provider configuration and associate it to your cluster. After configuring authentication to your
 * cluster you can create Kubernetes `roles` and `clusterroles` to assign permissions to the roles,
 * and then bind the roles to the identities using Kubernetes `rolebindings` and
 * `clusterrolebindings` . For more information see
 * [Using RBAC Authorization](https://docs.aws.amazon.com/https://kubernetes.io/docs/reference/access-authn-authz/rbac/)
 * in the Kubernetes documentation.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.eks.*;
 * CfnIdentityProviderConfig cfnIdentityProviderConfig =
 * CfnIdentityProviderConfig.Builder.create(this, "MyCfnIdentityProviderConfig")
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
public class CfnIdentityProviderConfigDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnIdentityProviderConfig.Builder =
        CfnIdentityProviderConfig.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The cluster that the configuration is associated to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-identityproviderconfig.html#cfn-eks-identityproviderconfig-clustername)
     *
     * @param clusterName The cluster that the configuration is associated to.
     */
    public fun clusterName(clusterName: String) {
        cdkBuilder.clusterName(clusterName)
    }

    /**
     * The name of the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-identityproviderconfig.html#cfn-eks-identityproviderconfig-identityproviderconfigname)
     *
     * @param identityProviderConfigName The name of the configuration.
     */
    public fun identityProviderConfigName(identityProviderConfigName: String) {
        cdkBuilder.identityProviderConfigName(identityProviderConfigName)
    }

    /**
     * An object representing an OpenID Connect (OIDC) identity provider configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-identityproviderconfig.html#cfn-eks-identityproviderconfig-oidc)
     *
     * @param oidc An object representing an OpenID Connect (OIDC) identity provider configuration.
     */
    public fun oidc(oidc: IResolvable) {
        cdkBuilder.oidc(oidc)
    }

    /**
     * An object representing an OpenID Connect (OIDC) identity provider configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-identityproviderconfig.html#cfn-eks-identityproviderconfig-oidc)
     *
     * @param oidc An object representing an OpenID Connect (OIDC) identity provider configuration.
     */
    public fun oidc(oidc: CfnIdentityProviderConfig.OidcIdentityProviderConfigProperty) {
        cdkBuilder.oidc(oidc)
    }

    /**
     * The metadata to apply to the provider configuration to assist with categorization and
     * organization.
     *
     * Each tag consists of a key and an optional value. You define both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-identityproviderconfig.html#cfn-eks-identityproviderconfig-tags)
     *
     * @param tags The metadata to apply to the provider configuration to assist with categorization
     *   and organization.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The metadata to apply to the provider configuration to assist with categorization and
     * organization.
     *
     * Each tag consists of a key and an optional value. You define both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-identityproviderconfig.html#cfn-eks-identityproviderconfig-tags)
     *
     * @param tags The metadata to apply to the provider configuration to assist with categorization
     *   and organization.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The type of the identity provider configuration.
     *
     * The only type available is `oidc` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-identityproviderconfig.html#cfn-eks-identityproviderconfig-type)
     *
     * @param type The type of the identity provider configuration.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnIdentityProviderConfig {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}

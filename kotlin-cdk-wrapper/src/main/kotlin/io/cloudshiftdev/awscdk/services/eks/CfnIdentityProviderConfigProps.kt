@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnIdentityProviderConfig`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.eks.*;
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
public interface CfnIdentityProviderConfigProps {
  /**
   * The name of your cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-identityproviderconfig.html#cfn-eks-identityproviderconfig-clustername)
   */
  public fun clusterName(): String

  /**
   * The name of the configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-identityproviderconfig.html#cfn-eks-identityproviderconfig-identityproviderconfigname)
   */
  public fun identityProviderConfigName(): String? = unwrap(this).getIdentityProviderConfigName()

  /**
   * An object representing an OpenID Connect (OIDC) identity provider configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-identityproviderconfig.html#cfn-eks-identityproviderconfig-oidc)
   */
  public fun oidc(): Any? = unwrap(this).getOidc()

  /**
   * Metadata that assists with categorization and organization.
   *
   * Each tag consists of a key and an optional value. You define both. Tags don't propagate to any
   * other cluster or AWS resources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-identityproviderconfig.html#cfn-eks-identityproviderconfig-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The type of the identity provider configuration.
   *
   * The only type available is `oidc` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-identityproviderconfig.html#cfn-eks-identityproviderconfig-type)
   */
  public fun type(): String

  /**
   * A builder for [CfnIdentityProviderConfigProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param clusterName The name of your cluster. 
     */
    public fun clusterName(clusterName: String)

    /**
     * @param identityProviderConfigName The name of the configuration.
     */
    public fun identityProviderConfigName(identityProviderConfigName: String)

    /**
     * @param oidc An object representing an OpenID Connect (OIDC) identity provider configuration.
     */
    public fun oidc(oidc: IResolvable)

    /**
     * @param oidc An object representing an OpenID Connect (OIDC) identity provider configuration.
     */
    public fun oidc(oidc: CfnIdentityProviderConfig.OidcIdentityProviderConfigProperty)

    /**
     * @param oidc An object representing an OpenID Connect (OIDC) identity provider configuration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5fe0215ed6d2c62a5e3d1d42d7a54af200fcabcd697a6f4c255e4395b5074dad")
    public
        fun oidc(oidc: CfnIdentityProviderConfig.OidcIdentityProviderConfigProperty.Builder.() -> Unit)

    /**
     * @param tags Metadata that assists with categorization and organization.
     * Each tag consists of a key and an optional value. You define both. Tags don't propagate to
     * any other cluster or AWS resources.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Metadata that assists with categorization and organization.
     * Each tag consists of a key and an optional value. You define both. Tags don't propagate to
     * any other cluster or AWS resources.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param type The type of the identity provider configuration. 
     * The only type available is `oidc` .
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.eks.CfnIdentityProviderConfigProps.Builder =
        software.amazon.awscdk.services.eks.CfnIdentityProviderConfigProps.builder()

    /**
     * @param clusterName The name of your cluster. 
     */
    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    /**
     * @param identityProviderConfigName The name of the configuration.
     */
    override fun identityProviderConfigName(identityProviderConfigName: String) {
      cdkBuilder.identityProviderConfigName(identityProviderConfigName)
    }

    /**
     * @param oidc An object representing an OpenID Connect (OIDC) identity provider configuration.
     */
    override fun oidc(oidc: IResolvable) {
      cdkBuilder.oidc(oidc.let(IResolvable::unwrap))
    }

    /**
     * @param oidc An object representing an OpenID Connect (OIDC) identity provider configuration.
     */
    override fun oidc(oidc: CfnIdentityProviderConfig.OidcIdentityProviderConfigProperty) {
      cdkBuilder.oidc(oidc.let(CfnIdentityProviderConfig.OidcIdentityProviderConfigProperty::unwrap))
    }

    /**
     * @param oidc An object representing an OpenID Connect (OIDC) identity provider configuration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5fe0215ed6d2c62a5e3d1d42d7a54af200fcabcd697a6f4c255e4395b5074dad")
    override
        fun oidc(oidc: CfnIdentityProviderConfig.OidcIdentityProviderConfigProperty.Builder.() -> Unit):
        Unit = oidc(CfnIdentityProviderConfig.OidcIdentityProviderConfigProperty(oidc))

    /**
     * @param tags Metadata that assists with categorization and organization.
     * Each tag consists of a key and an optional value. You define both. Tags don't propagate to
     * any other cluster or AWS resources.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Metadata that assists with categorization and organization.
     * Each tag consists of a key and an optional value. You define both. Tags don't propagate to
     * any other cluster or AWS resources.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param type The type of the identity provider configuration. 
     * The only type available is `oidc` .
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.eks.CfnIdentityProviderConfigProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.eks.CfnIdentityProviderConfigProps,
  ) : CdkObject(cdkObject), CfnIdentityProviderConfigProps {
    /**
     * The name of your cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-identityproviderconfig.html#cfn-eks-identityproviderconfig-clustername)
     */
    override fun clusterName(): String = unwrap(this).getClusterName()

    /**
     * The name of the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-identityproviderconfig.html#cfn-eks-identityproviderconfig-identityproviderconfigname)
     */
    override fun identityProviderConfigName(): String? =
        unwrap(this).getIdentityProviderConfigName()

    /**
     * An object representing an OpenID Connect (OIDC) identity provider configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-identityproviderconfig.html#cfn-eks-identityproviderconfig-oidc)
     */
    override fun oidc(): Any? = unwrap(this).getOidc()

    /**
     * Metadata that assists with categorization and organization.
     *
     * Each tag consists of a key and an optional value. You define both. Tags don't propagate to
     * any other cluster or AWS resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-identityproviderconfig.html#cfn-eks-identityproviderconfig-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The type of the identity provider configuration.
     *
     * The only type available is `oidc` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-identityproviderconfig.html#cfn-eks-identityproviderconfig-type)
     */
    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIdentityProviderConfigProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnIdentityProviderConfigProps):
        CfnIdentityProviderConfigProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIdentityProviderConfigProps):
        software.amazon.awscdk.services.eks.CfnIdentityProviderConfigProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.eks.CfnIdentityProviderConfigProps
  }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Associates an identity provider configuration to a cluster.
 *
 * If you want to authenticate identities using an identity provider, you can create an identity
 * provider configuration and associate it to your cluster. After configuring authentication to your
 * cluster you can create Kubernetes `Role` and `ClusterRole` objects, assign permissions to them, and
 * then bind them to the identities using Kubernetes `RoleBinding` and `ClusterRoleBinding` objects.
 * For more information see [Using RBAC
 * Authorization](https://docs.aws.amazon.com/https://kubernetes.io/docs/reference/access-authn-authz/rbac/)
 * in the Kubernetes documentation.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.eks.*;
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
public open class CfnIdentityProviderConfig internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.eks.CfnIdentityProviderConfig,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The Amazon Resource Name (ARN) associated with the identity provider config.
   */
  public open fun attrIdentityProviderConfigArn(): String =
      unwrap(this).getAttrIdentityProviderConfigArn()

  /**
   * The name of your cluster.
   */
  public open fun clusterName(): String = unwrap(this).getClusterName()

  /**
   * The name of your cluster.
   */
  public open fun clusterName(`value`: String) {
    unwrap(this).setClusterName(`value`)
  }

  /**
   * The name of the configuration.
   */
  public open fun identityProviderConfigName(): String? =
      unwrap(this).getIdentityProviderConfigName()

  /**
   * The name of the configuration.
   */
  public open fun identityProviderConfigName(`value`: String) {
    unwrap(this).setIdentityProviderConfigName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * An object representing an OpenID Connect (OIDC) identity provider configuration.
   */
  public open fun oidc(): Any? = unwrap(this).getOidc()

  /**
   * An object representing an OpenID Connect (OIDC) identity provider configuration.
   */
  public open fun oidc(`value`: IResolvable) {
    unwrap(this).setOidc(`value`.let(IResolvable::unwrap))
  }

  /**
   * An object representing an OpenID Connect (OIDC) identity provider configuration.
   */
  public open fun oidc(`value`: OidcIdentityProviderConfigProperty) {
    unwrap(this).setOidc(`value`.let(OidcIdentityProviderConfigProperty::unwrap))
  }

  /**
   * An object representing an OpenID Connect (OIDC) identity provider configuration.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("70de0384a2488d273e263123f76b64acce2ed105bd8bf79e39943407c142d7c9")
  public open fun oidc(`value`: OidcIdentityProviderConfigProperty.Builder.() -> Unit): Unit =
      oidc(OidcIdentityProviderConfigProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Metadata that assists with categorization and organization.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Metadata that assists with categorization and organization.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Metadata that assists with categorization and organization.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The type of the identity provider configuration.
   */
  public open fun type(): String = unwrap(this).getType()

  /**
   * The type of the identity provider configuration.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.eks.CfnIdentityProviderConfig].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of your cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-identityproviderconfig.html#cfn-eks-identityproviderconfig-clustername)
     * @param clusterName The name of your cluster. 
     */
    public fun clusterName(clusterName: String)

    /**
     * The name of the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-identityproviderconfig.html#cfn-eks-identityproviderconfig-identityproviderconfigname)
     * @param identityProviderConfigName The name of the configuration. 
     */
    public fun identityProviderConfigName(identityProviderConfigName: String)

    /**
     * An object representing an OpenID Connect (OIDC) identity provider configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-identityproviderconfig.html#cfn-eks-identityproviderconfig-oidc)
     * @param oidc An object representing an OpenID Connect (OIDC) identity provider configuration. 
     */
    public fun oidc(oidc: IResolvable)

    /**
     * An object representing an OpenID Connect (OIDC) identity provider configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-identityproviderconfig.html#cfn-eks-identityproviderconfig-oidc)
     * @param oidc An object representing an OpenID Connect (OIDC) identity provider configuration. 
     */
    public fun oidc(oidc: OidcIdentityProviderConfigProperty)

    /**
     * An object representing an OpenID Connect (OIDC) identity provider configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-identityproviderconfig.html#cfn-eks-identityproviderconfig-oidc)
     * @param oidc An object representing an OpenID Connect (OIDC) identity provider configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("636c29617688f50a4eb30db8537c7b914a05ffc9df96e58d326da443d44712ce")
    public fun oidc(oidc: OidcIdentityProviderConfigProperty.Builder.() -> Unit)

    /**
     * Metadata that assists with categorization and organization.
     *
     * Each tag consists of a key and an optional value. You define both. Tags don't propagate to
     * any other cluster or AWS resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-identityproviderconfig.html#cfn-eks-identityproviderconfig-tags)
     * @param tags Metadata that assists with categorization and organization. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Metadata that assists with categorization and organization.
     *
     * Each tag consists of a key and an optional value. You define both. Tags don't propagate to
     * any other cluster or AWS resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-identityproviderconfig.html#cfn-eks-identityproviderconfig-tags)
     * @param tags Metadata that assists with categorization and organization. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The type of the identity provider configuration.
     *
     * The only type available is `oidc` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-identityproviderconfig.html#cfn-eks-identityproviderconfig-type)
     * @param type The type of the identity provider configuration. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.CfnIdentityProviderConfig.Builder =
        software.amazon.awscdk.services.eks.CfnIdentityProviderConfig.Builder.create(scope, id)

    /**
     * The name of your cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-identityproviderconfig.html#cfn-eks-identityproviderconfig-clustername)
     * @param clusterName The name of your cluster. 
     */
    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    /**
     * The name of the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-identityproviderconfig.html#cfn-eks-identityproviderconfig-identityproviderconfigname)
     * @param identityProviderConfigName The name of the configuration. 
     */
    override fun identityProviderConfigName(identityProviderConfigName: String) {
      cdkBuilder.identityProviderConfigName(identityProviderConfigName)
    }

    /**
     * An object representing an OpenID Connect (OIDC) identity provider configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-identityproviderconfig.html#cfn-eks-identityproviderconfig-oidc)
     * @param oidc An object representing an OpenID Connect (OIDC) identity provider configuration. 
     */
    override fun oidc(oidc: IResolvable) {
      cdkBuilder.oidc(oidc.let(IResolvable::unwrap))
    }

    /**
     * An object representing an OpenID Connect (OIDC) identity provider configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-identityproviderconfig.html#cfn-eks-identityproviderconfig-oidc)
     * @param oidc An object representing an OpenID Connect (OIDC) identity provider configuration. 
     */
    override fun oidc(oidc: OidcIdentityProviderConfigProperty) {
      cdkBuilder.oidc(oidc.let(OidcIdentityProviderConfigProperty::unwrap))
    }

    /**
     * An object representing an OpenID Connect (OIDC) identity provider configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-identityproviderconfig.html#cfn-eks-identityproviderconfig-oidc)
     * @param oidc An object representing an OpenID Connect (OIDC) identity provider configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("636c29617688f50a4eb30db8537c7b914a05ffc9df96e58d326da443d44712ce")
    override fun oidc(oidc: OidcIdentityProviderConfigProperty.Builder.() -> Unit): Unit =
        oidc(OidcIdentityProviderConfigProperty(oidc))

    /**
     * Metadata that assists with categorization and organization.
     *
     * Each tag consists of a key and an optional value. You define both. Tags don't propagate to
     * any other cluster or AWS resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-identityproviderconfig.html#cfn-eks-identityproviderconfig-tags)
     * @param tags Metadata that assists with categorization and organization. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Metadata that assists with categorization and organization.
     *
     * Each tag consists of a key and an optional value. You define both. Tags don't propagate to
     * any other cluster or AWS resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-identityproviderconfig.html#cfn-eks-identityproviderconfig-tags)
     * @param tags Metadata that assists with categorization and organization. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The type of the identity provider configuration.
     *
     * The only type available is `oidc` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-identityproviderconfig.html#cfn-eks-identityproviderconfig-type)
     * @param type The type of the identity provider configuration. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.eks.CfnIdentityProviderConfig =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.eks.CfnIdentityProviderConfig.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnIdentityProviderConfig {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnIdentityProviderConfig(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnIdentityProviderConfig):
        CfnIdentityProviderConfig = CfnIdentityProviderConfig(cdkObject)

    internal fun unwrap(wrapped: CfnIdentityProviderConfig):
        software.amazon.awscdk.services.eks.CfnIdentityProviderConfig = wrapped.cdkObject
  }

  /**
   * An object representing the configuration for an OpenID Connect (OIDC) identity provider.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.eks.*;
   * OidcIdentityProviderConfigProperty oidcIdentityProviderConfigProperty =
   * OidcIdentityProviderConfigProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-identityproviderconfig-oidcidentityproviderconfig.html)
   */
  public interface OidcIdentityProviderConfigProperty {
    /**
     * This is also known as *audience* .
     *
     * The ID of the client application that makes authentication requests to the OIDC identity
     * provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-identityproviderconfig-oidcidentityproviderconfig.html#cfn-eks-identityproviderconfig-oidcidentityproviderconfig-clientid)
     */
    public fun clientId(): String

    /**
     * The JSON web token (JWT) claim that the provider uses to return your groups.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-identityproviderconfig-oidcidentityproviderconfig.html#cfn-eks-identityproviderconfig-oidcidentityproviderconfig-groupsclaim)
     */
    public fun groupsClaim(): String? = unwrap(this).getGroupsClaim()

    /**
     * The prefix that is prepended to group claims to prevent clashes with existing names (such as
     * `system:` groups).
     *
     * For example, the value `oidc:` creates group names like `oidc:engineering` and `oidc:infra` .
     * The prefix can't contain `system:`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-identityproviderconfig-oidcidentityproviderconfig.html#cfn-eks-identityproviderconfig-oidcidentityproviderconfig-groupsprefix)
     */
    public fun groupsPrefix(): String? = unwrap(this).getGroupsPrefix()

    /**
     * The URL of the OIDC identity provider that allows the API server to discover public signing
     * keys for verifying tokens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-identityproviderconfig-oidcidentityproviderconfig.html#cfn-eks-identityproviderconfig-oidcidentityproviderconfig-issuerurl)
     */
    public fun issuerUrl(): String

    /**
     * The key-value pairs that describe required claims in the identity token.
     *
     * If set, each claim is verified to be present in the token with a matching value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-identityproviderconfig-oidcidentityproviderconfig.html#cfn-eks-identityproviderconfig-oidcidentityproviderconfig-requiredclaims)
     */
    public fun requiredClaims(): Any? = unwrap(this).getRequiredClaims()

    /**
     * The JSON Web token (JWT) claim that is used as the username.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-identityproviderconfig-oidcidentityproviderconfig.html#cfn-eks-identityproviderconfig-oidcidentityproviderconfig-usernameclaim)
     */
    public fun usernameClaim(): String? = unwrap(this).getUsernameClaim()

    /**
     * The prefix that is prepended to username claims to prevent clashes with existing names.
     *
     * The prefix can't contain `system:`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-identityproviderconfig-oidcidentityproviderconfig.html#cfn-eks-identityproviderconfig-oidcidentityproviderconfig-usernameprefix)
     */
    public fun usernamePrefix(): String? = unwrap(this).getUsernamePrefix()

    /**
     * A builder for [OidcIdentityProviderConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param clientId This is also known as *audience* . 
       * The ID of the client application that makes authentication requests to the OIDC identity
       * provider.
       */
      public fun clientId(clientId: String)

      /**
       * @param groupsClaim The JSON web token (JWT) claim that the provider uses to return your
       * groups.
       */
      public fun groupsClaim(groupsClaim: String)

      /**
       * @param groupsPrefix The prefix that is prepended to group claims to prevent clashes with
       * existing names (such as `system:` groups).
       * For example, the value `oidc:` creates group names like `oidc:engineering` and `oidc:infra`
       * . The prefix can't contain `system:`
       */
      public fun groupsPrefix(groupsPrefix: String)

      /**
       * @param issuerUrl The URL of the OIDC identity provider that allows the API server to
       * discover public signing keys for verifying tokens. 
       */
      public fun issuerUrl(issuerUrl: String)

      /**
       * @param requiredClaims The key-value pairs that describe required claims in the identity
       * token.
       * If set, each claim is verified to be present in the token with a matching value.
       */
      public fun requiredClaims(requiredClaims: IResolvable)

      /**
       * @param requiredClaims The key-value pairs that describe required claims in the identity
       * token.
       * If set, each claim is verified to be present in the token with a matching value.
       */
      public fun requiredClaims(requiredClaims: List<Any>)

      /**
       * @param requiredClaims The key-value pairs that describe required claims in the identity
       * token.
       * If set, each claim is verified to be present in the token with a matching value.
       */
      public fun requiredClaims(vararg requiredClaims: Any)

      /**
       * @param usernameClaim The JSON Web token (JWT) claim that is used as the username.
       */
      public fun usernameClaim(usernameClaim: String)

      /**
       * @param usernamePrefix The prefix that is prepended to username claims to prevent clashes
       * with existing names.
       * The prefix can't contain `system:`
       */
      public fun usernamePrefix(usernamePrefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.eks.CfnIdentityProviderConfig.OidcIdentityProviderConfigProperty.Builder
          =
          software.amazon.awscdk.services.eks.CfnIdentityProviderConfig.OidcIdentityProviderConfigProperty.builder()

      /**
       * @param clientId This is also known as *audience* . 
       * The ID of the client application that makes authentication requests to the OIDC identity
       * provider.
       */
      override fun clientId(clientId: String) {
        cdkBuilder.clientId(clientId)
      }

      /**
       * @param groupsClaim The JSON web token (JWT) claim that the provider uses to return your
       * groups.
       */
      override fun groupsClaim(groupsClaim: String) {
        cdkBuilder.groupsClaim(groupsClaim)
      }

      /**
       * @param groupsPrefix The prefix that is prepended to group claims to prevent clashes with
       * existing names (such as `system:` groups).
       * For example, the value `oidc:` creates group names like `oidc:engineering` and `oidc:infra`
       * . The prefix can't contain `system:`
       */
      override fun groupsPrefix(groupsPrefix: String) {
        cdkBuilder.groupsPrefix(groupsPrefix)
      }

      /**
       * @param issuerUrl The URL of the OIDC identity provider that allows the API server to
       * discover public signing keys for verifying tokens. 
       */
      override fun issuerUrl(issuerUrl: String) {
        cdkBuilder.issuerUrl(issuerUrl)
      }

      /**
       * @param requiredClaims The key-value pairs that describe required claims in the identity
       * token.
       * If set, each claim is verified to be present in the token with a matching value.
       */
      override fun requiredClaims(requiredClaims: IResolvable) {
        cdkBuilder.requiredClaims(requiredClaims.let(IResolvable::unwrap))
      }

      /**
       * @param requiredClaims The key-value pairs that describe required claims in the identity
       * token.
       * If set, each claim is verified to be present in the token with a matching value.
       */
      override fun requiredClaims(requiredClaims: List<Any>) {
        cdkBuilder.requiredClaims(requiredClaims)
      }

      /**
       * @param requiredClaims The key-value pairs that describe required claims in the identity
       * token.
       * If set, each claim is verified to be present in the token with a matching value.
       */
      override fun requiredClaims(vararg requiredClaims: Any): Unit =
          requiredClaims(requiredClaims.toList())

      /**
       * @param usernameClaim The JSON Web token (JWT) claim that is used as the username.
       */
      override fun usernameClaim(usernameClaim: String) {
        cdkBuilder.usernameClaim(usernameClaim)
      }

      /**
       * @param usernamePrefix The prefix that is prepended to username claims to prevent clashes
       * with existing names.
       * The prefix can't contain `system:`
       */
      override fun usernamePrefix(usernamePrefix: String) {
        cdkBuilder.usernamePrefix(usernamePrefix)
      }

      public fun build():
          software.amazon.awscdk.services.eks.CfnIdentityProviderConfig.OidcIdentityProviderConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.eks.CfnIdentityProviderConfig.OidcIdentityProviderConfigProperty,
    ) : CdkObject(cdkObject), OidcIdentityProviderConfigProperty {
      /**
       * This is also known as *audience* .
       *
       * The ID of the client application that makes authentication requests to the OIDC identity
       * provider.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-identityproviderconfig-oidcidentityproviderconfig.html#cfn-eks-identityproviderconfig-oidcidentityproviderconfig-clientid)
       */
      override fun clientId(): String = unwrap(this).getClientId()

      /**
       * The JSON web token (JWT) claim that the provider uses to return your groups.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-identityproviderconfig-oidcidentityproviderconfig.html#cfn-eks-identityproviderconfig-oidcidentityproviderconfig-groupsclaim)
       */
      override fun groupsClaim(): String? = unwrap(this).getGroupsClaim()

      /**
       * The prefix that is prepended to group claims to prevent clashes with existing names (such
       * as `system:` groups).
       *
       * For example, the value `oidc:` creates group names like `oidc:engineering` and `oidc:infra`
       * . The prefix can't contain `system:`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-identityproviderconfig-oidcidentityproviderconfig.html#cfn-eks-identityproviderconfig-oidcidentityproviderconfig-groupsprefix)
       */
      override fun groupsPrefix(): String? = unwrap(this).getGroupsPrefix()

      /**
       * The URL of the OIDC identity provider that allows the API server to discover public signing
       * keys for verifying tokens.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-identityproviderconfig-oidcidentityproviderconfig.html#cfn-eks-identityproviderconfig-oidcidentityproviderconfig-issuerurl)
       */
      override fun issuerUrl(): String = unwrap(this).getIssuerUrl()

      /**
       * The key-value pairs that describe required claims in the identity token.
       *
       * If set, each claim is verified to be present in the token with a matching value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-identityproviderconfig-oidcidentityproviderconfig.html#cfn-eks-identityproviderconfig-oidcidentityproviderconfig-requiredclaims)
       */
      override fun requiredClaims(): Any? = unwrap(this).getRequiredClaims()

      /**
       * The JSON Web token (JWT) claim that is used as the username.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-identityproviderconfig-oidcidentityproviderconfig.html#cfn-eks-identityproviderconfig-oidcidentityproviderconfig-usernameclaim)
       */
      override fun usernameClaim(): String? = unwrap(this).getUsernameClaim()

      /**
       * The prefix that is prepended to username claims to prevent clashes with existing names.
       *
       * The prefix can't contain `system:`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-identityproviderconfig-oidcidentityproviderconfig.html#cfn-eks-identityproviderconfig-oidcidentityproviderconfig-usernameprefix)
       */
      override fun usernamePrefix(): String? = unwrap(this).getUsernamePrefix()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          OidcIdentityProviderConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnIdentityProviderConfig.OidcIdentityProviderConfigProperty):
          OidcIdentityProviderConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OidcIdentityProviderConfigProperty):
          software.amazon.awscdk.services.eks.CfnIdentityProviderConfig.OidcIdentityProviderConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.eks.CfnIdentityProviderConfig.OidcIdentityProviderConfigProperty
    }
  }

  /**
   * A key-value pair that describes a required claim in the identity token.
   *
   * If set, each claim is verified to be present in the token with a matching value.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.eks.*;
   * RequiredClaimProperty requiredClaimProperty = RequiredClaimProperty.builder()
   * .key("key")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-identityproviderconfig-requiredclaim.html)
   */
  public interface RequiredClaimProperty {
    /**
     * The key to match from the token.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-identityproviderconfig-requiredclaim.html#cfn-eks-identityproviderconfig-requiredclaim-key)
     */
    public fun key(): String

    /**
     * The value for the key from the token.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-identityproviderconfig-requiredclaim.html#cfn-eks-identityproviderconfig-requiredclaim-value)
     */
    public fun `value`(): String

    /**
     * A builder for [RequiredClaimProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The key to match from the token. 
       */
      public fun key(key: String)

      /**
       * @param value The value for the key from the token. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.eks.CfnIdentityProviderConfig.RequiredClaimProperty.Builder
          =
          software.amazon.awscdk.services.eks.CfnIdentityProviderConfig.RequiredClaimProperty.builder()

      /**
       * @param key The key to match from the token. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The value for the key from the token. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.eks.CfnIdentityProviderConfig.RequiredClaimProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.eks.CfnIdentityProviderConfig.RequiredClaimProperty,
    ) : CdkObject(cdkObject), RequiredClaimProperty {
      /**
       * The key to match from the token.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-identityproviderconfig-requiredclaim.html#cfn-eks-identityproviderconfig-requiredclaim-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The value for the key from the token.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-identityproviderconfig-requiredclaim.html#cfn-eks-identityproviderconfig-requiredclaim-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RequiredClaimProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnIdentityProviderConfig.RequiredClaimProperty):
          RequiredClaimProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RequiredClaimProperty):
          software.amazon.awscdk.services.eks.CfnIdentityProviderConfig.RequiredClaimProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.eks.CfnIdentityProviderConfig.RequiredClaimProperty
    }
  }
}

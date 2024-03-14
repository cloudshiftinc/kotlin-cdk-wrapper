package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnIdentityProviderConfig internal constructor(
  private val cdkObject: software.amazon.awscdk.services.eks.CfnIdentityProviderConfig,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrIdentityProviderConfigArn(): String =
      unwrap(this).getAttrIdentityProviderConfigArn()

  public open fun clusterName(): String = unwrap(this).getClusterName()

  public open fun clusterName(`value`: String) {
    unwrap(this).setClusterName(`value`)
  }

  public open fun identityProviderConfigName(): String? =
      unwrap(this).getIdentityProviderConfigName()

  public open fun identityProviderConfigName(`value`: String) {
    unwrap(this).setIdentityProviderConfigName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun oidc(): Any? = unwrap(this).getOidc()

  public open fun oidc(`value`: IResolvable) {
    unwrap(this).setOidc(`value`.let(IResolvable::unwrap))
  }

  public open fun oidc(`value`: OidcIdentityProviderConfigProperty) {
    unwrap(this).setOidc(`value`.let(OidcIdentityProviderConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("70de0384a2488d273e263123f76b64acce2ed105bd8bf79e39943407c142d7c9")
  public open fun oidc(`value`: OidcIdentityProviderConfigProperty.Builder.() -> Unit): Unit =
      oidc(OidcIdentityProviderConfigProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun type(): String = unwrap(this).getType()

  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  public interface Builder {
    public fun clusterName(clusterName: String)

    public fun identityProviderConfigName(identityProviderConfigName: String)

    public fun oidc(oidc: IResolvable)

    public fun oidc(oidc: OidcIdentityProviderConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("636c29617688f50a4eb30db8537c7b914a05ffc9df96e58d326da443d44712ce")
    public fun oidc(oidc: OidcIdentityProviderConfigProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.CfnIdentityProviderConfig.Builder =
        software.amazon.awscdk.services.eks.CfnIdentityProviderConfig.Builder.create(scope, id)

    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    override fun identityProviderConfigName(identityProviderConfigName: String) {
      cdkBuilder.identityProviderConfigName(identityProviderConfigName)
    }

    override fun oidc(oidc: IResolvable) {
      cdkBuilder.oidc(oidc.let(IResolvable::unwrap))
    }

    override fun oidc(oidc: OidcIdentityProviderConfigProperty) {
      cdkBuilder.oidc(oidc.let(OidcIdentityProviderConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("636c29617688f50a4eb30db8537c7b914a05ffc9df96e58d326da443d44712ce")
    override fun oidc(oidc: OidcIdentityProviderConfigProperty.Builder.() -> Unit): Unit =
        oidc(OidcIdentityProviderConfigProperty(oidc))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.eks.CfnIdentityProviderConfig =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

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

  public interface OidcIdentityProviderConfigProperty {
    public fun clientId(): String

    public fun groupsClaim(): String? = unwrap(this).getGroupsClaim()

    public fun groupsPrefix(): String? = unwrap(this).getGroupsPrefix()

    public fun issuerUrl(): String

    public fun requiredClaims(): Any? = unwrap(this).getRequiredClaims()

    public fun usernameClaim(): String? = unwrap(this).getUsernameClaim()

    public fun usernamePrefix(): String? = unwrap(this).getUsernamePrefix()

    public interface Builder {
      public fun clientId(clientId: String)

      public fun groupsClaim(groupsClaim: String)

      public fun groupsPrefix(groupsPrefix: String)

      public fun issuerUrl(issuerUrl: String)

      public fun requiredClaims(requiredClaims: IResolvable)

      public fun requiredClaims(requiredClaims: List<Any>)

      public fun usernameClaim(usernameClaim: String)

      public fun usernamePrefix(usernamePrefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.eks.CfnIdentityProviderConfig.OidcIdentityProviderConfigProperty.Builder
          =
          software.amazon.awscdk.services.eks.CfnIdentityProviderConfig.OidcIdentityProviderConfigProperty.builder()

      override fun clientId(clientId: String) {
        cdkBuilder.clientId(clientId)
      }

      override fun groupsClaim(groupsClaim: String) {
        cdkBuilder.groupsClaim(groupsClaim)
      }

      override fun groupsPrefix(groupsPrefix: String) {
        cdkBuilder.groupsPrefix(groupsPrefix)
      }

      override fun issuerUrl(issuerUrl: String) {
        cdkBuilder.issuerUrl(issuerUrl)
      }

      override fun requiredClaims(requiredClaims: IResolvable) {
        cdkBuilder.requiredClaims(requiredClaims.let(IResolvable::unwrap))
      }

      override fun requiredClaims(requiredClaims: List<Any>) {
        cdkBuilder.requiredClaims(requiredClaims)
      }

      override fun usernameClaim(usernameClaim: String) {
        cdkBuilder.usernameClaim(usernameClaim)
      }

      override fun usernamePrefix(usernamePrefix: String) {
        cdkBuilder.usernamePrefix(usernamePrefix)
      }

      public fun build():
          software.amazon.awscdk.services.eks.CfnIdentityProviderConfig.OidcIdentityProviderConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.eks.CfnIdentityProviderConfig.OidcIdentityProviderConfigProperty,
    ) : OidcIdentityProviderConfigProperty {
      override fun clientId(): String = unwrap(this).getClientId()

      override fun groupsClaim(): String? = unwrap(this).getGroupsClaim()

      override fun groupsPrefix(): String? = unwrap(this).getGroupsPrefix()

      override fun issuerUrl(): String = unwrap(this).getIssuerUrl()

      override fun requiredClaims(): Any? = unwrap(this).getRequiredClaims()

      override fun usernameClaim(): String? = unwrap(this).getUsernameClaim()

      override fun usernamePrefix(): String? = unwrap(this).getUsernamePrefix()
    }

    public companion object {
      init {

      }

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
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface RequiredClaimProperty {
    public fun key(): String

    public fun `value`(): String

    public interface Builder {
      public fun key(key: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.eks.CfnIdentityProviderConfig.RequiredClaimProperty.Builder
          =
          software.amazon.awscdk.services.eks.CfnIdentityProviderConfig.RequiredClaimProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.eks.CfnIdentityProviderConfig.RequiredClaimProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.eks.CfnIdentityProviderConfig.RequiredClaimProperty,
    ) : RequiredClaimProperty {
      override fun key(): String = unwrap(this).getKey()

      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RequiredClaimProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnIdentityProviderConfig.RequiredClaimProperty):
          RequiredClaimProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RequiredClaimProperty):
          software.amazon.awscdk.services.eks.CfnIdentityProviderConfig.RequiredClaimProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnVerifiedAccessTrustProvider internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  public open fun attrLastUpdatedTime(): String = unwrap(this).getAttrLastUpdatedTime()

  public open fun attrVerifiedAccessTrustProviderId(): String =
      unwrap(this).getAttrVerifiedAccessTrustProviderId()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun deviceOptions(): Any? = unwrap(this).getDeviceOptions()

  public open fun deviceOptions(`value`: IResolvable) {
    unwrap(this).setDeviceOptions(`value`.let(IResolvable::unwrap))
  }

  public open fun deviceOptions(`value`: DeviceOptionsProperty) {
    unwrap(this).setDeviceOptions(`value`.let(DeviceOptionsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("02b103be5523dded76890a2977b8b8ecc86f2ee22f20340671de732f40ec885f")
  public open fun deviceOptions(`value`: DeviceOptionsProperty.Builder.() -> Unit): Unit =
      deviceOptions(DeviceOptionsProperty(`value`))

  public open fun deviceTrustProviderType(): String? = unwrap(this).getDeviceTrustProviderType()

  public open fun deviceTrustProviderType(`value`: String) {
    unwrap(this).setDeviceTrustProviderType(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun oidcOptions(): Any? = unwrap(this).getOidcOptions()

  public open fun oidcOptions(`value`: IResolvable) {
    unwrap(this).setOidcOptions(`value`.let(IResolvable::unwrap))
  }

  public open fun oidcOptions(`value`: OidcOptionsProperty) {
    unwrap(this).setOidcOptions(`value`.let(OidcOptionsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b07119bd712fc4edc9fe5efe5650af35ed4c441129155ea956157b411abb7bba")
  public open fun oidcOptions(`value`: OidcOptionsProperty.Builder.() -> Unit): Unit =
      oidcOptions(OidcOptionsProperty(`value`))

  public open fun policyReferenceName(): String = unwrap(this).getPolicyReferenceName()

  public open fun policyReferenceName(`value`: String) {
    unwrap(this).setPolicyReferenceName(`value`)
  }

  public open fun sseSpecification(): Any? = unwrap(this).getSseSpecification()

  public open fun sseSpecification(`value`: IResolvable) {
    unwrap(this).setSseSpecification(`value`.let(IResolvable::unwrap))
  }

  public open fun sseSpecification(`value`: SseSpecificationProperty) {
    unwrap(this).setSseSpecification(`value`.let(SseSpecificationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ec052c3bbe02e40011474653df6ce24b991207b9de6e5db45275c14c45766bee")
  public open fun sseSpecification(`value`: SseSpecificationProperty.Builder.() -> Unit): Unit =
      sseSpecification(SseSpecificationProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun trustProviderType(): String = unwrap(this).getTrustProviderType()

  public open fun trustProviderType(`value`: String) {
    unwrap(this).setTrustProviderType(`value`)
  }

  public open fun userTrustProviderType(): String? = unwrap(this).getUserTrustProviderType()

  public open fun userTrustProviderType(`value`: String) {
    unwrap(this).setUserTrustProviderType(`value`)
  }

  public interface Builder {
    public fun description(description: String) {
    }

    public fun deviceOptions(deviceOptions: IResolvable) {
    }

    public fun deviceOptions(deviceOptions: DeviceOptionsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("08a9ad74d3605c06b9cdbb2e0624a533cd24b679a276d476a7a0f874b7dc5684")
    public fun deviceOptions(deviceOptions: DeviceOptionsProperty.Builder.() -> Unit) {
    }

    public fun deviceTrustProviderType(deviceTrustProviderType: String) {
    }

    public fun oidcOptions(oidcOptions: IResolvable) {
    }

    public fun oidcOptions(oidcOptions: OidcOptionsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c8ad0a357520e21184534f0d8df7b60b276f4df0f4a8a682b46665ba9da7b84b")
    public fun oidcOptions(oidcOptions: OidcOptionsProperty.Builder.() -> Unit) {
    }

    public fun policyReferenceName(policyReferenceName: String) {
    }

    public fun sseSpecification(sseSpecification: IResolvable) {
    }

    public fun sseSpecification(sseSpecification: SseSpecificationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e96c674ba42238511c7f6afb732a4dbfa0d034067272e0f212d83a6740cf2d04")
    public fun sseSpecification(sseSpecification: SseSpecificationProperty.Builder.() -> Unit) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun trustProviderType(trustProviderType: String) {
    }

    public fun userTrustProviderType(userTrustProviderType: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider.Builder =
        software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider.Builder.create(scope, id)

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun deviceOptions(deviceOptions: IResolvable) {
      cdkBuilder.deviceOptions(deviceOptions.let(IResolvable::unwrap))
    }

    public override fun deviceOptions(deviceOptions: DeviceOptionsProperty) {
      cdkBuilder.deviceOptions(deviceOptions.let(DeviceOptionsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("08a9ad74d3605c06b9cdbb2e0624a533cd24b679a276d476a7a0f874b7dc5684")
    public override fun deviceOptions(deviceOptions: DeviceOptionsProperty.Builder.() -> Unit): Unit
        = deviceOptions(DeviceOptionsProperty(deviceOptions))

    public override fun deviceTrustProviderType(deviceTrustProviderType: String) {
      cdkBuilder.deviceTrustProviderType(deviceTrustProviderType)
    }

    public override fun oidcOptions(oidcOptions: IResolvable) {
      cdkBuilder.oidcOptions(oidcOptions.let(IResolvable::unwrap))
    }

    public override fun oidcOptions(oidcOptions: OidcOptionsProperty) {
      cdkBuilder.oidcOptions(oidcOptions.let(OidcOptionsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c8ad0a357520e21184534f0d8df7b60b276f4df0f4a8a682b46665ba9da7b84b")
    public override fun oidcOptions(oidcOptions: OidcOptionsProperty.Builder.() -> Unit): Unit =
        oidcOptions(OidcOptionsProperty(oidcOptions))

    public override fun policyReferenceName(policyReferenceName: String) {
      cdkBuilder.policyReferenceName(policyReferenceName)
    }

    public override fun sseSpecification(sseSpecification: IResolvable) {
      cdkBuilder.sseSpecification(sseSpecification.let(IResolvable::unwrap))
    }

    public override fun sseSpecification(sseSpecification: SseSpecificationProperty) {
      cdkBuilder.sseSpecification(sseSpecification.let(SseSpecificationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e96c674ba42238511c7f6afb732a4dbfa0d034067272e0f212d83a6740cf2d04")
    public override
        fun sseSpecification(sseSpecification: SseSpecificationProperty.Builder.() -> Unit): Unit =
        sseSpecification(SseSpecificationProperty(sseSpecification))

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun trustProviderType(trustProviderType: String) {
      cdkBuilder.trustProviderType(trustProviderType)
    }

    public override fun userTrustProviderType(userTrustProviderType: String) {
      cdkBuilder.userTrustProviderType(userTrustProviderType)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVerifiedAccessTrustProvider {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVerifiedAccessTrustProvider(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider):
        CfnVerifiedAccessTrustProvider = CfnVerifiedAccessTrustProvider(cdkObject)

    internal fun unwrap(wrapped: CfnVerifiedAccessTrustProvider):
        software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider = wrapped.cdkObject
  }

  public interface OidcOptionsProperty {
    public fun authorizationEndpoint(): String? = unwrap(this).getAuthorizationEndpoint()

    public fun clientId(): String? = unwrap(this).getClientId()

    public fun clientSecret(): String? = unwrap(this).getClientSecret()

    public fun issuer(): String? = unwrap(this).getIssuer()

    public fun scope(): String? = unwrap(this).getScope()

    public fun tokenEndpoint(): String? = unwrap(this).getTokenEndpoint()

    public fun userInfoEndpoint(): String? = unwrap(this).getUserInfoEndpoint()

    public interface Builder {
      public fun authorizationEndpoint(authorizationEndpoint: String) {
      }

      public fun clientId(clientId: String) {
      }

      public fun clientSecret(clientSecret: String) {
      }

      public fun issuer(issuer: String) {
      }

      public fun scope(scope: String) {
      }

      public fun tokenEndpoint(tokenEndpoint: String) {
      }

      public fun userInfoEndpoint(userInfoEndpoint: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider.OidcOptionsProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider.OidcOptionsProperty.builder()

      public override fun authorizationEndpoint(authorizationEndpoint: String) {
        cdkBuilder.authorizationEndpoint(authorizationEndpoint)
      }

      public override fun clientId(clientId: String) {
        cdkBuilder.clientId(clientId)
      }

      public override fun clientSecret(clientSecret: String) {
        cdkBuilder.clientSecret(clientSecret)
      }

      public override fun issuer(issuer: String) {
        cdkBuilder.issuer(issuer)
      }

      public override fun scope(scope: String) {
        cdkBuilder.scope(scope)
      }

      public override fun tokenEndpoint(tokenEndpoint: String) {
        cdkBuilder.tokenEndpoint(tokenEndpoint)
      }

      public override fun userInfoEndpoint(userInfoEndpoint: String) {
        cdkBuilder.userInfoEndpoint(userInfoEndpoint)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider.OidcOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider.OidcOptionsProperty,
    ) : OidcOptionsProperty {
      public override fun authorizationEndpoint(): String? = unwrap(this).getAuthorizationEndpoint()

      public override fun clientId(): String? = unwrap(this).getClientId()

      public override fun clientSecret(): String? = unwrap(this).getClientSecret()

      public override fun issuer(): String? = unwrap(this).getIssuer()

      public override fun scope(): String? = unwrap(this).getScope()

      public override fun tokenEndpoint(): String? = unwrap(this).getTokenEndpoint()

      public override fun userInfoEndpoint(): String? = unwrap(this).getUserInfoEndpoint()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OidcOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider.OidcOptionsProperty):
          OidcOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OidcOptionsProperty):
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider.OidcOptionsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DeviceOptionsProperty {
    public fun publicSigningKeyUrl(): String? = unwrap(this).getPublicSigningKeyUrl()

    public fun tenantId(): String? = unwrap(this).getTenantId()

    public interface Builder {
      public fun publicSigningKeyUrl(publicSigningKeyUrl: String) {
      }

      public fun tenantId(tenantId: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider.DeviceOptionsProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider.DeviceOptionsProperty.builder()

      public override fun publicSigningKeyUrl(publicSigningKeyUrl: String) {
        cdkBuilder.publicSigningKeyUrl(publicSigningKeyUrl)
      }

      public override fun tenantId(tenantId: String) {
        cdkBuilder.tenantId(tenantId)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider.DeviceOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider.DeviceOptionsProperty,
    ) : DeviceOptionsProperty {
      public override fun publicSigningKeyUrl(): String? = unwrap(this).getPublicSigningKeyUrl()

      public override fun tenantId(): String? = unwrap(this).getTenantId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DeviceOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider.DeviceOptionsProperty):
          DeviceOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeviceOptionsProperty):
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider.DeviceOptionsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SseSpecificationProperty {
    public fun customerManagedKeyEnabled(): Any? = unwrap(this).getCustomerManagedKeyEnabled()

    public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    public interface Builder {
      public fun customerManagedKeyEnabled(customerManagedKeyEnabled: Boolean) {
      }

      public fun customerManagedKeyEnabled(customerManagedKeyEnabled: IResolvable) {
      }

      public fun kmsKeyArn(kmsKeyArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider.SseSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider.SseSpecificationProperty.builder()

      public override fun customerManagedKeyEnabled(customerManagedKeyEnabled: Boolean) {
        cdkBuilder.customerManagedKeyEnabled(customerManagedKeyEnabled)
      }

      public override fun customerManagedKeyEnabled(customerManagedKeyEnabled: IResolvable) {
        cdkBuilder.customerManagedKeyEnabled(customerManagedKeyEnabled.let(IResolvable::unwrap))
      }

      public override fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider.SseSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider.SseSpecificationProperty,
    ) : SseSpecificationProperty {
      public override fun customerManagedKeyEnabled(): Any? =
          unwrap(this).getCustomerManagedKeyEnabled()

      public override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SseSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider.SseSpecificationProperty):
          SseSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SseSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider.SseSpecificationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}

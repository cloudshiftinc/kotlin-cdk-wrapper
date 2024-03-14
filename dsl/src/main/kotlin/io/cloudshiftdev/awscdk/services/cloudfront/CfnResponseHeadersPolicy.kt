package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnResponseHeadersPolicy internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrLastModifiedTime(): String = unwrap(this).getAttrLastModifiedTime()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun responseHeadersPolicyConfig(): Any = unwrap(this).getResponseHeadersPolicyConfig()

  public open fun responseHeadersPolicyConfig(`value`: IResolvable) {
    unwrap(this).setResponseHeadersPolicyConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun responseHeadersPolicyConfig(`value`: ResponseHeadersPolicyConfigProperty) {
    unwrap(this).setResponseHeadersPolicyConfig(`value`.let(ResponseHeadersPolicyConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8f48ddae8e1a44d81c5154d0916dd7ca141838c199530902cd081c8d5479a8f4")
  public open
      fun responseHeadersPolicyConfig(`value`: ResponseHeadersPolicyConfigProperty.Builder.() -> Unit):
      Unit = responseHeadersPolicyConfig(ResponseHeadersPolicyConfigProperty(`value`))

  public interface Builder {
    public fun responseHeadersPolicyConfig(responseHeadersPolicyConfig: IResolvable)

    public
        fun responseHeadersPolicyConfig(responseHeadersPolicyConfig: ResponseHeadersPolicyConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9c99e743ffd5ce67e0dcdef51f8a24d55b599527880267c5f6c826e1e916d6b0")
    public
        fun responseHeadersPolicyConfig(responseHeadersPolicyConfig: ResponseHeadersPolicyConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.Builder =
        software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.Builder.create(scope,
        id)

    override fun responseHeadersPolicyConfig(responseHeadersPolicyConfig: IResolvable) {
      cdkBuilder.responseHeadersPolicyConfig(responseHeadersPolicyConfig.let(IResolvable::unwrap))
    }

    override
        fun responseHeadersPolicyConfig(responseHeadersPolicyConfig: ResponseHeadersPolicyConfigProperty) {
      cdkBuilder.responseHeadersPolicyConfig(responseHeadersPolicyConfig.let(ResponseHeadersPolicyConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9c99e743ffd5ce67e0dcdef51f8a24d55b599527880267c5f6c826e1e916d6b0")
    override
        fun responseHeadersPolicyConfig(responseHeadersPolicyConfig: ResponseHeadersPolicyConfigProperty.Builder.() -> Unit):
        Unit =
        responseHeadersPolicyConfig(ResponseHeadersPolicyConfigProperty(responseHeadersPolicyConfig))

    public fun build(): software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResponseHeadersPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResponseHeadersPolicy(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy):
        CfnResponseHeadersPolicy = CfnResponseHeadersPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnResponseHeadersPolicy):
        software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy = wrapped.cdkObject
  }

  public interface FrameOptionsProperty {
    public fun frameOption(): String

    public fun `override`(): Any

    public interface Builder {
      public fun frameOption(frameOption: String)

      public fun `override`(`override`: Boolean)

      public fun `override`(`override`: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.FrameOptionsProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.FrameOptionsProperty.builder()

      override fun frameOption(frameOption: String) {
        cdkBuilder.frameOption(frameOption)
      }

      override fun `override`(`override`: Boolean) {
        cdkBuilder.`override`(`override`)
      }

      override fun `override`(`override`: IResolvable) {
        cdkBuilder.`override`(`override`.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.FrameOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.FrameOptionsProperty,
    ) : FrameOptionsProperty {
      override fun frameOption(): String = unwrap(this).getFrameOption()

      override fun `override`(): Any = unwrap(this).getOverride()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FrameOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.FrameOptionsProperty):
          FrameOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FrameOptionsProperty):
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.FrameOptionsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AccessControlAllowMethodsProperty {
    public fun items(): List<String>

    public interface Builder {
      public fun items(items: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlAllowMethodsProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlAllowMethodsProperty.builder()

      override fun items(items: List<String>) {
        cdkBuilder.items(items)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlAllowMethodsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlAllowMethodsProperty,
    ) : AccessControlAllowMethodsProperty {
      override fun items(): List<String> = unwrap(this).getItems() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AccessControlAllowMethodsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlAllowMethodsProperty):
          AccessControlAllowMethodsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessControlAllowMethodsProperty):
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlAllowMethodsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface CustomHeaderProperty {
    public fun `header`(): String

    public fun `override`(): Any

    public fun `value`(): String

    public interface Builder {
      public fun `header`(`header`: String)

      public fun `override`(`override`: Boolean)

      public fun `override`(`override`: IResolvable)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.CustomHeaderProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.CustomHeaderProperty.builder()

      override fun `header`(`header`: String) {
        cdkBuilder.`header`(`header`)
      }

      override fun `override`(`override`: Boolean) {
        cdkBuilder.`override`(`override`)
      }

      override fun `override`(`override`: IResolvable) {
        cdkBuilder.`override`(`override`.let(IResolvable::unwrap))
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.CustomHeaderProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.CustomHeaderProperty,
    ) : CustomHeaderProperty {
      override fun `header`(): String = unwrap(this).getHeader()

      override fun `override`(): Any = unwrap(this).getOverride()

      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CustomHeaderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.CustomHeaderProperty):
          CustomHeaderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomHeaderProperty):
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.CustomHeaderProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SecurityHeadersConfigProperty {
    public fun contentSecurityPolicy(): Any? = unwrap(this).getContentSecurityPolicy()

    public fun contentTypeOptions(): Any? = unwrap(this).getContentTypeOptions()

    public fun frameOptions(): Any? = unwrap(this).getFrameOptions()

    public fun referrerPolicy(): Any? = unwrap(this).getReferrerPolicy()

    public fun strictTransportSecurity(): Any? = unwrap(this).getStrictTransportSecurity()

    public fun xssProtection(): Any? = unwrap(this).getXssProtection()

    public interface Builder {
      public fun contentSecurityPolicy(contentSecurityPolicy: IResolvable)

      public fun contentSecurityPolicy(contentSecurityPolicy: ContentSecurityPolicyProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("760fb682a1ea8478bf5eb7b354cee7bbec18c9fc074dfb46bd11ec9f83e2be0c")
      public
          fun contentSecurityPolicy(contentSecurityPolicy: ContentSecurityPolicyProperty.Builder.() -> Unit)

      public fun contentTypeOptions(contentTypeOptions: IResolvable)

      public fun contentTypeOptions(contentTypeOptions: ContentTypeOptionsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ee14cc438ef422dc195f6786d93efba9a379fbe1f804766c7606b9defcc45868")
      public
          fun contentTypeOptions(contentTypeOptions: ContentTypeOptionsProperty.Builder.() -> Unit)

      public fun frameOptions(frameOptions: IResolvable)

      public fun frameOptions(frameOptions: FrameOptionsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f9f7486599835a4add69d3d02f8dd61b960b1fc6e8d3f404c03e7b1191ed06a3")
      public fun frameOptions(frameOptions: FrameOptionsProperty.Builder.() -> Unit)

      public fun referrerPolicy(referrerPolicy: IResolvable)

      public fun referrerPolicy(referrerPolicy: ReferrerPolicyProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b628b0330a44076207101ae815f397c9f2f3c9d9b4a43593cdc2616707969705")
      public fun referrerPolicy(referrerPolicy: ReferrerPolicyProperty.Builder.() -> Unit)

      public fun strictTransportSecurity(strictTransportSecurity: IResolvable)

      public fun strictTransportSecurity(strictTransportSecurity: StrictTransportSecurityProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b0e4cc64d64398f8a65f156738c9f0f08804a45f6ae25d4bb3817277ce0675d9")
      public
          fun strictTransportSecurity(strictTransportSecurity: StrictTransportSecurityProperty.Builder.() -> Unit)

      public fun xssProtection(xssProtection: IResolvable)

      public fun xssProtection(xssProtection: XSSProtectionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fae93bcf0b927f7dd0729ae813c7ca1d8e2089326ac039c019cca22bcc2a6fa8")
      public fun xssProtection(xssProtection: XSSProtectionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.SecurityHeadersConfigProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.SecurityHeadersConfigProperty.builder()

      override fun contentSecurityPolicy(contentSecurityPolicy: IResolvable) {
        cdkBuilder.contentSecurityPolicy(contentSecurityPolicy.let(IResolvable::unwrap))
      }

      override fun contentSecurityPolicy(contentSecurityPolicy: ContentSecurityPolicyProperty) {
        cdkBuilder.contentSecurityPolicy(contentSecurityPolicy.let(ContentSecurityPolicyProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("760fb682a1ea8478bf5eb7b354cee7bbec18c9fc074dfb46bd11ec9f83e2be0c")
      override
          fun contentSecurityPolicy(contentSecurityPolicy: ContentSecurityPolicyProperty.Builder.() -> Unit):
          Unit = contentSecurityPolicy(ContentSecurityPolicyProperty(contentSecurityPolicy))

      override fun contentTypeOptions(contentTypeOptions: IResolvable) {
        cdkBuilder.contentTypeOptions(contentTypeOptions.let(IResolvable::unwrap))
      }

      override fun contentTypeOptions(contentTypeOptions: ContentTypeOptionsProperty) {
        cdkBuilder.contentTypeOptions(contentTypeOptions.let(ContentTypeOptionsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ee14cc438ef422dc195f6786d93efba9a379fbe1f804766c7606b9defcc45868")
      override
          fun contentTypeOptions(contentTypeOptions: ContentTypeOptionsProperty.Builder.() -> Unit):
          Unit = contentTypeOptions(ContentTypeOptionsProperty(contentTypeOptions))

      override fun frameOptions(frameOptions: IResolvable) {
        cdkBuilder.frameOptions(frameOptions.let(IResolvable::unwrap))
      }

      override fun frameOptions(frameOptions: FrameOptionsProperty) {
        cdkBuilder.frameOptions(frameOptions.let(FrameOptionsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f9f7486599835a4add69d3d02f8dd61b960b1fc6e8d3f404c03e7b1191ed06a3")
      override fun frameOptions(frameOptions: FrameOptionsProperty.Builder.() -> Unit): Unit =
          frameOptions(FrameOptionsProperty(frameOptions))

      override fun referrerPolicy(referrerPolicy: IResolvable) {
        cdkBuilder.referrerPolicy(referrerPolicy.let(IResolvable::unwrap))
      }

      override fun referrerPolicy(referrerPolicy: ReferrerPolicyProperty) {
        cdkBuilder.referrerPolicy(referrerPolicy.let(ReferrerPolicyProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b628b0330a44076207101ae815f397c9f2f3c9d9b4a43593cdc2616707969705")
      override fun referrerPolicy(referrerPolicy: ReferrerPolicyProperty.Builder.() -> Unit): Unit =
          referrerPolicy(ReferrerPolicyProperty(referrerPolicy))

      override fun strictTransportSecurity(strictTransportSecurity: IResolvable) {
        cdkBuilder.strictTransportSecurity(strictTransportSecurity.let(IResolvable::unwrap))
      }

      override
          fun strictTransportSecurity(strictTransportSecurity: StrictTransportSecurityProperty) {
        cdkBuilder.strictTransportSecurity(strictTransportSecurity.let(StrictTransportSecurityProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b0e4cc64d64398f8a65f156738c9f0f08804a45f6ae25d4bb3817277ce0675d9")
      override
          fun strictTransportSecurity(strictTransportSecurity: StrictTransportSecurityProperty.Builder.() -> Unit):
          Unit = strictTransportSecurity(StrictTransportSecurityProperty(strictTransportSecurity))

      override fun xssProtection(xssProtection: IResolvable) {
        cdkBuilder.xssProtection(xssProtection.let(IResolvable::unwrap))
      }

      override fun xssProtection(xssProtection: XSSProtectionProperty) {
        cdkBuilder.xssProtection(xssProtection.let(XSSProtectionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fae93bcf0b927f7dd0729ae813c7ca1d8e2089326ac039c019cca22bcc2a6fa8")
      override fun xssProtection(xssProtection: XSSProtectionProperty.Builder.() -> Unit): Unit =
          xssProtection(XSSProtectionProperty(xssProtection))

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.SecurityHeadersConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.SecurityHeadersConfigProperty,
    ) : SecurityHeadersConfigProperty {
      override fun contentSecurityPolicy(): Any? = unwrap(this).getContentSecurityPolicy()

      override fun contentTypeOptions(): Any? = unwrap(this).getContentTypeOptions()

      override fun frameOptions(): Any? = unwrap(this).getFrameOptions()

      override fun referrerPolicy(): Any? = unwrap(this).getReferrerPolicy()

      override fun strictTransportSecurity(): Any? = unwrap(this).getStrictTransportSecurity()

      override fun xssProtection(): Any? = unwrap(this).getXssProtection()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SecurityHeadersConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.SecurityHeadersConfigProperty):
          SecurityHeadersConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SecurityHeadersConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.SecurityHeadersConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ReferrerPolicyProperty {
    public fun `override`(): Any

    public fun referrerPolicy(): String

    public interface Builder {
      public fun `override`(`override`: Boolean)

      public fun `override`(`override`: IResolvable)

      public fun referrerPolicy(referrerPolicy: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ReferrerPolicyProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ReferrerPolicyProperty.builder()

      override fun `override`(`override`: Boolean) {
        cdkBuilder.`override`(`override`)
      }

      override fun `override`(`override`: IResolvable) {
        cdkBuilder.`override`(`override`.let(IResolvable::unwrap))
      }

      override fun referrerPolicy(referrerPolicy: String) {
        cdkBuilder.referrerPolicy(referrerPolicy)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ReferrerPolicyProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ReferrerPolicyProperty,
    ) : ReferrerPolicyProperty {
      override fun `override`(): Any = unwrap(this).getOverride()

      override fun referrerPolicy(): String = unwrap(this).getReferrerPolicy()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ReferrerPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ReferrerPolicyProperty):
          ReferrerPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReferrerPolicyProperty):
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ReferrerPolicyProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface AccessControlAllowOriginsProperty {
    public fun items(): List<String>

    public interface Builder {
      public fun items(items: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlAllowOriginsProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlAllowOriginsProperty.builder()

      override fun items(items: List<String>) {
        cdkBuilder.items(items)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlAllowOriginsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlAllowOriginsProperty,
    ) : AccessControlAllowOriginsProperty {
      override fun items(): List<String> = unwrap(this).getItems() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AccessControlAllowOriginsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlAllowOriginsProperty):
          AccessControlAllowOriginsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessControlAllowOriginsProperty):
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlAllowOriginsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ResponseHeadersPolicyConfigProperty {
    public fun comment(): String? = unwrap(this).getComment()

    public fun corsConfig(): Any? = unwrap(this).getCorsConfig()

    public fun customHeadersConfig(): Any? = unwrap(this).getCustomHeadersConfig()

    public fun name(): String

    public fun removeHeadersConfig(): Any? = unwrap(this).getRemoveHeadersConfig()

    public fun securityHeadersConfig(): Any? = unwrap(this).getSecurityHeadersConfig()

    public fun serverTimingHeadersConfig(): Any? = unwrap(this).getServerTimingHeadersConfig()

    public interface Builder {
      public fun comment(comment: String)

      public fun corsConfig(corsConfig: IResolvable)

      public fun corsConfig(corsConfig: CorsConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d9a3bed57ef421e819b18d210af15e22c39e9ce5a2c26ea5f666831538c0dddb")
      public fun corsConfig(corsConfig: CorsConfigProperty.Builder.() -> Unit)

      public fun customHeadersConfig(customHeadersConfig: IResolvable)

      public fun customHeadersConfig(customHeadersConfig: CustomHeadersConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f939a3337362614a1fa52773bdecf03e5e8f12aeb6872e583c00f92c0a70e1a0")
      public
          fun customHeadersConfig(customHeadersConfig: CustomHeadersConfigProperty.Builder.() -> Unit)

      public fun name(name: String)

      public fun removeHeadersConfig(removeHeadersConfig: IResolvable)

      public fun removeHeadersConfig(removeHeadersConfig: RemoveHeadersConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b9f027ac414d9aa7f3a962ec1e494f1d195c397f2bd170517c9309f84218568d")
      public
          fun removeHeadersConfig(removeHeadersConfig: RemoveHeadersConfigProperty.Builder.() -> Unit)

      public fun securityHeadersConfig(securityHeadersConfig: IResolvable)

      public fun securityHeadersConfig(securityHeadersConfig: SecurityHeadersConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ec350537ed8704161521a2a0ea42d6d39495942dee0591bb00700be0b7556d8e")
      public
          fun securityHeadersConfig(securityHeadersConfig: SecurityHeadersConfigProperty.Builder.() -> Unit)

      public fun serverTimingHeadersConfig(serverTimingHeadersConfig: IResolvable)

      public
          fun serverTimingHeadersConfig(serverTimingHeadersConfig: ServerTimingHeadersConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("613d322e21df88d714eab3ef3bc3763263ef620308e0ee79809f3cd7def609ca")
      public
          fun serverTimingHeadersConfig(serverTimingHeadersConfig: ServerTimingHeadersConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ResponseHeadersPolicyConfigProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ResponseHeadersPolicyConfigProperty.builder()

      override fun comment(comment: String) {
        cdkBuilder.comment(comment)
      }

      override fun corsConfig(corsConfig: IResolvable) {
        cdkBuilder.corsConfig(corsConfig.let(IResolvable::unwrap))
      }

      override fun corsConfig(corsConfig: CorsConfigProperty) {
        cdkBuilder.corsConfig(corsConfig.let(CorsConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d9a3bed57ef421e819b18d210af15e22c39e9ce5a2c26ea5f666831538c0dddb")
      override fun corsConfig(corsConfig: CorsConfigProperty.Builder.() -> Unit): Unit =
          corsConfig(CorsConfigProperty(corsConfig))

      override fun customHeadersConfig(customHeadersConfig: IResolvable) {
        cdkBuilder.customHeadersConfig(customHeadersConfig.let(IResolvable::unwrap))
      }

      override fun customHeadersConfig(customHeadersConfig: CustomHeadersConfigProperty) {
        cdkBuilder.customHeadersConfig(customHeadersConfig.let(CustomHeadersConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f939a3337362614a1fa52773bdecf03e5e8f12aeb6872e583c00f92c0a70e1a0")
      override
          fun customHeadersConfig(customHeadersConfig: CustomHeadersConfigProperty.Builder.() -> Unit):
          Unit = customHeadersConfig(CustomHeadersConfigProperty(customHeadersConfig))

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun removeHeadersConfig(removeHeadersConfig: IResolvable) {
        cdkBuilder.removeHeadersConfig(removeHeadersConfig.let(IResolvable::unwrap))
      }

      override fun removeHeadersConfig(removeHeadersConfig: RemoveHeadersConfigProperty) {
        cdkBuilder.removeHeadersConfig(removeHeadersConfig.let(RemoveHeadersConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b9f027ac414d9aa7f3a962ec1e494f1d195c397f2bd170517c9309f84218568d")
      override
          fun removeHeadersConfig(removeHeadersConfig: RemoveHeadersConfigProperty.Builder.() -> Unit):
          Unit = removeHeadersConfig(RemoveHeadersConfigProperty(removeHeadersConfig))

      override fun securityHeadersConfig(securityHeadersConfig: IResolvable) {
        cdkBuilder.securityHeadersConfig(securityHeadersConfig.let(IResolvable::unwrap))
      }

      override fun securityHeadersConfig(securityHeadersConfig: SecurityHeadersConfigProperty) {
        cdkBuilder.securityHeadersConfig(securityHeadersConfig.let(SecurityHeadersConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ec350537ed8704161521a2a0ea42d6d39495942dee0591bb00700be0b7556d8e")
      override
          fun securityHeadersConfig(securityHeadersConfig: SecurityHeadersConfigProperty.Builder.() -> Unit):
          Unit = securityHeadersConfig(SecurityHeadersConfigProperty(securityHeadersConfig))

      override fun serverTimingHeadersConfig(serverTimingHeadersConfig: IResolvable) {
        cdkBuilder.serverTimingHeadersConfig(serverTimingHeadersConfig.let(IResolvable::unwrap))
      }

      override
          fun serverTimingHeadersConfig(serverTimingHeadersConfig: ServerTimingHeadersConfigProperty) {
        cdkBuilder.serverTimingHeadersConfig(serverTimingHeadersConfig.let(ServerTimingHeadersConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("613d322e21df88d714eab3ef3bc3763263ef620308e0ee79809f3cd7def609ca")
      override
          fun serverTimingHeadersConfig(serverTimingHeadersConfig: ServerTimingHeadersConfigProperty.Builder.() -> Unit):
          Unit =
          serverTimingHeadersConfig(ServerTimingHeadersConfigProperty(serverTimingHeadersConfig))

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ResponseHeadersPolicyConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ResponseHeadersPolicyConfigProperty,
    ) : ResponseHeadersPolicyConfigProperty {
      override fun comment(): String? = unwrap(this).getComment()

      override fun corsConfig(): Any? = unwrap(this).getCorsConfig()

      override fun customHeadersConfig(): Any? = unwrap(this).getCustomHeadersConfig()

      override fun name(): String = unwrap(this).getName()

      override fun removeHeadersConfig(): Any? = unwrap(this).getRemoveHeadersConfig()

      override fun securityHeadersConfig(): Any? = unwrap(this).getSecurityHeadersConfig()

      override fun serverTimingHeadersConfig(): Any? = unwrap(this).getServerTimingHeadersConfig()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ResponseHeadersPolicyConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ResponseHeadersPolicyConfigProperty):
          ResponseHeadersPolicyConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResponseHeadersPolicyConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ResponseHeadersPolicyConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ServerTimingHeadersConfigProperty {
    public fun enabled(): Any

    public fun samplingRate(): Number? = unwrap(this).getSamplingRate()

    public interface Builder {
      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)

      public fun samplingRate(samplingRate: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ServerTimingHeadersConfigProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ServerTimingHeadersConfigProperty.builder()

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      override fun samplingRate(samplingRate: Number) {
        cdkBuilder.samplingRate(samplingRate)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ServerTimingHeadersConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ServerTimingHeadersConfigProperty,
    ) : ServerTimingHeadersConfigProperty {
      override fun enabled(): Any = unwrap(this).getEnabled()

      override fun samplingRate(): Number? = unwrap(this).getSamplingRate()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ServerTimingHeadersConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ServerTimingHeadersConfigProperty):
          ServerTimingHeadersConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServerTimingHeadersConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ServerTimingHeadersConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface StrictTransportSecurityProperty {
    public fun accessControlMaxAgeSec(): Number

    public fun includeSubdomains(): Any? = unwrap(this).getIncludeSubdomains()

    public fun `override`(): Any

    public fun preload(): Any? = unwrap(this).getPreload()

    public interface Builder {
      public fun accessControlMaxAgeSec(accessControlMaxAgeSec: Number)

      public fun includeSubdomains(includeSubdomains: Boolean)

      public fun includeSubdomains(includeSubdomains: IResolvable)

      public fun `override`(`override`: Boolean)

      public fun `override`(`override`: IResolvable)

      public fun preload(preload: Boolean)

      public fun preload(preload: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.StrictTransportSecurityProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.StrictTransportSecurityProperty.builder()

      override fun accessControlMaxAgeSec(accessControlMaxAgeSec: Number) {
        cdkBuilder.accessControlMaxAgeSec(accessControlMaxAgeSec)
      }

      override fun includeSubdomains(includeSubdomains: Boolean) {
        cdkBuilder.includeSubdomains(includeSubdomains)
      }

      override fun includeSubdomains(includeSubdomains: IResolvable) {
        cdkBuilder.includeSubdomains(includeSubdomains.let(IResolvable::unwrap))
      }

      override fun `override`(`override`: Boolean) {
        cdkBuilder.`override`(`override`)
      }

      override fun `override`(`override`: IResolvable) {
        cdkBuilder.`override`(`override`.let(IResolvable::unwrap))
      }

      override fun preload(preload: Boolean) {
        cdkBuilder.preload(preload)
      }

      override fun preload(preload: IResolvable) {
        cdkBuilder.preload(preload.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.StrictTransportSecurityProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.StrictTransportSecurityProperty,
    ) : StrictTransportSecurityProperty {
      override fun accessControlMaxAgeSec(): Number = unwrap(this).getAccessControlMaxAgeSec()

      override fun includeSubdomains(): Any? = unwrap(this).getIncludeSubdomains()

      override fun `override`(): Any = unwrap(this).getOverride()

      override fun preload(): Any? = unwrap(this).getPreload()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): StrictTransportSecurityProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.StrictTransportSecurityProperty):
          StrictTransportSecurityProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StrictTransportSecurityProperty):
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.StrictTransportSecurityProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface CorsConfigProperty {
    public fun accessControlAllowCredentials(): Any

    public fun accessControlAllowHeaders(): Any

    public fun accessControlAllowMethods(): Any

    public fun accessControlAllowOrigins(): Any

    public fun accessControlExposeHeaders(): Any? = unwrap(this).getAccessControlExposeHeaders()

    public fun accessControlMaxAgeSec(): Number? = unwrap(this).getAccessControlMaxAgeSec()

    public fun originOverride(): Any

    public interface Builder {
      public fun accessControlAllowCredentials(accessControlAllowCredentials: Boolean)

      public fun accessControlAllowCredentials(accessControlAllowCredentials: IResolvable)

      public fun accessControlAllowHeaders(accessControlAllowHeaders: IResolvable)

      public
          fun accessControlAllowHeaders(accessControlAllowHeaders: AccessControlAllowHeadersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3bcde99d4105a597f432e2c2ed6c5d4fc2fbc8a6147c06fa73267c62f585ea13")
      public
          fun accessControlAllowHeaders(accessControlAllowHeaders: AccessControlAllowHeadersProperty.Builder.() -> Unit)

      public fun accessControlAllowMethods(accessControlAllowMethods: IResolvable)

      public
          fun accessControlAllowMethods(accessControlAllowMethods: AccessControlAllowMethodsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2b680abc572b1934f4cdf2bf54e34f8816cbb88b5222d2b111bcb6dd11f87a5b")
      public
          fun accessControlAllowMethods(accessControlAllowMethods: AccessControlAllowMethodsProperty.Builder.() -> Unit)

      public fun accessControlAllowOrigins(accessControlAllowOrigins: IResolvable)

      public
          fun accessControlAllowOrigins(accessControlAllowOrigins: AccessControlAllowOriginsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("444a95bdbc2520e95344520931fcf2ac8cb4045c5967fd889c4981e7806275f9")
      public
          fun accessControlAllowOrigins(accessControlAllowOrigins: AccessControlAllowOriginsProperty.Builder.() -> Unit)

      public fun accessControlExposeHeaders(accessControlExposeHeaders: IResolvable)

      public
          fun accessControlExposeHeaders(accessControlExposeHeaders: AccessControlExposeHeadersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9c8372b795594c49a504376dbb0e2762eb84886ac7ed2fc07745d334ae728355")
      public
          fun accessControlExposeHeaders(accessControlExposeHeaders: AccessControlExposeHeadersProperty.Builder.() -> Unit)

      public fun accessControlMaxAgeSec(accessControlMaxAgeSec: Number)

      public fun originOverride(originOverride: Boolean)

      public fun originOverride(originOverride: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.CorsConfigProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.CorsConfigProperty.builder()

      override fun accessControlAllowCredentials(accessControlAllowCredentials: Boolean) {
        cdkBuilder.accessControlAllowCredentials(accessControlAllowCredentials)
      }

      override fun accessControlAllowCredentials(accessControlAllowCredentials: IResolvable) {
        cdkBuilder.accessControlAllowCredentials(accessControlAllowCredentials.let(IResolvable::unwrap))
      }

      override fun accessControlAllowHeaders(accessControlAllowHeaders: IResolvable) {
        cdkBuilder.accessControlAllowHeaders(accessControlAllowHeaders.let(IResolvable::unwrap))
      }

      override
          fun accessControlAllowHeaders(accessControlAllowHeaders: AccessControlAllowHeadersProperty) {
        cdkBuilder.accessControlAllowHeaders(accessControlAllowHeaders.let(AccessControlAllowHeadersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3bcde99d4105a597f432e2c2ed6c5d4fc2fbc8a6147c06fa73267c62f585ea13")
      override
          fun accessControlAllowHeaders(accessControlAllowHeaders: AccessControlAllowHeadersProperty.Builder.() -> Unit):
          Unit =
          accessControlAllowHeaders(AccessControlAllowHeadersProperty(accessControlAllowHeaders))

      override fun accessControlAllowMethods(accessControlAllowMethods: IResolvable) {
        cdkBuilder.accessControlAllowMethods(accessControlAllowMethods.let(IResolvable::unwrap))
      }

      override
          fun accessControlAllowMethods(accessControlAllowMethods: AccessControlAllowMethodsProperty) {
        cdkBuilder.accessControlAllowMethods(accessControlAllowMethods.let(AccessControlAllowMethodsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2b680abc572b1934f4cdf2bf54e34f8816cbb88b5222d2b111bcb6dd11f87a5b")
      override
          fun accessControlAllowMethods(accessControlAllowMethods: AccessControlAllowMethodsProperty.Builder.() -> Unit):
          Unit =
          accessControlAllowMethods(AccessControlAllowMethodsProperty(accessControlAllowMethods))

      override fun accessControlAllowOrigins(accessControlAllowOrigins: IResolvable) {
        cdkBuilder.accessControlAllowOrigins(accessControlAllowOrigins.let(IResolvable::unwrap))
      }

      override
          fun accessControlAllowOrigins(accessControlAllowOrigins: AccessControlAllowOriginsProperty) {
        cdkBuilder.accessControlAllowOrigins(accessControlAllowOrigins.let(AccessControlAllowOriginsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("444a95bdbc2520e95344520931fcf2ac8cb4045c5967fd889c4981e7806275f9")
      override
          fun accessControlAllowOrigins(accessControlAllowOrigins: AccessControlAllowOriginsProperty.Builder.() -> Unit):
          Unit =
          accessControlAllowOrigins(AccessControlAllowOriginsProperty(accessControlAllowOrigins))

      override fun accessControlExposeHeaders(accessControlExposeHeaders: IResolvable) {
        cdkBuilder.accessControlExposeHeaders(accessControlExposeHeaders.let(IResolvable::unwrap))
      }

      override
          fun accessControlExposeHeaders(accessControlExposeHeaders: AccessControlExposeHeadersProperty) {
        cdkBuilder.accessControlExposeHeaders(accessControlExposeHeaders.let(AccessControlExposeHeadersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9c8372b795594c49a504376dbb0e2762eb84886ac7ed2fc07745d334ae728355")
      override
          fun accessControlExposeHeaders(accessControlExposeHeaders: AccessControlExposeHeadersProperty.Builder.() -> Unit):
          Unit =
          accessControlExposeHeaders(AccessControlExposeHeadersProperty(accessControlExposeHeaders))

      override fun accessControlMaxAgeSec(accessControlMaxAgeSec: Number) {
        cdkBuilder.accessControlMaxAgeSec(accessControlMaxAgeSec)
      }

      override fun originOverride(originOverride: Boolean) {
        cdkBuilder.originOverride(originOverride)
      }

      override fun originOverride(originOverride: IResolvable) {
        cdkBuilder.originOverride(originOverride.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.CorsConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.CorsConfigProperty,
    ) : CorsConfigProperty {
      override fun accessControlAllowCredentials(): Any =
          unwrap(this).getAccessControlAllowCredentials()

      override fun accessControlAllowHeaders(): Any = unwrap(this).getAccessControlAllowHeaders()

      override fun accessControlAllowMethods(): Any = unwrap(this).getAccessControlAllowMethods()

      override fun accessControlAllowOrigins(): Any = unwrap(this).getAccessControlAllowOrigins()

      override fun accessControlExposeHeaders(): Any? = unwrap(this).getAccessControlExposeHeaders()

      override fun accessControlMaxAgeSec(): Number? = unwrap(this).getAccessControlMaxAgeSec()

      override fun originOverride(): Any = unwrap(this).getOriginOverride()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CorsConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.CorsConfigProperty):
          CorsConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CorsConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.CorsConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface RemoveHeaderProperty {
    public fun `header`(): String

    public interface Builder {
      public fun `header`(`header`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.RemoveHeaderProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.RemoveHeaderProperty.builder()

      override fun `header`(`header`: String) {
        cdkBuilder.`header`(`header`)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.RemoveHeaderProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.RemoveHeaderProperty,
    ) : RemoveHeaderProperty {
      override fun `header`(): String = unwrap(this).getHeader()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RemoveHeaderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.RemoveHeaderProperty):
          RemoveHeaderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RemoveHeaderProperty):
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.RemoveHeaderProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CustomHeadersConfigProperty {
    public fun items(): Any

    public interface Builder {
      public fun items(items: IResolvable)

      public fun items(items: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.CustomHeadersConfigProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.CustomHeadersConfigProperty.builder()

      override fun items(items: IResolvable) {
        cdkBuilder.items(items.let(IResolvable::unwrap))
      }

      override fun items(items: List<Any>) {
        cdkBuilder.items(items)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.CustomHeadersConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.CustomHeadersConfigProperty,
    ) : CustomHeadersConfigProperty {
      override fun items(): Any = unwrap(this).getItems()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CustomHeadersConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.CustomHeadersConfigProperty):
          CustomHeadersConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomHeadersConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.CustomHeadersConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface RemoveHeadersConfigProperty {
    public fun items(): Any

    public interface Builder {
      public fun items(items: IResolvable)

      public fun items(items: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.RemoveHeadersConfigProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.RemoveHeadersConfigProperty.builder()

      override fun items(items: IResolvable) {
        cdkBuilder.items(items.let(IResolvable::unwrap))
      }

      override fun items(items: List<Any>) {
        cdkBuilder.items(items)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.RemoveHeadersConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.RemoveHeadersConfigProperty,
    ) : RemoveHeadersConfigProperty {
      override fun items(): Any = unwrap(this).getItems()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RemoveHeadersConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.RemoveHeadersConfigProperty):
          RemoveHeadersConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RemoveHeadersConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.RemoveHeadersConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ContentSecurityPolicyProperty {
    public fun contentSecurityPolicy(): String

    public fun `override`(): Any

    public interface Builder {
      public fun contentSecurityPolicy(contentSecurityPolicy: String)

      public fun `override`(`override`: Boolean)

      public fun `override`(`override`: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ContentSecurityPolicyProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ContentSecurityPolicyProperty.builder()

      override fun contentSecurityPolicy(contentSecurityPolicy: String) {
        cdkBuilder.contentSecurityPolicy(contentSecurityPolicy)
      }

      override fun `override`(`override`: Boolean) {
        cdkBuilder.`override`(`override`)
      }

      override fun `override`(`override`: IResolvable) {
        cdkBuilder.`override`(`override`.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ContentSecurityPolicyProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ContentSecurityPolicyProperty,
    ) : ContentSecurityPolicyProperty {
      override fun contentSecurityPolicy(): String = unwrap(this).getContentSecurityPolicy()

      override fun `override`(): Any = unwrap(this).getOverride()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ContentSecurityPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ContentSecurityPolicyProperty):
          ContentSecurityPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContentSecurityPolicyProperty):
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ContentSecurityPolicyProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface AccessControlAllowHeadersProperty {
    public fun items(): List<String>

    public interface Builder {
      public fun items(items: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlAllowHeadersProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlAllowHeadersProperty.builder()

      override fun items(items: List<String>) {
        cdkBuilder.items(items)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlAllowHeadersProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlAllowHeadersProperty,
    ) : AccessControlAllowHeadersProperty {
      override fun items(): List<String> = unwrap(this).getItems() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AccessControlAllowHeadersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlAllowHeadersProperty):
          AccessControlAllowHeadersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessControlAllowHeadersProperty):
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlAllowHeadersProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface AccessControlExposeHeadersProperty {
    public fun items(): List<String>

    public interface Builder {
      public fun items(items: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlExposeHeadersProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlExposeHeadersProperty.builder()

      override fun items(items: List<String>) {
        cdkBuilder.items(items)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlExposeHeadersProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlExposeHeadersProperty,
    ) : AccessControlExposeHeadersProperty {
      override fun items(): List<String> = unwrap(this).getItems() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AccessControlExposeHeadersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlExposeHeadersProperty):
          AccessControlExposeHeadersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessControlExposeHeadersProperty):
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlExposeHeadersProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface XSSProtectionProperty {
    public fun modeBlock(): Any? = unwrap(this).getModeBlock()

    public fun `override`(): Any

    public fun protection(): Any

    public fun reportUri(): String? = unwrap(this).getReportUri()

    public interface Builder {
      public fun modeBlock(modeBlock: Boolean)

      public fun modeBlock(modeBlock: IResolvable)

      public fun `override`(`override`: Boolean)

      public fun `override`(`override`: IResolvable)

      public fun protection(protection: Boolean)

      public fun protection(protection: IResolvable)

      public fun reportUri(reportUri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.XSSProtectionProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.XSSProtectionProperty.builder()

      override fun modeBlock(modeBlock: Boolean) {
        cdkBuilder.modeBlock(modeBlock)
      }

      override fun modeBlock(modeBlock: IResolvable) {
        cdkBuilder.modeBlock(modeBlock.let(IResolvable::unwrap))
      }

      override fun `override`(`override`: Boolean) {
        cdkBuilder.`override`(`override`)
      }

      override fun `override`(`override`: IResolvable) {
        cdkBuilder.`override`(`override`.let(IResolvable::unwrap))
      }

      override fun protection(protection: Boolean) {
        cdkBuilder.protection(protection)
      }

      override fun protection(protection: IResolvable) {
        cdkBuilder.protection(protection.let(IResolvable::unwrap))
      }

      override fun reportUri(reportUri: String) {
        cdkBuilder.reportUri(reportUri)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.XSSProtectionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.XSSProtectionProperty,
    ) : XSSProtectionProperty {
      override fun modeBlock(): Any? = unwrap(this).getModeBlock()

      override fun `override`(): Any = unwrap(this).getOverride()

      override fun protection(): Any = unwrap(this).getProtection()

      override fun reportUri(): String? = unwrap(this).getReportUri()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): XSSProtectionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.XSSProtectionProperty):
          XSSProtectionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: XSSProtectionProperty):
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.XSSProtectionProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ContentTypeOptionsProperty {
    public fun `override`(): Any

    public interface Builder {
      public fun `override`(`override`: Boolean)

      public fun `override`(`override`: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ContentTypeOptionsProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ContentTypeOptionsProperty.builder()

      override fun `override`(`override`: Boolean) {
        cdkBuilder.`override`(`override`)
      }

      override fun `override`(`override`: IResolvable) {
        cdkBuilder.`override`(`override`.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ContentTypeOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ContentTypeOptionsProperty,
    ) : ContentTypeOptionsProperty {
      override fun `override`(): Any = unwrap(this).getOverride()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ContentTypeOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ContentTypeOptionsProperty):
          ContentTypeOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContentTypeOptionsProperty):
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ContentTypeOptionsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnOriginRequestPolicy internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrLastModifiedTime(): String = unwrap(this).getAttrLastModifiedTime()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun originRequestPolicyConfig(): Any = unwrap(this).getOriginRequestPolicyConfig()

  public open fun originRequestPolicyConfig(`value`: IResolvable) {
    unwrap(this).setOriginRequestPolicyConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun originRequestPolicyConfig(`value`: OriginRequestPolicyConfigProperty) {
    unwrap(this).setOriginRequestPolicyConfig(`value`.let(OriginRequestPolicyConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5d24f8568e37342a8d4504597487f1a88a47c8e7a1a4b3f5c6d6f138a2a32b9a")
  public open
      fun originRequestPolicyConfig(`value`: OriginRequestPolicyConfigProperty.Builder.() -> Unit):
      Unit = originRequestPolicyConfig(OriginRequestPolicyConfigProperty(`value`))

  public interface Builder {
    public fun originRequestPolicyConfig(originRequestPolicyConfig: IResolvable)

    public
        fun originRequestPolicyConfig(originRequestPolicyConfig: OriginRequestPolicyConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("718e1855ddc4310816c9d042a20dc1906cbfa8a9f199a420b180c639b83855d2")
    public
        fun originRequestPolicyConfig(originRequestPolicyConfig: OriginRequestPolicyConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.Builder =
        software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.Builder.create(scope, id)

    override fun originRequestPolicyConfig(originRequestPolicyConfig: IResolvable) {
      cdkBuilder.originRequestPolicyConfig(originRequestPolicyConfig.let(IResolvable::unwrap))
    }

    override
        fun originRequestPolicyConfig(originRequestPolicyConfig: OriginRequestPolicyConfigProperty) {
      cdkBuilder.originRequestPolicyConfig(originRequestPolicyConfig.let(OriginRequestPolicyConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("718e1855ddc4310816c9d042a20dc1906cbfa8a9f199a420b180c639b83855d2")
    override
        fun originRequestPolicyConfig(originRequestPolicyConfig: OriginRequestPolicyConfigProperty.Builder.() -> Unit):
        Unit =
        originRequestPolicyConfig(OriginRequestPolicyConfigProperty(originRequestPolicyConfig))

    public fun build(): software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnOriginRequestPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnOriginRequestPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy):
        CfnOriginRequestPolicy = CfnOriginRequestPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnOriginRequestPolicy):
        software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy = wrapped.cdkObject
  }

  public interface OriginRequestPolicyConfigProperty {
    public fun comment(): String? = unwrap(this).getComment()

    public fun cookiesConfig(): Any

    public fun headersConfig(): Any

    public fun name(): String

    public fun queryStringsConfig(): Any

    public interface Builder {
      public fun comment(comment: String)

      public fun cookiesConfig(cookiesConfig: IResolvable)

      public fun cookiesConfig(cookiesConfig: CookiesConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1335106fdfc8f035449e4314e1bcc9c09ae33b5be995f1b54ae8fa181bf24684")
      public fun cookiesConfig(cookiesConfig: CookiesConfigProperty.Builder.() -> Unit)

      public fun headersConfig(headersConfig: IResolvable)

      public fun headersConfig(headersConfig: HeadersConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c7231e27fb43bbb74dd27667dff9091b756ff94392dbecc842399ef98ecec854")
      public fun headersConfig(headersConfig: HeadersConfigProperty.Builder.() -> Unit)

      public fun name(name: String)

      public fun queryStringsConfig(queryStringsConfig: IResolvable)

      public fun queryStringsConfig(queryStringsConfig: QueryStringsConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c408a9a2d988cdc3875e3fb60917fa135bb14539772c640f28e651c5f2412b78")
      public
          fun queryStringsConfig(queryStringsConfig: QueryStringsConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.OriginRequestPolicyConfigProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.OriginRequestPolicyConfigProperty.builder()

      override fun comment(comment: String) {
        cdkBuilder.comment(comment)
      }

      override fun cookiesConfig(cookiesConfig: IResolvable) {
        cdkBuilder.cookiesConfig(cookiesConfig.let(IResolvable::unwrap))
      }

      override fun cookiesConfig(cookiesConfig: CookiesConfigProperty) {
        cdkBuilder.cookiesConfig(cookiesConfig.let(CookiesConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1335106fdfc8f035449e4314e1bcc9c09ae33b5be995f1b54ae8fa181bf24684")
      override fun cookiesConfig(cookiesConfig: CookiesConfigProperty.Builder.() -> Unit): Unit =
          cookiesConfig(CookiesConfigProperty(cookiesConfig))

      override fun headersConfig(headersConfig: IResolvable) {
        cdkBuilder.headersConfig(headersConfig.let(IResolvable::unwrap))
      }

      override fun headersConfig(headersConfig: HeadersConfigProperty) {
        cdkBuilder.headersConfig(headersConfig.let(HeadersConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c7231e27fb43bbb74dd27667dff9091b756ff94392dbecc842399ef98ecec854")
      override fun headersConfig(headersConfig: HeadersConfigProperty.Builder.() -> Unit): Unit =
          headersConfig(HeadersConfigProperty(headersConfig))

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun queryStringsConfig(queryStringsConfig: IResolvable) {
        cdkBuilder.queryStringsConfig(queryStringsConfig.let(IResolvable::unwrap))
      }

      override fun queryStringsConfig(queryStringsConfig: QueryStringsConfigProperty) {
        cdkBuilder.queryStringsConfig(queryStringsConfig.let(QueryStringsConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c408a9a2d988cdc3875e3fb60917fa135bb14539772c640f28e651c5f2412b78")
      override
          fun queryStringsConfig(queryStringsConfig: QueryStringsConfigProperty.Builder.() -> Unit):
          Unit = queryStringsConfig(QueryStringsConfigProperty(queryStringsConfig))

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.OriginRequestPolicyConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.OriginRequestPolicyConfigProperty,
    ) : OriginRequestPolicyConfigProperty {
      override fun comment(): String? = unwrap(this).getComment()

      override fun cookiesConfig(): Any = unwrap(this).getCookiesConfig()

      override fun headersConfig(): Any = unwrap(this).getHeadersConfig()

      override fun name(): String = unwrap(this).getName()

      override fun queryStringsConfig(): Any = unwrap(this).getQueryStringsConfig()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          OriginRequestPolicyConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.OriginRequestPolicyConfigProperty):
          OriginRequestPolicyConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OriginRequestPolicyConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.OriginRequestPolicyConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface HeadersConfigProperty {
    public fun headerBehavior(): String

    public fun headers(): List<String> = unwrap(this).getHeaders() ?: emptyList()

    public interface Builder {
      public fun headerBehavior(headerBehavior: String)

      public fun headers(headers: List<String>)

      public fun headers(vararg headers: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.HeadersConfigProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.HeadersConfigProperty.builder()

      override fun headerBehavior(headerBehavior: String) {
        cdkBuilder.headerBehavior(headerBehavior)
      }

      override fun headers(headers: List<String>) {
        cdkBuilder.headers(headers)
      }

      override fun headers(vararg headers: String): Unit = headers(headers.toList())

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.HeadersConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.HeadersConfigProperty,
    ) : HeadersConfigProperty {
      override fun headerBehavior(): String = unwrap(this).getHeaderBehavior()

      override fun headers(): List<String> = unwrap(this).getHeaders() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HeadersConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.HeadersConfigProperty):
          HeadersConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HeadersConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.HeadersConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CookiesConfigProperty {
    public fun cookieBehavior(): String

    public fun cookies(): List<String> = unwrap(this).getCookies() ?: emptyList()

    public interface Builder {
      public fun cookieBehavior(cookieBehavior: String)

      public fun cookies(cookies: List<String>)

      public fun cookies(vararg cookies: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.CookiesConfigProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.CookiesConfigProperty.builder()

      override fun cookieBehavior(cookieBehavior: String) {
        cdkBuilder.cookieBehavior(cookieBehavior)
      }

      override fun cookies(cookies: List<String>) {
        cdkBuilder.cookies(cookies)
      }

      override fun cookies(vararg cookies: String): Unit = cookies(cookies.toList())

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.CookiesConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.CookiesConfigProperty,
    ) : CookiesConfigProperty {
      override fun cookieBehavior(): String = unwrap(this).getCookieBehavior()

      override fun cookies(): List<String> = unwrap(this).getCookies() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CookiesConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.CookiesConfigProperty):
          CookiesConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CookiesConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.CookiesConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface QueryStringsConfigProperty {
    public fun queryStringBehavior(): String

    public fun queryStrings(): List<String> = unwrap(this).getQueryStrings() ?: emptyList()

    public interface Builder {
      public fun queryStringBehavior(queryStringBehavior: String)

      public fun queryStrings(queryStrings: List<String>)

      public fun queryStrings(vararg queryStrings: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.QueryStringsConfigProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.QueryStringsConfigProperty.builder()

      override fun queryStringBehavior(queryStringBehavior: String) {
        cdkBuilder.queryStringBehavior(queryStringBehavior)
      }

      override fun queryStrings(queryStrings: List<String>) {
        cdkBuilder.queryStrings(queryStrings)
      }

      override fun queryStrings(vararg queryStrings: String): Unit =
          queryStrings(queryStrings.toList())

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.QueryStringsConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.QueryStringsConfigProperty,
    ) : QueryStringsConfigProperty {
      override fun queryStringBehavior(): String = unwrap(this).getQueryStringBehavior()

      override fun queryStrings(): List<String> = unwrap(this).getQueryStrings() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): QueryStringsConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.QueryStringsConfigProperty):
          QueryStringsConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: QueryStringsConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.QueryStringsConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}

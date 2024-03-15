@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCachePolicy internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudfront.CfnCachePolicy,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrLastModifiedTime(): String = unwrap(this).getAttrLastModifiedTime()

  public open fun cachePolicyConfig(): Any = unwrap(this).getCachePolicyConfig()

  public open fun cachePolicyConfig(`value`: IResolvable) {
    unwrap(this).setCachePolicyConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun cachePolicyConfig(`value`: CachePolicyConfigProperty) {
    unwrap(this).setCachePolicyConfig(`value`.let(CachePolicyConfigProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0327f7068e2c26ae7ca2e311cd280c733fe8760df83548dbb931da2dcb8107e0")
  public open fun cachePolicyConfig(`value`: CachePolicyConfigProperty.Builder.() -> Unit): Unit =
      cachePolicyConfig(CachePolicyConfigProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  @CdkDslMarker
  public interface Builder {
    public fun cachePolicyConfig(cachePolicyConfig: IResolvable)

    public fun cachePolicyConfig(cachePolicyConfig: CachePolicyConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0fda54e25ac114759a639535f6dbaf9669165446bd1b2f9c3b537ceb0eced2e3")
    public fun cachePolicyConfig(cachePolicyConfig: CachePolicyConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.CfnCachePolicy.Builder =
        software.amazon.awscdk.services.cloudfront.CfnCachePolicy.Builder.create(scope, id)

    override fun cachePolicyConfig(cachePolicyConfig: IResolvable) {
      cdkBuilder.cachePolicyConfig(cachePolicyConfig.let(IResolvable::unwrap))
    }

    override fun cachePolicyConfig(cachePolicyConfig: CachePolicyConfigProperty) {
      cdkBuilder.cachePolicyConfig(cachePolicyConfig.let(CachePolicyConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0fda54e25ac114759a639535f6dbaf9669165446bd1b2f9c3b537ceb0eced2e3")
    override fun cachePolicyConfig(cachePolicyConfig: CachePolicyConfigProperty.Builder.() -> Unit):
        Unit = cachePolicyConfig(CachePolicyConfigProperty(cachePolicyConfig))

    public fun build(): software.amazon.awscdk.services.cloudfront.CfnCachePolicy =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cloudfront.CfnCachePolicy.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCachePolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCachePolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnCachePolicy):
        CfnCachePolicy = CfnCachePolicy(cdkObject)

    internal fun unwrap(wrapped: CfnCachePolicy):
        software.amazon.awscdk.services.cloudfront.CfnCachePolicy = wrapped.cdkObject
  }

  public interface HeadersConfigProperty {
    public fun headerBehavior(): String

    public fun headers(): List<String> = unwrap(this).getHeaders() ?: emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun headerBehavior(headerBehavior: String)

      public fun headers(headers: List<String>)

      public fun headers(vararg headers: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.HeadersConfigProperty.Builder =
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.HeadersConfigProperty.builder()

      override fun headerBehavior(headerBehavior: String) {
        cdkBuilder.headerBehavior(headerBehavior)
      }

      override fun headers(headers: List<String>) {
        cdkBuilder.headers(headers)
      }

      override fun headers(vararg headers: String): Unit = headers(headers.toList())

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.HeadersConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.HeadersConfigProperty,
    ) : CdkObject(cdkObject), HeadersConfigProperty {
      override fun headerBehavior(): String = unwrap(this).getHeaderBehavior()

      override fun headers(): List<String> = unwrap(this).getHeaders() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HeadersConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnCachePolicy.HeadersConfigProperty):
          HeadersConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HeadersConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.HeadersConfigProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.HeadersConfigProperty
    }
  }

  public interface ParametersInCacheKeyAndForwardedToOriginProperty {
    public fun cookiesConfig(): Any

    public fun enableAcceptEncodingBrotli(): Any? = unwrap(this).getEnableAcceptEncodingBrotli()

    public fun enableAcceptEncodingGzip(): Any

    public fun headersConfig(): Any

    public fun queryStringsConfig(): Any

    @CdkDslMarker
    public interface Builder {
      public fun cookiesConfig(cookiesConfig: IResolvable)

      public fun cookiesConfig(cookiesConfig: CookiesConfigProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cd73846cce71a0b5ddc21e71b0389d3a5f0b8a86832fe7ab38b9e11c3c050129")
      public fun cookiesConfig(cookiesConfig: CookiesConfigProperty.Builder.() -> Unit)

      public fun enableAcceptEncodingBrotli(enableAcceptEncodingBrotli: Boolean)

      public fun enableAcceptEncodingBrotli(enableAcceptEncodingBrotli: IResolvable)

      public fun enableAcceptEncodingGzip(enableAcceptEncodingGzip: Boolean)

      public fun enableAcceptEncodingGzip(enableAcceptEncodingGzip: IResolvable)

      public fun headersConfig(headersConfig: IResolvable)

      public fun headersConfig(headersConfig: HeadersConfigProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("45c52ffde49eb8eb105709b889f144604b1745146eb4d92c5ab4efc984ed406b")
      public fun headersConfig(headersConfig: HeadersConfigProperty.Builder.() -> Unit)

      public fun queryStringsConfig(queryStringsConfig: IResolvable)

      public fun queryStringsConfig(queryStringsConfig: QueryStringsConfigProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("91e895acf57abba00224b945c1c7b5a23ebc86968d55485206445b4be7aca139")
      public
          fun queryStringsConfig(queryStringsConfig: QueryStringsConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.ParametersInCacheKeyAndForwardedToOriginProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.ParametersInCacheKeyAndForwardedToOriginProperty.builder()

      override fun cookiesConfig(cookiesConfig: IResolvable) {
        cdkBuilder.cookiesConfig(cookiesConfig.let(IResolvable::unwrap))
      }

      override fun cookiesConfig(cookiesConfig: CookiesConfigProperty) {
        cdkBuilder.cookiesConfig(cookiesConfig.let(CookiesConfigProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cd73846cce71a0b5ddc21e71b0389d3a5f0b8a86832fe7ab38b9e11c3c050129")
      override fun cookiesConfig(cookiesConfig: CookiesConfigProperty.Builder.() -> Unit): Unit =
          cookiesConfig(CookiesConfigProperty(cookiesConfig))

      override fun enableAcceptEncodingBrotli(enableAcceptEncodingBrotli: Boolean) {
        cdkBuilder.enableAcceptEncodingBrotli(enableAcceptEncodingBrotli)
      }

      override fun enableAcceptEncodingBrotli(enableAcceptEncodingBrotli: IResolvable) {
        cdkBuilder.enableAcceptEncodingBrotli(enableAcceptEncodingBrotli.let(IResolvable::unwrap))
      }

      override fun enableAcceptEncodingGzip(enableAcceptEncodingGzip: Boolean) {
        cdkBuilder.enableAcceptEncodingGzip(enableAcceptEncodingGzip)
      }

      override fun enableAcceptEncodingGzip(enableAcceptEncodingGzip: IResolvable) {
        cdkBuilder.enableAcceptEncodingGzip(enableAcceptEncodingGzip.let(IResolvable::unwrap))
      }

      override fun headersConfig(headersConfig: IResolvable) {
        cdkBuilder.headersConfig(headersConfig.let(IResolvable::unwrap))
      }

      override fun headersConfig(headersConfig: HeadersConfigProperty) {
        cdkBuilder.headersConfig(headersConfig.let(HeadersConfigProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("45c52ffde49eb8eb105709b889f144604b1745146eb4d92c5ab4efc984ed406b")
      override fun headersConfig(headersConfig: HeadersConfigProperty.Builder.() -> Unit): Unit =
          headersConfig(HeadersConfigProperty(headersConfig))

      override fun queryStringsConfig(queryStringsConfig: IResolvable) {
        cdkBuilder.queryStringsConfig(queryStringsConfig.let(IResolvable::unwrap))
      }

      override fun queryStringsConfig(queryStringsConfig: QueryStringsConfigProperty) {
        cdkBuilder.queryStringsConfig(queryStringsConfig.let(QueryStringsConfigProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("91e895acf57abba00224b945c1c7b5a23ebc86968d55485206445b4be7aca139")
      override
          fun queryStringsConfig(queryStringsConfig: QueryStringsConfigProperty.Builder.() -> Unit):
          Unit = queryStringsConfig(QueryStringsConfigProperty(queryStringsConfig))

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.ParametersInCacheKeyAndForwardedToOriginProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.ParametersInCacheKeyAndForwardedToOriginProperty,
    ) : CdkObject(cdkObject), ParametersInCacheKeyAndForwardedToOriginProperty {
      override fun cookiesConfig(): Any = unwrap(this).getCookiesConfig()

      override fun enableAcceptEncodingBrotli(): Any? = unwrap(this).getEnableAcceptEncodingBrotli()

      override fun enableAcceptEncodingGzip(): Any = unwrap(this).getEnableAcceptEncodingGzip()

      override fun headersConfig(): Any = unwrap(this).getHeadersConfig()

      override fun queryStringsConfig(): Any = unwrap(this).getQueryStringsConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ParametersInCacheKeyAndForwardedToOriginProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnCachePolicy.ParametersInCacheKeyAndForwardedToOriginProperty):
          ParametersInCacheKeyAndForwardedToOriginProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ParametersInCacheKeyAndForwardedToOriginProperty):
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.ParametersInCacheKeyAndForwardedToOriginProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.ParametersInCacheKeyAndForwardedToOriginProperty
    }
  }

  public interface CookiesConfigProperty {
    public fun cookieBehavior(): String

    public fun cookies(): List<String> = unwrap(this).getCookies() ?: emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun cookieBehavior(cookieBehavior: String)

      public fun cookies(cookies: List<String>)

      public fun cookies(vararg cookies: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.CookiesConfigProperty.Builder =
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.CookiesConfigProperty.builder()

      override fun cookieBehavior(cookieBehavior: String) {
        cdkBuilder.cookieBehavior(cookieBehavior)
      }

      override fun cookies(cookies: List<String>) {
        cdkBuilder.cookies(cookies)
      }

      override fun cookies(vararg cookies: String): Unit = cookies(cookies.toList())

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.CookiesConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.CookiesConfigProperty,
    ) : CdkObject(cdkObject), CookiesConfigProperty {
      override fun cookieBehavior(): String = unwrap(this).getCookieBehavior()

      override fun cookies(): List<String> = unwrap(this).getCookies() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CookiesConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnCachePolicy.CookiesConfigProperty):
          CookiesConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CookiesConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.CookiesConfigProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.CookiesConfigProperty
    }
  }

  public interface QueryStringsConfigProperty {
    public fun queryStringBehavior(): String

    public fun queryStrings(): List<String> = unwrap(this).getQueryStrings() ?: emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun queryStringBehavior(queryStringBehavior: String)

      public fun queryStrings(queryStrings: List<String>)

      public fun queryStrings(vararg queryStrings: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.QueryStringsConfigProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.QueryStringsConfigProperty.builder()

      override fun queryStringBehavior(queryStringBehavior: String) {
        cdkBuilder.queryStringBehavior(queryStringBehavior)
      }

      override fun queryStrings(queryStrings: List<String>) {
        cdkBuilder.queryStrings(queryStrings)
      }

      override fun queryStrings(vararg queryStrings: String): Unit =
          queryStrings(queryStrings.toList())

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.QueryStringsConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.QueryStringsConfigProperty,
    ) : CdkObject(cdkObject), QueryStringsConfigProperty {
      override fun queryStringBehavior(): String = unwrap(this).getQueryStringBehavior()

      override fun queryStrings(): List<String> = unwrap(this).getQueryStrings() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): QueryStringsConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnCachePolicy.QueryStringsConfigProperty):
          QueryStringsConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: QueryStringsConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.QueryStringsConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.QueryStringsConfigProperty
    }
  }

  public interface CachePolicyConfigProperty {
    public fun comment(): String? = unwrap(this).getComment()

    public fun defaultTtl(): Number

    public fun maxTtl(): Number

    public fun minTtl(): Number

    public fun name(): String

    public fun parametersInCacheKeyAndForwardedToOrigin(): Any

    @CdkDslMarker
    public interface Builder {
      public fun comment(comment: String)

      public fun defaultTtl(defaultTtl: Number)

      public fun maxTtl(maxTtl: Number)

      public fun minTtl(minTtl: Number)

      public fun name(name: String)

      public
          fun parametersInCacheKeyAndForwardedToOrigin(parametersInCacheKeyAndForwardedToOrigin: IResolvable)

      public
          fun parametersInCacheKeyAndForwardedToOrigin(parametersInCacheKeyAndForwardedToOrigin: ParametersInCacheKeyAndForwardedToOriginProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f89df2634fea665831b079caea320d3657ed6ac143669c7ff2ec8b99e6c38256")
      public
          fun parametersInCacheKeyAndForwardedToOrigin(parametersInCacheKeyAndForwardedToOrigin: ParametersInCacheKeyAndForwardedToOriginProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.CachePolicyConfigProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.CachePolicyConfigProperty.builder()

      override fun comment(comment: String) {
        cdkBuilder.comment(comment)
      }

      override fun defaultTtl(defaultTtl: Number) {
        cdkBuilder.defaultTtl(defaultTtl)
      }

      override fun maxTtl(maxTtl: Number) {
        cdkBuilder.maxTtl(maxTtl)
      }

      override fun minTtl(minTtl: Number) {
        cdkBuilder.minTtl(minTtl)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override
          fun parametersInCacheKeyAndForwardedToOrigin(parametersInCacheKeyAndForwardedToOrigin: IResolvable) {
        cdkBuilder.parametersInCacheKeyAndForwardedToOrigin(parametersInCacheKeyAndForwardedToOrigin.let(IResolvable::unwrap))
      }

      override
          fun parametersInCacheKeyAndForwardedToOrigin(parametersInCacheKeyAndForwardedToOrigin: ParametersInCacheKeyAndForwardedToOriginProperty) {
        cdkBuilder.parametersInCacheKeyAndForwardedToOrigin(parametersInCacheKeyAndForwardedToOrigin.let(ParametersInCacheKeyAndForwardedToOriginProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f89df2634fea665831b079caea320d3657ed6ac143669c7ff2ec8b99e6c38256")
      override
          fun parametersInCacheKeyAndForwardedToOrigin(parametersInCacheKeyAndForwardedToOrigin: ParametersInCacheKeyAndForwardedToOriginProperty.Builder.() -> Unit):
          Unit =
          parametersInCacheKeyAndForwardedToOrigin(ParametersInCacheKeyAndForwardedToOriginProperty(parametersInCacheKeyAndForwardedToOrigin))

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.CachePolicyConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.CachePolicyConfigProperty,
    ) : CdkObject(cdkObject), CachePolicyConfigProperty {
      override fun comment(): String? = unwrap(this).getComment()

      override fun defaultTtl(): Number = unwrap(this).getDefaultTtl()

      override fun maxTtl(): Number = unwrap(this).getMaxTtl()

      override fun minTtl(): Number = unwrap(this).getMinTtl()

      override fun name(): String = unwrap(this).getName()

      override fun parametersInCacheKeyAndForwardedToOrigin(): Any =
          unwrap(this).getParametersInCacheKeyAndForwardedToOrigin()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CachePolicyConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnCachePolicy.CachePolicyConfigProperty):
          CachePolicyConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CachePolicyConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.CachePolicyConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.CachePolicyConfigProperty
    }
  }
}

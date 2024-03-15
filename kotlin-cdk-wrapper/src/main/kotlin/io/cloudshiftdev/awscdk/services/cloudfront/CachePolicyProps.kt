@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface CachePolicyProps {
  public fun cachePolicyName(): String? = unwrap(this).getCachePolicyName()

  public fun comment(): String? = unwrap(this).getComment()

  public fun cookieBehavior(): CacheCookieBehavior? =
      unwrap(this).getCookieBehavior()?.let(CacheCookieBehavior::wrap)

  public fun defaultTtl(): Duration? = unwrap(this).getDefaultTtl()?.let(Duration::wrap)

  public fun enableAcceptEncodingBrotli(): Boolean? = unwrap(this).getEnableAcceptEncodingBrotli()

  public fun enableAcceptEncodingGzip(): Boolean? = unwrap(this).getEnableAcceptEncodingGzip()

  public fun headerBehavior(): CacheHeaderBehavior? =
      unwrap(this).getHeaderBehavior()?.let(CacheHeaderBehavior::wrap)

  public fun maxTtl(): Duration? = unwrap(this).getMaxTtl()?.let(Duration::wrap)

  public fun minTtl(): Duration? = unwrap(this).getMinTtl()?.let(Duration::wrap)

  public fun queryStringBehavior(): CacheQueryStringBehavior? =
      unwrap(this).getQueryStringBehavior()?.let(CacheQueryStringBehavior::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun cachePolicyName(cachePolicyName: String)

    public fun comment(comment: String)

    public fun cookieBehavior(cookieBehavior: CacheCookieBehavior)

    public fun defaultTtl(defaultTtl: Duration)

    public fun enableAcceptEncodingBrotli(enableAcceptEncodingBrotli: Boolean)

    public fun enableAcceptEncodingGzip(enableAcceptEncodingGzip: Boolean)

    public fun headerBehavior(headerBehavior: CacheHeaderBehavior)

    public fun maxTtl(maxTtl: Duration)

    public fun minTtl(minTtl: Duration)

    public fun queryStringBehavior(queryStringBehavior: CacheQueryStringBehavior)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.CachePolicyProps.Builder =
        software.amazon.awscdk.services.cloudfront.CachePolicyProps.builder()

    override fun cachePolicyName(cachePolicyName: String) {
      cdkBuilder.cachePolicyName(cachePolicyName)
    }

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    override fun cookieBehavior(cookieBehavior: CacheCookieBehavior) {
      cdkBuilder.cookieBehavior(cookieBehavior.let(CacheCookieBehavior::unwrap))
    }

    override fun defaultTtl(defaultTtl: Duration) {
      cdkBuilder.defaultTtl(defaultTtl.let(Duration::unwrap))
    }

    override fun enableAcceptEncodingBrotli(enableAcceptEncodingBrotli: Boolean) {
      cdkBuilder.enableAcceptEncodingBrotli(enableAcceptEncodingBrotli)
    }

    override fun enableAcceptEncodingGzip(enableAcceptEncodingGzip: Boolean) {
      cdkBuilder.enableAcceptEncodingGzip(enableAcceptEncodingGzip)
    }

    override fun headerBehavior(headerBehavior: CacheHeaderBehavior) {
      cdkBuilder.headerBehavior(headerBehavior.let(CacheHeaderBehavior::unwrap))
    }

    override fun maxTtl(maxTtl: Duration) {
      cdkBuilder.maxTtl(maxTtl.let(Duration::unwrap))
    }

    override fun minTtl(minTtl: Duration) {
      cdkBuilder.minTtl(minTtl.let(Duration::unwrap))
    }

    override fun queryStringBehavior(queryStringBehavior: CacheQueryStringBehavior) {
      cdkBuilder.queryStringBehavior(queryStringBehavior.let(CacheQueryStringBehavior::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.CachePolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.CachePolicyProps,
  ) : CdkObject(cdkObject), CachePolicyProps {
    override fun cachePolicyName(): String? = unwrap(this).getCachePolicyName()

    override fun comment(): String? = unwrap(this).getComment()

    override fun cookieBehavior(): CacheCookieBehavior? =
        unwrap(this).getCookieBehavior()?.let(CacheCookieBehavior::wrap)

    override fun defaultTtl(): Duration? = unwrap(this).getDefaultTtl()?.let(Duration::wrap)

    override fun enableAcceptEncodingBrotli(): Boolean? =
        unwrap(this).getEnableAcceptEncodingBrotli()

    override fun enableAcceptEncodingGzip(): Boolean? = unwrap(this).getEnableAcceptEncodingGzip()

    override fun headerBehavior(): CacheHeaderBehavior? =
        unwrap(this).getHeaderBehavior()?.let(CacheHeaderBehavior::wrap)

    override fun maxTtl(): Duration? = unwrap(this).getMaxTtl()?.let(Duration::wrap)

    override fun minTtl(): Duration? = unwrap(this).getMinTtl()?.let(Duration::wrap)

    override fun queryStringBehavior(): CacheQueryStringBehavior? =
        unwrap(this).getQueryStringBehavior()?.let(CacheQueryStringBehavior::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CachePolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CachePolicyProps):
        CachePolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CachePolicyProps):
        software.amazon.awscdk.services.cloudfront.CachePolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.CachePolicyProps
  }
}

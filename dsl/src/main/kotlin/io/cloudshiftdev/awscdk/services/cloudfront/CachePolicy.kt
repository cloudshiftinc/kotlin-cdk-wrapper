package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Resource
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CachePolicy internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cloudfront.CachePolicy,
) : Resource(cdkObject), ICachePolicy {
  public override fun cachePolicyId(): String = unwrap(this).getCachePolicyId()

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

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.CachePolicy.Builder =
        software.amazon.awscdk.services.cloudfront.CachePolicy.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.cloudfront.CachePolicy = cdkBuilder.build()
  }

  public companion object {
    public open fun fromCachePolicyId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      cachePolicyId: String,
    ): ICachePolicy =
        software.amazon.awscdk.services.cloudfront.CachePolicy.fromCachePolicyId(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, cachePolicyId).let(ICachePolicy::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CachePolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CachePolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CachePolicy):
        CachePolicy = CachePolicy(cdkObject)

    internal fun unwrap(wrapped: CachePolicy):
        software.amazon.awscdk.services.cloudfront.CachePolicy = wrapped.cdkObject
  }
}

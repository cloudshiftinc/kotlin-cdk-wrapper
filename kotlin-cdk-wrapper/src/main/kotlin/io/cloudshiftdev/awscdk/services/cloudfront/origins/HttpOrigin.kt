@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront.origins

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.cloudfront.OriginBase
import io.cloudshiftdev.awscdk.services.cloudfront.OriginProtocolPolicy
import io.cloudshiftdev.awscdk.services.cloudfront.OriginSslPolicy
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public open class HttpOrigin internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudfront.origins.HttpOrigin,
) : OriginBase(cdkObject) {
  @CdkDslMarker
  public interface Builder {
    public fun connectionAttempts(connectionAttempts: Number)

    public fun connectionTimeout(connectionTimeout: Duration)

    public fun customHeaders(customHeaders: Map<String, String>)

    public fun httpPort(httpPort: Number)

    public fun httpsPort(httpsPort: Number)

    public fun keepaliveTimeout(keepaliveTimeout: Duration)

    public fun originId(originId: String)

    public fun originPath(originPath: String)

    public fun originShieldEnabled(originShieldEnabled: Boolean)

    public fun originShieldRegion(originShieldRegion: String)

    public fun originSslProtocols(originSslProtocols: List<OriginSslPolicy>)

    public fun originSslProtocols(vararg originSslProtocols: OriginSslPolicy)

    public fun protocolPolicy(protocolPolicy: OriginProtocolPolicy)

    public fun readTimeout(readTimeout: Duration)
  }

  private class BuilderImpl(
    domainName: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.origins.HttpOrigin.Builder =
        software.amazon.awscdk.services.cloudfront.origins.HttpOrigin.Builder.create(domainName)

    override fun connectionAttempts(connectionAttempts: Number) {
      cdkBuilder.connectionAttempts(connectionAttempts)
    }

    override fun connectionTimeout(connectionTimeout: Duration) {
      cdkBuilder.connectionTimeout(connectionTimeout.let(Duration::unwrap))
    }

    override fun customHeaders(customHeaders: Map<String, String>) {
      cdkBuilder.customHeaders(customHeaders)
    }

    override fun httpPort(httpPort: Number) {
      cdkBuilder.httpPort(httpPort)
    }

    override fun httpsPort(httpsPort: Number) {
      cdkBuilder.httpsPort(httpsPort)
    }

    override fun keepaliveTimeout(keepaliveTimeout: Duration) {
      cdkBuilder.keepaliveTimeout(keepaliveTimeout.let(Duration::unwrap))
    }

    override fun originId(originId: String) {
      cdkBuilder.originId(originId)
    }

    override fun originPath(originPath: String) {
      cdkBuilder.originPath(originPath)
    }

    override fun originShieldEnabled(originShieldEnabled: Boolean) {
      cdkBuilder.originShieldEnabled(originShieldEnabled)
    }

    override fun originShieldRegion(originShieldRegion: String) {
      cdkBuilder.originShieldRegion(originShieldRegion)
    }

    override fun originSslProtocols(originSslProtocols: List<OriginSslPolicy>) {
      cdkBuilder.originSslProtocols(originSslProtocols.map(OriginSslPolicy::unwrap))
    }

    override fun originSslProtocols(vararg originSslProtocols: OriginSslPolicy): Unit =
        originSslProtocols(originSslProtocols.toList())

    override fun protocolPolicy(protocolPolicy: OriginProtocolPolicy) {
      cdkBuilder.protocolPolicy(protocolPolicy.let(OriginProtocolPolicy::unwrap))
    }

    override fun readTimeout(readTimeout: Duration) {
      cdkBuilder.readTimeout(readTimeout.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.origins.HttpOrigin =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(domainName: String, block: Builder.() -> Unit = {}): HttpOrigin {
      val builderImpl = BuilderImpl(domainName)
      return HttpOrigin(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.origins.HttpOrigin):
        HttpOrigin = HttpOrigin(cdkObject)

    internal fun unwrap(wrapped: HttpOrigin):
        software.amazon.awscdk.services.cloudfront.origins.HttpOrigin = wrapped.cdkObject
  }
}

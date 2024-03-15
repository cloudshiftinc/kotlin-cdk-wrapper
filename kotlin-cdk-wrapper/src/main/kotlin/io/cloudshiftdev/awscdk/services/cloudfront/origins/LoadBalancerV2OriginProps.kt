@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront.origins

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.cloudfront.OriginProtocolPolicy
import io.cloudshiftdev.awscdk.services.cloudfront.OriginSslPolicy
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface LoadBalancerV2OriginProps : HttpOriginProps {
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

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.origins.LoadBalancerV2OriginProps.Builder =
        software.amazon.awscdk.services.cloudfront.origins.LoadBalancerV2OriginProps.builder()

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

    public fun build(): software.amazon.awscdk.services.cloudfront.origins.LoadBalancerV2OriginProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.cloudfront.origins.LoadBalancerV2OriginProps,
  ) : CdkObject(cdkObject), LoadBalancerV2OriginProps {
    override fun connectionAttempts(): Number? = unwrap(this).getConnectionAttempts()

    override fun connectionTimeout(): Duration? =
        unwrap(this).getConnectionTimeout()?.let(Duration::wrap)

    override fun customHeaders(): Map<String, String> = unwrap(this).getCustomHeaders() ?:
        emptyMap()

    override fun httpPort(): Number? = unwrap(this).getHttpPort()

    override fun httpsPort(): Number? = unwrap(this).getHttpsPort()

    override fun keepaliveTimeout(): Duration? =
        unwrap(this).getKeepaliveTimeout()?.let(Duration::wrap)

    override fun originId(): String? = unwrap(this).getOriginId()

    override fun originPath(): String? = unwrap(this).getOriginPath()

    override fun originShieldEnabled(): Boolean? = unwrap(this).getOriginShieldEnabled()

    override fun originShieldRegion(): String? = unwrap(this).getOriginShieldRegion()

    override fun originSslProtocols(): List<OriginSslPolicy> =
        unwrap(this).getOriginSslProtocols()?.map(OriginSslPolicy::wrap) ?: emptyList()

    override fun protocolPolicy(): OriginProtocolPolicy? =
        unwrap(this).getProtocolPolicy()?.let(OriginProtocolPolicy::wrap)

    override fun readTimeout(): Duration? = unwrap(this).getReadTimeout()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LoadBalancerV2OriginProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.origins.LoadBalancerV2OriginProps):
        LoadBalancerV2OriginProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LoadBalancerV2OriginProps):
        software.amazon.awscdk.services.cloudfront.origins.LoadBalancerV2OriginProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cloudfront.origins.LoadBalancerV2OriginProps
  }
}

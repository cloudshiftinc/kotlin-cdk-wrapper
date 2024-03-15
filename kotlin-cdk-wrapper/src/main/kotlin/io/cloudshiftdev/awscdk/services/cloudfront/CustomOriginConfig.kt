@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface CustomOriginConfig {
  public fun allowedOriginSslVersions(): List<OriginSslPolicy> =
      unwrap(this).getAllowedOriginSSLVersions()?.map(OriginSslPolicy::wrap) ?: emptyList()

  public fun domainName(): String

  public fun httpPort(): Number? = unwrap(this).getHttpPort()

  public fun httpsPort(): Number? = unwrap(this).getHttpsPort()

  public fun originHeaders(): Map<String, String> = unwrap(this).getOriginHeaders() ?: emptyMap()

  public fun originKeepaliveTimeout(): Duration? =
      unwrap(this).getOriginKeepaliveTimeout()?.let(Duration::wrap)

  public fun originPath(): String? = unwrap(this).getOriginPath()

  public fun originProtocolPolicy(): OriginProtocolPolicy? =
      unwrap(this).getOriginProtocolPolicy()?.let(OriginProtocolPolicy::wrap)

  public fun originReadTimeout(): Duration? =
      unwrap(this).getOriginReadTimeout()?.let(Duration::wrap)

  public fun originShieldRegion(): String? = unwrap(this).getOriginShieldRegion()

  @CdkDslMarker
  public interface Builder {
    public fun allowedOriginSslVersions(allowedOriginSslVersions: List<OriginSslPolicy>)

    public fun allowedOriginSslVersions(vararg allowedOriginSslVersions: OriginSslPolicy)

    public fun domainName(domainName: String)

    public fun httpPort(httpPort: Number)

    public fun httpsPort(httpsPort: Number)

    public fun originHeaders(originHeaders: Map<String, String>)

    public fun originKeepaliveTimeout(originKeepaliveTimeout: Duration)

    public fun originPath(originPath: String)

    public fun originProtocolPolicy(originProtocolPolicy: OriginProtocolPolicy)

    public fun originReadTimeout(originReadTimeout: Duration)

    public fun originShieldRegion(originShieldRegion: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.CustomOriginConfig.Builder =
        software.amazon.awscdk.services.cloudfront.CustomOriginConfig.builder()

    override fun allowedOriginSslVersions(allowedOriginSslVersions: List<OriginSslPolicy>) {
      cdkBuilder.allowedOriginSslVersions(allowedOriginSslVersions.map(OriginSslPolicy::unwrap))
    }

    override fun allowedOriginSslVersions(vararg allowedOriginSslVersions: OriginSslPolicy): Unit =
        allowedOriginSslVersions(allowedOriginSslVersions.toList())

    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    override fun httpPort(httpPort: Number) {
      cdkBuilder.httpPort(httpPort)
    }

    override fun httpsPort(httpsPort: Number) {
      cdkBuilder.httpsPort(httpsPort)
    }

    override fun originHeaders(originHeaders: Map<String, String>) {
      cdkBuilder.originHeaders(originHeaders)
    }

    override fun originKeepaliveTimeout(originKeepaliveTimeout: Duration) {
      cdkBuilder.originKeepaliveTimeout(originKeepaliveTimeout.let(Duration::unwrap))
    }

    override fun originPath(originPath: String) {
      cdkBuilder.originPath(originPath)
    }

    override fun originProtocolPolicy(originProtocolPolicy: OriginProtocolPolicy) {
      cdkBuilder.originProtocolPolicy(originProtocolPolicy.let(OriginProtocolPolicy::unwrap))
    }

    override fun originReadTimeout(originReadTimeout: Duration) {
      cdkBuilder.originReadTimeout(originReadTimeout.let(Duration::unwrap))
    }

    override fun originShieldRegion(originShieldRegion: String) {
      cdkBuilder.originShieldRegion(originShieldRegion)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.CustomOriginConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.CustomOriginConfig,
  ) : CdkObject(cdkObject), CustomOriginConfig {
    override fun allowedOriginSslVersions(): List<OriginSslPolicy> =
        unwrap(this).getAllowedOriginSSLVersions()?.map(OriginSslPolicy::wrap) ?: emptyList()

    override fun domainName(): String = unwrap(this).getDomainName()

    override fun httpPort(): Number? = unwrap(this).getHttpPort()

    override fun httpsPort(): Number? = unwrap(this).getHttpsPort()

    override fun originHeaders(): Map<String, String> = unwrap(this).getOriginHeaders() ?:
        emptyMap()

    override fun originKeepaliveTimeout(): Duration? =
        unwrap(this).getOriginKeepaliveTimeout()?.let(Duration::wrap)

    override fun originPath(): String? = unwrap(this).getOriginPath()

    override fun originProtocolPolicy(): OriginProtocolPolicy? =
        unwrap(this).getOriginProtocolPolicy()?.let(OriginProtocolPolicy::wrap)

    override fun originReadTimeout(): Duration? =
        unwrap(this).getOriginReadTimeout()?.let(Duration::wrap)

    override fun originShieldRegion(): String? = unwrap(this).getOriginShieldRegion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CustomOriginConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CustomOriginConfig):
        CustomOriginConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CustomOriginConfig):
        software.amazon.awscdk.services.cloudfront.CustomOriginConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.CustomOriginConfig
  }
}

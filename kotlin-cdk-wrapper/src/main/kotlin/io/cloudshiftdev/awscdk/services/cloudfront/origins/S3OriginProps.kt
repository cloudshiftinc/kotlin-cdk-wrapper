@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront.origins

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.cloudfront.IOriginAccessIdentity
import io.cloudshiftdev.awscdk.services.cloudfront.OriginProps
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface S3OriginProps : OriginProps {
  public fun originAccessIdentity(): IOriginAccessIdentity? =
      unwrap(this).getOriginAccessIdentity()?.let(IOriginAccessIdentity::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun connectionAttempts(connectionAttempts: Number)

    public fun connectionTimeout(connectionTimeout: Duration)

    public fun customHeaders(customHeaders: Map<String, String>)

    public fun originAccessIdentity(originAccessIdentity: IOriginAccessIdentity)

    public fun originId(originId: String)

    public fun originPath(originPath: String)

    public fun originShieldEnabled(originShieldEnabled: Boolean)

    public fun originShieldRegion(originShieldRegion: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.origins.S3OriginProps.Builder
        = software.amazon.awscdk.services.cloudfront.origins.S3OriginProps.builder()

    override fun connectionAttempts(connectionAttempts: Number) {
      cdkBuilder.connectionAttempts(connectionAttempts)
    }

    override fun connectionTimeout(connectionTimeout: Duration) {
      cdkBuilder.connectionTimeout(connectionTimeout.let(Duration::unwrap))
    }

    override fun customHeaders(customHeaders: Map<String, String>) {
      cdkBuilder.customHeaders(customHeaders)
    }

    override fun originAccessIdentity(originAccessIdentity: IOriginAccessIdentity) {
      cdkBuilder.originAccessIdentity(originAccessIdentity.let(IOriginAccessIdentity::unwrap))
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

    public fun build(): software.amazon.awscdk.services.cloudfront.origins.S3OriginProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.origins.S3OriginProps,
  ) : CdkObject(cdkObject), S3OriginProps {
    override fun connectionAttempts(): Number? = unwrap(this).getConnectionAttempts()

    override fun connectionTimeout(): Duration? =
        unwrap(this).getConnectionTimeout()?.let(Duration::wrap)

    override fun customHeaders(): Map<String, String> = unwrap(this).getCustomHeaders() ?:
        emptyMap()

    override fun originAccessIdentity(): IOriginAccessIdentity? =
        unwrap(this).getOriginAccessIdentity()?.let(IOriginAccessIdentity::wrap)

    override fun originId(): String? = unwrap(this).getOriginId()

    override fun originPath(): String? = unwrap(this).getOriginPath()

    override fun originShieldEnabled(): Boolean? = unwrap(this).getOriginShieldEnabled()

    override fun originShieldRegion(): String? = unwrap(this).getOriginShieldRegion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): S3OriginProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.origins.S3OriginProps):
        S3OriginProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: S3OriginProps):
        software.amazon.awscdk.services.cloudfront.origins.S3OriginProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.origins.S3OriginProps
  }
}

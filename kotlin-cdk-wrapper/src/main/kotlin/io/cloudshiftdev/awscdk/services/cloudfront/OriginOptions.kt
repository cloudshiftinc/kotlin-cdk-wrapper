@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface OriginOptions {
  public fun connectionAttempts(): Number? = unwrap(this).getConnectionAttempts()

  public fun connectionTimeout(): Duration? =
      unwrap(this).getConnectionTimeout()?.let(Duration::wrap)

  public fun customHeaders(): Map<String, String> = unwrap(this).getCustomHeaders() ?: emptyMap()

  public fun originId(): String? = unwrap(this).getOriginId()

  public fun originShieldEnabled(): Boolean? = unwrap(this).getOriginShieldEnabled()

  public fun originShieldRegion(): String? = unwrap(this).getOriginShieldRegion()

  @CdkDslMarker
  public interface Builder {
    public fun connectionAttempts(connectionAttempts: Number)

    public fun connectionTimeout(connectionTimeout: Duration)

    public fun customHeaders(customHeaders: Map<String, String>)

    public fun originId(originId: String)

    public fun originShieldEnabled(originShieldEnabled: Boolean)

    public fun originShieldRegion(originShieldRegion: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.OriginOptions.Builder =
        software.amazon.awscdk.services.cloudfront.OriginOptions.builder()

    override fun connectionAttempts(connectionAttempts: Number) {
      cdkBuilder.connectionAttempts(connectionAttempts)
    }

    override fun connectionTimeout(connectionTimeout: Duration) {
      cdkBuilder.connectionTimeout(connectionTimeout.let(Duration::unwrap))
    }

    override fun customHeaders(customHeaders: Map<String, String>) {
      cdkBuilder.customHeaders(customHeaders)
    }

    override fun originId(originId: String) {
      cdkBuilder.originId(originId)
    }

    override fun originShieldEnabled(originShieldEnabled: Boolean) {
      cdkBuilder.originShieldEnabled(originShieldEnabled)
    }

    override fun originShieldRegion(originShieldRegion: String) {
      cdkBuilder.originShieldRegion(originShieldRegion)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.OriginOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.OriginOptions,
  ) : CdkObject(cdkObject), OriginOptions {
    override fun connectionAttempts(): Number? = unwrap(this).getConnectionAttempts()

    override fun connectionTimeout(): Duration? =
        unwrap(this).getConnectionTimeout()?.let(Duration::wrap)

    override fun customHeaders(): Map<String, String> = unwrap(this).getCustomHeaders() ?:
        emptyMap()

    override fun originId(): String? = unwrap(this).getOriginId()

    override fun originShieldEnabled(): Boolean? = unwrap(this).getOriginShieldEnabled()

    override fun originShieldRegion(): String? = unwrap(this).getOriginShieldRegion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): OriginOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.OriginOptions):
        OriginOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: OriginOptions):
        software.amazon.awscdk.services.cloudfront.OriginOptions = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.cloudfront.OriginOptions
  }
}

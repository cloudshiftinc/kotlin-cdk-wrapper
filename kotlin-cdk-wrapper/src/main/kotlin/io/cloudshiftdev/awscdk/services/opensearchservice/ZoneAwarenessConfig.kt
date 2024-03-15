@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.opensearchservice

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Number
import kotlin.Unit

public interface ZoneAwarenessConfig {
  public fun availabilityZoneCount(): Number? = unwrap(this).getAvailabilityZoneCount()

  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  @CdkDslMarker
  public interface Builder {
    public fun availabilityZoneCount(availabilityZoneCount: Number)

    public fun enabled(enabled: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.opensearchservice.ZoneAwarenessConfig.Builder =
        software.amazon.awscdk.services.opensearchservice.ZoneAwarenessConfig.builder()

    override fun availabilityZoneCount(availabilityZoneCount: Number) {
      cdkBuilder.availabilityZoneCount(availabilityZoneCount)
    }

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    public fun build(): software.amazon.awscdk.services.opensearchservice.ZoneAwarenessConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.opensearchservice.ZoneAwarenessConfig,
  ) : CdkObject(cdkObject), ZoneAwarenessConfig {
    override fun availabilityZoneCount(): Number? = unwrap(this).getAvailabilityZoneCount()

    override fun enabled(): Boolean? = unwrap(this).getEnabled()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ZoneAwarenessConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.ZoneAwarenessConfig):
        ZoneAwarenessConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ZoneAwarenessConfig):
        software.amazon.awscdk.services.opensearchservice.ZoneAwarenessConfig = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.opensearchservice.ZoneAwarenessConfig
  }
}

package io.cloudshiftdev.awscdk.services.opensearchservice

import kotlin.Boolean
import kotlin.Number
import kotlin.Unit

public interface ZoneAwarenessConfig {
  public fun availabilityZoneCount(): Number? = unwrap(this).getAvailabilityZoneCount()

  public fun enabled(): Boolean? = unwrap(this).getEnabled()

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

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.opensearchservice.ZoneAwarenessConfig,
  ) : ZoneAwarenessConfig {
    override fun availabilityZoneCount(): Number? = unwrap(this).getAvailabilityZoneCount()

    override fun enabled(): Boolean? = unwrap(this).getEnabled()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ZoneAwarenessConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.ZoneAwarenessConfig):
        ZoneAwarenessConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ZoneAwarenessConfig):
        software.amazon.awscdk.services.opensearchservice.ZoneAwarenessConfig = (wrapped as
        Wrapper).cdkObject
  }
}

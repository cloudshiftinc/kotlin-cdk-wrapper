@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticsearch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.Unit

public interface ZoneAwarenessConfig {
  @Deprecated(message = "deprecated in CDK")
  public fun availabilityZoneCount(): Number? = unwrap(this).getAvailabilityZoneCount()

  @Deprecated(message = "deprecated in CDK")
  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  @CdkDslMarker
  @Deprecated(message = "deprecated in CDK")
  public interface Builder {
    @Deprecated(message = "deprecated in CDK")
    public fun availabilityZoneCount(availabilityZoneCount: Number)

    @Deprecated(message = "deprecated in CDK")
    public fun enabled(enabled: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticsearch.ZoneAwarenessConfig.Builder =
        software.amazon.awscdk.services.elasticsearch.ZoneAwarenessConfig.builder()

    @Deprecated(message = "deprecated in CDK")
    override fun availabilityZoneCount(availabilityZoneCount: Number) {
      cdkBuilder.availabilityZoneCount(availabilityZoneCount)
    }

    @Deprecated(message = "deprecated in CDK")
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    public fun build(): software.amazon.awscdk.services.elasticsearch.ZoneAwarenessConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.elasticsearch.ZoneAwarenessConfig,
  ) : CdkObject(cdkObject), ZoneAwarenessConfig {
    @Deprecated(message = "deprecated in CDK")
    override fun availabilityZoneCount(): Number? = unwrap(this).getAvailabilityZoneCount()

    @Deprecated(message = "deprecated in CDK")
    override fun enabled(): Boolean? = unwrap(this).getEnabled()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ZoneAwarenessConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.elasticsearch.ZoneAwarenessConfig):
        ZoneAwarenessConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ZoneAwarenessConfig):
        software.amazon.awscdk.services.elasticsearch.ZoneAwarenessConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.elasticsearch.ZoneAwarenessConfig
  }
}

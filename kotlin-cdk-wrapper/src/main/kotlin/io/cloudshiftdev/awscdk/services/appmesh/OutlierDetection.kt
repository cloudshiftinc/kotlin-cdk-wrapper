@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.Unit

public interface OutlierDetection {
  public fun baseEjectionDuration(): Duration

  public fun interval(): Duration

  public fun maxEjectionPercent(): Number

  public fun maxServerErrors(): Number

  @CdkDslMarker
  public interface Builder {
    public fun baseEjectionDuration(baseEjectionDuration: Duration)

    public fun interval(interval: Duration)

    public fun maxEjectionPercent(maxEjectionPercent: Number)

    public fun maxServerErrors(maxServerErrors: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.OutlierDetection.Builder =
        software.amazon.awscdk.services.appmesh.OutlierDetection.builder()

    override fun baseEjectionDuration(baseEjectionDuration: Duration) {
      cdkBuilder.baseEjectionDuration(baseEjectionDuration.let(Duration::unwrap))
    }

    override fun interval(interval: Duration) {
      cdkBuilder.interval(interval.let(Duration::unwrap))
    }

    override fun maxEjectionPercent(maxEjectionPercent: Number) {
      cdkBuilder.maxEjectionPercent(maxEjectionPercent)
    }

    override fun maxServerErrors(maxServerErrors: Number) {
      cdkBuilder.maxServerErrors(maxServerErrors)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.OutlierDetection =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.OutlierDetection,
  ) : CdkObject(cdkObject), OutlierDetection {
    override fun baseEjectionDuration(): Duration =
        unwrap(this).getBaseEjectionDuration().let(Duration::wrap)

    override fun interval(): Duration = unwrap(this).getInterval().let(Duration::wrap)

    override fun maxEjectionPercent(): Number = unwrap(this).getMaxEjectionPercent()

    override fun maxServerErrors(): Number = unwrap(this).getMaxServerErrors()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): OutlierDetection {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.OutlierDetection):
        OutlierDetection = Wrapper(cdkObject)

    internal fun unwrap(wrapped: OutlierDetection):
        software.amazon.awscdk.services.appmesh.OutlierDetection = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.appmesh.OutlierDetection
  }
}

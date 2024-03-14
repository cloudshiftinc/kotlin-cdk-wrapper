package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.Duration
import kotlin.Number
import kotlin.Unit

public interface OutlierDetection {
  public fun baseEjectionDuration(): Duration

  public fun interval(): Duration

  public fun maxEjectionPercent(): Number

  public fun maxServerErrors(): Number

  public interface Builder {
    public fun baseEjectionDuration(baseEjectionDuration: Duration) {
    }

    public fun interval(interval: Duration) {
    }

    public fun maxEjectionPercent(maxEjectionPercent: Number) {
    }

    public fun maxServerErrors(maxServerErrors: Number) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.OutlierDetection.Builder =
        software.amazon.awscdk.services.appmesh.OutlierDetection.builder()

    public override fun baseEjectionDuration(baseEjectionDuration: Duration) {
      cdkBuilder.baseEjectionDuration(baseEjectionDuration.let(Duration::unwrap))
    }

    public override fun interval(interval: Duration) {
      cdkBuilder.interval(interval.let(Duration::unwrap))
    }

    public override fun maxEjectionPercent(maxEjectionPercent: Number) {
      cdkBuilder.maxEjectionPercent(maxEjectionPercent)
    }

    public override fun maxServerErrors(maxServerErrors: Number) {
      cdkBuilder.maxServerErrors(maxServerErrors)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.OutlierDetection =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.OutlierDetection,
  ) : OutlierDetection {
    public override fun baseEjectionDuration(): Duration =
        unwrap(this).getBaseEjectionDuration().let(Duration::wrap)

    public override fun interval(): Duration = unwrap(this).getInterval().let(Duration::wrap)

    public override fun maxEjectionPercent(): Number = unwrap(this).getMaxEjectionPercent()

    public override fun maxServerErrors(): Number = unwrap(this).getMaxServerErrors()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): OutlierDetection {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.OutlierDetection):
        OutlierDetection = Wrapper(cdkObject)

    internal fun unwrap(wrapped: OutlierDetection):
        software.amazon.awscdk.services.appmesh.OutlierDetection = (wrapped as Wrapper).cdkObject
  }
}

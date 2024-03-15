@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit

public interface Ec2HealthCheckOptions {
  public fun grace(): Duration? = unwrap(this).getGrace()?.let(Duration::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun grace(grace: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscaling.Ec2HealthCheckOptions.Builder =
        software.amazon.awscdk.services.autoscaling.Ec2HealthCheckOptions.builder()

    override fun grace(grace: Duration) {
      cdkBuilder.grace(grace.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.Ec2HealthCheckOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.autoscaling.Ec2HealthCheckOptions,
  ) : CdkObject(cdkObject), Ec2HealthCheckOptions {
    override fun grace(): Duration? = unwrap(this).getGrace()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Ec2HealthCheckOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.Ec2HealthCheckOptions):
        Ec2HealthCheckOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: Ec2HealthCheckOptions):
        software.amazon.awscdk.services.autoscaling.Ec2HealthCheckOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.autoscaling.Ec2HealthCheckOptions
  }
}

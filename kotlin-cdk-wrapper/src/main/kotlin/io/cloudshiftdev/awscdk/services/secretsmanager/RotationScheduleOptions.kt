@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import kotlin.Boolean
import kotlin.Unit

public interface RotationScheduleOptions {
  public fun automaticallyAfter(): Duration? =
      unwrap(this).getAutomaticallyAfter()?.let(Duration::wrap)

  public fun hostedRotation(): HostedRotation? =
      unwrap(this).getHostedRotation()?.let(HostedRotation::wrap)

  public fun rotateImmediatelyOnUpdate(): Boolean? = unwrap(this).getRotateImmediatelyOnUpdate()

  public fun rotationLambda(): IFunction? = unwrap(this).getRotationLambda()?.let(IFunction::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun automaticallyAfter(automaticallyAfter: Duration)

    public fun hostedRotation(hostedRotation: HostedRotation)

    public fun rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate: Boolean)

    public fun rotationLambda(rotationLambda: IFunction)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.secretsmanager.RotationScheduleOptions.Builder =
        software.amazon.awscdk.services.secretsmanager.RotationScheduleOptions.builder()

    override fun automaticallyAfter(automaticallyAfter: Duration) {
      cdkBuilder.automaticallyAfter(automaticallyAfter.let(Duration::unwrap))
    }

    override fun hostedRotation(hostedRotation: HostedRotation) {
      cdkBuilder.hostedRotation(hostedRotation.let(HostedRotation::unwrap))
    }

    override fun rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate: Boolean) {
      cdkBuilder.rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate)
    }

    override fun rotationLambda(rotationLambda: IFunction) {
      cdkBuilder.rotationLambda(rotationLambda.let(IFunction::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.secretsmanager.RotationScheduleOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.secretsmanager.RotationScheduleOptions,
  ) : CdkObject(cdkObject), RotationScheduleOptions {
    override fun automaticallyAfter(): Duration? =
        unwrap(this).getAutomaticallyAfter()?.let(Duration::wrap)

    override fun hostedRotation(): HostedRotation? =
        unwrap(this).getHostedRotation()?.let(HostedRotation::wrap)

    override fun rotateImmediatelyOnUpdate(): Boolean? = unwrap(this).getRotateImmediatelyOnUpdate()

    override fun rotationLambda(): IFunction? =
        unwrap(this).getRotationLambda()?.let(IFunction::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RotationScheduleOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.RotationScheduleOptions):
        RotationScheduleOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RotationScheduleOptions):
        software.amazon.awscdk.services.secretsmanager.RotationScheduleOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.secretsmanager.RotationScheduleOptions
  }
}

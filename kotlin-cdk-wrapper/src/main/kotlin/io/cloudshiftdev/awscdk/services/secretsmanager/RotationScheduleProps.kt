@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import kotlin.Boolean
import kotlin.Unit

public interface RotationScheduleProps : RotationScheduleOptions {
  public fun secret(): ISecret

  @CdkDslMarker
  public interface Builder {
    public fun automaticallyAfter(automaticallyAfter: Duration)

    public fun hostedRotation(hostedRotation: HostedRotation)

    public fun rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate: Boolean)

    public fun rotationLambda(rotationLambda: IFunction)

    public fun secret(secret: ISecret)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.secretsmanager.RotationScheduleProps.Builder =
        software.amazon.awscdk.services.secretsmanager.RotationScheduleProps.builder()

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

    override fun secret(secret: ISecret) {
      cdkBuilder.secret(secret.let(ISecret::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.secretsmanager.RotationScheduleProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.secretsmanager.RotationScheduleProps,
  ) : CdkObject(cdkObject), RotationScheduleProps {
    override fun automaticallyAfter(): Duration? =
        unwrap(this).getAutomaticallyAfter()?.let(Duration::wrap)

    override fun hostedRotation(): HostedRotation? =
        unwrap(this).getHostedRotation()?.let(HostedRotation::wrap)

    override fun rotateImmediatelyOnUpdate(): Boolean? = unwrap(this).getRotateImmediatelyOnUpdate()

    override fun rotationLambda(): IFunction? =
        unwrap(this).getRotationLambda()?.let(IFunction::wrap)

    override fun secret(): ISecret = unwrap(this).getSecret().let(ISecret::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RotationScheduleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.RotationScheduleProps):
        RotationScheduleProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RotationScheduleProps):
        software.amazon.awscdk.services.secretsmanager.RotationScheduleProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.secretsmanager.RotationScheduleProps
  }
}

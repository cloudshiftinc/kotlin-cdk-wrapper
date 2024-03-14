package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class RotationSchedule internal constructor(
  private val cdkObject: software.amazon.awscdk.services.secretsmanager.RotationSchedule,
) : Resource(cdkObject) {
  public interface Builder {
    public fun automaticallyAfter(automaticallyAfter: Duration)

    public fun hostedRotation(hostedRotation: HostedRotation)

    public fun rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate: Boolean)

    public fun rotationLambda(rotationLambda: IFunction)

    public fun secret(secret: ISecret)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.secretsmanager.RotationSchedule.Builder
        = software.amazon.awscdk.services.secretsmanager.RotationSchedule.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.secretsmanager.RotationSchedule =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): RotationSchedule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return RotationSchedule(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.RotationSchedule):
        RotationSchedule = RotationSchedule(cdkObject)

    internal fun unwrap(wrapped: RotationSchedule):
        software.amazon.awscdk.services.secretsmanager.RotationSchedule = wrapped.cdkObject
  }
}

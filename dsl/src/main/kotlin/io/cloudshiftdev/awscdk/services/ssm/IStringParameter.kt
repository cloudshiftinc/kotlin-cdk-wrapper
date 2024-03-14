package io.cloudshiftdev.awscdk.services.ssm

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IStringParameter : IParameter {
  public fun stringValue(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ssm.IStringParameter,
  ) : IStringParameter {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun grantRead(arg0: IGrantable): Grant =
        unwrap(this).grantRead(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun grantWrite(arg0: IGrantable): Grant =
        unwrap(this).grantWrite(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun parameterArn(): String = unwrap(this).getParameterArn()

    override fun parameterName(): String = unwrap(this).getParameterName()

    override fun parameterType(): String = unwrap(this).getParameterType()

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    override fun stringValue(): String = unwrap(this).getStringValue()
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssm.IStringParameter):
        IStringParameter = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IStringParameter):
        software.amazon.awscdk.services.ssm.IStringParameter = (wrapped as Wrapper).cdkObject
  }
}

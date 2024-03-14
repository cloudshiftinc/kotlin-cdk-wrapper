package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IFunctionUrl : IResource {
  public fun functionArn(): String

  public fun grantInvokeUrl(arg0: IGrantable): Grant

  public fun url(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.lambda.IFunctionUrl,
  ) : IFunctionUrl {
    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun functionArn(): String = unwrap(this).getFunctionArn()

    public override fun grantInvokeUrl(arg0: IGrantable): Grant =
        unwrap(this).grantInvokeUrl(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    public override fun url(): String = unwrap(this).getUrl()
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.IFunctionUrl): IFunctionUrl
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IFunctionUrl): software.amazon.awscdk.services.lambda.IFunctionUrl
        = (wrapped as Wrapper).cdkObject
  }
}

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IDatabaseProxy : IResource {
  public fun dbProxyArn(): String

  public fun dbProxyName(): String

  public fun endpoint(): String

  public fun grantConnect(arg0: IGrantable): Grant

  public fun grantConnect(arg0: IGrantable, arg1: String): Grant

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.rds.IDatabaseProxy,
  ) : IDatabaseProxy {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun dbProxyArn(): String = unwrap(this).getDbProxyArn()

    override fun dbProxyName(): String = unwrap(this).getDbProxyName()

    override fun endpoint(): String = unwrap(this).getEndpoint()

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun grantConnect(arg0: IGrantable): Grant =
        unwrap(this).grantConnect(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun grantConnect(arg0: IGrantable, arg1: String): Grant =
        unwrap(this).grantConnect(arg0.let(IGrantable::unwrap), arg1).let(Grant::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.IDatabaseProxy): IDatabaseProxy
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IDatabaseProxy): software.amazon.awscdk.services.rds.IDatabaseProxy
        = (wrapped as Wrapper).cdkObject
  }
}

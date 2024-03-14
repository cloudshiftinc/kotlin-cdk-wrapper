package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IReportGroup : IResource {
  public fun grantWrite(arg0: IGrantable): Grant

  public fun reportGroupArn(): String

  public fun reportGroupName(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.codebuild.IReportGroup,
  ) : IReportGroup {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun grantWrite(arg0: IGrantable): Grant =
        unwrap(this).grantWrite(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun reportGroupArn(): String = unwrap(this).getReportGroupArn()

    override fun reportGroupName(): String = unwrap(this).getReportGroupName()

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.IReportGroup):
        IReportGroup = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IReportGroup):
        software.amazon.awscdk.services.codebuild.IReportGroup = (wrapped as Wrapper).cdkObject
  }
}

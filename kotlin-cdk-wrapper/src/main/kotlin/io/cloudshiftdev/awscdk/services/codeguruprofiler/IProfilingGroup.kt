@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codeguruprofiler

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IProfilingGroup : IResource {
  public fun grantPublish(arg0: IGrantable): Grant

  public fun grantRead(arg0: IGrantable): Grant

  public fun profilingGroupArn(): String

  public fun profilingGroupName(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codeguruprofiler.IProfilingGroup,
  ) : CdkObject(cdkObject), IProfilingGroup {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun grantPublish(arg0: IGrantable): Grant =
        unwrap(this).grantPublish(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun grantRead(arg0: IGrantable): Grant =
        unwrap(this).grantRead(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun profilingGroupArn(): String = unwrap(this).getProfilingGroupArn()

    override fun profilingGroupName(): String = unwrap(this).getProfilingGroupName()

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codeguruprofiler.IProfilingGroup):
        IProfilingGroup = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IProfilingGroup):
        software.amazon.awscdk.services.codeguruprofiler.IProfilingGroup = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codeguruprofiler.IProfilingGroup
  }
}

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IActivity : IResource {
  public fun activityArn(): String

  public fun activityName(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.stepfunctions.IActivity,
  ) : IActivity {
    public override fun activityArn(): String = unwrap(this).getActivityArn()

    public override fun activityName(): String = unwrap(this).getActivityName()

    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.IActivity): IActivity
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IActivity): software.amazon.awscdk.services.stepfunctions.IActivity
        = (wrapped as Wrapper).cdkObject
  }
}

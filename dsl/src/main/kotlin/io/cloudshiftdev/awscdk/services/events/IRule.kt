package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IRule : IResource {
  public fun ruleArn(): String

  public fun ruleName(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.events.IRule,
  ) : IRule {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun ruleArn(): String = unwrap(this).getRuleArn()

    override fun ruleName(): String = unwrap(this).getRuleName()

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.IRule): IRule =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IRule): software.amazon.awscdk.services.events.IRule = (wrapped as
        Wrapper).cdkObject
  }
}

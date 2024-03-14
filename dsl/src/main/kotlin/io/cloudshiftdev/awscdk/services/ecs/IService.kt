package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IService : IResource {
  public fun serviceArn(): String

  public fun serviceName(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.IService,
  ) : IService {
    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun serviceArn(): String = unwrap(this).getServiceArn()

    public override fun serviceName(): String = unwrap(this).getServiceName()

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.IService): IService =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IService): software.amazon.awscdk.services.ecs.IService = (wrapped
        as Wrapper).cdkObject
  }
}

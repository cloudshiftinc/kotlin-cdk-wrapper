package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IBaseService : IService {
  public fun cluster(): ICluster

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.IBaseService,
  ) : IBaseService {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun cluster(): ICluster = unwrap(this).getCluster().let(ICluster::wrap)

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun serviceArn(): String = unwrap(this).getServiceArn()

    override fun serviceName(): String = unwrap(this).getServiceName()

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.IBaseService): IBaseService =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IBaseService): software.amazon.awscdk.services.ecs.IBaseService =
        (wrapped as Wrapper).cdkObject
  }
}

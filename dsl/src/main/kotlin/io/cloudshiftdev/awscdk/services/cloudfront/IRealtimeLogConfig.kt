package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IRealtimeLogConfig : IResource {
  public fun realtimeLogConfigArn(): String

  public fun realtimeLogConfigName(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cloudfront.IRealtimeLogConfig,
  ) : IRealtimeLogConfig {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun realtimeLogConfigArn(): String = unwrap(this).getRealtimeLogConfigArn()

    override fun realtimeLogConfigName(): String = unwrap(this).getRealtimeLogConfigName()

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.IRealtimeLogConfig):
        IRealtimeLogConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IRealtimeLogConfig):
        software.amazon.awscdk.services.cloudfront.IRealtimeLogConfig = (wrapped as
        Wrapper).cdkObject
  }
}

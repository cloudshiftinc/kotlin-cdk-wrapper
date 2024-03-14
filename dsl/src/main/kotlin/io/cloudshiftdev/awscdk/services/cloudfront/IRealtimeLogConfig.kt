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
    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun realtimeLogConfigArn(): String = unwrap(this).getRealtimeLogConfigArn()

    public override fun realtimeLogConfigName(): String = unwrap(this).getRealtimeLogConfigName()

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
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

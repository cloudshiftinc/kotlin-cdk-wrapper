package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface ILogStream : IResource {
  public fun logStreamName(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.logs.ILogStream,
  ) : ILogStream {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun logStreamName(): String = unwrap(this).getLogStreamName()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.ILogStream): ILogStream =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ILogStream): software.amazon.awscdk.services.logs.ILogStream =
        (wrapped as Wrapper).cdkObject
  }
}

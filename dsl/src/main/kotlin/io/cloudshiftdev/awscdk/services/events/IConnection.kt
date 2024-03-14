package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IConnection : IResource {
  public fun connectionArn(): String

  public fun connectionName(): String

  public fun connectionSecretArn(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.events.IConnection,
  ) : IConnection {
    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun connectionArn(): String = unwrap(this).getConnectionArn()

    public override fun connectionName(): String = unwrap(this).getConnectionName()

    public override fun connectionSecretArn(): String = unwrap(this).getConnectionSecretArn()

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.IConnection): IConnection =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IConnection): software.amazon.awscdk.services.events.IConnection =
        (wrapped as Wrapper).cdkObject
  }
}

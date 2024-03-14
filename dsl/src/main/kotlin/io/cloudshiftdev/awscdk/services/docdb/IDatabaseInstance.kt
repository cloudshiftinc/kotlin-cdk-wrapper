package io.cloudshiftdev.awscdk.services.docdb

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IDatabaseInstance : IResource {
  public fun dbInstanceEndpointAddress(): String

  public fun dbInstanceEndpointPort(): String

  public fun instanceArn(): String

  public fun instanceEndpoint(): Endpoint

  public fun instanceIdentifier(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.docdb.IDatabaseInstance,
  ) : IDatabaseInstance {
    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun dbInstanceEndpointAddress(): String =
        unwrap(this).getDbInstanceEndpointAddress()

    public override fun dbInstanceEndpointPort(): String = unwrap(this).getDbInstanceEndpointPort()

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun instanceArn(): String = unwrap(this).getInstanceArn()

    public override fun instanceEndpoint(): Endpoint =
        unwrap(this).getInstanceEndpoint().let(Endpoint::wrap)

    public override fun instanceIdentifier(): String = unwrap(this).getInstanceIdentifier()

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.docdb.IDatabaseInstance):
        IDatabaseInstance = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IDatabaseInstance):
        software.amazon.awscdk.services.docdb.IDatabaseInstance = (wrapped as Wrapper).cdkObject
  }
}

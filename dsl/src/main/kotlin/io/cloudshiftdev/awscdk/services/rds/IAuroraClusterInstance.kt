package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.Number
import kotlin.String

public interface IAuroraClusterInstance : IResource {
  public fun dbInstanceArn(): String

  public fun dbInstanceEndpointAddress(): String

  public fun dbiResourceId(): String

  public fun instanceIdentifier(): String

  public fun instanceSize(): String? = unwrap(this).getInstanceSize()

  public fun tier(): Number

  public fun type(): InstanceType

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.rds.IAuroraClusterInstance,
  ) : IAuroraClusterInstance {
    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun dbInstanceArn(): String = unwrap(this).getDbInstanceArn()

    public override fun dbInstanceEndpointAddress(): String =
        unwrap(this).getDbInstanceEndpointAddress()

    public override fun dbiResourceId(): String = unwrap(this).getDbiResourceId()

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun instanceIdentifier(): String = unwrap(this).getInstanceIdentifier()

    public override fun instanceSize(): String? = unwrap(this).getInstanceSize()

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    public override fun tier(): Number = unwrap(this).getTier()

    public override fun type(): InstanceType = unwrap(this).getType().let(InstanceType::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.IAuroraClusterInstance):
        IAuroraClusterInstance = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IAuroraClusterInstance):
        software.amazon.awscdk.services.rds.IAuroraClusterInstance = (wrapped as Wrapper).cdkObject
  }
}

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IKeyValueStore : IResource {
  public fun keyValueStoreArn(): String

  public fun keyValueStoreId(): String

  public fun keyValueStoreStatus(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cloudfront.IKeyValueStore,
  ) : IKeyValueStore {
    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun keyValueStoreArn(): String = unwrap(this).getKeyValueStoreArn()

    public override fun keyValueStoreId(): String = unwrap(this).getKeyValueStoreId()

    public override fun keyValueStoreStatus(): String = unwrap(this).getKeyValueStoreStatus()

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.IKeyValueStore):
        IKeyValueStore = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IKeyValueStore):
        software.amazon.awscdk.services.cloudfront.IKeyValueStore = (wrapped as Wrapper).cdkObject
  }
}

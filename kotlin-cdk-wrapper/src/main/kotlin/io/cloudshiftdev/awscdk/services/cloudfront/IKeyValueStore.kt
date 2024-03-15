@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IKeyValueStore : IResource {
  public fun keyValueStoreArn(): String

  public fun keyValueStoreId(): String

  public fun keyValueStoreStatus(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.IKeyValueStore,
  ) : CdkObject(cdkObject), IKeyValueStore {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun keyValueStoreArn(): String = unwrap(this).getKeyValueStoreArn()

    override fun keyValueStoreId(): String = unwrap(this).getKeyValueStoreId()

    override fun keyValueStoreStatus(): String = unwrap(this).getKeyValueStoreStatus()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.IKeyValueStore):
        IKeyValueStore = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IKeyValueStore):
        software.amazon.awscdk.services.cloudfront.IKeyValueStore = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.cloudfront.IKeyValueStore
  }
}

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.s3.IBucket
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.collections.List

public interface IProduct : IResource {
  public fun assetBuckets(): List<IBucket>

  public fun associateTagOptions(arg0: TagOptions)

  public fun productArn(): String

  public fun productId(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.servicecatalog.IProduct,
  ) : IProduct {
    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun assetBuckets(): List<IBucket> =
        unwrap(this).getAssetBuckets().map(IBucket::wrap)

    public override fun associateTagOptions(arg0: TagOptions) {
      unwrap(this).associateTagOptions(arg0.let(TagOptions::unwrap))
    }

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun productArn(): String = unwrap(this).getProductArn()

    public override fun productId(): String = unwrap(this).getProductId()

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.IProduct): IProduct
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IProduct): software.amazon.awscdk.services.servicecatalog.IProduct
        = (wrapped as Wrapper).cdkObject
  }
}

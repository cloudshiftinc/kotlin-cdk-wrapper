@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.s3.IBucket
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.collections.List

public interface IProduct : IResource {
  public fun assetBuckets(): List<IBucket>

  public fun associateTagOptions(arg0: TagOptions)

  public fun productArn(): String

  public fun productId(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.servicecatalog.IProduct,
  ) : CdkObject(cdkObject), IProduct {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun assetBuckets(): List<IBucket> = unwrap(this).getAssetBuckets().map(IBucket::wrap)

    override fun associateTagOptions(arg0: TagOptions) {
      unwrap(this).associateTagOptions(arg0.let(TagOptions::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun productArn(): String = unwrap(this).getProductArn()

    override fun productId(): String = unwrap(this).getProductId()

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.IProduct): IProduct
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IProduct): software.amazon.awscdk.services.servicecatalog.IProduct
        = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.servicecatalog.IProduct
  }
}

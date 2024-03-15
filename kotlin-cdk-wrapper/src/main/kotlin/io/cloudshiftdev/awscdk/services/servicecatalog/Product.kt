@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.s3.IBucket
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.collections.List

public abstract class Product internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.servicecatalog.Product,
) : Resource(cdkObject), IProduct {
  public override fun assetBuckets(): List<IBucket> =
      unwrap(this).getAssetBuckets().map(IBucket::wrap)

  public override fun associateTagOptions(tagOptions: TagOptions) {
    unwrap(this).associateTagOptions(tagOptions.let(TagOptions::unwrap))
  }

  public override fun productArn(): String = unwrap(this).getProductArn()

  public override fun productId(): String = unwrap(this).getProductId()

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.servicecatalog.Product,
  ) : Product(cdkObject)

  public companion object {
    public fun fromProductArn(
      scope: Construct,
      id: String,
      productArn: String,
    ): IProduct =
        software.amazon.awscdk.services.servicecatalog.Product.fromProductArn(scope.let(Construct::unwrap),
        id, productArn).let(IProduct::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.Product): Product =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Product): software.amazon.awscdk.services.servicecatalog.Product =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.servicecatalog.Product
  }
}

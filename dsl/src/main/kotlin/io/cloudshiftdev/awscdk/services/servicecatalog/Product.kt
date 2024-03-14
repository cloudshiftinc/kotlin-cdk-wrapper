package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.s3.IBucket
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.collections.List

public abstract class Product internal constructor(
  private val cdkObject: software.amazon.awscdk.services.servicecatalog.Product,
) : Resource(cdkObject), IProduct {
  /**
   * The asset buckets of a product created via product stack.
   */
  public override fun assetBuckets(): List<IBucket> =
      unwrap(this).getAssetBuckets().map(IBucket::wrap)

  /**
   * Associate Tag Options.
   *
   * A TagOption is a key-value pair managed in AWS Service Catalog.
   * It is not an AWS tag, but serves as a template for creating an AWS tag based on the TagOption.
   *
   * @param tagOptions 
   */
  public override fun associateTagOptions(tagOptions: TagOptions) {
    unwrap(this).associateTagOptions(tagOptions.let(TagOptions::unwrap))
  }

  /**
   * The ARN of the product.
   */
  public override fun productArn(): String = unwrap(this).getProductArn()

  /**
   * The id of the product.
   */
  public override fun productId(): String = unwrap(this).getProductId()

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.servicecatalog.Product,
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
        (wrapped as Wrapper).cdkObject
  }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.String
import kotlin.collections.List

/**
 * A Service Catalog product, currently only supports type CloudFormationProduct.
 */
public interface IProduct : IResource {
  /**
   * The asset buckets of a product created via product stack.
   */
  public fun assetBuckets(): List<IBucket>

  /**
   * Associate Tag Options.
   *
   * A TagOption is a key-value pair managed in AWS Service Catalog.
   * It is not an AWS tag, but serves as a template for creating an AWS tag based on the TagOption.
   *
   * @param tagOptions 
   */
  public fun associateTagOptions(tagOptions: TagOptions)

  /**
   * The ARN of the product.
   */
  public fun productArn(): String

  /**
   * The id of the product.
   */
  public fun productId(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.IProduct): IProduct
        = CdkObjectWrappers.wrap(cdkObject) as IProduct

    internal fun unwrap(wrapped: IProduct): software.amazon.awscdk.services.servicecatalog.IProduct
        = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.servicecatalog.IProduct
  }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Properties for a ProductStackHistory.
 *
 * Example:
 *
 * ```
 * public class S3BucketProduct extends ProductStack {
 * public S3BucketProduct(Construct scope, String id) {
 * super(scope, id);
 * new Bucket(this, "BucketProductV2");
 * }
 * }
 * ProductStackHistory productStackHistory = ProductStackHistory.Builder.create(this,
 * "ProductStackHistory")
 * .productStack(new S3BucketProduct(this, "S3BucketProduct"))
 * .currentVersionName("v2")
 * .currentVersionLocked(true)
 * .build();
 * CloudFormationProduct product = CloudFormationProduct.Builder.create(this, "MyFirstProduct")
 * .productName("My Product")
 * .owner("Product Owner")
 * .productVersions(List.of(productStackHistory.currentVersion()))
 * .build();
 * ```
 */
public interface ProductStackHistoryProps {
  /**
   * If this is set to true, the ProductStack will not be overwritten if a snapshot is found for the
   * currentVersionName.
   */
  public fun currentVersionLocked(): Boolean

  /**
   * The current version name of the ProductStack.
   */
  public fun currentVersionName(): String

  /**
   * The description of the product version.
   *
   * Default: - No description provided
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The directory where template snapshots will be stored.
   *
   * Default: 'product-stack-snapshots'
   */
  public fun directory(): String? = unwrap(this).getDirectory()

  /**
   * The ProductStack whose history will be retained as a snapshot.
   */
  public fun productStack(): ProductStack

  /**
   * Whether the specified product template will be validated by CloudFormation.
   *
   * If turned off, an invalid template configuration can be stored.
   *
   * Default: true
   */
  public fun validateTemplate(): Boolean? = unwrap(this).getValidateTemplate()

  /**
   * A builder for [ProductStackHistoryProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param currentVersionLocked If this is set to true, the ProductStack will not be overwritten
     * if a snapshot is found for the currentVersionName. 
     */
    public fun currentVersionLocked(currentVersionLocked: Boolean)

    /**
     * @param currentVersionName The current version name of the ProductStack. 
     */
    public fun currentVersionName(currentVersionName: String)

    /**
     * @param description The description of the product version.
     */
    public fun description(description: String)

    /**
     * @param directory The directory where template snapshots will be stored.
     */
    public fun directory(directory: String)

    /**
     * @param productStack The ProductStack whose history will be retained as a snapshot. 
     */
    public fun productStack(productStack: ProductStack)

    /**
     * @param validateTemplate Whether the specified product template will be validated by
     * CloudFormation.
     * If turned off, an invalid template configuration can be stored.
     */
    public fun validateTemplate(validateTemplate: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.ProductStackHistoryProps.Builder =
        software.amazon.awscdk.services.servicecatalog.ProductStackHistoryProps.builder()

    /**
     * @param currentVersionLocked If this is set to true, the ProductStack will not be overwritten
     * if a snapshot is found for the currentVersionName. 
     */
    override fun currentVersionLocked(currentVersionLocked: Boolean) {
      cdkBuilder.currentVersionLocked(currentVersionLocked)
    }

    /**
     * @param currentVersionName The current version name of the ProductStack. 
     */
    override fun currentVersionName(currentVersionName: String) {
      cdkBuilder.currentVersionName(currentVersionName)
    }

    /**
     * @param description The description of the product version.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param directory The directory where template snapshots will be stored.
     */
    override fun directory(directory: String) {
      cdkBuilder.directory(directory)
    }

    /**
     * @param productStack The ProductStack whose history will be retained as a snapshot. 
     */
    override fun productStack(productStack: ProductStack) {
      cdkBuilder.productStack(productStack.let(ProductStack::unwrap))
    }

    /**
     * @param validateTemplate Whether the specified product template will be validated by
     * CloudFormation.
     * If turned off, an invalid template configuration can be stored.
     */
    override fun validateTemplate(validateTemplate: Boolean) {
      cdkBuilder.validateTemplate(validateTemplate)
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.ProductStackHistoryProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.servicecatalog.ProductStackHistoryProps,
  ) : CdkObject(cdkObject), ProductStackHistoryProps {
    /**
     * If this is set to true, the ProductStack will not be overwritten if a snapshot is found for
     * the currentVersionName.
     */
    override fun currentVersionLocked(): Boolean = unwrap(this).getCurrentVersionLocked()

    /**
     * The current version name of the ProductStack.
     */
    override fun currentVersionName(): String = unwrap(this).getCurrentVersionName()

    /**
     * The description of the product version.
     *
     * Default: - No description provided
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The directory where template snapshots will be stored.
     *
     * Default: 'product-stack-snapshots'
     */
    override fun directory(): String? = unwrap(this).getDirectory()

    /**
     * The ProductStack whose history will be retained as a snapshot.
     */
    override fun productStack(): ProductStack =
        unwrap(this).getProductStack().let(ProductStack::wrap)

    /**
     * Whether the specified product template will be validated by CloudFormation.
     *
     * If turned off, an invalid template configuration can be stored.
     *
     * Default: true
     */
    override fun validateTemplate(): Boolean? = unwrap(this).getValidateTemplate()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ProductStackHistoryProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.ProductStackHistoryProps):
        ProductStackHistoryProps = CdkObjectWrappers.wrap(cdkObject) as ProductStackHistoryProps

    internal fun unwrap(wrapped: ProductStackHistoryProps):
        software.amazon.awscdk.services.servicecatalog.ProductStackHistoryProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.servicecatalog.ProductStackHistoryProps
  }
}

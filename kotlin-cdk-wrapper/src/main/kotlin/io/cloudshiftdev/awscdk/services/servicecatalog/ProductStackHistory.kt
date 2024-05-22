@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A Construct that contains a Service Catalog product stack with its previous deployments
 * maintained.
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
public open class ProductStackHistory(
  cdkObject: software.amazon.awscdk.services.servicecatalog.ProductStackHistory,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ProductStackHistoryProps,
  ) :
      this(software.amazon.awscdk.services.servicecatalog.ProductStackHistory(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(ProductStackHistoryProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ProductStackHistoryProps.Builder.() -> Unit,
  ) : this(scope, id, ProductStackHistoryProps(props)
  )

  /**
   * Retains product stack template as a snapshot when deployed and retrieves a
   * CloudFormationProductVersion for the current product version.
   */
  public open fun currentVersion(): CloudFormationProductVersion =
      unwrap(this).currentVersion().let(CloudFormationProductVersion::wrap)

  /**
   * Retrieves a CloudFormationProductVersion from a previously deployed productVersionName.
   *
   * @param productVersionName 
   */
  public open fun versionFromSnapshot(productVersionName: String): CloudFormationProductVersion =
      unwrap(this).versionFromSnapshot(productVersionName).let(CloudFormationProductVersion::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.servicecatalog.ProductStackHistory].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * If this is set to true, the ProductStack will not be overwritten if a snapshot is found for
     * the currentVersionName.
     *
     * @param currentVersionLocked If this is set to true, the ProductStack will not be overwritten
     * if a snapshot is found for the currentVersionName. 
     */
    public fun currentVersionLocked(currentVersionLocked: Boolean)

    /**
     * The current version name of the ProductStack.
     *
     * @param currentVersionName The current version name of the ProductStack. 
     */
    public fun currentVersionName(currentVersionName: String)

    /**
     * The description of the product version.
     *
     * Default: - No description provided
     *
     * @param description The description of the product version. 
     */
    public fun description(description: String)

    /**
     * The directory where template snapshots will be stored.
     *
     * Default: 'product-stack-snapshots'
     *
     * @param directory The directory where template snapshots will be stored. 
     */
    public fun directory(directory: String)

    /**
     * The ProductStack whose history will be retained as a snapshot.
     *
     * @param productStack The ProductStack whose history will be retained as a snapshot. 
     */
    public fun productStack(productStack: ProductStack)

    /**
     * Whether the specified product template will be validated by CloudFormation.
     *
     * If turned off, an invalid template configuration can be stored.
     *
     * Default: true
     *
     * @param validateTemplate Whether the specified product template will be validated by
     * CloudFormation. 
     */
    public fun validateTemplate(validateTemplate: Boolean)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.ProductStackHistory.Builder =
        software.amazon.awscdk.services.servicecatalog.ProductStackHistory.Builder.create(scope, id)

    /**
     * If this is set to true, the ProductStack will not be overwritten if a snapshot is found for
     * the currentVersionName.
     *
     * @param currentVersionLocked If this is set to true, the ProductStack will not be overwritten
     * if a snapshot is found for the currentVersionName. 
     */
    override fun currentVersionLocked(currentVersionLocked: Boolean) {
      cdkBuilder.currentVersionLocked(currentVersionLocked)
    }

    /**
     * The current version name of the ProductStack.
     *
     * @param currentVersionName The current version name of the ProductStack. 
     */
    override fun currentVersionName(currentVersionName: String) {
      cdkBuilder.currentVersionName(currentVersionName)
    }

    /**
     * The description of the product version.
     *
     * Default: - No description provided
     *
     * @param description The description of the product version. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The directory where template snapshots will be stored.
     *
     * Default: 'product-stack-snapshots'
     *
     * @param directory The directory where template snapshots will be stored. 
     */
    override fun directory(directory: String) {
      cdkBuilder.directory(directory)
    }

    /**
     * The ProductStack whose history will be retained as a snapshot.
     *
     * @param productStack The ProductStack whose history will be retained as a snapshot. 
     */
    override fun productStack(productStack: ProductStack) {
      cdkBuilder.productStack(productStack.let(ProductStack.Companion::unwrap))
    }

    /**
     * Whether the specified product template will be validated by CloudFormation.
     *
     * If turned off, an invalid template configuration can be stored.
     *
     * Default: true
     *
     * @param validateTemplate Whether the specified product template will be validated by
     * CloudFormation. 
     */
    override fun validateTemplate(validateTemplate: Boolean) {
      cdkBuilder.validateTemplate(validateTemplate)
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.ProductStackHistory =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ProductStackHistory {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ProductStackHistory(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.ProductStackHistory):
        ProductStackHistory = ProductStackHistory(cdkObject)

    internal fun unwrap(wrapped: ProductStackHistory):
        software.amazon.awscdk.services.servicecatalog.ProductStackHistory = wrapped.cdkObject as
        software.amazon.awscdk.services.servicecatalog.ProductStackHistory
  }
}

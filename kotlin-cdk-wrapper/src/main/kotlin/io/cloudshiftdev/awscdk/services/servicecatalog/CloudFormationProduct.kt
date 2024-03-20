@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A Service Catalog Cloudformation Product.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.*;
 * public class S3BucketProduct extends ProductStack {
 * public S3BucketProduct(Construct scope, String id) {
 * super(scope, id);
 * new Bucket(this, "BucketProduct");
 * }
 * }
 * CloudFormationProduct product = CloudFormationProduct.Builder.create(this, "Product")
 * .productName("My Product")
 * .owner("Product Owner")
 * .productVersions(List.of(CloudFormationProductVersion.builder()
 * .productVersionName("v1")
 * .cloudFormationTemplate(CloudFormationTemplate.fromProductStack(new S3BucketProduct(this,
 * "S3BucketProduct")))
 * .build()))
 * .build();
 * ```
 */
public open class CloudFormationProduct internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.servicecatalog.CloudFormationProduct,
) : Product(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CloudFormationProductProps,
  ) :
      this(software.amazon.awscdk.services.servicecatalog.CloudFormationProduct(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CloudFormationProductProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CloudFormationProductProps.Builder.() -> Unit,
  ) : this(scope, id, CloudFormationProductProps(props)
  )

  /**
   * The asset bucket of a product created via product stack.
   *
   * Default: - Empty - no assets are used in this product
   */
  public override fun assetBuckets(): List<IBucket> =
      unwrap(this).getAssetBuckets().map(IBucket::wrap)

  /**
   * The ARN of the product.
   */
  public override fun productArn(): String = unwrap(this).getProductArn()

  /**
   * The id of the product.
   */
  public override fun productId(): String = unwrap(this).getProductId()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.servicecatalog.CloudFormationProduct].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of the product.
     *
     * Default: - No description provided
     *
     * @param description The description of the product. 
     */
    public fun description(description: String)

    /**
     * The distributor of the product.
     *
     * Default: - No distributor provided
     *
     * @param distributor The distributor of the product. 
     */
    public fun distributor(distributor: String)

    /**
     * The language code.
     *
     * Controls language for logging and errors.
     *
     * Default: - English
     *
     * @param messageLanguage The language code. 
     */
    public fun messageLanguage(messageLanguage: MessageLanguage)

    /**
     * The owner of the product.
     *
     * @param owner The owner of the product. 
     */
    public fun owner(owner: String)

    /**
     * The name of the product.
     *
     * @param productName The name of the product. 
     */
    public fun productName(productName: String)

    /**
     * The configuration of the product version.
     *
     * @param productVersions The configuration of the product version. 
     */
    public fun productVersions(productVersions: List<CloudFormationProductVersion>)

    /**
     * The configuration of the product version.
     *
     * @param productVersions The configuration of the product version. 
     */
    public fun productVersions(vararg productVersions: CloudFormationProductVersion)

    /**
     * Whether to give provisioning artifacts a new unique identifier when the product attributes or
     * provisioning artifacts is updated.
     *
     * Default: false
     *
     * @param replaceProductVersionIds Whether to give provisioning artifacts a new unique
     * identifier when the product attributes or provisioning artifacts is updated. 
     */
    public fun replaceProductVersionIds(replaceProductVersionIds: Boolean)

    /**
     * The support information about the product.
     *
     * Default: - No support description provided
     *
     * @param supportDescription The support information about the product. 
     */
    public fun supportDescription(supportDescription: String)

    /**
     * The contact email for product support.
     *
     * Default: - No support email provided
     *
     * @param supportEmail The contact email for product support. 
     */
    public fun supportEmail(supportEmail: String)

    /**
     * The contact URL for product support.
     *
     * Default: - No support URL provided
     *
     * @param supportUrl The contact URL for product support. 
     */
    public fun supportUrl(supportUrl: String)

    /**
     * TagOptions associated directly to a product.
     *
     * Default: - No tagOptions provided
     *
     * @param tagOptions TagOptions associated directly to a product. 
     */
    public fun tagOptions(tagOptions: TagOptions)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.CloudFormationProduct.Builder =
        software.amazon.awscdk.services.servicecatalog.CloudFormationProduct.Builder.create(scope,
        id)

    /**
     * The description of the product.
     *
     * Default: - No description provided
     *
     * @param description The description of the product. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The distributor of the product.
     *
     * Default: - No distributor provided
     *
     * @param distributor The distributor of the product. 
     */
    override fun distributor(distributor: String) {
      cdkBuilder.distributor(distributor)
    }

    /**
     * The language code.
     *
     * Controls language for logging and errors.
     *
     * Default: - English
     *
     * @param messageLanguage The language code. 
     */
    override fun messageLanguage(messageLanguage: MessageLanguage) {
      cdkBuilder.messageLanguage(messageLanguage.let(MessageLanguage::unwrap))
    }

    /**
     * The owner of the product.
     *
     * @param owner The owner of the product. 
     */
    override fun owner(owner: String) {
      cdkBuilder.owner(owner)
    }

    /**
     * The name of the product.
     *
     * @param productName The name of the product. 
     */
    override fun productName(productName: String) {
      cdkBuilder.productName(productName)
    }

    /**
     * The configuration of the product version.
     *
     * @param productVersions The configuration of the product version. 
     */
    override fun productVersions(productVersions: List<CloudFormationProductVersion>) {
      cdkBuilder.productVersions(productVersions.map(CloudFormationProductVersion::unwrap))
    }

    /**
     * The configuration of the product version.
     *
     * @param productVersions The configuration of the product version. 
     */
    override fun productVersions(vararg productVersions: CloudFormationProductVersion): Unit =
        productVersions(productVersions.toList())

    /**
     * Whether to give provisioning artifacts a new unique identifier when the product attributes or
     * provisioning artifacts is updated.
     *
     * Default: false
     *
     * @param replaceProductVersionIds Whether to give provisioning artifacts a new unique
     * identifier when the product attributes or provisioning artifacts is updated. 
     */
    override fun replaceProductVersionIds(replaceProductVersionIds: Boolean) {
      cdkBuilder.replaceProductVersionIds(replaceProductVersionIds)
    }

    /**
     * The support information about the product.
     *
     * Default: - No support description provided
     *
     * @param supportDescription The support information about the product. 
     */
    override fun supportDescription(supportDescription: String) {
      cdkBuilder.supportDescription(supportDescription)
    }

    /**
     * The contact email for product support.
     *
     * Default: - No support email provided
     *
     * @param supportEmail The contact email for product support. 
     */
    override fun supportEmail(supportEmail: String) {
      cdkBuilder.supportEmail(supportEmail)
    }

    /**
     * The contact URL for product support.
     *
     * Default: - No support URL provided
     *
     * @param supportUrl The contact URL for product support. 
     */
    override fun supportUrl(supportUrl: String) {
      cdkBuilder.supportUrl(supportUrl)
    }

    /**
     * TagOptions associated directly to a product.
     *
     * Default: - No tagOptions provided
     *
     * @param tagOptions TagOptions associated directly to a product. 
     */
    override fun tagOptions(tagOptions: TagOptions) {
      cdkBuilder.tagOptions(tagOptions.let(TagOptions::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.CloudFormationProduct =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CloudFormationProduct {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CloudFormationProduct(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CloudFormationProduct):
        CloudFormationProduct = CloudFormationProduct(cdkObject)

    internal fun unwrap(wrapped: CloudFormationProduct):
        software.amazon.awscdk.services.servicecatalog.CloudFormationProduct = wrapped.cdkObject
  }
}

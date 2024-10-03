@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for a Cloudformation Product.
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
public interface CloudFormationProductProps {
  /**
   * The description of the product.
   *
   * Default: - No description provided
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The distributor of the product.
   *
   * Default: - No distributor provided
   */
  public fun distributor(): String? = unwrap(this).getDistributor()

  /**
   * The language code.
   *
   * Controls language for logging and errors.
   *
   * Default: - English
   */
  public fun messageLanguage(): MessageLanguage? =
      unwrap(this).getMessageLanguage()?.let(MessageLanguage::wrap)

  /**
   * The owner of the product.
   */
  public fun owner(): String

  /**
   * The name of the product.
   */
  public fun productName(): String

  /**
   * The configuration of the product version.
   */
  public fun productVersions(): List<CloudFormationProductVersion>

  /**
   * Whether to give provisioning artifacts a new unique identifier when the product attributes or
   * provisioning artifacts is updated.
   *
   * Default: false
   */
  public fun replaceProductVersionIds(): Boolean? = unwrap(this).getReplaceProductVersionIds()

  /**
   * The support information about the product.
   *
   * Default: - No support description provided
   */
  public fun supportDescription(): String? = unwrap(this).getSupportDescription()

  /**
   * The contact email for product support.
   *
   * Default: - No support email provided
   */
  public fun supportEmail(): String? = unwrap(this).getSupportEmail()

  /**
   * The contact URL for product support.
   *
   * Default: - No support URL provided
   */
  public fun supportUrl(): String? = unwrap(this).getSupportUrl()

  /**
   * TagOptions associated directly to a product.
   *
   * Default: - No tagOptions provided
   */
  public fun tagOptions(): TagOptions? = unwrap(this).getTagOptions()?.let(TagOptions::wrap)

  /**
   * A builder for [CloudFormationProductProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the product.
     */
    public fun description(description: String)

    /**
     * @param distributor The distributor of the product.
     */
    public fun distributor(distributor: String)

    /**
     * @param messageLanguage The language code.
     * Controls language for logging and errors.
     */
    public fun messageLanguage(messageLanguage: MessageLanguage)

    /**
     * @param owner The owner of the product. 
     */
    public fun owner(owner: String)

    /**
     * @param productName The name of the product. 
     */
    public fun productName(productName: String)

    /**
     * @param productVersions The configuration of the product version. 
     */
    public fun productVersions(productVersions: List<CloudFormationProductVersion>)

    /**
     * @param productVersions The configuration of the product version. 
     */
    public fun productVersions(vararg productVersions: CloudFormationProductVersion)

    /**
     * @param replaceProductVersionIds Whether to give provisioning artifacts a new unique
     * identifier when the product attributes or provisioning artifacts is updated.
     */
    public fun replaceProductVersionIds(replaceProductVersionIds: Boolean)

    /**
     * @param supportDescription The support information about the product.
     */
    public fun supportDescription(supportDescription: String)

    /**
     * @param supportEmail The contact email for product support.
     */
    public fun supportEmail(supportEmail: String)

    /**
     * @param supportUrl The contact URL for product support.
     */
    public fun supportUrl(supportUrl: String)

    /**
     * @param tagOptions TagOptions associated directly to a product.
     */
    public fun tagOptions(tagOptions: TagOptions)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.CloudFormationProductProps.Builder =
        software.amazon.awscdk.services.servicecatalog.CloudFormationProductProps.builder()

    /**
     * @param description The description of the product.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param distributor The distributor of the product.
     */
    override fun distributor(distributor: String) {
      cdkBuilder.distributor(distributor)
    }

    /**
     * @param messageLanguage The language code.
     * Controls language for logging and errors.
     */
    override fun messageLanguage(messageLanguage: MessageLanguage) {
      cdkBuilder.messageLanguage(messageLanguage.let(MessageLanguage.Companion::unwrap))
    }

    /**
     * @param owner The owner of the product. 
     */
    override fun owner(owner: String) {
      cdkBuilder.owner(owner)
    }

    /**
     * @param productName The name of the product. 
     */
    override fun productName(productName: String) {
      cdkBuilder.productName(productName)
    }

    /**
     * @param productVersions The configuration of the product version. 
     */
    override fun productVersions(productVersions: List<CloudFormationProductVersion>) {
      cdkBuilder.productVersions(productVersions.map(CloudFormationProductVersion.Companion::unwrap))
    }

    /**
     * @param productVersions The configuration of the product version. 
     */
    override fun productVersions(vararg productVersions: CloudFormationProductVersion): Unit =
        productVersions(productVersions.toList())

    /**
     * @param replaceProductVersionIds Whether to give provisioning artifacts a new unique
     * identifier when the product attributes or provisioning artifacts is updated.
     */
    override fun replaceProductVersionIds(replaceProductVersionIds: Boolean) {
      cdkBuilder.replaceProductVersionIds(replaceProductVersionIds)
    }

    /**
     * @param supportDescription The support information about the product.
     */
    override fun supportDescription(supportDescription: String) {
      cdkBuilder.supportDescription(supportDescription)
    }

    /**
     * @param supportEmail The contact email for product support.
     */
    override fun supportEmail(supportEmail: String) {
      cdkBuilder.supportEmail(supportEmail)
    }

    /**
     * @param supportUrl The contact URL for product support.
     */
    override fun supportUrl(supportUrl: String) {
      cdkBuilder.supportUrl(supportUrl)
    }

    /**
     * @param tagOptions TagOptions associated directly to a product.
     */
    override fun tagOptions(tagOptions: TagOptions) {
      cdkBuilder.tagOptions(tagOptions.let(TagOptions.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.CloudFormationProductProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.servicecatalog.CloudFormationProductProps,
  ) : CdkObject(cdkObject),
      CloudFormationProductProps {
    /**
     * The description of the product.
     *
     * Default: - No description provided
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The distributor of the product.
     *
     * Default: - No distributor provided
     */
    override fun distributor(): String? = unwrap(this).getDistributor()

    /**
     * The language code.
     *
     * Controls language for logging and errors.
     *
     * Default: - English
     */
    override fun messageLanguage(): MessageLanguage? =
        unwrap(this).getMessageLanguage()?.let(MessageLanguage::wrap)

    /**
     * The owner of the product.
     */
    override fun owner(): String = unwrap(this).getOwner()

    /**
     * The name of the product.
     */
    override fun productName(): String = unwrap(this).getProductName()

    /**
     * The configuration of the product version.
     */
    override fun productVersions(): List<CloudFormationProductVersion> =
        unwrap(this).getProductVersions().map(CloudFormationProductVersion::wrap)

    /**
     * Whether to give provisioning artifacts a new unique identifier when the product attributes or
     * provisioning artifacts is updated.
     *
     * Default: false
     */
    override fun replaceProductVersionIds(): Boolean? = unwrap(this).getReplaceProductVersionIds()

    /**
     * The support information about the product.
     *
     * Default: - No support description provided
     */
    override fun supportDescription(): String? = unwrap(this).getSupportDescription()

    /**
     * The contact email for product support.
     *
     * Default: - No support email provided
     */
    override fun supportEmail(): String? = unwrap(this).getSupportEmail()

    /**
     * The contact URL for product support.
     *
     * Default: - No support URL provided
     */
    override fun supportUrl(): String? = unwrap(this).getSupportUrl()

    /**
     * TagOptions associated directly to a product.
     *
     * Default: - No tagOptions provided
     */
    override fun tagOptions(): TagOptions? = unwrap(this).getTagOptions()?.let(TagOptions::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CloudFormationProductProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CloudFormationProductProps):
        CloudFormationProductProps = CdkObjectWrappers.wrap(cdkObject) as?
        CloudFormationProductProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CloudFormationProductProps):
        software.amazon.awscdk.services.servicecatalog.CloudFormationProductProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.servicecatalog.CloudFormationProductProps
  }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.servicecatalog.CloudFormationProduct
import software.amazon.awscdk.services.servicecatalog.CloudFormationProductVersion
import software.amazon.awscdk.services.servicecatalog.MessageLanguage
import software.amazon.awscdk.services.servicecatalog.TagOptions
import software.constructs.Construct

@CdkDslMarker
public class CloudFormationProductDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CloudFormationProduct.Builder =
      CloudFormationProduct.Builder.create(scope, id)

  private val _productVersions: MutableList<CloudFormationProductVersion> = mutableListOf()

  /**
   * The description of the product.
   *
   * Default: - No description provided
   *
   * @param description The description of the product. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The distributor of the product.
   *
   * Default: - No distributor provided
   *
   * @param distributor The distributor of the product. 
   */
  public fun distributor(distributor: String) {
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
  public fun messageLanguage(messageLanguage: MessageLanguage) {
    cdkBuilder.messageLanguage(messageLanguage)
  }

  /**
   * The owner of the product.
   *
   * @param owner The owner of the product. 
   */
  public fun owner(owner: String) {
    cdkBuilder.owner(owner)
  }

  /**
   * The name of the product.
   *
   * @param productName The name of the product. 
   */
  public fun productName(productName: String) {
    cdkBuilder.productName(productName)
  }

  /**
   * The configuration of the product version.
   *
   * @param productVersions The configuration of the product version. 
   */
  public fun productVersions(productVersions: CloudFormationProductVersionDsl.() -> Unit) {
    _productVersions.add(CloudFormationProductVersionDsl().apply(productVersions).build())
  }

  /**
   * The configuration of the product version.
   *
   * @param productVersions The configuration of the product version. 
   */
  public fun productVersions(productVersions: Collection<CloudFormationProductVersion>) {
    _productVersions.addAll(productVersions)
  }

  /**
   * Whether to give provisioning artifacts a new unique identifier when the product attributes or
   * provisioning artifacts is updated.
   *
   * Default: false
   *
   * @param replaceProductVersionIds Whether to give provisioning artifacts a new unique identifier
   * when the product attributes or provisioning artifacts is updated. 
   */
  public fun replaceProductVersionIds(replaceProductVersionIds: Boolean) {
    cdkBuilder.replaceProductVersionIds(replaceProductVersionIds)
  }

  /**
   * The support information about the product.
   *
   * Default: - No support description provided
   *
   * @param supportDescription The support information about the product. 
   */
  public fun supportDescription(supportDescription: String) {
    cdkBuilder.supportDescription(supportDescription)
  }

  /**
   * The contact email for product support.
   *
   * Default: - No support email provided
   *
   * @param supportEmail The contact email for product support. 
   */
  public fun supportEmail(supportEmail: String) {
    cdkBuilder.supportEmail(supportEmail)
  }

  /**
   * The contact URL for product support.
   *
   * Default: - No support URL provided
   *
   * @param supportUrl The contact URL for product support. 
   */
  public fun supportUrl(supportUrl: String) {
    cdkBuilder.supportUrl(supportUrl)
  }

  /**
   * TagOptions associated directly to a product.
   *
   * Default: - No tagOptions provided
   *
   * @param tagOptions TagOptions associated directly to a product. 
   */
  public fun tagOptions(tagOptions: TagOptions) {
    cdkBuilder.tagOptions(tagOptions)
  }

  public fun build(): CloudFormationProduct {
    if(_productVersions.isNotEmpty()) cdkBuilder.productVersions(_productVersions)
    return cdkBuilder.build()
  }
}

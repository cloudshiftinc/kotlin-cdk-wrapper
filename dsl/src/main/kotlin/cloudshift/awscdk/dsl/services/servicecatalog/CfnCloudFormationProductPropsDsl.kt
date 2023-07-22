@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct
import software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProductProps

@CdkDslMarker
public class CfnCloudFormationProductPropsDsl {
  private val cdkBuilder: CfnCloudFormationProductProps.Builder =
      CfnCloudFormationProductProps.builder()

  private val _provisioningArtifactParameters: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param acceptLanguage The language code.
   * * `jp` - Japanese
   * * `zh` - Chinese
   */
  public fun acceptLanguage(acceptLanguage: String) {
    cdkBuilder.acceptLanguage(acceptLanguage)
  }

  /**
   * @param description The description of the product.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param distributor The distributor of the product.
   */
  public fun distributor(distributor: String) {
    cdkBuilder.distributor(distributor)
  }

  /**
   * @param name The name of the product. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param owner The owner of the product. 
   */
  public fun owner(owner: String) {
    cdkBuilder.owner(owner)
  }

  /**
   * @param productType The type of product.
   */
  public fun productType(productType: String) {
    cdkBuilder.productType(productType)
  }

  /**
   * @param provisioningArtifactParameters The configuration of the provisioning artifact (also
   * known as a version).
   */
  public fun provisioningArtifactParameters(vararg provisioningArtifactParameters: Any) {
    _provisioningArtifactParameters.addAll(listOf(*provisioningArtifactParameters))
  }

  /**
   * @param provisioningArtifactParameters The configuration of the provisioning artifact (also
   * known as a version).
   */
  public fun provisioningArtifactParameters(provisioningArtifactParameters: Collection<Any>) {
    _provisioningArtifactParameters.addAll(provisioningArtifactParameters)
  }

  /**
   * @param provisioningArtifactParameters The configuration of the provisioning artifact (also
   * known as a version).
   */
  public fun provisioningArtifactParameters(provisioningArtifactParameters: IResolvable) {
    cdkBuilder.provisioningArtifactParameters(provisioningArtifactParameters)
  }

  /**
   * @param replaceProvisioningArtifacts This property is turned off by default.
   * If turned off, you can update provisioning artifacts or product attributes (such as
   * description, distributor, name, owner, and more) and the associated provisioning artifacts will
   * retain the same unique identifier. Provisioning artifacts are matched within the
   * CloudFormationProduct resource, and only those that have been updated will be changed.
   * Provisioning artifacts are matched by a combinaton of provisioning artifact template URL and name.
   *
   * If turned on, provisioning artifacts will be given a new unique identifier when you update the
   * product or provisioning artifacts.
   */
  public fun replaceProvisioningArtifacts(replaceProvisioningArtifacts: Boolean) {
    cdkBuilder.replaceProvisioningArtifacts(replaceProvisioningArtifacts)
  }

  /**
   * @param replaceProvisioningArtifacts This property is turned off by default.
   * If turned off, you can update provisioning artifacts or product attributes (such as
   * description, distributor, name, owner, and more) and the associated provisioning artifacts will
   * retain the same unique identifier. Provisioning artifacts are matched within the
   * CloudFormationProduct resource, and only those that have been updated will be changed.
   * Provisioning artifacts are matched by a combinaton of provisioning artifact template URL and name.
   *
   * If turned on, provisioning artifacts will be given a new unique identifier when you update the
   * product or provisioning artifacts.
   */
  public fun replaceProvisioningArtifacts(replaceProvisioningArtifacts: IResolvable) {
    cdkBuilder.replaceProvisioningArtifacts(replaceProvisioningArtifacts)
  }

  /**
   * @param sourceConnection A top level `ProductViewDetail` response containing details about the
   * product’s connection.
   * AWS Service Catalog returns this field for the `CreateProduct` , `UpdateProduct` ,
   * `DescribeProductAsAdmin` , and `SearchProductAsAdmin` APIs. This response contains the same fields
   * as the `ConnectionParameters` request, with the addition of the `LastSync` response.
   */
  public fun sourceConnection(sourceConnection: IResolvable) {
    cdkBuilder.sourceConnection(sourceConnection)
  }

  /**
   * @param sourceConnection A top level `ProductViewDetail` response containing details about the
   * product’s connection.
   * AWS Service Catalog returns this field for the `CreateProduct` , `UpdateProduct` ,
   * `DescribeProductAsAdmin` , and `SearchProductAsAdmin` APIs. This response contains the same fields
   * as the `ConnectionParameters` request, with the addition of the `LastSync` response.
   */
  public fun sourceConnection(sourceConnection: CfnCloudFormationProduct.SourceConnectionProperty) {
    cdkBuilder.sourceConnection(sourceConnection)
  }

  /**
   * @param supportDescription The support information about the product.
   */
  public fun supportDescription(supportDescription: String) {
    cdkBuilder.supportDescription(supportDescription)
  }

  /**
   * @param supportEmail The contact email for product support.
   */
  public fun supportEmail(supportEmail: String) {
    cdkBuilder.supportEmail(supportEmail)
  }

  /**
   * @param supportUrl The contact URL for product support.
   * `^https?:\/\//` / is the pattern used to validate SupportUrl.
   */
  public fun supportUrl(supportUrl: String) {
    cdkBuilder.supportUrl(supportUrl)
  }

  /**
   * @param tags One or more tags.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags One or more tags.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnCloudFormationProductProps {
    if(_provisioningArtifactParameters.isNotEmpty())
        cdkBuilder.provisioningArtifactParameters(_provisioningArtifactParameters)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}

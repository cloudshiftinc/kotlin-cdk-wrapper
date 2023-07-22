@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct
import software.constructs.Construct

/**
 * Provisions the specified product.
 *
 * A provisioned product is a resourced instance of a product. For example, provisioning a product
 * based on a AWS CloudFormation template launches a AWS CloudFormation stack and its underlying
 * resources. You can check the status of this request using
 * [DescribeRecord](https://docs.aws.amazon.com/servicecatalog/latest/dg/API_DescribeRecord.html) .
 *
 * If the request contains a tag key with an empty list of values, there is a tag conflict for that
 * key. Do not include conflicted keys as tags, or this causes the error "Parameter validation failed:
 * Missing required parameter in Tags[ *N* ]: *Value* ".
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicecatalog.*;
 * CfnCloudFormationProvisionedProduct cfnCloudFormationProvisionedProduct =
 * CfnCloudFormationProvisionedProduct.Builder.create(this, "MyCfnCloudFormationProvisionedProduct")
 * .acceptLanguage("acceptLanguage")
 * .notificationArns(List.of("notificationArns"))
 * .pathId("pathId")
 * .pathName("pathName")
 * .productId("productId")
 * .productName("productName")
 * .provisionedProductName("provisionedProductName")
 * .provisioningArtifactId("provisioningArtifactId")
 * .provisioningArtifactName("provisioningArtifactName")
 * .provisioningParameters(List.of(ProvisioningParameterProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .provisioningPreferences(ProvisioningPreferencesProperty.builder()
 * .stackSetAccounts(List.of("stackSetAccounts"))
 * .stackSetFailureToleranceCount(123)
 * .stackSetFailureTolerancePercentage(123)
 * .stackSetMaxConcurrencyCount(123)
 * .stackSetMaxConcurrencyPercentage(123)
 * .stackSetOperationType("stackSetOperationType")
 * .stackSetRegions(List.of("stackSetRegions"))
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html)
 */
@CdkDslMarker
public class CfnCloudFormationProvisionedProductDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnCloudFormationProvisionedProduct.Builder =
      CfnCloudFormationProvisionedProduct.Builder.create(scope, id)

  private val _notificationArns: MutableList<String> = mutableListOf()

  private val _provisioningParameters: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The language code.
   *
   * * `jp` - Japanese
   * * `zh` - Chinese
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-acceptlanguage)
   * @param acceptLanguage The language code. 
   */
  public fun acceptLanguage(acceptLanguage: String) {
    cdkBuilder.acceptLanguage(acceptLanguage)
  }

  /**
   * Passed to AWS CloudFormation .
   *
   * The SNS topic ARNs to which to publish stack-related events.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-notificationarns)
   * @param notificationArns Passed to AWS CloudFormation . 
   */
  public fun notificationArns(vararg notificationArns: String) {
    _notificationArns.addAll(listOf(*notificationArns))
  }

  /**
   * Passed to AWS CloudFormation .
   *
   * The SNS topic ARNs to which to publish stack-related events.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-notificationarns)
   * @param notificationArns Passed to AWS CloudFormation . 
   */
  public fun notificationArns(notificationArns: Collection<String>) {
    _notificationArns.addAll(notificationArns)
  }

  /**
   * The path identifier of the product.
   *
   * This value is optional if the product has a default path, and required if the product has more
   * than one path. To list the paths for a product, use
   * [ListLaunchPaths](https://docs.aws.amazon.com/servicecatalog/latest/dg/API_ListLaunchPaths.html) .
   *
   *
   * You must provide the name or ID, but not both.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-pathid)
   * @param pathId The path identifier of the product. 
   */
  public fun pathId(pathId: String) {
    cdkBuilder.pathId(pathId)
  }

  /**
   * The name of the path.
   *
   * This value is optional if the product has a default path, and required if the product has more
   * than one path. To list the paths for a product, use
   * [ListLaunchPaths](https://docs.aws.amazon.com/servicecatalog/latest/dg/API_ListLaunchPaths.html) .
   *
   *
   * You must provide the name or ID, but not both.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-pathname)
   * @param pathName The name of the path. 
   */
  public fun pathName(pathName: String) {
    cdkBuilder.pathName(pathName)
  }

  /**
   * The product identifier.
   *
   *
   * You must specify either the ID or the name of the product, but not both.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-productid)
   * @param productId The product identifier. 
   */
  public fun productId(productId: String) {
    cdkBuilder.productId(productId)
  }

  /**
   * The name of the Service Catalog product.
   *
   * Each time a stack is created or updated, if `ProductName` is provided it will successfully
   * resolve to `ProductId` as long as only one product exists in the account or Region with that
   * `ProductName` .
   *
   *
   * You must specify either the name or the ID of the product, but not both.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-productname)
   * @param productName The name of the Service Catalog product. 
   */
  public fun productName(productName: String) {
    cdkBuilder.productName(productName)
  }

  /**
   * A user-friendly name for the provisioned product.
   *
   * This value must be unique for the AWS account and cannot be updated after the product is
   * provisioned.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisionedproductname)
   * @param provisionedProductName A user-friendly name for the provisioned product. 
   */
  public fun provisionedProductName(provisionedProductName: String) {
    cdkBuilder.provisionedProductName(provisionedProductName)
  }

  /**
   * The identifier of the provisioning artifact (also known as a version).
   *
   *
   * You must specify either the ID or the name of the provisioning artifact, but not both.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningartifactid)
   * @param provisioningArtifactId The identifier of the provisioning artifact (also known as a
   * version). 
   */
  public fun provisioningArtifactId(provisioningArtifactId: String) {
    cdkBuilder.provisioningArtifactId(provisioningArtifactId)
  }

  /**
   * The name of the provisioning artifact (also known as a version) for the product.
   *
   * This name must be unique for the product.
   *
   *
   * You must specify either the name or the ID of the provisioning artifact, but not both. You must
   * also specify either the name or the ID of the product, but not both.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningartifactname)
   * @param provisioningArtifactName The name of the provisioning artifact (also known as a version)
   * for the product. 
   */
  public fun provisioningArtifactName(provisioningArtifactName: String) {
    cdkBuilder.provisioningArtifactName(provisioningArtifactName)
  }

  /**
   * Parameters specified by the administrator that are required for provisioning the product.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningparameters)
   * @param provisioningParameters Parameters specified by the administrator that are required for
   * provisioning the product. 
   */
  public fun provisioningParameters(vararg provisioningParameters: Any) {
    _provisioningParameters.addAll(listOf(*provisioningParameters))
  }

  /**
   * Parameters specified by the administrator that are required for provisioning the product.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningparameters)
   * @param provisioningParameters Parameters specified by the administrator that are required for
   * provisioning the product. 
   */
  public fun provisioningParameters(provisioningParameters: Collection<Any>) {
    _provisioningParameters.addAll(provisioningParameters)
  }

  /**
   * Parameters specified by the administrator that are required for provisioning the product.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningparameters)
   * @param provisioningParameters Parameters specified by the administrator that are required for
   * provisioning the product. 
   */
  public fun provisioningParameters(provisioningParameters: IResolvable) {
    cdkBuilder.provisioningParameters(provisioningParameters)
  }

  /**
   * StackSet preferences that are required for provisioning the product or updating a provisioned
   * product.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences)
   * @param provisioningPreferences StackSet preferences that are required for provisioning the
   * product or updating a provisioned product. 
   */
  public fun provisioningPreferences(provisioningPreferences: IResolvable) {
    cdkBuilder.provisioningPreferences(provisioningPreferences)
  }

  /**
   * StackSet preferences that are required for provisioning the product or updating a provisioned
   * product.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences)
   * @param provisioningPreferences StackSet preferences that are required for provisioning the
   * product or updating a provisioned product. 
   */
  public
      fun provisioningPreferences(provisioningPreferences: CfnCloudFormationProvisionedProduct.ProvisioningPreferencesProperty) {
    cdkBuilder.provisioningPreferences(provisioningPreferences)
  }

  /**
   * One or more tags.
   *
   *
   * Requires the provisioned product to have an
   * [ResourceUpdateConstraint](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-resourceupdateconstraint.html)
   * resource with `TagUpdatesOnProvisionedProduct` set to `ALLOWED` to allow tag updates. If
   * `RESOURCE_UPDATE` constraint is not present, tags updates are ignored.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-tags)
   * @param tags One or more tags. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * One or more tags.
   *
   *
   * Requires the provisioned product to have an
   * [ResourceUpdateConstraint](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-resourceupdateconstraint.html)
   * resource with `TagUpdatesOnProvisionedProduct` set to `ALLOWED` to allow tag updates. If
   * `RESOURCE_UPDATE` constraint is not present, tags updates are ignored.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-tags)
   * @param tags One or more tags. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnCloudFormationProvisionedProduct {
    if(_notificationArns.isNotEmpty()) cdkBuilder.notificationArns(_notificationArns)
    if(_provisioningParameters.isNotEmpty())
        cdkBuilder.provisioningParameters(_provisioningParameters)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}

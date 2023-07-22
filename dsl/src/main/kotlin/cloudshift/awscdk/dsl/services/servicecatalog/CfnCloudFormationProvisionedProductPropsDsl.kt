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
import software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProductProps

@CdkDslMarker
public class CfnCloudFormationProvisionedProductPropsDsl {
  private val cdkBuilder: CfnCloudFormationProvisionedProductProps.Builder =
      CfnCloudFormationProvisionedProductProps.builder()

  private val _notificationArns: MutableList<String> = mutableListOf()

  private val _provisioningParameters: MutableList<Any> = mutableListOf()

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
   * @param notificationArns Passed to AWS CloudFormation .
   * The SNS topic ARNs to which to publish stack-related events.
   */
  public fun notificationArns(vararg notificationArns: String) {
    _notificationArns.addAll(listOf(*notificationArns))
  }

  /**
   * @param notificationArns Passed to AWS CloudFormation .
   * The SNS topic ARNs to which to publish stack-related events.
   */
  public fun notificationArns(notificationArns: Collection<String>) {
    _notificationArns.addAll(notificationArns)
  }

  /**
   * @param pathId The path identifier of the product.
   * This value is optional if the product has a default path, and required if the product has more
   * than one path. To list the paths for a product, use
   * [ListLaunchPaths](https://docs.aws.amazon.com/servicecatalog/latest/dg/API_ListLaunchPaths.html) .
   *
   *
   * You must provide the name or ID, but not both.
   */
  public fun pathId(pathId: String) {
    cdkBuilder.pathId(pathId)
  }

  /**
   * @param pathName The name of the path.
   * This value is optional if the product has a default path, and required if the product has more
   * than one path. To list the paths for a product, use
   * [ListLaunchPaths](https://docs.aws.amazon.com/servicecatalog/latest/dg/API_ListLaunchPaths.html) .
   *
   *
   * You must provide the name or ID, but not both.
   */
  public fun pathName(pathName: String) {
    cdkBuilder.pathName(pathName)
  }

  /**
   * @param productId The product identifier.
   *
   * You must specify either the ID or the name of the product, but not both.
   */
  public fun productId(productId: String) {
    cdkBuilder.productId(productId)
  }

  /**
   * @param productName The name of the Service Catalog product.
   * Each time a stack is created or updated, if `ProductName` is provided it will successfully
   * resolve to `ProductId` as long as only one product exists in the account or Region with that
   * `ProductName` .
   *
   *
   * You must specify either the name or the ID of the product, but not both.
   */
  public fun productName(productName: String) {
    cdkBuilder.productName(productName)
  }

  /**
   * @param provisionedProductName A user-friendly name for the provisioned product.
   * This value must be unique for the AWS account and cannot be updated after the product is
   * provisioned.
   */
  public fun provisionedProductName(provisionedProductName: String) {
    cdkBuilder.provisionedProductName(provisionedProductName)
  }

  /**
   * @param provisioningArtifactId The identifier of the provisioning artifact (also known as a
   * version).
   *
   * You must specify either the ID or the name of the provisioning artifact, but not both.
   */
  public fun provisioningArtifactId(provisioningArtifactId: String) {
    cdkBuilder.provisioningArtifactId(provisioningArtifactId)
  }

  /**
   * @param provisioningArtifactName The name of the provisioning artifact (also known as a version)
   * for the product.
   * This name must be unique for the product.
   *
   *
   * You must specify either the name or the ID of the provisioning artifact, but not both. You must
   * also specify either the name or the ID of the product, but not both.
   */
  public fun provisioningArtifactName(provisioningArtifactName: String) {
    cdkBuilder.provisioningArtifactName(provisioningArtifactName)
  }

  /**
   * @param provisioningParameters Parameters specified by the administrator that are required for
   * provisioning the product.
   */
  public fun provisioningParameters(vararg provisioningParameters: Any) {
    _provisioningParameters.addAll(listOf(*provisioningParameters))
  }

  /**
   * @param provisioningParameters Parameters specified by the administrator that are required for
   * provisioning the product.
   */
  public fun provisioningParameters(provisioningParameters: Collection<Any>) {
    _provisioningParameters.addAll(provisioningParameters)
  }

  /**
   * @param provisioningParameters Parameters specified by the administrator that are required for
   * provisioning the product.
   */
  public fun provisioningParameters(provisioningParameters: IResolvable) {
    cdkBuilder.provisioningParameters(provisioningParameters)
  }

  /**
   * @param provisioningPreferences StackSet preferences that are required for provisioning the
   * product or updating a provisioned product.
   */
  public fun provisioningPreferences(provisioningPreferences: IResolvable) {
    cdkBuilder.provisioningPreferences(provisioningPreferences)
  }

  /**
   * @param provisioningPreferences StackSet preferences that are required for provisioning the
   * product or updating a provisioned product.
   */
  public
      fun provisioningPreferences(provisioningPreferences: CfnCloudFormationProvisionedProduct.ProvisioningPreferencesProperty) {
    cdkBuilder.provisioningPreferences(provisioningPreferences)
  }

  /**
   * @param tags One or more tags.
   *
   * Requires the provisioned product to have an
   * [ResourceUpdateConstraint](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-resourceupdateconstraint.html)
   * resource with `TagUpdatesOnProvisionedProduct` set to `ALLOWED` to allow tag updates. If
   * `RESOURCE_UPDATE` constraint is not present, tags updates are ignored.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags One or more tags.
   *
   * Requires the provisioned product to have an
   * [ResourceUpdateConstraint](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-resourceupdateconstraint.html)
   * resource with `TagUpdatesOnProvisionedProduct` set to `ALLOWED` to allow tag updates. If
   * `RESOURCE_UPDATE` constraint is not present, tags updates are ignored.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnCloudFormationProvisionedProductProps {
    if(_notificationArns.isNotEmpty()) cdkBuilder.notificationArns(_notificationArns)
    if(_provisioningParameters.isNotEmpty())
        cdkBuilder.provisioningParameters(_provisioningParameters)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}

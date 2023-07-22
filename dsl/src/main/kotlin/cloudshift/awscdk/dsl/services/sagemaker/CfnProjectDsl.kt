@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnProject
import software.constructs.Construct

/**
 * Creates a machine learning (ML) project that can contain one or more templates that set up an ML
 * pipeline from training to deploying an approved model.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * Object serviceCatalogProvisioningDetails;
 * CfnProject cfnProject = CfnProject.Builder.create(this, "MyCfnProject")
 * .projectName("projectName")
 * .serviceCatalogProvisioningDetails(serviceCatalogProvisioningDetails)
 * // the properties below are optional
 * .projectDescription("projectDescription")
 * .serviceCatalogProvisionedProductDetails(ServiceCatalogProvisionedProductDetailsProperty.builder()
 * .provisionedProductId("provisionedProductId")
 * .provisionedProductStatusMessage("provisionedProductStatusMessage")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-project.html)
 */
@CdkDslMarker
public class CfnProjectDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnProject.Builder = CfnProject.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The description of the project.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-project.html#cfn-sagemaker-project-projectdescription)
   * @param projectDescription The description of the project. 
   */
  public fun projectDescription(projectDescription: String) {
    cdkBuilder.projectDescription(projectDescription)
  }

  /**
   * The name of the project.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-project.html#cfn-sagemaker-project-projectname)
   * @param projectName The name of the project. 
   */
  public fun projectName(projectName: String) {
    cdkBuilder.projectName(projectName)
  }

  /**
   * Provisioned ServiceCatalog  Details.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-project.html#cfn-sagemaker-project-servicecatalogprovisionedproductdetails)
   * @param serviceCatalogProvisionedProductDetails Provisioned ServiceCatalog  Details. 
   */
  public
      fun serviceCatalogProvisionedProductDetails(serviceCatalogProvisionedProductDetails: IResolvable) {
    cdkBuilder.serviceCatalogProvisionedProductDetails(serviceCatalogProvisionedProductDetails)
  }

  /**
   * Provisioned ServiceCatalog  Details.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-project.html#cfn-sagemaker-project-servicecatalogprovisionedproductdetails)
   * @param serviceCatalogProvisionedProductDetails Provisioned ServiceCatalog  Details. 
   */
  public
      fun serviceCatalogProvisionedProductDetails(serviceCatalogProvisionedProductDetails: CfnProject.ServiceCatalogProvisionedProductDetailsProperty) {
    cdkBuilder.serviceCatalogProvisionedProductDetails(serviceCatalogProvisionedProductDetails)
  }

  /**
   * The product ID and provisioning artifact ID to provision a service catalog.
   *
   * For information, see [What is AWS Service
   * Catalog](https://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-project.html#cfn-sagemaker-project-servicecatalogprovisioningdetails)
   * @param serviceCatalogProvisioningDetails The product ID and provisioning artifact ID to
   * provision a service catalog. 
   */
  public
      fun serviceCatalogProvisioningDetails(serviceCatalogProvisioningDetails: MapBuilder.() -> Unit
      = {}) {
    val builder = MapBuilder()
    builder.apply(serviceCatalogProvisioningDetails)
    cdkBuilder.serviceCatalogProvisioningDetails(builder.map)
  }

  /**
   * The product ID and provisioning artifact ID to provision a service catalog.
   *
   * For information, see [What is AWS Service
   * Catalog](https://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-project.html#cfn-sagemaker-project-servicecatalogprovisioningdetails)
   * @param serviceCatalogProvisioningDetails The product ID and provisioning artifact ID to
   * provision a service catalog. 
   */
  public fun serviceCatalogProvisioningDetails(serviceCatalogProvisioningDetails: Any) {
    cdkBuilder.serviceCatalogProvisioningDetails(serviceCatalogProvisioningDetails)
  }

  /**
   * A list of key-value pairs to apply to this resource.
   *
   * For more information, see [Resource
   * Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * and [Using Cost Allocation
   * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what)
   * in the *AWS Billing and Cost Management User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-project.html#cfn-sagemaker-project-tags)
   * @param tags A list of key-value pairs to apply to this resource. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * A list of key-value pairs to apply to this resource.
   *
   * For more information, see [Resource
   * Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * and [Using Cost Allocation
   * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what)
   * in the *AWS Billing and Cost Management User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-project.html#cfn-sagemaker-project-tags)
   * @param tags A list of key-value pairs to apply to this resource. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnProject {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}

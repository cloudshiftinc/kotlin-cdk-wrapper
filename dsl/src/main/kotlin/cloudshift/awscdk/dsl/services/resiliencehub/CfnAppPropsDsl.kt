@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.resiliencehub

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.resiliencehub.CfnAppProps

/**
 * Properties for defining a `CfnApp`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.resiliencehub.*;
 * CfnAppProps cfnAppProps = CfnAppProps.builder()
 * .appTemplateBody("appTemplateBody")
 * .name("name")
 * .resourceMappings(List.of(ResourceMappingProperty.builder()
 * .mappingType("mappingType")
 * .physicalResourceId(PhysicalResourceIdProperty.builder()
 * .identifier("identifier")
 * .type("type")
 * // the properties below are optional
 * .awsAccountId("awsAccountId")
 * .awsRegion("awsRegion")
 * .build())
 * // the properties below are optional
 * .eksSourceName("eksSourceName")
 * .logicalStackName("logicalStackName")
 * .resourceName("resourceName")
 * .terraformSourceName("terraformSourceName")
 * .build()))
 * // the properties below are optional
 * .appAssessmentSchedule("appAssessmentSchedule")
 * .description("description")
 * .resiliencyPolicyArn("resiliencyPolicyArn")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-app.html)
 */
@CdkDslMarker
public class CfnAppPropsDsl {
  private val cdkBuilder: CfnAppProps.Builder = CfnAppProps.builder()

  private val _resourceMappings: MutableList<Any> = mutableListOf()

  /**
   * @param appAssessmentSchedule Assessment execution schedule with 'Daily' or 'Disabled' values.
   */
  public fun appAssessmentSchedule(appAssessmentSchedule: String) {
    cdkBuilder.appAssessmentSchedule(appAssessmentSchedule)
  }

  /**
   * @param appTemplateBody A JSON string that provides information about your application
   * structure. 
   * To learn more about the `appTemplateBody` template, see the sample template provided in the
   * *Examples* section.
   *
   * The `appTemplateBody` JSON string has the following structure:
   *
   * * *`resources`*
   *
   * The list of logical resources that needs to be included in the AWS Resilience Hub application.
   *
   * Type: Array
   *
   *
   * Don't add the resources that you want to exclude.
   *
   *
   * Each `resources` array item includes the following fields:
   *
   * * *`logicalResourceId`*
   *
   * The logical identifier of the resource.
   *
   * Type: Object
   *
   * Each `logicalResourceId` object includes the following fields:
   *
   * * `identifier`
   *
   * The identifier of the resource.
   *
   * Type: String
   *
   * * `logicalStackName`
   *
   * The name of the AWS CloudFormation stack this resource belongs to.
   *
   * Type: String
   *
   * * `resourceGroupName`
   *
   * The name of the resource group this resource belongs to.
   *
   * Type: String
   *
   * * `terraformSourceName`
   *
   * The name of the Terraform S3 state file this resource belongs to.
   *
   * Type: String
   *
   * * `eksSourceName`
   *
   * The name of the Amazon Elastic Kubernetes Service cluster and namespace this resource belongs
   * to.
   *
   *
   * This parameter accepts values in "eks-cluster/namespace" format.
   *
   *
   * Type: String
   *
   * * *`type`*
   *
   * The type of resource.
   *
   * Type: string
   *
   * * *`name`*
   *
   * The name of the resource.
   *
   * Type: String
   *
   * * `additionalInfo`
   *
   * Additional configuration parameters for an AWS Resilience Hub application. If you want to
   * implement `additionalInfo` through the AWS Resilience Hub console rather than using an API call,
   * see [Configure the application configuration
   * parameters](https://docs.aws.amazon.com//resilience-hub/latest/userguide/app-config-param.html) .
   *
   *
   * Currently, this parameter accepts a key-value mapping (in a string format) of only one failover
   * region and one associated account.
   *
   * Key: `"failover-regions"`
   *
   * Value: `"[{"region":"&lt;REGION&gt;", "accounts":[{"id":"&lt;ACCOUNT_ID&gt;"}]}]"`
   *
   *
   * * *`appComponents`*
   *
   * The list of Application Components (AppComponent) that this resource belongs to. If an
   * AppComponent is not part of the AWS Resilience Hub application, it will be added.
   *
   * Type: Array
   *
   * Each `appComponents` array item includes the following fields:
   *
   * * `name`
   *
   * The name of the AppComponent.
   *
   * Type: String
   *
   * * `type`
   *
   * The type of AppComponent. For more information about the types of AppComponent, see [Grouping
   * resources in an
   * AppComponent](https://docs.aws.amazon.com/resilience-hub/latest/userguide/AppComponent.grouping.html)
   * .
   *
   * Type: String
   *
   * * `resourceNames`
   *
   * The list of included resources that are assigned to the AppComponent.
   *
   * Type: Array of strings
   *
   * * `additionalInfo`
   *
   * Additional configuration parameters for an AWS Resilience Hub application. If you want to
   * implement `additionalInfo` through the AWS Resilience Hub console rather than using an API call,
   * see [Configure the application configuration
   * parameters](https://docs.aws.amazon.com//resilience-hub/latest/userguide/app-config-param.html) .
   *
   *
   * Currently, this parameter accepts a key-value mapping (in a string format) of only one failover
   * region and one associated account.
   *
   * Key: `"failover-regions"`
   *
   * Value: `"[{"region":"&lt;REGION&gt;", "accounts":[{"id":"&lt;ACCOUNT_ID&gt;"}]}]"`
   *
   *
   * * *`excludedResources`*
   *
   * The list of logical resource identifiers to be excluded from the application.
   *
   * Type: Array
   *
   *
   * Don't add the resources that you want to include.
   *
   *
   * Each `excludedResources` array item includes the following fields:
   *
   * * *`logicalResourceIds`*
   *
   * The logical identifier of the resource.
   *
   * Type: Object
   *
   *
   * You can configure only one of the following fields:
   *
   * * `logicalStackName`
   * * `resourceGroupName`
   * * `terraformSourceName`
   * * `eksSourceName`
   *
   *
   * Each `logicalResourceIds` object includes the following fields:
   *
   * * `identifier`
   *
   * The identifier of the resource.
   *
   * Type: String
   *
   * * `logicalStackName`
   *
   * The name of the AWS CloudFormation stack this resource belongs to.
   *
   * Type: String
   *
   * * `resourceGroupName`
   *
   * The name of the resource group this resource belongs to.
   *
   * Type: String
   *
   * * `terraformSourceName`
   *
   * The name of the Terraform S3 state file this resource belongs to.
   *
   * Type: String
   *
   * * `eksSourceName`
   *
   * The name of the Amazon Elastic Kubernetes Service cluster and namespace this resource belongs
   * to.
   *
   *
   * This parameter accepts values in "eks-cluster/namespace" format.
   *
   *
   * Type: String
   *
   * * *`version`*
   *
   * The AWS Resilience Hub application version.
   *
   * * `additionalInfo`
   *
   * Additional configuration parameters for an AWS Resilience Hub application. If you want to
   * implement `additionalInfo` through the AWS Resilience Hub console rather than using an API call,
   * see [Configure the application configuration
   * parameters](https://docs.aws.amazon.com//resilience-hub/latest/userguide/app-config-param.html) .
   *
   *
   * Currently, this parameter accepts a key-value mapping (in a string format) of only one failover
   * region and one associated account.
   *
   * Key: `"failover-regions"`
   *
   * Value: `"[{"region":"&lt;REGION&gt;", "accounts":[{"id":"&lt;ACCOUNT_ID&gt;"}]}]"`
   */
  public fun appTemplateBody(appTemplateBody: String) {
    cdkBuilder.appTemplateBody(appTemplateBody)
  }

  /**
   * @param description The optional description for an app.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param name The name for the application. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param resiliencyPolicyArn The Amazon Resource Name (ARN) of the resiliency policy.
   */
  public fun resiliencyPolicyArn(resiliencyPolicyArn: String) {
    cdkBuilder.resiliencyPolicyArn(resiliencyPolicyArn)
  }

  /**
   * @param resourceMappings An array of ResourceMapping objects. 
   */
  public fun resourceMappings(vararg resourceMappings: Any) {
    _resourceMappings.addAll(listOf(*resourceMappings))
  }

  /**
   * @param resourceMappings An array of ResourceMapping objects. 
   */
  public fun resourceMappings(resourceMappings: Collection<Any>) {
    _resourceMappings.addAll(resourceMappings)
  }

  /**
   * @param resourceMappings An array of ResourceMapping objects. 
   */
  public fun resourceMappings(resourceMappings: IResolvable) {
    cdkBuilder.resourceMappings(resourceMappings)
  }

  /**
   * @param tags The tags assigned to the resource.
   * A tag is a label that you assign to an AWS resource. Each tag consists of a key/value pair.
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnAppProps {
    if(_resourceMappings.isNotEmpty()) cdkBuilder.resourceMappings(_resourceMappings)
    return cdkBuilder.build()
  }
}

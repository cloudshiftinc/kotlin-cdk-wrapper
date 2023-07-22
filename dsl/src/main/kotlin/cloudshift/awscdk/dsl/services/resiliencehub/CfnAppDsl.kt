@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.resiliencehub

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.resiliencehub.CfnApp
import software.constructs.Construct

/**
 * Creates an AWS Resilience Hub application.
 *
 * An AWS Resilience Hub application is a collection of AWS resources structured to prevent and
 * recover AWS application disruptions. To describe a AWS Resilience Hub application, you provide an
 * application name, resources from one or more AWS CloudFormation stacks, AWS Resource Groups ,
 * Terraform state files, AppRegistry applications, and an appropriate resiliency policy. In addition,
 * you can also add resources that are located on Amazon Elastic Kubernetes Service ( Amazon EKS )
 * clusters as optional resources. For more information about the number of resources supported per
 * application, see [Service
 * quotas](https://docs.aws.amazon.com/general/latest/gr/resiliencehub.html#limits_resiliencehub) .
 *
 * After you create an AWS Resilience Hub application, you publish it so that you can run a
 * resiliency assessment on it. You can then use recommendations from the assessment to improve
 * resiliency by running another assessment, comparing results, and then iterating the process until
 * you achieve your goals for recovery time objective (RTO) and recovery point objective (RPO).
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.resiliencehub.*;
 * CfnApp cfnApp = CfnApp.Builder.create(this, "MyCfnApp")
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
public class CfnAppDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnApp.Builder = CfnApp.Builder.create(scope, id)

  private val _resourceMappings: MutableList<Any> = mutableListOf()

  /**
   * Assessment execution schedule with 'Daily' or 'Disabled' values.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-app.html#cfn-resiliencehub-app-appassessmentschedule)
   * @param appAssessmentSchedule Assessment execution schedule with 'Daily' or 'Disabled' values. 
   */
  public fun appAssessmentSchedule(appAssessmentSchedule: String) {
    cdkBuilder.appAssessmentSchedule(appAssessmentSchedule)
  }

  /**
   * A JSON string that provides information about your application structure.
   *
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
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-app.html#cfn-resiliencehub-app-apptemplatebody)
   * @param appTemplateBody A JSON string that provides information about your application
   * structure. 
   */
  public fun appTemplateBody(appTemplateBody: String) {
    cdkBuilder.appTemplateBody(appTemplateBody)
  }

  /**
   * The optional description for an app.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-app.html#cfn-resiliencehub-app-description)
   * @param description The optional description for an app. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The name for the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-app.html#cfn-resiliencehub-app-name)
   * @param name The name for the application. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The Amazon Resource Name (ARN) of the resiliency policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-app.html#cfn-resiliencehub-app-resiliencypolicyarn)
   * @param resiliencyPolicyArn The Amazon Resource Name (ARN) of the resiliency policy. 
   */
  public fun resiliencyPolicyArn(resiliencyPolicyArn: String) {
    cdkBuilder.resiliencyPolicyArn(resiliencyPolicyArn)
  }

  /**
   * An array of ResourceMapping objects.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-app.html#cfn-resiliencehub-app-resourcemappings)
   * @param resourceMappings An array of ResourceMapping objects. 
   */
  public fun resourceMappings(vararg resourceMappings: Any) {
    _resourceMappings.addAll(listOf(*resourceMappings))
  }

  /**
   * An array of ResourceMapping objects.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-app.html#cfn-resiliencehub-app-resourcemappings)
   * @param resourceMappings An array of ResourceMapping objects. 
   */
  public fun resourceMappings(resourceMappings: Collection<Any>) {
    _resourceMappings.addAll(resourceMappings)
  }

  /**
   * An array of ResourceMapping objects.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-app.html#cfn-resiliencehub-app-resourcemappings)
   * @param resourceMappings An array of ResourceMapping objects. 
   */
  public fun resourceMappings(resourceMappings: IResolvable) {
    cdkBuilder.resourceMappings(resourceMappings)
  }

  /**
   * The tags assigned to the resource.
   *
   * A tag is a label that you assign to an AWS resource. Each tag consists of a key/value pair.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-app.html#cfn-resiliencehub-app-tags)
   * @param tags The tags assigned to the resource. 
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnApp {
    if(_resourceMappings.isNotEmpty()) cdkBuilder.resourceMappings(_resourceMappings)
    return cdkBuilder.build()
  }
}

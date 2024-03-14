package io.cloudshiftdev.awscdk.services.resiliencehub

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnAppProps {
  /**
   * Assessment execution schedule with 'Daily' or 'Disabled' values.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-app.html#cfn-resiliencehub-app-appassessmentschedule)
   */
  public fun appAssessmentSchedule(): String? = unwrap(this).getAppAssessmentSchedule()

  /**
   * A JSON string that provides information about your application structure.
   *
   * To learn more about the `appTemplateBody` template, see the sample template in [Sample
   * appTemplateBody
   * template](https://docs.aws.amazon.com//resilience-hub/latest/APIReference/API_PutDraftAppVersionTemplate.html#API_PutDraftAppVersionTemplate_Examples)
   * .
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
   * Identifier of the resource.
   *
   * Type: String
   *
   * * `logicalStackName`
   *
   * Name of the AWS CloudFormation stack this resource belongs to.
   *
   * Type: String
   *
   * * `resourceGroupName`
   *
   * Name of the resource group this resource belongs to.
   *
   * Type: String
   *
   * * `terraformSourceName`
   *
   * Name of the Terraform S3 state file this resource belongs to.
   *
   * Type: String
   *
   * * `eksSourceName`
   *
   * Name of the Amazon Elastic Kubernetes Service cluster and namespace this resource belongs to.
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
   * Name of the resource.
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
   * Name of the AppComponent.
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
   * Name of the AWS CloudFormation stack this resource belongs to.
   *
   * Type: String
   *
   * * `resourceGroupName`
   *
   * Name of the resource group this resource belongs to.
   *
   * Type: String
   *
   * * `terraformSourceName`
   *
   * Name of the Terraform S3 state file this resource belongs to.
   *
   * Type: String
   *
   * * `eksSourceName`
   *
   * Name of the Amazon Elastic Kubernetes Service cluster and namespace this resource belongs to.
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
   */
  public fun appTemplateBody(): String

  /**
   * Optional description for an application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-app.html#cfn-resiliencehub-app-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The list of events you would like to subscribe and get notification for.
   *
   * Currently, AWS Resilience Hub supports notifications only for *Drift detected* and *Scheduled
   * assessment failure* events.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-app.html#cfn-resiliencehub-app-eventsubscriptions)
   */
  public fun eventSubscriptions(): Any? = unwrap(this).getEventSubscriptions()

  /**
   * Name for the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-app.html#cfn-resiliencehub-app-name)
   */
  public fun name(): String

  /**
   * Defines the roles and credentials that AWS Resilience Hub would use while creating the
   * application, importing its resources, and running an assessment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-app.html#cfn-resiliencehub-app-permissionmodel)
   */
  public fun permissionModel(): Any? = unwrap(this).getPermissionModel()

  /**
   * The Amazon Resource Name (ARN) of the resiliency policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-app.html#cfn-resiliencehub-app-resiliencypolicyarn)
   */
  public fun resiliencyPolicyArn(): String? = unwrap(this).getResiliencyPolicyArn()

  /**
   * An array of `ResourceMapping` objects.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-app.html#cfn-resiliencehub-app-resourcemappings)
   */
  public fun resourceMappings(): Any

  /**
   * Tags assigned to the resource.
   *
   * A tag is a label that you assign to an AWS resource. Each tag consists of a key/value pair.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-app.html#cfn-resiliencehub-app-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [CfnAppProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param appAssessmentSchedule Assessment execution schedule with 'Daily' or 'Disabled' values.
     */
    public fun appAssessmentSchedule(appAssessmentSchedule: String)

    /**
     * @param appTemplateBody A JSON string that provides information about your application
     * structure. 
     * To learn more about the `appTemplateBody` template, see the sample template in [Sample
     * appTemplateBody
     * template](https://docs.aws.amazon.com//resilience-hub/latest/APIReference/API_PutDraftAppVersionTemplate.html#API_PutDraftAppVersionTemplate_Examples)
     * .
     *
     * The `appTemplateBody` JSON string has the following structure:
     *
     * * *`resources`*
     *
     * The list of logical resources that needs to be included in the AWS Resilience Hub
     * application.
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
     * Identifier of the resource.
     *
     * Type: String
     *
     * * `logicalStackName`
     *
     * Name of the AWS CloudFormation stack this resource belongs to.
     *
     * Type: String
     *
     * * `resourceGroupName`
     *
     * Name of the resource group this resource belongs to.
     *
     * Type: String
     *
     * * `terraformSourceName`
     *
     * Name of the Terraform S3 state file this resource belongs to.
     *
     * Type: String
     *
     * * `eksSourceName`
     *
     * Name of the Amazon Elastic Kubernetes Service cluster and namespace this resource belongs to.
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
     * Name of the resource.
     *
     * Type: String
     *
     * * `additionalInfo`
     *
     * Additional configuration parameters for an AWS Resilience Hub application. If you want to
     * implement `additionalInfo` through the AWS Resilience Hub console rather than using an API call,
     * see [Configure the application configuration
     * parameters](https://docs.aws.amazon.com//resilience-hub/latest/userguide/app-config-param.html)
     * .
     *
     *
     * Currently, this parameter accepts a key-value mapping (in a string format) of only one
     * failover region and one associated account.
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
     * Name of the AppComponent.
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
     * parameters](https://docs.aws.amazon.com//resilience-hub/latest/userguide/app-config-param.html)
     * .
     *
     *
     * Currently, this parameter accepts a key-value mapping (in a string format) of only one
     * failover region and one associated account.
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
     * Name of the AWS CloudFormation stack this resource belongs to.
     *
     * Type: String
     *
     * * `resourceGroupName`
     *
     * Name of the resource group this resource belongs to.
     *
     * Type: String
     *
     * * `terraformSourceName`
     *
     * Name of the Terraform S3 state file this resource belongs to.
     *
     * Type: String
     *
     * * `eksSourceName`
     *
     * Name of the Amazon Elastic Kubernetes Service cluster and namespace this resource belongs to.
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
     * parameters](https://docs.aws.amazon.com//resilience-hub/latest/userguide/app-config-param.html)
     * .
     *
     *
     * Currently, this parameter accepts a key-value mapping (in a string format) of only one
     * failover region and one associated account.
     *
     * Key: `"failover-regions"`
     *
     * Value: `"[{"region":"&lt;REGION&gt;", "accounts":[{"id":"&lt;ACCOUNT_ID&gt;"}]}]"`
     */
    public fun appTemplateBody(appTemplateBody: String)

    /**
     * @param description Optional description for an application.
     */
    public fun description(description: String)

    /**
     * @param eventSubscriptions The list of events you would like to subscribe and get notification
     * for.
     * Currently, AWS Resilience Hub supports notifications only for *Drift detected* and *Scheduled
     * assessment failure* events.
     */
    public fun eventSubscriptions(eventSubscriptions: IResolvable)

    /**
     * @param eventSubscriptions The list of events you would like to subscribe and get notification
     * for.
     * Currently, AWS Resilience Hub supports notifications only for *Drift detected* and *Scheduled
     * assessment failure* events.
     */
    public fun eventSubscriptions(eventSubscriptions: List<Any>)

    /**
     * @param eventSubscriptions The list of events you would like to subscribe and get notification
     * for.
     * Currently, AWS Resilience Hub supports notifications only for *Drift detected* and *Scheduled
     * assessment failure* events.
     */
    public fun eventSubscriptions(vararg eventSubscriptions: Any)

    /**
     * @param name Name for the application. 
     */
    public fun name(name: String)

    /**
     * @param permissionModel Defines the roles and credentials that AWS Resilience Hub would use
     * while creating the application, importing its resources, and running an assessment.
     */
    public fun permissionModel(permissionModel: IResolvable)

    /**
     * @param permissionModel Defines the roles and credentials that AWS Resilience Hub would use
     * while creating the application, importing its resources, and running an assessment.
     */
    public fun permissionModel(permissionModel: CfnApp.PermissionModelProperty)

    /**
     * @param permissionModel Defines the roles and credentials that AWS Resilience Hub would use
     * while creating the application, importing its resources, and running an assessment.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6b02b544fa5ed4ba64aa9704e58cdb2e7cbbdcc3ea8fbd9ddf6ca6466a8a3a45")
    public fun permissionModel(permissionModel: CfnApp.PermissionModelProperty.Builder.() -> Unit)

    /**
     * @param resiliencyPolicyArn The Amazon Resource Name (ARN) of the resiliency policy.
     */
    public fun resiliencyPolicyArn(resiliencyPolicyArn: String)

    /**
     * @param resourceMappings An array of `ResourceMapping` objects. 
     */
    public fun resourceMappings(resourceMappings: IResolvable)

    /**
     * @param resourceMappings An array of `ResourceMapping` objects. 
     */
    public fun resourceMappings(resourceMappings: List<Any>)

    /**
     * @param resourceMappings An array of `ResourceMapping` objects. 
     */
    public fun resourceMappings(vararg resourceMappings: Any)

    /**
     * @param tags Tags assigned to the resource.
     * A tag is a label that you assign to an AWS resource. Each tag consists of a key/value pair.
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.resiliencehub.CfnAppProps.Builder =
        software.amazon.awscdk.services.resiliencehub.CfnAppProps.builder()

    /**
     * @param appAssessmentSchedule Assessment execution schedule with 'Daily' or 'Disabled' values.
     */
    override fun appAssessmentSchedule(appAssessmentSchedule: String) {
      cdkBuilder.appAssessmentSchedule(appAssessmentSchedule)
    }

    /**
     * @param appTemplateBody A JSON string that provides information about your application
     * structure. 
     * To learn more about the `appTemplateBody` template, see the sample template in [Sample
     * appTemplateBody
     * template](https://docs.aws.amazon.com//resilience-hub/latest/APIReference/API_PutDraftAppVersionTemplate.html#API_PutDraftAppVersionTemplate_Examples)
     * .
     *
     * The `appTemplateBody` JSON string has the following structure:
     *
     * * *`resources`*
     *
     * The list of logical resources that needs to be included in the AWS Resilience Hub
     * application.
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
     * Identifier of the resource.
     *
     * Type: String
     *
     * * `logicalStackName`
     *
     * Name of the AWS CloudFormation stack this resource belongs to.
     *
     * Type: String
     *
     * * `resourceGroupName`
     *
     * Name of the resource group this resource belongs to.
     *
     * Type: String
     *
     * * `terraformSourceName`
     *
     * Name of the Terraform S3 state file this resource belongs to.
     *
     * Type: String
     *
     * * `eksSourceName`
     *
     * Name of the Amazon Elastic Kubernetes Service cluster and namespace this resource belongs to.
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
     * Name of the resource.
     *
     * Type: String
     *
     * * `additionalInfo`
     *
     * Additional configuration parameters for an AWS Resilience Hub application. If you want to
     * implement `additionalInfo` through the AWS Resilience Hub console rather than using an API call,
     * see [Configure the application configuration
     * parameters](https://docs.aws.amazon.com//resilience-hub/latest/userguide/app-config-param.html)
     * .
     *
     *
     * Currently, this parameter accepts a key-value mapping (in a string format) of only one
     * failover region and one associated account.
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
     * Name of the AppComponent.
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
     * parameters](https://docs.aws.amazon.com//resilience-hub/latest/userguide/app-config-param.html)
     * .
     *
     *
     * Currently, this parameter accepts a key-value mapping (in a string format) of only one
     * failover region and one associated account.
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
     * Name of the AWS CloudFormation stack this resource belongs to.
     *
     * Type: String
     *
     * * `resourceGroupName`
     *
     * Name of the resource group this resource belongs to.
     *
     * Type: String
     *
     * * `terraformSourceName`
     *
     * Name of the Terraform S3 state file this resource belongs to.
     *
     * Type: String
     *
     * * `eksSourceName`
     *
     * Name of the Amazon Elastic Kubernetes Service cluster and namespace this resource belongs to.
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
     * parameters](https://docs.aws.amazon.com//resilience-hub/latest/userguide/app-config-param.html)
     * .
     *
     *
     * Currently, this parameter accepts a key-value mapping (in a string format) of only one
     * failover region and one associated account.
     *
     * Key: `"failover-regions"`
     *
     * Value: `"[{"region":"&lt;REGION&gt;", "accounts":[{"id":"&lt;ACCOUNT_ID&gt;"}]}]"`
     */
    override fun appTemplateBody(appTemplateBody: String) {
      cdkBuilder.appTemplateBody(appTemplateBody)
    }

    /**
     * @param description Optional description for an application.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param eventSubscriptions The list of events you would like to subscribe and get notification
     * for.
     * Currently, AWS Resilience Hub supports notifications only for *Drift detected* and *Scheduled
     * assessment failure* events.
     */
    override fun eventSubscriptions(eventSubscriptions: IResolvable) {
      cdkBuilder.eventSubscriptions(eventSubscriptions.let(IResolvable::unwrap))
    }

    /**
     * @param eventSubscriptions The list of events you would like to subscribe and get notification
     * for.
     * Currently, AWS Resilience Hub supports notifications only for *Drift detected* and *Scheduled
     * assessment failure* events.
     */
    override fun eventSubscriptions(eventSubscriptions: List<Any>) {
      cdkBuilder.eventSubscriptions(eventSubscriptions)
    }

    /**
     * @param eventSubscriptions The list of events you would like to subscribe and get notification
     * for.
     * Currently, AWS Resilience Hub supports notifications only for *Drift detected* and *Scheduled
     * assessment failure* events.
     */
    override fun eventSubscriptions(vararg eventSubscriptions: Any): Unit =
        eventSubscriptions(eventSubscriptions.toList())

    /**
     * @param name Name for the application. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param permissionModel Defines the roles and credentials that AWS Resilience Hub would use
     * while creating the application, importing its resources, and running an assessment.
     */
    override fun permissionModel(permissionModel: IResolvable) {
      cdkBuilder.permissionModel(permissionModel.let(IResolvable::unwrap))
    }

    /**
     * @param permissionModel Defines the roles and credentials that AWS Resilience Hub would use
     * while creating the application, importing its resources, and running an assessment.
     */
    override fun permissionModel(permissionModel: CfnApp.PermissionModelProperty) {
      cdkBuilder.permissionModel(permissionModel.let(CfnApp.PermissionModelProperty::unwrap))
    }

    /**
     * @param permissionModel Defines the roles and credentials that AWS Resilience Hub would use
     * while creating the application, importing its resources, and running an assessment.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6b02b544fa5ed4ba64aa9704e58cdb2e7cbbdcc3ea8fbd9ddf6ca6466a8a3a45")
    override
        fun permissionModel(permissionModel: CfnApp.PermissionModelProperty.Builder.() -> Unit):
        Unit = permissionModel(CfnApp.PermissionModelProperty(permissionModel))

    /**
     * @param resiliencyPolicyArn The Amazon Resource Name (ARN) of the resiliency policy.
     */
    override fun resiliencyPolicyArn(resiliencyPolicyArn: String) {
      cdkBuilder.resiliencyPolicyArn(resiliencyPolicyArn)
    }

    /**
     * @param resourceMappings An array of `ResourceMapping` objects. 
     */
    override fun resourceMappings(resourceMappings: IResolvable) {
      cdkBuilder.resourceMappings(resourceMappings.let(IResolvable::unwrap))
    }

    /**
     * @param resourceMappings An array of `ResourceMapping` objects. 
     */
    override fun resourceMappings(resourceMappings: List<Any>) {
      cdkBuilder.resourceMappings(resourceMappings)
    }

    /**
     * @param resourceMappings An array of `ResourceMapping` objects. 
     */
    override fun resourceMappings(vararg resourceMappings: Any): Unit =
        resourceMappings(resourceMappings.toList())

    /**
     * @param tags Tags assigned to the resource.
     * A tag is a label that you assign to an AWS resource. Each tag consists of a key/value pair.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.resiliencehub.CfnAppProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.resiliencehub.CfnAppProps,
  ) : CdkObject(cdkObject), CfnAppProps {
    /**
     * Assessment execution schedule with 'Daily' or 'Disabled' values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-app.html#cfn-resiliencehub-app-appassessmentschedule)
     */
    override fun appAssessmentSchedule(): String? = unwrap(this).getAppAssessmentSchedule()

    /**
     * A JSON string that provides information about your application structure.
     *
     * To learn more about the `appTemplateBody` template, see the sample template in [Sample
     * appTemplateBody
     * template](https://docs.aws.amazon.com//resilience-hub/latest/APIReference/API_PutDraftAppVersionTemplate.html#API_PutDraftAppVersionTemplate_Examples)
     * .
     *
     * The `appTemplateBody` JSON string has the following structure:
     *
     * * *`resources`*
     *
     * The list of logical resources that needs to be included in the AWS Resilience Hub
     * application.
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
     * Identifier of the resource.
     *
     * Type: String
     *
     * * `logicalStackName`
     *
     * Name of the AWS CloudFormation stack this resource belongs to.
     *
     * Type: String
     *
     * * `resourceGroupName`
     *
     * Name of the resource group this resource belongs to.
     *
     * Type: String
     *
     * * `terraformSourceName`
     *
     * Name of the Terraform S3 state file this resource belongs to.
     *
     * Type: String
     *
     * * `eksSourceName`
     *
     * Name of the Amazon Elastic Kubernetes Service cluster and namespace this resource belongs to.
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
     * Name of the resource.
     *
     * Type: String
     *
     * * `additionalInfo`
     *
     * Additional configuration parameters for an AWS Resilience Hub application. If you want to
     * implement `additionalInfo` through the AWS Resilience Hub console rather than using an API call,
     * see [Configure the application configuration
     * parameters](https://docs.aws.amazon.com//resilience-hub/latest/userguide/app-config-param.html)
     * .
     *
     *
     * Currently, this parameter accepts a key-value mapping (in a string format) of only one
     * failover region and one associated account.
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
     * Name of the AppComponent.
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
     * parameters](https://docs.aws.amazon.com//resilience-hub/latest/userguide/app-config-param.html)
     * .
     *
     *
     * Currently, this parameter accepts a key-value mapping (in a string format) of only one
     * failover region and one associated account.
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
     * Name of the AWS CloudFormation stack this resource belongs to.
     *
     * Type: String
     *
     * * `resourceGroupName`
     *
     * Name of the resource group this resource belongs to.
     *
     * Type: String
     *
     * * `terraformSourceName`
     *
     * Name of the Terraform S3 state file this resource belongs to.
     *
     * Type: String
     *
     * * `eksSourceName`
     *
     * Name of the Amazon Elastic Kubernetes Service cluster and namespace this resource belongs to.
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
     * parameters](https://docs.aws.amazon.com//resilience-hub/latest/userguide/app-config-param.html)
     * .
     *
     *
     * Currently, this parameter accepts a key-value mapping (in a string format) of only one
     * failover region and one associated account.
     *
     * Key: `"failover-regions"`
     *
     * Value: `"[{"region":"&lt;REGION&gt;", "accounts":[{"id":"&lt;ACCOUNT_ID&gt;"}]}]"`
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-app.html#cfn-resiliencehub-app-apptemplatebody)
     */
    override fun appTemplateBody(): String = unwrap(this).getAppTemplateBody()

    /**
     * Optional description for an application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-app.html#cfn-resiliencehub-app-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The list of events you would like to subscribe and get notification for.
     *
     * Currently, AWS Resilience Hub supports notifications only for *Drift detected* and *Scheduled
     * assessment failure* events.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-app.html#cfn-resiliencehub-app-eventsubscriptions)
     */
    override fun eventSubscriptions(): Any? = unwrap(this).getEventSubscriptions()

    /**
     * Name for the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-app.html#cfn-resiliencehub-app-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Defines the roles and credentials that AWS Resilience Hub would use while creating the
     * application, importing its resources, and running an assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-app.html#cfn-resiliencehub-app-permissionmodel)
     */
    override fun permissionModel(): Any? = unwrap(this).getPermissionModel()

    /**
     * The Amazon Resource Name (ARN) of the resiliency policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-app.html#cfn-resiliencehub-app-resiliencypolicyarn)
     */
    override fun resiliencyPolicyArn(): String? = unwrap(this).getResiliencyPolicyArn()

    /**
     * An array of `ResourceMapping` objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-app.html#cfn-resiliencehub-app-resourcemappings)
     */
    override fun resourceMappings(): Any = unwrap(this).getResourceMappings()

    /**
     * Tags assigned to the resource.
     *
     * A tag is a label that you assign to an AWS resource. Each tag consists of a key/value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-app.html#cfn-resiliencehub-app-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAppProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.resiliencehub.CfnAppProps):
        CfnAppProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAppProps):
        software.amazon.awscdk.services.resiliencehub.CfnAppProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.resiliencehub.CfnAppProps
  }
}

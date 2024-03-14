package io.cloudshiftdev.awscdk.services.resiliencehub

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnApp internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.resiliencehub.CfnApp,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * Assessment execution schedule with 'Daily' or 'Disabled' values.
   */
  public open fun appAssessmentSchedule(): String? = unwrap(this).getAppAssessmentSchedule()

  /**
   * Assessment execution schedule with 'Daily' or 'Disabled' values.
   */
  public open fun appAssessmentSchedule(`value`: String) {
    unwrap(this).setAppAssessmentSchedule(`value`)
  }

  /**
   * A JSON string that provides information about your application structure.
   */
  public open fun appTemplateBody(): String = unwrap(this).getAppTemplateBody()

  /**
   * A JSON string that provides information about your application structure.
   */
  public open fun appTemplateBody(`value`: String) {
    unwrap(this).setAppTemplateBody(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the applcation.
   */
  public open fun attrAppArn(): String = unwrap(this).getAttrAppArn()

  /**
   * Indicates if compliance drifts (deviations) were detected while running an assessment for your
   * application.
   */
  public open fun attrDriftStatus(): String = unwrap(this).getAttrDriftStatus()

  /**
   * Optional description for an application.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * Optional description for an application.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The list of events you would like to subscribe and get notification for.
   */
  public open fun eventSubscriptions(): Any? = unwrap(this).getEventSubscriptions()

  /**
   * The list of events you would like to subscribe and get notification for.
   */
  public open fun eventSubscriptions(`value`: IResolvable) {
    unwrap(this).setEventSubscriptions(`value`.let(IResolvable::unwrap))
  }

  /**
   * The list of events you would like to subscribe and get notification for.
   */
  public open fun eventSubscriptions(__idx_ac66f0: List<Any>) {
    unwrap(this).setEventSubscriptions(__idx_ac66f0)
  }

  /**
   * The list of events you would like to subscribe and get notification for.
   */
  public open fun eventSubscriptions(vararg __idx_ac66f0: Any): Unit =
      eventSubscriptions(__idx_ac66f0.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Name for the application.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * Name for the application.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Defines the roles and credentials that AWS Resilience Hub would use while creating the
   * application, importing its resources, and running an assessment.
   */
  public open fun permissionModel(): Any? = unwrap(this).getPermissionModel()

  /**
   * Defines the roles and credentials that AWS Resilience Hub would use while creating the
   * application, importing its resources, and running an assessment.
   */
  public open fun permissionModel(`value`: IResolvable) {
    unwrap(this).setPermissionModel(`value`.let(IResolvable::unwrap))
  }

  /**
   * Defines the roles and credentials that AWS Resilience Hub would use while creating the
   * application, importing its resources, and running an assessment.
   */
  public open fun permissionModel(`value`: PermissionModelProperty) {
    unwrap(this).setPermissionModel(`value`.let(PermissionModelProperty::unwrap))
  }

  /**
   * Defines the roles and credentials that AWS Resilience Hub would use while creating the
   * application, importing its resources, and running an assessment.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("988833bbbe80c93635949df8398ad51e65c61407395aa2045bd67ce8d5780388")
  public open fun permissionModel(`value`: PermissionModelProperty.Builder.() -> Unit): Unit =
      permissionModel(PermissionModelProperty(`value`))

  /**
   * The Amazon Resource Name (ARN) of the resiliency policy.
   */
  public open fun resiliencyPolicyArn(): String? = unwrap(this).getResiliencyPolicyArn()

  /**
   * The Amazon Resource Name (ARN) of the resiliency policy.
   */
  public open fun resiliencyPolicyArn(`value`: String) {
    unwrap(this).setResiliencyPolicyArn(`value`)
  }

  /**
   * An array of `ResourceMapping` objects.
   */
  public open fun resourceMappings(): Any = unwrap(this).getResourceMappings()

  /**
   * An array of `ResourceMapping` objects.
   */
  public open fun resourceMappings(`value`: IResolvable) {
    unwrap(this).setResourceMappings(`value`.let(IResolvable::unwrap))
  }

  /**
   * An array of `ResourceMapping` objects.
   */
  public open fun resourceMappings(__idx_ac66f0: List<Any>) {
    unwrap(this).setResourceMappings(__idx_ac66f0)
  }

  /**
   * An array of `ResourceMapping` objects.
   */
  public open fun resourceMappings(vararg __idx_ac66f0: Any): Unit =
      resourceMappings(__idx_ac66f0.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Tags assigned to the resource.
   */
  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  /**
   * Tags assigned to the resource.
   */
  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.resiliencehub.CfnApp].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Assessment execution schedule with 'Daily' or 'Disabled' values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-app.html#cfn-resiliencehub-app-appassessmentschedule)
     * @param appAssessmentSchedule Assessment execution schedule with 'Daily' or 'Disabled' values.
     * 
     */
    public fun appAssessmentSchedule(appAssessmentSchedule: String)

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
     * @param appTemplateBody A JSON string that provides information about your application
     * structure. 
     */
    public fun appTemplateBody(appTemplateBody: String)

    /**
     * Optional description for an application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-app.html#cfn-resiliencehub-app-description)
     * @param description Optional description for an application. 
     */
    public fun description(description: String)

    /**
     * The list of events you would like to subscribe and get notification for.
     *
     * Currently, AWS Resilience Hub supports notifications only for *Drift detected* and *Scheduled
     * assessment failure* events.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-app.html#cfn-resiliencehub-app-eventsubscriptions)
     * @param eventSubscriptions The list of events you would like to subscribe and get notification
     * for. 
     */
    public fun eventSubscriptions(eventSubscriptions: IResolvable)

    /**
     * The list of events you would like to subscribe and get notification for.
     *
     * Currently, AWS Resilience Hub supports notifications only for *Drift detected* and *Scheduled
     * assessment failure* events.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-app.html#cfn-resiliencehub-app-eventsubscriptions)
     * @param eventSubscriptions The list of events you would like to subscribe and get notification
     * for. 
     */
    public fun eventSubscriptions(eventSubscriptions: List<Any>)

    /**
     * The list of events you would like to subscribe and get notification for.
     *
     * Currently, AWS Resilience Hub supports notifications only for *Drift detected* and *Scheduled
     * assessment failure* events.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-app.html#cfn-resiliencehub-app-eventsubscriptions)
     * @param eventSubscriptions The list of events you would like to subscribe and get notification
     * for. 
     */
    public fun eventSubscriptions(vararg eventSubscriptions: Any)

    /**
     * Name for the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-app.html#cfn-resiliencehub-app-name)
     * @param name Name for the application. 
     */
    public fun name(name: String)

    /**
     * Defines the roles and credentials that AWS Resilience Hub would use while creating the
     * application, importing its resources, and running an assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-app.html#cfn-resiliencehub-app-permissionmodel)
     * @param permissionModel Defines the roles and credentials that AWS Resilience Hub would use
     * while creating the application, importing its resources, and running an assessment. 
     */
    public fun permissionModel(permissionModel: IResolvable)

    /**
     * Defines the roles and credentials that AWS Resilience Hub would use while creating the
     * application, importing its resources, and running an assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-app.html#cfn-resiliencehub-app-permissionmodel)
     * @param permissionModel Defines the roles and credentials that AWS Resilience Hub would use
     * while creating the application, importing its resources, and running an assessment. 
     */
    public fun permissionModel(permissionModel: PermissionModelProperty)

    /**
     * Defines the roles and credentials that AWS Resilience Hub would use while creating the
     * application, importing its resources, and running an assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-app.html#cfn-resiliencehub-app-permissionmodel)
     * @param permissionModel Defines the roles and credentials that AWS Resilience Hub would use
     * while creating the application, importing its resources, and running an assessment. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e918c216fb8f3bf92d254812b276851f7aa4316f4e196983dece2146130f3aca")
    public fun permissionModel(permissionModel: PermissionModelProperty.Builder.() -> Unit)

    /**
     * The Amazon Resource Name (ARN) of the resiliency policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-app.html#cfn-resiliencehub-app-resiliencypolicyarn)
     * @param resiliencyPolicyArn The Amazon Resource Name (ARN) of the resiliency policy. 
     */
    public fun resiliencyPolicyArn(resiliencyPolicyArn: String)

    /**
     * An array of `ResourceMapping` objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-app.html#cfn-resiliencehub-app-resourcemappings)
     * @param resourceMappings An array of `ResourceMapping` objects. 
     */
    public fun resourceMappings(resourceMappings: IResolvable)

    /**
     * An array of `ResourceMapping` objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-app.html#cfn-resiliencehub-app-resourcemappings)
     * @param resourceMappings An array of `ResourceMapping` objects. 
     */
    public fun resourceMappings(resourceMappings: List<Any>)

    /**
     * An array of `ResourceMapping` objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-app.html#cfn-resiliencehub-app-resourcemappings)
     * @param resourceMappings An array of `ResourceMapping` objects. 
     */
    public fun resourceMappings(vararg resourceMappings: Any)

    /**
     * Tags assigned to the resource.
     *
     * A tag is a label that you assign to an AWS resource. Each tag consists of a key/value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-app.html#cfn-resiliencehub-app-tags)
     * @param tags Tags assigned to the resource. 
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.resiliencehub.CfnApp.Builder =
        software.amazon.awscdk.services.resiliencehub.CfnApp.Builder.create(scope, id)

    /**
     * Assessment execution schedule with 'Daily' or 'Disabled' values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-app.html#cfn-resiliencehub-app-appassessmentschedule)
     * @param appAssessmentSchedule Assessment execution schedule with 'Daily' or 'Disabled' values.
     * 
     */
    override fun appAssessmentSchedule(appAssessmentSchedule: String) {
      cdkBuilder.appAssessmentSchedule(appAssessmentSchedule)
    }

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
     * @param appTemplateBody A JSON string that provides information about your application
     * structure. 
     */
    override fun appTemplateBody(appTemplateBody: String) {
      cdkBuilder.appTemplateBody(appTemplateBody)
    }

    /**
     * Optional description for an application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-app.html#cfn-resiliencehub-app-description)
     * @param description Optional description for an application. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The list of events you would like to subscribe and get notification for.
     *
     * Currently, AWS Resilience Hub supports notifications only for *Drift detected* and *Scheduled
     * assessment failure* events.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-app.html#cfn-resiliencehub-app-eventsubscriptions)
     * @param eventSubscriptions The list of events you would like to subscribe and get notification
     * for. 
     */
    override fun eventSubscriptions(eventSubscriptions: IResolvable) {
      cdkBuilder.eventSubscriptions(eventSubscriptions.let(IResolvable::unwrap))
    }

    /**
     * The list of events you would like to subscribe and get notification for.
     *
     * Currently, AWS Resilience Hub supports notifications only for *Drift detected* and *Scheduled
     * assessment failure* events.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-app.html#cfn-resiliencehub-app-eventsubscriptions)
     * @param eventSubscriptions The list of events you would like to subscribe and get notification
     * for. 
     */
    override fun eventSubscriptions(eventSubscriptions: List<Any>) {
      cdkBuilder.eventSubscriptions(eventSubscriptions)
    }

    /**
     * The list of events you would like to subscribe and get notification for.
     *
     * Currently, AWS Resilience Hub supports notifications only for *Drift detected* and *Scheduled
     * assessment failure* events.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-app.html#cfn-resiliencehub-app-eventsubscriptions)
     * @param eventSubscriptions The list of events you would like to subscribe and get notification
     * for. 
     */
    override fun eventSubscriptions(vararg eventSubscriptions: Any): Unit =
        eventSubscriptions(eventSubscriptions.toList())

    /**
     * Name for the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-app.html#cfn-resiliencehub-app-name)
     * @param name Name for the application. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Defines the roles and credentials that AWS Resilience Hub would use while creating the
     * application, importing its resources, and running an assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-app.html#cfn-resiliencehub-app-permissionmodel)
     * @param permissionModel Defines the roles and credentials that AWS Resilience Hub would use
     * while creating the application, importing its resources, and running an assessment. 
     */
    override fun permissionModel(permissionModel: IResolvable) {
      cdkBuilder.permissionModel(permissionModel.let(IResolvable::unwrap))
    }

    /**
     * Defines the roles and credentials that AWS Resilience Hub would use while creating the
     * application, importing its resources, and running an assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-app.html#cfn-resiliencehub-app-permissionmodel)
     * @param permissionModel Defines the roles and credentials that AWS Resilience Hub would use
     * while creating the application, importing its resources, and running an assessment. 
     */
    override fun permissionModel(permissionModel: PermissionModelProperty) {
      cdkBuilder.permissionModel(permissionModel.let(PermissionModelProperty::unwrap))
    }

    /**
     * Defines the roles and credentials that AWS Resilience Hub would use while creating the
     * application, importing its resources, and running an assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-app.html#cfn-resiliencehub-app-permissionmodel)
     * @param permissionModel Defines the roles and credentials that AWS Resilience Hub would use
     * while creating the application, importing its resources, and running an assessment. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e918c216fb8f3bf92d254812b276851f7aa4316f4e196983dece2146130f3aca")
    override fun permissionModel(permissionModel: PermissionModelProperty.Builder.() -> Unit): Unit
        = permissionModel(PermissionModelProperty(permissionModel))

    /**
     * The Amazon Resource Name (ARN) of the resiliency policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-app.html#cfn-resiliencehub-app-resiliencypolicyarn)
     * @param resiliencyPolicyArn The Amazon Resource Name (ARN) of the resiliency policy. 
     */
    override fun resiliencyPolicyArn(resiliencyPolicyArn: String) {
      cdkBuilder.resiliencyPolicyArn(resiliencyPolicyArn)
    }

    /**
     * An array of `ResourceMapping` objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-app.html#cfn-resiliencehub-app-resourcemappings)
     * @param resourceMappings An array of `ResourceMapping` objects. 
     */
    override fun resourceMappings(resourceMappings: IResolvable) {
      cdkBuilder.resourceMappings(resourceMappings.let(IResolvable::unwrap))
    }

    /**
     * An array of `ResourceMapping` objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-app.html#cfn-resiliencehub-app-resourcemappings)
     * @param resourceMappings An array of `ResourceMapping` objects. 
     */
    override fun resourceMappings(resourceMappings: List<Any>) {
      cdkBuilder.resourceMappings(resourceMappings)
    }

    /**
     * An array of `ResourceMapping` objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-app.html#cfn-resiliencehub-app-resourcemappings)
     * @param resourceMappings An array of `ResourceMapping` objects. 
     */
    override fun resourceMappings(vararg resourceMappings: Any): Unit =
        resourceMappings(resourceMappings.toList())

    /**
     * Tags assigned to the resource.
     *
     * A tag is a label that you assign to an AWS resource. Each tag consists of a key/value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-app.html#cfn-resiliencehub-app-tags)
     * @param tags Tags assigned to the resource. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.resiliencehub.CfnApp = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.resiliencehub.CfnApp.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApp {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApp(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.resiliencehub.CfnApp): CfnApp =
        CfnApp(cdkObject)

    internal fun unwrap(wrapped: CfnApp): software.amazon.awscdk.services.resiliencehub.CfnApp =
        wrapped.cdkObject
  }

  public interface PhysicalResourceIdProperty {
    /**
     * The AWS account that owns the physical resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resiliencehub-app-physicalresourceid.html#cfn-resiliencehub-app-physicalresourceid-awsaccountid)
     */
    public fun awsAccountId(): String? = unwrap(this).getAwsAccountId()

    /**
     * The AWS Region that the physical resource is located in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resiliencehub-app-physicalresourceid.html#cfn-resiliencehub-app-physicalresourceid-awsregion)
     */
    public fun awsRegion(): String? = unwrap(this).getAwsRegion()

    /**
     * Identifier of the physical resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resiliencehub-app-physicalresourceid.html#cfn-resiliencehub-app-physicalresourceid-identifier)
     */
    public fun identifier(): String

    /**
     * Specifies the type of physical resource identifier.
     *
     * * **Arn** - The resource identifier is an Amazon Resource Name (ARN) and it can identify the
     * following list of resources:
     * * `AWS::ECS::Service`
     * * `AWS::EFS::FileSystem`
     * * `AWS::ElasticLoadBalancingV2::LoadBalancer`
     * * `AWS::Lambda::Function`
     * * `AWS::SNS::Topic`
     * * **Native** - The resource identifier is an AWS Resilience Hub -native identifier and it can
     * identify the following list of resources:
     * * `AWS::ApiGateway::RestApi`
     * * `AWS::ApiGatewayV2::Api`
     * * `AWS::AutoScaling::AutoScalingGroup`
     * * `AWS::DocDB::DBCluster`
     * * `AWS::DocDB::DBGlobalCluster`
     * * `AWS::DocDB::DBInstance`
     * * `AWS::DynamoDB::GlobalTable`
     * * `AWS::DynamoDB::Table`
     * * `AWS::EC2::EC2Fleet`
     * * `AWS::EC2::Instance`
     * * `AWS::EC2::NatGateway`
     * * `AWS::EC2::Volume`
     * * `AWS::ElasticLoadBalancing::LoadBalancer`
     * * `AWS::RDS::DBCluster`
     * * `AWS::RDS::DBInstance`
     * * `AWS::RDS::GlobalCluster`
     * * `AWS::Route53::RecordSet`
     * * `AWS::S3::Bucket`
     * * `AWS::SQS::Queue`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resiliencehub-app-physicalresourceid.html#cfn-resiliencehub-app-physicalresourceid-type)
     */
    public fun type(): String

    /**
     * A builder for [PhysicalResourceIdProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param awsAccountId The AWS account that owns the physical resource.
       */
      public fun awsAccountId(awsAccountId: String)

      /**
       * @param awsRegion The AWS Region that the physical resource is located in.
       */
      public fun awsRegion(awsRegion: String)

      /**
       * @param identifier Identifier of the physical resource. 
       */
      public fun identifier(identifier: String)

      /**
       * @param type Specifies the type of physical resource identifier. 
       * * **Arn** - The resource identifier is an Amazon Resource Name (ARN) and it can identify
       * the following list of resources:
       * * `AWS::ECS::Service`
       * * `AWS::EFS::FileSystem`
       * * `AWS::ElasticLoadBalancingV2::LoadBalancer`
       * * `AWS::Lambda::Function`
       * * `AWS::SNS::Topic`
       * * **Native** - The resource identifier is an AWS Resilience Hub -native identifier and it
       * can identify the following list of resources:
       * * `AWS::ApiGateway::RestApi`
       * * `AWS::ApiGatewayV2::Api`
       * * `AWS::AutoScaling::AutoScalingGroup`
       * * `AWS::DocDB::DBCluster`
       * * `AWS::DocDB::DBGlobalCluster`
       * * `AWS::DocDB::DBInstance`
       * * `AWS::DynamoDB::GlobalTable`
       * * `AWS::DynamoDB::Table`
       * * `AWS::EC2::EC2Fleet`
       * * `AWS::EC2::Instance`
       * * `AWS::EC2::NatGateway`
       * * `AWS::EC2::Volume`
       * * `AWS::ElasticLoadBalancing::LoadBalancer`
       * * `AWS::RDS::DBCluster`
       * * `AWS::RDS::DBInstance`
       * * `AWS::RDS::GlobalCluster`
       * * `AWS::Route53::RecordSet`
       * * `AWS::S3::Bucket`
       * * `AWS::SQS::Queue`
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.resiliencehub.CfnApp.PhysicalResourceIdProperty.Builder =
          software.amazon.awscdk.services.resiliencehub.CfnApp.PhysicalResourceIdProperty.builder()

      /**
       * @param awsAccountId The AWS account that owns the physical resource.
       */
      override fun awsAccountId(awsAccountId: String) {
        cdkBuilder.awsAccountId(awsAccountId)
      }

      /**
       * @param awsRegion The AWS Region that the physical resource is located in.
       */
      override fun awsRegion(awsRegion: String) {
        cdkBuilder.awsRegion(awsRegion)
      }

      /**
       * @param identifier Identifier of the physical resource. 
       */
      override fun identifier(identifier: String) {
        cdkBuilder.identifier(identifier)
      }

      /**
       * @param type Specifies the type of physical resource identifier. 
       * * **Arn** - The resource identifier is an Amazon Resource Name (ARN) and it can identify
       * the following list of resources:
       * * `AWS::ECS::Service`
       * * `AWS::EFS::FileSystem`
       * * `AWS::ElasticLoadBalancingV2::LoadBalancer`
       * * `AWS::Lambda::Function`
       * * `AWS::SNS::Topic`
       * * **Native** - The resource identifier is an AWS Resilience Hub -native identifier and it
       * can identify the following list of resources:
       * * `AWS::ApiGateway::RestApi`
       * * `AWS::ApiGatewayV2::Api`
       * * `AWS::AutoScaling::AutoScalingGroup`
       * * `AWS::DocDB::DBCluster`
       * * `AWS::DocDB::DBGlobalCluster`
       * * `AWS::DocDB::DBInstance`
       * * `AWS::DynamoDB::GlobalTable`
       * * `AWS::DynamoDB::Table`
       * * `AWS::EC2::EC2Fleet`
       * * `AWS::EC2::Instance`
       * * `AWS::EC2::NatGateway`
       * * `AWS::EC2::Volume`
       * * `AWS::ElasticLoadBalancing::LoadBalancer`
       * * `AWS::RDS::DBCluster`
       * * `AWS::RDS::DBInstance`
       * * `AWS::RDS::GlobalCluster`
       * * `AWS::Route53::RecordSet`
       * * `AWS::S3::Bucket`
       * * `AWS::SQS::Queue`
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.resiliencehub.CfnApp.PhysicalResourceIdProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.resiliencehub.CfnApp.PhysicalResourceIdProperty,
    ) : CdkObject(cdkObject), PhysicalResourceIdProperty {
      /**
       * The AWS account that owns the physical resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resiliencehub-app-physicalresourceid.html#cfn-resiliencehub-app-physicalresourceid-awsaccountid)
       */
      override fun awsAccountId(): String? = unwrap(this).getAwsAccountId()

      /**
       * The AWS Region that the physical resource is located in.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resiliencehub-app-physicalresourceid.html#cfn-resiliencehub-app-physicalresourceid-awsregion)
       */
      override fun awsRegion(): String? = unwrap(this).getAwsRegion()

      /**
       * Identifier of the physical resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resiliencehub-app-physicalresourceid.html#cfn-resiliencehub-app-physicalresourceid-identifier)
       */
      override fun identifier(): String = unwrap(this).getIdentifier()

      /**
       * Specifies the type of physical resource identifier.
       *
       * * **Arn** - The resource identifier is an Amazon Resource Name (ARN) and it can identify
       * the following list of resources:
       * * `AWS::ECS::Service`
       * * `AWS::EFS::FileSystem`
       * * `AWS::ElasticLoadBalancingV2::LoadBalancer`
       * * `AWS::Lambda::Function`
       * * `AWS::SNS::Topic`
       * * **Native** - The resource identifier is an AWS Resilience Hub -native identifier and it
       * can identify the following list of resources:
       * * `AWS::ApiGateway::RestApi`
       * * `AWS::ApiGatewayV2::Api`
       * * `AWS::AutoScaling::AutoScalingGroup`
       * * `AWS::DocDB::DBCluster`
       * * `AWS::DocDB::DBGlobalCluster`
       * * `AWS::DocDB::DBInstance`
       * * `AWS::DynamoDB::GlobalTable`
       * * `AWS::DynamoDB::Table`
       * * `AWS::EC2::EC2Fleet`
       * * `AWS::EC2::Instance`
       * * `AWS::EC2::NatGateway`
       * * `AWS::EC2::Volume`
       * * `AWS::ElasticLoadBalancing::LoadBalancer`
       * * `AWS::RDS::DBCluster`
       * * `AWS::RDS::DBInstance`
       * * `AWS::RDS::GlobalCluster`
       * * `AWS::Route53::RecordSet`
       * * `AWS::S3::Bucket`
       * * `AWS::SQS::Queue`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resiliencehub-app-physicalresourceid.html#cfn-resiliencehub-app-physicalresourceid-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PhysicalResourceIdProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.resiliencehub.CfnApp.PhysicalResourceIdProperty):
          PhysicalResourceIdProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PhysicalResourceIdProperty):
          software.amazon.awscdk.services.resiliencehub.CfnApp.PhysicalResourceIdProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.resiliencehub.CfnApp.PhysicalResourceIdProperty
    }
  }

  public interface PermissionModelProperty {
    /**
     * Defines a list of role Amazon Resource Names (ARNs) to be used in other accounts.
     *
     * These ARNs are used for querying purposes while importing resources and assessing your
     * application.
     *
     *
     * * These ARNs are required only when your resources are in other accounts and you have
     * different role name in these accounts. Else, the invoker role name will be used in the other
     * accounts.
     * * These roles must have a trust policy with `iam:AssumeRole` permission to the invoker role
     * in the primary account.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resiliencehub-app-permissionmodel.html#cfn-resiliencehub-app-permissionmodel-crossaccountrolearns)
     */
    public fun crossAccountRoleArns(): List<String> = unwrap(this).getCrossAccountRoleArns() ?:
        emptyList()

    /**
     * Existing AWS IAM role name in the primary AWS account that will be assumed by AWS Resilience
     * Hub Service Principle to obtain a read-only access to your application resources while running
     * an assessment.
     *
     *
     * * You must have `iam:passRole` permission for this role while creating or updating the
     * application.
     * * Currently, `invokerRoleName` accepts only `[A-Za-z0-9_+=,.&#64;-]` characters.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resiliencehub-app-permissionmodel.html#cfn-resiliencehub-app-permissionmodel-invokerrolename)
     */
    public fun invokerRoleName(): String? = unwrap(this).getInvokerRoleName()

    /**
     * Defines how AWS Resilience Hub scans your resources.
     *
     * It can scan for the resources by using a pre-existing role in your AWS account, or by using
     * the credentials of the current IAM user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resiliencehub-app-permissionmodel.html#cfn-resiliencehub-app-permissionmodel-type)
     */
    public fun type(): String

    /**
     * A builder for [PermissionModelProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param crossAccountRoleArns Defines a list of role Amazon Resource Names (ARNs) to be used
       * in other accounts.
       * These ARNs are used for querying purposes while importing resources and assessing your
       * application.
       *
       *
       * * These ARNs are required only when your resources are in other accounts and you have
       * different role name in these accounts. Else, the invoker role name will be used in the other
       * accounts.
       * * These roles must have a trust policy with `iam:AssumeRole` permission to the invoker role
       * in the primary account.
       */
      public fun crossAccountRoleArns(crossAccountRoleArns: List<String>)

      /**
       * @param crossAccountRoleArns Defines a list of role Amazon Resource Names (ARNs) to be used
       * in other accounts.
       * These ARNs are used for querying purposes while importing resources and assessing your
       * application.
       *
       *
       * * These ARNs are required only when your resources are in other accounts and you have
       * different role name in these accounts. Else, the invoker role name will be used in the other
       * accounts.
       * * These roles must have a trust policy with `iam:AssumeRole` permission to the invoker role
       * in the primary account.
       */
      public fun crossAccountRoleArns(vararg crossAccountRoleArns: String)

      /**
       * @param invokerRoleName Existing AWS IAM role name in the primary AWS account that will be
       * assumed by AWS Resilience Hub Service Principle to obtain a read-only access to your
       * application resources while running an assessment.
       *
       * * You must have `iam:passRole` permission for this role while creating or updating the
       * application.
       * * Currently, `invokerRoleName` accepts only `[A-Za-z0-9_+=,.&#64;-]` characters.
       */
      public fun invokerRoleName(invokerRoleName: String)

      /**
       * @param type Defines how AWS Resilience Hub scans your resources. 
       * It can scan for the resources by using a pre-existing role in your AWS account, or by using
       * the credentials of the current IAM user.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.resiliencehub.CfnApp.PermissionModelProperty.Builder =
          software.amazon.awscdk.services.resiliencehub.CfnApp.PermissionModelProperty.builder()

      /**
       * @param crossAccountRoleArns Defines a list of role Amazon Resource Names (ARNs) to be used
       * in other accounts.
       * These ARNs are used for querying purposes while importing resources and assessing your
       * application.
       *
       *
       * * These ARNs are required only when your resources are in other accounts and you have
       * different role name in these accounts. Else, the invoker role name will be used in the other
       * accounts.
       * * These roles must have a trust policy with `iam:AssumeRole` permission to the invoker role
       * in the primary account.
       */
      override fun crossAccountRoleArns(crossAccountRoleArns: List<String>) {
        cdkBuilder.crossAccountRoleArns(crossAccountRoleArns)
      }

      /**
       * @param crossAccountRoleArns Defines a list of role Amazon Resource Names (ARNs) to be used
       * in other accounts.
       * These ARNs are used for querying purposes while importing resources and assessing your
       * application.
       *
       *
       * * These ARNs are required only when your resources are in other accounts and you have
       * different role name in these accounts. Else, the invoker role name will be used in the other
       * accounts.
       * * These roles must have a trust policy with `iam:AssumeRole` permission to the invoker role
       * in the primary account.
       */
      override fun crossAccountRoleArns(vararg crossAccountRoleArns: String): Unit =
          crossAccountRoleArns(crossAccountRoleArns.toList())

      /**
       * @param invokerRoleName Existing AWS IAM role name in the primary AWS account that will be
       * assumed by AWS Resilience Hub Service Principle to obtain a read-only access to your
       * application resources while running an assessment.
       *
       * * You must have `iam:passRole` permission for this role while creating or updating the
       * application.
       * * Currently, `invokerRoleName` accepts only `[A-Za-z0-9_+=,.&#64;-]` characters.
       */
      override fun invokerRoleName(invokerRoleName: String) {
        cdkBuilder.invokerRoleName(invokerRoleName)
      }

      /**
       * @param type Defines how AWS Resilience Hub scans your resources. 
       * It can scan for the resources by using a pre-existing role in your AWS account, or by using
       * the credentials of the current IAM user.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.resiliencehub.CfnApp.PermissionModelProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.resiliencehub.CfnApp.PermissionModelProperty,
    ) : CdkObject(cdkObject), PermissionModelProperty {
      /**
       * Defines a list of role Amazon Resource Names (ARNs) to be used in other accounts.
       *
       * These ARNs are used for querying purposes while importing resources and assessing your
       * application.
       *
       *
       * * These ARNs are required only when your resources are in other accounts and you have
       * different role name in these accounts. Else, the invoker role name will be used in the other
       * accounts.
       * * These roles must have a trust policy with `iam:AssumeRole` permission to the invoker role
       * in the primary account.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resiliencehub-app-permissionmodel.html#cfn-resiliencehub-app-permissionmodel-crossaccountrolearns)
       */
      override fun crossAccountRoleArns(): List<String> = unwrap(this).getCrossAccountRoleArns() ?:
          emptyList()

      /**
       * Existing AWS IAM role name in the primary AWS account that will be assumed by AWS
       * Resilience Hub Service Principle to obtain a read-only access to your application resources
       * while running an assessment.
       *
       *
       * * You must have `iam:passRole` permission for this role while creating or updating the
       * application.
       * * Currently, `invokerRoleName` accepts only `[A-Za-z0-9_+=,.&#64;-]` characters.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resiliencehub-app-permissionmodel.html#cfn-resiliencehub-app-permissionmodel-invokerrolename)
       */
      override fun invokerRoleName(): String? = unwrap(this).getInvokerRoleName()

      /**
       * Defines how AWS Resilience Hub scans your resources.
       *
       * It can scan for the resources by using a pre-existing role in your AWS account, or by using
       * the credentials of the current IAM user.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resiliencehub-app-permissionmodel.html#cfn-resiliencehub-app-permissionmodel-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PermissionModelProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.resiliencehub.CfnApp.PermissionModelProperty):
          PermissionModelProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PermissionModelProperty):
          software.amazon.awscdk.services.resiliencehub.CfnApp.PermissionModelProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.resiliencehub.CfnApp.PermissionModelProperty
    }
  }

  public interface ResourceMappingProperty {
    /**
     * Name of the Amazon Elastic Kubernetes Service cluster and namespace that this resource is
     * mapped to when the `mappingType` is `EKS` .
     *
     *
     * This parameter accepts values in "eks-cluster/namespace" format.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resiliencehub-app-resourcemapping.html#cfn-resiliencehub-app-resourcemapping-ekssourcename)
     */
    public fun eksSourceName(): String? = unwrap(this).getEksSourceName()

    /**
     * Name of the AWS CloudFormation stack this resource is mapped to when the `mappingType` is
     * `CfnStack` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resiliencehub-app-resourcemapping.html#cfn-resiliencehub-app-resourcemapping-logicalstackname)
     */
    public fun logicalStackName(): String? = unwrap(this).getLogicalStackName()

    /**
     * Specifies the type of resource mapping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resiliencehub-app-resourcemapping.html#cfn-resiliencehub-app-resourcemapping-mappingtype)
     */
    public fun mappingType(): String

    /**
     * Identifier of the physical resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resiliencehub-app-resourcemapping.html#cfn-resiliencehub-app-resourcemapping-physicalresourceid)
     */
    public fun physicalResourceId(): Any

    /**
     * Name of the resource that this resource is mapped to when the `mappingType` is `Resource` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resiliencehub-app-resourcemapping.html#cfn-resiliencehub-app-resourcemapping-resourcename)
     */
    public fun resourceName(): String? = unwrap(this).getResourceName()

    /**
     * Name of the Terraform source that this resource is mapped to when the `mappingType` is
     * `Terraform` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resiliencehub-app-resourcemapping.html#cfn-resiliencehub-app-resourcemapping-terraformsourcename)
     */
    public fun terraformSourceName(): String? = unwrap(this).getTerraformSourceName()

    /**
     * A builder for [ResourceMappingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param eksSourceName Name of the Amazon Elastic Kubernetes Service cluster and namespace
       * that this resource is mapped to when the `mappingType` is `EKS` .
       *
       * This parameter accepts values in "eks-cluster/namespace" format.
       */
      public fun eksSourceName(eksSourceName: String)

      /**
       * @param logicalStackName Name of the AWS CloudFormation stack this resource is mapped to
       * when the `mappingType` is `CfnStack` .
       */
      public fun logicalStackName(logicalStackName: String)

      /**
       * @param mappingType Specifies the type of resource mapping. 
       */
      public fun mappingType(mappingType: String)

      /**
       * @param physicalResourceId Identifier of the physical resource. 
       */
      public fun physicalResourceId(physicalResourceId: IResolvable)

      /**
       * @param physicalResourceId Identifier of the physical resource. 
       */
      public fun physicalResourceId(physicalResourceId: PhysicalResourceIdProperty)

      /**
       * @param physicalResourceId Identifier of the physical resource. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c64aca1583c97db6bc67cb6995d70235bf84d03b55a6e55a3704aaba9f51f705")
      public
          fun physicalResourceId(physicalResourceId: PhysicalResourceIdProperty.Builder.() -> Unit)

      /**
       * @param resourceName Name of the resource that this resource is mapped to when the
       * `mappingType` is `Resource` .
       */
      public fun resourceName(resourceName: String)

      /**
       * @param terraformSourceName Name of the Terraform source that this resource is mapped to
       * when the `mappingType` is `Terraform` .
       */
      public fun terraformSourceName(terraformSourceName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.resiliencehub.CfnApp.ResourceMappingProperty.Builder =
          software.amazon.awscdk.services.resiliencehub.CfnApp.ResourceMappingProperty.builder()

      /**
       * @param eksSourceName Name of the Amazon Elastic Kubernetes Service cluster and namespace
       * that this resource is mapped to when the `mappingType` is `EKS` .
       *
       * This parameter accepts values in "eks-cluster/namespace" format.
       */
      override fun eksSourceName(eksSourceName: String) {
        cdkBuilder.eksSourceName(eksSourceName)
      }

      /**
       * @param logicalStackName Name of the AWS CloudFormation stack this resource is mapped to
       * when the `mappingType` is `CfnStack` .
       */
      override fun logicalStackName(logicalStackName: String) {
        cdkBuilder.logicalStackName(logicalStackName)
      }

      /**
       * @param mappingType Specifies the type of resource mapping. 
       */
      override fun mappingType(mappingType: String) {
        cdkBuilder.mappingType(mappingType)
      }

      /**
       * @param physicalResourceId Identifier of the physical resource. 
       */
      override fun physicalResourceId(physicalResourceId: IResolvable) {
        cdkBuilder.physicalResourceId(physicalResourceId.let(IResolvable::unwrap))
      }

      /**
       * @param physicalResourceId Identifier of the physical resource. 
       */
      override fun physicalResourceId(physicalResourceId: PhysicalResourceIdProperty) {
        cdkBuilder.physicalResourceId(physicalResourceId.let(PhysicalResourceIdProperty::unwrap))
      }

      /**
       * @param physicalResourceId Identifier of the physical resource. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c64aca1583c97db6bc67cb6995d70235bf84d03b55a6e55a3704aaba9f51f705")
      override
          fun physicalResourceId(physicalResourceId: PhysicalResourceIdProperty.Builder.() -> Unit):
          Unit = physicalResourceId(PhysicalResourceIdProperty(physicalResourceId))

      /**
       * @param resourceName Name of the resource that this resource is mapped to when the
       * `mappingType` is `Resource` .
       */
      override fun resourceName(resourceName: String) {
        cdkBuilder.resourceName(resourceName)
      }

      /**
       * @param terraformSourceName Name of the Terraform source that this resource is mapped to
       * when the `mappingType` is `Terraform` .
       */
      override fun terraformSourceName(terraformSourceName: String) {
        cdkBuilder.terraformSourceName(terraformSourceName)
      }

      public fun build():
          software.amazon.awscdk.services.resiliencehub.CfnApp.ResourceMappingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.resiliencehub.CfnApp.ResourceMappingProperty,
    ) : CdkObject(cdkObject), ResourceMappingProperty {
      /**
       * Name of the Amazon Elastic Kubernetes Service cluster and namespace that this resource is
       * mapped to when the `mappingType` is `EKS` .
       *
       *
       * This parameter accepts values in "eks-cluster/namespace" format.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resiliencehub-app-resourcemapping.html#cfn-resiliencehub-app-resourcemapping-ekssourcename)
       */
      override fun eksSourceName(): String? = unwrap(this).getEksSourceName()

      /**
       * Name of the AWS CloudFormation stack this resource is mapped to when the `mappingType` is
       * `CfnStack` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resiliencehub-app-resourcemapping.html#cfn-resiliencehub-app-resourcemapping-logicalstackname)
       */
      override fun logicalStackName(): String? = unwrap(this).getLogicalStackName()

      /**
       * Specifies the type of resource mapping.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resiliencehub-app-resourcemapping.html#cfn-resiliencehub-app-resourcemapping-mappingtype)
       */
      override fun mappingType(): String = unwrap(this).getMappingType()

      /**
       * Identifier of the physical resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resiliencehub-app-resourcemapping.html#cfn-resiliencehub-app-resourcemapping-physicalresourceid)
       */
      override fun physicalResourceId(): Any = unwrap(this).getPhysicalResourceId()

      /**
       * Name of the resource that this resource is mapped to when the `mappingType` is `Resource` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resiliencehub-app-resourcemapping.html#cfn-resiliencehub-app-resourcemapping-resourcename)
       */
      override fun resourceName(): String? = unwrap(this).getResourceName()

      /**
       * Name of the Terraform source that this resource is mapped to when the `mappingType` is
       * `Terraform` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resiliencehub-app-resourcemapping.html#cfn-resiliencehub-app-resourcemapping-terraformsourcename)
       */
      override fun terraformSourceName(): String? = unwrap(this).getTerraformSourceName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceMappingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.resiliencehub.CfnApp.ResourceMappingProperty):
          ResourceMappingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceMappingProperty):
          software.amazon.awscdk.services.resiliencehub.CfnApp.ResourceMappingProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.resiliencehub.CfnApp.ResourceMappingProperty
    }
  }

  public interface EventSubscriptionProperty {
    /**
     * The type of event you would like to subscribe and get notification for.
     *
     * Currently, AWS Resilience Hub supports notifications only for *Drift detected* (
     * `DriftDetected` ) and *Scheduled assessment failure* ( `ScheduledAssessmentFailure` ) events.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resiliencehub-app-eventsubscription.html#cfn-resiliencehub-app-eventsubscription-eventtype)
     */
    public fun eventType(): String

    /**
     * Unique name to identify an event subscription.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resiliencehub-app-eventsubscription.html#cfn-resiliencehub-app-eventsubscription-name)
     */
    public fun name(): String

    /**
     * Amazon Resource Name (ARN) of the Amazon Simple Notification Service topic.
     *
     * The format for this ARN is: `arn:partition:sns:region:account:topic-name` . For more
     * information about ARNs, see [Amazon Resource Names
     * (ARNs)](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) in the *AWS
     * General Reference* guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resiliencehub-app-eventsubscription.html#cfn-resiliencehub-app-eventsubscription-snstopicarn)
     */
    public fun snsTopicArn(): String? = unwrap(this).getSnsTopicArn()

    /**
     * A builder for [EventSubscriptionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param eventType The type of event you would like to subscribe and get notification for. 
       * Currently, AWS Resilience Hub supports notifications only for *Drift detected* (
       * `DriftDetected` ) and *Scheduled assessment failure* ( `ScheduledAssessmentFailure` ) events.
       */
      public fun eventType(eventType: String)

      /**
       * @param name Unique name to identify an event subscription. 
       */
      public fun name(name: String)

      /**
       * @param snsTopicArn Amazon Resource Name (ARN) of the Amazon Simple Notification Service
       * topic.
       * The format for this ARN is: `arn:partition:sns:region:account:topic-name` . For more
       * information about ARNs, see [Amazon Resource Names
       * (ARNs)](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) in the
       * *AWS General Reference* guide.
       */
      public fun snsTopicArn(snsTopicArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.resiliencehub.CfnApp.EventSubscriptionProperty.Builder =
          software.amazon.awscdk.services.resiliencehub.CfnApp.EventSubscriptionProperty.builder()

      /**
       * @param eventType The type of event you would like to subscribe and get notification for. 
       * Currently, AWS Resilience Hub supports notifications only for *Drift detected* (
       * `DriftDetected` ) and *Scheduled assessment failure* ( `ScheduledAssessmentFailure` ) events.
       */
      override fun eventType(eventType: String) {
        cdkBuilder.eventType(eventType)
      }

      /**
       * @param name Unique name to identify an event subscription. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param snsTopicArn Amazon Resource Name (ARN) of the Amazon Simple Notification Service
       * topic.
       * The format for this ARN is: `arn:partition:sns:region:account:topic-name` . For more
       * information about ARNs, see [Amazon Resource Names
       * (ARNs)](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) in the
       * *AWS General Reference* guide.
       */
      override fun snsTopicArn(snsTopicArn: String) {
        cdkBuilder.snsTopicArn(snsTopicArn)
      }

      public fun build():
          software.amazon.awscdk.services.resiliencehub.CfnApp.EventSubscriptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.resiliencehub.CfnApp.EventSubscriptionProperty,
    ) : CdkObject(cdkObject), EventSubscriptionProperty {
      /**
       * The type of event you would like to subscribe and get notification for.
       *
       * Currently, AWS Resilience Hub supports notifications only for *Drift detected* (
       * `DriftDetected` ) and *Scheduled assessment failure* ( `ScheduledAssessmentFailure` ) events.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resiliencehub-app-eventsubscription.html#cfn-resiliencehub-app-eventsubscription-eventtype)
       */
      override fun eventType(): String = unwrap(this).getEventType()

      /**
       * Unique name to identify an event subscription.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resiliencehub-app-eventsubscription.html#cfn-resiliencehub-app-eventsubscription-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * Amazon Resource Name (ARN) of the Amazon Simple Notification Service topic.
       *
       * The format for this ARN is: `arn:partition:sns:region:account:topic-name` . For more
       * information about ARNs, see [Amazon Resource Names
       * (ARNs)](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) in the
       * *AWS General Reference* guide.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resiliencehub-app-eventsubscription.html#cfn-resiliencehub-app-eventsubscription-snstopicarn)
       */
      override fun snsTopicArn(): String? = unwrap(this).getSnsTopicArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EventSubscriptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.resiliencehub.CfnApp.EventSubscriptionProperty):
          EventSubscriptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EventSubscriptionProperty):
          software.amazon.awscdk.services.resiliencehub.CfnApp.EventSubscriptionProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.resiliencehub.CfnApp.EventSubscriptionProperty
    }
  }
}

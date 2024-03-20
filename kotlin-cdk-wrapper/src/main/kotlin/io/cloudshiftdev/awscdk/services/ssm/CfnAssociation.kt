@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssm

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::SSM::Association` resource creates a State Manager association for your managed
 * instances.
 *
 * A State Manager association defines the state that you want to maintain on your instances. For
 * example, an association can specify that anti-virus software must be installed and running on your
 * instances, or that certain ports must be closed. For static targets, the association specifies a
 * schedule for when the configuration is reapplied. For dynamic targets, such as an AWS Resource
 * Groups or an AWS Auto Scaling Group, State Manager applies the configuration when new instances are
 * added to the group. The association also specifies actions to take when applying the configuration.
 * For example, an association for anti-virus software might run once a day. If the software is not
 * installed, then State Manager installs it. If the software is installed, but the service is not
 * running, then the association might instruct State Manager to start the service.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ssm.*;
 * Object parameters;
 * CfnAssociation cfnAssociation = CfnAssociation.Builder.create(this, "MyCfnAssociation")
 * .name("name")
 * // the properties below are optional
 * .applyOnlyAtCronInterval(false)
 * .associationName("associationName")
 * .automationTargetParameterName("automationTargetParameterName")
 * .calendarNames(List.of("calendarNames"))
 * .complianceSeverity("complianceSeverity")
 * .documentVersion("documentVersion")
 * .instanceId("instanceId")
 * .maxConcurrency("maxConcurrency")
 * .maxErrors("maxErrors")
 * .outputLocation(InstanceAssociationOutputLocationProperty.builder()
 * .s3Location(S3OutputLocationProperty.builder()
 * .outputS3BucketName("outputS3BucketName")
 * .outputS3KeyPrefix("outputS3KeyPrefix")
 * .outputS3Region("outputS3Region")
 * .build())
 * .build())
 * .parameters(parameters)
 * .scheduleExpression("scheduleExpression")
 * .scheduleOffset(123)
 * .syncCompliance("syncCompliance")
 * .targets(List.of(TargetProperty.builder()
 * .key("key")
 * .values(List.of("values"))
 * .build()))
 * .waitForSuccessTimeoutSeconds(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html)
 */
public open class CfnAssociation internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ssm.CfnAssociation,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAssociationProps,
  ) :
      this(software.amazon.awscdk.services.ssm.CfnAssociation(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnAssociationProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAssociationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnAssociationProps(props)
  )

  /**
   * By default, when you create a new association, the system runs it immediately after it is
   * created and then according to the schedule you specified.
   */
  public open fun applyOnlyAtCronInterval(): Any? = unwrap(this).getApplyOnlyAtCronInterval()

  /**
   * By default, when you create a new association, the system runs it immediately after it is
   * created and then according to the schedule you specified.
   */
  public open fun applyOnlyAtCronInterval(`value`: Boolean) {
    unwrap(this).setApplyOnlyAtCronInterval(`value`)
  }

  /**
   * By default, when you create a new association, the system runs it immediately after it is
   * created and then according to the schedule you specified.
   */
  public open fun applyOnlyAtCronInterval(`value`: IResolvable) {
    unwrap(this).setApplyOnlyAtCronInterval(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specify a descriptive name for the association.
   */
  public open fun associationName(): String? = unwrap(this).getAssociationName()

  /**
   * Specify a descriptive name for the association.
   */
  public open fun associationName(`value`: String) {
    unwrap(this).setAssociationName(`value`)
  }

  /**
   * The association ID.
   */
  public open fun attrAssociationId(): String = unwrap(this).getAttrAssociationId()

  /**
   * Choose the parameter that will define how your automation will branch out.
   */
  public open fun automationTargetParameterName(): String? =
      unwrap(this).getAutomationTargetParameterName()

  /**
   * Choose the parameter that will define how your automation will branch out.
   */
  public open fun automationTargetParameterName(`value`: String) {
    unwrap(this).setAutomationTargetParameterName(`value`)
  }

  /**
   * The names or Amazon Resource Names (ARNs) of the Change Calendar type documents your
   * associations are gated under.
   */
  public open fun calendarNames(): List<String> = unwrap(this).getCalendarNames() ?: emptyList()

  /**
   * The names or Amazon Resource Names (ARNs) of the Change Calendar type documents your
   * associations are gated under.
   */
  public open fun calendarNames(`value`: List<String>) {
    unwrap(this).setCalendarNames(`value`)
  }

  /**
   * The names or Amazon Resource Names (ARNs) of the Change Calendar type documents your
   * associations are gated under.
   */
  public open fun calendarNames(vararg `value`: String): Unit = calendarNames(`value`.toList())

  /**
   * The severity level that is assigned to the association.
   */
  public open fun complianceSeverity(): String? = unwrap(this).getComplianceSeverity()

  /**
   * The severity level that is assigned to the association.
   */
  public open fun complianceSeverity(`value`: String) {
    unwrap(this).setComplianceSeverity(`value`)
  }

  /**
   * The version of the SSM document to associate with the target.
   */
  public open fun documentVersion(): String? = unwrap(this).getDocumentVersion()

  /**
   * The version of the SSM document to associate with the target.
   */
  public open fun documentVersion(`value`: String) {
    unwrap(this).setDocumentVersion(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The ID of the instance that the SSM document is associated with.
   */
  public open fun instanceId(): String? = unwrap(this).getInstanceId()

  /**
   * The ID of the instance that the SSM document is associated with.
   */
  public open fun instanceId(`value`: String) {
    unwrap(this).setInstanceId(`value`)
  }

  /**
   * The maximum number of targets allowed to run the association at the same time.
   */
  public open fun maxConcurrency(): String? = unwrap(this).getMaxConcurrency()

  /**
   * The maximum number of targets allowed to run the association at the same time.
   */
  public open fun maxConcurrency(`value`: String) {
    unwrap(this).setMaxConcurrency(`value`)
  }

  /**
   * The number of errors that are allowed before the system stops sending requests to run the
   * association on additional targets.
   */
  public open fun maxErrors(): String? = unwrap(this).getMaxErrors()

  /**
   * The number of errors that are allowed before the system stops sending requests to run the
   * association on additional targets.
   */
  public open fun maxErrors(`value`: String) {
    unwrap(this).setMaxErrors(`value`)
  }

  /**
   * The name of the SSM document that contains the configuration information for the instance.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the SSM document that contains the configuration information for the instance.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * An Amazon Simple Storage Service (Amazon S3) bucket where you want to store the output details
   * of the request.
   */
  public open fun outputLocation(): Any? = unwrap(this).getOutputLocation()

  /**
   * An Amazon Simple Storage Service (Amazon S3) bucket where you want to store the output details
   * of the request.
   */
  public open fun outputLocation(`value`: IResolvable) {
    unwrap(this).setOutputLocation(`value`.let(IResolvable::unwrap))
  }

  /**
   * An Amazon Simple Storage Service (Amazon S3) bucket where you want to store the output details
   * of the request.
   */
  public open fun outputLocation(`value`: InstanceAssociationOutputLocationProperty) {
    unwrap(this).setOutputLocation(`value`.let(InstanceAssociationOutputLocationProperty::unwrap))
  }

  /**
   * An Amazon Simple Storage Service (Amazon S3) bucket where you want to store the output details
   * of the request.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8e56439f4b0363ec3e10bbddf195e4ce58688dbf40ea723f02b6139da37c5360")
  public open
      fun outputLocation(`value`: InstanceAssociationOutputLocationProperty.Builder.() -> Unit):
      Unit = outputLocation(InstanceAssociationOutputLocationProperty(`value`))

  /**
   * The parameters for the runtime configuration of the document.
   */
  public open fun parameters(): Any? = unwrap(this).getParameters()

  /**
   * The parameters for the runtime configuration of the document.
   */
  public open fun parameters(`value`: Any) {
    unwrap(this).setParameters(`value`)
  }

  /**
   * A cron expression that specifies a schedule when the association runs.
   */
  public open fun scheduleExpression(): String? = unwrap(this).getScheduleExpression()

  /**
   * A cron expression that specifies a schedule when the association runs.
   */
  public open fun scheduleExpression(`value`: String) {
    unwrap(this).setScheduleExpression(`value`)
  }

  /**
   * Number of days to wait after the scheduled day to run an association.
   */
  public open fun scheduleOffset(): Number? = unwrap(this).getScheduleOffset()

  /**
   * Number of days to wait after the scheduled day to run an association.
   */
  public open fun scheduleOffset(`value`: Number) {
    unwrap(this).setScheduleOffset(`value`)
  }

  /**
   * The mode for generating association compliance.
   */
  public open fun syncCompliance(): String? = unwrap(this).getSyncCompliance()

  /**
   * The mode for generating association compliance.
   */
  public open fun syncCompliance(`value`: String) {
    unwrap(this).setSyncCompliance(`value`)
  }

  /**
   * The targets for the association.
   */
  public open fun targets(): Any? = unwrap(this).getTargets()

  /**
   * The targets for the association.
   */
  public open fun targets(`value`: IResolvable) {
    unwrap(this).setTargets(`value`.let(IResolvable::unwrap))
  }

  /**
   * The targets for the association.
   */
  public open fun targets(`value`: List<Any>) {
    unwrap(this).setTargets(`value`)
  }

  /**
   * The targets for the association.
   */
  public open fun targets(vararg `value`: Any): Unit = targets(`value`.toList())

  /**
   * The number of seconds the service should wait for the association status to show "Success"
   * before proceeding with the stack execution.
   */
  public open fun waitForSuccessTimeoutSeconds(): Number? =
      unwrap(this).getWaitForSuccessTimeoutSeconds()

  /**
   * The number of seconds the service should wait for the association status to show "Success"
   * before proceeding with the stack execution.
   */
  public open fun waitForSuccessTimeoutSeconds(`value`: Number) {
    unwrap(this).setWaitForSuccessTimeoutSeconds(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ssm.CfnAssociation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * By default, when you create a new association, the system runs it immediately after it is
     * created and then according to the schedule you specified.
     *
     * Specify this option if you don't want an association to run immediately after you create it.
     * This parameter is not supported for rate expressions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-applyonlyatcroninterval)
     * @param applyOnlyAtCronInterval By default, when you create a new association, the system runs
     * it immediately after it is created and then according to the schedule you specified. 
     */
    public fun applyOnlyAtCronInterval(applyOnlyAtCronInterval: Boolean)

    /**
     * By default, when you create a new association, the system runs it immediately after it is
     * created and then according to the schedule you specified.
     *
     * Specify this option if you don't want an association to run immediately after you create it.
     * This parameter is not supported for rate expressions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-applyonlyatcroninterval)
     * @param applyOnlyAtCronInterval By default, when you create a new association, the system runs
     * it immediately after it is created and then according to the schedule you specified. 
     */
    public fun applyOnlyAtCronInterval(applyOnlyAtCronInterval: IResolvable)

    /**
     * Specify a descriptive name for the association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-associationname)
     * @param associationName Specify a descriptive name for the association. 
     */
    public fun associationName(associationName: String)

    /**
     * Choose the parameter that will define how your automation will branch out.
     *
     * This target is required for associations that use an Automation runbook and target resources
     * by using rate controls. Automation is a capability of AWS Systems Manager .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-automationtargetparametername)
     * @param automationTargetParameterName Choose the parameter that will define how your
     * automation will branch out. 
     */
    public fun automationTargetParameterName(automationTargetParameterName: String)

    /**
     * The names or Amazon Resource Names (ARNs) of the Change Calendar type documents your
     * associations are gated under.
     *
     * The associations only run when that Change Calendar is open. For more information, see [AWS
     * Systems Manager Change
     * Calendar](https://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-change-calendar)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-calendarnames)
     * @param calendarNames The names or Amazon Resource Names (ARNs) of the Change Calendar type
     * documents your associations are gated under. 
     */
    public fun calendarNames(calendarNames: List<String>)

    /**
     * The names or Amazon Resource Names (ARNs) of the Change Calendar type documents your
     * associations are gated under.
     *
     * The associations only run when that Change Calendar is open. For more information, see [AWS
     * Systems Manager Change
     * Calendar](https://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-change-calendar)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-calendarnames)
     * @param calendarNames The names or Amazon Resource Names (ARNs) of the Change Calendar type
     * documents your associations are gated under. 
     */
    public fun calendarNames(vararg calendarNames: String)

    /**
     * The severity level that is assigned to the association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-complianceseverity)
     * @param complianceSeverity The severity level that is assigned to the association. 
     */
    public fun complianceSeverity(complianceSeverity: String)

    /**
     * The version of the SSM document to associate with the target.
     *
     *
     * Note the following important information.
     *
     * * State Manager doesn't support running associations that use a new version of a document if
     * that document is shared from another account. State Manager always runs the `default` version of
     * a document if shared from another account, even though the Systems Manager console shows that a
     * new version was processed. If you want to run an association using a new version of a document
     * shared form another account, you must set the document version to `default` .
     * * `DocumentVersion` is not valid for documents owned by AWS , such as `AWS-RunPatchBaseline`
     * or `AWS-UpdateSSMAgent` . If you specify `DocumentVersion` for an AWS document, the system
     * returns the following error: "Error occurred during operation 'CreateAssociation'."
     * (RequestToken: <token>, HandlerErrorCode: GeneralServiceException).
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-documentversion)
     * @param documentVersion The version of the SSM document to associate with the target. 
     */
    public fun documentVersion(documentVersion: String)

    /**
     * The ID of the instance that the SSM document is associated with.
     *
     * You must specify the `InstanceId` or `Targets` property.
     *
     *
     * `InstanceId` has been deprecated. To specify an instance ID for an association, use the
     * `Targets` parameter. If you use the parameter `InstanceId` , you cannot use the parameters
     * `AssociationName` , `DocumentVersion` , `MaxErrors` , `MaxConcurrency` , `OutputLocation` , or
     * `ScheduleExpression` . To use these parameters, you must use the `Targets` parameter.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-instanceid)
     * @param instanceId The ID of the instance that the SSM document is associated with. 
     */
    public fun instanceId(instanceId: String)

    /**
     * The maximum number of targets allowed to run the association at the same time.
     *
     * You can specify a number, for example 10, or a percentage of the target set, for example 10%.
     * The default value is 100%, which means all targets run the association at the same time.
     *
     * If a new managed node starts and attempts to run an association while Systems Manager is
     * running `MaxConcurrency` associations, the association is allowed to run. During the next
     * association interval, the new managed node will process its association within the limit
     * specified for `MaxConcurrency` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-maxconcurrency)
     * @param maxConcurrency The maximum number of targets allowed to run the association at the
     * same time. 
     */
    public fun maxConcurrency(maxConcurrency: String)

    /**
     * The number of errors that are allowed before the system stops sending requests to run the
     * association on additional targets.
     *
     * You can specify either an absolute number of errors, for example 10, or a percentage of the
     * target set, for example 10%. If you specify 3, for example, the system stops sending requests
     * when the fourth error is received. If you specify 0, then the system stops sending requests
     * after the first error is returned. If you run an association on 50 managed nodes and set
     * `MaxError` to 10%, then the system stops sending the request when the sixth error is received.
     *
     * Executions that are already running an association when `MaxErrors` is reached are allowed to
     * complete, but some of these executions may fail as well. If you need to ensure that there won't
     * be more than max-errors failed executions, set `MaxConcurrency` to 1 so that executions proceed
     * one at a time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-maxerrors)
     * @param maxErrors The number of errors that are allowed before the system stops sending
     * requests to run the association on additional targets. 
     */
    public fun maxErrors(maxErrors: String)

    /**
     * The name of the SSM document that contains the configuration information for the instance.
     *
     * You can specify `Command` or `Automation` documents. The documents can be AWS -predefined
     * documents, documents you created, or a document that is shared with you from another account.
     * For SSM documents that are shared with you from other AWS accounts , you must specify the
     * complete SSM document ARN, in the following format:
     *
     * `arn:partition:ssm:region:account-id:document/document-name`
     *
     * For example: `arn:aws:ssm:us-east-2:12345678912:document/My-Shared-Document`
     *
     * For AWS -predefined documents and SSM documents you created in your account, you only need to
     * specify the document name. For example, `AWS -ApplyPatchBaseline` or `My-Document` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-name)
     * @param name The name of the SSM document that contains the configuration information for the
     * instance. 
     */
    public fun name(name: String)

    /**
     * An Amazon Simple Storage Service (Amazon S3) bucket where you want to store the output
     * details of the request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-outputlocation)
     * @param outputLocation An Amazon Simple Storage Service (Amazon S3) bucket where you want to
     * store the output details of the request. 
     */
    public fun outputLocation(outputLocation: IResolvable)

    /**
     * An Amazon Simple Storage Service (Amazon S3) bucket where you want to store the output
     * details of the request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-outputlocation)
     * @param outputLocation An Amazon Simple Storage Service (Amazon S3) bucket where you want to
     * store the output details of the request. 
     */
    public fun outputLocation(outputLocation: InstanceAssociationOutputLocationProperty)

    /**
     * An Amazon Simple Storage Service (Amazon S3) bucket where you want to store the output
     * details of the request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-outputlocation)
     * @param outputLocation An Amazon Simple Storage Service (Amazon S3) bucket where you want to
     * store the output details of the request. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1683d449e4e23bb23aa1a3820b4404b90f5308902fbd9751df5dac86071e3a88")
    public
        fun outputLocation(outputLocation: InstanceAssociationOutputLocationProperty.Builder.() -> Unit)

    /**
     * The parameters for the runtime configuration of the document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-parameters)
     * @param parameters The parameters for the runtime configuration of the document. 
     */
    public fun parameters(parameters: Any)

    /**
     * A cron expression that specifies a schedule when the association runs.
     *
     * The schedule runs in Coordinated Universal Time (UTC).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-scheduleexpression)
     * @param scheduleExpression A cron expression that specifies a schedule when the association
     * runs. 
     */
    public fun scheduleExpression(scheduleExpression: String)

    /**
     * Number of days to wait after the scheduled day to run an association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-scheduleoffset)
     * @param scheduleOffset Number of days to wait after the scheduled day to run an association. 
     */
    public fun scheduleOffset(scheduleOffset: Number)

    /**
     * The mode for generating association compliance.
     *
     * You can specify `AUTO` or `MANUAL` . In `AUTO` mode, the system uses the status of the
     * association execution to determine the compliance status. If the association execution runs
     * successfully, then the association is `COMPLIANT` . If the association execution doesn't run
     * successfully, the association is `NON-COMPLIANT` .
     *
     * In `MANUAL` mode, you must specify the `AssociationId` as a parameter for the
     * `PutComplianceItems` API action. In this case, compliance data is not managed by State Manager.
     * It is managed by your direct call to the `PutComplianceItems` API action.
     *
     * By default, all associations use `AUTO` mode.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-synccompliance)
     * @param syncCompliance The mode for generating association compliance. 
     */
    public fun syncCompliance(syncCompliance: String)

    /**
     * The targets for the association.
     *
     * You must specify the `InstanceId` or `Targets` property. You can target all instances in an
     * AWS account by specifyingt he `InstanceIds` key with a value of `*` . To view a JSON and a YAML
     * example that targets all instances, see the "Create an association for all managed instances in
     * an AWS account " later in this page.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-targets)
     * @param targets The targets for the association. 
     */
    public fun targets(targets: IResolvable)

    /**
     * The targets for the association.
     *
     * You must specify the `InstanceId` or `Targets` property. You can target all instances in an
     * AWS account by specifyingt he `InstanceIds` key with a value of `*` . To view a JSON and a YAML
     * example that targets all instances, see the "Create an association for all managed instances in
     * an AWS account " later in this page.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-targets)
     * @param targets The targets for the association. 
     */
    public fun targets(targets: List<Any>)

    /**
     * The targets for the association.
     *
     * You must specify the `InstanceId` or `Targets` property. You can target all instances in an
     * AWS account by specifyingt he `InstanceIds` key with a value of `*` . To view a JSON and a YAML
     * example that targets all instances, see the "Create an association for all managed instances in
     * an AWS account " later in this page.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-targets)
     * @param targets The targets for the association. 
     */
    public fun targets(vararg targets: Any)

    /**
     * The number of seconds the service should wait for the association status to show "Success"
     * before proceeding with the stack execution.
     *
     * If the association status doesn't show "Success" after the specified number of seconds, then
     * stack creation fails.
     *
     *
     * When you specify a value for the `WaitForSuccessTimeoutSeconds` , [drift
     * detection](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html)
     * for your AWS CloudFormation stack’s configuration might yield inaccurate results. If drift
     * detection is important in your scenario, we recommend that you don’t include
     * `WaitForSuccessTimeoutSeconds` in your template.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-waitforsuccesstimeoutseconds)
     * @param waitForSuccessTimeoutSeconds The number of seconds the service should wait for the
     * association status to show "Success" before proceeding with the stack execution. 
     */
    public fun waitForSuccessTimeoutSeconds(waitForSuccessTimeoutSeconds: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssm.CfnAssociation.Builder =
        software.amazon.awscdk.services.ssm.CfnAssociation.Builder.create(scope, id)

    /**
     * By default, when you create a new association, the system runs it immediately after it is
     * created and then according to the schedule you specified.
     *
     * Specify this option if you don't want an association to run immediately after you create it.
     * This parameter is not supported for rate expressions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-applyonlyatcroninterval)
     * @param applyOnlyAtCronInterval By default, when you create a new association, the system runs
     * it immediately after it is created and then according to the schedule you specified. 
     */
    override fun applyOnlyAtCronInterval(applyOnlyAtCronInterval: Boolean) {
      cdkBuilder.applyOnlyAtCronInterval(applyOnlyAtCronInterval)
    }

    /**
     * By default, when you create a new association, the system runs it immediately after it is
     * created and then according to the schedule you specified.
     *
     * Specify this option if you don't want an association to run immediately after you create it.
     * This parameter is not supported for rate expressions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-applyonlyatcroninterval)
     * @param applyOnlyAtCronInterval By default, when you create a new association, the system runs
     * it immediately after it is created and then according to the schedule you specified. 
     */
    override fun applyOnlyAtCronInterval(applyOnlyAtCronInterval: IResolvable) {
      cdkBuilder.applyOnlyAtCronInterval(applyOnlyAtCronInterval.let(IResolvable::unwrap))
    }

    /**
     * Specify a descriptive name for the association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-associationname)
     * @param associationName Specify a descriptive name for the association. 
     */
    override fun associationName(associationName: String) {
      cdkBuilder.associationName(associationName)
    }

    /**
     * Choose the parameter that will define how your automation will branch out.
     *
     * This target is required for associations that use an Automation runbook and target resources
     * by using rate controls. Automation is a capability of AWS Systems Manager .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-automationtargetparametername)
     * @param automationTargetParameterName Choose the parameter that will define how your
     * automation will branch out. 
     */
    override fun automationTargetParameterName(automationTargetParameterName: String) {
      cdkBuilder.automationTargetParameterName(automationTargetParameterName)
    }

    /**
     * The names or Amazon Resource Names (ARNs) of the Change Calendar type documents your
     * associations are gated under.
     *
     * The associations only run when that Change Calendar is open. For more information, see [AWS
     * Systems Manager Change
     * Calendar](https://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-change-calendar)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-calendarnames)
     * @param calendarNames The names or Amazon Resource Names (ARNs) of the Change Calendar type
     * documents your associations are gated under. 
     */
    override fun calendarNames(calendarNames: List<String>) {
      cdkBuilder.calendarNames(calendarNames)
    }

    /**
     * The names or Amazon Resource Names (ARNs) of the Change Calendar type documents your
     * associations are gated under.
     *
     * The associations only run when that Change Calendar is open. For more information, see [AWS
     * Systems Manager Change
     * Calendar](https://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-change-calendar)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-calendarnames)
     * @param calendarNames The names or Amazon Resource Names (ARNs) of the Change Calendar type
     * documents your associations are gated under. 
     */
    override fun calendarNames(vararg calendarNames: String): Unit =
        calendarNames(calendarNames.toList())

    /**
     * The severity level that is assigned to the association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-complianceseverity)
     * @param complianceSeverity The severity level that is assigned to the association. 
     */
    override fun complianceSeverity(complianceSeverity: String) {
      cdkBuilder.complianceSeverity(complianceSeverity)
    }

    /**
     * The version of the SSM document to associate with the target.
     *
     *
     * Note the following important information.
     *
     * * State Manager doesn't support running associations that use a new version of a document if
     * that document is shared from another account. State Manager always runs the `default` version of
     * a document if shared from another account, even though the Systems Manager console shows that a
     * new version was processed. If you want to run an association using a new version of a document
     * shared form another account, you must set the document version to `default` .
     * * `DocumentVersion` is not valid for documents owned by AWS , such as `AWS-RunPatchBaseline`
     * or `AWS-UpdateSSMAgent` . If you specify `DocumentVersion` for an AWS document, the system
     * returns the following error: "Error occurred during operation 'CreateAssociation'."
     * (RequestToken: <token>, HandlerErrorCode: GeneralServiceException).
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-documentversion)
     * @param documentVersion The version of the SSM document to associate with the target. 
     */
    override fun documentVersion(documentVersion: String) {
      cdkBuilder.documentVersion(documentVersion)
    }

    /**
     * The ID of the instance that the SSM document is associated with.
     *
     * You must specify the `InstanceId` or `Targets` property.
     *
     *
     * `InstanceId` has been deprecated. To specify an instance ID for an association, use the
     * `Targets` parameter. If you use the parameter `InstanceId` , you cannot use the parameters
     * `AssociationName` , `DocumentVersion` , `MaxErrors` , `MaxConcurrency` , `OutputLocation` , or
     * `ScheduleExpression` . To use these parameters, you must use the `Targets` parameter.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-instanceid)
     * @param instanceId The ID of the instance that the SSM document is associated with. 
     */
    override fun instanceId(instanceId: String) {
      cdkBuilder.instanceId(instanceId)
    }

    /**
     * The maximum number of targets allowed to run the association at the same time.
     *
     * You can specify a number, for example 10, or a percentage of the target set, for example 10%.
     * The default value is 100%, which means all targets run the association at the same time.
     *
     * If a new managed node starts and attempts to run an association while Systems Manager is
     * running `MaxConcurrency` associations, the association is allowed to run. During the next
     * association interval, the new managed node will process its association within the limit
     * specified for `MaxConcurrency` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-maxconcurrency)
     * @param maxConcurrency The maximum number of targets allowed to run the association at the
     * same time. 
     */
    override fun maxConcurrency(maxConcurrency: String) {
      cdkBuilder.maxConcurrency(maxConcurrency)
    }

    /**
     * The number of errors that are allowed before the system stops sending requests to run the
     * association on additional targets.
     *
     * You can specify either an absolute number of errors, for example 10, or a percentage of the
     * target set, for example 10%. If you specify 3, for example, the system stops sending requests
     * when the fourth error is received. If you specify 0, then the system stops sending requests
     * after the first error is returned. If you run an association on 50 managed nodes and set
     * `MaxError` to 10%, then the system stops sending the request when the sixth error is received.
     *
     * Executions that are already running an association when `MaxErrors` is reached are allowed to
     * complete, but some of these executions may fail as well. If you need to ensure that there won't
     * be more than max-errors failed executions, set `MaxConcurrency` to 1 so that executions proceed
     * one at a time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-maxerrors)
     * @param maxErrors The number of errors that are allowed before the system stops sending
     * requests to run the association on additional targets. 
     */
    override fun maxErrors(maxErrors: String) {
      cdkBuilder.maxErrors(maxErrors)
    }

    /**
     * The name of the SSM document that contains the configuration information for the instance.
     *
     * You can specify `Command` or `Automation` documents. The documents can be AWS -predefined
     * documents, documents you created, or a document that is shared with you from another account.
     * For SSM documents that are shared with you from other AWS accounts , you must specify the
     * complete SSM document ARN, in the following format:
     *
     * `arn:partition:ssm:region:account-id:document/document-name`
     *
     * For example: `arn:aws:ssm:us-east-2:12345678912:document/My-Shared-Document`
     *
     * For AWS -predefined documents and SSM documents you created in your account, you only need to
     * specify the document name. For example, `AWS -ApplyPatchBaseline` or `My-Document` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-name)
     * @param name The name of the SSM document that contains the configuration information for the
     * instance. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * An Amazon Simple Storage Service (Amazon S3) bucket where you want to store the output
     * details of the request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-outputlocation)
     * @param outputLocation An Amazon Simple Storage Service (Amazon S3) bucket where you want to
     * store the output details of the request. 
     */
    override fun outputLocation(outputLocation: IResolvable) {
      cdkBuilder.outputLocation(outputLocation.let(IResolvable::unwrap))
    }

    /**
     * An Amazon Simple Storage Service (Amazon S3) bucket where you want to store the output
     * details of the request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-outputlocation)
     * @param outputLocation An Amazon Simple Storage Service (Amazon S3) bucket where you want to
     * store the output details of the request. 
     */
    override fun outputLocation(outputLocation: InstanceAssociationOutputLocationProperty) {
      cdkBuilder.outputLocation(outputLocation.let(InstanceAssociationOutputLocationProperty::unwrap))
    }

    /**
     * An Amazon Simple Storage Service (Amazon S3) bucket where you want to store the output
     * details of the request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-outputlocation)
     * @param outputLocation An Amazon Simple Storage Service (Amazon S3) bucket where you want to
     * store the output details of the request. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1683d449e4e23bb23aa1a3820b4404b90f5308902fbd9751df5dac86071e3a88")
    override
        fun outputLocation(outputLocation: InstanceAssociationOutputLocationProperty.Builder.() -> Unit):
        Unit = outputLocation(InstanceAssociationOutputLocationProperty(outputLocation))

    /**
     * The parameters for the runtime configuration of the document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-parameters)
     * @param parameters The parameters for the runtime configuration of the document. 
     */
    override fun parameters(parameters: Any) {
      cdkBuilder.parameters(parameters)
    }

    /**
     * A cron expression that specifies a schedule when the association runs.
     *
     * The schedule runs in Coordinated Universal Time (UTC).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-scheduleexpression)
     * @param scheduleExpression A cron expression that specifies a schedule when the association
     * runs. 
     */
    override fun scheduleExpression(scheduleExpression: String) {
      cdkBuilder.scheduleExpression(scheduleExpression)
    }

    /**
     * Number of days to wait after the scheduled day to run an association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-scheduleoffset)
     * @param scheduleOffset Number of days to wait after the scheduled day to run an association. 
     */
    override fun scheduleOffset(scheduleOffset: Number) {
      cdkBuilder.scheduleOffset(scheduleOffset)
    }

    /**
     * The mode for generating association compliance.
     *
     * You can specify `AUTO` or `MANUAL` . In `AUTO` mode, the system uses the status of the
     * association execution to determine the compliance status. If the association execution runs
     * successfully, then the association is `COMPLIANT` . If the association execution doesn't run
     * successfully, the association is `NON-COMPLIANT` .
     *
     * In `MANUAL` mode, you must specify the `AssociationId` as a parameter for the
     * `PutComplianceItems` API action. In this case, compliance data is not managed by State Manager.
     * It is managed by your direct call to the `PutComplianceItems` API action.
     *
     * By default, all associations use `AUTO` mode.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-synccompliance)
     * @param syncCompliance The mode for generating association compliance. 
     */
    override fun syncCompliance(syncCompliance: String) {
      cdkBuilder.syncCompliance(syncCompliance)
    }

    /**
     * The targets for the association.
     *
     * You must specify the `InstanceId` or `Targets` property. You can target all instances in an
     * AWS account by specifyingt he `InstanceIds` key with a value of `*` . To view a JSON and a YAML
     * example that targets all instances, see the "Create an association for all managed instances in
     * an AWS account " later in this page.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-targets)
     * @param targets The targets for the association. 
     */
    override fun targets(targets: IResolvable) {
      cdkBuilder.targets(targets.let(IResolvable::unwrap))
    }

    /**
     * The targets for the association.
     *
     * You must specify the `InstanceId` or `Targets` property. You can target all instances in an
     * AWS account by specifyingt he `InstanceIds` key with a value of `*` . To view a JSON and a YAML
     * example that targets all instances, see the "Create an association for all managed instances in
     * an AWS account " later in this page.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-targets)
     * @param targets The targets for the association. 
     */
    override fun targets(targets: List<Any>) {
      cdkBuilder.targets(targets)
    }

    /**
     * The targets for the association.
     *
     * You must specify the `InstanceId` or `Targets` property. You can target all instances in an
     * AWS account by specifyingt he `InstanceIds` key with a value of `*` . To view a JSON and a YAML
     * example that targets all instances, see the "Create an association for all managed instances in
     * an AWS account " later in this page.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-targets)
     * @param targets The targets for the association. 
     */
    override fun targets(vararg targets: Any): Unit = targets(targets.toList())

    /**
     * The number of seconds the service should wait for the association status to show "Success"
     * before proceeding with the stack execution.
     *
     * If the association status doesn't show "Success" after the specified number of seconds, then
     * stack creation fails.
     *
     *
     * When you specify a value for the `WaitForSuccessTimeoutSeconds` , [drift
     * detection](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html)
     * for your AWS CloudFormation stack’s configuration might yield inaccurate results. If drift
     * detection is important in your scenario, we recommend that you don’t include
     * `WaitForSuccessTimeoutSeconds` in your template.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-waitforsuccesstimeoutseconds)
     * @param waitForSuccessTimeoutSeconds The number of seconds the service should wait for the
     * association status to show "Success" before proceeding with the stack execution. 
     */
    override fun waitForSuccessTimeoutSeconds(waitForSuccessTimeoutSeconds: Number) {
      cdkBuilder.waitForSuccessTimeoutSeconds(waitForSuccessTimeoutSeconds)
    }

    public fun build(): software.amazon.awscdk.services.ssm.CfnAssociation = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ssm.CfnAssociation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAssociation(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnAssociation): CfnAssociation
        = CfnAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnAssociation): software.amazon.awscdk.services.ssm.CfnAssociation
        = wrapped.cdkObject
  }

  /**
   * `Target` is a property of the
   * [AWS::SSM::Association](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html)
   * resource that specifies the targets for an SSM document in Systems Manager . You can target all
   * instances in an AWS account by specifying the `InstanceIds` key with a value of `*` . To view a
   * JSON and a YAML example that targets all instances, see the example "Create an association for all
   * managed instances in an AWS account " later in this page.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ssm.*;
   * TargetProperty targetProperty = TargetProperty.builder()
   * .key("key")
   * .values(List.of("values"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-target.html)
   */
  public interface TargetProperty {
    /**
     * User-defined criteria for sending commands that target managed nodes that meet the criteria.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-target.html#cfn-ssm-association-target-key)
     */
    public fun key(): String

    /**
     * User-defined criteria that maps to `Key` .
     *
     * For example, if you specified `tag:ServerRole` , you could specify `value:WebServer` to run a
     * command on instances that include EC2 tags of `ServerRole,WebServer` .
     *
     * Depending on the type of target, the maximum number of values for a key might be lower than
     * the global maximum of 50.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-target.html#cfn-ssm-association-target-values)
     */
    public fun values(): List<String>

    /**
     * A builder for [TargetProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key User-defined criteria for sending commands that target managed nodes that meet
       * the criteria. 
       */
      public fun key(key: String)

      /**
       * @param values User-defined criteria that maps to `Key` . 
       * For example, if you specified `tag:ServerRole` , you could specify `value:WebServer` to run
       * a command on instances that include EC2 tags of `ServerRole,WebServer` .
       *
       * Depending on the type of target, the maximum number of values for a key might be lower than
       * the global maximum of 50.
       */
      public fun values(values: List<String>)

      /**
       * @param values User-defined criteria that maps to `Key` . 
       * For example, if you specified `tag:ServerRole` , you could specify `value:WebServer` to run
       * a command on instances that include EC2 tags of `ServerRole,WebServer` .
       *
       * Depending on the type of target, the maximum number of values for a key might be lower than
       * the global maximum of 50.
       */
      public fun values(vararg values: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssm.CfnAssociation.TargetProperty.Builder =
          software.amazon.awscdk.services.ssm.CfnAssociation.TargetProperty.builder()

      /**
       * @param key User-defined criteria for sending commands that target managed nodes that meet
       * the criteria. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param values User-defined criteria that maps to `Key` . 
       * For example, if you specified `tag:ServerRole` , you could specify `value:WebServer` to run
       * a command on instances that include EC2 tags of `ServerRole,WebServer` .
       *
       * Depending on the type of target, the maximum number of values for a key might be lower than
       * the global maximum of 50.
       */
      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      /**
       * @param values User-defined criteria that maps to `Key` . 
       * For example, if you specified `tag:ServerRole` , you could specify `value:WebServer` to run
       * a command on instances that include EC2 tags of `ServerRole,WebServer` .
       *
       * Depending on the type of target, the maximum number of values for a key might be lower than
       * the global maximum of 50.
       */
      override fun values(vararg values: String): Unit = values(values.toList())

      public fun build(): software.amazon.awscdk.services.ssm.CfnAssociation.TargetProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.ssm.CfnAssociation.TargetProperty,
    ) : CdkObject(cdkObject), TargetProperty {
      /**
       * User-defined criteria for sending commands that target managed nodes that meet the
       * criteria.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-target.html#cfn-ssm-association-target-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * User-defined criteria that maps to `Key` .
       *
       * For example, if you specified `tag:ServerRole` , you could specify `value:WebServer` to run
       * a command on instances that include EC2 tags of `ServerRole,WebServer` .
       *
       * Depending on the type of target, the maximum number of values for a key might be lower than
       * the global maximum of 50.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-target.html#cfn-ssm-association-target-values)
       */
      override fun values(): List<String> = unwrap(this).getValues()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TargetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnAssociation.TargetProperty):
          TargetProperty = CdkObjectWrappers.wrap(cdkObject) as? TargetProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetProperty):
          software.amazon.awscdk.services.ssm.CfnAssociation.TargetProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.ssm.CfnAssociation.TargetProperty
    }
  }

  /**
   * `S3OutputLocation` is a property of the
   * [AWS::SSM::Association](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html)
   * resource that specifies an Amazon S3 bucket where you want to store the results of this
   * association request.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ssm.*;
   * S3OutputLocationProperty s3OutputLocationProperty = S3OutputLocationProperty.builder()
   * .outputS3BucketName("outputS3BucketName")
   * .outputS3KeyPrefix("outputS3KeyPrefix")
   * .outputS3Region("outputS3Region")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-s3outputlocation.html)
   */
  public interface S3OutputLocationProperty {
    /**
     * The name of the S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-s3outputlocation.html#cfn-ssm-association-s3outputlocation-outputs3bucketname)
     */
    public fun outputS3BucketName(): String? = unwrap(this).getOutputS3BucketName()

    /**
     * The S3 bucket subfolder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-s3outputlocation.html#cfn-ssm-association-s3outputlocation-outputs3keyprefix)
     */
    public fun outputS3KeyPrefix(): String? = unwrap(this).getOutputS3KeyPrefix()

    /**
     * The AWS Region of the S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-s3outputlocation.html#cfn-ssm-association-s3outputlocation-outputs3region)
     */
    public fun outputS3Region(): String? = unwrap(this).getOutputS3Region()

    /**
     * A builder for [S3OutputLocationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param outputS3BucketName The name of the S3 bucket.
       */
      public fun outputS3BucketName(outputS3BucketName: String)

      /**
       * @param outputS3KeyPrefix The S3 bucket subfolder.
       */
      public fun outputS3KeyPrefix(outputS3KeyPrefix: String)

      /**
       * @param outputS3Region The AWS Region of the S3 bucket.
       */
      public fun outputS3Region(outputS3Region: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssm.CfnAssociation.S3OutputLocationProperty.Builder =
          software.amazon.awscdk.services.ssm.CfnAssociation.S3OutputLocationProperty.builder()

      /**
       * @param outputS3BucketName The name of the S3 bucket.
       */
      override fun outputS3BucketName(outputS3BucketName: String) {
        cdkBuilder.outputS3BucketName(outputS3BucketName)
      }

      /**
       * @param outputS3KeyPrefix The S3 bucket subfolder.
       */
      override fun outputS3KeyPrefix(outputS3KeyPrefix: String) {
        cdkBuilder.outputS3KeyPrefix(outputS3KeyPrefix)
      }

      /**
       * @param outputS3Region The AWS Region of the S3 bucket.
       */
      override fun outputS3Region(outputS3Region: String) {
        cdkBuilder.outputS3Region(outputS3Region)
      }

      public fun build():
          software.amazon.awscdk.services.ssm.CfnAssociation.S3OutputLocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ssm.CfnAssociation.S3OutputLocationProperty,
    ) : CdkObject(cdkObject), S3OutputLocationProperty {
      /**
       * The name of the S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-s3outputlocation.html#cfn-ssm-association-s3outputlocation-outputs3bucketname)
       */
      override fun outputS3BucketName(): String? = unwrap(this).getOutputS3BucketName()

      /**
       * The S3 bucket subfolder.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-s3outputlocation.html#cfn-ssm-association-s3outputlocation-outputs3keyprefix)
       */
      override fun outputS3KeyPrefix(): String? = unwrap(this).getOutputS3KeyPrefix()

      /**
       * The AWS Region of the S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-s3outputlocation.html#cfn-ssm-association-s3outputlocation-outputs3region)
       */
      override fun outputS3Region(): String? = unwrap(this).getOutputS3Region()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3OutputLocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnAssociation.S3OutputLocationProperty):
          S3OutputLocationProperty = CdkObjectWrappers.wrap(cdkObject) as? S3OutputLocationProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3OutputLocationProperty):
          software.amazon.awscdk.services.ssm.CfnAssociation.S3OutputLocationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ssm.CfnAssociation.S3OutputLocationProperty
    }
  }

  /**
   * `InstanceAssociationOutputLocation` is a property of the
   * [AWS::SSM::Association](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html)
   * resource that specifies an Amazon S3 bucket where you want to store the results of this
   * association request.
   *
   * For the minimal permissions required to enable Amazon S3 output for an association, see
   * [Creating
   * associations](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-state-assoc.html)
   * in the *Systems Manager User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ssm.*;
   * InstanceAssociationOutputLocationProperty instanceAssociationOutputLocationProperty =
   * InstanceAssociationOutputLocationProperty.builder()
   * .s3Location(S3OutputLocationProperty.builder()
   * .outputS3BucketName("outputS3BucketName")
   * .outputS3KeyPrefix("outputS3KeyPrefix")
   * .outputS3Region("outputS3Region")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-instanceassociationoutputlocation.html)
   */
  public interface InstanceAssociationOutputLocationProperty {
    /**
     * `S3OutputLocation` is a property of the
     * [InstanceAssociationOutputLocation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-instanceassociationoutputlocation.html)
     * property that specifies an Amazon S3 bucket where you want to store the results of this request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-instanceassociationoutputlocation.html#cfn-ssm-association-instanceassociationoutputlocation-s3location)
     */
    public fun s3Location(): Any? = unwrap(this).getS3Location()

    /**
     * A builder for [InstanceAssociationOutputLocationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param s3Location `S3OutputLocation` is a property of the
       * [InstanceAssociationOutputLocation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-instanceassociationoutputlocation.html)
       * property that specifies an Amazon S3 bucket where you want to store the results of this
       * request.
       */
      public fun s3Location(s3Location: IResolvable)

      /**
       * @param s3Location `S3OutputLocation` is a property of the
       * [InstanceAssociationOutputLocation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-instanceassociationoutputlocation.html)
       * property that specifies an Amazon S3 bucket where you want to store the results of this
       * request.
       */
      public fun s3Location(s3Location: S3OutputLocationProperty)

      /**
       * @param s3Location `S3OutputLocation` is a property of the
       * [InstanceAssociationOutputLocation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-instanceassociationoutputlocation.html)
       * property that specifies an Amazon S3 bucket where you want to store the results of this
       * request.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a9c59af672b5f9a495e841765dce821e782b6e5ccfb4906892e2f4f9a56ee979")
      public fun s3Location(s3Location: S3OutputLocationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssm.CfnAssociation.InstanceAssociationOutputLocationProperty.Builder
          =
          software.amazon.awscdk.services.ssm.CfnAssociation.InstanceAssociationOutputLocationProperty.builder()

      /**
       * @param s3Location `S3OutputLocation` is a property of the
       * [InstanceAssociationOutputLocation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-instanceassociationoutputlocation.html)
       * property that specifies an Amazon S3 bucket where you want to store the results of this
       * request.
       */
      override fun s3Location(s3Location: IResolvable) {
        cdkBuilder.s3Location(s3Location.let(IResolvable::unwrap))
      }

      /**
       * @param s3Location `S3OutputLocation` is a property of the
       * [InstanceAssociationOutputLocation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-instanceassociationoutputlocation.html)
       * property that specifies an Amazon S3 bucket where you want to store the results of this
       * request.
       */
      override fun s3Location(s3Location: S3OutputLocationProperty) {
        cdkBuilder.s3Location(s3Location.let(S3OutputLocationProperty::unwrap))
      }

      /**
       * @param s3Location `S3OutputLocation` is a property of the
       * [InstanceAssociationOutputLocation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-instanceassociationoutputlocation.html)
       * property that specifies an Amazon S3 bucket where you want to store the results of this
       * request.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a9c59af672b5f9a495e841765dce821e782b6e5ccfb4906892e2f4f9a56ee979")
      override fun s3Location(s3Location: S3OutputLocationProperty.Builder.() -> Unit): Unit =
          s3Location(S3OutputLocationProperty(s3Location))

      public fun build():
          software.amazon.awscdk.services.ssm.CfnAssociation.InstanceAssociationOutputLocationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ssm.CfnAssociation.InstanceAssociationOutputLocationProperty,
    ) : CdkObject(cdkObject), InstanceAssociationOutputLocationProperty {
      /**
       * `S3OutputLocation` is a property of the
       * [InstanceAssociationOutputLocation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-instanceassociationoutputlocation.html)
       * property that specifies an Amazon S3 bucket where you want to store the results of this
       * request.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-instanceassociationoutputlocation.html#cfn-ssm-association-instanceassociationoutputlocation-s3location)
       */
      override fun s3Location(): Any? = unwrap(this).getS3Location()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          InstanceAssociationOutputLocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnAssociation.InstanceAssociationOutputLocationProperty):
          InstanceAssociationOutputLocationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InstanceAssociationOutputLocationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceAssociationOutputLocationProperty):
          software.amazon.awscdk.services.ssm.CfnAssociation.InstanceAssociationOutputLocationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ssm.CfnAssociation.InstanceAssociationOutputLocationProperty
    }
  }
}

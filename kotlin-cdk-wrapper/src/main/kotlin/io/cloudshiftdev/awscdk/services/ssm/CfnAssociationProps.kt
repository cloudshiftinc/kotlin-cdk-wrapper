@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssm

import io.cloudshiftdev.awscdk.IResolvable
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

/**
 * Properties for defining a `CfnAssociation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ssm.*;
 * Object parameters;
 * CfnAssociationProps cfnAssociationProps = CfnAssociationProps.builder()
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
public interface CfnAssociationProps {
  /**
   * By default, when you create a new association, the system runs it immediately after it is
   * created and then according to the schedule you specified.
   *
   * Specify this option if you don't want an association to run immediately after you create it.
   * This parameter is not supported for rate expressions.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-applyonlyatcroninterval)
   */
  public fun applyOnlyAtCronInterval(): Any? = unwrap(this).getApplyOnlyAtCronInterval()

  /**
   * Specify a descriptive name for the association.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-associationname)
   */
  public fun associationName(): String? = unwrap(this).getAssociationName()

  /**
   * Choose the parameter that will define how your automation will branch out.
   *
   * This target is required for associations that use an Automation runbook and target resources by
   * using rate controls. Automation is a capability of AWS Systems Manager .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-automationtargetparametername)
   */
  public fun automationTargetParameterName(): String? =
      unwrap(this).getAutomationTargetParameterName()

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
   */
  public fun calendarNames(): List<String> = unwrap(this).getCalendarNames() ?: emptyList()

  /**
   * The severity level that is assigned to the association.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-complianceseverity)
   */
  public fun complianceSeverity(): String? = unwrap(this).getComplianceSeverity()

  /**
   * The version of the SSM document to associate with the target.
   *
   *
   * Note the following important information.
   *
   * * State Manager doesn't support running associations that use a new version of a document if
   * that document is shared from another account. State Manager always runs the `default` version of a
   * document if shared from another account, even though the Systems Manager console shows that a new
   * version was processed. If you want to run an association using a new version of a document shared
   * form another account, you must set the document version to `default` .
   * * `DocumentVersion` is not valid for documents owned by AWS , such as `AWS-RunPatchBaseline` or
   * `AWS-UpdateSSMAgent` . If you specify `DocumentVersion` for an AWS document, the system returns
   * the following error: "Error occurred during operation 'CreateAssociation'." (RequestToken:
   * <token>, HandlerErrorCode: GeneralServiceException).
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-documentversion)
   */
  public fun documentVersion(): String? = unwrap(this).getDocumentVersion()

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
   */
  public fun instanceId(): String? = unwrap(this).getInstanceId()

  /**
   * The maximum number of targets allowed to run the association at the same time.
   *
   * You can specify a number, for example 10, or a percentage of the target set, for example 10%.
   * The default value is 100%, which means all targets run the association at the same time.
   *
   * If a new managed node starts and attempts to run an association while Systems Manager is
   * running `MaxConcurrency` associations, the association is allowed to run. During the next
   * association interval, the new managed node will process its association within the limit specified
   * for `MaxConcurrency` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-maxconcurrency)
   */
  public fun maxConcurrency(): String? = unwrap(this).getMaxConcurrency()

  /**
   * The number of errors that are allowed before the system stops sending requests to run the
   * association on additional targets.
   *
   * You can specify either an absolute number of errors, for example 10, or a percentage of the
   * target set, for example 10%. If you specify 3, for example, the system stops sending requests when
   * the fourth error is received. If you specify 0, then the system stops sending requests after the
   * first error is returned. If you run an association on 50 managed nodes and set `MaxError` to 10%,
   * then the system stops sending the request when the sixth error is received.
   *
   * Executions that are already running an association when `MaxErrors` is reached are allowed to
   * complete, but some of these executions may fail as well. If you need to ensure that there won't be
   * more than max-errors failed executions, set `MaxConcurrency` to 1 so that executions proceed one
   * at a time.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-maxerrors)
   */
  public fun maxErrors(): String? = unwrap(this).getMaxErrors()

  /**
   * The name of the SSM document that contains the configuration information for the instance.
   *
   * You can specify `Command` or `Automation` documents. The documents can be AWS -predefined
   * documents, documents you created, or a document that is shared with you from another account. For
   * SSM documents that are shared with you from other AWS accounts , you must specify the complete SSM
   * document ARN, in the following format:
   *
   * `arn:partition:ssm:region:account-id:document/document-name`
   *
   * For example: `arn:aws:ssm:us-east-2:12345678912:document/My-Shared-Document`
   *
   * For AWS -predefined documents and SSM documents you created in your account, you only need to
   * specify the document name. For example, `AWS -ApplyPatchBaseline` or `My-Document` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-name)
   */
  public fun name(): String

  /**
   * An Amazon Simple Storage Service (Amazon S3) bucket where you want to store the output details
   * of the request.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-outputlocation)
   */
  public fun outputLocation(): Any? = unwrap(this).getOutputLocation()

  /**
   * The parameters for the runtime configuration of the document.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-parameters)
   */
  public fun parameters(): Any? = unwrap(this).getParameters()

  /**
   * A cron expression that specifies a schedule when the association runs.
   *
   * The schedule runs in Coordinated Universal Time (UTC).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-scheduleexpression)
   */
  public fun scheduleExpression(): String? = unwrap(this).getScheduleExpression()

  /**
   * Number of days to wait after the scheduled day to run an association.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-scheduleoffset)
   */
  public fun scheduleOffset(): Number? = unwrap(this).getScheduleOffset()

  /**
   * The mode for generating association compliance.
   *
   * You can specify `AUTO` or `MANUAL` . In `AUTO` mode, the system uses the status of the
   * association execution to determine the compliance status. If the association execution runs
   * successfully, then the association is `COMPLIANT` . If the association execution doesn't run
   * successfully, the association is `NON-COMPLIANT` .
   *
   * In `MANUAL` mode, you must specify the `AssociationId` as a parameter for the
   * `PutComplianceItems` API action. In this case, compliance data is not managed by State Manager. It
   * is managed by your direct call to the `PutComplianceItems` API action.
   *
   * By default, all associations use `AUTO` mode.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-synccompliance)
   */
  public fun syncCompliance(): String? = unwrap(this).getSyncCompliance()

  /**
   * The targets for the association.
   *
   * You must specify the `InstanceId` or `Targets` property. You can target all instances in an AWS
   * account by specifyingt he `InstanceIds` key with a value of `*` . To view a JSON and a YAML
   * example that targets all instances, see the "Create an association for all managed instances in an
   * AWS account " later in this page.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-targets)
   */
  public fun targets(): Any? = unwrap(this).getTargets()

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
   */
  public fun waitForSuccessTimeoutSeconds(): Number? =
      unwrap(this).getWaitForSuccessTimeoutSeconds()

  /**
   * A builder for [CfnAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param applyOnlyAtCronInterval By default, when you create a new association, the system runs
     * it immediately after it is created and then according to the schedule you specified.
     * Specify this option if you don't want an association to run immediately after you create it.
     * This parameter is not supported for rate expressions.
     */
    public fun applyOnlyAtCronInterval(applyOnlyAtCronInterval: Boolean)

    /**
     * @param applyOnlyAtCronInterval By default, when you create a new association, the system runs
     * it immediately after it is created and then according to the schedule you specified.
     * Specify this option if you don't want an association to run immediately after you create it.
     * This parameter is not supported for rate expressions.
     */
    public fun applyOnlyAtCronInterval(applyOnlyAtCronInterval: IResolvable)

    /**
     * @param associationName Specify a descriptive name for the association.
     */
    public fun associationName(associationName: String)

    /**
     * @param automationTargetParameterName Choose the parameter that will define how your
     * automation will branch out.
     * This target is required for associations that use an Automation runbook and target resources
     * by using rate controls. Automation is a capability of AWS Systems Manager .
     */
    public fun automationTargetParameterName(automationTargetParameterName: String)

    /**
     * @param calendarNames The names or Amazon Resource Names (ARNs) of the Change Calendar type
     * documents your associations are gated under.
     * The associations only run when that Change Calendar is open. For more information, see [AWS
     * Systems Manager Change
     * Calendar](https://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-change-calendar)
     * .
     */
    public fun calendarNames(calendarNames: List<String>)

    /**
     * @param calendarNames The names or Amazon Resource Names (ARNs) of the Change Calendar type
     * documents your associations are gated under.
     * The associations only run when that Change Calendar is open. For more information, see [AWS
     * Systems Manager Change
     * Calendar](https://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-change-calendar)
     * .
     */
    public fun calendarNames(vararg calendarNames: String)

    /**
     * @param complianceSeverity The severity level that is assigned to the association.
     */
    public fun complianceSeverity(complianceSeverity: String)

    /**
     * @param documentVersion The version of the SSM document to associate with the target.
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
     */
    public fun documentVersion(documentVersion: String)

    /**
     * @param instanceId The ID of the instance that the SSM document is associated with.
     * You must specify the `InstanceId` or `Targets` property.
     *
     *
     * `InstanceId` has been deprecated. To specify an instance ID for an association, use the
     * `Targets` parameter. If you use the parameter `InstanceId` , you cannot use the parameters
     * `AssociationName` , `DocumentVersion` , `MaxErrors` , `MaxConcurrency` , `OutputLocation` , or
     * `ScheduleExpression` . To use these parameters, you must use the `Targets` parameter.
     */
    public fun instanceId(instanceId: String)

    /**
     * @param maxConcurrency The maximum number of targets allowed to run the association at the
     * same time.
     * You can specify a number, for example 10, or a percentage of the target set, for example 10%.
     * The default value is 100%, which means all targets run the association at the same time.
     *
     * If a new managed node starts and attempts to run an association while Systems Manager is
     * running `MaxConcurrency` associations, the association is allowed to run. During the next
     * association interval, the new managed node will process its association within the limit
     * specified for `MaxConcurrency` .
     */
    public fun maxConcurrency(maxConcurrency: String)

    /**
     * @param maxErrors The number of errors that are allowed before the system stops sending
     * requests to run the association on additional targets.
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
     */
    public fun maxErrors(maxErrors: String)

    /**
     * @param name The name of the SSM document that contains the configuration information for the
     * instance. 
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
     */
    public fun name(name: String)

    /**
     * @param outputLocation An Amazon Simple Storage Service (Amazon S3) bucket where you want to
     * store the output details of the request.
     */
    public fun outputLocation(outputLocation: IResolvable)

    /**
     * @param outputLocation An Amazon Simple Storage Service (Amazon S3) bucket where you want to
     * store the output details of the request.
     */
    public
        fun outputLocation(outputLocation: CfnAssociation.InstanceAssociationOutputLocationProperty)

    /**
     * @param outputLocation An Amazon Simple Storage Service (Amazon S3) bucket where you want to
     * store the output details of the request.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("34b92b13734a06a6d27b80f559cf004af5dc448ea48bd78d272e57b02d5a5bfd")
    public
        fun outputLocation(outputLocation: CfnAssociation.InstanceAssociationOutputLocationProperty.Builder.() -> Unit)

    /**
     * @param parameters The parameters for the runtime configuration of the document.
     */
    public fun parameters(parameters: Any)

    /**
     * @param scheduleExpression A cron expression that specifies a schedule when the association
     * runs.
     * The schedule runs in Coordinated Universal Time (UTC).
     */
    public fun scheduleExpression(scheduleExpression: String)

    /**
     * @param scheduleOffset Number of days to wait after the scheduled day to run an association.
     */
    public fun scheduleOffset(scheduleOffset: Number)

    /**
     * @param syncCompliance The mode for generating association compliance.
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
     */
    public fun syncCompliance(syncCompliance: String)

    /**
     * @param targets The targets for the association.
     * You must specify the `InstanceId` or `Targets` property. You can target all instances in an
     * AWS account by specifyingt he `InstanceIds` key with a value of `*` . To view a JSON and a YAML
     * example that targets all instances, see the "Create an association for all managed instances in
     * an AWS account " later in this page.
     */
    public fun targets(targets: IResolvable)

    /**
     * @param targets The targets for the association.
     * You must specify the `InstanceId` or `Targets` property. You can target all instances in an
     * AWS account by specifyingt he `InstanceIds` key with a value of `*` . To view a JSON and a YAML
     * example that targets all instances, see the "Create an association for all managed instances in
     * an AWS account " later in this page.
     */
    public fun targets(targets: List<Any>)

    /**
     * @param targets The targets for the association.
     * You must specify the `InstanceId` or `Targets` property. You can target all instances in an
     * AWS account by specifyingt he `InstanceIds` key with a value of `*` . To view a JSON and a YAML
     * example that targets all instances, see the "Create an association for all managed instances in
     * an AWS account " later in this page.
     */
    public fun targets(vararg targets: Any)

    /**
     * @param waitForSuccessTimeoutSeconds The number of seconds the service should wait for the
     * association status to show "Success" before proceeding with the stack execution.
     * If the association status doesn't show "Success" after the specified number of seconds, then
     * stack creation fails.
     *
     *
     * When you specify a value for the `WaitForSuccessTimeoutSeconds` , [drift
     * detection](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html)
     * for your AWS CloudFormation stack’s configuration might yield inaccurate results. If drift
     * detection is important in your scenario, we recommend that you don’t include
     * `WaitForSuccessTimeoutSeconds` in your template.
     */
    public fun waitForSuccessTimeoutSeconds(waitForSuccessTimeoutSeconds: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssm.CfnAssociationProps.Builder =
        software.amazon.awscdk.services.ssm.CfnAssociationProps.builder()

    /**
     * @param applyOnlyAtCronInterval By default, when you create a new association, the system runs
     * it immediately after it is created and then according to the schedule you specified.
     * Specify this option if you don't want an association to run immediately after you create it.
     * This parameter is not supported for rate expressions.
     */
    override fun applyOnlyAtCronInterval(applyOnlyAtCronInterval: Boolean) {
      cdkBuilder.applyOnlyAtCronInterval(applyOnlyAtCronInterval)
    }

    /**
     * @param applyOnlyAtCronInterval By default, when you create a new association, the system runs
     * it immediately after it is created and then according to the schedule you specified.
     * Specify this option if you don't want an association to run immediately after you create it.
     * This parameter is not supported for rate expressions.
     */
    override fun applyOnlyAtCronInterval(applyOnlyAtCronInterval: IResolvable) {
      cdkBuilder.applyOnlyAtCronInterval(applyOnlyAtCronInterval.let(IResolvable::unwrap))
    }

    /**
     * @param associationName Specify a descriptive name for the association.
     */
    override fun associationName(associationName: String) {
      cdkBuilder.associationName(associationName)
    }

    /**
     * @param automationTargetParameterName Choose the parameter that will define how your
     * automation will branch out.
     * This target is required for associations that use an Automation runbook and target resources
     * by using rate controls. Automation is a capability of AWS Systems Manager .
     */
    override fun automationTargetParameterName(automationTargetParameterName: String) {
      cdkBuilder.automationTargetParameterName(automationTargetParameterName)
    }

    /**
     * @param calendarNames The names or Amazon Resource Names (ARNs) of the Change Calendar type
     * documents your associations are gated under.
     * The associations only run when that Change Calendar is open. For more information, see [AWS
     * Systems Manager Change
     * Calendar](https://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-change-calendar)
     * .
     */
    override fun calendarNames(calendarNames: List<String>) {
      cdkBuilder.calendarNames(calendarNames)
    }

    /**
     * @param calendarNames The names or Amazon Resource Names (ARNs) of the Change Calendar type
     * documents your associations are gated under.
     * The associations only run when that Change Calendar is open. For more information, see [AWS
     * Systems Manager Change
     * Calendar](https://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-change-calendar)
     * .
     */
    override fun calendarNames(vararg calendarNames: String): Unit =
        calendarNames(calendarNames.toList())

    /**
     * @param complianceSeverity The severity level that is assigned to the association.
     */
    override fun complianceSeverity(complianceSeverity: String) {
      cdkBuilder.complianceSeverity(complianceSeverity)
    }

    /**
     * @param documentVersion The version of the SSM document to associate with the target.
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
     */
    override fun documentVersion(documentVersion: String) {
      cdkBuilder.documentVersion(documentVersion)
    }

    /**
     * @param instanceId The ID of the instance that the SSM document is associated with.
     * You must specify the `InstanceId` or `Targets` property.
     *
     *
     * `InstanceId` has been deprecated. To specify an instance ID for an association, use the
     * `Targets` parameter. If you use the parameter `InstanceId` , you cannot use the parameters
     * `AssociationName` , `DocumentVersion` , `MaxErrors` , `MaxConcurrency` , `OutputLocation` , or
     * `ScheduleExpression` . To use these parameters, you must use the `Targets` parameter.
     */
    override fun instanceId(instanceId: String) {
      cdkBuilder.instanceId(instanceId)
    }

    /**
     * @param maxConcurrency The maximum number of targets allowed to run the association at the
     * same time.
     * You can specify a number, for example 10, or a percentage of the target set, for example 10%.
     * The default value is 100%, which means all targets run the association at the same time.
     *
     * If a new managed node starts and attempts to run an association while Systems Manager is
     * running `MaxConcurrency` associations, the association is allowed to run. During the next
     * association interval, the new managed node will process its association within the limit
     * specified for `MaxConcurrency` .
     */
    override fun maxConcurrency(maxConcurrency: String) {
      cdkBuilder.maxConcurrency(maxConcurrency)
    }

    /**
     * @param maxErrors The number of errors that are allowed before the system stops sending
     * requests to run the association on additional targets.
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
     */
    override fun maxErrors(maxErrors: String) {
      cdkBuilder.maxErrors(maxErrors)
    }

    /**
     * @param name The name of the SSM document that contains the configuration information for the
     * instance. 
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
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param outputLocation An Amazon Simple Storage Service (Amazon S3) bucket where you want to
     * store the output details of the request.
     */
    override fun outputLocation(outputLocation: IResolvable) {
      cdkBuilder.outputLocation(outputLocation.let(IResolvable::unwrap))
    }

    /**
     * @param outputLocation An Amazon Simple Storage Service (Amazon S3) bucket where you want to
     * store the output details of the request.
     */
    override
        fun outputLocation(outputLocation: CfnAssociation.InstanceAssociationOutputLocationProperty) {
      cdkBuilder.outputLocation(outputLocation.let(CfnAssociation.InstanceAssociationOutputLocationProperty::unwrap))
    }

    /**
     * @param outputLocation An Amazon Simple Storage Service (Amazon S3) bucket where you want to
     * store the output details of the request.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("34b92b13734a06a6d27b80f559cf004af5dc448ea48bd78d272e57b02d5a5bfd")
    override
        fun outputLocation(outputLocation: CfnAssociation.InstanceAssociationOutputLocationProperty.Builder.() -> Unit):
        Unit =
        outputLocation(CfnAssociation.InstanceAssociationOutputLocationProperty(outputLocation))

    /**
     * @param parameters The parameters for the runtime configuration of the document.
     */
    override fun parameters(parameters: Any) {
      cdkBuilder.parameters(parameters)
    }

    /**
     * @param scheduleExpression A cron expression that specifies a schedule when the association
     * runs.
     * The schedule runs in Coordinated Universal Time (UTC).
     */
    override fun scheduleExpression(scheduleExpression: String) {
      cdkBuilder.scheduleExpression(scheduleExpression)
    }

    /**
     * @param scheduleOffset Number of days to wait after the scheduled day to run an association.
     */
    override fun scheduleOffset(scheduleOffset: Number) {
      cdkBuilder.scheduleOffset(scheduleOffset)
    }

    /**
     * @param syncCompliance The mode for generating association compliance.
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
     */
    override fun syncCompliance(syncCompliance: String) {
      cdkBuilder.syncCompliance(syncCompliance)
    }

    /**
     * @param targets The targets for the association.
     * You must specify the `InstanceId` or `Targets` property. You can target all instances in an
     * AWS account by specifyingt he `InstanceIds` key with a value of `*` . To view a JSON and a YAML
     * example that targets all instances, see the "Create an association for all managed instances in
     * an AWS account " later in this page.
     */
    override fun targets(targets: IResolvable) {
      cdkBuilder.targets(targets.let(IResolvable::unwrap))
    }

    /**
     * @param targets The targets for the association.
     * You must specify the `InstanceId` or `Targets` property. You can target all instances in an
     * AWS account by specifyingt he `InstanceIds` key with a value of `*` . To view a JSON and a YAML
     * example that targets all instances, see the "Create an association for all managed instances in
     * an AWS account " later in this page.
     */
    override fun targets(targets: List<Any>) {
      cdkBuilder.targets(targets)
    }

    /**
     * @param targets The targets for the association.
     * You must specify the `InstanceId` or `Targets` property. You can target all instances in an
     * AWS account by specifyingt he `InstanceIds` key with a value of `*` . To view a JSON and a YAML
     * example that targets all instances, see the "Create an association for all managed instances in
     * an AWS account " later in this page.
     */
    override fun targets(vararg targets: Any): Unit = targets(targets.toList())

    /**
     * @param waitForSuccessTimeoutSeconds The number of seconds the service should wait for the
     * association status to show "Success" before proceeding with the stack execution.
     * If the association status doesn't show "Success" after the specified number of seconds, then
     * stack creation fails.
     *
     *
     * When you specify a value for the `WaitForSuccessTimeoutSeconds` , [drift
     * detection](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html)
     * for your AWS CloudFormation stack’s configuration might yield inaccurate results. If drift
     * detection is important in your scenario, we recommend that you don’t include
     * `WaitForSuccessTimeoutSeconds` in your template.
     */
    override fun waitForSuccessTimeoutSeconds(waitForSuccessTimeoutSeconds: Number) {
      cdkBuilder.waitForSuccessTimeoutSeconds(waitForSuccessTimeoutSeconds)
    }

    public fun build(): software.amazon.awscdk.services.ssm.CfnAssociationProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ssm.CfnAssociationProps,
  ) : CdkObject(cdkObject), CfnAssociationProps {
    /**
     * By default, when you create a new association, the system runs it immediately after it is
     * created and then according to the schedule you specified.
     *
     * Specify this option if you don't want an association to run immediately after you create it.
     * This parameter is not supported for rate expressions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-applyonlyatcroninterval)
     */
    override fun applyOnlyAtCronInterval(): Any? = unwrap(this).getApplyOnlyAtCronInterval()

    /**
     * Specify a descriptive name for the association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-associationname)
     */
    override fun associationName(): String? = unwrap(this).getAssociationName()

    /**
     * Choose the parameter that will define how your automation will branch out.
     *
     * This target is required for associations that use an Automation runbook and target resources
     * by using rate controls. Automation is a capability of AWS Systems Manager .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-automationtargetparametername)
     */
    override fun automationTargetParameterName(): String? =
        unwrap(this).getAutomationTargetParameterName()

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
     */
    override fun calendarNames(): List<String> = unwrap(this).getCalendarNames() ?: emptyList()

    /**
     * The severity level that is assigned to the association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-complianceseverity)
     */
    override fun complianceSeverity(): String? = unwrap(this).getComplianceSeverity()

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
     */
    override fun documentVersion(): String? = unwrap(this).getDocumentVersion()

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
     */
    override fun instanceId(): String? = unwrap(this).getInstanceId()

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
     */
    override fun maxConcurrency(): String? = unwrap(this).getMaxConcurrency()

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
     */
    override fun maxErrors(): String? = unwrap(this).getMaxErrors()

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
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * An Amazon Simple Storage Service (Amazon S3) bucket where you want to store the output
     * details of the request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-outputlocation)
     */
    override fun outputLocation(): Any? = unwrap(this).getOutputLocation()

    /**
     * The parameters for the runtime configuration of the document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-parameters)
     */
    override fun parameters(): Any? = unwrap(this).getParameters()

    /**
     * A cron expression that specifies a schedule when the association runs.
     *
     * The schedule runs in Coordinated Universal Time (UTC).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-scheduleexpression)
     */
    override fun scheduleExpression(): String? = unwrap(this).getScheduleExpression()

    /**
     * Number of days to wait after the scheduled day to run an association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-scheduleoffset)
     */
    override fun scheduleOffset(): Number? = unwrap(this).getScheduleOffset()

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
     */
    override fun syncCompliance(): String? = unwrap(this).getSyncCompliance()

    /**
     * The targets for the association.
     *
     * You must specify the `InstanceId` or `Targets` property. You can target all instances in an
     * AWS account by specifyingt he `InstanceIds` key with a value of `*` . To view a JSON and a YAML
     * example that targets all instances, see the "Create an association for all managed instances in
     * an AWS account " later in this page.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-targets)
     */
    override fun targets(): Any? = unwrap(this).getTargets()

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
     */
    override fun waitForSuccessTimeoutSeconds(): Number? =
        unwrap(this).getWaitForSuccessTimeoutSeconds()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnAssociationProps):
        CfnAssociationProps = CdkObjectWrappers.wrap(cdkObject) as CfnAssociationProps

    internal fun unwrap(wrapped: CfnAssociationProps):
        software.amazon.awscdk.services.ssm.CfnAssociationProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ssm.CfnAssociationProps
  }
}

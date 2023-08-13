@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.ssm

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ssm.CfnAssociation
import software.amazon.awscdk.services.ssm.CfnAssociationProps
import software.amazon.awscdk.services.ssm.CfnDocument
import software.amazon.awscdk.services.ssm.CfnDocumentProps
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindow
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowProps
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTarget
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTargetProps
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTaskProps
import software.amazon.awscdk.services.ssm.CfnParameter
import software.amazon.awscdk.services.ssm.CfnParameterProps
import software.amazon.awscdk.services.ssm.CfnPatchBaseline
import software.amazon.awscdk.services.ssm.CfnPatchBaselineProps
import software.amazon.awscdk.services.ssm.CfnResourceDataSync
import software.amazon.awscdk.services.ssm.CfnResourceDataSyncProps
import software.amazon.awscdk.services.ssm.CfnResourcePolicy
import software.amazon.awscdk.services.ssm.CfnResourcePolicyProps
import software.amazon.awscdk.services.ssm.CommonStringParameterAttributes
import software.amazon.awscdk.services.ssm.ListParameterAttributes
import software.amazon.awscdk.services.ssm.ParameterOptions
import software.amazon.awscdk.services.ssm.SecureStringParameterAttributes
import software.amazon.awscdk.services.ssm.StringListParameter
import software.amazon.awscdk.services.ssm.StringListParameterProps
import software.amazon.awscdk.services.ssm.StringParameter
import software.amazon.awscdk.services.ssm.StringParameterAttributes
import software.amazon.awscdk.services.ssm.StringParameterProps
import software.constructs.Construct

public object ssm {
    /**
     * The `AWS::SSM::Association` resource creates a State Manager association for your managed
     * instances.
     *
     * A State Manager association defines the state that you want to maintain on your instances.
     * For example, an association can specify that anti-virus software must be installed and
     * running on your instances, or that certain ports must be closed. For static targets, the
     * association specifies a schedule for when the configuration is reapplied. For dynamic
     * targets, such as an AWS Resource Groups or an AWS Auto Scaling Group, State Manager applies
     * the configuration when new instances are added to the group. The association also specifies
     * actions to take when applying the configuration. For example, an association for anti-virus
     * software might run once a day. If the software is not installed, then State Manager installs
     * it. If the software is installed, but the service is not running, then the association might
     * instruct State Manager to start the service.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssm.*;
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
    public inline fun cfnAssociation(
        scope: Construct,
        id: String,
        block: CfnAssociationDsl.() -> Unit = {},
    ): CfnAssociation {
        val builder = CfnAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * `InstanceAssociationOutputLocation` is a property of the
     * [AWS::SSM::Association](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html)
     * resource that specifies an Amazon S3 bucket where you want to store the results of this
     * association request.
     *
     * For the minimal permissions required to enable Amazon S3 output for an association, see
     * [Creating associations](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-state-assoc.html)
     * in the *Systems Manager User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssm.*;
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
    public inline fun cfnAssociationInstanceAssociationOutputLocationProperty(
        block: CfnAssociationInstanceAssociationOutputLocationPropertyDsl.() -> Unit = {}
    ): CfnAssociation.InstanceAssociationOutputLocationProperty {
        val builder = CfnAssociationInstanceAssociationOutputLocationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnAssociation`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssm.*;
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
    public inline fun cfnAssociationProps(
        block: CfnAssociationPropsDsl.() -> Unit = {}
    ): CfnAssociationProps {
        val builder = CfnAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `S3OutputLocation` is a property of the
     * [AWS::SSM::Association](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html)
     * resource that specifies an Amazon S3 bucket where you want to store the results of this
     * association request.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssm.*;
     * S3OutputLocationProperty s3OutputLocationProperty = S3OutputLocationProperty.builder()
     * .outputS3BucketName("outputS3BucketName")
     * .outputS3KeyPrefix("outputS3KeyPrefix")
     * .outputS3Region("outputS3Region")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-s3outputlocation.html)
     */
    public inline fun cfnAssociationS3OutputLocationProperty(
        block: CfnAssociationS3OutputLocationPropertyDsl.() -> Unit = {}
    ): CfnAssociation.S3OutputLocationProperty {
        val builder = CfnAssociationS3OutputLocationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `Target` is a property of the
     * [AWS::SSM::Association](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html)
     * resource that specifies the targets for an SSM document in Systems Manager . You can target
     * all instances in an AWS account by specifying the `InstanceIds` key with a value of `*` . To
     * view a JSON and a YAML example that targets all instances, see "Create an association for all
     * managed instances in an AWS account " on the Examples page.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssm.*;
     * TargetProperty targetProperty = TargetProperty.builder()
     * .key("key")
     * .values(List.of("values"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-target.html)
     */
    public inline fun cfnAssociationTargetProperty(
        block: CfnAssociationTargetPropertyDsl.() -> Unit = {}
    ): CfnAssociation.TargetProperty {
        val builder = CfnAssociationTargetPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::SSM::Document` resource creates a Systems Manager (SSM) document in AWS Systems
     * Manager .
     *
     * This document defines the actions that Systems Manager performs on your AWS resources.
     *
     * This resource does not support CloudFormation drift detection.
     *
     * Example:
     * ```
     * Application application;
     * CfnDocument document;
     * SourcedConfiguration.Builder.create(this, "MySourcedConfiguration")
     * .application(application)
     * .location(ConfigurationSource.fromCfnDocument(document))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html)
     */
    public inline fun cfnDocument(
        scope: Construct,
        id: String,
        block: CfnDocumentDsl.() -> Unit = {},
    ): CfnDocument {
        val builder = CfnDocumentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Identifying information about a document attachment, including the file name and a key-value
     * pair that identifies the location of an attachment to a document.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssm.*;
     * AttachmentsSourceProperty attachmentsSourceProperty = AttachmentsSourceProperty.builder()
     * .key("key")
     * .name("name")
     * .values(List.of("values"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-document-attachmentssource.html)
     */
    public inline fun cfnDocumentAttachmentsSourceProperty(
        block: CfnDocumentAttachmentsSourcePropertyDsl.() -> Unit = {}
    ): CfnDocument.AttachmentsSourceProperty {
        val builder = CfnDocumentAttachmentsSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An SSM document required by the current document.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssm.*;
     * DocumentRequiresProperty documentRequiresProperty = DocumentRequiresProperty.builder()
     * .name("name")
     * .version("version")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-document-documentrequires.html)
     */
    public inline fun cfnDocumentDocumentRequiresProperty(
        block: CfnDocumentDocumentRequiresPropertyDsl.() -> Unit = {}
    ): CfnDocument.DocumentRequiresProperty {
        val builder = CfnDocumentDocumentRequiresPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDocument`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssm.*;
     * Object content;
     * CfnDocumentProps cfnDocumentProps = CfnDocumentProps.builder()
     * .content(content)
     * // the properties below are optional
     * .attachments(List.of(AttachmentsSourceProperty.builder()
     * .key("key")
     * .name("name")
     * .values(List.of("values"))
     * .build()))
     * .documentFormat("documentFormat")
     * .documentType("documentType")
     * .name("name")
     * .requires(List.of(DocumentRequiresProperty.builder()
     * .name("name")
     * .version("version")
     * .build()))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .targetType("targetType")
     * .updateMethod("updateMethod")
     * .versionName("versionName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html)
     */
    public inline fun cfnDocumentProps(
        block: CfnDocumentPropsDsl.() -> Unit = {}
    ): CfnDocumentProps {
        val builder = CfnDocumentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::SSM::MaintenanceWindow` resource represents general information about a maintenance
     * window for AWS Systems Manager .
     *
     * Maintenance Windows let you define a schedule for when to perform potentially disruptive
     * actions on your instances, such as patching an operating system (OS), updating drivers, or
     * installing software. Each maintenance window has a schedule, a duration, a set of registered
     * targets, and a set of registered tasks.
     *
     * For more information, see
     * [Systems Manager Maintenance Windows](https://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-maintenance.html)
     * in the *AWS Systems Manager User Guide* and
     * [CreateMaintenanceWindow](https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_CreateMaintenanceWindow.html)
     * in the *AWS Systems Manager API Reference* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssm.*;
     * CfnMaintenanceWindow cfnMaintenanceWindow = CfnMaintenanceWindow.Builder.create(this,
     * "MyCfnMaintenanceWindow")
     * .allowUnassociatedTargets(false)
     * .cutoff(123)
     * .duration(123)
     * .name("name")
     * .schedule("schedule")
     * // the properties below are optional
     * .description("description")
     * .endDate("endDate")
     * .scheduleOffset(123)
     * .scheduleTimezone("scheduleTimezone")
     * .startDate("startDate")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html)
     */
    public inline fun cfnMaintenanceWindow(
        scope: Construct,
        id: String,
        block: CfnMaintenanceWindowDsl.() -> Unit = {},
    ): CfnMaintenanceWindow {
        val builder = CfnMaintenanceWindowDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnMaintenanceWindow`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssm.*;
     * CfnMaintenanceWindowProps cfnMaintenanceWindowProps = CfnMaintenanceWindowProps.builder()
     * .allowUnassociatedTargets(false)
     * .cutoff(123)
     * .duration(123)
     * .name("name")
     * .schedule("schedule")
     * // the properties below are optional
     * .description("description")
     * .endDate("endDate")
     * .scheduleOffset(123)
     * .scheduleTimezone("scheduleTimezone")
     * .startDate("startDate")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html)
     */
    public inline fun cfnMaintenanceWindowProps(
        block: CfnMaintenanceWindowPropsDsl.() -> Unit = {}
    ): CfnMaintenanceWindowProps {
        val builder = CfnMaintenanceWindowPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::SSM::MaintenanceWindowTarget` resource registers a target with a maintenance window
     * for AWS Systems Manager .
     *
     * For more information, see
     * [RegisterTargetWithMaintenanceWindow](https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_RegisterTargetWithMaintenanceWindow.html)
     * in the *AWS Systems Manager API Reference* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssm.*;
     * CfnMaintenanceWindowTarget cfnMaintenanceWindowTarget =
     * CfnMaintenanceWindowTarget.Builder.create(this, "MyCfnMaintenanceWindowTarget")
     * .resourceType("resourceType")
     * .targets(List.of(TargetsProperty.builder()
     * .key("key")
     * .values(List.of("values"))
     * .build()))
     * .windowId("windowId")
     * // the properties below are optional
     * .description("description")
     * .name("name")
     * .ownerInformation("ownerInformation")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtarget.html)
     */
    public inline fun cfnMaintenanceWindowTarget(
        scope: Construct,
        id: String,
        block: CfnMaintenanceWindowTargetDsl.() -> Unit = {},
    ): CfnMaintenanceWindowTarget {
        val builder = CfnMaintenanceWindowTargetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnMaintenanceWindowTarget`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssm.*;
     * CfnMaintenanceWindowTargetProps cfnMaintenanceWindowTargetProps =
     * CfnMaintenanceWindowTargetProps.builder()
     * .resourceType("resourceType")
     * .targets(List.of(TargetsProperty.builder()
     * .key("key")
     * .values(List.of("values"))
     * .build()))
     * .windowId("windowId")
     * // the properties below are optional
     * .description("description")
     * .name("name")
     * .ownerInformation("ownerInformation")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtarget.html)
     */
    public inline fun cfnMaintenanceWindowTargetProps(
        block: CfnMaintenanceWindowTargetPropsDsl.() -> Unit = {}
    ): CfnMaintenanceWindowTargetProps {
        val builder = CfnMaintenanceWindowTargetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `Targets` property type specifies adding a target to a maintenance window target in AWS
     * Systems Manager .
     *
     * `Targets` is a property of the
     * [AWS::SSM::MaintenanceWindowTarget](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtarget.html)
     * resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssm.*;
     * TargetsProperty targetsProperty = TargetsProperty.builder()
     * .key("key")
     * .values(List.of("values"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtarget-targets.html)
     */
    public inline fun cfnMaintenanceWindowTargetTargetsProperty(
        block: CfnMaintenanceWindowTargetTargetsPropertyDsl.() -> Unit = {}
    ): CfnMaintenanceWindowTarget.TargetsProperty {
        val builder = CfnMaintenanceWindowTargetTargetsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::SSM::MaintenanceWindowTask` resource defines information about a task for an AWS
     * Systems Manager maintenance window.
     *
     * For more information, see
     * [RegisterTaskWithMaintenanceWindow](https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_RegisterTaskWithMaintenanceWindow.html)
     * in the *AWS Systems Manager API Reference* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssm.*;
     * Object parameters;
     * Object taskParameters;
     * CfnMaintenanceWindowTask cfnMaintenanceWindowTask =
     * CfnMaintenanceWindowTask.Builder.create(this, "MyCfnMaintenanceWindowTask")
     * .priority(123)
     * .taskArn("taskArn")
     * .taskType("taskType")
     * .windowId("windowId")
     * // the properties below are optional
     * .cutoffBehavior("cutoffBehavior")
     * .description("description")
     * .loggingInfo(LoggingInfoProperty.builder()
     * .region("region")
     * .s3Bucket("s3Bucket")
     * // the properties below are optional
     * .s3Prefix("s3Prefix")
     * .build())
     * .maxConcurrency("maxConcurrency")
     * .maxErrors("maxErrors")
     * .name("name")
     * .serviceRoleArn("serviceRoleArn")
     * .targets(List.of(TargetProperty.builder()
     * .key("key")
     * .values(List.of("values"))
     * .build()))
     * .taskInvocationParameters(TaskInvocationParametersProperty.builder()
     * .maintenanceWindowAutomationParameters(MaintenanceWindowAutomationParametersProperty.builder()
     * .documentVersion("documentVersion")
     * .parameters(parameters)
     * .build())
     * .maintenanceWindowLambdaParameters(MaintenanceWindowLambdaParametersProperty.builder()
     * .clientContext("clientContext")
     * .payload("payload")
     * .qualifier("qualifier")
     * .build())
     * .maintenanceWindowRunCommandParameters(MaintenanceWindowRunCommandParametersProperty.builder()
     * .cloudWatchOutputConfig(CloudWatchOutputConfigProperty.builder()
     * .cloudWatchLogGroupName("cloudWatchLogGroupName")
     * .cloudWatchOutputEnabled(false)
     * .build())
     * .comment("comment")
     * .documentHash("documentHash")
     * .documentHashType("documentHashType")
     * .documentVersion("documentVersion")
     * .notificationConfig(NotificationConfigProperty.builder()
     * .notificationArn("notificationArn")
     * // the properties below are optional
     * .notificationEvents(List.of("notificationEvents"))
     * .notificationType("notificationType")
     * .build())
     * .outputS3BucketName("outputS3BucketName")
     * .outputS3KeyPrefix("outputS3KeyPrefix")
     * .parameters(parameters)
     * .serviceRoleArn("serviceRoleArn")
     * .timeoutSeconds(123)
     * .build())
     * .maintenanceWindowStepFunctionsParameters(MaintenanceWindowStepFunctionsParametersProperty.builder()
     * .input("input")
     * .name("name")
     * .build())
     * .build())
     * .taskParameters(taskParameters)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html)
     */
    public inline fun cfnMaintenanceWindowTask(
        scope: Construct,
        id: String,
        block: CfnMaintenanceWindowTaskDsl.() -> Unit = {},
    ): CfnMaintenanceWindowTask {
        val builder = CfnMaintenanceWindowTaskDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration options for sending command output to Amazon CloudWatch Logs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssm.*;
     * CloudWatchOutputConfigProperty cloudWatchOutputConfigProperty =
     * CloudWatchOutputConfigProperty.builder()
     * .cloudWatchLogGroupName("cloudWatchLogGroupName")
     * .cloudWatchOutputEnabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-cloudwatchoutputconfig.html)
     */
    public inline fun cfnMaintenanceWindowTaskCloudWatchOutputConfigProperty(
        block: CfnMaintenanceWindowTaskCloudWatchOutputConfigPropertyDsl.() -> Unit = {}
    ): CfnMaintenanceWindowTask.CloudWatchOutputConfigProperty {
        val builder = CfnMaintenanceWindowTaskCloudWatchOutputConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `LoggingInfo` property type specifies information about the Amazon S3 bucket to write
     * instance-level logs to.
     *
     * `LoggingInfo` is a property of the
     * [AWS::SSM::MaintenanceWindowTask](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html)
     * resource.
     *
     * `LoggingInfo` has been deprecated. To specify an Amazon S3 bucket to contain logs, instead
     * use the `OutputS3BucketName` and `OutputS3KeyPrefix` options in the
     * `TaskInvocationParameters` structure. For information about how Systems Manager handles these
     * options for the supported maintenance window task types, see
     * [AWS ::SSM::MaintenanceWindowTask MaintenanceWindowRunCommandParameters](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssm.*;
     * LoggingInfoProperty loggingInfoProperty = LoggingInfoProperty.builder()
     * .region("region")
     * .s3Bucket("s3Bucket")
     * // the properties below are optional
     * .s3Prefix("s3Prefix")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-logginginfo.html)
     */
    public inline fun cfnMaintenanceWindowTaskLoggingInfoProperty(
        block: CfnMaintenanceWindowTaskLoggingInfoPropertyDsl.() -> Unit = {}
    ): CfnMaintenanceWindowTask.LoggingInfoProperty {
        val builder = CfnMaintenanceWindowTaskLoggingInfoPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `MaintenanceWindowAutomationParameters` property type specifies the parameters for an
     * `AUTOMATION` task type for a maintenance window task in AWS Systems Manager .
     *
     * `MaintenanceWindowAutomationParameters` is a property of the
     * [TaskInvocationParameters](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-taskinvocationparameters.html)
     * property type.
     *
     * For information about available parameters in Automation runbooks, you can view the content
     * of the runbook itself in the Systems Manager console. For information, see
     * [View runbook content](https://docs.aws.amazon.com/systems-manager/latest/userguide/automation-documents-reference-details.html#view-automation-json)
     * in the *AWS Systems Manager User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssm.*;
     * Object parameters;
     * MaintenanceWindowAutomationParametersProperty maintenanceWindowAutomationParametersProperty =
     * MaintenanceWindowAutomationParametersProperty.builder()
     * .documentVersion("documentVersion")
     * .parameters(parameters)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowautomationparameters.html)
     */
    public inline fun cfnMaintenanceWindowTaskMaintenanceWindowAutomationParametersProperty(
        block: CfnMaintenanceWindowTaskMaintenanceWindowAutomationParametersPropertyDsl.() -> Unit =
            {}
    ): CfnMaintenanceWindowTask.MaintenanceWindowAutomationParametersProperty {
        val builder = CfnMaintenanceWindowTaskMaintenanceWindowAutomationParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `MaintenanceWindowLambdaParameters` property type specifies the parameters for a `LAMBDA`
     * task type for a maintenance window task in AWS Systems Manager .
     *
     * `MaintenanceWindowLambdaParameters` is a property of the
     * [TaskInvocationParameters](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-taskinvocationparameters.html)
     * property type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssm.*;
     * MaintenanceWindowLambdaParametersProperty maintenanceWindowLambdaParametersProperty =
     * MaintenanceWindowLambdaParametersProperty.builder()
     * .clientContext("clientContext")
     * .payload("payload")
     * .qualifier("qualifier")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowlambdaparameters.html)
     */
    public inline fun cfnMaintenanceWindowTaskMaintenanceWindowLambdaParametersProperty(
        block: CfnMaintenanceWindowTaskMaintenanceWindowLambdaParametersPropertyDsl.() -> Unit = {}
    ): CfnMaintenanceWindowTask.MaintenanceWindowLambdaParametersProperty {
        val builder = CfnMaintenanceWindowTaskMaintenanceWindowLambdaParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `MaintenanceWindowRunCommandParameters` property type specifies the parameters for a
     * `RUN_COMMAND` task type for a maintenance window task in AWS Systems Manager .
     *
     * This means that these parameters are the same as those for the `SendCommand` API call. For
     * more information about `SendCommand` parameters, see
     * [SendCommand](https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_SendCommand.html)
     * in the *AWS Systems Manager API Reference* .
     *
     * For information about available parameters in SSM Command documents, you can view the content
     * of the document itself in the Systems Manager console. For information, see
     * [Viewing SSM command document content](https://docs.aws.amazon.com/systems-manager/latest/userguide/viewing-ssm-document-content.html)
     * in the *AWS Systems Manager User Guide* .
     *
     * `MaintenanceWindowRunCommandParameters` is a property of the
     * [TaskInvocationParameters](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-taskinvocationparameters.html)
     * property type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssm.*;
     * Object parameters;
     * MaintenanceWindowRunCommandParametersProperty maintenanceWindowRunCommandParametersProperty =
     * MaintenanceWindowRunCommandParametersProperty.builder()
     * .cloudWatchOutputConfig(CloudWatchOutputConfigProperty.builder()
     * .cloudWatchLogGroupName("cloudWatchLogGroupName")
     * .cloudWatchOutputEnabled(false)
     * .build())
     * .comment("comment")
     * .documentHash("documentHash")
     * .documentHashType("documentHashType")
     * .documentVersion("documentVersion")
     * .notificationConfig(NotificationConfigProperty.builder()
     * .notificationArn("notificationArn")
     * // the properties below are optional
     * .notificationEvents(List.of("notificationEvents"))
     * .notificationType("notificationType")
     * .build())
     * .outputS3BucketName("outputS3BucketName")
     * .outputS3KeyPrefix("outputS3KeyPrefix")
     * .parameters(parameters)
     * .serviceRoleArn("serviceRoleArn")
     * .timeoutSeconds(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html)
     */
    public inline fun cfnMaintenanceWindowTaskMaintenanceWindowRunCommandParametersProperty(
        block: CfnMaintenanceWindowTaskMaintenanceWindowRunCommandParametersPropertyDsl.() -> Unit =
            {}
    ): CfnMaintenanceWindowTask.MaintenanceWindowRunCommandParametersProperty {
        val builder = CfnMaintenanceWindowTaskMaintenanceWindowRunCommandParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `MaintenanceWindowStepFunctionsParameters` property type specifies the parameters for the
     * execution of a `STEP_FUNCTIONS` task in a Systems Manager maintenance window.
     *
     * `MaintenanceWindowStepFunctionsParameters` is a property of the
     * [TaskInvocationParameters](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-taskinvocationparameters.html)
     * property type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssm.*;
     * MaintenanceWindowStepFunctionsParametersProperty
     * maintenanceWindowStepFunctionsParametersProperty =
     * MaintenanceWindowStepFunctionsParametersProperty.builder()
     * .input("input")
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowstepfunctionsparameters.html)
     */
    public inline fun cfnMaintenanceWindowTaskMaintenanceWindowStepFunctionsParametersProperty(
        block:
            CfnMaintenanceWindowTaskMaintenanceWindowStepFunctionsParametersPropertyDsl.() -> Unit =
            {}
    ): CfnMaintenanceWindowTask.MaintenanceWindowStepFunctionsParametersProperty {
        val builder = CfnMaintenanceWindowTaskMaintenanceWindowStepFunctionsParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `NotificationConfig` property type specifies configurations for sending notifications for
     * a maintenance window task in AWS Systems Manager .
     *
     * `NotificationConfig` is a property of the
     * [MaintenanceWindowRunCommandParameters](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html)
     * property type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssm.*;
     * NotificationConfigProperty notificationConfigProperty = NotificationConfigProperty.builder()
     * .notificationArn("notificationArn")
     * // the properties below are optional
     * .notificationEvents(List.of("notificationEvents"))
     * .notificationType("notificationType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-notificationconfig.html)
     */
    public inline fun cfnMaintenanceWindowTaskNotificationConfigProperty(
        block: CfnMaintenanceWindowTaskNotificationConfigPropertyDsl.() -> Unit = {}
    ): CfnMaintenanceWindowTask.NotificationConfigProperty {
        val builder = CfnMaintenanceWindowTaskNotificationConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnMaintenanceWindowTask`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssm.*;
     * Object parameters;
     * Object taskParameters;
     * CfnMaintenanceWindowTaskProps cfnMaintenanceWindowTaskProps =
     * CfnMaintenanceWindowTaskProps.builder()
     * .priority(123)
     * .taskArn("taskArn")
     * .taskType("taskType")
     * .windowId("windowId")
     * // the properties below are optional
     * .cutoffBehavior("cutoffBehavior")
     * .description("description")
     * .loggingInfo(LoggingInfoProperty.builder()
     * .region("region")
     * .s3Bucket("s3Bucket")
     * // the properties below are optional
     * .s3Prefix("s3Prefix")
     * .build())
     * .maxConcurrency("maxConcurrency")
     * .maxErrors("maxErrors")
     * .name("name")
     * .serviceRoleArn("serviceRoleArn")
     * .targets(List.of(TargetProperty.builder()
     * .key("key")
     * .values(List.of("values"))
     * .build()))
     * .taskInvocationParameters(TaskInvocationParametersProperty.builder()
     * .maintenanceWindowAutomationParameters(MaintenanceWindowAutomationParametersProperty.builder()
     * .documentVersion("documentVersion")
     * .parameters(parameters)
     * .build())
     * .maintenanceWindowLambdaParameters(MaintenanceWindowLambdaParametersProperty.builder()
     * .clientContext("clientContext")
     * .payload("payload")
     * .qualifier("qualifier")
     * .build())
     * .maintenanceWindowRunCommandParameters(MaintenanceWindowRunCommandParametersProperty.builder()
     * .cloudWatchOutputConfig(CloudWatchOutputConfigProperty.builder()
     * .cloudWatchLogGroupName("cloudWatchLogGroupName")
     * .cloudWatchOutputEnabled(false)
     * .build())
     * .comment("comment")
     * .documentHash("documentHash")
     * .documentHashType("documentHashType")
     * .documentVersion("documentVersion")
     * .notificationConfig(NotificationConfigProperty.builder()
     * .notificationArn("notificationArn")
     * // the properties below are optional
     * .notificationEvents(List.of("notificationEvents"))
     * .notificationType("notificationType")
     * .build())
     * .outputS3BucketName("outputS3BucketName")
     * .outputS3KeyPrefix("outputS3KeyPrefix")
     * .parameters(parameters)
     * .serviceRoleArn("serviceRoleArn")
     * .timeoutSeconds(123)
     * .build())
     * .maintenanceWindowStepFunctionsParameters(MaintenanceWindowStepFunctionsParametersProperty.builder()
     * .input("input")
     * .name("name")
     * .build())
     * .build())
     * .taskParameters(taskParameters)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html)
     */
    public inline fun cfnMaintenanceWindowTaskProps(
        block: CfnMaintenanceWindowTaskPropsDsl.() -> Unit = {}
    ): CfnMaintenanceWindowTaskProps {
        val builder = CfnMaintenanceWindowTaskPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `Target` property type specifies targets (either instances or window target IDs).
     *
     * You specify instances by using `Key=InstanceIds,Values=&lt; *instanceid1* &gt;,&lt;
     * *instanceid2* &gt;` . You specify window target IDs using `Key=WindowTargetIds,Values=&lt;
     * *window-target-id-1* &gt;,&lt; *window-target-id-2* &gt;` for a maintenance window task in
     * AWS Systems Manager .
     *
     * `Target` is a property of the
     * [AWS::SSM::MaintenanceWindowTask](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html)
     * property type.
     *
     * To use `resource-groups:Name` as the key for a maintenance window target, specify the
     * resource group as a `AWS::SSM::MaintenanceWindowTarget` type, and use the `Ref` function to
     * specify the target for `AWS::SSM::MaintenanceWindowTask` . For an example, see *Create a Run
     * Command task that targets instances using a resource group name* in
     * [AWS::SSM::MaintenanceWindowTask Examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#aws-resource-ssm-maintenancewindowtask--examples)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssm.*;
     * TargetProperty targetProperty = TargetProperty.builder()
     * .key("key")
     * .values(List.of("values"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-target.html)
     */
    public inline fun cfnMaintenanceWindowTaskTargetProperty(
        block: CfnMaintenanceWindowTaskTargetPropertyDsl.() -> Unit = {}
    ): CfnMaintenanceWindowTask.TargetProperty {
        val builder = CfnMaintenanceWindowTaskTargetPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `TaskInvocationParameters` property type specifies the task execution parameters for a
     * maintenance window task in AWS Systems Manager .
     *
     * `TaskInvocationParameters` is a property of the
     * [AWS::SSM::MaintenanceWindowTask](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html)
     * property type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssm.*;
     * Object parameters;
     * TaskInvocationParametersProperty taskInvocationParametersProperty =
     * TaskInvocationParametersProperty.builder()
     * .maintenanceWindowAutomationParameters(MaintenanceWindowAutomationParametersProperty.builder()
     * .documentVersion("documentVersion")
     * .parameters(parameters)
     * .build())
     * .maintenanceWindowLambdaParameters(MaintenanceWindowLambdaParametersProperty.builder()
     * .clientContext("clientContext")
     * .payload("payload")
     * .qualifier("qualifier")
     * .build())
     * .maintenanceWindowRunCommandParameters(MaintenanceWindowRunCommandParametersProperty.builder()
     * .cloudWatchOutputConfig(CloudWatchOutputConfigProperty.builder()
     * .cloudWatchLogGroupName("cloudWatchLogGroupName")
     * .cloudWatchOutputEnabled(false)
     * .build())
     * .comment("comment")
     * .documentHash("documentHash")
     * .documentHashType("documentHashType")
     * .documentVersion("documentVersion")
     * .notificationConfig(NotificationConfigProperty.builder()
     * .notificationArn("notificationArn")
     * // the properties below are optional
     * .notificationEvents(List.of("notificationEvents"))
     * .notificationType("notificationType")
     * .build())
     * .outputS3BucketName("outputS3BucketName")
     * .outputS3KeyPrefix("outputS3KeyPrefix")
     * .parameters(parameters)
     * .serviceRoleArn("serviceRoleArn")
     * .timeoutSeconds(123)
     * .build())
     * .maintenanceWindowStepFunctionsParameters(MaintenanceWindowStepFunctionsParametersProperty.builder()
     * .input("input")
     * .name("name")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-taskinvocationparameters.html)
     */
    public inline fun cfnMaintenanceWindowTaskTaskInvocationParametersProperty(
        block: CfnMaintenanceWindowTaskTaskInvocationParametersPropertyDsl.() -> Unit = {}
    ): CfnMaintenanceWindowTask.TaskInvocationParametersProperty {
        val builder = CfnMaintenanceWindowTaskTaskInvocationParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::SSM::Parameter` resource creates an SSM parameter in AWS Systems Manager Parameter
     * Store.
     *
     * To create an SSM parameter, you must have the AWS Identity and Access Management ( IAM )
     * permissions `ssm:PutParameter` and `ssm:AddTagsToResource` . On stack creation, AWS
     * CloudFormation adds the following three tags to the parameter:
     * `aws:cloudformation:stack-name` , `aws:cloudformation:logical-id` , and
     * `aws:cloudformation:stack-id` , in addition to any custom tags you specify.
     *
     * To add, update, or remove tags during stack update, you must have IAM permissions for both
     * `ssm:AddTagsToResource` and `ssm:RemoveTagsFromResource` . For more information, see
     * [Managing Access Using Policies](https://docs.aws.amazon.com/systems-manager/latest/userguide/security-iam.html#security_iam_access-manage)
     * in the *AWS Systems Manager User Guide* .
     *
     * For information about valid values for parameters, see
     * [Requirements and Constraints for Parameter Names](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-paramstore-su-create.html#sysman-parameter-name-constraints)
     * in the *AWS Systems Manager User Guide* and
     * [PutParameter](https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_PutParameter.html)
     * in the *AWS Systems Manager API Reference* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssm.*;
     * Object tags;
     * CfnParameter cfnParameter = CfnParameter.Builder.create(this, "MyCfnParameter")
     * .type("type")
     * .value("value")
     * // the properties below are optional
     * .allowedPattern("allowedPattern")
     * .dataType("dataType")
     * .description("description")
     * .name("name")
     * .policies("policies")
     * .tags(tags)
     * .tier("tier")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html)
     */
    public inline fun cfnParameter(
        scope: Construct,
        id: String,
        block: CfnParameterDsl.() -> Unit = {},
    ): CfnParameter {
        val builder = CfnParameterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnParameter`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssm.*;
     * Object tags;
     * CfnParameterProps cfnParameterProps = CfnParameterProps.builder()
     * .type("type")
     * .value("value")
     * // the properties below are optional
     * .allowedPattern("allowedPattern")
     * .dataType("dataType")
     * .description("description")
     * .name("name")
     * .policies("policies")
     * .tags(tags)
     * .tier("tier")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html)
     */
    public inline fun cfnParameterProps(
        block: CfnParameterPropsDsl.() -> Unit = {}
    ): CfnParameterProps {
        val builder = CfnParameterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::SSM::PatchBaseline` resource defines the basic information for an AWS Systems
     * Manager patch baseline.
     *
     * A patch baseline defines which patches are approved for installation on your instances.
     *
     * For more information, see
     * [CreatePatchBaseline](https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_CreatePatchBaseline.html)
     * in the *AWS Systems Manager API Reference* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssm.*;
     * CfnPatchBaseline cfnPatchBaseline = CfnPatchBaseline.Builder.create(this, "MyCfnPatchBaseline")
     * .name("name")
     * // the properties below are optional
     * .approvalRules(RuleGroupProperty.builder()
     * .patchRules(List.of(RuleProperty.builder()
     * .approveAfterDays(123)
     * .approveUntilDate("approveUntilDate")
     * .complianceLevel("complianceLevel")
     * .enableNonSecurity(false)
     * .patchFilterGroup(PatchFilterGroupProperty.builder()
     * .patchFilters(List.of(PatchFilterProperty.builder()
     * .key("key")
     * .values(List.of("values"))
     * .build()))
     * .build())
     * .build()))
     * .build())
     * .approvedPatches(List.of("approvedPatches"))
     * .approvedPatchesComplianceLevel("approvedPatchesComplianceLevel")
     * .approvedPatchesEnableNonSecurity(false)
     * .description("description")
     * .globalFilters(PatchFilterGroupProperty.builder()
     * .patchFilters(List.of(PatchFilterProperty.builder()
     * .key("key")
     * .values(List.of("values"))
     * .build()))
     * .build())
     * .operatingSystem("operatingSystem")
     * .patchGroups(List.of("patchGroups"))
     * .rejectedPatches(List.of("rejectedPatches"))
     * .rejectedPatchesAction("rejectedPatchesAction")
     * .sources(List.of(PatchSourceProperty.builder()
     * .configuration("configuration")
     * .name("name")
     * .products(List.of("products"))
     * .build()))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html)
     */
    public inline fun cfnPatchBaseline(
        scope: Construct,
        id: String,
        block: CfnPatchBaselineDsl.() -> Unit = {},
    ): CfnPatchBaseline {
        val builder = CfnPatchBaselineDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `PatchFilterGroup` property type specifies a set of patch filters for an AWS Systems
     * Manager patch baseline, typically used for approval rules for a Systems Manager patch
     * baseline.
     *
     * `PatchFilterGroup` is the property type for the `GlobalFilters` property of the
     * [AWS::SSM::PatchBaseline](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html)
     * resource and the `PatchFilterGroup` property of the
     * [Rule](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html)
     * property type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssm.*;
     * PatchFilterGroupProperty patchFilterGroupProperty = PatchFilterGroupProperty.builder()
     * .patchFilters(List.of(PatchFilterProperty.builder()
     * .key("key")
     * .values(List.of("values"))
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfiltergroup.html)
     */
    public inline fun cfnPatchBaselinePatchFilterGroupProperty(
        block: CfnPatchBaselinePatchFilterGroupPropertyDsl.() -> Unit = {}
    ): CfnPatchBaseline.PatchFilterGroupProperty {
        val builder = CfnPatchBaselinePatchFilterGroupPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `PatchFilter` property type defines a patch filter for an AWS Systems Manager patch
     * baseline.
     *
     * The `PatchFilters` property of the
     * [PatchFilterGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfiltergroup.html)
     * property type contains a list of `PatchFilter` property types.
     *
     * You can view lists of valid values for the patch properties by running the
     * `DescribePatchProperties` command. For more information, see
     * [DescribePatchProperties](https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_DescribePatchProperties.html)
     * in the *AWS Systems Manager API Reference* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssm.*;
     * PatchFilterProperty patchFilterProperty = PatchFilterProperty.builder()
     * .key("key")
     * .values(List.of("values"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfilter.html)
     */
    public inline fun cfnPatchBaselinePatchFilterProperty(
        block: CfnPatchBaselinePatchFilterPropertyDsl.() -> Unit = {}
    ): CfnPatchBaseline.PatchFilterProperty {
        val builder = CfnPatchBaselinePatchFilterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `PatchSource` is the property type for the `Sources` resource of the
     * [AWS::SSM::PatchBaseline](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html)
     * resource.
     *
     * The AWS CloudFormation `AWS::SSM::PatchSource` resource is used to provide information about
     * the patches to use to update target instances, including target operating systems and source
     * repository. Applies to Linux instances only.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssm.*;
     * PatchSourceProperty patchSourceProperty = PatchSourceProperty.builder()
     * .configuration("configuration")
     * .name("name")
     * .products(List.of("products"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchsource.html)
     */
    public inline fun cfnPatchBaselinePatchSourceProperty(
        block: CfnPatchBaselinePatchSourcePropertyDsl.() -> Unit = {}
    ): CfnPatchBaseline.PatchSourceProperty {
        val builder = CfnPatchBaselinePatchSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnPatchBaseline`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssm.*;
     * CfnPatchBaselineProps cfnPatchBaselineProps = CfnPatchBaselineProps.builder()
     * .name("name")
     * // the properties below are optional
     * .approvalRules(RuleGroupProperty.builder()
     * .patchRules(List.of(RuleProperty.builder()
     * .approveAfterDays(123)
     * .approveUntilDate("approveUntilDate")
     * .complianceLevel("complianceLevel")
     * .enableNonSecurity(false)
     * .patchFilterGroup(PatchFilterGroupProperty.builder()
     * .patchFilters(List.of(PatchFilterProperty.builder()
     * .key("key")
     * .values(List.of("values"))
     * .build()))
     * .build())
     * .build()))
     * .build())
     * .approvedPatches(List.of("approvedPatches"))
     * .approvedPatchesComplianceLevel("approvedPatchesComplianceLevel")
     * .approvedPatchesEnableNonSecurity(false)
     * .description("description")
     * .globalFilters(PatchFilterGroupProperty.builder()
     * .patchFilters(List.of(PatchFilterProperty.builder()
     * .key("key")
     * .values(List.of("values"))
     * .build()))
     * .build())
     * .operatingSystem("operatingSystem")
     * .patchGroups(List.of("patchGroups"))
     * .rejectedPatches(List.of("rejectedPatches"))
     * .rejectedPatchesAction("rejectedPatchesAction")
     * .sources(List.of(PatchSourceProperty.builder()
     * .configuration("configuration")
     * .name("name")
     * .products(List.of("products"))
     * .build()))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html)
     */
    public inline fun cfnPatchBaselineProps(
        block: CfnPatchBaselinePropsDsl.() -> Unit = {}
    ): CfnPatchBaselineProps {
        val builder = CfnPatchBaselinePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `RuleGroup` property type specifies a set of rules that define the approval rules for an
     * AWS Systems Manager patch baseline.
     *
     * `RuleGroup` is the property type for the `ApprovalRules` property of the
     * [AWS::SSM::PatchBaseline](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html)
     * resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssm.*;
     * RuleGroupProperty ruleGroupProperty = RuleGroupProperty.builder()
     * .patchRules(List.of(RuleProperty.builder()
     * .approveAfterDays(123)
     * .approveUntilDate("approveUntilDate")
     * .complianceLevel("complianceLevel")
     * .enableNonSecurity(false)
     * .patchFilterGroup(PatchFilterGroupProperty.builder()
     * .patchFilters(List.of(PatchFilterProperty.builder()
     * .key("key")
     * .values(List.of("values"))
     * .build()))
     * .build())
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rulegroup.html)
     */
    public inline fun cfnPatchBaselineRuleGroupProperty(
        block: CfnPatchBaselineRuleGroupPropertyDsl.() -> Unit = {}
    ): CfnPatchBaseline.RuleGroupProperty {
        val builder = CfnPatchBaselineRuleGroupPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `Rule` property type specifies an approval rule for a Systems Manager patch baseline.
     *
     * The `PatchRules` property of the
     * [RuleGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rulegroup.html)
     * property type contains a list of `Rule` property types.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssm.*;
     * RuleProperty ruleProperty = RuleProperty.builder()
     * .approveAfterDays(123)
     * .approveUntilDate("approveUntilDate")
     * .complianceLevel("complianceLevel")
     * .enableNonSecurity(false)
     * .patchFilterGroup(PatchFilterGroupProperty.builder()
     * .patchFilters(List.of(PatchFilterProperty.builder()
     * .key("key")
     * .values(List.of("values"))
     * .build()))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html)
     */
    public inline fun cfnPatchBaselineRuleProperty(
        block: CfnPatchBaselineRulePropertyDsl.() -> Unit = {}
    ): CfnPatchBaseline.RuleProperty {
        val builder = CfnPatchBaselineRulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::SSM::ResourceDataSync` resource creates, updates, or deletes a resource data sync
     * for AWS Systems Manager .
     *
     * A resource data sync helps you view data from multiple sources in a single location. Systems
     * Manager offers two types of resource data sync: `SyncToDestination` and `SyncFromSource` .
     *
     * You can configure Systems Manager Inventory to use the `SyncToDestination` type to
     * synchronize Inventory data from multiple AWS Regions to a single Amazon S3 bucket.
     *
     * You can configure Systems Manager Explorer to use the `SyncFromSource` type to synchronize
     * operational work items (OpsItems) and operational data (OpsData) from multiple AWS Regions .
     * This type can synchronize OpsItems and OpsData from multiple AWS accounts and Regions or from
     * an `EntireOrganization` by using AWS Organizations .
     *
     * A resource data sync is an asynchronous operation that returns immediately. After a
     * successful initial sync is completed, the system continuously syncs data.
     *
     * By default, data is not encrypted in Amazon S3 . We strongly recommend that you enable
     * encryption in Amazon S3 to ensure secure data storage. We also recommend that you secure
     * access to the Amazon S3 bucket by creating a restrictive bucket policy.
     *
     * For more information, see
     * [Configuring Inventory Collection](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-inventory-configuring.html#sysman-inventory-datasync)
     * and
     * [Setting Up Systems Manager Explorer to Display Data from Multiple Accounts and Regions](https://docs.aws.amazon.com/systems-manager/latest/userguide/Explorer-resource-data-sync.html)
     * in the *AWS Systems Manager User Guide* .
     *
     * Important: The following *Syntax* section shows all fields that are supported for a resource
     * data sync. The *Examples* section below shows the recommended way to specify configurations
     * for each sync type. Please see the *Examples* section when you create your resource data
     * sync.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssm.*;
     * CfnResourceDataSync cfnResourceDataSync = CfnResourceDataSync.Builder.create(this,
     * "MyCfnResourceDataSync")
     * .syncName("syncName")
     * // the properties below are optional
     * .bucketName("bucketName")
     * .bucketPrefix("bucketPrefix")
     * .bucketRegion("bucketRegion")
     * .kmsKeyArn("kmsKeyArn")
     * .s3Destination(S3DestinationProperty.builder()
     * .bucketName("bucketName")
     * .bucketRegion("bucketRegion")
     * .syncFormat("syncFormat")
     * // the properties below are optional
     * .bucketPrefix("bucketPrefix")
     * .kmsKeyArn("kmsKeyArn")
     * .build())
     * .syncFormat("syncFormat")
     * .syncSource(SyncSourceProperty.builder()
     * .sourceRegions(List.of("sourceRegions"))
     * .sourceType("sourceType")
     * // the properties below are optional
     * .awsOrganizationsSource(AwsOrganizationsSourceProperty.builder()
     * .organizationSourceType("organizationSourceType")
     * // the properties below are optional
     * .organizationalUnits(List.of("organizationalUnits"))
     * .build())
     * .includeFutureRegions(false)
     * .build())
     * .syncType("syncType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html)
     */
    public inline fun cfnResourceDataSync(
        scope: Construct,
        id: String,
        block: CfnResourceDataSyncDsl.() -> Unit = {},
    ): CfnResourceDataSync {
        val builder = CfnResourceDataSyncDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about the `AwsOrganizationsSource` resource data sync source.
     *
     * A sync source of this type can synchronize data from AWS Organizations or, if an AWS
     * organization isn't present, from multiple AWS Regions .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssm.*;
     * AwsOrganizationsSourceProperty awsOrganizationsSourceProperty =
     * AwsOrganizationsSourceProperty.builder()
     * .organizationSourceType("organizationSourceType")
     * // the properties below are optional
     * .organizationalUnits(List.of("organizationalUnits"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-awsorganizationssource.html)
     */
    public inline fun cfnResourceDataSyncAwsOrganizationsSourceProperty(
        block: CfnResourceDataSyncAwsOrganizationsSourcePropertyDsl.() -> Unit = {}
    ): CfnResourceDataSync.AwsOrganizationsSourceProperty {
        val builder = CfnResourceDataSyncAwsOrganizationsSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnResourceDataSync`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssm.*;
     * CfnResourceDataSyncProps cfnResourceDataSyncProps = CfnResourceDataSyncProps.builder()
     * .syncName("syncName")
     * // the properties below are optional
     * .bucketName("bucketName")
     * .bucketPrefix("bucketPrefix")
     * .bucketRegion("bucketRegion")
     * .kmsKeyArn("kmsKeyArn")
     * .s3Destination(S3DestinationProperty.builder()
     * .bucketName("bucketName")
     * .bucketRegion("bucketRegion")
     * .syncFormat("syncFormat")
     * // the properties below are optional
     * .bucketPrefix("bucketPrefix")
     * .kmsKeyArn("kmsKeyArn")
     * .build())
     * .syncFormat("syncFormat")
     * .syncSource(SyncSourceProperty.builder()
     * .sourceRegions(List.of("sourceRegions"))
     * .sourceType("sourceType")
     * // the properties below are optional
     * .awsOrganizationsSource(AwsOrganizationsSourceProperty.builder()
     * .organizationSourceType("organizationSourceType")
     * // the properties below are optional
     * .organizationalUnits(List.of("organizationalUnits"))
     * .build())
     * .includeFutureRegions(false)
     * .build())
     * .syncType("syncType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html)
     */
    public inline fun cfnResourceDataSyncProps(
        block: CfnResourceDataSyncPropsDsl.() -> Unit = {}
    ): CfnResourceDataSyncProps {
        val builder = CfnResourceDataSyncPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about the target S3 bucket for the resource data sync.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssm.*;
     * S3DestinationProperty s3DestinationProperty = S3DestinationProperty.builder()
     * .bucketName("bucketName")
     * .bucketRegion("bucketRegion")
     * .syncFormat("syncFormat")
     * // the properties below are optional
     * .bucketPrefix("bucketPrefix")
     * .kmsKeyArn("kmsKeyArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-s3destination.html)
     */
    public inline fun cfnResourceDataSyncS3DestinationProperty(
        block: CfnResourceDataSyncS3DestinationPropertyDsl.() -> Unit = {}
    ): CfnResourceDataSync.S3DestinationProperty {
        val builder = CfnResourceDataSyncS3DestinationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about the source of the data included in the resource data sync.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssm.*;
     * SyncSourceProperty syncSourceProperty = SyncSourceProperty.builder()
     * .sourceRegions(List.of("sourceRegions"))
     * .sourceType("sourceType")
     * // the properties below are optional
     * .awsOrganizationsSource(AwsOrganizationsSourceProperty.builder()
     * .organizationSourceType("organizationSourceType")
     * // the properties below are optional
     * .organizationalUnits(List.of("organizationalUnits"))
     * .build())
     * .includeFutureRegions(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-syncsource.html)
     */
    public inline fun cfnResourceDataSyncSyncSourceProperty(
        block: CfnResourceDataSyncSyncSourcePropertyDsl.() -> Unit = {}
    ): CfnResourceDataSync.SyncSourceProperty {
        val builder = CfnResourceDataSyncSyncSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates or updates a Systems Manager resource policy.
     *
     * A resource policy helps you to define the IAM entity (for example, an AWS account ) that can
     * manage your Systems Manager resources. Currently, `OpsItemGroup` is the only resource that
     * supports Systems Manager resource policies. The resource policy for `OpsItemGroup` enables
     * AWS accounts to view and interact with OpsCenter operational work items (OpsItems). OpsCenter
     * is a capability of Systems Manager .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssm.*;
     * Object policy;
     * CfnResourcePolicy cfnResourcePolicy = CfnResourcePolicy.Builder.create(this,
     * "MyCfnResourcePolicy")
     * .policy(policy)
     * .resourceArn("resourceArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcepolicy.html)
     */
    public inline fun cfnResourcePolicy(
        scope: Construct,
        id: String,
        block: CfnResourcePolicyDsl.() -> Unit = {},
    ): CfnResourcePolicy {
        val builder = CfnResourcePolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnResourcePolicy`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssm.*;
     * Object policy;
     * CfnResourcePolicyProps cfnResourcePolicyProps = CfnResourcePolicyProps.builder()
     * .policy(policy)
     * .resourceArn("resourceArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcepolicy.html)
     */
    public inline fun cfnResourcePolicyProps(
        block: CfnResourcePolicyPropsDsl.() -> Unit = {}
    ): CfnResourcePolicyProps {
        val builder = CfnResourcePolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Common attributes for string parameters.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssm.*;
     * CommonStringParameterAttributes commonStringParameterAttributes =
     * CommonStringParameterAttributes.builder()
     * .parameterName("parameterName")
     * // the properties below are optional
     * .simpleName(false)
     * .build();
     * ```
     */
    public inline fun commonStringParameterAttributes(
        block: CommonStringParameterAttributesDsl.() -> Unit = {}
    ): CommonStringParameterAttributes {
        val builder = CommonStringParameterAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Attributes for parameters of string list type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssm.*;
     * ListParameterAttributes listParameterAttributes = ListParameterAttributes.builder()
     * .parameterName("parameterName")
     * // the properties below are optional
     * .elementType(ParameterValueType.STRING)
     * .simpleName(false)
     * .version(123)
     * .build();
     * ```
     *
     * [Documentation](ParameterType)
     */
    public inline fun listParameterAttributes(
        block: ListParameterAttributesDsl.() -> Unit = {}
    ): ListParameterAttributes {
        val builder = ListParameterAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties needed to create a new SSM Parameter.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssm.*;
     * ParameterOptions parameterOptions = ParameterOptions.builder()
     * .allowedPattern("allowedPattern")
     * .description("description")
     * .parameterName("parameterName")
     * .simpleName(false)
     * .tier(ParameterTier.ADVANCED)
     * .build();
     * ```
     */
    public inline fun parameterOptions(
        block: ParameterOptionsDsl.() -> Unit = {}
    ): ParameterOptions {
        val builder = ParameterOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Attributes for secure string parameters.
     *
     * Example:
     * ```
     * Number parameterVersion = Token.asNumber(Map.of("Ref", "MyParameter"));
     * // Retrieve the latest value of the non-secret parameter
     * // with name "/My/String/Parameter".
     * String stringValue = StringParameter.fromStringParameterAttributes(this, "MyValue",
     * StringParameterAttributes.builder()
     * .parameterName("/My/Public/Parameter")
     * .build()).getStringValue();
     * String stringValueVersionFromToken = StringParameter.fromStringParameterAttributes(this,
     * "MyValueVersionFromToken", StringParameterAttributes.builder()
     * .parameterName("/My/Public/Parameter")
     * // parameter version from token
     * .version(parameterVersion)
     * .build()).getStringValue();
     * // Retrieve a specific version of the secret (SecureString) parameter.
     * // 'version' is always required.
     * IStringParameter secretValue = StringParameter.fromSecureStringParameterAttributes(this,
     * "MySecureValue", SecureStringParameterAttributes.builder()
     * .parameterName("/My/Secret/Parameter")
     * .version(5)
     * .build());
     * IStringParameter secretValueVersionFromToken =
     * StringParameter.fromSecureStringParameterAttributes(this, "MySecureValueVersionFromToken",
     * SecureStringParameterAttributes.builder()
     * .parameterName("/My/Secret/Parameter")
     * // parameter version from token
     * .version(parameterVersion)
     * .build());
     * ```
     */
    public inline fun secureStringParameterAttributes(
        block: SecureStringParameterAttributesDsl.() -> Unit = {}
    ): SecureStringParameterAttributes {
        val builder = SecureStringParameterAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a new StringList SSM Parameter.
     *
     * Example:
     * ```
     * StringListParameter.valueForTypedListParameter(this, "/My/Public/Parameter",
     * ParameterValueType.AWS_EC2_IMAGE_ID);
     * ```
     */
    public inline fun stringListParameter(
        scope: Construct,
        id: String,
        block: StringListParameterDsl.() -> Unit = {},
    ): StringListParameter {
        val builder = StringListParameterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties needed to create a StringList SSM Parameter.
     *
     * Example:
     * ```
     * // Grant read access to some Role
     * IRole role;
     * // Create a new SSM Parameter holding a String
     * StringParameter param = StringParameter.Builder.create(this, "StringParameter")
     * // description: 'Some user-friendly description',
     * // name: 'ParameterName',
     * .stringValue("Initial parameter value")
     * .build();
     * param.grantRead(role);
     * // Create a new SSM Parameter holding a StringList
     * StringListParameter listParameter = StringListParameter.Builder.create(this,
     * "StringListParameter")
     * // description: 'Some user-friendly description',
     * // name: 'ParameterName',
     * .stringListValue(List.of("Initial parameter value A", "Initial parameter value B"))
     * .build();
     * ```
     */
    public inline fun stringListParameterProps(
        block: StringListParameterPropsDsl.() -> Unit = {}
    ): StringListParameterProps {
        val builder = StringListParameterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a new String SSM Parameter.
     *
     * Example:
     * ```
     * StringParameter ssmParameter = StringParameter.Builder.create(this, "mySsmParameter")
     * .parameterName("mySsmParameter")
     * .stringValue("mySsmParameterValue")
     * .build();
     * ```
     */
    public inline fun stringParameter(
        scope: Construct,
        id: String,
        block: StringParameterDsl.() -> Unit = {},
    ): StringParameter {
        val builder = StringParameterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Attributes for parameters of various types of string.
     *
     * Example:
     * ```
     * Number parameterVersion = Token.asNumber(Map.of("Ref", "MyParameter"));
     * // Retrieve the latest value of the non-secret parameter
     * // with name "/My/String/Parameter".
     * String stringValue = StringParameter.fromStringParameterAttributes(this, "MyValue",
     * StringParameterAttributes.builder()
     * .parameterName("/My/Public/Parameter")
     * .build()).getStringValue();
     * String stringValueVersionFromToken = StringParameter.fromStringParameterAttributes(this,
     * "MyValueVersionFromToken", StringParameterAttributes.builder()
     * .parameterName("/My/Public/Parameter")
     * // parameter version from token
     * .version(parameterVersion)
     * .build()).getStringValue();
     * // Retrieve a specific version of the secret (SecureString) parameter.
     * // 'version' is always required.
     * IStringParameter secretValue = StringParameter.fromSecureStringParameterAttributes(this,
     * "MySecureValue", SecureStringParameterAttributes.builder()
     * .parameterName("/My/Secret/Parameter")
     * .version(5)
     * .build());
     * IStringParameter secretValueVersionFromToken =
     * StringParameter.fromSecureStringParameterAttributes(this, "MySecureValueVersionFromToken",
     * SecureStringParameterAttributes.builder()
     * .parameterName("/My/Secret/Parameter")
     * // parameter version from token
     * .version(parameterVersion)
     * .build());
     * ```
     *
     * [Documentation](ParameterType)
     */
    public inline fun stringParameterAttributes(
        block: StringParameterAttributesDsl.() -> Unit = {}
    ): StringParameterAttributes {
        val builder = StringParameterAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties needed to create a String SSM parameter.
     *
     * Example:
     * ```
     * // Grant read access to some Role
     * IRole role;
     * // Create a new SSM Parameter holding a String
     * StringParameter param = StringParameter.Builder.create(this, "StringParameter")
     * // description: 'Some user-friendly description',
     * // name: 'ParameterName',
     * .stringValue("Initial parameter value")
     * .build();
     * param.grantRead(role);
     * // Create a new SSM Parameter holding a StringList
     * StringListParameter listParameter = StringListParameter.Builder.create(this,
     * "StringListParameter")
     * // description: 'Some user-friendly description',
     * // name: 'ParameterName',
     * .stringListValue(List.of("Initial parameter value A", "Initial parameter value B"))
     * .build();
     * ```
     */
    public inline fun stringParameterProps(
        block: StringParameterPropsDsl.() -> Unit = {}
    ): StringParameterProps {
        val builder = StringParameterPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}

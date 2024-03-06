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

package io.cloudshiftdev.awscdkdsl.services.appflow

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnFlow
import software.constructs.Construct

/**
 * The `AWS::AppFlow::Flow` resource is an Amazon AppFlow resource type that specifies a new flow.
 *
 * If you want to use AWS CloudFormation to create a connector profile for connectors that implement
 * OAuth (such as Salesforce, Slack, Zendesk, and Google Analytics), you must fetch the access and
 * refresh tokens. You can do this by implementing your own UI for OAuth, or by retrieving the
 * tokens from elsewhere. Alternatively, you can use the Amazon AppFlow console to create the
 * connector profile, and then use that connector profile in the flow creation CloudFormation
 * template.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * CfnFlow cfnFlow = CfnFlow.Builder.create(this, "MyCfnFlow")
 * .destinationFlowConfigList(List.of(DestinationFlowConfigProperty.builder()
 * .connectorType("connectorType")
 * .destinationConnectorProperties(DestinationConnectorPropertiesProperty.builder()
 * .customConnector(CustomConnectorDestinationPropertiesProperty.builder()
 * .entityName("entityName")
 * // the properties below are optional
 * .customProperties(Map.of(
 * "customPropertiesKey", "customProperties"))
 * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
 * .bucketName("bucketName")
 * .bucketPrefix("bucketPrefix")
 * .failOnFirstError(false)
 * .build())
 * .idFieldNames(List.of("idFieldNames"))
 * .writeOperationType("writeOperationType")
 * .build())
 * .eventBridge(EventBridgeDestinationPropertiesProperty.builder()
 * .object("object")
 * // the properties below are optional
 * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
 * .bucketName("bucketName")
 * .bucketPrefix("bucketPrefix")
 * .failOnFirstError(false)
 * .build())
 * .build())
 * .lookoutMetrics(LookoutMetricsDestinationPropertiesProperty.builder()
 * .object("object")
 * .build())
 * .marketo(MarketoDestinationPropertiesProperty.builder()
 * .object("object")
 * // the properties below are optional
 * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
 * .bucketName("bucketName")
 * .bucketPrefix("bucketPrefix")
 * .failOnFirstError(false)
 * .build())
 * .build())
 * .redshift(RedshiftDestinationPropertiesProperty.builder()
 * .intermediateBucketName("intermediateBucketName")
 * .object("object")
 * // the properties below are optional
 * .bucketPrefix("bucketPrefix")
 * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
 * .bucketName("bucketName")
 * .bucketPrefix("bucketPrefix")
 * .failOnFirstError(false)
 * .build())
 * .build())
 * .s3(S3DestinationPropertiesProperty.builder()
 * .bucketName("bucketName")
 * // the properties below are optional
 * .bucketPrefix("bucketPrefix")
 * .s3OutputFormatConfig(S3OutputFormatConfigProperty.builder()
 * .aggregationConfig(AggregationConfigProperty.builder()
 * .aggregationType("aggregationType")
 * .targetFileSize(123)
 * .build())
 * .fileType("fileType")
 * .prefixConfig(PrefixConfigProperty.builder()
 * .pathPrefixHierarchy(List.of("pathPrefixHierarchy"))
 * .prefixFormat("prefixFormat")
 * .prefixType("prefixType")
 * .build())
 * .preserveSourceDataTyping(false)
 * .build())
 * .build())
 * .salesforce(SalesforceDestinationPropertiesProperty.builder()
 * .object("object")
 * // the properties below are optional
 * .dataTransferApi("dataTransferApi")
 * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
 * .bucketName("bucketName")
 * .bucketPrefix("bucketPrefix")
 * .failOnFirstError(false)
 * .build())
 * .idFieldNames(List.of("idFieldNames"))
 * .writeOperationType("writeOperationType")
 * .build())
 * .sapoData(SAPODataDestinationPropertiesProperty.builder()
 * .objectPath("objectPath")
 * // the properties below are optional
 * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
 * .bucketName("bucketName")
 * .bucketPrefix("bucketPrefix")
 * .failOnFirstError(false)
 * .build())
 * .idFieldNames(List.of("idFieldNames"))
 * .successResponseHandlingConfig(SuccessResponseHandlingConfigProperty.builder()
 * .bucketName("bucketName")
 * .bucketPrefix("bucketPrefix")
 * .build())
 * .writeOperationType("writeOperationType")
 * .build())
 * .snowflake(SnowflakeDestinationPropertiesProperty.builder()
 * .intermediateBucketName("intermediateBucketName")
 * .object("object")
 * // the properties below are optional
 * .bucketPrefix("bucketPrefix")
 * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
 * .bucketName("bucketName")
 * .bucketPrefix("bucketPrefix")
 * .failOnFirstError(false)
 * .build())
 * .build())
 * .upsolver(UpsolverDestinationPropertiesProperty.builder()
 * .bucketName("bucketName")
 * .s3OutputFormatConfig(UpsolverS3OutputFormatConfigProperty.builder()
 * .prefixConfig(PrefixConfigProperty.builder()
 * .pathPrefixHierarchy(List.of("pathPrefixHierarchy"))
 * .prefixFormat("prefixFormat")
 * .prefixType("prefixType")
 * .build())
 * // the properties below are optional
 * .aggregationConfig(AggregationConfigProperty.builder()
 * .aggregationType("aggregationType")
 * .targetFileSize(123)
 * .build())
 * .fileType("fileType")
 * .build())
 * // the properties below are optional
 * .bucketPrefix("bucketPrefix")
 * .build())
 * .zendesk(ZendeskDestinationPropertiesProperty.builder()
 * .object("object")
 * // the properties below are optional
 * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
 * .bucketName("bucketName")
 * .bucketPrefix("bucketPrefix")
 * .failOnFirstError(false)
 * .build())
 * .idFieldNames(List.of("idFieldNames"))
 * .writeOperationType("writeOperationType")
 * .build())
 * .build())
 * // the properties below are optional
 * .apiVersion("apiVersion")
 * .connectorProfileName("connectorProfileName")
 * .build()))
 * .flowName("flowName")
 * .sourceFlowConfig(SourceFlowConfigProperty.builder()
 * .connectorType("connectorType")
 * .sourceConnectorProperties(SourceConnectorPropertiesProperty.builder()
 * .amplitude(AmplitudeSourcePropertiesProperty.builder()
 * .object("object")
 * .build())
 * .customConnector(CustomConnectorSourcePropertiesProperty.builder()
 * .entityName("entityName")
 * // the properties below are optional
 * .customProperties(Map.of(
 * "customPropertiesKey", "customProperties"))
 * .dataTransferApi(DataTransferApiProperty.builder()
 * .name("name")
 * .type("type")
 * .build())
 * .build())
 * .datadog(DatadogSourcePropertiesProperty.builder()
 * .object("object")
 * .build())
 * .dynatrace(DynatraceSourcePropertiesProperty.builder()
 * .object("object")
 * .build())
 * .googleAnalytics(GoogleAnalyticsSourcePropertiesProperty.builder()
 * .object("object")
 * .build())
 * .inforNexus(InforNexusSourcePropertiesProperty.builder()
 * .object("object")
 * .build())
 * .marketo(MarketoSourcePropertiesProperty.builder()
 * .object("object")
 * .build())
 * .pardot(PardotSourcePropertiesProperty.builder()
 * .object("object")
 * .build())
 * .s3(S3SourcePropertiesProperty.builder()
 * .bucketName("bucketName")
 * .bucketPrefix("bucketPrefix")
 * // the properties below are optional
 * .s3InputFormatConfig(S3InputFormatConfigProperty.builder()
 * .s3InputFileType("s3InputFileType")
 * .build())
 * .build())
 * .salesforce(SalesforceSourcePropertiesProperty.builder()
 * .object("object")
 * // the properties below are optional
 * .dataTransferApi("dataTransferApi")
 * .enableDynamicFieldUpdate(false)
 * .includeDeletedRecords(false)
 * .build())
 * .sapoData(SAPODataSourcePropertiesProperty.builder()
 * .objectPath("objectPath")
 * // the properties below are optional
 * .paginationConfig(SAPODataPaginationConfigProperty.builder()
 * .maxPageSize(123)
 * .build())
 * .parallelismConfig(SAPODataParallelismConfigProperty.builder()
 * .maxParallelism(123)
 * .build())
 * .build())
 * .serviceNow(ServiceNowSourcePropertiesProperty.builder()
 * .object("object")
 * .build())
 * .singular(SingularSourcePropertiesProperty.builder()
 * .object("object")
 * .build())
 * .slack(SlackSourcePropertiesProperty.builder()
 * .object("object")
 * .build())
 * .trendmicro(TrendmicroSourcePropertiesProperty.builder()
 * .object("object")
 * .build())
 * .veeva(VeevaSourcePropertiesProperty.builder()
 * .object("object")
 * // the properties below are optional
 * .documentType("documentType")
 * .includeAllVersions(false)
 * .includeRenditions(false)
 * .includeSourceFiles(false)
 * .build())
 * .zendesk(ZendeskSourcePropertiesProperty.builder()
 * .object("object")
 * .build())
 * .build())
 * // the properties below are optional
 * .apiVersion("apiVersion")
 * .connectorProfileName("connectorProfileName")
 * .incrementalPullConfig(IncrementalPullConfigProperty.builder()
 * .datetimeTypeFieldName("datetimeTypeFieldName")
 * .build())
 * .build())
 * .tasks(List.of(TaskProperty.builder()
 * .sourceFields(List.of("sourceFields"))
 * .taskType("taskType")
 * // the properties below are optional
 * .connectorOperator(ConnectorOperatorProperty.builder()
 * .amplitude("amplitude")
 * .customConnector("customConnector")
 * .datadog("datadog")
 * .dynatrace("dynatrace")
 * .googleAnalytics("googleAnalytics")
 * .inforNexus("inforNexus")
 * .marketo("marketo")
 * .pardot("pardot")
 * .s3("s3")
 * .salesforce("salesforce")
 * .sapoData("sapoData")
 * .serviceNow("serviceNow")
 * .singular("singular")
 * .slack("slack")
 * .trendmicro("trendmicro")
 * .veeva("veeva")
 * .zendesk("zendesk")
 * .build())
 * .destinationField("destinationField")
 * .taskProperties(List.of(TaskPropertiesObjectProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build()))
 * .triggerConfig(TriggerConfigProperty.builder()
 * .triggerType("triggerType")
 * // the properties below are optional
 * .triggerProperties(ScheduledTriggerPropertiesProperty.builder()
 * .scheduleExpression("scheduleExpression")
 * // the properties below are optional
 * .dataPullMode("dataPullMode")
 * .firstExecutionFrom(123)
 * .flowErrorDeactivationThreshold(123)
 * .scheduleEndTime(123)
 * .scheduleOffset(123)
 * .scheduleStartTime(123)
 * .timeZone("timeZone")
 * .build())
 * .build())
 * // the properties below are optional
 * .description("description")
 * .flowStatus("flowStatus")
 * .kmsArn("kmsArn")
 * .metadataCatalogConfig(MetadataCatalogConfigProperty.builder()
 * .glueDataCatalog(GlueDataCatalogProperty.builder()
 * .databaseName("databaseName")
 * .roleArn("roleArn")
 * .tablePrefix("tablePrefix")
 * .build())
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html)
 */
@CdkDslMarker
public class CfnFlowDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnFlow.Builder = CfnFlow.Builder.create(scope, id)

    private val _destinationFlowConfigList: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _tasks: MutableList<Any> = mutableListOf()

    /**
     * A user-entered description of the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-description)
     *
     * @param description A user-entered description of the flow.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The configuration that controls how Amazon AppFlow places data in the destination connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-destinationflowconfiglist)
     *
     * @param destinationFlowConfigList The configuration that controls how Amazon AppFlow places
     *   data in the destination connector.
     */
    public fun destinationFlowConfigList(vararg destinationFlowConfigList: Any) {
        _destinationFlowConfigList.addAll(listOf(*destinationFlowConfigList))
    }

    /**
     * The configuration that controls how Amazon AppFlow places data in the destination connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-destinationflowconfiglist)
     *
     * @param destinationFlowConfigList The configuration that controls how Amazon AppFlow places
     *   data in the destination connector.
     */
    public fun destinationFlowConfigList(destinationFlowConfigList: Collection<Any>) {
        _destinationFlowConfigList.addAll(destinationFlowConfigList)
    }

    /**
     * The configuration that controls how Amazon AppFlow places data in the destination connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-destinationflowconfiglist)
     *
     * @param destinationFlowConfigList The configuration that controls how Amazon AppFlow places
     *   data in the destination connector.
     */
    public fun destinationFlowConfigList(destinationFlowConfigList: IResolvable) {
        cdkBuilder.destinationFlowConfigList(destinationFlowConfigList)
    }

    /**
     * The specified name of the flow.
     *
     * Spaces are not allowed. Use underscores (_) or hyphens (-) only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-flowname)
     *
     * @param flowName The specified name of the flow.
     */
    public fun flowName(flowName: String) {
        cdkBuilder.flowName(flowName)
    }

    /**
     * Sets the status of the flow. You can specify one of the following values:.
     * * **Active** - The flow runs based on the trigger settings that you defined. Active scheduled
     *   flows run as scheduled, and active event-triggered flows run when the specified change
     *   event occurs. However, active on-demand flows run only when you manually start them by
     *   using Amazon AppFlow.
     * * **Suspended** - You can use this option to deactivate an active flow. Scheduled and
     *   event-triggered flows will cease to run until you reactive them. This value only affects
     *   scheduled and event-triggered flows. It has no effect for on-demand flows.
     *
     * If you omit the FlowStatus parameter, Amazon AppFlow creates the flow with a default status.
     * The default status for on-demand flows is Active. The default status for scheduled and
     * event-triggered flows is Draft, which means they’re not yet active.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-flowstatus)
     *
     * @param flowStatus Sets the status of the flow. You can specify one of the following values:.
     */
    public fun flowStatus(flowStatus: String) {
        cdkBuilder.flowStatus(flowStatus)
    }

    /**
     * The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for
     * encryption.
     *
     * This is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't
     * provide anything here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-kmsarn)
     *
     * @param kmsArn The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you
     *   provide for encryption.
     */
    public fun kmsArn(kmsArn: String) {
        cdkBuilder.kmsArn(kmsArn)
    }

    /**
     * Specifies the configuration that Amazon AppFlow uses when it catalogs your data.
     *
     * When Amazon AppFlow catalogs your data, it stores metadata in a data catalog.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-metadatacatalogconfig)
     *
     * @param metadataCatalogConfig Specifies the configuration that Amazon AppFlow uses when it
     *   catalogs your data.
     */
    public fun metadataCatalogConfig(metadataCatalogConfig: IResolvable) {
        cdkBuilder.metadataCatalogConfig(metadataCatalogConfig)
    }

    /**
     * Specifies the configuration that Amazon AppFlow uses when it catalogs your data.
     *
     * When Amazon AppFlow catalogs your data, it stores metadata in a data catalog.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-metadatacatalogconfig)
     *
     * @param metadataCatalogConfig Specifies the configuration that Amazon AppFlow uses when it
     *   catalogs your data.
     */
    public fun metadataCatalogConfig(metadataCatalogConfig: CfnFlow.MetadataCatalogConfigProperty) {
        cdkBuilder.metadataCatalogConfig(metadataCatalogConfig)
    }

    /**
     * Contains information about the configuration of the source connector used in the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-sourceflowconfig)
     *
     * @param sourceFlowConfig Contains information about the configuration of the source connector
     *   used in the flow.
     */
    public fun sourceFlowConfig(sourceFlowConfig: IResolvable) {
        cdkBuilder.sourceFlowConfig(sourceFlowConfig)
    }

    /**
     * Contains information about the configuration of the source connector used in the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-sourceflowconfig)
     *
     * @param sourceFlowConfig Contains information about the configuration of the source connector
     *   used in the flow.
     */
    public fun sourceFlowConfig(sourceFlowConfig: CfnFlow.SourceFlowConfigProperty) {
        cdkBuilder.sourceFlowConfig(sourceFlowConfig)
    }

    /**
     * The tags used to organize, track, or control access for your flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-tags)
     *
     * @param tags The tags used to organize, track, or control access for your flow.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags used to organize, track, or control access for your flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-tags)
     *
     * @param tags The tags used to organize, track, or control access for your flow.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * A list of tasks that Amazon AppFlow performs while transferring the data in the flow run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-tasks)
     *
     * @param tasks A list of tasks that Amazon AppFlow performs while transferring the data in the
     *   flow run.
     */
    public fun tasks(vararg tasks: Any) {
        _tasks.addAll(listOf(*tasks))
    }

    /**
     * A list of tasks that Amazon AppFlow performs while transferring the data in the flow run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-tasks)
     *
     * @param tasks A list of tasks that Amazon AppFlow performs while transferring the data in the
     *   flow run.
     */
    public fun tasks(tasks: Collection<Any>) {
        _tasks.addAll(tasks)
    }

    /**
     * A list of tasks that Amazon AppFlow performs while transferring the data in the flow run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-tasks)
     *
     * @param tasks A list of tasks that Amazon AppFlow performs while transferring the data in the
     *   flow run.
     */
    public fun tasks(tasks: IResolvable) {
        cdkBuilder.tasks(tasks)
    }

    /**
     * The trigger settings that determine how and when Amazon AppFlow runs the specified flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-triggerconfig)
     *
     * @param triggerConfig The trigger settings that determine how and when Amazon AppFlow runs the
     *   specified flow.
     */
    public fun triggerConfig(triggerConfig: IResolvable) {
        cdkBuilder.triggerConfig(triggerConfig)
    }

    /**
     * The trigger settings that determine how and when Amazon AppFlow runs the specified flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-triggerconfig)
     *
     * @param triggerConfig The trigger settings that determine how and when Amazon AppFlow runs the
     *   specified flow.
     */
    public fun triggerConfig(triggerConfig: CfnFlow.TriggerConfigProperty) {
        cdkBuilder.triggerConfig(triggerConfig)
    }

    public fun build(): CfnFlow {
        if (_destinationFlowConfigList.isNotEmpty())
            cdkBuilder.destinationFlowConfigList(_destinationFlowConfigList)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_tasks.isNotEmpty()) cdkBuilder.tasks(_tasks)
        return cdkBuilder.build()
    }
}

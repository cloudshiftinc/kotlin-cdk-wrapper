@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appflow

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnFlow`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appflow.*;
 * CfnFlowProps cfnFlowProps = CfnFlowProps.builder()
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
public interface CfnFlowProps {
  /**
   * A user-entered description of the flow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The configuration that controls how Amazon AppFlow places data in the destination connector.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-destinationflowconfiglist)
   */
  public fun destinationFlowConfigList(): Any

  /**
   * The specified name of the flow.
   *
   * Spaces are not allowed. Use underscores (_) or hyphens (-) only.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-flowname)
   */
  public fun flowName(): String

  /**
   * Sets the status of the flow. You can specify one of the following values:.
   *
   * * **Active** - The flow runs based on the trigger settings that you defined. Active scheduled
   * flows run as scheduled, and active event-triggered flows run when the specified change event
   * occurs. However, active on-demand flows run only when you manually start them by using Amazon
   * AppFlow.
   * * **Suspended** - You can use this option to deactivate an active flow. Scheduled and
   * event-triggered flows will cease to run until you reactive them. This value only affects scheduled
   * and event-triggered flows. It has no effect for on-demand flows.
   *
   * If you omit the FlowStatus parameter, Amazon AppFlow creates the flow with a default status.
   * The default status for on-demand flows is Active. The default status for scheduled and
   * event-triggered flows is Draft, which means they’re not yet active.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-flowstatus)
   */
  public fun flowStatus(): String? = unwrap(this).getFlowStatus()

  /**
   * The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for
   * encryption.
   *
   * This is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't
   * provide anything here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-kmsarn)
   */
  public fun kmsArn(): String? = unwrap(this).getKmsArn()

  /**
   * Specifies the configuration that Amazon AppFlow uses when it catalogs your data.
   *
   * When Amazon AppFlow catalogs your data, it stores metadata in a data catalog.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-metadatacatalogconfig)
   */
  public fun metadataCatalogConfig(): Any? = unwrap(this).getMetadataCatalogConfig()

  /**
   * Contains information about the configuration of the source connector used in the flow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-sourceflowconfig)
   */
  public fun sourceFlowConfig(): Any

  /**
   * The tags used to organize, track, or control access for your flow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A list of tasks that Amazon AppFlow performs while transferring the data in the flow run.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-tasks)
   */
  public fun tasks(): Any

  /**
   * The trigger settings that determine how and when Amazon AppFlow runs the specified flow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-triggerconfig)
   */
  public fun triggerConfig(): Any

  /**
   * A builder for [CfnFlowProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A user-entered description of the flow.
     */
    public fun description(description: String)

    /**
     * @param destinationFlowConfigList The configuration that controls how Amazon AppFlow places
     * data in the destination connector. 
     */
    public fun destinationFlowConfigList(destinationFlowConfigList: IResolvable)

    /**
     * @param destinationFlowConfigList The configuration that controls how Amazon AppFlow places
     * data in the destination connector. 
     */
    public fun destinationFlowConfigList(destinationFlowConfigList: List<Any>)

    /**
     * @param destinationFlowConfigList The configuration that controls how Amazon AppFlow places
     * data in the destination connector. 
     */
    public fun destinationFlowConfigList(vararg destinationFlowConfigList: Any)

    /**
     * @param flowName The specified name of the flow. 
     * Spaces are not allowed. Use underscores (_) or hyphens (-) only.
     */
    public fun flowName(flowName: String)

    /**
     * @param flowStatus Sets the status of the flow. You can specify one of the following values:.
     * * **Active** - The flow runs based on the trigger settings that you defined. Active scheduled
     * flows run as scheduled, and active event-triggered flows run when the specified change event
     * occurs. However, active on-demand flows run only when you manually start them by using Amazon
     * AppFlow.
     * * **Suspended** - You can use this option to deactivate an active flow. Scheduled and
     * event-triggered flows will cease to run until you reactive them. This value only affects
     * scheduled and event-triggered flows. It has no effect for on-demand flows.
     *
     * If you omit the FlowStatus parameter, Amazon AppFlow creates the flow with a default status.
     * The default status for on-demand flows is Active. The default status for scheduled and
     * event-triggered flows is Draft, which means they’re not yet active.
     */
    public fun flowStatus(flowStatus: String)

    /**
     * @param kmsArn The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you
     * provide for encryption.
     * This is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't
     * provide anything here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
     */
    public fun kmsArn(kmsArn: String)

    /**
     * @param metadataCatalogConfig Specifies the configuration that Amazon AppFlow uses when it
     * catalogs your data.
     * When Amazon AppFlow catalogs your data, it stores metadata in a data catalog.
     */
    public fun metadataCatalogConfig(metadataCatalogConfig: IResolvable)

    /**
     * @param metadataCatalogConfig Specifies the configuration that Amazon AppFlow uses when it
     * catalogs your data.
     * When Amazon AppFlow catalogs your data, it stores metadata in a data catalog.
     */
    public fun metadataCatalogConfig(metadataCatalogConfig: CfnFlow.MetadataCatalogConfigProperty)

    /**
     * @param metadataCatalogConfig Specifies the configuration that Amazon AppFlow uses when it
     * catalogs your data.
     * When Amazon AppFlow catalogs your data, it stores metadata in a data catalog.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b73fcfdcd7a024c30a67ebb7555d5657b3b22e689ab0a794d78e09061cfed923")
    public
        fun metadataCatalogConfig(metadataCatalogConfig: CfnFlow.MetadataCatalogConfigProperty.Builder.() -> Unit)

    /**
     * @param sourceFlowConfig Contains information about the configuration of the source connector
     * used in the flow. 
     */
    public fun sourceFlowConfig(sourceFlowConfig: IResolvable)

    /**
     * @param sourceFlowConfig Contains information about the configuration of the source connector
     * used in the flow. 
     */
    public fun sourceFlowConfig(sourceFlowConfig: CfnFlow.SourceFlowConfigProperty)

    /**
     * @param sourceFlowConfig Contains information about the configuration of the source connector
     * used in the flow. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("da5ac7fda3f9ee0d02b4fd08480b1ef093c9a5893fbb784a09a24ccc61354bba")
    public
        fun sourceFlowConfig(sourceFlowConfig: CfnFlow.SourceFlowConfigProperty.Builder.() -> Unit)

    /**
     * @param tags The tags used to organize, track, or control access for your flow.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags used to organize, track, or control access for your flow.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param tasks A list of tasks that Amazon AppFlow performs while transferring the data in the
     * flow run. 
     */
    public fun tasks(tasks: IResolvable)

    /**
     * @param tasks A list of tasks that Amazon AppFlow performs while transferring the data in the
     * flow run. 
     */
    public fun tasks(tasks: List<Any>)

    /**
     * @param tasks A list of tasks that Amazon AppFlow performs while transferring the data in the
     * flow run. 
     */
    public fun tasks(vararg tasks: Any)

    /**
     * @param triggerConfig The trigger settings that determine how and when Amazon AppFlow runs the
     * specified flow. 
     */
    public fun triggerConfig(triggerConfig: IResolvable)

    /**
     * @param triggerConfig The trigger settings that determine how and when Amazon AppFlow runs the
     * specified flow. 
     */
    public fun triggerConfig(triggerConfig: CfnFlow.TriggerConfigProperty)

    /**
     * @param triggerConfig The trigger settings that determine how and when Amazon AppFlow runs the
     * specified flow. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7a6f7b25b6dc6f9cb11463694b3f50397b41edd91e4387201caaf4d3f7563f69")
    public fun triggerConfig(triggerConfig: CfnFlow.TriggerConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appflow.CfnFlowProps.Builder =
        software.amazon.awscdk.services.appflow.CfnFlowProps.builder()

    /**
     * @param description A user-entered description of the flow.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param destinationFlowConfigList The configuration that controls how Amazon AppFlow places
     * data in the destination connector. 
     */
    override fun destinationFlowConfigList(destinationFlowConfigList: IResolvable) {
      cdkBuilder.destinationFlowConfigList(destinationFlowConfigList.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param destinationFlowConfigList The configuration that controls how Amazon AppFlow places
     * data in the destination connector. 
     */
    override fun destinationFlowConfigList(destinationFlowConfigList: List<Any>) {
      cdkBuilder.destinationFlowConfigList(destinationFlowConfigList.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param destinationFlowConfigList The configuration that controls how Amazon AppFlow places
     * data in the destination connector. 
     */
    override fun destinationFlowConfigList(vararg destinationFlowConfigList: Any): Unit =
        destinationFlowConfigList(destinationFlowConfigList.toList())

    /**
     * @param flowName The specified name of the flow. 
     * Spaces are not allowed. Use underscores (_) or hyphens (-) only.
     */
    override fun flowName(flowName: String) {
      cdkBuilder.flowName(flowName)
    }

    /**
     * @param flowStatus Sets the status of the flow. You can specify one of the following values:.
     * * **Active** - The flow runs based on the trigger settings that you defined. Active scheduled
     * flows run as scheduled, and active event-triggered flows run when the specified change event
     * occurs. However, active on-demand flows run only when you manually start them by using Amazon
     * AppFlow.
     * * **Suspended** - You can use this option to deactivate an active flow. Scheduled and
     * event-triggered flows will cease to run until you reactive them. This value only affects
     * scheduled and event-triggered flows. It has no effect for on-demand flows.
     *
     * If you omit the FlowStatus parameter, Amazon AppFlow creates the flow with a default status.
     * The default status for on-demand flows is Active. The default status for scheduled and
     * event-triggered flows is Draft, which means they’re not yet active.
     */
    override fun flowStatus(flowStatus: String) {
      cdkBuilder.flowStatus(flowStatus)
    }

    /**
     * @param kmsArn The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you
     * provide for encryption.
     * This is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't
     * provide anything here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
     */
    override fun kmsArn(kmsArn: String) {
      cdkBuilder.kmsArn(kmsArn)
    }

    /**
     * @param metadataCatalogConfig Specifies the configuration that Amazon AppFlow uses when it
     * catalogs your data.
     * When Amazon AppFlow catalogs your data, it stores metadata in a data catalog.
     */
    override fun metadataCatalogConfig(metadataCatalogConfig: IResolvable) {
      cdkBuilder.metadataCatalogConfig(metadataCatalogConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param metadataCatalogConfig Specifies the configuration that Amazon AppFlow uses when it
     * catalogs your data.
     * When Amazon AppFlow catalogs your data, it stores metadata in a data catalog.
     */
    override
        fun metadataCatalogConfig(metadataCatalogConfig: CfnFlow.MetadataCatalogConfigProperty) {
      cdkBuilder.metadataCatalogConfig(metadataCatalogConfig.let(CfnFlow.MetadataCatalogConfigProperty.Companion::unwrap))
    }

    /**
     * @param metadataCatalogConfig Specifies the configuration that Amazon AppFlow uses when it
     * catalogs your data.
     * When Amazon AppFlow catalogs your data, it stores metadata in a data catalog.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b73fcfdcd7a024c30a67ebb7555d5657b3b22e689ab0a794d78e09061cfed923")
    override
        fun metadataCatalogConfig(metadataCatalogConfig: CfnFlow.MetadataCatalogConfigProperty.Builder.() -> Unit):
        Unit = metadataCatalogConfig(CfnFlow.MetadataCatalogConfigProperty(metadataCatalogConfig))

    /**
     * @param sourceFlowConfig Contains information about the configuration of the source connector
     * used in the flow. 
     */
    override fun sourceFlowConfig(sourceFlowConfig: IResolvable) {
      cdkBuilder.sourceFlowConfig(sourceFlowConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param sourceFlowConfig Contains information about the configuration of the source connector
     * used in the flow. 
     */
    override fun sourceFlowConfig(sourceFlowConfig: CfnFlow.SourceFlowConfigProperty) {
      cdkBuilder.sourceFlowConfig(sourceFlowConfig.let(CfnFlow.SourceFlowConfigProperty.Companion::unwrap))
    }

    /**
     * @param sourceFlowConfig Contains information about the configuration of the source connector
     * used in the flow. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("da5ac7fda3f9ee0d02b4fd08480b1ef093c9a5893fbb784a09a24ccc61354bba")
    override
        fun sourceFlowConfig(sourceFlowConfig: CfnFlow.SourceFlowConfigProperty.Builder.() -> Unit):
        Unit = sourceFlowConfig(CfnFlow.SourceFlowConfigProperty(sourceFlowConfig))

    /**
     * @param tags The tags used to organize, track, or control access for your flow.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags used to organize, track, or control access for your flow.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param tasks A list of tasks that Amazon AppFlow performs while transferring the data in the
     * flow run. 
     */
    override fun tasks(tasks: IResolvable) {
      cdkBuilder.tasks(tasks.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param tasks A list of tasks that Amazon AppFlow performs while transferring the data in the
     * flow run. 
     */
    override fun tasks(tasks: List<Any>) {
      cdkBuilder.tasks(tasks.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param tasks A list of tasks that Amazon AppFlow performs while transferring the data in the
     * flow run. 
     */
    override fun tasks(vararg tasks: Any): Unit = tasks(tasks.toList())

    /**
     * @param triggerConfig The trigger settings that determine how and when Amazon AppFlow runs the
     * specified flow. 
     */
    override fun triggerConfig(triggerConfig: IResolvable) {
      cdkBuilder.triggerConfig(triggerConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param triggerConfig The trigger settings that determine how and when Amazon AppFlow runs the
     * specified flow. 
     */
    override fun triggerConfig(triggerConfig: CfnFlow.TriggerConfigProperty) {
      cdkBuilder.triggerConfig(triggerConfig.let(CfnFlow.TriggerConfigProperty.Companion::unwrap))
    }

    /**
     * @param triggerConfig The trigger settings that determine how and when Amazon AppFlow runs the
     * specified flow. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7a6f7b25b6dc6f9cb11463694b3f50397b41edd91e4387201caaf4d3f7563f69")
    override fun triggerConfig(triggerConfig: CfnFlow.TriggerConfigProperty.Builder.() -> Unit):
        Unit = triggerConfig(CfnFlow.TriggerConfigProperty(triggerConfig))

    public fun build(): software.amazon.awscdk.services.appflow.CfnFlowProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appflow.CfnFlowProps,
  ) : CdkObject(cdkObject), CfnFlowProps {
    /**
     * A user-entered description of the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The configuration that controls how Amazon AppFlow places data in the destination connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-destinationflowconfiglist)
     */
    override fun destinationFlowConfigList(): Any = unwrap(this).getDestinationFlowConfigList()

    /**
     * The specified name of the flow.
     *
     * Spaces are not allowed. Use underscores (_) or hyphens (-) only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-flowname)
     */
    override fun flowName(): String = unwrap(this).getFlowName()

    /**
     * Sets the status of the flow. You can specify one of the following values:.
     *
     * * **Active** - The flow runs based on the trigger settings that you defined. Active scheduled
     * flows run as scheduled, and active event-triggered flows run when the specified change event
     * occurs. However, active on-demand flows run only when you manually start them by using Amazon
     * AppFlow.
     * * **Suspended** - You can use this option to deactivate an active flow. Scheduled and
     * event-triggered flows will cease to run until you reactive them. This value only affects
     * scheduled and event-triggered flows. It has no effect for on-demand flows.
     *
     * If you omit the FlowStatus parameter, Amazon AppFlow creates the flow with a default status.
     * The default status for on-demand flows is Active. The default status for scheduled and
     * event-triggered flows is Draft, which means they’re not yet active.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-flowstatus)
     */
    override fun flowStatus(): String? = unwrap(this).getFlowStatus()

    /**
     * The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for
     * encryption.
     *
     * This is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't
     * provide anything here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-kmsarn)
     */
    override fun kmsArn(): String? = unwrap(this).getKmsArn()

    /**
     * Specifies the configuration that Amazon AppFlow uses when it catalogs your data.
     *
     * When Amazon AppFlow catalogs your data, it stores metadata in a data catalog.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-metadatacatalogconfig)
     */
    override fun metadataCatalogConfig(): Any? = unwrap(this).getMetadataCatalogConfig()

    /**
     * Contains information about the configuration of the source connector used in the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-sourceflowconfig)
     */
    override fun sourceFlowConfig(): Any = unwrap(this).getSourceFlowConfig()

    /**
     * The tags used to organize, track, or control access for your flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * A list of tasks that Amazon AppFlow performs while transferring the data in the flow run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-tasks)
     */
    override fun tasks(): Any = unwrap(this).getTasks()

    /**
     * The trigger settings that determine how and when Amazon AppFlow runs the specified flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-triggerconfig)
     */
    override fun triggerConfig(): Any = unwrap(this).getTriggerConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFlowProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlowProps): CfnFlowProps
        = CdkObjectWrappers.wrap(cdkObject) as? CfnFlowProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFlowProps): software.amazon.awscdk.services.appflow.CfnFlowProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.appflow.CfnFlowProps
  }
}

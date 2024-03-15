@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appflow

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::AppFlow::Flow` resource is an Amazon AppFlow resource type that specifies a new flow.
 *
 *
 * If you want to use AWS CloudFormation to create a connector profile for connectors that implement
 * OAuth (such as Salesforce, Slack, Zendesk, and Google Analytics), you must fetch the access and
 * refresh tokens. You can do this by implementing your own UI for OAuth, or by retrieving the tokens
 * from elsewhere. Alternatively, you can use the Amazon AppFlow console to create the connector
 * profile, and then use that connector profile in the flow creation CloudFormation template.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appflow.*;
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
public open class CfnFlow internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appflow.CfnFlow,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The flow's Amazon Resource Name (ARN).
   */
  public open fun attrFlowArn(): String = unwrap(this).getAttrFlowArn()

  /**
   * A user-entered description of the flow.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A user-entered description of the flow.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The configuration that controls how Amazon AppFlow places data in the destination connector.
   */
  public open fun destinationFlowConfigList(): Any = unwrap(this).getDestinationFlowConfigList()

  /**
   * The configuration that controls how Amazon AppFlow places data in the destination connector.
   */
  public open fun destinationFlowConfigList(`value`: IResolvable) {
    unwrap(this).setDestinationFlowConfigList(`value`.let(IResolvable::unwrap))
  }

  /**
   * The configuration that controls how Amazon AppFlow places data in the destination connector.
   */
  public open fun destinationFlowConfigList(__idx_ac66f0: List<Any>) {
    unwrap(this).setDestinationFlowConfigList(__idx_ac66f0)
  }

  /**
   * The configuration that controls how Amazon AppFlow places data in the destination connector.
   */
  public open fun destinationFlowConfigList(vararg __idx_ac66f0: Any): Unit =
      destinationFlowConfigList(__idx_ac66f0.toList())

  /**
   * The specified name of the flow.
   */
  public open fun flowName(): String = unwrap(this).getFlowName()

  /**
   * The specified name of the flow.
   */
  public open fun flowName(`value`: String) {
    unwrap(this).setFlowName(`value`)
  }

  /**
   * Sets the status of the flow.
   *
   * You can specify one of the following values:.
   */
  public open fun flowStatus(): String? = unwrap(this).getFlowStatus()

  /**
   * Sets the status of the flow.
   *
   * You can specify one of the following values:.
   */
  public open fun flowStatus(`value`: String) {
    unwrap(this).setFlowStatus(`value`)
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
   * The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for
   * encryption.
   */
  public open fun kmsArn(): String? = unwrap(this).getKmsArn()

  /**
   * The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for
   * encryption.
   */
  public open fun kmsArn(`value`: String) {
    unwrap(this).setKmsArn(`value`)
  }

  /**
   * Specifies the configuration that Amazon AppFlow uses when it catalogs your data.
   */
  public open fun metadataCatalogConfig(): Any? = unwrap(this).getMetadataCatalogConfig()

  /**
   * Specifies the configuration that Amazon AppFlow uses when it catalogs your data.
   */
  public open fun metadataCatalogConfig(`value`: IResolvable) {
    unwrap(this).setMetadataCatalogConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies the configuration that Amazon AppFlow uses when it catalogs your data.
   */
  public open fun metadataCatalogConfig(`value`: MetadataCatalogConfigProperty) {
    unwrap(this).setMetadataCatalogConfig(`value`.let(MetadataCatalogConfigProperty::unwrap))
  }

  /**
   * Specifies the configuration that Amazon AppFlow uses when it catalogs your data.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f57f29c90a28e4ec5f1581790f2cabbcad44954f0c850b0c1295ec22628faa2c")
  public open fun metadataCatalogConfig(`value`: MetadataCatalogConfigProperty.Builder.() -> Unit):
      Unit = metadataCatalogConfig(MetadataCatalogConfigProperty(`value`))

  /**
   * Contains information about the configuration of the source connector used in the flow.
   */
  public open fun sourceFlowConfig(): Any = unwrap(this).getSourceFlowConfig()

  /**
   * Contains information about the configuration of the source connector used in the flow.
   */
  public open fun sourceFlowConfig(`value`: IResolvable) {
    unwrap(this).setSourceFlowConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * Contains information about the configuration of the source connector used in the flow.
   */
  public open fun sourceFlowConfig(`value`: SourceFlowConfigProperty) {
    unwrap(this).setSourceFlowConfig(`value`.let(SourceFlowConfigProperty::unwrap))
  }

  /**
   * Contains information about the configuration of the source connector used in the flow.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("63a8e6b5619154fa252d3ec11a37ebdb2251e880f242b1521505d0907a3a5738")
  public open fun sourceFlowConfig(`value`: SourceFlowConfigProperty.Builder.() -> Unit): Unit =
      sourceFlowConfig(SourceFlowConfigProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags used to organize, track, or control access for your flow.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags used to organize, track, or control access for your flow.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags used to organize, track, or control access for your flow.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A list of tasks that Amazon AppFlow performs while transferring the data in the flow run.
   */
  public open fun tasks(): Any = unwrap(this).getTasks()

  /**
   * A list of tasks that Amazon AppFlow performs while transferring the data in the flow run.
   */
  public open fun tasks(`value`: IResolvable) {
    unwrap(this).setTasks(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of tasks that Amazon AppFlow performs while transferring the data in the flow run.
   */
  public open fun tasks(__idx_ac66f0: List<Any>) {
    unwrap(this).setTasks(__idx_ac66f0)
  }

  /**
   * A list of tasks that Amazon AppFlow performs while transferring the data in the flow run.
   */
  public open fun tasks(vararg __idx_ac66f0: Any): Unit = tasks(__idx_ac66f0.toList())

  /**
   * The trigger settings that determine how and when Amazon AppFlow runs the specified flow.
   */
  public open fun triggerConfig(): Any = unwrap(this).getTriggerConfig()

  /**
   * The trigger settings that determine how and when Amazon AppFlow runs the specified flow.
   */
  public open fun triggerConfig(`value`: IResolvable) {
    unwrap(this).setTriggerConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * The trigger settings that determine how and when Amazon AppFlow runs the specified flow.
   */
  public open fun triggerConfig(`value`: TriggerConfigProperty) {
    unwrap(this).setTriggerConfig(`value`.let(TriggerConfigProperty::unwrap))
  }

  /**
   * The trigger settings that determine how and when Amazon AppFlow runs the specified flow.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("45320e4e4f9c0d6b49ee956c40a4f4f81d97065249f3759f3e6b9de48818b3a9")
  public open fun triggerConfig(`value`: TriggerConfigProperty.Builder.() -> Unit): Unit =
      triggerConfig(TriggerConfigProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appflow.CfnFlow].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A user-entered description of the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-description)
     * @param description A user-entered description of the flow. 
     */
    public fun description(description: String)

    /**
     * The configuration that controls how Amazon AppFlow places data in the destination connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-destinationflowconfiglist)
     * @param destinationFlowConfigList The configuration that controls how Amazon AppFlow places
     * data in the destination connector. 
     */
    public fun destinationFlowConfigList(destinationFlowConfigList: IResolvable)

    /**
     * The configuration that controls how Amazon AppFlow places data in the destination connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-destinationflowconfiglist)
     * @param destinationFlowConfigList The configuration that controls how Amazon AppFlow places
     * data in the destination connector. 
     */
    public fun destinationFlowConfigList(destinationFlowConfigList: List<Any>)

    /**
     * The configuration that controls how Amazon AppFlow places data in the destination connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-destinationflowconfiglist)
     * @param destinationFlowConfigList The configuration that controls how Amazon AppFlow places
     * data in the destination connector. 
     */
    public fun destinationFlowConfigList(vararg destinationFlowConfigList: Any)

    /**
     * The specified name of the flow.
     *
     * Spaces are not allowed. Use underscores (_) or hyphens (-) only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-flowname)
     * @param flowName The specified name of the flow. 
     */
    public fun flowName(flowName: String)

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
     * @param flowStatus Sets the status of the flow. You can specify one of the following values:. 
     */
    public fun flowStatus(flowStatus: String)

    /**
     * The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for
     * encryption.
     *
     * This is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't
     * provide anything here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-kmsarn)
     * @param kmsArn The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you
     * provide for encryption. 
     */
    public fun kmsArn(kmsArn: String)

    /**
     * Specifies the configuration that Amazon AppFlow uses when it catalogs your data.
     *
     * When Amazon AppFlow catalogs your data, it stores metadata in a data catalog.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-metadatacatalogconfig)
     * @param metadataCatalogConfig Specifies the configuration that Amazon AppFlow uses when it
     * catalogs your data. 
     */
    public fun metadataCatalogConfig(metadataCatalogConfig: IResolvable)

    /**
     * Specifies the configuration that Amazon AppFlow uses when it catalogs your data.
     *
     * When Amazon AppFlow catalogs your data, it stores metadata in a data catalog.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-metadatacatalogconfig)
     * @param metadataCatalogConfig Specifies the configuration that Amazon AppFlow uses when it
     * catalogs your data. 
     */
    public fun metadataCatalogConfig(metadataCatalogConfig: MetadataCatalogConfigProperty)

    /**
     * Specifies the configuration that Amazon AppFlow uses when it catalogs your data.
     *
     * When Amazon AppFlow catalogs your data, it stores metadata in a data catalog.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-metadatacatalogconfig)
     * @param metadataCatalogConfig Specifies the configuration that Amazon AppFlow uses when it
     * catalogs your data. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2e720d9b9cc18741b25ccf2fd1461e54daea95b322bba21d71f7f0465ed70c5a")
    public
        fun metadataCatalogConfig(metadataCatalogConfig: MetadataCatalogConfigProperty.Builder.() -> Unit)

    /**
     * Contains information about the configuration of the source connector used in the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-sourceflowconfig)
     * @param sourceFlowConfig Contains information about the configuration of the source connector
     * used in the flow. 
     */
    public fun sourceFlowConfig(sourceFlowConfig: IResolvable)

    /**
     * Contains information about the configuration of the source connector used in the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-sourceflowconfig)
     * @param sourceFlowConfig Contains information about the configuration of the source connector
     * used in the flow. 
     */
    public fun sourceFlowConfig(sourceFlowConfig: SourceFlowConfigProperty)

    /**
     * Contains information about the configuration of the source connector used in the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-sourceflowconfig)
     * @param sourceFlowConfig Contains information about the configuration of the source connector
     * used in the flow. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7ce8f9686103aed30f45bf4fabc3a9f02ab3fb16971b7e673b19195615c083fd")
    public fun sourceFlowConfig(sourceFlowConfig: SourceFlowConfigProperty.Builder.() -> Unit)

    /**
     * The tags used to organize, track, or control access for your flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-tags)
     * @param tags The tags used to organize, track, or control access for your flow. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags used to organize, track, or control access for your flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-tags)
     * @param tags The tags used to organize, track, or control access for your flow. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * A list of tasks that Amazon AppFlow performs while transferring the data in the flow run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-tasks)
     * @param tasks A list of tasks that Amazon AppFlow performs while transferring the data in the
     * flow run. 
     */
    public fun tasks(tasks: IResolvable)

    /**
     * A list of tasks that Amazon AppFlow performs while transferring the data in the flow run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-tasks)
     * @param tasks A list of tasks that Amazon AppFlow performs while transferring the data in the
     * flow run. 
     */
    public fun tasks(tasks: List<Any>)

    /**
     * A list of tasks that Amazon AppFlow performs while transferring the data in the flow run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-tasks)
     * @param tasks A list of tasks that Amazon AppFlow performs while transferring the data in the
     * flow run. 
     */
    public fun tasks(vararg tasks: Any)

    /**
     * The trigger settings that determine how and when Amazon AppFlow runs the specified flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-triggerconfig)
     * @param triggerConfig The trigger settings that determine how and when Amazon AppFlow runs the
     * specified flow. 
     */
    public fun triggerConfig(triggerConfig: IResolvable)

    /**
     * The trigger settings that determine how and when Amazon AppFlow runs the specified flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-triggerconfig)
     * @param triggerConfig The trigger settings that determine how and when Amazon AppFlow runs the
     * specified flow. 
     */
    public fun triggerConfig(triggerConfig: TriggerConfigProperty)

    /**
     * The trigger settings that determine how and when Amazon AppFlow runs the specified flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-triggerconfig)
     * @param triggerConfig The trigger settings that determine how and when Amazon AppFlow runs the
     * specified flow. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ab5c67ee89287b77802dc81859788a31a2bfc74a7e56c61dc4e14f6089b4abdf")
    public fun triggerConfig(triggerConfig: TriggerConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appflow.CfnFlow.Builder =
        software.amazon.awscdk.services.appflow.CfnFlow.Builder.create(scope, id)

    /**
     * A user-entered description of the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-description)
     * @param description A user-entered description of the flow. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The configuration that controls how Amazon AppFlow places data in the destination connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-destinationflowconfiglist)
     * @param destinationFlowConfigList The configuration that controls how Amazon AppFlow places
     * data in the destination connector. 
     */
    override fun destinationFlowConfigList(destinationFlowConfigList: IResolvable) {
      cdkBuilder.destinationFlowConfigList(destinationFlowConfigList.let(IResolvable::unwrap))
    }

    /**
     * The configuration that controls how Amazon AppFlow places data in the destination connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-destinationflowconfiglist)
     * @param destinationFlowConfigList The configuration that controls how Amazon AppFlow places
     * data in the destination connector. 
     */
    override fun destinationFlowConfigList(destinationFlowConfigList: List<Any>) {
      cdkBuilder.destinationFlowConfigList(destinationFlowConfigList)
    }

    /**
     * The configuration that controls how Amazon AppFlow places data in the destination connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-destinationflowconfiglist)
     * @param destinationFlowConfigList The configuration that controls how Amazon AppFlow places
     * data in the destination connector. 
     */
    override fun destinationFlowConfigList(vararg destinationFlowConfigList: Any): Unit =
        destinationFlowConfigList(destinationFlowConfigList.toList())

    /**
     * The specified name of the flow.
     *
     * Spaces are not allowed. Use underscores (_) or hyphens (-) only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-flowname)
     * @param flowName The specified name of the flow. 
     */
    override fun flowName(flowName: String) {
      cdkBuilder.flowName(flowName)
    }

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
     * @param flowStatus Sets the status of the flow. You can specify one of the following values:. 
     */
    override fun flowStatus(flowStatus: String) {
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
     * @param kmsArn The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you
     * provide for encryption. 
     */
    override fun kmsArn(kmsArn: String) {
      cdkBuilder.kmsArn(kmsArn)
    }

    /**
     * Specifies the configuration that Amazon AppFlow uses when it catalogs your data.
     *
     * When Amazon AppFlow catalogs your data, it stores metadata in a data catalog.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-metadatacatalogconfig)
     * @param metadataCatalogConfig Specifies the configuration that Amazon AppFlow uses when it
     * catalogs your data. 
     */
    override fun metadataCatalogConfig(metadataCatalogConfig: IResolvable) {
      cdkBuilder.metadataCatalogConfig(metadataCatalogConfig.let(IResolvable::unwrap))
    }

    /**
     * Specifies the configuration that Amazon AppFlow uses when it catalogs your data.
     *
     * When Amazon AppFlow catalogs your data, it stores metadata in a data catalog.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-metadatacatalogconfig)
     * @param metadataCatalogConfig Specifies the configuration that Amazon AppFlow uses when it
     * catalogs your data. 
     */
    override fun metadataCatalogConfig(metadataCatalogConfig: MetadataCatalogConfigProperty) {
      cdkBuilder.metadataCatalogConfig(metadataCatalogConfig.let(MetadataCatalogConfigProperty::unwrap))
    }

    /**
     * Specifies the configuration that Amazon AppFlow uses when it catalogs your data.
     *
     * When Amazon AppFlow catalogs your data, it stores metadata in a data catalog.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-metadatacatalogconfig)
     * @param metadataCatalogConfig Specifies the configuration that Amazon AppFlow uses when it
     * catalogs your data. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2e720d9b9cc18741b25ccf2fd1461e54daea95b322bba21d71f7f0465ed70c5a")
    override
        fun metadataCatalogConfig(metadataCatalogConfig: MetadataCatalogConfigProperty.Builder.() -> Unit):
        Unit = metadataCatalogConfig(MetadataCatalogConfigProperty(metadataCatalogConfig))

    /**
     * Contains information about the configuration of the source connector used in the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-sourceflowconfig)
     * @param sourceFlowConfig Contains information about the configuration of the source connector
     * used in the flow. 
     */
    override fun sourceFlowConfig(sourceFlowConfig: IResolvable) {
      cdkBuilder.sourceFlowConfig(sourceFlowConfig.let(IResolvable::unwrap))
    }

    /**
     * Contains information about the configuration of the source connector used in the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-sourceflowconfig)
     * @param sourceFlowConfig Contains information about the configuration of the source connector
     * used in the flow. 
     */
    override fun sourceFlowConfig(sourceFlowConfig: SourceFlowConfigProperty) {
      cdkBuilder.sourceFlowConfig(sourceFlowConfig.let(SourceFlowConfigProperty::unwrap))
    }

    /**
     * Contains information about the configuration of the source connector used in the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-sourceflowconfig)
     * @param sourceFlowConfig Contains information about the configuration of the source connector
     * used in the flow. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7ce8f9686103aed30f45bf4fabc3a9f02ab3fb16971b7e673b19195615c083fd")
    override fun sourceFlowConfig(sourceFlowConfig: SourceFlowConfigProperty.Builder.() -> Unit):
        Unit = sourceFlowConfig(SourceFlowConfigProperty(sourceFlowConfig))

    /**
     * The tags used to organize, track, or control access for your flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-tags)
     * @param tags The tags used to organize, track, or control access for your flow. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags used to organize, track, or control access for your flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-tags)
     * @param tags The tags used to organize, track, or control access for your flow. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * A list of tasks that Amazon AppFlow performs while transferring the data in the flow run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-tasks)
     * @param tasks A list of tasks that Amazon AppFlow performs while transferring the data in the
     * flow run. 
     */
    override fun tasks(tasks: IResolvable) {
      cdkBuilder.tasks(tasks.let(IResolvable::unwrap))
    }

    /**
     * A list of tasks that Amazon AppFlow performs while transferring the data in the flow run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-tasks)
     * @param tasks A list of tasks that Amazon AppFlow performs while transferring the data in the
     * flow run. 
     */
    override fun tasks(tasks: List<Any>) {
      cdkBuilder.tasks(tasks)
    }

    /**
     * A list of tasks that Amazon AppFlow performs while transferring the data in the flow run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-tasks)
     * @param tasks A list of tasks that Amazon AppFlow performs while transferring the data in the
     * flow run. 
     */
    override fun tasks(vararg tasks: Any): Unit = tasks(tasks.toList())

    /**
     * The trigger settings that determine how and when Amazon AppFlow runs the specified flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-triggerconfig)
     * @param triggerConfig The trigger settings that determine how and when Amazon AppFlow runs the
     * specified flow. 
     */
    override fun triggerConfig(triggerConfig: IResolvable) {
      cdkBuilder.triggerConfig(triggerConfig.let(IResolvable::unwrap))
    }

    /**
     * The trigger settings that determine how and when Amazon AppFlow runs the specified flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-triggerconfig)
     * @param triggerConfig The trigger settings that determine how and when Amazon AppFlow runs the
     * specified flow. 
     */
    override fun triggerConfig(triggerConfig: TriggerConfigProperty) {
      cdkBuilder.triggerConfig(triggerConfig.let(TriggerConfigProperty::unwrap))
    }

    /**
     * The trigger settings that determine how and when Amazon AppFlow runs the specified flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-triggerconfig)
     * @param triggerConfig The trigger settings that determine how and when Amazon AppFlow runs the
     * specified flow. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ab5c67ee89287b77802dc81859788a31a2bfc74a7e56c61dc4e14f6089b4abdf")
    override fun triggerConfig(triggerConfig: TriggerConfigProperty.Builder.() -> Unit): Unit =
        triggerConfig(TriggerConfigProperty(triggerConfig))

    public fun build(): software.amazon.awscdk.services.appflow.CfnFlow = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.appflow.CfnFlow.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFlow {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFlow(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow): CfnFlow =
        CfnFlow(cdkObject)

    internal fun unwrap(wrapped: CfnFlow): software.amazon.awscdk.services.appflow.CfnFlow =
        wrapped.cdkObject
  }

  /**
   * Specifies the configuration used when importing incremental records from the source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appflow.*;
   * IncrementalPullConfigProperty incrementalPullConfigProperty =
   * IncrementalPullConfigProperty.builder()
   * .datetimeTypeFieldName("datetimeTypeFieldName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-incrementalpullconfig.html)
   */
  public interface IncrementalPullConfigProperty {
    /**
     * A field that specifies the date time or timestamp field as the criteria to use when importing
     * incremental records from the source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-incrementalpullconfig.html#cfn-appflow-flow-incrementalpullconfig-datetimetypefieldname)
     */
    public fun datetimeTypeFieldName(): String? = unwrap(this).getDatetimeTypeFieldName()

    /**
     * A builder for [IncrementalPullConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param datetimeTypeFieldName A field that specifies the date time or timestamp field as the
       * criteria to use when importing incremental records from the source.
       */
      public fun datetimeTypeFieldName(datetimeTypeFieldName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.IncrementalPullConfigProperty.Builder =
          software.amazon.awscdk.services.appflow.CfnFlow.IncrementalPullConfigProperty.builder()

      /**
       * @param datetimeTypeFieldName A field that specifies the date time or timestamp field as the
       * criteria to use when importing incremental records from the source.
       */
      override fun datetimeTypeFieldName(datetimeTypeFieldName: String) {
        cdkBuilder.datetimeTypeFieldName(datetimeTypeFieldName)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.IncrementalPullConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.IncrementalPullConfigProperty,
    ) : CdkObject(cdkObject), IncrementalPullConfigProperty {
      /**
       * A field that specifies the date time or timestamp field as the criteria to use when
       * importing incremental records from the source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-incrementalpullconfig.html#cfn-appflow-flow-incrementalpullconfig-datetimetypefieldname)
       */
      override fun datetimeTypeFieldName(): String? = unwrap(this).getDatetimeTypeFieldName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IncrementalPullConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.IncrementalPullConfigProperty):
          IncrementalPullConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IncrementalPullConfigProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.IncrementalPullConfigProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnFlow.IncrementalPullConfigProperty
    }
  }

  /**
   * The properties that are applied when Amazon Lookout for Metrics is used as a destination.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appflow.*;
   * LookoutMetricsDestinationPropertiesProperty lookoutMetricsDestinationPropertiesProperty =
   * LookoutMetricsDestinationPropertiesProperty.builder()
   * .object("object")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-lookoutmetricsdestinationproperties.html)
   */
  public interface LookoutMetricsDestinationPropertiesProperty {
    /**
     * The object specified in the Amazon Lookout for Metrics flow destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-lookoutmetricsdestinationproperties.html#cfn-appflow-flow-lookoutmetricsdestinationproperties-object)
     */
    public fun `object`(): String? = unwrap(this).getObject()

    /**
     * A builder for [LookoutMetricsDestinationPropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param object The object specified in the Amazon Lookout for Metrics flow destination.
       */
      public fun `object`(`object`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.LookoutMetricsDestinationPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnFlow.LookoutMetricsDestinationPropertiesProperty.builder()

      /**
       * @param object The object specified in the Amazon Lookout for Metrics flow destination.
       */
      override fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.LookoutMetricsDestinationPropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.LookoutMetricsDestinationPropertiesProperty,
    ) : CdkObject(cdkObject), LookoutMetricsDestinationPropertiesProperty {
      /**
       * The object specified in the Amazon Lookout for Metrics flow destination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-lookoutmetricsdestinationproperties.html#cfn-appflow-flow-lookoutmetricsdestinationproperties-object)
       */
      override fun `object`(): String? = unwrap(this).getObject()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          LookoutMetricsDestinationPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.LookoutMetricsDestinationPropertiesProperty):
          LookoutMetricsDestinationPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LookoutMetricsDestinationPropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.LookoutMetricsDestinationPropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnFlow.LookoutMetricsDestinationPropertiesProperty
    }
  }

  /**
   * The properties that are applied when using SAPOData as a flow source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appflow.*;
   * SAPODataSourcePropertiesProperty sAPODataSourcePropertiesProperty =
   * SAPODataSourcePropertiesProperty.builder()
   * .objectPath("objectPath")
   * // the properties below are optional
   * .paginationConfig(SAPODataPaginationConfigProperty.builder()
   * .maxPageSize(123)
   * .build())
   * .parallelismConfig(SAPODataParallelismConfigProperty.builder()
   * .maxParallelism(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sapodatasourceproperties.html)
   */
  public interface SAPODataSourcePropertiesProperty {
    /**
     * The object path specified in the SAPOData flow source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sapodatasourceproperties.html#cfn-appflow-flow-sapodatasourceproperties-objectpath)
     */
    public fun objectPath(): String

    /**
     * SAP Source connector page size.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sapodatasourceproperties.html#cfn-appflow-flow-sapodatasourceproperties-paginationconfig)
     */
    public fun paginationConfig(): Any? = unwrap(this).getPaginationConfig()

    /**
     * SAP Source connector parallelism factor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sapodatasourceproperties.html#cfn-appflow-flow-sapodatasourceproperties-parallelismconfig)
     */
    public fun parallelismConfig(): Any? = unwrap(this).getParallelismConfig()

    /**
     * A builder for [SAPODataSourcePropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param objectPath The object path specified in the SAPOData flow source. 
       */
      public fun objectPath(objectPath: String)

      /**
       * @param paginationConfig SAP Source connector page size.
       */
      public fun paginationConfig(paginationConfig: IResolvable)

      /**
       * @param paginationConfig SAP Source connector page size.
       */
      public fun paginationConfig(paginationConfig: SAPODataPaginationConfigProperty)

      /**
       * @param paginationConfig SAP Source connector page size.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f7195c68fb720e8cea66422e83f2b9dfdfd911194562c6ea948f3df6e046ba92")
      public
          fun paginationConfig(paginationConfig: SAPODataPaginationConfigProperty.Builder.() -> Unit)

      /**
       * @param parallelismConfig SAP Source connector parallelism factor.
       */
      public fun parallelismConfig(parallelismConfig: IResolvable)

      /**
       * @param parallelismConfig SAP Source connector parallelism factor.
       */
      public fun parallelismConfig(parallelismConfig: SAPODataParallelismConfigProperty)

      /**
       * @param parallelismConfig SAP Source connector parallelism factor.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7f95371b951a28de06e5a099899d0ae58f7cd8fba9b9bbf1bd458d803c371c14")
      public
          fun parallelismConfig(parallelismConfig: SAPODataParallelismConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.SAPODataSourcePropertiesProperty.Builder =
          software.amazon.awscdk.services.appflow.CfnFlow.SAPODataSourcePropertiesProperty.builder()

      /**
       * @param objectPath The object path specified in the SAPOData flow source. 
       */
      override fun objectPath(objectPath: String) {
        cdkBuilder.objectPath(objectPath)
      }

      /**
       * @param paginationConfig SAP Source connector page size.
       */
      override fun paginationConfig(paginationConfig: IResolvable) {
        cdkBuilder.paginationConfig(paginationConfig.let(IResolvable::unwrap))
      }

      /**
       * @param paginationConfig SAP Source connector page size.
       */
      override fun paginationConfig(paginationConfig: SAPODataPaginationConfigProperty) {
        cdkBuilder.paginationConfig(paginationConfig.let(SAPODataPaginationConfigProperty::unwrap))
      }

      /**
       * @param paginationConfig SAP Source connector page size.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f7195c68fb720e8cea66422e83f2b9dfdfd911194562c6ea948f3df6e046ba92")
      override
          fun paginationConfig(paginationConfig: SAPODataPaginationConfigProperty.Builder.() -> Unit):
          Unit = paginationConfig(SAPODataPaginationConfigProperty(paginationConfig))

      /**
       * @param parallelismConfig SAP Source connector parallelism factor.
       */
      override fun parallelismConfig(parallelismConfig: IResolvable) {
        cdkBuilder.parallelismConfig(parallelismConfig.let(IResolvable::unwrap))
      }

      /**
       * @param parallelismConfig SAP Source connector parallelism factor.
       */
      override fun parallelismConfig(parallelismConfig: SAPODataParallelismConfigProperty) {
        cdkBuilder.parallelismConfig(parallelismConfig.let(SAPODataParallelismConfigProperty::unwrap))
      }

      /**
       * @param parallelismConfig SAP Source connector parallelism factor.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7f95371b951a28de06e5a099899d0ae58f7cd8fba9b9bbf1bd458d803c371c14")
      override
          fun parallelismConfig(parallelismConfig: SAPODataParallelismConfigProperty.Builder.() -> Unit):
          Unit = parallelismConfig(SAPODataParallelismConfigProperty(parallelismConfig))

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.SAPODataSourcePropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.SAPODataSourcePropertiesProperty,
    ) : CdkObject(cdkObject), SAPODataSourcePropertiesProperty {
      /**
       * The object path specified in the SAPOData flow source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sapodatasourceproperties.html#cfn-appflow-flow-sapodatasourceproperties-objectpath)
       */
      override fun objectPath(): String = unwrap(this).getObjectPath()

      /**
       * SAP Source connector page size.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sapodatasourceproperties.html#cfn-appflow-flow-sapodatasourceproperties-paginationconfig)
       */
      override fun paginationConfig(): Any? = unwrap(this).getPaginationConfig()

      /**
       * SAP Source connector parallelism factor.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sapodatasourceproperties.html#cfn-appflow-flow-sapodatasourceproperties-parallelismconfig)
       */
      override fun parallelismConfig(): Any? = unwrap(this).getParallelismConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SAPODataSourcePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.SAPODataSourcePropertiesProperty):
          SAPODataSourcePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SAPODataSourcePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.SAPODataSourcePropertiesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnFlow.SAPODataSourcePropertiesProperty
    }
  }

  /**
   * The properties that are applied when using Trend Micro as a flow source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appflow.*;
   * TrendmicroSourcePropertiesProperty trendmicroSourcePropertiesProperty =
   * TrendmicroSourcePropertiesProperty.builder()
   * .object("object")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-trendmicrosourceproperties.html)
   */
  public interface TrendmicroSourcePropertiesProperty {
    /**
     * The object specified in the Trend Micro flow source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-trendmicrosourceproperties.html#cfn-appflow-flow-trendmicrosourceproperties-object)
     */
    public fun `object`(): String

    /**
     * A builder for [TrendmicroSourcePropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param object The object specified in the Trend Micro flow source. 
       */
      public fun `object`(`object`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.TrendmicroSourcePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnFlow.TrendmicroSourcePropertiesProperty.builder()

      /**
       * @param object The object specified in the Trend Micro flow source. 
       */
      override fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.TrendmicroSourcePropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.TrendmicroSourcePropertiesProperty,
    ) : CdkObject(cdkObject), TrendmicroSourcePropertiesProperty {
      /**
       * The object specified in the Trend Micro flow source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-trendmicrosourceproperties.html#cfn-appflow-flow-trendmicrosourceproperties-object)
       */
      override fun `object`(): String = unwrap(this).getObject()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          TrendmicroSourcePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.TrendmicroSourcePropertiesProperty):
          TrendmicroSourcePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TrendmicroSourcePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.TrendmicroSourcePropertiesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnFlow.TrendmicroSourcePropertiesProperty
    }
  }

  /**
   * The properties that are applied when ServiceNow is being used as a source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appflow.*;
   * ServiceNowSourcePropertiesProperty serviceNowSourcePropertiesProperty =
   * ServiceNowSourcePropertiesProperty.builder()
   * .object("object")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-servicenowsourceproperties.html)
   */
  public interface ServiceNowSourcePropertiesProperty {
    /**
     * The object specified in the ServiceNow flow source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-servicenowsourceproperties.html#cfn-appflow-flow-servicenowsourceproperties-object)
     */
    public fun `object`(): String

    /**
     * A builder for [ServiceNowSourcePropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param object The object specified in the ServiceNow flow source. 
       */
      public fun `object`(`object`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.ServiceNowSourcePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnFlow.ServiceNowSourcePropertiesProperty.builder()

      /**
       * @param object The object specified in the ServiceNow flow source. 
       */
      override fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.ServiceNowSourcePropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.ServiceNowSourcePropertiesProperty,
    ) : CdkObject(cdkObject), ServiceNowSourcePropertiesProperty {
      /**
       * The object specified in the ServiceNow flow source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-servicenowsourceproperties.html#cfn-appflow-flow-servicenowsourceproperties-object)
       */
      override fun `object`(): String = unwrap(this).getObject()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ServiceNowSourcePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.ServiceNowSourcePropertiesProperty):
          ServiceNowSourcePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceNowSourcePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.ServiceNowSourcePropertiesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnFlow.ServiceNowSourcePropertiesProperty
    }
  }

  /**
   * A class for modeling different type of tasks.
   *
   * Task implementation varies based on the `TaskType` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appflow.*;
   * TaskProperty taskProperty = TaskProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-task.html)
   */
  public interface TaskProperty {
    /**
     * The operation to be performed on the provided source fields.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-task.html#cfn-appflow-flow-task-connectoroperator)
     */
    public fun connectorOperator(): Any? = unwrap(this).getConnectorOperator()

    /**
     * A field in a destination connector, or a field value against which Amazon AppFlow validates a
     * source field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-task.html#cfn-appflow-flow-task-destinationfield)
     */
    public fun destinationField(): String? = unwrap(this).getDestinationField()

    /**
     * The source fields to which a particular task is applied.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-task.html#cfn-appflow-flow-task-sourcefields)
     */
    public fun sourceFields(): List<String>

    /**
     * A map used to store task-related information.
     *
     * The execution service looks for particular information based on the `TaskType` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-task.html#cfn-appflow-flow-task-taskproperties)
     */
    public fun taskProperties(): Any? = unwrap(this).getTaskProperties()

    /**
     * Specifies the particular task implementation that Amazon AppFlow performs.
     *
     * *Allowed values* : `Arithmetic` | `Filter` | `Map` | `Map_all` | `Mask` | `Merge` |
     * `Truncate` | `Validate`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-task.html#cfn-appflow-flow-task-tasktype)
     */
    public fun taskType(): String

    /**
     * A builder for [TaskProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param connectorOperator The operation to be performed on the provided source fields.
       */
      public fun connectorOperator(connectorOperator: IResolvable)

      /**
       * @param connectorOperator The operation to be performed on the provided source fields.
       */
      public fun connectorOperator(connectorOperator: ConnectorOperatorProperty)

      /**
       * @param connectorOperator The operation to be performed on the provided source fields.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9eee05d1d2ad0e27526018cda419a9577c90e2716d3d3dbf25a6f2deacb3c813")
      public fun connectorOperator(connectorOperator: ConnectorOperatorProperty.Builder.() -> Unit)

      /**
       * @param destinationField A field in a destination connector, or a field value against which
       * Amazon AppFlow validates a source field.
       */
      public fun destinationField(destinationField: String)

      /**
       * @param sourceFields The source fields to which a particular task is applied. 
       */
      public fun sourceFields(sourceFields: List<String>)

      /**
       * @param sourceFields The source fields to which a particular task is applied. 
       */
      public fun sourceFields(vararg sourceFields: String)

      /**
       * @param taskProperties A map used to store task-related information.
       * The execution service looks for particular information based on the `TaskType` .
       */
      public fun taskProperties(taskProperties: IResolvable)

      /**
       * @param taskProperties A map used to store task-related information.
       * The execution service looks for particular information based on the `TaskType` .
       */
      public fun taskProperties(taskProperties: List<Any>)

      /**
       * @param taskProperties A map used to store task-related information.
       * The execution service looks for particular information based on the `TaskType` .
       */
      public fun taskProperties(vararg taskProperties: Any)

      /**
       * @param taskType Specifies the particular task implementation that Amazon AppFlow performs. 
       * *Allowed values* : `Arithmetic` | `Filter` | `Map` | `Map_all` | `Mask` | `Merge` |
       * `Truncate` | `Validate`
       */
      public fun taskType(taskType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.appflow.CfnFlow.TaskProperty.Builder =
          software.amazon.awscdk.services.appflow.CfnFlow.TaskProperty.builder()

      /**
       * @param connectorOperator The operation to be performed on the provided source fields.
       */
      override fun connectorOperator(connectorOperator: IResolvable) {
        cdkBuilder.connectorOperator(connectorOperator.let(IResolvable::unwrap))
      }

      /**
       * @param connectorOperator The operation to be performed on the provided source fields.
       */
      override fun connectorOperator(connectorOperator: ConnectorOperatorProperty) {
        cdkBuilder.connectorOperator(connectorOperator.let(ConnectorOperatorProperty::unwrap))
      }

      /**
       * @param connectorOperator The operation to be performed on the provided source fields.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9eee05d1d2ad0e27526018cda419a9577c90e2716d3d3dbf25a6f2deacb3c813")
      override
          fun connectorOperator(connectorOperator: ConnectorOperatorProperty.Builder.() -> Unit):
          Unit = connectorOperator(ConnectorOperatorProperty(connectorOperator))

      /**
       * @param destinationField A field in a destination connector, or a field value against which
       * Amazon AppFlow validates a source field.
       */
      override fun destinationField(destinationField: String) {
        cdkBuilder.destinationField(destinationField)
      }

      /**
       * @param sourceFields The source fields to which a particular task is applied. 
       */
      override fun sourceFields(sourceFields: List<String>) {
        cdkBuilder.sourceFields(sourceFields)
      }

      /**
       * @param sourceFields The source fields to which a particular task is applied. 
       */
      override fun sourceFields(vararg sourceFields: String): Unit =
          sourceFields(sourceFields.toList())

      /**
       * @param taskProperties A map used to store task-related information.
       * The execution service looks for particular information based on the `TaskType` .
       */
      override fun taskProperties(taskProperties: IResolvable) {
        cdkBuilder.taskProperties(taskProperties.let(IResolvable::unwrap))
      }

      /**
       * @param taskProperties A map used to store task-related information.
       * The execution service looks for particular information based on the `TaskType` .
       */
      override fun taskProperties(taskProperties: List<Any>) {
        cdkBuilder.taskProperties(taskProperties)
      }

      /**
       * @param taskProperties A map used to store task-related information.
       * The execution service looks for particular information based on the `TaskType` .
       */
      override fun taskProperties(vararg taskProperties: Any): Unit =
          taskProperties(taskProperties.toList())

      /**
       * @param taskType Specifies the particular task implementation that Amazon AppFlow performs. 
       * *Allowed values* : `Arithmetic` | `Filter` | `Map` | `Map_all` | `Mask` | `Merge` |
       * `Truncate` | `Validate`
       */
      override fun taskType(taskType: String) {
        cdkBuilder.taskType(taskType)
      }

      public fun build(): software.amazon.awscdk.services.appflow.CfnFlow.TaskProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.TaskProperty,
    ) : CdkObject(cdkObject), TaskProperty {
      /**
       * The operation to be performed on the provided source fields.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-task.html#cfn-appflow-flow-task-connectoroperator)
       */
      override fun connectorOperator(): Any? = unwrap(this).getConnectorOperator()

      /**
       * A field in a destination connector, or a field value against which Amazon AppFlow validates
       * a source field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-task.html#cfn-appflow-flow-task-destinationfield)
       */
      override fun destinationField(): String? = unwrap(this).getDestinationField()

      /**
       * The source fields to which a particular task is applied.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-task.html#cfn-appflow-flow-task-sourcefields)
       */
      override fun sourceFields(): List<String> = unwrap(this).getSourceFields()

      /**
       * A map used to store task-related information.
       *
       * The execution service looks for particular information based on the `TaskType` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-task.html#cfn-appflow-flow-task-taskproperties)
       */
      override fun taskProperties(): Any? = unwrap(this).getTaskProperties()

      /**
       * Specifies the particular task implementation that Amazon AppFlow performs.
       *
       * *Allowed values* : `Arithmetic` | `Filter` | `Map` | `Map_all` | `Mask` | `Merge` |
       * `Truncate` | `Validate`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-task.html#cfn-appflow-flow-task-tasktype)
       */
      override fun taskType(): String = unwrap(this).getTaskType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TaskProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.TaskProperty):
          TaskProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TaskProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.TaskProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.appflow.CfnFlow.TaskProperty
    }
  }

  /**
   * The properties that are applied when using Veeva as a flow source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appflow.*;
   * VeevaSourcePropertiesProperty veevaSourcePropertiesProperty =
   * VeevaSourcePropertiesProperty.builder()
   * .object("object")
   * // the properties below are optional
   * .documentType("documentType")
   * .includeAllVersions(false)
   * .includeRenditions(false)
   * .includeSourceFiles(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-veevasourceproperties.html)
   */
  public interface VeevaSourcePropertiesProperty {
    /**
     * The document type specified in the Veeva document extract flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-veevasourceproperties.html#cfn-appflow-flow-veevasourceproperties-documenttype)
     */
    public fun documentType(): String? = unwrap(this).getDocumentType()

    /**
     * Boolean value to include All Versions of files in Veeva document extract flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-veevasourceproperties.html#cfn-appflow-flow-veevasourceproperties-includeallversions)
     */
    public fun includeAllVersions(): Any? = unwrap(this).getIncludeAllVersions()

    /**
     * Boolean value to include file renditions in Veeva document extract flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-veevasourceproperties.html#cfn-appflow-flow-veevasourceproperties-includerenditions)
     */
    public fun includeRenditions(): Any? = unwrap(this).getIncludeRenditions()

    /**
     * Boolean value to include source files in Veeva document extract flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-veevasourceproperties.html#cfn-appflow-flow-veevasourceproperties-includesourcefiles)
     */
    public fun includeSourceFiles(): Any? = unwrap(this).getIncludeSourceFiles()

    /**
     * The object specified in the Veeva flow source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-veevasourceproperties.html#cfn-appflow-flow-veevasourceproperties-object)
     */
    public fun `object`(): String

    /**
     * A builder for [VeevaSourcePropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param documentType The document type specified in the Veeva document extract flow.
       */
      public fun documentType(documentType: String)

      /**
       * @param includeAllVersions Boolean value to include All Versions of files in Veeva document
       * extract flow.
       */
      public fun includeAllVersions(includeAllVersions: Boolean)

      /**
       * @param includeAllVersions Boolean value to include All Versions of files in Veeva document
       * extract flow.
       */
      public fun includeAllVersions(includeAllVersions: IResolvable)

      /**
       * @param includeRenditions Boolean value to include file renditions in Veeva document extract
       * flow.
       */
      public fun includeRenditions(includeRenditions: Boolean)

      /**
       * @param includeRenditions Boolean value to include file renditions in Veeva document extract
       * flow.
       */
      public fun includeRenditions(includeRenditions: IResolvable)

      /**
       * @param includeSourceFiles Boolean value to include source files in Veeva document extract
       * flow.
       */
      public fun includeSourceFiles(includeSourceFiles: Boolean)

      /**
       * @param includeSourceFiles Boolean value to include source files in Veeva document extract
       * flow.
       */
      public fun includeSourceFiles(includeSourceFiles: IResolvable)

      /**
       * @param object The object specified in the Veeva flow source. 
       */
      public fun `object`(`object`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.VeevaSourcePropertiesProperty.Builder =
          software.amazon.awscdk.services.appflow.CfnFlow.VeevaSourcePropertiesProperty.builder()

      /**
       * @param documentType The document type specified in the Veeva document extract flow.
       */
      override fun documentType(documentType: String) {
        cdkBuilder.documentType(documentType)
      }

      /**
       * @param includeAllVersions Boolean value to include All Versions of files in Veeva document
       * extract flow.
       */
      override fun includeAllVersions(includeAllVersions: Boolean) {
        cdkBuilder.includeAllVersions(includeAllVersions)
      }

      /**
       * @param includeAllVersions Boolean value to include All Versions of files in Veeva document
       * extract flow.
       */
      override fun includeAllVersions(includeAllVersions: IResolvable) {
        cdkBuilder.includeAllVersions(includeAllVersions.let(IResolvable::unwrap))
      }

      /**
       * @param includeRenditions Boolean value to include file renditions in Veeva document extract
       * flow.
       */
      override fun includeRenditions(includeRenditions: Boolean) {
        cdkBuilder.includeRenditions(includeRenditions)
      }

      /**
       * @param includeRenditions Boolean value to include file renditions in Veeva document extract
       * flow.
       */
      override fun includeRenditions(includeRenditions: IResolvable) {
        cdkBuilder.includeRenditions(includeRenditions.let(IResolvable::unwrap))
      }

      /**
       * @param includeSourceFiles Boolean value to include source files in Veeva document extract
       * flow.
       */
      override fun includeSourceFiles(includeSourceFiles: Boolean) {
        cdkBuilder.includeSourceFiles(includeSourceFiles)
      }

      /**
       * @param includeSourceFiles Boolean value to include source files in Veeva document extract
       * flow.
       */
      override fun includeSourceFiles(includeSourceFiles: IResolvable) {
        cdkBuilder.includeSourceFiles(includeSourceFiles.let(IResolvable::unwrap))
      }

      /**
       * @param object The object specified in the Veeva flow source. 
       */
      override fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.VeevaSourcePropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.VeevaSourcePropertiesProperty,
    ) : CdkObject(cdkObject), VeevaSourcePropertiesProperty {
      /**
       * The document type specified in the Veeva document extract flow.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-veevasourceproperties.html#cfn-appflow-flow-veevasourceproperties-documenttype)
       */
      override fun documentType(): String? = unwrap(this).getDocumentType()

      /**
       * Boolean value to include All Versions of files in Veeva document extract flow.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-veevasourceproperties.html#cfn-appflow-flow-veevasourceproperties-includeallversions)
       */
      override fun includeAllVersions(): Any? = unwrap(this).getIncludeAllVersions()

      /**
       * Boolean value to include file renditions in Veeva document extract flow.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-veevasourceproperties.html#cfn-appflow-flow-veevasourceproperties-includerenditions)
       */
      override fun includeRenditions(): Any? = unwrap(this).getIncludeRenditions()

      /**
       * Boolean value to include source files in Veeva document extract flow.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-veevasourceproperties.html#cfn-appflow-flow-veevasourceproperties-includesourcefiles)
       */
      override fun includeSourceFiles(): Any? = unwrap(this).getIncludeSourceFiles()

      /**
       * The object specified in the Veeva flow source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-veevasourceproperties.html#cfn-appflow-flow-veevasourceproperties-object)
       */
      override fun `object`(): String = unwrap(this).getObject()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VeevaSourcePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.VeevaSourcePropertiesProperty):
          VeevaSourcePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VeevaSourcePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.VeevaSourcePropertiesProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnFlow.VeevaSourcePropertiesProperty
    }
  }

  /**
   * The properties that are applied when Marketo is being used as a source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appflow.*;
   * MarketoSourcePropertiesProperty marketoSourcePropertiesProperty =
   * MarketoSourcePropertiesProperty.builder()
   * .object("object")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-marketosourceproperties.html)
   */
  public interface MarketoSourcePropertiesProperty {
    /**
     * The object specified in the Marketo flow source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-marketosourceproperties.html#cfn-appflow-flow-marketosourceproperties-object)
     */
    public fun `object`(): String

    /**
     * A builder for [MarketoSourcePropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param object The object specified in the Marketo flow source. 
       */
      public fun `object`(`object`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.MarketoSourcePropertiesProperty.Builder =
          software.amazon.awscdk.services.appflow.CfnFlow.MarketoSourcePropertiesProperty.builder()

      /**
       * @param object The object specified in the Marketo flow source. 
       */
      override fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.MarketoSourcePropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.MarketoSourcePropertiesProperty,
    ) : CdkObject(cdkObject), MarketoSourcePropertiesProperty {
      /**
       * The object specified in the Marketo flow source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-marketosourceproperties.html#cfn-appflow-flow-marketosourceproperties-object)
       */
      override fun `object`(): String = unwrap(this).getObject()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MarketoSourcePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.MarketoSourcePropertiesProperty):
          MarketoSourcePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MarketoSourcePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.MarketoSourcePropertiesProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnFlow.MarketoSourcePropertiesProperty
    }
  }

  /**
   * SAP Source connector parallelism factor.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appflow.*;
   * SAPODataParallelismConfigProperty sAPODataParallelismConfigProperty =
   * SAPODataParallelismConfigProperty.builder()
   * .maxParallelism(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sapodataparallelismconfig.html)
   */
  public interface SAPODataParallelismConfigProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sapodataparallelismconfig.html#cfn-appflow-flow-sapodataparallelismconfig-maxparallelism)
     */
    public fun maxParallelism(): Number

    /**
     * A builder for [SAPODataParallelismConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maxParallelism the value to be set. 
       */
      public fun maxParallelism(maxParallelism: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.SAPODataParallelismConfigProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnFlow.SAPODataParallelismConfigProperty.builder()

      /**
       * @param maxParallelism the value to be set. 
       */
      override fun maxParallelism(maxParallelism: Number) {
        cdkBuilder.maxParallelism(maxParallelism)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.SAPODataParallelismConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.SAPODataParallelismConfigProperty,
    ) : CdkObject(cdkObject), SAPODataParallelismConfigProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sapodataparallelismconfig.html#cfn-appflow-flow-sapodataparallelismconfig-maxparallelism)
       */
      override fun maxParallelism(): Number = unwrap(this).getMaxParallelism()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SAPODataParallelismConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.SAPODataParallelismConfigProperty):
          SAPODataParallelismConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SAPODataParallelismConfigProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.SAPODataParallelismConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnFlow.SAPODataParallelismConfigProperty
    }
  }

  /**
   * The properties that are applied when Amplitude is being used as a source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appflow.*;
   * AmplitudeSourcePropertiesProperty amplitudeSourcePropertiesProperty =
   * AmplitudeSourcePropertiesProperty.builder()
   * .object("object")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-amplitudesourceproperties.html)
   */
  public interface AmplitudeSourcePropertiesProperty {
    /**
     * The object specified in the Amplitude flow source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-amplitudesourceproperties.html#cfn-appflow-flow-amplitudesourceproperties-object)
     */
    public fun `object`(): String

    /**
     * A builder for [AmplitudeSourcePropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param object The object specified in the Amplitude flow source. 
       */
      public fun `object`(`object`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.AmplitudeSourcePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnFlow.AmplitudeSourcePropertiesProperty.builder()

      /**
       * @param object The object specified in the Amplitude flow source. 
       */
      override fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.AmplitudeSourcePropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.AmplitudeSourcePropertiesProperty,
    ) : CdkObject(cdkObject), AmplitudeSourcePropertiesProperty {
      /**
       * The object specified in the Amplitude flow source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-amplitudesourceproperties.html#cfn-appflow-flow-amplitudesourceproperties-object)
       */
      override fun `object`(): String = unwrap(this).getObject()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AmplitudeSourcePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.AmplitudeSourcePropertiesProperty):
          AmplitudeSourcePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AmplitudeSourcePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.AmplitudeSourcePropertiesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnFlow.AmplitudeSourcePropertiesProperty
    }
  }

  /**
   * Specifies elements that Amazon AppFlow includes in the file and folder names in the flow
   * destination.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appflow.*;
   * PrefixConfigProperty prefixConfigProperty = PrefixConfigProperty.builder()
   * .pathPrefixHierarchy(List.of("pathPrefixHierarchy"))
   * .prefixFormat("prefixFormat")
   * .prefixType("prefixType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-prefixconfig.html)
   */
  public interface PrefixConfigProperty {
    /**
     * Specifies whether the destination file path includes either or both of the following
     * elements:.
     *
     * * **EXECUTION_ID** - The ID that Amazon AppFlow assigns to the flow run.
     * * **SCHEMA_VERSION** - The version number of your data schema. Amazon AppFlow assigns this
     * version number. The version number increases by one when you change any of the following
     * settings in your flow configuration:
     * * Source-to-destination field mappings
     * * Field data types
     * * Partition keys
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-prefixconfig.html#cfn-appflow-flow-prefixconfig-pathprefixhierarchy)
     */
    public fun pathPrefixHierarchy(): List<String> = unwrap(this).getPathPrefixHierarchy() ?:
        emptyList()

    /**
     * Determines the level of granularity for the date and time that's included in the prefix.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-prefixconfig.html#cfn-appflow-flow-prefixconfig-prefixformat)
     */
    public fun prefixFormat(): String? = unwrap(this).getPrefixFormat()

    /**
     * Determines the format of the prefix, and whether it applies to the file name, file path, or
     * both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-prefixconfig.html#cfn-appflow-flow-prefixconfig-prefixtype)
     */
    public fun prefixType(): String? = unwrap(this).getPrefixType()

    /**
     * A builder for [PrefixConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param pathPrefixHierarchy Specifies whether the destination file path includes either or
       * both of the following elements:.
       * * **EXECUTION_ID** - The ID that Amazon AppFlow assigns to the flow run.
       * * **SCHEMA_VERSION** - The version number of your data schema. Amazon AppFlow assigns this
       * version number. The version number increases by one when you change any of the following
       * settings in your flow configuration:
       * * Source-to-destination field mappings
       * * Field data types
       * * Partition keys
       */
      public fun pathPrefixHierarchy(pathPrefixHierarchy: List<String>)

      /**
       * @param pathPrefixHierarchy Specifies whether the destination file path includes either or
       * both of the following elements:.
       * * **EXECUTION_ID** - The ID that Amazon AppFlow assigns to the flow run.
       * * **SCHEMA_VERSION** - The version number of your data schema. Amazon AppFlow assigns this
       * version number. The version number increases by one when you change any of the following
       * settings in your flow configuration:
       * * Source-to-destination field mappings
       * * Field data types
       * * Partition keys
       */
      public fun pathPrefixHierarchy(vararg pathPrefixHierarchy: String)

      /**
       * @param prefixFormat Determines the level of granularity for the date and time that's
       * included in the prefix.
       */
      public fun prefixFormat(prefixFormat: String)

      /**
       * @param prefixType Determines the format of the prefix, and whether it applies to the file
       * name, file path, or both.
       */
      public fun prefixType(prefixType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.PrefixConfigProperty.Builder =
          software.amazon.awscdk.services.appflow.CfnFlow.PrefixConfigProperty.builder()

      /**
       * @param pathPrefixHierarchy Specifies whether the destination file path includes either or
       * both of the following elements:.
       * * **EXECUTION_ID** - The ID that Amazon AppFlow assigns to the flow run.
       * * **SCHEMA_VERSION** - The version number of your data schema. Amazon AppFlow assigns this
       * version number. The version number increases by one when you change any of the following
       * settings in your flow configuration:
       * * Source-to-destination field mappings
       * * Field data types
       * * Partition keys
       */
      override fun pathPrefixHierarchy(pathPrefixHierarchy: List<String>) {
        cdkBuilder.pathPrefixHierarchy(pathPrefixHierarchy)
      }

      /**
       * @param pathPrefixHierarchy Specifies whether the destination file path includes either or
       * both of the following elements:.
       * * **EXECUTION_ID** - The ID that Amazon AppFlow assigns to the flow run.
       * * **SCHEMA_VERSION** - The version number of your data schema. Amazon AppFlow assigns this
       * version number. The version number increases by one when you change any of the following
       * settings in your flow configuration:
       * * Source-to-destination field mappings
       * * Field data types
       * * Partition keys
       */
      override fun pathPrefixHierarchy(vararg pathPrefixHierarchy: String): Unit =
          pathPrefixHierarchy(pathPrefixHierarchy.toList())

      /**
       * @param prefixFormat Determines the level of granularity for the date and time that's
       * included in the prefix.
       */
      override fun prefixFormat(prefixFormat: String) {
        cdkBuilder.prefixFormat(prefixFormat)
      }

      /**
       * @param prefixType Determines the format of the prefix, and whether it applies to the file
       * name, file path, or both.
       */
      override fun prefixType(prefixType: String) {
        cdkBuilder.prefixType(prefixType)
      }

      public fun build(): software.amazon.awscdk.services.appflow.CfnFlow.PrefixConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.PrefixConfigProperty,
    ) : CdkObject(cdkObject), PrefixConfigProperty {
      /**
       * Specifies whether the destination file path includes either or both of the following
       * elements:.
       *
       * * **EXECUTION_ID** - The ID that Amazon AppFlow assigns to the flow run.
       * * **SCHEMA_VERSION** - The version number of your data schema. Amazon AppFlow assigns this
       * version number. The version number increases by one when you change any of the following
       * settings in your flow configuration:
       * * Source-to-destination field mappings
       * * Field data types
       * * Partition keys
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-prefixconfig.html#cfn-appflow-flow-prefixconfig-pathprefixhierarchy)
       */
      override fun pathPrefixHierarchy(): List<String> = unwrap(this).getPathPrefixHierarchy() ?:
          emptyList()

      /**
       * Determines the level of granularity for the date and time that's included in the prefix.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-prefixconfig.html#cfn-appflow-flow-prefixconfig-prefixformat)
       */
      override fun prefixFormat(): String? = unwrap(this).getPrefixFormat()

      /**
       * Determines the format of the prefix, and whether it applies to the file name, file path, or
       * both.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-prefixconfig.html#cfn-appflow-flow-prefixconfig-prefixtype)
       */
      override fun prefixType(): String? = unwrap(this).getPrefixType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PrefixConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.PrefixConfigProperty):
          PrefixConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PrefixConfigProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.PrefixConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnFlow.PrefixConfigProperty
    }
  }

  /**
   * The properties that are applied when using Zendesk as a flow source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appflow.*;
   * ZendeskSourcePropertiesProperty zendeskSourcePropertiesProperty =
   * ZendeskSourcePropertiesProperty.builder()
   * .object("object")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-zendesksourceproperties.html)
   */
  public interface ZendeskSourcePropertiesProperty {
    /**
     * The object specified in the Zendesk flow source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-zendesksourceproperties.html#cfn-appflow-flow-zendesksourceproperties-object)
     */
    public fun `object`(): String

    /**
     * A builder for [ZendeskSourcePropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param object The object specified in the Zendesk flow source. 
       */
      public fun `object`(`object`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.ZendeskSourcePropertiesProperty.Builder =
          software.amazon.awscdk.services.appflow.CfnFlow.ZendeskSourcePropertiesProperty.builder()

      /**
       * @param object The object specified in the Zendesk flow source. 
       */
      override fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.ZendeskSourcePropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.ZendeskSourcePropertiesProperty,
    ) : CdkObject(cdkObject), ZendeskSourcePropertiesProperty {
      /**
       * The object specified in the Zendesk flow source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-zendesksourceproperties.html#cfn-appflow-flow-zendesksourceproperties-object)
       */
      override fun `object`(): String = unwrap(this).getObject()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ZendeskSourcePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.ZendeskSourcePropertiesProperty):
          ZendeskSourcePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ZendeskSourcePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.ZendeskSourcePropertiesProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnFlow.ZendeskSourcePropertiesProperty
    }
  }

  /**
   * The properties that are applied when Snowflake is being used as a destination.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appflow.*;
   * SnowflakeDestinationPropertiesProperty snowflakeDestinationPropertiesProperty =
   * SnowflakeDestinationPropertiesProperty.builder()
   * .intermediateBucketName("intermediateBucketName")
   * .object("object")
   * // the properties below are optional
   * .bucketPrefix("bucketPrefix")
   * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * .failOnFirstError(false)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-snowflakedestinationproperties.html)
   */
  public interface SnowflakeDestinationPropertiesProperty {
    /**
     * The object key for the destination bucket in which Amazon AppFlow places the files.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-snowflakedestinationproperties.html#cfn-appflow-flow-snowflakedestinationproperties-bucketprefix)
     */
    public fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

    /**
     * The settings that determine how Amazon AppFlow handles an error when placing data in the
     * Snowflake destination.
     *
     * For example, this setting would determine if the flow should fail after one insertion error,
     * or continue and attempt to insert every record regardless of the initial failure.
     * `ErrorHandlingConfig` is a part of the destination connector details.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-snowflakedestinationproperties.html#cfn-appflow-flow-snowflakedestinationproperties-errorhandlingconfig)
     */
    public fun errorHandlingConfig(): Any? = unwrap(this).getErrorHandlingConfig()

    /**
     * The intermediate bucket that Amazon AppFlow uses when moving data into Snowflake.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-snowflakedestinationproperties.html#cfn-appflow-flow-snowflakedestinationproperties-intermediatebucketname)
     */
    public fun intermediateBucketName(): String

    /**
     * The object specified in the Snowflake flow destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-snowflakedestinationproperties.html#cfn-appflow-flow-snowflakedestinationproperties-object)
     */
    public fun `object`(): String

    /**
     * A builder for [SnowflakeDestinationPropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucketPrefix The object key for the destination bucket in which Amazon AppFlow
       * places the files.
       */
      public fun bucketPrefix(bucketPrefix: String)

      /**
       * @param errorHandlingConfig The settings that determine how Amazon AppFlow handles an error
       * when placing data in the Snowflake destination.
       * For example, this setting would determine if the flow should fail after one insertion
       * error, or continue and attempt to insert every record regardless of the initial failure.
       * `ErrorHandlingConfig` is a part of the destination connector details.
       */
      public fun errorHandlingConfig(errorHandlingConfig: IResolvable)

      /**
       * @param errorHandlingConfig The settings that determine how Amazon AppFlow handles an error
       * when placing data in the Snowflake destination.
       * For example, this setting would determine if the flow should fail after one insertion
       * error, or continue and attempt to insert every record regardless of the initial failure.
       * `ErrorHandlingConfig` is a part of the destination connector details.
       */
      public fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty)

      /**
       * @param errorHandlingConfig The settings that determine how Amazon AppFlow handles an error
       * when placing data in the Snowflake destination.
       * For example, this setting would determine if the flow should fail after one insertion
       * error, or continue and attempt to insert every record regardless of the initial failure.
       * `ErrorHandlingConfig` is a part of the destination connector details.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("646ce6c201ad615973cb0fb40476ff65e117a9cce859f39a0a75ffc640ead1e2")
      public
          fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty.Builder.() -> Unit)

      /**
       * @param intermediateBucketName The intermediate bucket that Amazon AppFlow uses when moving
       * data into Snowflake. 
       */
      public fun intermediateBucketName(intermediateBucketName: String)

      /**
       * @param object The object specified in the Snowflake flow destination. 
       */
      public fun `object`(`object`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.SnowflakeDestinationPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnFlow.SnowflakeDestinationPropertiesProperty.builder()

      /**
       * @param bucketPrefix The object key for the destination bucket in which Amazon AppFlow
       * places the files.
       */
      override fun bucketPrefix(bucketPrefix: String) {
        cdkBuilder.bucketPrefix(bucketPrefix)
      }

      /**
       * @param errorHandlingConfig The settings that determine how Amazon AppFlow handles an error
       * when placing data in the Snowflake destination.
       * For example, this setting would determine if the flow should fail after one insertion
       * error, or continue and attempt to insert every record regardless of the initial failure.
       * `ErrorHandlingConfig` is a part of the destination connector details.
       */
      override fun errorHandlingConfig(errorHandlingConfig: IResolvable) {
        cdkBuilder.errorHandlingConfig(errorHandlingConfig.let(IResolvable::unwrap))
      }

      /**
       * @param errorHandlingConfig The settings that determine how Amazon AppFlow handles an error
       * when placing data in the Snowflake destination.
       * For example, this setting would determine if the flow should fail after one insertion
       * error, or continue and attempt to insert every record regardless of the initial failure.
       * `ErrorHandlingConfig` is a part of the destination connector details.
       */
      override fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty) {
        cdkBuilder.errorHandlingConfig(errorHandlingConfig.let(ErrorHandlingConfigProperty::unwrap))
      }

      /**
       * @param errorHandlingConfig The settings that determine how Amazon AppFlow handles an error
       * when placing data in the Snowflake destination.
       * For example, this setting would determine if the flow should fail after one insertion
       * error, or continue and attempt to insert every record regardless of the initial failure.
       * `ErrorHandlingConfig` is a part of the destination connector details.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("646ce6c201ad615973cb0fb40476ff65e117a9cce859f39a0a75ffc640ead1e2")
      override
          fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty.Builder.() -> Unit):
          Unit = errorHandlingConfig(ErrorHandlingConfigProperty(errorHandlingConfig))

      /**
       * @param intermediateBucketName The intermediate bucket that Amazon AppFlow uses when moving
       * data into Snowflake. 
       */
      override fun intermediateBucketName(intermediateBucketName: String) {
        cdkBuilder.intermediateBucketName(intermediateBucketName)
      }

      /**
       * @param object The object specified in the Snowflake flow destination. 
       */
      override fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.SnowflakeDestinationPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.SnowflakeDestinationPropertiesProperty,
    ) : CdkObject(cdkObject), SnowflakeDestinationPropertiesProperty {
      /**
       * The object key for the destination bucket in which Amazon AppFlow places the files.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-snowflakedestinationproperties.html#cfn-appflow-flow-snowflakedestinationproperties-bucketprefix)
       */
      override fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

      /**
       * The settings that determine how Amazon AppFlow handles an error when placing data in the
       * Snowflake destination.
       *
       * For example, this setting would determine if the flow should fail after one insertion
       * error, or continue and attempt to insert every record regardless of the initial failure.
       * `ErrorHandlingConfig` is a part of the destination connector details.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-snowflakedestinationproperties.html#cfn-appflow-flow-snowflakedestinationproperties-errorhandlingconfig)
       */
      override fun errorHandlingConfig(): Any? = unwrap(this).getErrorHandlingConfig()

      /**
       * The intermediate bucket that Amazon AppFlow uses when moving data into Snowflake.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-snowflakedestinationproperties.html#cfn-appflow-flow-snowflakedestinationproperties-intermediatebucketname)
       */
      override fun intermediateBucketName(): String = unwrap(this).getIntermediateBucketName()

      /**
       * The object specified in the Snowflake flow destination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-snowflakedestinationproperties.html#cfn-appflow-flow-snowflakedestinationproperties-object)
       */
      override fun `object`(): String = unwrap(this).getObject()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SnowflakeDestinationPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.SnowflakeDestinationPropertiesProperty):
          SnowflakeDestinationPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SnowflakeDestinationPropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.SnowflakeDestinationPropertiesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnFlow.SnowflakeDestinationPropertiesProperty
    }
  }

  /**
   * The properties that are applied when Amazon EventBridge is being used as a destination.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appflow.*;
   * EventBridgeDestinationPropertiesProperty eventBridgeDestinationPropertiesProperty =
   * EventBridgeDestinationPropertiesProperty.builder()
   * .object("object")
   * // the properties below are optional
   * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * .failOnFirstError(false)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-eventbridgedestinationproperties.html)
   */
  public interface EventBridgeDestinationPropertiesProperty {
    /**
     * The object specified in the Amplitude flow source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-eventbridgedestinationproperties.html#cfn-appflow-flow-eventbridgedestinationproperties-errorhandlingconfig)
     */
    public fun errorHandlingConfig(): Any? = unwrap(this).getErrorHandlingConfig()

    /**
     * The object specified in the Amazon EventBridge flow destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-eventbridgedestinationproperties.html#cfn-appflow-flow-eventbridgedestinationproperties-object)
     */
    public fun `object`(): String

    /**
     * A builder for [EventBridgeDestinationPropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param errorHandlingConfig The object specified in the Amplitude flow source.
       */
      public fun errorHandlingConfig(errorHandlingConfig: IResolvable)

      /**
       * @param errorHandlingConfig The object specified in the Amplitude flow source.
       */
      public fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty)

      /**
       * @param errorHandlingConfig The object specified in the Amplitude flow source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3c980cf0619d47543c453f74a7025f668f5960b470348d6a863e07c13d827a6a")
      public
          fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty.Builder.() -> Unit)

      /**
       * @param object The object specified in the Amazon EventBridge flow destination. 
       */
      public fun `object`(`object`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.EventBridgeDestinationPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnFlow.EventBridgeDestinationPropertiesProperty.builder()

      /**
       * @param errorHandlingConfig The object specified in the Amplitude flow source.
       */
      override fun errorHandlingConfig(errorHandlingConfig: IResolvable) {
        cdkBuilder.errorHandlingConfig(errorHandlingConfig.let(IResolvable::unwrap))
      }

      /**
       * @param errorHandlingConfig The object specified in the Amplitude flow source.
       */
      override fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty) {
        cdkBuilder.errorHandlingConfig(errorHandlingConfig.let(ErrorHandlingConfigProperty::unwrap))
      }

      /**
       * @param errorHandlingConfig The object specified in the Amplitude flow source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3c980cf0619d47543c453f74a7025f668f5960b470348d6a863e07c13d827a6a")
      override
          fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty.Builder.() -> Unit):
          Unit = errorHandlingConfig(ErrorHandlingConfigProperty(errorHandlingConfig))

      /**
       * @param object The object specified in the Amazon EventBridge flow destination. 
       */
      override fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.EventBridgeDestinationPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.EventBridgeDestinationPropertiesProperty,
    ) : CdkObject(cdkObject), EventBridgeDestinationPropertiesProperty {
      /**
       * The object specified in the Amplitude flow source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-eventbridgedestinationproperties.html#cfn-appflow-flow-eventbridgedestinationproperties-errorhandlingconfig)
       */
      override fun errorHandlingConfig(): Any? = unwrap(this).getErrorHandlingConfig()

      /**
       * The object specified in the Amazon EventBridge flow destination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-eventbridgedestinationproperties.html#cfn-appflow-flow-eventbridgedestinationproperties-object)
       */
      override fun `object`(): String = unwrap(this).getObject()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          EventBridgeDestinationPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.EventBridgeDestinationPropertiesProperty):
          EventBridgeDestinationPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EventBridgeDestinationPropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.EventBridgeDestinationPropertiesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnFlow.EventBridgeDestinationPropertiesProperty
    }
  }

  /**
   * The properties that are applied when Dynatrace is being used as a source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appflow.*;
   * DynatraceSourcePropertiesProperty dynatraceSourcePropertiesProperty =
   * DynatraceSourcePropertiesProperty.builder()
   * .object("object")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-dynatracesourceproperties.html)
   */
  public interface DynatraceSourcePropertiesProperty {
    /**
     * The object specified in the Dynatrace flow source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-dynatracesourceproperties.html#cfn-appflow-flow-dynatracesourceproperties-object)
     */
    public fun `object`(): String

    /**
     * A builder for [DynatraceSourcePropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param object The object specified in the Dynatrace flow source. 
       */
      public fun `object`(`object`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.DynatraceSourcePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnFlow.DynatraceSourcePropertiesProperty.builder()

      /**
       * @param object The object specified in the Dynatrace flow source. 
       */
      override fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.DynatraceSourcePropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.DynatraceSourcePropertiesProperty,
    ) : CdkObject(cdkObject), DynatraceSourcePropertiesProperty {
      /**
       * The object specified in the Dynatrace flow source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-dynatracesourceproperties.html#cfn-appflow-flow-dynatracesourceproperties-object)
       */
      override fun `object`(): String = unwrap(this).getObject()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DynatraceSourcePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.DynatraceSourcePropertiesProperty):
          DynatraceSourcePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DynatraceSourcePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.DynatraceSourcePropertiesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnFlow.DynatraceSourcePropertiesProperty
    }
  }

  /**
   * The properties that are applied when the custom connector is being used as a source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appflow.*;
   * CustomConnectorSourcePropertiesProperty customConnectorSourcePropertiesProperty =
   * CustomConnectorSourcePropertiesProperty.builder()
   * .entityName("entityName")
   * // the properties below are optional
   * .customProperties(Map.of(
   * "customPropertiesKey", "customProperties"))
   * .dataTransferApi(DataTransferApiProperty.builder()
   * .name("name")
   * .type("type")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-customconnectorsourceproperties.html)
   */
  public interface CustomConnectorSourcePropertiesProperty {
    /**
     * Custom properties that are required to use the custom connector as a source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-customconnectorsourceproperties.html#cfn-appflow-flow-customconnectorsourceproperties-customproperties)
     */
    public fun customProperties(): Any? = unwrap(this).getCustomProperties()

    /**
     * The API of the connector application that Amazon AppFlow uses to transfer your data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-customconnectorsourceproperties.html#cfn-appflow-flow-customconnectorsourceproperties-datatransferapi)
     */
    public fun dataTransferApi(): Any? = unwrap(this).getDataTransferApi()

    /**
     * The entity specified in the custom connector as a source in the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-customconnectorsourceproperties.html#cfn-appflow-flow-customconnectorsourceproperties-entityname)
     */
    public fun entityName(): String

    /**
     * A builder for [CustomConnectorSourcePropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param customProperties Custom properties that are required to use the custom connector as
       * a source.
       */
      public fun customProperties(customProperties: IResolvable)

      /**
       * @param customProperties Custom properties that are required to use the custom connector as
       * a source.
       */
      public fun customProperties(customProperties: Map<String, String>)

      /**
       * @param dataTransferApi The API of the connector application that Amazon AppFlow uses to
       * transfer your data.
       */
      public fun dataTransferApi(dataTransferApi: IResolvable)

      /**
       * @param dataTransferApi The API of the connector application that Amazon AppFlow uses to
       * transfer your data.
       */
      public fun dataTransferApi(dataTransferApi: DataTransferApiProperty)

      /**
       * @param dataTransferApi The API of the connector application that Amazon AppFlow uses to
       * transfer your data.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9ac4e51b048b3a753fce4e0cbfa032f54fa15f574236c63e35c626ad5c4dbc97")
      public fun dataTransferApi(dataTransferApi: DataTransferApiProperty.Builder.() -> Unit)

      /**
       * @param entityName The entity specified in the custom connector as a source in the flow. 
       */
      public fun entityName(entityName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.CustomConnectorSourcePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnFlow.CustomConnectorSourcePropertiesProperty.builder()

      /**
       * @param customProperties Custom properties that are required to use the custom connector as
       * a source.
       */
      override fun customProperties(customProperties: IResolvable) {
        cdkBuilder.customProperties(customProperties.let(IResolvable::unwrap))
      }

      /**
       * @param customProperties Custom properties that are required to use the custom connector as
       * a source.
       */
      override fun customProperties(customProperties: Map<String, String>) {
        cdkBuilder.customProperties(customProperties)
      }

      /**
       * @param dataTransferApi The API of the connector application that Amazon AppFlow uses to
       * transfer your data.
       */
      override fun dataTransferApi(dataTransferApi: IResolvable) {
        cdkBuilder.dataTransferApi(dataTransferApi.let(IResolvable::unwrap))
      }

      /**
       * @param dataTransferApi The API of the connector application that Amazon AppFlow uses to
       * transfer your data.
       */
      override fun dataTransferApi(dataTransferApi: DataTransferApiProperty) {
        cdkBuilder.dataTransferApi(dataTransferApi.let(DataTransferApiProperty::unwrap))
      }

      /**
       * @param dataTransferApi The API of the connector application that Amazon AppFlow uses to
       * transfer your data.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9ac4e51b048b3a753fce4e0cbfa032f54fa15f574236c63e35c626ad5c4dbc97")
      override fun dataTransferApi(dataTransferApi: DataTransferApiProperty.Builder.() -> Unit):
          Unit = dataTransferApi(DataTransferApiProperty(dataTransferApi))

      /**
       * @param entityName The entity specified in the custom connector as a source in the flow. 
       */
      override fun entityName(entityName: String) {
        cdkBuilder.entityName(entityName)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.CustomConnectorSourcePropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.CustomConnectorSourcePropertiesProperty,
    ) : CdkObject(cdkObject), CustomConnectorSourcePropertiesProperty {
      /**
       * Custom properties that are required to use the custom connector as a source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-customconnectorsourceproperties.html#cfn-appflow-flow-customconnectorsourceproperties-customproperties)
       */
      override fun customProperties(): Any? = unwrap(this).getCustomProperties()

      /**
       * The API of the connector application that Amazon AppFlow uses to transfer your data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-customconnectorsourceproperties.html#cfn-appflow-flow-customconnectorsourceproperties-datatransferapi)
       */
      override fun dataTransferApi(): Any? = unwrap(this).getDataTransferApi()

      /**
       * The entity specified in the custom connector as a source in the flow.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-customconnectorsourceproperties.html#cfn-appflow-flow-customconnectorsourceproperties-entityname)
       */
      override fun entityName(): String = unwrap(this).getEntityName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CustomConnectorSourcePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.CustomConnectorSourcePropertiesProperty):
          CustomConnectorSourcePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomConnectorSourcePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.CustomConnectorSourcePropertiesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnFlow.CustomConnectorSourcePropertiesProperty
    }
  }

  /**
   * The properties that are applied when the custom connector is being used as a destination.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appflow.*;
   * CustomConnectorDestinationPropertiesProperty customConnectorDestinationPropertiesProperty =
   * CustomConnectorDestinationPropertiesProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-customconnectordestinationproperties.html)
   */
  public interface CustomConnectorDestinationPropertiesProperty {
    /**
     * The custom properties that are specific to the connector when it's used as a destination in
     * the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-customconnectordestinationproperties.html#cfn-appflow-flow-customconnectordestinationproperties-customproperties)
     */
    public fun customProperties(): Any? = unwrap(this).getCustomProperties()

    /**
     * The entity specified in the custom connector as a destination in the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-customconnectordestinationproperties.html#cfn-appflow-flow-customconnectordestinationproperties-entityname)
     */
    public fun entityName(): String

    /**
     * The settings that determine how Amazon AppFlow handles an error when placing data in the
     * custom connector as destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-customconnectordestinationproperties.html#cfn-appflow-flow-customconnectordestinationproperties-errorhandlingconfig)
     */
    public fun errorHandlingConfig(): Any? = unwrap(this).getErrorHandlingConfig()

    /**
     * The name of the field that Amazon AppFlow uses as an ID when performing a write operation
     * such as update, delete, or upsert.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-customconnectordestinationproperties.html#cfn-appflow-flow-customconnectordestinationproperties-idfieldnames)
     */
    public fun idFieldNames(): List<String> = unwrap(this).getIdFieldNames() ?: emptyList()

    /**
     * Specifies the type of write operation to be performed in the custom connector when it's used
     * as destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-customconnectordestinationproperties.html#cfn-appflow-flow-customconnectordestinationproperties-writeoperationtype)
     */
    public fun writeOperationType(): String? = unwrap(this).getWriteOperationType()

    /**
     * A builder for [CustomConnectorDestinationPropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param customProperties The custom properties that are specific to the connector when it's
       * used as a destination in the flow.
       */
      public fun customProperties(customProperties: IResolvable)

      /**
       * @param customProperties The custom properties that are specific to the connector when it's
       * used as a destination in the flow.
       */
      public fun customProperties(customProperties: Map<String, String>)

      /**
       * @param entityName The entity specified in the custom connector as a destination in the
       * flow. 
       */
      public fun entityName(entityName: String)

      /**
       * @param errorHandlingConfig The settings that determine how Amazon AppFlow handles an error
       * when placing data in the custom connector as destination.
       */
      public fun errorHandlingConfig(errorHandlingConfig: IResolvable)

      /**
       * @param errorHandlingConfig The settings that determine how Amazon AppFlow handles an error
       * when placing data in the custom connector as destination.
       */
      public fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty)

      /**
       * @param errorHandlingConfig The settings that determine how Amazon AppFlow handles an error
       * when placing data in the custom connector as destination.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d1987b9fda54644ce31894cf27282a859746ec5079d56bf57d51404c701df3f3")
      public
          fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty.Builder.() -> Unit)

      /**
       * @param idFieldNames The name of the field that Amazon AppFlow uses as an ID when performing
       * a write operation such as update, delete, or upsert.
       */
      public fun idFieldNames(idFieldNames: List<String>)

      /**
       * @param idFieldNames The name of the field that Amazon AppFlow uses as an ID when performing
       * a write operation such as update, delete, or upsert.
       */
      public fun idFieldNames(vararg idFieldNames: String)

      /**
       * @param writeOperationType Specifies the type of write operation to be performed in the
       * custom connector when it's used as destination.
       */
      public fun writeOperationType(writeOperationType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.CustomConnectorDestinationPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnFlow.CustomConnectorDestinationPropertiesProperty.builder()

      /**
       * @param customProperties The custom properties that are specific to the connector when it's
       * used as a destination in the flow.
       */
      override fun customProperties(customProperties: IResolvable) {
        cdkBuilder.customProperties(customProperties.let(IResolvable::unwrap))
      }

      /**
       * @param customProperties The custom properties that are specific to the connector when it's
       * used as a destination in the flow.
       */
      override fun customProperties(customProperties: Map<String, String>) {
        cdkBuilder.customProperties(customProperties)
      }

      /**
       * @param entityName The entity specified in the custom connector as a destination in the
       * flow. 
       */
      override fun entityName(entityName: String) {
        cdkBuilder.entityName(entityName)
      }

      /**
       * @param errorHandlingConfig The settings that determine how Amazon AppFlow handles an error
       * when placing data in the custom connector as destination.
       */
      override fun errorHandlingConfig(errorHandlingConfig: IResolvable) {
        cdkBuilder.errorHandlingConfig(errorHandlingConfig.let(IResolvable::unwrap))
      }

      /**
       * @param errorHandlingConfig The settings that determine how Amazon AppFlow handles an error
       * when placing data in the custom connector as destination.
       */
      override fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty) {
        cdkBuilder.errorHandlingConfig(errorHandlingConfig.let(ErrorHandlingConfigProperty::unwrap))
      }

      /**
       * @param errorHandlingConfig The settings that determine how Amazon AppFlow handles an error
       * when placing data in the custom connector as destination.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d1987b9fda54644ce31894cf27282a859746ec5079d56bf57d51404c701df3f3")
      override
          fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty.Builder.() -> Unit):
          Unit = errorHandlingConfig(ErrorHandlingConfigProperty(errorHandlingConfig))

      /**
       * @param idFieldNames The name of the field that Amazon AppFlow uses as an ID when performing
       * a write operation such as update, delete, or upsert.
       */
      override fun idFieldNames(idFieldNames: List<String>) {
        cdkBuilder.idFieldNames(idFieldNames)
      }

      /**
       * @param idFieldNames The name of the field that Amazon AppFlow uses as an ID when performing
       * a write operation such as update, delete, or upsert.
       */
      override fun idFieldNames(vararg idFieldNames: String): Unit =
          idFieldNames(idFieldNames.toList())

      /**
       * @param writeOperationType Specifies the type of write operation to be performed in the
       * custom connector when it's used as destination.
       */
      override fun writeOperationType(writeOperationType: String) {
        cdkBuilder.writeOperationType(writeOperationType)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.CustomConnectorDestinationPropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.CustomConnectorDestinationPropertiesProperty,
    ) : CdkObject(cdkObject), CustomConnectorDestinationPropertiesProperty {
      /**
       * The custom properties that are specific to the connector when it's used as a destination in
       * the flow.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-customconnectordestinationproperties.html#cfn-appflow-flow-customconnectordestinationproperties-customproperties)
       */
      override fun customProperties(): Any? = unwrap(this).getCustomProperties()

      /**
       * The entity specified in the custom connector as a destination in the flow.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-customconnectordestinationproperties.html#cfn-appflow-flow-customconnectordestinationproperties-entityname)
       */
      override fun entityName(): String = unwrap(this).getEntityName()

      /**
       * The settings that determine how Amazon AppFlow handles an error when placing data in the
       * custom connector as destination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-customconnectordestinationproperties.html#cfn-appflow-flow-customconnectordestinationproperties-errorhandlingconfig)
       */
      override fun errorHandlingConfig(): Any? = unwrap(this).getErrorHandlingConfig()

      /**
       * The name of the field that Amazon AppFlow uses as an ID when performing a write operation
       * such as update, delete, or upsert.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-customconnectordestinationproperties.html#cfn-appflow-flow-customconnectordestinationproperties-idfieldnames)
       */
      override fun idFieldNames(): List<String> = unwrap(this).getIdFieldNames() ?: emptyList()

      /**
       * Specifies the type of write operation to be performed in the custom connector when it's
       * used as destination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-customconnectordestinationproperties.html#cfn-appflow-flow-customconnectordestinationproperties-writeoperationtype)
       */
      override fun writeOperationType(): String? = unwrap(this).getWriteOperationType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CustomConnectorDestinationPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.CustomConnectorDestinationPropertiesProperty):
          CustomConnectorDestinationPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomConnectorDestinationPropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.CustomConnectorDestinationPropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnFlow.CustomConnectorDestinationPropertiesProperty
    }
  }

  /**
   * The properties that Amazon AppFlow applies when you use Marketo as a flow destination.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appflow.*;
   * MarketoDestinationPropertiesProperty marketoDestinationPropertiesProperty =
   * MarketoDestinationPropertiesProperty.builder()
   * .object("object")
   * // the properties below are optional
   * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * .failOnFirstError(false)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-marketodestinationproperties.html)
   */
  public interface MarketoDestinationPropertiesProperty {
    /**
     * The settings that determine how Amazon AppFlow handles an error when placing data in the
     * destination.
     *
     * For example, this setting would determine if the flow should fail after one insertion error,
     * or continue and attempt to insert every record regardless of the initial failure.
     * `ErrorHandlingConfig` is a part of the destination connector details.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-marketodestinationproperties.html#cfn-appflow-flow-marketodestinationproperties-errorhandlingconfig)
     */
    public fun errorHandlingConfig(): Any? = unwrap(this).getErrorHandlingConfig()

    /**
     * The object specified in the Marketo flow destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-marketodestinationproperties.html#cfn-appflow-flow-marketodestinationproperties-object)
     */
    public fun `object`(): String

    /**
     * A builder for [MarketoDestinationPropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param errorHandlingConfig The settings that determine how Amazon AppFlow handles an error
       * when placing data in the destination.
       * For example, this setting would determine if the flow should fail after one insertion
       * error, or continue and attempt to insert every record regardless of the initial failure.
       * `ErrorHandlingConfig` is a part of the destination connector details.
       */
      public fun errorHandlingConfig(errorHandlingConfig: IResolvable)

      /**
       * @param errorHandlingConfig The settings that determine how Amazon AppFlow handles an error
       * when placing data in the destination.
       * For example, this setting would determine if the flow should fail after one insertion
       * error, or continue and attempt to insert every record regardless of the initial failure.
       * `ErrorHandlingConfig` is a part of the destination connector details.
       */
      public fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty)

      /**
       * @param errorHandlingConfig The settings that determine how Amazon AppFlow handles an error
       * when placing data in the destination.
       * For example, this setting would determine if the flow should fail after one insertion
       * error, or continue and attempt to insert every record regardless of the initial failure.
       * `ErrorHandlingConfig` is a part of the destination connector details.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7a6696ce19e484c0477313a9b62162fd31f77a19eb504cba2440a196a77f3a0c")
      public
          fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty.Builder.() -> Unit)

      /**
       * @param object The object specified in the Marketo flow destination. 
       */
      public fun `object`(`object`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.MarketoDestinationPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnFlow.MarketoDestinationPropertiesProperty.builder()

      /**
       * @param errorHandlingConfig The settings that determine how Amazon AppFlow handles an error
       * when placing data in the destination.
       * For example, this setting would determine if the flow should fail after one insertion
       * error, or continue and attempt to insert every record regardless of the initial failure.
       * `ErrorHandlingConfig` is a part of the destination connector details.
       */
      override fun errorHandlingConfig(errorHandlingConfig: IResolvable) {
        cdkBuilder.errorHandlingConfig(errorHandlingConfig.let(IResolvable::unwrap))
      }

      /**
       * @param errorHandlingConfig The settings that determine how Amazon AppFlow handles an error
       * when placing data in the destination.
       * For example, this setting would determine if the flow should fail after one insertion
       * error, or continue and attempt to insert every record regardless of the initial failure.
       * `ErrorHandlingConfig` is a part of the destination connector details.
       */
      override fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty) {
        cdkBuilder.errorHandlingConfig(errorHandlingConfig.let(ErrorHandlingConfigProperty::unwrap))
      }

      /**
       * @param errorHandlingConfig The settings that determine how Amazon AppFlow handles an error
       * when placing data in the destination.
       * For example, this setting would determine if the flow should fail after one insertion
       * error, or continue and attempt to insert every record regardless of the initial failure.
       * `ErrorHandlingConfig` is a part of the destination connector details.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7a6696ce19e484c0477313a9b62162fd31f77a19eb504cba2440a196a77f3a0c")
      override
          fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty.Builder.() -> Unit):
          Unit = errorHandlingConfig(ErrorHandlingConfigProperty(errorHandlingConfig))

      /**
       * @param object The object specified in the Marketo flow destination. 
       */
      override fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.MarketoDestinationPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.MarketoDestinationPropertiesProperty,
    ) : CdkObject(cdkObject), MarketoDestinationPropertiesProperty {
      /**
       * The settings that determine how Amazon AppFlow handles an error when placing data in the
       * destination.
       *
       * For example, this setting would determine if the flow should fail after one insertion
       * error, or continue and attempt to insert every record regardless of the initial failure.
       * `ErrorHandlingConfig` is a part of the destination connector details.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-marketodestinationproperties.html#cfn-appflow-flow-marketodestinationproperties-errorhandlingconfig)
       */
      override fun errorHandlingConfig(): Any? = unwrap(this).getErrorHandlingConfig()

      /**
       * The object specified in the Marketo flow destination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-marketodestinationproperties.html#cfn-appflow-flow-marketodestinationproperties-object)
       */
      override fun `object`(): String = unwrap(this).getObject()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          MarketoDestinationPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.MarketoDestinationPropertiesProperty):
          MarketoDestinationPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MarketoDestinationPropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.MarketoDestinationPropertiesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnFlow.MarketoDestinationPropertiesProperty
    }
  }

  /**
   * Specifies the configuration details of a schedule-triggered flow as defined by the user.
   *
   * Currently, these settings only apply to the `Scheduled` trigger type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appflow.*;
   * ScheduledTriggerPropertiesProperty scheduledTriggerPropertiesProperty =
   * ScheduledTriggerPropertiesProperty.builder()
   * .scheduleExpression("scheduleExpression")
   * // the properties below are optional
   * .dataPullMode("dataPullMode")
   * .firstExecutionFrom(123)
   * .flowErrorDeactivationThreshold(123)
   * .scheduleEndTime(123)
   * .scheduleOffset(123)
   * .scheduleStartTime(123)
   * .timeZone("timeZone")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-scheduledtriggerproperties.html)
   */
  public interface ScheduledTriggerPropertiesProperty {
    /**
     * Specifies whether a scheduled flow has an incremental data transfer or a complete data
     * transfer for each flow run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-scheduledtriggerproperties.html#cfn-appflow-flow-scheduledtriggerproperties-datapullmode)
     */
    public fun dataPullMode(): String? = unwrap(this).getDataPullMode()

    /**
     * Specifies the date range for the records to import from the connector in the first flow run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-scheduledtriggerproperties.html#cfn-appflow-flow-scheduledtriggerproperties-firstexecutionfrom)
     */
    public fun firstExecutionFrom(): Number? = unwrap(this).getFirstExecutionFrom()

    /**
     * Defines how many times a scheduled flow fails consecutively before Amazon AppFlow deactivates
     * it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-scheduledtriggerproperties.html#cfn-appflow-flow-scheduledtriggerproperties-flowerrordeactivationthreshold)
     */
    public fun flowErrorDeactivationThreshold(): Number? =
        unwrap(this).getFlowErrorDeactivationThreshold()

    /**
     * The time at which the scheduled flow ends.
     *
     * The time is formatted as a timestamp that follows the ISO 8601 standard, such as
     * `2022-04-27T13:00:00-07:00` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-scheduledtriggerproperties.html#cfn-appflow-flow-scheduledtriggerproperties-scheduleendtime)
     */
    public fun scheduleEndTime(): Number? = unwrap(this).getScheduleEndTime()

    /**
     * The scheduling expression that determines the rate at which the schedule will run, for
     * example `rate(5minutes)` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-scheduledtriggerproperties.html#cfn-appflow-flow-scheduledtriggerproperties-scheduleexpression)
     */
    public fun scheduleExpression(): String

    /**
     * Specifies the optional offset that is added to the time interval for a schedule-triggered
     * flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-scheduledtriggerproperties.html#cfn-appflow-flow-scheduledtriggerproperties-scheduleoffset)
     */
    public fun scheduleOffset(): Number? = unwrap(this).getScheduleOffset()

    /**
     * The time at which the scheduled flow starts.
     *
     * The time is formatted as a timestamp that follows the ISO 8601 standard, such as
     * `2022-04-26T13:00:00-07:00` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-scheduledtriggerproperties.html#cfn-appflow-flow-scheduledtriggerproperties-schedulestarttime)
     */
    public fun scheduleStartTime(): Number? = unwrap(this).getScheduleStartTime()

    /**
     * Specifies the time zone used when referring to the dates and times of a scheduled flow, such
     * as `America/New_York` .
     *
     * This time zone is only a descriptive label. It doesn't affect how Amazon AppFlow interprets
     * the timestamps that you specify to schedule the flow.
     *
     * If you want to schedule a flow by using times in a particular time zone, indicate the time
     * zone as a UTC offset in your timestamps. For example, the UTC offsets for the `America/New_York`
     * timezone are `-04:00` EDT and `-05:00 EST` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-scheduledtriggerproperties.html#cfn-appflow-flow-scheduledtriggerproperties-timezone)
     */
    public fun timeZone(): String? = unwrap(this).getTimeZone()

    /**
     * A builder for [ScheduledTriggerPropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dataPullMode Specifies whether a scheduled flow has an incremental data transfer or
       * a complete data transfer for each flow run.
       */
      public fun dataPullMode(dataPullMode: String)

      /**
       * @param firstExecutionFrom Specifies the date range for the records to import from the
       * connector in the first flow run.
       */
      public fun firstExecutionFrom(firstExecutionFrom: Number)

      /**
       * @param flowErrorDeactivationThreshold Defines how many times a scheduled flow fails
       * consecutively before Amazon AppFlow deactivates it.
       */
      public fun flowErrorDeactivationThreshold(flowErrorDeactivationThreshold: Number)

      /**
       * @param scheduleEndTime The time at which the scheduled flow ends.
       * The time is formatted as a timestamp that follows the ISO 8601 standard, such as
       * `2022-04-27T13:00:00-07:00` .
       */
      public fun scheduleEndTime(scheduleEndTime: Number)

      /**
       * @param scheduleExpression The scheduling expression that determines the rate at which the
       * schedule will run, for example `rate(5minutes)` . 
       */
      public fun scheduleExpression(scheduleExpression: String)

      /**
       * @param scheduleOffset Specifies the optional offset that is added to the time interval for
       * a schedule-triggered flow.
       */
      public fun scheduleOffset(scheduleOffset: Number)

      /**
       * @param scheduleStartTime The time at which the scheduled flow starts.
       * The time is formatted as a timestamp that follows the ISO 8601 standard, such as
       * `2022-04-26T13:00:00-07:00` .
       */
      public fun scheduleStartTime(scheduleStartTime: Number)

      /**
       * @param timeZone Specifies the time zone used when referring to the dates and times of a
       * scheduled flow, such as `America/New_York` .
       * This time zone is only a descriptive label. It doesn't affect how Amazon AppFlow interprets
       * the timestamps that you specify to schedule the flow.
       *
       * If you want to schedule a flow by using times in a particular time zone, indicate the time
       * zone as a UTC offset in your timestamps. For example, the UTC offsets for the
       * `America/New_York` timezone are `-04:00` EDT and `-05:00 EST` .
       */
      public fun timeZone(timeZone: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.ScheduledTriggerPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnFlow.ScheduledTriggerPropertiesProperty.builder()

      /**
       * @param dataPullMode Specifies whether a scheduled flow has an incremental data transfer or
       * a complete data transfer for each flow run.
       */
      override fun dataPullMode(dataPullMode: String) {
        cdkBuilder.dataPullMode(dataPullMode)
      }

      /**
       * @param firstExecutionFrom Specifies the date range for the records to import from the
       * connector in the first flow run.
       */
      override fun firstExecutionFrom(firstExecutionFrom: Number) {
        cdkBuilder.firstExecutionFrom(firstExecutionFrom)
      }

      /**
       * @param flowErrorDeactivationThreshold Defines how many times a scheduled flow fails
       * consecutively before Amazon AppFlow deactivates it.
       */
      override fun flowErrorDeactivationThreshold(flowErrorDeactivationThreshold: Number) {
        cdkBuilder.flowErrorDeactivationThreshold(flowErrorDeactivationThreshold)
      }

      /**
       * @param scheduleEndTime The time at which the scheduled flow ends.
       * The time is formatted as a timestamp that follows the ISO 8601 standard, such as
       * `2022-04-27T13:00:00-07:00` .
       */
      override fun scheduleEndTime(scheduleEndTime: Number) {
        cdkBuilder.scheduleEndTime(scheduleEndTime)
      }

      /**
       * @param scheduleExpression The scheduling expression that determines the rate at which the
       * schedule will run, for example `rate(5minutes)` . 
       */
      override fun scheduleExpression(scheduleExpression: String) {
        cdkBuilder.scheduleExpression(scheduleExpression)
      }

      /**
       * @param scheduleOffset Specifies the optional offset that is added to the time interval for
       * a schedule-triggered flow.
       */
      override fun scheduleOffset(scheduleOffset: Number) {
        cdkBuilder.scheduleOffset(scheduleOffset)
      }

      /**
       * @param scheduleStartTime The time at which the scheduled flow starts.
       * The time is formatted as a timestamp that follows the ISO 8601 standard, such as
       * `2022-04-26T13:00:00-07:00` .
       */
      override fun scheduleStartTime(scheduleStartTime: Number) {
        cdkBuilder.scheduleStartTime(scheduleStartTime)
      }

      /**
       * @param timeZone Specifies the time zone used when referring to the dates and times of a
       * scheduled flow, such as `America/New_York` .
       * This time zone is only a descriptive label. It doesn't affect how Amazon AppFlow interprets
       * the timestamps that you specify to schedule the flow.
       *
       * If you want to schedule a flow by using times in a particular time zone, indicate the time
       * zone as a UTC offset in your timestamps. For example, the UTC offsets for the
       * `America/New_York` timezone are `-04:00` EDT and `-05:00 EST` .
       */
      override fun timeZone(timeZone: String) {
        cdkBuilder.timeZone(timeZone)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.ScheduledTriggerPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.ScheduledTriggerPropertiesProperty,
    ) : CdkObject(cdkObject), ScheduledTriggerPropertiesProperty {
      /**
       * Specifies whether a scheduled flow has an incremental data transfer or a complete data
       * transfer for each flow run.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-scheduledtriggerproperties.html#cfn-appflow-flow-scheduledtriggerproperties-datapullmode)
       */
      override fun dataPullMode(): String? = unwrap(this).getDataPullMode()

      /**
       * Specifies the date range for the records to import from the connector in the first flow
       * run.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-scheduledtriggerproperties.html#cfn-appflow-flow-scheduledtriggerproperties-firstexecutionfrom)
       */
      override fun firstExecutionFrom(): Number? = unwrap(this).getFirstExecutionFrom()

      /**
       * Defines how many times a scheduled flow fails consecutively before Amazon AppFlow
       * deactivates it.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-scheduledtriggerproperties.html#cfn-appflow-flow-scheduledtriggerproperties-flowerrordeactivationthreshold)
       */
      override fun flowErrorDeactivationThreshold(): Number? =
          unwrap(this).getFlowErrorDeactivationThreshold()

      /**
       * The time at which the scheduled flow ends.
       *
       * The time is formatted as a timestamp that follows the ISO 8601 standard, such as
       * `2022-04-27T13:00:00-07:00` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-scheduledtriggerproperties.html#cfn-appflow-flow-scheduledtriggerproperties-scheduleendtime)
       */
      override fun scheduleEndTime(): Number? = unwrap(this).getScheduleEndTime()

      /**
       * The scheduling expression that determines the rate at which the schedule will run, for
       * example `rate(5minutes)` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-scheduledtriggerproperties.html#cfn-appflow-flow-scheduledtriggerproperties-scheduleexpression)
       */
      override fun scheduleExpression(): String = unwrap(this).getScheduleExpression()

      /**
       * Specifies the optional offset that is added to the time interval for a schedule-triggered
       * flow.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-scheduledtriggerproperties.html#cfn-appflow-flow-scheduledtriggerproperties-scheduleoffset)
       */
      override fun scheduleOffset(): Number? = unwrap(this).getScheduleOffset()

      /**
       * The time at which the scheduled flow starts.
       *
       * The time is formatted as a timestamp that follows the ISO 8601 standard, such as
       * `2022-04-26T13:00:00-07:00` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-scheduledtriggerproperties.html#cfn-appflow-flow-scheduledtriggerproperties-schedulestarttime)
       */
      override fun scheduleStartTime(): Number? = unwrap(this).getScheduleStartTime()

      /**
       * Specifies the time zone used when referring to the dates and times of a scheduled flow,
       * such as `America/New_York` .
       *
       * This time zone is only a descriptive label. It doesn't affect how Amazon AppFlow interprets
       * the timestamps that you specify to schedule the flow.
       *
       * If you want to schedule a flow by using times in a particular time zone, indicate the time
       * zone as a UTC offset in your timestamps. For example, the UTC offsets for the
       * `America/New_York` timezone are `-04:00` EDT and `-05:00 EST` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-scheduledtriggerproperties.html#cfn-appflow-flow-scheduledtriggerproperties-timezone)
       */
      override fun timeZone(): String? = unwrap(this).getTimeZone()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ScheduledTriggerPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.ScheduledTriggerPropertiesProperty):
          ScheduledTriggerPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScheduledTriggerPropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.ScheduledTriggerPropertiesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnFlow.ScheduledTriggerPropertiesProperty
    }
  }

  /**
   * The properties that are applied when Salesforce Pardot is being used as a source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appflow.*;
   * PardotSourcePropertiesProperty pardotSourcePropertiesProperty =
   * PardotSourcePropertiesProperty.builder()
   * .object("object")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-pardotsourceproperties.html)
   */
  public interface PardotSourcePropertiesProperty {
    /**
     * The object specified in the Salesforce Pardot flow source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-pardotsourceproperties.html#cfn-appflow-flow-pardotsourceproperties-object)
     */
    public fun `object`(): String

    /**
     * A builder for [PardotSourcePropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param object The object specified in the Salesforce Pardot flow source. 
       */
      public fun `object`(`object`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.PardotSourcePropertiesProperty.Builder =
          software.amazon.awscdk.services.appflow.CfnFlow.PardotSourcePropertiesProperty.builder()

      /**
       * @param object The object specified in the Salesforce Pardot flow source. 
       */
      override fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.PardotSourcePropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.PardotSourcePropertiesProperty,
    ) : CdkObject(cdkObject), PardotSourcePropertiesProperty {
      /**
       * The object specified in the Salesforce Pardot flow source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-pardotsourceproperties.html#cfn-appflow-flow-pardotsourceproperties-object)
       */
      override fun `object`(): String = unwrap(this).getObject()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PardotSourcePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.PardotSourcePropertiesProperty):
          PardotSourcePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PardotSourcePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.PardotSourcePropertiesProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnFlow.PardotSourcePropertiesProperty
    }
  }

  /**
   * The properties that are applied when Amazon Redshift is being used as a destination.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appflow.*;
   * RedshiftDestinationPropertiesProperty redshiftDestinationPropertiesProperty =
   * RedshiftDestinationPropertiesProperty.builder()
   * .intermediateBucketName("intermediateBucketName")
   * .object("object")
   * // the properties below are optional
   * .bucketPrefix("bucketPrefix")
   * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * .failOnFirstError(false)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-redshiftdestinationproperties.html)
   */
  public interface RedshiftDestinationPropertiesProperty {
    /**
     * The object key for the bucket in which Amazon AppFlow places the destination files.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-redshiftdestinationproperties.html#cfn-appflow-flow-redshiftdestinationproperties-bucketprefix)
     */
    public fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

    /**
     * The settings that determine how Amazon AppFlow handles an error when placing data in the
     * Amazon Redshift destination.
     *
     * For example, this setting would determine if the flow should fail after one insertion error,
     * or continue and attempt to insert every record regardless of the initial failure.
     * `ErrorHandlingConfig` is a part of the destination connector details.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-redshiftdestinationproperties.html#cfn-appflow-flow-redshiftdestinationproperties-errorhandlingconfig)
     */
    public fun errorHandlingConfig(): Any? = unwrap(this).getErrorHandlingConfig()

    /**
     * The intermediate bucket that Amazon AppFlow uses when moving data into Amazon Redshift.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-redshiftdestinationproperties.html#cfn-appflow-flow-redshiftdestinationproperties-intermediatebucketname)
     */
    public fun intermediateBucketName(): String

    /**
     * The object specified in the Amazon Redshift flow destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-redshiftdestinationproperties.html#cfn-appflow-flow-redshiftdestinationproperties-object)
     */
    public fun `object`(): String

    /**
     * A builder for [RedshiftDestinationPropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucketPrefix The object key for the bucket in which Amazon AppFlow places the
       * destination files.
       */
      public fun bucketPrefix(bucketPrefix: String)

      /**
       * @param errorHandlingConfig The settings that determine how Amazon AppFlow handles an error
       * when placing data in the Amazon Redshift destination.
       * For example, this setting would determine if the flow should fail after one insertion
       * error, or continue and attempt to insert every record regardless of the initial failure.
       * `ErrorHandlingConfig` is a part of the destination connector details.
       */
      public fun errorHandlingConfig(errorHandlingConfig: IResolvable)

      /**
       * @param errorHandlingConfig The settings that determine how Amazon AppFlow handles an error
       * when placing data in the Amazon Redshift destination.
       * For example, this setting would determine if the flow should fail after one insertion
       * error, or continue and attempt to insert every record regardless of the initial failure.
       * `ErrorHandlingConfig` is a part of the destination connector details.
       */
      public fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty)

      /**
       * @param errorHandlingConfig The settings that determine how Amazon AppFlow handles an error
       * when placing data in the Amazon Redshift destination.
       * For example, this setting would determine if the flow should fail after one insertion
       * error, or continue and attempt to insert every record regardless of the initial failure.
       * `ErrorHandlingConfig` is a part of the destination connector details.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("69c476c8ac7606907a7e8c037410c0a13397d78d8bce9464038e21cadffab4aa")
      public
          fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty.Builder.() -> Unit)

      /**
       * @param intermediateBucketName The intermediate bucket that Amazon AppFlow uses when moving
       * data into Amazon Redshift. 
       */
      public fun intermediateBucketName(intermediateBucketName: String)

      /**
       * @param object The object specified in the Amazon Redshift flow destination. 
       */
      public fun `object`(`object`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.RedshiftDestinationPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnFlow.RedshiftDestinationPropertiesProperty.builder()

      /**
       * @param bucketPrefix The object key for the bucket in which Amazon AppFlow places the
       * destination files.
       */
      override fun bucketPrefix(bucketPrefix: String) {
        cdkBuilder.bucketPrefix(bucketPrefix)
      }

      /**
       * @param errorHandlingConfig The settings that determine how Amazon AppFlow handles an error
       * when placing data in the Amazon Redshift destination.
       * For example, this setting would determine if the flow should fail after one insertion
       * error, or continue and attempt to insert every record regardless of the initial failure.
       * `ErrorHandlingConfig` is a part of the destination connector details.
       */
      override fun errorHandlingConfig(errorHandlingConfig: IResolvable) {
        cdkBuilder.errorHandlingConfig(errorHandlingConfig.let(IResolvable::unwrap))
      }

      /**
       * @param errorHandlingConfig The settings that determine how Amazon AppFlow handles an error
       * when placing data in the Amazon Redshift destination.
       * For example, this setting would determine if the flow should fail after one insertion
       * error, or continue and attempt to insert every record regardless of the initial failure.
       * `ErrorHandlingConfig` is a part of the destination connector details.
       */
      override fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty) {
        cdkBuilder.errorHandlingConfig(errorHandlingConfig.let(ErrorHandlingConfigProperty::unwrap))
      }

      /**
       * @param errorHandlingConfig The settings that determine how Amazon AppFlow handles an error
       * when placing data in the Amazon Redshift destination.
       * For example, this setting would determine if the flow should fail after one insertion
       * error, or continue and attempt to insert every record regardless of the initial failure.
       * `ErrorHandlingConfig` is a part of the destination connector details.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("69c476c8ac7606907a7e8c037410c0a13397d78d8bce9464038e21cadffab4aa")
      override
          fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty.Builder.() -> Unit):
          Unit = errorHandlingConfig(ErrorHandlingConfigProperty(errorHandlingConfig))

      /**
       * @param intermediateBucketName The intermediate bucket that Amazon AppFlow uses when moving
       * data into Amazon Redshift. 
       */
      override fun intermediateBucketName(intermediateBucketName: String) {
        cdkBuilder.intermediateBucketName(intermediateBucketName)
      }

      /**
       * @param object The object specified in the Amazon Redshift flow destination. 
       */
      override fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.RedshiftDestinationPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.RedshiftDestinationPropertiesProperty,
    ) : CdkObject(cdkObject), RedshiftDestinationPropertiesProperty {
      /**
       * The object key for the bucket in which Amazon AppFlow places the destination files.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-redshiftdestinationproperties.html#cfn-appflow-flow-redshiftdestinationproperties-bucketprefix)
       */
      override fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

      /**
       * The settings that determine how Amazon AppFlow handles an error when placing data in the
       * Amazon Redshift destination.
       *
       * For example, this setting would determine if the flow should fail after one insertion
       * error, or continue and attempt to insert every record regardless of the initial failure.
       * `ErrorHandlingConfig` is a part of the destination connector details.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-redshiftdestinationproperties.html#cfn-appflow-flow-redshiftdestinationproperties-errorhandlingconfig)
       */
      override fun errorHandlingConfig(): Any? = unwrap(this).getErrorHandlingConfig()

      /**
       * The intermediate bucket that Amazon AppFlow uses when moving data into Amazon Redshift.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-redshiftdestinationproperties.html#cfn-appflow-flow-redshiftdestinationproperties-intermediatebucketname)
       */
      override fun intermediateBucketName(): String = unwrap(this).getIntermediateBucketName()

      /**
       * The object specified in the Amazon Redshift flow destination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-redshiftdestinationproperties.html#cfn-appflow-flow-redshiftdestinationproperties-object)
       */
      override fun `object`(): String = unwrap(this).getObject()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          RedshiftDestinationPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.RedshiftDestinationPropertiesProperty):
          RedshiftDestinationPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RedshiftDestinationPropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.RedshiftDestinationPropertiesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnFlow.RedshiftDestinationPropertiesProperty
    }
  }

  /**
   * The API of the connector application that Amazon AppFlow uses to transfer your data.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appflow.*;
   * DataTransferApiProperty dataTransferApiProperty = DataTransferApiProperty.builder()
   * .name("name")
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-datatransferapi.html)
   */
  public interface DataTransferApiProperty {
    /**
     * The name of the connector application API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-datatransferapi.html#cfn-appflow-flow-datatransferapi-name)
     */
    public fun name(): String

    /**
     * You can specify one of the following types:.
     *
     * * **AUTOMATIC** - The default. Optimizes a flow for datasets that fluctuate in size from
     * small to large. For each flow run, Amazon AppFlow chooses to use the SYNC or ASYNC API type
     * based on the amount of data that the run transfers.
     * * **SYNC** - A synchronous API. This type of API optimizes a flow for small to medium-sized
     * datasets.
     * * **ASYNC** - An asynchronous API. This type of API optimizes a flow for large datasets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-datatransferapi.html#cfn-appflow-flow-datatransferapi-type)
     */
    public fun type(): String

    /**
     * A builder for [DataTransferApiProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the connector application API. 
       */
      public fun name(name: String)

      /**
       * @param type You can specify one of the following types:. 
       * * **AUTOMATIC** - The default. Optimizes a flow for datasets that fluctuate in size from
       * small to large. For each flow run, Amazon AppFlow chooses to use the SYNC or ASYNC API type
       * based on the amount of data that the run transfers.
       * * **SYNC** - A synchronous API. This type of API optimizes a flow for small to medium-sized
       * datasets.
       * * **ASYNC** - An asynchronous API. This type of API optimizes a flow for large datasets.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.DataTransferApiProperty.Builder =
          software.amazon.awscdk.services.appflow.CfnFlow.DataTransferApiProperty.builder()

      /**
       * @param name The name of the connector application API. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param type You can specify one of the following types:. 
       * * **AUTOMATIC** - The default. Optimizes a flow for datasets that fluctuate in size from
       * small to large. For each flow run, Amazon AppFlow chooses to use the SYNC or ASYNC API type
       * based on the amount of data that the run transfers.
       * * **SYNC** - A synchronous API. This type of API optimizes a flow for small to medium-sized
       * datasets.
       * * **ASYNC** - An asynchronous API. This type of API optimizes a flow for large datasets.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.appflow.CfnFlow.DataTransferApiProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.DataTransferApiProperty,
    ) : CdkObject(cdkObject), DataTransferApiProperty {
      /**
       * The name of the connector application API.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-datatransferapi.html#cfn-appflow-flow-datatransferapi-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * You can specify one of the following types:.
       *
       * * **AUTOMATIC** - The default. Optimizes a flow for datasets that fluctuate in size from
       * small to large. For each flow run, Amazon AppFlow chooses to use the SYNC or ASYNC API type
       * based on the amount of data that the run transfers.
       * * **SYNC** - A synchronous API. This type of API optimizes a flow for small to medium-sized
       * datasets.
       * * **ASYNC** - An asynchronous API. This type of API optimizes a flow for large datasets.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-datatransferapi.html#cfn-appflow-flow-datatransferapi-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DataTransferApiProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.DataTransferApiProperty):
          DataTransferApiProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataTransferApiProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.DataTransferApiProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnFlow.DataTransferApiProperty
    }
  }

  /**
   * The aggregation settings that you can use to customize the output format of your flow data.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appflow.*;
   * AggregationConfigProperty aggregationConfigProperty = AggregationConfigProperty.builder()
   * .aggregationType("aggregationType")
   * .targetFileSize(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-aggregationconfig.html)
   */
  public interface AggregationConfigProperty {
    /**
     * Specifies whether Amazon AppFlow aggregates the flow records into a single file, or leave
     * them unaggregated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-aggregationconfig.html#cfn-appflow-flow-aggregationconfig-aggregationtype)
     */
    public fun aggregationType(): String? = unwrap(this).getAggregationType()

    /**
     * The desired file size, in MB, for each output file that Amazon AppFlow writes to the flow
     * destination.
     *
     * For each file, Amazon AppFlow attempts to achieve the size that you specify. The actual file
     * sizes might differ from this target based on the number and size of the records that each file
     * contains.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-aggregationconfig.html#cfn-appflow-flow-aggregationconfig-targetfilesize)
     */
    public fun targetFileSize(): Number? = unwrap(this).getTargetFileSize()

    /**
     * A builder for [AggregationConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param aggregationType Specifies whether Amazon AppFlow aggregates the flow records into a
       * single file, or leave them unaggregated.
       */
      public fun aggregationType(aggregationType: String)

      /**
       * @param targetFileSize The desired file size, in MB, for each output file that Amazon
       * AppFlow writes to the flow destination.
       * For each file, Amazon AppFlow attempts to achieve the size that you specify. The actual
       * file sizes might differ from this target based on the number and size of the records that each
       * file contains.
       */
      public fun targetFileSize(targetFileSize: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.AggregationConfigProperty.Builder =
          software.amazon.awscdk.services.appflow.CfnFlow.AggregationConfigProperty.builder()

      /**
       * @param aggregationType Specifies whether Amazon AppFlow aggregates the flow records into a
       * single file, or leave them unaggregated.
       */
      override fun aggregationType(aggregationType: String) {
        cdkBuilder.aggregationType(aggregationType)
      }

      /**
       * @param targetFileSize The desired file size, in MB, for each output file that Amazon
       * AppFlow writes to the flow destination.
       * For each file, Amazon AppFlow attempts to achieve the size that you specify. The actual
       * file sizes might differ from this target based on the number and size of the records that each
       * file contains.
       */
      override fun targetFileSize(targetFileSize: Number) {
        cdkBuilder.targetFileSize(targetFileSize)
      }

      public fun build(): software.amazon.awscdk.services.appflow.CfnFlow.AggregationConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.AggregationConfigProperty,
    ) : CdkObject(cdkObject), AggregationConfigProperty {
      /**
       * Specifies whether Amazon AppFlow aggregates the flow records into a single file, or leave
       * them unaggregated.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-aggregationconfig.html#cfn-appflow-flow-aggregationconfig-aggregationtype)
       */
      override fun aggregationType(): String? = unwrap(this).getAggregationType()

      /**
       * The desired file size, in MB, for each output file that Amazon AppFlow writes to the flow
       * destination.
       *
       * For each file, Amazon AppFlow attempts to achieve the size that you specify. The actual
       * file sizes might differ from this target based on the number and size of the records that each
       * file contains.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-aggregationconfig.html#cfn-appflow-flow-aggregationconfig-targetfilesize)
       */
      override fun targetFileSize(): Number? = unwrap(this).getTargetFileSize()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AggregationConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.AggregationConfigProperty):
          AggregationConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AggregationConfigProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.AggregationConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnFlow.AggregationConfigProperty
    }
  }

  /**
   * This stores the information that is required to query a particular connector.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appflow.*;
   * DestinationConnectorPropertiesProperty destinationConnectorPropertiesProperty =
   * DestinationConnectorPropertiesProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-destinationconnectorproperties.html)
   */
  public interface DestinationConnectorPropertiesProperty {
    /**
     * The properties that are required to query the custom Connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-destinationconnectorproperties.html#cfn-appflow-flow-destinationconnectorproperties-customconnector)
     */
    public fun customConnector(): Any? = unwrap(this).getCustomConnector()

    /**
     * The properties required to query Amazon EventBridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-destinationconnectorproperties.html#cfn-appflow-flow-destinationconnectorproperties-eventbridge)
     */
    public fun eventBridge(): Any? = unwrap(this).getEventBridge()

    /**
     * The properties required to query Amazon Lookout for Metrics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-destinationconnectorproperties.html#cfn-appflow-flow-destinationconnectorproperties-lookoutmetrics)
     */
    public fun lookoutMetrics(): Any? = unwrap(this).getLookoutMetrics()

    /**
     * The properties required to query Marketo.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-destinationconnectorproperties.html#cfn-appflow-flow-destinationconnectorproperties-marketo)
     */
    public fun marketo(): Any? = unwrap(this).getMarketo()

    /**
     * The properties required to query Amazon Redshift.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-destinationconnectorproperties.html#cfn-appflow-flow-destinationconnectorproperties-redshift)
     */
    public fun redshift(): Any? = unwrap(this).getRedshift()

    /**
     * The properties required to query Amazon S3.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-destinationconnectorproperties.html#cfn-appflow-flow-destinationconnectorproperties-s3)
     */
    public fun s3(): Any? = unwrap(this).getS3()

    /**
     * The properties required to query Salesforce.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-destinationconnectorproperties.html#cfn-appflow-flow-destinationconnectorproperties-salesforce)
     */
    public fun salesforce(): Any? = unwrap(this).getSalesforce()

    /**
     * The properties required to query SAPOData.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-destinationconnectorproperties.html#cfn-appflow-flow-destinationconnectorproperties-sapodata)
     */
    public fun sapoData(): Any? = unwrap(this).getSapoData()

    /**
     * The properties required to query Snowflake.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-destinationconnectorproperties.html#cfn-appflow-flow-destinationconnectorproperties-snowflake)
     */
    public fun snowflake(): Any? = unwrap(this).getSnowflake()

    /**
     * The properties required to query Upsolver.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-destinationconnectorproperties.html#cfn-appflow-flow-destinationconnectorproperties-upsolver)
     */
    public fun upsolver(): Any? = unwrap(this).getUpsolver()

    /**
     * The properties required to query Zendesk.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-destinationconnectorproperties.html#cfn-appflow-flow-destinationconnectorproperties-zendesk)
     */
    public fun zendesk(): Any? = unwrap(this).getZendesk()

    /**
     * A builder for [DestinationConnectorPropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param customConnector The properties that are required to query the custom Connector.
       */
      public fun customConnector(customConnector: IResolvable)

      /**
       * @param customConnector The properties that are required to query the custom Connector.
       */
      public fun customConnector(customConnector: CustomConnectorDestinationPropertiesProperty)

      /**
       * @param customConnector The properties that are required to query the custom Connector.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c9d8312d795c92509bd1aa700111bbbeeb817244ec892c1d02ed54ea1abfb5d1")
      public
          fun customConnector(customConnector: CustomConnectorDestinationPropertiesProperty.Builder.() -> Unit)

      /**
       * @param eventBridge The properties required to query Amazon EventBridge.
       */
      public fun eventBridge(eventBridge: IResolvable)

      /**
       * @param eventBridge The properties required to query Amazon EventBridge.
       */
      public fun eventBridge(eventBridge: EventBridgeDestinationPropertiesProperty)

      /**
       * @param eventBridge The properties required to query Amazon EventBridge.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b34e938e94893dfb40c4c1efd0446115a8a121034e79d9f7a9d2a16122bd7fe5")
      public
          fun eventBridge(eventBridge: EventBridgeDestinationPropertiesProperty.Builder.() -> Unit)

      /**
       * @param lookoutMetrics The properties required to query Amazon Lookout for Metrics.
       */
      public fun lookoutMetrics(lookoutMetrics: IResolvable)

      /**
       * @param lookoutMetrics The properties required to query Amazon Lookout for Metrics.
       */
      public fun lookoutMetrics(lookoutMetrics: LookoutMetricsDestinationPropertiesProperty)

      /**
       * @param lookoutMetrics The properties required to query Amazon Lookout for Metrics.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("232479932c4bd48b25f9e02510c369f574ed498e3257e8d35de6675d5b72c546")
      public
          fun lookoutMetrics(lookoutMetrics: LookoutMetricsDestinationPropertiesProperty.Builder.() -> Unit)

      /**
       * @param marketo The properties required to query Marketo.
       */
      public fun marketo(marketo: IResolvable)

      /**
       * @param marketo The properties required to query Marketo.
       */
      public fun marketo(marketo: MarketoDestinationPropertiesProperty)

      /**
       * @param marketo The properties required to query Marketo.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ddb7f960e42c6343202933471ed9ab5339c32b041122e0dfbc29fe225a7e6749")
      public fun marketo(marketo: MarketoDestinationPropertiesProperty.Builder.() -> Unit)

      /**
       * @param redshift The properties required to query Amazon Redshift.
       */
      public fun redshift(redshift: IResolvable)

      /**
       * @param redshift The properties required to query Amazon Redshift.
       */
      public fun redshift(redshift: RedshiftDestinationPropertiesProperty)

      /**
       * @param redshift The properties required to query Amazon Redshift.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("33d66fe5ccb9f40788193c3a72e5c940bb03a9acb942bd6be1b0d2bcc2441cff")
      public fun redshift(redshift: RedshiftDestinationPropertiesProperty.Builder.() -> Unit)

      /**
       * @param s3 The properties required to query Amazon S3.
       */
      public fun s3(s3: IResolvable)

      /**
       * @param s3 The properties required to query Amazon S3.
       */
      public fun s3(s3: S3DestinationPropertiesProperty)

      /**
       * @param s3 The properties required to query Amazon S3.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9d3461c5843a7280522435f9b17300a23f84c436a8d1455b25515501481d7477")
      public fun s3(s3: S3DestinationPropertiesProperty.Builder.() -> Unit)

      /**
       * @param salesforce The properties required to query Salesforce.
       */
      public fun salesforce(salesforce: IResolvable)

      /**
       * @param salesforce The properties required to query Salesforce.
       */
      public fun salesforce(salesforce: SalesforceDestinationPropertiesProperty)

      /**
       * @param salesforce The properties required to query Salesforce.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1efffefbef04c5cbf8b7d5443f2372bbec023053961bc222210a30364e79b376")
      public fun salesforce(salesforce: SalesforceDestinationPropertiesProperty.Builder.() -> Unit)

      /**
       * @param sapoData The properties required to query SAPOData.
       */
      public fun sapoData(sapoData: IResolvable)

      /**
       * @param sapoData The properties required to query SAPOData.
       */
      public fun sapoData(sapoData: SAPODataDestinationPropertiesProperty)

      /**
       * @param sapoData The properties required to query SAPOData.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("de7b5f9dbccba5f14b09ab028d85497fcd4ecf9714f59b00b55f144158a3b128")
      public fun sapoData(sapoData: SAPODataDestinationPropertiesProperty.Builder.() -> Unit)

      /**
       * @param snowflake The properties required to query Snowflake.
       */
      public fun snowflake(snowflake: IResolvable)

      /**
       * @param snowflake The properties required to query Snowflake.
       */
      public fun snowflake(snowflake: SnowflakeDestinationPropertiesProperty)

      /**
       * @param snowflake The properties required to query Snowflake.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3f42c1df62dbcd8eb347b0039213a7db9f4d264e01510c15ed58b993e90b2687")
      public fun snowflake(snowflake: SnowflakeDestinationPropertiesProperty.Builder.() -> Unit)

      /**
       * @param upsolver The properties required to query Upsolver.
       */
      public fun upsolver(upsolver: IResolvable)

      /**
       * @param upsolver The properties required to query Upsolver.
       */
      public fun upsolver(upsolver: UpsolverDestinationPropertiesProperty)

      /**
       * @param upsolver The properties required to query Upsolver.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fcca6f0fd0c4540433e2a7534845fc07f1c5285b6dcc8c3082832b40867bc5f2")
      public fun upsolver(upsolver: UpsolverDestinationPropertiesProperty.Builder.() -> Unit)

      /**
       * @param zendesk The properties required to query Zendesk.
       */
      public fun zendesk(zendesk: IResolvable)

      /**
       * @param zendesk The properties required to query Zendesk.
       */
      public fun zendesk(zendesk: ZendeskDestinationPropertiesProperty)

      /**
       * @param zendesk The properties required to query Zendesk.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("61a864d1bce6c80745238d1669d34ee7acc33e4e2e833641ee44aed229a9d6fd")
      public fun zendesk(zendesk: ZendeskDestinationPropertiesProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.DestinationConnectorPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnFlow.DestinationConnectorPropertiesProperty.builder()

      /**
       * @param customConnector The properties that are required to query the custom Connector.
       */
      override fun customConnector(customConnector: IResolvable) {
        cdkBuilder.customConnector(customConnector.let(IResolvable::unwrap))
      }

      /**
       * @param customConnector The properties that are required to query the custom Connector.
       */
      override fun customConnector(customConnector: CustomConnectorDestinationPropertiesProperty) {
        cdkBuilder.customConnector(customConnector.let(CustomConnectorDestinationPropertiesProperty::unwrap))
      }

      /**
       * @param customConnector The properties that are required to query the custom Connector.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c9d8312d795c92509bd1aa700111bbbeeb817244ec892c1d02ed54ea1abfb5d1")
      override
          fun customConnector(customConnector: CustomConnectorDestinationPropertiesProperty.Builder.() -> Unit):
          Unit = customConnector(CustomConnectorDestinationPropertiesProperty(customConnector))

      /**
       * @param eventBridge The properties required to query Amazon EventBridge.
       */
      override fun eventBridge(eventBridge: IResolvable) {
        cdkBuilder.eventBridge(eventBridge.let(IResolvable::unwrap))
      }

      /**
       * @param eventBridge The properties required to query Amazon EventBridge.
       */
      override fun eventBridge(eventBridge: EventBridgeDestinationPropertiesProperty) {
        cdkBuilder.eventBridge(eventBridge.let(EventBridgeDestinationPropertiesProperty::unwrap))
      }

      /**
       * @param eventBridge The properties required to query Amazon EventBridge.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b34e938e94893dfb40c4c1efd0446115a8a121034e79d9f7a9d2a16122bd7fe5")
      override
          fun eventBridge(eventBridge: EventBridgeDestinationPropertiesProperty.Builder.() -> Unit):
          Unit = eventBridge(EventBridgeDestinationPropertiesProperty(eventBridge))

      /**
       * @param lookoutMetrics The properties required to query Amazon Lookout for Metrics.
       */
      override fun lookoutMetrics(lookoutMetrics: IResolvable) {
        cdkBuilder.lookoutMetrics(lookoutMetrics.let(IResolvable::unwrap))
      }

      /**
       * @param lookoutMetrics The properties required to query Amazon Lookout for Metrics.
       */
      override fun lookoutMetrics(lookoutMetrics: LookoutMetricsDestinationPropertiesProperty) {
        cdkBuilder.lookoutMetrics(lookoutMetrics.let(LookoutMetricsDestinationPropertiesProperty::unwrap))
      }

      /**
       * @param lookoutMetrics The properties required to query Amazon Lookout for Metrics.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("232479932c4bd48b25f9e02510c369f574ed498e3257e8d35de6675d5b72c546")
      override
          fun lookoutMetrics(lookoutMetrics: LookoutMetricsDestinationPropertiesProperty.Builder.() -> Unit):
          Unit = lookoutMetrics(LookoutMetricsDestinationPropertiesProperty(lookoutMetrics))

      /**
       * @param marketo The properties required to query Marketo.
       */
      override fun marketo(marketo: IResolvable) {
        cdkBuilder.marketo(marketo.let(IResolvable::unwrap))
      }

      /**
       * @param marketo The properties required to query Marketo.
       */
      override fun marketo(marketo: MarketoDestinationPropertiesProperty) {
        cdkBuilder.marketo(marketo.let(MarketoDestinationPropertiesProperty::unwrap))
      }

      /**
       * @param marketo The properties required to query Marketo.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ddb7f960e42c6343202933471ed9ab5339c32b041122e0dfbc29fe225a7e6749")
      override fun marketo(marketo: MarketoDestinationPropertiesProperty.Builder.() -> Unit): Unit =
          marketo(MarketoDestinationPropertiesProperty(marketo))

      /**
       * @param redshift The properties required to query Amazon Redshift.
       */
      override fun redshift(redshift: IResolvable) {
        cdkBuilder.redshift(redshift.let(IResolvable::unwrap))
      }

      /**
       * @param redshift The properties required to query Amazon Redshift.
       */
      override fun redshift(redshift: RedshiftDestinationPropertiesProperty) {
        cdkBuilder.redshift(redshift.let(RedshiftDestinationPropertiesProperty::unwrap))
      }

      /**
       * @param redshift The properties required to query Amazon Redshift.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("33d66fe5ccb9f40788193c3a72e5c940bb03a9acb942bd6be1b0d2bcc2441cff")
      override fun redshift(redshift: RedshiftDestinationPropertiesProperty.Builder.() -> Unit):
          Unit = redshift(RedshiftDestinationPropertiesProperty(redshift))

      /**
       * @param s3 The properties required to query Amazon S3.
       */
      override fun s3(s3: IResolvable) {
        cdkBuilder.s3(s3.let(IResolvable::unwrap))
      }

      /**
       * @param s3 The properties required to query Amazon S3.
       */
      override fun s3(s3: S3DestinationPropertiesProperty) {
        cdkBuilder.s3(s3.let(S3DestinationPropertiesProperty::unwrap))
      }

      /**
       * @param s3 The properties required to query Amazon S3.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9d3461c5843a7280522435f9b17300a23f84c436a8d1455b25515501481d7477")
      override fun s3(s3: S3DestinationPropertiesProperty.Builder.() -> Unit): Unit =
          s3(S3DestinationPropertiesProperty(s3))

      /**
       * @param salesforce The properties required to query Salesforce.
       */
      override fun salesforce(salesforce: IResolvable) {
        cdkBuilder.salesforce(salesforce.let(IResolvable::unwrap))
      }

      /**
       * @param salesforce The properties required to query Salesforce.
       */
      override fun salesforce(salesforce: SalesforceDestinationPropertiesProperty) {
        cdkBuilder.salesforce(salesforce.let(SalesforceDestinationPropertiesProperty::unwrap))
      }

      /**
       * @param salesforce The properties required to query Salesforce.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1efffefbef04c5cbf8b7d5443f2372bbec023053961bc222210a30364e79b376")
      override
          fun salesforce(salesforce: SalesforceDestinationPropertiesProperty.Builder.() -> Unit):
          Unit = salesforce(SalesforceDestinationPropertiesProperty(salesforce))

      /**
       * @param sapoData The properties required to query SAPOData.
       */
      override fun sapoData(sapoData: IResolvable) {
        cdkBuilder.sapoData(sapoData.let(IResolvable::unwrap))
      }

      /**
       * @param sapoData The properties required to query SAPOData.
       */
      override fun sapoData(sapoData: SAPODataDestinationPropertiesProperty) {
        cdkBuilder.sapoData(sapoData.let(SAPODataDestinationPropertiesProperty::unwrap))
      }

      /**
       * @param sapoData The properties required to query SAPOData.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("de7b5f9dbccba5f14b09ab028d85497fcd4ecf9714f59b00b55f144158a3b128")
      override fun sapoData(sapoData: SAPODataDestinationPropertiesProperty.Builder.() -> Unit):
          Unit = sapoData(SAPODataDestinationPropertiesProperty(sapoData))

      /**
       * @param snowflake The properties required to query Snowflake.
       */
      override fun snowflake(snowflake: IResolvable) {
        cdkBuilder.snowflake(snowflake.let(IResolvable::unwrap))
      }

      /**
       * @param snowflake The properties required to query Snowflake.
       */
      override fun snowflake(snowflake: SnowflakeDestinationPropertiesProperty) {
        cdkBuilder.snowflake(snowflake.let(SnowflakeDestinationPropertiesProperty::unwrap))
      }

      /**
       * @param snowflake The properties required to query Snowflake.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3f42c1df62dbcd8eb347b0039213a7db9f4d264e01510c15ed58b993e90b2687")
      override fun snowflake(snowflake: SnowflakeDestinationPropertiesProperty.Builder.() -> Unit):
          Unit = snowflake(SnowflakeDestinationPropertiesProperty(snowflake))

      /**
       * @param upsolver The properties required to query Upsolver.
       */
      override fun upsolver(upsolver: IResolvable) {
        cdkBuilder.upsolver(upsolver.let(IResolvable::unwrap))
      }

      /**
       * @param upsolver The properties required to query Upsolver.
       */
      override fun upsolver(upsolver: UpsolverDestinationPropertiesProperty) {
        cdkBuilder.upsolver(upsolver.let(UpsolverDestinationPropertiesProperty::unwrap))
      }

      /**
       * @param upsolver The properties required to query Upsolver.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fcca6f0fd0c4540433e2a7534845fc07f1c5285b6dcc8c3082832b40867bc5f2")
      override fun upsolver(upsolver: UpsolverDestinationPropertiesProperty.Builder.() -> Unit):
          Unit = upsolver(UpsolverDestinationPropertiesProperty(upsolver))

      /**
       * @param zendesk The properties required to query Zendesk.
       */
      override fun zendesk(zendesk: IResolvable) {
        cdkBuilder.zendesk(zendesk.let(IResolvable::unwrap))
      }

      /**
       * @param zendesk The properties required to query Zendesk.
       */
      override fun zendesk(zendesk: ZendeskDestinationPropertiesProperty) {
        cdkBuilder.zendesk(zendesk.let(ZendeskDestinationPropertiesProperty::unwrap))
      }

      /**
       * @param zendesk The properties required to query Zendesk.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("61a864d1bce6c80745238d1669d34ee7acc33e4e2e833641ee44aed229a9d6fd")
      override fun zendesk(zendesk: ZendeskDestinationPropertiesProperty.Builder.() -> Unit): Unit =
          zendesk(ZendeskDestinationPropertiesProperty(zendesk))

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.DestinationConnectorPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.DestinationConnectorPropertiesProperty,
    ) : CdkObject(cdkObject), DestinationConnectorPropertiesProperty {
      /**
       * The properties that are required to query the custom Connector.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-destinationconnectorproperties.html#cfn-appflow-flow-destinationconnectorproperties-customconnector)
       */
      override fun customConnector(): Any? = unwrap(this).getCustomConnector()

      /**
       * The properties required to query Amazon EventBridge.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-destinationconnectorproperties.html#cfn-appflow-flow-destinationconnectorproperties-eventbridge)
       */
      override fun eventBridge(): Any? = unwrap(this).getEventBridge()

      /**
       * The properties required to query Amazon Lookout for Metrics.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-destinationconnectorproperties.html#cfn-appflow-flow-destinationconnectorproperties-lookoutmetrics)
       */
      override fun lookoutMetrics(): Any? = unwrap(this).getLookoutMetrics()

      /**
       * The properties required to query Marketo.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-destinationconnectorproperties.html#cfn-appflow-flow-destinationconnectorproperties-marketo)
       */
      override fun marketo(): Any? = unwrap(this).getMarketo()

      /**
       * The properties required to query Amazon Redshift.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-destinationconnectorproperties.html#cfn-appflow-flow-destinationconnectorproperties-redshift)
       */
      override fun redshift(): Any? = unwrap(this).getRedshift()

      /**
       * The properties required to query Amazon S3.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-destinationconnectorproperties.html#cfn-appflow-flow-destinationconnectorproperties-s3)
       */
      override fun s3(): Any? = unwrap(this).getS3()

      /**
       * The properties required to query Salesforce.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-destinationconnectorproperties.html#cfn-appflow-flow-destinationconnectorproperties-salesforce)
       */
      override fun salesforce(): Any? = unwrap(this).getSalesforce()

      /**
       * The properties required to query SAPOData.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-destinationconnectorproperties.html#cfn-appflow-flow-destinationconnectorproperties-sapodata)
       */
      override fun sapoData(): Any? = unwrap(this).getSapoData()

      /**
       * The properties required to query Snowflake.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-destinationconnectorproperties.html#cfn-appflow-flow-destinationconnectorproperties-snowflake)
       */
      override fun snowflake(): Any? = unwrap(this).getSnowflake()

      /**
       * The properties required to query Upsolver.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-destinationconnectorproperties.html#cfn-appflow-flow-destinationconnectorproperties-upsolver)
       */
      override fun upsolver(): Any? = unwrap(this).getUpsolver()

      /**
       * The properties required to query Zendesk.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-destinationconnectorproperties.html#cfn-appflow-flow-destinationconnectorproperties-zendesk)
       */
      override fun zendesk(): Any? = unwrap(this).getZendesk()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DestinationConnectorPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.DestinationConnectorPropertiesProperty):
          DestinationConnectorPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DestinationConnectorPropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.DestinationConnectorPropertiesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnFlow.DestinationConnectorPropertiesProperty
    }
  }

  /**
   * The properties that are applied when Salesforce is being used as a destination.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appflow.*;
   * SalesforceDestinationPropertiesProperty salesforceDestinationPropertiesProperty =
   * SalesforceDestinationPropertiesProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-salesforcedestinationproperties.html)
   */
  public interface SalesforceDestinationPropertiesProperty {
    /**
     * Specifies which Salesforce API is used by Amazon AppFlow when your flow transfers data to
     * Salesforce.
     *
     * * **AUTOMATIC** - The default. Amazon AppFlow selects which API to use based on the number of
     * records that your flow transfers to Salesforce. If your flow transfers fewer than 1,000 records,
     * Amazon AppFlow uses Salesforce REST API. If your flow transfers 1,000 records or more, Amazon
     * AppFlow uses Salesforce Bulk API 2.0.
     *
     * Each of these Salesforce APIs structures data differently. If Amazon AppFlow selects the API
     * automatically, be aware that, for recurring flows, the data output might vary from one flow run
     * to the next. For example, if a flow runs daily, it might use REST API on one day to transfer 900
     * records, and it might use Bulk API 2.0 on the next day to transfer 1,100 records. For each of
     * these flow runs, the respective Salesforce API formats the data differently. Some of the
     * differences include how dates are formatted and null values are represented. Also, Bulk API 2.0
     * doesn't transfer Salesforce compound fields.
     *
     * By choosing this option, you optimize flow performance for both small and large data
     * transfers, but the tradeoff is inconsistent formatting in the output.
     *
     * * **BULKV2** - Amazon AppFlow uses only Salesforce Bulk API 2.0. This API runs asynchronous
     * data transfers, and it's optimal for large sets of data. By choosing this option, you ensure
     * that your flow writes consistent output, but you optimize performance only for large data
     * transfers.
     *
     * Note that Bulk API 2.0 does not transfer Salesforce compound fields.
     *
     * * **REST_SYNC** - Amazon AppFlow uses only Salesforce REST API. By choosing this option, you
     * ensure that your flow writes consistent output, but you decrease performance for large data
     * transfers that are better suited for Bulk API 2.0. In some cases, if your flow attempts to
     * transfer a vary large set of data, it might fail with a timed out error.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-salesforcedestinationproperties.html#cfn-appflow-flow-salesforcedestinationproperties-datatransferapi)
     */
    public fun dataTransferApi(): String? = unwrap(this).getDataTransferApi()

    /**
     * The settings that determine how Amazon AppFlow handles an error when placing data in the
     * Salesforce destination.
     *
     * For example, this setting would determine if the flow should fail after one insertion error,
     * or continue and attempt to insert every record regardless of the initial failure.
     * `ErrorHandlingConfig` is a part of the destination connector details.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-salesforcedestinationproperties.html#cfn-appflow-flow-salesforcedestinationproperties-errorhandlingconfig)
     */
    public fun errorHandlingConfig(): Any? = unwrap(this).getErrorHandlingConfig()

    /**
     * The name of the field that Amazon AppFlow uses as an ID when performing a write operation
     * such as update or delete.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-salesforcedestinationproperties.html#cfn-appflow-flow-salesforcedestinationproperties-idfieldnames)
     */
    public fun idFieldNames(): List<String> = unwrap(this).getIdFieldNames() ?: emptyList()

    /**
     * The object specified in the Salesforce flow destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-salesforcedestinationproperties.html#cfn-appflow-flow-salesforcedestinationproperties-object)
     */
    public fun `object`(): String

    /**
     * This specifies the type of write operation to be performed in Salesforce.
     *
     * When the value is `UPSERT` , then `idFieldNames` is required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-salesforcedestinationproperties.html#cfn-appflow-flow-salesforcedestinationproperties-writeoperationtype)
     */
    public fun writeOperationType(): String? = unwrap(this).getWriteOperationType()

    /**
     * A builder for [SalesforceDestinationPropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dataTransferApi Specifies which Salesforce API is used by Amazon AppFlow when your
       * flow transfers data to Salesforce.
       * * **AUTOMATIC** - The default. Amazon AppFlow selects which API to use based on the number
       * of records that your flow transfers to Salesforce. If your flow transfers fewer than 1,000
       * records, Amazon AppFlow uses Salesforce REST API. If your flow transfers 1,000 records or
       * more, Amazon AppFlow uses Salesforce Bulk API 2.0.
       *
       * Each of these Salesforce APIs structures data differently. If Amazon AppFlow selects the
       * API automatically, be aware that, for recurring flows, the data output might vary from one
       * flow run to the next. For example, if a flow runs daily, it might use REST API on one day to
       * transfer 900 records, and it might use Bulk API 2.0 on the next day to transfer 1,100 records.
       * For each of these flow runs, the respective Salesforce API formats the data differently. Some
       * of the differences include how dates are formatted and null values are represented. Also, Bulk
       * API 2.0 doesn't transfer Salesforce compound fields.
       *
       * By choosing this option, you optimize flow performance for both small and large data
       * transfers, but the tradeoff is inconsistent formatting in the output.
       *
       * * **BULKV2** - Amazon AppFlow uses only Salesforce Bulk API 2.0. This API runs asynchronous
       * data transfers, and it's optimal for large sets of data. By choosing this option, you ensure
       * that your flow writes consistent output, but you optimize performance only for large data
       * transfers.
       *
       * Note that Bulk API 2.0 does not transfer Salesforce compound fields.
       *
       * * **REST_SYNC** - Amazon AppFlow uses only Salesforce REST API. By choosing this option,
       * you ensure that your flow writes consistent output, but you decrease performance for large
       * data transfers that are better suited for Bulk API 2.0. In some cases, if your flow attempts
       * to transfer a vary large set of data, it might fail with a timed out error.
       */
      public fun dataTransferApi(dataTransferApi: String)

      /**
       * @param errorHandlingConfig The settings that determine how Amazon AppFlow handles an error
       * when placing data in the Salesforce destination.
       * For example, this setting would determine if the flow should fail after one insertion
       * error, or continue and attempt to insert every record regardless of the initial failure.
       * `ErrorHandlingConfig` is a part of the destination connector details.
       */
      public fun errorHandlingConfig(errorHandlingConfig: IResolvable)

      /**
       * @param errorHandlingConfig The settings that determine how Amazon AppFlow handles an error
       * when placing data in the Salesforce destination.
       * For example, this setting would determine if the flow should fail after one insertion
       * error, or continue and attempt to insert every record regardless of the initial failure.
       * `ErrorHandlingConfig` is a part of the destination connector details.
       */
      public fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty)

      /**
       * @param errorHandlingConfig The settings that determine how Amazon AppFlow handles an error
       * when placing data in the Salesforce destination.
       * For example, this setting would determine if the flow should fail after one insertion
       * error, or continue and attempt to insert every record regardless of the initial failure.
       * `ErrorHandlingConfig` is a part of the destination connector details.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9b7263d88d867b8b622c56e4577709b678489a18eaa640833a1d434943b3e542")
      public
          fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty.Builder.() -> Unit)

      /**
       * @param idFieldNames The name of the field that Amazon AppFlow uses as an ID when performing
       * a write operation such as update or delete.
       */
      public fun idFieldNames(idFieldNames: List<String>)

      /**
       * @param idFieldNames The name of the field that Amazon AppFlow uses as an ID when performing
       * a write operation such as update or delete.
       */
      public fun idFieldNames(vararg idFieldNames: String)

      /**
       * @param object The object specified in the Salesforce flow destination. 
       */
      public fun `object`(`object`: String)

      /**
       * @param writeOperationType This specifies the type of write operation to be performed in
       * Salesforce.
       * When the value is `UPSERT` , then `idFieldNames` is required.
       */
      public fun writeOperationType(writeOperationType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.SalesforceDestinationPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnFlow.SalesforceDestinationPropertiesProperty.builder()

      /**
       * @param dataTransferApi Specifies which Salesforce API is used by Amazon AppFlow when your
       * flow transfers data to Salesforce.
       * * **AUTOMATIC** - The default. Amazon AppFlow selects which API to use based on the number
       * of records that your flow transfers to Salesforce. If your flow transfers fewer than 1,000
       * records, Amazon AppFlow uses Salesforce REST API. If your flow transfers 1,000 records or
       * more, Amazon AppFlow uses Salesforce Bulk API 2.0.
       *
       * Each of these Salesforce APIs structures data differently. If Amazon AppFlow selects the
       * API automatically, be aware that, for recurring flows, the data output might vary from one
       * flow run to the next. For example, if a flow runs daily, it might use REST API on one day to
       * transfer 900 records, and it might use Bulk API 2.0 on the next day to transfer 1,100 records.
       * For each of these flow runs, the respective Salesforce API formats the data differently. Some
       * of the differences include how dates are formatted and null values are represented. Also, Bulk
       * API 2.0 doesn't transfer Salesforce compound fields.
       *
       * By choosing this option, you optimize flow performance for both small and large data
       * transfers, but the tradeoff is inconsistent formatting in the output.
       *
       * * **BULKV2** - Amazon AppFlow uses only Salesforce Bulk API 2.0. This API runs asynchronous
       * data transfers, and it's optimal for large sets of data. By choosing this option, you ensure
       * that your flow writes consistent output, but you optimize performance only for large data
       * transfers.
       *
       * Note that Bulk API 2.0 does not transfer Salesforce compound fields.
       *
       * * **REST_SYNC** - Amazon AppFlow uses only Salesforce REST API. By choosing this option,
       * you ensure that your flow writes consistent output, but you decrease performance for large
       * data transfers that are better suited for Bulk API 2.0. In some cases, if your flow attempts
       * to transfer a vary large set of data, it might fail with a timed out error.
       */
      override fun dataTransferApi(dataTransferApi: String) {
        cdkBuilder.dataTransferApi(dataTransferApi)
      }

      /**
       * @param errorHandlingConfig The settings that determine how Amazon AppFlow handles an error
       * when placing data in the Salesforce destination.
       * For example, this setting would determine if the flow should fail after one insertion
       * error, or continue and attempt to insert every record regardless of the initial failure.
       * `ErrorHandlingConfig` is a part of the destination connector details.
       */
      override fun errorHandlingConfig(errorHandlingConfig: IResolvable) {
        cdkBuilder.errorHandlingConfig(errorHandlingConfig.let(IResolvable::unwrap))
      }

      /**
       * @param errorHandlingConfig The settings that determine how Amazon AppFlow handles an error
       * when placing data in the Salesforce destination.
       * For example, this setting would determine if the flow should fail after one insertion
       * error, or continue and attempt to insert every record regardless of the initial failure.
       * `ErrorHandlingConfig` is a part of the destination connector details.
       */
      override fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty) {
        cdkBuilder.errorHandlingConfig(errorHandlingConfig.let(ErrorHandlingConfigProperty::unwrap))
      }

      /**
       * @param errorHandlingConfig The settings that determine how Amazon AppFlow handles an error
       * when placing data in the Salesforce destination.
       * For example, this setting would determine if the flow should fail after one insertion
       * error, or continue and attempt to insert every record regardless of the initial failure.
       * `ErrorHandlingConfig` is a part of the destination connector details.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9b7263d88d867b8b622c56e4577709b678489a18eaa640833a1d434943b3e542")
      override
          fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty.Builder.() -> Unit):
          Unit = errorHandlingConfig(ErrorHandlingConfigProperty(errorHandlingConfig))

      /**
       * @param idFieldNames The name of the field that Amazon AppFlow uses as an ID when performing
       * a write operation such as update or delete.
       */
      override fun idFieldNames(idFieldNames: List<String>) {
        cdkBuilder.idFieldNames(idFieldNames)
      }

      /**
       * @param idFieldNames The name of the field that Amazon AppFlow uses as an ID when performing
       * a write operation such as update or delete.
       */
      override fun idFieldNames(vararg idFieldNames: String): Unit =
          idFieldNames(idFieldNames.toList())

      /**
       * @param object The object specified in the Salesforce flow destination. 
       */
      override fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
      }

      /**
       * @param writeOperationType This specifies the type of write operation to be performed in
       * Salesforce.
       * When the value is `UPSERT` , then `idFieldNames` is required.
       */
      override fun writeOperationType(writeOperationType: String) {
        cdkBuilder.writeOperationType(writeOperationType)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.SalesforceDestinationPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.SalesforceDestinationPropertiesProperty,
    ) : CdkObject(cdkObject), SalesforceDestinationPropertiesProperty {
      /**
       * Specifies which Salesforce API is used by Amazon AppFlow when your flow transfers data to
       * Salesforce.
       *
       * * **AUTOMATIC** - The default. Amazon AppFlow selects which API to use based on the number
       * of records that your flow transfers to Salesforce. If your flow transfers fewer than 1,000
       * records, Amazon AppFlow uses Salesforce REST API. If your flow transfers 1,000 records or
       * more, Amazon AppFlow uses Salesforce Bulk API 2.0.
       *
       * Each of these Salesforce APIs structures data differently. If Amazon AppFlow selects the
       * API automatically, be aware that, for recurring flows, the data output might vary from one
       * flow run to the next. For example, if a flow runs daily, it might use REST API on one day to
       * transfer 900 records, and it might use Bulk API 2.0 on the next day to transfer 1,100 records.
       * For each of these flow runs, the respective Salesforce API formats the data differently. Some
       * of the differences include how dates are formatted and null values are represented. Also, Bulk
       * API 2.0 doesn't transfer Salesforce compound fields.
       *
       * By choosing this option, you optimize flow performance for both small and large data
       * transfers, but the tradeoff is inconsistent formatting in the output.
       *
       * * **BULKV2** - Amazon AppFlow uses only Salesforce Bulk API 2.0. This API runs asynchronous
       * data transfers, and it's optimal for large sets of data. By choosing this option, you ensure
       * that your flow writes consistent output, but you optimize performance only for large data
       * transfers.
       *
       * Note that Bulk API 2.0 does not transfer Salesforce compound fields.
       *
       * * **REST_SYNC** - Amazon AppFlow uses only Salesforce REST API. By choosing this option,
       * you ensure that your flow writes consistent output, but you decrease performance for large
       * data transfers that are better suited for Bulk API 2.0. In some cases, if your flow attempts
       * to transfer a vary large set of data, it might fail with a timed out error.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-salesforcedestinationproperties.html#cfn-appflow-flow-salesforcedestinationproperties-datatransferapi)
       */
      override fun dataTransferApi(): String? = unwrap(this).getDataTransferApi()

      /**
       * The settings that determine how Amazon AppFlow handles an error when placing data in the
       * Salesforce destination.
       *
       * For example, this setting would determine if the flow should fail after one insertion
       * error, or continue and attempt to insert every record regardless of the initial failure.
       * `ErrorHandlingConfig` is a part of the destination connector details.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-salesforcedestinationproperties.html#cfn-appflow-flow-salesforcedestinationproperties-errorhandlingconfig)
       */
      override fun errorHandlingConfig(): Any? = unwrap(this).getErrorHandlingConfig()

      /**
       * The name of the field that Amazon AppFlow uses as an ID when performing a write operation
       * such as update or delete.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-salesforcedestinationproperties.html#cfn-appflow-flow-salesforcedestinationproperties-idfieldnames)
       */
      override fun idFieldNames(): List<String> = unwrap(this).getIdFieldNames() ?: emptyList()

      /**
       * The object specified in the Salesforce flow destination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-salesforcedestinationproperties.html#cfn-appflow-flow-salesforcedestinationproperties-object)
       */
      override fun `object`(): String = unwrap(this).getObject()

      /**
       * This specifies the type of write operation to be performed in Salesforce.
       *
       * When the value is `UPSERT` , then `idFieldNames` is required.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-salesforcedestinationproperties.html#cfn-appflow-flow-salesforcedestinationproperties-writeoperationtype)
       */
      override fun writeOperationType(): String? = unwrap(this).getWriteOperationType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SalesforceDestinationPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.SalesforceDestinationPropertiesProperty):
          SalesforceDestinationPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SalesforceDestinationPropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.SalesforceDestinationPropertiesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnFlow.SalesforceDestinationPropertiesProperty
    }
  }

  /**
   * The properties that are applied when Google Analytics is being used as a source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appflow.*;
   * GoogleAnalyticsSourcePropertiesProperty googleAnalyticsSourcePropertiesProperty =
   * GoogleAnalyticsSourcePropertiesProperty.builder()
   * .object("object")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-googleanalyticssourceproperties.html)
   */
  public interface GoogleAnalyticsSourcePropertiesProperty {
    /**
     * The object specified in the Google Analytics flow source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-googleanalyticssourceproperties.html#cfn-appflow-flow-googleanalyticssourceproperties-object)
     */
    public fun `object`(): String

    /**
     * A builder for [GoogleAnalyticsSourcePropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param object The object specified in the Google Analytics flow source. 
       */
      public fun `object`(`object`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.GoogleAnalyticsSourcePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnFlow.GoogleAnalyticsSourcePropertiesProperty.builder()

      /**
       * @param object The object specified in the Google Analytics flow source. 
       */
      override fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.GoogleAnalyticsSourcePropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.GoogleAnalyticsSourcePropertiesProperty,
    ) : CdkObject(cdkObject), GoogleAnalyticsSourcePropertiesProperty {
      /**
       * The object specified in the Google Analytics flow source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-googleanalyticssourceproperties.html#cfn-appflow-flow-googleanalyticssourceproperties-object)
       */
      override fun `object`(): String = unwrap(this).getObject()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          GoogleAnalyticsSourcePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.GoogleAnalyticsSourcePropertiesProperty):
          GoogleAnalyticsSourcePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GoogleAnalyticsSourcePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.GoogleAnalyticsSourcePropertiesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnFlow.GoogleAnalyticsSourcePropertiesProperty
    }
  }

  /**
   * Contains information about the configuration of the source connector used in the flow.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appflow.*;
   * SourceFlowConfigProperty sourceFlowConfigProperty = SourceFlowConfigProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sourceflowconfig.html)
   */
  public interface SourceFlowConfigProperty {
    /**
     * The API version of the connector when it's used as a source in the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sourceflowconfig.html#cfn-appflow-flow-sourceflowconfig-apiversion)
     */
    public fun apiVersion(): String? = unwrap(this).getApiVersion()

    /**
     * The name of the connector profile.
     *
     * This name must be unique for each connector profile in the AWS account .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sourceflowconfig.html#cfn-appflow-flow-sourceflowconfig-connectorprofilename)
     */
    public fun connectorProfileName(): String? = unwrap(this).getConnectorProfileName()

    /**
     * The type of connector, such as Salesforce, Amplitude, and so on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sourceflowconfig.html#cfn-appflow-flow-sourceflowconfig-connectortype)
     */
    public fun connectorType(): String

    /**
     * Defines the configuration for a scheduled incremental data pull.
     *
     * If a valid configuration is provided, the fields specified in the configuration are used when
     * querying for the incremental data pull.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sourceflowconfig.html#cfn-appflow-flow-sourceflowconfig-incrementalpullconfig)
     */
    public fun incrementalPullConfig(): Any? = unwrap(this).getIncrementalPullConfig()

    /**
     * Specifies the information that is required to query a particular source connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sourceflowconfig.html#cfn-appflow-flow-sourceflowconfig-sourceconnectorproperties)
     */
    public fun sourceConnectorProperties(): Any

    /**
     * A builder for [SourceFlowConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param apiVersion The API version of the connector when it's used as a source in the flow.
       */
      public fun apiVersion(apiVersion: String)

      /**
       * @param connectorProfileName The name of the connector profile.
       * This name must be unique for each connector profile in the AWS account .
       */
      public fun connectorProfileName(connectorProfileName: String)

      /**
       * @param connectorType The type of connector, such as Salesforce, Amplitude, and so on. 
       */
      public fun connectorType(connectorType: String)

      /**
       * @param incrementalPullConfig Defines the configuration for a scheduled incremental data
       * pull.
       * If a valid configuration is provided, the fields specified in the configuration are used
       * when querying for the incremental data pull.
       */
      public fun incrementalPullConfig(incrementalPullConfig: IResolvable)

      /**
       * @param incrementalPullConfig Defines the configuration for a scheduled incremental data
       * pull.
       * If a valid configuration is provided, the fields specified in the configuration are used
       * when querying for the incremental data pull.
       */
      public fun incrementalPullConfig(incrementalPullConfig: IncrementalPullConfigProperty)

      /**
       * @param incrementalPullConfig Defines the configuration for a scheduled incremental data
       * pull.
       * If a valid configuration is provided, the fields specified in the configuration are used
       * when querying for the incremental data pull.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7425cac1d5558f115d9fc3eeeacd87f8d513adb94f5094b221205eaae961401d")
      public
          fun incrementalPullConfig(incrementalPullConfig: IncrementalPullConfigProperty.Builder.() -> Unit)

      /**
       * @param sourceConnectorProperties Specifies the information that is required to query a
       * particular source connector. 
       */
      public fun sourceConnectorProperties(sourceConnectorProperties: IResolvable)

      /**
       * @param sourceConnectorProperties Specifies the information that is required to query a
       * particular source connector. 
       */
      public
          fun sourceConnectorProperties(sourceConnectorProperties: SourceConnectorPropertiesProperty)

      /**
       * @param sourceConnectorProperties Specifies the information that is required to query a
       * particular source connector. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9cbcc2ec69f36b65cb3ccc5bd0e8539fc977a4da0de1424d3bc85aad98ab7589")
      public
          fun sourceConnectorProperties(sourceConnectorProperties: SourceConnectorPropertiesProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.SourceFlowConfigProperty.Builder =
          software.amazon.awscdk.services.appflow.CfnFlow.SourceFlowConfigProperty.builder()

      /**
       * @param apiVersion The API version of the connector when it's used as a source in the flow.
       */
      override fun apiVersion(apiVersion: String) {
        cdkBuilder.apiVersion(apiVersion)
      }

      /**
       * @param connectorProfileName The name of the connector profile.
       * This name must be unique for each connector profile in the AWS account .
       */
      override fun connectorProfileName(connectorProfileName: String) {
        cdkBuilder.connectorProfileName(connectorProfileName)
      }

      /**
       * @param connectorType The type of connector, such as Salesforce, Amplitude, and so on. 
       */
      override fun connectorType(connectorType: String) {
        cdkBuilder.connectorType(connectorType)
      }

      /**
       * @param incrementalPullConfig Defines the configuration for a scheduled incremental data
       * pull.
       * If a valid configuration is provided, the fields specified in the configuration are used
       * when querying for the incremental data pull.
       */
      override fun incrementalPullConfig(incrementalPullConfig: IResolvable) {
        cdkBuilder.incrementalPullConfig(incrementalPullConfig.let(IResolvable::unwrap))
      }

      /**
       * @param incrementalPullConfig Defines the configuration for a scheduled incremental data
       * pull.
       * If a valid configuration is provided, the fields specified in the configuration are used
       * when querying for the incremental data pull.
       */
      override fun incrementalPullConfig(incrementalPullConfig: IncrementalPullConfigProperty) {
        cdkBuilder.incrementalPullConfig(incrementalPullConfig.let(IncrementalPullConfigProperty::unwrap))
      }

      /**
       * @param incrementalPullConfig Defines the configuration for a scheduled incremental data
       * pull.
       * If a valid configuration is provided, the fields specified in the configuration are used
       * when querying for the incremental data pull.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7425cac1d5558f115d9fc3eeeacd87f8d513adb94f5094b221205eaae961401d")
      override
          fun incrementalPullConfig(incrementalPullConfig: IncrementalPullConfigProperty.Builder.() -> Unit):
          Unit = incrementalPullConfig(IncrementalPullConfigProperty(incrementalPullConfig))

      /**
       * @param sourceConnectorProperties Specifies the information that is required to query a
       * particular source connector. 
       */
      override fun sourceConnectorProperties(sourceConnectorProperties: IResolvable) {
        cdkBuilder.sourceConnectorProperties(sourceConnectorProperties.let(IResolvable::unwrap))
      }

      /**
       * @param sourceConnectorProperties Specifies the information that is required to query a
       * particular source connector. 
       */
      override
          fun sourceConnectorProperties(sourceConnectorProperties: SourceConnectorPropertiesProperty) {
        cdkBuilder.sourceConnectorProperties(sourceConnectorProperties.let(SourceConnectorPropertiesProperty::unwrap))
      }

      /**
       * @param sourceConnectorProperties Specifies the information that is required to query a
       * particular source connector. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9cbcc2ec69f36b65cb3ccc5bd0e8539fc977a4da0de1424d3bc85aad98ab7589")
      override
          fun sourceConnectorProperties(sourceConnectorProperties: SourceConnectorPropertiesProperty.Builder.() -> Unit):
          Unit =
          sourceConnectorProperties(SourceConnectorPropertiesProperty(sourceConnectorProperties))

      public fun build(): software.amazon.awscdk.services.appflow.CfnFlow.SourceFlowConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.SourceFlowConfigProperty,
    ) : CdkObject(cdkObject), SourceFlowConfigProperty {
      /**
       * The API version of the connector when it's used as a source in the flow.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sourceflowconfig.html#cfn-appflow-flow-sourceflowconfig-apiversion)
       */
      override fun apiVersion(): String? = unwrap(this).getApiVersion()

      /**
       * The name of the connector profile.
       *
       * This name must be unique for each connector profile in the AWS account .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sourceflowconfig.html#cfn-appflow-flow-sourceflowconfig-connectorprofilename)
       */
      override fun connectorProfileName(): String? = unwrap(this).getConnectorProfileName()

      /**
       * The type of connector, such as Salesforce, Amplitude, and so on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sourceflowconfig.html#cfn-appflow-flow-sourceflowconfig-connectortype)
       */
      override fun connectorType(): String = unwrap(this).getConnectorType()

      /**
       * Defines the configuration for a scheduled incremental data pull.
       *
       * If a valid configuration is provided, the fields specified in the configuration are used
       * when querying for the incremental data pull.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sourceflowconfig.html#cfn-appflow-flow-sourceflowconfig-incrementalpullconfig)
       */
      override fun incrementalPullConfig(): Any? = unwrap(this).getIncrementalPullConfig()

      /**
       * Specifies the information that is required to query a particular source connector.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sourceflowconfig.html#cfn-appflow-flow-sourceflowconfig-sourceconnectorproperties)
       */
      override fun sourceConnectorProperties(): Any = unwrap(this).getSourceConnectorProperties()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SourceFlowConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.SourceFlowConfigProperty):
          SourceFlowConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceFlowConfigProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.SourceFlowConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnFlow.SourceFlowConfigProperty
    }
  }

  /**
   * The properties that are applied when Salesforce is being used as a source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appflow.*;
   * SalesforceSourcePropertiesProperty salesforceSourcePropertiesProperty =
   * SalesforceSourcePropertiesProperty.builder()
   * .object("object")
   * // the properties below are optional
   * .dataTransferApi("dataTransferApi")
   * .enableDynamicFieldUpdate(false)
   * .includeDeletedRecords(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-salesforcesourceproperties.html)
   */
  public interface SalesforceSourcePropertiesProperty {
    /**
     * Specifies which Salesforce API is used by Amazon AppFlow when your flow transfers data from
     * Salesforce.
     *
     * * **AUTOMATIC** - The default. Amazon AppFlow selects which API to use based on the number of
     * records that your flow transfers from Salesforce. If your flow transfers fewer than 1,000,000
     * records, Amazon AppFlow uses Salesforce REST API. If your flow transfers 1,000,000 records or
     * more, Amazon AppFlow uses Salesforce Bulk API 2.0.
     *
     * Each of these Salesforce APIs structures data differently. If Amazon AppFlow selects the API
     * automatically, be aware that, for recurring flows, the data output might vary from one flow run
     * to the next. For example, if a flow runs daily, it might use REST API on one day to transfer
     * 900,000 records, and it might use Bulk API 2.0 on the next day to transfer 1,100,000 records.
     * For each of these flow runs, the respective Salesforce API formats the data differently. Some of
     * the differences include how dates are formatted and null values are represented. Also, Bulk API
     * 2.0 doesn't transfer Salesforce compound fields.
     *
     * By choosing this option, you optimize flow performance for both small and large data
     * transfers, but the tradeoff is inconsistent formatting in the output.
     *
     * * **BULKV2** - Amazon AppFlow uses only Salesforce Bulk API 2.0. This API runs asynchronous
     * data transfers, and it's optimal for large sets of data. By choosing this option, you ensure
     * that your flow writes consistent output, but you optimize performance only for large data
     * transfers.
     *
     * Note that Bulk API 2.0 does not transfer Salesforce compound fields.
     *
     * * **REST_SYNC** - Amazon AppFlow uses only Salesforce REST API. By choosing this option, you
     * ensure that your flow writes consistent output, but you decrease performance for large data
     * transfers that are better suited for Bulk API 2.0. In some cases, if your flow attempts to
     * transfer a vary large set of data, it might fail wituh a timed out error.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-salesforcesourceproperties.html#cfn-appflow-flow-salesforcesourceproperties-datatransferapi)
     */
    public fun dataTransferApi(): String? = unwrap(this).getDataTransferApi()

    /**
     * The flag that enables dynamic fetching of new (recently added) fields in the Salesforce
     * objects while running a flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-salesforcesourceproperties.html#cfn-appflow-flow-salesforcesourceproperties-enabledynamicfieldupdate)
     */
    public fun enableDynamicFieldUpdate(): Any? = unwrap(this).getEnableDynamicFieldUpdate()

    /**
     * Indicates whether Amazon AppFlow includes deleted files in the flow run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-salesforcesourceproperties.html#cfn-appflow-flow-salesforcesourceproperties-includedeletedrecords)
     */
    public fun includeDeletedRecords(): Any? = unwrap(this).getIncludeDeletedRecords()

    /**
     * The object specified in the Salesforce flow source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-salesforcesourceproperties.html#cfn-appflow-flow-salesforcesourceproperties-object)
     */
    public fun `object`(): String

    /**
     * A builder for [SalesforceSourcePropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dataTransferApi Specifies which Salesforce API is used by Amazon AppFlow when your
       * flow transfers data from Salesforce.
       * * **AUTOMATIC** - The default. Amazon AppFlow selects which API to use based on the number
       * of records that your flow transfers from Salesforce. If your flow transfers fewer than
       * 1,000,000 records, Amazon AppFlow uses Salesforce REST API. If your flow transfers 1,000,000
       * records or more, Amazon AppFlow uses Salesforce Bulk API 2.0.
       *
       * Each of these Salesforce APIs structures data differently. If Amazon AppFlow selects the
       * API automatically, be aware that, for recurring flows, the data output might vary from one
       * flow run to the next. For example, if a flow runs daily, it might use REST API on one day to
       * transfer 900,000 records, and it might use Bulk API 2.0 on the next day to transfer 1,100,000
       * records. For each of these flow runs, the respective Salesforce API formats the data
       * differently. Some of the differences include how dates are formatted and null values are
       * represented. Also, Bulk API 2.0 doesn't transfer Salesforce compound fields.
       *
       * By choosing this option, you optimize flow performance for both small and large data
       * transfers, but the tradeoff is inconsistent formatting in the output.
       *
       * * **BULKV2** - Amazon AppFlow uses only Salesforce Bulk API 2.0. This API runs asynchronous
       * data transfers, and it's optimal for large sets of data. By choosing this option, you ensure
       * that your flow writes consistent output, but you optimize performance only for large data
       * transfers.
       *
       * Note that Bulk API 2.0 does not transfer Salesforce compound fields.
       *
       * * **REST_SYNC** - Amazon AppFlow uses only Salesforce REST API. By choosing this option,
       * you ensure that your flow writes consistent output, but you decrease performance for large
       * data transfers that are better suited for Bulk API 2.0. In some cases, if your flow attempts
       * to transfer a vary large set of data, it might fail wituh a timed out error.
       */
      public fun dataTransferApi(dataTransferApi: String)

      /**
       * @param enableDynamicFieldUpdate The flag that enables dynamic fetching of new (recently
       * added) fields in the Salesforce objects while running a flow.
       */
      public fun enableDynamicFieldUpdate(enableDynamicFieldUpdate: Boolean)

      /**
       * @param enableDynamicFieldUpdate The flag that enables dynamic fetching of new (recently
       * added) fields in the Salesforce objects while running a flow.
       */
      public fun enableDynamicFieldUpdate(enableDynamicFieldUpdate: IResolvable)

      /**
       * @param includeDeletedRecords Indicates whether Amazon AppFlow includes deleted files in the
       * flow run.
       */
      public fun includeDeletedRecords(includeDeletedRecords: Boolean)

      /**
       * @param includeDeletedRecords Indicates whether Amazon AppFlow includes deleted files in the
       * flow run.
       */
      public fun includeDeletedRecords(includeDeletedRecords: IResolvable)

      /**
       * @param object The object specified in the Salesforce flow source. 
       */
      public fun `object`(`object`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.SalesforceSourcePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnFlow.SalesforceSourcePropertiesProperty.builder()

      /**
       * @param dataTransferApi Specifies which Salesforce API is used by Amazon AppFlow when your
       * flow transfers data from Salesforce.
       * * **AUTOMATIC** - The default. Amazon AppFlow selects which API to use based on the number
       * of records that your flow transfers from Salesforce. If your flow transfers fewer than
       * 1,000,000 records, Amazon AppFlow uses Salesforce REST API. If your flow transfers 1,000,000
       * records or more, Amazon AppFlow uses Salesforce Bulk API 2.0.
       *
       * Each of these Salesforce APIs structures data differently. If Amazon AppFlow selects the
       * API automatically, be aware that, for recurring flows, the data output might vary from one
       * flow run to the next. For example, if a flow runs daily, it might use REST API on one day to
       * transfer 900,000 records, and it might use Bulk API 2.0 on the next day to transfer 1,100,000
       * records. For each of these flow runs, the respective Salesforce API formats the data
       * differently. Some of the differences include how dates are formatted and null values are
       * represented. Also, Bulk API 2.0 doesn't transfer Salesforce compound fields.
       *
       * By choosing this option, you optimize flow performance for both small and large data
       * transfers, but the tradeoff is inconsistent formatting in the output.
       *
       * * **BULKV2** - Amazon AppFlow uses only Salesforce Bulk API 2.0. This API runs asynchronous
       * data transfers, and it's optimal for large sets of data. By choosing this option, you ensure
       * that your flow writes consistent output, but you optimize performance only for large data
       * transfers.
       *
       * Note that Bulk API 2.0 does not transfer Salesforce compound fields.
       *
       * * **REST_SYNC** - Amazon AppFlow uses only Salesforce REST API. By choosing this option,
       * you ensure that your flow writes consistent output, but you decrease performance for large
       * data transfers that are better suited for Bulk API 2.0. In some cases, if your flow attempts
       * to transfer a vary large set of data, it might fail wituh a timed out error.
       */
      override fun dataTransferApi(dataTransferApi: String) {
        cdkBuilder.dataTransferApi(dataTransferApi)
      }

      /**
       * @param enableDynamicFieldUpdate The flag that enables dynamic fetching of new (recently
       * added) fields in the Salesforce objects while running a flow.
       */
      override fun enableDynamicFieldUpdate(enableDynamicFieldUpdate: Boolean) {
        cdkBuilder.enableDynamicFieldUpdate(enableDynamicFieldUpdate)
      }

      /**
       * @param enableDynamicFieldUpdate The flag that enables dynamic fetching of new (recently
       * added) fields in the Salesforce objects while running a flow.
       */
      override fun enableDynamicFieldUpdate(enableDynamicFieldUpdate: IResolvable) {
        cdkBuilder.enableDynamicFieldUpdate(enableDynamicFieldUpdate.let(IResolvable::unwrap))
      }

      /**
       * @param includeDeletedRecords Indicates whether Amazon AppFlow includes deleted files in the
       * flow run.
       */
      override fun includeDeletedRecords(includeDeletedRecords: Boolean) {
        cdkBuilder.includeDeletedRecords(includeDeletedRecords)
      }

      /**
       * @param includeDeletedRecords Indicates whether Amazon AppFlow includes deleted files in the
       * flow run.
       */
      override fun includeDeletedRecords(includeDeletedRecords: IResolvable) {
        cdkBuilder.includeDeletedRecords(includeDeletedRecords.let(IResolvable::unwrap))
      }

      /**
       * @param object The object specified in the Salesforce flow source. 
       */
      override fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.SalesforceSourcePropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.SalesforceSourcePropertiesProperty,
    ) : CdkObject(cdkObject), SalesforceSourcePropertiesProperty {
      /**
       * Specifies which Salesforce API is used by Amazon AppFlow when your flow transfers data from
       * Salesforce.
       *
       * * **AUTOMATIC** - The default. Amazon AppFlow selects which API to use based on the number
       * of records that your flow transfers from Salesforce. If your flow transfers fewer than
       * 1,000,000 records, Amazon AppFlow uses Salesforce REST API. If your flow transfers 1,000,000
       * records or more, Amazon AppFlow uses Salesforce Bulk API 2.0.
       *
       * Each of these Salesforce APIs structures data differently. If Amazon AppFlow selects the
       * API automatically, be aware that, for recurring flows, the data output might vary from one
       * flow run to the next. For example, if a flow runs daily, it might use REST API on one day to
       * transfer 900,000 records, and it might use Bulk API 2.0 on the next day to transfer 1,100,000
       * records. For each of these flow runs, the respective Salesforce API formats the data
       * differently. Some of the differences include how dates are formatted and null values are
       * represented. Also, Bulk API 2.0 doesn't transfer Salesforce compound fields.
       *
       * By choosing this option, you optimize flow performance for both small and large data
       * transfers, but the tradeoff is inconsistent formatting in the output.
       *
       * * **BULKV2** - Amazon AppFlow uses only Salesforce Bulk API 2.0. This API runs asynchronous
       * data transfers, and it's optimal for large sets of data. By choosing this option, you ensure
       * that your flow writes consistent output, but you optimize performance only for large data
       * transfers.
       *
       * Note that Bulk API 2.0 does not transfer Salesforce compound fields.
       *
       * * **REST_SYNC** - Amazon AppFlow uses only Salesforce REST API. By choosing this option,
       * you ensure that your flow writes consistent output, but you decrease performance for large
       * data transfers that are better suited for Bulk API 2.0. In some cases, if your flow attempts
       * to transfer a vary large set of data, it might fail wituh a timed out error.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-salesforcesourceproperties.html#cfn-appflow-flow-salesforcesourceproperties-datatransferapi)
       */
      override fun dataTransferApi(): String? = unwrap(this).getDataTransferApi()

      /**
       * The flag that enables dynamic fetching of new (recently added) fields in the Salesforce
       * objects while running a flow.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-salesforcesourceproperties.html#cfn-appflow-flow-salesforcesourceproperties-enabledynamicfieldupdate)
       */
      override fun enableDynamicFieldUpdate(): Any? = unwrap(this).getEnableDynamicFieldUpdate()

      /**
       * Indicates whether Amazon AppFlow includes deleted files in the flow run.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-salesforcesourceproperties.html#cfn-appflow-flow-salesforcesourceproperties-includedeletedrecords)
       */
      override fun includeDeletedRecords(): Any? = unwrap(this).getIncludeDeletedRecords()

      /**
       * The object specified in the Salesforce flow source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-salesforcesourceproperties.html#cfn-appflow-flow-salesforcesourceproperties-object)
       */
      override fun `object`(): String = unwrap(this).getObject()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SalesforceSourcePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.SalesforceSourcePropertiesProperty):
          SalesforceSourcePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SalesforceSourcePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.SalesforceSourcePropertiesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnFlow.SalesforceSourcePropertiesProperty
    }
  }

  /**
   * The trigger settings that determine how and when Amazon AppFlow runs the specified flow.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appflow.*;
   * TriggerConfigProperty triggerConfigProperty = TriggerConfigProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-triggerconfig.html)
   */
  public interface TriggerConfigProperty {
    /**
     * Specifies the configuration details of a schedule-triggered flow as defined by the user.
     *
     * Currently, these settings only apply to the `Scheduled` trigger type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-triggerconfig.html#cfn-appflow-flow-triggerconfig-triggerproperties)
     */
    public fun triggerProperties(): Any? = unwrap(this).getTriggerProperties()

    /**
     * Specifies the type of flow trigger.
     *
     * This can be `OnDemand` , `Scheduled` , or `Event` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-triggerconfig.html#cfn-appflow-flow-triggerconfig-triggertype)
     */
    public fun triggerType(): String

    /**
     * A builder for [TriggerConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param triggerProperties Specifies the configuration details of a schedule-triggered flow
       * as defined by the user.
       * Currently, these settings only apply to the `Scheduled` trigger type.
       */
      public fun triggerProperties(triggerProperties: IResolvable)

      /**
       * @param triggerProperties Specifies the configuration details of a schedule-triggered flow
       * as defined by the user.
       * Currently, these settings only apply to the `Scheduled` trigger type.
       */
      public fun triggerProperties(triggerProperties: ScheduledTriggerPropertiesProperty)

      /**
       * @param triggerProperties Specifies the configuration details of a schedule-triggered flow
       * as defined by the user.
       * Currently, these settings only apply to the `Scheduled` trigger type.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c76fa0bed44d3944999469fd8cd418aabb485e72ca02b7e619160a121612d55c")
      public
          fun triggerProperties(triggerProperties: ScheduledTriggerPropertiesProperty.Builder.() -> Unit)

      /**
       * @param triggerType Specifies the type of flow trigger. 
       * This can be `OnDemand` , `Scheduled` , or `Event` .
       */
      public fun triggerType(triggerType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.TriggerConfigProperty.Builder =
          software.amazon.awscdk.services.appflow.CfnFlow.TriggerConfigProperty.builder()

      /**
       * @param triggerProperties Specifies the configuration details of a schedule-triggered flow
       * as defined by the user.
       * Currently, these settings only apply to the `Scheduled` trigger type.
       */
      override fun triggerProperties(triggerProperties: IResolvable) {
        cdkBuilder.triggerProperties(triggerProperties.let(IResolvable::unwrap))
      }

      /**
       * @param triggerProperties Specifies the configuration details of a schedule-triggered flow
       * as defined by the user.
       * Currently, these settings only apply to the `Scheduled` trigger type.
       */
      override fun triggerProperties(triggerProperties: ScheduledTriggerPropertiesProperty) {
        cdkBuilder.triggerProperties(triggerProperties.let(ScheduledTriggerPropertiesProperty::unwrap))
      }

      /**
       * @param triggerProperties Specifies the configuration details of a schedule-triggered flow
       * as defined by the user.
       * Currently, these settings only apply to the `Scheduled` trigger type.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c76fa0bed44d3944999469fd8cd418aabb485e72ca02b7e619160a121612d55c")
      override
          fun triggerProperties(triggerProperties: ScheduledTriggerPropertiesProperty.Builder.() -> Unit):
          Unit = triggerProperties(ScheduledTriggerPropertiesProperty(triggerProperties))

      /**
       * @param triggerType Specifies the type of flow trigger. 
       * This can be `OnDemand` , `Scheduled` , or `Event` .
       */
      override fun triggerType(triggerType: String) {
        cdkBuilder.triggerType(triggerType)
      }

      public fun build(): software.amazon.awscdk.services.appflow.CfnFlow.TriggerConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.TriggerConfigProperty,
    ) : CdkObject(cdkObject), TriggerConfigProperty {
      /**
       * Specifies the configuration details of a schedule-triggered flow as defined by the user.
       *
       * Currently, these settings only apply to the `Scheduled` trigger type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-triggerconfig.html#cfn-appflow-flow-triggerconfig-triggerproperties)
       */
      override fun triggerProperties(): Any? = unwrap(this).getTriggerProperties()

      /**
       * Specifies the type of flow trigger.
       *
       * This can be `OnDemand` , `Scheduled` , or `Event` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-triggerconfig.html#cfn-appflow-flow-triggerconfig-triggertype)
       */
      override fun triggerType(): String = unwrap(this).getTriggerType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TriggerConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.TriggerConfigProperty):
          TriggerConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TriggerConfigProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.TriggerConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnFlow.TriggerConfigProperty
    }
  }

  /**
   * Determines how Amazon AppFlow handles the success response that it gets from the connector
   * after placing data.
   *
   * For example, this setting would determine where to write the response from the destination
   * connector upon a successful insert operation.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appflow.*;
   * SuccessResponseHandlingConfigProperty successResponseHandlingConfigProperty =
   * SuccessResponseHandlingConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-successresponsehandlingconfig.html)
   */
  public interface SuccessResponseHandlingConfigProperty {
    /**
     * The name of the Amazon S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-successresponsehandlingconfig.html#cfn-appflow-flow-successresponsehandlingconfig-bucketname)
     */
    public fun bucketName(): String? = unwrap(this).getBucketName()

    /**
     * The Amazon S3 bucket prefix.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-successresponsehandlingconfig.html#cfn-appflow-flow-successresponsehandlingconfig-bucketprefix)
     */
    public fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

    /**
     * A builder for [SuccessResponseHandlingConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucketName The name of the Amazon S3 bucket.
       */
      public fun bucketName(bucketName: String)

      /**
       * @param bucketPrefix The Amazon S3 bucket prefix.
       */
      public fun bucketPrefix(bucketPrefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.SuccessResponseHandlingConfigProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnFlow.SuccessResponseHandlingConfigProperty.builder()

      /**
       * @param bucketName The name of the Amazon S3 bucket.
       */
      override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      /**
       * @param bucketPrefix The Amazon S3 bucket prefix.
       */
      override fun bucketPrefix(bucketPrefix: String) {
        cdkBuilder.bucketPrefix(bucketPrefix)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.SuccessResponseHandlingConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.SuccessResponseHandlingConfigProperty,
    ) : CdkObject(cdkObject), SuccessResponseHandlingConfigProperty {
      /**
       * The name of the Amazon S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-successresponsehandlingconfig.html#cfn-appflow-flow-successresponsehandlingconfig-bucketname)
       */
      override fun bucketName(): String? = unwrap(this).getBucketName()

      /**
       * The Amazon S3 bucket prefix.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-successresponsehandlingconfig.html#cfn-appflow-flow-successresponsehandlingconfig-bucketprefix)
       */
      override fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SuccessResponseHandlingConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.SuccessResponseHandlingConfigProperty):
          SuccessResponseHandlingConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SuccessResponseHandlingConfigProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.SuccessResponseHandlingConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnFlow.SuccessResponseHandlingConfigProperty
    }
  }

  /**
   * The operation to be performed on the provided source fields.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appflow.*;
   * ConnectorOperatorProperty connectorOperatorProperty = ConnectorOperatorProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-connectoroperator.html)
   */
  public interface ConnectorOperatorProperty {
    /**
     * The operation to be performed on the provided Amplitude source fields.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-connectoroperator.html#cfn-appflow-flow-connectoroperator-amplitude)
     */
    public fun amplitude(): String? = unwrap(this).getAmplitude()

    /**
     * Operators supported by the custom connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-connectoroperator.html#cfn-appflow-flow-connectoroperator-customconnector)
     */
    public fun customConnector(): String? = unwrap(this).getCustomConnector()

    /**
     * The operation to be performed on the provided Datadog source fields.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-connectoroperator.html#cfn-appflow-flow-connectoroperator-datadog)
     */
    public fun datadog(): String? = unwrap(this).getDatadog()

    /**
     * The operation to be performed on the provided Dynatrace source fields.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-connectoroperator.html#cfn-appflow-flow-connectoroperator-dynatrace)
     */
    public fun dynatrace(): String? = unwrap(this).getDynatrace()

    /**
     * The operation to be performed on the provided Google Analytics source fields.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-connectoroperator.html#cfn-appflow-flow-connectoroperator-googleanalytics)
     */
    public fun googleAnalytics(): String? = unwrap(this).getGoogleAnalytics()

    /**
     * The operation to be performed on the provided Infor Nexus source fields.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-connectoroperator.html#cfn-appflow-flow-connectoroperator-infornexus)
     */
    public fun inforNexus(): String? = unwrap(this).getInforNexus()

    /**
     * The operation to be performed on the provided Marketo source fields.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-connectoroperator.html#cfn-appflow-flow-connectoroperator-marketo)
     */
    public fun marketo(): String? = unwrap(this).getMarketo()

    /**
     * The operation to be performed on the provided Salesforce Pardot source fields.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-connectoroperator.html#cfn-appflow-flow-connectoroperator-pardot)
     */
    public fun pardot(): String? = unwrap(this).getPardot()

    /**
     * The operation to be performed on the provided Amazon S3 source fields.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-connectoroperator.html#cfn-appflow-flow-connectoroperator-s3)
     */
    public fun s3(): String? = unwrap(this).getS3()

    /**
     * The operation to be performed on the provided Salesforce source fields.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-connectoroperator.html#cfn-appflow-flow-connectoroperator-salesforce)
     */
    public fun salesforce(): String? = unwrap(this).getSalesforce()

    /**
     * The operation to be performed on the provided SAPOData source fields.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-connectoroperator.html#cfn-appflow-flow-connectoroperator-sapodata)
     */
    public fun sapoData(): String? = unwrap(this).getSapoData()

    /**
     * The operation to be performed on the provided ServiceNow source fields.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-connectoroperator.html#cfn-appflow-flow-connectoroperator-servicenow)
     */
    public fun serviceNow(): String? = unwrap(this).getServiceNow()

    /**
     * The operation to be performed on the provided Singular source fields.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-connectoroperator.html#cfn-appflow-flow-connectoroperator-singular)
     */
    public fun singular(): String? = unwrap(this).getSingular()

    /**
     * The operation to be performed on the provided Slack source fields.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-connectoroperator.html#cfn-appflow-flow-connectoroperator-slack)
     */
    public fun slack(): String? = unwrap(this).getSlack()

    /**
     * The operation to be performed on the provided Trend Micro source fields.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-connectoroperator.html#cfn-appflow-flow-connectoroperator-trendmicro)
     */
    public fun trendmicro(): String? = unwrap(this).getTrendmicro()

    /**
     * The operation to be performed on the provided Veeva source fields.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-connectoroperator.html#cfn-appflow-flow-connectoroperator-veeva)
     */
    public fun veeva(): String? = unwrap(this).getVeeva()

    /**
     * The operation to be performed on the provided Zendesk source fields.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-connectoroperator.html#cfn-appflow-flow-connectoroperator-zendesk)
     */
    public fun zendesk(): String? = unwrap(this).getZendesk()

    /**
     * A builder for [ConnectorOperatorProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param amplitude The operation to be performed on the provided Amplitude source fields.
       */
      public fun amplitude(amplitude: String)

      /**
       * @param customConnector Operators supported by the custom connector.
       */
      public fun customConnector(customConnector: String)

      /**
       * @param datadog The operation to be performed on the provided Datadog source fields.
       */
      public fun datadog(datadog: String)

      /**
       * @param dynatrace The operation to be performed on the provided Dynatrace source fields.
       */
      public fun dynatrace(dynatrace: String)

      /**
       * @param googleAnalytics The operation to be performed on the provided Google Analytics
       * source fields.
       */
      public fun googleAnalytics(googleAnalytics: String)

      /**
       * @param inforNexus The operation to be performed on the provided Infor Nexus source fields.
       */
      public fun inforNexus(inforNexus: String)

      /**
       * @param marketo The operation to be performed on the provided Marketo source fields.
       */
      public fun marketo(marketo: String)

      /**
       * @param pardot The operation to be performed on the provided Salesforce Pardot source
       * fields.
       */
      public fun pardot(pardot: String)

      /**
       * @param s3 The operation to be performed on the provided Amazon S3 source fields.
       */
      public fun s3(s3: String)

      /**
       * @param salesforce The operation to be performed on the provided Salesforce source fields.
       */
      public fun salesforce(salesforce: String)

      /**
       * @param sapoData The operation to be performed on the provided SAPOData source fields.
       */
      public fun sapoData(sapoData: String)

      /**
       * @param serviceNow The operation to be performed on the provided ServiceNow source fields.
       */
      public fun serviceNow(serviceNow: String)

      /**
       * @param singular The operation to be performed on the provided Singular source fields.
       */
      public fun singular(singular: String)

      /**
       * @param slack The operation to be performed on the provided Slack source fields.
       */
      public fun slack(slack: String)

      /**
       * @param trendmicro The operation to be performed on the provided Trend Micro source fields.
       */
      public fun trendmicro(trendmicro: String)

      /**
       * @param veeva The operation to be performed on the provided Veeva source fields.
       */
      public fun veeva(veeva: String)

      /**
       * @param zendesk The operation to be performed on the provided Zendesk source fields.
       */
      public fun zendesk(zendesk: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.ConnectorOperatorProperty.Builder =
          software.amazon.awscdk.services.appflow.CfnFlow.ConnectorOperatorProperty.builder()

      /**
       * @param amplitude The operation to be performed on the provided Amplitude source fields.
       */
      override fun amplitude(amplitude: String) {
        cdkBuilder.amplitude(amplitude)
      }

      /**
       * @param customConnector Operators supported by the custom connector.
       */
      override fun customConnector(customConnector: String) {
        cdkBuilder.customConnector(customConnector)
      }

      /**
       * @param datadog The operation to be performed on the provided Datadog source fields.
       */
      override fun datadog(datadog: String) {
        cdkBuilder.datadog(datadog)
      }

      /**
       * @param dynatrace The operation to be performed on the provided Dynatrace source fields.
       */
      override fun dynatrace(dynatrace: String) {
        cdkBuilder.dynatrace(dynatrace)
      }

      /**
       * @param googleAnalytics The operation to be performed on the provided Google Analytics
       * source fields.
       */
      override fun googleAnalytics(googleAnalytics: String) {
        cdkBuilder.googleAnalytics(googleAnalytics)
      }

      /**
       * @param inforNexus The operation to be performed on the provided Infor Nexus source fields.
       */
      override fun inforNexus(inforNexus: String) {
        cdkBuilder.inforNexus(inforNexus)
      }

      /**
       * @param marketo The operation to be performed on the provided Marketo source fields.
       */
      override fun marketo(marketo: String) {
        cdkBuilder.marketo(marketo)
      }

      /**
       * @param pardot The operation to be performed on the provided Salesforce Pardot source
       * fields.
       */
      override fun pardot(pardot: String) {
        cdkBuilder.pardot(pardot)
      }

      /**
       * @param s3 The operation to be performed on the provided Amazon S3 source fields.
       */
      override fun s3(s3: String) {
        cdkBuilder.s3(s3)
      }

      /**
       * @param salesforce The operation to be performed on the provided Salesforce source fields.
       */
      override fun salesforce(salesforce: String) {
        cdkBuilder.salesforce(salesforce)
      }

      /**
       * @param sapoData The operation to be performed on the provided SAPOData source fields.
       */
      override fun sapoData(sapoData: String) {
        cdkBuilder.sapoData(sapoData)
      }

      /**
       * @param serviceNow The operation to be performed on the provided ServiceNow source fields.
       */
      override fun serviceNow(serviceNow: String) {
        cdkBuilder.serviceNow(serviceNow)
      }

      /**
       * @param singular The operation to be performed on the provided Singular source fields.
       */
      override fun singular(singular: String) {
        cdkBuilder.singular(singular)
      }

      /**
       * @param slack The operation to be performed on the provided Slack source fields.
       */
      override fun slack(slack: String) {
        cdkBuilder.slack(slack)
      }

      /**
       * @param trendmicro The operation to be performed on the provided Trend Micro source fields.
       */
      override fun trendmicro(trendmicro: String) {
        cdkBuilder.trendmicro(trendmicro)
      }

      /**
       * @param veeva The operation to be performed on the provided Veeva source fields.
       */
      override fun veeva(veeva: String) {
        cdkBuilder.veeva(veeva)
      }

      /**
       * @param zendesk The operation to be performed on the provided Zendesk source fields.
       */
      override fun zendesk(zendesk: String) {
        cdkBuilder.zendesk(zendesk)
      }

      public fun build(): software.amazon.awscdk.services.appflow.CfnFlow.ConnectorOperatorProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.ConnectorOperatorProperty,
    ) : CdkObject(cdkObject), ConnectorOperatorProperty {
      /**
       * The operation to be performed on the provided Amplitude source fields.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-connectoroperator.html#cfn-appflow-flow-connectoroperator-amplitude)
       */
      override fun amplitude(): String? = unwrap(this).getAmplitude()

      /**
       * Operators supported by the custom connector.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-connectoroperator.html#cfn-appflow-flow-connectoroperator-customconnector)
       */
      override fun customConnector(): String? = unwrap(this).getCustomConnector()

      /**
       * The operation to be performed on the provided Datadog source fields.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-connectoroperator.html#cfn-appflow-flow-connectoroperator-datadog)
       */
      override fun datadog(): String? = unwrap(this).getDatadog()

      /**
       * The operation to be performed on the provided Dynatrace source fields.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-connectoroperator.html#cfn-appflow-flow-connectoroperator-dynatrace)
       */
      override fun dynatrace(): String? = unwrap(this).getDynatrace()

      /**
       * The operation to be performed on the provided Google Analytics source fields.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-connectoroperator.html#cfn-appflow-flow-connectoroperator-googleanalytics)
       */
      override fun googleAnalytics(): String? = unwrap(this).getGoogleAnalytics()

      /**
       * The operation to be performed on the provided Infor Nexus source fields.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-connectoroperator.html#cfn-appflow-flow-connectoroperator-infornexus)
       */
      override fun inforNexus(): String? = unwrap(this).getInforNexus()

      /**
       * The operation to be performed on the provided Marketo source fields.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-connectoroperator.html#cfn-appflow-flow-connectoroperator-marketo)
       */
      override fun marketo(): String? = unwrap(this).getMarketo()

      /**
       * The operation to be performed on the provided Salesforce Pardot source fields.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-connectoroperator.html#cfn-appflow-flow-connectoroperator-pardot)
       */
      override fun pardot(): String? = unwrap(this).getPardot()

      /**
       * The operation to be performed on the provided Amazon S3 source fields.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-connectoroperator.html#cfn-appflow-flow-connectoroperator-s3)
       */
      override fun s3(): String? = unwrap(this).getS3()

      /**
       * The operation to be performed on the provided Salesforce source fields.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-connectoroperator.html#cfn-appflow-flow-connectoroperator-salesforce)
       */
      override fun salesforce(): String? = unwrap(this).getSalesforce()

      /**
       * The operation to be performed on the provided SAPOData source fields.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-connectoroperator.html#cfn-appflow-flow-connectoroperator-sapodata)
       */
      override fun sapoData(): String? = unwrap(this).getSapoData()

      /**
       * The operation to be performed on the provided ServiceNow source fields.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-connectoroperator.html#cfn-appflow-flow-connectoroperator-servicenow)
       */
      override fun serviceNow(): String? = unwrap(this).getServiceNow()

      /**
       * The operation to be performed on the provided Singular source fields.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-connectoroperator.html#cfn-appflow-flow-connectoroperator-singular)
       */
      override fun singular(): String? = unwrap(this).getSingular()

      /**
       * The operation to be performed on the provided Slack source fields.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-connectoroperator.html#cfn-appflow-flow-connectoroperator-slack)
       */
      override fun slack(): String? = unwrap(this).getSlack()

      /**
       * The operation to be performed on the provided Trend Micro source fields.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-connectoroperator.html#cfn-appflow-flow-connectoroperator-trendmicro)
       */
      override fun trendmicro(): String? = unwrap(this).getTrendmicro()

      /**
       * The operation to be performed on the provided Veeva source fields.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-connectoroperator.html#cfn-appflow-flow-connectoroperator-veeva)
       */
      override fun veeva(): String? = unwrap(this).getVeeva()

      /**
       * The operation to be performed on the provided Zendesk source fields.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-connectoroperator.html#cfn-appflow-flow-connectoroperator-zendesk)
       */
      override fun zendesk(): String? = unwrap(this).getZendesk()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConnectorOperatorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.ConnectorOperatorProperty):
          ConnectorOperatorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectorOperatorProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.ConnectorOperatorProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnFlow.ConnectorOperatorProperty
    }
  }

  /**
   * Specifies the information that is required to query a particular connector.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appflow.*;
   * SourceConnectorPropertiesProperty sourceConnectorPropertiesProperty =
   * SourceConnectorPropertiesProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sourceconnectorproperties.html)
   */
  public interface SourceConnectorPropertiesProperty {
    /**
     * Specifies the information that is required for querying Amplitude.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sourceconnectorproperties.html#cfn-appflow-flow-sourceconnectorproperties-amplitude)
     */
    public fun amplitude(): Any? = unwrap(this).getAmplitude()

    /**
     * The properties that are applied when the custom connector is being used as a source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sourceconnectorproperties.html#cfn-appflow-flow-sourceconnectorproperties-customconnector)
     */
    public fun customConnector(): Any? = unwrap(this).getCustomConnector()

    /**
     * Specifies the information that is required for querying Datadog.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sourceconnectorproperties.html#cfn-appflow-flow-sourceconnectorproperties-datadog)
     */
    public fun datadog(): Any? = unwrap(this).getDatadog()

    /**
     * Specifies the information that is required for querying Dynatrace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sourceconnectorproperties.html#cfn-appflow-flow-sourceconnectorproperties-dynatrace)
     */
    public fun dynatrace(): Any? = unwrap(this).getDynatrace()

    /**
     * Specifies the information that is required for querying Google Analytics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sourceconnectorproperties.html#cfn-appflow-flow-sourceconnectorproperties-googleanalytics)
     */
    public fun googleAnalytics(): Any? = unwrap(this).getGoogleAnalytics()

    /**
     * Specifies the information that is required for querying Infor Nexus.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sourceconnectorproperties.html#cfn-appflow-flow-sourceconnectorproperties-infornexus)
     */
    public fun inforNexus(): Any? = unwrap(this).getInforNexus()

    /**
     * Specifies the information that is required for querying Marketo.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sourceconnectorproperties.html#cfn-appflow-flow-sourceconnectorproperties-marketo)
     */
    public fun marketo(): Any? = unwrap(this).getMarketo()

    /**
     * Specifies the information that is required for querying Salesforce Pardot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sourceconnectorproperties.html#cfn-appflow-flow-sourceconnectorproperties-pardot)
     */
    public fun pardot(): Any? = unwrap(this).getPardot()

    /**
     * Specifies the information that is required for querying Amazon S3.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sourceconnectorproperties.html#cfn-appflow-flow-sourceconnectorproperties-s3)
     */
    public fun s3(): Any? = unwrap(this).getS3()

    /**
     * Specifies the information that is required for querying Salesforce.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sourceconnectorproperties.html#cfn-appflow-flow-sourceconnectorproperties-salesforce)
     */
    public fun salesforce(): Any? = unwrap(this).getSalesforce()

    /**
     * The properties that are applied when using SAPOData as a flow source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sourceconnectorproperties.html#cfn-appflow-flow-sourceconnectorproperties-sapodata)
     */
    public fun sapoData(): Any? = unwrap(this).getSapoData()

    /**
     * Specifies the information that is required for querying ServiceNow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sourceconnectorproperties.html#cfn-appflow-flow-sourceconnectorproperties-servicenow)
     */
    public fun serviceNow(): Any? = unwrap(this).getServiceNow()

    /**
     * Specifies the information that is required for querying Singular.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sourceconnectorproperties.html#cfn-appflow-flow-sourceconnectorproperties-singular)
     */
    public fun singular(): Any? = unwrap(this).getSingular()

    /**
     * Specifies the information that is required for querying Slack.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sourceconnectorproperties.html#cfn-appflow-flow-sourceconnectorproperties-slack)
     */
    public fun slack(): Any? = unwrap(this).getSlack()

    /**
     * Specifies the information that is required for querying Trend Micro.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sourceconnectorproperties.html#cfn-appflow-flow-sourceconnectorproperties-trendmicro)
     */
    public fun trendmicro(): Any? = unwrap(this).getTrendmicro()

    /**
     * Specifies the information that is required for querying Veeva.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sourceconnectorproperties.html#cfn-appflow-flow-sourceconnectorproperties-veeva)
     */
    public fun veeva(): Any? = unwrap(this).getVeeva()

    /**
     * Specifies the information that is required for querying Zendesk.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sourceconnectorproperties.html#cfn-appflow-flow-sourceconnectorproperties-zendesk)
     */
    public fun zendesk(): Any? = unwrap(this).getZendesk()

    /**
     * A builder for [SourceConnectorPropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param amplitude Specifies the information that is required for querying Amplitude.
       */
      public fun amplitude(amplitude: IResolvable)

      /**
       * @param amplitude Specifies the information that is required for querying Amplitude.
       */
      public fun amplitude(amplitude: AmplitudeSourcePropertiesProperty)

      /**
       * @param amplitude Specifies the information that is required for querying Amplitude.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bb35f6b9258846219cd95dafd31c938237d36e4ce3a1556c95a1d6aecd0e685d")
      public fun amplitude(amplitude: AmplitudeSourcePropertiesProperty.Builder.() -> Unit)

      /**
       * @param customConnector The properties that are applied when the custom connector is being
       * used as a source.
       */
      public fun customConnector(customConnector: IResolvable)

      /**
       * @param customConnector The properties that are applied when the custom connector is being
       * used as a source.
       */
      public fun customConnector(customConnector: CustomConnectorSourcePropertiesProperty)

      /**
       * @param customConnector The properties that are applied when the custom connector is being
       * used as a source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("892af92fbdf6bc58ec0347a2a82efb97c7554f89ec0313e8decd22eeca6a8347")
      public
          fun customConnector(customConnector: CustomConnectorSourcePropertiesProperty.Builder.() -> Unit)

      /**
       * @param datadog Specifies the information that is required for querying Datadog.
       */
      public fun datadog(datadog: IResolvable)

      /**
       * @param datadog Specifies the information that is required for querying Datadog.
       */
      public fun datadog(datadog: DatadogSourcePropertiesProperty)

      /**
       * @param datadog Specifies the information that is required for querying Datadog.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("76208df19bab6e17a6e8a02e32038b136a2a9b7a69c47685c80a73e5c6425241")
      public fun datadog(datadog: DatadogSourcePropertiesProperty.Builder.() -> Unit)

      /**
       * @param dynatrace Specifies the information that is required for querying Dynatrace.
       */
      public fun dynatrace(dynatrace: IResolvable)

      /**
       * @param dynatrace Specifies the information that is required for querying Dynatrace.
       */
      public fun dynatrace(dynatrace: DynatraceSourcePropertiesProperty)

      /**
       * @param dynatrace Specifies the information that is required for querying Dynatrace.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b1445c43826d94c7ef49bb243f14573a49dcff09184d1efdeda0b496c44189aa")
      public fun dynatrace(dynatrace: DynatraceSourcePropertiesProperty.Builder.() -> Unit)

      /**
       * @param googleAnalytics Specifies the information that is required for querying Google
       * Analytics.
       */
      public fun googleAnalytics(googleAnalytics: IResolvable)

      /**
       * @param googleAnalytics Specifies the information that is required for querying Google
       * Analytics.
       */
      public fun googleAnalytics(googleAnalytics: GoogleAnalyticsSourcePropertiesProperty)

      /**
       * @param googleAnalytics Specifies the information that is required for querying Google
       * Analytics.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5188ec0577ffd946c7ef76fbbe4f2e23ad8a539bc7a32ecfc9b4e91bcfbba003")
      public
          fun googleAnalytics(googleAnalytics: GoogleAnalyticsSourcePropertiesProperty.Builder.() -> Unit)

      /**
       * @param inforNexus Specifies the information that is required for querying Infor Nexus.
       */
      public fun inforNexus(inforNexus: IResolvable)

      /**
       * @param inforNexus Specifies the information that is required for querying Infor Nexus.
       */
      public fun inforNexus(inforNexus: InforNexusSourcePropertiesProperty)

      /**
       * @param inforNexus Specifies the information that is required for querying Infor Nexus.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("84905cc9ed238b015f19c3f2d8cfa80479df95f8d3c59443545e1ab0361bc716")
      public fun inforNexus(inforNexus: InforNexusSourcePropertiesProperty.Builder.() -> Unit)

      /**
       * @param marketo Specifies the information that is required for querying Marketo.
       */
      public fun marketo(marketo: IResolvable)

      /**
       * @param marketo Specifies the information that is required for querying Marketo.
       */
      public fun marketo(marketo: MarketoSourcePropertiesProperty)

      /**
       * @param marketo Specifies the information that is required for querying Marketo.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("eac2e3a380aeb37be1d0995732bab83aa975dc082f8bc73343b5b65fd09261d0")
      public fun marketo(marketo: MarketoSourcePropertiesProperty.Builder.() -> Unit)

      /**
       * @param pardot Specifies the information that is required for querying Salesforce Pardot.
       */
      public fun pardot(pardot: IResolvable)

      /**
       * @param pardot Specifies the information that is required for querying Salesforce Pardot.
       */
      public fun pardot(pardot: PardotSourcePropertiesProperty)

      /**
       * @param pardot Specifies the information that is required for querying Salesforce Pardot.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("24ab87924ab88f72615053e95eb607abb84ac3c261242a3f125f529982e3dd5b")
      public fun pardot(pardot: PardotSourcePropertiesProperty.Builder.() -> Unit)

      /**
       * @param s3 Specifies the information that is required for querying Amazon S3.
       */
      public fun s3(s3: IResolvable)

      /**
       * @param s3 Specifies the information that is required for querying Amazon S3.
       */
      public fun s3(s3: S3SourcePropertiesProperty)

      /**
       * @param s3 Specifies the information that is required for querying Amazon S3.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("16b7a1f4c984c583213c54000d598d8f8380fc3c6d89a43bdb8c55b6b2ffc76f")
      public fun s3(s3: S3SourcePropertiesProperty.Builder.() -> Unit)

      /**
       * @param salesforce Specifies the information that is required for querying Salesforce.
       */
      public fun salesforce(salesforce: IResolvable)

      /**
       * @param salesforce Specifies the information that is required for querying Salesforce.
       */
      public fun salesforce(salesforce: SalesforceSourcePropertiesProperty)

      /**
       * @param salesforce Specifies the information that is required for querying Salesforce.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("84e751dbcc66ddddff42ae7200a0ed44711f742d4dfe05bf70c561b8114859ad")
      public fun salesforce(salesforce: SalesforceSourcePropertiesProperty.Builder.() -> Unit)

      /**
       * @param sapoData The properties that are applied when using SAPOData as a flow source.
       */
      public fun sapoData(sapoData: IResolvable)

      /**
       * @param sapoData The properties that are applied when using SAPOData as a flow source.
       */
      public fun sapoData(sapoData: SAPODataSourcePropertiesProperty)

      /**
       * @param sapoData The properties that are applied when using SAPOData as a flow source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a91720667417ba79f50c8a6a05f832fc8455bdcf61489a13ee475a30fde1898b")
      public fun sapoData(sapoData: SAPODataSourcePropertiesProperty.Builder.() -> Unit)

      /**
       * @param serviceNow Specifies the information that is required for querying ServiceNow.
       */
      public fun serviceNow(serviceNow: IResolvable)

      /**
       * @param serviceNow Specifies the information that is required for querying ServiceNow.
       */
      public fun serviceNow(serviceNow: ServiceNowSourcePropertiesProperty)

      /**
       * @param serviceNow Specifies the information that is required for querying ServiceNow.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("12b7a21810002ad5992a3ab65c20388543a23a79848ae6db912cb4035142695f")
      public fun serviceNow(serviceNow: ServiceNowSourcePropertiesProperty.Builder.() -> Unit)

      /**
       * @param singular Specifies the information that is required for querying Singular.
       */
      public fun singular(singular: IResolvable)

      /**
       * @param singular Specifies the information that is required for querying Singular.
       */
      public fun singular(singular: SingularSourcePropertiesProperty)

      /**
       * @param singular Specifies the information that is required for querying Singular.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("64c9d9db11035899e00f8dfeb0ccd08f8dc0169446816393aef91944bb0ca885")
      public fun singular(singular: SingularSourcePropertiesProperty.Builder.() -> Unit)

      /**
       * @param slack Specifies the information that is required for querying Slack.
       */
      public fun slack(slack: IResolvable)

      /**
       * @param slack Specifies the information that is required for querying Slack.
       */
      public fun slack(slack: SlackSourcePropertiesProperty)

      /**
       * @param slack Specifies the information that is required for querying Slack.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("076829098515df6edb64e0f5c9236f65e86ee4970592d3b082bf5e2197cfbbbc")
      public fun slack(slack: SlackSourcePropertiesProperty.Builder.() -> Unit)

      /**
       * @param trendmicro Specifies the information that is required for querying Trend Micro.
       */
      public fun trendmicro(trendmicro: IResolvable)

      /**
       * @param trendmicro Specifies the information that is required for querying Trend Micro.
       */
      public fun trendmicro(trendmicro: TrendmicroSourcePropertiesProperty)

      /**
       * @param trendmicro Specifies the information that is required for querying Trend Micro.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1af1b3f8977ca1403cdaea86cbe2044fdc85d748515000d7070bb0dc50d878da")
      public fun trendmicro(trendmicro: TrendmicroSourcePropertiesProperty.Builder.() -> Unit)

      /**
       * @param veeva Specifies the information that is required for querying Veeva.
       */
      public fun veeva(veeva: IResolvable)

      /**
       * @param veeva Specifies the information that is required for querying Veeva.
       */
      public fun veeva(veeva: VeevaSourcePropertiesProperty)

      /**
       * @param veeva Specifies the information that is required for querying Veeva.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("646d9699b47c49c070682ffdb3e12c7342a1999f206204935b8cd2d430eb854b")
      public fun veeva(veeva: VeevaSourcePropertiesProperty.Builder.() -> Unit)

      /**
       * @param zendesk Specifies the information that is required for querying Zendesk.
       */
      public fun zendesk(zendesk: IResolvable)

      /**
       * @param zendesk Specifies the information that is required for querying Zendesk.
       */
      public fun zendesk(zendesk: ZendeskSourcePropertiesProperty)

      /**
       * @param zendesk Specifies the information that is required for querying Zendesk.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("95326e224b4f1217bf7962e047c13e31d49b9488908b39bd4918c5743554e103")
      public fun zendesk(zendesk: ZendeskSourcePropertiesProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.SourceConnectorPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnFlow.SourceConnectorPropertiesProperty.builder()

      /**
       * @param amplitude Specifies the information that is required for querying Amplitude.
       */
      override fun amplitude(amplitude: IResolvable) {
        cdkBuilder.amplitude(amplitude.let(IResolvable::unwrap))
      }

      /**
       * @param amplitude Specifies the information that is required for querying Amplitude.
       */
      override fun amplitude(amplitude: AmplitudeSourcePropertiesProperty) {
        cdkBuilder.amplitude(amplitude.let(AmplitudeSourcePropertiesProperty::unwrap))
      }

      /**
       * @param amplitude Specifies the information that is required for querying Amplitude.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bb35f6b9258846219cd95dafd31c938237d36e4ce3a1556c95a1d6aecd0e685d")
      override fun amplitude(amplitude: AmplitudeSourcePropertiesProperty.Builder.() -> Unit): Unit
          = amplitude(AmplitudeSourcePropertiesProperty(amplitude))

      /**
       * @param customConnector The properties that are applied when the custom connector is being
       * used as a source.
       */
      override fun customConnector(customConnector: IResolvable) {
        cdkBuilder.customConnector(customConnector.let(IResolvable::unwrap))
      }

      /**
       * @param customConnector The properties that are applied when the custom connector is being
       * used as a source.
       */
      override fun customConnector(customConnector: CustomConnectorSourcePropertiesProperty) {
        cdkBuilder.customConnector(customConnector.let(CustomConnectorSourcePropertiesProperty::unwrap))
      }

      /**
       * @param customConnector The properties that are applied when the custom connector is being
       * used as a source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("892af92fbdf6bc58ec0347a2a82efb97c7554f89ec0313e8decd22eeca6a8347")
      override
          fun customConnector(customConnector: CustomConnectorSourcePropertiesProperty.Builder.() -> Unit):
          Unit = customConnector(CustomConnectorSourcePropertiesProperty(customConnector))

      /**
       * @param datadog Specifies the information that is required for querying Datadog.
       */
      override fun datadog(datadog: IResolvable) {
        cdkBuilder.datadog(datadog.let(IResolvable::unwrap))
      }

      /**
       * @param datadog Specifies the information that is required for querying Datadog.
       */
      override fun datadog(datadog: DatadogSourcePropertiesProperty) {
        cdkBuilder.datadog(datadog.let(DatadogSourcePropertiesProperty::unwrap))
      }

      /**
       * @param datadog Specifies the information that is required for querying Datadog.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("76208df19bab6e17a6e8a02e32038b136a2a9b7a69c47685c80a73e5c6425241")
      override fun datadog(datadog: DatadogSourcePropertiesProperty.Builder.() -> Unit): Unit =
          datadog(DatadogSourcePropertiesProperty(datadog))

      /**
       * @param dynatrace Specifies the information that is required for querying Dynatrace.
       */
      override fun dynatrace(dynatrace: IResolvable) {
        cdkBuilder.dynatrace(dynatrace.let(IResolvable::unwrap))
      }

      /**
       * @param dynatrace Specifies the information that is required for querying Dynatrace.
       */
      override fun dynatrace(dynatrace: DynatraceSourcePropertiesProperty) {
        cdkBuilder.dynatrace(dynatrace.let(DynatraceSourcePropertiesProperty::unwrap))
      }

      /**
       * @param dynatrace Specifies the information that is required for querying Dynatrace.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b1445c43826d94c7ef49bb243f14573a49dcff09184d1efdeda0b496c44189aa")
      override fun dynatrace(dynatrace: DynatraceSourcePropertiesProperty.Builder.() -> Unit): Unit
          = dynatrace(DynatraceSourcePropertiesProperty(dynatrace))

      /**
       * @param googleAnalytics Specifies the information that is required for querying Google
       * Analytics.
       */
      override fun googleAnalytics(googleAnalytics: IResolvable) {
        cdkBuilder.googleAnalytics(googleAnalytics.let(IResolvable::unwrap))
      }

      /**
       * @param googleAnalytics Specifies the information that is required for querying Google
       * Analytics.
       */
      override fun googleAnalytics(googleAnalytics: GoogleAnalyticsSourcePropertiesProperty) {
        cdkBuilder.googleAnalytics(googleAnalytics.let(GoogleAnalyticsSourcePropertiesProperty::unwrap))
      }

      /**
       * @param googleAnalytics Specifies the information that is required for querying Google
       * Analytics.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5188ec0577ffd946c7ef76fbbe4f2e23ad8a539bc7a32ecfc9b4e91bcfbba003")
      override
          fun googleAnalytics(googleAnalytics: GoogleAnalyticsSourcePropertiesProperty.Builder.() -> Unit):
          Unit = googleAnalytics(GoogleAnalyticsSourcePropertiesProperty(googleAnalytics))

      /**
       * @param inforNexus Specifies the information that is required for querying Infor Nexus.
       */
      override fun inforNexus(inforNexus: IResolvable) {
        cdkBuilder.inforNexus(inforNexus.let(IResolvable::unwrap))
      }

      /**
       * @param inforNexus Specifies the information that is required for querying Infor Nexus.
       */
      override fun inforNexus(inforNexus: InforNexusSourcePropertiesProperty) {
        cdkBuilder.inforNexus(inforNexus.let(InforNexusSourcePropertiesProperty::unwrap))
      }

      /**
       * @param inforNexus Specifies the information that is required for querying Infor Nexus.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("84905cc9ed238b015f19c3f2d8cfa80479df95f8d3c59443545e1ab0361bc716")
      override fun inforNexus(inforNexus: InforNexusSourcePropertiesProperty.Builder.() -> Unit):
          Unit = inforNexus(InforNexusSourcePropertiesProperty(inforNexus))

      /**
       * @param marketo Specifies the information that is required for querying Marketo.
       */
      override fun marketo(marketo: IResolvable) {
        cdkBuilder.marketo(marketo.let(IResolvable::unwrap))
      }

      /**
       * @param marketo Specifies the information that is required for querying Marketo.
       */
      override fun marketo(marketo: MarketoSourcePropertiesProperty) {
        cdkBuilder.marketo(marketo.let(MarketoSourcePropertiesProperty::unwrap))
      }

      /**
       * @param marketo Specifies the information that is required for querying Marketo.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("eac2e3a380aeb37be1d0995732bab83aa975dc082f8bc73343b5b65fd09261d0")
      override fun marketo(marketo: MarketoSourcePropertiesProperty.Builder.() -> Unit): Unit =
          marketo(MarketoSourcePropertiesProperty(marketo))

      /**
       * @param pardot Specifies the information that is required for querying Salesforce Pardot.
       */
      override fun pardot(pardot: IResolvable) {
        cdkBuilder.pardot(pardot.let(IResolvable::unwrap))
      }

      /**
       * @param pardot Specifies the information that is required for querying Salesforce Pardot.
       */
      override fun pardot(pardot: PardotSourcePropertiesProperty) {
        cdkBuilder.pardot(pardot.let(PardotSourcePropertiesProperty::unwrap))
      }

      /**
       * @param pardot Specifies the information that is required for querying Salesforce Pardot.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("24ab87924ab88f72615053e95eb607abb84ac3c261242a3f125f529982e3dd5b")
      override fun pardot(pardot: PardotSourcePropertiesProperty.Builder.() -> Unit): Unit =
          pardot(PardotSourcePropertiesProperty(pardot))

      /**
       * @param s3 Specifies the information that is required for querying Amazon S3.
       */
      override fun s3(s3: IResolvable) {
        cdkBuilder.s3(s3.let(IResolvable::unwrap))
      }

      /**
       * @param s3 Specifies the information that is required for querying Amazon S3.
       */
      override fun s3(s3: S3SourcePropertiesProperty) {
        cdkBuilder.s3(s3.let(S3SourcePropertiesProperty::unwrap))
      }

      /**
       * @param s3 Specifies the information that is required for querying Amazon S3.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("16b7a1f4c984c583213c54000d598d8f8380fc3c6d89a43bdb8c55b6b2ffc76f")
      override fun s3(s3: S3SourcePropertiesProperty.Builder.() -> Unit): Unit =
          s3(S3SourcePropertiesProperty(s3))

      /**
       * @param salesforce Specifies the information that is required for querying Salesforce.
       */
      override fun salesforce(salesforce: IResolvable) {
        cdkBuilder.salesforce(salesforce.let(IResolvable::unwrap))
      }

      /**
       * @param salesforce Specifies the information that is required for querying Salesforce.
       */
      override fun salesforce(salesforce: SalesforceSourcePropertiesProperty) {
        cdkBuilder.salesforce(salesforce.let(SalesforceSourcePropertiesProperty::unwrap))
      }

      /**
       * @param salesforce Specifies the information that is required for querying Salesforce.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("84e751dbcc66ddddff42ae7200a0ed44711f742d4dfe05bf70c561b8114859ad")
      override fun salesforce(salesforce: SalesforceSourcePropertiesProperty.Builder.() -> Unit):
          Unit = salesforce(SalesforceSourcePropertiesProperty(salesforce))

      /**
       * @param sapoData The properties that are applied when using SAPOData as a flow source.
       */
      override fun sapoData(sapoData: IResolvable) {
        cdkBuilder.sapoData(sapoData.let(IResolvable::unwrap))
      }

      /**
       * @param sapoData The properties that are applied when using SAPOData as a flow source.
       */
      override fun sapoData(sapoData: SAPODataSourcePropertiesProperty) {
        cdkBuilder.sapoData(sapoData.let(SAPODataSourcePropertiesProperty::unwrap))
      }

      /**
       * @param sapoData The properties that are applied when using SAPOData as a flow source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a91720667417ba79f50c8a6a05f832fc8455bdcf61489a13ee475a30fde1898b")
      override fun sapoData(sapoData: SAPODataSourcePropertiesProperty.Builder.() -> Unit): Unit =
          sapoData(SAPODataSourcePropertiesProperty(sapoData))

      /**
       * @param serviceNow Specifies the information that is required for querying ServiceNow.
       */
      override fun serviceNow(serviceNow: IResolvable) {
        cdkBuilder.serviceNow(serviceNow.let(IResolvable::unwrap))
      }

      /**
       * @param serviceNow Specifies the information that is required for querying ServiceNow.
       */
      override fun serviceNow(serviceNow: ServiceNowSourcePropertiesProperty) {
        cdkBuilder.serviceNow(serviceNow.let(ServiceNowSourcePropertiesProperty::unwrap))
      }

      /**
       * @param serviceNow Specifies the information that is required for querying ServiceNow.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("12b7a21810002ad5992a3ab65c20388543a23a79848ae6db912cb4035142695f")
      override fun serviceNow(serviceNow: ServiceNowSourcePropertiesProperty.Builder.() -> Unit):
          Unit = serviceNow(ServiceNowSourcePropertiesProperty(serviceNow))

      /**
       * @param singular Specifies the information that is required for querying Singular.
       */
      override fun singular(singular: IResolvable) {
        cdkBuilder.singular(singular.let(IResolvable::unwrap))
      }

      /**
       * @param singular Specifies the information that is required for querying Singular.
       */
      override fun singular(singular: SingularSourcePropertiesProperty) {
        cdkBuilder.singular(singular.let(SingularSourcePropertiesProperty::unwrap))
      }

      /**
       * @param singular Specifies the information that is required for querying Singular.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("64c9d9db11035899e00f8dfeb0ccd08f8dc0169446816393aef91944bb0ca885")
      override fun singular(singular: SingularSourcePropertiesProperty.Builder.() -> Unit): Unit =
          singular(SingularSourcePropertiesProperty(singular))

      /**
       * @param slack Specifies the information that is required for querying Slack.
       */
      override fun slack(slack: IResolvable) {
        cdkBuilder.slack(slack.let(IResolvable::unwrap))
      }

      /**
       * @param slack Specifies the information that is required for querying Slack.
       */
      override fun slack(slack: SlackSourcePropertiesProperty) {
        cdkBuilder.slack(slack.let(SlackSourcePropertiesProperty::unwrap))
      }

      /**
       * @param slack Specifies the information that is required for querying Slack.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("076829098515df6edb64e0f5c9236f65e86ee4970592d3b082bf5e2197cfbbbc")
      override fun slack(slack: SlackSourcePropertiesProperty.Builder.() -> Unit): Unit =
          slack(SlackSourcePropertiesProperty(slack))

      /**
       * @param trendmicro Specifies the information that is required for querying Trend Micro.
       */
      override fun trendmicro(trendmicro: IResolvable) {
        cdkBuilder.trendmicro(trendmicro.let(IResolvable::unwrap))
      }

      /**
       * @param trendmicro Specifies the information that is required for querying Trend Micro.
       */
      override fun trendmicro(trendmicro: TrendmicroSourcePropertiesProperty) {
        cdkBuilder.trendmicro(trendmicro.let(TrendmicroSourcePropertiesProperty::unwrap))
      }

      /**
       * @param trendmicro Specifies the information that is required for querying Trend Micro.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1af1b3f8977ca1403cdaea86cbe2044fdc85d748515000d7070bb0dc50d878da")
      override fun trendmicro(trendmicro: TrendmicroSourcePropertiesProperty.Builder.() -> Unit):
          Unit = trendmicro(TrendmicroSourcePropertiesProperty(trendmicro))

      /**
       * @param veeva Specifies the information that is required for querying Veeva.
       */
      override fun veeva(veeva: IResolvable) {
        cdkBuilder.veeva(veeva.let(IResolvable::unwrap))
      }

      /**
       * @param veeva Specifies the information that is required for querying Veeva.
       */
      override fun veeva(veeva: VeevaSourcePropertiesProperty) {
        cdkBuilder.veeva(veeva.let(VeevaSourcePropertiesProperty::unwrap))
      }

      /**
       * @param veeva Specifies the information that is required for querying Veeva.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("646d9699b47c49c070682ffdb3e12c7342a1999f206204935b8cd2d430eb854b")
      override fun veeva(veeva: VeevaSourcePropertiesProperty.Builder.() -> Unit): Unit =
          veeva(VeevaSourcePropertiesProperty(veeva))

      /**
       * @param zendesk Specifies the information that is required for querying Zendesk.
       */
      override fun zendesk(zendesk: IResolvable) {
        cdkBuilder.zendesk(zendesk.let(IResolvable::unwrap))
      }

      /**
       * @param zendesk Specifies the information that is required for querying Zendesk.
       */
      override fun zendesk(zendesk: ZendeskSourcePropertiesProperty) {
        cdkBuilder.zendesk(zendesk.let(ZendeskSourcePropertiesProperty::unwrap))
      }

      /**
       * @param zendesk Specifies the information that is required for querying Zendesk.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("95326e224b4f1217bf7962e047c13e31d49b9488908b39bd4918c5743554e103")
      override fun zendesk(zendesk: ZendeskSourcePropertiesProperty.Builder.() -> Unit): Unit =
          zendesk(ZendeskSourcePropertiesProperty(zendesk))

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.SourceConnectorPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.SourceConnectorPropertiesProperty,
    ) : CdkObject(cdkObject), SourceConnectorPropertiesProperty {
      /**
       * Specifies the information that is required for querying Amplitude.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sourceconnectorproperties.html#cfn-appflow-flow-sourceconnectorproperties-amplitude)
       */
      override fun amplitude(): Any? = unwrap(this).getAmplitude()

      /**
       * The properties that are applied when the custom connector is being used as a source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sourceconnectorproperties.html#cfn-appflow-flow-sourceconnectorproperties-customconnector)
       */
      override fun customConnector(): Any? = unwrap(this).getCustomConnector()

      /**
       * Specifies the information that is required for querying Datadog.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sourceconnectorproperties.html#cfn-appflow-flow-sourceconnectorproperties-datadog)
       */
      override fun datadog(): Any? = unwrap(this).getDatadog()

      /**
       * Specifies the information that is required for querying Dynatrace.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sourceconnectorproperties.html#cfn-appflow-flow-sourceconnectorproperties-dynatrace)
       */
      override fun dynatrace(): Any? = unwrap(this).getDynatrace()

      /**
       * Specifies the information that is required for querying Google Analytics.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sourceconnectorproperties.html#cfn-appflow-flow-sourceconnectorproperties-googleanalytics)
       */
      override fun googleAnalytics(): Any? = unwrap(this).getGoogleAnalytics()

      /**
       * Specifies the information that is required for querying Infor Nexus.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sourceconnectorproperties.html#cfn-appflow-flow-sourceconnectorproperties-infornexus)
       */
      override fun inforNexus(): Any? = unwrap(this).getInforNexus()

      /**
       * Specifies the information that is required for querying Marketo.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sourceconnectorproperties.html#cfn-appflow-flow-sourceconnectorproperties-marketo)
       */
      override fun marketo(): Any? = unwrap(this).getMarketo()

      /**
       * Specifies the information that is required for querying Salesforce Pardot.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sourceconnectorproperties.html#cfn-appflow-flow-sourceconnectorproperties-pardot)
       */
      override fun pardot(): Any? = unwrap(this).getPardot()

      /**
       * Specifies the information that is required for querying Amazon S3.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sourceconnectorproperties.html#cfn-appflow-flow-sourceconnectorproperties-s3)
       */
      override fun s3(): Any? = unwrap(this).getS3()

      /**
       * Specifies the information that is required for querying Salesforce.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sourceconnectorproperties.html#cfn-appflow-flow-sourceconnectorproperties-salesforce)
       */
      override fun salesforce(): Any? = unwrap(this).getSalesforce()

      /**
       * The properties that are applied when using SAPOData as a flow source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sourceconnectorproperties.html#cfn-appflow-flow-sourceconnectorproperties-sapodata)
       */
      override fun sapoData(): Any? = unwrap(this).getSapoData()

      /**
       * Specifies the information that is required for querying ServiceNow.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sourceconnectorproperties.html#cfn-appflow-flow-sourceconnectorproperties-servicenow)
       */
      override fun serviceNow(): Any? = unwrap(this).getServiceNow()

      /**
       * Specifies the information that is required for querying Singular.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sourceconnectorproperties.html#cfn-appflow-flow-sourceconnectorproperties-singular)
       */
      override fun singular(): Any? = unwrap(this).getSingular()

      /**
       * Specifies the information that is required for querying Slack.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sourceconnectorproperties.html#cfn-appflow-flow-sourceconnectorproperties-slack)
       */
      override fun slack(): Any? = unwrap(this).getSlack()

      /**
       * Specifies the information that is required for querying Trend Micro.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sourceconnectorproperties.html#cfn-appflow-flow-sourceconnectorproperties-trendmicro)
       */
      override fun trendmicro(): Any? = unwrap(this).getTrendmicro()

      /**
       * Specifies the information that is required for querying Veeva.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sourceconnectorproperties.html#cfn-appflow-flow-sourceconnectorproperties-veeva)
       */
      override fun veeva(): Any? = unwrap(this).getVeeva()

      /**
       * Specifies the information that is required for querying Zendesk.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sourceconnectorproperties.html#cfn-appflow-flow-sourceconnectorproperties-zendesk)
       */
      override fun zendesk(): Any? = unwrap(this).getZendesk()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SourceConnectorPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.SourceConnectorPropertiesProperty):
          SourceConnectorPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceConnectorPropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.SourceConnectorPropertiesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnFlow.SourceConnectorPropertiesProperty
    }
  }

  /**
   * The properties that are applied when Upsolver is used as a destination.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appflow.*;
   * UpsolverDestinationPropertiesProperty upsolverDestinationPropertiesProperty =
   * UpsolverDestinationPropertiesProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-upsolverdestinationproperties.html)
   */
  public interface UpsolverDestinationPropertiesProperty {
    /**
     * The Upsolver Amazon S3 bucket name in which Amazon AppFlow places the transferred data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-upsolverdestinationproperties.html#cfn-appflow-flow-upsolverdestinationproperties-bucketname)
     */
    public fun bucketName(): String

    /**
     * The object key for the destination Upsolver Amazon S3 bucket in which Amazon AppFlow places
     * the files.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-upsolverdestinationproperties.html#cfn-appflow-flow-upsolverdestinationproperties-bucketprefix)
     */
    public fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

    /**
     * The configuration that determines how data is formatted when Upsolver is used as the flow
     * destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-upsolverdestinationproperties.html#cfn-appflow-flow-upsolverdestinationproperties-s3outputformatconfig)
     */
    public fun s3OutputFormatConfig(): Any

    /**
     * A builder for [UpsolverDestinationPropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucketName The Upsolver Amazon S3 bucket name in which Amazon AppFlow places the
       * transferred data. 
       */
      public fun bucketName(bucketName: String)

      /**
       * @param bucketPrefix The object key for the destination Upsolver Amazon S3 bucket in which
       * Amazon AppFlow places the files.
       */
      public fun bucketPrefix(bucketPrefix: String)

      /**
       * @param s3OutputFormatConfig The configuration that determines how data is formatted when
       * Upsolver is used as the flow destination. 
       */
      public fun s3OutputFormatConfig(s3OutputFormatConfig: IResolvable)

      /**
       * @param s3OutputFormatConfig The configuration that determines how data is formatted when
       * Upsolver is used as the flow destination. 
       */
      public fun s3OutputFormatConfig(s3OutputFormatConfig: UpsolverS3OutputFormatConfigProperty)

      /**
       * @param s3OutputFormatConfig The configuration that determines how data is formatted when
       * Upsolver is used as the flow destination. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("78dc8df17f3259b10b67973a50f45ac02be70e3fe12a4b021c6f6142acad43fb")
      public
          fun s3OutputFormatConfig(s3OutputFormatConfig: UpsolverS3OutputFormatConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.UpsolverDestinationPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnFlow.UpsolverDestinationPropertiesProperty.builder()

      /**
       * @param bucketName The Upsolver Amazon S3 bucket name in which Amazon AppFlow places the
       * transferred data. 
       */
      override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      /**
       * @param bucketPrefix The object key for the destination Upsolver Amazon S3 bucket in which
       * Amazon AppFlow places the files.
       */
      override fun bucketPrefix(bucketPrefix: String) {
        cdkBuilder.bucketPrefix(bucketPrefix)
      }

      /**
       * @param s3OutputFormatConfig The configuration that determines how data is formatted when
       * Upsolver is used as the flow destination. 
       */
      override fun s3OutputFormatConfig(s3OutputFormatConfig: IResolvable) {
        cdkBuilder.s3OutputFormatConfig(s3OutputFormatConfig.let(IResolvable::unwrap))
      }

      /**
       * @param s3OutputFormatConfig The configuration that determines how data is formatted when
       * Upsolver is used as the flow destination. 
       */
      override
          fun s3OutputFormatConfig(s3OutputFormatConfig: UpsolverS3OutputFormatConfigProperty) {
        cdkBuilder.s3OutputFormatConfig(s3OutputFormatConfig.let(UpsolverS3OutputFormatConfigProperty::unwrap))
      }

      /**
       * @param s3OutputFormatConfig The configuration that determines how data is formatted when
       * Upsolver is used as the flow destination. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("78dc8df17f3259b10b67973a50f45ac02be70e3fe12a4b021c6f6142acad43fb")
      override
          fun s3OutputFormatConfig(s3OutputFormatConfig: UpsolverS3OutputFormatConfigProperty.Builder.() -> Unit):
          Unit = s3OutputFormatConfig(UpsolverS3OutputFormatConfigProperty(s3OutputFormatConfig))

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.UpsolverDestinationPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.UpsolverDestinationPropertiesProperty,
    ) : CdkObject(cdkObject), UpsolverDestinationPropertiesProperty {
      /**
       * The Upsolver Amazon S3 bucket name in which Amazon AppFlow places the transferred data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-upsolverdestinationproperties.html#cfn-appflow-flow-upsolverdestinationproperties-bucketname)
       */
      override fun bucketName(): String = unwrap(this).getBucketName()

      /**
       * The object key for the destination Upsolver Amazon S3 bucket in which Amazon AppFlow places
       * the files.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-upsolverdestinationproperties.html#cfn-appflow-flow-upsolverdestinationproperties-bucketprefix)
       */
      override fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

      /**
       * The configuration that determines how data is formatted when Upsolver is used as the flow
       * destination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-upsolverdestinationproperties.html#cfn-appflow-flow-upsolverdestinationproperties-s3outputformatconfig)
       */
      override fun s3OutputFormatConfig(): Any = unwrap(this).getS3OutputFormatConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          UpsolverDestinationPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.UpsolverDestinationPropertiesProperty):
          UpsolverDestinationPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: UpsolverDestinationPropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.UpsolverDestinationPropertiesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnFlow.UpsolverDestinationPropertiesProperty
    }
  }

  /**
   * SAP Source connector page size.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appflow.*;
   * SAPODataPaginationConfigProperty sAPODataPaginationConfigProperty =
   * SAPODataPaginationConfigProperty.builder()
   * .maxPageSize(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sapodatapaginationconfig.html)
   */
  public interface SAPODataPaginationConfigProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sapodatapaginationconfig.html#cfn-appflow-flow-sapodatapaginationconfig-maxpagesize)
     */
    public fun maxPageSize(): Number

    /**
     * A builder for [SAPODataPaginationConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maxPageSize the value to be set. 
       */
      public fun maxPageSize(maxPageSize: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.SAPODataPaginationConfigProperty.Builder =
          software.amazon.awscdk.services.appflow.CfnFlow.SAPODataPaginationConfigProperty.builder()

      /**
       * @param maxPageSize the value to be set. 
       */
      override fun maxPageSize(maxPageSize: Number) {
        cdkBuilder.maxPageSize(maxPageSize)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.SAPODataPaginationConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.SAPODataPaginationConfigProperty,
    ) : CdkObject(cdkObject), SAPODataPaginationConfigProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sapodatapaginationconfig.html#cfn-appflow-flow-sapodatapaginationconfig-maxpagesize)
       */
      override fun maxPageSize(): Number = unwrap(this).getMaxPageSize()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SAPODataPaginationConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.SAPODataPaginationConfigProperty):
          SAPODataPaginationConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SAPODataPaginationConfigProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.SAPODataPaginationConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnFlow.SAPODataPaginationConfigProperty
    }
  }

  /**
   * Specifies the configuration that Amazon AppFlow uses when it catalogs your data.
   *
   * When Amazon AppFlow catalogs your data, it stores metadata in a data catalog.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appflow.*;
   * MetadataCatalogConfigProperty metadataCatalogConfigProperty =
   * MetadataCatalogConfigProperty.builder()
   * .glueDataCatalog(GlueDataCatalogProperty.builder()
   * .databaseName("databaseName")
   * .roleArn("roleArn")
   * .tablePrefix("tablePrefix")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-metadatacatalogconfig.html)
   */
  public interface MetadataCatalogConfigProperty {
    /**
     * Specifies the configuration that Amazon AppFlow uses when it catalogs your data with the AWS
     * Glue Data Catalog .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-metadatacatalogconfig.html#cfn-appflow-flow-metadatacatalogconfig-gluedatacatalog)
     */
    public fun glueDataCatalog(): Any? = unwrap(this).getGlueDataCatalog()

    /**
     * A builder for [MetadataCatalogConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param glueDataCatalog Specifies the configuration that Amazon AppFlow uses when it
       * catalogs your data with the AWS Glue Data Catalog .
       */
      public fun glueDataCatalog(glueDataCatalog: IResolvable)

      /**
       * @param glueDataCatalog Specifies the configuration that Amazon AppFlow uses when it
       * catalogs your data with the AWS Glue Data Catalog .
       */
      public fun glueDataCatalog(glueDataCatalog: GlueDataCatalogProperty)

      /**
       * @param glueDataCatalog Specifies the configuration that Amazon AppFlow uses when it
       * catalogs your data with the AWS Glue Data Catalog .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3d03272fda4f639d1966ee835a77c0951c3b8ecd7142f46054faa44cc8f1f5ee")
      public fun glueDataCatalog(glueDataCatalog: GlueDataCatalogProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.MetadataCatalogConfigProperty.Builder =
          software.amazon.awscdk.services.appflow.CfnFlow.MetadataCatalogConfigProperty.builder()

      /**
       * @param glueDataCatalog Specifies the configuration that Amazon AppFlow uses when it
       * catalogs your data with the AWS Glue Data Catalog .
       */
      override fun glueDataCatalog(glueDataCatalog: IResolvable) {
        cdkBuilder.glueDataCatalog(glueDataCatalog.let(IResolvable::unwrap))
      }

      /**
       * @param glueDataCatalog Specifies the configuration that Amazon AppFlow uses when it
       * catalogs your data with the AWS Glue Data Catalog .
       */
      override fun glueDataCatalog(glueDataCatalog: GlueDataCatalogProperty) {
        cdkBuilder.glueDataCatalog(glueDataCatalog.let(GlueDataCatalogProperty::unwrap))
      }

      /**
       * @param glueDataCatalog Specifies the configuration that Amazon AppFlow uses when it
       * catalogs your data with the AWS Glue Data Catalog .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3d03272fda4f639d1966ee835a77c0951c3b8ecd7142f46054faa44cc8f1f5ee")
      override fun glueDataCatalog(glueDataCatalog: GlueDataCatalogProperty.Builder.() -> Unit):
          Unit = glueDataCatalog(GlueDataCatalogProperty(glueDataCatalog))

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.MetadataCatalogConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.MetadataCatalogConfigProperty,
    ) : CdkObject(cdkObject), MetadataCatalogConfigProperty {
      /**
       * Specifies the configuration that Amazon AppFlow uses when it catalogs your data with the
       * AWS Glue Data Catalog .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-metadatacatalogconfig.html#cfn-appflow-flow-metadatacatalogconfig-gluedatacatalog)
       */
      override fun glueDataCatalog(): Any? = unwrap(this).getGlueDataCatalog()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MetadataCatalogConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.MetadataCatalogConfigProperty):
          MetadataCatalogConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetadataCatalogConfigProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.MetadataCatalogConfigProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnFlow.MetadataCatalogConfigProperty
    }
  }

  /**
   * The properties that are applied when Zendesk is used as a destination.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appflow.*;
   * ZendeskDestinationPropertiesProperty zendeskDestinationPropertiesProperty =
   * ZendeskDestinationPropertiesProperty.builder()
   * .object("object")
   * // the properties below are optional
   * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * .failOnFirstError(false)
   * .build())
   * .idFieldNames(List.of("idFieldNames"))
   * .writeOperationType("writeOperationType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-zendeskdestinationproperties.html)
   */
  public interface ZendeskDestinationPropertiesProperty {
    /**
     * The settings that determine how Amazon AppFlow handles an error when placing data in the
     * destination.
     *
     * For example, this setting would determine if the flow should fail after one insertion error,
     * or continue and attempt to insert every record regardless of the initial failure.
     * `ErrorHandlingConfig` is a part of the destination connector details.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-zendeskdestinationproperties.html#cfn-appflow-flow-zendeskdestinationproperties-errorhandlingconfig)
     */
    public fun errorHandlingConfig(): Any? = unwrap(this).getErrorHandlingConfig()

    /**
     * A list of field names that can be used as an ID field when performing a write operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-zendeskdestinationproperties.html#cfn-appflow-flow-zendeskdestinationproperties-idfieldnames)
     */
    public fun idFieldNames(): List<String> = unwrap(this).getIdFieldNames() ?: emptyList()

    /**
     * The object specified in the Zendesk flow destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-zendeskdestinationproperties.html#cfn-appflow-flow-zendeskdestinationproperties-object)
     */
    public fun `object`(): String

    /**
     * The possible write operations in the destination connector.
     *
     * When this value is not provided, this defaults to the `INSERT` operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-zendeskdestinationproperties.html#cfn-appflow-flow-zendeskdestinationproperties-writeoperationtype)
     */
    public fun writeOperationType(): String? = unwrap(this).getWriteOperationType()

    /**
     * A builder for [ZendeskDestinationPropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param errorHandlingConfig The settings that determine how Amazon AppFlow handles an error
       * when placing data in the destination.
       * For example, this setting would determine if the flow should fail after one insertion
       * error, or continue and attempt to insert every record regardless of the initial failure.
       * `ErrorHandlingConfig` is a part of the destination connector details.
       */
      public fun errorHandlingConfig(errorHandlingConfig: IResolvable)

      /**
       * @param errorHandlingConfig The settings that determine how Amazon AppFlow handles an error
       * when placing data in the destination.
       * For example, this setting would determine if the flow should fail after one insertion
       * error, or continue and attempt to insert every record regardless of the initial failure.
       * `ErrorHandlingConfig` is a part of the destination connector details.
       */
      public fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty)

      /**
       * @param errorHandlingConfig The settings that determine how Amazon AppFlow handles an error
       * when placing data in the destination.
       * For example, this setting would determine if the flow should fail after one insertion
       * error, or continue and attempt to insert every record regardless of the initial failure.
       * `ErrorHandlingConfig` is a part of the destination connector details.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("19658d5aec2c4972f43d129840676abb1a24cc44fe7dcf88f439dedd406604a6")
      public
          fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty.Builder.() -> Unit)

      /**
       * @param idFieldNames A list of field names that can be used as an ID field when performing a
       * write operation.
       */
      public fun idFieldNames(idFieldNames: List<String>)

      /**
       * @param idFieldNames A list of field names that can be used as an ID field when performing a
       * write operation.
       */
      public fun idFieldNames(vararg idFieldNames: String)

      /**
       * @param object The object specified in the Zendesk flow destination. 
       */
      public fun `object`(`object`: String)

      /**
       * @param writeOperationType The possible write operations in the destination connector.
       * When this value is not provided, this defaults to the `INSERT` operation.
       */
      public fun writeOperationType(writeOperationType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.ZendeskDestinationPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnFlow.ZendeskDestinationPropertiesProperty.builder()

      /**
       * @param errorHandlingConfig The settings that determine how Amazon AppFlow handles an error
       * when placing data in the destination.
       * For example, this setting would determine if the flow should fail after one insertion
       * error, or continue and attempt to insert every record regardless of the initial failure.
       * `ErrorHandlingConfig` is a part of the destination connector details.
       */
      override fun errorHandlingConfig(errorHandlingConfig: IResolvable) {
        cdkBuilder.errorHandlingConfig(errorHandlingConfig.let(IResolvable::unwrap))
      }

      /**
       * @param errorHandlingConfig The settings that determine how Amazon AppFlow handles an error
       * when placing data in the destination.
       * For example, this setting would determine if the flow should fail after one insertion
       * error, or continue and attempt to insert every record regardless of the initial failure.
       * `ErrorHandlingConfig` is a part of the destination connector details.
       */
      override fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty) {
        cdkBuilder.errorHandlingConfig(errorHandlingConfig.let(ErrorHandlingConfigProperty::unwrap))
      }

      /**
       * @param errorHandlingConfig The settings that determine how Amazon AppFlow handles an error
       * when placing data in the destination.
       * For example, this setting would determine if the flow should fail after one insertion
       * error, or continue and attempt to insert every record regardless of the initial failure.
       * `ErrorHandlingConfig` is a part of the destination connector details.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("19658d5aec2c4972f43d129840676abb1a24cc44fe7dcf88f439dedd406604a6")
      override
          fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty.Builder.() -> Unit):
          Unit = errorHandlingConfig(ErrorHandlingConfigProperty(errorHandlingConfig))

      /**
       * @param idFieldNames A list of field names that can be used as an ID field when performing a
       * write operation.
       */
      override fun idFieldNames(idFieldNames: List<String>) {
        cdkBuilder.idFieldNames(idFieldNames)
      }

      /**
       * @param idFieldNames A list of field names that can be used as an ID field when performing a
       * write operation.
       */
      override fun idFieldNames(vararg idFieldNames: String): Unit =
          idFieldNames(idFieldNames.toList())

      /**
       * @param object The object specified in the Zendesk flow destination. 
       */
      override fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
      }

      /**
       * @param writeOperationType The possible write operations in the destination connector.
       * When this value is not provided, this defaults to the `INSERT` operation.
       */
      override fun writeOperationType(writeOperationType: String) {
        cdkBuilder.writeOperationType(writeOperationType)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.ZendeskDestinationPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.ZendeskDestinationPropertiesProperty,
    ) : CdkObject(cdkObject), ZendeskDestinationPropertiesProperty {
      /**
       * The settings that determine how Amazon AppFlow handles an error when placing data in the
       * destination.
       *
       * For example, this setting would determine if the flow should fail after one insertion
       * error, or continue and attempt to insert every record regardless of the initial failure.
       * `ErrorHandlingConfig` is a part of the destination connector details.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-zendeskdestinationproperties.html#cfn-appflow-flow-zendeskdestinationproperties-errorhandlingconfig)
       */
      override fun errorHandlingConfig(): Any? = unwrap(this).getErrorHandlingConfig()

      /**
       * A list of field names that can be used as an ID field when performing a write operation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-zendeskdestinationproperties.html#cfn-appflow-flow-zendeskdestinationproperties-idfieldnames)
       */
      override fun idFieldNames(): List<String> = unwrap(this).getIdFieldNames() ?: emptyList()

      /**
       * The object specified in the Zendesk flow destination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-zendeskdestinationproperties.html#cfn-appflow-flow-zendeskdestinationproperties-object)
       */
      override fun `object`(): String = unwrap(this).getObject()

      /**
       * The possible write operations in the destination connector.
       *
       * When this value is not provided, this defaults to the `INSERT` operation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-zendeskdestinationproperties.html#cfn-appflow-flow-zendeskdestinationproperties-writeoperationtype)
       */
      override fun writeOperationType(): String? = unwrap(this).getWriteOperationType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ZendeskDestinationPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.ZendeskDestinationPropertiesProperty):
          ZendeskDestinationPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ZendeskDestinationPropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.ZendeskDestinationPropertiesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnFlow.ZendeskDestinationPropertiesProperty
    }
  }

  /**
   * The properties that are applied when Amazon S3 is being used as the flow source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appflow.*;
   * S3SourcePropertiesProperty s3SourcePropertiesProperty = S3SourcePropertiesProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * // the properties below are optional
   * .s3InputFormatConfig(S3InputFormatConfigProperty.builder()
   * .s3InputFileType("s3InputFileType")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-s3sourceproperties.html)
   */
  public interface S3SourcePropertiesProperty {
    /**
     * The Amazon S3 bucket name where the source files are stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-s3sourceproperties.html#cfn-appflow-flow-s3sourceproperties-bucketname)
     */
    public fun bucketName(): String

    /**
     * The object key for the Amazon S3 bucket in which the source files are stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-s3sourceproperties.html#cfn-appflow-flow-s3sourceproperties-bucketprefix)
     */
    public fun bucketPrefix(): String

    /**
     * When you use Amazon S3 as the source, the configuration format that you provide the flow
     * input data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-s3sourceproperties.html#cfn-appflow-flow-s3sourceproperties-s3inputformatconfig)
     */
    public fun s3InputFormatConfig(): Any? = unwrap(this).getS3InputFormatConfig()

    /**
     * A builder for [S3SourcePropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucketName The Amazon S3 bucket name where the source files are stored. 
       */
      public fun bucketName(bucketName: String)

      /**
       * @param bucketPrefix The object key for the Amazon S3 bucket in which the source files are
       * stored. 
       */
      public fun bucketPrefix(bucketPrefix: String)

      /**
       * @param s3InputFormatConfig When you use Amazon S3 as the source, the configuration format
       * that you provide the flow input data.
       */
      public fun s3InputFormatConfig(s3InputFormatConfig: IResolvable)

      /**
       * @param s3InputFormatConfig When you use Amazon S3 as the source, the configuration format
       * that you provide the flow input data.
       */
      public fun s3InputFormatConfig(s3InputFormatConfig: S3InputFormatConfigProperty)

      /**
       * @param s3InputFormatConfig When you use Amazon S3 as the source, the configuration format
       * that you provide the flow input data.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cb960761c4562e4c834f462f61e54872b320143be2d33df8bdfde92e5f0a21e4")
      public
          fun s3InputFormatConfig(s3InputFormatConfig: S3InputFormatConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.S3SourcePropertiesProperty.Builder =
          software.amazon.awscdk.services.appflow.CfnFlow.S3SourcePropertiesProperty.builder()

      /**
       * @param bucketName The Amazon S3 bucket name where the source files are stored. 
       */
      override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      /**
       * @param bucketPrefix The object key for the Amazon S3 bucket in which the source files are
       * stored. 
       */
      override fun bucketPrefix(bucketPrefix: String) {
        cdkBuilder.bucketPrefix(bucketPrefix)
      }

      /**
       * @param s3InputFormatConfig When you use Amazon S3 as the source, the configuration format
       * that you provide the flow input data.
       */
      override fun s3InputFormatConfig(s3InputFormatConfig: IResolvable) {
        cdkBuilder.s3InputFormatConfig(s3InputFormatConfig.let(IResolvable::unwrap))
      }

      /**
       * @param s3InputFormatConfig When you use Amazon S3 as the source, the configuration format
       * that you provide the flow input data.
       */
      override fun s3InputFormatConfig(s3InputFormatConfig: S3InputFormatConfigProperty) {
        cdkBuilder.s3InputFormatConfig(s3InputFormatConfig.let(S3InputFormatConfigProperty::unwrap))
      }

      /**
       * @param s3InputFormatConfig When you use Amazon S3 as the source, the configuration format
       * that you provide the flow input data.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cb960761c4562e4c834f462f61e54872b320143be2d33df8bdfde92e5f0a21e4")
      override
          fun s3InputFormatConfig(s3InputFormatConfig: S3InputFormatConfigProperty.Builder.() -> Unit):
          Unit = s3InputFormatConfig(S3InputFormatConfigProperty(s3InputFormatConfig))

      public fun build(): software.amazon.awscdk.services.appflow.CfnFlow.S3SourcePropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.S3SourcePropertiesProperty,
    ) : CdkObject(cdkObject), S3SourcePropertiesProperty {
      /**
       * The Amazon S3 bucket name where the source files are stored.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-s3sourceproperties.html#cfn-appflow-flow-s3sourceproperties-bucketname)
       */
      override fun bucketName(): String = unwrap(this).getBucketName()

      /**
       * The object key for the Amazon S3 bucket in which the source files are stored.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-s3sourceproperties.html#cfn-appflow-flow-s3sourceproperties-bucketprefix)
       */
      override fun bucketPrefix(): String = unwrap(this).getBucketPrefix()

      /**
       * When you use Amazon S3 as the source, the configuration format that you provide the flow
       * input data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-s3sourceproperties.html#cfn-appflow-flow-s3sourceproperties-s3inputformatconfig)
       */
      override fun s3InputFormatConfig(): Any? = unwrap(this).getS3InputFormatConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3SourcePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.S3SourcePropertiesProperty):
          S3SourcePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3SourcePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.S3SourcePropertiesProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnFlow.S3SourcePropertiesProperty
    }
  }

  /**
   * The properties that are applied when using SAPOData as a flow destination.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appflow.*;
   * SAPODataDestinationPropertiesProperty sAPODataDestinationPropertiesProperty =
   * SAPODataDestinationPropertiesProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sapodatadestinationproperties.html)
   */
  public interface SAPODataDestinationPropertiesProperty {
    /**
     * The settings that determine how Amazon AppFlow handles an error when placing data in the
     * destination.
     *
     * For example, this setting would determine if the flow should fail after one insertion error,
     * or continue and attempt to insert every record regardless of the initial failure.
     * `ErrorHandlingConfig` is a part of the destination connector details.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sapodatadestinationproperties.html#cfn-appflow-flow-sapodatadestinationproperties-errorhandlingconfig)
     */
    public fun errorHandlingConfig(): Any? = unwrap(this).getErrorHandlingConfig()

    /**
     * A list of field names that can be used as an ID field when performing a write operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sapodatadestinationproperties.html#cfn-appflow-flow-sapodatadestinationproperties-idfieldnames)
     */
    public fun idFieldNames(): List<String> = unwrap(this).getIdFieldNames() ?: emptyList()

    /**
     * The object path specified in the SAPOData flow destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sapodatadestinationproperties.html#cfn-appflow-flow-sapodatadestinationproperties-objectpath)
     */
    public fun objectPath(): String

    /**
     * Determines how Amazon AppFlow handles the success response that it gets from the connector
     * after placing data.
     *
     * For example, this setting would determine where to write the response from a destination
     * connector upon a successful insert operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sapodatadestinationproperties.html#cfn-appflow-flow-sapodatadestinationproperties-successresponsehandlingconfig)
     */
    public fun successResponseHandlingConfig(): Any? =
        unwrap(this).getSuccessResponseHandlingConfig()

    /**
     * The possible write operations in the destination connector.
     *
     * When this value is not provided, this defaults to the `INSERT` operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sapodatadestinationproperties.html#cfn-appflow-flow-sapodatadestinationproperties-writeoperationtype)
     */
    public fun writeOperationType(): String? = unwrap(this).getWriteOperationType()

    /**
     * A builder for [SAPODataDestinationPropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param errorHandlingConfig The settings that determine how Amazon AppFlow handles an error
       * when placing data in the destination.
       * For example, this setting would determine if the flow should fail after one insertion
       * error, or continue and attempt to insert every record regardless of the initial failure.
       * `ErrorHandlingConfig` is a part of the destination connector details.
       */
      public fun errorHandlingConfig(errorHandlingConfig: IResolvable)

      /**
       * @param errorHandlingConfig The settings that determine how Amazon AppFlow handles an error
       * when placing data in the destination.
       * For example, this setting would determine if the flow should fail after one insertion
       * error, or continue and attempt to insert every record regardless of the initial failure.
       * `ErrorHandlingConfig` is a part of the destination connector details.
       */
      public fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty)

      /**
       * @param errorHandlingConfig The settings that determine how Amazon AppFlow handles an error
       * when placing data in the destination.
       * For example, this setting would determine if the flow should fail after one insertion
       * error, or continue and attempt to insert every record regardless of the initial failure.
       * `ErrorHandlingConfig` is a part of the destination connector details.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9b1ebf97a8755f2bbd6a3b4610cbd0742c3888da56891f8c467483acb9af9d93")
      public
          fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty.Builder.() -> Unit)

      /**
       * @param idFieldNames A list of field names that can be used as an ID field when performing a
       * write operation.
       */
      public fun idFieldNames(idFieldNames: List<String>)

      /**
       * @param idFieldNames A list of field names that can be used as an ID field when performing a
       * write operation.
       */
      public fun idFieldNames(vararg idFieldNames: String)

      /**
       * @param objectPath The object path specified in the SAPOData flow destination. 
       */
      public fun objectPath(objectPath: String)

      /**
       * @param successResponseHandlingConfig Determines how Amazon AppFlow handles the success
       * response that it gets from the connector after placing data.
       * For example, this setting would determine where to write the response from a destination
       * connector upon a successful insert operation.
       */
      public fun successResponseHandlingConfig(successResponseHandlingConfig: IResolvable)

      /**
       * @param successResponseHandlingConfig Determines how Amazon AppFlow handles the success
       * response that it gets from the connector after placing data.
       * For example, this setting would determine where to write the response from a destination
       * connector upon a successful insert operation.
       */
      public
          fun successResponseHandlingConfig(successResponseHandlingConfig: SuccessResponseHandlingConfigProperty)

      /**
       * @param successResponseHandlingConfig Determines how Amazon AppFlow handles the success
       * response that it gets from the connector after placing data.
       * For example, this setting would determine where to write the response from a destination
       * connector upon a successful insert operation.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1c586ef71d6492fd06ce2f139e53052625bdb41f61e404731befee55737bf4c9")
      public
          fun successResponseHandlingConfig(successResponseHandlingConfig: SuccessResponseHandlingConfigProperty.Builder.() -> Unit)

      /**
       * @param writeOperationType The possible write operations in the destination connector.
       * When this value is not provided, this defaults to the `INSERT` operation.
       */
      public fun writeOperationType(writeOperationType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.SAPODataDestinationPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnFlow.SAPODataDestinationPropertiesProperty.builder()

      /**
       * @param errorHandlingConfig The settings that determine how Amazon AppFlow handles an error
       * when placing data in the destination.
       * For example, this setting would determine if the flow should fail after one insertion
       * error, or continue and attempt to insert every record regardless of the initial failure.
       * `ErrorHandlingConfig` is a part of the destination connector details.
       */
      override fun errorHandlingConfig(errorHandlingConfig: IResolvable) {
        cdkBuilder.errorHandlingConfig(errorHandlingConfig.let(IResolvable::unwrap))
      }

      /**
       * @param errorHandlingConfig The settings that determine how Amazon AppFlow handles an error
       * when placing data in the destination.
       * For example, this setting would determine if the flow should fail after one insertion
       * error, or continue and attempt to insert every record regardless of the initial failure.
       * `ErrorHandlingConfig` is a part of the destination connector details.
       */
      override fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty) {
        cdkBuilder.errorHandlingConfig(errorHandlingConfig.let(ErrorHandlingConfigProperty::unwrap))
      }

      /**
       * @param errorHandlingConfig The settings that determine how Amazon AppFlow handles an error
       * when placing data in the destination.
       * For example, this setting would determine if the flow should fail after one insertion
       * error, or continue and attempt to insert every record regardless of the initial failure.
       * `ErrorHandlingConfig` is a part of the destination connector details.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9b1ebf97a8755f2bbd6a3b4610cbd0742c3888da56891f8c467483acb9af9d93")
      override
          fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty.Builder.() -> Unit):
          Unit = errorHandlingConfig(ErrorHandlingConfigProperty(errorHandlingConfig))

      /**
       * @param idFieldNames A list of field names that can be used as an ID field when performing a
       * write operation.
       */
      override fun idFieldNames(idFieldNames: List<String>) {
        cdkBuilder.idFieldNames(idFieldNames)
      }

      /**
       * @param idFieldNames A list of field names that can be used as an ID field when performing a
       * write operation.
       */
      override fun idFieldNames(vararg idFieldNames: String): Unit =
          idFieldNames(idFieldNames.toList())

      /**
       * @param objectPath The object path specified in the SAPOData flow destination. 
       */
      override fun objectPath(objectPath: String) {
        cdkBuilder.objectPath(objectPath)
      }

      /**
       * @param successResponseHandlingConfig Determines how Amazon AppFlow handles the success
       * response that it gets from the connector after placing data.
       * For example, this setting would determine where to write the response from a destination
       * connector upon a successful insert operation.
       */
      override fun successResponseHandlingConfig(successResponseHandlingConfig: IResolvable) {
        cdkBuilder.successResponseHandlingConfig(successResponseHandlingConfig.let(IResolvable::unwrap))
      }

      /**
       * @param successResponseHandlingConfig Determines how Amazon AppFlow handles the success
       * response that it gets from the connector after placing data.
       * For example, this setting would determine where to write the response from a destination
       * connector upon a successful insert operation.
       */
      override
          fun successResponseHandlingConfig(successResponseHandlingConfig: SuccessResponseHandlingConfigProperty) {
        cdkBuilder.successResponseHandlingConfig(successResponseHandlingConfig.let(SuccessResponseHandlingConfigProperty::unwrap))
      }

      /**
       * @param successResponseHandlingConfig Determines how Amazon AppFlow handles the success
       * response that it gets from the connector after placing data.
       * For example, this setting would determine where to write the response from a destination
       * connector upon a successful insert operation.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1c586ef71d6492fd06ce2f139e53052625bdb41f61e404731befee55737bf4c9")
      override
          fun successResponseHandlingConfig(successResponseHandlingConfig: SuccessResponseHandlingConfigProperty.Builder.() -> Unit):
          Unit =
          successResponseHandlingConfig(SuccessResponseHandlingConfigProperty(successResponseHandlingConfig))

      /**
       * @param writeOperationType The possible write operations in the destination connector.
       * When this value is not provided, this defaults to the `INSERT` operation.
       */
      override fun writeOperationType(writeOperationType: String) {
        cdkBuilder.writeOperationType(writeOperationType)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.SAPODataDestinationPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.SAPODataDestinationPropertiesProperty,
    ) : CdkObject(cdkObject), SAPODataDestinationPropertiesProperty {
      /**
       * The settings that determine how Amazon AppFlow handles an error when placing data in the
       * destination.
       *
       * For example, this setting would determine if the flow should fail after one insertion
       * error, or continue and attempt to insert every record regardless of the initial failure.
       * `ErrorHandlingConfig` is a part of the destination connector details.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sapodatadestinationproperties.html#cfn-appflow-flow-sapodatadestinationproperties-errorhandlingconfig)
       */
      override fun errorHandlingConfig(): Any? = unwrap(this).getErrorHandlingConfig()

      /**
       * A list of field names that can be used as an ID field when performing a write operation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sapodatadestinationproperties.html#cfn-appflow-flow-sapodatadestinationproperties-idfieldnames)
       */
      override fun idFieldNames(): List<String> = unwrap(this).getIdFieldNames() ?: emptyList()

      /**
       * The object path specified in the SAPOData flow destination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sapodatadestinationproperties.html#cfn-appflow-flow-sapodatadestinationproperties-objectpath)
       */
      override fun objectPath(): String = unwrap(this).getObjectPath()

      /**
       * Determines how Amazon AppFlow handles the success response that it gets from the connector
       * after placing data.
       *
       * For example, this setting would determine where to write the response from a destination
       * connector upon a successful insert operation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sapodatadestinationproperties.html#cfn-appflow-flow-sapodatadestinationproperties-successresponsehandlingconfig)
       */
      override fun successResponseHandlingConfig(): Any? =
          unwrap(this).getSuccessResponseHandlingConfig()

      /**
       * The possible write operations in the destination connector.
       *
       * When this value is not provided, this defaults to the `INSERT` operation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sapodatadestinationproperties.html#cfn-appflow-flow-sapodatadestinationproperties-writeoperationtype)
       */
      override fun writeOperationType(): String? = unwrap(this).getWriteOperationType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SAPODataDestinationPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.SAPODataDestinationPropertiesProperty):
          SAPODataDestinationPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SAPODataDestinationPropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.SAPODataDestinationPropertiesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnFlow.SAPODataDestinationPropertiesProperty
    }
  }

  /**
   * The settings that determine how Amazon AppFlow handles an error when placing data in the
   * destination.
   *
   * For example, this setting would determine if the flow should fail after one insertion error, or
   * continue and attempt to insert every record regardless of the initial failure.
   * `ErrorHandlingConfig` is a part of the destination connector details.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appflow.*;
   * ErrorHandlingConfigProperty errorHandlingConfigProperty = ErrorHandlingConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * .failOnFirstError(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-errorhandlingconfig.html)
   */
  public interface ErrorHandlingConfigProperty {
    /**
     * Specifies the name of the Amazon S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-errorhandlingconfig.html#cfn-appflow-flow-errorhandlingconfig-bucketname)
     */
    public fun bucketName(): String? = unwrap(this).getBucketName()

    /**
     * Specifies the Amazon S3 bucket prefix.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-errorhandlingconfig.html#cfn-appflow-flow-errorhandlingconfig-bucketprefix)
     */
    public fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

    /**
     * Specifies if the flow should fail after the first instance of a failure when attempting to
     * place data in the destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-errorhandlingconfig.html#cfn-appflow-flow-errorhandlingconfig-failonfirsterror)
     */
    public fun failOnFirstError(): Any? = unwrap(this).getFailOnFirstError()

    /**
     * A builder for [ErrorHandlingConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucketName Specifies the name of the Amazon S3 bucket.
       */
      public fun bucketName(bucketName: String)

      /**
       * @param bucketPrefix Specifies the Amazon S3 bucket prefix.
       */
      public fun bucketPrefix(bucketPrefix: String)

      /**
       * @param failOnFirstError Specifies if the flow should fail after the first instance of a
       * failure when attempting to place data in the destination.
       */
      public fun failOnFirstError(failOnFirstError: Boolean)

      /**
       * @param failOnFirstError Specifies if the flow should fail after the first instance of a
       * failure when attempting to place data in the destination.
       */
      public fun failOnFirstError(failOnFirstError: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.ErrorHandlingConfigProperty.Builder =
          software.amazon.awscdk.services.appflow.CfnFlow.ErrorHandlingConfigProperty.builder()

      /**
       * @param bucketName Specifies the name of the Amazon S3 bucket.
       */
      override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      /**
       * @param bucketPrefix Specifies the Amazon S3 bucket prefix.
       */
      override fun bucketPrefix(bucketPrefix: String) {
        cdkBuilder.bucketPrefix(bucketPrefix)
      }

      /**
       * @param failOnFirstError Specifies if the flow should fail after the first instance of a
       * failure when attempting to place data in the destination.
       */
      override fun failOnFirstError(failOnFirstError: Boolean) {
        cdkBuilder.failOnFirstError(failOnFirstError)
      }

      /**
       * @param failOnFirstError Specifies if the flow should fail after the first instance of a
       * failure when attempting to place data in the destination.
       */
      override fun failOnFirstError(failOnFirstError: IResolvable) {
        cdkBuilder.failOnFirstError(failOnFirstError.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.ErrorHandlingConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.ErrorHandlingConfigProperty,
    ) : CdkObject(cdkObject), ErrorHandlingConfigProperty {
      /**
       * Specifies the name of the Amazon S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-errorhandlingconfig.html#cfn-appflow-flow-errorhandlingconfig-bucketname)
       */
      override fun bucketName(): String? = unwrap(this).getBucketName()

      /**
       * Specifies the Amazon S3 bucket prefix.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-errorhandlingconfig.html#cfn-appflow-flow-errorhandlingconfig-bucketprefix)
       */
      override fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

      /**
       * Specifies if the flow should fail after the first instance of a failure when attempting to
       * place data in the destination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-errorhandlingconfig.html#cfn-appflow-flow-errorhandlingconfig-failonfirsterror)
       */
      override fun failOnFirstError(): Any? = unwrap(this).getFailOnFirstError()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ErrorHandlingConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.ErrorHandlingConfigProperty):
          ErrorHandlingConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ErrorHandlingConfigProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.ErrorHandlingConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnFlow.ErrorHandlingConfigProperty
    }
  }

  /**
   * The properties that are applied when Slack is being used as a source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appflow.*;
   * SlackSourcePropertiesProperty slackSourcePropertiesProperty =
   * SlackSourcePropertiesProperty.builder()
   * .object("object")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-slacksourceproperties.html)
   */
  public interface SlackSourcePropertiesProperty {
    /**
     * The object specified in the Slack flow source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-slacksourceproperties.html#cfn-appflow-flow-slacksourceproperties-object)
     */
    public fun `object`(): String

    /**
     * A builder for [SlackSourcePropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param object The object specified in the Slack flow source. 
       */
      public fun `object`(`object`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.SlackSourcePropertiesProperty.Builder =
          software.amazon.awscdk.services.appflow.CfnFlow.SlackSourcePropertiesProperty.builder()

      /**
       * @param object The object specified in the Slack flow source. 
       */
      override fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.SlackSourcePropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.SlackSourcePropertiesProperty,
    ) : CdkObject(cdkObject), SlackSourcePropertiesProperty {
      /**
       * The object specified in the Slack flow source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-slacksourceproperties.html#cfn-appflow-flow-slacksourceproperties-object)
       */
      override fun `object`(): String = unwrap(this).getObject()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SlackSourcePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.SlackSourcePropertiesProperty):
          SlackSourcePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SlackSourcePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.SlackSourcePropertiesProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnFlow.SlackSourcePropertiesProperty
    }
  }

  /**
   * The properties that are applied when Infor Nexus is being used as a source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appflow.*;
   * InforNexusSourcePropertiesProperty inforNexusSourcePropertiesProperty =
   * InforNexusSourcePropertiesProperty.builder()
   * .object("object")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-infornexussourceproperties.html)
   */
  public interface InforNexusSourcePropertiesProperty {
    /**
     * The object specified in the Infor Nexus flow source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-infornexussourceproperties.html#cfn-appflow-flow-infornexussourceproperties-object)
     */
    public fun `object`(): String

    /**
     * A builder for [InforNexusSourcePropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param object The object specified in the Infor Nexus flow source. 
       */
      public fun `object`(`object`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.InforNexusSourcePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnFlow.InforNexusSourcePropertiesProperty.builder()

      /**
       * @param object The object specified in the Infor Nexus flow source. 
       */
      override fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.InforNexusSourcePropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.InforNexusSourcePropertiesProperty,
    ) : CdkObject(cdkObject), InforNexusSourcePropertiesProperty {
      /**
       * The object specified in the Infor Nexus flow source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-infornexussourceproperties.html#cfn-appflow-flow-infornexussourceproperties-object)
       */
      override fun `object`(): String = unwrap(this).getObject()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          InforNexusSourcePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.InforNexusSourcePropertiesProperty):
          InforNexusSourcePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InforNexusSourcePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.InforNexusSourcePropertiesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnFlow.InforNexusSourcePropertiesProperty
    }
  }

  /**
   * The configuration that determines how Amazon AppFlow should format the flow output data when
   * Amazon S3 is used as the destination.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appflow.*;
   * S3OutputFormatConfigProperty s3OutputFormatConfigProperty =
   * S3OutputFormatConfigProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-s3outputformatconfig.html)
   */
  public interface S3OutputFormatConfigProperty {
    /**
     * The aggregation settings that you can use to customize the output format of your flow data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-s3outputformatconfig.html#cfn-appflow-flow-s3outputformatconfig-aggregationconfig)
     */
    public fun aggregationConfig(): Any? = unwrap(this).getAggregationConfig()

    /**
     * Indicates the file type that Amazon AppFlow places in the Amazon S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-s3outputformatconfig.html#cfn-appflow-flow-s3outputformatconfig-filetype)
     */
    public fun fileType(): String? = unwrap(this).getFileType()

    /**
     * Determines the prefix that Amazon AppFlow applies to the folder name in the Amazon S3 bucket.
     *
     * You can name folders according to the flow frequency and date.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-s3outputformatconfig.html#cfn-appflow-flow-s3outputformatconfig-prefixconfig)
     */
    public fun prefixConfig(): Any? = unwrap(this).getPrefixConfig()

    /**
     * If your file output format is Parquet, use this parameter to set whether Amazon AppFlow
     * preserves the data types in your source data when it writes the output to Amazon S3.
     *
     * * `true` : Amazon AppFlow preserves the data types when it writes to Amazon S3. For example,
     * an integer or `1` in your source data is still an integer in your output.
     * * `false` : Amazon AppFlow converts all of the source data into strings when it writes to
     * Amazon S3. For example, an integer of `1` in your source data becomes the string `"1"` in the
     * output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-s3outputformatconfig.html#cfn-appflow-flow-s3outputformatconfig-preservesourcedatatyping)
     */
    public fun preserveSourceDataTyping(): Any? = unwrap(this).getPreserveSourceDataTyping()

    /**
     * A builder for [S3OutputFormatConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param aggregationConfig The aggregation settings that you can use to customize the output
       * format of your flow data.
       */
      public fun aggregationConfig(aggregationConfig: IResolvable)

      /**
       * @param aggregationConfig The aggregation settings that you can use to customize the output
       * format of your flow data.
       */
      public fun aggregationConfig(aggregationConfig: AggregationConfigProperty)

      /**
       * @param aggregationConfig The aggregation settings that you can use to customize the output
       * format of your flow data.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0564152b3d063bbba319273050c642c0f297b19c27a6cb573d3880d14d33aae5")
      public fun aggregationConfig(aggregationConfig: AggregationConfigProperty.Builder.() -> Unit)

      /**
       * @param fileType Indicates the file type that Amazon AppFlow places in the Amazon S3 bucket.
       */
      public fun fileType(fileType: String)

      /**
       * @param prefixConfig Determines the prefix that Amazon AppFlow applies to the folder name in
       * the Amazon S3 bucket.
       * You can name folders according to the flow frequency and date.
       */
      public fun prefixConfig(prefixConfig: IResolvable)

      /**
       * @param prefixConfig Determines the prefix that Amazon AppFlow applies to the folder name in
       * the Amazon S3 bucket.
       * You can name folders according to the flow frequency and date.
       */
      public fun prefixConfig(prefixConfig: PrefixConfigProperty)

      /**
       * @param prefixConfig Determines the prefix that Amazon AppFlow applies to the folder name in
       * the Amazon S3 bucket.
       * You can name folders according to the flow frequency and date.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6f347e5ed4eeadb54c204588b312704de5a215c7508d94fd4ce909a24a303385")
      public fun prefixConfig(prefixConfig: PrefixConfigProperty.Builder.() -> Unit)

      /**
       * @param preserveSourceDataTyping If your file output format is Parquet, use this parameter
       * to set whether Amazon AppFlow preserves the data types in your source data when it writes the
       * output to Amazon S3.
       * * `true` : Amazon AppFlow preserves the data types when it writes to Amazon S3. For
       * example, an integer or `1` in your source data is still an integer in your output.
       * * `false` : Amazon AppFlow converts all of the source data into strings when it writes to
       * Amazon S3. For example, an integer of `1` in your source data becomes the string `"1"` in the
       * output.
       */
      public fun preserveSourceDataTyping(preserveSourceDataTyping: Boolean)

      /**
       * @param preserveSourceDataTyping If your file output format is Parquet, use this parameter
       * to set whether Amazon AppFlow preserves the data types in your source data when it writes the
       * output to Amazon S3.
       * * `true` : Amazon AppFlow preserves the data types when it writes to Amazon S3. For
       * example, an integer or `1` in your source data is still an integer in your output.
       * * `false` : Amazon AppFlow converts all of the source data into strings when it writes to
       * Amazon S3. For example, an integer of `1` in your source data becomes the string `"1"` in the
       * output.
       */
      public fun preserveSourceDataTyping(preserveSourceDataTyping: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.S3OutputFormatConfigProperty.Builder =
          software.amazon.awscdk.services.appflow.CfnFlow.S3OutputFormatConfigProperty.builder()

      /**
       * @param aggregationConfig The aggregation settings that you can use to customize the output
       * format of your flow data.
       */
      override fun aggregationConfig(aggregationConfig: IResolvable) {
        cdkBuilder.aggregationConfig(aggregationConfig.let(IResolvable::unwrap))
      }

      /**
       * @param aggregationConfig The aggregation settings that you can use to customize the output
       * format of your flow data.
       */
      override fun aggregationConfig(aggregationConfig: AggregationConfigProperty) {
        cdkBuilder.aggregationConfig(aggregationConfig.let(AggregationConfigProperty::unwrap))
      }

      /**
       * @param aggregationConfig The aggregation settings that you can use to customize the output
       * format of your flow data.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0564152b3d063bbba319273050c642c0f297b19c27a6cb573d3880d14d33aae5")
      override
          fun aggregationConfig(aggregationConfig: AggregationConfigProperty.Builder.() -> Unit):
          Unit = aggregationConfig(AggregationConfigProperty(aggregationConfig))

      /**
       * @param fileType Indicates the file type that Amazon AppFlow places in the Amazon S3 bucket.
       */
      override fun fileType(fileType: String) {
        cdkBuilder.fileType(fileType)
      }

      /**
       * @param prefixConfig Determines the prefix that Amazon AppFlow applies to the folder name in
       * the Amazon S3 bucket.
       * You can name folders according to the flow frequency and date.
       */
      override fun prefixConfig(prefixConfig: IResolvable) {
        cdkBuilder.prefixConfig(prefixConfig.let(IResolvable::unwrap))
      }

      /**
       * @param prefixConfig Determines the prefix that Amazon AppFlow applies to the folder name in
       * the Amazon S3 bucket.
       * You can name folders according to the flow frequency and date.
       */
      override fun prefixConfig(prefixConfig: PrefixConfigProperty) {
        cdkBuilder.prefixConfig(prefixConfig.let(PrefixConfigProperty::unwrap))
      }

      /**
       * @param prefixConfig Determines the prefix that Amazon AppFlow applies to the folder name in
       * the Amazon S3 bucket.
       * You can name folders according to the flow frequency and date.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6f347e5ed4eeadb54c204588b312704de5a215c7508d94fd4ce909a24a303385")
      override fun prefixConfig(prefixConfig: PrefixConfigProperty.Builder.() -> Unit): Unit =
          prefixConfig(PrefixConfigProperty(prefixConfig))

      /**
       * @param preserveSourceDataTyping If your file output format is Parquet, use this parameter
       * to set whether Amazon AppFlow preserves the data types in your source data when it writes the
       * output to Amazon S3.
       * * `true` : Amazon AppFlow preserves the data types when it writes to Amazon S3. For
       * example, an integer or `1` in your source data is still an integer in your output.
       * * `false` : Amazon AppFlow converts all of the source data into strings when it writes to
       * Amazon S3. For example, an integer of `1` in your source data becomes the string `"1"` in the
       * output.
       */
      override fun preserveSourceDataTyping(preserveSourceDataTyping: Boolean) {
        cdkBuilder.preserveSourceDataTyping(preserveSourceDataTyping)
      }

      /**
       * @param preserveSourceDataTyping If your file output format is Parquet, use this parameter
       * to set whether Amazon AppFlow preserves the data types in your source data when it writes the
       * output to Amazon S3.
       * * `true` : Amazon AppFlow preserves the data types when it writes to Amazon S3. For
       * example, an integer or `1` in your source data is still an integer in your output.
       * * `false` : Amazon AppFlow converts all of the source data into strings when it writes to
       * Amazon S3. For example, an integer of `1` in your source data becomes the string `"1"` in the
       * output.
       */
      override fun preserveSourceDataTyping(preserveSourceDataTyping: IResolvable) {
        cdkBuilder.preserveSourceDataTyping(preserveSourceDataTyping.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.S3OutputFormatConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.S3OutputFormatConfigProperty,
    ) : CdkObject(cdkObject), S3OutputFormatConfigProperty {
      /**
       * The aggregation settings that you can use to customize the output format of your flow data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-s3outputformatconfig.html#cfn-appflow-flow-s3outputformatconfig-aggregationconfig)
       */
      override fun aggregationConfig(): Any? = unwrap(this).getAggregationConfig()

      /**
       * Indicates the file type that Amazon AppFlow places in the Amazon S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-s3outputformatconfig.html#cfn-appflow-flow-s3outputformatconfig-filetype)
       */
      override fun fileType(): String? = unwrap(this).getFileType()

      /**
       * Determines the prefix that Amazon AppFlow applies to the folder name in the Amazon S3
       * bucket.
       *
       * You can name folders according to the flow frequency and date.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-s3outputformatconfig.html#cfn-appflow-flow-s3outputformatconfig-prefixconfig)
       */
      override fun prefixConfig(): Any? = unwrap(this).getPrefixConfig()

      /**
       * If your file output format is Parquet, use this parameter to set whether Amazon AppFlow
       * preserves the data types in your source data when it writes the output to Amazon S3.
       *
       * * `true` : Amazon AppFlow preserves the data types when it writes to Amazon S3. For
       * example, an integer or `1` in your source data is still an integer in your output.
       * * `false` : Amazon AppFlow converts all of the source data into strings when it writes to
       * Amazon S3. For example, an integer of `1` in your source data becomes the string `"1"` in the
       * output.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-s3outputformatconfig.html#cfn-appflow-flow-s3outputformatconfig-preservesourcedatatyping)
       */
      override fun preserveSourceDataTyping(): Any? = unwrap(this).getPreserveSourceDataTyping()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3OutputFormatConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.S3OutputFormatConfigProperty):
          S3OutputFormatConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3OutputFormatConfigProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.S3OutputFormatConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnFlow.S3OutputFormatConfigProperty
    }
  }

  /**
   * The configuration that determines how Amazon AppFlow formats the flow output data when Upsolver
   * is used as the destination.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appflow.*;
   * UpsolverS3OutputFormatConfigProperty upsolverS3OutputFormatConfigProperty =
   * UpsolverS3OutputFormatConfigProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-upsolvers3outputformatconfig.html)
   */
  public interface UpsolverS3OutputFormatConfigProperty {
    /**
     * The aggregation settings that you can use to customize the output format of your flow data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-upsolvers3outputformatconfig.html#cfn-appflow-flow-upsolvers3outputformatconfig-aggregationconfig)
     */
    public fun aggregationConfig(): Any? = unwrap(this).getAggregationConfig()

    /**
     * Indicates the file type that Amazon AppFlow places in the Upsolver Amazon S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-upsolvers3outputformatconfig.html#cfn-appflow-flow-upsolvers3outputformatconfig-filetype)
     */
    public fun fileType(): String? = unwrap(this).getFileType()

    /**
     * Specifies elements that Amazon AppFlow includes in the file and folder names in the flow
     * destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-upsolvers3outputformatconfig.html#cfn-appflow-flow-upsolvers3outputformatconfig-prefixconfig)
     */
    public fun prefixConfig(): Any

    /**
     * A builder for [UpsolverS3OutputFormatConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param aggregationConfig The aggregation settings that you can use to customize the output
       * format of your flow data.
       */
      public fun aggregationConfig(aggregationConfig: IResolvable)

      /**
       * @param aggregationConfig The aggregation settings that you can use to customize the output
       * format of your flow data.
       */
      public fun aggregationConfig(aggregationConfig: AggregationConfigProperty)

      /**
       * @param aggregationConfig The aggregation settings that you can use to customize the output
       * format of your flow data.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("23d5a936b77c2c68051ee0245817734701542e0e5e64b93a04f589c69eab692b")
      public fun aggregationConfig(aggregationConfig: AggregationConfigProperty.Builder.() -> Unit)

      /**
       * @param fileType Indicates the file type that Amazon AppFlow places in the Upsolver Amazon
       * S3 bucket.
       */
      public fun fileType(fileType: String)

      /**
       * @param prefixConfig Specifies elements that Amazon AppFlow includes in the file and folder
       * names in the flow destination. 
       */
      public fun prefixConfig(prefixConfig: IResolvable)

      /**
       * @param prefixConfig Specifies elements that Amazon AppFlow includes in the file and folder
       * names in the flow destination. 
       */
      public fun prefixConfig(prefixConfig: PrefixConfigProperty)

      /**
       * @param prefixConfig Specifies elements that Amazon AppFlow includes in the file and folder
       * names in the flow destination. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("01c56c14d42601c94f7643e795d8d09183f78e8f1f186683dff7f884a89d7dc7")
      public fun prefixConfig(prefixConfig: PrefixConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.UpsolverS3OutputFormatConfigProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnFlow.UpsolverS3OutputFormatConfigProperty.builder()

      /**
       * @param aggregationConfig The aggregation settings that you can use to customize the output
       * format of your flow data.
       */
      override fun aggregationConfig(aggregationConfig: IResolvable) {
        cdkBuilder.aggregationConfig(aggregationConfig.let(IResolvable::unwrap))
      }

      /**
       * @param aggregationConfig The aggregation settings that you can use to customize the output
       * format of your flow data.
       */
      override fun aggregationConfig(aggregationConfig: AggregationConfigProperty) {
        cdkBuilder.aggregationConfig(aggregationConfig.let(AggregationConfigProperty::unwrap))
      }

      /**
       * @param aggregationConfig The aggregation settings that you can use to customize the output
       * format of your flow data.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("23d5a936b77c2c68051ee0245817734701542e0e5e64b93a04f589c69eab692b")
      override
          fun aggregationConfig(aggregationConfig: AggregationConfigProperty.Builder.() -> Unit):
          Unit = aggregationConfig(AggregationConfigProperty(aggregationConfig))

      /**
       * @param fileType Indicates the file type that Amazon AppFlow places in the Upsolver Amazon
       * S3 bucket.
       */
      override fun fileType(fileType: String) {
        cdkBuilder.fileType(fileType)
      }

      /**
       * @param prefixConfig Specifies elements that Amazon AppFlow includes in the file and folder
       * names in the flow destination. 
       */
      override fun prefixConfig(prefixConfig: IResolvable) {
        cdkBuilder.prefixConfig(prefixConfig.let(IResolvable::unwrap))
      }

      /**
       * @param prefixConfig Specifies elements that Amazon AppFlow includes in the file and folder
       * names in the flow destination. 
       */
      override fun prefixConfig(prefixConfig: PrefixConfigProperty) {
        cdkBuilder.prefixConfig(prefixConfig.let(PrefixConfigProperty::unwrap))
      }

      /**
       * @param prefixConfig Specifies elements that Amazon AppFlow includes in the file and folder
       * names in the flow destination. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("01c56c14d42601c94f7643e795d8d09183f78e8f1f186683dff7f884a89d7dc7")
      override fun prefixConfig(prefixConfig: PrefixConfigProperty.Builder.() -> Unit): Unit =
          prefixConfig(PrefixConfigProperty(prefixConfig))

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.UpsolverS3OutputFormatConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.UpsolverS3OutputFormatConfigProperty,
    ) : CdkObject(cdkObject), UpsolverS3OutputFormatConfigProperty {
      /**
       * The aggregation settings that you can use to customize the output format of your flow data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-upsolvers3outputformatconfig.html#cfn-appflow-flow-upsolvers3outputformatconfig-aggregationconfig)
       */
      override fun aggregationConfig(): Any? = unwrap(this).getAggregationConfig()

      /**
       * Indicates the file type that Amazon AppFlow places in the Upsolver Amazon S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-upsolvers3outputformatconfig.html#cfn-appflow-flow-upsolvers3outputformatconfig-filetype)
       */
      override fun fileType(): String? = unwrap(this).getFileType()

      /**
       * Specifies elements that Amazon AppFlow includes in the file and folder names in the flow
       * destination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-upsolvers3outputformatconfig.html#cfn-appflow-flow-upsolvers3outputformatconfig-prefixconfig)
       */
      override fun prefixConfig(): Any = unwrap(this).getPrefixConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          UpsolverS3OutputFormatConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.UpsolverS3OutputFormatConfigProperty):
          UpsolverS3OutputFormatConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: UpsolverS3OutputFormatConfigProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.UpsolverS3OutputFormatConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnFlow.UpsolverS3OutputFormatConfigProperty
    }
  }

  /**
   * When you use Amazon S3 as the source, the configuration format that you provide the flow input
   * data.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appflow.*;
   * S3InputFormatConfigProperty s3InputFormatConfigProperty = S3InputFormatConfigProperty.builder()
   * .s3InputFileType("s3InputFileType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-s3inputformatconfig.html)
   */
  public interface S3InputFormatConfigProperty {
    /**
     * The file type that Amazon AppFlow gets from your Amazon S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-s3inputformatconfig.html#cfn-appflow-flow-s3inputformatconfig-s3inputfiletype)
     */
    public fun s3InputFileType(): String? = unwrap(this).getS3InputFileType()

    /**
     * A builder for [S3InputFormatConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param s3InputFileType The file type that Amazon AppFlow gets from your Amazon S3 bucket.
       */
      public fun s3InputFileType(s3InputFileType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.S3InputFormatConfigProperty.Builder =
          software.amazon.awscdk.services.appflow.CfnFlow.S3InputFormatConfigProperty.builder()

      /**
       * @param s3InputFileType The file type that Amazon AppFlow gets from your Amazon S3 bucket.
       */
      override fun s3InputFileType(s3InputFileType: String) {
        cdkBuilder.s3InputFileType(s3InputFileType)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.S3InputFormatConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.S3InputFormatConfigProperty,
    ) : CdkObject(cdkObject), S3InputFormatConfigProperty {
      /**
       * The file type that Amazon AppFlow gets from your Amazon S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-s3inputformatconfig.html#cfn-appflow-flow-s3inputformatconfig-s3inputfiletype)
       */
      override fun s3InputFileType(): String? = unwrap(this).getS3InputFileType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3InputFormatConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.S3InputFormatConfigProperty):
          S3InputFormatConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3InputFormatConfigProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.S3InputFormatConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnFlow.S3InputFormatConfigProperty
    }
  }

  /**
   * The properties that are applied when Datadog is being used as a source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appflow.*;
   * DatadogSourcePropertiesProperty datadogSourcePropertiesProperty =
   * DatadogSourcePropertiesProperty.builder()
   * .object("object")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-datadogsourceproperties.html)
   */
  public interface DatadogSourcePropertiesProperty {
    /**
     * The object specified in the Datadog flow source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-datadogsourceproperties.html#cfn-appflow-flow-datadogsourceproperties-object)
     */
    public fun `object`(): String

    /**
     * A builder for [DatadogSourcePropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param object The object specified in the Datadog flow source. 
       */
      public fun `object`(`object`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.DatadogSourcePropertiesProperty.Builder =
          software.amazon.awscdk.services.appflow.CfnFlow.DatadogSourcePropertiesProperty.builder()

      /**
       * @param object The object specified in the Datadog flow source. 
       */
      override fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.DatadogSourcePropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.DatadogSourcePropertiesProperty,
    ) : CdkObject(cdkObject), DatadogSourcePropertiesProperty {
      /**
       * The object specified in the Datadog flow source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-datadogsourceproperties.html#cfn-appflow-flow-datadogsourceproperties-object)
       */
      override fun `object`(): String = unwrap(this).getObject()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DatadogSourcePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.DatadogSourcePropertiesProperty):
          DatadogSourcePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatadogSourcePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.DatadogSourcePropertiesProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnFlow.DatadogSourcePropertiesProperty
    }
  }

  /**
   * The properties that are applied when Singular is being used as a source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appflow.*;
   * SingularSourcePropertiesProperty singularSourcePropertiesProperty =
   * SingularSourcePropertiesProperty.builder()
   * .object("object")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-singularsourceproperties.html)
   */
  public interface SingularSourcePropertiesProperty {
    /**
     * The object specified in the Singular flow source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-singularsourceproperties.html#cfn-appflow-flow-singularsourceproperties-object)
     */
    public fun `object`(): String

    /**
     * A builder for [SingularSourcePropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param object The object specified in the Singular flow source. 
       */
      public fun `object`(`object`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.SingularSourcePropertiesProperty.Builder =
          software.amazon.awscdk.services.appflow.CfnFlow.SingularSourcePropertiesProperty.builder()

      /**
       * @param object The object specified in the Singular flow source. 
       */
      override fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.SingularSourcePropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.SingularSourcePropertiesProperty,
    ) : CdkObject(cdkObject), SingularSourcePropertiesProperty {
      /**
       * The object specified in the Singular flow source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-singularsourceproperties.html#cfn-appflow-flow-singularsourceproperties-object)
       */
      override fun `object`(): String = unwrap(this).getObject()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SingularSourcePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.SingularSourcePropertiesProperty):
          SingularSourcePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SingularSourcePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.SingularSourcePropertiesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnFlow.SingularSourcePropertiesProperty
    }
  }

  /**
   * Contains information about the configuration of destination connectors present in the flow.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appflow.*;
   * DestinationFlowConfigProperty destinationFlowConfigProperty =
   * DestinationFlowConfigProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-destinationflowconfig.html)
   */
  public interface DestinationFlowConfigProperty {
    /**
     * The API version that the destination connector uses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-destinationflowconfig.html#cfn-appflow-flow-destinationflowconfig-apiversion)
     */
    public fun apiVersion(): String? = unwrap(this).getApiVersion()

    /**
     * The name of the connector profile.
     *
     * This name must be unique for each connector profile in the AWS account .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-destinationflowconfig.html#cfn-appflow-flow-destinationflowconfig-connectorprofilename)
     */
    public fun connectorProfileName(): String? = unwrap(this).getConnectorProfileName()

    /**
     * The type of destination connector, such as Sales force, Amazon S3, and so on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-destinationflowconfig.html#cfn-appflow-flow-destinationflowconfig-connectortype)
     */
    public fun connectorType(): String

    /**
     * This stores the information that is required to query a particular connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-destinationflowconfig.html#cfn-appflow-flow-destinationflowconfig-destinationconnectorproperties)
     */
    public fun destinationConnectorProperties(): Any

    /**
     * A builder for [DestinationFlowConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param apiVersion The API version that the destination connector uses.
       */
      public fun apiVersion(apiVersion: String)

      /**
       * @param connectorProfileName The name of the connector profile.
       * This name must be unique for each connector profile in the AWS account .
       */
      public fun connectorProfileName(connectorProfileName: String)

      /**
       * @param connectorType The type of destination connector, such as Sales force, Amazon S3, and
       * so on. 
       */
      public fun connectorType(connectorType: String)

      /**
       * @param destinationConnectorProperties This stores the information that is required to query
       * a particular connector. 
       */
      public fun destinationConnectorProperties(destinationConnectorProperties: IResolvable)

      /**
       * @param destinationConnectorProperties This stores the information that is required to query
       * a particular connector. 
       */
      public
          fun destinationConnectorProperties(destinationConnectorProperties: DestinationConnectorPropertiesProperty)

      /**
       * @param destinationConnectorProperties This stores the information that is required to query
       * a particular connector. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bd4b52ab5ab53c73295d9dd2339d2db7f38f4f5ac3a1a8fe9d1bda08a63962d7")
      public
          fun destinationConnectorProperties(destinationConnectorProperties: DestinationConnectorPropertiesProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.DestinationFlowConfigProperty.Builder =
          software.amazon.awscdk.services.appflow.CfnFlow.DestinationFlowConfigProperty.builder()

      /**
       * @param apiVersion The API version that the destination connector uses.
       */
      override fun apiVersion(apiVersion: String) {
        cdkBuilder.apiVersion(apiVersion)
      }

      /**
       * @param connectorProfileName The name of the connector profile.
       * This name must be unique for each connector profile in the AWS account .
       */
      override fun connectorProfileName(connectorProfileName: String) {
        cdkBuilder.connectorProfileName(connectorProfileName)
      }

      /**
       * @param connectorType The type of destination connector, such as Sales force, Amazon S3, and
       * so on. 
       */
      override fun connectorType(connectorType: String) {
        cdkBuilder.connectorType(connectorType)
      }

      /**
       * @param destinationConnectorProperties This stores the information that is required to query
       * a particular connector. 
       */
      override fun destinationConnectorProperties(destinationConnectorProperties: IResolvable) {
        cdkBuilder.destinationConnectorProperties(destinationConnectorProperties.let(IResolvable::unwrap))
      }

      /**
       * @param destinationConnectorProperties This stores the information that is required to query
       * a particular connector. 
       */
      override
          fun destinationConnectorProperties(destinationConnectorProperties: DestinationConnectorPropertiesProperty) {
        cdkBuilder.destinationConnectorProperties(destinationConnectorProperties.let(DestinationConnectorPropertiesProperty::unwrap))
      }

      /**
       * @param destinationConnectorProperties This stores the information that is required to query
       * a particular connector. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bd4b52ab5ab53c73295d9dd2339d2db7f38f4f5ac3a1a8fe9d1bda08a63962d7")
      override
          fun destinationConnectorProperties(destinationConnectorProperties: DestinationConnectorPropertiesProperty.Builder.() -> Unit):
          Unit =
          destinationConnectorProperties(DestinationConnectorPropertiesProperty(destinationConnectorProperties))

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.DestinationFlowConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.DestinationFlowConfigProperty,
    ) : CdkObject(cdkObject), DestinationFlowConfigProperty {
      /**
       * The API version that the destination connector uses.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-destinationflowconfig.html#cfn-appflow-flow-destinationflowconfig-apiversion)
       */
      override fun apiVersion(): String? = unwrap(this).getApiVersion()

      /**
       * The name of the connector profile.
       *
       * This name must be unique for each connector profile in the AWS account .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-destinationflowconfig.html#cfn-appflow-flow-destinationflowconfig-connectorprofilename)
       */
      override fun connectorProfileName(): String? = unwrap(this).getConnectorProfileName()

      /**
       * The type of destination connector, such as Sales force, Amazon S3, and so on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-destinationflowconfig.html#cfn-appflow-flow-destinationflowconfig-connectortype)
       */
      override fun connectorType(): String = unwrap(this).getConnectorType()

      /**
       * This stores the information that is required to query a particular connector.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-destinationflowconfig.html#cfn-appflow-flow-destinationflowconfig-destinationconnectorproperties)
       */
      override fun destinationConnectorProperties(): Any =
          unwrap(this).getDestinationConnectorProperties()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DestinationFlowConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.DestinationFlowConfigProperty):
          DestinationFlowConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DestinationFlowConfigProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.DestinationFlowConfigProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnFlow.DestinationFlowConfigProperty
    }
  }

  /**
   * Trigger settings of the flow.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appflow.*;
   * GlueDataCatalogProperty glueDataCatalogProperty = GlueDataCatalogProperty.builder()
   * .databaseName("databaseName")
   * .roleArn("roleArn")
   * .tablePrefix("tablePrefix")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-gluedatacatalog.html)
   */
  public interface GlueDataCatalogProperty {
    /**
     * A string containing the value for the tag.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-gluedatacatalog.html#cfn-appflow-flow-gluedatacatalog-databasename)
     */
    public fun databaseName(): String

    /**
     * A string containing the value for the tag.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-gluedatacatalog.html#cfn-appflow-flow-gluedatacatalog-rolearn)
     */
    public fun roleArn(): String

    /**
     * A string containing the value for the tag.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-gluedatacatalog.html#cfn-appflow-flow-gluedatacatalog-tableprefix)
     */
    public fun tablePrefix(): String

    /**
     * A builder for [GlueDataCatalogProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param databaseName A string containing the value for the tag. 
       */
      public fun databaseName(databaseName: String)

      /**
       * @param roleArn A string containing the value for the tag. 
       */
      public fun roleArn(roleArn: String)

      /**
       * @param tablePrefix A string containing the value for the tag. 
       */
      public fun tablePrefix(tablePrefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.GlueDataCatalogProperty.Builder =
          software.amazon.awscdk.services.appflow.CfnFlow.GlueDataCatalogProperty.builder()

      /**
       * @param databaseName A string containing the value for the tag. 
       */
      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      /**
       * @param roleArn A string containing the value for the tag. 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param tablePrefix A string containing the value for the tag. 
       */
      override fun tablePrefix(tablePrefix: String) {
        cdkBuilder.tablePrefix(tablePrefix)
      }

      public fun build(): software.amazon.awscdk.services.appflow.CfnFlow.GlueDataCatalogProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.GlueDataCatalogProperty,
    ) : CdkObject(cdkObject), GlueDataCatalogProperty {
      /**
       * A string containing the value for the tag.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-gluedatacatalog.html#cfn-appflow-flow-gluedatacatalog-databasename)
       */
      override fun databaseName(): String = unwrap(this).getDatabaseName()

      /**
       * A string containing the value for the tag.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-gluedatacatalog.html#cfn-appflow-flow-gluedatacatalog-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()

      /**
       * A string containing the value for the tag.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-gluedatacatalog.html#cfn-appflow-flow-gluedatacatalog-tableprefix)
       */
      override fun tablePrefix(): String = unwrap(this).getTablePrefix()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GlueDataCatalogProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.GlueDataCatalogProperty):
          GlueDataCatalogProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GlueDataCatalogProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.GlueDataCatalogProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnFlow.GlueDataCatalogProperty
    }
  }

  /**
   * The properties that are applied when Amazon S3 is used as a destination.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appflow.*;
   * S3DestinationPropertiesProperty s3DestinationPropertiesProperty =
   * S3DestinationPropertiesProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-s3destinationproperties.html)
   */
  public interface S3DestinationPropertiesProperty {
    /**
     * The Amazon S3 bucket name in which Amazon AppFlow places the transferred data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-s3destinationproperties.html#cfn-appflow-flow-s3destinationproperties-bucketname)
     */
    public fun bucketName(): String

    /**
     * The object key for the destination bucket in which Amazon AppFlow places the files.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-s3destinationproperties.html#cfn-appflow-flow-s3destinationproperties-bucketprefix)
     */
    public fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

    /**
     * The configuration that determines how Amazon AppFlow should format the flow output data when
     * Amazon S3 is used as the destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-s3destinationproperties.html#cfn-appflow-flow-s3destinationproperties-s3outputformatconfig)
     */
    public fun s3OutputFormatConfig(): Any? = unwrap(this).getS3OutputFormatConfig()

    /**
     * A builder for [S3DestinationPropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucketName The Amazon S3 bucket name in which Amazon AppFlow places the transferred
       * data. 
       */
      public fun bucketName(bucketName: String)

      /**
       * @param bucketPrefix The object key for the destination bucket in which Amazon AppFlow
       * places the files.
       */
      public fun bucketPrefix(bucketPrefix: String)

      /**
       * @param s3OutputFormatConfig The configuration that determines how Amazon AppFlow should
       * format the flow output data when Amazon S3 is used as the destination.
       */
      public fun s3OutputFormatConfig(s3OutputFormatConfig: IResolvable)

      /**
       * @param s3OutputFormatConfig The configuration that determines how Amazon AppFlow should
       * format the flow output data when Amazon S3 is used as the destination.
       */
      public fun s3OutputFormatConfig(s3OutputFormatConfig: S3OutputFormatConfigProperty)

      /**
       * @param s3OutputFormatConfig The configuration that determines how Amazon AppFlow should
       * format the flow output data when Amazon S3 is used as the destination.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c5cc17b820b49eb5ffb2e6c56a3bcf1dc7de87f453496dc2344fa326b8e50800")
      public
          fun s3OutputFormatConfig(s3OutputFormatConfig: S3OutputFormatConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.S3DestinationPropertiesProperty.Builder =
          software.amazon.awscdk.services.appflow.CfnFlow.S3DestinationPropertiesProperty.builder()

      /**
       * @param bucketName The Amazon S3 bucket name in which Amazon AppFlow places the transferred
       * data. 
       */
      override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      /**
       * @param bucketPrefix The object key for the destination bucket in which Amazon AppFlow
       * places the files.
       */
      override fun bucketPrefix(bucketPrefix: String) {
        cdkBuilder.bucketPrefix(bucketPrefix)
      }

      /**
       * @param s3OutputFormatConfig The configuration that determines how Amazon AppFlow should
       * format the flow output data when Amazon S3 is used as the destination.
       */
      override fun s3OutputFormatConfig(s3OutputFormatConfig: IResolvable) {
        cdkBuilder.s3OutputFormatConfig(s3OutputFormatConfig.let(IResolvable::unwrap))
      }

      /**
       * @param s3OutputFormatConfig The configuration that determines how Amazon AppFlow should
       * format the flow output data when Amazon S3 is used as the destination.
       */
      override fun s3OutputFormatConfig(s3OutputFormatConfig: S3OutputFormatConfigProperty) {
        cdkBuilder.s3OutputFormatConfig(s3OutputFormatConfig.let(S3OutputFormatConfigProperty::unwrap))
      }

      /**
       * @param s3OutputFormatConfig The configuration that determines how Amazon AppFlow should
       * format the flow output data when Amazon S3 is used as the destination.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c5cc17b820b49eb5ffb2e6c56a3bcf1dc7de87f453496dc2344fa326b8e50800")
      override
          fun s3OutputFormatConfig(s3OutputFormatConfig: S3OutputFormatConfigProperty.Builder.() -> Unit):
          Unit = s3OutputFormatConfig(S3OutputFormatConfigProperty(s3OutputFormatConfig))

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.S3DestinationPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.S3DestinationPropertiesProperty,
    ) : CdkObject(cdkObject), S3DestinationPropertiesProperty {
      /**
       * The Amazon S3 bucket name in which Amazon AppFlow places the transferred data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-s3destinationproperties.html#cfn-appflow-flow-s3destinationproperties-bucketname)
       */
      override fun bucketName(): String = unwrap(this).getBucketName()

      /**
       * The object key for the destination bucket in which Amazon AppFlow places the files.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-s3destinationproperties.html#cfn-appflow-flow-s3destinationproperties-bucketprefix)
       */
      override fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

      /**
       * The configuration that determines how Amazon AppFlow should format the flow output data
       * when Amazon S3 is used as the destination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-s3destinationproperties.html#cfn-appflow-flow-s3destinationproperties-s3outputformatconfig)
       */
      override fun s3OutputFormatConfig(): Any? = unwrap(this).getS3OutputFormatConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3DestinationPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.S3DestinationPropertiesProperty):
          S3DestinationPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3DestinationPropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.S3DestinationPropertiesProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnFlow.S3DestinationPropertiesProperty
    }
  }

  /**
   * A map used to store task-related information.
   *
   * The execution service looks for particular information based on the `TaskType` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appflow.*;
   * TaskPropertiesObjectProperty taskPropertiesObjectProperty =
   * TaskPropertiesObjectProperty.builder()
   * .key("key")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-taskpropertiesobject.html)
   */
  public interface TaskPropertiesObjectProperty {
    /**
     * The task property key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-taskpropertiesobject.html#cfn-appflow-flow-taskpropertiesobject-key)
     */
    public fun key(): String

    /**
     * The task property value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-taskpropertiesobject.html#cfn-appflow-flow-taskpropertiesobject-value)
     */
    public fun `value`(): String

    /**
     * A builder for [TaskPropertiesObjectProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The task property key. 
       */
      public fun key(key: String)

      /**
       * @param value The task property value. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.TaskPropertiesObjectProperty.Builder =
          software.amazon.awscdk.services.appflow.CfnFlow.TaskPropertiesObjectProperty.builder()

      /**
       * @param key The task property key. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The task property value. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.TaskPropertiesObjectProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.TaskPropertiesObjectProperty,
    ) : CdkObject(cdkObject), TaskPropertiesObjectProperty {
      /**
       * The task property key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-taskpropertiesobject.html#cfn-appflow-flow-taskpropertiesobject-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The task property value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-taskpropertiesobject.html#cfn-appflow-flow-taskpropertiesobject-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TaskPropertiesObjectProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.TaskPropertiesObjectProperty):
          TaskPropertiesObjectProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TaskPropertiesObjectProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.TaskPropertiesObjectProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnFlow.TaskPropertiesObjectProperty
    }
  }
}

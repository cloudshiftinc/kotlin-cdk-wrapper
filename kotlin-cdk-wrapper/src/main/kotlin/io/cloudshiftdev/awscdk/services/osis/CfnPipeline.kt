@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.osis

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
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
 * The AWS::OSIS::Pipeline resource creates an Amazon OpenSearch Ingestion pipeline.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.osis.*;
 * CfnPipeline cfnPipeline = CfnPipeline.Builder.create(this, "MyCfnPipeline")
 * .maxUnits(123)
 * .minUnits(123)
 * .pipelineConfigurationBody("pipelineConfigurationBody")
 * .pipelineName("pipelineName")
 * // the properties below are optional
 * .bufferOptions(BufferOptionsProperty.builder()
 * .persistentBufferEnabled(false)
 * .build())
 * .encryptionAtRestOptions(EncryptionAtRestOptionsProperty.builder()
 * .kmsKeyArn("kmsKeyArn")
 * .build())
 * .logPublishingOptions(LogPublishingOptionsProperty.builder()
 * .cloudWatchLogDestination(CloudWatchLogDestinationProperty.builder()
 * .logGroup("logGroup")
 * .build())
 * .isLoggingEnabled(false)
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .vpcOptions(VpcOptionsProperty.builder()
 * .subnetIds(List.of("subnetIds"))
 * // the properties below are optional
 * .securityGroupIds(List.of("securityGroupIds"))
 * .vpcAttachmentOptions(VpcAttachmentOptionsProperty.builder()
 * .attachToVpc(false)
 * .cidrBlock("cidrBlock")
 * .build())
 * .vpcEndpointManagement("vpcEndpointManagement")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html)
 */
public open class CfnPipeline(
  cdkObject: software.amazon.awscdk.services.osis.CfnPipeline,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPipelineProps,
  ) :
      this(software.amazon.awscdk.services.osis.CfnPipeline(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnPipelineProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPipelineProps.Builder.() -> Unit,
  ) : this(scope, id, CfnPipelineProps(props)
  )

  /**
   * A list of the ingestion endpoints for the pipeline that you can send data to.
   *
   * Currently, only a single ingestion endpoint is supported for a pipeline. For example,
   * `my-pipeline-123456789012.us-east-1.osis.amazonaws.com` .
   */
  public open fun attrIngestEndpointUrls(): List<String> = unwrap(this).getAttrIngestEndpointUrls()

  /**
   * The Amazon Resource Name (ARN) of the pipeline.
   */
  public open fun attrPipelineArn(): String = unwrap(this).getAttrPipelineArn()

  /**
   * The VPC endpoint service name for the pipeline.
   */
  public open fun attrVpcEndpointService(): String = unwrap(this).getAttrVpcEndpointService()

  /**
   * The VPC interface endpoints that have access to the pipeline.
   */
  public open fun attrVpcEndpoints(): IResolvable =
      unwrap(this).getAttrVpcEndpoints().let(IResolvable::wrap)

  /**
   * Options that specify the configuration of a persistent buffer.
   */
  public open fun bufferOptions(): Any? = unwrap(this).getBufferOptions()

  /**
   * Options that specify the configuration of a persistent buffer.
   */
  public open fun bufferOptions(`value`: IResolvable) {
    unwrap(this).setBufferOptions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Options that specify the configuration of a persistent buffer.
   */
  public open fun bufferOptions(`value`: BufferOptionsProperty) {
    unwrap(this).setBufferOptions(`value`.let(BufferOptionsProperty.Companion::unwrap))
  }

  /**
   * Options that specify the configuration of a persistent buffer.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0088db915d29a68bf145c26c3199caa8a9a4262e623a97a00fd4a0e830f230c2")
  public open fun bufferOptions(`value`: BufferOptionsProperty.Builder.() -> Unit): Unit =
      bufferOptions(BufferOptionsProperty(`value`))

  /**
   * Options to control how OpenSearch encrypts buffer data.
   */
  public open fun encryptionAtRestOptions(): Any? = unwrap(this).getEncryptionAtRestOptions()

  /**
   * Options to control how OpenSearch encrypts buffer data.
   */
  public open fun encryptionAtRestOptions(`value`: IResolvable) {
    unwrap(this).setEncryptionAtRestOptions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Options to control how OpenSearch encrypts buffer data.
   */
  public open fun encryptionAtRestOptions(`value`: EncryptionAtRestOptionsProperty) {
    unwrap(this).setEncryptionAtRestOptions(`value`.let(EncryptionAtRestOptionsProperty.Companion::unwrap))
  }

  /**
   * Options to control how OpenSearch encrypts buffer data.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("46156800434f7da75e187fcab458d4d81337878d6fab246df65df6cb085a4546")
  public open
      fun encryptionAtRestOptions(`value`: EncryptionAtRestOptionsProperty.Builder.() -> Unit): Unit
      = encryptionAtRestOptions(EncryptionAtRestOptionsProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Key-value pairs that represent log publishing settings.
   */
  public open fun logPublishingOptions(): Any? = unwrap(this).getLogPublishingOptions()

  /**
   * Key-value pairs that represent log publishing settings.
   */
  public open fun logPublishingOptions(`value`: IResolvable) {
    unwrap(this).setLogPublishingOptions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Key-value pairs that represent log publishing settings.
   */
  public open fun logPublishingOptions(`value`: LogPublishingOptionsProperty) {
    unwrap(this).setLogPublishingOptions(`value`.let(LogPublishingOptionsProperty.Companion::unwrap))
  }

  /**
   * Key-value pairs that represent log publishing settings.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3095123317b3a645c780713ea59505306e98994cec5d3cfb3418b8a9ad15bfee")
  public open fun logPublishingOptions(`value`: LogPublishingOptionsProperty.Builder.() -> Unit):
      Unit = logPublishingOptions(LogPublishingOptionsProperty(`value`))

  /**
   * The maximum pipeline capacity, in Ingestion Compute Units (ICUs).
   */
  public open fun maxUnits(): Number = unwrap(this).getMaxUnits()

  /**
   * The maximum pipeline capacity, in Ingestion Compute Units (ICUs).
   */
  public open fun maxUnits(`value`: Number) {
    unwrap(this).setMaxUnits(`value`)
  }

  /**
   * The minimum pipeline capacity, in Ingestion Compute Units (ICUs).
   */
  public open fun minUnits(): Number = unwrap(this).getMinUnits()

  /**
   * The minimum pipeline capacity, in Ingestion Compute Units (ICUs).
   */
  public open fun minUnits(`value`: Number) {
    unwrap(this).setMinUnits(`value`)
  }

  /**
   * The Data Prepper pipeline configuration in YAML format.
   */
  public open fun pipelineConfigurationBody(): String = unwrap(this).getPipelineConfigurationBody()

  /**
   * The Data Prepper pipeline configuration in YAML format.
   */
  public open fun pipelineConfigurationBody(`value`: String) {
    unwrap(this).setPipelineConfigurationBody(`value`)
  }

  /**
   * The name of the pipeline.
   */
  public open fun pipelineName(): String = unwrap(this).getPipelineName()

  /**
   * The name of the pipeline.
   */
  public open fun pipelineName(`value`: String) {
    unwrap(this).setPipelineName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * List of tags to add to the pipeline upon creation.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * List of tags to add to the pipeline upon creation.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * List of tags to add to the pipeline upon creation.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * Options that specify the subnets and security groups for an OpenSearch Ingestion VPC endpoint.
   */
  public open fun vpcOptions(): Any? = unwrap(this).getVpcOptions()

  /**
   * Options that specify the subnets and security groups for an OpenSearch Ingestion VPC endpoint.
   */
  public open fun vpcOptions(`value`: IResolvable) {
    unwrap(this).setVpcOptions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Options that specify the subnets and security groups for an OpenSearch Ingestion VPC endpoint.
   */
  public open fun vpcOptions(`value`: VpcOptionsProperty) {
    unwrap(this).setVpcOptions(`value`.let(VpcOptionsProperty.Companion::unwrap))
  }

  /**
   * Options that specify the subnets and security groups for an OpenSearch Ingestion VPC endpoint.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("56f4cd78ce89b44248447c64b7a56945ce3708bbbe4bd283a0d0cd9beb9afa32")
  public open fun vpcOptions(`value`: VpcOptionsProperty.Builder.() -> Unit): Unit =
      vpcOptions(VpcOptionsProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.osis.CfnPipeline].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Options that specify the configuration of a persistent buffer.
     *
     * To configure how OpenSearch Ingestion encrypts this data, set the `EncryptionAtRestOptions` .
     * For more information, see [Persistent
     * buffering](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/osis-features-overview.html#persistent-buffering)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-bufferoptions)
     * @param bufferOptions Options that specify the configuration of a persistent buffer. 
     */
    public fun bufferOptions(bufferOptions: IResolvable)

    /**
     * Options that specify the configuration of a persistent buffer.
     *
     * To configure how OpenSearch Ingestion encrypts this data, set the `EncryptionAtRestOptions` .
     * For more information, see [Persistent
     * buffering](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/osis-features-overview.html#persistent-buffering)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-bufferoptions)
     * @param bufferOptions Options that specify the configuration of a persistent buffer. 
     */
    public fun bufferOptions(bufferOptions: BufferOptionsProperty)

    /**
     * Options that specify the configuration of a persistent buffer.
     *
     * To configure how OpenSearch Ingestion encrypts this data, set the `EncryptionAtRestOptions` .
     * For more information, see [Persistent
     * buffering](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/osis-features-overview.html#persistent-buffering)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-bufferoptions)
     * @param bufferOptions Options that specify the configuration of a persistent buffer. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("521a6f5455e187f1cb3cae2d62862342904aaecc39219120de7f96054dc111f6")
    public fun bufferOptions(bufferOptions: BufferOptionsProperty.Builder.() -> Unit)

    /**
     * Options to control how OpenSearch encrypts buffer data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-encryptionatrestoptions)
     * @param encryptionAtRestOptions Options to control how OpenSearch encrypts buffer data. 
     */
    public fun encryptionAtRestOptions(encryptionAtRestOptions: IResolvable)

    /**
     * Options to control how OpenSearch encrypts buffer data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-encryptionatrestoptions)
     * @param encryptionAtRestOptions Options to control how OpenSearch encrypts buffer data. 
     */
    public fun encryptionAtRestOptions(encryptionAtRestOptions: EncryptionAtRestOptionsProperty)

    /**
     * Options to control how OpenSearch encrypts buffer data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-encryptionatrestoptions)
     * @param encryptionAtRestOptions Options to control how OpenSearch encrypts buffer data. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c0240d8c5b5549905909b79de6e5be06b178608e62cf3ccb2d1b13259fccffd5")
    public
        fun encryptionAtRestOptions(encryptionAtRestOptions: EncryptionAtRestOptionsProperty.Builder.() -> Unit)

    /**
     * Key-value pairs that represent log publishing settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-logpublishingoptions)
     * @param logPublishingOptions Key-value pairs that represent log publishing settings. 
     */
    public fun logPublishingOptions(logPublishingOptions: IResolvable)

    /**
     * Key-value pairs that represent log publishing settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-logpublishingoptions)
     * @param logPublishingOptions Key-value pairs that represent log publishing settings. 
     */
    public fun logPublishingOptions(logPublishingOptions: LogPublishingOptionsProperty)

    /**
     * Key-value pairs that represent log publishing settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-logpublishingoptions)
     * @param logPublishingOptions Key-value pairs that represent log publishing settings. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c08b220362234c4cc0e216143ac2603e48f9251daf1947aeb3a3ce258c859b03")
    public
        fun logPublishingOptions(logPublishingOptions: LogPublishingOptionsProperty.Builder.() -> Unit)

    /**
     * The maximum pipeline capacity, in Ingestion Compute Units (ICUs).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-maxunits)
     * @param maxUnits The maximum pipeline capacity, in Ingestion Compute Units (ICUs). 
     */
    public fun maxUnits(maxUnits: Number)

    /**
     * The minimum pipeline capacity, in Ingestion Compute Units (ICUs).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-minunits)
     * @param minUnits The minimum pipeline capacity, in Ingestion Compute Units (ICUs). 
     */
    public fun minUnits(minUnits: Number)

    /**
     * The Data Prepper pipeline configuration in YAML format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-pipelineconfigurationbody)
     * @param pipelineConfigurationBody The Data Prepper pipeline configuration in YAML format. 
     */
    public fun pipelineConfigurationBody(pipelineConfigurationBody: String)

    /**
     * The name of the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-pipelinename)
     * @param pipelineName The name of the pipeline. 
     */
    public fun pipelineName(pipelineName: String)

    /**
     * List of tags to add to the pipeline upon creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-tags)
     * @param tags List of tags to add to the pipeline upon creation. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * List of tags to add to the pipeline upon creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-tags)
     * @param tags List of tags to add to the pipeline upon creation. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * Options that specify the subnets and security groups for an OpenSearch Ingestion VPC
     * endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-vpcoptions)
     * @param vpcOptions Options that specify the subnets and security groups for an OpenSearch
     * Ingestion VPC endpoint. 
     */
    public fun vpcOptions(vpcOptions: IResolvable)

    /**
     * Options that specify the subnets and security groups for an OpenSearch Ingestion VPC
     * endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-vpcoptions)
     * @param vpcOptions Options that specify the subnets and security groups for an OpenSearch
     * Ingestion VPC endpoint. 
     */
    public fun vpcOptions(vpcOptions: VpcOptionsProperty)

    /**
     * Options that specify the subnets and security groups for an OpenSearch Ingestion VPC
     * endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-vpcoptions)
     * @param vpcOptions Options that specify the subnets and security groups for an OpenSearch
     * Ingestion VPC endpoint. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4c5c8165a7472a670581694263ef16a917ca8417fe109d0ed9d7c63fb0e00823")
    public fun vpcOptions(vpcOptions: VpcOptionsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.osis.CfnPipeline.Builder =
        software.amazon.awscdk.services.osis.CfnPipeline.Builder.create(scope, id)

    /**
     * Options that specify the configuration of a persistent buffer.
     *
     * To configure how OpenSearch Ingestion encrypts this data, set the `EncryptionAtRestOptions` .
     * For more information, see [Persistent
     * buffering](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/osis-features-overview.html#persistent-buffering)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-bufferoptions)
     * @param bufferOptions Options that specify the configuration of a persistent buffer. 
     */
    override fun bufferOptions(bufferOptions: IResolvable) {
      cdkBuilder.bufferOptions(bufferOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * Options that specify the configuration of a persistent buffer.
     *
     * To configure how OpenSearch Ingestion encrypts this data, set the `EncryptionAtRestOptions` .
     * For more information, see [Persistent
     * buffering](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/osis-features-overview.html#persistent-buffering)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-bufferoptions)
     * @param bufferOptions Options that specify the configuration of a persistent buffer. 
     */
    override fun bufferOptions(bufferOptions: BufferOptionsProperty) {
      cdkBuilder.bufferOptions(bufferOptions.let(BufferOptionsProperty.Companion::unwrap))
    }

    /**
     * Options that specify the configuration of a persistent buffer.
     *
     * To configure how OpenSearch Ingestion encrypts this data, set the `EncryptionAtRestOptions` .
     * For more information, see [Persistent
     * buffering](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/osis-features-overview.html#persistent-buffering)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-bufferoptions)
     * @param bufferOptions Options that specify the configuration of a persistent buffer. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("521a6f5455e187f1cb3cae2d62862342904aaecc39219120de7f96054dc111f6")
    override fun bufferOptions(bufferOptions: BufferOptionsProperty.Builder.() -> Unit): Unit =
        bufferOptions(BufferOptionsProperty(bufferOptions))

    /**
     * Options to control how OpenSearch encrypts buffer data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-encryptionatrestoptions)
     * @param encryptionAtRestOptions Options to control how OpenSearch encrypts buffer data. 
     */
    override fun encryptionAtRestOptions(encryptionAtRestOptions: IResolvable) {
      cdkBuilder.encryptionAtRestOptions(encryptionAtRestOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * Options to control how OpenSearch encrypts buffer data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-encryptionatrestoptions)
     * @param encryptionAtRestOptions Options to control how OpenSearch encrypts buffer data. 
     */
    override fun encryptionAtRestOptions(encryptionAtRestOptions: EncryptionAtRestOptionsProperty) {
      cdkBuilder.encryptionAtRestOptions(encryptionAtRestOptions.let(EncryptionAtRestOptionsProperty.Companion::unwrap))
    }

    /**
     * Options to control how OpenSearch encrypts buffer data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-encryptionatrestoptions)
     * @param encryptionAtRestOptions Options to control how OpenSearch encrypts buffer data. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c0240d8c5b5549905909b79de6e5be06b178608e62cf3ccb2d1b13259fccffd5")
    override
        fun encryptionAtRestOptions(encryptionAtRestOptions: EncryptionAtRestOptionsProperty.Builder.() -> Unit):
        Unit = encryptionAtRestOptions(EncryptionAtRestOptionsProperty(encryptionAtRestOptions))

    /**
     * Key-value pairs that represent log publishing settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-logpublishingoptions)
     * @param logPublishingOptions Key-value pairs that represent log publishing settings. 
     */
    override fun logPublishingOptions(logPublishingOptions: IResolvable) {
      cdkBuilder.logPublishingOptions(logPublishingOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * Key-value pairs that represent log publishing settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-logpublishingoptions)
     * @param logPublishingOptions Key-value pairs that represent log publishing settings. 
     */
    override fun logPublishingOptions(logPublishingOptions: LogPublishingOptionsProperty) {
      cdkBuilder.logPublishingOptions(logPublishingOptions.let(LogPublishingOptionsProperty.Companion::unwrap))
    }

    /**
     * Key-value pairs that represent log publishing settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-logpublishingoptions)
     * @param logPublishingOptions Key-value pairs that represent log publishing settings. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c08b220362234c4cc0e216143ac2603e48f9251daf1947aeb3a3ce258c859b03")
    override
        fun logPublishingOptions(logPublishingOptions: LogPublishingOptionsProperty.Builder.() -> Unit):
        Unit = logPublishingOptions(LogPublishingOptionsProperty(logPublishingOptions))

    /**
     * The maximum pipeline capacity, in Ingestion Compute Units (ICUs).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-maxunits)
     * @param maxUnits The maximum pipeline capacity, in Ingestion Compute Units (ICUs). 
     */
    override fun maxUnits(maxUnits: Number) {
      cdkBuilder.maxUnits(maxUnits)
    }

    /**
     * The minimum pipeline capacity, in Ingestion Compute Units (ICUs).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-minunits)
     * @param minUnits The minimum pipeline capacity, in Ingestion Compute Units (ICUs). 
     */
    override fun minUnits(minUnits: Number) {
      cdkBuilder.minUnits(minUnits)
    }

    /**
     * The Data Prepper pipeline configuration in YAML format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-pipelineconfigurationbody)
     * @param pipelineConfigurationBody The Data Prepper pipeline configuration in YAML format. 
     */
    override fun pipelineConfigurationBody(pipelineConfigurationBody: String) {
      cdkBuilder.pipelineConfigurationBody(pipelineConfigurationBody)
    }

    /**
     * The name of the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-pipelinename)
     * @param pipelineName The name of the pipeline. 
     */
    override fun pipelineName(pipelineName: String) {
      cdkBuilder.pipelineName(pipelineName)
    }

    /**
     * List of tags to add to the pipeline upon creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-tags)
     * @param tags List of tags to add to the pipeline upon creation. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * List of tags to add to the pipeline upon creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-tags)
     * @param tags List of tags to add to the pipeline upon creation. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * Options that specify the subnets and security groups for an OpenSearch Ingestion VPC
     * endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-vpcoptions)
     * @param vpcOptions Options that specify the subnets and security groups for an OpenSearch
     * Ingestion VPC endpoint. 
     */
    override fun vpcOptions(vpcOptions: IResolvable) {
      cdkBuilder.vpcOptions(vpcOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * Options that specify the subnets and security groups for an OpenSearch Ingestion VPC
     * endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-vpcoptions)
     * @param vpcOptions Options that specify the subnets and security groups for an OpenSearch
     * Ingestion VPC endpoint. 
     */
    override fun vpcOptions(vpcOptions: VpcOptionsProperty) {
      cdkBuilder.vpcOptions(vpcOptions.let(VpcOptionsProperty.Companion::unwrap))
    }

    /**
     * Options that specify the subnets and security groups for an OpenSearch Ingestion VPC
     * endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-vpcoptions)
     * @param vpcOptions Options that specify the subnets and security groups for an OpenSearch
     * Ingestion VPC endpoint. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4c5c8165a7472a670581694263ef16a917ca8417fe109d0ed9d7c63fb0e00823")
    override fun vpcOptions(vpcOptions: VpcOptionsProperty.Builder.() -> Unit): Unit =
        vpcOptions(VpcOptionsProperty(vpcOptions))

    public fun build(): software.amazon.awscdk.services.osis.CfnPipeline = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.osis.CfnPipeline.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPipeline {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPipeline(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.osis.CfnPipeline): CfnPipeline =
        CfnPipeline(cdkObject)

    internal fun unwrap(wrapped: CfnPipeline): software.amazon.awscdk.services.osis.CfnPipeline =
        wrapped.cdkObject as software.amazon.awscdk.services.osis.CfnPipeline
  }

  /**
   * Options that specify the configuration of a persistent buffer.
   *
   * To configure how OpenSearch Ingestion encrypts this data, set the `EncryptionAtRestOptions` .
   * For more information, see [Persistent
   * buffering](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/osis-features-overview.html#persistent-buffering)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.osis.*;
   * BufferOptionsProperty bufferOptionsProperty = BufferOptionsProperty.builder()
   * .persistentBufferEnabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-osis-pipeline-bufferoptions.html)
   */
  public interface BufferOptionsProperty {
    /**
     * Whether persistent buffering should be enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-osis-pipeline-bufferoptions.html#cfn-osis-pipeline-bufferoptions-persistentbufferenabled)
     */
    public fun persistentBufferEnabled(): Any

    /**
     * A builder for [BufferOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param persistentBufferEnabled Whether persistent buffering should be enabled. 
       */
      public fun persistentBufferEnabled(persistentBufferEnabled: Boolean)

      /**
       * @param persistentBufferEnabled Whether persistent buffering should be enabled. 
       */
      public fun persistentBufferEnabled(persistentBufferEnabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.osis.CfnPipeline.BufferOptionsProperty.Builder =
          software.amazon.awscdk.services.osis.CfnPipeline.BufferOptionsProperty.builder()

      /**
       * @param persistentBufferEnabled Whether persistent buffering should be enabled. 
       */
      override fun persistentBufferEnabled(persistentBufferEnabled: Boolean) {
        cdkBuilder.persistentBufferEnabled(persistentBufferEnabled)
      }

      /**
       * @param persistentBufferEnabled Whether persistent buffering should be enabled. 
       */
      override fun persistentBufferEnabled(persistentBufferEnabled: IResolvable) {
        cdkBuilder.persistentBufferEnabled(persistentBufferEnabled.let(IResolvable.Companion::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.osis.CfnPipeline.BufferOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.osis.CfnPipeline.BufferOptionsProperty,
    ) : CdkObject(cdkObject),
        BufferOptionsProperty {
      /**
       * Whether persistent buffering should be enabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-osis-pipeline-bufferoptions.html#cfn-osis-pipeline-bufferoptions-persistentbufferenabled)
       */
      override fun persistentBufferEnabled(): Any = unwrap(this).getPersistentBufferEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BufferOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.osis.CfnPipeline.BufferOptionsProperty):
          BufferOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as? BufferOptionsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: BufferOptionsProperty):
          software.amazon.awscdk.services.osis.CfnPipeline.BufferOptionsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.osis.CfnPipeline.BufferOptionsProperty
    }
  }

  /**
   * The destination for OpenSearch Ingestion logs sent to Amazon CloudWatch.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.osis.*;
   * CloudWatchLogDestinationProperty cloudWatchLogDestinationProperty =
   * CloudWatchLogDestinationProperty.builder()
   * .logGroup("logGroup")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-osis-pipeline-cloudwatchlogdestination.html)
   */
  public interface CloudWatchLogDestinationProperty {
    /**
     * The name of the CloudWatch Logs group to send pipeline logs to.
     *
     * You can specify an existing log group or create a new one. For example,
     * `/aws/vendedlogs/OpenSearchService/pipelines` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-osis-pipeline-cloudwatchlogdestination.html#cfn-osis-pipeline-cloudwatchlogdestination-loggroup)
     */
    public fun logGroup(): String

    /**
     * A builder for [CloudWatchLogDestinationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param logGroup The name of the CloudWatch Logs group to send pipeline logs to. 
       * You can specify an existing log group or create a new one. For example,
       * `/aws/vendedlogs/OpenSearchService/pipelines` .
       */
      public fun logGroup(logGroup: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.osis.CfnPipeline.CloudWatchLogDestinationProperty.Builder
          =
          software.amazon.awscdk.services.osis.CfnPipeline.CloudWatchLogDestinationProperty.builder()

      /**
       * @param logGroup The name of the CloudWatch Logs group to send pipeline logs to. 
       * You can specify an existing log group or create a new one. For example,
       * `/aws/vendedlogs/OpenSearchService/pipelines` .
       */
      override fun logGroup(logGroup: String) {
        cdkBuilder.logGroup(logGroup)
      }

      public fun build():
          software.amazon.awscdk.services.osis.CfnPipeline.CloudWatchLogDestinationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.osis.CfnPipeline.CloudWatchLogDestinationProperty,
    ) : CdkObject(cdkObject),
        CloudWatchLogDestinationProperty {
      /**
       * The name of the CloudWatch Logs group to send pipeline logs to.
       *
       * You can specify an existing log group or create a new one. For example,
       * `/aws/vendedlogs/OpenSearchService/pipelines` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-osis-pipeline-cloudwatchlogdestination.html#cfn-osis-pipeline-cloudwatchlogdestination-loggroup)
       */
      override fun logGroup(): String = unwrap(this).getLogGroup()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CloudWatchLogDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.osis.CfnPipeline.CloudWatchLogDestinationProperty):
          CloudWatchLogDestinationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CloudWatchLogDestinationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudWatchLogDestinationProperty):
          software.amazon.awscdk.services.osis.CfnPipeline.CloudWatchLogDestinationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.osis.CfnPipeline.CloudWatchLogDestinationProperty
    }
  }

  /**
   * Options to control how OpenSearch encrypts buffer data.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.osis.*;
   * EncryptionAtRestOptionsProperty encryptionAtRestOptionsProperty =
   * EncryptionAtRestOptionsProperty.builder()
   * .kmsKeyArn("kmsKeyArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-osis-pipeline-encryptionatrestoptions.html)
   */
  public interface EncryptionAtRestOptionsProperty {
    /**
     * The ARN of the KMS key used to encrypt buffer data.
     *
     * By default, data is encrypted using an AWS owned key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-osis-pipeline-encryptionatrestoptions.html#cfn-osis-pipeline-encryptionatrestoptions-kmskeyarn)
     */
    public fun kmsKeyArn(): String

    /**
     * A builder for [EncryptionAtRestOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param kmsKeyArn The ARN of the KMS key used to encrypt buffer data. 
       * By default, data is encrypted using an AWS owned key.
       */
      public fun kmsKeyArn(kmsKeyArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.osis.CfnPipeline.EncryptionAtRestOptionsProperty.Builder =
          software.amazon.awscdk.services.osis.CfnPipeline.EncryptionAtRestOptionsProperty.builder()

      /**
       * @param kmsKeyArn The ARN of the KMS key used to encrypt buffer data. 
       * By default, data is encrypted using an AWS owned key.
       */
      override fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
      }

      public fun build():
          software.amazon.awscdk.services.osis.CfnPipeline.EncryptionAtRestOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.osis.CfnPipeline.EncryptionAtRestOptionsProperty,
    ) : CdkObject(cdkObject),
        EncryptionAtRestOptionsProperty {
      /**
       * The ARN of the KMS key used to encrypt buffer data.
       *
       * By default, data is encrypted using an AWS owned key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-osis-pipeline-encryptionatrestoptions.html#cfn-osis-pipeline-encryptionatrestoptions-kmskeyarn)
       */
      override fun kmsKeyArn(): String = unwrap(this).getKmsKeyArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionAtRestOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.osis.CfnPipeline.EncryptionAtRestOptionsProperty):
          EncryptionAtRestOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EncryptionAtRestOptionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionAtRestOptionsProperty):
          software.amazon.awscdk.services.osis.CfnPipeline.EncryptionAtRestOptionsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.osis.CfnPipeline.EncryptionAtRestOptionsProperty
    }
  }

  /**
   * Container for the values required to configure logging for the pipeline.
   *
   * If you don't specify these values, OpenSearch Ingestion will not publish logs from your
   * application to CloudWatch Logs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.osis.*;
   * LogPublishingOptionsProperty logPublishingOptionsProperty =
   * LogPublishingOptionsProperty.builder()
   * .cloudWatchLogDestination(CloudWatchLogDestinationProperty.builder()
   * .logGroup("logGroup")
   * .build())
   * .isLoggingEnabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-osis-pipeline-logpublishingoptions.html)
   */
  public interface LogPublishingOptionsProperty {
    /**
     * The destination for OpenSearch Ingestion logs sent to Amazon CloudWatch Logs.
     *
     * This parameter is required if `IsLoggingEnabled` is set to `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-osis-pipeline-logpublishingoptions.html#cfn-osis-pipeline-logpublishingoptions-cloudwatchlogdestination)
     */
    public fun cloudWatchLogDestination(): Any? = unwrap(this).getCloudWatchLogDestination()

    /**
     * Whether logs should be published.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-osis-pipeline-logpublishingoptions.html#cfn-osis-pipeline-logpublishingoptions-isloggingenabled)
     */
    public fun isLoggingEnabled(): Any? = unwrap(this).getIsLoggingEnabled()

    /**
     * A builder for [LogPublishingOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cloudWatchLogDestination The destination for OpenSearch Ingestion logs sent to
       * Amazon CloudWatch Logs.
       * This parameter is required if `IsLoggingEnabled` is set to `true` .
       */
      public fun cloudWatchLogDestination(cloudWatchLogDestination: IResolvable)

      /**
       * @param cloudWatchLogDestination The destination for OpenSearch Ingestion logs sent to
       * Amazon CloudWatch Logs.
       * This parameter is required if `IsLoggingEnabled` is set to `true` .
       */
      public
          fun cloudWatchLogDestination(cloudWatchLogDestination: CloudWatchLogDestinationProperty)

      /**
       * @param cloudWatchLogDestination The destination for OpenSearch Ingestion logs sent to
       * Amazon CloudWatch Logs.
       * This parameter is required if `IsLoggingEnabled` is set to `true` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1b9483073fa5903db0fd5376daeba740fd76ef4814aaeb929e2c3eca7fbca7a4")
      public
          fun cloudWatchLogDestination(cloudWatchLogDestination: CloudWatchLogDestinationProperty.Builder.() -> Unit)

      /**
       * @param isLoggingEnabled Whether logs should be published.
       */
      public fun isLoggingEnabled(isLoggingEnabled: Boolean)

      /**
       * @param isLoggingEnabled Whether logs should be published.
       */
      public fun isLoggingEnabled(isLoggingEnabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.osis.CfnPipeline.LogPublishingOptionsProperty.Builder =
          software.amazon.awscdk.services.osis.CfnPipeline.LogPublishingOptionsProperty.builder()

      /**
       * @param cloudWatchLogDestination The destination for OpenSearch Ingestion logs sent to
       * Amazon CloudWatch Logs.
       * This parameter is required if `IsLoggingEnabled` is set to `true` .
       */
      override fun cloudWatchLogDestination(cloudWatchLogDestination: IResolvable) {
        cdkBuilder.cloudWatchLogDestination(cloudWatchLogDestination.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param cloudWatchLogDestination The destination for OpenSearch Ingestion logs sent to
       * Amazon CloudWatch Logs.
       * This parameter is required if `IsLoggingEnabled` is set to `true` .
       */
      override
          fun cloudWatchLogDestination(cloudWatchLogDestination: CloudWatchLogDestinationProperty) {
        cdkBuilder.cloudWatchLogDestination(cloudWatchLogDestination.let(CloudWatchLogDestinationProperty.Companion::unwrap))
      }

      /**
       * @param cloudWatchLogDestination The destination for OpenSearch Ingestion logs sent to
       * Amazon CloudWatch Logs.
       * This parameter is required if `IsLoggingEnabled` is set to `true` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1b9483073fa5903db0fd5376daeba740fd76ef4814aaeb929e2c3eca7fbca7a4")
      override
          fun cloudWatchLogDestination(cloudWatchLogDestination: CloudWatchLogDestinationProperty.Builder.() -> Unit):
          Unit =
          cloudWatchLogDestination(CloudWatchLogDestinationProperty(cloudWatchLogDestination))

      /**
       * @param isLoggingEnabled Whether logs should be published.
       */
      override fun isLoggingEnabled(isLoggingEnabled: Boolean) {
        cdkBuilder.isLoggingEnabled(isLoggingEnabled)
      }

      /**
       * @param isLoggingEnabled Whether logs should be published.
       */
      override fun isLoggingEnabled(isLoggingEnabled: IResolvable) {
        cdkBuilder.isLoggingEnabled(isLoggingEnabled.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.osis.CfnPipeline.LogPublishingOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.osis.CfnPipeline.LogPublishingOptionsProperty,
    ) : CdkObject(cdkObject),
        LogPublishingOptionsProperty {
      /**
       * The destination for OpenSearch Ingestion logs sent to Amazon CloudWatch Logs.
       *
       * This parameter is required if `IsLoggingEnabled` is set to `true` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-osis-pipeline-logpublishingoptions.html#cfn-osis-pipeline-logpublishingoptions-cloudwatchlogdestination)
       */
      override fun cloudWatchLogDestination(): Any? = unwrap(this).getCloudWatchLogDestination()

      /**
       * Whether logs should be published.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-osis-pipeline-logpublishingoptions.html#cfn-osis-pipeline-logpublishingoptions-isloggingenabled)
       */
      override fun isLoggingEnabled(): Any? = unwrap(this).getIsLoggingEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LogPublishingOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.osis.CfnPipeline.LogPublishingOptionsProperty):
          LogPublishingOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LogPublishingOptionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LogPublishingOptionsProperty):
          software.amazon.awscdk.services.osis.CfnPipeline.LogPublishingOptionsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.osis.CfnPipeline.LogPublishingOptionsProperty
    }
  }

  /**
   * Options for attaching a VPC to pipeline.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.osis.*;
   * VpcAttachmentOptionsProperty vpcAttachmentOptionsProperty =
   * VpcAttachmentOptionsProperty.builder()
   * .attachToVpc(false)
   * .cidrBlock("cidrBlock")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-osis-pipeline-vpcattachmentoptions.html)
   */
  public interface VpcAttachmentOptionsProperty {
    /**
     * Whether a VPC is attached to the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-osis-pipeline-vpcattachmentoptions.html#cfn-osis-pipeline-vpcattachmentoptions-attachtovpc)
     */
    public fun attachToVpc(): Any

    /**
     * The CIDR block to be reserved for OpenSearch Ingestion to create elastic network interfaces
     * (ENIs).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-osis-pipeline-vpcattachmentoptions.html#cfn-osis-pipeline-vpcattachmentoptions-cidrblock)
     */
    public fun cidrBlock(): String

    /**
     * A builder for [VpcAttachmentOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attachToVpc Whether a VPC is attached to the pipeline. 
       */
      public fun attachToVpc(attachToVpc: Boolean)

      /**
       * @param attachToVpc Whether a VPC is attached to the pipeline. 
       */
      public fun attachToVpc(attachToVpc: IResolvable)

      /**
       * @param cidrBlock The CIDR block to be reserved for OpenSearch Ingestion to create elastic
       * network interfaces (ENIs). 
       */
      public fun cidrBlock(cidrBlock: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.osis.CfnPipeline.VpcAttachmentOptionsProperty.Builder =
          software.amazon.awscdk.services.osis.CfnPipeline.VpcAttachmentOptionsProperty.builder()

      /**
       * @param attachToVpc Whether a VPC is attached to the pipeline. 
       */
      override fun attachToVpc(attachToVpc: Boolean) {
        cdkBuilder.attachToVpc(attachToVpc)
      }

      /**
       * @param attachToVpc Whether a VPC is attached to the pipeline. 
       */
      override fun attachToVpc(attachToVpc: IResolvable) {
        cdkBuilder.attachToVpc(attachToVpc.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param cidrBlock The CIDR block to be reserved for OpenSearch Ingestion to create elastic
       * network interfaces (ENIs). 
       */
      override fun cidrBlock(cidrBlock: String) {
        cdkBuilder.cidrBlock(cidrBlock)
      }

      public fun build():
          software.amazon.awscdk.services.osis.CfnPipeline.VpcAttachmentOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.osis.CfnPipeline.VpcAttachmentOptionsProperty,
    ) : CdkObject(cdkObject),
        VpcAttachmentOptionsProperty {
      /**
       * Whether a VPC is attached to the pipeline.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-osis-pipeline-vpcattachmentoptions.html#cfn-osis-pipeline-vpcattachmentoptions-attachtovpc)
       */
      override fun attachToVpc(): Any = unwrap(this).getAttachToVpc()

      /**
       * The CIDR block to be reserved for OpenSearch Ingestion to create elastic network interfaces
       * (ENIs).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-osis-pipeline-vpcattachmentoptions.html#cfn-osis-pipeline-vpcattachmentoptions-cidrblock)
       */
      override fun cidrBlock(): String = unwrap(this).getCidrBlock()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcAttachmentOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.osis.CfnPipeline.VpcAttachmentOptionsProperty):
          VpcAttachmentOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          VpcAttachmentOptionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcAttachmentOptionsProperty):
          software.amazon.awscdk.services.osis.CfnPipeline.VpcAttachmentOptionsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.osis.CfnPipeline.VpcAttachmentOptionsProperty
    }
  }

  /**
   * An OpenSearch Ingestion-managed VPC endpoint that will access one or more pipelines.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.osis.*;
   * VpcEndpointProperty vpcEndpointProperty = VpcEndpointProperty.builder()
   * .vpcEndpointId("vpcEndpointId")
   * .vpcId("vpcId")
   * .vpcOptions(VpcOptionsProperty.builder()
   * .subnetIds(List.of("subnetIds"))
   * // the properties below are optional
   * .securityGroupIds(List.of("securityGroupIds"))
   * .vpcAttachmentOptions(VpcAttachmentOptionsProperty.builder()
   * .attachToVpc(false)
   * .cidrBlock("cidrBlock")
   * .build())
   * .vpcEndpointManagement("vpcEndpointManagement")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-osis-pipeline-vpcendpoint.html)
   */
  public interface VpcEndpointProperty {
    /**
     * The unique identifier of the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-osis-pipeline-vpcendpoint.html#cfn-osis-pipeline-vpcendpoint-vpcendpointid)
     */
    public fun vpcEndpointId(): String? = unwrap(this).getVpcEndpointId()

    /**
     * The ID for your VPC.
     *
     * AWS PrivateLink generates this value when you create a VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-osis-pipeline-vpcendpoint.html#cfn-osis-pipeline-vpcendpoint-vpcid)
     */
    public fun vpcId(): String? = unwrap(this).getVpcId()

    /**
     * Information about the VPC, including associated subnets and security groups.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-osis-pipeline-vpcendpoint.html#cfn-osis-pipeline-vpcendpoint-vpcoptions)
     */
    public fun vpcOptions(): Any? = unwrap(this).getVpcOptions()

    /**
     * A builder for [VpcEndpointProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param vpcEndpointId The unique identifier of the endpoint.
       */
      public fun vpcEndpointId(vpcEndpointId: String)

      /**
       * @param vpcId The ID for your VPC.
       * AWS PrivateLink generates this value when you create a VPC.
       */
      public fun vpcId(vpcId: String)

      /**
       * @param vpcOptions Information about the VPC, including associated subnets and security
       * groups.
       */
      public fun vpcOptions(vpcOptions: IResolvable)

      /**
       * @param vpcOptions Information about the VPC, including associated subnets and security
       * groups.
       */
      public fun vpcOptions(vpcOptions: VpcOptionsProperty)

      /**
       * @param vpcOptions Information about the VPC, including associated subnets and security
       * groups.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b0a2165aaf343d4811e4e25e9ba8d41cb49e837d7f30f2c7b5b764ef380e3c74")
      public fun vpcOptions(vpcOptions: VpcOptionsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.osis.CfnPipeline.VpcEndpointProperty.Builder =
          software.amazon.awscdk.services.osis.CfnPipeline.VpcEndpointProperty.builder()

      /**
       * @param vpcEndpointId The unique identifier of the endpoint.
       */
      override fun vpcEndpointId(vpcEndpointId: String) {
        cdkBuilder.vpcEndpointId(vpcEndpointId)
      }

      /**
       * @param vpcId The ID for your VPC.
       * AWS PrivateLink generates this value when you create a VPC.
       */
      override fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
      }

      /**
       * @param vpcOptions Information about the VPC, including associated subnets and security
       * groups.
       */
      override fun vpcOptions(vpcOptions: IResolvable) {
        cdkBuilder.vpcOptions(vpcOptions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param vpcOptions Information about the VPC, including associated subnets and security
       * groups.
       */
      override fun vpcOptions(vpcOptions: VpcOptionsProperty) {
        cdkBuilder.vpcOptions(vpcOptions.let(VpcOptionsProperty.Companion::unwrap))
      }

      /**
       * @param vpcOptions Information about the VPC, including associated subnets and security
       * groups.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b0a2165aaf343d4811e4e25e9ba8d41cb49e837d7f30f2c7b5b764ef380e3c74")
      override fun vpcOptions(vpcOptions: VpcOptionsProperty.Builder.() -> Unit): Unit =
          vpcOptions(VpcOptionsProperty(vpcOptions))

      public fun build(): software.amazon.awscdk.services.osis.CfnPipeline.VpcEndpointProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.osis.CfnPipeline.VpcEndpointProperty,
    ) : CdkObject(cdkObject),
        VpcEndpointProperty {
      /**
       * The unique identifier of the endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-osis-pipeline-vpcendpoint.html#cfn-osis-pipeline-vpcendpoint-vpcendpointid)
       */
      override fun vpcEndpointId(): String? = unwrap(this).getVpcEndpointId()

      /**
       * The ID for your VPC.
       *
       * AWS PrivateLink generates this value when you create a VPC.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-osis-pipeline-vpcendpoint.html#cfn-osis-pipeline-vpcendpoint-vpcid)
       */
      override fun vpcId(): String? = unwrap(this).getVpcId()

      /**
       * Information about the VPC, including associated subnets and security groups.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-osis-pipeline-vpcendpoint.html#cfn-osis-pipeline-vpcendpoint-vpcoptions)
       */
      override fun vpcOptions(): Any? = unwrap(this).getVpcOptions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcEndpointProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.osis.CfnPipeline.VpcEndpointProperty):
          VpcEndpointProperty = CdkObjectWrappers.wrap(cdkObject) as? VpcEndpointProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcEndpointProperty):
          software.amazon.awscdk.services.osis.CfnPipeline.VpcEndpointProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.osis.CfnPipeline.VpcEndpointProperty
    }
  }

  /**
   * Options that specify the subnets and security groups for an OpenSearch Ingestion VPC endpoint.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.osis.*;
   * VpcOptionsProperty vpcOptionsProperty = VpcOptionsProperty.builder()
   * .subnetIds(List.of("subnetIds"))
   * // the properties below are optional
   * .securityGroupIds(List.of("securityGroupIds"))
   * .vpcAttachmentOptions(VpcAttachmentOptionsProperty.builder()
   * .attachToVpc(false)
   * .cidrBlock("cidrBlock")
   * .build())
   * .vpcEndpointManagement("vpcEndpointManagement")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-osis-pipeline-vpcoptions.html)
   */
  public interface VpcOptionsProperty {
    /**
     * A list of security groups associated with the VPC endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-osis-pipeline-vpcoptions.html#cfn-osis-pipeline-vpcoptions-securitygroupids)
     */
    public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

    /**
     * A list of subnet IDs associated with the VPC endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-osis-pipeline-vpcoptions.html#cfn-osis-pipeline-vpcoptions-subnetids)
     */
    public fun subnetIds(): List<String>

    /**
     * Options for attaching a VPC to a pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-osis-pipeline-vpcoptions.html#cfn-osis-pipeline-vpcoptions-vpcattachmentoptions)
     */
    public fun vpcAttachmentOptions(): Any? = unwrap(this).getVpcAttachmentOptions()

    /**
     * Defines whether you or Amazon OpenSearch Ingestion service create and manage the VPC endpoint
     * configured for the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-osis-pipeline-vpcoptions.html#cfn-osis-pipeline-vpcoptions-vpcendpointmanagement)
     */
    public fun vpcEndpointManagement(): String? = unwrap(this).getVpcEndpointManagement()

    /**
     * A builder for [VpcOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param securityGroupIds A list of security groups associated with the VPC endpoint.
       */
      public fun securityGroupIds(securityGroupIds: List<String>)

      /**
       * @param securityGroupIds A list of security groups associated with the VPC endpoint.
       */
      public fun securityGroupIds(vararg securityGroupIds: String)

      /**
       * @param subnetIds A list of subnet IDs associated with the VPC endpoint. 
       */
      public fun subnetIds(subnetIds: List<String>)

      /**
       * @param subnetIds A list of subnet IDs associated with the VPC endpoint. 
       */
      public fun subnetIds(vararg subnetIds: String)

      /**
       * @param vpcAttachmentOptions Options for attaching a VPC to a pipeline.
       */
      public fun vpcAttachmentOptions(vpcAttachmentOptions: IResolvable)

      /**
       * @param vpcAttachmentOptions Options for attaching a VPC to a pipeline.
       */
      public fun vpcAttachmentOptions(vpcAttachmentOptions: VpcAttachmentOptionsProperty)

      /**
       * @param vpcAttachmentOptions Options for attaching a VPC to a pipeline.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0bbbc81b19d82271f8df0f0680572ec91e430c4f70c263ab7bffd9d8a774ebd6")
      public
          fun vpcAttachmentOptions(vpcAttachmentOptions: VpcAttachmentOptionsProperty.Builder.() -> Unit)

      /**
       * @param vpcEndpointManagement Defines whether you or Amazon OpenSearch Ingestion service
       * create and manage the VPC endpoint configured for the pipeline.
       */
      public fun vpcEndpointManagement(vpcEndpointManagement: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.osis.CfnPipeline.VpcOptionsProperty.Builder =
          software.amazon.awscdk.services.osis.CfnPipeline.VpcOptionsProperty.builder()

      /**
       * @param securityGroupIds A list of security groups associated with the VPC endpoint.
       */
      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      /**
       * @param securityGroupIds A list of security groups associated with the VPC endpoint.
       */
      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      /**
       * @param subnetIds A list of subnet IDs associated with the VPC endpoint. 
       */
      override fun subnetIds(subnetIds: List<String>) {
        cdkBuilder.subnetIds(subnetIds)
      }

      /**
       * @param subnetIds A list of subnet IDs associated with the VPC endpoint. 
       */
      override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

      /**
       * @param vpcAttachmentOptions Options for attaching a VPC to a pipeline.
       */
      override fun vpcAttachmentOptions(vpcAttachmentOptions: IResolvable) {
        cdkBuilder.vpcAttachmentOptions(vpcAttachmentOptions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param vpcAttachmentOptions Options for attaching a VPC to a pipeline.
       */
      override fun vpcAttachmentOptions(vpcAttachmentOptions: VpcAttachmentOptionsProperty) {
        cdkBuilder.vpcAttachmentOptions(vpcAttachmentOptions.let(VpcAttachmentOptionsProperty.Companion::unwrap))
      }

      /**
       * @param vpcAttachmentOptions Options for attaching a VPC to a pipeline.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0bbbc81b19d82271f8df0f0680572ec91e430c4f70c263ab7bffd9d8a774ebd6")
      override
          fun vpcAttachmentOptions(vpcAttachmentOptions: VpcAttachmentOptionsProperty.Builder.() -> Unit):
          Unit = vpcAttachmentOptions(VpcAttachmentOptionsProperty(vpcAttachmentOptions))

      /**
       * @param vpcEndpointManagement Defines whether you or Amazon OpenSearch Ingestion service
       * create and manage the VPC endpoint configured for the pipeline.
       */
      override fun vpcEndpointManagement(vpcEndpointManagement: String) {
        cdkBuilder.vpcEndpointManagement(vpcEndpointManagement)
      }

      public fun build(): software.amazon.awscdk.services.osis.CfnPipeline.VpcOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.osis.CfnPipeline.VpcOptionsProperty,
    ) : CdkObject(cdkObject),
        VpcOptionsProperty {
      /**
       * A list of security groups associated with the VPC endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-osis-pipeline-vpcoptions.html#cfn-osis-pipeline-vpcoptions-securitygroupids)
       */
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
          emptyList()

      /**
       * A list of subnet IDs associated with the VPC endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-osis-pipeline-vpcoptions.html#cfn-osis-pipeline-vpcoptions-subnetids)
       */
      override fun subnetIds(): List<String> = unwrap(this).getSubnetIds()

      /**
       * Options for attaching a VPC to a pipeline.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-osis-pipeline-vpcoptions.html#cfn-osis-pipeline-vpcoptions-vpcattachmentoptions)
       */
      override fun vpcAttachmentOptions(): Any? = unwrap(this).getVpcAttachmentOptions()

      /**
       * Defines whether you or Amazon OpenSearch Ingestion service create and manage the VPC
       * endpoint configured for the pipeline.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-osis-pipeline-vpcoptions.html#cfn-osis-pipeline-vpcoptions-vpcendpointmanagement)
       */
      override fun vpcEndpointManagement(): String? = unwrap(this).getVpcEndpointManagement()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.osis.CfnPipeline.VpcOptionsProperty):
          VpcOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as? VpcOptionsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcOptionsProperty):
          software.amazon.awscdk.services.osis.CfnPipeline.VpcOptionsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.osis.CfnPipeline.VpcOptionsProperty
    }
  }
}

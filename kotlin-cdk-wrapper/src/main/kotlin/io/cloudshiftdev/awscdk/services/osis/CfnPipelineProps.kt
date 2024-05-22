@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.osis

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnPipeline`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.osis.*;
 * CfnPipelineProps cfnPipelineProps = CfnPipelineProps.builder()
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
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html)
 */
public interface CfnPipelineProps {
  /**
   * Options that specify the configuration of a persistent buffer.
   *
   * To configure how OpenSearch Ingestion encrypts this data, set the `EncryptionAtRestOptions` .
   * For more information, see [Persistent
   * buffering](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/osis-features-overview.html#persistent-buffering)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-bufferoptions)
   */
  public fun bufferOptions(): Any? = unwrap(this).getBufferOptions()

  /**
   * Options to control how OpenSearch encrypts buffer data.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-encryptionatrestoptions)
   */
  public fun encryptionAtRestOptions(): Any? = unwrap(this).getEncryptionAtRestOptions()

  /**
   * Key-value pairs that represent log publishing settings.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-logpublishingoptions)
   */
  public fun logPublishingOptions(): Any? = unwrap(this).getLogPublishingOptions()

  /**
   * The maximum pipeline capacity, in Ingestion Compute Units (ICUs).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-maxunits)
   */
  public fun maxUnits(): Number

  /**
   * The minimum pipeline capacity, in Ingestion Compute Units (ICUs).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-minunits)
   */
  public fun minUnits(): Number

  /**
   * The Data Prepper pipeline configuration in YAML format.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-pipelineconfigurationbody)
   */
  public fun pipelineConfigurationBody(): String

  /**
   * The name of the pipeline.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-pipelinename)
   */
  public fun pipelineName(): String

  /**
   * List of tags to add to the pipeline upon creation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Options that specify the subnets and security groups for an OpenSearch Ingestion VPC endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-vpcoptions)
   */
  public fun vpcOptions(): Any? = unwrap(this).getVpcOptions()

  /**
   * A builder for [CfnPipelineProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bufferOptions Options that specify the configuration of a persistent buffer.
     * To configure how OpenSearch Ingestion encrypts this data, set the `EncryptionAtRestOptions` .
     * For more information, see [Persistent
     * buffering](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/osis-features-overview.html#persistent-buffering)
     * .
     */
    public fun bufferOptions(bufferOptions: IResolvable)

    /**
     * @param bufferOptions Options that specify the configuration of a persistent buffer.
     * To configure how OpenSearch Ingestion encrypts this data, set the `EncryptionAtRestOptions` .
     * For more information, see [Persistent
     * buffering](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/osis-features-overview.html#persistent-buffering)
     * .
     */
    public fun bufferOptions(bufferOptions: CfnPipeline.BufferOptionsProperty)

    /**
     * @param bufferOptions Options that specify the configuration of a persistent buffer.
     * To configure how OpenSearch Ingestion encrypts this data, set the `EncryptionAtRestOptions` .
     * For more information, see [Persistent
     * buffering](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/osis-features-overview.html#persistent-buffering)
     * .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9d0de03db58e944840acf56075fb0773f9a2fdac31c30644359a057675c2ce6a")
    public fun bufferOptions(bufferOptions: CfnPipeline.BufferOptionsProperty.Builder.() -> Unit)

    /**
     * @param encryptionAtRestOptions Options to control how OpenSearch encrypts buffer data.
     */
    public fun encryptionAtRestOptions(encryptionAtRestOptions: IResolvable)

    /**
     * @param encryptionAtRestOptions Options to control how OpenSearch encrypts buffer data.
     */
    public
        fun encryptionAtRestOptions(encryptionAtRestOptions: CfnPipeline.EncryptionAtRestOptionsProperty)

    /**
     * @param encryptionAtRestOptions Options to control how OpenSearch encrypts buffer data.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("32ce6e1481f6149d47367b7798633f7b4788e228f5426242098072216524bf18")
    public
        fun encryptionAtRestOptions(encryptionAtRestOptions: CfnPipeline.EncryptionAtRestOptionsProperty.Builder.() -> Unit)

    /**
     * @param logPublishingOptions Key-value pairs that represent log publishing settings.
     */
    public fun logPublishingOptions(logPublishingOptions: IResolvable)

    /**
     * @param logPublishingOptions Key-value pairs that represent log publishing settings.
     */
    public fun logPublishingOptions(logPublishingOptions: CfnPipeline.LogPublishingOptionsProperty)

    /**
     * @param logPublishingOptions Key-value pairs that represent log publishing settings.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fa9dc3615523662a1844974ce19047e63b9254ba594714dd88be3d14ab667364")
    public
        fun logPublishingOptions(logPublishingOptions: CfnPipeline.LogPublishingOptionsProperty.Builder.() -> Unit)

    /**
     * @param maxUnits The maximum pipeline capacity, in Ingestion Compute Units (ICUs). 
     */
    public fun maxUnits(maxUnits: Number)

    /**
     * @param minUnits The minimum pipeline capacity, in Ingestion Compute Units (ICUs). 
     */
    public fun minUnits(minUnits: Number)

    /**
     * @param pipelineConfigurationBody The Data Prepper pipeline configuration in YAML format. 
     */
    public fun pipelineConfigurationBody(pipelineConfigurationBody: String)

    /**
     * @param pipelineName The name of the pipeline. 
     */
    public fun pipelineName(pipelineName: String)

    /**
     * @param tags List of tags to add to the pipeline upon creation.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags List of tags to add to the pipeline upon creation.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param vpcOptions Options that specify the subnets and security groups for an OpenSearch
     * Ingestion VPC endpoint.
     */
    public fun vpcOptions(vpcOptions: IResolvable)

    /**
     * @param vpcOptions Options that specify the subnets and security groups for an OpenSearch
     * Ingestion VPC endpoint.
     */
    public fun vpcOptions(vpcOptions: CfnPipeline.VpcOptionsProperty)

    /**
     * @param vpcOptions Options that specify the subnets and security groups for an OpenSearch
     * Ingestion VPC endpoint.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("284a05bce2e7d218f7ae32de2ef72aaf0dc3a594e59cdbdbd810d3df701f1ffc")
    public fun vpcOptions(vpcOptions: CfnPipeline.VpcOptionsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.osis.CfnPipelineProps.Builder =
        software.amazon.awscdk.services.osis.CfnPipelineProps.builder()

    /**
     * @param bufferOptions Options that specify the configuration of a persistent buffer.
     * To configure how OpenSearch Ingestion encrypts this data, set the `EncryptionAtRestOptions` .
     * For more information, see [Persistent
     * buffering](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/osis-features-overview.html#persistent-buffering)
     * .
     */
    override fun bufferOptions(bufferOptions: IResolvable) {
      cdkBuilder.bufferOptions(bufferOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param bufferOptions Options that specify the configuration of a persistent buffer.
     * To configure how OpenSearch Ingestion encrypts this data, set the `EncryptionAtRestOptions` .
     * For more information, see [Persistent
     * buffering](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/osis-features-overview.html#persistent-buffering)
     * .
     */
    override fun bufferOptions(bufferOptions: CfnPipeline.BufferOptionsProperty) {
      cdkBuilder.bufferOptions(bufferOptions.let(CfnPipeline.BufferOptionsProperty.Companion::unwrap))
    }

    /**
     * @param bufferOptions Options that specify the configuration of a persistent buffer.
     * To configure how OpenSearch Ingestion encrypts this data, set the `EncryptionAtRestOptions` .
     * For more information, see [Persistent
     * buffering](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/osis-features-overview.html#persistent-buffering)
     * .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9d0de03db58e944840acf56075fb0773f9a2fdac31c30644359a057675c2ce6a")
    override fun bufferOptions(bufferOptions: CfnPipeline.BufferOptionsProperty.Builder.() -> Unit):
        Unit = bufferOptions(CfnPipeline.BufferOptionsProperty(bufferOptions))

    /**
     * @param encryptionAtRestOptions Options to control how OpenSearch encrypts buffer data.
     */
    override fun encryptionAtRestOptions(encryptionAtRestOptions: IResolvable) {
      cdkBuilder.encryptionAtRestOptions(encryptionAtRestOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param encryptionAtRestOptions Options to control how OpenSearch encrypts buffer data.
     */
    override
        fun encryptionAtRestOptions(encryptionAtRestOptions: CfnPipeline.EncryptionAtRestOptionsProperty) {
      cdkBuilder.encryptionAtRestOptions(encryptionAtRestOptions.let(CfnPipeline.EncryptionAtRestOptionsProperty.Companion::unwrap))
    }

    /**
     * @param encryptionAtRestOptions Options to control how OpenSearch encrypts buffer data.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("32ce6e1481f6149d47367b7798633f7b4788e228f5426242098072216524bf18")
    override
        fun encryptionAtRestOptions(encryptionAtRestOptions: CfnPipeline.EncryptionAtRestOptionsProperty.Builder.() -> Unit):
        Unit =
        encryptionAtRestOptions(CfnPipeline.EncryptionAtRestOptionsProperty(encryptionAtRestOptions))

    /**
     * @param logPublishingOptions Key-value pairs that represent log publishing settings.
     */
    override fun logPublishingOptions(logPublishingOptions: IResolvable) {
      cdkBuilder.logPublishingOptions(logPublishingOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param logPublishingOptions Key-value pairs that represent log publishing settings.
     */
    override
        fun logPublishingOptions(logPublishingOptions: CfnPipeline.LogPublishingOptionsProperty) {
      cdkBuilder.logPublishingOptions(logPublishingOptions.let(CfnPipeline.LogPublishingOptionsProperty.Companion::unwrap))
    }

    /**
     * @param logPublishingOptions Key-value pairs that represent log publishing settings.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fa9dc3615523662a1844974ce19047e63b9254ba594714dd88be3d14ab667364")
    override
        fun logPublishingOptions(logPublishingOptions: CfnPipeline.LogPublishingOptionsProperty.Builder.() -> Unit):
        Unit = logPublishingOptions(CfnPipeline.LogPublishingOptionsProperty(logPublishingOptions))

    /**
     * @param maxUnits The maximum pipeline capacity, in Ingestion Compute Units (ICUs). 
     */
    override fun maxUnits(maxUnits: Number) {
      cdkBuilder.maxUnits(maxUnits)
    }

    /**
     * @param minUnits The minimum pipeline capacity, in Ingestion Compute Units (ICUs). 
     */
    override fun minUnits(minUnits: Number) {
      cdkBuilder.minUnits(minUnits)
    }

    /**
     * @param pipelineConfigurationBody The Data Prepper pipeline configuration in YAML format. 
     */
    override fun pipelineConfigurationBody(pipelineConfigurationBody: String) {
      cdkBuilder.pipelineConfigurationBody(pipelineConfigurationBody)
    }

    /**
     * @param pipelineName The name of the pipeline. 
     */
    override fun pipelineName(pipelineName: String) {
      cdkBuilder.pipelineName(pipelineName)
    }

    /**
     * @param tags List of tags to add to the pipeline upon creation.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags List of tags to add to the pipeline upon creation.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param vpcOptions Options that specify the subnets and security groups for an OpenSearch
     * Ingestion VPC endpoint.
     */
    override fun vpcOptions(vpcOptions: IResolvable) {
      cdkBuilder.vpcOptions(vpcOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param vpcOptions Options that specify the subnets and security groups for an OpenSearch
     * Ingestion VPC endpoint.
     */
    override fun vpcOptions(vpcOptions: CfnPipeline.VpcOptionsProperty) {
      cdkBuilder.vpcOptions(vpcOptions.let(CfnPipeline.VpcOptionsProperty.Companion::unwrap))
    }

    /**
     * @param vpcOptions Options that specify the subnets and security groups for an OpenSearch
     * Ingestion VPC endpoint.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("284a05bce2e7d218f7ae32de2ef72aaf0dc3a594e59cdbdbd810d3df701f1ffc")
    override fun vpcOptions(vpcOptions: CfnPipeline.VpcOptionsProperty.Builder.() -> Unit): Unit =
        vpcOptions(CfnPipeline.VpcOptionsProperty(vpcOptions))

    public fun build(): software.amazon.awscdk.services.osis.CfnPipelineProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.osis.CfnPipelineProps,
  ) : CdkObject(cdkObject), CfnPipelineProps {
    /**
     * Options that specify the configuration of a persistent buffer.
     *
     * To configure how OpenSearch Ingestion encrypts this data, set the `EncryptionAtRestOptions` .
     * For more information, see [Persistent
     * buffering](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/osis-features-overview.html#persistent-buffering)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-bufferoptions)
     */
    override fun bufferOptions(): Any? = unwrap(this).getBufferOptions()

    /**
     * Options to control how OpenSearch encrypts buffer data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-encryptionatrestoptions)
     */
    override fun encryptionAtRestOptions(): Any? = unwrap(this).getEncryptionAtRestOptions()

    /**
     * Key-value pairs that represent log publishing settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-logpublishingoptions)
     */
    override fun logPublishingOptions(): Any? = unwrap(this).getLogPublishingOptions()

    /**
     * The maximum pipeline capacity, in Ingestion Compute Units (ICUs).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-maxunits)
     */
    override fun maxUnits(): Number = unwrap(this).getMaxUnits()

    /**
     * The minimum pipeline capacity, in Ingestion Compute Units (ICUs).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-minunits)
     */
    override fun minUnits(): Number = unwrap(this).getMinUnits()

    /**
     * The Data Prepper pipeline configuration in YAML format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-pipelineconfigurationbody)
     */
    override fun pipelineConfigurationBody(): String = unwrap(this).getPipelineConfigurationBody()

    /**
     * The name of the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-pipelinename)
     */
    override fun pipelineName(): String = unwrap(this).getPipelineName()

    /**
     * List of tags to add to the pipeline upon creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * Options that specify the subnets and security groups for an OpenSearch Ingestion VPC
     * endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-vpcoptions)
     */
    override fun vpcOptions(): Any? = unwrap(this).getVpcOptions()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPipelineProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.osis.CfnPipelineProps):
        CfnPipelineProps = CdkObjectWrappers.wrap(cdkObject) as? CfnPipelineProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPipelineProps):
        software.amazon.awscdk.services.osis.CfnPipelineProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.osis.CfnPipelineProps
  }
}

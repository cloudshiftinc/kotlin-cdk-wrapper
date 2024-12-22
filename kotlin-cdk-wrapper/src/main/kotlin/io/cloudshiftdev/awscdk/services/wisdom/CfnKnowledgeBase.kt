@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.wisdom

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
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies a knowledge base.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.wisdom.*;
 * CfnKnowledgeBase cfnKnowledgeBase = CfnKnowledgeBase.Builder.create(this, "MyCfnKnowledgeBase")
 * .knowledgeBaseType("knowledgeBaseType")
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .renderingConfiguration(RenderingConfigurationProperty.builder()
 * .templateUri("templateUri")
 * .build())
 * .serverSideEncryptionConfiguration(ServerSideEncryptionConfigurationProperty.builder()
 * .kmsKeyId("kmsKeyId")
 * .build())
 * .sourceConfiguration(SourceConfigurationProperty.builder()
 * .appIntegrations(AppIntegrationsConfigurationProperty.builder()
 * .appIntegrationArn("appIntegrationArn")
 * // the properties below are optional
 * .objectFields(List.of("objectFields"))
 * .build())
 * .managedSourceConfiguration(ManagedSourceConfigurationProperty.builder()
 * .webCrawlerConfiguration(WebCrawlerConfigurationProperty.builder()
 * .urlConfiguration(UrlConfigurationProperty.builder()
 * .seedUrls(List.of(SeedUrlProperty.builder()
 * .url("url")
 * .build()))
 * .build())
 * // the properties below are optional
 * .crawlerLimits(CrawlerLimitsProperty.builder()
 * .rateLimit(123)
 * .build())
 * .exclusionFilters(List.of("exclusionFilters"))
 * .inclusionFilters(List.of("inclusionFilters"))
 * .scope("scope")
 * .build())
 * .build())
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .vectorIngestionConfiguration(VectorIngestionConfigurationProperty.builder()
 * .chunkingConfiguration(ChunkingConfigurationProperty.builder()
 * .chunkingStrategy("chunkingStrategy")
 * // the properties below are optional
 * .fixedSizeChunkingConfiguration(FixedSizeChunkingConfigurationProperty.builder()
 * .maxTokens(123)
 * .overlapPercentage(123)
 * .build())
 * .hierarchicalChunkingConfiguration(HierarchicalChunkingConfigurationProperty.builder()
 * .levelConfigurations(List.of(HierarchicalChunkingLevelConfigurationProperty.builder()
 * .maxTokens(123)
 * .build()))
 * .overlapTokens(123)
 * .build())
 * .semanticChunkingConfiguration(SemanticChunkingConfigurationProperty.builder()
 * .breakpointPercentileThreshold(123)
 * .bufferSize(123)
 * .maxTokens(123)
 * .build())
 * .build())
 * .parsingConfiguration(ParsingConfigurationProperty.builder()
 * .parsingStrategy("parsingStrategy")
 * // the properties below are optional
 * .bedrockFoundationModelConfiguration(BedrockFoundationModelConfigurationProperty.builder()
 * .modelArn("modelArn")
 * // the properties below are optional
 * .parsingPrompt(ParsingPromptProperty.builder()
 * .parsingPromptText("parsingPromptText")
 * .build())
 * .build())
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-knowledgebase.html)
 */
public open class CfnKnowledgeBase(
  cdkObject: software.amazon.awscdk.services.wisdom.CfnKnowledgeBase,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnKnowledgeBaseProps,
  ) :
      this(software.amazon.awscdk.services.wisdom.CfnKnowledgeBase(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnKnowledgeBaseProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnKnowledgeBaseProps.Builder.() -> Unit,
  ) : this(scope, id, CfnKnowledgeBaseProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the knowledge base.
   */
  public open fun attrKnowledgeBaseArn(): String = unwrap(this).getAttrKnowledgeBaseArn()

  /**
   * The ID of the knowledge base.
   */
  public open fun attrKnowledgeBaseId(): String = unwrap(this).getAttrKnowledgeBaseId()

  /**
   * The description.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The type of knowledge base.
   */
  public open fun knowledgeBaseType(): String = unwrap(this).getKnowledgeBaseType()

  /**
   * The type of knowledge base.
   */
  public open fun knowledgeBaseType(`value`: String) {
    unwrap(this).setKnowledgeBaseType(`value`)
  }

  /**
   * The name of the knowledge base.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the knowledge base.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Information about how to render the content.
   */
  public open fun renderingConfiguration(): Any? = unwrap(this).getRenderingConfiguration()

  /**
   * Information about how to render the content.
   */
  public open fun renderingConfiguration(`value`: IResolvable) {
    unwrap(this).setRenderingConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Information about how to render the content.
   */
  public open fun renderingConfiguration(`value`: RenderingConfigurationProperty) {
    unwrap(this).setRenderingConfiguration(`value`.let(RenderingConfigurationProperty.Companion::unwrap))
  }

  /**
   * Information about how to render the content.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7924ce83f77d64440444f88dd3eb4d4945bd8f98ba1056e38b89f5daa1e40c8c")
  public open
      fun renderingConfiguration(`value`: RenderingConfigurationProperty.Builder.() -> Unit): Unit =
      renderingConfiguration(RenderingConfigurationProperty(`value`))

  /**
   * This customer managed key must have a policy that allows `kms:CreateGrant` and
   * `kms:DescribeKey` permissions to the IAM identity using the key to invoke Wisdom.
   */
  public open fun serverSideEncryptionConfiguration(): Any? =
      unwrap(this).getServerSideEncryptionConfiguration()

  /**
   * This customer managed key must have a policy that allows `kms:CreateGrant` and
   * `kms:DescribeKey` permissions to the IAM identity using the key to invoke Wisdom.
   */
  public open fun serverSideEncryptionConfiguration(`value`: IResolvable) {
    unwrap(this).setServerSideEncryptionConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * This customer managed key must have a policy that allows `kms:CreateGrant` and
   * `kms:DescribeKey` permissions to the IAM identity using the key to invoke Wisdom.
   */
  public open
      fun serverSideEncryptionConfiguration(`value`: ServerSideEncryptionConfigurationProperty) {
    unwrap(this).setServerSideEncryptionConfiguration(`value`.let(ServerSideEncryptionConfigurationProperty.Companion::unwrap))
  }

  /**
   * This customer managed key must have a policy that allows `kms:CreateGrant` and
   * `kms:DescribeKey` permissions to the IAM identity using the key to invoke Wisdom.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("366eba3c184487b90c73d62cc720314786f3dbfa566a69f3d1954c0a2e9b443a")
  public open
      fun serverSideEncryptionConfiguration(`value`: ServerSideEncryptionConfigurationProperty.Builder.() -> Unit):
      Unit = serverSideEncryptionConfiguration(ServerSideEncryptionConfigurationProperty(`value`))

  /**
   * The source of the knowledge base content.
   */
  public open fun sourceConfiguration(): Any? = unwrap(this).getSourceConfiguration()

  /**
   * The source of the knowledge base content.
   */
  public open fun sourceConfiguration(`value`: IResolvable) {
    unwrap(this).setSourceConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The source of the knowledge base content.
   */
  public open fun sourceConfiguration(`value`: SourceConfigurationProperty) {
    unwrap(this).setSourceConfiguration(`value`.let(SourceConfigurationProperty.Companion::unwrap))
  }

  /**
   * The source of the knowledge base content.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("670b4a243ca021d46bb10369ed19127f574324d44e4685bf477cf3753a5c3129")
  public open fun sourceConfiguration(`value`: SourceConfigurationProperty.Builder.() -> Unit): Unit
      = sourceConfiguration(SourceConfigurationProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * Contains details about how to ingest the documents in a data source.
   */
  public open fun vectorIngestionConfiguration(): Any? =
      unwrap(this).getVectorIngestionConfiguration()

  /**
   * Contains details about how to ingest the documents in a data source.
   */
  public open fun vectorIngestionConfiguration(`value`: IResolvable) {
    unwrap(this).setVectorIngestionConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Contains details about how to ingest the documents in a data source.
   */
  public open fun vectorIngestionConfiguration(`value`: VectorIngestionConfigurationProperty) {
    unwrap(this).setVectorIngestionConfiguration(`value`.let(VectorIngestionConfigurationProperty.Companion::unwrap))
  }

  /**
   * Contains details about how to ingest the documents in a data source.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e5a5c4f17a7cef0715b83ab93e40b4615264b2be81ed3d8c1f0aa675bf4813ed")
  public open
      fun vectorIngestionConfiguration(`value`: VectorIngestionConfigurationProperty.Builder.() -> Unit):
      Unit = vectorIngestionConfiguration(VectorIngestionConfigurationProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.wisdom.CfnKnowledgeBase].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-knowledgebase.html#cfn-wisdom-knowledgebase-description)
     * @param description The description. 
     */
    public fun description(description: String)

    /**
     * The type of knowledge base.
     *
     * Only CUSTOM knowledge bases allow you to upload your own content. EXTERNAL knowledge bases
     * support integrations with third-party systems whose content is synchronized automatically.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-knowledgebase.html#cfn-wisdom-knowledgebase-knowledgebasetype)
     * @param knowledgeBaseType The type of knowledge base. 
     */
    public fun knowledgeBaseType(knowledgeBaseType: String)

    /**
     * The name of the knowledge base.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-knowledgebase.html#cfn-wisdom-knowledgebase-name)
     * @param name The name of the knowledge base. 
     */
    public fun name(name: String)

    /**
     * Information about how to render the content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-knowledgebase.html#cfn-wisdom-knowledgebase-renderingconfiguration)
     * @param renderingConfiguration Information about how to render the content. 
     */
    public fun renderingConfiguration(renderingConfiguration: IResolvable)

    /**
     * Information about how to render the content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-knowledgebase.html#cfn-wisdom-knowledgebase-renderingconfiguration)
     * @param renderingConfiguration Information about how to render the content. 
     */
    public fun renderingConfiguration(renderingConfiguration: RenderingConfigurationProperty)

    /**
     * Information about how to render the content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-knowledgebase.html#cfn-wisdom-knowledgebase-renderingconfiguration)
     * @param renderingConfiguration Information about how to render the content. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b99b7c442864630a725d6c732c7dec3f1cb7334c007c5b95b44f47dc8c322fc2")
    public
        fun renderingConfiguration(renderingConfiguration: RenderingConfigurationProperty.Builder.() -> Unit)

    /**
     * This customer managed key must have a policy that allows `kms:CreateGrant` and
     * `kms:DescribeKey` permissions to the IAM identity using the key to invoke Wisdom.
     *
     * For more information about setting up a customer managed key for Wisdom, see [Enable Amazon
     * Connect Wisdom for your
     * instance](https://docs.aws.amazon.com/connect/latest/adminguide/enable-wisdom.html) . For
     * information about valid ID values, see [Key identifiers
     * (KeyId)](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id) in the *AWS
     * Key Management Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-knowledgebase.html#cfn-wisdom-knowledgebase-serversideencryptionconfiguration)
     * @param serverSideEncryptionConfiguration This customer managed key must have a policy that
     * allows `kms:CreateGrant` and `kms:DescribeKey` permissions to the IAM identity using the key to
     * invoke Wisdom. 
     */
    public fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: IResolvable)

    /**
     * This customer managed key must have a policy that allows `kms:CreateGrant` and
     * `kms:DescribeKey` permissions to the IAM identity using the key to invoke Wisdom.
     *
     * For more information about setting up a customer managed key for Wisdom, see [Enable Amazon
     * Connect Wisdom for your
     * instance](https://docs.aws.amazon.com/connect/latest/adminguide/enable-wisdom.html) . For
     * information about valid ID values, see [Key identifiers
     * (KeyId)](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id) in the *AWS
     * Key Management Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-knowledgebase.html#cfn-wisdom-knowledgebase-serversideencryptionconfiguration)
     * @param serverSideEncryptionConfiguration This customer managed key must have a policy that
     * allows `kms:CreateGrant` and `kms:DescribeKey` permissions to the IAM identity using the key to
     * invoke Wisdom. 
     */
    public
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: ServerSideEncryptionConfigurationProperty)

    /**
     * This customer managed key must have a policy that allows `kms:CreateGrant` and
     * `kms:DescribeKey` permissions to the IAM identity using the key to invoke Wisdom.
     *
     * For more information about setting up a customer managed key for Wisdom, see [Enable Amazon
     * Connect Wisdom for your
     * instance](https://docs.aws.amazon.com/connect/latest/adminguide/enable-wisdom.html) . For
     * information about valid ID values, see [Key identifiers
     * (KeyId)](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id) in the *AWS
     * Key Management Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-knowledgebase.html#cfn-wisdom-knowledgebase-serversideencryptionconfiguration)
     * @param serverSideEncryptionConfiguration This customer managed key must have a policy that
     * allows `kms:CreateGrant` and `kms:DescribeKey` permissions to the IAM identity using the key to
     * invoke Wisdom. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a593150940889e7d085bf1701d88c0c61a1efe41f44ae6c05f4819ccbe3a2ff2")
    public
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: ServerSideEncryptionConfigurationProperty.Builder.() -> Unit)

    /**
     * The source of the knowledge base content.
     *
     * Only set this argument for EXTERNAL or Managed knowledge bases.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-knowledgebase.html#cfn-wisdom-knowledgebase-sourceconfiguration)
     * @param sourceConfiguration The source of the knowledge base content. 
     */
    public fun sourceConfiguration(sourceConfiguration: IResolvable)

    /**
     * The source of the knowledge base content.
     *
     * Only set this argument for EXTERNAL or Managed knowledge bases.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-knowledgebase.html#cfn-wisdom-knowledgebase-sourceconfiguration)
     * @param sourceConfiguration The source of the knowledge base content. 
     */
    public fun sourceConfiguration(sourceConfiguration: SourceConfigurationProperty)

    /**
     * The source of the knowledge base content.
     *
     * Only set this argument for EXTERNAL or Managed knowledge bases.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-knowledgebase.html#cfn-wisdom-knowledgebase-sourceconfiguration)
     * @param sourceConfiguration The source of the knowledge base content. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9c9332db18c2e5fc8ef05f70b66f404acef2ce02aa1428319bfda4d40b132a7f")
    public
        fun sourceConfiguration(sourceConfiguration: SourceConfigurationProperty.Builder.() -> Unit)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-knowledgebase.html#cfn-wisdom-knowledgebase-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-knowledgebase.html#cfn-wisdom-knowledgebase-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * Contains details about how to ingest the documents in a data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-knowledgebase.html#cfn-wisdom-knowledgebase-vectoringestionconfiguration)
     * @param vectorIngestionConfiguration Contains details about how to ingest the documents in a
     * data source. 
     */
    public fun vectorIngestionConfiguration(vectorIngestionConfiguration: IResolvable)

    /**
     * Contains details about how to ingest the documents in a data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-knowledgebase.html#cfn-wisdom-knowledgebase-vectoringestionconfiguration)
     * @param vectorIngestionConfiguration Contains details about how to ingest the documents in a
     * data source. 
     */
    public
        fun vectorIngestionConfiguration(vectorIngestionConfiguration: VectorIngestionConfigurationProperty)

    /**
     * Contains details about how to ingest the documents in a data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-knowledgebase.html#cfn-wisdom-knowledgebase-vectoringestionconfiguration)
     * @param vectorIngestionConfiguration Contains details about how to ingest the documents in a
     * data source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("84b8d089bcce509b7c83b048060b3bbe8c6783ed9f0889546a0153f314cd69ef")
    public
        fun vectorIngestionConfiguration(vectorIngestionConfiguration: VectorIngestionConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.Builder =
        software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.Builder.create(scope, id)

    /**
     * The description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-knowledgebase.html#cfn-wisdom-knowledgebase-description)
     * @param description The description. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The type of knowledge base.
     *
     * Only CUSTOM knowledge bases allow you to upload your own content. EXTERNAL knowledge bases
     * support integrations with third-party systems whose content is synchronized automatically.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-knowledgebase.html#cfn-wisdom-knowledgebase-knowledgebasetype)
     * @param knowledgeBaseType The type of knowledge base. 
     */
    override fun knowledgeBaseType(knowledgeBaseType: String) {
      cdkBuilder.knowledgeBaseType(knowledgeBaseType)
    }

    /**
     * The name of the knowledge base.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-knowledgebase.html#cfn-wisdom-knowledgebase-name)
     * @param name The name of the knowledge base. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Information about how to render the content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-knowledgebase.html#cfn-wisdom-knowledgebase-renderingconfiguration)
     * @param renderingConfiguration Information about how to render the content. 
     */
    override fun renderingConfiguration(renderingConfiguration: IResolvable) {
      cdkBuilder.renderingConfiguration(renderingConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Information about how to render the content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-knowledgebase.html#cfn-wisdom-knowledgebase-renderingconfiguration)
     * @param renderingConfiguration Information about how to render the content. 
     */
    override fun renderingConfiguration(renderingConfiguration: RenderingConfigurationProperty) {
      cdkBuilder.renderingConfiguration(renderingConfiguration.let(RenderingConfigurationProperty.Companion::unwrap))
    }

    /**
     * Information about how to render the content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-knowledgebase.html#cfn-wisdom-knowledgebase-renderingconfiguration)
     * @param renderingConfiguration Information about how to render the content. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b99b7c442864630a725d6c732c7dec3f1cb7334c007c5b95b44f47dc8c322fc2")
    override
        fun renderingConfiguration(renderingConfiguration: RenderingConfigurationProperty.Builder.() -> Unit):
        Unit = renderingConfiguration(RenderingConfigurationProperty(renderingConfiguration))

    /**
     * This customer managed key must have a policy that allows `kms:CreateGrant` and
     * `kms:DescribeKey` permissions to the IAM identity using the key to invoke Wisdom.
     *
     * For more information about setting up a customer managed key for Wisdom, see [Enable Amazon
     * Connect Wisdom for your
     * instance](https://docs.aws.amazon.com/connect/latest/adminguide/enable-wisdom.html) . For
     * information about valid ID values, see [Key identifiers
     * (KeyId)](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id) in the *AWS
     * Key Management Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-knowledgebase.html#cfn-wisdom-knowledgebase-serversideencryptionconfiguration)
     * @param serverSideEncryptionConfiguration This customer managed key must have a policy that
     * allows `kms:CreateGrant` and `kms:DescribeKey` permissions to the IAM identity using the key to
     * invoke Wisdom. 
     */
    override fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: IResolvable) {
      cdkBuilder.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * This customer managed key must have a policy that allows `kms:CreateGrant` and
     * `kms:DescribeKey` permissions to the IAM identity using the key to invoke Wisdom.
     *
     * For more information about setting up a customer managed key for Wisdom, see [Enable Amazon
     * Connect Wisdom for your
     * instance](https://docs.aws.amazon.com/connect/latest/adminguide/enable-wisdom.html) . For
     * information about valid ID values, see [Key identifiers
     * (KeyId)](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id) in the *AWS
     * Key Management Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-knowledgebase.html#cfn-wisdom-knowledgebase-serversideencryptionconfiguration)
     * @param serverSideEncryptionConfiguration This customer managed key must have a policy that
     * allows `kms:CreateGrant` and `kms:DescribeKey` permissions to the IAM identity using the key to
     * invoke Wisdom. 
     */
    override
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: ServerSideEncryptionConfigurationProperty) {
      cdkBuilder.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration.let(ServerSideEncryptionConfigurationProperty.Companion::unwrap))
    }

    /**
     * This customer managed key must have a policy that allows `kms:CreateGrant` and
     * `kms:DescribeKey` permissions to the IAM identity using the key to invoke Wisdom.
     *
     * For more information about setting up a customer managed key for Wisdom, see [Enable Amazon
     * Connect Wisdom for your
     * instance](https://docs.aws.amazon.com/connect/latest/adminguide/enable-wisdom.html) . For
     * information about valid ID values, see [Key identifiers
     * (KeyId)](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id) in the *AWS
     * Key Management Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-knowledgebase.html#cfn-wisdom-knowledgebase-serversideencryptionconfiguration)
     * @param serverSideEncryptionConfiguration This customer managed key must have a policy that
     * allows `kms:CreateGrant` and `kms:DescribeKey` permissions to the IAM identity using the key to
     * invoke Wisdom. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a593150940889e7d085bf1701d88c0c61a1efe41f44ae6c05f4819ccbe3a2ff2")
    override
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: ServerSideEncryptionConfigurationProperty.Builder.() -> Unit):
        Unit =
        serverSideEncryptionConfiguration(ServerSideEncryptionConfigurationProperty(serverSideEncryptionConfiguration))

    /**
     * The source of the knowledge base content.
     *
     * Only set this argument for EXTERNAL or Managed knowledge bases.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-knowledgebase.html#cfn-wisdom-knowledgebase-sourceconfiguration)
     * @param sourceConfiguration The source of the knowledge base content. 
     */
    override fun sourceConfiguration(sourceConfiguration: IResolvable) {
      cdkBuilder.sourceConfiguration(sourceConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * The source of the knowledge base content.
     *
     * Only set this argument for EXTERNAL or Managed knowledge bases.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-knowledgebase.html#cfn-wisdom-knowledgebase-sourceconfiguration)
     * @param sourceConfiguration The source of the knowledge base content. 
     */
    override fun sourceConfiguration(sourceConfiguration: SourceConfigurationProperty) {
      cdkBuilder.sourceConfiguration(sourceConfiguration.let(SourceConfigurationProperty.Companion::unwrap))
    }

    /**
     * The source of the knowledge base content.
     *
     * Only set this argument for EXTERNAL or Managed knowledge bases.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-knowledgebase.html#cfn-wisdom-knowledgebase-sourceconfiguration)
     * @param sourceConfiguration The source of the knowledge base content. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9c9332db18c2e5fc8ef05f70b66f404acef2ce02aa1428319bfda4d40b132a7f")
    override
        fun sourceConfiguration(sourceConfiguration: SourceConfigurationProperty.Builder.() -> Unit):
        Unit = sourceConfiguration(SourceConfigurationProperty(sourceConfiguration))

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-knowledgebase.html#cfn-wisdom-knowledgebase-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-knowledgebase.html#cfn-wisdom-knowledgebase-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * Contains details about how to ingest the documents in a data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-knowledgebase.html#cfn-wisdom-knowledgebase-vectoringestionconfiguration)
     * @param vectorIngestionConfiguration Contains details about how to ingest the documents in a
     * data source. 
     */
    override fun vectorIngestionConfiguration(vectorIngestionConfiguration: IResolvable) {
      cdkBuilder.vectorIngestionConfiguration(vectorIngestionConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Contains details about how to ingest the documents in a data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-knowledgebase.html#cfn-wisdom-knowledgebase-vectoringestionconfiguration)
     * @param vectorIngestionConfiguration Contains details about how to ingest the documents in a
     * data source. 
     */
    override
        fun vectorIngestionConfiguration(vectorIngestionConfiguration: VectorIngestionConfigurationProperty) {
      cdkBuilder.vectorIngestionConfiguration(vectorIngestionConfiguration.let(VectorIngestionConfigurationProperty.Companion::unwrap))
    }

    /**
     * Contains details about how to ingest the documents in a data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-knowledgebase.html#cfn-wisdom-knowledgebase-vectoringestionconfiguration)
     * @param vectorIngestionConfiguration Contains details about how to ingest the documents in a
     * data source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("84b8d089bcce509b7c83b048060b3bbe8c6783ed9f0889546a0153f314cd69ef")
    override
        fun vectorIngestionConfiguration(vectorIngestionConfiguration: VectorIngestionConfigurationProperty.Builder.() -> Unit):
        Unit =
        vectorIngestionConfiguration(VectorIngestionConfigurationProperty(vectorIngestionConfiguration))

    public fun build(): software.amazon.awscdk.services.wisdom.CfnKnowledgeBase = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnKnowledgeBase {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnKnowledgeBase(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnKnowledgeBase):
        CfnKnowledgeBase = CfnKnowledgeBase(cdkObject)

    internal fun unwrap(wrapped: CfnKnowledgeBase):
        software.amazon.awscdk.services.wisdom.CfnKnowledgeBase = wrapped.cdkObject as
        software.amazon.awscdk.services.wisdom.CfnKnowledgeBase
  }

  /**
   * Configuration information for Amazon AppIntegrations to automatically ingest content.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wisdom.*;
   * AppIntegrationsConfigurationProperty appIntegrationsConfigurationProperty =
   * AppIntegrationsConfigurationProperty.builder()
   * .appIntegrationArn("appIntegrationArn")
   * // the properties below are optional
   * .objectFields(List.of("objectFields"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-appintegrationsconfiguration.html)
   */
  public interface AppIntegrationsConfigurationProperty {
    /**
     * The Amazon Resource Name (ARN) of the AppIntegrations DataIntegration to use for ingesting
     * content.
     *
     * * For
     * [Salesforce](https://docs.aws.amazon.com/https://developer.salesforce.com/docs/atlas.en-us.knowledge_dev.meta/knowledge_dev/sforce_api_objects_knowledge__kav.htm)
     * , your AppIntegrations DataIntegration must have an ObjectConfiguration if objectFields is not
     * provided, including at least `Id` , `ArticleNumber` , `VersionNumber` , `Title` ,
     * `PublishStatus` , and `IsDeleted` as source fields.
     * * For
     * [ServiceNow](https://docs.aws.amazon.com/https://developer.servicenow.com/dev.do#!/reference/api/rome/rest/knowledge-management-api)
     * , your AppIntegrations DataIntegration must have an ObjectConfiguration if objectFields is not
     * provided, including at least `number` , `short_description` , `sys_mod_count` , `workflow_state`
     * , and `active` as source fields.
     * * For
     * [Zendesk](https://docs.aws.amazon.com/https://developer.zendesk.com/api-reference/help_center/help-center-api/articles/)
     * , your AppIntegrations DataIntegration must have an ObjectConfiguration if `objectFields` is not
     * provided, including at least `id` , `title` , `updated_at` , and `draft` as source fields.
     * * For
     * [SharePoint](https://docs.aws.amazon.com/https://learn.microsoft.com/en-us/sharepoint/dev/sp-add-ins/sharepoint-net-server-csom-jsom-and-rest-api-index)
     * , your AppIntegrations DataIntegration must have a FileConfiguration, including only file
     * extensions that are among `docx` , `pdf` , `html` , `htm` , and `txt` .
     * * For [Amazon S3](https://docs.aws.amazon.com/s3/) , the ObjectConfiguration and
     * FileConfiguration of your AppIntegrations DataIntegration must be null. The `SourceURI` of your
     * DataIntegration must use the following format: `s3://your_s3_bucket_name` .
     *
     *
     * The bucket policy of the corresponding S3 bucket must allow the AWS principal
     * `app-integrations.amazonaws.com` to perform `s3:ListBucket` , `s3:GetObject` , and
     * `s3:GetBucketLocation` against the bucket.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-appintegrationsconfiguration.html#cfn-wisdom-knowledgebase-appintegrationsconfiguration-appintegrationarn)
     */
    public fun appIntegrationArn(): String

    /**
     * The fields from the source that are made available to your agents in Amazon Q in Connect.
     *
     * Optional if ObjectConfiguration is included in the provided DataIntegration.
     *
     * * For
     * [Salesforce](https://docs.aws.amazon.com/https://developer.salesforce.com/docs/atlas.en-us.knowledge_dev.meta/knowledge_dev/sforce_api_objects_knowledge__kav.htm)
     * , you must include at least `Id` , `ArticleNumber` , `VersionNumber` , `Title` , `PublishStatus`
     * , and `IsDeleted` .
     * * For
     * [ServiceNow](https://docs.aws.amazon.com/https://developer.servicenow.com/dev.do#!/reference/api/rome/rest/knowledge-management-api)
     * , you must include at least `number` , `short_description` , `sys_mod_count` , `workflow_state`
     * , and `active` .
     * * For
     * [Zendesk](https://docs.aws.amazon.com/https://developer.zendesk.com/api-reference/help_center/help-center-api/articles/)
     * , you must include at least `id` , `title` , `updated_at` , and `draft` .
     *
     * Make sure to include additional fields. These fields are indexed and used to source
     * recommendations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-appintegrationsconfiguration.html#cfn-wisdom-knowledgebase-appintegrationsconfiguration-objectfields)
     */
    public fun objectFields(): List<String> = unwrap(this).getObjectFields() ?: emptyList()

    /**
     * A builder for [AppIntegrationsConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param appIntegrationArn The Amazon Resource Name (ARN) of the AppIntegrations
       * DataIntegration to use for ingesting content. 
       * * For
       * [Salesforce](https://docs.aws.amazon.com/https://developer.salesforce.com/docs/atlas.en-us.knowledge_dev.meta/knowledge_dev/sforce_api_objects_knowledge__kav.htm)
       * , your AppIntegrations DataIntegration must have an ObjectConfiguration if objectFields is not
       * provided, including at least `Id` , `ArticleNumber` , `VersionNumber` , `Title` ,
       * `PublishStatus` , and `IsDeleted` as source fields.
       * * For
       * [ServiceNow](https://docs.aws.amazon.com/https://developer.servicenow.com/dev.do#!/reference/api/rome/rest/knowledge-management-api)
       * , your AppIntegrations DataIntegration must have an ObjectConfiguration if objectFields is not
       * provided, including at least `number` , `short_description` , `sys_mod_count` ,
       * `workflow_state` , and `active` as source fields.
       * * For
       * [Zendesk](https://docs.aws.amazon.com/https://developer.zendesk.com/api-reference/help_center/help-center-api/articles/)
       * , your AppIntegrations DataIntegration must have an ObjectConfiguration if `objectFields` is
       * not provided, including at least `id` , `title` , `updated_at` , and `draft` as source fields.
       * * For
       * [SharePoint](https://docs.aws.amazon.com/https://learn.microsoft.com/en-us/sharepoint/dev/sp-add-ins/sharepoint-net-server-csom-jsom-and-rest-api-index)
       * , your AppIntegrations DataIntegration must have a FileConfiguration, including only file
       * extensions that are among `docx` , `pdf` , `html` , `htm` , and `txt` .
       * * For [Amazon S3](https://docs.aws.amazon.com/s3/) , the ObjectConfiguration and
       * FileConfiguration of your AppIntegrations DataIntegration must be null. The `SourceURI` of
       * your DataIntegration must use the following format: `s3://your_s3_bucket_name` .
       *
       *
       * The bucket policy of the corresponding S3 bucket must allow the AWS principal
       * `app-integrations.amazonaws.com` to perform `s3:ListBucket` , `s3:GetObject` , and
       * `s3:GetBucketLocation` against the bucket.
       */
      public fun appIntegrationArn(appIntegrationArn: String)

      /**
       * @param objectFields The fields from the source that are made available to your agents in
       * Amazon Q in Connect.
       * Optional if ObjectConfiguration is included in the provided DataIntegration.
       *
       * * For
       * [Salesforce](https://docs.aws.amazon.com/https://developer.salesforce.com/docs/atlas.en-us.knowledge_dev.meta/knowledge_dev/sforce_api_objects_knowledge__kav.htm)
       * , you must include at least `Id` , `ArticleNumber` , `VersionNumber` , `Title` ,
       * `PublishStatus` , and `IsDeleted` .
       * * For
       * [ServiceNow](https://docs.aws.amazon.com/https://developer.servicenow.com/dev.do#!/reference/api/rome/rest/knowledge-management-api)
       * , you must include at least `number` , `short_description` , `sys_mod_count` ,
       * `workflow_state` , and `active` .
       * * For
       * [Zendesk](https://docs.aws.amazon.com/https://developer.zendesk.com/api-reference/help_center/help-center-api/articles/)
       * , you must include at least `id` , `title` , `updated_at` , and `draft` .
       *
       * Make sure to include additional fields. These fields are indexed and used to source
       * recommendations.
       */
      public fun objectFields(objectFields: List<String>)

      /**
       * @param objectFields The fields from the source that are made available to your agents in
       * Amazon Q in Connect.
       * Optional if ObjectConfiguration is included in the provided DataIntegration.
       *
       * * For
       * [Salesforce](https://docs.aws.amazon.com/https://developer.salesforce.com/docs/atlas.en-us.knowledge_dev.meta/knowledge_dev/sforce_api_objects_knowledge__kav.htm)
       * , you must include at least `Id` , `ArticleNumber` , `VersionNumber` , `Title` ,
       * `PublishStatus` , and `IsDeleted` .
       * * For
       * [ServiceNow](https://docs.aws.amazon.com/https://developer.servicenow.com/dev.do#!/reference/api/rome/rest/knowledge-management-api)
       * , you must include at least `number` , `short_description` , `sys_mod_count` ,
       * `workflow_state` , and `active` .
       * * For
       * [Zendesk](https://docs.aws.amazon.com/https://developer.zendesk.com/api-reference/help_center/help-center-api/articles/)
       * , you must include at least `id` , `title` , `updated_at` , and `draft` .
       *
       * Make sure to include additional fields. These fields are indexed and used to source
       * recommendations.
       */
      public fun objectFields(vararg objectFields: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.AppIntegrationsConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.AppIntegrationsConfigurationProperty.builder()

      /**
       * @param appIntegrationArn The Amazon Resource Name (ARN) of the AppIntegrations
       * DataIntegration to use for ingesting content. 
       * * For
       * [Salesforce](https://docs.aws.amazon.com/https://developer.salesforce.com/docs/atlas.en-us.knowledge_dev.meta/knowledge_dev/sforce_api_objects_knowledge__kav.htm)
       * , your AppIntegrations DataIntegration must have an ObjectConfiguration if objectFields is not
       * provided, including at least `Id` , `ArticleNumber` , `VersionNumber` , `Title` ,
       * `PublishStatus` , and `IsDeleted` as source fields.
       * * For
       * [ServiceNow](https://docs.aws.amazon.com/https://developer.servicenow.com/dev.do#!/reference/api/rome/rest/knowledge-management-api)
       * , your AppIntegrations DataIntegration must have an ObjectConfiguration if objectFields is not
       * provided, including at least `number` , `short_description` , `sys_mod_count` ,
       * `workflow_state` , and `active` as source fields.
       * * For
       * [Zendesk](https://docs.aws.amazon.com/https://developer.zendesk.com/api-reference/help_center/help-center-api/articles/)
       * , your AppIntegrations DataIntegration must have an ObjectConfiguration if `objectFields` is
       * not provided, including at least `id` , `title` , `updated_at` , and `draft` as source fields.
       * * For
       * [SharePoint](https://docs.aws.amazon.com/https://learn.microsoft.com/en-us/sharepoint/dev/sp-add-ins/sharepoint-net-server-csom-jsom-and-rest-api-index)
       * , your AppIntegrations DataIntegration must have a FileConfiguration, including only file
       * extensions that are among `docx` , `pdf` , `html` , `htm` , and `txt` .
       * * For [Amazon S3](https://docs.aws.amazon.com/s3/) , the ObjectConfiguration and
       * FileConfiguration of your AppIntegrations DataIntegration must be null. The `SourceURI` of
       * your DataIntegration must use the following format: `s3://your_s3_bucket_name` .
       *
       *
       * The bucket policy of the corresponding S3 bucket must allow the AWS principal
       * `app-integrations.amazonaws.com` to perform `s3:ListBucket` , `s3:GetObject` , and
       * `s3:GetBucketLocation` against the bucket.
       */
      override fun appIntegrationArn(appIntegrationArn: String) {
        cdkBuilder.appIntegrationArn(appIntegrationArn)
      }

      /**
       * @param objectFields The fields from the source that are made available to your agents in
       * Amazon Q in Connect.
       * Optional if ObjectConfiguration is included in the provided DataIntegration.
       *
       * * For
       * [Salesforce](https://docs.aws.amazon.com/https://developer.salesforce.com/docs/atlas.en-us.knowledge_dev.meta/knowledge_dev/sforce_api_objects_knowledge__kav.htm)
       * , you must include at least `Id` , `ArticleNumber` , `VersionNumber` , `Title` ,
       * `PublishStatus` , and `IsDeleted` .
       * * For
       * [ServiceNow](https://docs.aws.amazon.com/https://developer.servicenow.com/dev.do#!/reference/api/rome/rest/knowledge-management-api)
       * , you must include at least `number` , `short_description` , `sys_mod_count` ,
       * `workflow_state` , and `active` .
       * * For
       * [Zendesk](https://docs.aws.amazon.com/https://developer.zendesk.com/api-reference/help_center/help-center-api/articles/)
       * , you must include at least `id` , `title` , `updated_at` , and `draft` .
       *
       * Make sure to include additional fields. These fields are indexed and used to source
       * recommendations.
       */
      override fun objectFields(objectFields: List<String>) {
        cdkBuilder.objectFields(objectFields)
      }

      /**
       * @param objectFields The fields from the source that are made available to your agents in
       * Amazon Q in Connect.
       * Optional if ObjectConfiguration is included in the provided DataIntegration.
       *
       * * For
       * [Salesforce](https://docs.aws.amazon.com/https://developer.salesforce.com/docs/atlas.en-us.knowledge_dev.meta/knowledge_dev/sforce_api_objects_knowledge__kav.htm)
       * , you must include at least `Id` , `ArticleNumber` , `VersionNumber` , `Title` ,
       * `PublishStatus` , and `IsDeleted` .
       * * For
       * [ServiceNow](https://docs.aws.amazon.com/https://developer.servicenow.com/dev.do#!/reference/api/rome/rest/knowledge-management-api)
       * , you must include at least `number` , `short_description` , `sys_mod_count` ,
       * `workflow_state` , and `active` .
       * * For
       * [Zendesk](https://docs.aws.amazon.com/https://developer.zendesk.com/api-reference/help_center/help-center-api/articles/)
       * , you must include at least `id` , `title` , `updated_at` , and `draft` .
       *
       * Make sure to include additional fields. These fields are indexed and used to source
       * recommendations.
       */
      override fun objectFields(vararg objectFields: String): Unit =
          objectFields(objectFields.toList())

      public fun build():
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.AppIntegrationsConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.AppIntegrationsConfigurationProperty,
    ) : CdkObject(cdkObject),
        AppIntegrationsConfigurationProperty {
      /**
       * The Amazon Resource Name (ARN) of the AppIntegrations DataIntegration to use for ingesting
       * content.
       *
       * * For
       * [Salesforce](https://docs.aws.amazon.com/https://developer.salesforce.com/docs/atlas.en-us.knowledge_dev.meta/knowledge_dev/sforce_api_objects_knowledge__kav.htm)
       * , your AppIntegrations DataIntegration must have an ObjectConfiguration if objectFields is not
       * provided, including at least `Id` , `ArticleNumber` , `VersionNumber` , `Title` ,
       * `PublishStatus` , and `IsDeleted` as source fields.
       * * For
       * [ServiceNow](https://docs.aws.amazon.com/https://developer.servicenow.com/dev.do#!/reference/api/rome/rest/knowledge-management-api)
       * , your AppIntegrations DataIntegration must have an ObjectConfiguration if objectFields is not
       * provided, including at least `number` , `short_description` , `sys_mod_count` ,
       * `workflow_state` , and `active` as source fields.
       * * For
       * [Zendesk](https://docs.aws.amazon.com/https://developer.zendesk.com/api-reference/help_center/help-center-api/articles/)
       * , your AppIntegrations DataIntegration must have an ObjectConfiguration if `objectFields` is
       * not provided, including at least `id` , `title` , `updated_at` , and `draft` as source fields.
       * * For
       * [SharePoint](https://docs.aws.amazon.com/https://learn.microsoft.com/en-us/sharepoint/dev/sp-add-ins/sharepoint-net-server-csom-jsom-and-rest-api-index)
       * , your AppIntegrations DataIntegration must have a FileConfiguration, including only file
       * extensions that are among `docx` , `pdf` , `html` , `htm` , and `txt` .
       * * For [Amazon S3](https://docs.aws.amazon.com/s3/) , the ObjectConfiguration and
       * FileConfiguration of your AppIntegrations DataIntegration must be null. The `SourceURI` of
       * your DataIntegration must use the following format: `s3://your_s3_bucket_name` .
       *
       *
       * The bucket policy of the corresponding S3 bucket must allow the AWS principal
       * `app-integrations.amazonaws.com` to perform `s3:ListBucket` , `s3:GetObject` , and
       * `s3:GetBucketLocation` against the bucket.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-appintegrationsconfiguration.html#cfn-wisdom-knowledgebase-appintegrationsconfiguration-appintegrationarn)
       */
      override fun appIntegrationArn(): String = unwrap(this).getAppIntegrationArn()

      /**
       * The fields from the source that are made available to your agents in Amazon Q in Connect.
       *
       * Optional if ObjectConfiguration is included in the provided DataIntegration.
       *
       * * For
       * [Salesforce](https://docs.aws.amazon.com/https://developer.salesforce.com/docs/atlas.en-us.knowledge_dev.meta/knowledge_dev/sforce_api_objects_knowledge__kav.htm)
       * , you must include at least `Id` , `ArticleNumber` , `VersionNumber` , `Title` ,
       * `PublishStatus` , and `IsDeleted` .
       * * For
       * [ServiceNow](https://docs.aws.amazon.com/https://developer.servicenow.com/dev.do#!/reference/api/rome/rest/knowledge-management-api)
       * , you must include at least `number` , `short_description` , `sys_mod_count` ,
       * `workflow_state` , and `active` .
       * * For
       * [Zendesk](https://docs.aws.amazon.com/https://developer.zendesk.com/api-reference/help_center/help-center-api/articles/)
       * , you must include at least `id` , `title` , `updated_at` , and `draft` .
       *
       * Make sure to include additional fields. These fields are indexed and used to source
       * recommendations.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-appintegrationsconfiguration.html#cfn-wisdom-knowledgebase-appintegrationsconfiguration-objectfields)
       */
      override fun objectFields(): List<String> = unwrap(this).getObjectFields() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AppIntegrationsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.AppIntegrationsConfigurationProperty):
          AppIntegrationsConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AppIntegrationsConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AppIntegrationsConfigurationProperty):
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.AppIntegrationsConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.AppIntegrationsConfigurationProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wisdom.*;
   * BedrockFoundationModelConfigurationProperty bedrockFoundationModelConfigurationProperty =
   * BedrockFoundationModelConfigurationProperty.builder()
   * .modelArn("modelArn")
   * // the properties below are optional
   * .parsingPrompt(ParsingPromptProperty.builder()
   * .parsingPromptText("parsingPromptText")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-bedrockfoundationmodelconfiguration.html)
   */
  public interface BedrockFoundationModelConfigurationProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-bedrockfoundationmodelconfiguration.html#cfn-wisdom-knowledgebase-bedrockfoundationmodelconfiguration-modelarn)
     */
    public fun modelArn(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-bedrockfoundationmodelconfiguration.html#cfn-wisdom-knowledgebase-bedrockfoundationmodelconfiguration-parsingprompt)
     */
    public fun parsingPrompt(): Any? = unwrap(this).getParsingPrompt()

    /**
     * A builder for [BedrockFoundationModelConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param modelArn the value to be set. 
       */
      public fun modelArn(modelArn: String)

      /**
       * @param parsingPrompt the value to be set.
       */
      public fun parsingPrompt(parsingPrompt: IResolvable)

      /**
       * @param parsingPrompt the value to be set.
       */
      public fun parsingPrompt(parsingPrompt: ParsingPromptProperty)

      /**
       * @param parsingPrompt the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4940897dcb166ac6d26557d6d6c3deffa24a27c087343add76a5b6f9a7fd16a5")
      public fun parsingPrompt(parsingPrompt: ParsingPromptProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.BedrockFoundationModelConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.BedrockFoundationModelConfigurationProperty.builder()

      /**
       * @param modelArn the value to be set. 
       */
      override fun modelArn(modelArn: String) {
        cdkBuilder.modelArn(modelArn)
      }

      /**
       * @param parsingPrompt the value to be set.
       */
      override fun parsingPrompt(parsingPrompt: IResolvable) {
        cdkBuilder.parsingPrompt(parsingPrompt.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param parsingPrompt the value to be set.
       */
      override fun parsingPrompt(parsingPrompt: ParsingPromptProperty) {
        cdkBuilder.parsingPrompt(parsingPrompt.let(ParsingPromptProperty.Companion::unwrap))
      }

      /**
       * @param parsingPrompt the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4940897dcb166ac6d26557d6d6c3deffa24a27c087343add76a5b6f9a7fd16a5")
      override fun parsingPrompt(parsingPrompt: ParsingPromptProperty.Builder.() -> Unit): Unit =
          parsingPrompt(ParsingPromptProperty(parsingPrompt))

      public fun build():
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.BedrockFoundationModelConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.BedrockFoundationModelConfigurationProperty,
    ) : CdkObject(cdkObject),
        BedrockFoundationModelConfigurationProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-bedrockfoundationmodelconfiguration.html#cfn-wisdom-knowledgebase-bedrockfoundationmodelconfiguration-modelarn)
       */
      override fun modelArn(): String = unwrap(this).getModelArn()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-bedrockfoundationmodelconfiguration.html#cfn-wisdom-knowledgebase-bedrockfoundationmodelconfiguration-parsingprompt)
       */
      override fun parsingPrompt(): Any? = unwrap(this).getParsingPrompt()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          BedrockFoundationModelConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.BedrockFoundationModelConfigurationProperty):
          BedrockFoundationModelConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          BedrockFoundationModelConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: BedrockFoundationModelConfigurationProperty):
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.BedrockFoundationModelConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.BedrockFoundationModelConfigurationProperty
    }
  }

  /**
   * Details about how to chunk the documents in the data source.
   *
   * A chunk refers to an excerpt from a data source that is returned when the knowledge base that
   * it belongs to is queried.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wisdom.*;
   * ChunkingConfigurationProperty chunkingConfigurationProperty =
   * ChunkingConfigurationProperty.builder()
   * .chunkingStrategy("chunkingStrategy")
   * // the properties below are optional
   * .fixedSizeChunkingConfiguration(FixedSizeChunkingConfigurationProperty.builder()
   * .maxTokens(123)
   * .overlapPercentage(123)
   * .build())
   * .hierarchicalChunkingConfiguration(HierarchicalChunkingConfigurationProperty.builder()
   * .levelConfigurations(List.of(HierarchicalChunkingLevelConfigurationProperty.builder()
   * .maxTokens(123)
   * .build()))
   * .overlapTokens(123)
   * .build())
   * .semanticChunkingConfiguration(SemanticChunkingConfigurationProperty.builder()
   * .breakpointPercentileThreshold(123)
   * .bufferSize(123)
   * .maxTokens(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-chunkingconfiguration.html)
   */
  public interface ChunkingConfigurationProperty {
    /**
     * Knowledge base can split your source data into chunks.
     *
     * A chunk refers to an excerpt from a data source that is returned when the knowledge base that
     * it belongs to is queried. You have the following options for chunking your data. If you opt for
     * `NONE` , then you may want to pre-process your files by splitting them up such that each file
     * corresponds to a chunk.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-chunkingconfiguration.html#cfn-wisdom-knowledgebase-chunkingconfiguration-chunkingstrategy)
     */
    public fun chunkingStrategy(): String

    /**
     * Configurations for when you choose fixed-size chunking.
     *
     * If you set the `chunkingStrategy` as `NONE` , exclude this field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-chunkingconfiguration.html#cfn-wisdom-knowledgebase-chunkingconfiguration-fixedsizechunkingconfiguration)
     */
    public fun fixedSizeChunkingConfiguration(): Any? =
        unwrap(this).getFixedSizeChunkingConfiguration()

    /**
     * Settings for hierarchical document chunking for a data source.
     *
     * Hierarchical chunking splits documents into layers of chunks where the first layer contains
     * large chunks, and the second layer contains smaller chunks derived from the first layer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-chunkingconfiguration.html#cfn-wisdom-knowledgebase-chunkingconfiguration-hierarchicalchunkingconfiguration)
     */
    public fun hierarchicalChunkingConfiguration(): Any? =
        unwrap(this).getHierarchicalChunkingConfiguration()

    /**
     * Settings for semantic document chunking for a data source.
     *
     * Semantic chunking splits a document into smaller documents based on groups of similar content
     * derived from the text with natural language processing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-chunkingconfiguration.html#cfn-wisdom-knowledgebase-chunkingconfiguration-semanticchunkingconfiguration)
     */
    public fun semanticChunkingConfiguration(): Any? =
        unwrap(this).getSemanticChunkingConfiguration()

    /**
     * A builder for [ChunkingConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param chunkingStrategy Knowledge base can split your source data into chunks. 
       * A chunk refers to an excerpt from a data source that is returned when the knowledge base
       * that it belongs to is queried. You have the following options for chunking your data. If you
       * opt for `NONE` , then you may want to pre-process your files by splitting them up such that
       * each file corresponds to a chunk.
       */
      public fun chunkingStrategy(chunkingStrategy: String)

      /**
       * @param fixedSizeChunkingConfiguration Configurations for when you choose fixed-size
       * chunking.
       * If you set the `chunkingStrategy` as `NONE` , exclude this field.
       */
      public fun fixedSizeChunkingConfiguration(fixedSizeChunkingConfiguration: IResolvable)

      /**
       * @param fixedSizeChunkingConfiguration Configurations for when you choose fixed-size
       * chunking.
       * If you set the `chunkingStrategy` as `NONE` , exclude this field.
       */
      public
          fun fixedSizeChunkingConfiguration(fixedSizeChunkingConfiguration: FixedSizeChunkingConfigurationProperty)

      /**
       * @param fixedSizeChunkingConfiguration Configurations for when you choose fixed-size
       * chunking.
       * If you set the `chunkingStrategy` as `NONE` , exclude this field.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c2ccac30c0a72ebb35e4c8c8e8f33c91210ec02d2917b0e3859f6f901a410aa0")
      public
          fun fixedSizeChunkingConfiguration(fixedSizeChunkingConfiguration: FixedSizeChunkingConfigurationProperty.Builder.() -> Unit)

      /**
       * @param hierarchicalChunkingConfiguration Settings for hierarchical document chunking for a
       * data source.
       * Hierarchical chunking splits documents into layers of chunks where the first layer contains
       * large chunks, and the second layer contains smaller chunks derived from the first layer.
       */
      public fun hierarchicalChunkingConfiguration(hierarchicalChunkingConfiguration: IResolvable)

      /**
       * @param hierarchicalChunkingConfiguration Settings for hierarchical document chunking for a
       * data source.
       * Hierarchical chunking splits documents into layers of chunks where the first layer contains
       * large chunks, and the second layer contains smaller chunks derived from the first layer.
       */
      public
          fun hierarchicalChunkingConfiguration(hierarchicalChunkingConfiguration: HierarchicalChunkingConfigurationProperty)

      /**
       * @param hierarchicalChunkingConfiguration Settings for hierarchical document chunking for a
       * data source.
       * Hierarchical chunking splits documents into layers of chunks where the first layer contains
       * large chunks, and the second layer contains smaller chunks derived from the first layer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8e6a3847cce64aa903263ed6b788fb509cae519a4e98c1253b5ee9ccc2d8ff49")
      public
          fun hierarchicalChunkingConfiguration(hierarchicalChunkingConfiguration: HierarchicalChunkingConfigurationProperty.Builder.() -> Unit)

      /**
       * @param semanticChunkingConfiguration Settings for semantic document chunking for a data
       * source.
       * Semantic chunking splits a document into smaller documents based on groups of similar
       * content derived from the text with natural language processing.
       */
      public fun semanticChunkingConfiguration(semanticChunkingConfiguration: IResolvable)

      /**
       * @param semanticChunkingConfiguration Settings for semantic document chunking for a data
       * source.
       * Semantic chunking splits a document into smaller documents based on groups of similar
       * content derived from the text with natural language processing.
       */
      public
          fun semanticChunkingConfiguration(semanticChunkingConfiguration: SemanticChunkingConfigurationProperty)

      /**
       * @param semanticChunkingConfiguration Settings for semantic document chunking for a data
       * source.
       * Semantic chunking splits a document into smaller documents based on groups of similar
       * content derived from the text with natural language processing.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("11973711646f1d283b97719c53cc0e12f4da50d415f63f8434d9cadf3dd45ec5")
      public
          fun semanticChunkingConfiguration(semanticChunkingConfiguration: SemanticChunkingConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.ChunkingConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.ChunkingConfigurationProperty.builder()

      /**
       * @param chunkingStrategy Knowledge base can split your source data into chunks. 
       * A chunk refers to an excerpt from a data source that is returned when the knowledge base
       * that it belongs to is queried. You have the following options for chunking your data. If you
       * opt for `NONE` , then you may want to pre-process your files by splitting them up such that
       * each file corresponds to a chunk.
       */
      override fun chunkingStrategy(chunkingStrategy: String) {
        cdkBuilder.chunkingStrategy(chunkingStrategy)
      }

      /**
       * @param fixedSizeChunkingConfiguration Configurations for when you choose fixed-size
       * chunking.
       * If you set the `chunkingStrategy` as `NONE` , exclude this field.
       */
      override fun fixedSizeChunkingConfiguration(fixedSizeChunkingConfiguration: IResolvable) {
        cdkBuilder.fixedSizeChunkingConfiguration(fixedSizeChunkingConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param fixedSizeChunkingConfiguration Configurations for when you choose fixed-size
       * chunking.
       * If you set the `chunkingStrategy` as `NONE` , exclude this field.
       */
      override
          fun fixedSizeChunkingConfiguration(fixedSizeChunkingConfiguration: FixedSizeChunkingConfigurationProperty) {
        cdkBuilder.fixedSizeChunkingConfiguration(fixedSizeChunkingConfiguration.let(FixedSizeChunkingConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param fixedSizeChunkingConfiguration Configurations for when you choose fixed-size
       * chunking.
       * If you set the `chunkingStrategy` as `NONE` , exclude this field.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c2ccac30c0a72ebb35e4c8c8e8f33c91210ec02d2917b0e3859f6f901a410aa0")
      override
          fun fixedSizeChunkingConfiguration(fixedSizeChunkingConfiguration: FixedSizeChunkingConfigurationProperty.Builder.() -> Unit):
          Unit =
          fixedSizeChunkingConfiguration(FixedSizeChunkingConfigurationProperty(fixedSizeChunkingConfiguration))

      /**
       * @param hierarchicalChunkingConfiguration Settings for hierarchical document chunking for a
       * data source.
       * Hierarchical chunking splits documents into layers of chunks where the first layer contains
       * large chunks, and the second layer contains smaller chunks derived from the first layer.
       */
      override
          fun hierarchicalChunkingConfiguration(hierarchicalChunkingConfiguration: IResolvable) {
        cdkBuilder.hierarchicalChunkingConfiguration(hierarchicalChunkingConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param hierarchicalChunkingConfiguration Settings for hierarchical document chunking for a
       * data source.
       * Hierarchical chunking splits documents into layers of chunks where the first layer contains
       * large chunks, and the second layer contains smaller chunks derived from the first layer.
       */
      override
          fun hierarchicalChunkingConfiguration(hierarchicalChunkingConfiguration: HierarchicalChunkingConfigurationProperty) {
        cdkBuilder.hierarchicalChunkingConfiguration(hierarchicalChunkingConfiguration.let(HierarchicalChunkingConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param hierarchicalChunkingConfiguration Settings for hierarchical document chunking for a
       * data source.
       * Hierarchical chunking splits documents into layers of chunks where the first layer contains
       * large chunks, and the second layer contains smaller chunks derived from the first layer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8e6a3847cce64aa903263ed6b788fb509cae519a4e98c1253b5ee9ccc2d8ff49")
      override
          fun hierarchicalChunkingConfiguration(hierarchicalChunkingConfiguration: HierarchicalChunkingConfigurationProperty.Builder.() -> Unit):
          Unit =
          hierarchicalChunkingConfiguration(HierarchicalChunkingConfigurationProperty(hierarchicalChunkingConfiguration))

      /**
       * @param semanticChunkingConfiguration Settings for semantic document chunking for a data
       * source.
       * Semantic chunking splits a document into smaller documents based on groups of similar
       * content derived from the text with natural language processing.
       */
      override fun semanticChunkingConfiguration(semanticChunkingConfiguration: IResolvable) {
        cdkBuilder.semanticChunkingConfiguration(semanticChunkingConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param semanticChunkingConfiguration Settings for semantic document chunking for a data
       * source.
       * Semantic chunking splits a document into smaller documents based on groups of similar
       * content derived from the text with natural language processing.
       */
      override
          fun semanticChunkingConfiguration(semanticChunkingConfiguration: SemanticChunkingConfigurationProperty) {
        cdkBuilder.semanticChunkingConfiguration(semanticChunkingConfiguration.let(SemanticChunkingConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param semanticChunkingConfiguration Settings for semantic document chunking for a data
       * source.
       * Semantic chunking splits a document into smaller documents based on groups of similar
       * content derived from the text with natural language processing.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("11973711646f1d283b97719c53cc0e12f4da50d415f63f8434d9cadf3dd45ec5")
      override
          fun semanticChunkingConfiguration(semanticChunkingConfiguration: SemanticChunkingConfigurationProperty.Builder.() -> Unit):
          Unit =
          semanticChunkingConfiguration(SemanticChunkingConfigurationProperty(semanticChunkingConfiguration))

      public fun build():
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.ChunkingConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.ChunkingConfigurationProperty,
    ) : CdkObject(cdkObject),
        ChunkingConfigurationProperty {
      /**
       * Knowledge base can split your source data into chunks.
       *
       * A chunk refers to an excerpt from a data source that is returned when the knowledge base
       * that it belongs to is queried. You have the following options for chunking your data. If you
       * opt for `NONE` , then you may want to pre-process your files by splitting them up such that
       * each file corresponds to a chunk.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-chunkingconfiguration.html#cfn-wisdom-knowledgebase-chunkingconfiguration-chunkingstrategy)
       */
      override fun chunkingStrategy(): String = unwrap(this).getChunkingStrategy()

      /**
       * Configurations for when you choose fixed-size chunking.
       *
       * If you set the `chunkingStrategy` as `NONE` , exclude this field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-chunkingconfiguration.html#cfn-wisdom-knowledgebase-chunkingconfiguration-fixedsizechunkingconfiguration)
       */
      override fun fixedSizeChunkingConfiguration(): Any? =
          unwrap(this).getFixedSizeChunkingConfiguration()

      /**
       * Settings for hierarchical document chunking for a data source.
       *
       * Hierarchical chunking splits documents into layers of chunks where the first layer contains
       * large chunks, and the second layer contains smaller chunks derived from the first layer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-chunkingconfiguration.html#cfn-wisdom-knowledgebase-chunkingconfiguration-hierarchicalchunkingconfiguration)
       */
      override fun hierarchicalChunkingConfiguration(): Any? =
          unwrap(this).getHierarchicalChunkingConfiguration()

      /**
       * Settings for semantic document chunking for a data source.
       *
       * Semantic chunking splits a document into smaller documents based on groups of similar
       * content derived from the text with natural language processing.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-chunkingconfiguration.html#cfn-wisdom-knowledgebase-chunkingconfiguration-semanticchunkingconfiguration)
       */
      override fun semanticChunkingConfiguration(): Any? =
          unwrap(this).getSemanticChunkingConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ChunkingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.ChunkingConfigurationProperty):
          ChunkingConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ChunkingConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ChunkingConfigurationProperty):
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.ChunkingConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.ChunkingConfigurationProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wisdom.*;
   * CrawlerLimitsProperty crawlerLimitsProperty = CrawlerLimitsProperty.builder()
   * .rateLimit(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-crawlerlimits.html)
   */
  public interface CrawlerLimitsProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-crawlerlimits.html#cfn-wisdom-knowledgebase-crawlerlimits-ratelimit)
     */
    public fun rateLimit(): Number? = unwrap(this).getRateLimit()

    /**
     * A builder for [CrawlerLimitsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param rateLimit the value to be set.
       */
      public fun rateLimit(rateLimit: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.CrawlerLimitsProperty.Builder =
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.CrawlerLimitsProperty.builder()

      /**
       * @param rateLimit the value to be set.
       */
      override fun rateLimit(rateLimit: Number) {
        cdkBuilder.rateLimit(rateLimit)
      }

      public fun build():
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.CrawlerLimitsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.CrawlerLimitsProperty,
    ) : CdkObject(cdkObject),
        CrawlerLimitsProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-crawlerlimits.html#cfn-wisdom-knowledgebase-crawlerlimits-ratelimit)
       */
      override fun rateLimit(): Number? = unwrap(this).getRateLimit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CrawlerLimitsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.CrawlerLimitsProperty):
          CrawlerLimitsProperty = CdkObjectWrappers.wrap(cdkObject) as? CrawlerLimitsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CrawlerLimitsProperty):
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.CrawlerLimitsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.CrawlerLimitsProperty
    }
  }

  /**
   * Configurations for when you choose fixed-size chunking.
   *
   * If you set the `chunkingStrategy` as `NONE` , exclude this field.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wisdom.*;
   * FixedSizeChunkingConfigurationProperty fixedSizeChunkingConfigurationProperty =
   * FixedSizeChunkingConfigurationProperty.builder()
   * .maxTokens(123)
   * .overlapPercentage(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-fixedsizechunkingconfiguration.html)
   */
  public interface FixedSizeChunkingConfigurationProperty {
    /**
     * The maximum number of tokens to include in a chunk.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-fixedsizechunkingconfiguration.html#cfn-wisdom-knowledgebase-fixedsizechunkingconfiguration-maxtokens)
     */
    public fun maxTokens(): Number

    /**
     * The percentage of overlap between adjacent chunks of a data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-fixedsizechunkingconfiguration.html#cfn-wisdom-knowledgebase-fixedsizechunkingconfiguration-overlappercentage)
     */
    public fun overlapPercentage(): Number

    /**
     * A builder for [FixedSizeChunkingConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maxTokens The maximum number of tokens to include in a chunk. 
       */
      public fun maxTokens(maxTokens: Number)

      /**
       * @param overlapPercentage The percentage of overlap between adjacent chunks of a data
       * source. 
       */
      public fun overlapPercentage(overlapPercentage: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.FixedSizeChunkingConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.FixedSizeChunkingConfigurationProperty.builder()

      /**
       * @param maxTokens The maximum number of tokens to include in a chunk. 
       */
      override fun maxTokens(maxTokens: Number) {
        cdkBuilder.maxTokens(maxTokens)
      }

      /**
       * @param overlapPercentage The percentage of overlap between adjacent chunks of a data
       * source. 
       */
      override fun overlapPercentage(overlapPercentage: Number) {
        cdkBuilder.overlapPercentage(overlapPercentage)
      }

      public fun build():
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.FixedSizeChunkingConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.FixedSizeChunkingConfigurationProperty,
    ) : CdkObject(cdkObject),
        FixedSizeChunkingConfigurationProperty {
      /**
       * The maximum number of tokens to include in a chunk.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-fixedsizechunkingconfiguration.html#cfn-wisdom-knowledgebase-fixedsizechunkingconfiguration-maxtokens)
       */
      override fun maxTokens(): Number = unwrap(this).getMaxTokens()

      /**
       * The percentage of overlap between adjacent chunks of a data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-fixedsizechunkingconfiguration.html#cfn-wisdom-knowledgebase-fixedsizechunkingconfiguration-overlappercentage)
       */
      override fun overlapPercentage(): Number = unwrap(this).getOverlapPercentage()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          FixedSizeChunkingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.FixedSizeChunkingConfigurationProperty):
          FixedSizeChunkingConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          FixedSizeChunkingConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FixedSizeChunkingConfigurationProperty):
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.FixedSizeChunkingConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.FixedSizeChunkingConfigurationProperty
    }
  }

  /**
   * Settings for hierarchical document chunking for a data source.
   *
   * Hierarchical chunking splits documents into layers of chunks where the first layer contains
   * large chunks, and the second layer contains smaller chunks derived from the first layer.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wisdom.*;
   * HierarchicalChunkingConfigurationProperty hierarchicalChunkingConfigurationProperty =
   * HierarchicalChunkingConfigurationProperty.builder()
   * .levelConfigurations(List.of(HierarchicalChunkingLevelConfigurationProperty.builder()
   * .maxTokens(123)
   * .build()))
   * .overlapTokens(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-hierarchicalchunkingconfiguration.html)
   */
  public interface HierarchicalChunkingConfigurationProperty {
    /**
     * Token settings for each layer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-hierarchicalchunkingconfiguration.html#cfn-wisdom-knowledgebase-hierarchicalchunkingconfiguration-levelconfigurations)
     */
    public fun levelConfigurations(): Any

    /**
     * The number of tokens to repeat across chunks in the same layer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-hierarchicalchunkingconfiguration.html#cfn-wisdom-knowledgebase-hierarchicalchunkingconfiguration-overlaptokens)
     */
    public fun overlapTokens(): Number

    /**
     * A builder for [HierarchicalChunkingConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param levelConfigurations Token settings for each layer. 
       */
      public fun levelConfigurations(levelConfigurations: IResolvable)

      /**
       * @param levelConfigurations Token settings for each layer. 
       */
      public fun levelConfigurations(levelConfigurations: List<Any>)

      /**
       * @param levelConfigurations Token settings for each layer. 
       */
      public fun levelConfigurations(vararg levelConfigurations: Any)

      /**
       * @param overlapTokens The number of tokens to repeat across chunks in the same layer. 
       */
      public fun overlapTokens(overlapTokens: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.HierarchicalChunkingConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.HierarchicalChunkingConfigurationProperty.builder()

      /**
       * @param levelConfigurations Token settings for each layer. 
       */
      override fun levelConfigurations(levelConfigurations: IResolvable) {
        cdkBuilder.levelConfigurations(levelConfigurations.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param levelConfigurations Token settings for each layer. 
       */
      override fun levelConfigurations(levelConfigurations: List<Any>) {
        cdkBuilder.levelConfigurations(levelConfigurations.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param levelConfigurations Token settings for each layer. 
       */
      override fun levelConfigurations(vararg levelConfigurations: Any): Unit =
          levelConfigurations(levelConfigurations.toList())

      /**
       * @param overlapTokens The number of tokens to repeat across chunks in the same layer. 
       */
      override fun overlapTokens(overlapTokens: Number) {
        cdkBuilder.overlapTokens(overlapTokens)
      }

      public fun build():
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.HierarchicalChunkingConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.HierarchicalChunkingConfigurationProperty,
    ) : CdkObject(cdkObject),
        HierarchicalChunkingConfigurationProperty {
      /**
       * Token settings for each layer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-hierarchicalchunkingconfiguration.html#cfn-wisdom-knowledgebase-hierarchicalchunkingconfiguration-levelconfigurations)
       */
      override fun levelConfigurations(): Any = unwrap(this).getLevelConfigurations()

      /**
       * The number of tokens to repeat across chunks in the same layer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-hierarchicalchunkingconfiguration.html#cfn-wisdom-knowledgebase-hierarchicalchunkingconfiguration-overlaptokens)
       */
      override fun overlapTokens(): Number = unwrap(this).getOverlapTokens()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          HierarchicalChunkingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.HierarchicalChunkingConfigurationProperty):
          HierarchicalChunkingConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          HierarchicalChunkingConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: HierarchicalChunkingConfigurationProperty):
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.HierarchicalChunkingConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.HierarchicalChunkingConfigurationProperty
    }
  }

  /**
   * Token settings for each layer.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wisdom.*;
   * HierarchicalChunkingLevelConfigurationProperty hierarchicalChunkingLevelConfigurationProperty =
   * HierarchicalChunkingLevelConfigurationProperty.builder()
   * .maxTokens(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-hierarchicalchunkinglevelconfiguration.html)
   */
  public interface HierarchicalChunkingLevelConfigurationProperty {
    /**
     * The maximum number of tokens that a chunk can contain in this layer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-hierarchicalchunkinglevelconfiguration.html#cfn-wisdom-knowledgebase-hierarchicalchunkinglevelconfiguration-maxtokens)
     */
    public fun maxTokens(): Number

    /**
     * A builder for [HierarchicalChunkingLevelConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maxTokens The maximum number of tokens that a chunk can contain in this layer. 
       */
      public fun maxTokens(maxTokens: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.HierarchicalChunkingLevelConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.HierarchicalChunkingLevelConfigurationProperty.builder()

      /**
       * @param maxTokens The maximum number of tokens that a chunk can contain in this layer. 
       */
      override fun maxTokens(maxTokens: Number) {
        cdkBuilder.maxTokens(maxTokens)
      }

      public fun build():
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.HierarchicalChunkingLevelConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.HierarchicalChunkingLevelConfigurationProperty,
    ) : CdkObject(cdkObject),
        HierarchicalChunkingLevelConfigurationProperty {
      /**
       * The maximum number of tokens that a chunk can contain in this layer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-hierarchicalchunkinglevelconfiguration.html#cfn-wisdom-knowledgebase-hierarchicalchunkinglevelconfiguration-maxtokens)
       */
      override fun maxTokens(): Number = unwrap(this).getMaxTokens()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          HierarchicalChunkingLevelConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.HierarchicalChunkingLevelConfigurationProperty):
          HierarchicalChunkingLevelConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          HierarchicalChunkingLevelConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: HierarchicalChunkingLevelConfigurationProperty):
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.HierarchicalChunkingLevelConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.HierarchicalChunkingLevelConfigurationProperty
    }
  }

  /**
   * Source configuration for managed resources.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wisdom.*;
   * ManagedSourceConfigurationProperty managedSourceConfigurationProperty =
   * ManagedSourceConfigurationProperty.builder()
   * .webCrawlerConfiguration(WebCrawlerConfigurationProperty.builder()
   * .urlConfiguration(UrlConfigurationProperty.builder()
   * .seedUrls(List.of(SeedUrlProperty.builder()
   * .url("url")
   * .build()))
   * .build())
   * // the properties below are optional
   * .crawlerLimits(CrawlerLimitsProperty.builder()
   * .rateLimit(123)
   * .build())
   * .exclusionFilters(List.of("exclusionFilters"))
   * .inclusionFilters(List.of("inclusionFilters"))
   * .scope("scope")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-managedsourceconfiguration.html)
   */
  public interface ManagedSourceConfigurationProperty {
    /**
     * Configuration data for web crawler data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-managedsourceconfiguration.html#cfn-wisdom-knowledgebase-managedsourceconfiguration-webcrawlerconfiguration)
     */
    public fun webCrawlerConfiguration(): Any

    /**
     * A builder for [ManagedSourceConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param webCrawlerConfiguration Configuration data for web crawler data source. 
       */
      public fun webCrawlerConfiguration(webCrawlerConfiguration: IResolvable)

      /**
       * @param webCrawlerConfiguration Configuration data for web crawler data source. 
       */
      public fun webCrawlerConfiguration(webCrawlerConfiguration: WebCrawlerConfigurationProperty)

      /**
       * @param webCrawlerConfiguration Configuration data for web crawler data source. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c5d7988a416a4fb6423dbe1abcd9af601fd11205ed995f01f974bea5cd67be2d")
      public
          fun webCrawlerConfiguration(webCrawlerConfiguration: WebCrawlerConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.ManagedSourceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.ManagedSourceConfigurationProperty.builder()

      /**
       * @param webCrawlerConfiguration Configuration data for web crawler data source. 
       */
      override fun webCrawlerConfiguration(webCrawlerConfiguration: IResolvable) {
        cdkBuilder.webCrawlerConfiguration(webCrawlerConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param webCrawlerConfiguration Configuration data for web crawler data source. 
       */
      override
          fun webCrawlerConfiguration(webCrawlerConfiguration: WebCrawlerConfigurationProperty) {
        cdkBuilder.webCrawlerConfiguration(webCrawlerConfiguration.let(WebCrawlerConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param webCrawlerConfiguration Configuration data for web crawler data source. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c5d7988a416a4fb6423dbe1abcd9af601fd11205ed995f01f974bea5cd67be2d")
      override
          fun webCrawlerConfiguration(webCrawlerConfiguration: WebCrawlerConfigurationProperty.Builder.() -> Unit):
          Unit = webCrawlerConfiguration(WebCrawlerConfigurationProperty(webCrawlerConfiguration))

      public fun build():
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.ManagedSourceConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.ManagedSourceConfigurationProperty,
    ) : CdkObject(cdkObject),
        ManagedSourceConfigurationProperty {
      /**
       * Configuration data for web crawler data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-managedsourceconfiguration.html#cfn-wisdom-knowledgebase-managedsourceconfiguration-webcrawlerconfiguration)
       */
      override fun webCrawlerConfiguration(): Any = unwrap(this).getWebCrawlerConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ManagedSourceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.ManagedSourceConfigurationProperty):
          ManagedSourceConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ManagedSourceConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ManagedSourceConfigurationProperty):
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.ManagedSourceConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.ManagedSourceConfigurationProperty
    }
  }

  /**
   * Settings for parsing document contents.
   *
   * By default, the service converts the contents of each document into text before splitting it
   * into chunks. To improve processing of PDF files with tables and images, you can configure the data
   * source to convert the pages of text into images and use a model to describe the contents of each
   * page.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wisdom.*;
   * ParsingConfigurationProperty parsingConfigurationProperty =
   * ParsingConfigurationProperty.builder()
   * .parsingStrategy("parsingStrategy")
   * // the properties below are optional
   * .bedrockFoundationModelConfiguration(BedrockFoundationModelConfigurationProperty.builder()
   * .modelArn("modelArn")
   * // the properties below are optional
   * .parsingPrompt(ParsingPromptProperty.builder()
   * .parsingPromptText("parsingPromptText")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-parsingconfiguration.html)
   */
  public interface ParsingConfigurationProperty {
    /**
     * Settings for a foundation model used to parse documents for a data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-parsingconfiguration.html#cfn-wisdom-knowledgebase-parsingconfiguration-bedrockfoundationmodelconfiguration)
     */
    public fun bedrockFoundationModelConfiguration(): Any? =
        unwrap(this).getBedrockFoundationModelConfiguration()

    /**
     * The parsing strategy for the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-parsingconfiguration.html#cfn-wisdom-knowledgebase-parsingconfiguration-parsingstrategy)
     */
    public fun parsingStrategy(): String

    /**
     * A builder for [ParsingConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bedrockFoundationModelConfiguration Settings for a foundation model used to parse
       * documents for a data source.
       */
      public
          fun bedrockFoundationModelConfiguration(bedrockFoundationModelConfiguration: IResolvable)

      /**
       * @param bedrockFoundationModelConfiguration Settings for a foundation model used to parse
       * documents for a data source.
       */
      public
          fun bedrockFoundationModelConfiguration(bedrockFoundationModelConfiguration: BedrockFoundationModelConfigurationProperty)

      /**
       * @param bedrockFoundationModelConfiguration Settings for a foundation model used to parse
       * documents for a data source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("78b149eee7192212c4603203d14bc7fbef3889932bc395f613bad826ef8ebf02")
      public
          fun bedrockFoundationModelConfiguration(bedrockFoundationModelConfiguration: BedrockFoundationModelConfigurationProperty.Builder.() -> Unit)

      /**
       * @param parsingStrategy The parsing strategy for the data source. 
       */
      public fun parsingStrategy(parsingStrategy: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.ParsingConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.ParsingConfigurationProperty.builder()

      /**
       * @param bedrockFoundationModelConfiguration Settings for a foundation model used to parse
       * documents for a data source.
       */
      override
          fun bedrockFoundationModelConfiguration(bedrockFoundationModelConfiguration: IResolvable) {
        cdkBuilder.bedrockFoundationModelConfiguration(bedrockFoundationModelConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param bedrockFoundationModelConfiguration Settings for a foundation model used to parse
       * documents for a data source.
       */
      override
          fun bedrockFoundationModelConfiguration(bedrockFoundationModelConfiguration: BedrockFoundationModelConfigurationProperty) {
        cdkBuilder.bedrockFoundationModelConfiguration(bedrockFoundationModelConfiguration.let(BedrockFoundationModelConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param bedrockFoundationModelConfiguration Settings for a foundation model used to parse
       * documents for a data source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("78b149eee7192212c4603203d14bc7fbef3889932bc395f613bad826ef8ebf02")
      override
          fun bedrockFoundationModelConfiguration(bedrockFoundationModelConfiguration: BedrockFoundationModelConfigurationProperty.Builder.() -> Unit):
          Unit =
          bedrockFoundationModelConfiguration(BedrockFoundationModelConfigurationProperty(bedrockFoundationModelConfiguration))

      /**
       * @param parsingStrategy The parsing strategy for the data source. 
       */
      override fun parsingStrategy(parsingStrategy: String) {
        cdkBuilder.parsingStrategy(parsingStrategy)
      }

      public fun build():
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.ParsingConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.ParsingConfigurationProperty,
    ) : CdkObject(cdkObject),
        ParsingConfigurationProperty {
      /**
       * Settings for a foundation model used to parse documents for a data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-parsingconfiguration.html#cfn-wisdom-knowledgebase-parsingconfiguration-bedrockfoundationmodelconfiguration)
       */
      override fun bedrockFoundationModelConfiguration(): Any? =
          unwrap(this).getBedrockFoundationModelConfiguration()

      /**
       * The parsing strategy for the data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-parsingconfiguration.html#cfn-wisdom-knowledgebase-parsingconfiguration-parsingstrategy)
       */
      override fun parsingStrategy(): String = unwrap(this).getParsingStrategy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ParsingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.ParsingConfigurationProperty):
          ParsingConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ParsingConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ParsingConfigurationProperty):
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.ParsingConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.ParsingConfigurationProperty
    }
  }

  /**
   * Instructions for interpreting the contents of a document.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wisdom.*;
   * ParsingPromptProperty parsingPromptProperty = ParsingPromptProperty.builder()
   * .parsingPromptText("parsingPromptText")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-parsingprompt.html)
   */
  public interface ParsingPromptProperty {
    /**
     * Instructions for interpreting the contents of a document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-parsingprompt.html#cfn-wisdom-knowledgebase-parsingprompt-parsingprompttext)
     */
    public fun parsingPromptText(): String

    /**
     * A builder for [ParsingPromptProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param parsingPromptText Instructions for interpreting the contents of a document. 
       */
      public fun parsingPromptText(parsingPromptText: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.ParsingPromptProperty.Builder =
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.ParsingPromptProperty.builder()

      /**
       * @param parsingPromptText Instructions for interpreting the contents of a document. 
       */
      override fun parsingPromptText(parsingPromptText: String) {
        cdkBuilder.parsingPromptText(parsingPromptText)
      }

      public fun build():
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.ParsingPromptProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.ParsingPromptProperty,
    ) : CdkObject(cdkObject),
        ParsingPromptProperty {
      /**
       * Instructions for interpreting the contents of a document.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-parsingprompt.html#cfn-wisdom-knowledgebase-parsingprompt-parsingprompttext)
       */
      override fun parsingPromptText(): String = unwrap(this).getParsingPromptText()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ParsingPromptProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.ParsingPromptProperty):
          ParsingPromptProperty = CdkObjectWrappers.wrap(cdkObject) as? ParsingPromptProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ParsingPromptProperty):
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.ParsingPromptProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.ParsingPromptProperty
    }
  }

  /**
   * Information about how to render the content.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wisdom.*;
   * RenderingConfigurationProperty renderingConfigurationProperty =
   * RenderingConfigurationProperty.builder()
   * .templateUri("templateUri")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-renderingconfiguration.html)
   */
  public interface RenderingConfigurationProperty {
    /**
     * A URI template containing exactly one variable in `${variableName}` format.
     *
     * This can only be set for `EXTERNAL` knowledge bases. For Salesforce, ServiceNow, and Zendesk,
     * the variable must be one of the following:
     *
     * * Salesforce: `Id` , `ArticleNumber` , `VersionNumber` , `Title` , `PublishStatus` , or
     * `IsDeleted`
     * * ServiceNow: `number` , `short_description` , `sys_mod_count` , `workflow_state` , or
     * `active`
     * * Zendesk: `id` , `title` , `updated_at` , or `draft`
     *
     * The variable is replaced with the actual value for a piece of content when calling
     * [GetContent](https://docs.aws.amazon.com/amazon-q-connect/latest/APIReference/API_GetContent.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-renderingconfiguration.html#cfn-wisdom-knowledgebase-renderingconfiguration-templateuri)
     */
    public fun templateUri(): String? = unwrap(this).getTemplateUri()

    /**
     * A builder for [RenderingConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param templateUri A URI template containing exactly one variable in `${variableName}`
       * format.
       * This can only be set for `EXTERNAL` knowledge bases. For Salesforce, ServiceNow, and
       * Zendesk, the variable must be one of the following:
       *
       * * Salesforce: `Id` , `ArticleNumber` , `VersionNumber` , `Title` , `PublishStatus` , or
       * `IsDeleted`
       * * ServiceNow: `number` , `short_description` , `sys_mod_count` , `workflow_state` , or
       * `active`
       * * Zendesk: `id` , `title` , `updated_at` , or `draft`
       *
       * The variable is replaced with the actual value for a piece of content when calling
       * [GetContent](https://docs.aws.amazon.com/amazon-q-connect/latest/APIReference/API_GetContent.html)
       * .
       */
      public fun templateUri(templateUri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.RenderingConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.RenderingConfigurationProperty.builder()

      /**
       * @param templateUri A URI template containing exactly one variable in `${variableName}`
       * format.
       * This can only be set for `EXTERNAL` knowledge bases. For Salesforce, ServiceNow, and
       * Zendesk, the variable must be one of the following:
       *
       * * Salesforce: `Id` , `ArticleNumber` , `VersionNumber` , `Title` , `PublishStatus` , or
       * `IsDeleted`
       * * ServiceNow: `number` , `short_description` , `sys_mod_count` , `workflow_state` , or
       * `active`
       * * Zendesk: `id` , `title` , `updated_at` , or `draft`
       *
       * The variable is replaced with the actual value for a piece of content when calling
       * [GetContent](https://docs.aws.amazon.com/amazon-q-connect/latest/APIReference/API_GetContent.html)
       * .
       */
      override fun templateUri(templateUri: String) {
        cdkBuilder.templateUri(templateUri)
      }

      public fun build():
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.RenderingConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.RenderingConfigurationProperty,
    ) : CdkObject(cdkObject),
        RenderingConfigurationProperty {
      /**
       * A URI template containing exactly one variable in `${variableName}` format.
       *
       * This can only be set for `EXTERNAL` knowledge bases. For Salesforce, ServiceNow, and
       * Zendesk, the variable must be one of the following:
       *
       * * Salesforce: `Id` , `ArticleNumber` , `VersionNumber` , `Title` , `PublishStatus` , or
       * `IsDeleted`
       * * ServiceNow: `number` , `short_description` , `sys_mod_count` , `workflow_state` , or
       * `active`
       * * Zendesk: `id` , `title` , `updated_at` , or `draft`
       *
       * The variable is replaced with the actual value for a piece of content when calling
       * [GetContent](https://docs.aws.amazon.com/amazon-q-connect/latest/APIReference/API_GetContent.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-renderingconfiguration.html#cfn-wisdom-knowledgebase-renderingconfiguration-templateuri)
       */
      override fun templateUri(): String? = unwrap(this).getTemplateUri()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RenderingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.RenderingConfigurationProperty):
          RenderingConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RenderingConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RenderingConfigurationProperty):
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.RenderingConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.RenderingConfigurationProperty
    }
  }

  /**
   * A URL for crawling.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wisdom.*;
   * SeedUrlProperty seedUrlProperty = SeedUrlProperty.builder()
   * .url("url")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-seedurl.html)
   */
  public interface SeedUrlProperty {
    /**
     * URL for crawling.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-seedurl.html#cfn-wisdom-knowledgebase-seedurl-url)
     */
    public fun url(): String? = unwrap(this).getUrl()

    /**
     * A builder for [SeedUrlProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param url URL for crawling.
       */
      public fun url(url: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.SeedUrlProperty.Builder =
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.SeedUrlProperty.builder()

      /**
       * @param url URL for crawling.
       */
      override fun url(url: String) {
        cdkBuilder.url(url)
      }

      public fun build(): software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.SeedUrlProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.SeedUrlProperty,
    ) : CdkObject(cdkObject),
        SeedUrlProperty {
      /**
       * URL for crawling.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-seedurl.html#cfn-wisdom-knowledgebase-seedurl-url)
       */
      override fun url(): String? = unwrap(this).getUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SeedUrlProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.SeedUrlProperty):
          SeedUrlProperty = CdkObjectWrappers.wrap(cdkObject) as? SeedUrlProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SeedUrlProperty):
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.SeedUrlProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.SeedUrlProperty
    }
  }

  /**
   * Settings for semantic document chunking for a data source.
   *
   * Semantic chunking splits a document into smaller documents based on groups of similar content
   * derived from the text with natural language processing.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wisdom.*;
   * SemanticChunkingConfigurationProperty semanticChunkingConfigurationProperty =
   * SemanticChunkingConfigurationProperty.builder()
   * .breakpointPercentileThreshold(123)
   * .bufferSize(123)
   * .maxTokens(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-semanticchunkingconfiguration.html)
   */
  public interface SemanticChunkingConfigurationProperty {
    /**
     * The dissimilarity threshold for splitting chunks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-semanticchunkingconfiguration.html#cfn-wisdom-knowledgebase-semanticchunkingconfiguration-breakpointpercentilethreshold)
     */
    public fun breakpointPercentileThreshold(): Number

    /**
     * The buffer size.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-semanticchunkingconfiguration.html#cfn-wisdom-knowledgebase-semanticchunkingconfiguration-buffersize)
     */
    public fun bufferSize(): Number

    /**
     * The maximum number of tokens that a chunk can contain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-semanticchunkingconfiguration.html#cfn-wisdom-knowledgebase-semanticchunkingconfiguration-maxtokens)
     */
    public fun maxTokens(): Number

    /**
     * A builder for [SemanticChunkingConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param breakpointPercentileThreshold The dissimilarity threshold for splitting chunks. 
       */
      public fun breakpointPercentileThreshold(breakpointPercentileThreshold: Number)

      /**
       * @param bufferSize The buffer size. 
       */
      public fun bufferSize(bufferSize: Number)

      /**
       * @param maxTokens The maximum number of tokens that a chunk can contain. 
       */
      public fun maxTokens(maxTokens: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.SemanticChunkingConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.SemanticChunkingConfigurationProperty.builder()

      /**
       * @param breakpointPercentileThreshold The dissimilarity threshold for splitting chunks. 
       */
      override fun breakpointPercentileThreshold(breakpointPercentileThreshold: Number) {
        cdkBuilder.breakpointPercentileThreshold(breakpointPercentileThreshold)
      }

      /**
       * @param bufferSize The buffer size. 
       */
      override fun bufferSize(bufferSize: Number) {
        cdkBuilder.bufferSize(bufferSize)
      }

      /**
       * @param maxTokens The maximum number of tokens that a chunk can contain. 
       */
      override fun maxTokens(maxTokens: Number) {
        cdkBuilder.maxTokens(maxTokens)
      }

      public fun build():
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.SemanticChunkingConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.SemanticChunkingConfigurationProperty,
    ) : CdkObject(cdkObject),
        SemanticChunkingConfigurationProperty {
      /**
       * The dissimilarity threshold for splitting chunks.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-semanticchunkingconfiguration.html#cfn-wisdom-knowledgebase-semanticchunkingconfiguration-breakpointpercentilethreshold)
       */
      override fun breakpointPercentileThreshold(): Number =
          unwrap(this).getBreakpointPercentileThreshold()

      /**
       * The buffer size.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-semanticchunkingconfiguration.html#cfn-wisdom-knowledgebase-semanticchunkingconfiguration-buffersize)
       */
      override fun bufferSize(): Number = unwrap(this).getBufferSize()

      /**
       * The maximum number of tokens that a chunk can contain.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-semanticchunkingconfiguration.html#cfn-wisdom-knowledgebase-semanticchunkingconfiguration-maxtokens)
       */
      override fun maxTokens(): Number = unwrap(this).getMaxTokens()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SemanticChunkingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.SemanticChunkingConfigurationProperty):
          SemanticChunkingConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SemanticChunkingConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SemanticChunkingConfigurationProperty):
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.SemanticChunkingConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.SemanticChunkingConfigurationProperty
    }
  }

  /**
   * The configuration information for the customer managed key used for encryption.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wisdom.*;
   * ServerSideEncryptionConfigurationProperty serverSideEncryptionConfigurationProperty =
   * ServerSideEncryptionConfigurationProperty.builder()
   * .kmsKeyId("kmsKeyId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-serversideencryptionconfiguration.html)
   */
  public interface ServerSideEncryptionConfigurationProperty {
    /**
     * The customer managed key used for encryption.
     *
     * This customer managed key must have a policy that allows `kms:CreateGrant` and
     * `kms:DescribeKey` permissions to the IAM identity using the key to invoke Wisdom.
     *
     * For more information about setting up a customer managed key for Wisdom, see [Enable Amazon
     * Connect Wisdom for your
     * instance](https://docs.aws.amazon.com/connect/latest/adminguide/enable-wisdom.html) . For
     * information about valid ID values, see [Key identifiers
     * (KeyId)](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-serversideencryptionconfiguration.html#cfn-wisdom-knowledgebase-serversideencryptionconfiguration-kmskeyid)
     */
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * A builder for [ServerSideEncryptionConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param kmsKeyId The customer managed key used for encryption.
       * This customer managed key must have a policy that allows `kms:CreateGrant` and
       * `kms:DescribeKey` permissions to the IAM identity using the key to invoke Wisdom.
       *
       * For more information about setting up a customer managed key for Wisdom, see [Enable Amazon
       * Connect Wisdom for your
       * instance](https://docs.aws.amazon.com/connect/latest/adminguide/enable-wisdom.html) . For
       * information about valid ID values, see [Key identifiers
       * (KeyId)](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id) .
       */
      public fun kmsKeyId(kmsKeyId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.ServerSideEncryptionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.ServerSideEncryptionConfigurationProperty.builder()

      /**
       * @param kmsKeyId The customer managed key used for encryption.
       * This customer managed key must have a policy that allows `kms:CreateGrant` and
       * `kms:DescribeKey` permissions to the IAM identity using the key to invoke Wisdom.
       *
       * For more information about setting up a customer managed key for Wisdom, see [Enable Amazon
       * Connect Wisdom for your
       * instance](https://docs.aws.amazon.com/connect/latest/adminguide/enable-wisdom.html) . For
       * information about valid ID values, see [Key identifiers
       * (KeyId)](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id) .
       */
      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      public fun build():
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.ServerSideEncryptionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.ServerSideEncryptionConfigurationProperty,
    ) : CdkObject(cdkObject),
        ServerSideEncryptionConfigurationProperty {
      /**
       * The customer managed key used for encryption.
       *
       * This customer managed key must have a policy that allows `kms:CreateGrant` and
       * `kms:DescribeKey` permissions to the IAM identity using the key to invoke Wisdom.
       *
       * For more information about setting up a customer managed key for Wisdom, see [Enable Amazon
       * Connect Wisdom for your
       * instance](https://docs.aws.amazon.com/connect/latest/adminguide/enable-wisdom.html) . For
       * information about valid ID values, see [Key identifiers
       * (KeyId)](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-serversideencryptionconfiguration.html#cfn-wisdom-knowledgebase-serversideencryptionconfiguration-kmskeyid)
       */
      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ServerSideEncryptionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.ServerSideEncryptionConfigurationProperty):
          ServerSideEncryptionConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ServerSideEncryptionConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServerSideEncryptionConfigurationProperty):
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.ServerSideEncryptionConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.ServerSideEncryptionConfigurationProperty
    }
  }

  /**
   * Configuration information about the external data source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wisdom.*;
   * SourceConfigurationProperty sourceConfigurationProperty = SourceConfigurationProperty.builder()
   * .appIntegrations(AppIntegrationsConfigurationProperty.builder()
   * .appIntegrationArn("appIntegrationArn")
   * // the properties below are optional
   * .objectFields(List.of("objectFields"))
   * .build())
   * .managedSourceConfiguration(ManagedSourceConfigurationProperty.builder()
   * .webCrawlerConfiguration(WebCrawlerConfigurationProperty.builder()
   * .urlConfiguration(UrlConfigurationProperty.builder()
   * .seedUrls(List.of(SeedUrlProperty.builder()
   * .url("url")
   * .build()))
   * .build())
   * // the properties below are optional
   * .crawlerLimits(CrawlerLimitsProperty.builder()
   * .rateLimit(123)
   * .build())
   * .exclusionFilters(List.of("exclusionFilters"))
   * .inclusionFilters(List.of("inclusionFilters"))
   * .scope("scope")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-sourceconfiguration.html)
   */
  public interface SourceConfigurationProperty {
    /**
     * Configuration information for Amazon AppIntegrations to automatically ingest content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-sourceconfiguration.html#cfn-wisdom-knowledgebase-sourceconfiguration-appintegrations)
     */
    public fun appIntegrations(): Any? = unwrap(this).getAppIntegrations()

    /**
     * Source configuration for managed resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-sourceconfiguration.html#cfn-wisdom-knowledgebase-sourceconfiguration-managedsourceconfiguration)
     */
    public fun managedSourceConfiguration(): Any? = unwrap(this).getManagedSourceConfiguration()

    /**
     * A builder for [SourceConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param appIntegrations Configuration information for Amazon AppIntegrations to
       * automatically ingest content.
       */
      public fun appIntegrations(appIntegrations: IResolvable)

      /**
       * @param appIntegrations Configuration information for Amazon AppIntegrations to
       * automatically ingest content.
       */
      public fun appIntegrations(appIntegrations: AppIntegrationsConfigurationProperty)

      /**
       * @param appIntegrations Configuration information for Amazon AppIntegrations to
       * automatically ingest content.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6a64442978d7f0855f604a39ce68c26daa35a99dd4d26d0c3bf9a2a7487a0988")
      public
          fun appIntegrations(appIntegrations: AppIntegrationsConfigurationProperty.Builder.() -> Unit)

      /**
       * @param managedSourceConfiguration Source configuration for managed resources.
       */
      public fun managedSourceConfiguration(managedSourceConfiguration: IResolvable)

      /**
       * @param managedSourceConfiguration Source configuration for managed resources.
       */
      public
          fun managedSourceConfiguration(managedSourceConfiguration: ManagedSourceConfigurationProperty)

      /**
       * @param managedSourceConfiguration Source configuration for managed resources.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fd80a1d058151d99adf8828d6b32a4faf66af5852baba95b349bd749109e308d")
      public
          fun managedSourceConfiguration(managedSourceConfiguration: ManagedSourceConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.SourceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.SourceConfigurationProperty.builder()

      /**
       * @param appIntegrations Configuration information for Amazon AppIntegrations to
       * automatically ingest content.
       */
      override fun appIntegrations(appIntegrations: IResolvable) {
        cdkBuilder.appIntegrations(appIntegrations.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param appIntegrations Configuration information for Amazon AppIntegrations to
       * automatically ingest content.
       */
      override fun appIntegrations(appIntegrations: AppIntegrationsConfigurationProperty) {
        cdkBuilder.appIntegrations(appIntegrations.let(AppIntegrationsConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param appIntegrations Configuration information for Amazon AppIntegrations to
       * automatically ingest content.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6a64442978d7f0855f604a39ce68c26daa35a99dd4d26d0c3bf9a2a7487a0988")
      override
          fun appIntegrations(appIntegrations: AppIntegrationsConfigurationProperty.Builder.() -> Unit):
          Unit = appIntegrations(AppIntegrationsConfigurationProperty(appIntegrations))

      /**
       * @param managedSourceConfiguration Source configuration for managed resources.
       */
      override fun managedSourceConfiguration(managedSourceConfiguration: IResolvable) {
        cdkBuilder.managedSourceConfiguration(managedSourceConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param managedSourceConfiguration Source configuration for managed resources.
       */
      override
          fun managedSourceConfiguration(managedSourceConfiguration: ManagedSourceConfigurationProperty) {
        cdkBuilder.managedSourceConfiguration(managedSourceConfiguration.let(ManagedSourceConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param managedSourceConfiguration Source configuration for managed resources.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fd80a1d058151d99adf8828d6b32a4faf66af5852baba95b349bd749109e308d")
      override
          fun managedSourceConfiguration(managedSourceConfiguration: ManagedSourceConfigurationProperty.Builder.() -> Unit):
          Unit =
          managedSourceConfiguration(ManagedSourceConfigurationProperty(managedSourceConfiguration))

      public fun build():
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.SourceConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.SourceConfigurationProperty,
    ) : CdkObject(cdkObject),
        SourceConfigurationProperty {
      /**
       * Configuration information for Amazon AppIntegrations to automatically ingest content.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-sourceconfiguration.html#cfn-wisdom-knowledgebase-sourceconfiguration-appintegrations)
       */
      override fun appIntegrations(): Any? = unwrap(this).getAppIntegrations()

      /**
       * Source configuration for managed resources.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-sourceconfiguration.html#cfn-wisdom-knowledgebase-sourceconfiguration-managedsourceconfiguration)
       */
      override fun managedSourceConfiguration(): Any? = unwrap(this).getManagedSourceConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SourceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.SourceConfigurationProperty):
          SourceConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SourceConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceConfigurationProperty):
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.SourceConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.SourceConfigurationProperty
    }
  }

  /**
   * The configuration of the URL/URLs for the web content that you want to crawl.
   *
   * You should be authorized to crawl the URLs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wisdom.*;
   * UrlConfigurationProperty urlConfigurationProperty = UrlConfigurationProperty.builder()
   * .seedUrls(List.of(SeedUrlProperty.builder()
   * .url("url")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-urlconfiguration.html)
   */
  public interface UrlConfigurationProperty {
    /**
     * List of URLs for crawling.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-urlconfiguration.html#cfn-wisdom-knowledgebase-urlconfiguration-seedurls)
     */
    public fun seedUrls(): Any? = unwrap(this).getSeedUrls()

    /**
     * A builder for [UrlConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param seedUrls List of URLs for crawling.
       */
      public fun seedUrls(seedUrls: IResolvable)

      /**
       * @param seedUrls List of URLs for crawling.
       */
      public fun seedUrls(seedUrls: List<Any>)

      /**
       * @param seedUrls List of URLs for crawling.
       */
      public fun seedUrls(vararg seedUrls: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.UrlConfigurationProperty.Builder =
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.UrlConfigurationProperty.builder()

      /**
       * @param seedUrls List of URLs for crawling.
       */
      override fun seedUrls(seedUrls: IResolvable) {
        cdkBuilder.seedUrls(seedUrls.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param seedUrls List of URLs for crawling.
       */
      override fun seedUrls(seedUrls: List<Any>) {
        cdkBuilder.seedUrls(seedUrls.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param seedUrls List of URLs for crawling.
       */
      override fun seedUrls(vararg seedUrls: Any): Unit = seedUrls(seedUrls.toList())

      public fun build():
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.UrlConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.UrlConfigurationProperty,
    ) : CdkObject(cdkObject),
        UrlConfigurationProperty {
      /**
       * List of URLs for crawling.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-urlconfiguration.html#cfn-wisdom-knowledgebase-urlconfiguration-seedurls)
       */
      override fun seedUrls(): Any? = unwrap(this).getSeedUrls()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): UrlConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.UrlConfigurationProperty):
          UrlConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as? UrlConfigurationProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: UrlConfigurationProperty):
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.UrlConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.UrlConfigurationProperty
    }
  }

  /**
   * Contains details about how to ingest the documents in a data source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wisdom.*;
   * VectorIngestionConfigurationProperty vectorIngestionConfigurationProperty =
   * VectorIngestionConfigurationProperty.builder()
   * .chunkingConfiguration(ChunkingConfigurationProperty.builder()
   * .chunkingStrategy("chunkingStrategy")
   * // the properties below are optional
   * .fixedSizeChunkingConfiguration(FixedSizeChunkingConfigurationProperty.builder()
   * .maxTokens(123)
   * .overlapPercentage(123)
   * .build())
   * .hierarchicalChunkingConfiguration(HierarchicalChunkingConfigurationProperty.builder()
   * .levelConfigurations(List.of(HierarchicalChunkingLevelConfigurationProperty.builder()
   * .maxTokens(123)
   * .build()))
   * .overlapTokens(123)
   * .build())
   * .semanticChunkingConfiguration(SemanticChunkingConfigurationProperty.builder()
   * .breakpointPercentileThreshold(123)
   * .bufferSize(123)
   * .maxTokens(123)
   * .build())
   * .build())
   * .parsingConfiguration(ParsingConfigurationProperty.builder()
   * .parsingStrategy("parsingStrategy")
   * // the properties below are optional
   * .bedrockFoundationModelConfiguration(BedrockFoundationModelConfigurationProperty.builder()
   * .modelArn("modelArn")
   * // the properties below are optional
   * .parsingPrompt(ParsingPromptProperty.builder()
   * .parsingPromptText("parsingPromptText")
   * .build())
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-vectoringestionconfiguration.html)
   */
  public interface VectorIngestionConfigurationProperty {
    /**
     * Details about how to chunk the documents in the data source.
     *
     * A chunk refers to an excerpt from a data source that is returned when the knowledge base that
     * it belongs to is queried.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-vectoringestionconfiguration.html#cfn-wisdom-knowledgebase-vectoringestionconfiguration-chunkingconfiguration)
     */
    public fun chunkingConfiguration(): Any? = unwrap(this).getChunkingConfiguration()

    /**
     * A custom parser for data source documents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-vectoringestionconfiguration.html#cfn-wisdom-knowledgebase-vectoringestionconfiguration-parsingconfiguration)
     */
    public fun parsingConfiguration(): Any? = unwrap(this).getParsingConfiguration()

    /**
     * A builder for [VectorIngestionConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param chunkingConfiguration Details about how to chunk the documents in the data source.
       * A chunk refers to an excerpt from a data source that is returned when the knowledge base
       * that it belongs to is queried.
       */
      public fun chunkingConfiguration(chunkingConfiguration: IResolvable)

      /**
       * @param chunkingConfiguration Details about how to chunk the documents in the data source.
       * A chunk refers to an excerpt from a data source that is returned when the knowledge base
       * that it belongs to is queried.
       */
      public fun chunkingConfiguration(chunkingConfiguration: ChunkingConfigurationProperty)

      /**
       * @param chunkingConfiguration Details about how to chunk the documents in the data source.
       * A chunk refers to an excerpt from a data source that is returned when the knowledge base
       * that it belongs to is queried.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e83c74493e209697c38c464704e8d466d6b39f7b8cafca9013dcb54b9b5c6c69")
      public
          fun chunkingConfiguration(chunkingConfiguration: ChunkingConfigurationProperty.Builder.() -> Unit)

      /**
       * @param parsingConfiguration A custom parser for data source documents.
       */
      public fun parsingConfiguration(parsingConfiguration: IResolvable)

      /**
       * @param parsingConfiguration A custom parser for data source documents.
       */
      public fun parsingConfiguration(parsingConfiguration: ParsingConfigurationProperty)

      /**
       * @param parsingConfiguration A custom parser for data source documents.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8d8c19def93c879cae295dcbe328764f71db573f65aa0d81f602d5316205e543")
      public
          fun parsingConfiguration(parsingConfiguration: ParsingConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.VectorIngestionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.VectorIngestionConfigurationProperty.builder()

      /**
       * @param chunkingConfiguration Details about how to chunk the documents in the data source.
       * A chunk refers to an excerpt from a data source that is returned when the knowledge base
       * that it belongs to is queried.
       */
      override fun chunkingConfiguration(chunkingConfiguration: IResolvable) {
        cdkBuilder.chunkingConfiguration(chunkingConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param chunkingConfiguration Details about how to chunk the documents in the data source.
       * A chunk refers to an excerpt from a data source that is returned when the knowledge base
       * that it belongs to is queried.
       */
      override fun chunkingConfiguration(chunkingConfiguration: ChunkingConfigurationProperty) {
        cdkBuilder.chunkingConfiguration(chunkingConfiguration.let(ChunkingConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param chunkingConfiguration Details about how to chunk the documents in the data source.
       * A chunk refers to an excerpt from a data source that is returned when the knowledge base
       * that it belongs to is queried.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e83c74493e209697c38c464704e8d466d6b39f7b8cafca9013dcb54b9b5c6c69")
      override
          fun chunkingConfiguration(chunkingConfiguration: ChunkingConfigurationProperty.Builder.() -> Unit):
          Unit = chunkingConfiguration(ChunkingConfigurationProperty(chunkingConfiguration))

      /**
       * @param parsingConfiguration A custom parser for data source documents.
       */
      override fun parsingConfiguration(parsingConfiguration: IResolvable) {
        cdkBuilder.parsingConfiguration(parsingConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param parsingConfiguration A custom parser for data source documents.
       */
      override fun parsingConfiguration(parsingConfiguration: ParsingConfigurationProperty) {
        cdkBuilder.parsingConfiguration(parsingConfiguration.let(ParsingConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param parsingConfiguration A custom parser for data source documents.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8d8c19def93c879cae295dcbe328764f71db573f65aa0d81f602d5316205e543")
      override
          fun parsingConfiguration(parsingConfiguration: ParsingConfigurationProperty.Builder.() -> Unit):
          Unit = parsingConfiguration(ParsingConfigurationProperty(parsingConfiguration))

      public fun build():
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.VectorIngestionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.VectorIngestionConfigurationProperty,
    ) : CdkObject(cdkObject),
        VectorIngestionConfigurationProperty {
      /**
       * Details about how to chunk the documents in the data source.
       *
       * A chunk refers to an excerpt from a data source that is returned when the knowledge base
       * that it belongs to is queried.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-vectoringestionconfiguration.html#cfn-wisdom-knowledgebase-vectoringestionconfiguration-chunkingconfiguration)
       */
      override fun chunkingConfiguration(): Any? = unwrap(this).getChunkingConfiguration()

      /**
       * A custom parser for data source documents.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-vectoringestionconfiguration.html#cfn-wisdom-knowledgebase-vectoringestionconfiguration-parsingconfiguration)
       */
      override fun parsingConfiguration(): Any? = unwrap(this).getParsingConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          VectorIngestionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.VectorIngestionConfigurationProperty):
          VectorIngestionConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          VectorIngestionConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: VectorIngestionConfigurationProperty):
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.VectorIngestionConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.VectorIngestionConfigurationProperty
    }
  }

  /**
   * The configuration details for the web data source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wisdom.*;
   * WebCrawlerConfigurationProperty webCrawlerConfigurationProperty =
   * WebCrawlerConfigurationProperty.builder()
   * .urlConfiguration(UrlConfigurationProperty.builder()
   * .seedUrls(List.of(SeedUrlProperty.builder()
   * .url("url")
   * .build()))
   * .build())
   * // the properties below are optional
   * .crawlerLimits(CrawlerLimitsProperty.builder()
   * .rateLimit(123)
   * .build())
   * .exclusionFilters(List.of("exclusionFilters"))
   * .inclusionFilters(List.of("inclusionFilters"))
   * .scope("scope")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-webcrawlerconfiguration.html)
   */
  public interface WebCrawlerConfigurationProperty {
    /**
     * The configuration of crawl limits for the web URLs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-webcrawlerconfiguration.html#cfn-wisdom-knowledgebase-webcrawlerconfiguration-crawlerlimits)
     */
    public fun crawlerLimits(): Any? = unwrap(this).getCrawlerLimits()

    /**
     * A list of one or more exclusion regular expression patterns to exclude certain URLs.
     *
     * If you specify an inclusion and exclusion filter/pattern and both match a URL, the exclusion
     * filter takes precedence and the web content of the URL isn’t crawled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-webcrawlerconfiguration.html#cfn-wisdom-knowledgebase-webcrawlerconfiguration-exclusionfilters)
     */
    public fun exclusionFilters(): List<String> = unwrap(this).getExclusionFilters() ?: emptyList()

    /**
     * A list of one or more inclusion regular expression patterns to include certain URLs.
     *
     * If you specify an inclusion and exclusion filter/pattern and both match a URL, the exclusion
     * filter takes precedence and the web content of the URL isn’t crawled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-webcrawlerconfiguration.html#cfn-wisdom-knowledgebase-webcrawlerconfiguration-inclusionfilters)
     */
    public fun inclusionFilters(): List<String> = unwrap(this).getInclusionFilters() ?: emptyList()

    /**
     * The scope of what is crawled for your URLs.
     *
     * You can choose to crawl only web pages that belong to the same host or primary domain. For
     * example, only web pages that contain the seed URL
     * `https://docs.aws.amazon.com/bedrock/latest/userguide/` and no other domains. You can choose to
     * include sub domains in addition to the host or primary domain. For example, web pages that
     * contain `aws.amazon.com` can also include sub domain `docs.aws.amazon.com` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-webcrawlerconfiguration.html#cfn-wisdom-knowledgebase-webcrawlerconfiguration-scope)
     */
    public fun scope(): String? = unwrap(this).getScope()

    /**
     * The configuration of the URL/URLs for the web content that you want to crawl.
     *
     * You should be authorized to crawl the URLs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-webcrawlerconfiguration.html#cfn-wisdom-knowledgebase-webcrawlerconfiguration-urlconfiguration)
     */
    public fun urlConfiguration(): Any

    /**
     * A builder for [WebCrawlerConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param crawlerLimits The configuration of crawl limits for the web URLs.
       */
      public fun crawlerLimits(crawlerLimits: IResolvable)

      /**
       * @param crawlerLimits The configuration of crawl limits for the web URLs.
       */
      public fun crawlerLimits(crawlerLimits: CrawlerLimitsProperty)

      /**
       * @param crawlerLimits The configuration of crawl limits for the web URLs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("715463e55d18fce79024a5e4a45c791b7b26be7e048a1af34d3269cdfb94dd32")
      public fun crawlerLimits(crawlerLimits: CrawlerLimitsProperty.Builder.() -> Unit)

      /**
       * @param exclusionFilters A list of one or more exclusion regular expression patterns to
       * exclude certain URLs.
       * If you specify an inclusion and exclusion filter/pattern and both match a URL, the
       * exclusion filter takes precedence and the web content of the URL isn’t crawled.
       */
      public fun exclusionFilters(exclusionFilters: List<String>)

      /**
       * @param exclusionFilters A list of one or more exclusion regular expression patterns to
       * exclude certain URLs.
       * If you specify an inclusion and exclusion filter/pattern and both match a URL, the
       * exclusion filter takes precedence and the web content of the URL isn’t crawled.
       */
      public fun exclusionFilters(vararg exclusionFilters: String)

      /**
       * @param inclusionFilters A list of one or more inclusion regular expression patterns to
       * include certain URLs.
       * If you specify an inclusion and exclusion filter/pattern and both match a URL, the
       * exclusion filter takes precedence and the web content of the URL isn’t crawled.
       */
      public fun inclusionFilters(inclusionFilters: List<String>)

      /**
       * @param inclusionFilters A list of one or more inclusion regular expression patterns to
       * include certain URLs.
       * If you specify an inclusion and exclusion filter/pattern and both match a URL, the
       * exclusion filter takes precedence and the web content of the URL isn’t crawled.
       */
      public fun inclusionFilters(vararg inclusionFilters: String)

      /**
       * @param scope The scope of what is crawled for your URLs.
       * You can choose to crawl only web pages that belong to the same host or primary domain. For
       * example, only web pages that contain the seed URL
       * `https://docs.aws.amazon.com/bedrock/latest/userguide/` and no other domains. You can choose
       * to include sub domains in addition to the host or primary domain. For example, web pages that
       * contain `aws.amazon.com` can also include sub domain `docs.aws.amazon.com` .
       */
      public fun scope(scope: String)

      /**
       * @param urlConfiguration The configuration of the URL/URLs for the web content that you want
       * to crawl. 
       * You should be authorized to crawl the URLs.
       */
      public fun urlConfiguration(urlConfiguration: IResolvable)

      /**
       * @param urlConfiguration The configuration of the URL/URLs for the web content that you want
       * to crawl. 
       * You should be authorized to crawl the URLs.
       */
      public fun urlConfiguration(urlConfiguration: UrlConfigurationProperty)

      /**
       * @param urlConfiguration The configuration of the URL/URLs for the web content that you want
       * to crawl. 
       * You should be authorized to crawl the URLs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ff91b3da2e8b6198b5360f5bae8a0cc91ddc92114b34da2b58b72d5de52e287a")
      public fun urlConfiguration(urlConfiguration: UrlConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.WebCrawlerConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.WebCrawlerConfigurationProperty.builder()

      /**
       * @param crawlerLimits The configuration of crawl limits for the web URLs.
       */
      override fun crawlerLimits(crawlerLimits: IResolvable) {
        cdkBuilder.crawlerLimits(crawlerLimits.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param crawlerLimits The configuration of crawl limits for the web URLs.
       */
      override fun crawlerLimits(crawlerLimits: CrawlerLimitsProperty) {
        cdkBuilder.crawlerLimits(crawlerLimits.let(CrawlerLimitsProperty.Companion::unwrap))
      }

      /**
       * @param crawlerLimits The configuration of crawl limits for the web URLs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("715463e55d18fce79024a5e4a45c791b7b26be7e048a1af34d3269cdfb94dd32")
      override fun crawlerLimits(crawlerLimits: CrawlerLimitsProperty.Builder.() -> Unit): Unit =
          crawlerLimits(CrawlerLimitsProperty(crawlerLimits))

      /**
       * @param exclusionFilters A list of one or more exclusion regular expression patterns to
       * exclude certain URLs.
       * If you specify an inclusion and exclusion filter/pattern and both match a URL, the
       * exclusion filter takes precedence and the web content of the URL isn’t crawled.
       */
      override fun exclusionFilters(exclusionFilters: List<String>) {
        cdkBuilder.exclusionFilters(exclusionFilters)
      }

      /**
       * @param exclusionFilters A list of one or more exclusion regular expression patterns to
       * exclude certain URLs.
       * If you specify an inclusion and exclusion filter/pattern and both match a URL, the
       * exclusion filter takes precedence and the web content of the URL isn’t crawled.
       */
      override fun exclusionFilters(vararg exclusionFilters: String): Unit =
          exclusionFilters(exclusionFilters.toList())

      /**
       * @param inclusionFilters A list of one or more inclusion regular expression patterns to
       * include certain URLs.
       * If you specify an inclusion and exclusion filter/pattern and both match a URL, the
       * exclusion filter takes precedence and the web content of the URL isn’t crawled.
       */
      override fun inclusionFilters(inclusionFilters: List<String>) {
        cdkBuilder.inclusionFilters(inclusionFilters)
      }

      /**
       * @param inclusionFilters A list of one or more inclusion regular expression patterns to
       * include certain URLs.
       * If you specify an inclusion and exclusion filter/pattern and both match a URL, the
       * exclusion filter takes precedence and the web content of the URL isn’t crawled.
       */
      override fun inclusionFilters(vararg inclusionFilters: String): Unit =
          inclusionFilters(inclusionFilters.toList())

      /**
       * @param scope The scope of what is crawled for your URLs.
       * You can choose to crawl only web pages that belong to the same host or primary domain. For
       * example, only web pages that contain the seed URL
       * `https://docs.aws.amazon.com/bedrock/latest/userguide/` and no other domains. You can choose
       * to include sub domains in addition to the host or primary domain. For example, web pages that
       * contain `aws.amazon.com` can also include sub domain `docs.aws.amazon.com` .
       */
      override fun scope(scope: String) {
        cdkBuilder.scope(scope)
      }

      /**
       * @param urlConfiguration The configuration of the URL/URLs for the web content that you want
       * to crawl. 
       * You should be authorized to crawl the URLs.
       */
      override fun urlConfiguration(urlConfiguration: IResolvable) {
        cdkBuilder.urlConfiguration(urlConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param urlConfiguration The configuration of the URL/URLs for the web content that you want
       * to crawl. 
       * You should be authorized to crawl the URLs.
       */
      override fun urlConfiguration(urlConfiguration: UrlConfigurationProperty) {
        cdkBuilder.urlConfiguration(urlConfiguration.let(UrlConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param urlConfiguration The configuration of the URL/URLs for the web content that you want
       * to crawl. 
       * You should be authorized to crawl the URLs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ff91b3da2e8b6198b5360f5bae8a0cc91ddc92114b34da2b58b72d5de52e287a")
      override fun urlConfiguration(urlConfiguration: UrlConfigurationProperty.Builder.() -> Unit):
          Unit = urlConfiguration(UrlConfigurationProperty(urlConfiguration))

      public fun build():
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.WebCrawlerConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.WebCrawlerConfigurationProperty,
    ) : CdkObject(cdkObject),
        WebCrawlerConfigurationProperty {
      /**
       * The configuration of crawl limits for the web URLs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-webcrawlerconfiguration.html#cfn-wisdom-knowledgebase-webcrawlerconfiguration-crawlerlimits)
       */
      override fun crawlerLimits(): Any? = unwrap(this).getCrawlerLimits()

      /**
       * A list of one or more exclusion regular expression patterns to exclude certain URLs.
       *
       * If you specify an inclusion and exclusion filter/pattern and both match a URL, the
       * exclusion filter takes precedence and the web content of the URL isn’t crawled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-webcrawlerconfiguration.html#cfn-wisdom-knowledgebase-webcrawlerconfiguration-exclusionfilters)
       */
      override fun exclusionFilters(): List<String> = unwrap(this).getExclusionFilters() ?:
          emptyList()

      /**
       * A list of one or more inclusion regular expression patterns to include certain URLs.
       *
       * If you specify an inclusion and exclusion filter/pattern and both match a URL, the
       * exclusion filter takes precedence and the web content of the URL isn’t crawled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-webcrawlerconfiguration.html#cfn-wisdom-knowledgebase-webcrawlerconfiguration-inclusionfilters)
       */
      override fun inclusionFilters(): List<String> = unwrap(this).getInclusionFilters() ?:
          emptyList()

      /**
       * The scope of what is crawled for your URLs.
       *
       * You can choose to crawl only web pages that belong to the same host or primary domain. For
       * example, only web pages that contain the seed URL
       * `https://docs.aws.amazon.com/bedrock/latest/userguide/` and no other domains. You can choose
       * to include sub domains in addition to the host or primary domain. For example, web pages that
       * contain `aws.amazon.com` can also include sub domain `docs.aws.amazon.com` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-webcrawlerconfiguration.html#cfn-wisdom-knowledgebase-webcrawlerconfiguration-scope)
       */
      override fun scope(): String? = unwrap(this).getScope()

      /**
       * The configuration of the URL/URLs for the web content that you want to crawl.
       *
       * You should be authorized to crawl the URLs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-webcrawlerconfiguration.html#cfn-wisdom-knowledgebase-webcrawlerconfiguration-urlconfiguration)
       */
      override fun urlConfiguration(): Any = unwrap(this).getUrlConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): WebCrawlerConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.WebCrawlerConfigurationProperty):
          WebCrawlerConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          WebCrawlerConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: WebCrawlerConfigurationProperty):
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.WebCrawlerConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.WebCrawlerConfigurationProperty
    }
  }
}

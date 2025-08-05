@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.bedrock

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnKnowledgeBase`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.bedrock.*;
 * CfnKnowledgeBaseProps cfnKnowledgeBaseProps = CfnKnowledgeBaseProps.builder()
 * .knowledgeBaseConfiguration(KnowledgeBaseConfigurationProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .kendraKnowledgeBaseConfiguration(KendraKnowledgeBaseConfigurationProperty.builder()
 * .kendraIndexArn("kendraIndexArn")
 * .build())
 * .sqlKnowledgeBaseConfiguration(SqlKnowledgeBaseConfigurationProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .redshiftConfiguration(RedshiftConfigurationProperty.builder()
 * .queryEngineConfiguration(RedshiftQueryEngineConfigurationProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .provisionedConfiguration(RedshiftProvisionedConfigurationProperty.builder()
 * .authConfiguration(RedshiftProvisionedAuthConfigurationProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .databaseUser("databaseUser")
 * .usernamePasswordSecretArn("usernamePasswordSecretArn")
 * .build())
 * .clusterIdentifier("clusterIdentifier")
 * .build())
 * .serverlessConfiguration(RedshiftServerlessConfigurationProperty.builder()
 * .authConfiguration(RedshiftServerlessAuthConfigurationProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .usernamePasswordSecretArn("usernamePasswordSecretArn")
 * .build())
 * .workgroupArn("workgroupArn")
 * .build())
 * .build())
 * .storageConfigurations(List.of(RedshiftQueryEngineStorageConfigurationProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .awsDataCatalogConfiguration(RedshiftQueryEngineAwsDataCatalogStorageConfigurationProperty.builder()
 * .tableNames(List.of("tableNames"))
 * .build())
 * .redshiftConfiguration(RedshiftQueryEngineRedshiftStorageConfigurationProperty.builder()
 * .databaseName("databaseName")
 * .build())
 * .build()))
 * // the properties below are optional
 * .queryGenerationConfiguration(QueryGenerationConfigurationProperty.builder()
 * .executionTimeoutSeconds(123)
 * .generationContext(QueryGenerationContextProperty.builder()
 * .curatedQueries(List.of(CuratedQueryProperty.builder()
 * .naturalLanguage("naturalLanguage")
 * .sql("sql")
 * .build()))
 * .tables(List.of(QueryGenerationTableProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .columns(List.of(QueryGenerationColumnProperty.builder()
 * .description("description")
 * .inclusion("inclusion")
 * .name("name")
 * .build()))
 * .description("description")
 * .inclusion("inclusion")
 * .build()))
 * .build())
 * .build())
 * .build())
 * .build())
 * .vectorKnowledgeBaseConfiguration(VectorKnowledgeBaseConfigurationProperty.builder()
 * .embeddingModelArn("embeddingModelArn")
 * // the properties below are optional
 * .embeddingModelConfiguration(EmbeddingModelConfigurationProperty.builder()
 * .bedrockEmbeddingModelConfiguration(BedrockEmbeddingModelConfigurationProperty.builder()
 * .dimensions(123)
 * .embeddingDataType("embeddingDataType")
 * .build())
 * .build())
 * .supplementalDataStorageConfiguration(SupplementalDataStorageConfigurationProperty.builder()
 * .supplementalDataStorageLocations(List.of(SupplementalDataStorageLocationProperty.builder()
 * .supplementalDataStorageLocationType("supplementalDataStorageLocationType")
 * // the properties below are optional
 * .s3Location(S3LocationProperty.builder()
 * .uri("uri")
 * .build())
 * .build()))
 * .build())
 * .build())
 * .build())
 * .name("name")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .description("description")
 * .storageConfiguration(StorageConfigurationProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .mongoDbAtlasConfiguration(MongoDbAtlasConfigurationProperty.builder()
 * .collectionName("collectionName")
 * .credentialsSecretArn("credentialsSecretArn")
 * .databaseName("databaseName")
 * .endpoint("endpoint")
 * .fieldMapping(MongoDbAtlasFieldMappingProperty.builder()
 * .metadataField("metadataField")
 * .textField("textField")
 * .vectorField("vectorField")
 * .build())
 * .vectorIndexName("vectorIndexName")
 * // the properties below are optional
 * .endpointServiceName("endpointServiceName")
 * .textIndexName("textIndexName")
 * .build())
 * .neptuneAnalyticsConfiguration(NeptuneAnalyticsConfigurationProperty.builder()
 * .fieldMapping(NeptuneAnalyticsFieldMappingProperty.builder()
 * .metadataField("metadataField")
 * .textField("textField")
 * .build())
 * .graphArn("graphArn")
 * .build())
 * .opensearchManagedClusterConfiguration(OpenSearchManagedClusterConfigurationProperty.builder()
 * .domainArn("domainArn")
 * .domainEndpoint("domainEndpoint")
 * .fieldMapping(OpenSearchManagedClusterFieldMappingProperty.builder()
 * .metadataField("metadataField")
 * .textField("textField")
 * .vectorField("vectorField")
 * .build())
 * .vectorIndexName("vectorIndexName")
 * .build())
 * .opensearchServerlessConfiguration(OpenSearchServerlessConfigurationProperty.builder()
 * .collectionArn("collectionArn")
 * .fieldMapping(OpenSearchServerlessFieldMappingProperty.builder()
 * .metadataField("metadataField")
 * .textField("textField")
 * .vectorField("vectorField")
 * .build())
 * .vectorIndexName("vectorIndexName")
 * .build())
 * .pineconeConfiguration(PineconeConfigurationProperty.builder()
 * .connectionString("connectionString")
 * .credentialsSecretArn("credentialsSecretArn")
 * .fieldMapping(PineconeFieldMappingProperty.builder()
 * .metadataField("metadataField")
 * .textField("textField")
 * .build())
 * // the properties below are optional
 * .namespace("namespace")
 * .build())
 * .rdsConfiguration(RdsConfigurationProperty.builder()
 * .credentialsSecretArn("credentialsSecretArn")
 * .databaseName("databaseName")
 * .fieldMapping(RdsFieldMappingProperty.builder()
 * .metadataField("metadataField")
 * .primaryKeyField("primaryKeyField")
 * .textField("textField")
 * .vectorField("vectorField")
 * // the properties below are optional
 * .customMetadataField("customMetadataField")
 * .build())
 * .resourceArn("resourceArn")
 * .tableName("tableName")
 * .build())
 * .build())
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-knowledgebase.html)
 */
public interface CfnKnowledgeBaseProps {
  /**
   * The description of the knowledge base associated with the inline agent.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-knowledgebase.html#cfn-bedrock-knowledgebase-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Contains details about the embeddings configuration of the knowledge base.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-knowledgebase.html#cfn-bedrock-knowledgebase-knowledgebaseconfiguration)
   */
  public fun knowledgeBaseConfiguration(): Any

  /**
   * The name of the knowledge base.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-knowledgebase.html#cfn-bedrock-knowledgebase-name)
   */
  public fun name(): String

  /**
   * The Amazon Resource Name (ARN) of the IAM role with permissions to invoke API operations on the
   * knowledge base.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-knowledgebase.html#cfn-bedrock-knowledgebase-rolearn)
   */
  public fun roleArn(): String

  /**
   * Contains details about the storage configuration of the knowledge base.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-knowledgebase.html#cfn-bedrock-knowledgebase-storageconfiguration)
   */
  public fun storageConfiguration(): Any? = unwrap(this).getStorageConfiguration()

  /**
   * Metadata that you can assign to a resource as key-value pairs. For more information, see the
   * following resources:.
   *
   * * [Tag naming limits and
   * requirements](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-conventions)
   * * [Tagging best
   * practices](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-best-practices)
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-knowledgebase.html#cfn-bedrock-knowledgebase-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [CfnKnowledgeBaseProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the knowledge base associated with the inline agent.
     */
    public fun description(description: String)

    /**
     * @param knowledgeBaseConfiguration Contains details about the embeddings configuration of the
     * knowledge base. 
     */
    public fun knowledgeBaseConfiguration(knowledgeBaseConfiguration: IResolvable)

    /**
     * @param knowledgeBaseConfiguration Contains details about the embeddings configuration of the
     * knowledge base. 
     */
    public
        fun knowledgeBaseConfiguration(knowledgeBaseConfiguration: CfnKnowledgeBase.KnowledgeBaseConfigurationProperty)

    /**
     * @param knowledgeBaseConfiguration Contains details about the embeddings configuration of the
     * knowledge base. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8025d938b3af075f8df8fc861a0b9c1f5dadec596fc119b1b68de7e98a8cc166")
    public
        fun knowledgeBaseConfiguration(knowledgeBaseConfiguration: CfnKnowledgeBase.KnowledgeBaseConfigurationProperty.Builder.() -> Unit)

    /**
     * @param name The name of the knowledge base. 
     */
    public fun name(name: String)

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role with permissions to invoke API
     * operations on the knowledge base. 
     */
    public fun roleArn(roleArn: String)

    /**
     * @param storageConfiguration Contains details about the storage configuration of the knowledge
     * base.
     */
    public fun storageConfiguration(storageConfiguration: IResolvable)

    /**
     * @param storageConfiguration Contains details about the storage configuration of the knowledge
     * base.
     */
    public
        fun storageConfiguration(storageConfiguration: CfnKnowledgeBase.StorageConfigurationProperty)

    /**
     * @param storageConfiguration Contains details about the storage configuration of the knowledge
     * base.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("939a094bee2276eca705c0c724260f1173e535fbdddfe2f5d334b31351b6eb0a")
    public
        fun storageConfiguration(storageConfiguration: CfnKnowledgeBase.StorageConfigurationProperty.Builder.() -> Unit)

    /**
     * @param tags Metadata that you can assign to a resource as key-value pairs. For more
     * information, see the following resources:.
     * * [Tag naming limits and
     * requirements](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-conventions)
     * * [Tagging best
     * practices](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-best-practices)
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.bedrock.CfnKnowledgeBaseProps.Builder =
        software.amazon.awscdk.services.bedrock.CfnKnowledgeBaseProps.builder()

    /**
     * @param description The description of the knowledge base associated with the inline agent.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param knowledgeBaseConfiguration Contains details about the embeddings configuration of the
     * knowledge base. 
     */
    override fun knowledgeBaseConfiguration(knowledgeBaseConfiguration: IResolvable) {
      cdkBuilder.knowledgeBaseConfiguration(knowledgeBaseConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param knowledgeBaseConfiguration Contains details about the embeddings configuration of the
     * knowledge base. 
     */
    override
        fun knowledgeBaseConfiguration(knowledgeBaseConfiguration: CfnKnowledgeBase.KnowledgeBaseConfigurationProperty) {
      cdkBuilder.knowledgeBaseConfiguration(knowledgeBaseConfiguration.let(CfnKnowledgeBase.KnowledgeBaseConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param knowledgeBaseConfiguration Contains details about the embeddings configuration of the
     * knowledge base. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8025d938b3af075f8df8fc861a0b9c1f5dadec596fc119b1b68de7e98a8cc166")
    override
        fun knowledgeBaseConfiguration(knowledgeBaseConfiguration: CfnKnowledgeBase.KnowledgeBaseConfigurationProperty.Builder.() -> Unit):
        Unit =
        knowledgeBaseConfiguration(CfnKnowledgeBase.KnowledgeBaseConfigurationProperty(knowledgeBaseConfiguration))

    /**
     * @param name The name of the knowledge base. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role with permissions to invoke API
     * operations on the knowledge base. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param storageConfiguration Contains details about the storage configuration of the knowledge
     * base.
     */
    override fun storageConfiguration(storageConfiguration: IResolvable) {
      cdkBuilder.storageConfiguration(storageConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param storageConfiguration Contains details about the storage configuration of the knowledge
     * base.
     */
    override
        fun storageConfiguration(storageConfiguration: CfnKnowledgeBase.StorageConfigurationProperty) {
      cdkBuilder.storageConfiguration(storageConfiguration.let(CfnKnowledgeBase.StorageConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param storageConfiguration Contains details about the storage configuration of the knowledge
     * base.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("939a094bee2276eca705c0c724260f1173e535fbdddfe2f5d334b31351b6eb0a")
    override
        fun storageConfiguration(storageConfiguration: CfnKnowledgeBase.StorageConfigurationProperty.Builder.() -> Unit):
        Unit =
        storageConfiguration(CfnKnowledgeBase.StorageConfigurationProperty(storageConfiguration))

    /**
     * @param tags Metadata that you can assign to a resource as key-value pairs. For more
     * information, see the following resources:.
     * * [Tag naming limits and
     * requirements](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-conventions)
     * * [Tagging best
     * practices](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-best-practices)
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.bedrock.CfnKnowledgeBaseProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBaseProps,
  ) : CdkObject(cdkObject),
      CfnKnowledgeBaseProps {
    /**
     * The description of the knowledge base associated with the inline agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-knowledgebase.html#cfn-bedrock-knowledgebase-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Contains details about the embeddings configuration of the knowledge base.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-knowledgebase.html#cfn-bedrock-knowledgebase-knowledgebaseconfiguration)
     */
    override fun knowledgeBaseConfiguration(): Any = unwrap(this).getKnowledgeBaseConfiguration()

    /**
     * The name of the knowledge base.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-knowledgebase.html#cfn-bedrock-knowledgebase-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The Amazon Resource Name (ARN) of the IAM role with permissions to invoke API operations on
     * the knowledge base.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-knowledgebase.html#cfn-bedrock-knowledgebase-rolearn)
     */
    override fun roleArn(): String = unwrap(this).getRoleArn()

    /**
     * Contains details about the storage configuration of the knowledge base.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-knowledgebase.html#cfn-bedrock-knowledgebase-storageconfiguration)
     */
    override fun storageConfiguration(): Any? = unwrap(this).getStorageConfiguration()

    /**
     * Metadata that you can assign to a resource as key-value pairs. For more information, see the
     * following resources:.
     *
     * * [Tag naming limits and
     * requirements](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-conventions)
     * * [Tagging best
     * practices](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-best-practices)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-knowledgebase.html#cfn-bedrock-knowledgebase-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnKnowledgeBaseProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBaseProps):
        CfnKnowledgeBaseProps = CdkObjectWrappers.wrap(cdkObject) as? CfnKnowledgeBaseProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnKnowledgeBaseProps):
        software.amazon.awscdk.services.bedrock.CfnKnowledgeBaseProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.bedrock.CfnKnowledgeBaseProps
  }
}

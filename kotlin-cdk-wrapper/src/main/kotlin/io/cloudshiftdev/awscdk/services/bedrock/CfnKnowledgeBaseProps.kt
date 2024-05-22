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
 * .vectorKnowledgeBaseConfiguration(VectorKnowledgeBaseConfigurationProperty.builder()
 * .embeddingModelArn("embeddingModelArn")
 * .build())
 * .build())
 * .name("name")
 * .roleArn("roleArn")
 * .storageConfiguration(StorageConfigurationProperty.builder()
 * .type("type")
 * // the properties below are optional
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
 * .build())
 * .resourceArn("resourceArn")
 * .tableName("tableName")
 * .build())
 * .build())
 * // the properties below are optional
 * .description("description")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-knowledgebase.html)
 */
public interface CfnKnowledgeBaseProps {
  /**
   * The description of the knowledge base.
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
  public fun storageConfiguration(): Any

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
     * @param description The description of the knowledge base.
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
     * @param description The description of the knowledge base.
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
  ) : CdkObject(cdkObject), CfnKnowledgeBaseProps {
    /**
     * The description of the knowledge base.
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
    override fun storageConfiguration(): Any = unwrap(this).getStorageConfiguration()

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

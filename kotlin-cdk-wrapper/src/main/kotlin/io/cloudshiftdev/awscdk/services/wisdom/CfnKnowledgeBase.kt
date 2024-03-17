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
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-knowledgebase.html)
 */
public open class CfnKnowledgeBase internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.wisdom.CfnKnowledgeBase,
) : CfnResource(cdkObject), IInspectable, ITaggable {
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
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
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
    unwrap(this).setRenderingConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * Information about how to render the content.
   */
  public open fun renderingConfiguration(`value`: RenderingConfigurationProperty) {
    unwrap(this).setRenderingConfiguration(`value`.let(RenderingConfigurationProperty::unwrap))
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
    unwrap(this).setServerSideEncryptionConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * This customer managed key must have a policy that allows `kms:CreateGrant` and
   * `kms:DescribeKey` permissions to the IAM identity using the key to invoke Wisdom.
   */
  public open
      fun serverSideEncryptionConfiguration(`value`: ServerSideEncryptionConfigurationProperty) {
    unwrap(this).setServerSideEncryptionConfiguration(`value`.let(ServerSideEncryptionConfigurationProperty::unwrap))
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
    unwrap(this).setSourceConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The source of the knowledge base content.
   */
  public open fun sourceConfiguration(`value`: SourceConfigurationProperty) {
    unwrap(this).setSourceConfiguration(`value`.let(SourceConfigurationProperty::unwrap))
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
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

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
     * Only set this argument for EXTERNAL knowledge bases.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-knowledgebase.html#cfn-wisdom-knowledgebase-sourceconfiguration)
     * @param sourceConfiguration The source of the knowledge base content. 
     */
    public fun sourceConfiguration(sourceConfiguration: IResolvable)

    /**
     * The source of the knowledge base content.
     *
     * Only set this argument for EXTERNAL knowledge bases.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-knowledgebase.html#cfn-wisdom-knowledgebase-sourceconfiguration)
     * @param sourceConfiguration The source of the knowledge base content. 
     */
    public fun sourceConfiguration(sourceConfiguration: SourceConfigurationProperty)

    /**
     * The source of the knowledge base content.
     *
     * Only set this argument for EXTERNAL knowledge bases.
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
      cdkBuilder.renderingConfiguration(renderingConfiguration.let(IResolvable::unwrap))
    }

    /**
     * Information about how to render the content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-knowledgebase.html#cfn-wisdom-knowledgebase-renderingconfiguration)
     * @param renderingConfiguration Information about how to render the content. 
     */
    override fun renderingConfiguration(renderingConfiguration: RenderingConfigurationProperty) {
      cdkBuilder.renderingConfiguration(renderingConfiguration.let(RenderingConfigurationProperty::unwrap))
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
      cdkBuilder.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration.let(IResolvable::unwrap))
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
      cdkBuilder.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration.let(ServerSideEncryptionConfigurationProperty::unwrap))
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
     * Only set this argument for EXTERNAL knowledge bases.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-knowledgebase.html#cfn-wisdom-knowledgebase-sourceconfiguration)
     * @param sourceConfiguration The source of the knowledge base content. 
     */
    override fun sourceConfiguration(sourceConfiguration: IResolvable) {
      cdkBuilder.sourceConfiguration(sourceConfiguration.let(IResolvable::unwrap))
    }

    /**
     * The source of the knowledge base content.
     *
     * Only set this argument for EXTERNAL knowledge bases.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-knowledgebase.html#cfn-wisdom-knowledgebase-sourceconfiguration)
     * @param sourceConfiguration The source of the knowledge base content. 
     */
    override fun sourceConfiguration(sourceConfiguration: SourceConfigurationProperty) {
      cdkBuilder.sourceConfiguration(sourceConfiguration.let(SourceConfigurationProperty::unwrap))
    }

    /**
     * The source of the knowledge base content.
     *
     * Only set this argument for EXTERNAL knowledge bases.
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
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-knowledgebase.html#cfn-wisdom-knowledgebase-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

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
        software.amazon.awscdk.services.wisdom.CfnKnowledgeBase = wrapped.cdkObject
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
      override val cdkObject:
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.ServerSideEncryptionConfigurationProperty,
    ) : CdkObject(cdkObject), ServerSideEncryptionConfigurationProperty {
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
    public fun appIntegrations(): Any

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
        cdkBuilder.appIntegrations(appIntegrations.let(IResolvable::unwrap))
      }

      /**
       * @param appIntegrations Configuration information for Amazon AppIntegrations to
       * automatically ingest content. 
       */
      override fun appIntegrations(appIntegrations: AppIntegrationsConfigurationProperty) {
        cdkBuilder.appIntegrations(appIntegrations.let(AppIntegrationsConfigurationProperty::unwrap))
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

      public fun build():
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.SourceConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.SourceConfigurationProperty,
    ) : CdkObject(cdkObject), SourceConfigurationProperty {
      /**
       * Configuration information for Amazon AppIntegrations to automatically ingest content.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-sourceconfiguration.html#cfn-wisdom-knowledgebase-sourceconfiguration-appintegrations)
       */
      override fun appIntegrations(): Any = unwrap(this).getAppIntegrations()
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
      override val cdkObject:
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.RenderingConfigurationProperty,
    ) : CdkObject(cdkObject), RenderingConfigurationProperty {
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
     * * For [Amazon S3](https://docs.aws.amazon.com/https://aws.amazon.com/s3/) , the
     * ObjectConfiguration and FileConfiguration of your AppIntegrations DataIntegration must be null.
     * The `SourceURI` of your DataIntegration must use the following format:
     * `s3://your_s3_bucket_name` .
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
     * The fields from the source that are made available to your agents in Amazon Q.
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
       * * For [Amazon S3](https://docs.aws.amazon.com/https://aws.amazon.com/s3/) , the
       * ObjectConfiguration and FileConfiguration of your AppIntegrations DataIntegration must be
       * null. The `SourceURI` of your DataIntegration must use the following format:
       * `s3://your_s3_bucket_name` .
       *
       *
       * The bucket policy of the corresponding S3 bucket must allow the AWS principal
       * `app-integrations.amazonaws.com` to perform `s3:ListBucket` , `s3:GetObject` , and
       * `s3:GetBucketLocation` against the bucket.
       */
      public fun appIntegrationArn(appIntegrationArn: String)

      /**
       * @param objectFields The fields from the source that are made available to your agents in
       * Amazon Q.
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
       * Amazon Q.
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
       * * For [Amazon S3](https://docs.aws.amazon.com/https://aws.amazon.com/s3/) , the
       * ObjectConfiguration and FileConfiguration of your AppIntegrations DataIntegration must be
       * null. The `SourceURI` of your DataIntegration must use the following format:
       * `s3://your_s3_bucket_name` .
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
       * Amazon Q.
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
       * Amazon Q.
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
      override val cdkObject:
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.AppIntegrationsConfigurationProperty,
    ) : CdkObject(cdkObject), AppIntegrationsConfigurationProperty {
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
       * * For [Amazon S3](https://docs.aws.amazon.com/https://aws.amazon.com/s3/) , the
       * ObjectConfiguration and FileConfiguration of your AppIntegrations DataIntegration must be
       * null. The `SourceURI` of your DataIntegration must use the following format:
       * `s3://your_s3_bucket_name` .
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
       * The fields from the source that are made available to your agents in Amazon Q.
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
}

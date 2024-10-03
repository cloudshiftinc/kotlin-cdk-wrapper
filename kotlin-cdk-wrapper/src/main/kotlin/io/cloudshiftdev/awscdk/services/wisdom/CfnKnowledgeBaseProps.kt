@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.wisdom

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
 * Properties for defining a `CfnKnowledgeBase`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.wisdom.*;
 * CfnKnowledgeBaseProps cfnKnowledgeBaseProps = CfnKnowledgeBaseProps.builder()
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
public interface CfnKnowledgeBaseProps {
  /**
   * The description.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-knowledgebase.html#cfn-wisdom-knowledgebase-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The type of knowledge base.
   *
   * Only CUSTOM knowledge bases allow you to upload your own content. EXTERNAL knowledge bases
   * support integrations with third-party systems whose content is synchronized automatically.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-knowledgebase.html#cfn-wisdom-knowledgebase-knowledgebasetype)
   */
  public fun knowledgeBaseType(): String

  /**
   * The name of the knowledge base.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-knowledgebase.html#cfn-wisdom-knowledgebase-name)
   */
  public fun name(): String

  /**
   * Information about how to render the content.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-knowledgebase.html#cfn-wisdom-knowledgebase-renderingconfiguration)
   */
  public fun renderingConfiguration(): Any? = unwrap(this).getRenderingConfiguration()

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
   */
  public fun serverSideEncryptionConfiguration(): Any? =
      unwrap(this).getServerSideEncryptionConfiguration()

  /**
   * The source of the knowledge base content.
   *
   * Only set this argument for EXTERNAL knowledge bases.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-knowledgebase.html#cfn-wisdom-knowledgebase-sourceconfiguration)
   */
  public fun sourceConfiguration(): Any? = unwrap(this).getSourceConfiguration()

  /**
   * The tags used to organize, track, or control access for this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-knowledgebase.html#cfn-wisdom-knowledgebase-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnKnowledgeBaseProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description.
     */
    public fun description(description: String)

    /**
     * @param knowledgeBaseType The type of knowledge base. 
     * Only CUSTOM knowledge bases allow you to upload your own content. EXTERNAL knowledge bases
     * support integrations with third-party systems whose content is synchronized automatically.
     */
    public fun knowledgeBaseType(knowledgeBaseType: String)

    /**
     * @param name The name of the knowledge base. 
     */
    public fun name(name: String)

    /**
     * @param renderingConfiguration Information about how to render the content.
     */
    public fun renderingConfiguration(renderingConfiguration: IResolvable)

    /**
     * @param renderingConfiguration Information about how to render the content.
     */
    public
        fun renderingConfiguration(renderingConfiguration: CfnKnowledgeBase.RenderingConfigurationProperty)

    /**
     * @param renderingConfiguration Information about how to render the content.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d0aebe78ff727564b27acef22a3c4970dfd00f5eb55748ab3da6e4fe865ecb64")
    public
        fun renderingConfiguration(renderingConfiguration: CfnKnowledgeBase.RenderingConfigurationProperty.Builder.() -> Unit)

    /**
     * @param serverSideEncryptionConfiguration This customer managed key must have a policy that
     * allows `kms:CreateGrant` and `kms:DescribeKey` permissions to the IAM identity using the key to
     * invoke Wisdom.
     * For more information about setting up a customer managed key for Wisdom, see [Enable Amazon
     * Connect Wisdom for your
     * instance](https://docs.aws.amazon.com/connect/latest/adminguide/enable-wisdom.html) . For
     * information about valid ID values, see [Key identifiers
     * (KeyId)](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id) in the *AWS
     * Key Management Service Developer Guide* .
     */
    public fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: IResolvable)

    /**
     * @param serverSideEncryptionConfiguration This customer managed key must have a policy that
     * allows `kms:CreateGrant` and `kms:DescribeKey` permissions to the IAM identity using the key to
     * invoke Wisdom.
     * For more information about setting up a customer managed key for Wisdom, see [Enable Amazon
     * Connect Wisdom for your
     * instance](https://docs.aws.amazon.com/connect/latest/adminguide/enable-wisdom.html) . For
     * information about valid ID values, see [Key identifiers
     * (KeyId)](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id) in the *AWS
     * Key Management Service Developer Guide* .
     */
    public
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: CfnKnowledgeBase.ServerSideEncryptionConfigurationProperty)

    /**
     * @param serverSideEncryptionConfiguration This customer managed key must have a policy that
     * allows `kms:CreateGrant` and `kms:DescribeKey` permissions to the IAM identity using the key to
     * invoke Wisdom.
     * For more information about setting up a customer managed key for Wisdom, see [Enable Amazon
     * Connect Wisdom for your
     * instance](https://docs.aws.amazon.com/connect/latest/adminguide/enable-wisdom.html) . For
     * information about valid ID values, see [Key identifiers
     * (KeyId)](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id) in the *AWS
     * Key Management Service Developer Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9ddbb6715c77f32db26c6d836c4617d9406b9da18a117d339ee018d8da9f8fa2")
    public
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: CfnKnowledgeBase.ServerSideEncryptionConfigurationProperty.Builder.() -> Unit)

    /**
     * @param sourceConfiguration The source of the knowledge base content.
     * Only set this argument for EXTERNAL knowledge bases.
     */
    public fun sourceConfiguration(sourceConfiguration: IResolvable)

    /**
     * @param sourceConfiguration The source of the knowledge base content.
     * Only set this argument for EXTERNAL knowledge bases.
     */
    public
        fun sourceConfiguration(sourceConfiguration: CfnKnowledgeBase.SourceConfigurationProperty)

    /**
     * @param sourceConfiguration The source of the knowledge base content.
     * Only set this argument for EXTERNAL knowledge bases.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("831e5321be410a3412eb38e68908afcea65252ea3272798458e677caa1c889d9")
    public
        fun sourceConfiguration(sourceConfiguration: CfnKnowledgeBase.SourceConfigurationProperty.Builder.() -> Unit)

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.wisdom.CfnKnowledgeBaseProps.Builder =
        software.amazon.awscdk.services.wisdom.CfnKnowledgeBaseProps.builder()

    /**
     * @param description The description.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param knowledgeBaseType The type of knowledge base. 
     * Only CUSTOM knowledge bases allow you to upload your own content. EXTERNAL knowledge bases
     * support integrations with third-party systems whose content is synchronized automatically.
     */
    override fun knowledgeBaseType(knowledgeBaseType: String) {
      cdkBuilder.knowledgeBaseType(knowledgeBaseType)
    }

    /**
     * @param name The name of the knowledge base. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param renderingConfiguration Information about how to render the content.
     */
    override fun renderingConfiguration(renderingConfiguration: IResolvable) {
      cdkBuilder.renderingConfiguration(renderingConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param renderingConfiguration Information about how to render the content.
     */
    override
        fun renderingConfiguration(renderingConfiguration: CfnKnowledgeBase.RenderingConfigurationProperty) {
      cdkBuilder.renderingConfiguration(renderingConfiguration.let(CfnKnowledgeBase.RenderingConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param renderingConfiguration Information about how to render the content.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d0aebe78ff727564b27acef22a3c4970dfd00f5eb55748ab3da6e4fe865ecb64")
    override
        fun renderingConfiguration(renderingConfiguration: CfnKnowledgeBase.RenderingConfigurationProperty.Builder.() -> Unit):
        Unit =
        renderingConfiguration(CfnKnowledgeBase.RenderingConfigurationProperty(renderingConfiguration))

    /**
     * @param serverSideEncryptionConfiguration This customer managed key must have a policy that
     * allows `kms:CreateGrant` and `kms:DescribeKey` permissions to the IAM identity using the key to
     * invoke Wisdom.
     * For more information about setting up a customer managed key for Wisdom, see [Enable Amazon
     * Connect Wisdom for your
     * instance](https://docs.aws.amazon.com/connect/latest/adminguide/enable-wisdom.html) . For
     * information about valid ID values, see [Key identifiers
     * (KeyId)](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id) in the *AWS
     * Key Management Service Developer Guide* .
     */
    override fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: IResolvable) {
      cdkBuilder.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param serverSideEncryptionConfiguration This customer managed key must have a policy that
     * allows `kms:CreateGrant` and `kms:DescribeKey` permissions to the IAM identity using the key to
     * invoke Wisdom.
     * For more information about setting up a customer managed key for Wisdom, see [Enable Amazon
     * Connect Wisdom for your
     * instance](https://docs.aws.amazon.com/connect/latest/adminguide/enable-wisdom.html) . For
     * information about valid ID values, see [Key identifiers
     * (KeyId)](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id) in the *AWS
     * Key Management Service Developer Guide* .
     */
    override
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: CfnKnowledgeBase.ServerSideEncryptionConfigurationProperty) {
      cdkBuilder.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration.let(CfnKnowledgeBase.ServerSideEncryptionConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param serverSideEncryptionConfiguration This customer managed key must have a policy that
     * allows `kms:CreateGrant` and `kms:DescribeKey` permissions to the IAM identity using the key to
     * invoke Wisdom.
     * For more information about setting up a customer managed key for Wisdom, see [Enable Amazon
     * Connect Wisdom for your
     * instance](https://docs.aws.amazon.com/connect/latest/adminguide/enable-wisdom.html) . For
     * information about valid ID values, see [Key identifiers
     * (KeyId)](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id) in the *AWS
     * Key Management Service Developer Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9ddbb6715c77f32db26c6d836c4617d9406b9da18a117d339ee018d8da9f8fa2")
    override
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: CfnKnowledgeBase.ServerSideEncryptionConfigurationProperty.Builder.() -> Unit):
        Unit =
        serverSideEncryptionConfiguration(CfnKnowledgeBase.ServerSideEncryptionConfigurationProperty(serverSideEncryptionConfiguration))

    /**
     * @param sourceConfiguration The source of the knowledge base content.
     * Only set this argument for EXTERNAL knowledge bases.
     */
    override fun sourceConfiguration(sourceConfiguration: IResolvable) {
      cdkBuilder.sourceConfiguration(sourceConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param sourceConfiguration The source of the knowledge base content.
     * Only set this argument for EXTERNAL knowledge bases.
     */
    override
        fun sourceConfiguration(sourceConfiguration: CfnKnowledgeBase.SourceConfigurationProperty) {
      cdkBuilder.sourceConfiguration(sourceConfiguration.let(CfnKnowledgeBase.SourceConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param sourceConfiguration The source of the knowledge base content.
     * Only set this argument for EXTERNAL knowledge bases.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("831e5321be410a3412eb38e68908afcea65252ea3272798458e677caa1c889d9")
    override
        fun sourceConfiguration(sourceConfiguration: CfnKnowledgeBase.SourceConfigurationProperty.Builder.() -> Unit):
        Unit =
        sourceConfiguration(CfnKnowledgeBase.SourceConfigurationProperty(sourceConfiguration))

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.wisdom.CfnKnowledgeBaseProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.wisdom.CfnKnowledgeBaseProps,
  ) : CdkObject(cdkObject),
      CfnKnowledgeBaseProps {
    /**
     * The description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-knowledgebase.html#cfn-wisdom-knowledgebase-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The type of knowledge base.
     *
     * Only CUSTOM knowledge bases allow you to upload your own content. EXTERNAL knowledge bases
     * support integrations with third-party systems whose content is synchronized automatically.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-knowledgebase.html#cfn-wisdom-knowledgebase-knowledgebasetype)
     */
    override fun knowledgeBaseType(): String = unwrap(this).getKnowledgeBaseType()

    /**
     * The name of the knowledge base.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-knowledgebase.html#cfn-wisdom-knowledgebase-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Information about how to render the content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-knowledgebase.html#cfn-wisdom-knowledgebase-renderingconfiguration)
     */
    override fun renderingConfiguration(): Any? = unwrap(this).getRenderingConfiguration()

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
     */
    override fun serverSideEncryptionConfiguration(): Any? =
        unwrap(this).getServerSideEncryptionConfiguration()

    /**
     * The source of the knowledge base content.
     *
     * Only set this argument for EXTERNAL knowledge bases.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-knowledgebase.html#cfn-wisdom-knowledgebase-sourceconfiguration)
     */
    override fun sourceConfiguration(): Any? = unwrap(this).getSourceConfiguration()

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-knowledgebase.html#cfn-wisdom-knowledgebase-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnKnowledgeBaseProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnKnowledgeBaseProps):
        CfnKnowledgeBaseProps = CdkObjectWrappers.wrap(cdkObject) as? CfnKnowledgeBaseProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnKnowledgeBaseProps):
        software.amazon.awscdk.services.wisdom.CfnKnowledgeBaseProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.wisdom.CfnKnowledgeBaseProps
  }
}

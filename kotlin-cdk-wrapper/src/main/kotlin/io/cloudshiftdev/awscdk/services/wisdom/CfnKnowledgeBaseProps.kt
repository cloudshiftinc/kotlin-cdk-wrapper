@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.wisdom

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnKnowledgeBaseProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun knowledgeBaseType(): String

  public fun name(): String

  public fun renderingConfiguration(): Any? = unwrap(this).getRenderingConfiguration()

  public fun serverSideEncryptionConfiguration(): Any? =
      unwrap(this).getServerSideEncryptionConfiguration()

  public fun sourceConfiguration(): Any? = unwrap(this).getSourceConfiguration()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun knowledgeBaseType(knowledgeBaseType: String)

    public fun name(name: String)

    public fun renderingConfiguration(renderingConfiguration: IResolvable)

    public
        fun renderingConfiguration(renderingConfiguration: CfnKnowledgeBase.RenderingConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d0aebe78ff727564b27acef22a3c4970dfd00f5eb55748ab3da6e4fe865ecb64")
    public
        fun renderingConfiguration(renderingConfiguration: CfnKnowledgeBase.RenderingConfigurationProperty.Builder.() -> Unit)

    public fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: IResolvable)

    public
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: CfnKnowledgeBase.ServerSideEncryptionConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9ddbb6715c77f32db26c6d836c4617d9406b9da18a117d339ee018d8da9f8fa2")
    public
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: CfnKnowledgeBase.ServerSideEncryptionConfigurationProperty.Builder.() -> Unit)

    public fun sourceConfiguration(sourceConfiguration: IResolvable)

    public
        fun sourceConfiguration(sourceConfiguration: CfnKnowledgeBase.SourceConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("831e5321be410a3412eb38e68908afcea65252ea3272798458e677caa1c889d9")
    public
        fun sourceConfiguration(sourceConfiguration: CfnKnowledgeBase.SourceConfigurationProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.wisdom.CfnKnowledgeBaseProps.Builder =
        software.amazon.awscdk.services.wisdom.CfnKnowledgeBaseProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun knowledgeBaseType(knowledgeBaseType: String) {
      cdkBuilder.knowledgeBaseType(knowledgeBaseType)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun renderingConfiguration(renderingConfiguration: IResolvable) {
      cdkBuilder.renderingConfiguration(renderingConfiguration.let(IResolvable::unwrap))
    }

    override
        fun renderingConfiguration(renderingConfiguration: CfnKnowledgeBase.RenderingConfigurationProperty) {
      cdkBuilder.renderingConfiguration(renderingConfiguration.let(CfnKnowledgeBase.RenderingConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d0aebe78ff727564b27acef22a3c4970dfd00f5eb55748ab3da6e4fe865ecb64")
    override
        fun renderingConfiguration(renderingConfiguration: CfnKnowledgeBase.RenderingConfigurationProperty.Builder.() -> Unit):
        Unit =
        renderingConfiguration(CfnKnowledgeBase.RenderingConfigurationProperty(renderingConfiguration))

    override fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: IResolvable) {
      cdkBuilder.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration.let(IResolvable::unwrap))
    }

    override
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: CfnKnowledgeBase.ServerSideEncryptionConfigurationProperty) {
      cdkBuilder.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration.let(CfnKnowledgeBase.ServerSideEncryptionConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9ddbb6715c77f32db26c6d836c4617d9406b9da18a117d339ee018d8da9f8fa2")
    override
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: CfnKnowledgeBase.ServerSideEncryptionConfigurationProperty.Builder.() -> Unit):
        Unit =
        serverSideEncryptionConfiguration(CfnKnowledgeBase.ServerSideEncryptionConfigurationProperty(serverSideEncryptionConfiguration))

    override fun sourceConfiguration(sourceConfiguration: IResolvable) {
      cdkBuilder.sourceConfiguration(sourceConfiguration.let(IResolvable::unwrap))
    }

    override
        fun sourceConfiguration(sourceConfiguration: CfnKnowledgeBase.SourceConfigurationProperty) {
      cdkBuilder.sourceConfiguration(sourceConfiguration.let(CfnKnowledgeBase.SourceConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("831e5321be410a3412eb38e68908afcea65252ea3272798458e677caa1c889d9")
    override
        fun sourceConfiguration(sourceConfiguration: CfnKnowledgeBase.SourceConfigurationProperty.Builder.() -> Unit):
        Unit =
        sourceConfiguration(CfnKnowledgeBase.SourceConfigurationProperty(sourceConfiguration))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.wisdom.CfnKnowledgeBaseProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.wisdom.CfnKnowledgeBaseProps,
  ) : CdkObject(cdkObject), CfnKnowledgeBaseProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun knowledgeBaseType(): String = unwrap(this).getKnowledgeBaseType()

    override fun name(): String = unwrap(this).getName()

    override fun renderingConfiguration(): Any? = unwrap(this).getRenderingConfiguration()

    override fun serverSideEncryptionConfiguration(): Any? =
        unwrap(this).getServerSideEncryptionConfiguration()

    override fun sourceConfiguration(): Any? = unwrap(this).getSourceConfiguration()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnKnowledgeBaseProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnKnowledgeBaseProps):
        CfnKnowledgeBaseProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnKnowledgeBaseProps):
        software.amazon.awscdk.services.wisdom.CfnKnowledgeBaseProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.wisdom.CfnKnowledgeBaseProps
  }
}

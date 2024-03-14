package io.cloudshiftdev.awscdk.services.wisdom

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnKnowledgeBase internal constructor(
  private val cdkObject: software.amazon.awscdk.services.wisdom.CfnKnowledgeBase,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrKnowledgeBaseArn(): String = unwrap(this).getAttrKnowledgeBaseArn()

  public open fun attrKnowledgeBaseId(): String = unwrap(this).getAttrKnowledgeBaseId()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun knowledgeBaseType(): String = unwrap(this).getKnowledgeBaseType()

  public open fun knowledgeBaseType(`value`: String) {
    unwrap(this).setKnowledgeBaseType(`value`)
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun renderingConfiguration(): Any? = unwrap(this).getRenderingConfiguration()

  public open fun renderingConfiguration(`value`: IResolvable) {
    unwrap(this).setRenderingConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun renderingConfiguration(`value`: RenderingConfigurationProperty) {
    unwrap(this).setRenderingConfiguration(`value`.let(RenderingConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7924ce83f77d64440444f88dd3eb4d4945bd8f98ba1056e38b89f5daa1e40c8c")
  public open
      fun renderingConfiguration(`value`: RenderingConfigurationProperty.Builder.() -> Unit): Unit =
      renderingConfiguration(RenderingConfigurationProperty(`value`))

  public open fun serverSideEncryptionConfiguration(): Any? =
      unwrap(this).getServerSideEncryptionConfiguration()

  public open fun serverSideEncryptionConfiguration(`value`: IResolvable) {
    unwrap(this).setServerSideEncryptionConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open
      fun serverSideEncryptionConfiguration(`value`: ServerSideEncryptionConfigurationProperty) {
    unwrap(this).setServerSideEncryptionConfiguration(`value`.let(ServerSideEncryptionConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("366eba3c184487b90c73d62cc720314786f3dbfa566a69f3d1954c0a2e9b443a")
  public open
      fun serverSideEncryptionConfiguration(`value`: ServerSideEncryptionConfigurationProperty.Builder.() -> Unit):
      Unit = serverSideEncryptionConfiguration(ServerSideEncryptionConfigurationProperty(`value`))

  public open fun sourceConfiguration(): Any? = unwrap(this).getSourceConfiguration()

  public open fun sourceConfiguration(`value`: IResolvable) {
    unwrap(this).setSourceConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun sourceConfiguration(`value`: SourceConfigurationProperty) {
    unwrap(this).setSourceConfiguration(`value`.let(SourceConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("670b4a243ca021d46bb10369ed19127f574324d44e4685bf477cf3753a5c3129")
  public open fun sourceConfiguration(`value`: SourceConfigurationProperty.Builder.() -> Unit): Unit
      = sourceConfiguration(SourceConfigurationProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun description(description: String) {
    }

    public fun knowledgeBaseType(knowledgeBaseType: String) {
    }

    public fun name(name: String) {
    }

    public fun renderingConfiguration(renderingConfiguration: IResolvable) {
    }

    public fun renderingConfiguration(renderingConfiguration: RenderingConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b99b7c442864630a725d6c732c7dec3f1cb7334c007c5b95b44f47dc8c322fc2")
    public
        fun renderingConfiguration(renderingConfiguration: RenderingConfigurationProperty.Builder.() -> Unit) {
    }

    public fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: IResolvable) {
    }

    public
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: ServerSideEncryptionConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a593150940889e7d085bf1701d88c0c61a1efe41f44ae6c05f4819ccbe3a2ff2")
    public
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: ServerSideEncryptionConfigurationProperty.Builder.() -> Unit) {
    }

    public fun sourceConfiguration(sourceConfiguration: IResolvable) {
    }

    public fun sourceConfiguration(sourceConfiguration: SourceConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9c9332db18c2e5fc8ef05f70b66f404acef2ce02aa1428319bfda4d40b132a7f")
    public
        fun sourceConfiguration(sourceConfiguration: SourceConfigurationProperty.Builder.() -> Unit) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.Builder =
        software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.Builder.create(scope, id)

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun knowledgeBaseType(knowledgeBaseType: String) {
      cdkBuilder.knowledgeBaseType(knowledgeBaseType)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun renderingConfiguration(renderingConfiguration: IResolvable) {
      cdkBuilder.renderingConfiguration(renderingConfiguration.let(IResolvable::unwrap))
    }

    public override
        fun renderingConfiguration(renderingConfiguration: RenderingConfigurationProperty) {
      cdkBuilder.renderingConfiguration(renderingConfiguration.let(RenderingConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b99b7c442864630a725d6c732c7dec3f1cb7334c007c5b95b44f47dc8c322fc2")
    public override
        fun renderingConfiguration(renderingConfiguration: RenderingConfigurationProperty.Builder.() -> Unit):
        Unit = renderingConfiguration(RenderingConfigurationProperty(renderingConfiguration))

    public override
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: IResolvable) {
      cdkBuilder.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration.let(IResolvable::unwrap))
    }

    public override
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: ServerSideEncryptionConfigurationProperty) {
      cdkBuilder.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration.let(ServerSideEncryptionConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a593150940889e7d085bf1701d88c0c61a1efe41f44ae6c05f4819ccbe3a2ff2")
    public override
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: ServerSideEncryptionConfigurationProperty.Builder.() -> Unit):
        Unit =
        serverSideEncryptionConfiguration(ServerSideEncryptionConfigurationProperty(serverSideEncryptionConfiguration))

    public override fun sourceConfiguration(sourceConfiguration: IResolvable) {
      cdkBuilder.sourceConfiguration(sourceConfiguration.let(IResolvable::unwrap))
    }

    public override fun sourceConfiguration(sourceConfiguration: SourceConfigurationProperty) {
      cdkBuilder.sourceConfiguration(sourceConfiguration.let(SourceConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9c9332db18c2e5fc8ef05f70b66f404acef2ce02aa1428319bfda4d40b132a7f")
    public override
        fun sourceConfiguration(sourceConfiguration: SourceConfigurationProperty.Builder.() -> Unit):
        Unit = sourceConfiguration(SourceConfigurationProperty(sourceConfiguration))

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.wisdom.CfnKnowledgeBase = cdkBuilder.build()
  }

  public companion object {
    init {

    }

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

  public interface ServerSideEncryptionConfigurationProperty {
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    public interface Builder {
      public fun kmsKeyId(kmsKeyId: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.ServerSideEncryptionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.ServerSideEncryptionConfigurationProperty.builder()

      public override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      public fun build():
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.ServerSideEncryptionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.ServerSideEncryptionConfigurationProperty,
    ) : ServerSideEncryptionConfigurationProperty {
      public override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ServerSideEncryptionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.ServerSideEncryptionConfigurationProperty):
          ServerSideEncryptionConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServerSideEncryptionConfigurationProperty):
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.ServerSideEncryptionConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface SourceConfigurationProperty {
    public fun appIntegrations(): Any

    public interface Builder {
      public fun appIntegrations(appIntegrations: IResolvable) {
      }

      public fun appIntegrations(appIntegrations: AppIntegrationsConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6a64442978d7f0855f604a39ce68c26daa35a99dd4d26d0c3bf9a2a7487a0988")
      public
          fun appIntegrations(appIntegrations: AppIntegrationsConfigurationProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.SourceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.SourceConfigurationProperty.builder()

      public override fun appIntegrations(appIntegrations: IResolvable) {
        cdkBuilder.appIntegrations(appIntegrations.let(IResolvable::unwrap))
      }

      public override fun appIntegrations(appIntegrations: AppIntegrationsConfigurationProperty) {
        cdkBuilder.appIntegrations(appIntegrations.let(AppIntegrationsConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6a64442978d7f0855f604a39ce68c26daa35a99dd4d26d0c3bf9a2a7487a0988")
      public override
          fun appIntegrations(appIntegrations: AppIntegrationsConfigurationProperty.Builder.() -> Unit):
          Unit = appIntegrations(AppIntegrationsConfigurationProperty(appIntegrations))

      public fun build():
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.SourceConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.SourceConfigurationProperty,
    ) : SourceConfigurationProperty {
      public override fun appIntegrations(): Any = unwrap(this).getAppIntegrations()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SourceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.SourceConfigurationProperty):
          SourceConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceConfigurationProperty):
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.SourceConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface RenderingConfigurationProperty {
    public fun templateUri(): String? = unwrap(this).getTemplateUri()

    public interface Builder {
      public fun templateUri(templateUri: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.RenderingConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.RenderingConfigurationProperty.builder()

      public override fun templateUri(templateUri: String) {
        cdkBuilder.templateUri(templateUri)
      }

      public fun build():
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.RenderingConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.RenderingConfigurationProperty,
    ) : RenderingConfigurationProperty {
      public override fun templateUri(): String? = unwrap(this).getTemplateUri()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RenderingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.RenderingConfigurationProperty):
          RenderingConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RenderingConfigurationProperty):
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.RenderingConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AppIntegrationsConfigurationProperty {
    public fun appIntegrationArn(): String

    public fun objectFields(): List<String> = unwrap(this).getObjectFields() ?: emptyList()

    public interface Builder {
      public fun appIntegrationArn(appIntegrationArn: String) {
      }

      public fun objectFields(objectFields: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.AppIntegrationsConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.AppIntegrationsConfigurationProperty.builder()

      public override fun appIntegrationArn(appIntegrationArn: String) {
        cdkBuilder.appIntegrationArn(appIntegrationArn)
      }

      public override fun objectFields(objectFields: List<String>) {
        cdkBuilder.objectFields(objectFields)
      }

      public fun build():
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.AppIntegrationsConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.AppIntegrationsConfigurationProperty,
    ) : AppIntegrationsConfigurationProperty {
      public override fun appIntegrationArn(): String = unwrap(this).getAppIntegrationArn()

      public override fun objectFields(): List<String> = unwrap(this).getObjectFields() ?:
          emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AppIntegrationsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.AppIntegrationsConfigurationProperty):
          AppIntegrationsConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AppIntegrationsConfigurationProperty):
          software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.AppIntegrationsConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}

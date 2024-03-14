package io.cloudshiftdev.awscdk.services.appintegrations

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

public open class CfnDataIntegration internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appintegrations.CfnDataIntegration,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrDataIntegrationArn(): String = unwrap(this).getAttrDataIntegrationArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun fileConfiguration(): Any? = unwrap(this).getFileConfiguration()

  public open fun fileConfiguration(`value`: IResolvable) {
    unwrap(this).setFileConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun fileConfiguration(`value`: FileConfigurationProperty) {
    unwrap(this).setFileConfiguration(`value`.let(FileConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f2adc25cd7d4beceeb2ae3fb90f69703b1f105598680a799678b443562f6b9c5")
  public open fun fileConfiguration(`value`: FileConfigurationProperty.Builder.() -> Unit): Unit =
      fileConfiguration(FileConfigurationProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun kmsKey(): String = unwrap(this).getKmsKey()

  public open fun kmsKey(`value`: String) {
    unwrap(this).setKmsKey(`value`)
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun objectConfiguration(): Any? = unwrap(this).getObjectConfiguration()

  public open fun objectConfiguration(`value`: Any) {
    unwrap(this).setObjectConfiguration(`value`)
  }

  public open fun scheduleConfig(): Any? = unwrap(this).getScheduleConfig()

  public open fun scheduleConfig(`value`: IResolvable) {
    unwrap(this).setScheduleConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun scheduleConfig(`value`: ScheduleConfigProperty) {
    unwrap(this).setScheduleConfig(`value`.let(ScheduleConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0bbbac3b352d5ac0f9ddecbc6fb862b2d90df91be1216220f1a820a7fb4d8083")
  public open fun scheduleConfig(`value`: ScheduleConfigProperty.Builder.() -> Unit): Unit =
      scheduleConfig(ScheduleConfigProperty(`value`))

  public open fun sourceUri(): String = unwrap(this).getSourceUri()

  public open fun sourceUri(`value`: String) {
    unwrap(this).setSourceUri(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public interface Builder {
    public fun description(description: String)

    public fun fileConfiguration(fileConfiguration: IResolvable)

    public fun fileConfiguration(fileConfiguration: FileConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c0d3ae32aa8666f3c6576bb12199758f0d36515a44406953f1c58bc5ca298af5")
    public fun fileConfiguration(fileConfiguration: FileConfigurationProperty.Builder.() -> Unit)

    public fun kmsKey(kmsKey: String)

    public fun name(name: String)

    public fun objectConfiguration(objectConfiguration: Any)

    public fun scheduleConfig(scheduleConfig: IResolvable)

    public fun scheduleConfig(scheduleConfig: ScheduleConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e19c75c75946003dc2287b741c14dc1d829aedfd5a3d81ce0b4c9da014ce1a1f")
    public fun scheduleConfig(scheduleConfig: ScheduleConfigProperty.Builder.() -> Unit)

    public fun sourceUri(sourceUri: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appintegrations.CfnDataIntegration.Builder =
        software.amazon.awscdk.services.appintegrations.CfnDataIntegration.Builder.create(scope, id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun fileConfiguration(fileConfiguration: IResolvable) {
      cdkBuilder.fileConfiguration(fileConfiguration.let(IResolvable::unwrap))
    }

    override fun fileConfiguration(fileConfiguration: FileConfigurationProperty) {
      cdkBuilder.fileConfiguration(fileConfiguration.let(FileConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c0d3ae32aa8666f3c6576bb12199758f0d36515a44406953f1c58bc5ca298af5")
    override fun fileConfiguration(fileConfiguration: FileConfigurationProperty.Builder.() -> Unit):
        Unit = fileConfiguration(FileConfigurationProperty(fileConfiguration))

    override fun kmsKey(kmsKey: String) {
      cdkBuilder.kmsKey(kmsKey)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun objectConfiguration(objectConfiguration: Any) {
      cdkBuilder.objectConfiguration(objectConfiguration)
    }

    override fun scheduleConfig(scheduleConfig: IResolvable) {
      cdkBuilder.scheduleConfig(scheduleConfig.let(IResolvable::unwrap))
    }

    override fun scheduleConfig(scheduleConfig: ScheduleConfigProperty) {
      cdkBuilder.scheduleConfig(scheduleConfig.let(ScheduleConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e19c75c75946003dc2287b741c14dc1d829aedfd5a3d81ce0b4c9da014ce1a1f")
    override fun scheduleConfig(scheduleConfig: ScheduleConfigProperty.Builder.() -> Unit): Unit =
        scheduleConfig(ScheduleConfigProperty(scheduleConfig))

    override fun sourceUri(sourceUri: String) {
      cdkBuilder.sourceUri(sourceUri)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.appintegrations.CfnDataIntegration =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDataIntegration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDataIntegration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appintegrations.CfnDataIntegration):
        CfnDataIntegration = CfnDataIntegration(cdkObject)

    internal fun unwrap(wrapped: CfnDataIntegration):
        software.amazon.awscdk.services.appintegrations.CfnDataIntegration = wrapped.cdkObject
  }

  public interface ScheduleConfigProperty {
    public fun firstExecutionFrom(): String? = unwrap(this).getFirstExecutionFrom()

    public fun `object`(): String? = unwrap(this).getObject()

    public fun scheduleExpression(): String

    public interface Builder {
      public fun firstExecutionFrom(firstExecutionFrom: String)

      public fun `object`(`object`: String)

      public fun scheduleExpression(scheduleExpression: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appintegrations.CfnDataIntegration.ScheduleConfigProperty.Builder
          =
          software.amazon.awscdk.services.appintegrations.CfnDataIntegration.ScheduleConfigProperty.builder()

      override fun firstExecutionFrom(firstExecutionFrom: String) {
        cdkBuilder.firstExecutionFrom(firstExecutionFrom)
      }

      override fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
      }

      override fun scheduleExpression(scheduleExpression: String) {
        cdkBuilder.scheduleExpression(scheduleExpression)
      }

      public fun build():
          software.amazon.awscdk.services.appintegrations.CfnDataIntegration.ScheduleConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appintegrations.CfnDataIntegration.ScheduleConfigProperty,
    ) : ScheduleConfigProperty {
      override fun firstExecutionFrom(): String? = unwrap(this).getFirstExecutionFrom()

      override fun `object`(): String? = unwrap(this).getObject()

      override fun scheduleExpression(): String = unwrap(this).getScheduleExpression()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ScheduleConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appintegrations.CfnDataIntegration.ScheduleConfigProperty):
          ScheduleConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScheduleConfigProperty):
          software.amazon.awscdk.services.appintegrations.CfnDataIntegration.ScheduleConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface FileConfigurationProperty {
    public fun filters(): Any? = unwrap(this).getFilters()

    public fun folders(): List<String>

    public interface Builder {
      public fun filters(filters: Any)

      public fun folders(folders: List<String>)

      public fun folders(vararg folders: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appintegrations.CfnDataIntegration.FileConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.appintegrations.CfnDataIntegration.FileConfigurationProperty.builder()

      override fun filters(filters: Any) {
        cdkBuilder.filters(filters)
      }

      override fun folders(folders: List<String>) {
        cdkBuilder.folders(folders)
      }

      override fun folders(vararg folders: String): Unit = folders(folders.toList())

      public fun build():
          software.amazon.awscdk.services.appintegrations.CfnDataIntegration.FileConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appintegrations.CfnDataIntegration.FileConfigurationProperty,
    ) : FileConfigurationProperty {
      override fun filters(): Any? = unwrap(this).getFilters()

      override fun folders(): List<String> = unwrap(this).getFolders()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FileConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appintegrations.CfnDataIntegration.FileConfigurationProperty):
          FileConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FileConfigurationProperty):
          software.amazon.awscdk.services.appintegrations.CfnDataIntegration.FileConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}

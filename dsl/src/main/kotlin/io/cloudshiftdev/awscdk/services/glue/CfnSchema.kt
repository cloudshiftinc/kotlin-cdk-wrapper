package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSchema internal constructor(
  private val cdkObject: software.amazon.awscdk.services.glue.CfnSchema,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrInitialSchemaVersionId(): String =
      unwrap(this).getAttrInitialSchemaVersionId()

  public open fun checkpointVersion(): Any? = unwrap(this).getCheckpointVersion()

  public open fun checkpointVersion(`value`: IResolvable) {
    unwrap(this).setCheckpointVersion(`value`.let(IResolvable::unwrap))
  }

  public open fun checkpointVersion(`value`: SchemaVersionProperty) {
    unwrap(this).setCheckpointVersion(`value`.let(SchemaVersionProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7f14ad1a485ab2723afb3f5b1b8f0beaf5c5fd8372dbf725dd4a229830232f77")
  public open fun checkpointVersion(`value`: SchemaVersionProperty.Builder.() -> Unit): Unit =
      checkpointVersion(SchemaVersionProperty(`value`))

  public open fun compatibility(): String = unwrap(this).getCompatibility()

  public open fun compatibility(`value`: String) {
    unwrap(this).setCompatibility(`value`)
  }

  public open fun dataFormat(): String = unwrap(this).getDataFormat()

  public open fun dataFormat(`value`: String) {
    unwrap(this).setDataFormat(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun registry(): Any? = unwrap(this).getRegistry()

  public open fun registry(`value`: IResolvable) {
    unwrap(this).setRegistry(`value`.let(IResolvable::unwrap))
  }

  public open fun registry(`value`: RegistryProperty) {
    unwrap(this).setRegistry(`value`.let(RegistryProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("24134c63f1038052ea111cbba6623d0255a0d637aa6bc4b10c27f248e19ccced")
  public open fun registry(`value`: RegistryProperty.Builder.() -> Unit): Unit =
      registry(RegistryProperty(`value`))

  public open fun schemaDefinition(): String = unwrap(this).getSchemaDefinition()

  public open fun schemaDefinition(`value`: String) {
    unwrap(this).setSchemaDefinition(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public interface Builder {
    public fun checkpointVersion(checkpointVersion: IResolvable)

    public fun checkpointVersion(checkpointVersion: SchemaVersionProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3eeb7859853555ddbc8e034fa3c713d1c5d55ef36b6839602ae57bb54808494c")
    public fun checkpointVersion(checkpointVersion: SchemaVersionProperty.Builder.() -> Unit)

    public fun compatibility(compatibility: String)

    public fun dataFormat(dataFormat: String)

    public fun description(description: String)

    public fun name(name: String)

    public fun registry(registry: IResolvable)

    public fun registry(registry: RegistryProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0e1c454a8571fb2f1580d2ce942f579497f8e983dfe9fa7a990003f276a9b9d0")
    public fun registry(registry: RegistryProperty.Builder.() -> Unit)

    public fun schemaDefinition(schemaDefinition: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnSchema.Builder =
        software.amazon.awscdk.services.glue.CfnSchema.Builder.create(scope, id)

    override fun checkpointVersion(checkpointVersion: IResolvable) {
      cdkBuilder.checkpointVersion(checkpointVersion.let(IResolvable::unwrap))
    }

    override fun checkpointVersion(checkpointVersion: SchemaVersionProperty) {
      cdkBuilder.checkpointVersion(checkpointVersion.let(SchemaVersionProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3eeb7859853555ddbc8e034fa3c713d1c5d55ef36b6839602ae57bb54808494c")
    override fun checkpointVersion(checkpointVersion: SchemaVersionProperty.Builder.() -> Unit):
        Unit = checkpointVersion(SchemaVersionProperty(checkpointVersion))

    override fun compatibility(compatibility: String) {
      cdkBuilder.compatibility(compatibility)
    }

    override fun dataFormat(dataFormat: String) {
      cdkBuilder.dataFormat(dataFormat)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun registry(registry: IResolvable) {
      cdkBuilder.registry(registry.let(IResolvable::unwrap))
    }

    override fun registry(registry: RegistryProperty) {
      cdkBuilder.registry(registry.let(RegistryProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0e1c454a8571fb2f1580d2ce942f579497f8e983dfe9fa7a990003f276a9b9d0")
    override fun registry(registry: RegistryProperty.Builder.() -> Unit): Unit =
        registry(RegistryProperty(registry))

    override fun schemaDefinition(schemaDefinition: String) {
      cdkBuilder.schemaDefinition(schemaDefinition)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.glue.CfnSchema = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSchema {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSchema(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnSchema): CfnSchema =
        CfnSchema(cdkObject)

    internal fun unwrap(wrapped: CfnSchema): software.amazon.awscdk.services.glue.CfnSchema =
        wrapped.cdkObject
  }

  public interface SchemaVersionProperty {
    public fun isLatest(): Any? = unwrap(this).getIsLatest()

    public fun versionNumber(): Number? = unwrap(this).getVersionNumber()

    public interface Builder {
      public fun isLatest(isLatest: Boolean)

      public fun isLatest(isLatest: IResolvable)

      public fun versionNumber(versionNumber: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnSchema.SchemaVersionProperty.Builder =
          software.amazon.awscdk.services.glue.CfnSchema.SchemaVersionProperty.builder()

      override fun isLatest(isLatest: Boolean) {
        cdkBuilder.isLatest(isLatest)
      }

      override fun isLatest(isLatest: IResolvable) {
        cdkBuilder.isLatest(isLatest.let(IResolvable::unwrap))
      }

      override fun versionNumber(versionNumber: Number) {
        cdkBuilder.versionNumber(versionNumber)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnSchema.SchemaVersionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.glue.CfnSchema.SchemaVersionProperty,
    ) : SchemaVersionProperty {
      override fun isLatest(): Any? = unwrap(this).getIsLatest()

      override fun versionNumber(): Number? = unwrap(this).getVersionNumber()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SchemaVersionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnSchema.SchemaVersionProperty):
          SchemaVersionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SchemaVersionProperty):
          software.amazon.awscdk.services.glue.CfnSchema.SchemaVersionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface RegistryProperty {
    public fun arn(): String? = unwrap(this).getArn()

    public fun name(): String? = unwrap(this).getName()

    public interface Builder {
      public fun arn(arn: String)

      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnSchema.RegistryProperty.Builder =
          software.amazon.awscdk.services.glue.CfnSchema.RegistryProperty.builder()

      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnSchema.RegistryProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.glue.CfnSchema.RegistryProperty,
    ) : RegistryProperty {
      override fun arn(): String? = unwrap(this).getArn()

      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RegistryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnSchema.RegistryProperty):
          RegistryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RegistryProperty):
          software.amazon.awscdk.services.glue.CfnSchema.RegistryProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}

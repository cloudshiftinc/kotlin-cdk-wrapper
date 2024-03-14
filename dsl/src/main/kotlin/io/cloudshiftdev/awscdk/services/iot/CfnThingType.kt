package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnThingType internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iot.CfnThingType,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun deprecateThingType(): Any? = unwrap(this).getDeprecateThingType()

  public open fun deprecateThingType(`value`: Boolean) {
    unwrap(this).setDeprecateThingType(`value`)
  }

  public open fun deprecateThingType(`value`: IResolvable) {
    unwrap(this).setDeprecateThingType(`value`.let(IResolvable::unwrap))
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun thingTypeName(): String? = unwrap(this).getThingTypeName()

  public open fun thingTypeName(`value`: String) {
    unwrap(this).setThingTypeName(`value`)
  }

  public open fun thingTypeProperties(): Any? = unwrap(this).getThingTypeProperties()

  public open fun thingTypeProperties(`value`: IResolvable) {
    unwrap(this).setThingTypeProperties(`value`.let(IResolvable::unwrap))
  }

  public open fun thingTypeProperties(`value`: ThingTypePropertiesProperty) {
    unwrap(this).setThingTypeProperties(`value`.let(ThingTypePropertiesProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("adbd823a5ba27f17aba347e598d0eef6b0a8051543c7ed625f1c1efad2fcb533")
  public open fun thingTypeProperties(`value`: ThingTypePropertiesProperty.Builder.() -> Unit): Unit
      = thingTypeProperties(ThingTypePropertiesProperty(`value`))

  public interface Builder {
    public fun deprecateThingType(deprecateThingType: Boolean)

    public fun deprecateThingType(deprecateThingType: IResolvable)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun thingTypeName(thingTypeName: String)

    public fun thingTypeProperties(thingTypeProperties: IResolvable)

    public fun thingTypeProperties(thingTypeProperties: ThingTypePropertiesProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7aeaad2d462d2485cf682674aca0c5c899bf8351fd37f923fabf37f643588bce")
    public
        fun thingTypeProperties(thingTypeProperties: ThingTypePropertiesProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnThingType.Builder =
        software.amazon.awscdk.services.iot.CfnThingType.Builder.create(scope, id)

    override fun deprecateThingType(deprecateThingType: Boolean) {
      cdkBuilder.deprecateThingType(deprecateThingType)
    }

    override fun deprecateThingType(deprecateThingType: IResolvable) {
      cdkBuilder.deprecateThingType(deprecateThingType.let(IResolvable::unwrap))
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun thingTypeName(thingTypeName: String) {
      cdkBuilder.thingTypeName(thingTypeName)
    }

    override fun thingTypeProperties(thingTypeProperties: IResolvable) {
      cdkBuilder.thingTypeProperties(thingTypeProperties.let(IResolvable::unwrap))
    }

    override fun thingTypeProperties(thingTypeProperties: ThingTypePropertiesProperty) {
      cdkBuilder.thingTypeProperties(thingTypeProperties.let(ThingTypePropertiesProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7aeaad2d462d2485cf682674aca0c5c899bf8351fd37f923fabf37f643588bce")
    override
        fun thingTypeProperties(thingTypeProperties: ThingTypePropertiesProperty.Builder.() -> Unit):
        Unit = thingTypeProperties(ThingTypePropertiesProperty(thingTypeProperties))

    public fun build(): software.amazon.awscdk.services.iot.CfnThingType = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnThingType {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnThingType(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnThingType): CfnThingType =
        CfnThingType(cdkObject)

    internal fun unwrap(wrapped: CfnThingType): software.amazon.awscdk.services.iot.CfnThingType =
        wrapped.cdkObject
  }

  public interface ThingTypePropertiesProperty {
    public fun searchableAttributes(): List<String> = unwrap(this).getSearchableAttributes() ?:
        emptyList()

    public fun thingTypeDescription(): String? = unwrap(this).getThingTypeDescription()

    public interface Builder {
      public fun searchableAttributes(searchableAttributes: List<String>)

      public fun searchableAttributes(vararg searchableAttributes: String)

      public fun thingTypeDescription(thingTypeDescription: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnThingType.ThingTypePropertiesProperty.Builder =
          software.amazon.awscdk.services.iot.CfnThingType.ThingTypePropertiesProperty.builder()

      override fun searchableAttributes(searchableAttributes: List<String>) {
        cdkBuilder.searchableAttributes(searchableAttributes)
      }

      override fun searchableAttributes(vararg searchableAttributes: String): Unit =
          searchableAttributes(searchableAttributes.toList())

      override fun thingTypeDescription(thingTypeDescription: String) {
        cdkBuilder.thingTypeDescription(thingTypeDescription)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnThingType.ThingTypePropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iot.CfnThingType.ThingTypePropertiesProperty,
    ) : ThingTypePropertiesProperty {
      override fun searchableAttributes(): List<String> = unwrap(this).getSearchableAttributes() ?:
          emptyList()

      override fun thingTypeDescription(): String? = unwrap(this).getThingTypeDescription()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ThingTypePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnThingType.ThingTypePropertiesProperty):
          ThingTypePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ThingTypePropertiesProperty):
          software.amazon.awscdk.services.iot.CfnThingType.ThingTypePropertiesProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}

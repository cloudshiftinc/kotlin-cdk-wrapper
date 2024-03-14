package io.cloudshiftdev.awscdk.services.iot

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
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnThingGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iot.CfnThingGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun parentGroupName(): String? = unwrap(this).getParentGroupName()

  public open fun parentGroupName(`value`: String) {
    unwrap(this).setParentGroupName(`value`)
  }

  public open fun queryString(): String? = unwrap(this).getQueryString()

  public open fun queryString(`value`: String) {
    unwrap(this).setQueryString(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun thingGroupName(): String? = unwrap(this).getThingGroupName()

  public open fun thingGroupName(`value`: String) {
    unwrap(this).setThingGroupName(`value`)
  }

  public open fun thingGroupProperties(): Any? = unwrap(this).getThingGroupProperties()

  public open fun thingGroupProperties(`value`: IResolvable) {
    unwrap(this).setThingGroupProperties(`value`.let(IResolvable::unwrap))
  }

  public open fun thingGroupProperties(`value`: ThingGroupPropertiesProperty) {
    unwrap(this).setThingGroupProperties(`value`.let(ThingGroupPropertiesProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5e4f87fffceaf563a5bb83877db375d5d8d9a123e6da765c75f850c3974a19dd")
  public open fun thingGroupProperties(`value`: ThingGroupPropertiesProperty.Builder.() -> Unit):
      Unit = thingGroupProperties(ThingGroupPropertiesProperty(`value`))

  public interface Builder {
    public fun parentGroupName(parentGroupName: String) {
    }

    public fun queryString(queryString: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun thingGroupName(thingGroupName: String) {
    }

    public fun thingGroupProperties(thingGroupProperties: IResolvable) {
    }

    public fun thingGroupProperties(thingGroupProperties: ThingGroupPropertiesProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e32515e9f7939b92fbc09f334077a7c5cb6e042e9bed7abc63b3308772223433")
    public
        fun thingGroupProperties(thingGroupProperties: ThingGroupPropertiesProperty.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnThingGroup.Builder =
        software.amazon.awscdk.services.iot.CfnThingGroup.Builder.create(scope, id)

    public override fun parentGroupName(parentGroupName: String) {
      cdkBuilder.parentGroupName(parentGroupName)
    }

    public override fun queryString(queryString: String) {
      cdkBuilder.queryString(queryString)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun thingGroupName(thingGroupName: String) {
      cdkBuilder.thingGroupName(thingGroupName)
    }

    public override fun thingGroupProperties(thingGroupProperties: IResolvable) {
      cdkBuilder.thingGroupProperties(thingGroupProperties.let(IResolvable::unwrap))
    }

    public override fun thingGroupProperties(thingGroupProperties: ThingGroupPropertiesProperty) {
      cdkBuilder.thingGroupProperties(thingGroupProperties.let(ThingGroupPropertiesProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e32515e9f7939b92fbc09f334077a7c5cb6e042e9bed7abc63b3308772223433")
    public override
        fun thingGroupProperties(thingGroupProperties: ThingGroupPropertiesProperty.Builder.() -> Unit):
        Unit = thingGroupProperties(ThingGroupPropertiesProperty(thingGroupProperties))

    public fun build(): software.amazon.awscdk.services.iot.CfnThingGroup = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnThingGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnThingGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnThingGroup): CfnThingGroup =
        CfnThingGroup(cdkObject)

    internal fun unwrap(wrapped: CfnThingGroup): software.amazon.awscdk.services.iot.CfnThingGroup =
        wrapped.cdkObject
  }

  public interface AttributePayloadProperty {
    public fun attributes(): Any? = unwrap(this).getAttributes()

    public interface Builder {
      public fun attributes(attributes: IResolvable) {
      }

      public fun attributes(attributes: Map<String, String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnThingGroup.AttributePayloadProperty.Builder =
          software.amazon.awscdk.services.iot.CfnThingGroup.AttributePayloadProperty.builder()

      public override fun attributes(attributes: IResolvable) {
        cdkBuilder.attributes(attributes.let(IResolvable::unwrap))
      }

      public override fun attributes(attributes: Map<String, String>) {
        cdkBuilder.attributes(attributes)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnThingGroup.AttributePayloadProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iot.CfnThingGroup.AttributePayloadProperty,
    ) : AttributePayloadProperty {
      public override fun attributes(): Any? = unwrap(this).getAttributes()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AttributePayloadProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnThingGroup.AttributePayloadProperty):
          AttributePayloadProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AttributePayloadProperty):
          software.amazon.awscdk.services.iot.CfnThingGroup.AttributePayloadProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ThingGroupPropertiesProperty {
    public fun attributePayload(): Any? = unwrap(this).getAttributePayload()

    public fun thingGroupDescription(): String? = unwrap(this).getThingGroupDescription()

    public interface Builder {
      public fun attributePayload(attributePayload: IResolvable) {
      }

      public fun attributePayload(attributePayload: AttributePayloadProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4fd1cdfbf0332bdbd7edf5ca85729520fc70da7127260b89c3f1c470af0bac58")
      public fun attributePayload(attributePayload: AttributePayloadProperty.Builder.() -> Unit) {
      }

      public fun thingGroupDescription(thingGroupDescription: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnThingGroup.ThingGroupPropertiesProperty.Builder =
          software.amazon.awscdk.services.iot.CfnThingGroup.ThingGroupPropertiesProperty.builder()

      public override fun attributePayload(attributePayload: IResolvable) {
        cdkBuilder.attributePayload(attributePayload.let(IResolvable::unwrap))
      }

      public override fun attributePayload(attributePayload: AttributePayloadProperty) {
        cdkBuilder.attributePayload(attributePayload.let(AttributePayloadProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4fd1cdfbf0332bdbd7edf5ca85729520fc70da7127260b89c3f1c470af0bac58")
      public override
          fun attributePayload(attributePayload: AttributePayloadProperty.Builder.() -> Unit): Unit
          = attributePayload(AttributePayloadProperty(attributePayload))

      public override fun thingGroupDescription(thingGroupDescription: String) {
        cdkBuilder.thingGroupDescription(thingGroupDescription)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnThingGroup.ThingGroupPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iot.CfnThingGroup.ThingGroupPropertiesProperty,
    ) : ThingGroupPropertiesProperty {
      public override fun attributePayload(): Any? = unwrap(this).getAttributePayload()

      public override fun thingGroupDescription(): String? = unwrap(this).getThingGroupDescription()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ThingGroupPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnThingGroup.ThingGroupPropertiesProperty):
          ThingGroupPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ThingGroupPropertiesProperty):
          software.amazon.awscdk.services.iot.CfnThingGroup.ThingGroupPropertiesProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnThing internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iot.CfnThing,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attributePayload(): Any? = unwrap(this).getAttributePayload()

  public open fun attributePayload(`value`: IResolvable) {
    unwrap(this).setAttributePayload(`value`.let(IResolvable::unwrap))
  }

  public open fun attributePayload(`value`: AttributePayloadProperty) {
    unwrap(this).setAttributePayload(`value`.let(AttributePayloadProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("eae62ff6726904de9c0d99628001469c83d31f94baf15f761365ae616138a366")
  public open fun attributePayload(`value`: AttributePayloadProperty.Builder.() -> Unit): Unit =
      attributePayload(AttributePayloadProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun thingName(): String? = unwrap(this).getThingName()

  public open fun thingName(`value`: String) {
    unwrap(this).setThingName(`value`)
  }

  public interface Builder {
    public fun attributePayload(attributePayload: IResolvable)

    public fun attributePayload(attributePayload: AttributePayloadProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5aaa61e1661e96b9c29f7c3abde7336cb5bc324ecc60d4ceb73c8ea86316459c")
    public fun attributePayload(attributePayload: AttributePayloadProperty.Builder.() -> Unit)

    public fun thingName(thingName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnThing.Builder =
        software.amazon.awscdk.services.iot.CfnThing.Builder.create(scope, id)

    override fun attributePayload(attributePayload: IResolvable) {
      cdkBuilder.attributePayload(attributePayload.let(IResolvable::unwrap))
    }

    override fun attributePayload(attributePayload: AttributePayloadProperty) {
      cdkBuilder.attributePayload(attributePayload.let(AttributePayloadProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5aaa61e1661e96b9c29f7c3abde7336cb5bc324ecc60d4ceb73c8ea86316459c")
    override fun attributePayload(attributePayload: AttributePayloadProperty.Builder.() -> Unit):
        Unit = attributePayload(AttributePayloadProperty(attributePayload))

    override fun thingName(thingName: String) {
      cdkBuilder.thingName(thingName)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnThing = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnThing {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnThing(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnThing): CfnThing =
        CfnThing(cdkObject)

    internal fun unwrap(wrapped: CfnThing): software.amazon.awscdk.services.iot.CfnThing =
        wrapped.cdkObject
  }

  public interface AttributePayloadProperty {
    public fun attributes(): Any? = unwrap(this).getAttributes()

    public interface Builder {
      public fun attributes(attributes: IResolvable)

      public fun attributes(attributes: Map<String, String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnThing.AttributePayloadProperty.Builder =
          software.amazon.awscdk.services.iot.CfnThing.AttributePayloadProperty.builder()

      override fun attributes(attributes: IResolvable) {
        cdkBuilder.attributes(attributes.let(IResolvable::unwrap))
      }

      override fun attributes(attributes: Map<String, String>) {
        cdkBuilder.attributes(attributes)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnThing.AttributePayloadProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.iot.CfnThing.AttributePayloadProperty,
    ) : AttributePayloadProperty {
      override fun attributes(): Any? = unwrap(this).getAttributes()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AttributePayloadProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnThing.AttributePayloadProperty):
          AttributePayloadProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AttributePayloadProperty):
          software.amazon.awscdk.services.iot.CfnThing.AttributePayloadProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}

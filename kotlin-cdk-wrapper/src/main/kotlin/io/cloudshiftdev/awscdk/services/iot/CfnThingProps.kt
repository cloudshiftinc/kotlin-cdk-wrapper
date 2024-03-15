@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnThingProps {
  public fun attributePayload(): Any? = unwrap(this).getAttributePayload()

  public fun thingName(): String? = unwrap(this).getThingName()

  @CdkDslMarker
  public interface Builder {
    public fun attributePayload(attributePayload: IResolvable)

    public fun attributePayload(attributePayload: CfnThing.AttributePayloadProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ed08aee2458b41995a9e3dd81db5bf0fcfcc267802bdde4d9e1686e6bd7ff619")
    public
        fun attributePayload(attributePayload: CfnThing.AttributePayloadProperty.Builder.() -> Unit)

    public fun thingName(thingName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnThingProps.Builder =
        software.amazon.awscdk.services.iot.CfnThingProps.builder()

    override fun attributePayload(attributePayload: IResolvable) {
      cdkBuilder.attributePayload(attributePayload.let(IResolvable::unwrap))
    }

    override fun attributePayload(attributePayload: CfnThing.AttributePayloadProperty) {
      cdkBuilder.attributePayload(attributePayload.let(CfnThing.AttributePayloadProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ed08aee2458b41995a9e3dd81db5bf0fcfcc267802bdde4d9e1686e6bd7ff619")
    override
        fun attributePayload(attributePayload: CfnThing.AttributePayloadProperty.Builder.() -> Unit):
        Unit = attributePayload(CfnThing.AttributePayloadProperty(attributePayload))

    override fun thingName(thingName: String) {
      cdkBuilder.thingName(thingName)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnThingProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iot.CfnThingProps,
  ) : CdkObject(cdkObject), CfnThingProps {
    override fun attributePayload(): Any? = unwrap(this).getAttributePayload()

    override fun thingName(): String? = unwrap(this).getThingName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnThingProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnThingProps): CfnThingProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnThingProps): software.amazon.awscdk.services.iot.CfnThingProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.iot.CfnThingProps
  }
}

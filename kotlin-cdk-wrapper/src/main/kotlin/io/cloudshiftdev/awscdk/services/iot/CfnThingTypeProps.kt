@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnThingTypeProps {
  public fun deprecateThingType(): Any? = unwrap(this).getDeprecateThingType()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun thingTypeName(): String? = unwrap(this).getThingTypeName()

  public fun thingTypeProperties(): Any? = unwrap(this).getThingTypeProperties()

  @CdkDslMarker
  public interface Builder {
    public fun deprecateThingType(deprecateThingType: Boolean)

    public fun deprecateThingType(deprecateThingType: IResolvable)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun thingTypeName(thingTypeName: String)

    public fun thingTypeProperties(thingTypeProperties: IResolvable)

    public fun thingTypeProperties(thingTypeProperties: CfnThingType.ThingTypePropertiesProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("96150f95bb0eda1f7dc38218b6cf02c2b0a973ea8a4001907c7e72a7e500f940")
    public
        fun thingTypeProperties(thingTypeProperties: CfnThingType.ThingTypePropertiesProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnThingTypeProps.Builder =
        software.amazon.awscdk.services.iot.CfnThingTypeProps.builder()

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

    override
        fun thingTypeProperties(thingTypeProperties: CfnThingType.ThingTypePropertiesProperty) {
      cdkBuilder.thingTypeProperties(thingTypeProperties.let(CfnThingType.ThingTypePropertiesProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("96150f95bb0eda1f7dc38218b6cf02c2b0a973ea8a4001907c7e72a7e500f940")
    override
        fun thingTypeProperties(thingTypeProperties: CfnThingType.ThingTypePropertiesProperty.Builder.() -> Unit):
        Unit = thingTypeProperties(CfnThingType.ThingTypePropertiesProperty(thingTypeProperties))

    public fun build(): software.amazon.awscdk.services.iot.CfnThingTypeProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iot.CfnThingTypeProps,
  ) : CdkObject(cdkObject), CfnThingTypeProps {
    override fun deprecateThingType(): Any? = unwrap(this).getDeprecateThingType()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun thingTypeName(): String? = unwrap(this).getThingTypeName()

    override fun thingTypeProperties(): Any? = unwrap(this).getThingTypeProperties()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnThingTypeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnThingTypeProps):
        CfnThingTypeProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnThingTypeProps):
        software.amazon.awscdk.services.iot.CfnThingTypeProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.iot.CfnThingTypeProps
  }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnThingGroupProps {
  public fun parentGroupName(): String? = unwrap(this).getParentGroupName()

  public fun queryString(): String? = unwrap(this).getQueryString()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun thingGroupName(): String? = unwrap(this).getThingGroupName()

  public fun thingGroupProperties(): Any? = unwrap(this).getThingGroupProperties()

  @CdkDslMarker
  public interface Builder {
    public fun parentGroupName(parentGroupName: String)

    public fun queryString(queryString: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun thingGroupName(thingGroupName: String)

    public fun thingGroupProperties(thingGroupProperties: IResolvable)

    public
        fun thingGroupProperties(thingGroupProperties: CfnThingGroup.ThingGroupPropertiesProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d506a3d8a97afb1cd5d22aab923f73c77809e9406cd060c2a9ff4a4b79cfeadf")
    public
        fun thingGroupProperties(thingGroupProperties: CfnThingGroup.ThingGroupPropertiesProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnThingGroupProps.Builder =
        software.amazon.awscdk.services.iot.CfnThingGroupProps.builder()

    override fun parentGroupName(parentGroupName: String) {
      cdkBuilder.parentGroupName(parentGroupName)
    }

    override fun queryString(queryString: String) {
      cdkBuilder.queryString(queryString)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun thingGroupName(thingGroupName: String) {
      cdkBuilder.thingGroupName(thingGroupName)
    }

    override fun thingGroupProperties(thingGroupProperties: IResolvable) {
      cdkBuilder.thingGroupProperties(thingGroupProperties.let(IResolvable::unwrap))
    }

    override
        fun thingGroupProperties(thingGroupProperties: CfnThingGroup.ThingGroupPropertiesProperty) {
      cdkBuilder.thingGroupProperties(thingGroupProperties.let(CfnThingGroup.ThingGroupPropertiesProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d506a3d8a97afb1cd5d22aab923f73c77809e9406cd060c2a9ff4a4b79cfeadf")
    override
        fun thingGroupProperties(thingGroupProperties: CfnThingGroup.ThingGroupPropertiesProperty.Builder.() -> Unit):
        Unit =
        thingGroupProperties(CfnThingGroup.ThingGroupPropertiesProperty(thingGroupProperties))

    public fun build(): software.amazon.awscdk.services.iot.CfnThingGroupProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iot.CfnThingGroupProps,
  ) : CdkObject(cdkObject), CfnThingGroupProps {
    override fun parentGroupName(): String? = unwrap(this).getParentGroupName()

    override fun queryString(): String? = unwrap(this).getQueryString()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun thingGroupName(): String? = unwrap(this).getThingGroupName()

    override fun thingGroupProperties(): Any? = unwrap(this).getThingGroupProperties()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnThingGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnThingGroupProps):
        CfnThingGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnThingGroupProps):
        software.amazon.awscdk.services.iot.CfnThingGroupProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.iot.CfnThingGroupProps
  }
}

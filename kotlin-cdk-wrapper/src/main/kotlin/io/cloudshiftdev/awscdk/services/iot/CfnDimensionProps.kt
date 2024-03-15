@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnDimensionProps {
  public fun name(): String? = unwrap(this).getName()

  public fun stringValues(): List<String>

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun type(): String

  @CdkDslMarker
  public interface Builder {
    public fun name(name: String)

    public fun stringValues(stringValues: List<String>)

    public fun stringValues(vararg stringValues: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnDimensionProps.Builder =
        software.amazon.awscdk.services.iot.CfnDimensionProps.builder()

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun stringValues(stringValues: List<String>) {
      cdkBuilder.stringValues(stringValues)
    }

    override fun stringValues(vararg stringValues: String): Unit =
        stringValues(stringValues.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnDimensionProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iot.CfnDimensionProps,
  ) : CdkObject(cdkObject), CfnDimensionProps {
    override fun name(): String? = unwrap(this).getName()

    override fun stringValues(): List<String> = unwrap(this).getStringValues()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDimensionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnDimensionProps):
        CfnDimensionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDimensionProps):
        software.amazon.awscdk.services.iot.CfnDimensionProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.iot.CfnDimensionProps
  }
}

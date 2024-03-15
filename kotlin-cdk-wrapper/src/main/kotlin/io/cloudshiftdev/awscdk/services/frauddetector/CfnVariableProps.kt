@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.frauddetector

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnVariableProps {
  public fun dataSource(): String

  public fun dataType(): String

  public fun defaultValue(): String

  public fun description(): String? = unwrap(this).getDescription()

  public fun name(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun variableType(): String? = unwrap(this).getVariableType()

  @CdkDslMarker
  public interface Builder {
    public fun dataSource(dataSource: String)

    public fun dataType(dataType: String)

    public fun defaultValue(defaultValue: String)

    public fun description(description: String)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun variableType(variableType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.frauddetector.CfnVariableProps.Builder =
        software.amazon.awscdk.services.frauddetector.CfnVariableProps.builder()

    override fun dataSource(dataSource: String) {
      cdkBuilder.dataSource(dataSource)
    }

    override fun dataType(dataType: String) {
      cdkBuilder.dataType(dataType)
    }

    override fun defaultValue(defaultValue: String) {
      cdkBuilder.defaultValue(defaultValue)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun variableType(variableType: String) {
      cdkBuilder.variableType(variableType)
    }

    public fun build(): software.amazon.awscdk.services.frauddetector.CfnVariableProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.frauddetector.CfnVariableProps,
  ) : CdkObject(cdkObject), CfnVariableProps {
    override fun dataSource(): String = unwrap(this).getDataSource()

    override fun dataType(): String = unwrap(this).getDataType()

    override fun defaultValue(): String = unwrap(this).getDefaultValue()

    override fun description(): String? = unwrap(this).getDescription()

    override fun name(): String = unwrap(this).getName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun variableType(): String? = unwrap(this).getVariableType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVariableProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.frauddetector.CfnVariableProps):
        CfnVariableProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVariableProps):
        software.amazon.awscdk.services.frauddetector.CfnVariableProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.frauddetector.CfnVariableProps
  }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.frauddetector

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnListProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun elements(): List<String> = unwrap(this).getElements() ?: emptyList()

  public fun name(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun variableType(): String? = unwrap(this).getVariableType()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun elements(elements: List<String>)

    public fun elements(vararg elements: String)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun variableType(variableType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.frauddetector.CfnListProps.Builder =
        software.amazon.awscdk.services.frauddetector.CfnListProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun elements(elements: List<String>) {
      cdkBuilder.elements(elements)
    }

    override fun elements(vararg elements: String): Unit = elements(elements.toList())

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

    public fun build(): software.amazon.awscdk.services.frauddetector.CfnListProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.frauddetector.CfnListProps,
  ) : CdkObject(cdkObject), CfnListProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun elements(): List<String> = unwrap(this).getElements() ?: emptyList()

    override fun name(): String = unwrap(this).getName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun variableType(): String? = unwrap(this).getVariableType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnListProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.frauddetector.CfnListProps):
        CfnListProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnListProps):
        software.amazon.awscdk.services.frauddetector.CfnListProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.frauddetector.CfnListProps
  }
}

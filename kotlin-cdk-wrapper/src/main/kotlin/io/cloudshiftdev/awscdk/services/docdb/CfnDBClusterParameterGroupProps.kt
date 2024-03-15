@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.docdb

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnDBClusterParameterGroupProps {
  public fun description(): String

  public fun family(): String

  public fun name(): String? = unwrap(this).getName()

  public fun parameters(): Any

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun family(family: String)

    public fun name(name: String)

    public fun parameters(parameters: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroupProps.Builder =
        software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroupProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun family(family: String) {
      cdkBuilder.family(family)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun parameters(parameters: Any) {
      cdkBuilder.parameters(parameters)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroupProps,
  ) : CdkObject(cdkObject), CfnDBClusterParameterGroupProps {
    override fun description(): String = unwrap(this).getDescription()

    override fun family(): String = unwrap(this).getFamily()

    override fun name(): String? = unwrap(this).getName()

    override fun parameters(): Any = unwrap(this).getParameters()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDBClusterParameterGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroupProps):
        CfnDBClusterParameterGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDBClusterParameterGroupProps):
        software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroupProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroupProps
  }
}

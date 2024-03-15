@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.redshift

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnClusterParameterGroupProps {
  public fun description(): String

  public fun parameterGroupFamily(): String

  public fun parameterGroupName(): String? = unwrap(this).getParameterGroupName()

  public fun parameters(): Any? = unwrap(this).getParameters()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun parameterGroupFamily(parameterGroupFamily: String)

    public fun parameterGroupName(parameterGroupName: String)

    public fun parameters(parameters: IResolvable)

    public fun parameters(parameters: List<Any>)

    public fun parameters(vararg parameters: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.redshift.CfnClusterParameterGroupProps.Builder =
        software.amazon.awscdk.services.redshift.CfnClusterParameterGroupProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun parameterGroupFamily(parameterGroupFamily: String) {
      cdkBuilder.parameterGroupFamily(parameterGroupFamily)
    }

    override fun parameterGroupName(parameterGroupName: String) {
      cdkBuilder.parameterGroupName(parameterGroupName)
    }

    override fun parameters(parameters: IResolvable) {
      cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
    }

    override fun parameters(parameters: List<Any>) {
      cdkBuilder.parameters(parameters)
    }

    override fun parameters(vararg parameters: Any): Unit = parameters(parameters.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.redshift.CfnClusterParameterGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.redshift.CfnClusterParameterGroupProps,
  ) : CdkObject(cdkObject), CfnClusterParameterGroupProps {
    override fun description(): String = unwrap(this).getDescription()

    override fun parameterGroupFamily(): String = unwrap(this).getParameterGroupFamily()

    override fun parameterGroupName(): String? = unwrap(this).getParameterGroupName()

    override fun parameters(): Any? = unwrap(this).getParameters()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnClusterParameterGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.redshift.CfnClusterParameterGroupProps):
        CfnClusterParameterGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnClusterParameterGroupProps):
        software.amazon.awscdk.services.redshift.CfnClusterParameterGroupProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.redshift.CfnClusterParameterGroupProps
  }
}

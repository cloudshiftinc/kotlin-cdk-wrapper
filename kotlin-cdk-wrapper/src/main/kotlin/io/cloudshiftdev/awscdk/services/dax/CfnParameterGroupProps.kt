@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dax

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit

public interface CfnParameterGroupProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun parameterGroupName(): String? = unwrap(this).getParameterGroupName()

  public fun parameterNameValues(): Any? = unwrap(this).getParameterNameValues()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun parameterGroupName(parameterGroupName: String)

    public fun parameterNameValues(parameterNameValues: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dax.CfnParameterGroupProps.Builder =
        software.amazon.awscdk.services.dax.CfnParameterGroupProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun parameterGroupName(parameterGroupName: String) {
      cdkBuilder.parameterGroupName(parameterGroupName)
    }

    override fun parameterNameValues(parameterNameValues: Any) {
      cdkBuilder.parameterNameValues(parameterNameValues)
    }

    public fun build(): software.amazon.awscdk.services.dax.CfnParameterGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.dax.CfnParameterGroupProps,
  ) : CdkObject(cdkObject), CfnParameterGroupProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun parameterGroupName(): String? = unwrap(this).getParameterGroupName()

    override fun parameterNameValues(): Any? = unwrap(this).getParameterNameValues()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnParameterGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dax.CfnParameterGroupProps):
        CfnParameterGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnParameterGroupProps):
        software.amazon.awscdk.services.dax.CfnParameterGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.dax.CfnParameterGroupProps
  }
}

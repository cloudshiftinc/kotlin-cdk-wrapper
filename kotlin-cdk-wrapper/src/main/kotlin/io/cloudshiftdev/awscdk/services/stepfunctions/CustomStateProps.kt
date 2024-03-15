@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface CustomStateProps {
  public fun stateJson(): Map<String, Any>

  @CdkDslMarker
  public interface Builder {
    public fun stateJson(stateJson: Map<String, Any>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.CustomStateProps.Builder =
        software.amazon.awscdk.services.stepfunctions.CustomStateProps.builder()

    override fun stateJson(stateJson: Map<String, Any>) {
      cdkBuilder.stateJson(stateJson)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.CustomStateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.CustomStateProps,
  ) : CdkObject(cdkObject), CustomStateProps {
    override fun stateJson(): Map<String, Any> = unwrap(this).getStateJson() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CustomStateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.CustomStateProps):
        CustomStateProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CustomStateProps):
        software.amazon.awscdk.services.stepfunctions.CustomStateProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.CustomStateProps
  }
}

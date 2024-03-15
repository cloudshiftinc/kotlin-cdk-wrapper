@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit

public interface CfnAutoScalingScheduledAction {
  public fun ignoreUnmodifiedGroupSizeProperties(): Boolean? =
      unwrap(this).getIgnoreUnmodifiedGroupSizeProperties()

  @CdkDslMarker
  public interface Builder {
    public fun ignoreUnmodifiedGroupSizeProperties(ignoreUnmodifiedGroupSizeProperties: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnAutoScalingScheduledAction.Builder =
        software.amazon.awscdk.CfnAutoScalingScheduledAction.builder()

    override fun ignoreUnmodifiedGroupSizeProperties(ignoreUnmodifiedGroupSizeProperties: Boolean) {
      cdkBuilder.ignoreUnmodifiedGroupSizeProperties(ignoreUnmodifiedGroupSizeProperties)
    }

    public fun build(): software.amazon.awscdk.CfnAutoScalingScheduledAction = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CfnAutoScalingScheduledAction,
  ) : CdkObject(cdkObject), CfnAutoScalingScheduledAction {
    override fun ignoreUnmodifiedGroupSizeProperties(): Boolean? =
        unwrap(this).getIgnoreUnmodifiedGroupSizeProperties()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAutoScalingScheduledAction {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnAutoScalingScheduledAction):
        CfnAutoScalingScheduledAction = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAutoScalingScheduledAction):
        software.amazon.awscdk.CfnAutoScalingScheduledAction = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.CfnAutoScalingScheduledAction
  }
}

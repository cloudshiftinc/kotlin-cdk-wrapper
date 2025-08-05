@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

/**
 * CodePipeline invoke action that uses AWS InspectorScan.
 */
public abstract class InspectorScanActionBase(
  cdkObject: software.amazon.awscdk.services.codepipeline.actions.InspectorScanActionBase,
) : Action(cdkObject) {
  /**
   * The variables emitted by this action.
   */
  public open fun variables(): InspectorScanVariables =
      unwrap(this).getVariables().let(InspectorScanVariables::wrap)

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codepipeline.actions.InspectorScanActionBase,
  ) : InspectorScanActionBase(cdkObject)

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.InspectorScanActionBase):
        InspectorScanActionBase = CdkObjectWrappers.wrap(cdkObject) as? InspectorScanActionBase ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: InspectorScanActionBase):
        software.amazon.awscdk.services.codepipeline.actions.InspectorScanActionBase = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.InspectorScanActionBase
  }
}

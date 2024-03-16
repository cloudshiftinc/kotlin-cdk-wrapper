@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

/**
 * Low-level class for generic CodePipeline Actions.
 *
 * If you're implementing your own IAction,
 * prefer to use the Action class from the codepipeline module.
 */
public abstract class Action internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.codepipeline.actions.Action,
) : io.cloudshiftdev.awscdk.services.codepipeline.Action(cdkObject) {
  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.Action):
        Action = CdkObjectWrappers.wrap(cdkObject) as Action

    internal fun unwrap(wrapped: Action):
        software.amazon.awscdk.services.codepipeline.actions.Action = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codepipeline.actions.Action
  }
}

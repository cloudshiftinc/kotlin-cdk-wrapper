@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * The CodePipeline variables that are global, not bound to a specific action.
 *
 * This class defines a bunch of static fields that represent the different variables.
 * These can be used can be used in any action configuration.
 *
 * Example:
 *
 * ```
 * // OtherAction is some action type that produces variables, like EcrSourceAction
 * // OtherAction is some action type that produces variables, like EcrSourceAction
 * new OtherAction(new OtherActionProps()
 * // ...
 * .config(GlobalVariables.executionId)
 * .actionName("otherAction")
 * );
 * ```
 */
public open class GlobalVariables internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.codepipeline.GlobalVariables,
) : CdkObject(cdkObject) {
  public constructor() : this(software.amazon.awscdk.services.codepipeline.GlobalVariables()
  )

  public companion object {
    public val EXECUTION_ID: String =
        software.amazon.awscdk.services.codepipeline.GlobalVariables.EXECUTION_ID

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.GlobalVariables):
        GlobalVariables = GlobalVariables(cdkObject)

    internal fun unwrap(wrapped: GlobalVariables):
        software.amazon.awscdk.services.codepipeline.GlobalVariables = wrapped.cdkObject
  }
}

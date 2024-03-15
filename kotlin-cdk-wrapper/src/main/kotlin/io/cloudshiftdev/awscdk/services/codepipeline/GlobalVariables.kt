@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public open class GlobalVariables internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.codepipeline.GlobalVariables,
) : CdkObject(cdkObject) {
  public companion object {
    public val EXECUTION_ID: String =
        software.amazon.awscdk.services.codepipeline.GlobalVariables.EXECUTION_ID

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.GlobalVariables):
        GlobalVariables = GlobalVariables(cdkObject)

    internal fun unwrap(wrapped: GlobalVariables):
        software.amazon.awscdk.services.codepipeline.GlobalVariables = wrapped.cdkObject
  }
}

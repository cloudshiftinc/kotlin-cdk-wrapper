@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any

/**
 * A single dashboard variable.
 */
public interface IVariable {
  /**
   * Return the variable JSON for use in the dashboard.
   */
  public fun toJson(): Any

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.IVariable): IVariable =
        CdkObjectWrappers.wrap(cdkObject) as IVariable

    internal fun unwrap(wrapped: IVariable): software.amazon.awscdk.services.cloudwatch.IVariable =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.IVariable
  }
}

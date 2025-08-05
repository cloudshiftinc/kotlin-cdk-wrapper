@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String

/**
 * Number or percentage of max instances for EC2 deploy action.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codepipeline.actions.*;
 * Ec2MaxInstances ec2MaxInstances = Ec2MaxInstances.percentage(123);
 * ```
 */
public abstract class Ec2MaxInstances(
  cdkObject: software.amazon.awscdk.services.codepipeline.actions.Ec2MaxInstances,
) : CdkObject(cdkObject) {
  /**
   * Template value.
   */
  public open fun `value`(): String = unwrap(this).getValue()

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codepipeline.actions.Ec2MaxInstances,
  ) : Ec2MaxInstances(cdkObject)

  public companion object {
    public fun percentage(percentage: Number): Ec2MaxInstances =
        software.amazon.awscdk.services.codepipeline.actions.Ec2MaxInstances.percentage(percentage).let(Ec2MaxInstances::wrap)

    public fun targets(targets: Number): Ec2MaxInstances =
        software.amazon.awscdk.services.codepipeline.actions.Ec2MaxInstances.targets(targets).let(Ec2MaxInstances::wrap)

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.Ec2MaxInstances):
        Ec2MaxInstances = CdkObjectWrappers.wrap(cdkObject) as? Ec2MaxInstances ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Ec2MaxInstances):
        software.amazon.awscdk.services.codepipeline.actions.Ec2MaxInstances = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codepipeline.actions.Ec2MaxInstances
  }
}

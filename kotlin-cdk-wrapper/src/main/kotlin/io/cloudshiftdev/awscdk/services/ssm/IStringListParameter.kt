@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssm

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.collections.List

/**
 * A StringList SSM Parameter.
 */
public interface IStringListParameter : IParameter {
  /**
   * The parameter value.
   *
   * Value must not nest another parameter. Do not use {{}} in the value. Values in the array
   * cannot contain commas (`,`).
   */
  public fun stringListValue(): List<String>

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssm.IStringListParameter):
        IStringListParameter = CdkObjectWrappers.wrap(cdkObject) as IStringListParameter

    internal fun unwrap(wrapped: IStringListParameter):
        software.amazon.awscdk.services.ssm.IStringListParameter = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ssm.IStringListParameter
  }
}

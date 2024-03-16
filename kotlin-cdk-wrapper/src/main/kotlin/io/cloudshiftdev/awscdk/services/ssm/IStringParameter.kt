@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssm

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * A String SSM Parameter.
 */
public interface IStringParameter : IParameter {
  /**
   * The parameter value.
   *
   * Value must not nest another parameter. Do not use {{}} in the value.
   */
  public fun stringValue(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssm.IStringParameter):
        IStringParameter = CdkObjectWrappers.wrap(cdkObject) as IStringParameter

    internal fun unwrap(wrapped: IStringParameter):
        software.amazon.awscdk.services.ssm.IStringParameter = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ssm.IStringParameter
  }
}

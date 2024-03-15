@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any

public interface IVariable {
  public fun toJson(): Any

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.IVariable,
  ) : CdkObject(cdkObject), IVariable {
    override fun toJson(): Any = unwrap(this).toJson()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.IVariable): IVariable =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IVariable): software.amazon.awscdk.services.cloudwatch.IVariable =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.IVariable
  }
}

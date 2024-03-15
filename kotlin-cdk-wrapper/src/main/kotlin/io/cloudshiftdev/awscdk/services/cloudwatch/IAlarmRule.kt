@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public interface IAlarmRule {
  public fun renderAlarmRule(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.IAlarmRule,
  ) : CdkObject(cdkObject), IAlarmRule {
    override fun renderAlarmRule(): String = unwrap(this).renderAlarmRule()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.IAlarmRule): IAlarmRule
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IAlarmRule): software.amazon.awscdk.services.cloudwatch.IAlarmRule
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.IAlarmRule
  }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Interface for Alarm Rule.
 */
public interface IAlarmRule {
  /**
   * serialized representation of Alarm Rule to be used when building the Composite Alarm resource.
   */
  public fun renderAlarmRule(): String

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudwatch.IAlarmRule,
  ) : CdkObject(cdkObject), IAlarmRule {
    /**
     * serialized representation of Alarm Rule to be used when building the Composite Alarm
     * resource.
     */
    override fun renderAlarmRule(): String = unwrap(this).renderAlarmRule()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.IAlarmRule): IAlarmRule
        = CdkObjectWrappers.wrap(cdkObject) as? IAlarmRule ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IAlarmRule): software.amazon.awscdk.services.cloudwatch.IAlarmRule
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.IAlarmRule
  }
}

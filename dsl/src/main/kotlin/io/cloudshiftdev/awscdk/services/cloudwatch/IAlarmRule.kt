package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

public interface IAlarmRule {
  /**
   * serialized representation of Alarm Rule to be used when building the Composite Alarm resource.
   */
  public fun renderAlarmRule(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.IAlarmRule,
  ) : CdkObject(cdkObject), IAlarmRule {
    /**
     * serialized representation of Alarm Rule to be used when building the Composite Alarm
     * resource.
     */
    override fun renderAlarmRule(): String = unwrap(this).renderAlarmRule()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.IAlarmRule): IAlarmRule
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IAlarmRule): software.amazon.awscdk.services.cloudwatch.IAlarmRule
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.IAlarmRule
  }
}

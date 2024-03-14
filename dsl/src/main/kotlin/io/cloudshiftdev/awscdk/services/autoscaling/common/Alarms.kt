package io.cloudshiftdev.awscdk.services.autoscaling.common

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit

public interface Alarms {
  /**
   *
   */
  public fun lowerAlarmIntervalIndex(): Number? = unwrap(this).getLowerAlarmIntervalIndex()

  /**
   *
   */
  public fun upperAlarmIntervalIndex(): Number? = unwrap(this).getUpperAlarmIntervalIndex()

  /**
   * A builder for [Alarms]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param lowerAlarmIntervalIndex the value to be set.
     */
    public fun lowerAlarmIntervalIndex(lowerAlarmIntervalIndex: Number)

    /**
     * @param upperAlarmIntervalIndex the value to be set.
     */
    public fun upperAlarmIntervalIndex(upperAlarmIntervalIndex: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.autoscaling.common.Alarms.Builder =
        software.amazon.awscdk.services.autoscaling.common.Alarms.builder()

    /**
     * @param lowerAlarmIntervalIndex the value to be set.
     */
    override fun lowerAlarmIntervalIndex(lowerAlarmIntervalIndex: Number) {
      cdkBuilder.lowerAlarmIntervalIndex(lowerAlarmIntervalIndex)
    }

    /**
     * @param upperAlarmIntervalIndex the value to be set.
     */
    override fun upperAlarmIntervalIndex(upperAlarmIntervalIndex: Number) {
      cdkBuilder.upperAlarmIntervalIndex(upperAlarmIntervalIndex)
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.common.Alarms =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.autoscaling.common.Alarms,
  ) : CdkObject(cdkObject), Alarms {
    /**
     *
     */
    override fun lowerAlarmIntervalIndex(): Number? = unwrap(this).getLowerAlarmIntervalIndex()

    /**
     *
     */
    override fun upperAlarmIntervalIndex(): Number? = unwrap(this).getUpperAlarmIntervalIndex()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Alarms {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.common.Alarms): Alarms
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: Alarms): software.amazon.awscdk.services.autoscaling.common.Alarms
        = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.autoscaling.common.Alarms
  }
}

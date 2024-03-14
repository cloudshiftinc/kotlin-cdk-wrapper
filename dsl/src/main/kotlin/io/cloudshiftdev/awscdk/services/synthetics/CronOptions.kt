package io.cloudshiftdev.awscdk.services.synthetics

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface CronOptions {
  /**
   * The day of the month to run this rule at.
   *
   * Default: - Every day of the month
   */
  public fun day(): String? = unwrap(this).getDay()

  /**
   * The hour to run this rule at.
   *
   * Default: - Every hour
   */
  public fun hour(): String? = unwrap(this).getHour()

  /**
   * The minute to run this rule at.
   *
   * Default: - Every minute
   */
  public fun minute(): String? = unwrap(this).getMinute()

  /**
   * The month to run this rule at.
   *
   * Default: - Every month
   */
  public fun month(): String? = unwrap(this).getMonth()

  /**
   * The day of the week to run this rule at.
   *
   * Default: - Any day of the week
   */
  public fun weekDay(): String? = unwrap(this).getWeekDay()

  /**
   * A builder for [CronOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param day The day of the month to run this rule at.
     */
    public fun day(day: String)

    /**
     * @param hour The hour to run this rule at.
     */
    public fun hour(hour: String)

    /**
     * @param minute The minute to run this rule at.
     */
    public fun minute(minute: String)

    /**
     * @param month The month to run this rule at.
     */
    public fun month(month: String)

    /**
     * @param weekDay The day of the week to run this rule at.
     */
    public fun weekDay(weekDay: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.synthetics.CronOptions.Builder =
        software.amazon.awscdk.services.synthetics.CronOptions.builder()

    /**
     * @param day The day of the month to run this rule at.
     */
    override fun day(day: String) {
      cdkBuilder.day(day)
    }

    /**
     * @param hour The hour to run this rule at.
     */
    override fun hour(hour: String) {
      cdkBuilder.hour(hour)
    }

    /**
     * @param minute The minute to run this rule at.
     */
    override fun minute(minute: String) {
      cdkBuilder.minute(minute)
    }

    /**
     * @param month The month to run this rule at.
     */
    override fun month(month: String) {
      cdkBuilder.month(month)
    }

    /**
     * @param weekDay The day of the week to run this rule at.
     */
    override fun weekDay(weekDay: String) {
      cdkBuilder.weekDay(weekDay)
    }

    public fun build(): software.amazon.awscdk.services.synthetics.CronOptions = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.synthetics.CronOptions,
  ) : CronOptions {
    /**
     * The day of the month to run this rule at.
     *
     * Default: - Every day of the month
     */
    override fun day(): String? = unwrap(this).getDay()

    /**
     * The hour to run this rule at.
     *
     * Default: - Every hour
     */
    override fun hour(): String? = unwrap(this).getHour()

    /**
     * The minute to run this rule at.
     *
     * Default: - Every minute
     */
    override fun minute(): String? = unwrap(this).getMinute()

    /**
     * The month to run this rule at.
     *
     * Default: - Every month
     */
    override fun month(): String? = unwrap(this).getMonth()

    /**
     * The day of the week to run this rule at.
     *
     * Default: - Any day of the week
     */
    override fun weekDay(): String? = unwrap(this).getWeekDay()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): CronOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.synthetics.CronOptions):
        CronOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CronOptions):
        software.amazon.awscdk.services.synthetics.CronOptions = (wrapped as Wrapper).cdkObject
  }
}

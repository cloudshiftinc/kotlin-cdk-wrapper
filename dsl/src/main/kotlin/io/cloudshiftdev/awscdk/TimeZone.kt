package io.cloudshiftdev.awscdk

import kotlin.String

public open class TimeZone internal constructor(
  private val cdkObject: software.amazon.awscdk.TimeZone,
) {
  /**
   * The name of the timezone.
   */
  public open fun timezoneName(): String = unwrap(this).getTimezoneName()

  public companion object {
    public fun of(timezoneName: String): TimeZone =
        software.amazon.awscdk.TimeZone.of(timezoneName).let(TimeZone::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.TimeZone): TimeZone = TimeZone(cdkObject)

    internal fun unwrap(wrapped: TimeZone): software.amazon.awscdk.TimeZone = wrapped.cdkObject
  }
}

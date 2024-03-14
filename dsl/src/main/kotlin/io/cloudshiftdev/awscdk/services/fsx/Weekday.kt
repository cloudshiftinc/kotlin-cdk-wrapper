package io.cloudshiftdev.awscdk.services.fsx

public enum class Weekday(
  private val cdkObject: software.amazon.awscdk.services.fsx.Weekday,
) {
  MONDAY(software.amazon.awscdk.services.fsx.Weekday.MONDAY),
  TUESDAY(software.amazon.awscdk.services.fsx.Weekday.TUESDAY),
  WEDNESDAY(software.amazon.awscdk.services.fsx.Weekday.WEDNESDAY),
  THURSDAY(software.amazon.awscdk.services.fsx.Weekday.THURSDAY),
  FRIDAY(software.amazon.awscdk.services.fsx.Weekday.FRIDAY),
  SATURDAY(software.amazon.awscdk.services.fsx.Weekday.SATURDAY),
  SUNDAY(software.amazon.awscdk.services.fsx.Weekday.SUNDAY),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.fsx.Weekday): Weekday = when
        (cdkObject) {
      software.amazon.awscdk.services.fsx.Weekday.MONDAY -> Weekday.MONDAY
      software.amazon.awscdk.services.fsx.Weekday.TUESDAY -> Weekday.TUESDAY
      software.amazon.awscdk.services.fsx.Weekday.WEDNESDAY -> Weekday.WEDNESDAY
      software.amazon.awscdk.services.fsx.Weekday.THURSDAY -> Weekday.THURSDAY
      software.amazon.awscdk.services.fsx.Weekday.FRIDAY -> Weekday.FRIDAY
      software.amazon.awscdk.services.fsx.Weekday.SATURDAY -> Weekday.SATURDAY
      software.amazon.awscdk.services.fsx.Weekday.SUNDAY -> Weekday.SUNDAY
    }

    internal fun unwrap(wrapped: Weekday): software.amazon.awscdk.services.fsx.Weekday =
        wrapped.cdkObject
  }
}

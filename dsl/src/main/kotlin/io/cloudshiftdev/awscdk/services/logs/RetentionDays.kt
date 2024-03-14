package io.cloudshiftdev.awscdk.services.logs

public enum class RetentionDays(
  private val cdkObject: software.amazon.awscdk.services.logs.RetentionDays,
) {
  ONE_DAY(software.amazon.awscdk.services.logs.RetentionDays.ONE_DAY),
  THREE_DAYS(software.amazon.awscdk.services.logs.RetentionDays.THREE_DAYS),
  FIVE_DAYS(software.amazon.awscdk.services.logs.RetentionDays.FIVE_DAYS),
  ONE_WEEK(software.amazon.awscdk.services.logs.RetentionDays.ONE_WEEK),
  TWO_WEEKS(software.amazon.awscdk.services.logs.RetentionDays.TWO_WEEKS),
  ONE_MONTH(software.amazon.awscdk.services.logs.RetentionDays.ONE_MONTH),
  TWO_MONTHS(software.amazon.awscdk.services.logs.RetentionDays.TWO_MONTHS),
  THREE_MONTHS(software.amazon.awscdk.services.logs.RetentionDays.THREE_MONTHS),
  FOUR_MONTHS(software.amazon.awscdk.services.logs.RetentionDays.FOUR_MONTHS),
  FIVE_MONTHS(software.amazon.awscdk.services.logs.RetentionDays.FIVE_MONTHS),
  SIX_MONTHS(software.amazon.awscdk.services.logs.RetentionDays.SIX_MONTHS),
  ONE_YEAR(software.amazon.awscdk.services.logs.RetentionDays.ONE_YEAR),
  THIRTEEN_MONTHS(software.amazon.awscdk.services.logs.RetentionDays.THIRTEEN_MONTHS),
  EIGHTEEN_MONTHS(software.amazon.awscdk.services.logs.RetentionDays.EIGHTEEN_MONTHS),
  TWO_YEARS(software.amazon.awscdk.services.logs.RetentionDays.TWO_YEARS),
  THREE_YEARS(software.amazon.awscdk.services.logs.RetentionDays.THREE_YEARS),
  FIVE_YEARS(software.amazon.awscdk.services.logs.RetentionDays.FIVE_YEARS),
  SIX_YEARS(software.amazon.awscdk.services.logs.RetentionDays.SIX_YEARS),
  SEVEN_YEARS(software.amazon.awscdk.services.logs.RetentionDays.SEVEN_YEARS),
  EIGHT_YEARS(software.amazon.awscdk.services.logs.RetentionDays.EIGHT_YEARS),
  NINE_YEARS(software.amazon.awscdk.services.logs.RetentionDays.NINE_YEARS),
  TEN_YEARS(software.amazon.awscdk.services.logs.RetentionDays.TEN_YEARS),
  INFINITE(software.amazon.awscdk.services.logs.RetentionDays.INFINITE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.RetentionDays): RetentionDays
        = when (cdkObject) {
      software.amazon.awscdk.services.logs.RetentionDays.ONE_DAY -> RetentionDays.ONE_DAY
      software.amazon.awscdk.services.logs.RetentionDays.THREE_DAYS -> RetentionDays.THREE_DAYS
      software.amazon.awscdk.services.logs.RetentionDays.FIVE_DAYS -> RetentionDays.FIVE_DAYS
      software.amazon.awscdk.services.logs.RetentionDays.ONE_WEEK -> RetentionDays.ONE_WEEK
      software.amazon.awscdk.services.logs.RetentionDays.TWO_WEEKS -> RetentionDays.TWO_WEEKS
      software.amazon.awscdk.services.logs.RetentionDays.ONE_MONTH -> RetentionDays.ONE_MONTH
      software.amazon.awscdk.services.logs.RetentionDays.TWO_MONTHS -> RetentionDays.TWO_MONTHS
      software.amazon.awscdk.services.logs.RetentionDays.THREE_MONTHS -> RetentionDays.THREE_MONTHS
      software.amazon.awscdk.services.logs.RetentionDays.FOUR_MONTHS -> RetentionDays.FOUR_MONTHS
      software.amazon.awscdk.services.logs.RetentionDays.FIVE_MONTHS -> RetentionDays.FIVE_MONTHS
      software.amazon.awscdk.services.logs.RetentionDays.SIX_MONTHS -> RetentionDays.SIX_MONTHS
      software.amazon.awscdk.services.logs.RetentionDays.ONE_YEAR -> RetentionDays.ONE_YEAR
      software.amazon.awscdk.services.logs.RetentionDays.THIRTEEN_MONTHS ->
          RetentionDays.THIRTEEN_MONTHS
      software.amazon.awscdk.services.logs.RetentionDays.EIGHTEEN_MONTHS ->
          RetentionDays.EIGHTEEN_MONTHS
      software.amazon.awscdk.services.logs.RetentionDays.TWO_YEARS -> RetentionDays.TWO_YEARS
      software.amazon.awscdk.services.logs.RetentionDays.THREE_YEARS -> RetentionDays.THREE_YEARS
      software.amazon.awscdk.services.logs.RetentionDays.FIVE_YEARS -> RetentionDays.FIVE_YEARS
      software.amazon.awscdk.services.logs.RetentionDays.SIX_YEARS -> RetentionDays.SIX_YEARS
      software.amazon.awscdk.services.logs.RetentionDays.SEVEN_YEARS -> RetentionDays.SEVEN_YEARS
      software.amazon.awscdk.services.logs.RetentionDays.EIGHT_YEARS -> RetentionDays.EIGHT_YEARS
      software.amazon.awscdk.services.logs.RetentionDays.NINE_YEARS -> RetentionDays.NINE_YEARS
      software.amazon.awscdk.services.logs.RetentionDays.TEN_YEARS -> RetentionDays.TEN_YEARS
      software.amazon.awscdk.services.logs.RetentionDays.INFINITE -> RetentionDays.INFINITE
    }

    internal fun unwrap(wrapped: RetentionDays): software.amazon.awscdk.services.logs.RetentionDays
        = wrapped.cdkObject
  }
}

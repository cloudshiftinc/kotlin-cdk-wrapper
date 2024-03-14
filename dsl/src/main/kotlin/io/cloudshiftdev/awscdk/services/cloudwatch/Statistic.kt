package io.cloudshiftdev.awscdk.services.cloudwatch

public enum class Statistic(
  private val cdkObject: software.amazon.awscdk.services.cloudwatch.Statistic,
) {
  SAMPLE_COUNT(software.amazon.awscdk.services.cloudwatch.Statistic.SAMPLE_COUNT),
  AVERAGE(software.amazon.awscdk.services.cloudwatch.Statistic.AVERAGE),
  SUM(software.amazon.awscdk.services.cloudwatch.Statistic.SUM),
  MINIMUM(software.amazon.awscdk.services.cloudwatch.Statistic.MINIMUM),
  MAXIMUM(software.amazon.awscdk.services.cloudwatch.Statistic.MAXIMUM),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.Statistic): Statistic =
        when (cdkObject) {
      software.amazon.awscdk.services.cloudwatch.Statistic.SAMPLE_COUNT -> Statistic.SAMPLE_COUNT
      software.amazon.awscdk.services.cloudwatch.Statistic.AVERAGE -> Statistic.AVERAGE
      software.amazon.awscdk.services.cloudwatch.Statistic.SUM -> Statistic.SUM
      software.amazon.awscdk.services.cloudwatch.Statistic.MINIMUM -> Statistic.MINIMUM
      software.amazon.awscdk.services.cloudwatch.Statistic.MAXIMUM -> Statistic.MAXIMUM
    }

    internal fun unwrap(wrapped: Statistic): software.amazon.awscdk.services.cloudwatch.Statistic =
        wrapped.cdkObject
  }
}

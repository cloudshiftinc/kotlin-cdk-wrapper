package io.cloudshiftdev.awscdk.services.cloudwatch

public enum class AlarmStatusWidgetSortBy(
  private val cdkObject: software.amazon.awscdk.services.cloudwatch.AlarmStatusWidgetSortBy,
) {
  DEFAULT(software.amazon.awscdk.services.cloudwatch.AlarmStatusWidgetSortBy.DEFAULT),
  STATE_UPDATED_TIMESTAMP(software.amazon.awscdk.services.cloudwatch.AlarmStatusWidgetSortBy.STATE_UPDATED_TIMESTAMP),
  TIMESTAMP(software.amazon.awscdk.services.cloudwatch.AlarmStatusWidgetSortBy.TIMESTAMP),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.AlarmStatusWidgetSortBy):
        AlarmStatusWidgetSortBy = when (cdkObject) {
      software.amazon.awscdk.services.cloudwatch.AlarmStatusWidgetSortBy.DEFAULT ->
          AlarmStatusWidgetSortBy.DEFAULT
      software.amazon.awscdk.services.cloudwatch.AlarmStatusWidgetSortBy.STATE_UPDATED_TIMESTAMP ->
          AlarmStatusWidgetSortBy.STATE_UPDATED_TIMESTAMP
      software.amazon.awscdk.services.cloudwatch.AlarmStatusWidgetSortBy.TIMESTAMP ->
          AlarmStatusWidgetSortBy.TIMESTAMP
    }

    internal fun unwrap(wrapped: AlarmStatusWidgetSortBy):
        software.amazon.awscdk.services.cloudwatch.AlarmStatusWidgetSortBy = wrapped.cdkObject
  }
}

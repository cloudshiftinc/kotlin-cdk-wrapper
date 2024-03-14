package io.cloudshiftdev.awscdk.services.cloudwatch

public enum class GraphWidgetView(
  private val cdkObject: software.amazon.awscdk.services.cloudwatch.GraphWidgetView,
) {
  TIME_SERIES(software.amazon.awscdk.services.cloudwatch.GraphWidgetView.TIME_SERIES),
  BAR(software.amazon.awscdk.services.cloudwatch.GraphWidgetView.BAR),
  PIE(software.amazon.awscdk.services.cloudwatch.GraphWidgetView.PIE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.GraphWidgetView):
        GraphWidgetView = when (cdkObject) {
      software.amazon.awscdk.services.cloudwatch.GraphWidgetView.TIME_SERIES ->
          GraphWidgetView.TIME_SERIES
      software.amazon.awscdk.services.cloudwatch.GraphWidgetView.BAR -> GraphWidgetView.BAR
      software.amazon.awscdk.services.cloudwatch.GraphWidgetView.PIE -> GraphWidgetView.PIE
    }

    internal fun unwrap(wrapped: GraphWidgetView):
        software.amazon.awscdk.services.cloudwatch.GraphWidgetView = wrapped.cdkObject
  }
}

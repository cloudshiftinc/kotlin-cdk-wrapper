package io.cloudshiftdev.awscdk.services.cloudwatch

public enum class TableSummaryColumn(
  private val cdkObject: software.amazon.awscdk.services.cloudwatch.TableSummaryColumn,
) {
  MINIMUM(software.amazon.awscdk.services.cloudwatch.TableSummaryColumn.MINIMUM),
  MAXIMUM(software.amazon.awscdk.services.cloudwatch.TableSummaryColumn.MAXIMUM),
  SUM(software.amazon.awscdk.services.cloudwatch.TableSummaryColumn.SUM),
  AVERAGE(software.amazon.awscdk.services.cloudwatch.TableSummaryColumn.AVERAGE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.TableSummaryColumn):
        TableSummaryColumn = when (cdkObject) {
      software.amazon.awscdk.services.cloudwatch.TableSummaryColumn.MINIMUM ->
          TableSummaryColumn.MINIMUM
      software.amazon.awscdk.services.cloudwatch.TableSummaryColumn.MAXIMUM ->
          TableSummaryColumn.MAXIMUM
      software.amazon.awscdk.services.cloudwatch.TableSummaryColumn.SUM -> TableSummaryColumn.SUM
      software.amazon.awscdk.services.cloudwatch.TableSummaryColumn.AVERAGE ->
          TableSummaryColumn.AVERAGE
    }

    internal fun unwrap(wrapped: TableSummaryColumn):
        software.amazon.awscdk.services.cloudwatch.TableSummaryColumn = wrapped.cdkObject
  }
}

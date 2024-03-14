package io.cloudshiftdev.awscdk.services.stepfunctions

public enum class CsvHeaderLocation(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.CsvHeaderLocation,
) {
  FIRST_ROW(software.amazon.awscdk.services.stepfunctions.CsvHeaderLocation.FIRST_ROW),
  GIVEN(software.amazon.awscdk.services.stepfunctions.CsvHeaderLocation.GIVEN),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.CsvHeaderLocation):
        CsvHeaderLocation = when (cdkObject) {
      software.amazon.awscdk.services.stepfunctions.CsvHeaderLocation.FIRST_ROW ->
          CsvHeaderLocation.FIRST_ROW
      software.amazon.awscdk.services.stepfunctions.CsvHeaderLocation.GIVEN ->
          CsvHeaderLocation.GIVEN
    }

    internal fun unwrap(wrapped: CsvHeaderLocation):
        software.amazon.awscdk.services.stepfunctions.CsvHeaderLocation = wrapped.cdkObject
  }
}

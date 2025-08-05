@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

public enum class CsvDelimiter(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.CsvDelimiter,
) {
  COMMA(software.amazon.awscdk.services.stepfunctions.CsvDelimiter.COMMA),
  PIPE(software.amazon.awscdk.services.stepfunctions.CsvDelimiter.PIPE),
  SEMICOLON(software.amazon.awscdk.services.stepfunctions.CsvDelimiter.SEMICOLON),
  SPACE(software.amazon.awscdk.services.stepfunctions.CsvDelimiter.SPACE),
  TAB(software.amazon.awscdk.services.stepfunctions.CsvDelimiter.TAB),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.CsvDelimiter):
        CsvDelimiter = when (cdkObject) {
      software.amazon.awscdk.services.stepfunctions.CsvDelimiter.COMMA -> CsvDelimiter.COMMA
      software.amazon.awscdk.services.stepfunctions.CsvDelimiter.PIPE -> CsvDelimiter.PIPE
      software.amazon.awscdk.services.stepfunctions.CsvDelimiter.SEMICOLON -> CsvDelimiter.SEMICOLON
      software.amazon.awscdk.services.stepfunctions.CsvDelimiter.SPACE -> CsvDelimiter.SPACE
      software.amazon.awscdk.services.stepfunctions.CsvDelimiter.TAB -> CsvDelimiter.TAB
    }

    internal fun unwrap(wrapped: CsvDelimiter):
        software.amazon.awscdk.services.stepfunctions.CsvDelimiter = wrapped.cdkObject
  }
}

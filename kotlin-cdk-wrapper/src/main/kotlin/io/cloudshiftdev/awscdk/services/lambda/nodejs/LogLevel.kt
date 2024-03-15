@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda.nodejs

public enum class LogLevel(
  private val cdkObject: software.amazon.awscdk.services.lambda.nodejs.LogLevel,
) {
  VERBOSE(software.amazon.awscdk.services.lambda.nodejs.LogLevel.VERBOSE),
  DEBUG(software.amazon.awscdk.services.lambda.nodejs.LogLevel.DEBUG),
  INFO(software.amazon.awscdk.services.lambda.nodejs.LogLevel.INFO),
  WARNING(software.amazon.awscdk.services.lambda.nodejs.LogLevel.WARNING),
  ERROR(software.amazon.awscdk.services.lambda.nodejs.LogLevel.ERROR),
  SILENT(software.amazon.awscdk.services.lambda.nodejs.LogLevel.SILENT),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.nodejs.LogLevel): LogLevel =
        when (cdkObject) {
      software.amazon.awscdk.services.lambda.nodejs.LogLevel.VERBOSE -> LogLevel.VERBOSE
      software.amazon.awscdk.services.lambda.nodejs.LogLevel.DEBUG -> LogLevel.DEBUG
      software.amazon.awscdk.services.lambda.nodejs.LogLevel.INFO -> LogLevel.INFO
      software.amazon.awscdk.services.lambda.nodejs.LogLevel.WARNING -> LogLevel.WARNING
      software.amazon.awscdk.services.lambda.nodejs.LogLevel.ERROR -> LogLevel.ERROR
      software.amazon.awscdk.services.lambda.nodejs.LogLevel.SILENT -> LogLevel.SILENT
    }

    internal fun unwrap(wrapped: LogLevel): software.amazon.awscdk.services.lambda.nodejs.LogLevel =
        wrapped.cdkObject
  }
}

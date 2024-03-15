@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

public enum class LogLevel(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.LogLevel,
) {
  OFF(software.amazon.awscdk.services.stepfunctions.LogLevel.OFF),
  ALL(software.amazon.awscdk.services.stepfunctions.LogLevel.ALL),
  ERROR(software.amazon.awscdk.services.stepfunctions.LogLevel.ERROR),
  FATAL(software.amazon.awscdk.services.stepfunctions.LogLevel.FATAL),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.LogLevel): LogLevel =
        when (cdkObject) {
      software.amazon.awscdk.services.stepfunctions.LogLevel.OFF -> LogLevel.OFF
      software.amazon.awscdk.services.stepfunctions.LogLevel.ALL -> LogLevel.ALL
      software.amazon.awscdk.services.stepfunctions.LogLevel.ERROR -> LogLevel.ERROR
      software.amazon.awscdk.services.stepfunctions.LogLevel.FATAL -> LogLevel.FATAL
    }

    internal fun unwrap(wrapped: LogLevel): software.amazon.awscdk.services.stepfunctions.LogLevel =
        wrapped.cdkObject
  }
}

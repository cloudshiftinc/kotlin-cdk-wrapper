@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

public enum class LogQueryLanguage(
  private val cdkObject: software.amazon.awscdk.services.cloudwatch.LogQueryLanguage,
) {
  LOGS_INSIGHTS(software.amazon.awscdk.services.cloudwatch.LogQueryLanguage.LOGS_INSIGHTS),
  SQL(software.amazon.awscdk.services.cloudwatch.LogQueryLanguage.SQL),
  PPL(software.amazon.awscdk.services.cloudwatch.LogQueryLanguage.PPL),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.LogQueryLanguage):
        LogQueryLanguage = when (cdkObject) {
      software.amazon.awscdk.services.cloudwatch.LogQueryLanguage.LOGS_INSIGHTS ->
          LogQueryLanguage.LOGS_INSIGHTS
      software.amazon.awscdk.services.cloudwatch.LogQueryLanguage.SQL -> LogQueryLanguage.SQL
      software.amazon.awscdk.services.cloudwatch.LogQueryLanguage.PPL -> LogQueryLanguage.PPL
    }

    internal fun unwrap(wrapped: LogQueryLanguage):
        software.amazon.awscdk.services.cloudwatch.LogQueryLanguage = wrapped.cdkObject
  }
}

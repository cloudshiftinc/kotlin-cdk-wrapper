@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

public enum class QueryLanguage(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.QueryLanguage,
) {
  JSON_PATH(software.amazon.awscdk.services.stepfunctions.QueryLanguage.JSON_PATH),
  JSONATA(software.amazon.awscdk.services.stepfunctions.QueryLanguage.JSONATA),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.QueryLanguage):
        QueryLanguage = when (cdkObject) {
      software.amazon.awscdk.services.stepfunctions.QueryLanguage.JSON_PATH ->
          QueryLanguage.JSON_PATH
      software.amazon.awscdk.services.stepfunctions.QueryLanguage.JSONATA -> QueryLanguage.JSONATA
    }

    internal fun unwrap(wrapped: QueryLanguage):
        software.amazon.awscdk.services.stepfunctions.QueryLanguage = wrapped.cdkObject
  }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

public enum class RestApiMode(
  private val cdkObject: software.amazon.awscdk.services.apigateway.RestApiMode,
) {
  OVERWRITE(software.amazon.awscdk.services.apigateway.RestApiMode.OVERWRITE),
  MERGE(software.amazon.awscdk.services.apigateway.RestApiMode.MERGE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.RestApiMode):
        RestApiMode = when (cdkObject) {
      software.amazon.awscdk.services.apigateway.RestApiMode.OVERWRITE -> RestApiMode.OVERWRITE
      software.amazon.awscdk.services.apigateway.RestApiMode.MERGE -> RestApiMode.MERGE
    }

    internal fun unwrap(wrapped: RestApiMode):
        software.amazon.awscdk.services.apigateway.RestApiMode = wrapped.cdkObject
  }
}

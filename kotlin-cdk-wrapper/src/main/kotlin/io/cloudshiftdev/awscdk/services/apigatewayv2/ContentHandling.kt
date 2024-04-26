@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

public enum class ContentHandling(
  private val cdkObject: software.amazon.awscdk.services.apigatewayv2.ContentHandling,
) {
  CONVERT_TO_BINARY(software.amazon.awscdk.services.apigatewayv2.ContentHandling.CONVERT_TO_BINARY),
  CONVERT_TO_TEXT(software.amazon.awscdk.services.apigatewayv2.ContentHandling.CONVERT_TO_TEXT),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.ContentHandling):
        ContentHandling = when (cdkObject) {
      software.amazon.awscdk.services.apigatewayv2.ContentHandling.CONVERT_TO_BINARY ->
          ContentHandling.CONVERT_TO_BINARY
      software.amazon.awscdk.services.apigatewayv2.ContentHandling.CONVERT_TO_TEXT ->
          ContentHandling.CONVERT_TO_TEXT
    }

    internal fun unwrap(wrapped: ContentHandling):
        software.amazon.awscdk.services.apigatewayv2.ContentHandling = wrapped.cdkObject
  }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

public enum class FunctionEventType(
  private val cdkObject: software.amazon.awscdk.services.cloudfront.FunctionEventType,
) {
  VIEWER_REQUEST(software.amazon.awscdk.services.cloudfront.FunctionEventType.VIEWER_REQUEST),
  VIEWER_RESPONSE(software.amazon.awscdk.services.cloudfront.FunctionEventType.VIEWER_RESPONSE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.FunctionEventType):
        FunctionEventType = when (cdkObject) {
      software.amazon.awscdk.services.cloudfront.FunctionEventType.VIEWER_REQUEST ->
          FunctionEventType.VIEWER_REQUEST
      software.amazon.awscdk.services.cloudfront.FunctionEventType.VIEWER_RESPONSE ->
          FunctionEventType.VIEWER_RESPONSE
    }

    internal fun unwrap(wrapped: FunctionEventType):
        software.amazon.awscdk.services.cloudfront.FunctionEventType = wrapped.cdkObject
  }
}

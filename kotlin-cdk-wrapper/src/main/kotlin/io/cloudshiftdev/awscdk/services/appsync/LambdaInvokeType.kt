@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

public enum class LambdaInvokeType(
  private val cdkObject: software.amazon.awscdk.services.appsync.LambdaInvokeType,
) {
  EVENT(software.amazon.awscdk.services.appsync.LambdaInvokeType.EVENT),
  REQUEST_RESPONSE(software.amazon.awscdk.services.appsync.LambdaInvokeType.REQUEST_RESPONSE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.LambdaInvokeType):
        LambdaInvokeType = when (cdkObject) {
      software.amazon.awscdk.services.appsync.LambdaInvokeType.EVENT -> LambdaInvokeType.EVENT
      software.amazon.awscdk.services.appsync.LambdaInvokeType.REQUEST_RESPONSE ->
          LambdaInvokeType.REQUEST_RESPONSE
    }

    internal fun unwrap(wrapped: LambdaInvokeType):
        software.amazon.awscdk.services.appsync.LambdaInvokeType = wrapped.cdkObject
  }
}

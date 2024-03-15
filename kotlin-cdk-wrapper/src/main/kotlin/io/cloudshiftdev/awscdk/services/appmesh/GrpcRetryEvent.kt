@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

public enum class GrpcRetryEvent(
  private val cdkObject: software.amazon.awscdk.services.appmesh.GrpcRetryEvent,
) {
  CANCELLED(software.amazon.awscdk.services.appmesh.GrpcRetryEvent.CANCELLED),
  DEADLINE_EXCEEDED(software.amazon.awscdk.services.appmesh.GrpcRetryEvent.DEADLINE_EXCEEDED),
  INTERNAL_ERROR(software.amazon.awscdk.services.appmesh.GrpcRetryEvent.INTERNAL_ERROR),
  RESOURCE_EXHAUSTED(software.amazon.awscdk.services.appmesh.GrpcRetryEvent.RESOURCE_EXHAUSTED),
  UNAVAILABLE(software.amazon.awscdk.services.appmesh.GrpcRetryEvent.UNAVAILABLE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.GrpcRetryEvent):
        GrpcRetryEvent = when (cdkObject) {
      software.amazon.awscdk.services.appmesh.GrpcRetryEvent.CANCELLED -> GrpcRetryEvent.CANCELLED
      software.amazon.awscdk.services.appmesh.GrpcRetryEvent.DEADLINE_EXCEEDED ->
          GrpcRetryEvent.DEADLINE_EXCEEDED
      software.amazon.awscdk.services.appmesh.GrpcRetryEvent.INTERNAL_ERROR ->
          GrpcRetryEvent.INTERNAL_ERROR
      software.amazon.awscdk.services.appmesh.GrpcRetryEvent.RESOURCE_EXHAUSTED ->
          GrpcRetryEvent.RESOURCE_EXHAUSTED
      software.amazon.awscdk.services.appmesh.GrpcRetryEvent.UNAVAILABLE ->
          GrpcRetryEvent.UNAVAILABLE
    }

    internal fun unwrap(wrapped: GrpcRetryEvent):
        software.amazon.awscdk.services.appmesh.GrpcRetryEvent = wrapped.cdkObject
  }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sqs

public enum class DeduplicationScope(
  private val cdkObject: software.amazon.awscdk.services.sqs.DeduplicationScope,
) {
  MESSAGE_GROUP(software.amazon.awscdk.services.sqs.DeduplicationScope.MESSAGE_GROUP),
  QUEUE(software.amazon.awscdk.services.sqs.DeduplicationScope.QUEUE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.sqs.DeduplicationScope):
        DeduplicationScope = when (cdkObject) {
      software.amazon.awscdk.services.sqs.DeduplicationScope.MESSAGE_GROUP ->
          DeduplicationScope.MESSAGE_GROUP
      software.amazon.awscdk.services.sqs.DeduplicationScope.QUEUE -> DeduplicationScope.QUEUE
    }

    internal fun unwrap(wrapped: DeduplicationScope):
        software.amazon.awscdk.services.sqs.DeduplicationScope = wrapped.cdkObject
  }
}

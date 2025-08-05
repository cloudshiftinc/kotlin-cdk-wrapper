@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sns

public enum class FifoThroughputScope(
  private val cdkObject: software.amazon.awscdk.services.sns.FifoThroughputScope,
) {
  TOPIC(software.amazon.awscdk.services.sns.FifoThroughputScope.TOPIC),
  MESSAGE_GROUP(software.amazon.awscdk.services.sns.FifoThroughputScope.MESSAGE_GROUP),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.FifoThroughputScope):
        FifoThroughputScope = when (cdkObject) {
      software.amazon.awscdk.services.sns.FifoThroughputScope.TOPIC -> FifoThroughputScope.TOPIC
      software.amazon.awscdk.services.sns.FifoThroughputScope.MESSAGE_GROUP ->
          FifoThroughputScope.MESSAGE_GROUP
    }

    internal fun unwrap(wrapped: FifoThroughputScope):
        software.amazon.awscdk.services.sns.FifoThroughputScope = wrapped.cdkObject
  }
}

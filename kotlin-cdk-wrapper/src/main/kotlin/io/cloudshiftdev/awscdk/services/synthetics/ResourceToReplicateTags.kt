@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.synthetics

public enum class ResourceToReplicateTags(
  private val cdkObject: software.amazon.awscdk.services.synthetics.ResourceToReplicateTags,
) {
  LAMBDA_FUNCTION(software.amazon.awscdk.services.synthetics.ResourceToReplicateTags.LAMBDA_FUNCTION),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.synthetics.ResourceToReplicateTags):
        ResourceToReplicateTags = when (cdkObject) {
      software.amazon.awscdk.services.synthetics.ResourceToReplicateTags.LAMBDA_FUNCTION ->
          ResourceToReplicateTags.LAMBDA_FUNCTION
    }

    internal fun unwrap(wrapped: ResourceToReplicateTags):
        software.amazon.awscdk.services.synthetics.ResourceToReplicateTags = wrapped.cdkObject
  }
}

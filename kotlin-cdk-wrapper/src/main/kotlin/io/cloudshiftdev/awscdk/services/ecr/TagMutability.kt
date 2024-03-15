@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecr

public enum class TagMutability(
  private val cdkObject: software.amazon.awscdk.services.ecr.TagMutability,
) {
  MUTABLE(software.amazon.awscdk.services.ecr.TagMutability.MUTABLE),
  IMMUTABLE(software.amazon.awscdk.services.ecr.TagMutability.IMMUTABLE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecr.TagMutability): TagMutability =
        when (cdkObject) {
      software.amazon.awscdk.services.ecr.TagMutability.MUTABLE -> TagMutability.MUTABLE
      software.amazon.awscdk.services.ecr.TagMutability.IMMUTABLE -> TagMutability.IMMUTABLE
    }

    internal fun unwrap(wrapped: TagMutability): software.amazon.awscdk.services.ecr.TagMutability =
        wrapped.cdkObject
  }
}

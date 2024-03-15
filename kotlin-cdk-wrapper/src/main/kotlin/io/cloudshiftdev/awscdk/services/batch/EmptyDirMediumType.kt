@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

public enum class EmptyDirMediumType(
  private val cdkObject: software.amazon.awscdk.services.batch.EmptyDirMediumType,
) {
  DISK(software.amazon.awscdk.services.batch.EmptyDirMediumType.DISK),
  MEMORY(software.amazon.awscdk.services.batch.EmptyDirMediumType.MEMORY),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.EmptyDirMediumType):
        EmptyDirMediumType = when (cdkObject) {
      software.amazon.awscdk.services.batch.EmptyDirMediumType.DISK -> EmptyDirMediumType.DISK
      software.amazon.awscdk.services.batch.EmptyDirMediumType.MEMORY -> EmptyDirMediumType.MEMORY
    }

    internal fun unwrap(wrapped: EmptyDirMediumType):
        software.amazon.awscdk.services.batch.EmptyDirMediumType = wrapped.cdkObject
  }
}

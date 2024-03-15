@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.backup

public enum class TagOperation(
  private val cdkObject: software.amazon.awscdk.services.backup.TagOperation,
) {
  STRING_EQUALS(software.amazon.awscdk.services.backup.TagOperation.STRING_EQUALS),
  DUMMY(software.amazon.awscdk.services.backup.TagOperation.DUMMY),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.backup.TagOperation): TagOperation
        = when (cdkObject) {
      software.amazon.awscdk.services.backup.TagOperation.STRING_EQUALS ->
          TagOperation.STRING_EQUALS
      software.amazon.awscdk.services.backup.TagOperation.DUMMY -> TagOperation.DUMMY
    }

    internal fun unwrap(wrapped: TagOperation): software.amazon.awscdk.services.backup.TagOperation
        = wrapped.cdkObject
  }
}

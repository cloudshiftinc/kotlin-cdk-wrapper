@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.docdb

public enum class StorageType(
  private val cdkObject: software.amazon.awscdk.services.docdb.StorageType,
) {
  STANDARD(software.amazon.awscdk.services.docdb.StorageType.STANDARD),
  IOPT1(software.amazon.awscdk.services.docdb.StorageType.IOPT1),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.docdb.StorageType): StorageType =
        when (cdkObject) {
      software.amazon.awscdk.services.docdb.StorageType.STANDARD -> StorageType.STANDARD
      software.amazon.awscdk.services.docdb.StorageType.IOPT1 -> StorageType.IOPT1
    }

    internal fun unwrap(wrapped: StorageType): software.amazon.awscdk.services.docdb.StorageType =
        wrapped.cdkObject
  }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

public enum class MergeType(
  private val cdkObject: software.amazon.awscdk.services.appsync.MergeType,
) {
  MANUAL_MERGE(software.amazon.awscdk.services.appsync.MergeType.MANUAL_MERGE),
  AUTO_MERGE(software.amazon.awscdk.services.appsync.MergeType.AUTO_MERGE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.MergeType): MergeType =
        when (cdkObject) {
      software.amazon.awscdk.services.appsync.MergeType.MANUAL_MERGE -> MergeType.MANUAL_MERGE
      software.amazon.awscdk.services.appsync.MergeType.AUTO_MERGE -> MergeType.AUTO_MERGE
    }

    internal fun unwrap(wrapped: MergeType): software.amazon.awscdk.services.appsync.MergeType =
        wrapped.cdkObject
  }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

public enum class CfnDeletionPolicy(
  private val cdkObject: software.amazon.awscdk.CfnDeletionPolicy,
) {
  DELETE(software.amazon.awscdk.CfnDeletionPolicy.DELETE),
  RETAIN(software.amazon.awscdk.CfnDeletionPolicy.RETAIN),
  RETAIN_EXCEPT_ON_CREATE(software.amazon.awscdk.CfnDeletionPolicy.RETAIN_EXCEPT_ON_CREATE),
  SNAPSHOT(software.amazon.awscdk.CfnDeletionPolicy.SNAPSHOT),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.CfnDeletionPolicy): CfnDeletionPolicy = when
        (cdkObject) {
      software.amazon.awscdk.CfnDeletionPolicy.DELETE -> CfnDeletionPolicy.DELETE
      software.amazon.awscdk.CfnDeletionPolicy.RETAIN -> CfnDeletionPolicy.RETAIN
      software.amazon.awscdk.CfnDeletionPolicy.RETAIN_EXCEPT_ON_CREATE ->
          CfnDeletionPolicy.RETAIN_EXCEPT_ON_CREATE
      software.amazon.awscdk.CfnDeletionPolicy.SNAPSHOT -> CfnDeletionPolicy.SNAPSHOT
    }

    internal fun unwrap(wrapped: CfnDeletionPolicy): software.amazon.awscdk.CfnDeletionPolicy =
        wrapped.cdkObject
  }
}

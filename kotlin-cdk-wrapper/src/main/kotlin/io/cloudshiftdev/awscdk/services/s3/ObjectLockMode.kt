@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

public enum class ObjectLockMode(
  private val cdkObject: software.amazon.awscdk.services.s3.ObjectLockMode,
) {
  GOVERNANCE(software.amazon.awscdk.services.s3.ObjectLockMode.GOVERNANCE),
  COMPLIANCE(software.amazon.awscdk.services.s3.ObjectLockMode.COMPLIANCE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.ObjectLockMode): ObjectLockMode
        = when (cdkObject) {
      software.amazon.awscdk.services.s3.ObjectLockMode.GOVERNANCE -> ObjectLockMode.GOVERNANCE
      software.amazon.awscdk.services.s3.ObjectLockMode.COMPLIANCE -> ObjectLockMode.COMPLIANCE
    }

    internal fun unwrap(wrapped: ObjectLockMode): software.amazon.awscdk.services.s3.ObjectLockMode
        = wrapped.cdkObject
  }
}

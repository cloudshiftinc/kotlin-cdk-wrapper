@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

public enum class SizeRoundingBehavior(
  private val cdkObject: software.amazon.awscdk.SizeRoundingBehavior,
) {
  FAIL(software.amazon.awscdk.SizeRoundingBehavior.FAIL),
  FLOOR(software.amazon.awscdk.SizeRoundingBehavior.FLOOR),
  NONE(software.amazon.awscdk.SizeRoundingBehavior.NONE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.SizeRoundingBehavior): SizeRoundingBehavior
        = when (cdkObject) {
      software.amazon.awscdk.SizeRoundingBehavior.FAIL -> SizeRoundingBehavior.FAIL
      software.amazon.awscdk.SizeRoundingBehavior.FLOOR -> SizeRoundingBehavior.FLOOR
      software.amazon.awscdk.SizeRoundingBehavior.NONE -> SizeRoundingBehavior.NONE
    }

    internal fun unwrap(wrapped: SizeRoundingBehavior): software.amazon.awscdk.SizeRoundingBehavior
        = wrapped.cdkObject
  }
}

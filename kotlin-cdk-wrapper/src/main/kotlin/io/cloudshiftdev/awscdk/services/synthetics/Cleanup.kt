@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.synthetics

public enum class Cleanup(
  private val cdkObject: software.amazon.awscdk.services.synthetics.Cleanup,
) {
  NOTHING(software.amazon.awscdk.services.synthetics.Cleanup.NOTHING),
  LAMBDA(software.amazon.awscdk.services.synthetics.Cleanup.LAMBDA),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.synthetics.Cleanup): Cleanup = when
        (cdkObject) {
      software.amazon.awscdk.services.synthetics.Cleanup.NOTHING -> Cleanup.NOTHING
      software.amazon.awscdk.services.synthetics.Cleanup.LAMBDA -> Cleanup.LAMBDA
    }

    internal fun unwrap(wrapped: Cleanup): software.amazon.awscdk.services.synthetics.Cleanup =
        wrapped.cdkObject
  }
}

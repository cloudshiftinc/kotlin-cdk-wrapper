@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.synthetics

public enum class RuntimeFamily(
  private val cdkObject: software.amazon.awscdk.services.synthetics.RuntimeFamily,
) {
  NODEJS(software.amazon.awscdk.services.synthetics.RuntimeFamily.NODEJS),
  PYTHON(software.amazon.awscdk.services.synthetics.RuntimeFamily.PYTHON),
  OTHER(software.amazon.awscdk.services.synthetics.RuntimeFamily.OTHER),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.synthetics.RuntimeFamily):
        RuntimeFamily = when (cdkObject) {
      software.amazon.awscdk.services.synthetics.RuntimeFamily.NODEJS -> RuntimeFamily.NODEJS
      software.amazon.awscdk.services.synthetics.RuntimeFamily.PYTHON -> RuntimeFamily.PYTHON
      software.amazon.awscdk.services.synthetics.RuntimeFamily.OTHER -> RuntimeFamily.OTHER
    }

    internal fun unwrap(wrapped: RuntimeFamily):
        software.amazon.awscdk.services.synthetics.RuntimeFamily = wrapped.cdkObject
  }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cxapi

public enum class SynthesisMessageLevel(
  private val cdkObject: software.amazon.awscdk.cxapi.SynthesisMessageLevel,
) {
  INFO(software.amazon.awscdk.cxapi.SynthesisMessageLevel.INFO),
  WARNING(software.amazon.awscdk.cxapi.SynthesisMessageLevel.WARNING),
  ERROR(software.amazon.awscdk.cxapi.SynthesisMessageLevel.ERROR),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.cxapi.SynthesisMessageLevel):
        SynthesisMessageLevel = when (cdkObject) {
      software.amazon.awscdk.cxapi.SynthesisMessageLevel.INFO -> SynthesisMessageLevel.INFO
      software.amazon.awscdk.cxapi.SynthesisMessageLevel.WARNING -> SynthesisMessageLevel.WARNING
      software.amazon.awscdk.cxapi.SynthesisMessageLevel.ERROR -> SynthesisMessageLevel.ERROR
    }

    internal fun unwrap(wrapped: SynthesisMessageLevel):
        software.amazon.awscdk.cxapi.SynthesisMessageLevel = wrapped.cdkObject
  }
}

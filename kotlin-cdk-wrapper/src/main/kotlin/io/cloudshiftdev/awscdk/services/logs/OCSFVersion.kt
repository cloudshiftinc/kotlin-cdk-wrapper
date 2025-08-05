@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

public enum class OCSFVersion(
  private val cdkObject: software.amazon.awscdk.services.logs.OCSFVersion,
) {
  V1_1(software.amazon.awscdk.services.logs.OCSFVersion.V1_1),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.OCSFVersion): OCSFVersion =
        when (cdkObject) {
      software.amazon.awscdk.services.logs.OCSFVersion.V1_1 -> OCSFVersion.V1_1
    }

    internal fun unwrap(wrapped: OCSFVersion): software.amazon.awscdk.services.logs.OCSFVersion =
        wrapped.cdkObject
  }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

public enum class Platform(
  private val cdkObject: software.amazon.awscdk.services.appconfig.Platform,
) {
  X86_64(software.amazon.awscdk.services.appconfig.Platform.X86_64),
  ARM_64(software.amazon.awscdk.services.appconfig.Platform.ARM_64),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.Platform): Platform =
        when (cdkObject) {
      software.amazon.awscdk.services.appconfig.Platform.X86_64 -> Platform.X86_64
      software.amazon.awscdk.services.appconfig.Platform.ARM_64 -> Platform.ARM_64
    }

    internal fun unwrap(wrapped: Platform): software.amazon.awscdk.services.appconfig.Platform =
        wrapped.cdkObject
  }
}

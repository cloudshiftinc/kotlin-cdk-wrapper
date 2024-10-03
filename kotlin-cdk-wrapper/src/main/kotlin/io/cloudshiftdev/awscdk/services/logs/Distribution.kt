@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

public enum class Distribution(
  private val cdkObject: software.amazon.awscdk.services.logs.Distribution,
) {
  BY_LOG_STREAM(software.amazon.awscdk.services.logs.Distribution.BY_LOG_STREAM),
  RANDOM(software.amazon.awscdk.services.logs.Distribution.RANDOM),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.Distribution): Distribution =
        when (cdkObject) {
      software.amazon.awscdk.services.logs.Distribution.BY_LOG_STREAM -> Distribution.BY_LOG_STREAM
      software.amazon.awscdk.services.logs.Distribution.RANDOM -> Distribution.RANDOM
    }

    internal fun unwrap(wrapped: Distribution): software.amazon.awscdk.services.logs.Distribution =
        wrapped.cdkObject
  }
}

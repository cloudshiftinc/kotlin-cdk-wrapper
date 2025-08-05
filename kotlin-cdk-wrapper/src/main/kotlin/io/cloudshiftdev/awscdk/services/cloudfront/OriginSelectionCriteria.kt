@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

public enum class OriginSelectionCriteria(
  private val cdkObject: software.amazon.awscdk.services.cloudfront.OriginSelectionCriteria,
) {
  DEFAULT(software.amazon.awscdk.services.cloudfront.OriginSelectionCriteria.DEFAULT),
  MEDIA_QUALITY_BASED(software.amazon.awscdk.services.cloudfront.OriginSelectionCriteria.MEDIA_QUALITY_BASED),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.OriginSelectionCriteria):
        OriginSelectionCriteria = when (cdkObject) {
      software.amazon.awscdk.services.cloudfront.OriginSelectionCriteria.DEFAULT ->
          OriginSelectionCriteria.DEFAULT
      software.amazon.awscdk.services.cloudfront.OriginSelectionCriteria.MEDIA_QUALITY_BASED ->
          OriginSelectionCriteria.MEDIA_QUALITY_BASED
    }

    internal fun unwrap(wrapped: OriginSelectionCriteria):
        software.amazon.awscdk.services.cloudfront.OriginSelectionCriteria = wrapped.cdkObject
  }
}

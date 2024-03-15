@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

public enum class CloudWatchDimensionSource(
  private val cdkObject: software.amazon.awscdk.services.ses.CloudWatchDimensionSource,
) {
  EMAIL_HEADER(software.amazon.awscdk.services.ses.CloudWatchDimensionSource.EMAIL_HEADER),
  LINK_TAG(software.amazon.awscdk.services.ses.CloudWatchDimensionSource.LINK_TAG),
  MESSAGE_TAG(software.amazon.awscdk.services.ses.CloudWatchDimensionSource.MESSAGE_TAG),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.CloudWatchDimensionSource):
        CloudWatchDimensionSource = when (cdkObject) {
      software.amazon.awscdk.services.ses.CloudWatchDimensionSource.EMAIL_HEADER ->
          CloudWatchDimensionSource.EMAIL_HEADER
      software.amazon.awscdk.services.ses.CloudWatchDimensionSource.LINK_TAG ->
          CloudWatchDimensionSource.LINK_TAG
      software.amazon.awscdk.services.ses.CloudWatchDimensionSource.MESSAGE_TAG ->
          CloudWatchDimensionSource.MESSAGE_TAG
    }

    internal fun unwrap(wrapped: CloudWatchDimensionSource):
        software.amazon.awscdk.services.ses.CloudWatchDimensionSource = wrapped.cdkObject
  }
}

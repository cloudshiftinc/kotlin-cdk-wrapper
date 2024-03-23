@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.collections.List

/**
 * The HTTP methods that the Behavior will accept requests on.
 *
 * Example:
 *
 * ```
 * // Create a Distribution with configured HTTP methods and viewer protocol policy of the cache.
 * Bucket myBucket;
 * Distribution myWebDistribution = Distribution.Builder.create(this, "myDist")
 * .defaultBehavior(BehaviorOptions.builder()
 * .origin(new S3Origin(myBucket))
 * .allowedMethods(AllowedMethods.ALLOW_ALL)
 * .viewerProtocolPolicy(ViewerProtocolPolicy.REDIRECT_TO_HTTPS)
 * .build())
 * .build();
 * ```
 */
public open class AllowedMethods(
  cdkObject: software.amazon.awscdk.services.cloudfront.AllowedMethods,
) : CdkObject(cdkObject) {
  /**
   * HTTP methods supported.
   */
  public open fun methods(): List<String> = unwrap(this).getMethods()

  public companion object {
    public val ALLOW_ALL: AllowedMethods =
        AllowedMethods.wrap(software.amazon.awscdk.services.cloudfront.AllowedMethods.ALLOW_ALL)

    public val ALLOW_GET_HEAD: AllowedMethods =
        AllowedMethods.wrap(software.amazon.awscdk.services.cloudfront.AllowedMethods.ALLOW_GET_HEAD)

    public val ALLOW_GET_HEAD_OPTIONS: AllowedMethods =
        AllowedMethods.wrap(software.amazon.awscdk.services.cloudfront.AllowedMethods.ALLOW_GET_HEAD_OPTIONS)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.AllowedMethods):
        AllowedMethods = AllowedMethods(cdkObject)

    internal fun unwrap(wrapped: AllowedMethods):
        software.amazon.awscdk.services.cloudfront.AllowedMethods = wrapped.cdkObject as
        software.amazon.awscdk.services.cloudfront.AllowedMethods
  }
}

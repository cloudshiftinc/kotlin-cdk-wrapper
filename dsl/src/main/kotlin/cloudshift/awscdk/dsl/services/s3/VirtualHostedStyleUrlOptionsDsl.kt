@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.s3.VirtualHostedStyleUrlOptions

/**
 * Options for creating Virtual-Hosted style URL.
 *
 * Example:
 *
 * ```
 * Bucket bucket = new Bucket(this, "MyBucket");
 * bucket.urlForObject("objectname"); // Path-Style URL
 * bucket.virtualHostedUrlForObject("objectname"); // Virtual Hosted-Style URL
 * bucket.virtualHostedUrlForObject("objectname",
 * VirtualHostedStyleUrlOptions.builder().regional(false).build());
 * ```
 */
@CdkDslMarker
public class VirtualHostedStyleUrlOptionsDsl {
  private val cdkBuilder: VirtualHostedStyleUrlOptions.Builder =
      VirtualHostedStyleUrlOptions.builder()

  /**
   * @param regional Specifies the URL includes the region.
   */
  public fun regional(regional: Boolean) {
    cdkBuilder.regional(regional)
  }

  public fun build(): VirtualHostedStyleUrlOptions = cdkBuilder.build()
}

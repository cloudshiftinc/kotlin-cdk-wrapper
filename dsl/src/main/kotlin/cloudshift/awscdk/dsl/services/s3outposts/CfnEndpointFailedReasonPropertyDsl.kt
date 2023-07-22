@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3outposts

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3outposts.CfnEndpoint

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3outposts.*;
 * FailedReasonProperty failedReasonProperty = FailedReasonProperty.builder()
 * .errorCode("errorCode")
 * .message("message")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-endpoint-failedreason.html)
 */
@CdkDslMarker
public class CfnEndpointFailedReasonPropertyDsl {
  private val cdkBuilder: CfnEndpoint.FailedReasonProperty.Builder =
      CfnEndpoint.FailedReasonProperty.builder()

  /**
   * @param errorCode the value to be set.
   */
  public fun errorCode(errorCode: String) {
    cdkBuilder.errorCode(errorCode)
  }

  /**
   * @param message the value to be set.
   */
  public fun message(message: String) {
    cdkBuilder.message(message)
  }

  public fun build(): CfnEndpoint.FailedReasonProperty = cdkBuilder.build()
}

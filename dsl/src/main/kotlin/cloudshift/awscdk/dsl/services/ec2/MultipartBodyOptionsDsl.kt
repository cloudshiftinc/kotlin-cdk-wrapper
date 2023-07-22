@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.MultipartBodyOptions

/**
 * Options when creating `MultipartBody`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * MultipartBodyOptions multipartBodyOptions = MultipartBodyOptions.builder()
 * .contentType("contentType")
 * // the properties below are optional
 * .body("body")
 * .transferEncoding("transferEncoding")
 * .build();
 * ```
 */
@CdkDslMarker
public class MultipartBodyOptionsDsl {
  private val cdkBuilder: MultipartBodyOptions.Builder = MultipartBodyOptions.builder()

  /**
   * @param body The body of message.
   */
  public fun body(body: String) {
    cdkBuilder.body(body)
  }

  /**
   * @param contentType `Content-Type` header of this part. 
   * Some examples of content types:
   *
   * * `text/x-shellscript; charset="utf-8"` (shell script)
   * * `text/cloud-boothook; charset="utf-8"` (shell script executed during boot phase)
   *
   * For Linux shell scripts use `text/x-shellscript`.
   */
  public fun contentType(contentType: String) {
    cdkBuilder.contentType(contentType)
  }

  /**
   * @param transferEncoding `Content-Transfer-Encoding` header specifying part encoding.
   */
  public fun transferEncoding(transferEncoding: String) {
    cdkBuilder.transferEncoding(transferEncoding)
  }

  public fun build(): MultipartBodyOptions = cdkBuilder.build()
}

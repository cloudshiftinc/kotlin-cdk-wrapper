@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.wafv2.CfnWebACL

/**
 * The response body to use in a custom response to a web request.
 *
 * This is referenced by key from `CustomResponse` `CustomResponseBodyKey` .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * CustomResponseBodyProperty customResponseBodyProperty = CustomResponseBodyProperty.builder()
 * .content("content")
 * .contentType("contentType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-customresponsebody.html)
 */
@CdkDslMarker
public class CfnWebACLCustomResponseBodyPropertyDsl {
  private val cdkBuilder: CfnWebACL.CustomResponseBodyProperty.Builder =
      CfnWebACL.CustomResponseBodyProperty.builder()

  /**
   * @param content The payload of the custom response. 
   * You can use JSON escape strings in JSON content. To do this, you must specify JSON content in
   * the `ContentType` setting.
   *
   * For information about the limits on count and size for custom request and response settings,
   * see [AWS WAF quotas](https://docs.aws.amazon.com/waf/latest/developerguide/limits.html) in the
   * *AWS WAF Developer Guide* .
   */
  public fun content(content: String) {
    cdkBuilder.content(content)
  }

  /**
   * @param contentType The type of content in the payload that you are defining in the `Content`
   * string. 
   */
  public fun contentType(contentType: String) {
    cdkBuilder.contentType(contentType)
  }

  public fun build(): CfnWebACL.CustomResponseBodyProperty = cdkBuilder.build()
}

@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.wafv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnWebACL

/**
 * Specifies that AWS WAF should block the request and optionally defines additional custom handling
 * for the response to the web request.
 *
 * This is used in the context of other settings, for example to specify values for a rule action or
 * a web ACL default action.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * BlockActionProperty blockActionProperty = BlockActionProperty.builder()
 * .customResponse(CustomResponseProperty.builder()
 * .responseCode(123)
 * // the properties below are optional
 * .customResponseBodyKey("customResponseBodyKey")
 * .responseHeaders(List.of(CustomHTTPHeaderProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-blockaction.html)
 */
@CdkDslMarker
public class CfnWebACLBlockActionPropertyDsl {
    private val cdkBuilder: CfnWebACL.BlockActionProperty.Builder =
        CfnWebACL.BlockActionProperty.builder()

    /**
     * @param customResponse Defines a custom response for the web request. For information about
     *   customizing web requests and responses, see
     *   [Customizing web requests and responses in AWS WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html)
     *   in the *AWS WAF Developer Guide* .
     */
    public fun customResponse(customResponse: IResolvable) {
        cdkBuilder.customResponse(customResponse)
    }

    /**
     * @param customResponse Defines a custom response for the web request. For information about
     *   customizing web requests and responses, see
     *   [Customizing web requests and responses in AWS WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html)
     *   in the *AWS WAF Developer Guide* .
     */
    public fun customResponse(customResponse: CfnWebACL.CustomResponseProperty) {
        cdkBuilder.customResponse(customResponse)
    }

    public fun build(): CfnWebACL.BlockActionProperty = cdkBuilder.build()
}

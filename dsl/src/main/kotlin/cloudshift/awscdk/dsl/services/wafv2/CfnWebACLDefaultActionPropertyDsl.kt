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

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnWebACL

/**
 * In a `WebACL` , this is the action that you want AWS WAF to perform when a web request doesn't
 * match any of the rules in the `WebACL` .
 *
 * The default action must be a terminating action.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * DefaultActionProperty defaultActionProperty = DefaultActionProperty.builder()
 * .allow(AllowActionProperty.builder()
 * .customRequestHandling(CustomRequestHandlingProperty.builder()
 * .insertHeaders(List.of(CustomHTTPHeaderProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .build())
 * .build())
 * .block(BlockActionProperty.builder()
 * .customResponse(CustomResponseProperty.builder()
 * .responseCode(123)
 * // the properties below are optional
 * .customResponseBodyKey("customResponseBodyKey")
 * .responseHeaders(List.of(CustomHTTPHeaderProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-defaultaction.html)
 */
@CdkDslMarker
public class CfnWebACLDefaultActionPropertyDsl {
    private val cdkBuilder: CfnWebACL.DefaultActionProperty.Builder =
        CfnWebACL.DefaultActionProperty.builder()

    /** @param allow Specifies that AWS WAF should allow requests by default. */
    public fun allow(allow: IResolvable) {
        cdkBuilder.allow(allow)
    }

    /** @param allow Specifies that AWS WAF should allow requests by default. */
    public fun allow(allow: CfnWebACL.AllowActionProperty) {
        cdkBuilder.allow(allow)
    }

    /** @param block Specifies that AWS WAF should block requests by default. */
    public fun block(block: IResolvable) {
        cdkBuilder.block(block)
    }

    /** @param block Specifies that AWS WAF should block requests by default. */
    public fun block(block: CfnWebACL.BlockActionProperty) {
        cdkBuilder.block(block)
    }

    public fun build(): CfnWebACL.DefaultActionProperty = cdkBuilder.build()
}

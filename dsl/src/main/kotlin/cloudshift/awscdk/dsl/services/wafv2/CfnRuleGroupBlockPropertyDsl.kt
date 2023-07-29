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
import software.amazon.awscdk.services.wafv2.CfnRuleGroup

/**
 * Block traffic towards application.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * BlockProperty blockProperty = BlockProperty.builder()
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-block.html)
 */
@CdkDslMarker
public class CfnRuleGroupBlockPropertyDsl {
    private val cdkBuilder: CfnRuleGroup.BlockProperty.Builder =
        CfnRuleGroup.BlockProperty.builder()

    /** @param customResponse Custom response. */
    public fun customResponse(customResponse: IResolvable) {
        cdkBuilder.customResponse(customResponse)
    }

    /** @param customResponse Custom response. */
    public fun customResponse(customResponse: CfnRuleGroup.CustomResponseProperty) {
        cdkBuilder.customResponse(customResponse)
    }

    public fun build(): CfnRuleGroup.BlockProperty = cdkBuilder.build()
}

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
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.wafv2.CfnWebACL

/**
 * Text transformations eliminate some of the unusual formatting that attackers use in web requests
 * in an effort to bypass detection.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * TextTransformationProperty textTransformationProperty = TextTransformationProperty.builder()
 * .priority(123)
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-texttransformation.html)
 */
@CdkDslMarker
public class CfnWebACLTextTransformationPropertyDsl {
    private val cdkBuilder: CfnWebACL.TextTransformationProperty.Builder =
        CfnWebACL.TextTransformationProperty.builder()

    /**
     * @param priority Sets the relative processing order for multiple transformations. AWS WAF
     *   processes all transformations, from lowest priority to highest, before inspecting the
     *   transformed content. The priorities don't need to be consecutive, but they must all be
     *   different.
     */
    public fun priority(priority: Number) {
        cdkBuilder.priority(priority)
    }

    /**
     * @param type For detailed descriptions of each of the transformation types, see
     *   [Text transformations](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statement-transformation.html)
     *   in the *AWS WAF Developer Guide* .
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnWebACL.TextTransformationProperty = cdkBuilder.build()
}

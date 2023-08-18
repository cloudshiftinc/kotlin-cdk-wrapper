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
import kotlin.String
import software.amazon.awscdk.services.wafv2.CfnRuleGroup

/**
 * A single label container.
 *
 * This is used as an element of a label array in `RuleLabels` inside a rule.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * LabelProperty labelProperty = LabelProperty.builder()
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-label.html)
 */
@CdkDslMarker
public class CfnRuleGroupLabelPropertyDsl {
    private val cdkBuilder: CfnRuleGroup.LabelProperty.Builder =
        CfnRuleGroup.LabelProperty.builder()

    /** @param name The label string. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnRuleGroup.LabelProperty = cdkBuilder.build()
}

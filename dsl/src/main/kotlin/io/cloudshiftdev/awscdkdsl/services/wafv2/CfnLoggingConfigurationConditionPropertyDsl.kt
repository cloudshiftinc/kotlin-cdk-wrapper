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
import software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration

/**
 * A single match condition for a log filter.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * ConditionProperty conditionProperty = ConditionProperty.builder()
 * .actionCondition(ActionConditionProperty.builder()
 * .action("action")
 * .build())
 * .labelNameCondition(LabelNameConditionProperty.builder()
 * .labelName("labelName")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-condition.html)
 */
@CdkDslMarker
public class CfnLoggingConfigurationConditionPropertyDsl {
    private val cdkBuilder: CfnLoggingConfiguration.ConditionProperty.Builder =
        CfnLoggingConfiguration.ConditionProperty.builder()

    /**
     * @param actionCondition A single action condition. This is the action setting that a log
     *   record must contain in order to meet the condition.
     */
    public fun actionCondition(actionCondition: IResolvable) {
        cdkBuilder.actionCondition(actionCondition)
    }

    /**
     * @param actionCondition A single action condition. This is the action setting that a log
     *   record must contain in order to meet the condition.
     */
    public fun actionCondition(actionCondition: CfnLoggingConfiguration.ActionConditionProperty) {
        cdkBuilder.actionCondition(actionCondition)
    }

    /**
     * @param labelNameCondition A single label name condition. This is the fully qualified label
     *   name that a log record must contain in order to meet the condition. Fully qualified labels
     *   have a prefix, optional namespaces, and label name. The prefix identifies the rule group or
     *   web ACL context of the rule that added the label.
     */
    public fun labelNameCondition(labelNameCondition: IResolvable) {
        cdkBuilder.labelNameCondition(labelNameCondition)
    }

    /**
     * @param labelNameCondition A single label name condition. This is the fully qualified label
     *   name that a log record must contain in order to meet the condition. Fully qualified labels
     *   have a prefix, optional namespaces, and label name. The prefix identifies the rule group or
     *   web ACL context of the rule that added the label.
     */
    public fun labelNameCondition(
        labelNameCondition: CfnLoggingConfiguration.LabelNameConditionProperty
    ) {
        cdkBuilder.labelNameCondition(labelNameCondition)
    }

    public fun build(): CfnLoggingConfiguration.ConditionProperty = cdkBuilder.build()
}

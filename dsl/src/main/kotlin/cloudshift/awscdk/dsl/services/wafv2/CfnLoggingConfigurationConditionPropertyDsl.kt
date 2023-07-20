@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration

@CdkDslMarker
public class CfnLoggingConfigurationConditionPropertyDsl {
    private val cdkBuilder: CfnLoggingConfiguration.ConditionProperty.Builder =
        CfnLoggingConfiguration.ConditionProperty.builder()

    public fun actionCondition(actionCondition: IResolvable) {
        cdkBuilder.actionCondition(actionCondition)
    }

    public fun actionCondition(actionCondition: CfnLoggingConfiguration.ActionConditionProperty) {
        cdkBuilder.actionCondition(actionCondition)
    }

    public fun labelNameCondition(labelNameCondition: IResolvable) {
        cdkBuilder.labelNameCondition(labelNameCondition)
    }

    public fun labelNameCondition(labelNameCondition: CfnLoggingConfiguration.LabelNameConditionProperty) {
        cdkBuilder.labelNameCondition(labelNameCondition)
    }

    public fun build(): CfnLoggingConfiguration.ConditionProperty = cdkBuilder.build()
}

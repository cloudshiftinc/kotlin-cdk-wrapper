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

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotanalytics.CfnDataset
import kotlin.String

@CdkDslMarker
public class CfnDatasetLateDataRulePropertyDsl {
    private val cdkBuilder: CfnDataset.LateDataRuleProperty.Builder =
        CfnDataset.LateDataRuleProperty.builder()

    public fun ruleConfiguration(ruleConfiguration: IResolvable) {
        cdkBuilder.ruleConfiguration(ruleConfiguration)
    }

    public fun ruleConfiguration(ruleConfiguration: CfnDataset.LateDataRuleConfigurationProperty) {
        cdkBuilder.ruleConfiguration(ruleConfiguration)
    }

    public fun ruleName(ruleName: String) {
        cdkBuilder.ruleName(ruleName)
    }

    public fun build(): CfnDataset.LateDataRuleProperty = cdkBuilder.build()
}

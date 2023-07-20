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

package cloudshift.awscdk.dsl.services.xray

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.xray.CfnSamplingRule
import kotlin.String

@CdkDslMarker
public class CfnSamplingRuleSamplingRuleRecordPropertyDsl {
    private val cdkBuilder: CfnSamplingRule.SamplingRuleRecordProperty.Builder =
        CfnSamplingRule.SamplingRuleRecordProperty.builder()

    public fun createdAt(createdAt: String) {
        cdkBuilder.createdAt(createdAt)
    }

    public fun modifiedAt(modifiedAt: String) {
        cdkBuilder.modifiedAt(modifiedAt)
    }

    public fun samplingRule(samplingRule: IResolvable) {
        cdkBuilder.samplingRule(samplingRule)
    }

    public fun samplingRule(samplingRule: CfnSamplingRule.SamplingRuleProperty) {
        cdkBuilder.samplingRule(samplingRule)
    }

    public fun build(): CfnSamplingRule.SamplingRuleRecordProperty = cdkBuilder.build()
}

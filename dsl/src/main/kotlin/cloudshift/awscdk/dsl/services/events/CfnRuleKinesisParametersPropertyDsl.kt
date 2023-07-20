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

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.events.CfnRule
import kotlin.String

@CdkDslMarker
public class CfnRuleKinesisParametersPropertyDsl {
    private val cdkBuilder: CfnRule.KinesisParametersProperty.Builder =
        CfnRule.KinesisParametersProperty.builder()

    public fun partitionKeyPath(partitionKeyPath: String) {
        cdkBuilder.partitionKeyPath(partitionKeyPath)
    }

    public fun build(): CfnRule.KinesisParametersProperty = cdkBuilder.build()
}

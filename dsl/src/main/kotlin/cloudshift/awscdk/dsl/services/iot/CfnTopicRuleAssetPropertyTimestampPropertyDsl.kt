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

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.iot.CfnTopicRule
import kotlin.String

@CdkDslMarker
public class CfnTopicRuleAssetPropertyTimestampPropertyDsl {
    private val cdkBuilder: CfnTopicRule.AssetPropertyTimestampProperty.Builder =
        CfnTopicRule.AssetPropertyTimestampProperty.builder()

    public fun offsetInNanos(offsetInNanos: String) {
        cdkBuilder.offsetInNanos(offsetInNanos)
    }

    public fun timeInSeconds(timeInSeconds: String) {
        cdkBuilder.timeInSeconds(timeInSeconds)
    }

    public fun build(): CfnTopicRule.AssetPropertyTimestampProperty = cdkBuilder.build()
}

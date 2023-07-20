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
public class CfnTopicRuleTimestreamTimestampPropertyDsl {
    private val cdkBuilder: CfnTopicRule.TimestreamTimestampProperty.Builder =
        CfnTopicRule.TimestreamTimestampProperty.builder()

    public fun unit(unit: String) {
        cdkBuilder.unit(unit)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnTopicRule.TimestreamTimestampProperty = cdkBuilder.build()
}

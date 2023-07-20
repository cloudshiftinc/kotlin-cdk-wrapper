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
public class CfnTopicRuleTimestreamDimensionPropertyDsl {
    private val cdkBuilder: CfnTopicRule.TimestreamDimensionProperty.Builder =
        CfnTopicRule.TimestreamDimensionProperty.builder()

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnTopicRule.TimestreamDimensionProperty = cdkBuilder.build()
}

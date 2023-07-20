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
import kotlin.Number

@CdkDslMarker
public class CfnRuleBatchArrayPropertiesPropertyDsl {
    private val cdkBuilder: CfnRule.BatchArrayPropertiesProperty.Builder =
        CfnRule.BatchArrayPropertiesProperty.builder()

    public fun size(size: Number) {
        cdkBuilder.size(size)
    }

    public fun build(): CfnRule.BatchArrayPropertiesProperty = cdkBuilder.build()
}

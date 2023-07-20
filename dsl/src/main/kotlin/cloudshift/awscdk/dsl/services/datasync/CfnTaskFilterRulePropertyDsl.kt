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

package cloudshift.awscdk.dsl.services.datasync

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.datasync.CfnTask
import kotlin.String

@CdkDslMarker
public class CfnTaskFilterRulePropertyDsl {
    private val cdkBuilder: CfnTask.FilterRuleProperty.Builder = CfnTask.FilterRuleProperty.builder()

    public fun filterType(filterType: String) {
        cdkBuilder.filterType(filterType)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnTask.FilterRuleProperty = cdkBuilder.build()
}

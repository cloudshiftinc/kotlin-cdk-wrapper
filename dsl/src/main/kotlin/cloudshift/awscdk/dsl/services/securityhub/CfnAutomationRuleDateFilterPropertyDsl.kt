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

package cloudshift.awscdk.dsl.services.securityhub

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.securityhub.CfnAutomationRule
import kotlin.String

@CdkDslMarker
public class CfnAutomationRuleDateFilterPropertyDsl {
    private val cdkBuilder: CfnAutomationRule.DateFilterProperty.Builder =
        CfnAutomationRule.DateFilterProperty.builder()

    public fun dateRange(dateRange: IResolvable) {
        cdkBuilder.dateRange(dateRange)
    }

    public fun dateRange(dateRange: CfnAutomationRule.DateRangeProperty) {
        cdkBuilder.dateRange(dateRange)
    }

    public fun end(end: String) {
        cdkBuilder.end(end)
    }

    public fun start(start: String) {
        cdkBuilder.start(start)
    }

    public fun build(): CfnAutomationRule.DateFilterProperty = cdkBuilder.build()
}

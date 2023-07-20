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

package cloudshift.awscdk.dsl.services.location

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.location.CfnRouteCalculatorProps
import kotlin.String

@CdkDslMarker
public class CfnRouteCalculatorPropsDsl {
    private val cdkBuilder: CfnRouteCalculatorProps.Builder = CfnRouteCalculatorProps.builder()

    public fun calculatorName(calculatorName: String) {
        cdkBuilder.calculatorName(calculatorName)
    }

    public fun dataSource(dataSource: String) {
        cdkBuilder.dataSource(dataSource)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun pricingPlan(pricingPlan: String) {
        cdkBuilder.pricingPlan(pricingPlan)
    }

    public fun build(): CfnRouteCalculatorProps = cdkBuilder.build()
}

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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard
import kotlin.String

@CdkDslMarker
public class CfnDashboardNumericSeparatorConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.NumericSeparatorConfigurationProperty.Builder =
        CfnDashboard.NumericSeparatorConfigurationProperty.builder()

    public fun decimalSeparator(decimalSeparator: String) {
        cdkBuilder.decimalSeparator(decimalSeparator)
    }

    public fun thousandsSeparator(thousandsSeparator: IResolvable) {
        cdkBuilder.thousandsSeparator(thousandsSeparator)
    }

    public fun thousandsSeparator(thousandsSeparator: CfnDashboard.ThousandSeparatorOptionsProperty) {
        cdkBuilder.thousandsSeparator(thousandsSeparator)
    }

    public fun build(): CfnDashboard.NumericSeparatorConfigurationProperty = cdkBuilder.build()
}

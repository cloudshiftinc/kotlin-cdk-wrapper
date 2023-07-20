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

@CdkDslMarker
public class CfnDashboardNumericFormatConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.NumericFormatConfigurationProperty.Builder =
        CfnDashboard.NumericFormatConfigurationProperty.builder()

    public fun currencyDisplayFormatConfiguration(currencyDisplayFormatConfiguration: IResolvable) {
        cdkBuilder.currencyDisplayFormatConfiguration(currencyDisplayFormatConfiguration)
    }

    public fun currencyDisplayFormatConfiguration(currencyDisplayFormatConfiguration: CfnDashboard.CurrencyDisplayFormatConfigurationProperty) {
        cdkBuilder.currencyDisplayFormatConfiguration(currencyDisplayFormatConfiguration)
    }

    public fun numberDisplayFormatConfiguration(numberDisplayFormatConfiguration: IResolvable) {
        cdkBuilder.numberDisplayFormatConfiguration(numberDisplayFormatConfiguration)
    }

    public fun numberDisplayFormatConfiguration(numberDisplayFormatConfiguration: CfnDashboard.NumberDisplayFormatConfigurationProperty) {
        cdkBuilder.numberDisplayFormatConfiguration(numberDisplayFormatConfiguration)
    }

    public fun percentageDisplayFormatConfiguration(percentageDisplayFormatConfiguration: IResolvable) {
        cdkBuilder.percentageDisplayFormatConfiguration(percentageDisplayFormatConfiguration)
    }

    public fun percentageDisplayFormatConfiguration(percentageDisplayFormatConfiguration: CfnDashboard.PercentageDisplayFormatConfigurationProperty) {
        cdkBuilder.percentageDisplayFormatConfiguration(percentageDisplayFormatConfiguration)
    }

    public fun build(): CfnDashboard.NumericFormatConfigurationProperty = cdkBuilder.build()
}

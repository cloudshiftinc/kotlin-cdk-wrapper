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
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateFormatConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.FormatConfigurationProperty.Builder =
        CfnTemplate.FormatConfigurationProperty.builder()

    public fun dateTimeFormatConfiguration(dateTimeFormatConfiguration: IResolvable) {
        cdkBuilder.dateTimeFormatConfiguration(dateTimeFormatConfiguration)
    }

    public fun dateTimeFormatConfiguration(dateTimeFormatConfiguration: CfnTemplate.DateTimeFormatConfigurationProperty) {
        cdkBuilder.dateTimeFormatConfiguration(dateTimeFormatConfiguration)
    }

    public fun numberFormatConfiguration(numberFormatConfiguration: IResolvable) {
        cdkBuilder.numberFormatConfiguration(numberFormatConfiguration)
    }

    public fun numberFormatConfiguration(numberFormatConfiguration: CfnTemplate.NumberFormatConfigurationProperty) {
        cdkBuilder.numberFormatConfiguration(numberFormatConfiguration)
    }

    public fun stringFormatConfiguration(stringFormatConfiguration: IResolvable) {
        cdkBuilder.stringFormatConfiguration(stringFormatConfiguration)
    }

    public fun stringFormatConfiguration(stringFormatConfiguration: CfnTemplate.StringFormatConfigurationProperty) {
        cdkBuilder.stringFormatConfiguration(stringFormatConfiguration)
    }

    public fun build(): CfnTemplate.FormatConfigurationProperty = cdkBuilder.build()
}

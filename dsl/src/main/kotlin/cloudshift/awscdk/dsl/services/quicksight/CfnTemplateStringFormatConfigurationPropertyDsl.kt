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
public class CfnTemplateStringFormatConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.StringFormatConfigurationProperty.Builder =
        CfnTemplate.StringFormatConfigurationProperty.builder()

    public fun nullValueFormatConfiguration(nullValueFormatConfiguration: IResolvable) {
        cdkBuilder.nullValueFormatConfiguration(nullValueFormatConfiguration)
    }

    public fun nullValueFormatConfiguration(nullValueFormatConfiguration: CfnTemplate.NullValueFormatConfigurationProperty) {
        cdkBuilder.nullValueFormatConfiguration(nullValueFormatConfiguration)
    }

    public fun numericFormatConfiguration(numericFormatConfiguration: IResolvable) {
        cdkBuilder.numericFormatConfiguration(numericFormatConfiguration)
    }

    public fun numericFormatConfiguration(numericFormatConfiguration: CfnTemplate.NumericFormatConfigurationProperty) {
        cdkBuilder.numericFormatConfiguration(numericFormatConfiguration)
    }

    public fun build(): CfnTemplate.StringFormatConfigurationProperty = cdkBuilder.build()
}

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
import software.amazon.awscdk.services.quicksight.CfnTemplate
import kotlin.Number

@CdkDslMarker
public class CfnTemplateDecimalPlacesConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.DecimalPlacesConfigurationProperty.Builder =
        CfnTemplate.DecimalPlacesConfigurationProperty.builder()

    public fun decimalPlaces(decimalPlaces: Number) {
        cdkBuilder.decimalPlaces(decimalPlaces)
    }

    public fun build(): CfnTemplate.DecimalPlacesConfigurationProperty = cdkBuilder.build()
}

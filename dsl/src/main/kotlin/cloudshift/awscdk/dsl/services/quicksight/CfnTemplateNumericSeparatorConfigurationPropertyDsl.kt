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
import kotlin.String

@CdkDslMarker
public class CfnTemplateNumericSeparatorConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.NumericSeparatorConfigurationProperty.Builder =
        CfnTemplate.NumericSeparatorConfigurationProperty.builder()

    public fun decimalSeparator(decimalSeparator: String) {
        cdkBuilder.decimalSeparator(decimalSeparator)
    }

    public fun thousandsSeparator(thousandsSeparator: IResolvable) {
        cdkBuilder.thousandsSeparator(thousandsSeparator)
    }

    public fun thousandsSeparator(thousandsSeparator: CfnTemplate.ThousandSeparatorOptionsProperty) {
        cdkBuilder.thousandsSeparator(thousandsSeparator)
    }

    public fun build(): CfnTemplate.NumericSeparatorConfigurationProperty = cdkBuilder.build()
}

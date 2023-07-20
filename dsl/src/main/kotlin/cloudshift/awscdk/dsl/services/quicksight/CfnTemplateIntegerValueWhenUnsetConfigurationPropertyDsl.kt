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
import kotlin.String

@CdkDslMarker
public class CfnTemplateIntegerValueWhenUnsetConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.IntegerValueWhenUnsetConfigurationProperty.Builder =
        CfnTemplate.IntegerValueWhenUnsetConfigurationProperty.builder()

    public fun customValue(customValue: Number) {
        cdkBuilder.customValue(customValue)
    }

    public fun valueWhenUnsetOption(valueWhenUnsetOption: String) {
        cdkBuilder.valueWhenUnsetOption(valueWhenUnsetOption)
    }

    public fun build(): CfnTemplate.IntegerValueWhenUnsetConfigurationProperty = cdkBuilder.build()
}

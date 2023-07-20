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
import kotlin.Boolean

@CdkDslMarker
public class CfnTemplateCustomValuesConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.CustomValuesConfigurationProperty.Builder =
        CfnTemplate.CustomValuesConfigurationProperty.builder()

    public fun customValues(customValues: IResolvable) {
        cdkBuilder.customValues(customValues)
    }

    public fun customValues(customValues: CfnTemplate.CustomParameterValuesProperty) {
        cdkBuilder.customValues(customValues)
    }

    public fun includeNullValue(includeNullValue: Boolean) {
        cdkBuilder.includeNullValue(includeNullValue)
    }

    public fun includeNullValue(includeNullValue: IResolvable) {
        cdkBuilder.includeNullValue(includeNullValue)
    }

    public fun build(): CfnTemplate.CustomValuesConfigurationProperty = cdkBuilder.build()
}

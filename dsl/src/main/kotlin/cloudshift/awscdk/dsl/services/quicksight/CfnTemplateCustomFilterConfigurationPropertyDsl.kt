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
import kotlin.String

@CdkDslMarker
public class CfnTemplateCustomFilterConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.CustomFilterConfigurationProperty.Builder =
        CfnTemplate.CustomFilterConfigurationProperty.builder()

    public fun categoryValue(categoryValue: String) {
        cdkBuilder.categoryValue(categoryValue)
    }

    public fun matchOperator(matchOperator: String) {
        cdkBuilder.matchOperator(matchOperator)
    }

    public fun nullOption(nullOption: String) {
        cdkBuilder.nullOption(nullOption)
    }

    public fun parameterName(parameterName: String) {
        cdkBuilder.parameterName(parameterName)
    }

    public fun selectAllOptions(selectAllOptions: String) {
        cdkBuilder.selectAllOptions(selectAllOptions)
    }

    public fun build(): CfnTemplate.CustomFilterConfigurationProperty = cdkBuilder.build()
}

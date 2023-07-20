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
public class CfnTemplateNullValueFormatConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.NullValueFormatConfigurationProperty.Builder =
        CfnTemplate.NullValueFormatConfigurationProperty.builder()

    public fun nullString(nullString: String) {
        cdkBuilder.nullString(nullString)
    }

    public fun build(): CfnTemplate.NullValueFormatConfigurationProperty = cdkBuilder.build()
}

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
public class CfnTemplateAnchorDateConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.AnchorDateConfigurationProperty.Builder =
        CfnTemplate.AnchorDateConfigurationProperty.builder()

    public fun anchorOption(anchorOption: String) {
        cdkBuilder.anchorOption(anchorOption)
    }

    public fun parameterName(parameterName: String) {
        cdkBuilder.parameterName(parameterName)
    }

    public fun build(): CfnTemplate.AnchorDateConfigurationProperty = cdkBuilder.build()
}

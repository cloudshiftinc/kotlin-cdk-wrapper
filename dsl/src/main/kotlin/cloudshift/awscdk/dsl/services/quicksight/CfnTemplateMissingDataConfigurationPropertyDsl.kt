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
public class CfnTemplateMissingDataConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.MissingDataConfigurationProperty.Builder =
        CfnTemplate.MissingDataConfigurationProperty.builder()

    public fun treatmentOption(treatmentOption: String) {
        cdkBuilder.treatmentOption(treatmentOption)
    }

    public fun build(): CfnTemplate.MissingDataConfigurationProperty = cdkBuilder.build()
}

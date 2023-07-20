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
public class CfnTemplateReferenceLineValueLabelConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.ReferenceLineValueLabelConfigurationProperty.Builder =
        CfnTemplate.ReferenceLineValueLabelConfigurationProperty.builder()

    public fun formatConfiguration(formatConfiguration: IResolvable) {
        cdkBuilder.formatConfiguration(formatConfiguration)
    }

    public fun formatConfiguration(formatConfiguration: CfnTemplate.NumericFormatConfigurationProperty) {
        cdkBuilder.formatConfiguration(formatConfiguration)
    }

    public fun relativePosition(relativePosition: String) {
        cdkBuilder.relativePosition(relativePosition)
    }

    public fun build(): CfnTemplate.ReferenceLineValueLabelConfigurationProperty = cdkBuilder.build()
}

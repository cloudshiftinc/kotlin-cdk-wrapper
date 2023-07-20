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
public class CfnTemplateAxisLabelOptionsPropertyDsl {
    private val cdkBuilder: CfnTemplate.AxisLabelOptionsProperty.Builder =
        CfnTemplate.AxisLabelOptionsProperty.builder()

    public fun applyTo(applyTo: IResolvable) {
        cdkBuilder.applyTo(applyTo)
    }

    public fun applyTo(applyTo: CfnTemplate.AxisLabelReferenceOptionsProperty) {
        cdkBuilder.applyTo(applyTo)
    }

    public fun customLabel(customLabel: String) {
        cdkBuilder.customLabel(customLabel)
    }

    public fun fontConfiguration(fontConfiguration: IResolvable) {
        cdkBuilder.fontConfiguration(fontConfiguration)
    }

    public fun fontConfiguration(fontConfiguration: CfnTemplate.FontConfigurationProperty) {
        cdkBuilder.fontConfiguration(fontConfiguration)
    }

    public fun build(): CfnTemplate.AxisLabelOptionsProperty = cdkBuilder.build()
}

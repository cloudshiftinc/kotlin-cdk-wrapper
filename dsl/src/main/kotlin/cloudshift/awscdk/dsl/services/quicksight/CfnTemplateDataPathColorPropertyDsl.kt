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
public class CfnTemplateDataPathColorPropertyDsl {
    private val cdkBuilder: CfnTemplate.DataPathColorProperty.Builder =
        CfnTemplate.DataPathColorProperty.builder()

    public fun color(color: String) {
        cdkBuilder.color(color)
    }

    public fun element(element: IResolvable) {
        cdkBuilder.element(element)
    }

    public fun element(element: CfnTemplate.DataPathValueProperty) {
        cdkBuilder.element(element)
    }

    public fun timeGranularity(timeGranularity: String) {
        cdkBuilder.timeGranularity(timeGranularity)
    }

    public fun build(): CfnTemplate.DataPathColorProperty = cdkBuilder.build()
}

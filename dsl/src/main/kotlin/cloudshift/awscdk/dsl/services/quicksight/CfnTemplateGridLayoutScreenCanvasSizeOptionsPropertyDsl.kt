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
public class CfnTemplateGridLayoutScreenCanvasSizeOptionsPropertyDsl {
    private val cdkBuilder: CfnTemplate.GridLayoutScreenCanvasSizeOptionsProperty.Builder =
        CfnTemplate.GridLayoutScreenCanvasSizeOptionsProperty.builder()

    public fun optimizedViewPortWidth(optimizedViewPortWidth: String) {
        cdkBuilder.optimizedViewPortWidth(optimizedViewPortWidth)
    }

    public fun resizeOption(resizeOption: String) {
        cdkBuilder.resizeOption(resizeOption)
    }

    public fun build(): CfnTemplate.GridLayoutScreenCanvasSizeOptionsProperty = cdkBuilder.build()
}

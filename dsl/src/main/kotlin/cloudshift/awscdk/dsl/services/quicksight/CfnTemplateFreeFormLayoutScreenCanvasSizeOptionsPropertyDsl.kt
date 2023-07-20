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
public class CfnTemplateFreeFormLayoutScreenCanvasSizeOptionsPropertyDsl {
    private val cdkBuilder: CfnTemplate.FreeFormLayoutScreenCanvasSizeOptionsProperty.Builder =
        CfnTemplate.FreeFormLayoutScreenCanvasSizeOptionsProperty.builder()

    public fun optimizedViewPortWidth(optimizedViewPortWidth: String) {
        cdkBuilder.optimizedViewPortWidth(optimizedViewPortWidth)
    }

    public fun build(): CfnTemplate.FreeFormLayoutScreenCanvasSizeOptionsProperty = cdkBuilder.build()
}

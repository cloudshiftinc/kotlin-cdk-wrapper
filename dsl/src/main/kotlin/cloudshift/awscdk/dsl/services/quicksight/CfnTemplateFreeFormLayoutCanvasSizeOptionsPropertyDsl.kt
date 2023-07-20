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

@CdkDslMarker
public class CfnTemplateFreeFormLayoutCanvasSizeOptionsPropertyDsl {
    private val cdkBuilder: CfnTemplate.FreeFormLayoutCanvasSizeOptionsProperty.Builder =
        CfnTemplate.FreeFormLayoutCanvasSizeOptionsProperty.builder()

    public fun screenCanvasSizeOptions(screenCanvasSizeOptions: IResolvable) {
        cdkBuilder.screenCanvasSizeOptions(screenCanvasSizeOptions)
    }

    public fun screenCanvasSizeOptions(screenCanvasSizeOptions: CfnTemplate.FreeFormLayoutScreenCanvasSizeOptionsProperty) {
        cdkBuilder.screenCanvasSizeOptions(screenCanvasSizeOptions)
    }

    public fun build(): CfnTemplate.FreeFormLayoutCanvasSizeOptionsProperty = cdkBuilder.build()
}

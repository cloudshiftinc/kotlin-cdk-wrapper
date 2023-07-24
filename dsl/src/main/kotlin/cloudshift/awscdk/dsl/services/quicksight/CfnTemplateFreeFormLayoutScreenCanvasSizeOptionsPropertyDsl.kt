@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.quicksight.CfnTemplate
import kotlin.String

/**
 * The options that determine the sizing of the canvas used in a free-form layout.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * FreeFormLayoutScreenCanvasSizeOptionsProperty freeFormLayoutScreenCanvasSizeOptionsProperty =
 * FreeFormLayoutScreenCanvasSizeOptionsProperty.builder()
 * .optimizedViewPortWidth("optimizedViewPortWidth")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-freeformlayoutscreencanvassizeoptions.html)
 */
@CdkDslMarker
public class CfnTemplateFreeFormLayoutScreenCanvasSizeOptionsPropertyDsl {
    private val cdkBuilder: CfnTemplate.FreeFormLayoutScreenCanvasSizeOptionsProperty.Builder =
        CfnTemplate.FreeFormLayoutScreenCanvasSizeOptionsProperty.builder()

    /**
     * @param optimizedViewPortWidth The width that the view port will be optimized for when the
     * layout renders.
     */
    public fun optimizedViewPortWidth(optimizedViewPortWidth: String) {
        cdkBuilder.optimizedViewPortWidth(optimizedViewPortWidth)
    }

    public fun build(): CfnTemplate.FreeFormLayoutScreenCanvasSizeOptionsProperty = cdkBuilder.build()
}

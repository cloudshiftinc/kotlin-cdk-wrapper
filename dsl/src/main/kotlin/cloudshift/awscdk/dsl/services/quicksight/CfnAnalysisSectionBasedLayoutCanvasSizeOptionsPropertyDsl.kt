@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The options for the canvas of a section-based layout.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * SectionBasedLayoutCanvasSizeOptionsProperty sectionBasedLayoutCanvasSizeOptionsProperty =
 * SectionBasedLayoutCanvasSizeOptionsProperty.builder()
 * .paperCanvasSizeOptions(SectionBasedLayoutPaperCanvasSizeOptionsProperty.builder()
 * .paperMargin(SpacingProperty.builder()
 * .bottom("bottom")
 * .left("left")
 * .right("right")
 * .top("top")
 * .build())
 * .paperOrientation("paperOrientation")
 * .paperSize("paperSize")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-sectionbasedlayoutcanvassizeoptions.html)
 */
@CdkDslMarker
public class CfnAnalysisSectionBasedLayoutCanvasSizeOptionsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.SectionBasedLayoutCanvasSizeOptionsProperty.Builder =
        CfnAnalysis.SectionBasedLayoutCanvasSizeOptionsProperty.builder()

    /**
     * @param paperCanvasSizeOptions The options for a paper canvas of a section-based layout.
     */
    public fun paperCanvasSizeOptions(paperCanvasSizeOptions: IResolvable) {
        cdkBuilder.paperCanvasSizeOptions(paperCanvasSizeOptions)
    }

    /**
     * @param paperCanvasSizeOptions The options for a paper canvas of a section-based layout.
     */
    public fun paperCanvasSizeOptions(paperCanvasSizeOptions: CfnAnalysis.SectionBasedLayoutPaperCanvasSizeOptionsProperty) {
        cdkBuilder.paperCanvasSizeOptions(paperCanvasSizeOptions)
    }

    public fun build(): CfnAnalysis.SectionBasedLayoutCanvasSizeOptionsProperty = cdkBuilder.build()
}

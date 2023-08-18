@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The options for the canvas of a section-based layout.
 *
 * Example:
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-sectionbasedlayoutcanvassizeoptions.html)
 */
@CdkDslMarker
public class CfnDashboardSectionBasedLayoutCanvasSizeOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.SectionBasedLayoutCanvasSizeOptionsProperty.Builder =
        CfnDashboard.SectionBasedLayoutCanvasSizeOptionsProperty.builder()

    /** @param paperCanvasSizeOptions The options for a paper canvas of a section-based layout. */
    public fun paperCanvasSizeOptions(paperCanvasSizeOptions: IResolvable) {
        cdkBuilder.paperCanvasSizeOptions(paperCanvasSizeOptions)
    }

    /** @param paperCanvasSizeOptions The options for a paper canvas of a section-based layout. */
    public fun paperCanvasSizeOptions(
        paperCanvasSizeOptions: CfnDashboard.SectionBasedLayoutPaperCanvasSizeOptionsProperty
    ) {
        cdkBuilder.paperCanvasSizeOptions(paperCanvasSizeOptions)
    }

    public fun build(): CfnDashboard.SectionBasedLayoutCanvasSizeOptionsProperty =
        cdkBuilder.build()
}

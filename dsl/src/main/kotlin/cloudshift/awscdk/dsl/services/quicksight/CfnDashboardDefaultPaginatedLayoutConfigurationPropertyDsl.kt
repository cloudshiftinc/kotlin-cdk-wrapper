@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The options that determine the default settings for a paginated layout configuration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DefaultPaginatedLayoutConfigurationProperty defaultPaginatedLayoutConfigurationProperty =
 * DefaultPaginatedLayoutConfigurationProperty.builder()
 * .sectionBased(DefaultSectionBasedLayoutConfigurationProperty.builder()
 * .canvasSizeOptions(SectionBasedLayoutCanvasSizeOptionsProperty.builder()
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
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-defaultpaginatedlayoutconfiguration.html)
 */
@CdkDslMarker
public class CfnDashboardDefaultPaginatedLayoutConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.DefaultPaginatedLayoutConfigurationProperty.Builder =
        CfnDashboard.DefaultPaginatedLayoutConfigurationProperty.builder()

    /**
     * @param sectionBased The options that determine the default settings for a section-based layout
     * configuration.
     */
    public fun sectionBased(sectionBased: IResolvable) {
        cdkBuilder.sectionBased(sectionBased)
    }

    /**
     * @param sectionBased The options that determine the default settings for a section-based layout
     * configuration.
     */
    public fun sectionBased(sectionBased: CfnDashboard.DefaultSectionBasedLayoutConfigurationProperty) {
        cdkBuilder.sectionBased(sectionBased)
    }

    public fun build(): CfnDashboard.DefaultPaginatedLayoutConfigurationProperty = cdkBuilder.build()
}

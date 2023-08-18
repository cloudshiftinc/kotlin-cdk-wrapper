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
 * The configuration of a page break for a section.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * SectionPageBreakConfigurationProperty sectionPageBreakConfigurationProperty =
 * SectionPageBreakConfigurationProperty.builder()
 * .after(SectionAfterPageBreakProperty.builder()
 * .status("status")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-sectionpagebreakconfiguration.html)
 */
@CdkDslMarker
public class CfnDashboardSectionPageBreakConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.SectionPageBreakConfigurationProperty.Builder =
        CfnDashboard.SectionPageBreakConfigurationProperty.builder()

    /** @param after The configuration of a page break after a section. */
    public fun after(after: IResolvable) {
        cdkBuilder.after(after)
    }

    /** @param after The configuration of a page break after a section. */
    public fun after(after: CfnDashboard.SectionAfterPageBreakProperty) {
        cdkBuilder.after(after)
    }

    public fun build(): CfnDashboard.SectionPageBreakConfigurationProperty = cdkBuilder.build()
}

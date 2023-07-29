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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-sectionpagebreakconfiguration.html)
 */
@CdkDslMarker
public class CfnAnalysisSectionPageBreakConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.SectionPageBreakConfigurationProperty.Builder =
        CfnAnalysis.SectionPageBreakConfigurationProperty.builder()

    /** @param after The configuration of a page break after a section. */
    public fun after(after: IResolvable) {
        cdkBuilder.after(after)
    }

    /** @param after The configuration of a page break after a section. */
    public fun after(after: CfnAnalysis.SectionAfterPageBreakProperty) {
        cdkBuilder.after(after)
    }

    public fun build(): CfnAnalysis.SectionPageBreakConfigurationProperty = cdkBuilder.build()
}

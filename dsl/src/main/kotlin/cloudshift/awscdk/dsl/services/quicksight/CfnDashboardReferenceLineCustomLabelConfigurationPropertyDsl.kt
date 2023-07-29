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
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The configuration for a custom label on a `ReferenceLine` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ReferenceLineCustomLabelConfigurationProperty referenceLineCustomLabelConfigurationProperty =
 * ReferenceLineCustomLabelConfigurationProperty.builder()
 * .customLabel("customLabel")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-referencelinecustomlabelconfiguration.html)
 */
@CdkDslMarker
public class CfnDashboardReferenceLineCustomLabelConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.ReferenceLineCustomLabelConfigurationProperty.Builder =
        CfnDashboard.ReferenceLineCustomLabelConfigurationProperty.builder()

    /** @param customLabel The string text of the custom label. */
    public fun customLabel(customLabel: String) {
        cdkBuilder.customLabel(customLabel)
    }

    public fun build(): CfnDashboard.ReferenceLineCustomLabelConfigurationProperty =
        cdkBuilder.build()
}

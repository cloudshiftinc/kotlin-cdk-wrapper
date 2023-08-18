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
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The URL operation that opens a link to another webpage.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * CustomActionURLOperationProperty customActionURLOperationProperty =
 * CustomActionURLOperationProperty.builder()
 * .urlTarget("urlTarget")
 * .urlTemplate("urlTemplate")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-customactionurloperation.html)
 */
@CdkDslMarker
public class CfnDashboardCustomActionURLOperationPropertyDsl {
    private val cdkBuilder: CfnDashboard.CustomActionURLOperationProperty.Builder =
        CfnDashboard.CustomActionURLOperationProperty.builder()

    /**
     * @param urlTarget The target of the `CustomActionURLOperation` . Valid values are defined as
     *   follows:
     * * `NEW_TAB` : Opens the target URL in a new browser tab.
     * * `NEW_WINDOW` : Opens the target URL in a new browser window.
     * * `SAME_TAB` : Opens the target URL in the same browser tab.
     */
    public fun urlTarget(urlTarget: String) {
        cdkBuilder.urlTarget(urlTarget)
    }

    /** @param urlTemplate THe URL link of the `CustomActionURLOperation` . */
    public fun urlTemplate(urlTemplate: String) {
        cdkBuilder.urlTemplate(urlTemplate)
    }

    public fun build(): CfnDashboard.CustomActionURLOperationProperty = cdkBuilder.build()
}

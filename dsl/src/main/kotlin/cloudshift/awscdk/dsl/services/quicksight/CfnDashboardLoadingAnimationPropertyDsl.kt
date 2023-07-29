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
 * The configuration of loading animation in free-form layout.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * LoadingAnimationProperty loadingAnimationProperty = LoadingAnimationProperty.builder()
 * .visibility("visibility")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-loadinganimation.html)
 */
@CdkDslMarker
public class CfnDashboardLoadingAnimationPropertyDsl {
    private val cdkBuilder: CfnDashboard.LoadingAnimationProperty.Builder =
        CfnDashboard.LoadingAnimationProperty.builder()

    /** @param visibility The visibility configuration of `LoadingAnimation` . */
    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    public fun build(): CfnDashboard.LoadingAnimationProperty = cdkBuilder.build()
}

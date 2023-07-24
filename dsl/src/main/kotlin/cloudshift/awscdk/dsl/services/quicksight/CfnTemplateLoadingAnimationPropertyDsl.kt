@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.quicksight.CfnTemplate
import kotlin.String

/**
 * The configuration of loading animation in free-form layout.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * LoadingAnimationProperty loadingAnimationProperty = LoadingAnimationProperty.builder()
 * .visibility("visibility")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-loadinganimation.html)
 */
@CdkDslMarker
public class CfnTemplateLoadingAnimationPropertyDsl {
    private val cdkBuilder: CfnTemplate.LoadingAnimationProperty.Builder =
        CfnTemplate.LoadingAnimationProperty.builder()

    /**
     * @param visibility The visibility configuration of `LoadingAnimation` .
     */
    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    public fun build(): CfnTemplate.LoadingAnimationProperty = cdkBuilder.build()
}

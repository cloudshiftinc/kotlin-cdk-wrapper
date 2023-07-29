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
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The maximum label of a data path label.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * MaximumLabelTypeProperty maximumLabelTypeProperty = MaximumLabelTypeProperty.builder()
 * .visibility("visibility")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-maximumlabeltype.html)
 */
@CdkDslMarker
public class CfnTemplateMaximumLabelTypePropertyDsl {
    private val cdkBuilder: CfnTemplate.MaximumLabelTypeProperty.Builder =
        CfnTemplate.MaximumLabelTypeProperty.builder()

    /** @param visibility The visibility of the maximum label. */
    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    public fun build(): CfnTemplate.MaximumLabelTypeProperty = cdkBuilder.build()
}

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
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The configuration of the `Select all` options in a list control.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ListControlSelectAllOptionsProperty listControlSelectAllOptionsProperty =
 * ListControlSelectAllOptionsProperty.builder()
 * .visibility("visibility")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-listcontrolselectalloptions.html)
 */
@CdkDslMarker
public class CfnTemplateListControlSelectAllOptionsPropertyDsl {
    private val cdkBuilder: CfnTemplate.ListControlSelectAllOptionsProperty.Builder =
        CfnTemplate.ListControlSelectAllOptionsProperty.builder()

    /**
     * @param visibility The visibility configuration of the `Select all` options in a list control.
     */
    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    public fun build(): CfnTemplate.ListControlSelectAllOptionsProperty = cdkBuilder.build()
}

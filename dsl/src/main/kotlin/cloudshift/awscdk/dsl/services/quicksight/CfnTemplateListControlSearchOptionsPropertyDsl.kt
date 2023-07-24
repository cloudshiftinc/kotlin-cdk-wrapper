@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.quicksight.CfnTemplate
import kotlin.String

/**
 * The configuration of the search options in a list control.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ListControlSearchOptionsProperty listControlSearchOptionsProperty =
 * ListControlSearchOptionsProperty.builder()
 * .visibility("visibility")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-listcontrolsearchoptions.html)
 */
@CdkDslMarker
public class CfnTemplateListControlSearchOptionsPropertyDsl {
    private val cdkBuilder: CfnTemplate.ListControlSearchOptionsProperty.Builder =
        CfnTemplate.ListControlSearchOptionsProperty.builder()

    /**
     * @param visibility The visibility configuration of the search options in a list control.
     */
    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    public fun build(): CfnTemplate.ListControlSearchOptionsProperty = cdkBuilder.build()
}

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

package io.cloudshiftdev.awscdkdsl.services.inspectorv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.inspectorv2.CfnFilter

/**
 * An object that describes the details of a string filter.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.inspectorv2.*;
 * StringFilterProperty stringFilterProperty = StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-stringfilter.html)
 */
@CdkDslMarker
public class CfnFilterStringFilterPropertyDsl {
    private val cdkBuilder: CfnFilter.StringFilterProperty.Builder =
        CfnFilter.StringFilterProperty.builder()

    /** @param comparison The operator to use when comparing values in the filter. */
    public fun comparison(comparison: String) {
        cdkBuilder.comparison(comparison)
    }

    /** @param value The value to filter on. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnFilter.StringFilterProperty = cdkBuilder.build()
}

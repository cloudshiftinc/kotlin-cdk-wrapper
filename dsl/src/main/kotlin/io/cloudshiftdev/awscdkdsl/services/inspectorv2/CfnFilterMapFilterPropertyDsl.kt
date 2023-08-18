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
 * An object that describes details of a map filter.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.inspectorv2.*;
 * MapFilterProperty mapFilterProperty = MapFilterProperty.builder()
 * .comparison("comparison")
 * // the properties below are optional
 * .key("key")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-mapfilter.html)
 */
@CdkDslMarker
public class CfnFilterMapFilterPropertyDsl {
    private val cdkBuilder: CfnFilter.MapFilterProperty.Builder =
        CfnFilter.MapFilterProperty.builder()

    /** @param comparison The operator to use when comparing values in the filter. */
    public fun comparison(comparison: String) {
        cdkBuilder.comparison(comparison)
    }

    /** @param key The tag key used in the filter. */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /** @param value The tag value used in the filter. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnFilter.MapFilterProperty = cdkBuilder.build()
}

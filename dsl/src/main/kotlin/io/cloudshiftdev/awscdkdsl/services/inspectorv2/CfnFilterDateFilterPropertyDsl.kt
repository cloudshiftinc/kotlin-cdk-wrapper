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
import kotlin.Number
import software.amazon.awscdk.services.inspectorv2.CfnFilter

/**
 * Contains details on the time range used to filter findings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.inspectorv2.*;
 * DateFilterProperty dateFilterProperty = DateFilterProperty.builder()
 * .endInclusive(123)
 * .startInclusive(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-datefilter.html)
 */
@CdkDslMarker
public class CfnFilterDateFilterPropertyDsl {
    private val cdkBuilder: CfnFilter.DateFilterProperty.Builder =
        CfnFilter.DateFilterProperty.builder()

    /** @param endInclusive A timestamp representing the end of the time period filtered on. */
    public fun endInclusive(endInclusive: Number) {
        cdkBuilder.endInclusive(endInclusive)
    }

    /** @param startInclusive A timestamp representing the start of the time period filtered on. */
    public fun startInclusive(startInclusive: Number) {
        cdkBuilder.startInclusive(startInclusive)
    }

    public fun build(): CfnFilter.DateFilterProperty = cdkBuilder.build()
}

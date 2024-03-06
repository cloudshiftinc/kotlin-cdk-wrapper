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

package io.cloudshiftdev.awscdkdsl.services.s3

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.s3.CfnStorageLensGroup

/**
 * This resource contains `DaysGreaterThan` and `DaysLessThan` to define the object age range
 * (minimum and maximum number of days).
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * MatchObjectAgeProperty matchObjectAgeProperty = MatchObjectAgeProperty.builder()
 * .daysGreaterThan(123)
 * .daysLessThan(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-matchobjectage.html)
 */
@CdkDslMarker
public class CfnStorageLensGroupMatchObjectAgePropertyDsl {
    private val cdkBuilder: CfnStorageLensGroup.MatchObjectAgeProperty.Builder =
        CfnStorageLensGroup.MatchObjectAgeProperty.builder()

    /** @param daysGreaterThan This property indicates the minimum object age in days. */
    public fun daysGreaterThan(daysGreaterThan: Number) {
        cdkBuilder.daysGreaterThan(daysGreaterThan)
    }

    /** @param daysLessThan This property indicates the maximum object age in days. */
    public fun daysLessThan(daysLessThan: Number) {
        cdkBuilder.daysLessThan(daysLessThan)
    }

    public fun build(): CfnStorageLensGroup.MatchObjectAgeProperty = cdkBuilder.build()
}

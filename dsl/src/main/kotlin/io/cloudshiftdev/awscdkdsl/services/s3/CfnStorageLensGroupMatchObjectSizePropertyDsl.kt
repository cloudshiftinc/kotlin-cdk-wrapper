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
 * This resource filters objects that match the specified object size range.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * MatchObjectSizeProperty matchObjectSizeProperty = MatchObjectSizeProperty.builder()
 * .bytesGreaterThan(123)
 * .bytesLessThan(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-matchobjectsize.html)
 */
@CdkDslMarker
public class CfnStorageLensGroupMatchObjectSizePropertyDsl {
    private val cdkBuilder: CfnStorageLensGroup.MatchObjectSizeProperty.Builder =
        CfnStorageLensGroup.MatchObjectSizeProperty.builder()

    /**
     * @param bytesGreaterThan This property specifies the minimum object size in bytes. The value
     *   must be a positive number, greater than 0 and less than 5 TB.
     */
    public fun bytesGreaterThan(bytesGreaterThan: Number) {
        cdkBuilder.bytesGreaterThan(bytesGreaterThan)
    }

    /**
     * @param bytesLessThan This property specifies the maximum object size in bytes. The value must
     *   be a positive number, greater than the minimum object size and less than 5 TB.
     */
    public fun bytesLessThan(bytesLessThan: Number) {
        cdkBuilder.bytesLessThan(bytesLessThan)
    }

    public fun build(): CfnStorageLensGroup.MatchObjectSizeProperty = cdkBuilder.build()
}

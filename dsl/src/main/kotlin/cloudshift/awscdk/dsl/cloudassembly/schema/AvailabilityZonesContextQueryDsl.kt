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

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.cloudassembly.schema.AvailabilityZonesContextQuery

/**
 * Query to availability zone context provider.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.cloudassembly.schema.*;
 * AvailabilityZonesContextQuery availabilityZonesContextQuery =
 * AvailabilityZonesContextQuery.builder()
 * .account("account")
 * .region("region")
 * // the properties below are optional
 * .lookupRoleArn("lookupRoleArn")
 * .build();
 * ```
 */
@CdkDslMarker
public class AvailabilityZonesContextQueryDsl {
    private val cdkBuilder: AvailabilityZonesContextQuery.Builder =
        AvailabilityZonesContextQuery.builder()

    /** @param account Query account. */
    public fun account(account: String) {
        cdkBuilder.account(account)
    }

    /**
     * @param lookupRoleArn The ARN of the role that should be used to look up the missing values.
     */
    public fun lookupRoleArn(lookupRoleArn: String) {
        cdkBuilder.lookupRoleArn(lookupRoleArn)
    }

    /** @param region Query region. */
    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    public fun build(): AvailabilityZonesContextQuery = cdkBuilder.build()
}

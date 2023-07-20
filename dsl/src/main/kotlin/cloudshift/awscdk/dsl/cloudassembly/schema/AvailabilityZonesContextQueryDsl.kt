@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.cloudassembly.schema.AvailabilityZonesContextQuery
import kotlin.String

@CdkDslMarker
public class AvailabilityZonesContextQueryDsl {
    private val cdkBuilder: AvailabilityZonesContextQuery.Builder =
        AvailabilityZonesContextQuery.builder()

    public fun account(account: String) {
        cdkBuilder.account(account)
    }

    public fun lookupRoleArn(lookupRoleArn: String) {
        cdkBuilder.lookupRoleArn(lookupRoleArn)
    }

    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    public fun build(): AvailabilityZonesContextQuery = cdkBuilder.build()
}

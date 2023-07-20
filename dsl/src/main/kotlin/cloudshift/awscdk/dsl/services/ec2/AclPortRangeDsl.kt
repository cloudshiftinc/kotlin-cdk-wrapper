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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ec2.AclPortRange
import kotlin.Number

@CdkDslMarker
public class AclPortRangeDsl {
    private val cdkBuilder: AclPortRange.Builder = AclPortRange.builder()

    public fun from(from: Number) {
        cdkBuilder.from(from)
    }

    public fun to(to: Number) {
        cdkBuilder.to(to)
    }

    public fun build(): AclPortRange = cdkBuilder.build()
}

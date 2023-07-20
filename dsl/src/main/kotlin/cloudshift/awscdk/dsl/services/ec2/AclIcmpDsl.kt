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
import software.amazon.awscdk.services.ec2.AclIcmp
import kotlin.Number

@CdkDslMarker
public class AclIcmpDsl {
    private val cdkBuilder: AclIcmp.Builder = AclIcmp.builder()

    public fun code(code: Number) {
        cdkBuilder.code(code)
    }

    public fun type(type: Number) {
        cdkBuilder.type(type)
    }

    public fun build(): AclIcmp = cdkBuilder.build()
}

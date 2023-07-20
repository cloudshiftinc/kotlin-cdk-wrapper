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

package cloudshift.awscdk.dsl.services.efs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.efs.Acl
import kotlin.String

@CdkDslMarker
public class AclDsl {
    private val cdkBuilder: Acl.Builder = Acl.builder()

    public fun ownerGid(ownerGid: String) {
        cdkBuilder.ownerGid(ownerGid)
    }

    public fun ownerUid(ownerUid: String) {
        cdkBuilder.ownerUid(ownerUid)
    }

    public fun permissions(permissions: String) {
        cdkBuilder.permissions(permissions)
    }

    public fun build(): Acl = cdkBuilder.build()
}

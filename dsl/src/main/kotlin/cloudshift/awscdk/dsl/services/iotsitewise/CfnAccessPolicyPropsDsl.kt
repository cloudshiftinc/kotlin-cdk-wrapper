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

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy
import software.amazon.awscdk.services.iotsitewise.CfnAccessPolicyProps
import kotlin.String

@CdkDslMarker
public class CfnAccessPolicyPropsDsl {
    private val cdkBuilder: CfnAccessPolicyProps.Builder = CfnAccessPolicyProps.builder()

    public fun accessPolicyIdentity(accessPolicyIdentity: IResolvable) {
        cdkBuilder.accessPolicyIdentity(accessPolicyIdentity)
    }

    public fun accessPolicyIdentity(accessPolicyIdentity: CfnAccessPolicy.AccessPolicyIdentityProperty) {
        cdkBuilder.accessPolicyIdentity(accessPolicyIdentity)
    }

    public fun accessPolicyPermission(accessPolicyPermission: String) {
        cdkBuilder.accessPolicyPermission(accessPolicyPermission)
    }

    public fun accessPolicyResource(accessPolicyResource: IResolvable) {
        cdkBuilder.accessPolicyResource(accessPolicyResource)
    }

    public fun accessPolicyResource(accessPolicyResource: CfnAccessPolicy.AccessPolicyResourceProperty) {
        cdkBuilder.accessPolicyResource(accessPolicyResource)
    }

    public fun build(): CfnAccessPolicyProps = cdkBuilder.build()
}

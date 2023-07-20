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

package cloudshift.awscdk.dsl.services.opsworks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.opsworks.CfnUserProfileProps
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnUserProfilePropsDsl {
    private val cdkBuilder: CfnUserProfileProps.Builder = CfnUserProfileProps.builder()

    public fun allowSelfManagement(allowSelfManagement: Boolean) {
        cdkBuilder.allowSelfManagement(allowSelfManagement)
    }

    public fun allowSelfManagement(allowSelfManagement: IResolvable) {
        cdkBuilder.allowSelfManagement(allowSelfManagement)
    }

    public fun iamUserArn(iamUserArn: String) {
        cdkBuilder.iamUserArn(iamUserArn)
    }

    public fun sshPublicKey(sshPublicKey: String) {
        cdkBuilder.sshPublicKey(sshPublicKey)
    }

    public fun sshUsername(sshUsername: String) {
        cdkBuilder.sshUsername(sshUsername)
    }

    public fun build(): CfnUserProfileProps = cdkBuilder.build()
}

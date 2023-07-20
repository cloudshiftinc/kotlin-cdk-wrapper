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

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.iam.InstanceProfile
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class InstanceProfileDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: InstanceProfile.Builder = InstanceProfile.Builder.create(scope, id)

    public fun instanceProfileName(instanceProfileName: String) {
        cdkBuilder.instanceProfileName(instanceProfileName)
    }

    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    public fun build(): InstanceProfile = cdkBuilder.build()
}

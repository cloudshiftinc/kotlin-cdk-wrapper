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
import software.amazon.awscdk.services.iam.FromRoleArnOptions
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class FromRoleArnOptionsDsl {
    private val cdkBuilder: FromRoleArnOptions.Builder = FromRoleArnOptions.builder()

    public fun addGrantsToResources(addGrantsToResources: Boolean) {
        cdkBuilder.addGrantsToResources(addGrantsToResources)
    }

    public fun defaultPolicyName(defaultPolicyName: String) {
        cdkBuilder.defaultPolicyName(defaultPolicyName)
    }

    public fun mutable(mutable: Boolean) {
        cdkBuilder.mutable(mutable)
    }

    public fun build(): FromRoleArnOptions = cdkBuilder.build()
}

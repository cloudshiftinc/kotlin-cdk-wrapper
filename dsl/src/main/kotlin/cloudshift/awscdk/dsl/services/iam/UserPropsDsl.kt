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
import software.amazon.awscdk.SecretValue
import software.amazon.awscdk.services.iam.IGroup
import software.amazon.awscdk.services.iam.IManagedPolicy
import software.amazon.awscdk.services.iam.UserProps
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class UserPropsDsl {
    private val cdkBuilder: UserProps.Builder = UserProps.builder()

    private val _groups: MutableList<IGroup> = mutableListOf()

    private val _managedPolicies: MutableList<IManagedPolicy> = mutableListOf()

    public fun groups(vararg groups: IGroup) {
        _groups.addAll(listOf(*groups))
    }

    public fun groups(groups: Collection<IGroup>) {
        _groups.addAll(groups)
    }

    public fun managedPolicies(vararg managedPolicies: IManagedPolicy) {
        _managedPolicies.addAll(listOf(*managedPolicies))
    }

    public fun managedPolicies(managedPolicies: Collection<IManagedPolicy>) {
        _managedPolicies.addAll(managedPolicies)
    }

    public fun password(password: SecretValue) {
        cdkBuilder.password(password)
    }

    public fun passwordResetRequired(passwordResetRequired: Boolean) {
        cdkBuilder.passwordResetRequired(passwordResetRequired)
    }

    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    public fun permissionsBoundary(permissionsBoundary: IManagedPolicy) {
        cdkBuilder.permissionsBoundary(permissionsBoundary)
    }

    public fun userName(userName: String) {
        cdkBuilder.userName(userName)
    }

    public fun build(): UserProps {
        if (_groups.isNotEmpty()) cdkBuilder.groups(_groups)
        if (_managedPolicies.isNotEmpty()) cdkBuilder.managedPolicies(_managedPolicies)
        return cdkBuilder.build()
    }
}

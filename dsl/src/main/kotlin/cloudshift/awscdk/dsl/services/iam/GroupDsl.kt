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
import software.amazon.awscdk.services.iam.Group
import software.amazon.awscdk.services.iam.IManagedPolicy
import software.constructs.Construct
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class GroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: Group.Builder = Group.Builder.create(scope, id)

    private val _managedPolicies: MutableList<IManagedPolicy> = mutableListOf()

    public fun groupName(groupName: String) {
        cdkBuilder.groupName(groupName)
    }

    public fun managedPolicies(vararg managedPolicies: IManagedPolicy) {
        _managedPolicies.addAll(listOf(*managedPolicies))
    }

    public fun managedPolicies(managedPolicies: Collection<IManagedPolicy>) {
        _managedPolicies.addAll(managedPolicies)
    }

    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    public fun build(): Group {
        if (_managedPolicies.isNotEmpty()) cdkBuilder.managedPolicies(_managedPolicies)
        return cdkBuilder.build()
    }
}

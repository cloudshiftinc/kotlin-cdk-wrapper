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
import software.amazon.awscdk.services.iam.CfnInstanceProfileProps
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnInstanceProfilePropsDsl {
    private val cdkBuilder: CfnInstanceProfileProps.Builder = CfnInstanceProfileProps.builder()

    private val _roles: MutableList<String> = mutableListOf()

    public fun instanceProfileName(instanceProfileName: String) {
        cdkBuilder.instanceProfileName(instanceProfileName)
    }

    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    public fun roles(vararg roles: String) {
        _roles.addAll(listOf(*roles))
    }

    public fun roles(roles: Collection<String>) {
        _roles.addAll(roles)
    }

    public fun build(): CfnInstanceProfileProps {
        if (_roles.isNotEmpty()) cdkBuilder.roles(_roles)
        return cdkBuilder.build()
    }
}

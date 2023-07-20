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

package cloudshift.awscdk.dsl.services.sso

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.sso.CfnPermissionSet
import kotlin.String

@CdkDslMarker
public class CfnPermissionSetCustomerManagedPolicyReferencePropertyDsl {
    private val cdkBuilder: CfnPermissionSet.CustomerManagedPolicyReferenceProperty.Builder =
        CfnPermissionSet.CustomerManagedPolicyReferenceProperty.builder()

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    public fun build(): CfnPermissionSet.CustomerManagedPolicyReferenceProperty = cdkBuilder.build()
}

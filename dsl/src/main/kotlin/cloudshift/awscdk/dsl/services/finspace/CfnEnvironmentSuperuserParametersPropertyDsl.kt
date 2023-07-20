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

package cloudshift.awscdk.dsl.services.finspace

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.finspace.CfnEnvironment
import kotlin.String

@CdkDslMarker
public class CfnEnvironmentSuperuserParametersPropertyDsl {
    private val cdkBuilder: CfnEnvironment.SuperuserParametersProperty.Builder =
        CfnEnvironment.SuperuserParametersProperty.builder()

    public fun emailAddress(emailAddress: String) {
        cdkBuilder.emailAddress(emailAddress)
    }

    public fun firstName(firstName: String) {
        cdkBuilder.firstName(firstName)
    }

    public fun lastName(lastName: String) {
        cdkBuilder.lastName(lastName)
    }

    public fun build(): CfnEnvironment.SuperuserParametersProperty = cdkBuilder.build()
}

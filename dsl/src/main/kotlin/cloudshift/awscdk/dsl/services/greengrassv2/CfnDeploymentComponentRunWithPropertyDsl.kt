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

package cloudshift.awscdk.dsl.services.greengrassv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrassv2.CfnDeployment
import kotlin.String

@CdkDslMarker
public class CfnDeploymentComponentRunWithPropertyDsl {
    private val cdkBuilder: CfnDeployment.ComponentRunWithProperty.Builder =
        CfnDeployment.ComponentRunWithProperty.builder()

    public fun posixUser(posixUser: String) {
        cdkBuilder.posixUser(posixUser)
    }

    public fun systemResourceLimits(systemResourceLimits: IResolvable) {
        cdkBuilder.systemResourceLimits(systemResourceLimits)
    }

    public fun systemResourceLimits(systemResourceLimits: CfnDeployment.SystemResourceLimitsProperty) {
        cdkBuilder.systemResourceLimits(systemResourceLimits)
    }

    public fun windowsUser(windowsUser: String) {
        cdkBuilder.windowsUser(windowsUser)
    }

    public fun build(): CfnDeployment.ComponentRunWithProperty = cdkBuilder.build()
}

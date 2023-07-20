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

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.codedeploy.AutoRollbackConfig
import kotlin.Boolean

@CdkDslMarker
public class AutoRollbackConfigDsl {
    private val cdkBuilder: AutoRollbackConfig.Builder = AutoRollbackConfig.builder()

    public fun deploymentInAlarm(deploymentInAlarm: Boolean) {
        cdkBuilder.deploymentInAlarm(deploymentInAlarm)
    }

    public fun failedDeployment(failedDeployment: Boolean) {
        cdkBuilder.failedDeployment(failedDeployment)
    }

    public fun stoppedDeployment(stoppedDeployment: Boolean) {
        cdkBuilder.stoppedDeployment(stoppedDeployment)
    }

    public fun build(): AutoRollbackConfig = cdkBuilder.build()
}

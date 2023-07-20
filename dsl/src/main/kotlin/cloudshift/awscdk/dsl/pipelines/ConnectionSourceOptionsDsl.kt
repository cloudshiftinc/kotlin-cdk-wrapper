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

package cloudshift.awscdk.dsl.pipelines

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.pipelines.ConnectionSourceOptions
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class ConnectionSourceOptionsDsl {
    private val cdkBuilder: ConnectionSourceOptions.Builder = ConnectionSourceOptions.builder()

    public fun actionName(actionName: String) {
        cdkBuilder.actionName(actionName)
    }

    public fun codeBuildCloneOutput(codeBuildCloneOutput: Boolean) {
        cdkBuilder.codeBuildCloneOutput(codeBuildCloneOutput)
    }

    public fun connectionArn(connectionArn: String) {
        cdkBuilder.connectionArn(connectionArn)
    }

    public fun triggerOnPush(triggerOnPush: Boolean) {
        cdkBuilder.triggerOnPush(triggerOnPush)
    }

    public fun build(): ConnectionSourceOptions = cdkBuilder.build()
}

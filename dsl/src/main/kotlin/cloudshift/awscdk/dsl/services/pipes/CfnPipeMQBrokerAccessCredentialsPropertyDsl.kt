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

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.pipes.CfnPipe
import kotlin.String

@CdkDslMarker
public class CfnPipeMQBrokerAccessCredentialsPropertyDsl {
    private val cdkBuilder: CfnPipe.MQBrokerAccessCredentialsProperty.Builder =
        CfnPipe.MQBrokerAccessCredentialsProperty.builder()

    public fun basicAuth(basicAuth: String) {
        cdkBuilder.basicAuth(basicAuth)
    }

    public fun build(): CfnPipe.MQBrokerAccessCredentialsProperty = cdkBuilder.build()
}

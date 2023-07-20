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
import software.amazon.awscdk.services.codedeploy.ServerApplicationProps
import kotlin.String

@CdkDslMarker
public class ServerApplicationPropsDsl {
    private val cdkBuilder: ServerApplicationProps.Builder = ServerApplicationProps.builder()

    public fun applicationName(applicationName: String) {
        cdkBuilder.applicationName(applicationName)
    }

    public fun build(): ServerApplicationProps = cdkBuilder.build()
}

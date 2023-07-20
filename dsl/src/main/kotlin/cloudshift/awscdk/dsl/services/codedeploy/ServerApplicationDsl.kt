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
import software.amazon.awscdk.services.codedeploy.ServerApplication
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class ServerApplicationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: ServerApplication.Builder = ServerApplication.Builder.create(scope, id)

    public fun applicationName(applicationName: String) {
        cdkBuilder.applicationName(applicationName)
    }

    public fun build(): ServerApplication = cdkBuilder.build()
}

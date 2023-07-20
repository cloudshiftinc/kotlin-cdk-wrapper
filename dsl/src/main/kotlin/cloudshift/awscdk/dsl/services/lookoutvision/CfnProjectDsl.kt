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

package cloudshift.awscdk.dsl.services.lookoutvision

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.lookoutvision.CfnProject
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnProjectDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnProject.Builder = CfnProject.Builder.create(scope, id)

    public fun projectName(projectName: String) {
        cdkBuilder.projectName(projectName)
    }

    public fun build(): CfnProject = cdkBuilder.build()
}

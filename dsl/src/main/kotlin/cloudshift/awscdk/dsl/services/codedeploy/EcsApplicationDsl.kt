@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codedeploy.EcsApplication
import software.constructs.Construct

/**
 * A CodeDeploy Application that deploys to an Amazon ECS service.
 *
 * Example:
 * ```
 * EcsApplication application = EcsApplication.Builder.create(this, "CodeDeployApplication")
 * .applicationName("MyApplication")
 * .build();
 * ```
 */
@CdkDslMarker
public class EcsApplicationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: EcsApplication.Builder = EcsApplication.Builder.create(scope, id)

    /**
     * The physical, human-readable name of the CodeDeploy Application.
     *
     * Default: an auto-generated name will be used
     *
     * @param applicationName The physical, human-readable name of the CodeDeploy Application.
     */
    public fun applicationName(applicationName: String) {
        cdkBuilder.applicationName(applicationName)
    }

    public fun build(): EcsApplication = cdkBuilder.build()
}

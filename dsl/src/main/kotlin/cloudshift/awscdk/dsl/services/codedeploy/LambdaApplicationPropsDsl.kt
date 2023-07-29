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
import software.amazon.awscdk.services.codedeploy.LambdaApplicationProps

/**
 * Construction properties for `LambdaApplication`.
 *
 * Example:
 * ```
 * LambdaApplication application = LambdaApplication.Builder.create(this, "CodeDeployApplication")
 * .applicationName("MyApplication")
 * .build();
 * ```
 */
@CdkDslMarker
public class LambdaApplicationPropsDsl {
    private val cdkBuilder: LambdaApplicationProps.Builder = LambdaApplicationProps.builder()

    /** @param applicationName The physical, human-readable name of the CodeDeploy Application. */
    public fun applicationName(applicationName: String) {
        cdkBuilder.applicationName(applicationName)
    }

    public fun build(): LambdaApplicationProps = cdkBuilder.build()
}

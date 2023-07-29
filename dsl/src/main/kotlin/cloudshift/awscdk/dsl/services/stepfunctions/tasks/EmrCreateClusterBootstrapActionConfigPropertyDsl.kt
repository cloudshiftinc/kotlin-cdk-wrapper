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

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

/**
 * Configuration of a bootstrap action.
 *
 * See the RunJobFlow API for complete documentation on input parameters
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.stepfunctions.tasks.*;
 * BootstrapActionConfigProperty bootstrapActionConfigProperty =
 * BootstrapActionConfigProperty.builder()
 * .name("name")
 * .scriptBootstrapAction(ScriptBootstrapActionConfigProperty.builder()
 * .path("path")
 * // the properties below are optional
 * .args(List.of("args"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_BootstrapActionConfig.html)
 */
@CdkDslMarker
public class EmrCreateClusterBootstrapActionConfigPropertyDsl {
    private val cdkBuilder: EmrCreateCluster.BootstrapActionConfigProperty.Builder =
        EmrCreateCluster.BootstrapActionConfigProperty.builder()

    /** @param name The name of the bootstrap action. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param scriptBootstrapAction The script run by the bootstrap action. */
    public fun scriptBootstrapAction(
        scriptBootstrapAction: EmrCreateClusterScriptBootstrapActionConfigPropertyDsl.() -> Unit =
            {}
    ) {
        val builder = EmrCreateClusterScriptBootstrapActionConfigPropertyDsl()
        builder.apply(scriptBootstrapAction)
        cdkBuilder.scriptBootstrapAction(builder.build())
    }

    /** @param scriptBootstrapAction The script run by the bootstrap action. */
    public fun scriptBootstrapAction(
        scriptBootstrapAction: EmrCreateCluster.ScriptBootstrapActionConfigProperty
    ) {
        cdkBuilder.scriptBootstrapAction(scriptBootstrapAction)
    }

    public fun build(): EmrCreateCluster.BootstrapActionConfigProperty = cdkBuilder.build()
}

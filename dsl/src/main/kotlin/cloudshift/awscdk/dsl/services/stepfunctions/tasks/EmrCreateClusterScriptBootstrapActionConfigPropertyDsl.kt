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

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class EmrCreateClusterScriptBootstrapActionConfigPropertyDsl {
    private val cdkBuilder: EmrCreateCluster.ScriptBootstrapActionConfigProperty.Builder =
        EmrCreateCluster.ScriptBootstrapActionConfigProperty.builder()

    private val _args: MutableList<String> = mutableListOf()

    public fun args(vararg args: String) {
        _args.addAll(listOf(*args))
    }

    public fun args(args: Collection<String>) {
        _args.addAll(args)
    }

    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    public fun build(): EmrCreateCluster.ScriptBootstrapActionConfigProperty {
        if (_args.isNotEmpty()) cdkBuilder.args(_args)
        return cdkBuilder.build()
    }
}

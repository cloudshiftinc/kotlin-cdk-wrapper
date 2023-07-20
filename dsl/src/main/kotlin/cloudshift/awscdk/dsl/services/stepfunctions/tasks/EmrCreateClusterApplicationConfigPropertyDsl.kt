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
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class EmrCreateClusterApplicationConfigPropertyDsl {
    private val cdkBuilder: EmrCreateCluster.ApplicationConfigProperty.Builder =
        EmrCreateCluster.ApplicationConfigProperty.builder()

    private val _args: MutableList<String> = mutableListOf()

    public fun additionalInfo(additionalInfo: Map<String, String>) {
        cdkBuilder.additionalInfo(additionalInfo)
    }

    public fun args(vararg args: String) {
        _args.addAll(listOf(*args))
    }

    public fun args(args: Collection<String>) {
        _args.addAll(args)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    public fun build(): EmrCreateCluster.ApplicationConfigProperty {
        if (_args.isNotEmpty()) cdkBuilder.args(_args)
        return cdkBuilder.build()
    }
}

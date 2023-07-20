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
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class EmrCreateClusterConfigurationPropertyDsl {
    private val cdkBuilder: EmrCreateCluster.ConfigurationProperty.Builder =
        EmrCreateCluster.ConfigurationProperty.builder()

    private val _configurations: MutableList<EmrCreateCluster.ConfigurationProperty> = mutableListOf()

    public fun classification(classification: String) {
        cdkBuilder.classification(classification)
    }

    public fun configurations(configurations: EmrCreateClusterConfigurationPropertyDsl.() -> Unit) {
        _configurations.add(EmrCreateClusterConfigurationPropertyDsl().apply(configurations).build())
    }

    public fun configurations(configurations: Collection<EmrCreateCluster.ConfigurationProperty>) {
        _configurations.addAll(configurations)
    }

    public fun properties(properties: Map<String, String>) {
        cdkBuilder.properties(properties)
    }

    public fun build(): EmrCreateCluster.ConfigurationProperty {
        if (_configurations.isNotEmpty()) cdkBuilder.configurations(_configurations)
        return cdkBuilder.build()
    }
}

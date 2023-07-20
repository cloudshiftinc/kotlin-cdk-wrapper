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

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.msk.CfnConfigurationProps
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnConfigurationPropsDsl {
    private val cdkBuilder: CfnConfigurationProps.Builder = CfnConfigurationProps.builder()

    private val _kafkaVersionsList: MutableList<String> = mutableListOf()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun kafkaVersionsList(vararg kafkaVersionsList: String) {
        _kafkaVersionsList.addAll(listOf(*kafkaVersionsList))
    }

    public fun kafkaVersionsList(kafkaVersionsList: Collection<String>) {
        _kafkaVersionsList.addAll(kafkaVersionsList)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun serverProperties(serverProperties: String) {
        cdkBuilder.serverProperties(serverProperties)
    }

    public fun build(): CfnConfigurationProps {
        if (_kafkaVersionsList.isNotEmpty()) cdkBuilder.kafkaVersionsList(_kafkaVersionsList)
        return cdkBuilder.build()
    }
}

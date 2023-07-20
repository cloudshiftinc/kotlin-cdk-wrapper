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

package cloudshift.awscdk.dsl.services.appconfig

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.appconfig.CfnDeploymentStrategy
import software.amazon.awscdk.services.appconfig.CfnDeploymentStrategyProps
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDeploymentStrategyPropsDsl {
    private val cdkBuilder: CfnDeploymentStrategyProps.Builder = CfnDeploymentStrategyProps.builder()

    private val _tags: MutableList<CfnDeploymentStrategy.TagsProperty> = mutableListOf()

    public fun deploymentDurationInMinutes(deploymentDurationInMinutes: Number) {
        cdkBuilder.deploymentDurationInMinutes(deploymentDurationInMinutes)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun finalBakeTimeInMinutes(finalBakeTimeInMinutes: Number) {
        cdkBuilder.finalBakeTimeInMinutes(finalBakeTimeInMinutes)
    }

    public fun growthFactor(growthFactor: Number) {
        cdkBuilder.growthFactor(growthFactor)
    }

    public fun growthType(growthType: String) {
        cdkBuilder.growthType(growthType)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun replicateTo(replicateTo: String) {
        cdkBuilder.replicateTo(replicateTo)
    }

    public fun tags(tags: CfnDeploymentStrategyTagsPropertyDsl.() -> Unit) {
        _tags.add(CfnDeploymentStrategyTagsPropertyDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnDeploymentStrategy.TagsProperty>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDeploymentStrategyProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}

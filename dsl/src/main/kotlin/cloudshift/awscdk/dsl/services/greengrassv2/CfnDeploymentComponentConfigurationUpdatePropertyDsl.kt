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

package cloudshift.awscdk.dsl.services.greengrassv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.greengrassv2.CfnDeployment
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDeploymentComponentConfigurationUpdatePropertyDsl {
    private val cdkBuilder: CfnDeployment.ComponentConfigurationUpdateProperty.Builder =
        CfnDeployment.ComponentConfigurationUpdateProperty.builder()

    private val _reset: MutableList<String> = mutableListOf()

    public fun merge(merge: String) {
        cdkBuilder.merge(merge)
    }

    public fun reset(vararg reset: String) {
        _reset.addAll(listOf(*reset))
    }

    public fun reset(reset: Collection<String>) {
        _reset.addAll(reset)
    }

    public fun build(): CfnDeployment.ComponentConfigurationUpdateProperty {
        if (_reset.isNotEmpty()) cdkBuilder.reset(_reset)
        return cdkBuilder.build()
    }
}

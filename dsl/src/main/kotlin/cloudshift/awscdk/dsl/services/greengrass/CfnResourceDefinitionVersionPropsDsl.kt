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

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersionProps
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnResourceDefinitionVersionPropsDsl {
    private val cdkBuilder: CfnResourceDefinitionVersionProps.Builder =
        CfnResourceDefinitionVersionProps.builder()

    private val _resources: MutableList<Any> = mutableListOf()

    public fun resourceDefinitionId(resourceDefinitionId: String) {
        cdkBuilder.resourceDefinitionId(resourceDefinitionId)
    }

    public fun resources(vararg resources: Any) {
        _resources.addAll(listOf(*resources))
    }

    public fun resources(resources: Collection<Any>) {
        _resources.addAll(resources)
    }

    public fun resources(resources: IResolvable) {
        cdkBuilder.resources(resources)
    }

    public fun build(): CfnResourceDefinitionVersionProps {
        if (_resources.isNotEmpty()) cdkBuilder.resources(_resources)
        return cdkBuilder.build()
    }
}

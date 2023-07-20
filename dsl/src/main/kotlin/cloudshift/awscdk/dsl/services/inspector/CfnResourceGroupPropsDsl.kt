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

package cloudshift.awscdk.dsl.services.inspector

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.inspector.CfnResourceGroupProps
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnResourceGroupPropsDsl {
    private val cdkBuilder: CfnResourceGroupProps.Builder = CfnResourceGroupProps.builder()

    private val _resourceGroupTags: MutableList<Any> = mutableListOf()

    public fun resourceGroupTags(vararg resourceGroupTags: Any) {
        _resourceGroupTags.addAll(listOf(*resourceGroupTags))
    }

    public fun resourceGroupTags(resourceGroupTags: Collection<Any>) {
        _resourceGroupTags.addAll(resourceGroupTags)
    }

    public fun resourceGroupTags(resourceGroupTags: IResolvable) {
        cdkBuilder.resourceGroupTags(resourceGroupTags)
    }

    public fun build(): CfnResourceGroupProps {
        if (_resourceGroupTags.isNotEmpty()) cdkBuilder.resourceGroupTags(_resourceGroupTags)
        return cdkBuilder.build()
    }
}

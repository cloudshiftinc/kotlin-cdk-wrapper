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
import software.amazon.awscdk.services.inspector.CfnResourceGroup
import software.constructs.Construct
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnResourceGroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnResourceGroup.Builder = CfnResourceGroup.Builder.create(scope, id)

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

    public fun build(): CfnResourceGroup {
        if (_resourceGroupTags.isNotEmpty()) cdkBuilder.resourceGroupTags(_resourceGroupTags)
        return cdkBuilder.build()
    }
}

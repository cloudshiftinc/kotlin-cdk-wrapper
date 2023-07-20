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

package cloudshift.awscdk.dsl.services.resourcegroups

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.resourcegroups.CfnGroup
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnGroupQueryPropertyDsl {
    private val cdkBuilder: CfnGroup.QueryProperty.Builder = CfnGroup.QueryProperty.builder()

    private val _resourceTypeFilters: MutableList<String> = mutableListOf()

    private val _tagFilters: MutableList<Any> = mutableListOf()

    public fun resourceTypeFilters(vararg resourceTypeFilters: String) {
        _resourceTypeFilters.addAll(listOf(*resourceTypeFilters))
    }

    public fun resourceTypeFilters(resourceTypeFilters: Collection<String>) {
        _resourceTypeFilters.addAll(resourceTypeFilters)
    }

    public fun stackIdentifier(stackIdentifier: String) {
        cdkBuilder.stackIdentifier(stackIdentifier)
    }

    public fun tagFilters(vararg tagFilters: Any) {
        _tagFilters.addAll(listOf(*tagFilters))
    }

    public fun tagFilters(tagFilters: Collection<Any>) {
        _tagFilters.addAll(tagFilters)
    }

    public fun tagFilters(tagFilters: IResolvable) {
        cdkBuilder.tagFilters(tagFilters)
    }

    public fun build(): CfnGroup.QueryProperty {
        if (_resourceTypeFilters.isNotEmpty()) cdkBuilder.resourceTypeFilters(_resourceTypeFilters)
        if (_tagFilters.isNotEmpty()) cdkBuilder.tagFilters(_tagFilters)
        return cdkBuilder.build()
    }
}

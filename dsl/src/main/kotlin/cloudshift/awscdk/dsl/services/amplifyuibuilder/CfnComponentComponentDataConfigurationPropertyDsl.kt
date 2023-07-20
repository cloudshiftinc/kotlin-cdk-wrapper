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

package cloudshift.awscdk.dsl.services.amplifyuibuilder

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplifyuibuilder.CfnComponent
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnComponentComponentDataConfigurationPropertyDsl {
    private val cdkBuilder: CfnComponent.ComponentDataConfigurationProperty.Builder =
        CfnComponent.ComponentDataConfigurationProperty.builder()

    private val _identifiers: MutableList<String> = mutableListOf()

    private val _sort: MutableList<Any> = mutableListOf()

    public fun identifiers(vararg identifiers: String) {
        _identifiers.addAll(listOf(*identifiers))
    }

    public fun identifiers(identifiers: Collection<String>) {
        _identifiers.addAll(identifiers)
    }

    public fun model(model: String) {
        cdkBuilder.model(model)
    }

    public fun predicate(predicate: IResolvable) {
        cdkBuilder.predicate(predicate)
    }

    public fun predicate(predicate: CfnComponent.PredicateProperty) {
        cdkBuilder.predicate(predicate)
    }

    public fun sort(vararg sort: Any) {
        _sort.addAll(listOf(*sort))
    }

    public fun sort(sort: Collection<Any>) {
        _sort.addAll(sort)
    }

    public fun sort(sort: IResolvable) {
        cdkBuilder.sort(sort)
    }

    public fun build(): CfnComponent.ComponentDataConfigurationProperty {
        if (_identifiers.isNotEmpty()) cdkBuilder.identifiers(_identifiers)
        if (_sort.isNotEmpty()) cdkBuilder.sort(_sort)
        return cdkBuilder.build()
    }
}

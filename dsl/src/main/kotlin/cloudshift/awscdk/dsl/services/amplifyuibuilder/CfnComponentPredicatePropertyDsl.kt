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
public class CfnComponentPredicatePropertyDsl {
    private val cdkBuilder: CfnComponent.PredicateProperty.Builder =
        CfnComponent.PredicateProperty.builder()

    private val _and: MutableList<Any> = mutableListOf()

    private val _or: MutableList<Any> = mutableListOf()

    public fun and(vararg and: Any) {
        _and.addAll(listOf(*and))
    }

    public fun and(and: Collection<Any>) {
        _and.addAll(and)
    }

    public fun and(and: IResolvable) {
        cdkBuilder.and(and)
    }

    public fun `field`(`field`: String) {
        cdkBuilder.`field`(`field`)
    }

    public fun operand(operand: String) {
        cdkBuilder.operand(operand)
    }

    public fun `operator`(`operator`: String) {
        cdkBuilder.`operator`(`operator`)
    }

    public fun or(vararg or: Any) {
        _or.addAll(listOf(*or))
    }

    public fun or(or: Collection<Any>) {
        _or.addAll(or)
    }

    public fun or(or: IResolvable) {
        cdkBuilder.or(or)
    }

    public fun build(): CfnComponent.PredicateProperty {
        if (_and.isNotEmpty()) cdkBuilder.and(_and)
        if (_or.isNotEmpty()) cdkBuilder.or(_or)
        return cdkBuilder.build()
    }
}

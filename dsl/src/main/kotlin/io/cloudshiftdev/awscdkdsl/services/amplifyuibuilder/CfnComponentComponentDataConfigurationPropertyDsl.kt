@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.amplifyuibuilder

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplifyuibuilder.CfnComponent

/**
 * The `ComponentDataConfiguration` property specifies the configuration for binding a component's
 * properties to data.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.amplifyuibuilder.*;
 * PredicateProperty predicateProperty_;
 * ComponentDataConfigurationProperty componentDataConfigurationProperty =
 * ComponentDataConfigurationProperty.builder()
 * .model("model")
 * // the properties below are optional
 * .identifiers(List.of("identifiers"))
 * .predicate(PredicateProperty.builder()
 * .and(List.of(predicateProperty_))
 * .field("field")
 * .operand("operand")
 * .operandType("operandType")
 * .operator("operator")
 * .or(List.of(predicateProperty_))
 * .build())
 * .sort(List.of(SortPropertyProperty.builder()
 * .direction("direction")
 * .field("field")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentdataconfiguration.html)
 */
@CdkDslMarker
public class CfnComponentComponentDataConfigurationPropertyDsl {
    private val cdkBuilder: CfnComponent.ComponentDataConfigurationProperty.Builder =
        CfnComponent.ComponentDataConfigurationProperty.builder()

    private val _identifiers: MutableList<String> = mutableListOf()

    private val _sort: MutableList<Any> = mutableListOf()

    /**
     * @param identifiers A list of IDs to use to bind data to a component. Use this property to
     *   bind specifically chosen data, rather than data retrieved from a query.
     */
    public fun identifiers(vararg identifiers: String) {
        _identifiers.addAll(listOf(*identifiers))
    }

    /**
     * @param identifiers A list of IDs to use to bind data to a component. Use this property to
     *   bind specifically chosen data, rather than data retrieved from a query.
     */
    public fun identifiers(identifiers: Collection<String>) {
        _identifiers.addAll(identifiers)
    }

    /** @param model The name of the data model to use to bind data to a component. */
    public fun model(model: String) {
        cdkBuilder.model(model)
    }

    /**
     * @param predicate Represents the conditional logic to use when binding data to a component.
     *   Use this property to retrieve only a subset of the data in a collection.
     */
    public fun predicate(predicate: IResolvable) {
        cdkBuilder.predicate(predicate)
    }

    /**
     * @param predicate Represents the conditional logic to use when binding data to a component.
     *   Use this property to retrieve only a subset of the data in a collection.
     */
    public fun predicate(predicate: CfnComponent.PredicateProperty) {
        cdkBuilder.predicate(predicate)
    }

    /** @param sort Describes how to sort the component's properties. */
    public fun sort(vararg sort: Any) {
        _sort.addAll(listOf(*sort))
    }

    /** @param sort Describes how to sort the component's properties. */
    public fun sort(sort: Collection<Any>) {
        _sort.addAll(sort)
    }

    /** @param sort Describes how to sort the component's properties. */
    public fun sort(sort: IResolvable) {
        cdkBuilder.sort(sort)
    }

    public fun build(): CfnComponent.ComponentDataConfigurationProperty {
        if (_identifiers.isNotEmpty()) cdkBuilder.identifiers(_identifiers)
        if (_sort.isNotEmpty()) cdkBuilder.sort(_sort)
        return cdkBuilder.build()
    }
}

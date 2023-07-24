@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList

/**
 * The default values of the `IntegerParameterDeclaration` .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * IntegerDefaultValuesProperty integerDefaultValuesProperty =
 * IntegerDefaultValuesProperty.builder()
 * .dynamicValue(DynamicDefaultValueProperty.builder()
 * .defaultValueColumn(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * // the properties below are optional
 * .groupNameColumn(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .userNameColumn(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .build())
 * .staticValues(List.of(123))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-integerdefaultvalues.html)
 */
@CdkDslMarker
public class CfnTemplateIntegerDefaultValuesPropertyDsl {
    private val cdkBuilder: CfnTemplate.IntegerDefaultValuesProperty.Builder =
        CfnTemplate.IntegerDefaultValuesProperty.builder()

    private val _staticValues: MutableList<Number> = mutableListOf()

    /**
     * @param dynamicValue The dynamic value of the `IntegerDefaultValues` .
     * Different defaults are displayed according to users, groups, and values mapping.
     */
    public fun dynamicValue(dynamicValue: IResolvable) {
        cdkBuilder.dynamicValue(dynamicValue)
    }

    /**
     * @param dynamicValue The dynamic value of the `IntegerDefaultValues` .
     * Different defaults are displayed according to users, groups, and values mapping.
     */
    public fun dynamicValue(dynamicValue: CfnTemplate.DynamicDefaultValueProperty) {
        cdkBuilder.dynamicValue(dynamicValue)
    }

    /**
     * @param staticValues The static values of the `IntegerDefaultValues` .
     */
    public fun staticValues(vararg staticValues: Number) {
        _staticValues.addAll(listOf(*staticValues))
    }

    /**
     * @param staticValues The static values of the `IntegerDefaultValues` .
     */
    public fun staticValues(staticValues: Collection<Number>) {
        _staticValues.addAll(staticValues)
    }

    /**
     * @param staticValues The static values of the `IntegerDefaultValues` .
     */
    public fun staticValues(staticValues: IResolvable) {
        cdkBuilder.staticValues(staticValues)
    }

    public fun build(): CfnTemplate.IntegerDefaultValuesProperty {
        if (_staticValues.isNotEmpty()) cdkBuilder.staticValues(_staticValues)
        return cdkBuilder.build()
    }
}

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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The declaration definition of a parameter.
 *
 * For more information, see
 * [Parameters in Amazon QuickSight](https://docs.aws.amazon.com/quicksight/latest/user/parameters-in-quicksight.html)
 * in the *Amazon QuickSight User Guide* .
 *
 * This is a union type structure. For this structure to be valid, only one of the attributes can be
 * defined.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ParameterDeclarationProperty parameterDeclarationProperty =
 * ParameterDeclarationProperty.builder()
 * .dateTimeParameterDeclaration(DateTimeParameterDeclarationProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .defaultValues(DateTimeDefaultValuesProperty.builder()
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
 * .rollingDate(RollingDateConfigurationProperty.builder()
 * .expression("expression")
 * // the properties below are optional
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .staticValues(List.of("staticValues"))
 * .build())
 * .mappedDataSetParameters(List.of(MappedDataSetParameterProperty.builder()
 * .dataSetIdentifier("dataSetIdentifier")
 * .dataSetParameterName("dataSetParameterName")
 * .build()))
 * .timeGranularity("timeGranularity")
 * .valueWhenUnset(DateTimeValueWhenUnsetConfigurationProperty.builder()
 * .customValue("customValue")
 * .valueWhenUnsetOption("valueWhenUnsetOption")
 * .build())
 * .build())
 * .decimalParameterDeclaration(DecimalParameterDeclarationProperty.builder()
 * .name("name")
 * .parameterValueType("parameterValueType")
 * // the properties below are optional
 * .defaultValues(DecimalDefaultValuesProperty.builder()
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
 * .build())
 * .mappedDataSetParameters(List.of(MappedDataSetParameterProperty.builder()
 * .dataSetIdentifier("dataSetIdentifier")
 * .dataSetParameterName("dataSetParameterName")
 * .build()))
 * .valueWhenUnset(DecimalValueWhenUnsetConfigurationProperty.builder()
 * .customValue(123)
 * .valueWhenUnsetOption("valueWhenUnsetOption")
 * .build())
 * .build())
 * .integerParameterDeclaration(IntegerParameterDeclarationProperty.builder()
 * .name("name")
 * .parameterValueType("parameterValueType")
 * // the properties below are optional
 * .defaultValues(IntegerDefaultValuesProperty.builder()
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
 * .build())
 * .mappedDataSetParameters(List.of(MappedDataSetParameterProperty.builder()
 * .dataSetIdentifier("dataSetIdentifier")
 * .dataSetParameterName("dataSetParameterName")
 * .build()))
 * .valueWhenUnset(IntegerValueWhenUnsetConfigurationProperty.builder()
 * .customValue(123)
 * .valueWhenUnsetOption("valueWhenUnsetOption")
 * .build())
 * .build())
 * .stringParameterDeclaration(StringParameterDeclarationProperty.builder()
 * .name("name")
 * .parameterValueType("parameterValueType")
 * // the properties below are optional
 * .defaultValues(StringDefaultValuesProperty.builder()
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
 * .staticValues(List.of("staticValues"))
 * .build())
 * .mappedDataSetParameters(List.of(MappedDataSetParameterProperty.builder()
 * .dataSetIdentifier("dataSetIdentifier")
 * .dataSetParameterName("dataSetParameterName")
 * .build()))
 * .valueWhenUnset(StringValueWhenUnsetConfigurationProperty.builder()
 * .customValue("customValue")
 * .valueWhenUnsetOption("valueWhenUnsetOption")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-parameterdeclaration.html)
 */
@CdkDslMarker
public class CfnAnalysisParameterDeclarationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.ParameterDeclarationProperty.Builder =
        CfnAnalysis.ParameterDeclarationProperty.builder()

    /** @param dateTimeParameterDeclaration A parameter declaration for the `DateTime` data type. */
    public fun dateTimeParameterDeclaration(dateTimeParameterDeclaration: IResolvable) {
        cdkBuilder.dateTimeParameterDeclaration(dateTimeParameterDeclaration)
    }

    /** @param dateTimeParameterDeclaration A parameter declaration for the `DateTime` data type. */
    public fun dateTimeParameterDeclaration(
        dateTimeParameterDeclaration: CfnAnalysis.DateTimeParameterDeclarationProperty
    ) {
        cdkBuilder.dateTimeParameterDeclaration(dateTimeParameterDeclaration)
    }

    /** @param decimalParameterDeclaration A parameter declaration for the `Decimal` data type. */
    public fun decimalParameterDeclaration(decimalParameterDeclaration: IResolvable) {
        cdkBuilder.decimalParameterDeclaration(decimalParameterDeclaration)
    }

    /** @param decimalParameterDeclaration A parameter declaration for the `Decimal` data type. */
    public fun decimalParameterDeclaration(
        decimalParameterDeclaration: CfnAnalysis.DecimalParameterDeclarationProperty
    ) {
        cdkBuilder.decimalParameterDeclaration(decimalParameterDeclaration)
    }

    /** @param integerParameterDeclaration A parameter declaration for the `Integer` data type. */
    public fun integerParameterDeclaration(integerParameterDeclaration: IResolvable) {
        cdkBuilder.integerParameterDeclaration(integerParameterDeclaration)
    }

    /** @param integerParameterDeclaration A parameter declaration for the `Integer` data type. */
    public fun integerParameterDeclaration(
        integerParameterDeclaration: CfnAnalysis.IntegerParameterDeclarationProperty
    ) {
        cdkBuilder.integerParameterDeclaration(integerParameterDeclaration)
    }

    /** @param stringParameterDeclaration A parameter declaration for the `String` data type. */
    public fun stringParameterDeclaration(stringParameterDeclaration: IResolvable) {
        cdkBuilder.stringParameterDeclaration(stringParameterDeclaration)
    }

    /** @param stringParameterDeclaration A parameter declaration for the `String` data type. */
    public fun stringParameterDeclaration(
        stringParameterDeclaration: CfnAnalysis.StringParameterDeclarationProperty
    ) {
        cdkBuilder.stringParameterDeclaration(stringParameterDeclaration)
    }

    public fun build(): CfnAnalysis.ParameterDeclarationProperty = cdkBuilder.build()
}

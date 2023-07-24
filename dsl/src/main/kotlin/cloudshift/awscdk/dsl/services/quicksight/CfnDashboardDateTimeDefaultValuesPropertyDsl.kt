@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

/**
 * The default values of the `DateTimeParameterDeclaration` .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DateTimeDefaultValuesProperty dateTimeDefaultValuesProperty =
 * DateTimeDefaultValuesProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-datetimedefaultvalues.html)
 */
@CdkDslMarker
public class CfnDashboardDateTimeDefaultValuesPropertyDsl {
    private val cdkBuilder: CfnDashboard.DateTimeDefaultValuesProperty.Builder =
        CfnDashboard.DateTimeDefaultValuesProperty.builder()

    private val _staticValues: MutableList<String> = mutableListOf()

    /**
     * @param dynamicValue The dynamic value of the `DataTimeDefaultValues` .
     * Different defaults are displayed according to users, groups, and values mapping.
     */
    public fun dynamicValue(dynamicValue: IResolvable) {
        cdkBuilder.dynamicValue(dynamicValue)
    }

    /**
     * @param dynamicValue The dynamic value of the `DataTimeDefaultValues` .
     * Different defaults are displayed according to users, groups, and values mapping.
     */
    public fun dynamicValue(dynamicValue: CfnDashboard.DynamicDefaultValueProperty) {
        cdkBuilder.dynamicValue(dynamicValue)
    }

    /**
     * @param rollingDate The rolling date of the `DataTimeDefaultValues` .
     * The date is determined from the dataset based on input expression.
     */
    public fun rollingDate(rollingDate: IResolvable) {
        cdkBuilder.rollingDate(rollingDate)
    }

    /**
     * @param rollingDate The rolling date of the `DataTimeDefaultValues` .
     * The date is determined from the dataset based on input expression.
     */
    public fun rollingDate(rollingDate: CfnDashboard.RollingDateConfigurationProperty) {
        cdkBuilder.rollingDate(rollingDate)
    }

    /**
     * @param staticValues The static values of the `DataTimeDefaultValues` .
     */
    public fun staticValues(vararg staticValues: String) {
        _staticValues.addAll(listOf(*staticValues))
    }

    /**
     * @param staticValues The static values of the `DataTimeDefaultValues` .
     */
    public fun staticValues(staticValues: Collection<String>) {
        _staticValues.addAll(staticValues)
    }

    public fun build(): CfnDashboard.DateTimeDefaultValuesProperty {
        if (_staticValues.isNotEmpty()) cdkBuilder.staticValues(_staticValues)
        return cdkBuilder.build()
    }
}

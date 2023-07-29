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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The configuration of destination parameter values.
 *
 * This is a union type structure. For this structure to be valid, only one of the attributes can be
 * defined.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DestinationParameterValueConfigurationProperty destinationParameterValueConfigurationProperty =
 * DestinationParameterValueConfigurationProperty.builder()
 * .customValuesConfiguration(CustomValuesConfigurationProperty.builder()
 * .customValues(CustomParameterValuesProperty.builder()
 * .dateTimeValues(List.of("dateTimeValues"))
 * .decimalValues(List.of(123))
 * .integerValues(List.of(123))
 * .stringValues(List.of("stringValues"))
 * .build())
 * // the properties below are optional
 * .includeNullValue(false)
 * .build())
 * .selectAllValueOptions("selectAllValueOptions")
 * .sourceColumn(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .sourceField("sourceField")
 * .sourceParameterName("sourceParameterName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-destinationparametervalueconfiguration.html)
 */
@CdkDslMarker
public class CfnDashboardDestinationParameterValueConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.DestinationParameterValueConfigurationProperty.Builder =
        CfnDashboard.DestinationParameterValueConfigurationProperty.builder()

    /**
     * @param customValuesConfiguration The configuration of custom values for destination parameter
     *   in `DestinationParameterValueConfiguration` .
     */
    public fun customValuesConfiguration(customValuesConfiguration: IResolvable) {
        cdkBuilder.customValuesConfiguration(customValuesConfiguration)
    }

    /**
     * @param customValuesConfiguration The configuration of custom values for destination parameter
     *   in `DestinationParameterValueConfiguration` .
     */
    public fun customValuesConfiguration(
        customValuesConfiguration: CfnDashboard.CustomValuesConfigurationProperty
    ) {
        cdkBuilder.customValuesConfiguration(customValuesConfiguration)
    }

    /** @param selectAllValueOptions The configuration that selects all options. */
    public fun selectAllValueOptions(selectAllValueOptions: String) {
        cdkBuilder.selectAllValueOptions(selectAllValueOptions)
    }

    /** @param sourceColumn the value to be set. */
    public fun sourceColumn(sourceColumn: IResolvable) {
        cdkBuilder.sourceColumn(sourceColumn)
    }

    /** @param sourceColumn the value to be set. */
    public fun sourceColumn(sourceColumn: CfnDashboard.ColumnIdentifierProperty) {
        cdkBuilder.sourceColumn(sourceColumn)
    }

    /** @param sourceField The source field ID of the destination parameter. */
    public fun sourceField(sourceField: String) {
        cdkBuilder.sourceField(sourceField)
    }

    /** @param sourceParameterName The source parameter name of the destination parameter. */
    public fun sourceParameterName(sourceParameterName: String) {
        cdkBuilder.sourceParameterName(sourceParameterName)
    }

    public fun build(): CfnDashboard.DestinationParameterValueConfigurationProperty =
        cdkBuilder.build()
}

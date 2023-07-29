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
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The set parameter operation that sets parameters in custom action.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * CustomActionSetParametersOperationProperty customActionSetParametersOperationProperty =
 * CustomActionSetParametersOperationProperty.builder()
 * .parameterValueConfigurations(List.of(SetParameterValueConfigurationProperty.builder()
 * .destinationParameterName("destinationParameterName")
 * .value(DestinationParameterValueConfigurationProperty.builder()
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
 * .build())
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-customactionsetparametersoperation.html)
 */
@CdkDslMarker
public class CfnTemplateCustomActionSetParametersOperationPropertyDsl {
    private val cdkBuilder: CfnTemplate.CustomActionSetParametersOperationProperty.Builder =
        CfnTemplate.CustomActionSetParametersOperationProperty.builder()

    private val _parameterValueConfigurations: MutableList<Any> = mutableListOf()

    /**
     * @param parameterValueConfigurations The parameter that determines the value configuration.
     */
    public fun parameterValueConfigurations(vararg parameterValueConfigurations: Any) {
        _parameterValueConfigurations.addAll(listOf(*parameterValueConfigurations))
    }

    /**
     * @param parameterValueConfigurations The parameter that determines the value configuration.
     */
    public fun parameterValueConfigurations(parameterValueConfigurations: Collection<Any>) {
        _parameterValueConfigurations.addAll(parameterValueConfigurations)
    }

    /**
     * @param parameterValueConfigurations The parameter that determines the value configuration.
     */
    public fun parameterValueConfigurations(parameterValueConfigurations: IResolvable) {
        cdkBuilder.parameterValueConfigurations(parameterValueConfigurations)
    }

    public fun build(): CfnTemplate.CustomActionSetParametersOperationProperty {
        if (_parameterValueConfigurations.isNotEmpty())
            cdkBuilder.parameterValueConfigurations(_parameterValueConfigurations)
        return cdkBuilder.build()
    }
}

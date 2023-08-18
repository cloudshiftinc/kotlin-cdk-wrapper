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

package io.cloudshiftdev.awscdkdsl.services.lightsail

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lightsail.CfnDatabase

/**
 * `RelationalDatabaseParameter` is a property of the
 * [AWS::Lightsail::Database](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html)
 * resource. It describes parameters for the database.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lightsail.*;
 * RelationalDatabaseParameterProperty relationalDatabaseParameterProperty =
 * RelationalDatabaseParameterProperty.builder()
 * .allowedValues("allowedValues")
 * .applyMethod("applyMethod")
 * .applyType("applyType")
 * .dataType("dataType")
 * .description("description")
 * .isModifiable(false)
 * .parameterName("parameterName")
 * .parameterValue("parameterValue")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-database-relationaldatabaseparameter.html)
 */
@CdkDslMarker
public class CfnDatabaseRelationalDatabaseParameterPropertyDsl {
    private val cdkBuilder: CfnDatabase.RelationalDatabaseParameterProperty.Builder =
        CfnDatabase.RelationalDatabaseParameterProperty.builder()

    /** @param allowedValues The valid range of values for the parameter. */
    public fun allowedValues(allowedValues: String) {
        cdkBuilder.allowedValues(allowedValues)
    }

    /**
     * @param applyMethod Indicates when parameter updates are applied. Can be `immediate` or
     *   `pending-reboot` .
     */
    public fun applyMethod(applyMethod: String) {
        cdkBuilder.applyMethod(applyMethod)
    }

    /** @param applyType Specifies the engine-specific parameter type. */
    public fun applyType(applyType: String) {
        cdkBuilder.applyType(applyType)
    }

    /** @param dataType The valid data type of the parameter. */
    public fun dataType(dataType: String) {
        cdkBuilder.dataType(dataType)
    }

    /** @param description A description of the parameter. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param isModifiable A Boolean value indicating whether the parameter can be modified. */
    public fun isModifiable(isModifiable: Boolean) {
        cdkBuilder.isModifiable(isModifiable)
    }

    /** @param isModifiable A Boolean value indicating whether the parameter can be modified. */
    public fun isModifiable(isModifiable: IResolvable) {
        cdkBuilder.isModifiable(isModifiable)
    }

    /** @param parameterName The name of the parameter. */
    public fun parameterName(parameterName: String) {
        cdkBuilder.parameterName(parameterName)
    }

    /** @param parameterValue The value for the parameter. */
    public fun parameterValue(parameterValue: String) {
        cdkBuilder.parameterValue(parameterValue)
    }

    public fun build(): CfnDatabase.RelationalDatabaseParameterProperty = cdkBuilder.build()
}

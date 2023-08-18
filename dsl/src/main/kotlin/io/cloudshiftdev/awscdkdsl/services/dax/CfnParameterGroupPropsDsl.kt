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

package io.cloudshiftdev.awscdkdsl.services.dax

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.dax.CfnParameterGroupProps

/**
 * Properties for defining a `CfnParameterGroup`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dax.*;
 * Object parameterNameValues;
 * CfnParameterGroupProps cfnParameterGroupProps = CfnParameterGroupProps.builder()
 * .description("description")
 * .parameterGroupName("parameterGroupName")
 * .parameterNameValues(parameterNameValues)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-parametergroup.html)
 */
@CdkDslMarker
public class CfnParameterGroupPropsDsl {
    private val cdkBuilder: CfnParameterGroupProps.Builder = CfnParameterGroupProps.builder()

    /** @param description A description of the parameter group. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param parameterGroupName The name of the parameter group. */
    public fun parameterGroupName(parameterGroupName: String) {
        cdkBuilder.parameterGroupName(parameterGroupName)
    }

    /**
     * @param parameterNameValues An array of name-value pairs for the parameters in the group. Each
     *   element in the array represents a single parameter.
     *
     * `record-ttl-millis` and `query-ttl-millis` are the only supported parameter names. For more
     * details, see
     * [Configuring TTL Settings](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DAX.cluster-management.html#DAX.cluster-management.custom-settings.ttl)
     * .
     */
    public fun parameterNameValues(parameterNameValues: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(parameterNameValues)
        cdkBuilder.parameterNameValues(builder.map)
    }

    /**
     * @param parameterNameValues An array of name-value pairs for the parameters in the group. Each
     *   element in the array represents a single parameter.
     *
     * `record-ttl-millis` and `query-ttl-millis` are the only supported parameter names. For more
     * details, see
     * [Configuring TTL Settings](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DAX.cluster-management.html#DAX.cluster-management.custom-settings.ttl)
     * .
     */
    public fun parameterNameValues(parameterNameValues: Any) {
        cdkBuilder.parameterNameValues(parameterNameValues)
    }

    public fun build(): CfnParameterGroupProps = cdkBuilder.build()
}

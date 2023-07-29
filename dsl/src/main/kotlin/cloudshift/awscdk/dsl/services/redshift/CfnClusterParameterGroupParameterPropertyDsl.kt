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

package cloudshift.awscdk.dsl.services.redshift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.redshift.CfnClusterParameterGroup

/**
 * Describes a parameter in a cluster parameter group.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.redshift.*;
 * ParameterProperty parameterProperty = ParameterProperty.builder()
 * .parameterName("parameterName")
 * .parameterValue("parameterValue")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-clusterparametergroup-parameter.html)
 */
@CdkDslMarker
public class CfnClusterParameterGroupParameterPropertyDsl {
    private val cdkBuilder: CfnClusterParameterGroup.ParameterProperty.Builder =
        CfnClusterParameterGroup.ParameterProperty.builder()

    /** @param parameterName The name of the parameter. */
    public fun parameterName(parameterName: String) {
        cdkBuilder.parameterName(parameterName)
    }

    /**
     * @param parameterValue The value of the parameter. If `ParameterName` is
     *   `wlm_json_configuration` , then the maximum size of `ParameterValue` is 8000 characters.
     */
    public fun parameterValue(parameterValue: String) {
        cdkBuilder.parameterValue(parameterValue)
    }

    public fun build(): CfnClusterParameterGroup.ParameterProperty = cdkBuilder.build()
}

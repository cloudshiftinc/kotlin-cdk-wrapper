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

package io.cloudshiftdev.awscdkdsl.services.redshiftserverless

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup

/**
 * A array of parameters to set for more control over a serverless database.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.redshiftserverless.*;
 * ConfigParameterProperty configParameterProperty = ConfigParameterProperty.builder()
 * .parameterKey("parameterKey")
 * .parameterValue("parameterValue")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-configparameter.html)
 */
@CdkDslMarker
public class CfnWorkgroupConfigParameterPropertyDsl {
    private val cdkBuilder: CfnWorkgroup.ConfigParameterProperty.Builder =
        CfnWorkgroup.ConfigParameterProperty.builder()

    /**
     * @param parameterKey The key of the parameter. The options are `datestyle` ,
     *   `enable_user_activity_logging` , `query_group` , `search_path` , `max_query_execution_time`
     *   , and `require_ssl` .
     */
    public fun parameterKey(parameterKey: String) {
        cdkBuilder.parameterKey(parameterKey)
    }

    /** @param parameterValue The value of the parameter to set. */
    public fun parameterValue(parameterValue: String) {
        cdkBuilder.parameterValue(parameterValue)
    }

    public fun build(): CfnWorkgroup.ConfigParameterProperty = cdkBuilder.build()
}

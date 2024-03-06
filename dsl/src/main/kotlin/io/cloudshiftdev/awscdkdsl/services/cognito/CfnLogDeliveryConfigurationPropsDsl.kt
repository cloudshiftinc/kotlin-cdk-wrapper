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

package io.cloudshiftdev.awscdkdsl.services.cognito

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cognito.CfnLogDeliveryConfigurationProps

/**
 * Properties for defining a `CfnLogDeliveryConfiguration`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
 * CfnLogDeliveryConfigurationProps cfnLogDeliveryConfigurationProps =
 * CfnLogDeliveryConfigurationProps.builder()
 * .userPoolId("userPoolId")
 * // the properties below are optional
 * .logConfigurations(List.of(LogConfigurationProperty.builder()
 * .cloudWatchLogsConfiguration(CloudWatchLogsConfigurationProperty.builder()
 * .logGroupArn("logGroupArn")
 * .build())
 * .eventSource("eventSource")
 * .logLevel("logLevel")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-logdeliveryconfiguration.html)
 */
@CdkDslMarker
public class CfnLogDeliveryConfigurationPropsDsl {
    private val cdkBuilder: CfnLogDeliveryConfigurationProps.Builder =
        CfnLogDeliveryConfigurationProps.builder()

    private val _logConfigurations: MutableList<Any> = mutableListOf()

    /** @param logConfigurations The detailed activity logging destination of a user pool. */
    public fun logConfigurations(vararg logConfigurations: Any) {
        _logConfigurations.addAll(listOf(*logConfigurations))
    }

    /** @param logConfigurations The detailed activity logging destination of a user pool. */
    public fun logConfigurations(logConfigurations: Collection<Any>) {
        _logConfigurations.addAll(logConfigurations)
    }

    /** @param logConfigurations The detailed activity logging destination of a user pool. */
    public fun logConfigurations(logConfigurations: IResolvable) {
        cdkBuilder.logConfigurations(logConfigurations)
    }

    /** @param userPoolId The ID of the user pool where you configured detailed activity logging. */
    public fun userPoolId(userPoolId: String) {
        cdkBuilder.userPoolId(userPoolId)
    }

    public fun build(): CfnLogDeliveryConfigurationProps {
        if (_logConfigurations.isNotEmpty()) cdkBuilder.logConfigurations(_logConfigurations)
        return cdkBuilder.build()
    }
}

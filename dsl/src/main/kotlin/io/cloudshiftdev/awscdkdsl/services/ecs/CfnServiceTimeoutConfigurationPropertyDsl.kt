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

package io.cloudshiftdev.awscdkdsl.services.ecs

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.ecs.CfnService

/**
 * An object that represents the timeout configurations for Service Connect.
 *
 * If `idleTimeout` is set to a time that is less than `perRequestTimeout` , the connection will
 * close when the `idleTimeout` is reached and not the `perRequestTimeout` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * TimeoutConfigurationProperty timeoutConfigurationProperty =
 * TimeoutConfigurationProperty.builder()
 * .idleTimeoutSeconds(123)
 * .perRequestTimeoutSeconds(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-timeoutconfiguration.html)
 */
@CdkDslMarker
public class CfnServiceTimeoutConfigurationPropertyDsl {
    private val cdkBuilder: CfnService.TimeoutConfigurationProperty.Builder =
        CfnService.TimeoutConfigurationProperty.builder()

    /**
     * @param idleTimeoutSeconds The amount of time in seconds a connection will stay active while
     *   idle. A value of `0` can be set to disable `idleTimeout` .
     *
     * The `idleTimeout` default for `HTTP` / `HTTP2` / `GRPC` is 5 minutes.
     *
     * The `idleTimeout` default for `TCP` is 1 hour.
     */
    public fun idleTimeoutSeconds(idleTimeoutSeconds: Number) {
        cdkBuilder.idleTimeoutSeconds(idleTimeoutSeconds)
    }

    /**
     * @param perRequestTimeoutSeconds The amount of time waiting for the upstream to respond with a
     *   complete response per request. A value of `0` can be set to disable `perRequestTimeout` .
     *   `perRequestTimeout` can only be set if Service Connect `appProtocol` isn't `TCP` . Only
     *   `idleTimeout` is allowed for `TCP` `appProtocol` .
     */
    public fun perRequestTimeoutSeconds(perRequestTimeoutSeconds: Number) {
        cdkBuilder.perRequestTimeoutSeconds(perRequestTimeoutSeconds)
    }

    public fun build(): CfnService.TimeoutConfigurationProperty = cdkBuilder.build()
}

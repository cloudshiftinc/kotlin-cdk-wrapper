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

package io.cloudshiftdev.awscdkdsl.services.apprunner

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apprunner.CfnService

/**
 * Describes the runtime configuration of an AWS App Runner service instance (scaling unit).
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apprunner.*;
 * InstanceConfigurationProperty instanceConfigurationProperty =
 * InstanceConfigurationProperty.builder()
 * .cpu("cpu")
 * .instanceRoleArn("instanceRoleArn")
 * .memory("memory")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-instanceconfiguration.html)
 */
@CdkDslMarker
public class CfnServiceInstanceConfigurationPropertyDsl {
    private val cdkBuilder: CfnService.InstanceConfigurationProperty.Builder =
        CfnService.InstanceConfigurationProperty.builder()

    /**
     * @param cpu The number of CPU units reserved for each instance of your App Runner service.
     *   Default: `1 vCPU`
     */
    public fun cpu(cpu: String) {
        cdkBuilder.cpu(cpu)
    }

    /**
     * @param instanceRoleArn The Amazon Resource Name (ARN) of an IAM role that provides
     *   permissions to your App Runner service. These are permissions that your code needs when it
     *   calls any AWS APIs.
     */
    public fun instanceRoleArn(instanceRoleArn: String) {
        cdkBuilder.instanceRoleArn(instanceRoleArn)
    }

    /**
     * @param memory The amount of memory, in MB or GB, reserved for each instance of your App
     *   Runner service. Default: `2 GB`
     */
    public fun memory(memory: String) {
        cdkBuilder.memory(memory)
    }

    public fun build(): CfnService.InstanceConfigurationProperty = cdkBuilder.build()
}

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
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apprunner.CfnService

/**
 * Describes the configuration that AWS App Runner uses to run an App Runner service using an image
 * pulled from a source image repository.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apprunner.*;
 * ImageConfigurationProperty imageConfigurationProperty = ImageConfigurationProperty.builder()
 * .port("port")
 * .runtimeEnvironmentSecrets(List.of(KeyValuePairProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .runtimeEnvironmentVariables(List.of(KeyValuePairProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .startCommand("startCommand")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-imageconfiguration.html)
 */
@CdkDslMarker
public class CfnServiceImageConfigurationPropertyDsl {
    private val cdkBuilder: CfnService.ImageConfigurationProperty.Builder =
        CfnService.ImageConfigurationProperty.builder()

    private val _runtimeEnvironmentSecrets: MutableList<Any> = mutableListOf()

    private val _runtimeEnvironmentVariables: MutableList<Any> = mutableListOf()

    /** @param port The port that your application listens to in the container. Default: `8080` */
    public fun port(port: String) {
        cdkBuilder.port(port)
    }

    /**
     * @param runtimeEnvironmentSecrets An array of key-value pairs representing the secrets and
     *   parameters that get referenced to your service as an environment variable. The supported
     *   values are either the full Amazon Resource Name (ARN) of the AWS Secrets Manager secret or
     *   the full ARN of the parameter in the AWS Systems Manager Parameter Store.
     * * If the AWS Systems Manager Parameter Store parameter exists in the same AWS Region as the
     *   service that you're launching, you can use either the full ARN or name of the secret. If
     *   the parameter exists in a different Region, then the full ARN must be specified.
     * * Currently, cross account referencing of AWS Systems Manager Parameter Store parameter is
     *   not supported.
     */
    public fun runtimeEnvironmentSecrets(vararg runtimeEnvironmentSecrets: Any) {
        _runtimeEnvironmentSecrets.addAll(listOf(*runtimeEnvironmentSecrets))
    }

    /**
     * @param runtimeEnvironmentSecrets An array of key-value pairs representing the secrets and
     *   parameters that get referenced to your service as an environment variable. The supported
     *   values are either the full Amazon Resource Name (ARN) of the AWS Secrets Manager secret or
     *   the full ARN of the parameter in the AWS Systems Manager Parameter Store.
     * * If the AWS Systems Manager Parameter Store parameter exists in the same AWS Region as the
     *   service that you're launching, you can use either the full ARN or name of the secret. If
     *   the parameter exists in a different Region, then the full ARN must be specified.
     * * Currently, cross account referencing of AWS Systems Manager Parameter Store parameter is
     *   not supported.
     */
    public fun runtimeEnvironmentSecrets(runtimeEnvironmentSecrets: Collection<Any>) {
        _runtimeEnvironmentSecrets.addAll(runtimeEnvironmentSecrets)
    }

    /**
     * @param runtimeEnvironmentSecrets An array of key-value pairs representing the secrets and
     *   parameters that get referenced to your service as an environment variable. The supported
     *   values are either the full Amazon Resource Name (ARN) of the AWS Secrets Manager secret or
     *   the full ARN of the parameter in the AWS Systems Manager Parameter Store.
     * * If the AWS Systems Manager Parameter Store parameter exists in the same AWS Region as the
     *   service that you're launching, you can use either the full ARN or name of the secret. If
     *   the parameter exists in a different Region, then the full ARN must be specified.
     * * Currently, cross account referencing of AWS Systems Manager Parameter Store parameter is
     *   not supported.
     */
    public fun runtimeEnvironmentSecrets(runtimeEnvironmentSecrets: IResolvable) {
        cdkBuilder.runtimeEnvironmentSecrets(runtimeEnvironmentSecrets)
    }

    /**
     * @param runtimeEnvironmentVariables Environment variables that are available to your running
     *   App Runner service. An array of key-value pairs.
     */
    public fun runtimeEnvironmentVariables(vararg runtimeEnvironmentVariables: Any) {
        _runtimeEnvironmentVariables.addAll(listOf(*runtimeEnvironmentVariables))
    }

    /**
     * @param runtimeEnvironmentVariables Environment variables that are available to your running
     *   App Runner service. An array of key-value pairs.
     */
    public fun runtimeEnvironmentVariables(runtimeEnvironmentVariables: Collection<Any>) {
        _runtimeEnvironmentVariables.addAll(runtimeEnvironmentVariables)
    }

    /**
     * @param runtimeEnvironmentVariables Environment variables that are available to your running
     *   App Runner service. An array of key-value pairs.
     */
    public fun runtimeEnvironmentVariables(runtimeEnvironmentVariables: IResolvable) {
        cdkBuilder.runtimeEnvironmentVariables(runtimeEnvironmentVariables)
    }

    /**
     * @param startCommand An optional command that App Runner runs to start the application in the
     *   source image. If specified, this command overrides the Docker image’s default start
     *   command.
     */
    public fun startCommand(startCommand: String) {
        cdkBuilder.startCommand(startCommand)
    }

    public fun build(): CfnService.ImageConfigurationProperty {
        if (_runtimeEnvironmentSecrets.isNotEmpty())
            cdkBuilder.runtimeEnvironmentSecrets(_runtimeEnvironmentSecrets)
        if (_runtimeEnvironmentVariables.isNotEmpty())
            cdkBuilder.runtimeEnvironmentVariables(_runtimeEnvironmentVariables)
        return cdkBuilder.build()
    }
}

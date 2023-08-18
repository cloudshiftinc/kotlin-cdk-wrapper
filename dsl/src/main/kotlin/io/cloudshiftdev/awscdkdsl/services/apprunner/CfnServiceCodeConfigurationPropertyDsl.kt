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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apprunner.CfnService

/**
 * Describes the configuration that AWS App Runner uses to build and run an App Runner service from
 * a source code repository.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apprunner.*;
 * CodeConfigurationProperty codeConfigurationProperty = CodeConfigurationProperty.builder()
 * .configurationSource("configurationSource")
 * // the properties below are optional
 * .codeConfigurationValues(CodeConfigurationValuesProperty.builder()
 * .runtime("runtime")
 * // the properties below are optional
 * .buildCommand("buildCommand")
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
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-codeconfiguration.html)
 */
@CdkDslMarker
public class CfnServiceCodeConfigurationPropertyDsl {
    private val cdkBuilder: CfnService.CodeConfigurationProperty.Builder =
        CfnService.CodeConfigurationProperty.builder()

    /**
     * @param codeConfigurationValues The basic configuration for building and running the App
     *   Runner service. Use it to quickly launch an App Runner service without providing a
     *   `apprunner.yaml` file in the source code repository (or ignoring the file if it exists).
     */
    public fun codeConfigurationValues(codeConfigurationValues: IResolvable) {
        cdkBuilder.codeConfigurationValues(codeConfigurationValues)
    }

    /**
     * @param codeConfigurationValues The basic configuration for building and running the App
     *   Runner service. Use it to quickly launch an App Runner service without providing a
     *   `apprunner.yaml` file in the source code repository (or ignoring the file if it exists).
     */
    public fun codeConfigurationValues(
        codeConfigurationValues: CfnService.CodeConfigurationValuesProperty
    ) {
        cdkBuilder.codeConfigurationValues(codeConfigurationValues)
    }

    /**
     * @param configurationSource The source of the App Runner configuration. Values are interpreted
     *   as follows:.
     * * `REPOSITORY` – App Runner reads configuration values from the `apprunner.yaml` file in the
     *   source code repository and ignores `CodeConfigurationValues` .
     * * `API` – App Runner uses configuration values provided in `CodeConfigurationValues` and
     *   ignores the `apprunner.yaml` file in the source code repository.
     */
    public fun configurationSource(configurationSource: String) {
        cdkBuilder.configurationSource(configurationSource)
    }

    public fun build(): CfnService.CodeConfigurationProperty = cdkBuilder.build()
}

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
 * Describes a source code repository.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apprunner.*;
 * CodeRepositoryProperty codeRepositoryProperty = CodeRepositoryProperty.builder()
 * .repositoryUrl("repositoryUrl")
 * .sourceCodeVersion(SourceCodeVersionProperty.builder()
 * .type("type")
 * .value("value")
 * .build())
 * // the properties below are optional
 * .codeConfiguration(CodeConfigurationProperty.builder()
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
 * .build())
 * .sourceDirectory("sourceDirectory")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-coderepository.html)
 */
@CdkDslMarker
public class CfnServiceCodeRepositoryPropertyDsl {
    private val cdkBuilder: CfnService.CodeRepositoryProperty.Builder =
        CfnService.CodeRepositoryProperty.builder()

    /**
     * @param codeConfiguration Configuration for building and running the service from a source
     *   code repository.
     *
     * `CodeConfiguration` is required only for `CreateService` request.
     */
    public fun codeConfiguration(codeConfiguration: IResolvable) {
        cdkBuilder.codeConfiguration(codeConfiguration)
    }

    /**
     * @param codeConfiguration Configuration for building and running the service from a source
     *   code repository.
     *
     * `CodeConfiguration` is required only for `CreateService` request.
     */
    public fun codeConfiguration(codeConfiguration: CfnService.CodeConfigurationProperty) {
        cdkBuilder.codeConfiguration(codeConfiguration)
    }

    /** @param repositoryUrl The location of the repository that contains the source code. */
    public fun repositoryUrl(repositoryUrl: String) {
        cdkBuilder.repositoryUrl(repositoryUrl)
    }

    /**
     * @param sourceCodeVersion The version that should be used within the source code repository.
     */
    public fun sourceCodeVersion(sourceCodeVersion: IResolvable) {
        cdkBuilder.sourceCodeVersion(sourceCodeVersion)
    }

    /**
     * @param sourceCodeVersion The version that should be used within the source code repository.
     */
    public fun sourceCodeVersion(sourceCodeVersion: CfnService.SourceCodeVersionProperty) {
        cdkBuilder.sourceCodeVersion(sourceCodeVersion)
    }

    /**
     * @param sourceDirectory The path of the directory that stores source code and configuration
     *   files. The build and start commands also execute from here. The path is absolute from root
     *   and, if not specified, defaults to the repository root.
     */
    public fun sourceDirectory(sourceDirectory: String) {
        cdkBuilder.sourceDirectory(sourceDirectory)
    }

    public fun build(): CfnService.CodeRepositoryProperty = cdkBuilder.build()
}

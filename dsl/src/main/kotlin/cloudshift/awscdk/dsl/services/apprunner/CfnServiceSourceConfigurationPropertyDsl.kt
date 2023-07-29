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

package cloudshift.awscdk.dsl.services.apprunner

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apprunner.CfnService

/**
 * Describes the source deployed to an AWS App Runner service.
 *
 * It can be a code or an image repository.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apprunner.*;
 * SourceConfigurationProperty sourceConfigurationProperty = SourceConfigurationProperty.builder()
 * .authenticationConfiguration(AuthenticationConfigurationProperty.builder()
 * .accessRoleArn("accessRoleArn")
 * .connectionArn("connectionArn")
 * .build())
 * .autoDeploymentsEnabled(false)
 * .codeRepository(CodeRepositoryProperty.builder()
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
 * .build())
 * .imageRepository(ImageRepositoryProperty.builder()
 * .imageIdentifier("imageIdentifier")
 * .imageRepositoryType("imageRepositoryType")
 * // the properties below are optional
 * .imageConfiguration(ImageConfigurationProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-sourceconfiguration.html)
 */
@CdkDslMarker
public class CfnServiceSourceConfigurationPropertyDsl {
    private val cdkBuilder: CfnService.SourceConfigurationProperty.Builder =
        CfnService.SourceConfigurationProperty.builder()

    /**
     * @param authenticationConfiguration Describes the resources that are needed to authenticate
     *   access to some source repositories.
     */
    public fun authenticationConfiguration(authenticationConfiguration: IResolvable) {
        cdkBuilder.authenticationConfiguration(authenticationConfiguration)
    }

    /**
     * @param authenticationConfiguration Describes the resources that are needed to authenticate
     *   access to some source repositories.
     */
    public fun authenticationConfiguration(
        authenticationConfiguration: CfnService.AuthenticationConfigurationProperty
    ) {
        cdkBuilder.authenticationConfiguration(authenticationConfiguration)
    }

    /**
     * @param autoDeploymentsEnabled If `true` , continuous integration from the source repository
     *   is enabled for the App Runner service. Each repository change (including any source code
     *   commit or new image version) starts a deployment.
     *
     * Default: App Runner sets to `false` for a source image that uses an ECR Public repository or
     * an ECR repository that's in an AWS account other than the one that the service is in. App
     * Runner sets to `true` in all other cases (which currently include a source code repository or
     * a source image using a same-account ECR repository).
     */
    public fun autoDeploymentsEnabled(autoDeploymentsEnabled: Boolean) {
        cdkBuilder.autoDeploymentsEnabled(autoDeploymentsEnabled)
    }

    /**
     * @param autoDeploymentsEnabled If `true` , continuous integration from the source repository
     *   is enabled for the App Runner service. Each repository change (including any source code
     *   commit or new image version) starts a deployment.
     *
     * Default: App Runner sets to `false` for a source image that uses an ECR Public repository or
     * an ECR repository that's in an AWS account other than the one that the service is in. App
     * Runner sets to `true` in all other cases (which currently include a source code repository or
     * a source image using a same-account ECR repository).
     */
    public fun autoDeploymentsEnabled(autoDeploymentsEnabled: IResolvable) {
        cdkBuilder.autoDeploymentsEnabled(autoDeploymentsEnabled)
    }

    /**
     * @param codeRepository The description of a source code repository. You must provide either
     *   this member or `ImageRepository` (but not both).
     */
    public fun codeRepository(codeRepository: IResolvable) {
        cdkBuilder.codeRepository(codeRepository)
    }

    /**
     * @param codeRepository The description of a source code repository. You must provide either
     *   this member or `ImageRepository` (but not both).
     */
    public fun codeRepository(codeRepository: CfnService.CodeRepositoryProperty) {
        cdkBuilder.codeRepository(codeRepository)
    }

    /**
     * @param imageRepository The description of a source image repository. You must provide either
     *   this member or `CodeRepository` (but not both).
     */
    public fun imageRepository(imageRepository: IResolvable) {
        cdkBuilder.imageRepository(imageRepository)
    }

    /**
     * @param imageRepository The description of a source image repository. You must provide either
     *   this member or `CodeRepository` (but not both).
     */
    public fun imageRepository(imageRepository: CfnService.ImageRepositoryProperty) {
        cdkBuilder.imageRepository(imageRepository)
    }

    public fun build(): CfnService.SourceConfigurationProperty = cdkBuilder.build()
}

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

package io.cloudshiftdev.awscdkdsl.services.sagemaker

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnAppImageConfig

/**
 * The configuration for the file system and kernels in a SageMaker image running as a JupyterLab
 * app.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * JupyterLabAppImageConfigProperty jupyterLabAppImageConfigProperty =
 * JupyterLabAppImageConfigProperty.builder()
 * .containerConfig(ContainerConfigProperty.builder()
 * .containerArguments(List.of("containerArguments"))
 * .containerEntrypoint(List.of("containerEntrypoint"))
 * .containerEnvironmentVariables(List.of(CustomImageContainerEnvironmentVariableProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-appimageconfig-jupyterlabappimageconfig.html)
 */
@CdkDslMarker
public class CfnAppImageConfigJupyterLabAppImageConfigPropertyDsl {
    private val cdkBuilder: CfnAppImageConfig.JupyterLabAppImageConfigProperty.Builder =
        CfnAppImageConfig.JupyterLabAppImageConfigProperty.builder()

    /** @param containerConfig The configuration used to run the application image container. */
    public fun containerConfig(containerConfig: IResolvable) {
        cdkBuilder.containerConfig(containerConfig)
    }

    /** @param containerConfig The configuration used to run the application image container. */
    public fun containerConfig(containerConfig: CfnAppImageConfig.ContainerConfigProperty) {
        cdkBuilder.containerConfig(containerConfig)
    }

    public fun build(): CfnAppImageConfig.JupyterLabAppImageConfigProperty = cdkBuilder.build()
}

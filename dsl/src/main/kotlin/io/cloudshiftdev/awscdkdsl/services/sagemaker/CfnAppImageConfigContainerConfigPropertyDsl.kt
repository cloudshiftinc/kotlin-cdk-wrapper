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
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnAppImageConfig

/**
 * The configuration used to run the application image container.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * ContainerConfigProperty containerConfigProperty = ContainerConfigProperty.builder()
 * .containerArguments(List.of("containerArguments"))
 * .containerEntrypoint(List.of("containerEntrypoint"))
 * .containerEnvironmentVariables(List.of(CustomImageContainerEnvironmentVariableProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-appimageconfig-containerconfig.html)
 */
@CdkDslMarker
public class CfnAppImageConfigContainerConfigPropertyDsl {
    private val cdkBuilder: CfnAppImageConfig.ContainerConfigProperty.Builder =
        CfnAppImageConfig.ContainerConfigProperty.builder()

    private val _containerArguments: MutableList<String> = mutableListOf()

    private val _containerEntrypoint: MutableList<String> = mutableListOf()

    private val _containerEnvironmentVariables: MutableList<Any> = mutableListOf()

    /**
     * @param containerArguments The arguments for the container when you're running the
     *   application.
     */
    public fun containerArguments(vararg containerArguments: String) {
        _containerArguments.addAll(listOf(*containerArguments))
    }

    /**
     * @param containerArguments The arguments for the container when you're running the
     *   application.
     */
    public fun containerArguments(containerArguments: Collection<String>) {
        _containerArguments.addAll(containerArguments)
    }

    /** @param containerEntrypoint The entrypoint used to run the application in the container. */
    public fun containerEntrypoint(vararg containerEntrypoint: String) {
        _containerEntrypoint.addAll(listOf(*containerEntrypoint))
    }

    /** @param containerEntrypoint The entrypoint used to run the application in the container. */
    public fun containerEntrypoint(containerEntrypoint: Collection<String>) {
        _containerEntrypoint.addAll(containerEntrypoint)
    }

    /** @param containerEnvironmentVariables The environment variables to set in the container. */
    public fun containerEnvironmentVariables(vararg containerEnvironmentVariables: Any) {
        _containerEnvironmentVariables.addAll(listOf(*containerEnvironmentVariables))
    }

    /** @param containerEnvironmentVariables The environment variables to set in the container. */
    public fun containerEnvironmentVariables(containerEnvironmentVariables: Collection<Any>) {
        _containerEnvironmentVariables.addAll(containerEnvironmentVariables)
    }

    /** @param containerEnvironmentVariables The environment variables to set in the container. */
    public fun containerEnvironmentVariables(containerEnvironmentVariables: IResolvable) {
        cdkBuilder.containerEnvironmentVariables(containerEnvironmentVariables)
    }

    public fun build(): CfnAppImageConfig.ContainerConfigProperty {
        if (_containerArguments.isNotEmpty()) cdkBuilder.containerArguments(_containerArguments)
        if (_containerEntrypoint.isNotEmpty()) cdkBuilder.containerEntrypoint(_containerEntrypoint)
        if (_containerEnvironmentVariables.isNotEmpty())
            cdkBuilder.containerEnvironmentVariables(_containerEnvironmentVariables)
        return cdkBuilder.build()
    }
}

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

package io.cloudshiftdev.awscdkdsl.services.pipes

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pipes.CfnPipe

/**
 * The overrides that are sent to a container.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pipes.*;
 * BatchContainerOverridesProperty batchContainerOverridesProperty =
 * BatchContainerOverridesProperty.builder()
 * .command(List.of("command"))
 * .environment(List.of(BatchEnvironmentVariableProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .instanceType("instanceType")
 * .resourceRequirements(List.of(BatchResourceRequirementProperty.builder()
 * .type("type")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-batchcontaineroverrides.html)
 */
@CdkDslMarker
public class CfnPipeBatchContainerOverridesPropertyDsl {
    private val cdkBuilder: CfnPipe.BatchContainerOverridesProperty.Builder =
        CfnPipe.BatchContainerOverridesProperty.builder()

    private val _command: MutableList<String> = mutableListOf()

    private val _environment: MutableList<Any> = mutableListOf()

    private val _resourceRequirements: MutableList<Any> = mutableListOf()

    /**
     * @param command The command to send to the container that overrides the default command from
     *   the Docker image or the task definition.
     */
    public fun command(vararg command: String) {
        _command.addAll(listOf(*command))
    }

    /**
     * @param command The command to send to the container that overrides the default command from
     *   the Docker image or the task definition.
     */
    public fun command(command: Collection<String>) {
        _command.addAll(command)
    }

    /**
     * @param environment The environment variables to send to the container. You can add new
     *   environment variables, which are added to the container at launch, or you can override the
     *   existing environment variables from the Docker image or the task definition.
     *
     * Environment variables cannot start with " `AWS Batch` ". This naming convention is reserved
     * for variables that AWS Batch sets.
     */
    public fun environment(vararg environment: Any) {
        _environment.addAll(listOf(*environment))
    }

    /**
     * @param environment The environment variables to send to the container. You can add new
     *   environment variables, which are added to the container at launch, or you can override the
     *   existing environment variables from the Docker image or the task definition.
     *
     * Environment variables cannot start with " `AWS Batch` ". This naming convention is reserved
     * for variables that AWS Batch sets.
     */
    public fun environment(environment: Collection<Any>) {
        _environment.addAll(environment)
    }

    /**
     * @param environment The environment variables to send to the container. You can add new
     *   environment variables, which are added to the container at launch, or you can override the
     *   existing environment variables from the Docker image or the task definition.
     *
     * Environment variables cannot start with " `AWS Batch` ". This naming convention is reserved
     * for variables that AWS Batch sets.
     */
    public fun environment(environment: IResolvable) {
        cdkBuilder.environment(environment)
    }

    /**
     * @param instanceType The instance type to use for a multi-node parallel job.
     *
     * This parameter isn't applicable to single-node container jobs or jobs that run on Fargate
     * resources, and shouldn't be provided.
     */
    public fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
    }

    /**
     * @param resourceRequirements The type and amount of resources to assign to a container. This
     *   overrides the settings in the job definition. The supported resources include `GPU` ,
     *   `MEMORY` , and `VCPU` .
     */
    public fun resourceRequirements(vararg resourceRequirements: Any) {
        _resourceRequirements.addAll(listOf(*resourceRequirements))
    }

    /**
     * @param resourceRequirements The type and amount of resources to assign to a container. This
     *   overrides the settings in the job definition. The supported resources include `GPU` ,
     *   `MEMORY` , and `VCPU` .
     */
    public fun resourceRequirements(resourceRequirements: Collection<Any>) {
        _resourceRequirements.addAll(resourceRequirements)
    }

    /**
     * @param resourceRequirements The type and amount of resources to assign to a container. This
     *   overrides the settings in the job definition. The supported resources include `GPU` ,
     *   `MEMORY` , and `VCPU` .
     */
    public fun resourceRequirements(resourceRequirements: IResolvable) {
        cdkBuilder.resourceRequirements(resourceRequirements)
    }

    public fun build(): CfnPipe.BatchContainerOverridesProperty {
        if (_command.isNotEmpty()) cdkBuilder.command(_command)
        if (_environment.isNotEmpty()) cdkBuilder.environment(_environment)
        if (_resourceRequirements.isNotEmpty())
            cdkBuilder.resourceRequirements(_resourceRequirements)
        return cdkBuilder.build()
    }
}

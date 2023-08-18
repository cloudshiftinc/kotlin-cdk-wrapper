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
import kotlin.String
import software.amazon.awscdk.services.pipes.CfnPipe

/**
 * The environment variables to send to the container.
 *
 * You can add new environment variables, which are added to the container at launch, or you can
 * override the existing environment variables from the Docker image or the task definition.
 *
 * Environment variables cannot start with " `AWS Batch` ". This naming convention is reserved for
 * variables that AWS Batch sets.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pipes.*;
 * BatchEnvironmentVariableProperty batchEnvironmentVariableProperty =
 * BatchEnvironmentVariableProperty.builder()
 * .name("name")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-batchenvironmentvariable.html)
 */
@CdkDslMarker
public class CfnPipeBatchEnvironmentVariablePropertyDsl {
    private val cdkBuilder: CfnPipe.BatchEnvironmentVariableProperty.Builder =
        CfnPipe.BatchEnvironmentVariableProperty.builder()

    /**
     * @param name The name of the key-value pair. For environment variables, this is the name of
     *   the environment variable.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param value The value of the key-value pair. For environment variables, this is the value of
     *   the environment variable.
     */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnPipe.BatchEnvironmentVariableProperty = cdkBuilder.build()
}

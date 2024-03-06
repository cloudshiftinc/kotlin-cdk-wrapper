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

package io.cloudshiftdev.awscdkdsl.services.codepipeline

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codepipeline.Variable

/**
 * Pipeline-Level variable.
 *
 * Example:
 * ```
 * S3SourceAction sourceAction;
 * Artifact sourceOutput;
 * Bucket deployBucket;
 * // Pipeline-level variable
 * Variable variable = Variable.Builder.create()
 * .variableName("bucket-var")
 * .description("description")
 * .defaultValue("sample")
 * .build();
 * Pipeline.Builder.create(this, "Pipeline")
 * .pipelineType(PipelineType.V2)
 * .variables(List.of(variable))
 * .stages(List.of(StageProps.builder()
 * .stageName("Source")
 * .actions(List.of(sourceAction))
 * .build(), StageProps.builder()
 * .stageName("Deploy")
 * .actions(List.of(
 * S3DeployAction.Builder.create()
 * .actionName("DeployAction")
 * // can reference the variables
 * .objectKey(String.format("%s.txt", variable.reference()))
 * .input(sourceOutput)
 * .bucket(deployBucket)
 * .build()))
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class VariableDsl {
    private val cdkBuilder: Variable.Builder = Variable.Builder.create()

    /**
     * The default value of a pipeline-level variable.
     *
     * Default: - No default value.
     *
     * @param defaultValue The default value of a pipeline-level variable.
     */
    public fun defaultValue(defaultValue: String) {
        cdkBuilder.defaultValue(defaultValue)
    }

    /**
     * The description of a pipeline-level variable.
     *
     * It's used to add additional context about the variable, and not being used at time when
     * pipeline executes.
     *
     * Default: - No description.
     *
     * @param description The description of a pipeline-level variable.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The name of a pipeline-level variable.
     *
     * @param variableName The name of a pipeline-level variable.
     */
    public fun variableName(variableName: String) {
        cdkBuilder.variableName(variableName)
    }

    public fun build(): Variable = cdkBuilder.build()
}

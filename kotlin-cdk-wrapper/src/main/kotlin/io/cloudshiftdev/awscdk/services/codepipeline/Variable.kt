@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * Pipeline-Level variable.
 *
 * Example:
 *
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
public open class Variable internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.codepipeline.Variable,
) : CdkObject(cdkObject) {
  /**
   * Reference the variable name at Pipeline actions.
   *
   * @return The variable name in a format that can be referenced at Pipeline actions
   */
  public open fun reference(): String = unwrap(this).reference()

  /**
   * The name of a pipeline-level variable.
   */
  public open fun variableName(): String = unwrap(this).getVariableName()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.codepipeline.Variable].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The default value of a pipeline-level variable.
     *
     * Default: - No default value.
     *
     * @param defaultValue The default value of a pipeline-level variable. 
     */
    public fun defaultValue(defaultValue: String)

    /**
     * The description of a pipeline-level variable.
     *
     * It's used to add additional context
     * about the variable, and not being used at time when pipeline executes.
     *
     * Default: - No description.
     *
     * @param description The description of a pipeline-level variable. 
     */
    public fun description(description: String)

    /**
     * The name of a pipeline-level variable.
     *
     * @param variableName The name of a pipeline-level variable. 
     */
    public fun variableName(variableName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codepipeline.Variable.Builder =
        software.amazon.awscdk.services.codepipeline.Variable.Builder.create()

    /**
     * The default value of a pipeline-level variable.
     *
     * Default: - No default value.
     *
     * @param defaultValue The default value of a pipeline-level variable. 
     */
    override fun defaultValue(defaultValue: String) {
      cdkBuilder.defaultValue(defaultValue)
    }

    /**
     * The description of a pipeline-level variable.
     *
     * It's used to add additional context
     * about the variable, and not being used at time when pipeline executes.
     *
     * Default: - No description.
     *
     * @param description The description of a pipeline-level variable. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of a pipeline-level variable.
     *
     * @param variableName The name of a pipeline-level variable. 
     */
    override fun variableName(variableName: String) {
      cdkBuilder.variableName(variableName)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.Variable = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Variable {
      val builderImpl = BuilderImpl()
      return Variable(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.Variable): Variable =
        Variable(cdkObject)

    internal fun unwrap(wrapped: Variable): software.amazon.awscdk.services.codepipeline.Variable =
        wrapped.cdkObject
  }
}

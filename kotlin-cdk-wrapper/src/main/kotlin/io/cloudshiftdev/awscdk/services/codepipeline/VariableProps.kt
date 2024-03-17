@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties of pipeline-level variable.
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
public interface VariableProps {
  /**
   * The default value of a pipeline-level variable.
   *
   * Default: - No default value.
   */
  public fun defaultValue(): String? = unwrap(this).getDefaultValue()

  /**
   * The description of a pipeline-level variable.
   *
   * It's used to add additional context
   * about the variable, and not being used at time when pipeline executes.
   *
   * Default: - No description.
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of a pipeline-level variable.
   */
  public fun variableName(): String

  /**
   * A builder for [VariableProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param defaultValue The default value of a pipeline-level variable.
     */
    public fun defaultValue(defaultValue: String)

    /**
     * @param description The description of a pipeline-level variable.
     * It's used to add additional context
     * about the variable, and not being used at time when pipeline executes.
     */
    public fun description(description: String)

    /**
     * @param variableName The name of a pipeline-level variable. 
     */
    public fun variableName(variableName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codepipeline.VariableProps.Builder =
        software.amazon.awscdk.services.codepipeline.VariableProps.builder()

    /**
     * @param defaultValue The default value of a pipeline-level variable.
     */
    override fun defaultValue(defaultValue: String) {
      cdkBuilder.defaultValue(defaultValue)
    }

    /**
     * @param description The description of a pipeline-level variable.
     * It's used to add additional context
     * about the variable, and not being used at time when pipeline executes.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param variableName The name of a pipeline-level variable. 
     */
    override fun variableName(variableName: String) {
      cdkBuilder.variableName(variableName)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.VariableProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codepipeline.VariableProps,
  ) : CdkObject(cdkObject), VariableProps {
    /**
     * The default value of a pipeline-level variable.
     *
     * Default: - No default value.
     */
    override fun defaultValue(): String? = unwrap(this).getDefaultValue()

    /**
     * The description of a pipeline-level variable.
     *
     * It's used to add additional context
     * about the variable, and not being used at time when pipeline executes.
     *
     * Default: - No description.
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of a pipeline-level variable.
     */
    override fun variableName(): String = unwrap(this).getVariableName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VariableProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.VariableProps):
        VariableProps = CdkObjectWrappers.wrap(cdkObject) as? VariableProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: VariableProps):
        software.amazon.awscdk.services.codepipeline.VariableProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codepipeline.VariableProps
  }
}

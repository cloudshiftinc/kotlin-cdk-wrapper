@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.collections.List

/**
 * The conditions for making checks for the stage.
 *
 * Example:
 *
 * ```
 * CodeStarConnectionsSourceAction sourceAction;
 * CodeBuildAction buildAction;
 * Pipeline.Builder.create(this, "Pipeline")
 * .pipelineType(PipelineType.V2)
 * .stages(List.of(StageProps.builder()
 * .stageName("Source")
 * .actions(List.of(sourceAction))
 * .build(), StageProps.builder()
 * .stageName("Build")
 * .actions(List.of(buildAction))
 * // BeforeEntry condition - checks before entering the stage
 * .beforeEntry(Conditions.builder()
 * .conditions(List.of(Condition.builder()
 * .rules(List.of(Rule.Builder.create()
 * .name("LambdaCheck")
 * .provider("LambdaInvoke")
 * .version("1")
 * .configuration(Map.of(
 * "FunctionName", "LambdaFunctionName"))
 * .build()))
 * .result(Result.FAIL)
 * .build()))
 * .build())
 * // OnSuccess condition - checks after successful stage completion
 * .onSuccess(Conditions.builder()
 * .conditions(List.of(Condition.builder()
 * .result(Result.FAIL)
 * .rules(List.of(Rule.Builder.create()
 * .name("CloudWatchCheck")
 * .provider("LambdaInvoke")
 * .version("1")
 * .configuration(Map.of(
 * "AlarmName", "AlarmName1",
 * "WaitTime", "300",  // 5 minutes
 * "FunctionName", "funcName2"))
 * .build()))
 * .build()))
 * .build())
 * // OnFailure condition - handles stage failure
 * .onFailure(FailureConditions.builder()
 * .conditions(List.of(Condition.builder()
 * .result(Result.ROLLBACK)
 * .rules(List.of(Rule.Builder.create()
 * .name("RollBackOnFailure")
 * .provider("LambdaInvoke")
 * .version("1")
 * .configuration(Map.of(
 * "AlarmName", "Alarm",
 * "WaitTime", "300",  // 5 minutes
 * "FunctionName", "funcName1"))
 * .build()))
 * .build()))
 * .build())
 * .build()))
 * .build();
 * ```
 */
public interface Conditions {
  /**
   * The conditions that are configured as entry conditions, making check to succeed the stage, or
   * fail the stage.
   *
   * Default: - No conditions are configured
   */
  public fun conditions(): List<Condition> = unwrap(this).getConditions()?.map(Condition::wrap) ?:
      emptyList()

  /**
   * A builder for [Conditions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param conditions The conditions that are configured as entry conditions, making check to
     * succeed the stage, or fail the stage.
     */
    public fun conditions(conditions: List<Condition>)

    /**
     * @param conditions The conditions that are configured as entry conditions, making check to
     * succeed the stage, or fail the stage.
     */
    public fun conditions(vararg conditions: Condition)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codepipeline.Conditions.Builder =
        software.amazon.awscdk.services.codepipeline.Conditions.builder()

    /**
     * @param conditions The conditions that are configured as entry conditions, making check to
     * succeed the stage, or fail the stage.
     */
    override fun conditions(conditions: List<Condition>) {
      cdkBuilder.conditions(conditions.map(Condition.Companion::unwrap))
    }

    /**
     * @param conditions The conditions that are configured as entry conditions, making check to
     * succeed the stage, or fail the stage.
     */
    override fun conditions(vararg conditions: Condition): Unit = conditions(conditions.toList())

    public fun build(): software.amazon.awscdk.services.codepipeline.Conditions = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codepipeline.Conditions,
  ) : CdkObject(cdkObject),
      Conditions {
    /**
     * The conditions that are configured as entry conditions, making check to succeed the stage, or
     * fail the stage.
     *
     * Default: - No conditions are configured
     */
    override fun conditions(): List<Condition> = unwrap(this).getConditions()?.map(Condition::wrap)
        ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Conditions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.Conditions):
        Conditions = CdkObjectWrappers.wrap(cdkObject) as? Conditions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: Conditions):
        software.amazon.awscdk.services.codepipeline.Conditions = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.codepipeline.Conditions
  }
}

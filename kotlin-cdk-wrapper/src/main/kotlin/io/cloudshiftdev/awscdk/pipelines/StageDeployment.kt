@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.Stage
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Deployment of a single `Stage`.
 *
 * A `Stage` consists of one or more `Stacks`, which will be
 * deployed in dependency order.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.pipelines.*;
 * Stack stack;
 * Stage stage;
 * Step step;
 * StageDeployment stageDeployment = StageDeployment.fromStage(stage, StageDeploymentProps.builder()
 * .post(List.of(step))
 * .pre(List.of(step))
 * .stackSteps(List.of(StackSteps.builder()
 * .stack(stack)
 * // the properties below are optional
 * .changeSet(List.of(step))
 * .post(List.of(step))
 * .pre(List.of(step))
 * .build()))
 * .stageName("stageName")
 * .build());
 * ```
 */
public open class StageDeployment internal constructor(
  internal override val cdkObject: software.amazon.awscdk.pipelines.StageDeployment,
) : CdkObject(cdkObject) {
  /**
   * Add an additional step to run after all of the stacks in this stage.
   *
   * @param steps 
   */
  public open fun addPost(vararg steps: Step) {
    unwrap(this).addPost(*steps.map(Step::unwrap).toTypedArray())
  }

  /**
   * Add an additional step to run before any of the stacks in this stage.
   *
   * @param steps 
   */
  public open fun addPre(vararg steps: Step) {
    unwrap(this).addPre(*steps.map(Step::unwrap).toTypedArray())
  }

  /**
   * Additional steps that are run after all of the stacks in the stage.
   */
  public open fun post(): List<Step> = unwrap(this).getPost().map(Step::wrap)

  /**
   * Additional steps that are run before any of the stacks in the stage.
   */
  public open fun pre(): List<Step> = unwrap(this).getPre().map(Step::wrap)

  /**
   * Determine if all stacks in stage should be deployed with prepare step or not.
   */
  public open fun prepareStep(): Boolean? = unwrap(this).getPrepareStep()

  /**
   * Instructions for additional steps that are run at stack level.
   */
  public open fun stackSteps(): List<StackSteps> =
      unwrap(this).getStackSteps().map(StackSteps::wrap)

  /**
   * The stacks deployed in this stage.
   */
  public open fun stacks(): List<StackDeployment> =
      unwrap(this).getStacks().map(StackDeployment::wrap)

  /**
   * The display name of this stage.
   */
  public open fun stageName(): String = unwrap(this).getStageName()

  public companion object {
    public fun fromStage(stage: Stage): StageDeployment =
        software.amazon.awscdk.pipelines.StageDeployment.fromStage(stage.let(Stage::unwrap)).let(StageDeployment::wrap)

    public fun fromStage(stage: Stage, props: StageDeploymentProps): StageDeployment =
        software.amazon.awscdk.pipelines.StageDeployment.fromStage(stage.let(Stage::unwrap),
        props.let(StageDeploymentProps::unwrap)).let(StageDeployment::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("adb8fe8c01a9d24e17c91b23a2bc3be56f27bbe509b2b6180d823ec436303095")
    public fun fromStage(stage: Stage, props: StageDeploymentProps.Builder.() -> Unit):
        StageDeployment = fromStage(stage, StageDeploymentProps(props))

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.StageDeployment): StageDeployment
        = StageDeployment(cdkObject)

    internal fun unwrap(wrapped: StageDeployment): software.amazon.awscdk.pipelines.StageDeployment
        = wrapped.cdkObject
  }
}

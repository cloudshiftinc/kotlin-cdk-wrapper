@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.Stage
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public open class StageDeployment internal constructor(
  internal override val cdkObject: software.amazon.awscdk.pipelines.StageDeployment,
) : CdkObject(cdkObject) {
  public open fun addPost(steps: Step) {
    unwrap(this).addPost(steps.let(Step::unwrap))
  }

  public open fun addPre(steps: Step) {
    unwrap(this).addPre(steps.let(Step::unwrap))
  }

  public open fun post(): List<Step> = unwrap(this).getPost().map(Step::wrap)

  public open fun pre(): List<Step> = unwrap(this).getPre().map(Step::wrap)

  public open fun prepareStep(): Boolean? = unwrap(this).getPrepareStep()

  public open fun stackSteps(): List<StackSteps> =
      unwrap(this).getStackSteps().map(StackSteps::wrap)

  public open fun stacks(): List<StackDeployment> =
      unwrap(this).getStacks().map(StackDeployment::wrap)

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

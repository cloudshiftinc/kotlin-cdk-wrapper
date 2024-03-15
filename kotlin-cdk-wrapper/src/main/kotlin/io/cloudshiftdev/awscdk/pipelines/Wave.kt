@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.Stage
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public open class Wave internal constructor(
  internal override val cdkObject: software.amazon.awscdk.pipelines.Wave,
) : CdkObject(cdkObject) {
  public open fun addPost(steps: Step) {
    unwrap(this).addPost(steps.let(Step::unwrap))
  }

  public open fun addPre(steps: Step) {
    unwrap(this).addPre(steps.let(Step::unwrap))
  }

  public open fun addStage(stage: Stage): StageDeployment =
      unwrap(this).addStage(stage.let(Stage::unwrap)).let(StageDeployment::wrap)

  public open fun addStage(stage: Stage, options: AddStageOpts): StageDeployment =
      unwrap(this).addStage(stage.let(Stage::unwrap),
      options.let(AddStageOpts::unwrap)).let(StageDeployment::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0fa9b46549453fb89fc25b448db9f58d0867fa3f295e60b93e224794fbb20090")
  public open fun addStage(stage: Stage, options: AddStageOpts.Builder.() -> Unit): StageDeployment
      = addStage(stage, AddStageOpts(options))

  public open fun id(): String = unwrap(this).getId()

  public open fun post(): List<Step> = unwrap(this).getPost().map(Step::wrap)

  public open fun pre(): List<Step> = unwrap(this).getPre().map(Step::wrap)

  public open fun stages(): List<StageDeployment> =
      unwrap(this).getStages().map(StageDeployment::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun post(post: List<Step>)

    public fun post(vararg post: Step)

    public fun pre(pre: List<Step>)

    public fun pre(vararg pre: Step)
  }

  private class BuilderImpl(
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.Wave.Builder =
        software.amazon.awscdk.pipelines.Wave.Builder.create(id)

    override fun post(post: List<Step>) {
      cdkBuilder.post(post.map(Step::unwrap))
    }

    override fun post(vararg post: Step): Unit = post(post.toList())

    override fun pre(pre: List<Step>) {
      cdkBuilder.pre(pre.map(Step::unwrap))
    }

    override fun pre(vararg pre: Step): Unit = pre(pre.toList())

    public fun build(): software.amazon.awscdk.pipelines.Wave = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(id: String, block: Builder.() -> Unit = {}): Wave {
      val builderImpl = BuilderImpl(id)
      return Wave(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.Wave): Wave = Wave(cdkObject)

    internal fun unwrap(wrapped: Wave): software.amazon.awscdk.pipelines.Wave = wrapped.cdkObject
  }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.Stage
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Multiple stages that are deployed in parallel.
 *
 * Example:
 *
 * ```
 * CodePipeline pipeline;
 * Wave europeWave = pipeline.addWave("Europe");
 * europeWave.addStage(MyApplicationStage.Builder.create(this, "Ireland")
 * .env(Environment.builder().region("eu-west-1").build())
 * .build());
 * europeWave.addStage(MyApplicationStage.Builder.create(this, "Germany")
 * .env(Environment.builder().region("eu-central-1").build())
 * .build());
 * ```
 */
public open class Wave(
  cdkObject: software.amazon.awscdk.pipelines.Wave,
) : CdkObject(cdkObject) {
  public constructor(id: String) : this(software.amazon.awscdk.pipelines.Wave(id)
  )

  public constructor(id: String, props: WaveProps) : this(software.amazon.awscdk.pipelines.Wave(id,
      props.let(WaveProps::unwrap))
  )

  public constructor(id: String, props: WaveProps.Builder.() -> Unit) : this(id, WaveProps(props)
  )

  /**
   * Add an additional step to run after all of the stages in this wave.
   *
   * @param steps 
   */
  public open fun addPost(vararg steps: Step) {
    unwrap(this).addPost(*steps.map(Step::unwrap).toTypedArray())
  }

  /**
   * Add an additional step to run before any of the stages in this wave.
   *
   * @param steps 
   */
  public open fun addPre(vararg steps: Step) {
    unwrap(this).addPre(*steps.map(Step::unwrap).toTypedArray())
  }

  /**
   * Add a Stage to this wave.
   *
   * It will be deployed in parallel with all other stages in this
   * wave.
   *
   * @param stage 
   * @param options
   */
  public open fun addStage(stage: Stage): StageDeployment =
      unwrap(this).addStage(stage.let(Stage::unwrap)).let(StageDeployment::wrap)

  /**
   * Add a Stage to this wave.
   *
   * It will be deployed in parallel with all other stages in this
   * wave.
   *
   * @param stage 
   * @param options
   */
  public open fun addStage(stage: Stage, options: AddStageOpts): StageDeployment =
      unwrap(this).addStage(stage.let(Stage::unwrap),
      options.let(AddStageOpts::unwrap)).let(StageDeployment::wrap)

  /**
   * Add a Stage to this wave.
   *
   * It will be deployed in parallel with all other stages in this
   * wave.
   *
   * @param stage 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0fa9b46549453fb89fc25b448db9f58d0867fa3f295e60b93e224794fbb20090")
  public open fun addStage(stage: Stage, options: AddStageOpts.Builder.() -> Unit): StageDeployment
      = addStage(stage, AddStageOpts(options))

  /**
   * Identifier for this Wave.
   */
  public open fun id(): String = unwrap(this).getId()

  /**
   * Additional steps that are run after all of the stages in the wave.
   */
  public open fun post(): List<Step> = unwrap(this).getPost().map(Step::wrap)

  /**
   * Additional steps that are run before any of the stages in the wave.
   */
  public open fun pre(): List<Step> = unwrap(this).getPre().map(Step::wrap)

  /**
   * The stages that are deployed in this wave.
   */
  public open fun stages(): List<StageDeployment> =
      unwrap(this).getStages().map(StageDeployment::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.pipelines.Wave].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Additional steps to run after all of the stages in the wave.
     *
     * Default: - No additional steps
     *
     * @param post Additional steps to run after all of the stages in the wave. 
     */
    public fun post(post: List<Step>)

    /**
     * Additional steps to run after all of the stages in the wave.
     *
     * Default: - No additional steps
     *
     * @param post Additional steps to run after all of the stages in the wave. 
     */
    public fun post(vararg post: Step)

    /**
     * Additional steps to run before any of the stages in the wave.
     *
     * Default: - No additional steps
     *
     * @param pre Additional steps to run before any of the stages in the wave. 
     */
    public fun pre(pre: List<Step>)

    /**
     * Additional steps to run before any of the stages in the wave.
     *
     * Default: - No additional steps
     *
     * @param pre Additional steps to run before any of the stages in the wave. 
     */
    public fun pre(vararg pre: Step)
  }

  private class BuilderImpl(
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.Wave.Builder =
        software.amazon.awscdk.pipelines.Wave.Builder.create(id)

    /**
     * Additional steps to run after all of the stages in the wave.
     *
     * Default: - No additional steps
     *
     * @param post Additional steps to run after all of the stages in the wave. 
     */
    override fun post(post: List<Step>) {
      cdkBuilder.post(post.map(Step::unwrap))
    }

    /**
     * Additional steps to run after all of the stages in the wave.
     *
     * Default: - No additional steps
     *
     * @param post Additional steps to run after all of the stages in the wave. 
     */
    override fun post(vararg post: Step): Unit = post(post.toList())

    /**
     * Additional steps to run before any of the stages in the wave.
     *
     * Default: - No additional steps
     *
     * @param pre Additional steps to run before any of the stages in the wave. 
     */
    override fun pre(pre: List<Step>) {
      cdkBuilder.pre(pre.map(Step::unwrap))
    }

    /**
     * Additional steps to run before any of the stages in the wave.
     *
     * Default: - No additional steps
     *
     * @param pre Additional steps to run before any of the stages in the wave. 
     */
    override fun pre(vararg pre: Step): Unit = pre(pre.toList())

    public fun build(): software.amazon.awscdk.pipelines.Wave = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(id: String, block: Builder.() -> Unit = {}): Wave {
      val builderImpl = BuilderImpl(id)
      return Wave(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.Wave): Wave = Wave(cdkObject)

    internal fun unwrap(wrapped: Wave): software.amazon.awscdk.pipelines.Wave = wrapped.cdkObject as
        software.amazon.awscdk.pipelines.Wave
  }
}

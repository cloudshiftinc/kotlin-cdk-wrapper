@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit

/**
 * Allows you to control where to place a new Stage when it's added to the Pipeline.
 *
 * Note that you can provide only one of the below properties -
 * specifying more than one will result in a validation error.
 *
 * Example:
 *
 * ```
 * // Insert a new Stage at an arbitrary point
 * Pipeline pipeline;
 * IStage anotherStage;
 * IStage yetAnotherStage;
 * IStage someStage = pipeline.addStage(StageOptions.builder()
 * .stageName("SomeStage")
 * .placement(StagePlacement.builder()
 * // note: you can only specify one of the below properties
 * .rightBefore(anotherStage)
 * .justAfter(yetAnotherStage)
 * .build())
 * .build());
 * ```
 *
 * [Documentation]( #justAfter)
 */
public interface StagePlacement {
  /**
   * Inserts the new Stage as a child of the given Stage (changing its current child Stage, if it
   * had one).
   */
  public fun justAfter(): IStage? = unwrap(this).getJustAfter()?.let(IStage::wrap)

  /**
   * Inserts the new Stage as a parent of the given Stage (changing its current parent Stage, if it
   * had one).
   */
  public fun rightBefore(): IStage? = unwrap(this).getRightBefore()?.let(IStage::wrap)

  /**
   * A builder for [StagePlacement]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param justAfter Inserts the new Stage as a child of the given Stage (changing its current
     * child Stage, if it had one).
     */
    public fun justAfter(justAfter: IStage)

    /**
     * @param rightBefore Inserts the new Stage as a parent of the given Stage (changing its current
     * parent Stage, if it had one).
     */
    public fun rightBefore(rightBefore: IStage)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codepipeline.StagePlacement.Builder =
        software.amazon.awscdk.services.codepipeline.StagePlacement.builder()

    /**
     * @param justAfter Inserts the new Stage as a child of the given Stage (changing its current
     * child Stage, if it had one).
     */
    override fun justAfter(justAfter: IStage) {
      cdkBuilder.justAfter(justAfter.let(IStage.Companion::unwrap))
    }

    /**
     * @param rightBefore Inserts the new Stage as a parent of the given Stage (changing its current
     * parent Stage, if it had one).
     */
    override fun rightBefore(rightBefore: IStage) {
      cdkBuilder.rightBefore(rightBefore.let(IStage.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.StagePlacement =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codepipeline.StagePlacement,
  ) : CdkObject(cdkObject), StagePlacement {
    /**
     * Inserts the new Stage as a child of the given Stage (changing its current child Stage, if it
     * had one).
     */
    override fun justAfter(): IStage? = unwrap(this).getJustAfter()?.let(IStage::wrap)

    /**
     * Inserts the new Stage as a parent of the given Stage (changing its current parent Stage, if
     * it had one).
     */
    override fun rightBefore(): IStage? = unwrap(this).getRightBefore()?.let(IStage::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): StagePlacement {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.StagePlacement):
        StagePlacement = CdkObjectWrappers.wrap(cdkObject) as? StagePlacement ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: StagePlacement):
        software.amazon.awscdk.services.codepipeline.StagePlacement = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codepipeline.StagePlacement
  }
}

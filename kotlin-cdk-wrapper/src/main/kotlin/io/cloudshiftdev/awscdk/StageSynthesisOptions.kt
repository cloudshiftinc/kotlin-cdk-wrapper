@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Unit

/**
 * Options for assembly synthesis.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * StageSynthesisOptions stageSynthesisOptions = StageSynthesisOptions.builder()
 * .aspectStabilization(false)
 * .errorOnDuplicateSynth(false)
 * .force(false)
 * .skipValidation(false)
 * .validateOnSynthesis(false)
 * .build();
 * ```
 */
public interface StageSynthesisOptions {
  /**
   * Whether or not run the stabilization loop while invoking Aspects.
   *
   * The stabilization loop runs multiple passes of the construct tree when invoking
   * Aspects. Without the stabilization loop, Aspects that are created by other Aspects
   * are not run and new nodes that are created at higher points on the construct tree by
   * an Aspect will not inherit their parent aspects.
   *
   * Default: false
   */
  public fun aspectStabilization(): Boolean? = unwrap(this).getAspectStabilization()

  /**
   * Whether or not to throw a warning instead of an error if the construct tree has been mutated
   * since the last synth.
   *
   * Default: true
   */
  public fun errorOnDuplicateSynth(): Boolean? = unwrap(this).getErrorOnDuplicateSynth()

  /**
   * Force a re-synth, even if the stage has already been synthesized.
   *
   * This is used by tests to allow for incremental verification of the output.
   * Do not use in production.
   *
   * Default: false
   */
  public fun force(): Boolean? = unwrap(this).getForce()

  /**
   * Should we skip construct validation.
   *
   * Default: - false
   */
  public fun skipValidation(): Boolean? = unwrap(this).getSkipValidation()

  /**
   * Whether the stack should be validated after synthesis to check for error metadata.
   *
   * Default: - false
   */
  public fun validateOnSynthesis(): Boolean? = unwrap(this).getValidateOnSynthesis()

  /**
   * A builder for [StageSynthesisOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param aspectStabilization Whether or not run the stabilization loop while invoking Aspects.
     * The stabilization loop runs multiple passes of the construct tree when invoking
     * Aspects. Without the stabilization loop, Aspects that are created by other Aspects
     * are not run and new nodes that are created at higher points on the construct tree by
     * an Aspect will not inherit their parent aspects.
     */
    public fun aspectStabilization(aspectStabilization: Boolean)

    /**
     * @param errorOnDuplicateSynth Whether or not to throw a warning instead of an error if the
     * construct tree has been mutated since the last synth.
     */
    public fun errorOnDuplicateSynth(errorOnDuplicateSynth: Boolean)

    /**
     * @param force Force a re-synth, even if the stage has already been synthesized.
     * This is used by tests to allow for incremental verification of the output.
     * Do not use in production.
     */
    public fun force(force: Boolean)

    /**
     * @param skipValidation Should we skip construct validation.
     */
    public fun skipValidation(skipValidation: Boolean)

    /**
     * @param validateOnSynthesis Whether the stack should be validated after synthesis to check for
     * error metadata.
     */
    public fun validateOnSynthesis(validateOnSynthesis: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.StageSynthesisOptions.Builder =
        software.amazon.awscdk.StageSynthesisOptions.builder()

    /**
     * @param aspectStabilization Whether or not run the stabilization loop while invoking Aspects.
     * The stabilization loop runs multiple passes of the construct tree when invoking
     * Aspects. Without the stabilization loop, Aspects that are created by other Aspects
     * are not run and new nodes that are created at higher points on the construct tree by
     * an Aspect will not inherit their parent aspects.
     */
    override fun aspectStabilization(aspectStabilization: Boolean) {
      cdkBuilder.aspectStabilization(aspectStabilization)
    }

    /**
     * @param errorOnDuplicateSynth Whether or not to throw a warning instead of an error if the
     * construct tree has been mutated since the last synth.
     */
    override fun errorOnDuplicateSynth(errorOnDuplicateSynth: Boolean) {
      cdkBuilder.errorOnDuplicateSynth(errorOnDuplicateSynth)
    }

    /**
     * @param force Force a re-synth, even if the stage has already been synthesized.
     * This is used by tests to allow for incremental verification of the output.
     * Do not use in production.
     */
    override fun force(force: Boolean) {
      cdkBuilder.force(force)
    }

    /**
     * @param skipValidation Should we skip construct validation.
     */
    override fun skipValidation(skipValidation: Boolean) {
      cdkBuilder.skipValidation(skipValidation)
    }

    /**
     * @param validateOnSynthesis Whether the stack should be validated after synthesis to check for
     * error metadata.
     */
    override fun validateOnSynthesis(validateOnSynthesis: Boolean) {
      cdkBuilder.validateOnSynthesis(validateOnSynthesis)
    }

    public fun build(): software.amazon.awscdk.StageSynthesisOptions = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.StageSynthesisOptions,
  ) : CdkObject(cdkObject),
      StageSynthesisOptions {
    /**
     * Whether or not run the stabilization loop while invoking Aspects.
     *
     * The stabilization loop runs multiple passes of the construct tree when invoking
     * Aspects. Without the stabilization loop, Aspects that are created by other Aspects
     * are not run and new nodes that are created at higher points on the construct tree by
     * an Aspect will not inherit their parent aspects.
     *
     * Default: false
     */
    override fun aspectStabilization(): Boolean? = unwrap(this).getAspectStabilization()

    /**
     * Whether or not to throw a warning instead of an error if the construct tree has been mutated
     * since the last synth.
     *
     * Default: true
     */
    override fun errorOnDuplicateSynth(): Boolean? = unwrap(this).getErrorOnDuplicateSynth()

    /**
     * Force a re-synth, even if the stage has already been synthesized.
     *
     * This is used by tests to allow for incremental verification of the output.
     * Do not use in production.
     *
     * Default: false
     */
    override fun force(): Boolean? = unwrap(this).getForce()

    /**
     * Should we skip construct validation.
     *
     * Default: - false
     */
    override fun skipValidation(): Boolean? = unwrap(this).getSkipValidation()

    /**
     * Whether the stack should be validated after synthesis to check for error metadata.
     *
     * Default: - false
     */
    override fun validateOnSynthesis(): Boolean? = unwrap(this).getValidateOnSynthesis()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): StageSynthesisOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.StageSynthesisOptions):
        StageSynthesisOptions = CdkObjectWrappers.wrap(cdkObject) as? StageSynthesisOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: StageSynthesisOptions):
        software.amazon.awscdk.StageSynthesisOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.StageSynthesisOptions
  }
}

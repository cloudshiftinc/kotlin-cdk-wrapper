@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit

/**
 * Specifies the constraints on the number of input and output artifacts an action can have.
 *
 * The constraints for each action type are documented on the
 * [Pipeline Structure
 * Reference](https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html)
 * page.
 *
 * Example:
 *
 * ```
 * // MyAction is some action type that produces variables, like EcrSourceAction
 * MyAction myAction = new MyAction(new MyActionProps()
 * // ...
 * .actionName("myAction")
 * );
 * new OtherAction(new OtherActionProps()
 * // ...
 * .config(myAction.getVariables().getMyVariable())
 * .actionName("otherAction")
 * );
 * ```
 */
public interface ActionArtifactBounds {
  /**
   *
   */
  public fun maxInputs(): Number

  /**
   *
   */
  public fun maxOutputs(): Number

  /**
   *
   */
  public fun minInputs(): Number

  /**
   *
   */
  public fun minOutputs(): Number

  /**
   * A builder for [ActionArtifactBounds]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param maxInputs the value to be set. 
     */
    public fun maxInputs(maxInputs: Number)

    /**
     * @param maxOutputs the value to be set. 
     */
    public fun maxOutputs(maxOutputs: Number)

    /**
     * @param minInputs the value to be set. 
     */
    public fun minInputs(minInputs: Number)

    /**
     * @param minOutputs the value to be set. 
     */
    public fun minOutputs(minOutputs: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.ActionArtifactBounds.Builder =
        software.amazon.awscdk.services.codepipeline.ActionArtifactBounds.builder()

    /**
     * @param maxInputs the value to be set. 
     */
    override fun maxInputs(maxInputs: Number) {
      cdkBuilder.maxInputs(maxInputs)
    }

    /**
     * @param maxOutputs the value to be set. 
     */
    override fun maxOutputs(maxOutputs: Number) {
      cdkBuilder.maxOutputs(maxOutputs)
    }

    /**
     * @param minInputs the value to be set. 
     */
    override fun minInputs(minInputs: Number) {
      cdkBuilder.minInputs(minInputs)
    }

    /**
     * @param minOutputs the value to be set. 
     */
    override fun minOutputs(minOutputs: Number) {
      cdkBuilder.minOutputs(minOutputs)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.ActionArtifactBounds =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codepipeline.ActionArtifactBounds,
  ) : CdkObject(cdkObject),
      ActionArtifactBounds {
    /**
     *
     */
    override fun maxInputs(): Number = unwrap(this).getMaxInputs()

    /**
     *
     */
    override fun maxOutputs(): Number = unwrap(this).getMaxOutputs()

    /**
     *
     */
    override fun minInputs(): Number = unwrap(this).getMinInputs()

    /**
     *
     */
    override fun minOutputs(): Number = unwrap(this).getMinOutputs()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ActionArtifactBounds {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.ActionArtifactBounds):
        ActionArtifactBounds = CdkObjectWrappers.wrap(cdkObject) as? ActionArtifactBounds ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ActionArtifactBounds):
        software.amazon.awscdk.services.codepipeline.ActionArtifactBounds = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codepipeline.ActionArtifactBounds
  }
}

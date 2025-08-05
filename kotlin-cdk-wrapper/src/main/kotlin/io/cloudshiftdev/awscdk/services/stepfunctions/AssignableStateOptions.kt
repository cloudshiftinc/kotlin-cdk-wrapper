@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Option properties for state that can assign variables.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
 * Object assign;
 * AssignableStateOptions assignableStateOptions = AssignableStateOptions.builder()
 * .assign(Map.of(
 * "assignKey", assign))
 * .build();
 * ```
 */
public interface AssignableStateOptions {
  /**
   * Workflow variables to store in this step.
   *
   * Using workflow variables, you can store data in a step and retrieve that data in future steps.
   *
   * Default: - Not assign variables
   *
   * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/workflow-variables.html)
   */
  public fun assign(): Map<String, Any> = unwrap(this).getAssign() ?: emptyMap()

  /**
   * A builder for [AssignableStateOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param assign Workflow variables to store in this step.
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     */
    public fun assign(assign: Map<String, Any>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.AssignableStateOptions.Builder =
        software.amazon.awscdk.services.stepfunctions.AssignableStateOptions.builder()

    /**
     * @param assign Workflow variables to store in this step.
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     */
    override fun assign(assign: Map<String, Any>) {
      cdkBuilder.assign(assign.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.AssignableStateOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.AssignableStateOptions,
  ) : CdkObject(cdkObject),
      AssignableStateOptions {
    /**
     * Workflow variables to store in this step.
     *
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     *
     * Default: - Not assign variables
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/workflow-variables.html)
     */
    override fun assign(): Map<String, Any> = unwrap(this).getAssign() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AssignableStateOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.AssignableStateOptions):
        AssignableStateOptions = CdkObjectWrappers.wrap(cdkObject) as? AssignableStateOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AssignableStateOptions):
        software.amazon.awscdk.services.stepfunctions.AssignableStateOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.AssignableStateOptions
  }
}

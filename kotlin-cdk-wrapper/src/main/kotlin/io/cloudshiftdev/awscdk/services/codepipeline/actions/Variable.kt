@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * A pipeline-level variable used for a pipeline execution.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codepipeline.actions.*;
 * Variable variable = Variable.builder()
 * .name("name")
 * .value("value")
 * .build();
 * ```
 */
public interface Variable {
  /**
   * The name of a pipeline-level variable.
   */
  public fun name(): String

  /**
   * The value of a pipeline-level variable.
   */
  public fun `value`(): String

  /**
   * A builder for [Variable]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param name The name of a pipeline-level variable. 
     */
    public fun name(name: String)

    /**
     * @param value The value of a pipeline-level variable. 
     */
    public fun `value`(`value`: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codepipeline.actions.Variable.Builder =
        software.amazon.awscdk.services.codepipeline.actions.Variable.builder()

    /**
     * @param name The name of a pipeline-level variable. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param value The value of a pipeline-level variable. 
     */
    override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.actions.Variable =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codepipeline.actions.Variable,
  ) : CdkObject(cdkObject),
      Variable {
    /**
     * The name of a pipeline-level variable.
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The value of a pipeline-level variable.
     */
    override fun `value`(): String = unwrap(this).getValue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Variable {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.Variable):
        Variable = CdkObjectWrappers.wrap(cdkObject) as? Variable ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: Variable):
        software.amazon.awscdk.services.codepipeline.actions.Variable = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codepipeline.actions.Variable
  }
}

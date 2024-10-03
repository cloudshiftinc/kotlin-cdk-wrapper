@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit

/**
 * Additional options for the blue/green deployment.
 *
 * The type of the `CfnCodeDeployBlueGreenHookProps.additionalOptions` property.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * CfnCodeDeployBlueGreenAdditionalOptions cfnCodeDeployBlueGreenAdditionalOptions =
 * CfnCodeDeployBlueGreenAdditionalOptions.builder()
 * .terminationWaitTimeInMinutes(123)
 * .build();
 * ```
 */
public interface CfnCodeDeployBlueGreenAdditionalOptions {
  /**
   * Specifies time to wait, in minutes, before terminating the blue resources.
   *
   * Default: - 5 minutes
   */
  public fun terminationWaitTimeInMinutes(): Number? =
      unwrap(this).getTerminationWaitTimeInMinutes()

  /**
   * A builder for [CfnCodeDeployBlueGreenAdditionalOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param terminationWaitTimeInMinutes Specifies time to wait, in minutes, before terminating
     * the blue resources.
     */
    public fun terminationWaitTimeInMinutes(terminationWaitTimeInMinutes: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnCodeDeployBlueGreenAdditionalOptions.Builder =
        software.amazon.awscdk.CfnCodeDeployBlueGreenAdditionalOptions.builder()

    /**
     * @param terminationWaitTimeInMinutes Specifies time to wait, in minutes, before terminating
     * the blue resources.
     */
    override fun terminationWaitTimeInMinutes(terminationWaitTimeInMinutes: Number) {
      cdkBuilder.terminationWaitTimeInMinutes(terminationWaitTimeInMinutes)
    }

    public fun build(): software.amazon.awscdk.CfnCodeDeployBlueGreenAdditionalOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.CfnCodeDeployBlueGreenAdditionalOptions,
  ) : CdkObject(cdkObject),
      CfnCodeDeployBlueGreenAdditionalOptions {
    /**
     * Specifies time to wait, in minutes, before terminating the blue resources.
     *
     * Default: - 5 minutes
     */
    override fun terminationWaitTimeInMinutes(): Number? =
        unwrap(this).getTerminationWaitTimeInMinutes()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnCodeDeployBlueGreenAdditionalOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnCodeDeployBlueGreenAdditionalOptions):
        CfnCodeDeployBlueGreenAdditionalOptions = CdkObjectWrappers.wrap(cdkObject) as?
        CfnCodeDeployBlueGreenAdditionalOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCodeDeployBlueGreenAdditionalOptions):
        software.amazon.awscdk.CfnCodeDeployBlueGreenAdditionalOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.CfnCodeDeployBlueGreenAdditionalOptions
  }
}

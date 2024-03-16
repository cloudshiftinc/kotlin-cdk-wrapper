@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Construction properties of `BootstraplessSynthesizer`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * BootstraplessSynthesizerProps bootstraplessSynthesizerProps =
 * BootstraplessSynthesizerProps.builder()
 * .cloudFormationExecutionRoleArn("cloudFormationExecutionRoleArn")
 * .deployRoleArn("deployRoleArn")
 * .build();
 * ```
 */
public interface BootstraplessSynthesizerProps {
  /**
   * The CFN execution Role ARN to use.
   *
   * Default: - No CloudFormation role (use CLI credentials)
   */
  public fun cloudFormationExecutionRoleArn(): String? =
      unwrap(this).getCloudFormationExecutionRoleArn()

  /**
   * The deploy Role ARN to use.
   *
   * Default: - No deploy role (use CLI credentials)
   */
  public fun deployRoleArn(): String? = unwrap(this).getDeployRoleArn()

  /**
   * A builder for [BootstraplessSynthesizerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cloudFormationExecutionRoleArn The CFN execution Role ARN to use.
     */
    public fun cloudFormationExecutionRoleArn(cloudFormationExecutionRoleArn: String)

    /**
     * @param deployRoleArn The deploy Role ARN to use.
     */
    public fun deployRoleArn(deployRoleArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.BootstraplessSynthesizerProps.Builder =
        software.amazon.awscdk.BootstraplessSynthesizerProps.builder()

    /**
     * @param cloudFormationExecutionRoleArn The CFN execution Role ARN to use.
     */
    override fun cloudFormationExecutionRoleArn(cloudFormationExecutionRoleArn: String) {
      cdkBuilder.cloudFormationExecutionRoleArn(cloudFormationExecutionRoleArn)
    }

    /**
     * @param deployRoleArn The deploy Role ARN to use.
     */
    override fun deployRoleArn(deployRoleArn: String) {
      cdkBuilder.deployRoleArn(deployRoleArn)
    }

    public fun build(): software.amazon.awscdk.BootstraplessSynthesizerProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.BootstraplessSynthesizerProps,
  ) : CdkObject(cdkObject), BootstraplessSynthesizerProps {
    /**
     * The CFN execution Role ARN to use.
     *
     * Default: - No CloudFormation role (use CLI credentials)
     */
    override fun cloudFormationExecutionRoleArn(): String? =
        unwrap(this).getCloudFormationExecutionRoleArn()

    /**
     * The deploy Role ARN to use.
     *
     * Default: - No deploy role (use CLI credentials)
     */
    override fun deployRoleArn(): String? = unwrap(this).getDeployRoleArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BootstraplessSynthesizerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.BootstraplessSynthesizerProps):
        BootstraplessSynthesizerProps = CdkObjectWrappers.wrap(cdkObject) as
        BootstraplessSynthesizerProps

    internal fun unwrap(wrapped: BootstraplessSynthesizerProps):
        software.amazon.awscdk.BootstraplessSynthesizerProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.BootstraplessSynthesizerProps
  }
}

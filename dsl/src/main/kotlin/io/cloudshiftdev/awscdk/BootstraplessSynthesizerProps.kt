package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

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
        BootstraplessSynthesizerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BootstraplessSynthesizerProps):
        software.amazon.awscdk.BootstraplessSynthesizerProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.BootstraplessSynthesizerProps
  }
}

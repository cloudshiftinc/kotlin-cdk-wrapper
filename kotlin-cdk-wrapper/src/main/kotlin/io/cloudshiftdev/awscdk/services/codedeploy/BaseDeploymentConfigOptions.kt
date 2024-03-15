@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * Construction properties of `BaseDeploymentConfig`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codedeploy.*;
 * BaseDeploymentConfigOptions baseDeploymentConfigOptions = BaseDeploymentConfigOptions.builder()
 * .deploymentConfigName("deploymentConfigName")
 * .build();
 * ```
 */
public interface BaseDeploymentConfigOptions {
  /**
   * The physical, human-readable name of the Deployment Configuration.
   *
   * Default: - automatically generated name
   */
  public fun deploymentConfigName(): String? = unwrap(this).getDeploymentConfigName()

  /**
   * A builder for [BaseDeploymentConfigOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deploymentConfigName The physical, human-readable name of the Deployment
     * Configuration.
     */
    public fun deploymentConfigName(deploymentConfigName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codedeploy.BaseDeploymentConfigOptions.Builder =
        software.amazon.awscdk.services.codedeploy.BaseDeploymentConfigOptions.builder()

    /**
     * @param deploymentConfigName The physical, human-readable name of the Deployment
     * Configuration.
     */
    override fun deploymentConfigName(deploymentConfigName: String) {
      cdkBuilder.deploymentConfigName(deploymentConfigName)
    }

    public fun build(): software.amazon.awscdk.services.codedeploy.BaseDeploymentConfigOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codedeploy.BaseDeploymentConfigOptions,
  ) : CdkObject(cdkObject), BaseDeploymentConfigOptions {
    /**
     * The physical, human-readable name of the Deployment Configuration.
     *
     * Default: - automatically generated name
     */
    override fun deploymentConfigName(): String? = unwrap(this).getDeploymentConfigName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BaseDeploymentConfigOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.BaseDeploymentConfigOptions):
        BaseDeploymentConfigOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BaseDeploymentConfigOptions):
        software.amazon.awscdk.services.codedeploy.BaseDeploymentConfigOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codedeploy.BaseDeploymentConfigOptions
  }
}

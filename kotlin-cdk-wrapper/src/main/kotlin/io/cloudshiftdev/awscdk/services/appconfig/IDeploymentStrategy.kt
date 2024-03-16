@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String

/**
 *
 */
public interface IDeploymentStrategy : IResource {
  /**
   * The deployment duration in minutes.
   */
  public fun deploymentDurationInMinutes(): Number? = unwrap(this).getDeploymentDurationInMinutes()

  /**
   * The Amazon Resource Name (ARN) of the deployment strategy.
   */
  public fun deploymentStrategyArn(): String

  /**
   * The ID of the deployment strategy.
   */
  public fun deploymentStrategyId(): String

  /**
   * The description of the deployment strategy.
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The final bake time in minutes.
   */
  public fun finalBakeTimeInMinutes(): Number? = unwrap(this).getFinalBakeTimeInMinutes()

  /**
   * The growth factor of the deployment strategy.
   */
  public fun growthFactor(): Number? = unwrap(this).getGrowthFactor()

  /**
   * The growth type of the deployment strategy.
   */
  public fun growthType(): GrowthType? = unwrap(this).getGrowthType()?.let(GrowthType::wrap)

  /**
   * The name of the deployment strategy.
   */
  public fun name(): String? = unwrap(this).getName()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.IDeploymentStrategy):
        IDeploymentStrategy = CdkObjectWrappers.wrap(cdkObject) as IDeploymentStrategy

    internal fun unwrap(wrapped: IDeploymentStrategy):
        software.amazon.awscdk.services.appconfig.IDeploymentStrategy = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appconfig.IDeploymentStrategy
  }
}

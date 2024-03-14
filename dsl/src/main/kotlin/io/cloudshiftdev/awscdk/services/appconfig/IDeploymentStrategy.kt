package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.Number
import kotlin.String

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

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appconfig.IDeploymentStrategy,
  ) : IDeploymentStrategy {
    /**
     * Apply the given removal policy to this resource.
     *
     * The Removal Policy controls what happens to this resource when it stops
     * being managed by CloudFormation, either because you've removed it from the
     * CDK application or because you've made a change that requires the resource
     * to be replaced.
     *
     * The resource can be deleted (`RemovalPolicy.DESTROY`), or left in your AWS
     * account for data recovery and cleanup later (`RemovalPolicy.RETAIN`).
     *
     * @param policy 
     */
    override fun applyRemovalPolicy(policy: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy::unwrap))
    }

    /**
     * The deployment duration in minutes.
     */
    override fun deploymentDurationInMinutes(): Number? =
        unwrap(this).getDeploymentDurationInMinutes()

    /**
     * The Amazon Resource Name (ARN) of the deployment strategy.
     */
    override fun deploymentStrategyArn(): String = unwrap(this).getDeploymentStrategyArn()

    /**
     * The ID of the deployment strategy.
     */
    override fun deploymentStrategyId(): String = unwrap(this).getDeploymentStrategyId()

    /**
     * The description of the deployment strategy.
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The environment this resource belongs to.
     *
     * For resources that are created and managed by the CDK
     * (generally, those created by creating new class instances like Role, Bucket, etc.),
     * this is always the same as the environment of the stack they belong to;
     * however, for imported resources
     * (those obtained from static methods like fromRoleArn, fromBucketName, etc.),
     * that might be different than the stack they were imported into.
     */
    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    /**
     * The final bake time in minutes.
     */
    override fun finalBakeTimeInMinutes(): Number? = unwrap(this).getFinalBakeTimeInMinutes()

    /**
     * The growth factor of the deployment strategy.
     */
    override fun growthFactor(): Number? = unwrap(this).getGrowthFactor()

    /**
     * The growth type of the deployment strategy.
     */
    override fun growthType(): GrowthType? = unwrap(this).getGrowthType()?.let(GrowthType::wrap)

    /**
     * The name of the deployment strategy.
     */
    override fun name(): String? = unwrap(this).getName()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.IDeploymentStrategy):
        IDeploymentStrategy = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IDeploymentStrategy):
        software.amazon.awscdk.services.appconfig.IDeploymentStrategy = (wrapped as
        Wrapper).cdkObject
  }
}

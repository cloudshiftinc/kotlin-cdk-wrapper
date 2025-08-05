@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.InstanceArchitecture
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Properties for BottleRocketImage.
 *
 * Example:
 *
 * ```
 * Cluster cluster;
 * cluster.addCapacity("bottlerocket-asg", AddCapacityOptions.builder()
 * .instanceType(new InstanceType("p3.2xlarge"))
 * .machineImage(BottleRocketImage.Builder.create()
 * .variant(BottlerocketEcsVariant.AWS_ECS_2_NVIDIA)
 * .build())
 * .build());
 * ```
 */
public interface BottleRocketImageProps {
  /**
   * Adds an additional discriminator to the `cdk.context.json` cache key.
   *
   * Default: - no additional cache key
   */
  public fun additionalCacheKey(): String? = unwrap(this).getAdditionalCacheKey()

  /**
   * The CPU architecture.
   *
   * Default: - x86_64
   */
  public fun architecture(): InstanceArchitecture? =
      unwrap(this).getArchitecture()?.let(InstanceArchitecture::wrap)

  /**
   * Whether the AMI ID is cached to be stable between deployments.
   *
   * By default, the newest image is used on each deployment. This will cause
   * instances to be replaced whenever a new version is released, and may cause
   * downtime if there aren't enough running instances in the AutoScalingGroup
   * to reschedule the tasks on.
   *
   * If set to true, the AMI ID will be cached in `cdk.context.json` and the
   * same value will be used on future runs. Your instances will not be replaced
   * but your AMI version will grow old over time. To refresh the AMI lookup,
   * you will have to evict the value from the cache using the `cdk context`
   * command. See https://docs.aws.amazon.com/cdk/latest/guide/context.html for
   * more information.
   *
   * Can not be set to `true` in environment-agnostic stacks.
   *
   * Default: false
   */
  public fun cachedInContext(): Boolean? = unwrap(this).getCachedInContext()

  /**
   * The Amazon ECS variant to use.
   *
   * Default: - BottlerocketEcsVariant.AWS_ECS_1
   */
  public fun variant(): BottlerocketEcsVariant? =
      unwrap(this).getVariant()?.let(BottlerocketEcsVariant::wrap)

  /**
   * A builder for [BottleRocketImageProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param additionalCacheKey Adds an additional discriminator to the `cdk.context.json` cache
     * key.
     */
    public fun additionalCacheKey(additionalCacheKey: String)

    /**
     * @param architecture The CPU architecture.
     */
    public fun architecture(architecture: InstanceArchitecture)

    /**
     * @param cachedInContext Whether the AMI ID is cached to be stable between deployments.
     * By default, the newest image is used on each deployment. This will cause
     * instances to be replaced whenever a new version is released, and may cause
     * downtime if there aren't enough running instances in the AutoScalingGroup
     * to reschedule the tasks on.
     *
     * If set to true, the AMI ID will be cached in `cdk.context.json` and the
     * same value will be used on future runs. Your instances will not be replaced
     * but your AMI version will grow old over time. To refresh the AMI lookup,
     * you will have to evict the value from the cache using the `cdk context`
     * command. See https://docs.aws.amazon.com/cdk/latest/guide/context.html for
     * more information.
     *
     * Can not be set to `true` in environment-agnostic stacks.
     */
    public fun cachedInContext(cachedInContext: Boolean)

    /**
     * @param variant The Amazon ECS variant to use.
     */
    public fun variant(variant: BottlerocketEcsVariant)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.BottleRocketImageProps.Builder =
        software.amazon.awscdk.services.ecs.BottleRocketImageProps.builder()

    /**
     * @param additionalCacheKey Adds an additional discriminator to the `cdk.context.json` cache
     * key.
     */
    override fun additionalCacheKey(additionalCacheKey: String) {
      cdkBuilder.additionalCacheKey(additionalCacheKey)
    }

    /**
     * @param architecture The CPU architecture.
     */
    override fun architecture(architecture: InstanceArchitecture) {
      cdkBuilder.architecture(architecture.let(InstanceArchitecture.Companion::unwrap))
    }

    /**
     * @param cachedInContext Whether the AMI ID is cached to be stable between deployments.
     * By default, the newest image is used on each deployment. This will cause
     * instances to be replaced whenever a new version is released, and may cause
     * downtime if there aren't enough running instances in the AutoScalingGroup
     * to reschedule the tasks on.
     *
     * If set to true, the AMI ID will be cached in `cdk.context.json` and the
     * same value will be used on future runs. Your instances will not be replaced
     * but your AMI version will grow old over time. To refresh the AMI lookup,
     * you will have to evict the value from the cache using the `cdk context`
     * command. See https://docs.aws.amazon.com/cdk/latest/guide/context.html for
     * more information.
     *
     * Can not be set to `true` in environment-agnostic stacks.
     */
    override fun cachedInContext(cachedInContext: Boolean) {
      cdkBuilder.cachedInContext(cachedInContext)
    }

    /**
     * @param variant The Amazon ECS variant to use.
     */
    override fun variant(variant: BottlerocketEcsVariant) {
      cdkBuilder.variant(variant.let(BottlerocketEcsVariant.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.BottleRocketImageProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ecs.BottleRocketImageProps,
  ) : CdkObject(cdkObject),
      BottleRocketImageProps {
    /**
     * Adds an additional discriminator to the `cdk.context.json` cache key.
     *
     * Default: - no additional cache key
     */
    override fun additionalCacheKey(): String? = unwrap(this).getAdditionalCacheKey()

    /**
     * The CPU architecture.
     *
     * Default: - x86_64
     */
    override fun architecture(): InstanceArchitecture? =
        unwrap(this).getArchitecture()?.let(InstanceArchitecture::wrap)

    /**
     * Whether the AMI ID is cached to be stable between deployments.
     *
     * By default, the newest image is used on each deployment. This will cause
     * instances to be replaced whenever a new version is released, and may cause
     * downtime if there aren't enough running instances in the AutoScalingGroup
     * to reschedule the tasks on.
     *
     * If set to true, the AMI ID will be cached in `cdk.context.json` and the
     * same value will be used on future runs. Your instances will not be replaced
     * but your AMI version will grow old over time. To refresh the AMI lookup,
     * you will have to evict the value from the cache using the `cdk context`
     * command. See https://docs.aws.amazon.com/cdk/latest/guide/context.html for
     * more information.
     *
     * Can not be set to `true` in environment-agnostic stacks.
     *
     * Default: false
     */
    override fun cachedInContext(): Boolean? = unwrap(this).getCachedInContext()

    /**
     * The Amazon ECS variant to use.
     *
     * Default: - BottlerocketEcsVariant.AWS_ECS_1
     */
    override fun variant(): BottlerocketEcsVariant? =
        unwrap(this).getVariant()?.let(BottlerocketEcsVariant::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BottleRocketImageProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.BottleRocketImageProps):
        BottleRocketImageProps = CdkObjectWrappers.wrap(cdkObject) as? BottleRocketImageProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: BottleRocketImageProps):
        software.amazon.awscdk.services.ecs.BottleRocketImageProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.BottleRocketImageProps
  }
}

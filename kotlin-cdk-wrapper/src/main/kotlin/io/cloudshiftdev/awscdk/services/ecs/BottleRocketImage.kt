@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.IMachineImage
import io.cloudshiftdev.awscdk.services.ec2.InstanceArchitecture
import io.cloudshiftdev.awscdk.services.ec2.MachineImageConfig
import io.cloudshiftdev.constructs.Construct
import kotlin.Any
import kotlin.Boolean
import kotlin.Unit

/**
 * Construct an Bottlerocket image from the latest AMI published in SSM.
 *
 * Example:
 *
 * ```
 * Cluster cluster;
 * cluster.addCapacity("bottlerocket-asg", AddCapacityOptions.builder()
 * .minCapacity(2)
 * .instanceType(new InstanceType("c5.large"))
 * .machineImage(new BottleRocketImage())
 * .build());
 * ```
 */
public open class BottleRocketImage internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.BottleRocketImage,
) : CdkObject(cdkObject), IMachineImage {
  public constructor() : this(software.amazon.awscdk.services.ecs.BottleRocketImage()
  )

  public constructor(props: BottleRocketImageProps) :
      this(software.amazon.awscdk.services.ecs.BottleRocketImage(props.let(BottleRocketImageProps::unwrap))
  )

  public constructor(props: BottleRocketImageProps.Builder.() -> Unit) :
      this(BottleRocketImageProps(props)
  )

  /**
   * Return the correct image.
   *
   * @param scope 
   */
  public override fun image(scope: Construct): MachineImageConfig =
      unwrap(this).getImage(scope.let(Construct::unwrap)).let(MachineImageConfig::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ecs.BottleRocketImage].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The CPU architecture.
     *
     * Default: - x86_64
     *
     * @param architecture The CPU architecture. 
     */
    public fun architecture(architecture: InstanceArchitecture)

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
     *
     * @param cachedInContext Whether the AMI ID is cached to be stable between deployments. 
     */
    public fun cachedInContext(cachedInContext: Boolean)

    /**
     * The Amazon ECS variant to use.
     *
     * Default: - BottlerocketEcsVariant.AWS_ECS_1
     *
     * @param variant The Amazon ECS variant to use. 
     */
    public fun variant(variant: BottlerocketEcsVariant)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.BottleRocketImage.Builder =
        software.amazon.awscdk.services.ecs.BottleRocketImage.Builder.create()

    /**
     * The CPU architecture.
     *
     * Default: - x86_64
     *
     * @param architecture The CPU architecture. 
     */
    override fun architecture(architecture: InstanceArchitecture) {
      cdkBuilder.architecture(architecture.let(InstanceArchitecture::unwrap))
    }

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
     *
     * @param cachedInContext Whether the AMI ID is cached to be stable between deployments. 
     */
    override fun cachedInContext(cachedInContext: Boolean) {
      cdkBuilder.cachedInContext(cachedInContext)
    }

    /**
     * The Amazon ECS variant to use.
     *
     * Default: - BottlerocketEcsVariant.AWS_ECS_1
     *
     * @param variant The Amazon ECS variant to use. 
     */
    override fun variant(variant: BottlerocketEcsVariant) {
      cdkBuilder.variant(variant.let(BottlerocketEcsVariant::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.BottleRocketImage = cdkBuilder.build()
  }

  public companion object {
    public fun isBottleRocketImage(x: Any): Boolean =
        software.amazon.awscdk.services.ecs.BottleRocketImage.isBottleRocketImage(x)

    public operator fun invoke(block: Builder.() -> Unit = {}): BottleRocketImage {
      val builderImpl = BuilderImpl()
      return BottleRocketImage(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.BottleRocketImage):
        BottleRocketImage = BottleRocketImage(cdkObject)

    internal fun unwrap(wrapped: BottleRocketImage):
        software.amazon.awscdk.services.ecs.BottleRocketImage = wrapped.cdkObject
  }
}

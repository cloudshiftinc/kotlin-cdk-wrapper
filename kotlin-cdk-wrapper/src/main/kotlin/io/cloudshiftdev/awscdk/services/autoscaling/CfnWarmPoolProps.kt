@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnWarmPool`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.autoscaling.*;
 * CfnWarmPoolProps cfnWarmPoolProps = CfnWarmPoolProps.builder()
 * .autoScalingGroupName("autoScalingGroupName")
 * // the properties below are optional
 * .instanceReusePolicy(InstanceReusePolicyProperty.builder()
 * .reuseOnScaleIn(false)
 * .build())
 * .maxGroupPreparedCapacity(123)
 * .minSize(123)
 * .poolState("poolState")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-warmpool.html)
 */
public interface CfnWarmPoolProps {
  /**
   * The name of the Auto Scaling group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-warmpool.html#cfn-autoscaling-warmpool-autoscalinggroupname)
   */
  public fun autoScalingGroupName(): String

  /**
   * Indicates whether instances in the Auto Scaling group can be returned to the warm pool on scale
   * in.
   *
   * The default is to terminate instances in the Auto Scaling group when the group scales in.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-warmpool.html#cfn-autoscaling-warmpool-instancereusepolicy)
   */
  public fun instanceReusePolicy(): Any? = unwrap(this).getInstanceReusePolicy()

  /**
   * Specifies the maximum number of instances that are allowed to be in the warm pool or in any
   * state except `Terminated` for the Auto Scaling group.
   *
   * This is an optional property. Specify it only if you do not want the warm pool size to be
   * determined by the difference between the group's maximum capacity and its desired capacity.
   *
   *
   * If a value for `MaxGroupPreparedCapacity` is not specified, Amazon EC2 Auto Scaling launches
   * and maintains the difference between the group's maximum capacity and its desired capacity. If you
   * specify a value for `MaxGroupPreparedCapacity` , Amazon EC2 Auto Scaling uses the difference
   * between the `MaxGroupPreparedCapacity` and the desired capacity instead.
   *
   * The size of the warm pool is dynamic. Only when `MaxGroupPreparedCapacity` and `MinSize` are
   * set to the same value does the warm pool have an absolute size.
   *
   *
   * If the desired capacity of the Auto Scaling group is higher than the `MaxGroupPreparedCapacity`
   * , the capacity of the warm pool is 0, unless you specify a value for `MinSize` . To remove a value
   * that you previously set, include the property but specify -1 for the value.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-warmpool.html#cfn-autoscaling-warmpool-maxgrouppreparedcapacity)
   */
  public fun maxGroupPreparedCapacity(): Number? = unwrap(this).getMaxGroupPreparedCapacity()

  /**
   * Specifies the minimum number of instances to maintain in the warm pool.
   *
   * This helps you to ensure that there is always a certain number of warmed instances available to
   * handle traffic spikes. Defaults to 0 if not specified.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-warmpool.html#cfn-autoscaling-warmpool-minsize)
   */
  public fun minSize(): Number? = unwrap(this).getMinSize()

  /**
   * Sets the instance state to transition to after the lifecycle actions are complete.
   *
   * Default is `Stopped` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-warmpool.html#cfn-autoscaling-warmpool-poolstate)
   */
  public fun poolState(): String? = unwrap(this).getPoolState()

  /**
   * A builder for [CfnWarmPoolProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param autoScalingGroupName The name of the Auto Scaling group. 
     */
    public fun autoScalingGroupName(autoScalingGroupName: String)

    /**
     * @param instanceReusePolicy Indicates whether instances in the Auto Scaling group can be
     * returned to the warm pool on scale in.
     * The default is to terminate instances in the Auto Scaling group when the group scales in.
     */
    public fun instanceReusePolicy(instanceReusePolicy: IResolvable)

    /**
     * @param instanceReusePolicy Indicates whether instances in the Auto Scaling group can be
     * returned to the warm pool on scale in.
     * The default is to terminate instances in the Auto Scaling group when the group scales in.
     */
    public fun instanceReusePolicy(instanceReusePolicy: CfnWarmPool.InstanceReusePolicyProperty)

    /**
     * @param instanceReusePolicy Indicates whether instances in the Auto Scaling group can be
     * returned to the warm pool on scale in.
     * The default is to terminate instances in the Auto Scaling group when the group scales in.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4f6bd20e8652b52081e4492fc4dc86ded7d930526eadd04129a45fc8495b9aed")
    public
        fun instanceReusePolicy(instanceReusePolicy: CfnWarmPool.InstanceReusePolicyProperty.Builder.() -> Unit)

    /**
     * @param maxGroupPreparedCapacity Specifies the maximum number of instances that are allowed to
     * be in the warm pool or in any state except `Terminated` for the Auto Scaling group.
     * This is an optional property. Specify it only if you do not want the warm pool size to be
     * determined by the difference between the group's maximum capacity and its desired capacity.
     *
     *
     * If a value for `MaxGroupPreparedCapacity` is not specified, Amazon EC2 Auto Scaling launches
     * and maintains the difference between the group's maximum capacity and its desired capacity. If
     * you specify a value for `MaxGroupPreparedCapacity` , Amazon EC2 Auto Scaling uses the difference
     * between the `MaxGroupPreparedCapacity` and the desired capacity instead.
     *
     * The size of the warm pool is dynamic. Only when `MaxGroupPreparedCapacity` and `MinSize` are
     * set to the same value does the warm pool have an absolute size.
     *
     *
     * If the desired capacity of the Auto Scaling group is higher than the
     * `MaxGroupPreparedCapacity` , the capacity of the warm pool is 0, unless you specify a value for
     * `MinSize` . To remove a value that you previously set, include the property but specify -1 for
     * the value.
     */
    public fun maxGroupPreparedCapacity(maxGroupPreparedCapacity: Number)

    /**
     * @param minSize Specifies the minimum number of instances to maintain in the warm pool.
     * This helps you to ensure that there is always a certain number of warmed instances available
     * to handle traffic spikes. Defaults to 0 if not specified.
     */
    public fun minSize(minSize: Number)

    /**
     * @param poolState Sets the instance state to transition to after the lifecycle actions are
     * complete.
     * Default is `Stopped` .
     */
    public fun poolState(poolState: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.autoscaling.CfnWarmPoolProps.Builder =
        software.amazon.awscdk.services.autoscaling.CfnWarmPoolProps.builder()

    /**
     * @param autoScalingGroupName The name of the Auto Scaling group. 
     */
    override fun autoScalingGroupName(autoScalingGroupName: String) {
      cdkBuilder.autoScalingGroupName(autoScalingGroupName)
    }

    /**
     * @param instanceReusePolicy Indicates whether instances in the Auto Scaling group can be
     * returned to the warm pool on scale in.
     * The default is to terminate instances in the Auto Scaling group when the group scales in.
     */
    override fun instanceReusePolicy(instanceReusePolicy: IResolvable) {
      cdkBuilder.instanceReusePolicy(instanceReusePolicy.let(IResolvable::unwrap))
    }

    /**
     * @param instanceReusePolicy Indicates whether instances in the Auto Scaling group can be
     * returned to the warm pool on scale in.
     * The default is to terminate instances in the Auto Scaling group when the group scales in.
     */
    override fun instanceReusePolicy(instanceReusePolicy: CfnWarmPool.InstanceReusePolicyProperty) {
      cdkBuilder.instanceReusePolicy(instanceReusePolicy.let(CfnWarmPool.InstanceReusePolicyProperty::unwrap))
    }

    /**
     * @param instanceReusePolicy Indicates whether instances in the Auto Scaling group can be
     * returned to the warm pool on scale in.
     * The default is to terminate instances in the Auto Scaling group when the group scales in.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4f6bd20e8652b52081e4492fc4dc86ded7d930526eadd04129a45fc8495b9aed")
    override
        fun instanceReusePolicy(instanceReusePolicy: CfnWarmPool.InstanceReusePolicyProperty.Builder.() -> Unit):
        Unit = instanceReusePolicy(CfnWarmPool.InstanceReusePolicyProperty(instanceReusePolicy))

    /**
     * @param maxGroupPreparedCapacity Specifies the maximum number of instances that are allowed to
     * be in the warm pool or in any state except `Terminated` for the Auto Scaling group.
     * This is an optional property. Specify it only if you do not want the warm pool size to be
     * determined by the difference between the group's maximum capacity and its desired capacity.
     *
     *
     * If a value for `MaxGroupPreparedCapacity` is not specified, Amazon EC2 Auto Scaling launches
     * and maintains the difference between the group's maximum capacity and its desired capacity. If
     * you specify a value for `MaxGroupPreparedCapacity` , Amazon EC2 Auto Scaling uses the difference
     * between the `MaxGroupPreparedCapacity` and the desired capacity instead.
     *
     * The size of the warm pool is dynamic. Only when `MaxGroupPreparedCapacity` and `MinSize` are
     * set to the same value does the warm pool have an absolute size.
     *
     *
     * If the desired capacity of the Auto Scaling group is higher than the
     * `MaxGroupPreparedCapacity` , the capacity of the warm pool is 0, unless you specify a value for
     * `MinSize` . To remove a value that you previously set, include the property but specify -1 for
     * the value.
     */
    override fun maxGroupPreparedCapacity(maxGroupPreparedCapacity: Number) {
      cdkBuilder.maxGroupPreparedCapacity(maxGroupPreparedCapacity)
    }

    /**
     * @param minSize Specifies the minimum number of instances to maintain in the warm pool.
     * This helps you to ensure that there is always a certain number of warmed instances available
     * to handle traffic spikes. Defaults to 0 if not specified.
     */
    override fun minSize(minSize: Number) {
      cdkBuilder.minSize(minSize)
    }

    /**
     * @param poolState Sets the instance state to transition to after the lifecycle actions are
     * complete.
     * Default is `Stopped` .
     */
    override fun poolState(poolState: String) {
      cdkBuilder.poolState(poolState)
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.CfnWarmPoolProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.autoscaling.CfnWarmPoolProps,
  ) : CdkObject(cdkObject), CfnWarmPoolProps {
    /**
     * The name of the Auto Scaling group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-warmpool.html#cfn-autoscaling-warmpool-autoscalinggroupname)
     */
    override fun autoScalingGroupName(): String = unwrap(this).getAutoScalingGroupName()

    /**
     * Indicates whether instances in the Auto Scaling group can be returned to the warm pool on
     * scale in.
     *
     * The default is to terminate instances in the Auto Scaling group when the group scales in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-warmpool.html#cfn-autoscaling-warmpool-instancereusepolicy)
     */
    override fun instanceReusePolicy(): Any? = unwrap(this).getInstanceReusePolicy()

    /**
     * Specifies the maximum number of instances that are allowed to be in the warm pool or in any
     * state except `Terminated` for the Auto Scaling group.
     *
     * This is an optional property. Specify it only if you do not want the warm pool size to be
     * determined by the difference between the group's maximum capacity and its desired capacity.
     *
     *
     * If a value for `MaxGroupPreparedCapacity` is not specified, Amazon EC2 Auto Scaling launches
     * and maintains the difference between the group's maximum capacity and its desired capacity. If
     * you specify a value for `MaxGroupPreparedCapacity` , Amazon EC2 Auto Scaling uses the difference
     * between the `MaxGroupPreparedCapacity` and the desired capacity instead.
     *
     * The size of the warm pool is dynamic. Only when `MaxGroupPreparedCapacity` and `MinSize` are
     * set to the same value does the warm pool have an absolute size.
     *
     *
     * If the desired capacity of the Auto Scaling group is higher than the
     * `MaxGroupPreparedCapacity` , the capacity of the warm pool is 0, unless you specify a value for
     * `MinSize` . To remove a value that you previously set, include the property but specify -1 for
     * the value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-warmpool.html#cfn-autoscaling-warmpool-maxgrouppreparedcapacity)
     */
    override fun maxGroupPreparedCapacity(): Number? = unwrap(this).getMaxGroupPreparedCapacity()

    /**
     * Specifies the minimum number of instances to maintain in the warm pool.
     *
     * This helps you to ensure that there is always a certain number of warmed instances available
     * to handle traffic spikes. Defaults to 0 if not specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-warmpool.html#cfn-autoscaling-warmpool-minsize)
     */
    override fun minSize(): Number? = unwrap(this).getMinSize()

    /**
     * Sets the instance state to transition to after the lifecycle actions are complete.
     *
     * Default is `Stopped` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-warmpool.html#cfn-autoscaling-warmpool-poolstate)
     */
    override fun poolState(): String? = unwrap(this).getPoolState()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnWarmPoolProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnWarmPoolProps):
        CfnWarmPoolProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnWarmPoolProps):
        software.amazon.awscdk.services.autoscaling.CfnWarmPoolProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.autoscaling.CfnWarmPoolProps
  }
}

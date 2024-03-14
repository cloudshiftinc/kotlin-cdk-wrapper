package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnWarmPool internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.autoscaling.CfnWarmPool,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The name of the Auto Scaling group.
   */
  public open fun autoScalingGroupName(): String = unwrap(this).getAutoScalingGroupName()

  /**
   * The name of the Auto Scaling group.
   */
  public open fun autoScalingGroupName(`value`: String) {
    unwrap(this).setAutoScalingGroupName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Indicates whether instances in the Auto Scaling group can be returned to the warm pool on scale
   * in.
   */
  public open fun instanceReusePolicy(): Any? = unwrap(this).getInstanceReusePolicy()

  /**
   * Indicates whether instances in the Auto Scaling group can be returned to the warm pool on scale
   * in.
   */
  public open fun instanceReusePolicy(`value`: IResolvable) {
    unwrap(this).setInstanceReusePolicy(`value`.let(IResolvable::unwrap))
  }

  /**
   * Indicates whether instances in the Auto Scaling group can be returned to the warm pool on scale
   * in.
   */
  public open fun instanceReusePolicy(`value`: InstanceReusePolicyProperty) {
    unwrap(this).setInstanceReusePolicy(`value`.let(InstanceReusePolicyProperty::unwrap))
  }

  /**
   * Indicates whether instances in the Auto Scaling group can be returned to the warm pool on scale
   * in.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a2dd723b4dd3b974696caba348af65602d50683acfdcda6dd4ae6ce71a00789b")
  public open fun instanceReusePolicy(`value`: InstanceReusePolicyProperty.Builder.() -> Unit): Unit
      = instanceReusePolicy(InstanceReusePolicyProperty(`value`))

  /**
   * Specifies the maximum number of instances that are allowed to be in the warm pool or in any
   * state except `Terminated` for the Auto Scaling group.
   */
  public open fun maxGroupPreparedCapacity(): Number? = unwrap(this).getMaxGroupPreparedCapacity()

  /**
   * Specifies the maximum number of instances that are allowed to be in the warm pool or in any
   * state except `Terminated` for the Auto Scaling group.
   */
  public open fun maxGroupPreparedCapacity(`value`: Number) {
    unwrap(this).setMaxGroupPreparedCapacity(`value`)
  }

  /**
   * Specifies the minimum number of instances to maintain in the warm pool.
   */
  public open fun minSize(): Number? = unwrap(this).getMinSize()

  /**
   * Specifies the minimum number of instances to maintain in the warm pool.
   */
  public open fun minSize(`value`: Number) {
    unwrap(this).setMinSize(`value`)
  }

  /**
   * Sets the instance state to transition to after the lifecycle actions are complete.
   */
  public open fun poolState(): String? = unwrap(this).getPoolState()

  /**
   * Sets the instance state to transition to after the lifecycle actions are complete.
   */
  public open fun poolState(`value`: String) {
    unwrap(this).setPoolState(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.autoscaling.CfnWarmPool].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the Auto Scaling group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-warmpool.html#cfn-autoscaling-warmpool-autoscalinggroupname)
     * @param autoScalingGroupName The name of the Auto Scaling group. 
     */
    public fun autoScalingGroupName(autoScalingGroupName: String)

    /**
     * Indicates whether instances in the Auto Scaling group can be returned to the warm pool on
     * scale in.
     *
     * The default is to terminate instances in the Auto Scaling group when the group scales in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-warmpool.html#cfn-autoscaling-warmpool-instancereusepolicy)
     * @param instanceReusePolicy Indicates whether instances in the Auto Scaling group can be
     * returned to the warm pool on scale in. 
     */
    public fun instanceReusePolicy(instanceReusePolicy: IResolvable)

    /**
     * Indicates whether instances in the Auto Scaling group can be returned to the warm pool on
     * scale in.
     *
     * The default is to terminate instances in the Auto Scaling group when the group scales in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-warmpool.html#cfn-autoscaling-warmpool-instancereusepolicy)
     * @param instanceReusePolicy Indicates whether instances in the Auto Scaling group can be
     * returned to the warm pool on scale in. 
     */
    public fun instanceReusePolicy(instanceReusePolicy: InstanceReusePolicyProperty)

    /**
     * Indicates whether instances in the Auto Scaling group can be returned to the warm pool on
     * scale in.
     *
     * The default is to terminate instances in the Auto Scaling group when the group scales in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-warmpool.html#cfn-autoscaling-warmpool-instancereusepolicy)
     * @param instanceReusePolicy Indicates whether instances in the Auto Scaling group can be
     * returned to the warm pool on scale in. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a2ff5f96c2ab03a54304029bc8d707c33d8e1684eb458cf69a86659ee2f20bc8")
    public
        fun instanceReusePolicy(instanceReusePolicy: InstanceReusePolicyProperty.Builder.() -> Unit)

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
     * @param maxGroupPreparedCapacity Specifies the maximum number of instances that are allowed to
     * be in the warm pool or in any state except `Terminated` for the Auto Scaling group. 
     */
    public fun maxGroupPreparedCapacity(maxGroupPreparedCapacity: Number)

    /**
     * Specifies the minimum number of instances to maintain in the warm pool.
     *
     * This helps you to ensure that there is always a certain number of warmed instances available
     * to handle traffic spikes. Defaults to 0 if not specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-warmpool.html#cfn-autoscaling-warmpool-minsize)
     * @param minSize Specifies the minimum number of instances to maintain in the warm pool. 
     */
    public fun minSize(minSize: Number)

    /**
     * Sets the instance state to transition to after the lifecycle actions are complete.
     *
     * Default is `Stopped` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-warmpool.html#cfn-autoscaling-warmpool-poolstate)
     * @param poolState Sets the instance state to transition to after the lifecycle actions are
     * complete. 
     */
    public fun poolState(poolState: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.autoscaling.CfnWarmPool.Builder =
        software.amazon.awscdk.services.autoscaling.CfnWarmPool.Builder.create(scope, id)

    /**
     * The name of the Auto Scaling group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-warmpool.html#cfn-autoscaling-warmpool-autoscalinggroupname)
     * @param autoScalingGroupName The name of the Auto Scaling group. 
     */
    override fun autoScalingGroupName(autoScalingGroupName: String) {
      cdkBuilder.autoScalingGroupName(autoScalingGroupName)
    }

    /**
     * Indicates whether instances in the Auto Scaling group can be returned to the warm pool on
     * scale in.
     *
     * The default is to terminate instances in the Auto Scaling group when the group scales in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-warmpool.html#cfn-autoscaling-warmpool-instancereusepolicy)
     * @param instanceReusePolicy Indicates whether instances in the Auto Scaling group can be
     * returned to the warm pool on scale in. 
     */
    override fun instanceReusePolicy(instanceReusePolicy: IResolvable) {
      cdkBuilder.instanceReusePolicy(instanceReusePolicy.let(IResolvable::unwrap))
    }

    /**
     * Indicates whether instances in the Auto Scaling group can be returned to the warm pool on
     * scale in.
     *
     * The default is to terminate instances in the Auto Scaling group when the group scales in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-warmpool.html#cfn-autoscaling-warmpool-instancereusepolicy)
     * @param instanceReusePolicy Indicates whether instances in the Auto Scaling group can be
     * returned to the warm pool on scale in. 
     */
    override fun instanceReusePolicy(instanceReusePolicy: InstanceReusePolicyProperty) {
      cdkBuilder.instanceReusePolicy(instanceReusePolicy.let(InstanceReusePolicyProperty::unwrap))
    }

    /**
     * Indicates whether instances in the Auto Scaling group can be returned to the warm pool on
     * scale in.
     *
     * The default is to terminate instances in the Auto Scaling group when the group scales in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-warmpool.html#cfn-autoscaling-warmpool-instancereusepolicy)
     * @param instanceReusePolicy Indicates whether instances in the Auto Scaling group can be
     * returned to the warm pool on scale in. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a2ff5f96c2ab03a54304029bc8d707c33d8e1684eb458cf69a86659ee2f20bc8")
    override
        fun instanceReusePolicy(instanceReusePolicy: InstanceReusePolicyProperty.Builder.() -> Unit):
        Unit = instanceReusePolicy(InstanceReusePolicyProperty(instanceReusePolicy))

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
     * @param maxGroupPreparedCapacity Specifies the maximum number of instances that are allowed to
     * be in the warm pool or in any state except `Terminated` for the Auto Scaling group. 
     */
    override fun maxGroupPreparedCapacity(maxGroupPreparedCapacity: Number) {
      cdkBuilder.maxGroupPreparedCapacity(maxGroupPreparedCapacity)
    }

    /**
     * Specifies the minimum number of instances to maintain in the warm pool.
     *
     * This helps you to ensure that there is always a certain number of warmed instances available
     * to handle traffic spikes. Defaults to 0 if not specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-warmpool.html#cfn-autoscaling-warmpool-minsize)
     * @param minSize Specifies the minimum number of instances to maintain in the warm pool. 
     */
    override fun minSize(minSize: Number) {
      cdkBuilder.minSize(minSize)
    }

    /**
     * Sets the instance state to transition to after the lifecycle actions are complete.
     *
     * Default is `Stopped` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-warmpool.html#cfn-autoscaling-warmpool-poolstate)
     * @param poolState Sets the instance state to transition to after the lifecycle actions are
     * complete. 
     */
    override fun poolState(poolState: String) {
      cdkBuilder.poolState(poolState)
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.CfnWarmPool = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnWarmPool {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnWarmPool(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnWarmPool):
        CfnWarmPool = CfnWarmPool(cdkObject)

    internal fun unwrap(wrapped: CfnWarmPool):
        software.amazon.awscdk.services.autoscaling.CfnWarmPool = wrapped.cdkObject
  }

  public interface InstanceReusePolicyProperty {
    /**
     * Specifies whether instances in the Auto Scaling group can be returned to the warm pool on
     * scale in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-warmpool-instancereusepolicy.html#cfn-autoscaling-warmpool-instancereusepolicy-reuseonscalein)
     */
    public fun reuseOnScaleIn(): Any? = unwrap(this).getReuseOnScaleIn()

    /**
     * A builder for [InstanceReusePolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param reuseOnScaleIn Specifies whether instances in the Auto Scaling group can be returned
       * to the warm pool on scale in.
       */
      public fun reuseOnScaleIn(reuseOnScaleIn: Boolean)

      /**
       * @param reuseOnScaleIn Specifies whether instances in the Auto Scaling group can be returned
       * to the warm pool on scale in.
       */
      public fun reuseOnScaleIn(reuseOnScaleIn: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnWarmPool.InstanceReusePolicyProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnWarmPool.InstanceReusePolicyProperty.builder()

      /**
       * @param reuseOnScaleIn Specifies whether instances in the Auto Scaling group can be returned
       * to the warm pool on scale in.
       */
      override fun reuseOnScaleIn(reuseOnScaleIn: Boolean) {
        cdkBuilder.reuseOnScaleIn(reuseOnScaleIn)
      }

      /**
       * @param reuseOnScaleIn Specifies whether instances in the Auto Scaling group can be returned
       * to the warm pool on scale in.
       */
      override fun reuseOnScaleIn(reuseOnScaleIn: IResolvable) {
        cdkBuilder.reuseOnScaleIn(reuseOnScaleIn.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnWarmPool.InstanceReusePolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnWarmPool.InstanceReusePolicyProperty,
    ) : CdkObject(cdkObject), InstanceReusePolicyProperty {
      /**
       * Specifies whether instances in the Auto Scaling group can be returned to the warm pool on
       * scale in.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-warmpool-instancereusepolicy.html#cfn-autoscaling-warmpool-instancereusepolicy-reuseonscalein)
       */
      override fun reuseOnScaleIn(): Any? = unwrap(this).getReuseOnScaleIn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InstanceReusePolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnWarmPool.InstanceReusePolicyProperty):
          InstanceReusePolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceReusePolicyProperty):
          software.amazon.awscdk.services.autoscaling.CfnWarmPool.InstanceReusePolicyProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnWarmPool.InstanceReusePolicyProperty
    }
  }
}

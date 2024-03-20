@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a new capacity provider.
 *
 * Capacity providers are associated with an Amazon ECS cluster and are used in capacity provider
 * strategies to facilitate cluster auto scaling.
 *
 * Only capacity providers that use an Auto Scaling group can be created. Amazon ECS tasks on AWS
 * Fargate use the `FARGATE` and `FARGATE_SPOT` capacity providers. These providers are available to
 * all accounts in the AWS Regions that AWS Fargate supports.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * CfnCapacityProvider cfnCapacityProvider = CfnCapacityProvider.Builder.create(this,
 * "MyCfnCapacityProvider")
 * .autoScalingGroupProvider(AutoScalingGroupProviderProperty.builder()
 * .autoScalingGroupArn("autoScalingGroupArn")
 * // the properties below are optional
 * .managedDraining("managedDraining")
 * .managedScaling(ManagedScalingProperty.builder()
 * .instanceWarmupPeriod(123)
 * .maximumScalingStepSize(123)
 * .minimumScalingStepSize(123)
 * .status("status")
 * .targetCapacity(123)
 * .build())
 * .managedTerminationProtection("managedTerminationProtection")
 * .build())
 * // the properties below are optional
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-capacityprovider.html)
 */
public open class CfnCapacityProvider internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.CfnCapacityProvider,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCapacityProviderProps,
  ) :
      this(software.amazon.awscdk.services.ecs.CfnCapacityProvider(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnCapacityProviderProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCapacityProviderProps.Builder.() -> Unit,
  ) : this(scope, id, CfnCapacityProviderProps(props)
  )

  /**
   * The Auto Scaling group settings for the capacity provider.
   */
  public open fun autoScalingGroupProvider(): Any = unwrap(this).getAutoScalingGroupProvider()

  /**
   * The Auto Scaling group settings for the capacity provider.
   */
  public open fun autoScalingGroupProvider(`value`: IResolvable) {
    unwrap(this).setAutoScalingGroupProvider(`value`.let(IResolvable::unwrap))
  }

  /**
   * The Auto Scaling group settings for the capacity provider.
   */
  public open fun autoScalingGroupProvider(`value`: AutoScalingGroupProviderProperty) {
    unwrap(this).setAutoScalingGroupProvider(`value`.let(AutoScalingGroupProviderProperty::unwrap))
  }

  /**
   * The Auto Scaling group settings for the capacity provider.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a09c71815f1b32891bb321b5a27de0167df5db0db904175466e47c9341c7c097")
  public open
      fun autoScalingGroupProvider(`value`: AutoScalingGroupProviderProperty.Builder.() -> Unit):
      Unit = autoScalingGroupProvider(AutoScalingGroupProviderProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the capacity provider.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the capacity provider.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The metadata that you apply to the capacity provider to help you categorize and organize it.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The metadata that you apply to the capacity provider to help you categorize and organize it.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The metadata that you apply to the capacity provider to help you categorize and organize it.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ecs.CfnCapacityProvider].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Auto Scaling group settings for the capacity provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-capacityprovider.html#cfn-ecs-capacityprovider-autoscalinggroupprovider)
     * @param autoScalingGroupProvider The Auto Scaling group settings for the capacity provider. 
     */
    public fun autoScalingGroupProvider(autoScalingGroupProvider: IResolvable)

    /**
     * The Auto Scaling group settings for the capacity provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-capacityprovider.html#cfn-ecs-capacityprovider-autoscalinggroupprovider)
     * @param autoScalingGroupProvider The Auto Scaling group settings for the capacity provider. 
     */
    public fun autoScalingGroupProvider(autoScalingGroupProvider: AutoScalingGroupProviderProperty)

    /**
     * The Auto Scaling group settings for the capacity provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-capacityprovider.html#cfn-ecs-capacityprovider-autoscalinggroupprovider)
     * @param autoScalingGroupProvider The Auto Scaling group settings for the capacity provider. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("68422f447be91b9c3be8c755876526eb33f3c5b41cae3e978f5f6d9e0be64f83")
    public
        fun autoScalingGroupProvider(autoScalingGroupProvider: AutoScalingGroupProviderProperty.Builder.() -> Unit)

    /**
     * The name of the capacity provider.
     *
     * If a name is specified, it cannot start with `aws` , `ecs` , or `fargate` . If no name is
     * specified, a default name in the `CFNStackName-CFNResourceName-RandomString` format is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-capacityprovider.html#cfn-ecs-capacityprovider-name)
     * @param name The name of the capacity provider. 
     */
    public fun name(name: String)

    /**
     * The metadata that you apply to the capacity provider to help you categorize and organize it.
     *
     * Each tag consists of a key and an optional value. You define both.
     *
     * The following basic restrictions apply to tags:
     *
     * * Maximum number of tags per resource - 50
     * * For each resource, each tag key must be unique, and each tag key can have only one value.
     * * Maximum key length - 128 Unicode characters in UTF-8
     * * Maximum value length - 256 Unicode characters in UTF-8
     * * If your tagging schema is used across multiple services and resources, remember that other
     * services may have restrictions on allowed characters. Generally allowed characters are: letters,
     * numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : /
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-capacityprovider.html#cfn-ecs-capacityprovider-tags)
     * @param tags The metadata that you apply to the capacity provider to help you categorize and
     * organize it. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The metadata that you apply to the capacity provider to help you categorize and organize it.
     *
     * Each tag consists of a key and an optional value. You define both.
     *
     * The following basic restrictions apply to tags:
     *
     * * Maximum number of tags per resource - 50
     * * For each resource, each tag key must be unique, and each tag key can have only one value.
     * * Maximum key length - 128 Unicode characters in UTF-8
     * * Maximum value length - 256 Unicode characters in UTF-8
     * * If your tagging schema is used across multiple services and resources, remember that other
     * services may have restrictions on allowed characters. Generally allowed characters are: letters,
     * numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : /
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-capacityprovider.html#cfn-ecs-capacityprovider-tags)
     * @param tags The metadata that you apply to the capacity provider to help you categorize and
     * organize it. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.CfnCapacityProvider.Builder =
        software.amazon.awscdk.services.ecs.CfnCapacityProvider.Builder.create(scope, id)

    /**
     * The Auto Scaling group settings for the capacity provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-capacityprovider.html#cfn-ecs-capacityprovider-autoscalinggroupprovider)
     * @param autoScalingGroupProvider The Auto Scaling group settings for the capacity provider. 
     */
    override fun autoScalingGroupProvider(autoScalingGroupProvider: IResolvable) {
      cdkBuilder.autoScalingGroupProvider(autoScalingGroupProvider.let(IResolvable::unwrap))
    }

    /**
     * The Auto Scaling group settings for the capacity provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-capacityprovider.html#cfn-ecs-capacityprovider-autoscalinggroupprovider)
     * @param autoScalingGroupProvider The Auto Scaling group settings for the capacity provider. 
     */
    override
        fun autoScalingGroupProvider(autoScalingGroupProvider: AutoScalingGroupProviderProperty) {
      cdkBuilder.autoScalingGroupProvider(autoScalingGroupProvider.let(AutoScalingGroupProviderProperty::unwrap))
    }

    /**
     * The Auto Scaling group settings for the capacity provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-capacityprovider.html#cfn-ecs-capacityprovider-autoscalinggroupprovider)
     * @param autoScalingGroupProvider The Auto Scaling group settings for the capacity provider. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("68422f447be91b9c3be8c755876526eb33f3c5b41cae3e978f5f6d9e0be64f83")
    override
        fun autoScalingGroupProvider(autoScalingGroupProvider: AutoScalingGroupProviderProperty.Builder.() -> Unit):
        Unit = autoScalingGroupProvider(AutoScalingGroupProviderProperty(autoScalingGroupProvider))

    /**
     * The name of the capacity provider.
     *
     * If a name is specified, it cannot start with `aws` , `ecs` , or `fargate` . If no name is
     * specified, a default name in the `CFNStackName-CFNResourceName-RandomString` format is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-capacityprovider.html#cfn-ecs-capacityprovider-name)
     * @param name The name of the capacity provider. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The metadata that you apply to the capacity provider to help you categorize and organize it.
     *
     * Each tag consists of a key and an optional value. You define both.
     *
     * The following basic restrictions apply to tags:
     *
     * * Maximum number of tags per resource - 50
     * * For each resource, each tag key must be unique, and each tag key can have only one value.
     * * Maximum key length - 128 Unicode characters in UTF-8
     * * Maximum value length - 256 Unicode characters in UTF-8
     * * If your tagging schema is used across multiple services and resources, remember that other
     * services may have restrictions on allowed characters. Generally allowed characters are: letters,
     * numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : /
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-capacityprovider.html#cfn-ecs-capacityprovider-tags)
     * @param tags The metadata that you apply to the capacity provider to help you categorize and
     * organize it. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The metadata that you apply to the capacity provider to help you categorize and organize it.
     *
     * Each tag consists of a key and an optional value. You define both.
     *
     * The following basic restrictions apply to tags:
     *
     * * Maximum number of tags per resource - 50
     * * For each resource, each tag key must be unique, and each tag key can have only one value.
     * * Maximum key length - 128 Unicode characters in UTF-8
     * * Maximum value length - 256 Unicode characters in UTF-8
     * * If your tagging schema is used across multiple services and resources, remember that other
     * services may have restrictions on allowed characters. Generally allowed characters are: letters,
     * numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : /
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-capacityprovider.html#cfn-ecs-capacityprovider-tags)
     * @param tags The metadata that you apply to the capacity provider to help you categorize and
     * organize it. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ecs.CfnCapacityProvider = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ecs.CfnCapacityProvider.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCapacityProvider {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCapacityProvider(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnCapacityProvider):
        CfnCapacityProvider = CfnCapacityProvider(cdkObject)

    internal fun unwrap(wrapped: CfnCapacityProvider):
        software.amazon.awscdk.services.ecs.CfnCapacityProvider = wrapped.cdkObject
  }

  /**
   * The managed scaling settings for the Auto Scaling group capacity provider.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
   * ManagedScalingProperty managedScalingProperty = ManagedScalingProperty.builder()
   * .instanceWarmupPeriod(123)
   * .maximumScalingStepSize(123)
   * .minimumScalingStepSize(123)
   * .status("status")
   * .targetCapacity(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-capacityprovider-managedscaling.html)
   */
  public interface ManagedScalingProperty {
    /**
     * The period of time, in seconds, after a newly launched Amazon EC2 instance can contribute to
     * CloudWatch metrics for Auto Scaling group.
     *
     * If this parameter is omitted, the default value of `300` seconds is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-capacityprovider-managedscaling.html#cfn-ecs-capacityprovider-managedscaling-instancewarmupperiod)
     */
    public fun instanceWarmupPeriod(): Number? = unwrap(this).getInstanceWarmupPeriod()

    /**
     * The maximum number of Amazon EC2 instances that Amazon ECS will scale out at one time.
     *
     * The scale in process is not affected by this parameter. If this parameter is omitted, the
     * default value of `10000` is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-capacityprovider-managedscaling.html#cfn-ecs-capacityprovider-managedscaling-maximumscalingstepsize)
     */
    public fun maximumScalingStepSize(): Number? = unwrap(this).getMaximumScalingStepSize()

    /**
     * The minimum number of Amazon EC2 instances that Amazon ECS will scale out at one time.
     *
     * The scale in process is not affected by this parameter If this parameter is omitted, the
     * default value of `1` is used.
     *
     * When additional capacity is required, Amazon ECS will scale up the minimum scaling step size
     * even if the actual demand is less than the minimum scaling step size.
     *
     * If you use a capacity provider with an Auto Scaling group configured with more than one
     * Amazon EC2 instance type or Availability Zone, Amazon ECS will scale up by the exact minimum
     * scaling step size value and will ignore both the maximum scaling step size as well as the
     * capacity demand.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-capacityprovider-managedscaling.html#cfn-ecs-capacityprovider-managedscaling-minimumscalingstepsize)
     */
    public fun minimumScalingStepSize(): Number? = unwrap(this).getMinimumScalingStepSize()

    /**
     * Determines whether to use managed scaling for the capacity provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-capacityprovider-managedscaling.html#cfn-ecs-capacityprovider-managedscaling-status)
     */
    public fun status(): String? = unwrap(this).getStatus()

    /**
     * The target capacity utilization as a percentage for the capacity provider.
     *
     * The specified value must be greater than `0` and less than or equal to `100` . For example,
     * if you want the capacity provider to maintain 10% spare capacity, then that means the
     * utilization is 90%, so use a `targetCapacity` of `90` . The default value of `100` percent
     * results in the Amazon EC2 instances in your Auto Scaling group being completely used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-capacityprovider-managedscaling.html#cfn-ecs-capacityprovider-managedscaling-targetcapacity)
     */
    public fun targetCapacity(): Number? = unwrap(this).getTargetCapacity()

    /**
     * A builder for [ManagedScalingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param instanceWarmupPeriod The period of time, in seconds, after a newly launched Amazon
       * EC2 instance can contribute to CloudWatch metrics for Auto Scaling group.
       * If this parameter is omitted, the default value of `300` seconds is used.
       */
      public fun instanceWarmupPeriod(instanceWarmupPeriod: Number)

      /**
       * @param maximumScalingStepSize The maximum number of Amazon EC2 instances that Amazon ECS
       * will scale out at one time.
       * The scale in process is not affected by this parameter. If this parameter is omitted, the
       * default value of `10000` is used.
       */
      public fun maximumScalingStepSize(maximumScalingStepSize: Number)

      /**
       * @param minimumScalingStepSize The minimum number of Amazon EC2 instances that Amazon ECS
       * will scale out at one time.
       * The scale in process is not affected by this parameter If this parameter is omitted, the
       * default value of `1` is used.
       *
       * When additional capacity is required, Amazon ECS will scale up the minimum scaling step
       * size even if the actual demand is less than the minimum scaling step size.
       *
       * If you use a capacity provider with an Auto Scaling group configured with more than one
       * Amazon EC2 instance type or Availability Zone, Amazon ECS will scale up by the exact minimum
       * scaling step size value and will ignore both the maximum scaling step size as well as the
       * capacity demand.
       */
      public fun minimumScalingStepSize(minimumScalingStepSize: Number)

      /**
       * @param status Determines whether to use managed scaling for the capacity provider.
       */
      public fun status(status: String)

      /**
       * @param targetCapacity The target capacity utilization as a percentage for the capacity
       * provider.
       * The specified value must be greater than `0` and less than or equal to `100` . For example,
       * if you want the capacity provider to maintain 10% spare capacity, then that means the
       * utilization is 90%, so use a `targetCapacity` of `90` . The default value of `100` percent
       * results in the Amazon EC2 instances in your Auto Scaling group being completely used.
       */
      public fun targetCapacity(targetCapacity: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnCapacityProvider.ManagedScalingProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnCapacityProvider.ManagedScalingProperty.builder()

      /**
       * @param instanceWarmupPeriod The period of time, in seconds, after a newly launched Amazon
       * EC2 instance can contribute to CloudWatch metrics for Auto Scaling group.
       * If this parameter is omitted, the default value of `300` seconds is used.
       */
      override fun instanceWarmupPeriod(instanceWarmupPeriod: Number) {
        cdkBuilder.instanceWarmupPeriod(instanceWarmupPeriod)
      }

      /**
       * @param maximumScalingStepSize The maximum number of Amazon EC2 instances that Amazon ECS
       * will scale out at one time.
       * The scale in process is not affected by this parameter. If this parameter is omitted, the
       * default value of `10000` is used.
       */
      override fun maximumScalingStepSize(maximumScalingStepSize: Number) {
        cdkBuilder.maximumScalingStepSize(maximumScalingStepSize)
      }

      /**
       * @param minimumScalingStepSize The minimum number of Amazon EC2 instances that Amazon ECS
       * will scale out at one time.
       * The scale in process is not affected by this parameter If this parameter is omitted, the
       * default value of `1` is used.
       *
       * When additional capacity is required, Amazon ECS will scale up the minimum scaling step
       * size even if the actual demand is less than the minimum scaling step size.
       *
       * If you use a capacity provider with an Auto Scaling group configured with more than one
       * Amazon EC2 instance type or Availability Zone, Amazon ECS will scale up by the exact minimum
       * scaling step size value and will ignore both the maximum scaling step size as well as the
       * capacity demand.
       */
      override fun minimumScalingStepSize(minimumScalingStepSize: Number) {
        cdkBuilder.minimumScalingStepSize(minimumScalingStepSize)
      }

      /**
       * @param status Determines whether to use managed scaling for the capacity provider.
       */
      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      /**
       * @param targetCapacity The target capacity utilization as a percentage for the capacity
       * provider.
       * The specified value must be greater than `0` and less than or equal to `100` . For example,
       * if you want the capacity provider to maintain 10% spare capacity, then that means the
       * utilization is 90%, so use a `targetCapacity` of `90` . The default value of `100` percent
       * results in the Amazon EC2 instances in your Auto Scaling group being completely used.
       */
      override fun targetCapacity(targetCapacity: Number) {
        cdkBuilder.targetCapacity(targetCapacity)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnCapacityProvider.ManagedScalingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnCapacityProvider.ManagedScalingProperty,
    ) : CdkObject(cdkObject), ManagedScalingProperty {
      /**
       * The period of time, in seconds, after a newly launched Amazon EC2 instance can contribute
       * to CloudWatch metrics for Auto Scaling group.
       *
       * If this parameter is omitted, the default value of `300` seconds is used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-capacityprovider-managedscaling.html#cfn-ecs-capacityprovider-managedscaling-instancewarmupperiod)
       */
      override fun instanceWarmupPeriod(): Number? = unwrap(this).getInstanceWarmupPeriod()

      /**
       * The maximum number of Amazon EC2 instances that Amazon ECS will scale out at one time.
       *
       * The scale in process is not affected by this parameter. If this parameter is omitted, the
       * default value of `10000` is used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-capacityprovider-managedscaling.html#cfn-ecs-capacityprovider-managedscaling-maximumscalingstepsize)
       */
      override fun maximumScalingStepSize(): Number? = unwrap(this).getMaximumScalingStepSize()

      /**
       * The minimum number of Amazon EC2 instances that Amazon ECS will scale out at one time.
       *
       * The scale in process is not affected by this parameter If this parameter is omitted, the
       * default value of `1` is used.
       *
       * When additional capacity is required, Amazon ECS will scale up the minimum scaling step
       * size even if the actual demand is less than the minimum scaling step size.
       *
       * If you use a capacity provider with an Auto Scaling group configured with more than one
       * Amazon EC2 instance type or Availability Zone, Amazon ECS will scale up by the exact minimum
       * scaling step size value and will ignore both the maximum scaling step size as well as the
       * capacity demand.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-capacityprovider-managedscaling.html#cfn-ecs-capacityprovider-managedscaling-minimumscalingstepsize)
       */
      override fun minimumScalingStepSize(): Number? = unwrap(this).getMinimumScalingStepSize()

      /**
       * Determines whether to use managed scaling for the capacity provider.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-capacityprovider-managedscaling.html#cfn-ecs-capacityprovider-managedscaling-status)
       */
      override fun status(): String? = unwrap(this).getStatus()

      /**
       * The target capacity utilization as a percentage for the capacity provider.
       *
       * The specified value must be greater than `0` and less than or equal to `100` . For example,
       * if you want the capacity provider to maintain 10% spare capacity, then that means the
       * utilization is 90%, so use a `targetCapacity` of `90` . The default value of `100` percent
       * results in the Amazon EC2 instances in your Auto Scaling group being completely used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-capacityprovider-managedscaling.html#cfn-ecs-capacityprovider-managedscaling-targetcapacity)
       */
      override fun targetCapacity(): Number? = unwrap(this).getTargetCapacity()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ManagedScalingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnCapacityProvider.ManagedScalingProperty):
          ManagedScalingProperty = CdkObjectWrappers.wrap(cdkObject) as? ManagedScalingProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ManagedScalingProperty):
          software.amazon.awscdk.services.ecs.CfnCapacityProvider.ManagedScalingProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnCapacityProvider.ManagedScalingProperty
    }
  }

  /**
   * The details of the Auto Scaling group for the capacity provider.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
   * AutoScalingGroupProviderProperty autoScalingGroupProviderProperty =
   * AutoScalingGroupProviderProperty.builder()
   * .autoScalingGroupArn("autoScalingGroupArn")
   * // the properties below are optional
   * .managedDraining("managedDraining")
   * .managedScaling(ManagedScalingProperty.builder()
   * .instanceWarmupPeriod(123)
   * .maximumScalingStepSize(123)
   * .minimumScalingStepSize(123)
   * .status("status")
   * .targetCapacity(123)
   * .build())
   * .managedTerminationProtection("managedTerminationProtection")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-capacityprovider-autoscalinggroupprovider.html)
   */
  public interface AutoScalingGroupProviderProperty {
    /**
     * The Amazon Resource Name (ARN) that identifies the Auto Scaling group, or the Auto Scaling
     * group name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-capacityprovider-autoscalinggroupprovider.html#cfn-ecs-capacityprovider-autoscalinggroupprovider-autoscalinggrouparn)
     */
    public fun autoScalingGroupArn(): String

    /**
     * The managed draining option for the Auto Scaling group capacity provider.
     *
     * When you enable this, Amazon ECS manages and gracefully drains the EC2 container instances
     * that are in the Auto Scaling group capacity provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-capacityprovider-autoscalinggroupprovider.html#cfn-ecs-capacityprovider-autoscalinggroupprovider-manageddraining)
     */
    public fun managedDraining(): String? = unwrap(this).getManagedDraining()

    /**
     * The managed scaling settings for the Auto Scaling group capacity provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-capacityprovider-autoscalinggroupprovider.html#cfn-ecs-capacityprovider-autoscalinggroupprovider-managedscaling)
     */
    public fun managedScaling(): Any? = unwrap(this).getManagedScaling()

    /**
     * The managed termination protection setting to use for the Auto Scaling group capacity
     * provider.
     *
     * This determines whether the Auto Scaling group has managed termination protection. The
     * default is off.
     *
     *
     * When using managed termination protection, managed scaling must also be used otherwise
     * managed termination protection doesn't work.
     *
     *
     * When managed termination protection is on, Amazon ECS prevents the Amazon EC2 instances in an
     * Auto Scaling group that contain tasks from being terminated during a scale-in action. The Auto
     * Scaling group and each instance in the Auto Scaling group must have instance protection from
     * scale-in actions on as well. For more information, see [Instance
     * Protection](https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html#instance-protection)
     * in the *AWS Auto Scaling User Guide* .
     *
     * When managed termination protection is off, your Amazon EC2 instances aren't protected from
     * termination when the Auto Scaling group scales in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-capacityprovider-autoscalinggroupprovider.html#cfn-ecs-capacityprovider-autoscalinggroupprovider-managedterminationprotection)
     */
    public fun managedTerminationProtection(): String? =
        unwrap(this).getManagedTerminationProtection()

    /**
     * A builder for [AutoScalingGroupProviderProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param autoScalingGroupArn The Amazon Resource Name (ARN) that identifies the Auto Scaling
       * group, or the Auto Scaling group name. 
       */
      public fun autoScalingGroupArn(autoScalingGroupArn: String)

      /**
       * @param managedDraining The managed draining option for the Auto Scaling group capacity
       * provider.
       * When you enable this, Amazon ECS manages and gracefully drains the EC2 container instances
       * that are in the Auto Scaling group capacity provider.
       */
      public fun managedDraining(managedDraining: String)

      /**
       * @param managedScaling The managed scaling settings for the Auto Scaling group capacity
       * provider.
       */
      public fun managedScaling(managedScaling: IResolvable)

      /**
       * @param managedScaling The managed scaling settings for the Auto Scaling group capacity
       * provider.
       */
      public fun managedScaling(managedScaling: ManagedScalingProperty)

      /**
       * @param managedScaling The managed scaling settings for the Auto Scaling group capacity
       * provider.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("44931cd342e50c37549dae89b6cbbe6b4f5f8ec40770076d154685503c77bd15")
      public fun managedScaling(managedScaling: ManagedScalingProperty.Builder.() -> Unit)

      /**
       * @param managedTerminationProtection The managed termination protection setting to use for
       * the Auto Scaling group capacity provider.
       * This determines whether the Auto Scaling group has managed termination protection. The
       * default is off.
       *
       *
       * When using managed termination protection, managed scaling must also be used otherwise
       * managed termination protection doesn't work.
       *
       *
       * When managed termination protection is on, Amazon ECS prevents the Amazon EC2 instances in
       * an Auto Scaling group that contain tasks from being terminated during a scale-in action. The
       * Auto Scaling group and each instance in the Auto Scaling group must have instance protection
       * from scale-in actions on as well. For more information, see [Instance
       * Protection](https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html#instance-protection)
       * in the *AWS Auto Scaling User Guide* .
       *
       * When managed termination protection is off, your Amazon EC2 instances aren't protected from
       * termination when the Auto Scaling group scales in.
       */
      public fun managedTerminationProtection(managedTerminationProtection: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnCapacityProvider.AutoScalingGroupProviderProperty.Builder
          =
          software.amazon.awscdk.services.ecs.CfnCapacityProvider.AutoScalingGroupProviderProperty.builder()

      /**
       * @param autoScalingGroupArn The Amazon Resource Name (ARN) that identifies the Auto Scaling
       * group, or the Auto Scaling group name. 
       */
      override fun autoScalingGroupArn(autoScalingGroupArn: String) {
        cdkBuilder.autoScalingGroupArn(autoScalingGroupArn)
      }

      /**
       * @param managedDraining The managed draining option for the Auto Scaling group capacity
       * provider.
       * When you enable this, Amazon ECS manages and gracefully drains the EC2 container instances
       * that are in the Auto Scaling group capacity provider.
       */
      override fun managedDraining(managedDraining: String) {
        cdkBuilder.managedDraining(managedDraining)
      }

      /**
       * @param managedScaling The managed scaling settings for the Auto Scaling group capacity
       * provider.
       */
      override fun managedScaling(managedScaling: IResolvable) {
        cdkBuilder.managedScaling(managedScaling.let(IResolvable::unwrap))
      }

      /**
       * @param managedScaling The managed scaling settings for the Auto Scaling group capacity
       * provider.
       */
      override fun managedScaling(managedScaling: ManagedScalingProperty) {
        cdkBuilder.managedScaling(managedScaling.let(ManagedScalingProperty::unwrap))
      }

      /**
       * @param managedScaling The managed scaling settings for the Auto Scaling group capacity
       * provider.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("44931cd342e50c37549dae89b6cbbe6b4f5f8ec40770076d154685503c77bd15")
      override fun managedScaling(managedScaling: ManagedScalingProperty.Builder.() -> Unit): Unit =
          managedScaling(ManagedScalingProperty(managedScaling))

      /**
       * @param managedTerminationProtection The managed termination protection setting to use for
       * the Auto Scaling group capacity provider.
       * This determines whether the Auto Scaling group has managed termination protection. The
       * default is off.
       *
       *
       * When using managed termination protection, managed scaling must also be used otherwise
       * managed termination protection doesn't work.
       *
       *
       * When managed termination protection is on, Amazon ECS prevents the Amazon EC2 instances in
       * an Auto Scaling group that contain tasks from being terminated during a scale-in action. The
       * Auto Scaling group and each instance in the Auto Scaling group must have instance protection
       * from scale-in actions on as well. For more information, see [Instance
       * Protection](https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html#instance-protection)
       * in the *AWS Auto Scaling User Guide* .
       *
       * When managed termination protection is off, your Amazon EC2 instances aren't protected from
       * termination when the Auto Scaling group scales in.
       */
      override fun managedTerminationProtection(managedTerminationProtection: String) {
        cdkBuilder.managedTerminationProtection(managedTerminationProtection)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnCapacityProvider.AutoScalingGroupProviderProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnCapacityProvider.AutoScalingGroupProviderProperty,
    ) : CdkObject(cdkObject), AutoScalingGroupProviderProperty {
      /**
       * The Amazon Resource Name (ARN) that identifies the Auto Scaling group, or the Auto Scaling
       * group name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-capacityprovider-autoscalinggroupprovider.html#cfn-ecs-capacityprovider-autoscalinggroupprovider-autoscalinggrouparn)
       */
      override fun autoScalingGroupArn(): String = unwrap(this).getAutoScalingGroupArn()

      /**
       * The managed draining option for the Auto Scaling group capacity provider.
       *
       * When you enable this, Amazon ECS manages and gracefully drains the EC2 container instances
       * that are in the Auto Scaling group capacity provider.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-capacityprovider-autoscalinggroupprovider.html#cfn-ecs-capacityprovider-autoscalinggroupprovider-manageddraining)
       */
      override fun managedDraining(): String? = unwrap(this).getManagedDraining()

      /**
       * The managed scaling settings for the Auto Scaling group capacity provider.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-capacityprovider-autoscalinggroupprovider.html#cfn-ecs-capacityprovider-autoscalinggroupprovider-managedscaling)
       */
      override fun managedScaling(): Any? = unwrap(this).getManagedScaling()

      /**
       * The managed termination protection setting to use for the Auto Scaling group capacity
       * provider.
       *
       * This determines whether the Auto Scaling group has managed termination protection. The
       * default is off.
       *
       *
       * When using managed termination protection, managed scaling must also be used otherwise
       * managed termination protection doesn't work.
       *
       *
       * When managed termination protection is on, Amazon ECS prevents the Amazon EC2 instances in
       * an Auto Scaling group that contain tasks from being terminated during a scale-in action. The
       * Auto Scaling group and each instance in the Auto Scaling group must have instance protection
       * from scale-in actions on as well. For more information, see [Instance
       * Protection](https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html#instance-protection)
       * in the *AWS Auto Scaling User Guide* .
       *
       * When managed termination protection is off, your Amazon EC2 instances aren't protected from
       * termination when the Auto Scaling group scales in.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-capacityprovider-autoscalinggroupprovider.html#cfn-ecs-capacityprovider-autoscalinggroupprovider-managedterminationprotection)
       */
      override fun managedTerminationProtection(): String? =
          unwrap(this).getManagedTerminationProtection()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AutoScalingGroupProviderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnCapacityProvider.AutoScalingGroupProviderProperty):
          AutoScalingGroupProviderProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AutoScalingGroupProviderProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutoScalingGroupProviderProperty):
          software.amazon.awscdk.services.ecs.CfnCapacityProvider.AutoScalingGroupProviderProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnCapacityProvider.AutoScalingGroupProviderProperty
    }
  }
}

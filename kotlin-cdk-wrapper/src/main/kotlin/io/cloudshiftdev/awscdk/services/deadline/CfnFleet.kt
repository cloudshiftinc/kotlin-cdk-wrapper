@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.deadline

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
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
 * Creates a fleet.
 *
 * Fleets gather information relating to compute, or capacity, for renders within your farms. You
 * can choose to manage your own capacity or opt to have fleets fully managed by Deadline Cloud.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.deadline.*;
 * CfnFleet cfnFleet = CfnFleet.Builder.create(this, "MyCfnFleet")
 * .configuration(FleetConfigurationProperty.builder()
 * .customerManaged(CustomerManagedFleetConfigurationProperty.builder()
 * .mode("mode")
 * .workerCapabilities(CustomerManagedWorkerCapabilitiesProperty.builder()
 * .cpuArchitectureType("cpuArchitectureType")
 * .memoryMiB(MemoryMiBRangeProperty.builder()
 * .min(123)
 * // the properties below are optional
 * .max(123)
 * .build())
 * .osFamily("osFamily")
 * .vCpuCount(VCpuCountRangeProperty.builder()
 * .min(123)
 * // the properties below are optional
 * .max(123)
 * .build())
 * // the properties below are optional
 * .acceleratorCount(AcceleratorCountRangeProperty.builder()
 * .min(123)
 * // the properties below are optional
 * .max(123)
 * .build())
 * .acceleratorTotalMemoryMiB(AcceleratorTotalMemoryMiBRangeProperty.builder()
 * .min(123)
 * // the properties below are optional
 * .max(123)
 * .build())
 * .acceleratorTypes(List.of("acceleratorTypes"))
 * .customAmounts(List.of(FleetAmountCapabilityProperty.builder()
 * .min(123)
 * .name("name")
 * // the properties below are optional
 * .max(123)
 * .build()))
 * .customAttributes(List.of(FleetAttributeCapabilityProperty.builder()
 * .name("name")
 * .values(List.of("values"))
 * .build()))
 * .build())
 * // the properties below are optional
 * .storageProfileId("storageProfileId")
 * .build())
 * .serviceManagedEc2(ServiceManagedEc2FleetConfigurationProperty.builder()
 * .instanceCapabilities(ServiceManagedEc2InstanceCapabilitiesProperty.builder()
 * .cpuArchitectureType("cpuArchitectureType")
 * .memoryMiB(MemoryMiBRangeProperty.builder()
 * .min(123)
 * // the properties below are optional
 * .max(123)
 * .build())
 * .osFamily("osFamily")
 * .vCpuCount(VCpuCountRangeProperty.builder()
 * .min(123)
 * // the properties below are optional
 * .max(123)
 * .build())
 * // the properties below are optional
 * .allowedInstanceTypes(List.of("allowedInstanceTypes"))
 * .customAmounts(List.of(FleetAmountCapabilityProperty.builder()
 * .min(123)
 * .name("name")
 * // the properties below are optional
 * .max(123)
 * .build()))
 * .customAttributes(List.of(FleetAttributeCapabilityProperty.builder()
 * .name("name")
 * .values(List.of("values"))
 * .build()))
 * .excludedInstanceTypes(List.of("excludedInstanceTypes"))
 * .rootEbsVolume(Ec2EbsVolumeProperty.builder()
 * .iops(123)
 * .sizeGiB(123)
 * .throughputMiB(123)
 * .build())
 * .build())
 * .instanceMarketOptions(ServiceManagedEc2InstanceMarketOptionsProperty.builder()
 * .type("type")
 * .build())
 * .build())
 * .build())
 * .displayName("displayName")
 * .maxWorkerCount(123)
 * .roleArn("roleArn")
 * // the properties below are optional
 * .description("description")
 * .farmId("farmId")
 * .minWorkerCount(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-fleet.html)
 */
public open class CfnFleet(
  cdkObject: software.amazon.awscdk.services.deadline.CfnFleet,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnFleetProps,
  ) :
      this(software.amazon.awscdk.services.deadline.CfnFleet(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnFleetProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnFleetProps.Builder.() -> Unit,
  ) : this(scope, id, CfnFleetProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) assigned to the fleet.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   *
   */
  public open fun attrCapabilities(): IResolvable =
      unwrap(this).getAttrCapabilities().let(IResolvable::wrap)

  /**
   * The fleet ID.
   */
  public open fun attrFleetId(): String = unwrap(this).getAttrFleetId()

  /**
   * The status of the fleet.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * The number of workers in the fleet summary.
   */
  public open fun attrWorkerCount(): Number = unwrap(this).getAttrWorkerCount()

  /**
   * The configuration details for the fleet.
   */
  public open fun configuration(): Any = unwrap(this).getConfiguration()

  /**
   * The configuration details for the fleet.
   */
  public open fun configuration(`value`: IResolvable) {
    unwrap(this).setConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The configuration details for the fleet.
   */
  public open fun configuration(`value`: FleetConfigurationProperty) {
    unwrap(this).setConfiguration(`value`.let(FleetConfigurationProperty.Companion::unwrap))
  }

  /**
   * The configuration details for the fleet.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4d24951a4113f8bfd2367704d1df2cdc6cd6bad2fa55d8056ba5e74c6ecfb153")
  public open fun configuration(`value`: FleetConfigurationProperty.Builder.() -> Unit): Unit =
      configuration(FleetConfigurationProperty(`value`))

  /**
   * A description that helps identify what the fleet is used for.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description that helps identify what the fleet is used for.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The display name of the fleet summary to update.
   */
  public open fun displayName(): String = unwrap(this).getDisplayName()

  /**
   * The display name of the fleet summary to update.
   */
  public open fun displayName(`value`: String) {
    unwrap(this).setDisplayName(`value`)
  }

  /**
   * The farm ID.
   */
  public open fun farmId(): String? = unwrap(this).getFarmId()

  /**
   * The farm ID.
   */
  public open fun farmId(`value`: String) {
    unwrap(this).setFarmId(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The maximum number of workers specified in the fleet.
   */
  public open fun maxWorkerCount(): Number = unwrap(this).getMaxWorkerCount()

  /**
   * The maximum number of workers specified in the fleet.
   */
  public open fun maxWorkerCount(`value`: Number) {
    unwrap(this).setMaxWorkerCount(`value`)
  }

  /**
   * The minimum number of workers in the fleet.
   */
  public open fun minWorkerCount(): Number? = unwrap(this).getMinWorkerCount()

  /**
   * The minimum number of workers in the fleet.
   */
  public open fun minWorkerCount(`value`: Number) {
    unwrap(this).setMinWorkerCount(`value`)
  }

  /**
   * The IAM role that workers in the fleet use when processing jobs.
   */
  public open fun roleArn(): String = unwrap(this).getRoleArn()

  /**
   * The IAM role that workers in the fleet use when processing jobs.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.deadline.CfnFleet].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The configuration details for the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-fleet.html#cfn-deadline-fleet-configuration)
     * @param configuration The configuration details for the fleet. 
     */
    public fun configuration(configuration: IResolvable)

    /**
     * The configuration details for the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-fleet.html#cfn-deadline-fleet-configuration)
     * @param configuration The configuration details for the fleet. 
     */
    public fun configuration(configuration: FleetConfigurationProperty)

    /**
     * The configuration details for the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-fleet.html#cfn-deadline-fleet-configuration)
     * @param configuration The configuration details for the fleet. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7fd9d5f96b1071703694a7dcab950624a48683661f2e89274b76b94e98f6eeaf")
    public fun configuration(configuration: FleetConfigurationProperty.Builder.() -> Unit)

    /**
     * A description that helps identify what the fleet is used for.
     *
     * Default: - ""
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-fleet.html#cfn-deadline-fleet-description)
     * @param description A description that helps identify what the fleet is used for. 
     */
    public fun description(description: String)

    /**
     * The display name of the fleet summary to update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-fleet.html#cfn-deadline-fleet-displayname)
     * @param displayName The display name of the fleet summary to update. 
     */
    public fun displayName(displayName: String)

    /**
     * The farm ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-fleet.html#cfn-deadline-fleet-farmid)
     * @param farmId The farm ID. 
     */
    public fun farmId(farmId: String)

    /**
     * The maximum number of workers specified in the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-fleet.html#cfn-deadline-fleet-maxworkercount)
     * @param maxWorkerCount The maximum number of workers specified in the fleet. 
     */
    public fun maxWorkerCount(maxWorkerCount: Number)

    /**
     * The minimum number of workers in the fleet.
     *
     * Default: - 0
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-fleet.html#cfn-deadline-fleet-minworkercount)
     * @param minWorkerCount The minimum number of workers in the fleet. 
     */
    public fun minWorkerCount(minWorkerCount: Number)

    /**
     * The IAM role that workers in the fleet use when processing jobs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-fleet.html#cfn-deadline-fleet-rolearn)
     * @param roleArn The IAM role that workers in the fleet use when processing jobs. 
     */
    public fun roleArn(roleArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.deadline.CfnFleet.Builder =
        software.amazon.awscdk.services.deadline.CfnFleet.Builder.create(scope, id)

    /**
     * The configuration details for the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-fleet.html#cfn-deadline-fleet-configuration)
     * @param configuration The configuration details for the fleet. 
     */
    override fun configuration(configuration: IResolvable) {
      cdkBuilder.configuration(configuration.let(IResolvable.Companion::unwrap))
    }

    /**
     * The configuration details for the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-fleet.html#cfn-deadline-fleet-configuration)
     * @param configuration The configuration details for the fleet. 
     */
    override fun configuration(configuration: FleetConfigurationProperty) {
      cdkBuilder.configuration(configuration.let(FleetConfigurationProperty.Companion::unwrap))
    }

    /**
     * The configuration details for the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-fleet.html#cfn-deadline-fleet-configuration)
     * @param configuration The configuration details for the fleet. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7fd9d5f96b1071703694a7dcab950624a48683661f2e89274b76b94e98f6eeaf")
    override fun configuration(configuration: FleetConfigurationProperty.Builder.() -> Unit): Unit =
        configuration(FleetConfigurationProperty(configuration))

    /**
     * A description that helps identify what the fleet is used for.
     *
     * Default: - ""
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-fleet.html#cfn-deadline-fleet-description)
     * @param description A description that helps identify what the fleet is used for. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The display name of the fleet summary to update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-fleet.html#cfn-deadline-fleet-displayname)
     * @param displayName The display name of the fleet summary to update. 
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * The farm ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-fleet.html#cfn-deadline-fleet-farmid)
     * @param farmId The farm ID. 
     */
    override fun farmId(farmId: String) {
      cdkBuilder.farmId(farmId)
    }

    /**
     * The maximum number of workers specified in the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-fleet.html#cfn-deadline-fleet-maxworkercount)
     * @param maxWorkerCount The maximum number of workers specified in the fleet. 
     */
    override fun maxWorkerCount(maxWorkerCount: Number) {
      cdkBuilder.maxWorkerCount(maxWorkerCount)
    }

    /**
     * The minimum number of workers in the fleet.
     *
     * Default: - 0
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-fleet.html#cfn-deadline-fleet-minworkercount)
     * @param minWorkerCount The minimum number of workers in the fleet. 
     */
    override fun minWorkerCount(minWorkerCount: Number) {
      cdkBuilder.minWorkerCount(minWorkerCount)
    }

    /**
     * The IAM role that workers in the fleet use when processing jobs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-fleet.html#cfn-deadline-fleet-rolearn)
     * @param roleArn The IAM role that workers in the fleet use when processing jobs. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public fun build(): software.amazon.awscdk.services.deadline.CfnFleet = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.deadline.CfnFleet.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFleet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFleet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.deadline.CfnFleet): CfnFleet =
        CfnFleet(cdkObject)

    internal fun unwrap(wrapped: CfnFleet): software.amazon.awscdk.services.deadline.CfnFleet =
        wrapped.cdkObject as software.amazon.awscdk.services.deadline.CfnFleet
  }

  /**
   * The range for the GPU fleet acceleration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.deadline.*;
   * AcceleratorCountRangeProperty acceleratorCountRangeProperty =
   * AcceleratorCountRangeProperty.builder()
   * .min(123)
   * // the properties below are optional
   * .max(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-acceleratorcountrange.html)
   */
  public interface AcceleratorCountRangeProperty {
    /**
     * The maximum GPU for the accelerator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-acceleratorcountrange.html#cfn-deadline-fleet-acceleratorcountrange-max)
     */
    public fun max(): Number? = unwrap(this).getMax()

    /**
     * The minimum GPU for the accelerator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-acceleratorcountrange.html#cfn-deadline-fleet-acceleratorcountrange-min)
     */
    public fun min(): Number

    /**
     * A builder for [AcceleratorCountRangeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param max The maximum GPU for the accelerator.
       */
      public fun max(max: Number)

      /**
       * @param min The minimum GPU for the accelerator. 
       */
      public fun min(min: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.deadline.CfnFleet.AcceleratorCountRangeProperty.Builder =
          software.amazon.awscdk.services.deadline.CfnFleet.AcceleratorCountRangeProperty.builder()

      /**
       * @param max The maximum GPU for the accelerator.
       */
      override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      /**
       * @param min The minimum GPU for the accelerator. 
       */
      override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build():
          software.amazon.awscdk.services.deadline.CfnFleet.AcceleratorCountRangeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.deadline.CfnFleet.AcceleratorCountRangeProperty,
    ) : CdkObject(cdkObject), AcceleratorCountRangeProperty {
      /**
       * The maximum GPU for the accelerator.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-acceleratorcountrange.html#cfn-deadline-fleet-acceleratorcountrange-max)
       */
      override fun max(): Number? = unwrap(this).getMax()

      /**
       * The minimum GPU for the accelerator.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-acceleratorcountrange.html#cfn-deadline-fleet-acceleratorcountrange-min)
       */
      override fun min(): Number = unwrap(this).getMin()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AcceleratorCountRangeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.deadline.CfnFleet.AcceleratorCountRangeProperty):
          AcceleratorCountRangeProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AcceleratorCountRangeProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AcceleratorCountRangeProperty):
          software.amazon.awscdk.services.deadline.CfnFleet.AcceleratorCountRangeProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.deadline.CfnFleet.AcceleratorCountRangeProperty
    }
  }

  /**
   * The range for memory, in MiB, to use for the accelerator.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.deadline.*;
   * AcceleratorTotalMemoryMiBRangeProperty acceleratorTotalMemoryMiBRangeProperty =
   * AcceleratorTotalMemoryMiBRangeProperty.builder()
   * .min(123)
   * // the properties below are optional
   * .max(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-acceleratortotalmemorymibrange.html)
   */
  public interface AcceleratorTotalMemoryMiBRangeProperty {
    /**
     * The maximum amount of memory to use for the accelerator, measured in MiB.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-acceleratortotalmemorymibrange.html#cfn-deadline-fleet-acceleratortotalmemorymibrange-max)
     */
    public fun max(): Number? = unwrap(this).getMax()

    /**
     * The minimum amount of memory to use for the accelerator, measured in MiB.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-acceleratortotalmemorymibrange.html#cfn-deadline-fleet-acceleratortotalmemorymibrange-min)
     */
    public fun min(): Number

    /**
     * A builder for [AcceleratorTotalMemoryMiBRangeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param max The maximum amount of memory to use for the accelerator, measured in MiB.
       */
      public fun max(max: Number)

      /**
       * @param min The minimum amount of memory to use for the accelerator, measured in MiB. 
       */
      public fun min(min: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.deadline.CfnFleet.AcceleratorTotalMemoryMiBRangeProperty.Builder
          =
          software.amazon.awscdk.services.deadline.CfnFleet.AcceleratorTotalMemoryMiBRangeProperty.builder()

      /**
       * @param max The maximum amount of memory to use for the accelerator, measured in MiB.
       */
      override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      /**
       * @param min The minimum amount of memory to use for the accelerator, measured in MiB. 
       */
      override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build():
          software.amazon.awscdk.services.deadline.CfnFleet.AcceleratorTotalMemoryMiBRangeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.deadline.CfnFleet.AcceleratorTotalMemoryMiBRangeProperty,
    ) : CdkObject(cdkObject), AcceleratorTotalMemoryMiBRangeProperty {
      /**
       * The maximum amount of memory to use for the accelerator, measured in MiB.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-acceleratortotalmemorymibrange.html#cfn-deadline-fleet-acceleratortotalmemorymibrange-max)
       */
      override fun max(): Number? = unwrap(this).getMax()

      /**
       * The minimum amount of memory to use for the accelerator, measured in MiB.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-acceleratortotalmemorymibrange.html#cfn-deadline-fleet-acceleratortotalmemorymibrange-min)
       */
      override fun min(): Number = unwrap(this).getMin()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AcceleratorTotalMemoryMiBRangeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.deadline.CfnFleet.AcceleratorTotalMemoryMiBRangeProperty):
          AcceleratorTotalMemoryMiBRangeProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AcceleratorTotalMemoryMiBRangeProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AcceleratorTotalMemoryMiBRangeProperty):
          software.amazon.awscdk.services.deadline.CfnFleet.AcceleratorTotalMemoryMiBRangeProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.deadline.CfnFleet.AcceleratorTotalMemoryMiBRangeProperty
    }
  }

  /**
   * The details of a customer managed fleet configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.deadline.*;
   * CustomerManagedFleetConfigurationProperty customerManagedFleetConfigurationProperty =
   * CustomerManagedFleetConfigurationProperty.builder()
   * .mode("mode")
   * .workerCapabilities(CustomerManagedWorkerCapabilitiesProperty.builder()
   * .cpuArchitectureType("cpuArchitectureType")
   * .memoryMiB(MemoryMiBRangeProperty.builder()
   * .min(123)
   * // the properties below are optional
   * .max(123)
   * .build())
   * .osFamily("osFamily")
   * .vCpuCount(VCpuCountRangeProperty.builder()
   * .min(123)
   * // the properties below are optional
   * .max(123)
   * .build())
   * // the properties below are optional
   * .acceleratorCount(AcceleratorCountRangeProperty.builder()
   * .min(123)
   * // the properties below are optional
   * .max(123)
   * .build())
   * .acceleratorTotalMemoryMiB(AcceleratorTotalMemoryMiBRangeProperty.builder()
   * .min(123)
   * // the properties below are optional
   * .max(123)
   * .build())
   * .acceleratorTypes(List.of("acceleratorTypes"))
   * .customAmounts(List.of(FleetAmountCapabilityProperty.builder()
   * .min(123)
   * .name("name")
   * // the properties below are optional
   * .max(123)
   * .build()))
   * .customAttributes(List.of(FleetAttributeCapabilityProperty.builder()
   * .name("name")
   * .values(List.of("values"))
   * .build()))
   * .build())
   * // the properties below are optional
   * .storageProfileId("storageProfileId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-customermanagedfleetconfiguration.html)
   */
  public interface CustomerManagedFleetConfigurationProperty {
    /**
     * The AWS Auto Scaling mode for the customer managed fleet configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-customermanagedfleetconfiguration.html#cfn-deadline-fleet-customermanagedfleetconfiguration-mode)
     */
    public fun mode(): String

    /**
     * The storage profile ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-customermanagedfleetconfiguration.html#cfn-deadline-fleet-customermanagedfleetconfiguration-storageprofileid)
     */
    public fun storageProfileId(): String? = unwrap(this).getStorageProfileId()

    /**
     * The worker capabilities for a customer managed fleet configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-customermanagedfleetconfiguration.html#cfn-deadline-fleet-customermanagedfleetconfiguration-workercapabilities)
     */
    public fun workerCapabilities(): Any

    /**
     * A builder for [CustomerManagedFleetConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param mode The AWS Auto Scaling mode for the customer managed fleet configuration. 
       */
      public fun mode(mode: String)

      /**
       * @param storageProfileId The storage profile ID.
       */
      public fun storageProfileId(storageProfileId: String)

      /**
       * @param workerCapabilities The worker capabilities for a customer managed fleet
       * configuration. 
       */
      public fun workerCapabilities(workerCapabilities: IResolvable)

      /**
       * @param workerCapabilities The worker capabilities for a customer managed fleet
       * configuration. 
       */
      public fun workerCapabilities(workerCapabilities: CustomerManagedWorkerCapabilitiesProperty)

      /**
       * @param workerCapabilities The worker capabilities for a customer managed fleet
       * configuration. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2cf8eaf19b19246aeaef77ad614059f7c46e02536e16318882136dfa14296282")
      public
          fun workerCapabilities(workerCapabilities: CustomerManagedWorkerCapabilitiesProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.deadline.CfnFleet.CustomerManagedFleetConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.deadline.CfnFleet.CustomerManagedFleetConfigurationProperty.builder()

      /**
       * @param mode The AWS Auto Scaling mode for the customer managed fleet configuration. 
       */
      override fun mode(mode: String) {
        cdkBuilder.mode(mode)
      }

      /**
       * @param storageProfileId The storage profile ID.
       */
      override fun storageProfileId(storageProfileId: String) {
        cdkBuilder.storageProfileId(storageProfileId)
      }

      /**
       * @param workerCapabilities The worker capabilities for a customer managed fleet
       * configuration. 
       */
      override fun workerCapabilities(workerCapabilities: IResolvable) {
        cdkBuilder.workerCapabilities(workerCapabilities.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param workerCapabilities The worker capabilities for a customer managed fleet
       * configuration. 
       */
      override
          fun workerCapabilities(workerCapabilities: CustomerManagedWorkerCapabilitiesProperty) {
        cdkBuilder.workerCapabilities(workerCapabilities.let(CustomerManagedWorkerCapabilitiesProperty.Companion::unwrap))
      }

      /**
       * @param workerCapabilities The worker capabilities for a customer managed fleet
       * configuration. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2cf8eaf19b19246aeaef77ad614059f7c46e02536e16318882136dfa14296282")
      override
          fun workerCapabilities(workerCapabilities: CustomerManagedWorkerCapabilitiesProperty.Builder.() -> Unit):
          Unit = workerCapabilities(CustomerManagedWorkerCapabilitiesProperty(workerCapabilities))

      public fun build():
          software.amazon.awscdk.services.deadline.CfnFleet.CustomerManagedFleetConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.deadline.CfnFleet.CustomerManagedFleetConfigurationProperty,
    ) : CdkObject(cdkObject), CustomerManagedFleetConfigurationProperty {
      /**
       * The AWS Auto Scaling mode for the customer managed fleet configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-customermanagedfleetconfiguration.html#cfn-deadline-fleet-customermanagedfleetconfiguration-mode)
       */
      override fun mode(): String = unwrap(this).getMode()

      /**
       * The storage profile ID.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-customermanagedfleetconfiguration.html#cfn-deadline-fleet-customermanagedfleetconfiguration-storageprofileid)
       */
      override fun storageProfileId(): String? = unwrap(this).getStorageProfileId()

      /**
       * The worker capabilities for a customer managed fleet configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-customermanagedfleetconfiguration.html#cfn-deadline-fleet-customermanagedfleetconfiguration-workercapabilities)
       */
      override fun workerCapabilities(): Any = unwrap(this).getWorkerCapabilities()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CustomerManagedFleetConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.deadline.CfnFleet.CustomerManagedFleetConfigurationProperty):
          CustomerManagedFleetConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CustomerManagedFleetConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomerManagedFleetConfigurationProperty):
          software.amazon.awscdk.services.deadline.CfnFleet.CustomerManagedFleetConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.deadline.CfnFleet.CustomerManagedFleetConfigurationProperty
    }
  }

  /**
   * The worker capabilities for a customer managed workflow.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.deadline.*;
   * CustomerManagedWorkerCapabilitiesProperty customerManagedWorkerCapabilitiesProperty =
   * CustomerManagedWorkerCapabilitiesProperty.builder()
   * .cpuArchitectureType("cpuArchitectureType")
   * .memoryMiB(MemoryMiBRangeProperty.builder()
   * .min(123)
   * // the properties below are optional
   * .max(123)
   * .build())
   * .osFamily("osFamily")
   * .vCpuCount(VCpuCountRangeProperty.builder()
   * .min(123)
   * // the properties below are optional
   * .max(123)
   * .build())
   * // the properties below are optional
   * .acceleratorCount(AcceleratorCountRangeProperty.builder()
   * .min(123)
   * // the properties below are optional
   * .max(123)
   * .build())
   * .acceleratorTotalMemoryMiB(AcceleratorTotalMemoryMiBRangeProperty.builder()
   * .min(123)
   * // the properties below are optional
   * .max(123)
   * .build())
   * .acceleratorTypes(List.of("acceleratorTypes"))
   * .customAmounts(List.of(FleetAmountCapabilityProperty.builder()
   * .min(123)
   * .name("name")
   * // the properties below are optional
   * .max(123)
   * .build()))
   * .customAttributes(List.of(FleetAttributeCapabilityProperty.builder()
   * .name("name")
   * .values(List.of("values"))
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-customermanagedworkercapabilities.html)
   */
  public interface CustomerManagedWorkerCapabilitiesProperty {
    /**
     * The range of the accelerator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-customermanagedworkercapabilities.html#cfn-deadline-fleet-customermanagedworkercapabilities-acceleratorcount)
     */
    public fun acceleratorCount(): Any? = unwrap(this).getAcceleratorCount()

    /**
     * The total memory (MiB) for the customer managed worker capabilities.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-customermanagedworkercapabilities.html#cfn-deadline-fleet-customermanagedworkercapabilities-acceleratortotalmemorymib)
     */
    public fun acceleratorTotalMemoryMiB(): Any? = unwrap(this).getAcceleratorTotalMemoryMiB()

    /**
     * The accelerator types for the customer managed worker capabilities.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-customermanagedworkercapabilities.html#cfn-deadline-fleet-customermanagedworkercapabilities-acceleratortypes)
     */
    public fun acceleratorTypes(): List<String> = unwrap(this).getAcceleratorTypes() ?: emptyList()

    /**
     * The CPU architecture type for the customer managed worker capabilities.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-customermanagedworkercapabilities.html#cfn-deadline-fleet-customermanagedworkercapabilities-cpuarchitecturetype)
     */
    public fun cpuArchitectureType(): String

    /**
     * Custom requirement ranges for customer managed worker capabilities.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-customermanagedworkercapabilities.html#cfn-deadline-fleet-customermanagedworkercapabilities-customamounts)
     */
    public fun customAmounts(): Any? = unwrap(this).getCustomAmounts()

    /**
     * Custom attributes for the customer manged worker capabilities.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-customermanagedworkercapabilities.html#cfn-deadline-fleet-customermanagedworkercapabilities-customattributes)
     */
    public fun customAttributes(): Any? = unwrap(this).getCustomAttributes()

    /**
     * The memory (MiB).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-customermanagedworkercapabilities.html#cfn-deadline-fleet-customermanagedworkercapabilities-memorymib)
     */
    public fun memoryMiB(): Any

    /**
     * The operating system (OS) family.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-customermanagedworkercapabilities.html#cfn-deadline-fleet-customermanagedworkercapabilities-osfamily)
     */
    public fun osFamily(): String

    /**
     * The vCPU count for the customer manged worker capabilities.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-customermanagedworkercapabilities.html#cfn-deadline-fleet-customermanagedworkercapabilities-vcpucount)
     */
    public fun vCpuCount(): Any

    /**
     * A builder for [CustomerManagedWorkerCapabilitiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param acceleratorCount The range of the accelerator.
       */
      public fun acceleratorCount(acceleratorCount: IResolvable)

      /**
       * @param acceleratorCount The range of the accelerator.
       */
      public fun acceleratorCount(acceleratorCount: AcceleratorCountRangeProperty)

      /**
       * @param acceleratorCount The range of the accelerator.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bd3406f44989a5e78ce888ce0430a46f6a0d3fb66205155250543201e783c6c3")
      public
          fun acceleratorCount(acceleratorCount: AcceleratorCountRangeProperty.Builder.() -> Unit)

      /**
       * @param acceleratorTotalMemoryMiB The total memory (MiB) for the customer managed worker
       * capabilities.
       */
      public fun acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB: IResolvable)

      /**
       * @param acceleratorTotalMemoryMiB The total memory (MiB) for the customer managed worker
       * capabilities.
       */
      public
          fun acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB: AcceleratorTotalMemoryMiBRangeProperty)

      /**
       * @param acceleratorTotalMemoryMiB The total memory (MiB) for the customer managed worker
       * capabilities.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c44e852c863b7a341e2c017db84e51d85d8382cabb056cf12c758eb5bc73cad8")
      public
          fun acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB: AcceleratorTotalMemoryMiBRangeProperty.Builder.() -> Unit)

      /**
       * @param acceleratorTypes The accelerator types for the customer managed worker capabilities.
       */
      public fun acceleratorTypes(acceleratorTypes: List<String>)

      /**
       * @param acceleratorTypes The accelerator types for the customer managed worker capabilities.
       */
      public fun acceleratorTypes(vararg acceleratorTypes: String)

      /**
       * @param cpuArchitectureType The CPU architecture type for the customer managed worker
       * capabilities. 
       */
      public fun cpuArchitectureType(cpuArchitectureType: String)

      /**
       * @param customAmounts Custom requirement ranges for customer managed worker capabilities.
       */
      public fun customAmounts(customAmounts: IResolvable)

      /**
       * @param customAmounts Custom requirement ranges for customer managed worker capabilities.
       */
      public fun customAmounts(customAmounts: List<Any>)

      /**
       * @param customAmounts Custom requirement ranges for customer managed worker capabilities.
       */
      public fun customAmounts(vararg customAmounts: Any)

      /**
       * @param customAttributes Custom attributes for the customer manged worker capabilities.
       */
      public fun customAttributes(customAttributes: IResolvable)

      /**
       * @param customAttributes Custom attributes for the customer manged worker capabilities.
       */
      public fun customAttributes(customAttributes: List<Any>)

      /**
       * @param customAttributes Custom attributes for the customer manged worker capabilities.
       */
      public fun customAttributes(vararg customAttributes: Any)

      /**
       * @param memoryMiB The memory (MiB). 
       */
      public fun memoryMiB(memoryMiB: IResolvable)

      /**
       * @param memoryMiB The memory (MiB). 
       */
      public fun memoryMiB(memoryMiB: MemoryMiBRangeProperty)

      /**
       * @param memoryMiB The memory (MiB). 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("73ff3f138a03da0b596992f400a482752293d805a4343ea1c7545567fa47274e")
      public fun memoryMiB(memoryMiB: MemoryMiBRangeProperty.Builder.() -> Unit)

      /**
       * @param osFamily The operating system (OS) family. 
       */
      public fun osFamily(osFamily: String)

      /**
       * @param vCpuCount The vCPU count for the customer manged worker capabilities. 
       */
      public fun vCpuCount(vCpuCount: IResolvable)

      /**
       * @param vCpuCount The vCPU count for the customer manged worker capabilities. 
       */
      public fun vCpuCount(vCpuCount: VCpuCountRangeProperty)

      /**
       * @param vCpuCount The vCPU count for the customer manged worker capabilities. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2b27d0314708e9ec994dace5fdbc123b3fb11f7f2f54195e32840ddbddb6c15d")
      public fun vCpuCount(vCpuCount: VCpuCountRangeProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.deadline.CfnFleet.CustomerManagedWorkerCapabilitiesProperty.Builder
          =
          software.amazon.awscdk.services.deadline.CfnFleet.CustomerManagedWorkerCapabilitiesProperty.builder()

      /**
       * @param acceleratorCount The range of the accelerator.
       */
      override fun acceleratorCount(acceleratorCount: IResolvable) {
        cdkBuilder.acceleratorCount(acceleratorCount.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param acceleratorCount The range of the accelerator.
       */
      override fun acceleratorCount(acceleratorCount: AcceleratorCountRangeProperty) {
        cdkBuilder.acceleratorCount(acceleratorCount.let(AcceleratorCountRangeProperty.Companion::unwrap))
      }

      /**
       * @param acceleratorCount The range of the accelerator.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bd3406f44989a5e78ce888ce0430a46f6a0d3fb66205155250543201e783c6c3")
      override
          fun acceleratorCount(acceleratorCount: AcceleratorCountRangeProperty.Builder.() -> Unit):
          Unit = acceleratorCount(AcceleratorCountRangeProperty(acceleratorCount))

      /**
       * @param acceleratorTotalMemoryMiB The total memory (MiB) for the customer managed worker
       * capabilities.
       */
      override fun acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB: IResolvable) {
        cdkBuilder.acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param acceleratorTotalMemoryMiB The total memory (MiB) for the customer managed worker
       * capabilities.
       */
      override
          fun acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB: AcceleratorTotalMemoryMiBRangeProperty) {
        cdkBuilder.acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB.let(AcceleratorTotalMemoryMiBRangeProperty.Companion::unwrap))
      }

      /**
       * @param acceleratorTotalMemoryMiB The total memory (MiB) for the customer managed worker
       * capabilities.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c44e852c863b7a341e2c017db84e51d85d8382cabb056cf12c758eb5bc73cad8")
      override
          fun acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB: AcceleratorTotalMemoryMiBRangeProperty.Builder.() -> Unit):
          Unit =
          acceleratorTotalMemoryMiB(AcceleratorTotalMemoryMiBRangeProperty(acceleratorTotalMemoryMiB))

      /**
       * @param acceleratorTypes The accelerator types for the customer managed worker capabilities.
       */
      override fun acceleratorTypes(acceleratorTypes: List<String>) {
        cdkBuilder.acceleratorTypes(acceleratorTypes)
      }

      /**
       * @param acceleratorTypes The accelerator types for the customer managed worker capabilities.
       */
      override fun acceleratorTypes(vararg acceleratorTypes: String): Unit =
          acceleratorTypes(acceleratorTypes.toList())

      /**
       * @param cpuArchitectureType The CPU architecture type for the customer managed worker
       * capabilities. 
       */
      override fun cpuArchitectureType(cpuArchitectureType: String) {
        cdkBuilder.cpuArchitectureType(cpuArchitectureType)
      }

      /**
       * @param customAmounts Custom requirement ranges for customer managed worker capabilities.
       */
      override fun customAmounts(customAmounts: IResolvable) {
        cdkBuilder.customAmounts(customAmounts.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param customAmounts Custom requirement ranges for customer managed worker capabilities.
       */
      override fun customAmounts(customAmounts: List<Any>) {
        cdkBuilder.customAmounts(customAmounts.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param customAmounts Custom requirement ranges for customer managed worker capabilities.
       */
      override fun customAmounts(vararg customAmounts: Any): Unit =
          customAmounts(customAmounts.toList())

      /**
       * @param customAttributes Custom attributes for the customer manged worker capabilities.
       */
      override fun customAttributes(customAttributes: IResolvable) {
        cdkBuilder.customAttributes(customAttributes.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param customAttributes Custom attributes for the customer manged worker capabilities.
       */
      override fun customAttributes(customAttributes: List<Any>) {
        cdkBuilder.customAttributes(customAttributes.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param customAttributes Custom attributes for the customer manged worker capabilities.
       */
      override fun customAttributes(vararg customAttributes: Any): Unit =
          customAttributes(customAttributes.toList())

      /**
       * @param memoryMiB The memory (MiB). 
       */
      override fun memoryMiB(memoryMiB: IResolvable) {
        cdkBuilder.memoryMiB(memoryMiB.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param memoryMiB The memory (MiB). 
       */
      override fun memoryMiB(memoryMiB: MemoryMiBRangeProperty) {
        cdkBuilder.memoryMiB(memoryMiB.let(MemoryMiBRangeProperty.Companion::unwrap))
      }

      /**
       * @param memoryMiB The memory (MiB). 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("73ff3f138a03da0b596992f400a482752293d805a4343ea1c7545567fa47274e")
      override fun memoryMiB(memoryMiB: MemoryMiBRangeProperty.Builder.() -> Unit): Unit =
          memoryMiB(MemoryMiBRangeProperty(memoryMiB))

      /**
       * @param osFamily The operating system (OS) family. 
       */
      override fun osFamily(osFamily: String) {
        cdkBuilder.osFamily(osFamily)
      }

      /**
       * @param vCpuCount The vCPU count for the customer manged worker capabilities. 
       */
      override fun vCpuCount(vCpuCount: IResolvable) {
        cdkBuilder.vCpuCount(vCpuCount.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param vCpuCount The vCPU count for the customer manged worker capabilities. 
       */
      override fun vCpuCount(vCpuCount: VCpuCountRangeProperty) {
        cdkBuilder.vCpuCount(vCpuCount.let(VCpuCountRangeProperty.Companion::unwrap))
      }

      /**
       * @param vCpuCount The vCPU count for the customer manged worker capabilities. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2b27d0314708e9ec994dace5fdbc123b3fb11f7f2f54195e32840ddbddb6c15d")
      override fun vCpuCount(vCpuCount: VCpuCountRangeProperty.Builder.() -> Unit): Unit =
          vCpuCount(VCpuCountRangeProperty(vCpuCount))

      public fun build():
          software.amazon.awscdk.services.deadline.CfnFleet.CustomerManagedWorkerCapabilitiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.deadline.CfnFleet.CustomerManagedWorkerCapabilitiesProperty,
    ) : CdkObject(cdkObject), CustomerManagedWorkerCapabilitiesProperty {
      /**
       * The range of the accelerator.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-customermanagedworkercapabilities.html#cfn-deadline-fleet-customermanagedworkercapabilities-acceleratorcount)
       */
      override fun acceleratorCount(): Any? = unwrap(this).getAcceleratorCount()

      /**
       * The total memory (MiB) for the customer managed worker capabilities.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-customermanagedworkercapabilities.html#cfn-deadline-fleet-customermanagedworkercapabilities-acceleratortotalmemorymib)
       */
      override fun acceleratorTotalMemoryMiB(): Any? = unwrap(this).getAcceleratorTotalMemoryMiB()

      /**
       * The accelerator types for the customer managed worker capabilities.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-customermanagedworkercapabilities.html#cfn-deadline-fleet-customermanagedworkercapabilities-acceleratortypes)
       */
      override fun acceleratorTypes(): List<String> = unwrap(this).getAcceleratorTypes() ?:
          emptyList()

      /**
       * The CPU architecture type for the customer managed worker capabilities.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-customermanagedworkercapabilities.html#cfn-deadline-fleet-customermanagedworkercapabilities-cpuarchitecturetype)
       */
      override fun cpuArchitectureType(): String = unwrap(this).getCpuArchitectureType()

      /**
       * Custom requirement ranges for customer managed worker capabilities.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-customermanagedworkercapabilities.html#cfn-deadline-fleet-customermanagedworkercapabilities-customamounts)
       */
      override fun customAmounts(): Any? = unwrap(this).getCustomAmounts()

      /**
       * Custom attributes for the customer manged worker capabilities.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-customermanagedworkercapabilities.html#cfn-deadline-fleet-customermanagedworkercapabilities-customattributes)
       */
      override fun customAttributes(): Any? = unwrap(this).getCustomAttributes()

      /**
       * The memory (MiB).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-customermanagedworkercapabilities.html#cfn-deadline-fleet-customermanagedworkercapabilities-memorymib)
       */
      override fun memoryMiB(): Any = unwrap(this).getMemoryMiB()

      /**
       * The operating system (OS) family.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-customermanagedworkercapabilities.html#cfn-deadline-fleet-customermanagedworkercapabilities-osfamily)
       */
      override fun osFamily(): String = unwrap(this).getOsFamily()

      /**
       * The vCPU count for the customer manged worker capabilities.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-customermanagedworkercapabilities.html#cfn-deadline-fleet-customermanagedworkercapabilities-vcpucount)
       */
      override fun vCpuCount(): Any = unwrap(this).getVCpuCount()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CustomerManagedWorkerCapabilitiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.deadline.CfnFleet.CustomerManagedWorkerCapabilitiesProperty):
          CustomerManagedWorkerCapabilitiesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CustomerManagedWorkerCapabilitiesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomerManagedWorkerCapabilitiesProperty):
          software.amazon.awscdk.services.deadline.CfnFleet.CustomerManagedWorkerCapabilitiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.deadline.CfnFleet.CustomerManagedWorkerCapabilitiesProperty
    }
  }

  /**
   * Specifies the EBS volume.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.deadline.*;
   * Ec2EbsVolumeProperty ec2EbsVolumeProperty = Ec2EbsVolumeProperty.builder()
   * .iops(123)
   * .sizeGiB(123)
   * .throughputMiB(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-ec2ebsvolume.html)
   */
  public interface Ec2EbsVolumeProperty {
    /**
     * The IOPS per volume.
     *
     * Default: - 3000
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-ec2ebsvolume.html#cfn-deadline-fleet-ec2ebsvolume-iops)
     */
    public fun iops(): Number? = unwrap(this).getIops()

    /**
     * The EBS volume size in GiB.
     *
     * Default: - 250
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-ec2ebsvolume.html#cfn-deadline-fleet-ec2ebsvolume-sizegib)
     */
    public fun sizeGiB(): Number? = unwrap(this).getSizeGiB()

    /**
     * The throughput per volume in MiB.
     *
     * Default: - 125
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-ec2ebsvolume.html#cfn-deadline-fleet-ec2ebsvolume-throughputmib)
     */
    public fun throughputMiB(): Number? = unwrap(this).getThroughputMiB()

    /**
     * A builder for [Ec2EbsVolumeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param iops The IOPS per volume.
       */
      public fun iops(iops: Number)

      /**
       * @param sizeGiB The EBS volume size in GiB.
       */
      public fun sizeGiB(sizeGiB: Number)

      /**
       * @param throughputMiB The throughput per volume in MiB.
       */
      public fun throughputMiB(throughputMiB: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.deadline.CfnFleet.Ec2EbsVolumeProperty.Builder =
          software.amazon.awscdk.services.deadline.CfnFleet.Ec2EbsVolumeProperty.builder()

      /**
       * @param iops The IOPS per volume.
       */
      override fun iops(iops: Number) {
        cdkBuilder.iops(iops)
      }

      /**
       * @param sizeGiB The EBS volume size in GiB.
       */
      override fun sizeGiB(sizeGiB: Number) {
        cdkBuilder.sizeGiB(sizeGiB)
      }

      /**
       * @param throughputMiB The throughput per volume in MiB.
       */
      override fun throughputMiB(throughputMiB: Number) {
        cdkBuilder.throughputMiB(throughputMiB)
      }

      public fun build(): software.amazon.awscdk.services.deadline.CfnFleet.Ec2EbsVolumeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.deadline.CfnFleet.Ec2EbsVolumeProperty,
    ) : CdkObject(cdkObject), Ec2EbsVolumeProperty {
      /**
       * The IOPS per volume.
       *
       * Default: - 3000
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-ec2ebsvolume.html#cfn-deadline-fleet-ec2ebsvolume-iops)
       */
      override fun iops(): Number? = unwrap(this).getIops()

      /**
       * The EBS volume size in GiB.
       *
       * Default: - 250
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-ec2ebsvolume.html#cfn-deadline-fleet-ec2ebsvolume-sizegib)
       */
      override fun sizeGiB(): Number? = unwrap(this).getSizeGiB()

      /**
       * The throughput per volume in MiB.
       *
       * Default: - 125
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-ec2ebsvolume.html#cfn-deadline-fleet-ec2ebsvolume-throughputmib)
       */
      override fun throughputMiB(): Number? = unwrap(this).getThroughputMiB()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): Ec2EbsVolumeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.deadline.CfnFleet.Ec2EbsVolumeProperty):
          Ec2EbsVolumeProperty = CdkObjectWrappers.wrap(cdkObject) as? Ec2EbsVolumeProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: Ec2EbsVolumeProperty):
          software.amazon.awscdk.services.deadline.CfnFleet.Ec2EbsVolumeProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.deadline.CfnFleet.Ec2EbsVolumeProperty
    }
  }

  /**
   * The fleet amount and attribute capabilities.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.deadline.*;
   * FleetAmountCapabilityProperty fleetAmountCapabilityProperty =
   * FleetAmountCapabilityProperty.builder()
   * .min(123)
   * .name("name")
   * // the properties below are optional
   * .max(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-fleetamountcapability.html)
   */
  public interface FleetAmountCapabilityProperty {
    /**
     * The maximum amount of the fleet worker capability.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-fleetamountcapability.html#cfn-deadline-fleet-fleetamountcapability-max)
     */
    public fun max(): Number? = unwrap(this).getMax()

    /**
     * The minimum amount of fleet worker capability.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-fleetamountcapability.html#cfn-deadline-fleet-fleetamountcapability-min)
     */
    public fun min(): Number

    /**
     * The name of the fleet capability.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-fleetamountcapability.html#cfn-deadline-fleet-fleetamountcapability-name)
     */
    public fun name(): String

    /**
     * A builder for [FleetAmountCapabilityProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param max The maximum amount of the fleet worker capability.
       */
      public fun max(max: Number)

      /**
       * @param min The minimum amount of fleet worker capability. 
       */
      public fun min(min: Number)

      /**
       * @param name The name of the fleet capability. 
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.deadline.CfnFleet.FleetAmountCapabilityProperty.Builder =
          software.amazon.awscdk.services.deadline.CfnFleet.FleetAmountCapabilityProperty.builder()

      /**
       * @param max The maximum amount of the fleet worker capability.
       */
      override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      /**
       * @param min The minimum amount of fleet worker capability. 
       */
      override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      /**
       * @param name The name of the fleet capability. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.deadline.CfnFleet.FleetAmountCapabilityProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.deadline.CfnFleet.FleetAmountCapabilityProperty,
    ) : CdkObject(cdkObject), FleetAmountCapabilityProperty {
      /**
       * The maximum amount of the fleet worker capability.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-fleetamountcapability.html#cfn-deadline-fleet-fleetamountcapability-max)
       */
      override fun max(): Number? = unwrap(this).getMax()

      /**
       * The minimum amount of fleet worker capability.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-fleetamountcapability.html#cfn-deadline-fleet-fleetamountcapability-min)
       */
      override fun min(): Number = unwrap(this).getMin()

      /**
       * The name of the fleet capability.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-fleetamountcapability.html#cfn-deadline-fleet-fleetamountcapability-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FleetAmountCapabilityProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.deadline.CfnFleet.FleetAmountCapabilityProperty):
          FleetAmountCapabilityProperty = CdkObjectWrappers.wrap(cdkObject) as?
          FleetAmountCapabilityProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FleetAmountCapabilityProperty):
          software.amazon.awscdk.services.deadline.CfnFleet.FleetAmountCapabilityProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.deadline.CfnFleet.FleetAmountCapabilityProperty
    }
  }

  /**
   * Defines the fleet's capability name, minimum, and maximum.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.deadline.*;
   * FleetAttributeCapabilityProperty fleetAttributeCapabilityProperty =
   * FleetAttributeCapabilityProperty.builder()
   * .name("name")
   * .values(List.of("values"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-fleetattributecapability.html)
   */
  public interface FleetAttributeCapabilityProperty {
    /**
     * The name of the fleet attribute capability for the worker.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-fleetattributecapability.html#cfn-deadline-fleet-fleetattributecapability-name)
     */
    public fun name(): String

    /**
     * The number of fleet attribute capabilities.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-fleetattributecapability.html#cfn-deadline-fleet-fleetattributecapability-values)
     */
    public fun values(): List<String>

    /**
     * A builder for [FleetAttributeCapabilityProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the fleet attribute capability for the worker. 
       */
      public fun name(name: String)

      /**
       * @param values The number of fleet attribute capabilities. 
       */
      public fun values(values: List<String>)

      /**
       * @param values The number of fleet attribute capabilities. 
       */
      public fun values(vararg values: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.deadline.CfnFleet.FleetAttributeCapabilityProperty.Builder
          =
          software.amazon.awscdk.services.deadline.CfnFleet.FleetAttributeCapabilityProperty.builder()

      /**
       * @param name The name of the fleet attribute capability for the worker. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param values The number of fleet attribute capabilities. 
       */
      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      /**
       * @param values The number of fleet attribute capabilities. 
       */
      override fun values(vararg values: String): Unit = values(values.toList())

      public fun build():
          software.amazon.awscdk.services.deadline.CfnFleet.FleetAttributeCapabilityProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.deadline.CfnFleet.FleetAttributeCapabilityProperty,
    ) : CdkObject(cdkObject), FleetAttributeCapabilityProperty {
      /**
       * The name of the fleet attribute capability for the worker.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-fleetattributecapability.html#cfn-deadline-fleet-fleetattributecapability-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The number of fleet attribute capabilities.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-fleetattributecapability.html#cfn-deadline-fleet-fleetattributecapability-values)
       */
      override fun values(): List<String> = unwrap(this).getValues()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FleetAttributeCapabilityProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.deadline.CfnFleet.FleetAttributeCapabilityProperty):
          FleetAttributeCapabilityProperty = CdkObjectWrappers.wrap(cdkObject) as?
          FleetAttributeCapabilityProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FleetAttributeCapabilityProperty):
          software.amazon.awscdk.services.deadline.CfnFleet.FleetAttributeCapabilityProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.deadline.CfnFleet.FleetAttributeCapabilityProperty
    }
  }

  /**
   * The amounts and attributes of fleets.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.deadline.*;
   * FleetCapabilitiesProperty fleetCapabilitiesProperty = FleetCapabilitiesProperty.builder()
   * .amounts(List.of(FleetAmountCapabilityProperty.builder()
   * .min(123)
   * .name("name")
   * // the properties below are optional
   * .max(123)
   * .build()))
   * .attributes(List.of(FleetAttributeCapabilityProperty.builder()
   * .name("name")
   * .values(List.of("values"))
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-fleetcapabilities.html)
   */
  public interface FleetCapabilitiesProperty {
    /**
     * Amount capabilities of the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-fleetcapabilities.html#cfn-deadline-fleet-fleetcapabilities-amounts)
     */
    public fun amounts(): Any? = unwrap(this).getAmounts()

    /**
     * Attribute capabilities of the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-fleetcapabilities.html#cfn-deadline-fleet-fleetcapabilities-attributes)
     */
    public fun attributes(): Any? = unwrap(this).getAttributes()

    /**
     * A builder for [FleetCapabilitiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param amounts Amount capabilities of the fleet.
       */
      public fun amounts(amounts: IResolvable)

      /**
       * @param amounts Amount capabilities of the fleet.
       */
      public fun amounts(amounts: List<Any>)

      /**
       * @param amounts Amount capabilities of the fleet.
       */
      public fun amounts(vararg amounts: Any)

      /**
       * @param attributes Attribute capabilities of the fleet.
       */
      public fun attributes(attributes: IResolvable)

      /**
       * @param attributes Attribute capabilities of the fleet.
       */
      public fun attributes(attributes: List<Any>)

      /**
       * @param attributes Attribute capabilities of the fleet.
       */
      public fun attributes(vararg attributes: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.deadline.CfnFleet.FleetCapabilitiesProperty.Builder =
          software.amazon.awscdk.services.deadline.CfnFleet.FleetCapabilitiesProperty.builder()

      /**
       * @param amounts Amount capabilities of the fleet.
       */
      override fun amounts(amounts: IResolvable) {
        cdkBuilder.amounts(amounts.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param amounts Amount capabilities of the fleet.
       */
      override fun amounts(amounts: List<Any>) {
        cdkBuilder.amounts(amounts.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param amounts Amount capabilities of the fleet.
       */
      override fun amounts(vararg amounts: Any): Unit = amounts(amounts.toList())

      /**
       * @param attributes Attribute capabilities of the fleet.
       */
      override fun attributes(attributes: IResolvable) {
        cdkBuilder.attributes(attributes.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param attributes Attribute capabilities of the fleet.
       */
      override fun attributes(attributes: List<Any>) {
        cdkBuilder.attributes(attributes.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param attributes Attribute capabilities of the fleet.
       */
      override fun attributes(vararg attributes: Any): Unit = attributes(attributes.toList())

      public fun build():
          software.amazon.awscdk.services.deadline.CfnFleet.FleetCapabilitiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.deadline.CfnFleet.FleetCapabilitiesProperty,
    ) : CdkObject(cdkObject), FleetCapabilitiesProperty {
      /**
       * Amount capabilities of the fleet.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-fleetcapabilities.html#cfn-deadline-fleet-fleetcapabilities-amounts)
       */
      override fun amounts(): Any? = unwrap(this).getAmounts()

      /**
       * Attribute capabilities of the fleet.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-fleetcapabilities.html#cfn-deadline-fleet-fleetcapabilities-attributes)
       */
      override fun attributes(): Any? = unwrap(this).getAttributes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FleetCapabilitiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.deadline.CfnFleet.FleetCapabilitiesProperty):
          FleetCapabilitiesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          FleetCapabilitiesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FleetCapabilitiesProperty):
          software.amazon.awscdk.services.deadline.CfnFleet.FleetCapabilitiesProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.deadline.CfnFleet.FleetCapabilitiesProperty
    }
  }

  /**
   * Fleet configuration details.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.deadline.*;
   * FleetConfigurationProperty fleetConfigurationProperty = FleetConfigurationProperty.builder()
   * .customerManaged(CustomerManagedFleetConfigurationProperty.builder()
   * .mode("mode")
   * .workerCapabilities(CustomerManagedWorkerCapabilitiesProperty.builder()
   * .cpuArchitectureType("cpuArchitectureType")
   * .memoryMiB(MemoryMiBRangeProperty.builder()
   * .min(123)
   * // the properties below are optional
   * .max(123)
   * .build())
   * .osFamily("osFamily")
   * .vCpuCount(VCpuCountRangeProperty.builder()
   * .min(123)
   * // the properties below are optional
   * .max(123)
   * .build())
   * // the properties below are optional
   * .acceleratorCount(AcceleratorCountRangeProperty.builder()
   * .min(123)
   * // the properties below are optional
   * .max(123)
   * .build())
   * .acceleratorTotalMemoryMiB(AcceleratorTotalMemoryMiBRangeProperty.builder()
   * .min(123)
   * // the properties below are optional
   * .max(123)
   * .build())
   * .acceleratorTypes(List.of("acceleratorTypes"))
   * .customAmounts(List.of(FleetAmountCapabilityProperty.builder()
   * .min(123)
   * .name("name")
   * // the properties below are optional
   * .max(123)
   * .build()))
   * .customAttributes(List.of(FleetAttributeCapabilityProperty.builder()
   * .name("name")
   * .values(List.of("values"))
   * .build()))
   * .build())
   * // the properties below are optional
   * .storageProfileId("storageProfileId")
   * .build())
   * .serviceManagedEc2(ServiceManagedEc2FleetConfigurationProperty.builder()
   * .instanceCapabilities(ServiceManagedEc2InstanceCapabilitiesProperty.builder()
   * .cpuArchitectureType("cpuArchitectureType")
   * .memoryMiB(MemoryMiBRangeProperty.builder()
   * .min(123)
   * // the properties below are optional
   * .max(123)
   * .build())
   * .osFamily("osFamily")
   * .vCpuCount(VCpuCountRangeProperty.builder()
   * .min(123)
   * // the properties below are optional
   * .max(123)
   * .build())
   * // the properties below are optional
   * .allowedInstanceTypes(List.of("allowedInstanceTypes"))
   * .customAmounts(List.of(FleetAmountCapabilityProperty.builder()
   * .min(123)
   * .name("name")
   * // the properties below are optional
   * .max(123)
   * .build()))
   * .customAttributes(List.of(FleetAttributeCapabilityProperty.builder()
   * .name("name")
   * .values(List.of("values"))
   * .build()))
   * .excludedInstanceTypes(List.of("excludedInstanceTypes"))
   * .rootEbsVolume(Ec2EbsVolumeProperty.builder()
   * .iops(123)
   * .sizeGiB(123)
   * .throughputMiB(123)
   * .build())
   * .build())
   * .instanceMarketOptions(ServiceManagedEc2InstanceMarketOptionsProperty.builder()
   * .type("type")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-fleetconfiguration.html)
   */
  public interface FleetConfigurationProperty {
    /**
     * The customer managed fleets within a fleet configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-fleetconfiguration.html#cfn-deadline-fleet-fleetconfiguration-customermanaged)
     */
    public fun customerManaged(): Any? = unwrap(this).getCustomerManaged()

    /**
     * The service managed Amazon EC2 instances for a fleet configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-fleetconfiguration.html#cfn-deadline-fleet-fleetconfiguration-servicemanagedec2)
     */
    public fun serviceManagedEc2(): Any? = unwrap(this).getServiceManagedEc2()

    /**
     * A builder for [FleetConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param customerManaged The customer managed fleets within a fleet configuration.
       */
      public fun customerManaged(customerManaged: IResolvable)

      /**
       * @param customerManaged The customer managed fleets within a fleet configuration.
       */
      public fun customerManaged(customerManaged: CustomerManagedFleetConfigurationProperty)

      /**
       * @param customerManaged The customer managed fleets within a fleet configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ddec4bbb345e9373764a12a0fc53ab3e26fbab395d8d1e51f9d41881e5373417")
      public
          fun customerManaged(customerManaged: CustomerManagedFleetConfigurationProperty.Builder.() -> Unit)

      /**
       * @param serviceManagedEc2 The service managed Amazon EC2 instances for a fleet
       * configuration.
       */
      public fun serviceManagedEc2(serviceManagedEc2: IResolvable)

      /**
       * @param serviceManagedEc2 The service managed Amazon EC2 instances for a fleet
       * configuration.
       */
      public fun serviceManagedEc2(serviceManagedEc2: ServiceManagedEc2FleetConfigurationProperty)

      /**
       * @param serviceManagedEc2 The service managed Amazon EC2 instances for a fleet
       * configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cc30bf93791ae25af794a0b740a5934596911c1d7543387797228e2cb46795b9")
      public
          fun serviceManagedEc2(serviceManagedEc2: ServiceManagedEc2FleetConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.deadline.CfnFleet.FleetConfigurationProperty.Builder =
          software.amazon.awscdk.services.deadline.CfnFleet.FleetConfigurationProperty.builder()

      /**
       * @param customerManaged The customer managed fleets within a fleet configuration.
       */
      override fun customerManaged(customerManaged: IResolvable) {
        cdkBuilder.customerManaged(customerManaged.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param customerManaged The customer managed fleets within a fleet configuration.
       */
      override fun customerManaged(customerManaged: CustomerManagedFleetConfigurationProperty) {
        cdkBuilder.customerManaged(customerManaged.let(CustomerManagedFleetConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param customerManaged The customer managed fleets within a fleet configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ddec4bbb345e9373764a12a0fc53ab3e26fbab395d8d1e51f9d41881e5373417")
      override
          fun customerManaged(customerManaged: CustomerManagedFleetConfigurationProperty.Builder.() -> Unit):
          Unit = customerManaged(CustomerManagedFleetConfigurationProperty(customerManaged))

      /**
       * @param serviceManagedEc2 The service managed Amazon EC2 instances for a fleet
       * configuration.
       */
      override fun serviceManagedEc2(serviceManagedEc2: IResolvable) {
        cdkBuilder.serviceManagedEc2(serviceManagedEc2.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param serviceManagedEc2 The service managed Amazon EC2 instances for a fleet
       * configuration.
       */
      override
          fun serviceManagedEc2(serviceManagedEc2: ServiceManagedEc2FleetConfigurationProperty) {
        cdkBuilder.serviceManagedEc2(serviceManagedEc2.let(ServiceManagedEc2FleetConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param serviceManagedEc2 The service managed Amazon EC2 instances for a fleet
       * configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cc30bf93791ae25af794a0b740a5934596911c1d7543387797228e2cb46795b9")
      override
          fun serviceManagedEc2(serviceManagedEc2: ServiceManagedEc2FleetConfigurationProperty.Builder.() -> Unit):
          Unit = serviceManagedEc2(ServiceManagedEc2FleetConfigurationProperty(serviceManagedEc2))

      public fun build():
          software.amazon.awscdk.services.deadline.CfnFleet.FleetConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.deadline.CfnFleet.FleetConfigurationProperty,
    ) : CdkObject(cdkObject), FleetConfigurationProperty {
      /**
       * The customer managed fleets within a fleet configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-fleetconfiguration.html#cfn-deadline-fleet-fleetconfiguration-customermanaged)
       */
      override fun customerManaged(): Any? = unwrap(this).getCustomerManaged()

      /**
       * The service managed Amazon EC2 instances for a fleet configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-fleetconfiguration.html#cfn-deadline-fleet-fleetconfiguration-servicemanagedec2)
       */
      override fun serviceManagedEc2(): Any? = unwrap(this).getServiceManagedEc2()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FleetConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.deadline.CfnFleet.FleetConfigurationProperty):
          FleetConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          FleetConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FleetConfigurationProperty):
          software.amazon.awscdk.services.deadline.CfnFleet.FleetConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.deadline.CfnFleet.FleetConfigurationProperty
    }
  }

  /**
   * The range of memory in MiB.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.deadline.*;
   * MemoryMiBRangeProperty memoryMiBRangeProperty = MemoryMiBRangeProperty.builder()
   * .min(123)
   * // the properties below are optional
   * .max(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-memorymibrange.html)
   */
  public interface MemoryMiBRangeProperty {
    /**
     * The maximum amount of memory (in MiB).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-memorymibrange.html#cfn-deadline-fleet-memorymibrange-max)
     */
    public fun max(): Number? = unwrap(this).getMax()

    /**
     * The minimum amount of memory (in MiB).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-memorymibrange.html#cfn-deadline-fleet-memorymibrange-min)
     */
    public fun min(): Number

    /**
     * A builder for [MemoryMiBRangeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param max The maximum amount of memory (in MiB).
       */
      public fun max(max: Number)

      /**
       * @param min The minimum amount of memory (in MiB). 
       */
      public fun min(min: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.deadline.CfnFleet.MemoryMiBRangeProperty.Builder =
          software.amazon.awscdk.services.deadline.CfnFleet.MemoryMiBRangeProperty.builder()

      /**
       * @param max The maximum amount of memory (in MiB).
       */
      override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      /**
       * @param min The minimum amount of memory (in MiB). 
       */
      override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build(): software.amazon.awscdk.services.deadline.CfnFleet.MemoryMiBRangeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.deadline.CfnFleet.MemoryMiBRangeProperty,
    ) : CdkObject(cdkObject), MemoryMiBRangeProperty {
      /**
       * The maximum amount of memory (in MiB).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-memorymibrange.html#cfn-deadline-fleet-memorymibrange-max)
       */
      override fun max(): Number? = unwrap(this).getMax()

      /**
       * The minimum amount of memory (in MiB).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-memorymibrange.html#cfn-deadline-fleet-memorymibrange-min)
       */
      override fun min(): Number = unwrap(this).getMin()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MemoryMiBRangeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.deadline.CfnFleet.MemoryMiBRangeProperty):
          MemoryMiBRangeProperty = CdkObjectWrappers.wrap(cdkObject) as? MemoryMiBRangeProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MemoryMiBRangeProperty):
          software.amazon.awscdk.services.deadline.CfnFleet.MemoryMiBRangeProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.deadline.CfnFleet.MemoryMiBRangeProperty
    }
  }

  /**
   * The configuration details for a service managed Amazon EC2 fleet.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.deadline.*;
   * ServiceManagedEc2FleetConfigurationProperty serviceManagedEc2FleetConfigurationProperty =
   * ServiceManagedEc2FleetConfigurationProperty.builder()
   * .instanceCapabilities(ServiceManagedEc2InstanceCapabilitiesProperty.builder()
   * .cpuArchitectureType("cpuArchitectureType")
   * .memoryMiB(MemoryMiBRangeProperty.builder()
   * .min(123)
   * // the properties below are optional
   * .max(123)
   * .build())
   * .osFamily("osFamily")
   * .vCpuCount(VCpuCountRangeProperty.builder()
   * .min(123)
   * // the properties below are optional
   * .max(123)
   * .build())
   * // the properties below are optional
   * .allowedInstanceTypes(List.of("allowedInstanceTypes"))
   * .customAmounts(List.of(FleetAmountCapabilityProperty.builder()
   * .min(123)
   * .name("name")
   * // the properties below are optional
   * .max(123)
   * .build()))
   * .customAttributes(List.of(FleetAttributeCapabilityProperty.builder()
   * .name("name")
   * .values(List.of("values"))
   * .build()))
   * .excludedInstanceTypes(List.of("excludedInstanceTypes"))
   * .rootEbsVolume(Ec2EbsVolumeProperty.builder()
   * .iops(123)
   * .sizeGiB(123)
   * .throughputMiB(123)
   * .build())
   * .build())
   * .instanceMarketOptions(ServiceManagedEc2InstanceMarketOptionsProperty.builder()
   * .type("type")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-servicemanagedec2fleetconfiguration.html)
   */
  public interface ServiceManagedEc2FleetConfigurationProperty {
    /**
     * The Amazon EC2 instance capabilities.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-servicemanagedec2fleetconfiguration.html#cfn-deadline-fleet-servicemanagedec2fleetconfiguration-instancecapabilities)
     */
    public fun instanceCapabilities(): Any

    /**
     * The Amazon EC2 market type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-servicemanagedec2fleetconfiguration.html#cfn-deadline-fleet-servicemanagedec2fleetconfiguration-instancemarketoptions)
     */
    public fun instanceMarketOptions(): Any

    /**
     * A builder for [ServiceManagedEc2FleetConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param instanceCapabilities The Amazon EC2 instance capabilities. 
       */
      public fun instanceCapabilities(instanceCapabilities: IResolvable)

      /**
       * @param instanceCapabilities The Amazon EC2 instance capabilities. 
       */
      public
          fun instanceCapabilities(instanceCapabilities: ServiceManagedEc2InstanceCapabilitiesProperty)

      /**
       * @param instanceCapabilities The Amazon EC2 instance capabilities. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cd5bd0a3d35b14af621c156eed724e4c5e442a3bd731ac7f1c655392ed80e932")
      public
          fun instanceCapabilities(instanceCapabilities: ServiceManagedEc2InstanceCapabilitiesProperty.Builder.() -> Unit)

      /**
       * @param instanceMarketOptions The Amazon EC2 market type. 
       */
      public fun instanceMarketOptions(instanceMarketOptions: IResolvable)

      /**
       * @param instanceMarketOptions The Amazon EC2 market type. 
       */
      public
          fun instanceMarketOptions(instanceMarketOptions: ServiceManagedEc2InstanceMarketOptionsProperty)

      /**
       * @param instanceMarketOptions The Amazon EC2 market type. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7ccca052bddc943b20eef3f5b5ff5ed066efa9fcd9acb4a31fa9fc36c3728ef3")
      public
          fun instanceMarketOptions(instanceMarketOptions: ServiceManagedEc2InstanceMarketOptionsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.deadline.CfnFleet.ServiceManagedEc2FleetConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.deadline.CfnFleet.ServiceManagedEc2FleetConfigurationProperty.builder()

      /**
       * @param instanceCapabilities The Amazon EC2 instance capabilities. 
       */
      override fun instanceCapabilities(instanceCapabilities: IResolvable) {
        cdkBuilder.instanceCapabilities(instanceCapabilities.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param instanceCapabilities The Amazon EC2 instance capabilities. 
       */
      override
          fun instanceCapabilities(instanceCapabilities: ServiceManagedEc2InstanceCapabilitiesProperty) {
        cdkBuilder.instanceCapabilities(instanceCapabilities.let(ServiceManagedEc2InstanceCapabilitiesProperty.Companion::unwrap))
      }

      /**
       * @param instanceCapabilities The Amazon EC2 instance capabilities. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cd5bd0a3d35b14af621c156eed724e4c5e442a3bd731ac7f1c655392ed80e932")
      override
          fun instanceCapabilities(instanceCapabilities: ServiceManagedEc2InstanceCapabilitiesProperty.Builder.() -> Unit):
          Unit =
          instanceCapabilities(ServiceManagedEc2InstanceCapabilitiesProperty(instanceCapabilities))

      /**
       * @param instanceMarketOptions The Amazon EC2 market type. 
       */
      override fun instanceMarketOptions(instanceMarketOptions: IResolvable) {
        cdkBuilder.instanceMarketOptions(instanceMarketOptions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param instanceMarketOptions The Amazon EC2 market type. 
       */
      override
          fun instanceMarketOptions(instanceMarketOptions: ServiceManagedEc2InstanceMarketOptionsProperty) {
        cdkBuilder.instanceMarketOptions(instanceMarketOptions.let(ServiceManagedEc2InstanceMarketOptionsProperty.Companion::unwrap))
      }

      /**
       * @param instanceMarketOptions The Amazon EC2 market type. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7ccca052bddc943b20eef3f5b5ff5ed066efa9fcd9acb4a31fa9fc36c3728ef3")
      override
          fun instanceMarketOptions(instanceMarketOptions: ServiceManagedEc2InstanceMarketOptionsProperty.Builder.() -> Unit):
          Unit =
          instanceMarketOptions(ServiceManagedEc2InstanceMarketOptionsProperty(instanceMarketOptions))

      public fun build():
          software.amazon.awscdk.services.deadline.CfnFleet.ServiceManagedEc2FleetConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.deadline.CfnFleet.ServiceManagedEc2FleetConfigurationProperty,
    ) : CdkObject(cdkObject), ServiceManagedEc2FleetConfigurationProperty {
      /**
       * The Amazon EC2 instance capabilities.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-servicemanagedec2fleetconfiguration.html#cfn-deadline-fleet-servicemanagedec2fleetconfiguration-instancecapabilities)
       */
      override fun instanceCapabilities(): Any = unwrap(this).getInstanceCapabilities()

      /**
       * The Amazon EC2 market type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-servicemanagedec2fleetconfiguration.html#cfn-deadline-fleet-servicemanagedec2fleetconfiguration-instancemarketoptions)
       */
      override fun instanceMarketOptions(): Any = unwrap(this).getInstanceMarketOptions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ServiceManagedEc2FleetConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.deadline.CfnFleet.ServiceManagedEc2FleetConfigurationProperty):
          ServiceManagedEc2FleetConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ServiceManagedEc2FleetConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceManagedEc2FleetConfigurationProperty):
          software.amazon.awscdk.services.deadline.CfnFleet.ServiceManagedEc2FleetConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.deadline.CfnFleet.ServiceManagedEc2FleetConfigurationProperty
    }
  }

  /**
   * The Amazon EC2 instance capabilities.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.deadline.*;
   * ServiceManagedEc2InstanceCapabilitiesProperty serviceManagedEc2InstanceCapabilitiesProperty =
   * ServiceManagedEc2InstanceCapabilitiesProperty.builder()
   * .cpuArchitectureType("cpuArchitectureType")
   * .memoryMiB(MemoryMiBRangeProperty.builder()
   * .min(123)
   * // the properties below are optional
   * .max(123)
   * .build())
   * .osFamily("osFamily")
   * .vCpuCount(VCpuCountRangeProperty.builder()
   * .min(123)
   * // the properties below are optional
   * .max(123)
   * .build())
   * // the properties below are optional
   * .allowedInstanceTypes(List.of("allowedInstanceTypes"))
   * .customAmounts(List.of(FleetAmountCapabilityProperty.builder()
   * .min(123)
   * .name("name")
   * // the properties below are optional
   * .max(123)
   * .build()))
   * .customAttributes(List.of(FleetAttributeCapabilityProperty.builder()
   * .name("name")
   * .values(List.of("values"))
   * .build()))
   * .excludedInstanceTypes(List.of("excludedInstanceTypes"))
   * .rootEbsVolume(Ec2EbsVolumeProperty.builder()
   * .iops(123)
   * .sizeGiB(123)
   * .throughputMiB(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-servicemanagedec2instancecapabilities.html)
   */
  public interface ServiceManagedEc2InstanceCapabilitiesProperty {
    /**
     * The allowable Amazon EC2 instance types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-servicemanagedec2instancecapabilities.html#cfn-deadline-fleet-servicemanagedec2instancecapabilities-allowedinstancetypes)
     */
    public fun allowedInstanceTypes(): List<String> = unwrap(this).getAllowedInstanceTypes() ?:
        emptyList()

    /**
     * The CPU architecture type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-servicemanagedec2instancecapabilities.html#cfn-deadline-fleet-servicemanagedec2instancecapabilities-cpuarchitecturetype)
     */
    public fun cpuArchitectureType(): String

    /**
     * The custom capability amounts to require for instances in this fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-servicemanagedec2instancecapabilities.html#cfn-deadline-fleet-servicemanagedec2instancecapabilities-customamounts)
     */
    public fun customAmounts(): Any? = unwrap(this).getCustomAmounts()

    /**
     * The custom capability attributes to require for instances in this fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-servicemanagedec2instancecapabilities.html#cfn-deadline-fleet-servicemanagedec2instancecapabilities-customattributes)
     */
    public fun customAttributes(): Any? = unwrap(this).getCustomAttributes()

    /**
     * The instance types to exclude from the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-servicemanagedec2instancecapabilities.html#cfn-deadline-fleet-servicemanagedec2instancecapabilities-excludedinstancetypes)
     */
    public fun excludedInstanceTypes(): List<String> = unwrap(this).getExcludedInstanceTypes() ?:
        emptyList()

    /**
     * The memory, as MiB, for the Amazon EC2 instance type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-servicemanagedec2instancecapabilities.html#cfn-deadline-fleet-servicemanagedec2instancecapabilities-memorymib)
     */
    public fun memoryMiB(): Any

    /**
     * The operating system (OS) family.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-servicemanagedec2instancecapabilities.html#cfn-deadline-fleet-servicemanagedec2instancecapabilities-osfamily)
     */
    public fun osFamily(): String

    /**
     * The root EBS volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-servicemanagedec2instancecapabilities.html#cfn-deadline-fleet-servicemanagedec2instancecapabilities-rootebsvolume)
     */
    public fun rootEbsVolume(): Any? = unwrap(this).getRootEbsVolume()

    /**
     * The amount of vCPU to require for instances in this fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-servicemanagedec2instancecapabilities.html#cfn-deadline-fleet-servicemanagedec2instancecapabilities-vcpucount)
     */
    public fun vCpuCount(): Any

    /**
     * A builder for [ServiceManagedEc2InstanceCapabilitiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allowedInstanceTypes The allowable Amazon EC2 instance types.
       */
      public fun allowedInstanceTypes(allowedInstanceTypes: List<String>)

      /**
       * @param allowedInstanceTypes The allowable Amazon EC2 instance types.
       */
      public fun allowedInstanceTypes(vararg allowedInstanceTypes: String)

      /**
       * @param cpuArchitectureType The CPU architecture type. 
       */
      public fun cpuArchitectureType(cpuArchitectureType: String)

      /**
       * @param customAmounts The custom capability amounts to require for instances in this fleet.
       */
      public fun customAmounts(customAmounts: IResolvable)

      /**
       * @param customAmounts The custom capability amounts to require for instances in this fleet.
       */
      public fun customAmounts(customAmounts: List<Any>)

      /**
       * @param customAmounts The custom capability amounts to require for instances in this fleet.
       */
      public fun customAmounts(vararg customAmounts: Any)

      /**
       * @param customAttributes The custom capability attributes to require for instances in this
       * fleet.
       */
      public fun customAttributes(customAttributes: IResolvable)

      /**
       * @param customAttributes The custom capability attributes to require for instances in this
       * fleet.
       */
      public fun customAttributes(customAttributes: List<Any>)

      /**
       * @param customAttributes The custom capability attributes to require for instances in this
       * fleet.
       */
      public fun customAttributes(vararg customAttributes: Any)

      /**
       * @param excludedInstanceTypes The instance types to exclude from the fleet.
       */
      public fun excludedInstanceTypes(excludedInstanceTypes: List<String>)

      /**
       * @param excludedInstanceTypes The instance types to exclude from the fleet.
       */
      public fun excludedInstanceTypes(vararg excludedInstanceTypes: String)

      /**
       * @param memoryMiB The memory, as MiB, for the Amazon EC2 instance type. 
       */
      public fun memoryMiB(memoryMiB: IResolvable)

      /**
       * @param memoryMiB The memory, as MiB, for the Amazon EC2 instance type. 
       */
      public fun memoryMiB(memoryMiB: MemoryMiBRangeProperty)

      /**
       * @param memoryMiB The memory, as MiB, for the Amazon EC2 instance type. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c185696e72372d8229263a44b65c72f54175fcadb42c545982190cca8a68ae11")
      public fun memoryMiB(memoryMiB: MemoryMiBRangeProperty.Builder.() -> Unit)

      /**
       * @param osFamily The operating system (OS) family. 
       */
      public fun osFamily(osFamily: String)

      /**
       * @param rootEbsVolume The root EBS volume.
       */
      public fun rootEbsVolume(rootEbsVolume: IResolvable)

      /**
       * @param rootEbsVolume The root EBS volume.
       */
      public fun rootEbsVolume(rootEbsVolume: Ec2EbsVolumeProperty)

      /**
       * @param rootEbsVolume The root EBS volume.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb0296484e094fed38acf130651e18c97654fd76a689f8494777c533e4f66901")
      public fun rootEbsVolume(rootEbsVolume: Ec2EbsVolumeProperty.Builder.() -> Unit)

      /**
       * @param vCpuCount The amount of vCPU to require for instances in this fleet. 
       */
      public fun vCpuCount(vCpuCount: IResolvable)

      /**
       * @param vCpuCount The amount of vCPU to require for instances in this fleet. 
       */
      public fun vCpuCount(vCpuCount: VCpuCountRangeProperty)

      /**
       * @param vCpuCount The amount of vCPU to require for instances in this fleet. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("36c3a08e6cfcc6919d2214b94f26c0d4cec3ef83634e10438de5467972ec4eb3")
      public fun vCpuCount(vCpuCount: VCpuCountRangeProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.deadline.CfnFleet.ServiceManagedEc2InstanceCapabilitiesProperty.Builder
          =
          software.amazon.awscdk.services.deadline.CfnFleet.ServiceManagedEc2InstanceCapabilitiesProperty.builder()

      /**
       * @param allowedInstanceTypes The allowable Amazon EC2 instance types.
       */
      override fun allowedInstanceTypes(allowedInstanceTypes: List<String>) {
        cdkBuilder.allowedInstanceTypes(allowedInstanceTypes)
      }

      /**
       * @param allowedInstanceTypes The allowable Amazon EC2 instance types.
       */
      override fun allowedInstanceTypes(vararg allowedInstanceTypes: String): Unit =
          allowedInstanceTypes(allowedInstanceTypes.toList())

      /**
       * @param cpuArchitectureType The CPU architecture type. 
       */
      override fun cpuArchitectureType(cpuArchitectureType: String) {
        cdkBuilder.cpuArchitectureType(cpuArchitectureType)
      }

      /**
       * @param customAmounts The custom capability amounts to require for instances in this fleet.
       */
      override fun customAmounts(customAmounts: IResolvable) {
        cdkBuilder.customAmounts(customAmounts.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param customAmounts The custom capability amounts to require for instances in this fleet.
       */
      override fun customAmounts(customAmounts: List<Any>) {
        cdkBuilder.customAmounts(customAmounts.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param customAmounts The custom capability amounts to require for instances in this fleet.
       */
      override fun customAmounts(vararg customAmounts: Any): Unit =
          customAmounts(customAmounts.toList())

      /**
       * @param customAttributes The custom capability attributes to require for instances in this
       * fleet.
       */
      override fun customAttributes(customAttributes: IResolvable) {
        cdkBuilder.customAttributes(customAttributes.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param customAttributes The custom capability attributes to require for instances in this
       * fleet.
       */
      override fun customAttributes(customAttributes: List<Any>) {
        cdkBuilder.customAttributes(customAttributes.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param customAttributes The custom capability attributes to require for instances in this
       * fleet.
       */
      override fun customAttributes(vararg customAttributes: Any): Unit =
          customAttributes(customAttributes.toList())

      /**
       * @param excludedInstanceTypes The instance types to exclude from the fleet.
       */
      override fun excludedInstanceTypes(excludedInstanceTypes: List<String>) {
        cdkBuilder.excludedInstanceTypes(excludedInstanceTypes)
      }

      /**
       * @param excludedInstanceTypes The instance types to exclude from the fleet.
       */
      override fun excludedInstanceTypes(vararg excludedInstanceTypes: String): Unit =
          excludedInstanceTypes(excludedInstanceTypes.toList())

      /**
       * @param memoryMiB The memory, as MiB, for the Amazon EC2 instance type. 
       */
      override fun memoryMiB(memoryMiB: IResolvable) {
        cdkBuilder.memoryMiB(memoryMiB.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param memoryMiB The memory, as MiB, for the Amazon EC2 instance type. 
       */
      override fun memoryMiB(memoryMiB: MemoryMiBRangeProperty) {
        cdkBuilder.memoryMiB(memoryMiB.let(MemoryMiBRangeProperty.Companion::unwrap))
      }

      /**
       * @param memoryMiB The memory, as MiB, for the Amazon EC2 instance type. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c185696e72372d8229263a44b65c72f54175fcadb42c545982190cca8a68ae11")
      override fun memoryMiB(memoryMiB: MemoryMiBRangeProperty.Builder.() -> Unit): Unit =
          memoryMiB(MemoryMiBRangeProperty(memoryMiB))

      /**
       * @param osFamily The operating system (OS) family. 
       */
      override fun osFamily(osFamily: String) {
        cdkBuilder.osFamily(osFamily)
      }

      /**
       * @param rootEbsVolume The root EBS volume.
       */
      override fun rootEbsVolume(rootEbsVolume: IResolvable) {
        cdkBuilder.rootEbsVolume(rootEbsVolume.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param rootEbsVolume The root EBS volume.
       */
      override fun rootEbsVolume(rootEbsVolume: Ec2EbsVolumeProperty) {
        cdkBuilder.rootEbsVolume(rootEbsVolume.let(Ec2EbsVolumeProperty.Companion::unwrap))
      }

      /**
       * @param rootEbsVolume The root EBS volume.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb0296484e094fed38acf130651e18c97654fd76a689f8494777c533e4f66901")
      override fun rootEbsVolume(rootEbsVolume: Ec2EbsVolumeProperty.Builder.() -> Unit): Unit =
          rootEbsVolume(Ec2EbsVolumeProperty(rootEbsVolume))

      /**
       * @param vCpuCount The amount of vCPU to require for instances in this fleet. 
       */
      override fun vCpuCount(vCpuCount: IResolvable) {
        cdkBuilder.vCpuCount(vCpuCount.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param vCpuCount The amount of vCPU to require for instances in this fleet. 
       */
      override fun vCpuCount(vCpuCount: VCpuCountRangeProperty) {
        cdkBuilder.vCpuCount(vCpuCount.let(VCpuCountRangeProperty.Companion::unwrap))
      }

      /**
       * @param vCpuCount The amount of vCPU to require for instances in this fleet. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("36c3a08e6cfcc6919d2214b94f26c0d4cec3ef83634e10438de5467972ec4eb3")
      override fun vCpuCount(vCpuCount: VCpuCountRangeProperty.Builder.() -> Unit): Unit =
          vCpuCount(VCpuCountRangeProperty(vCpuCount))

      public fun build():
          software.amazon.awscdk.services.deadline.CfnFleet.ServiceManagedEc2InstanceCapabilitiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.deadline.CfnFleet.ServiceManagedEc2InstanceCapabilitiesProperty,
    ) : CdkObject(cdkObject), ServiceManagedEc2InstanceCapabilitiesProperty {
      /**
       * The allowable Amazon EC2 instance types.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-servicemanagedec2instancecapabilities.html#cfn-deadline-fleet-servicemanagedec2instancecapabilities-allowedinstancetypes)
       */
      override fun allowedInstanceTypes(): List<String> = unwrap(this).getAllowedInstanceTypes() ?:
          emptyList()

      /**
       * The CPU architecture type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-servicemanagedec2instancecapabilities.html#cfn-deadline-fleet-servicemanagedec2instancecapabilities-cpuarchitecturetype)
       */
      override fun cpuArchitectureType(): String = unwrap(this).getCpuArchitectureType()

      /**
       * The custom capability amounts to require for instances in this fleet.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-servicemanagedec2instancecapabilities.html#cfn-deadline-fleet-servicemanagedec2instancecapabilities-customamounts)
       */
      override fun customAmounts(): Any? = unwrap(this).getCustomAmounts()

      /**
       * The custom capability attributes to require for instances in this fleet.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-servicemanagedec2instancecapabilities.html#cfn-deadline-fleet-servicemanagedec2instancecapabilities-customattributes)
       */
      override fun customAttributes(): Any? = unwrap(this).getCustomAttributes()

      /**
       * The instance types to exclude from the fleet.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-servicemanagedec2instancecapabilities.html#cfn-deadline-fleet-servicemanagedec2instancecapabilities-excludedinstancetypes)
       */
      override fun excludedInstanceTypes(): List<String> = unwrap(this).getExcludedInstanceTypes()
          ?: emptyList()

      /**
       * The memory, as MiB, for the Amazon EC2 instance type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-servicemanagedec2instancecapabilities.html#cfn-deadline-fleet-servicemanagedec2instancecapabilities-memorymib)
       */
      override fun memoryMiB(): Any = unwrap(this).getMemoryMiB()

      /**
       * The operating system (OS) family.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-servicemanagedec2instancecapabilities.html#cfn-deadline-fleet-servicemanagedec2instancecapabilities-osfamily)
       */
      override fun osFamily(): String = unwrap(this).getOsFamily()

      /**
       * The root EBS volume.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-servicemanagedec2instancecapabilities.html#cfn-deadline-fleet-servicemanagedec2instancecapabilities-rootebsvolume)
       */
      override fun rootEbsVolume(): Any? = unwrap(this).getRootEbsVolume()

      /**
       * The amount of vCPU to require for instances in this fleet.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-servicemanagedec2instancecapabilities.html#cfn-deadline-fleet-servicemanagedec2instancecapabilities-vcpucount)
       */
      override fun vCpuCount(): Any = unwrap(this).getVCpuCount()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ServiceManagedEc2InstanceCapabilitiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.deadline.CfnFleet.ServiceManagedEc2InstanceCapabilitiesProperty):
          ServiceManagedEc2InstanceCapabilitiesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ServiceManagedEc2InstanceCapabilitiesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceManagedEc2InstanceCapabilitiesProperty):
          software.amazon.awscdk.services.deadline.CfnFleet.ServiceManagedEc2InstanceCapabilitiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.deadline.CfnFleet.ServiceManagedEc2InstanceCapabilitiesProperty
    }
  }

  /**
   * The details of the Amazon EC2 instance market options for a service managed fleet.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.deadline.*;
   * ServiceManagedEc2InstanceMarketOptionsProperty serviceManagedEc2InstanceMarketOptionsProperty =
   * ServiceManagedEc2InstanceMarketOptionsProperty.builder()
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-servicemanagedec2instancemarketoptions.html)
   */
  public interface ServiceManagedEc2InstanceMarketOptionsProperty {
    /**
     * The Amazon EC2 instance type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-servicemanagedec2instancemarketoptions.html#cfn-deadline-fleet-servicemanagedec2instancemarketoptions-type)
     */
    public fun type(): String

    /**
     * A builder for [ServiceManagedEc2InstanceMarketOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param type The Amazon EC2 instance type. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.deadline.CfnFleet.ServiceManagedEc2InstanceMarketOptionsProperty.Builder
          =
          software.amazon.awscdk.services.deadline.CfnFleet.ServiceManagedEc2InstanceMarketOptionsProperty.builder()

      /**
       * @param type The Amazon EC2 instance type. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.deadline.CfnFleet.ServiceManagedEc2InstanceMarketOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.deadline.CfnFleet.ServiceManagedEc2InstanceMarketOptionsProperty,
    ) : CdkObject(cdkObject), ServiceManagedEc2InstanceMarketOptionsProperty {
      /**
       * The Amazon EC2 instance type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-servicemanagedec2instancemarketoptions.html#cfn-deadline-fleet-servicemanagedec2instancemarketoptions-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ServiceManagedEc2InstanceMarketOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.deadline.CfnFleet.ServiceManagedEc2InstanceMarketOptionsProperty):
          ServiceManagedEc2InstanceMarketOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ServiceManagedEc2InstanceMarketOptionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceManagedEc2InstanceMarketOptionsProperty):
          software.amazon.awscdk.services.deadline.CfnFleet.ServiceManagedEc2InstanceMarketOptionsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.deadline.CfnFleet.ServiceManagedEc2InstanceMarketOptionsProperty
    }
  }

  /**
   * The allowable range of vCPU processing power for the fleet.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.deadline.*;
   * VCpuCountRangeProperty vCpuCountRangeProperty = VCpuCountRangeProperty.builder()
   * .min(123)
   * // the properties below are optional
   * .max(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-vcpucountrange.html)
   */
  public interface VCpuCountRangeProperty {
    /**
     * The maximum amount of vCPU.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-vcpucountrange.html#cfn-deadline-fleet-vcpucountrange-max)
     */
    public fun max(): Number? = unwrap(this).getMax()

    /**
     * The minimum amount of vCPU.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-vcpucountrange.html#cfn-deadline-fleet-vcpucountrange-min)
     */
    public fun min(): Number

    /**
     * A builder for [VCpuCountRangeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param max The maximum amount of vCPU.
       */
      public fun max(max: Number)

      /**
       * @param min The minimum amount of vCPU. 
       */
      public fun min(min: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.deadline.CfnFleet.VCpuCountRangeProperty.Builder =
          software.amazon.awscdk.services.deadline.CfnFleet.VCpuCountRangeProperty.builder()

      /**
       * @param max The maximum amount of vCPU.
       */
      override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      /**
       * @param min The minimum amount of vCPU. 
       */
      override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build(): software.amazon.awscdk.services.deadline.CfnFleet.VCpuCountRangeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.deadline.CfnFleet.VCpuCountRangeProperty,
    ) : CdkObject(cdkObject), VCpuCountRangeProperty {
      /**
       * The maximum amount of vCPU.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-vcpucountrange.html#cfn-deadline-fleet-vcpucountrange-max)
       */
      override fun max(): Number? = unwrap(this).getMax()

      /**
       * The minimum amount of vCPU.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-fleet-vcpucountrange.html#cfn-deadline-fleet-vcpucountrange-min)
       */
      override fun min(): Number = unwrap(this).getMin()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VCpuCountRangeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.deadline.CfnFleet.VCpuCountRangeProperty):
          VCpuCountRangeProperty = CdkObjectWrappers.wrap(cdkObject) as? VCpuCountRangeProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: VCpuCountRangeProperty):
          software.amazon.awscdk.services.deadline.CfnFleet.VCpuCountRangeProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.deadline.CfnFleet.VCpuCountRangeProperty
    }
  }
}

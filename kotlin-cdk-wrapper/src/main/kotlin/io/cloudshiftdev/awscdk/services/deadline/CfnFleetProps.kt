@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.deadline

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnFleet`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.deadline.*;
 * CfnFleetProps cfnFleetProps = CfnFleetProps.builder()
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
 * .farmId("farmId")
 * .maxWorkerCount(123)
 * .roleArn("roleArn")
 * // the properties below are optional
 * .description("description")
 * .minWorkerCount(123)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-fleet.html)
 */
public interface CfnFleetProps {
  /**
   * The configuration details for the fleet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-fleet.html#cfn-deadline-fleet-configuration)
   */
  public fun configuration(): Any

  /**
   * A description that helps identify what the fleet is used for.
   *
   * Default: - ""
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-fleet.html#cfn-deadline-fleet-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The display name of the fleet summary to update.
   *
   *
   * This field can store any content. Escape or encode this content before displaying it on a
   * webpage or any other system that might interpret the content of this field.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-fleet.html#cfn-deadline-fleet-displayname)
   */
  public fun displayName(): String

  /**
   * The farm ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-fleet.html#cfn-deadline-fleet-farmid)
   */
  public fun farmId(): String

  /**
   * The maximum number of workers specified in the fleet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-fleet.html#cfn-deadline-fleet-maxworkercount)
   */
  public fun maxWorkerCount(): Number

  /**
   * The minimum number of workers in the fleet.
   *
   * Default: - 0
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-fleet.html#cfn-deadline-fleet-minworkercount)
   */
  public fun minWorkerCount(): Number? = unwrap(this).getMinWorkerCount()

  /**
   * The IAM role that workers in the fleet use when processing jobs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-fleet.html#cfn-deadline-fleet-rolearn)
   */
  public fun roleArn(): String

  /**
   * The tags to add to your fleet.
   *
   * Each tag consists of a tag key and a tag value. Tag keys and values are both required, but tag
   * values can be empty strings.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-fleet.html#cfn-deadline-fleet-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnFleetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param configuration The configuration details for the fleet. 
     */
    public fun configuration(configuration: IResolvable)

    /**
     * @param configuration The configuration details for the fleet. 
     */
    public fun configuration(configuration: CfnFleet.FleetConfigurationProperty)

    /**
     * @param configuration The configuration details for the fleet. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8ff5f30b1b9fb66215f2a3f282c4322c8c030c100803f6d853923cc4ef727103")
    public fun configuration(configuration: CfnFleet.FleetConfigurationProperty.Builder.() -> Unit)

    /**
     * @param description A description that helps identify what the fleet is used for.
     */
    public fun description(description: String)

    /**
     * @param displayName The display name of the fleet summary to update. 
     *
     * This field can store any content. Escape or encode this content before displaying it on a
     * webpage or any other system that might interpret the content of this field.
     */
    public fun displayName(displayName: String)

    /**
     * @param farmId The farm ID. 
     */
    public fun farmId(farmId: String)

    /**
     * @param maxWorkerCount The maximum number of workers specified in the fleet. 
     */
    public fun maxWorkerCount(maxWorkerCount: Number)

    /**
     * @param minWorkerCount The minimum number of workers in the fleet.
     */
    public fun minWorkerCount(minWorkerCount: Number)

    /**
     * @param roleArn The IAM role that workers in the fleet use when processing jobs. 
     */
    public fun roleArn(roleArn: String)

    /**
     * @param tags The tags to add to your fleet.
     * Each tag consists of a tag key and a tag value. Tag keys and values are both required, but
     * tag values can be empty strings.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags to add to your fleet.
     * Each tag consists of a tag key and a tag value. Tag keys and values are both required, but
     * tag values can be empty strings.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.deadline.CfnFleetProps.Builder =
        software.amazon.awscdk.services.deadline.CfnFleetProps.builder()

    /**
     * @param configuration The configuration details for the fleet. 
     */
    override fun configuration(configuration: IResolvable) {
      cdkBuilder.configuration(configuration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param configuration The configuration details for the fleet. 
     */
    override fun configuration(configuration: CfnFleet.FleetConfigurationProperty) {
      cdkBuilder.configuration(configuration.let(CfnFleet.FleetConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param configuration The configuration details for the fleet. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8ff5f30b1b9fb66215f2a3f282c4322c8c030c100803f6d853923cc4ef727103")
    override
        fun configuration(configuration: CfnFleet.FleetConfigurationProperty.Builder.() -> Unit):
        Unit = configuration(CfnFleet.FleetConfigurationProperty(configuration))

    /**
     * @param description A description that helps identify what the fleet is used for.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param displayName The display name of the fleet summary to update. 
     *
     * This field can store any content. Escape or encode this content before displaying it on a
     * webpage or any other system that might interpret the content of this field.
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * @param farmId The farm ID. 
     */
    override fun farmId(farmId: String) {
      cdkBuilder.farmId(farmId)
    }

    /**
     * @param maxWorkerCount The maximum number of workers specified in the fleet. 
     */
    override fun maxWorkerCount(maxWorkerCount: Number) {
      cdkBuilder.maxWorkerCount(maxWorkerCount)
    }

    /**
     * @param minWorkerCount The minimum number of workers in the fleet.
     */
    override fun minWorkerCount(minWorkerCount: Number) {
      cdkBuilder.minWorkerCount(minWorkerCount)
    }

    /**
     * @param roleArn The IAM role that workers in the fleet use when processing jobs. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param tags The tags to add to your fleet.
     * Each tag consists of a tag key and a tag value. Tag keys and values are both required, but
     * tag values can be empty strings.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags to add to your fleet.
     * Each tag consists of a tag key and a tag value. Tag keys and values are both required, but
     * tag values can be empty strings.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.deadline.CfnFleetProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.deadline.CfnFleetProps,
  ) : CdkObject(cdkObject),
      CfnFleetProps {
    /**
     * The configuration details for the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-fleet.html#cfn-deadline-fleet-configuration)
     */
    override fun configuration(): Any = unwrap(this).getConfiguration()

    /**
     * A description that helps identify what the fleet is used for.
     *
     * Default: - ""
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-fleet.html#cfn-deadline-fleet-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The display name of the fleet summary to update.
     *
     *
     * This field can store any content. Escape or encode this content before displaying it on a
     * webpage or any other system that might interpret the content of this field.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-fleet.html#cfn-deadline-fleet-displayname)
     */
    override fun displayName(): String = unwrap(this).getDisplayName()

    /**
     * The farm ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-fleet.html#cfn-deadline-fleet-farmid)
     */
    override fun farmId(): String = unwrap(this).getFarmId()

    /**
     * The maximum number of workers specified in the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-fleet.html#cfn-deadline-fleet-maxworkercount)
     */
    override fun maxWorkerCount(): Number = unwrap(this).getMaxWorkerCount()

    /**
     * The minimum number of workers in the fleet.
     *
     * Default: - 0
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-fleet.html#cfn-deadline-fleet-minworkercount)
     */
    override fun minWorkerCount(): Number? = unwrap(this).getMinWorkerCount()

    /**
     * The IAM role that workers in the fleet use when processing jobs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-fleet.html#cfn-deadline-fleet-rolearn)
     */
    override fun roleArn(): String = unwrap(this).getRoleArn()

    /**
     * The tags to add to your fleet.
     *
     * Each tag consists of a tag key and a tag value. Tag keys and values are both required, but
     * tag values can be empty strings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-fleet.html#cfn-deadline-fleet-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFleetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.deadline.CfnFleetProps):
        CfnFleetProps = CdkObjectWrappers.wrap(cdkObject) as? CfnFleetProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFleetProps):
        software.amazon.awscdk.services.deadline.CfnFleetProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.deadline.CfnFleetProps
  }
}

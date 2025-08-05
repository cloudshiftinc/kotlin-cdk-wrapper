@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.workspacesinstances

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnWorkspaceInstance`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.workspacesinstances.*;
 * CfnWorkspaceInstanceProps cfnWorkspaceInstanceProps = CfnWorkspaceInstanceProps.builder()
 * .managedInstance(ManagedInstanceProperty.builder()
 * .imageId("imageId")
 * .instanceType("instanceType")
 * // the properties below are optional
 * .blockDeviceMappings(List.of(BlockDeviceMappingProperty.builder()
 * .deviceName("deviceName")
 * .ebs(EbsBlockDeviceProperty.builder()
 * .encrypted(false)
 * .iops(123)
 * .kmsKeyId("kmsKeyId")
 * .throughput(123)
 * .volumeSize(123)
 * .volumeType("volumeType")
 * .build())
 * .noDevice("noDevice")
 * .virtualName("virtualName")
 * .build()))
 * .cpuOptions(CpuOptionsRequestProperty.builder()
 * .coreCount(123)
 * .threadsPerCore(123)
 * .build())
 * .creditSpecification(CreditSpecificationRequestProperty.builder()
 * .cpuCredits("cpuCredits")
 * .build())
 * .disableApiStop(false)
 * .ebsOptimized(false)
 * .enclaveOptions(EnclaveOptionsRequestProperty.builder()
 * .enabled(false)
 * .build())
 * .hibernationOptions(HibernationOptionsRequestProperty.builder()
 * .configured(false)
 * .build())
 * .iamInstanceProfile(IamInstanceProfileSpecificationProperty.builder()
 * .name("name")
 * .build())
 * .keyName("keyName")
 * .maintenanceOptions(InstanceMaintenanceOptionsRequestProperty.builder()
 * .autoRecovery("autoRecovery")
 * .build())
 * .metadataOptions(InstanceMetadataOptionsRequestProperty.builder()
 * .httpEndpoint("httpEndpoint")
 * .httpProtocolIpv6("httpProtocolIpv6")
 * .httpPutResponseHopLimit(123)
 * .httpTokens("httpTokens")
 * .instanceMetadataTags("instanceMetadataTags")
 * .build())
 * .monitoring(RunInstancesMonitoringEnabledProperty.builder()
 * .enabled(false)
 * .build())
 * .networkInterfaces(List.of(InstanceNetworkInterfaceSpecificationProperty.builder()
 * .description("description")
 * .deviceIndex(123)
 * .groups(List.of("groups"))
 * .subnetId("subnetId")
 * .build()))
 * .networkPerformanceOptions(InstanceNetworkPerformanceOptionsRequestProperty.builder()
 * .bandwidthWeighting("bandwidthWeighting")
 * .build())
 * .placement(PlacementProperty.builder()
 * .availabilityZone("availabilityZone")
 * .groupName("groupName")
 * .tenancy("tenancy")
 * .build())
 * .privateDnsNameOptions(PrivateDnsNameOptionsRequestProperty.builder()
 * .enableResourceNameDnsAaaaRecord(false)
 * .enableResourceNameDnsARecord(false)
 * .hostnameType("hostnameType")
 * .build())
 * .tagSpecifications(List.of(TagSpecificationProperty.builder()
 * .resourceType("resourceType")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build()))
 * .userData("userData")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-workspaceinstance.html)
 */
public interface CfnWorkspaceInstanceProps {
  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-workspaceinstance.html#cfn-workspacesinstances-workspaceinstance-managedinstance)
   */
  public fun managedInstance(): Any? = unwrap(this).getManagedInstance()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-workspaceinstance.html#cfn-workspacesinstances-workspaceinstance-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnWorkspaceInstanceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param managedInstance the value to be set.
     */
    public fun managedInstance(managedInstance: IResolvable)

    /**
     * @param managedInstance the value to be set.
     */
    public fun managedInstance(managedInstance: CfnWorkspaceInstance.ManagedInstanceProperty)

    /**
     * @param managedInstance the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4c79024f74f5fddb2a1545b74b10f75002c0d4855adae6409f92de2ac83bb4a7")
    public
        fun managedInstance(managedInstance: CfnWorkspaceInstance.ManagedInstanceProperty.Builder.() -> Unit)

    /**
     * @param tags the value to be set.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags the value to be set.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstanceProps.Builder =
        software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstanceProps.builder()

    /**
     * @param managedInstance the value to be set.
     */
    override fun managedInstance(managedInstance: IResolvable) {
      cdkBuilder.managedInstance(managedInstance.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param managedInstance the value to be set.
     */
    override fun managedInstance(managedInstance: CfnWorkspaceInstance.ManagedInstanceProperty) {
      cdkBuilder.managedInstance(managedInstance.let(CfnWorkspaceInstance.ManagedInstanceProperty.Companion::unwrap))
    }

    /**
     * @param managedInstance the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4c79024f74f5fddb2a1545b74b10f75002c0d4855adae6409f92de2ac83bb4a7")
    override
        fun managedInstance(managedInstance: CfnWorkspaceInstance.ManagedInstanceProperty.Builder.() -> Unit):
        Unit = managedInstance(CfnWorkspaceInstance.ManagedInstanceProperty(managedInstance))

    /**
     * @param tags the value to be set.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags the value to be set.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build():
        software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstanceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstanceProps,
  ) : CdkObject(cdkObject),
      CfnWorkspaceInstanceProps {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-workspaceinstance.html#cfn-workspacesinstances-workspaceinstance-managedinstance)
     */
    override fun managedInstance(): Any? = unwrap(this).getManagedInstance()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-workspaceinstance.html#cfn-workspacesinstances-workspaceinstance-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnWorkspaceInstanceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstanceProps):
        CfnWorkspaceInstanceProps = CdkObjectWrappers.wrap(cdkObject) as? CfnWorkspaceInstanceProps
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnWorkspaceInstanceProps):
        software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstanceProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstanceProps
  }
}

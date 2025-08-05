@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.workspacesinstances

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Resource Type definition for AWS::WorkspacesInstances::WorkspaceInstance.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.workspacesinstances.*;
 * CfnWorkspaceInstance cfnWorkspaceInstance = CfnWorkspaceInstance.Builder.create(this,
 * "MyCfnWorkspaceInstance")
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
public open class CfnWorkspaceInstance(
  cdkObject: software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnWorkspaceInstanceProps,
  ) :
      this(software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnWorkspaceInstanceProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnWorkspaceInstanceProps.Builder.() -> Unit,
  ) : this(scope, id, CfnWorkspaceInstanceProps(props)
  )

  /**
   *
   */
  public open fun attrEc2ManagedInstance(): IResolvable =
      unwrap(this).getAttrEc2ManagedInstance().let(IResolvable::wrap)

  /**
   *
   */
  public open fun attrEc2ManagedInstanceInstanceId(): String =
      unwrap(this).getAttrEc2ManagedInstanceInstanceId()

  /**
   * The current state of the workspace instance.
   */
  public open fun attrProvisionState(): String = unwrap(this).getAttrProvisionState()

  /**
   * Unique identifier for the workspace instance.
   */
  public open fun attrWorkspaceInstanceId(): String = unwrap(this).getAttrWorkspaceInstanceId()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   *
   */
  public open fun managedInstance(): Any? = unwrap(this).getManagedInstance()

  /**
   *
   */
  public open fun managedInstance(`value`: IResolvable) {
    unwrap(this).setManagedInstance(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   *
   */
  public open fun managedInstance(`value`: ManagedInstanceProperty) {
    unwrap(this).setManagedInstance(`value`.let(ManagedInstanceProperty.Companion::unwrap))
  }

  /**
   *
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8d546e02af006853cd20724394736eecc7d7882ddf7ae38cf4e6b37c82c7874e")
  public open fun managedInstance(`value`: ManagedInstanceProperty.Builder.() -> Unit): Unit =
      managedInstance(ManagedInstanceProperty(`value`))

  /**
   *
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   *
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   *
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.workspacesinstances.CfnWorkspaceInstance].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-workspaceinstance.html#cfn-workspacesinstances-workspaceinstance-managedinstance)
     * @param managedInstance 
     */
    public fun managedInstance(managedInstance: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-workspaceinstance.html#cfn-workspacesinstances-workspaceinstance-managedinstance)
     * @param managedInstance 
     */
    public fun managedInstance(managedInstance: ManagedInstanceProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-workspaceinstance.html#cfn-workspacesinstances-workspaceinstance-managedinstance)
     * @param managedInstance 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5d87f5bb51d39c3080a356a5e9e6dbb41d340a20516c8b9935f6ea62afb31738")
    public fun managedInstance(managedInstance: ManagedInstanceProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-workspaceinstance.html#cfn-workspacesinstances-workspaceinstance-tags)
     * @param tags 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-workspaceinstance.html#cfn-workspacesinstances-workspaceinstance-tags)
     * @param tags 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.Builder =
        software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.Builder.create(scope,
        id)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-workspaceinstance.html#cfn-workspacesinstances-workspaceinstance-managedinstance)
     * @param managedInstance 
     */
    override fun managedInstance(managedInstance: IResolvable) {
      cdkBuilder.managedInstance(managedInstance.let(IResolvable.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-workspaceinstance.html#cfn-workspacesinstances-workspaceinstance-managedinstance)
     * @param managedInstance 
     */
    override fun managedInstance(managedInstance: ManagedInstanceProperty) {
      cdkBuilder.managedInstance(managedInstance.let(ManagedInstanceProperty.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-workspaceinstance.html#cfn-workspacesinstances-workspaceinstance-managedinstance)
     * @param managedInstance 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5d87f5bb51d39c3080a356a5e9e6dbb41d340a20516c8b9935f6ea62afb31738")
    override fun managedInstance(managedInstance: ManagedInstanceProperty.Builder.() -> Unit): Unit
        = managedInstance(ManagedInstanceProperty(managedInstance))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-workspaceinstance.html#cfn-workspacesinstances-workspaceinstance-tags)
     * @param tags 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-workspaceinstance.html#cfn-workspacesinstances-workspaceinstance-tags)
     * @param tags 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnWorkspaceInstance {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnWorkspaceInstance(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance):
        CfnWorkspaceInstance = CfnWorkspaceInstance(cdkObject)

    internal fun unwrap(wrapped: CfnWorkspaceInstance):
        software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance = wrapped.cdkObject
        as software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.workspacesinstances.*;
   * BlockDeviceMappingProperty blockDeviceMappingProperty = BlockDeviceMappingProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-blockdevicemapping.html)
   */
  public interface BlockDeviceMappingProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-blockdevicemapping.html#cfn-workspacesinstances-workspaceinstance-blockdevicemapping-devicename)
     */
    public fun deviceName(): String? = unwrap(this).getDeviceName()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-blockdevicemapping.html#cfn-workspacesinstances-workspaceinstance-blockdevicemapping-ebs)
     */
    public fun ebs(): Any? = unwrap(this).getEbs()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-blockdevicemapping.html#cfn-workspacesinstances-workspaceinstance-blockdevicemapping-nodevice)
     */
    public fun noDevice(): String? = unwrap(this).getNoDevice()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-blockdevicemapping.html#cfn-workspacesinstances-workspaceinstance-blockdevicemapping-virtualname)
     */
    public fun virtualName(): String? = unwrap(this).getVirtualName()

    /**
     * A builder for [BlockDeviceMappingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param deviceName the value to be set.
       */
      public fun deviceName(deviceName: String)

      /**
       * @param ebs the value to be set.
       */
      public fun ebs(ebs: IResolvable)

      /**
       * @param ebs the value to be set.
       */
      public fun ebs(ebs: EbsBlockDeviceProperty)

      /**
       * @param ebs the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ea04391b3c989bbbfa28cc380945d0b60efe07112964f5678ee85764f96d5d2e")
      public fun ebs(ebs: EbsBlockDeviceProperty.Builder.() -> Unit)

      /**
       * @param noDevice the value to be set.
       */
      public fun noDevice(noDevice: String)

      /**
       * @param virtualName the value to be set.
       */
      public fun virtualName(virtualName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.BlockDeviceMappingProperty.Builder
          =
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.BlockDeviceMappingProperty.builder()

      /**
       * @param deviceName the value to be set.
       */
      override fun deviceName(deviceName: String) {
        cdkBuilder.deviceName(deviceName)
      }

      /**
       * @param ebs the value to be set.
       */
      override fun ebs(ebs: IResolvable) {
        cdkBuilder.ebs(ebs.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param ebs the value to be set.
       */
      override fun ebs(ebs: EbsBlockDeviceProperty) {
        cdkBuilder.ebs(ebs.let(EbsBlockDeviceProperty.Companion::unwrap))
      }

      /**
       * @param ebs the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ea04391b3c989bbbfa28cc380945d0b60efe07112964f5678ee85764f96d5d2e")
      override fun ebs(ebs: EbsBlockDeviceProperty.Builder.() -> Unit): Unit =
          ebs(EbsBlockDeviceProperty(ebs))

      /**
       * @param noDevice the value to be set.
       */
      override fun noDevice(noDevice: String) {
        cdkBuilder.noDevice(noDevice)
      }

      /**
       * @param virtualName the value to be set.
       */
      override fun virtualName(virtualName: String) {
        cdkBuilder.virtualName(virtualName)
      }

      public fun build():
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.BlockDeviceMappingProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.BlockDeviceMappingProperty,
    ) : CdkObject(cdkObject),
        BlockDeviceMappingProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-blockdevicemapping.html#cfn-workspacesinstances-workspaceinstance-blockdevicemapping-devicename)
       */
      override fun deviceName(): String? = unwrap(this).getDeviceName()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-blockdevicemapping.html#cfn-workspacesinstances-workspaceinstance-blockdevicemapping-ebs)
       */
      override fun ebs(): Any? = unwrap(this).getEbs()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-blockdevicemapping.html#cfn-workspacesinstances-workspaceinstance-blockdevicemapping-nodevice)
       */
      override fun noDevice(): String? = unwrap(this).getNoDevice()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-blockdevicemapping.html#cfn-workspacesinstances-workspaceinstance-blockdevicemapping-virtualname)
       */
      override fun virtualName(): String? = unwrap(this).getVirtualName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BlockDeviceMappingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.BlockDeviceMappingProperty):
          BlockDeviceMappingProperty = CdkObjectWrappers.wrap(cdkObject) as?
          BlockDeviceMappingProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: BlockDeviceMappingProperty):
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.BlockDeviceMappingProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.BlockDeviceMappingProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.workspacesinstances.*;
   * CpuOptionsRequestProperty cpuOptionsRequestProperty = CpuOptionsRequestProperty.builder()
   * .coreCount(123)
   * .threadsPerCore(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-cpuoptionsrequest.html)
   */
  public interface CpuOptionsRequestProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-cpuoptionsrequest.html#cfn-workspacesinstances-workspaceinstance-cpuoptionsrequest-corecount)
     */
    public fun coreCount(): Number? = unwrap(this).getCoreCount()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-cpuoptionsrequest.html#cfn-workspacesinstances-workspaceinstance-cpuoptionsrequest-threadspercore)
     */
    public fun threadsPerCore(): Number? = unwrap(this).getThreadsPerCore()

    /**
     * A builder for [CpuOptionsRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param coreCount the value to be set.
       */
      public fun coreCount(coreCount: Number)

      /**
       * @param threadsPerCore the value to be set.
       */
      public fun threadsPerCore(threadsPerCore: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.CpuOptionsRequestProperty.Builder
          =
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.CpuOptionsRequestProperty.builder()

      /**
       * @param coreCount the value to be set.
       */
      override fun coreCount(coreCount: Number) {
        cdkBuilder.coreCount(coreCount)
      }

      /**
       * @param threadsPerCore the value to be set.
       */
      override fun threadsPerCore(threadsPerCore: Number) {
        cdkBuilder.threadsPerCore(threadsPerCore)
      }

      public fun build():
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.CpuOptionsRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.CpuOptionsRequestProperty,
    ) : CdkObject(cdkObject),
        CpuOptionsRequestProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-cpuoptionsrequest.html#cfn-workspacesinstances-workspaceinstance-cpuoptionsrequest-corecount)
       */
      override fun coreCount(): Number? = unwrap(this).getCoreCount()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-cpuoptionsrequest.html#cfn-workspacesinstances-workspaceinstance-cpuoptionsrequest-threadspercore)
       */
      override fun threadsPerCore(): Number? = unwrap(this).getThreadsPerCore()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CpuOptionsRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.CpuOptionsRequestProperty):
          CpuOptionsRequestProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CpuOptionsRequestProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CpuOptionsRequestProperty):
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.CpuOptionsRequestProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.CpuOptionsRequestProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.workspacesinstances.*;
   * CreditSpecificationRequestProperty creditSpecificationRequestProperty =
   * CreditSpecificationRequestProperty.builder()
   * .cpuCredits("cpuCredits")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-creditspecificationrequest.html)
   */
  public interface CreditSpecificationRequestProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-creditspecificationrequest.html#cfn-workspacesinstances-workspaceinstance-creditspecificationrequest-cpucredits)
     */
    public fun cpuCredits(): String? = unwrap(this).getCpuCredits()

    /**
     * A builder for [CreditSpecificationRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cpuCredits the value to be set.
       */
      public fun cpuCredits(cpuCredits: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.CreditSpecificationRequestProperty.Builder
          =
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.CreditSpecificationRequestProperty.builder()

      /**
       * @param cpuCredits the value to be set.
       */
      override fun cpuCredits(cpuCredits: String) {
        cdkBuilder.cpuCredits(cpuCredits)
      }

      public fun build():
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.CreditSpecificationRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.CreditSpecificationRequestProperty,
    ) : CdkObject(cdkObject),
        CreditSpecificationRequestProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-creditspecificationrequest.html#cfn-workspacesinstances-workspaceinstance-creditspecificationrequest-cpucredits)
       */
      override fun cpuCredits(): String? = unwrap(this).getCpuCredits()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CreditSpecificationRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.CreditSpecificationRequestProperty):
          CreditSpecificationRequestProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CreditSpecificationRequestProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CreditSpecificationRequestProperty):
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.CreditSpecificationRequestProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.CreditSpecificationRequestProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.workspacesinstances.*;
   * EC2ManagedInstanceProperty eC2ManagedInstanceProperty = EC2ManagedInstanceProperty.builder()
   * .instanceId("instanceId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-ec2managedinstance.html)
   */
  public interface EC2ManagedInstanceProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-ec2managedinstance.html#cfn-workspacesinstances-workspaceinstance-ec2managedinstance-instanceid)
     */
    public fun instanceId(): String? = unwrap(this).getInstanceId()

    /**
     * A builder for [EC2ManagedInstanceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param instanceId the value to be set.
       */
      public fun instanceId(instanceId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.EC2ManagedInstanceProperty.Builder
          =
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.EC2ManagedInstanceProperty.builder()

      /**
       * @param instanceId the value to be set.
       */
      override fun instanceId(instanceId: String) {
        cdkBuilder.instanceId(instanceId)
      }

      public fun build():
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.EC2ManagedInstanceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.EC2ManagedInstanceProperty,
    ) : CdkObject(cdkObject),
        EC2ManagedInstanceProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-ec2managedinstance.html#cfn-workspacesinstances-workspaceinstance-ec2managedinstance-instanceid)
       */
      override fun instanceId(): String? = unwrap(this).getInstanceId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EC2ManagedInstanceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.EC2ManagedInstanceProperty):
          EC2ManagedInstanceProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EC2ManagedInstanceProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EC2ManagedInstanceProperty):
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.EC2ManagedInstanceProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.EC2ManagedInstanceProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.workspacesinstances.*;
   * EbsBlockDeviceProperty ebsBlockDeviceProperty = EbsBlockDeviceProperty.builder()
   * .encrypted(false)
   * .iops(123)
   * .kmsKeyId("kmsKeyId")
   * .throughput(123)
   * .volumeSize(123)
   * .volumeType("volumeType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-ebsblockdevice.html)
   */
  public interface EbsBlockDeviceProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-ebsblockdevice.html#cfn-workspacesinstances-workspaceinstance-ebsblockdevice-encrypted)
     */
    public fun encrypted(): Any? = unwrap(this).getEncrypted()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-ebsblockdevice.html#cfn-workspacesinstances-workspaceinstance-ebsblockdevice-iops)
     */
    public fun iops(): Number? = unwrap(this).getIops()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-ebsblockdevice.html#cfn-workspacesinstances-workspaceinstance-ebsblockdevice-kmskeyid)
     */
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-ebsblockdevice.html#cfn-workspacesinstances-workspaceinstance-ebsblockdevice-throughput)
     */
    public fun throughput(): Number? = unwrap(this).getThroughput()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-ebsblockdevice.html#cfn-workspacesinstances-workspaceinstance-ebsblockdevice-volumesize)
     */
    public fun volumeSize(): Number? = unwrap(this).getVolumeSize()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-ebsblockdevice.html#cfn-workspacesinstances-workspaceinstance-ebsblockdevice-volumetype)
     */
    public fun volumeType(): String? = unwrap(this).getVolumeType()

    /**
     * A builder for [EbsBlockDeviceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param encrypted the value to be set.
       */
      public fun encrypted(encrypted: Boolean)

      /**
       * @param encrypted the value to be set.
       */
      public fun encrypted(encrypted: IResolvable)

      /**
       * @param iops the value to be set.
       */
      public fun iops(iops: Number)

      /**
       * @param kmsKeyId the value to be set.
       */
      public fun kmsKeyId(kmsKeyId: String)

      /**
       * @param throughput the value to be set.
       */
      public fun throughput(throughput: Number)

      /**
       * @param volumeSize the value to be set.
       */
      public fun volumeSize(volumeSize: Number)

      /**
       * @param volumeType the value to be set.
       */
      public fun volumeType(volumeType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.EbsBlockDeviceProperty.Builder
          =
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.EbsBlockDeviceProperty.builder()

      /**
       * @param encrypted the value to be set.
       */
      override fun encrypted(encrypted: Boolean) {
        cdkBuilder.encrypted(encrypted)
      }

      /**
       * @param encrypted the value to be set.
       */
      override fun encrypted(encrypted: IResolvable) {
        cdkBuilder.encrypted(encrypted.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param iops the value to be set.
       */
      override fun iops(iops: Number) {
        cdkBuilder.iops(iops)
      }

      /**
       * @param kmsKeyId the value to be set.
       */
      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      /**
       * @param throughput the value to be set.
       */
      override fun throughput(throughput: Number) {
        cdkBuilder.throughput(throughput)
      }

      /**
       * @param volumeSize the value to be set.
       */
      override fun volumeSize(volumeSize: Number) {
        cdkBuilder.volumeSize(volumeSize)
      }

      /**
       * @param volumeType the value to be set.
       */
      override fun volumeType(volumeType: String) {
        cdkBuilder.volumeType(volumeType)
      }

      public fun build():
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.EbsBlockDeviceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.EbsBlockDeviceProperty,
    ) : CdkObject(cdkObject),
        EbsBlockDeviceProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-ebsblockdevice.html#cfn-workspacesinstances-workspaceinstance-ebsblockdevice-encrypted)
       */
      override fun encrypted(): Any? = unwrap(this).getEncrypted()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-ebsblockdevice.html#cfn-workspacesinstances-workspaceinstance-ebsblockdevice-iops)
       */
      override fun iops(): Number? = unwrap(this).getIops()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-ebsblockdevice.html#cfn-workspacesinstances-workspaceinstance-ebsblockdevice-kmskeyid)
       */
      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-ebsblockdevice.html#cfn-workspacesinstances-workspaceinstance-ebsblockdevice-throughput)
       */
      override fun throughput(): Number? = unwrap(this).getThroughput()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-ebsblockdevice.html#cfn-workspacesinstances-workspaceinstance-ebsblockdevice-volumesize)
       */
      override fun volumeSize(): Number? = unwrap(this).getVolumeSize()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-ebsblockdevice.html#cfn-workspacesinstances-workspaceinstance-ebsblockdevice-volumetype)
       */
      override fun volumeType(): String? = unwrap(this).getVolumeType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EbsBlockDeviceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.EbsBlockDeviceProperty):
          EbsBlockDeviceProperty = CdkObjectWrappers.wrap(cdkObject) as? EbsBlockDeviceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: EbsBlockDeviceProperty):
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.EbsBlockDeviceProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.EbsBlockDeviceProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.workspacesinstances.*;
   * EnclaveOptionsRequestProperty enclaveOptionsRequestProperty =
   * EnclaveOptionsRequestProperty.builder()
   * .enabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-enclaveoptionsrequest.html)
   */
  public interface EnclaveOptionsRequestProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-enclaveoptionsrequest.html#cfn-workspacesinstances-workspaceinstance-enclaveoptionsrequest-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * A builder for [EnclaveOptionsRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled the value to be set.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled the value to be set.
       */
      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.EnclaveOptionsRequestProperty.Builder
          =
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.EnclaveOptionsRequestProperty.builder()

      /**
       * @param enabled the value to be set.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled the value to be set.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.EnclaveOptionsRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.EnclaveOptionsRequestProperty,
    ) : CdkObject(cdkObject),
        EnclaveOptionsRequestProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-enclaveoptionsrequest.html#cfn-workspacesinstances-workspaceinstance-enclaveoptionsrequest-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EnclaveOptionsRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.EnclaveOptionsRequestProperty):
          EnclaveOptionsRequestProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EnclaveOptionsRequestProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnclaveOptionsRequestProperty):
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.EnclaveOptionsRequestProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.EnclaveOptionsRequestProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.workspacesinstances.*;
   * HibernationOptionsRequestProperty hibernationOptionsRequestProperty =
   * HibernationOptionsRequestProperty.builder()
   * .configured(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-hibernationoptionsrequest.html)
   */
  public interface HibernationOptionsRequestProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-hibernationoptionsrequest.html#cfn-workspacesinstances-workspaceinstance-hibernationoptionsrequest-configured)
     */
    public fun configured(): Any? = unwrap(this).getConfigured()

    /**
     * A builder for [HibernationOptionsRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param configured the value to be set.
       */
      public fun configured(configured: Boolean)

      /**
       * @param configured the value to be set.
       */
      public fun configured(configured: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.HibernationOptionsRequestProperty.Builder
          =
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.HibernationOptionsRequestProperty.builder()

      /**
       * @param configured the value to be set.
       */
      override fun configured(configured: Boolean) {
        cdkBuilder.configured(configured)
      }

      /**
       * @param configured the value to be set.
       */
      override fun configured(configured: IResolvable) {
        cdkBuilder.configured(configured.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.HibernationOptionsRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.HibernationOptionsRequestProperty,
    ) : CdkObject(cdkObject),
        HibernationOptionsRequestProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-hibernationoptionsrequest.html#cfn-workspacesinstances-workspaceinstance-hibernationoptionsrequest-configured)
       */
      override fun configured(): Any? = unwrap(this).getConfigured()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          HibernationOptionsRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.HibernationOptionsRequestProperty):
          HibernationOptionsRequestProperty = CdkObjectWrappers.wrap(cdkObject) as?
          HibernationOptionsRequestProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: HibernationOptionsRequestProperty):
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.HibernationOptionsRequestProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.HibernationOptionsRequestProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.workspacesinstances.*;
   * IamInstanceProfileSpecificationProperty iamInstanceProfileSpecificationProperty =
   * IamInstanceProfileSpecificationProperty.builder()
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-iaminstanceprofilespecification.html)
   */
  public interface IamInstanceProfileSpecificationProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-iaminstanceprofilespecification.html#cfn-workspacesinstances-workspaceinstance-iaminstanceprofilespecification-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * A builder for [IamInstanceProfileSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name the value to be set.
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.IamInstanceProfileSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.IamInstanceProfileSpecificationProperty.builder()

      /**
       * @param name the value to be set.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.IamInstanceProfileSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.IamInstanceProfileSpecificationProperty,
    ) : CdkObject(cdkObject),
        IamInstanceProfileSpecificationProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-iaminstanceprofilespecification.html#cfn-workspacesinstances-workspaceinstance-iaminstanceprofilespecification-name)
       */
      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          IamInstanceProfileSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.IamInstanceProfileSpecificationProperty):
          IamInstanceProfileSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IamInstanceProfileSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IamInstanceProfileSpecificationProperty):
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.IamInstanceProfileSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.IamInstanceProfileSpecificationProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.workspacesinstances.*;
   * InstanceMaintenanceOptionsRequestProperty instanceMaintenanceOptionsRequestProperty =
   * InstanceMaintenanceOptionsRequestProperty.builder()
   * .autoRecovery("autoRecovery")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-instancemaintenanceoptionsrequest.html)
   */
  public interface InstanceMaintenanceOptionsRequestProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-instancemaintenanceoptionsrequest.html#cfn-workspacesinstances-workspaceinstance-instancemaintenanceoptionsrequest-autorecovery)
     */
    public fun autoRecovery(): String? = unwrap(this).getAutoRecovery()

    /**
     * A builder for [InstanceMaintenanceOptionsRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param autoRecovery the value to be set.
       */
      public fun autoRecovery(autoRecovery: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.InstanceMaintenanceOptionsRequestProperty.Builder
          =
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.InstanceMaintenanceOptionsRequestProperty.builder()

      /**
       * @param autoRecovery the value to be set.
       */
      override fun autoRecovery(autoRecovery: String) {
        cdkBuilder.autoRecovery(autoRecovery)
      }

      public fun build():
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.InstanceMaintenanceOptionsRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.InstanceMaintenanceOptionsRequestProperty,
    ) : CdkObject(cdkObject),
        InstanceMaintenanceOptionsRequestProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-instancemaintenanceoptionsrequest.html#cfn-workspacesinstances-workspaceinstance-instancemaintenanceoptionsrequest-autorecovery)
       */
      override fun autoRecovery(): String? = unwrap(this).getAutoRecovery()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          InstanceMaintenanceOptionsRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.InstanceMaintenanceOptionsRequestProperty):
          InstanceMaintenanceOptionsRequestProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InstanceMaintenanceOptionsRequestProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceMaintenanceOptionsRequestProperty):
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.InstanceMaintenanceOptionsRequestProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.InstanceMaintenanceOptionsRequestProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.workspacesinstances.*;
   * InstanceMetadataOptionsRequestProperty instanceMetadataOptionsRequestProperty =
   * InstanceMetadataOptionsRequestProperty.builder()
   * .httpEndpoint("httpEndpoint")
   * .httpProtocolIpv6("httpProtocolIpv6")
   * .httpPutResponseHopLimit(123)
   * .httpTokens("httpTokens")
   * .instanceMetadataTags("instanceMetadataTags")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-instancemetadataoptionsrequest.html)
   */
  public interface InstanceMetadataOptionsRequestProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-instancemetadataoptionsrequest.html#cfn-workspacesinstances-workspaceinstance-instancemetadataoptionsrequest-httpendpoint)
     */
    public fun httpEndpoint(): String? = unwrap(this).getHttpEndpoint()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-instancemetadataoptionsrequest.html#cfn-workspacesinstances-workspaceinstance-instancemetadataoptionsrequest-httpprotocolipv6)
     */
    public fun httpProtocolIpv6(): String? = unwrap(this).getHttpProtocolIpv6()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-instancemetadataoptionsrequest.html#cfn-workspacesinstances-workspaceinstance-instancemetadataoptionsrequest-httpputresponsehoplimit)
     */
    public fun httpPutResponseHopLimit(): Number? = unwrap(this).getHttpPutResponseHopLimit()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-instancemetadataoptionsrequest.html#cfn-workspacesinstances-workspaceinstance-instancemetadataoptionsrequest-httptokens)
     */
    public fun httpTokens(): String? = unwrap(this).getHttpTokens()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-instancemetadataoptionsrequest.html#cfn-workspacesinstances-workspaceinstance-instancemetadataoptionsrequest-instancemetadatatags)
     */
    public fun instanceMetadataTags(): String? = unwrap(this).getInstanceMetadataTags()

    /**
     * A builder for [InstanceMetadataOptionsRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param httpEndpoint the value to be set.
       */
      public fun httpEndpoint(httpEndpoint: String)

      /**
       * @param httpProtocolIpv6 the value to be set.
       */
      public fun httpProtocolIpv6(httpProtocolIpv6: String)

      /**
       * @param httpPutResponseHopLimit the value to be set.
       */
      public fun httpPutResponseHopLimit(httpPutResponseHopLimit: Number)

      /**
       * @param httpTokens the value to be set.
       */
      public fun httpTokens(httpTokens: String)

      /**
       * @param instanceMetadataTags the value to be set.
       */
      public fun instanceMetadataTags(instanceMetadataTags: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.InstanceMetadataOptionsRequestProperty.Builder
          =
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.InstanceMetadataOptionsRequestProperty.builder()

      /**
       * @param httpEndpoint the value to be set.
       */
      override fun httpEndpoint(httpEndpoint: String) {
        cdkBuilder.httpEndpoint(httpEndpoint)
      }

      /**
       * @param httpProtocolIpv6 the value to be set.
       */
      override fun httpProtocolIpv6(httpProtocolIpv6: String) {
        cdkBuilder.httpProtocolIpv6(httpProtocolIpv6)
      }

      /**
       * @param httpPutResponseHopLimit the value to be set.
       */
      override fun httpPutResponseHopLimit(httpPutResponseHopLimit: Number) {
        cdkBuilder.httpPutResponseHopLimit(httpPutResponseHopLimit)
      }

      /**
       * @param httpTokens the value to be set.
       */
      override fun httpTokens(httpTokens: String) {
        cdkBuilder.httpTokens(httpTokens)
      }

      /**
       * @param instanceMetadataTags the value to be set.
       */
      override fun instanceMetadataTags(instanceMetadataTags: String) {
        cdkBuilder.instanceMetadataTags(instanceMetadataTags)
      }

      public fun build():
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.InstanceMetadataOptionsRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.InstanceMetadataOptionsRequestProperty,
    ) : CdkObject(cdkObject),
        InstanceMetadataOptionsRequestProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-instancemetadataoptionsrequest.html#cfn-workspacesinstances-workspaceinstance-instancemetadataoptionsrequest-httpendpoint)
       */
      override fun httpEndpoint(): String? = unwrap(this).getHttpEndpoint()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-instancemetadataoptionsrequest.html#cfn-workspacesinstances-workspaceinstance-instancemetadataoptionsrequest-httpprotocolipv6)
       */
      override fun httpProtocolIpv6(): String? = unwrap(this).getHttpProtocolIpv6()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-instancemetadataoptionsrequest.html#cfn-workspacesinstances-workspaceinstance-instancemetadataoptionsrequest-httpputresponsehoplimit)
       */
      override fun httpPutResponseHopLimit(): Number? = unwrap(this).getHttpPutResponseHopLimit()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-instancemetadataoptionsrequest.html#cfn-workspacesinstances-workspaceinstance-instancemetadataoptionsrequest-httptokens)
       */
      override fun httpTokens(): String? = unwrap(this).getHttpTokens()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-instancemetadataoptionsrequest.html#cfn-workspacesinstances-workspaceinstance-instancemetadataoptionsrequest-instancemetadatatags)
       */
      override fun instanceMetadataTags(): String? = unwrap(this).getInstanceMetadataTags()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          InstanceMetadataOptionsRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.InstanceMetadataOptionsRequestProperty):
          InstanceMetadataOptionsRequestProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InstanceMetadataOptionsRequestProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceMetadataOptionsRequestProperty):
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.InstanceMetadataOptionsRequestProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.InstanceMetadataOptionsRequestProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.workspacesinstances.*;
   * InstanceNetworkInterfaceSpecificationProperty instanceNetworkInterfaceSpecificationProperty =
   * InstanceNetworkInterfaceSpecificationProperty.builder()
   * .description("description")
   * .deviceIndex(123)
   * .groups(List.of("groups"))
   * .subnetId("subnetId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-instancenetworkinterfacespecification.html)
   */
  public interface InstanceNetworkInterfaceSpecificationProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-instancenetworkinterfacespecification.html#cfn-workspacesinstances-workspaceinstance-instancenetworkinterfacespecification-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-instancenetworkinterfacespecification.html#cfn-workspacesinstances-workspaceinstance-instancenetworkinterfacespecification-deviceindex)
     */
    public fun deviceIndex(): Number? = unwrap(this).getDeviceIndex()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-instancenetworkinterfacespecification.html#cfn-workspacesinstances-workspaceinstance-instancenetworkinterfacespecification-groups)
     */
    public fun groups(): List<String> = unwrap(this).getGroups() ?: emptyList()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-instancenetworkinterfacespecification.html#cfn-workspacesinstances-workspaceinstance-instancenetworkinterfacespecification-subnetid)
     */
    public fun subnetId(): String? = unwrap(this).getSubnetId()

    /**
     * A builder for [InstanceNetworkInterfaceSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param description the value to be set.
       */
      public fun description(description: String)

      /**
       * @param deviceIndex the value to be set.
       */
      public fun deviceIndex(deviceIndex: Number)

      /**
       * @param groups the value to be set.
       */
      public fun groups(groups: List<String>)

      /**
       * @param groups the value to be set.
       */
      public fun groups(vararg groups: String)

      /**
       * @param subnetId the value to be set.
       */
      public fun subnetId(subnetId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.InstanceNetworkInterfaceSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.InstanceNetworkInterfaceSpecificationProperty.builder()

      /**
       * @param description the value to be set.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param deviceIndex the value to be set.
       */
      override fun deviceIndex(deviceIndex: Number) {
        cdkBuilder.deviceIndex(deviceIndex)
      }

      /**
       * @param groups the value to be set.
       */
      override fun groups(groups: List<String>) {
        cdkBuilder.groups(groups)
      }

      /**
       * @param groups the value to be set.
       */
      override fun groups(vararg groups: String): Unit = groups(groups.toList())

      /**
       * @param subnetId the value to be set.
       */
      override fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
      }

      public fun build():
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.InstanceNetworkInterfaceSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.InstanceNetworkInterfaceSpecificationProperty,
    ) : CdkObject(cdkObject),
        InstanceNetworkInterfaceSpecificationProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-instancenetworkinterfacespecification.html#cfn-workspacesinstances-workspaceinstance-instancenetworkinterfacespecification-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-instancenetworkinterfacespecification.html#cfn-workspacesinstances-workspaceinstance-instancenetworkinterfacespecification-deviceindex)
       */
      override fun deviceIndex(): Number? = unwrap(this).getDeviceIndex()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-instancenetworkinterfacespecification.html#cfn-workspacesinstances-workspaceinstance-instancenetworkinterfacespecification-groups)
       */
      override fun groups(): List<String> = unwrap(this).getGroups() ?: emptyList()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-instancenetworkinterfacespecification.html#cfn-workspacesinstances-workspaceinstance-instancenetworkinterfacespecification-subnetid)
       */
      override fun subnetId(): String? = unwrap(this).getSubnetId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          InstanceNetworkInterfaceSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.InstanceNetworkInterfaceSpecificationProperty):
          InstanceNetworkInterfaceSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InstanceNetworkInterfaceSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceNetworkInterfaceSpecificationProperty):
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.InstanceNetworkInterfaceSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.InstanceNetworkInterfaceSpecificationProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.workspacesinstances.*;
   * InstanceNetworkPerformanceOptionsRequestProperty
   * instanceNetworkPerformanceOptionsRequestProperty =
   * InstanceNetworkPerformanceOptionsRequestProperty.builder()
   * .bandwidthWeighting("bandwidthWeighting")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-instancenetworkperformanceoptionsrequest.html)
   */
  public interface InstanceNetworkPerformanceOptionsRequestProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-instancenetworkperformanceoptionsrequest.html#cfn-workspacesinstances-workspaceinstance-instancenetworkperformanceoptionsrequest-bandwidthweighting)
     */
    public fun bandwidthWeighting(): String? = unwrap(this).getBandwidthWeighting()

    /**
     * A builder for [InstanceNetworkPerformanceOptionsRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bandwidthWeighting the value to be set.
       */
      public fun bandwidthWeighting(bandwidthWeighting: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.InstanceNetworkPerformanceOptionsRequestProperty.Builder
          =
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.InstanceNetworkPerformanceOptionsRequestProperty.builder()

      /**
       * @param bandwidthWeighting the value to be set.
       */
      override fun bandwidthWeighting(bandwidthWeighting: String) {
        cdkBuilder.bandwidthWeighting(bandwidthWeighting)
      }

      public fun build():
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.InstanceNetworkPerformanceOptionsRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.InstanceNetworkPerformanceOptionsRequestProperty,
    ) : CdkObject(cdkObject),
        InstanceNetworkPerformanceOptionsRequestProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-instancenetworkperformanceoptionsrequest.html#cfn-workspacesinstances-workspaceinstance-instancenetworkperformanceoptionsrequest-bandwidthweighting)
       */
      override fun bandwidthWeighting(): String? = unwrap(this).getBandwidthWeighting()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          InstanceNetworkPerformanceOptionsRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.InstanceNetworkPerformanceOptionsRequestProperty):
          InstanceNetworkPerformanceOptionsRequestProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InstanceNetworkPerformanceOptionsRequestProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceNetworkPerformanceOptionsRequestProperty):
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.InstanceNetworkPerformanceOptionsRequestProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.InstanceNetworkPerformanceOptionsRequestProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.workspacesinstances.*;
   * ManagedInstanceProperty managedInstanceProperty = ManagedInstanceProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-managedinstance.html)
   */
  public interface ManagedInstanceProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-managedinstance.html#cfn-workspacesinstances-workspaceinstance-managedinstance-blockdevicemappings)
     */
    public fun blockDeviceMappings(): Any? = unwrap(this).getBlockDeviceMappings()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-managedinstance.html#cfn-workspacesinstances-workspaceinstance-managedinstance-cpuoptions)
     */
    public fun cpuOptions(): Any? = unwrap(this).getCpuOptions()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-managedinstance.html#cfn-workspacesinstances-workspaceinstance-managedinstance-creditspecification)
     */
    public fun creditSpecification(): Any? = unwrap(this).getCreditSpecification()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-managedinstance.html#cfn-workspacesinstances-workspaceinstance-managedinstance-disableapistop)
     */
    public fun disableApiStop(): Any? = unwrap(this).getDisableApiStop()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-managedinstance.html#cfn-workspacesinstances-workspaceinstance-managedinstance-ebsoptimized)
     */
    public fun ebsOptimized(): Any? = unwrap(this).getEbsOptimized()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-managedinstance.html#cfn-workspacesinstances-workspaceinstance-managedinstance-enclaveoptions)
     */
    public fun enclaveOptions(): Any? = unwrap(this).getEnclaveOptions()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-managedinstance.html#cfn-workspacesinstances-workspaceinstance-managedinstance-hibernationoptions)
     */
    public fun hibernationOptions(): Any? = unwrap(this).getHibernationOptions()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-managedinstance.html#cfn-workspacesinstances-workspaceinstance-managedinstance-iaminstanceprofile)
     */
    public fun iamInstanceProfile(): Any? = unwrap(this).getIamInstanceProfile()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-managedinstance.html#cfn-workspacesinstances-workspaceinstance-managedinstance-imageid)
     */
    public fun imageId(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-managedinstance.html#cfn-workspacesinstances-workspaceinstance-managedinstance-instancetype)
     */
    public fun instanceType(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-managedinstance.html#cfn-workspacesinstances-workspaceinstance-managedinstance-keyname)
     */
    public fun keyName(): String? = unwrap(this).getKeyName()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-managedinstance.html#cfn-workspacesinstances-workspaceinstance-managedinstance-maintenanceoptions)
     */
    public fun maintenanceOptions(): Any? = unwrap(this).getMaintenanceOptions()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-managedinstance.html#cfn-workspacesinstances-workspaceinstance-managedinstance-metadataoptions)
     */
    public fun metadataOptions(): Any? = unwrap(this).getMetadataOptions()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-managedinstance.html#cfn-workspacesinstances-workspaceinstance-managedinstance-monitoring)
     */
    public fun monitoring(): Any? = unwrap(this).getMonitoring()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-managedinstance.html#cfn-workspacesinstances-workspaceinstance-managedinstance-networkinterfaces)
     */
    public fun networkInterfaces(): Any? = unwrap(this).getNetworkInterfaces()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-managedinstance.html#cfn-workspacesinstances-workspaceinstance-managedinstance-networkperformanceoptions)
     */
    public fun networkPerformanceOptions(): Any? = unwrap(this).getNetworkPerformanceOptions()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-managedinstance.html#cfn-workspacesinstances-workspaceinstance-managedinstance-placement)
     */
    public fun placement(): Any? = unwrap(this).getPlacement()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-managedinstance.html#cfn-workspacesinstances-workspaceinstance-managedinstance-privatednsnameoptions)
     */
    public fun privateDnsNameOptions(): Any? = unwrap(this).getPrivateDnsNameOptions()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-managedinstance.html#cfn-workspacesinstances-workspaceinstance-managedinstance-tagspecifications)
     */
    public fun tagSpecifications(): Any? = unwrap(this).getTagSpecifications()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-managedinstance.html#cfn-workspacesinstances-workspaceinstance-managedinstance-userdata)
     */
    public fun userData(): String? = unwrap(this).getUserData()

    /**
     * A builder for [ManagedInstanceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param blockDeviceMappings the value to be set.
       */
      public fun blockDeviceMappings(blockDeviceMappings: IResolvable)

      /**
       * @param blockDeviceMappings the value to be set.
       */
      public fun blockDeviceMappings(blockDeviceMappings: List<Any>)

      /**
       * @param blockDeviceMappings the value to be set.
       */
      public fun blockDeviceMappings(vararg blockDeviceMappings: Any)

      /**
       * @param cpuOptions the value to be set.
       */
      public fun cpuOptions(cpuOptions: IResolvable)

      /**
       * @param cpuOptions the value to be set.
       */
      public fun cpuOptions(cpuOptions: CpuOptionsRequestProperty)

      /**
       * @param cpuOptions the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1f82c1f26d08823460fc2d42641cf5f4ed9cc91a00a0d265398b550dd0c841bd")
      public fun cpuOptions(cpuOptions: CpuOptionsRequestProperty.Builder.() -> Unit)

      /**
       * @param creditSpecification the value to be set.
       */
      public fun creditSpecification(creditSpecification: IResolvable)

      /**
       * @param creditSpecification the value to be set.
       */
      public fun creditSpecification(creditSpecification: CreditSpecificationRequestProperty)

      /**
       * @param creditSpecification the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1911f42e08d1990c855115dac42ae154abe9ab533ac94efd78acb1170960e1fe")
      public
          fun creditSpecification(creditSpecification: CreditSpecificationRequestProperty.Builder.() -> Unit)

      /**
       * @param disableApiStop the value to be set.
       */
      public fun disableApiStop(disableApiStop: Boolean)

      /**
       * @param disableApiStop the value to be set.
       */
      public fun disableApiStop(disableApiStop: IResolvable)

      /**
       * @param ebsOptimized the value to be set.
       */
      public fun ebsOptimized(ebsOptimized: Boolean)

      /**
       * @param ebsOptimized the value to be set.
       */
      public fun ebsOptimized(ebsOptimized: IResolvable)

      /**
       * @param enclaveOptions the value to be set.
       */
      public fun enclaveOptions(enclaveOptions: IResolvable)

      /**
       * @param enclaveOptions the value to be set.
       */
      public fun enclaveOptions(enclaveOptions: EnclaveOptionsRequestProperty)

      /**
       * @param enclaveOptions the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("105939ffa5bc1482655c9007976d12357e40ca6eac7604d93dbd3614ce2a82e9")
      public fun enclaveOptions(enclaveOptions: EnclaveOptionsRequestProperty.Builder.() -> Unit)

      /**
       * @param hibernationOptions the value to be set.
       */
      public fun hibernationOptions(hibernationOptions: IResolvable)

      /**
       * @param hibernationOptions the value to be set.
       */
      public fun hibernationOptions(hibernationOptions: HibernationOptionsRequestProperty)

      /**
       * @param hibernationOptions the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("87d2e1424cd9723532b82526dcb7bc27baa711ed5129b431b446128f87ba366e")
      public
          fun hibernationOptions(hibernationOptions: HibernationOptionsRequestProperty.Builder.() -> Unit)

      /**
       * @param iamInstanceProfile the value to be set.
       */
      public fun iamInstanceProfile(iamInstanceProfile: IResolvable)

      /**
       * @param iamInstanceProfile the value to be set.
       */
      public fun iamInstanceProfile(iamInstanceProfile: IamInstanceProfileSpecificationProperty)

      /**
       * @param iamInstanceProfile the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b5233638e78f4eb91033e6878076322b464b761fb33b04137ab07d64e3b1e549")
      public
          fun iamInstanceProfile(iamInstanceProfile: IamInstanceProfileSpecificationProperty.Builder.() -> Unit)

      /**
       * @param imageId the value to be set. 
       */
      public fun imageId(imageId: String)

      /**
       * @param instanceType the value to be set. 
       */
      public fun instanceType(instanceType: String)

      /**
       * @param keyName the value to be set.
       */
      public fun keyName(keyName: String)

      /**
       * @param maintenanceOptions the value to be set.
       */
      public fun maintenanceOptions(maintenanceOptions: IResolvable)

      /**
       * @param maintenanceOptions the value to be set.
       */
      public fun maintenanceOptions(maintenanceOptions: InstanceMaintenanceOptionsRequestProperty)

      /**
       * @param maintenanceOptions the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("df3fc543552b91ca077beb3d75cbceea122c68ae393b701a12b42edda96ad5a7")
      public
          fun maintenanceOptions(maintenanceOptions: InstanceMaintenanceOptionsRequestProperty.Builder.() -> Unit)

      /**
       * @param metadataOptions the value to be set.
       */
      public fun metadataOptions(metadataOptions: IResolvable)

      /**
       * @param metadataOptions the value to be set.
       */
      public fun metadataOptions(metadataOptions: InstanceMetadataOptionsRequestProperty)

      /**
       * @param metadataOptions the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("da6a849f7dde05a79f51df40a6ca94a1743e4e1641565383117d6126f9d3070d")
      public
          fun metadataOptions(metadataOptions: InstanceMetadataOptionsRequestProperty.Builder.() -> Unit)

      /**
       * @param monitoring the value to be set.
       */
      public fun monitoring(monitoring: IResolvable)

      /**
       * @param monitoring the value to be set.
       */
      public fun monitoring(monitoring: RunInstancesMonitoringEnabledProperty)

      /**
       * @param monitoring the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9c056cd0054632be726c249ed101c21f771c4699fa361bb580dc2367fc68e480")
      public fun monitoring(monitoring: RunInstancesMonitoringEnabledProperty.Builder.() -> Unit)

      /**
       * @param networkInterfaces the value to be set.
       */
      public fun networkInterfaces(networkInterfaces: IResolvable)

      /**
       * @param networkInterfaces the value to be set.
       */
      public fun networkInterfaces(networkInterfaces: List<Any>)

      /**
       * @param networkInterfaces the value to be set.
       */
      public fun networkInterfaces(vararg networkInterfaces: Any)

      /**
       * @param networkPerformanceOptions the value to be set.
       */
      public fun networkPerformanceOptions(networkPerformanceOptions: IResolvable)

      /**
       * @param networkPerformanceOptions the value to be set.
       */
      public
          fun networkPerformanceOptions(networkPerformanceOptions: InstanceNetworkPerformanceOptionsRequestProperty)

      /**
       * @param networkPerformanceOptions the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("08b1f79feafdf0b9f4e738b6cbedce8b0b2b53f4585a8264f68d32cfddda72d9")
      public
          fun networkPerformanceOptions(networkPerformanceOptions: InstanceNetworkPerformanceOptionsRequestProperty.Builder.() -> Unit)

      /**
       * @param placement the value to be set.
       */
      public fun placement(placement: IResolvable)

      /**
       * @param placement the value to be set.
       */
      public fun placement(placement: PlacementProperty)

      /**
       * @param placement the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e25513a2a3e500ec525319f4f47a27d00de2fddde520f43230b4378f12c767c6")
      public fun placement(placement: PlacementProperty.Builder.() -> Unit)

      /**
       * @param privateDnsNameOptions the value to be set.
       */
      public fun privateDnsNameOptions(privateDnsNameOptions: IResolvable)

      /**
       * @param privateDnsNameOptions the value to be set.
       */
      public fun privateDnsNameOptions(privateDnsNameOptions: PrivateDnsNameOptionsRequestProperty)

      /**
       * @param privateDnsNameOptions the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cb3c1434ceb8637ad99f8a94290518df8baa0d65728be8e25e8d33c7ba706a7c")
      public
          fun privateDnsNameOptions(privateDnsNameOptions: PrivateDnsNameOptionsRequestProperty.Builder.() -> Unit)

      /**
       * @param tagSpecifications the value to be set.
       */
      public fun tagSpecifications(tagSpecifications: IResolvable)

      /**
       * @param tagSpecifications the value to be set.
       */
      public fun tagSpecifications(tagSpecifications: List<Any>)

      /**
       * @param tagSpecifications the value to be set.
       */
      public fun tagSpecifications(vararg tagSpecifications: Any)

      /**
       * @param userData the value to be set.
       */
      public fun userData(userData: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.ManagedInstanceProperty.Builder
          =
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.ManagedInstanceProperty.builder()

      /**
       * @param blockDeviceMappings the value to be set.
       */
      override fun blockDeviceMappings(blockDeviceMappings: IResolvable) {
        cdkBuilder.blockDeviceMappings(blockDeviceMappings.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param blockDeviceMappings the value to be set.
       */
      override fun blockDeviceMappings(blockDeviceMappings: List<Any>) {
        cdkBuilder.blockDeviceMappings(blockDeviceMappings.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param blockDeviceMappings the value to be set.
       */
      override fun blockDeviceMappings(vararg blockDeviceMappings: Any): Unit =
          blockDeviceMappings(blockDeviceMappings.toList())

      /**
       * @param cpuOptions the value to be set.
       */
      override fun cpuOptions(cpuOptions: IResolvable) {
        cdkBuilder.cpuOptions(cpuOptions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param cpuOptions the value to be set.
       */
      override fun cpuOptions(cpuOptions: CpuOptionsRequestProperty) {
        cdkBuilder.cpuOptions(cpuOptions.let(CpuOptionsRequestProperty.Companion::unwrap))
      }

      /**
       * @param cpuOptions the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1f82c1f26d08823460fc2d42641cf5f4ed9cc91a00a0d265398b550dd0c841bd")
      override fun cpuOptions(cpuOptions: CpuOptionsRequestProperty.Builder.() -> Unit): Unit =
          cpuOptions(CpuOptionsRequestProperty(cpuOptions))

      /**
       * @param creditSpecification the value to be set.
       */
      override fun creditSpecification(creditSpecification: IResolvable) {
        cdkBuilder.creditSpecification(creditSpecification.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param creditSpecification the value to be set.
       */
      override fun creditSpecification(creditSpecification: CreditSpecificationRequestProperty) {
        cdkBuilder.creditSpecification(creditSpecification.let(CreditSpecificationRequestProperty.Companion::unwrap))
      }

      /**
       * @param creditSpecification the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1911f42e08d1990c855115dac42ae154abe9ab533ac94efd78acb1170960e1fe")
      override
          fun creditSpecification(creditSpecification: CreditSpecificationRequestProperty.Builder.() -> Unit):
          Unit = creditSpecification(CreditSpecificationRequestProperty(creditSpecification))

      /**
       * @param disableApiStop the value to be set.
       */
      override fun disableApiStop(disableApiStop: Boolean) {
        cdkBuilder.disableApiStop(disableApiStop)
      }

      /**
       * @param disableApiStop the value to be set.
       */
      override fun disableApiStop(disableApiStop: IResolvable) {
        cdkBuilder.disableApiStop(disableApiStop.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param ebsOptimized the value to be set.
       */
      override fun ebsOptimized(ebsOptimized: Boolean) {
        cdkBuilder.ebsOptimized(ebsOptimized)
      }

      /**
       * @param ebsOptimized the value to be set.
       */
      override fun ebsOptimized(ebsOptimized: IResolvable) {
        cdkBuilder.ebsOptimized(ebsOptimized.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param enclaveOptions the value to be set.
       */
      override fun enclaveOptions(enclaveOptions: IResolvable) {
        cdkBuilder.enclaveOptions(enclaveOptions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param enclaveOptions the value to be set.
       */
      override fun enclaveOptions(enclaveOptions: EnclaveOptionsRequestProperty) {
        cdkBuilder.enclaveOptions(enclaveOptions.let(EnclaveOptionsRequestProperty.Companion::unwrap))
      }

      /**
       * @param enclaveOptions the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("105939ffa5bc1482655c9007976d12357e40ca6eac7604d93dbd3614ce2a82e9")
      override fun enclaveOptions(enclaveOptions: EnclaveOptionsRequestProperty.Builder.() -> Unit):
          Unit = enclaveOptions(EnclaveOptionsRequestProperty(enclaveOptions))

      /**
       * @param hibernationOptions the value to be set.
       */
      override fun hibernationOptions(hibernationOptions: IResolvable) {
        cdkBuilder.hibernationOptions(hibernationOptions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param hibernationOptions the value to be set.
       */
      override fun hibernationOptions(hibernationOptions: HibernationOptionsRequestProperty) {
        cdkBuilder.hibernationOptions(hibernationOptions.let(HibernationOptionsRequestProperty.Companion::unwrap))
      }

      /**
       * @param hibernationOptions the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("87d2e1424cd9723532b82526dcb7bc27baa711ed5129b431b446128f87ba366e")
      override
          fun hibernationOptions(hibernationOptions: HibernationOptionsRequestProperty.Builder.() -> Unit):
          Unit = hibernationOptions(HibernationOptionsRequestProperty(hibernationOptions))

      /**
       * @param iamInstanceProfile the value to be set.
       */
      override fun iamInstanceProfile(iamInstanceProfile: IResolvable) {
        cdkBuilder.iamInstanceProfile(iamInstanceProfile.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param iamInstanceProfile the value to be set.
       */
      override fun iamInstanceProfile(iamInstanceProfile: IamInstanceProfileSpecificationProperty) {
        cdkBuilder.iamInstanceProfile(iamInstanceProfile.let(IamInstanceProfileSpecificationProperty.Companion::unwrap))
      }

      /**
       * @param iamInstanceProfile the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b5233638e78f4eb91033e6878076322b464b761fb33b04137ab07d64e3b1e549")
      override
          fun iamInstanceProfile(iamInstanceProfile: IamInstanceProfileSpecificationProperty.Builder.() -> Unit):
          Unit = iamInstanceProfile(IamInstanceProfileSpecificationProperty(iamInstanceProfile))

      /**
       * @param imageId the value to be set. 
       */
      override fun imageId(imageId: String) {
        cdkBuilder.imageId(imageId)
      }

      /**
       * @param instanceType the value to be set. 
       */
      override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      /**
       * @param keyName the value to be set.
       */
      override fun keyName(keyName: String) {
        cdkBuilder.keyName(keyName)
      }

      /**
       * @param maintenanceOptions the value to be set.
       */
      override fun maintenanceOptions(maintenanceOptions: IResolvable) {
        cdkBuilder.maintenanceOptions(maintenanceOptions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param maintenanceOptions the value to be set.
       */
      override
          fun maintenanceOptions(maintenanceOptions: InstanceMaintenanceOptionsRequestProperty) {
        cdkBuilder.maintenanceOptions(maintenanceOptions.let(InstanceMaintenanceOptionsRequestProperty.Companion::unwrap))
      }

      /**
       * @param maintenanceOptions the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("df3fc543552b91ca077beb3d75cbceea122c68ae393b701a12b42edda96ad5a7")
      override
          fun maintenanceOptions(maintenanceOptions: InstanceMaintenanceOptionsRequestProperty.Builder.() -> Unit):
          Unit = maintenanceOptions(InstanceMaintenanceOptionsRequestProperty(maintenanceOptions))

      /**
       * @param metadataOptions the value to be set.
       */
      override fun metadataOptions(metadataOptions: IResolvable) {
        cdkBuilder.metadataOptions(metadataOptions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param metadataOptions the value to be set.
       */
      override fun metadataOptions(metadataOptions: InstanceMetadataOptionsRequestProperty) {
        cdkBuilder.metadataOptions(metadataOptions.let(InstanceMetadataOptionsRequestProperty.Companion::unwrap))
      }

      /**
       * @param metadataOptions the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("da6a849f7dde05a79f51df40a6ca94a1743e4e1641565383117d6126f9d3070d")
      override
          fun metadataOptions(metadataOptions: InstanceMetadataOptionsRequestProperty.Builder.() -> Unit):
          Unit = metadataOptions(InstanceMetadataOptionsRequestProperty(metadataOptions))

      /**
       * @param monitoring the value to be set.
       */
      override fun monitoring(monitoring: IResolvable) {
        cdkBuilder.monitoring(monitoring.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param monitoring the value to be set.
       */
      override fun monitoring(monitoring: RunInstancesMonitoringEnabledProperty) {
        cdkBuilder.monitoring(monitoring.let(RunInstancesMonitoringEnabledProperty.Companion::unwrap))
      }

      /**
       * @param monitoring the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9c056cd0054632be726c249ed101c21f771c4699fa361bb580dc2367fc68e480")
      override fun monitoring(monitoring: RunInstancesMonitoringEnabledProperty.Builder.() -> Unit):
          Unit = monitoring(RunInstancesMonitoringEnabledProperty(monitoring))

      /**
       * @param networkInterfaces the value to be set.
       */
      override fun networkInterfaces(networkInterfaces: IResolvable) {
        cdkBuilder.networkInterfaces(networkInterfaces.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param networkInterfaces the value to be set.
       */
      override fun networkInterfaces(networkInterfaces: List<Any>) {
        cdkBuilder.networkInterfaces(networkInterfaces.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param networkInterfaces the value to be set.
       */
      override fun networkInterfaces(vararg networkInterfaces: Any): Unit =
          networkInterfaces(networkInterfaces.toList())

      /**
       * @param networkPerformanceOptions the value to be set.
       */
      override fun networkPerformanceOptions(networkPerformanceOptions: IResolvable) {
        cdkBuilder.networkPerformanceOptions(networkPerformanceOptions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param networkPerformanceOptions the value to be set.
       */
      override
          fun networkPerformanceOptions(networkPerformanceOptions: InstanceNetworkPerformanceOptionsRequestProperty) {
        cdkBuilder.networkPerformanceOptions(networkPerformanceOptions.let(InstanceNetworkPerformanceOptionsRequestProperty.Companion::unwrap))
      }

      /**
       * @param networkPerformanceOptions the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("08b1f79feafdf0b9f4e738b6cbedce8b0b2b53f4585a8264f68d32cfddda72d9")
      override
          fun networkPerformanceOptions(networkPerformanceOptions: InstanceNetworkPerformanceOptionsRequestProperty.Builder.() -> Unit):
          Unit =
          networkPerformanceOptions(InstanceNetworkPerformanceOptionsRequestProperty(networkPerformanceOptions))

      /**
       * @param placement the value to be set.
       */
      override fun placement(placement: IResolvable) {
        cdkBuilder.placement(placement.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param placement the value to be set.
       */
      override fun placement(placement: PlacementProperty) {
        cdkBuilder.placement(placement.let(PlacementProperty.Companion::unwrap))
      }

      /**
       * @param placement the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e25513a2a3e500ec525319f4f47a27d00de2fddde520f43230b4378f12c767c6")
      override fun placement(placement: PlacementProperty.Builder.() -> Unit): Unit =
          placement(PlacementProperty(placement))

      /**
       * @param privateDnsNameOptions the value to be set.
       */
      override fun privateDnsNameOptions(privateDnsNameOptions: IResolvable) {
        cdkBuilder.privateDnsNameOptions(privateDnsNameOptions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param privateDnsNameOptions the value to be set.
       */
      override
          fun privateDnsNameOptions(privateDnsNameOptions: PrivateDnsNameOptionsRequestProperty) {
        cdkBuilder.privateDnsNameOptions(privateDnsNameOptions.let(PrivateDnsNameOptionsRequestProperty.Companion::unwrap))
      }

      /**
       * @param privateDnsNameOptions the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cb3c1434ceb8637ad99f8a94290518df8baa0d65728be8e25e8d33c7ba706a7c")
      override
          fun privateDnsNameOptions(privateDnsNameOptions: PrivateDnsNameOptionsRequestProperty.Builder.() -> Unit):
          Unit = privateDnsNameOptions(PrivateDnsNameOptionsRequestProperty(privateDnsNameOptions))

      /**
       * @param tagSpecifications the value to be set.
       */
      override fun tagSpecifications(tagSpecifications: IResolvable) {
        cdkBuilder.tagSpecifications(tagSpecifications.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param tagSpecifications the value to be set.
       */
      override fun tagSpecifications(tagSpecifications: List<Any>) {
        cdkBuilder.tagSpecifications(tagSpecifications.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param tagSpecifications the value to be set.
       */
      override fun tagSpecifications(vararg tagSpecifications: Any): Unit =
          tagSpecifications(tagSpecifications.toList())

      /**
       * @param userData the value to be set.
       */
      override fun userData(userData: String) {
        cdkBuilder.userData(userData)
      }

      public fun build():
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.ManagedInstanceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.ManagedInstanceProperty,
    ) : CdkObject(cdkObject),
        ManagedInstanceProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-managedinstance.html#cfn-workspacesinstances-workspaceinstance-managedinstance-blockdevicemappings)
       */
      override fun blockDeviceMappings(): Any? = unwrap(this).getBlockDeviceMappings()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-managedinstance.html#cfn-workspacesinstances-workspaceinstance-managedinstance-cpuoptions)
       */
      override fun cpuOptions(): Any? = unwrap(this).getCpuOptions()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-managedinstance.html#cfn-workspacesinstances-workspaceinstance-managedinstance-creditspecification)
       */
      override fun creditSpecification(): Any? = unwrap(this).getCreditSpecification()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-managedinstance.html#cfn-workspacesinstances-workspaceinstance-managedinstance-disableapistop)
       */
      override fun disableApiStop(): Any? = unwrap(this).getDisableApiStop()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-managedinstance.html#cfn-workspacesinstances-workspaceinstance-managedinstance-ebsoptimized)
       */
      override fun ebsOptimized(): Any? = unwrap(this).getEbsOptimized()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-managedinstance.html#cfn-workspacesinstances-workspaceinstance-managedinstance-enclaveoptions)
       */
      override fun enclaveOptions(): Any? = unwrap(this).getEnclaveOptions()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-managedinstance.html#cfn-workspacesinstances-workspaceinstance-managedinstance-hibernationoptions)
       */
      override fun hibernationOptions(): Any? = unwrap(this).getHibernationOptions()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-managedinstance.html#cfn-workspacesinstances-workspaceinstance-managedinstance-iaminstanceprofile)
       */
      override fun iamInstanceProfile(): Any? = unwrap(this).getIamInstanceProfile()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-managedinstance.html#cfn-workspacesinstances-workspaceinstance-managedinstance-imageid)
       */
      override fun imageId(): String = unwrap(this).getImageId()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-managedinstance.html#cfn-workspacesinstances-workspaceinstance-managedinstance-instancetype)
       */
      override fun instanceType(): String = unwrap(this).getInstanceType()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-managedinstance.html#cfn-workspacesinstances-workspaceinstance-managedinstance-keyname)
       */
      override fun keyName(): String? = unwrap(this).getKeyName()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-managedinstance.html#cfn-workspacesinstances-workspaceinstance-managedinstance-maintenanceoptions)
       */
      override fun maintenanceOptions(): Any? = unwrap(this).getMaintenanceOptions()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-managedinstance.html#cfn-workspacesinstances-workspaceinstance-managedinstance-metadataoptions)
       */
      override fun metadataOptions(): Any? = unwrap(this).getMetadataOptions()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-managedinstance.html#cfn-workspacesinstances-workspaceinstance-managedinstance-monitoring)
       */
      override fun monitoring(): Any? = unwrap(this).getMonitoring()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-managedinstance.html#cfn-workspacesinstances-workspaceinstance-managedinstance-networkinterfaces)
       */
      override fun networkInterfaces(): Any? = unwrap(this).getNetworkInterfaces()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-managedinstance.html#cfn-workspacesinstances-workspaceinstance-managedinstance-networkperformanceoptions)
       */
      override fun networkPerformanceOptions(): Any? = unwrap(this).getNetworkPerformanceOptions()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-managedinstance.html#cfn-workspacesinstances-workspaceinstance-managedinstance-placement)
       */
      override fun placement(): Any? = unwrap(this).getPlacement()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-managedinstance.html#cfn-workspacesinstances-workspaceinstance-managedinstance-privatednsnameoptions)
       */
      override fun privateDnsNameOptions(): Any? = unwrap(this).getPrivateDnsNameOptions()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-managedinstance.html#cfn-workspacesinstances-workspaceinstance-managedinstance-tagspecifications)
       */
      override fun tagSpecifications(): Any? = unwrap(this).getTagSpecifications()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-managedinstance.html#cfn-workspacesinstances-workspaceinstance-managedinstance-userdata)
       */
      override fun userData(): String? = unwrap(this).getUserData()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ManagedInstanceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.ManagedInstanceProperty):
          ManagedInstanceProperty = CdkObjectWrappers.wrap(cdkObject) as? ManagedInstanceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ManagedInstanceProperty):
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.ManagedInstanceProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.ManagedInstanceProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.workspacesinstances.*;
   * PlacementProperty placementProperty = PlacementProperty.builder()
   * .availabilityZone("availabilityZone")
   * .groupName("groupName")
   * .tenancy("tenancy")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-placement.html)
   */
  public interface PlacementProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-placement.html#cfn-workspacesinstances-workspaceinstance-placement-availabilityzone)
     */
    public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-placement.html#cfn-workspacesinstances-workspaceinstance-placement-groupname)
     */
    public fun groupName(): String? = unwrap(this).getGroupName()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-placement.html#cfn-workspacesinstances-workspaceinstance-placement-tenancy)
     */
    public fun tenancy(): String? = unwrap(this).getTenancy()

    /**
     * A builder for [PlacementProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param availabilityZone the value to be set.
       */
      public fun availabilityZone(availabilityZone: String)

      /**
       * @param groupName the value to be set.
       */
      public fun groupName(groupName: String)

      /**
       * @param tenancy the value to be set.
       */
      public fun tenancy(tenancy: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.PlacementProperty.Builder
          =
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.PlacementProperty.builder()

      /**
       * @param availabilityZone the value to be set.
       */
      override fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
      }

      /**
       * @param groupName the value to be set.
       */
      override fun groupName(groupName: String) {
        cdkBuilder.groupName(groupName)
      }

      /**
       * @param tenancy the value to be set.
       */
      override fun tenancy(tenancy: String) {
        cdkBuilder.tenancy(tenancy)
      }

      public fun build():
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.PlacementProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.PlacementProperty,
    ) : CdkObject(cdkObject),
        PlacementProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-placement.html#cfn-workspacesinstances-workspaceinstance-placement-availabilityzone)
       */
      override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-placement.html#cfn-workspacesinstances-workspaceinstance-placement-groupname)
       */
      override fun groupName(): String? = unwrap(this).getGroupName()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-placement.html#cfn-workspacesinstances-workspaceinstance-placement-tenancy)
       */
      override fun tenancy(): String? = unwrap(this).getTenancy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PlacementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.PlacementProperty):
          PlacementProperty = CdkObjectWrappers.wrap(cdkObject) as? PlacementProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: PlacementProperty):
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.PlacementProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.PlacementProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.workspacesinstances.*;
   * PrivateDnsNameOptionsRequestProperty privateDnsNameOptionsRequestProperty =
   * PrivateDnsNameOptionsRequestProperty.builder()
   * .enableResourceNameDnsAaaaRecord(false)
   * .enableResourceNameDnsARecord(false)
   * .hostnameType("hostnameType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-privatednsnameoptionsrequest.html)
   */
  public interface PrivateDnsNameOptionsRequestProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-privatednsnameoptionsrequest.html#cfn-workspacesinstances-workspaceinstance-privatednsnameoptionsrequest-enableresourcenamednsarecord)
     */
    public fun enableResourceNameDnsARecord(): Any? = unwrap(this).getEnableResourceNameDnsARecord()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-privatednsnameoptionsrequest.html#cfn-workspacesinstances-workspaceinstance-privatednsnameoptionsrequest-enableresourcenamednsaaaarecord)
     */
    public fun enableResourceNameDnsAaaaRecord(): Any? =
        unwrap(this).getEnableResourceNameDnsAaaaRecord()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-privatednsnameoptionsrequest.html#cfn-workspacesinstances-workspaceinstance-privatednsnameoptionsrequest-hostnametype)
     */
    public fun hostnameType(): String? = unwrap(this).getHostnameType()

    /**
     * A builder for [PrivateDnsNameOptionsRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enableResourceNameDnsARecord the value to be set.
       */
      public fun enableResourceNameDnsARecord(enableResourceNameDnsARecord: Boolean)

      /**
       * @param enableResourceNameDnsARecord the value to be set.
       */
      public fun enableResourceNameDnsARecord(enableResourceNameDnsARecord: IResolvable)

      /**
       * @param enableResourceNameDnsAaaaRecord the value to be set.
       */
      public fun enableResourceNameDnsAaaaRecord(enableResourceNameDnsAaaaRecord: Boolean)

      /**
       * @param enableResourceNameDnsAaaaRecord the value to be set.
       */
      public fun enableResourceNameDnsAaaaRecord(enableResourceNameDnsAaaaRecord: IResolvable)

      /**
       * @param hostnameType the value to be set.
       */
      public fun hostnameType(hostnameType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.PrivateDnsNameOptionsRequestProperty.Builder
          =
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.PrivateDnsNameOptionsRequestProperty.builder()

      /**
       * @param enableResourceNameDnsARecord the value to be set.
       */
      override fun enableResourceNameDnsARecord(enableResourceNameDnsARecord: Boolean) {
        cdkBuilder.enableResourceNameDnsARecord(enableResourceNameDnsARecord)
      }

      /**
       * @param enableResourceNameDnsARecord the value to be set.
       */
      override fun enableResourceNameDnsARecord(enableResourceNameDnsARecord: IResolvable) {
        cdkBuilder.enableResourceNameDnsARecord(enableResourceNameDnsARecord.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param enableResourceNameDnsAaaaRecord the value to be set.
       */
      override fun enableResourceNameDnsAaaaRecord(enableResourceNameDnsAaaaRecord: Boolean) {
        cdkBuilder.enableResourceNameDnsAaaaRecord(enableResourceNameDnsAaaaRecord)
      }

      /**
       * @param enableResourceNameDnsAaaaRecord the value to be set.
       */
      override fun enableResourceNameDnsAaaaRecord(enableResourceNameDnsAaaaRecord: IResolvable) {
        cdkBuilder.enableResourceNameDnsAaaaRecord(enableResourceNameDnsAaaaRecord.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param hostnameType the value to be set.
       */
      override fun hostnameType(hostnameType: String) {
        cdkBuilder.hostnameType(hostnameType)
      }

      public fun build():
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.PrivateDnsNameOptionsRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.PrivateDnsNameOptionsRequestProperty,
    ) : CdkObject(cdkObject),
        PrivateDnsNameOptionsRequestProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-privatednsnameoptionsrequest.html#cfn-workspacesinstances-workspaceinstance-privatednsnameoptionsrequest-enableresourcenamednsarecord)
       */
      override fun enableResourceNameDnsARecord(): Any? =
          unwrap(this).getEnableResourceNameDnsARecord()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-privatednsnameoptionsrequest.html#cfn-workspacesinstances-workspaceinstance-privatednsnameoptionsrequest-enableresourcenamednsaaaarecord)
       */
      override fun enableResourceNameDnsAaaaRecord(): Any? =
          unwrap(this).getEnableResourceNameDnsAaaaRecord()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-privatednsnameoptionsrequest.html#cfn-workspacesinstances-workspaceinstance-privatednsnameoptionsrequest-hostnametype)
       */
      override fun hostnameType(): String? = unwrap(this).getHostnameType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PrivateDnsNameOptionsRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.PrivateDnsNameOptionsRequestProperty):
          PrivateDnsNameOptionsRequestProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PrivateDnsNameOptionsRequestProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PrivateDnsNameOptionsRequestProperty):
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.PrivateDnsNameOptionsRequestProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.PrivateDnsNameOptionsRequestProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.workspacesinstances.*;
   * RunInstancesMonitoringEnabledProperty runInstancesMonitoringEnabledProperty =
   * RunInstancesMonitoringEnabledProperty.builder()
   * .enabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-runinstancesmonitoringenabled.html)
   */
  public interface RunInstancesMonitoringEnabledProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-runinstancesmonitoringenabled.html#cfn-workspacesinstances-workspaceinstance-runinstancesmonitoringenabled-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * A builder for [RunInstancesMonitoringEnabledProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled the value to be set.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled the value to be set.
       */
      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.RunInstancesMonitoringEnabledProperty.Builder
          =
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.RunInstancesMonitoringEnabledProperty.builder()

      /**
       * @param enabled the value to be set.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled the value to be set.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.RunInstancesMonitoringEnabledProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.RunInstancesMonitoringEnabledProperty,
    ) : CdkObject(cdkObject),
        RunInstancesMonitoringEnabledProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-runinstancesmonitoringenabled.html#cfn-workspacesinstances-workspaceinstance-runinstancesmonitoringenabled-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          RunInstancesMonitoringEnabledProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.RunInstancesMonitoringEnabledProperty):
          RunInstancesMonitoringEnabledProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RunInstancesMonitoringEnabledProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RunInstancesMonitoringEnabledProperty):
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.RunInstancesMonitoringEnabledProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.RunInstancesMonitoringEnabledProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.workspacesinstances.*;
   * TagSpecificationProperty tagSpecificationProperty = TagSpecificationProperty.builder()
   * .resourceType("resourceType")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-tagspecification.html)
   */
  public interface TagSpecificationProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-tagspecification.html#cfn-workspacesinstances-workspaceinstance-tagspecification-resourcetype)
     */
    public fun resourceType(): String? = unwrap(this).getResourceType()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-tagspecification.html#cfn-workspacesinstances-workspaceinstance-tagspecification-tags)
     */
    public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * A builder for [TagSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param resourceType the value to be set.
       */
      public fun resourceType(resourceType: String)

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
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.TagSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.TagSpecificationProperty.builder()

      /**
       * @param resourceType the value to be set.
       */
      override fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
      }

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
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.TagSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.TagSpecificationProperty,
    ) : CdkObject(cdkObject),
        TagSpecificationProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-tagspecification.html#cfn-workspacesinstances-workspaceinstance-tagspecification-resourcetype)
       */
      override fun resourceType(): String? = unwrap(this).getResourceType()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-workspaceinstance-tagspecification.html#cfn-workspacesinstances-workspaceinstance-tagspecification-tags)
       */
      override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TagSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.TagSpecificationProperty):
          TagSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as? TagSpecificationProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TagSpecificationProperty):
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.TagSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance.TagSpecificationProperty
    }
  }
}

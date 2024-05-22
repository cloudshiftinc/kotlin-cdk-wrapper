@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Allocates a fully dedicated physical server for launching EC2 instances.
 *
 * Because the host is fully dedicated for your use, it can help you address compliance requirements
 * and reduce costs by allowing you to use your existing server-bound software licenses. For more
 * information, see [Dedicated
 * Hosts](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-overview.html) in the
 * *Amazon EC2 User Guide for Linux Instances* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnHost cfnHost = CfnHost.Builder.create(this, "MyCfnHost")
 * .availabilityZone("availabilityZone")
 * // the properties below are optional
 * .assetId("assetId")
 * .autoPlacement("autoPlacement")
 * .hostMaintenance("hostMaintenance")
 * .hostRecovery("hostRecovery")
 * .instanceFamily("instanceFamily")
 * .instanceType("instanceType")
 * .outpostArn("outpostArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html)
 */
public open class CfnHost(
  cdkObject: software.amazon.awscdk.services.ec2.CfnHost,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnHostProps,
  ) :
      this(software.amazon.awscdk.services.ec2.CfnHost(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnHostProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnHostProps.Builder.() -> Unit,
  ) : this(scope, id, CfnHostProps(props)
  )

  /**
   * The ID of the Outpost hardware asset on which the Dedicated Host is allocated.
   */
  public open fun assetId(): String? = unwrap(this).getAssetId()

  /**
   * The ID of the Outpost hardware asset on which the Dedicated Host is allocated.
   */
  public open fun assetId(`value`: String) {
    unwrap(this).setAssetId(`value`)
  }

  /**
   * The ID of the host.
   */
  public open fun attrHostId(): String = unwrap(this).getAttrHostId()

  /**
   * Indicates whether the host accepts any untargeted instance launches that match its instance
   * type configuration, or if it only accepts Host tenancy instance launches that specify its unique
   * host ID.
   */
  public open fun autoPlacement(): String? = unwrap(this).getAutoPlacement()

  /**
   * Indicates whether the host accepts any untargeted instance launches that match its instance
   * type configuration, or if it only accepts Host tenancy instance launches that specify its unique
   * host ID.
   */
  public open fun autoPlacement(`value`: String) {
    unwrap(this).setAutoPlacement(`value`)
  }

  /**
   * The Availability Zone in which to allocate the Dedicated Host.
   */
  public open fun availabilityZone(): String = unwrap(this).getAvailabilityZone()

  /**
   * The Availability Zone in which to allocate the Dedicated Host.
   */
  public open fun availabilityZone(`value`: String) {
    unwrap(this).setAvailabilityZone(`value`)
  }

  /**
   * Indicates whether host maintenance is enabled or disabled for the Dedicated Host.
   */
  public open fun hostMaintenance(): String? = unwrap(this).getHostMaintenance()

  /**
   * Indicates whether host maintenance is enabled or disabled for the Dedicated Host.
   */
  public open fun hostMaintenance(`value`: String) {
    unwrap(this).setHostMaintenance(`value`)
  }

  /**
   * Indicates whether to enable or disable host recovery for the Dedicated Host.
   */
  public open fun hostRecovery(): String? = unwrap(this).getHostRecovery()

  /**
   * Indicates whether to enable or disable host recovery for the Dedicated Host.
   */
  public open fun hostRecovery(`value`: String) {
    unwrap(this).setHostRecovery(`value`)
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
   * The instance family supported by the Dedicated Host.
   */
  public open fun instanceFamily(): String? = unwrap(this).getInstanceFamily()

  /**
   * The instance family supported by the Dedicated Host.
   */
  public open fun instanceFamily(`value`: String) {
    unwrap(this).setInstanceFamily(`value`)
  }

  /**
   * Specifies the instance type to be supported by the Dedicated Hosts.
   */
  public open fun instanceType(): String? = unwrap(this).getInstanceType()

  /**
   * Specifies the instance type to be supported by the Dedicated Hosts.
   */
  public open fun instanceType(`value`: String) {
    unwrap(this).setInstanceType(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the AWS Outpost on which the Dedicated Host is allocated.
   */
  public open fun outpostArn(): String? = unwrap(this).getOutpostArn()

  /**
   * The Amazon Resource Name (ARN) of the AWS Outpost on which the Dedicated Host is allocated.
   */
  public open fun outpostArn(`value`: String) {
    unwrap(this).setOutpostArn(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnHost].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the Outpost hardware asset on which the Dedicated Host is allocated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html#cfn-ec2-host-assetid)
     * @param assetId The ID of the Outpost hardware asset on which the Dedicated Host is allocated.
     * 
     */
    public fun assetId(assetId: String)

    /**
     * Indicates whether the host accepts any untargeted instance launches that match its instance
     * type configuration, or if it only accepts Host tenancy instance launches that specify its unique
     * host ID.
     *
     * For more information, see [Understanding auto-placement and
     * affinity](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/how-dedicated-hosts-work.html#dedicated-hosts-understanding)
     * in the *Amazon EC2 User Guide* .
     *
     * Default: `on`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html#cfn-ec2-host-autoplacement)
     * @param autoPlacement Indicates whether the host accepts any untargeted instance launches that
     * match its instance type configuration, or if it only accepts Host tenancy instance launches that
     * specify its unique host ID. 
     */
    public fun autoPlacement(autoPlacement: String)

    /**
     * The Availability Zone in which to allocate the Dedicated Host.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html#cfn-ec2-host-availabilityzone)
     * @param availabilityZone The Availability Zone in which to allocate the Dedicated Host. 
     */
    public fun availabilityZone(availabilityZone: String)

    /**
     * Indicates whether host maintenance is enabled or disabled for the Dedicated Host.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html#cfn-ec2-host-hostmaintenance)
     * @param hostMaintenance Indicates whether host maintenance is enabled or disabled for the
     * Dedicated Host. 
     */
    public fun hostMaintenance(hostMaintenance: String)

    /**
     * Indicates whether to enable or disable host recovery for the Dedicated Host.
     *
     * Host recovery is disabled by default. For more information, see [Host
     * recovery](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html) in
     * the *Amazon EC2 User Guide* .
     *
     * Default: `off`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html#cfn-ec2-host-hostrecovery)
     * @param hostRecovery Indicates whether to enable or disable host recovery for the Dedicated
     * Host. 
     */
    public fun hostRecovery(hostRecovery: String)

    /**
     * The instance family supported by the Dedicated Host.
     *
     * For example, `m5` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html#cfn-ec2-host-instancefamily)
     * @param instanceFamily The instance family supported by the Dedicated Host. 
     */
    public fun instanceFamily(instanceFamily: String)

    /**
     * Specifies the instance type to be supported by the Dedicated Hosts.
     *
     * If you specify an instance type, the Dedicated Hosts support instances of the specified
     * instance type only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html#cfn-ec2-host-instancetype)
     * @param instanceType Specifies the instance type to be supported by the Dedicated Hosts. 
     */
    public fun instanceType(instanceType: String)

    /**
     * The Amazon Resource Name (ARN) of the AWS Outpost on which the Dedicated Host is allocated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html#cfn-ec2-host-outpostarn)
     * @param outpostArn The Amazon Resource Name (ARN) of the AWS Outpost on which the Dedicated
     * Host is allocated. 
     */
    public fun outpostArn(outpostArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnHost.Builder =
        software.amazon.awscdk.services.ec2.CfnHost.Builder.create(scope, id)

    /**
     * The ID of the Outpost hardware asset on which the Dedicated Host is allocated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html#cfn-ec2-host-assetid)
     * @param assetId The ID of the Outpost hardware asset on which the Dedicated Host is allocated.
     * 
     */
    override fun assetId(assetId: String) {
      cdkBuilder.assetId(assetId)
    }

    /**
     * Indicates whether the host accepts any untargeted instance launches that match its instance
     * type configuration, or if it only accepts Host tenancy instance launches that specify its unique
     * host ID.
     *
     * For more information, see [Understanding auto-placement and
     * affinity](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/how-dedicated-hosts-work.html#dedicated-hosts-understanding)
     * in the *Amazon EC2 User Guide* .
     *
     * Default: `on`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html#cfn-ec2-host-autoplacement)
     * @param autoPlacement Indicates whether the host accepts any untargeted instance launches that
     * match its instance type configuration, or if it only accepts Host tenancy instance launches that
     * specify its unique host ID. 
     */
    override fun autoPlacement(autoPlacement: String) {
      cdkBuilder.autoPlacement(autoPlacement)
    }

    /**
     * The Availability Zone in which to allocate the Dedicated Host.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html#cfn-ec2-host-availabilityzone)
     * @param availabilityZone The Availability Zone in which to allocate the Dedicated Host. 
     */
    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * Indicates whether host maintenance is enabled or disabled for the Dedicated Host.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html#cfn-ec2-host-hostmaintenance)
     * @param hostMaintenance Indicates whether host maintenance is enabled or disabled for the
     * Dedicated Host. 
     */
    override fun hostMaintenance(hostMaintenance: String) {
      cdkBuilder.hostMaintenance(hostMaintenance)
    }

    /**
     * Indicates whether to enable or disable host recovery for the Dedicated Host.
     *
     * Host recovery is disabled by default. For more information, see [Host
     * recovery](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html) in
     * the *Amazon EC2 User Guide* .
     *
     * Default: `off`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html#cfn-ec2-host-hostrecovery)
     * @param hostRecovery Indicates whether to enable or disable host recovery for the Dedicated
     * Host. 
     */
    override fun hostRecovery(hostRecovery: String) {
      cdkBuilder.hostRecovery(hostRecovery)
    }

    /**
     * The instance family supported by the Dedicated Host.
     *
     * For example, `m5` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html#cfn-ec2-host-instancefamily)
     * @param instanceFamily The instance family supported by the Dedicated Host. 
     */
    override fun instanceFamily(instanceFamily: String) {
      cdkBuilder.instanceFamily(instanceFamily)
    }

    /**
     * Specifies the instance type to be supported by the Dedicated Hosts.
     *
     * If you specify an instance type, the Dedicated Hosts support instances of the specified
     * instance type only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html#cfn-ec2-host-instancetype)
     * @param instanceType Specifies the instance type to be supported by the Dedicated Hosts. 
     */
    override fun instanceType(instanceType: String) {
      cdkBuilder.instanceType(instanceType)
    }

    /**
     * The Amazon Resource Name (ARN) of the AWS Outpost on which the Dedicated Host is allocated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html#cfn-ec2-host-outpostarn)
     * @param outpostArn The Amazon Resource Name (ARN) of the AWS Outpost on which the Dedicated
     * Host is allocated. 
     */
    override fun outpostArn(outpostArn: String) {
      cdkBuilder.outpostArn(outpostArn)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnHost = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnHost.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnHost {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnHost(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnHost): CfnHost =
        CfnHost(cdkObject)

    internal fun unwrap(wrapped: CfnHost): software.amazon.awscdk.services.ec2.CfnHost =
        wrapped.cdkObject as software.amazon.awscdk.services.ec2.CfnHost
  }
}

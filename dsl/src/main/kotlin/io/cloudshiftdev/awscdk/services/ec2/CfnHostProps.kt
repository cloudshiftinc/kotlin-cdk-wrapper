package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface CfnHostProps {
  /**
   * The ID of the Outpost hardware asset on which the Dedicated Host is allocated.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html#cfn-ec2-host-assetid)
   */
  public fun assetId(): String? = unwrap(this).getAssetId()

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
   */
  public fun autoPlacement(): String? = unwrap(this).getAutoPlacement()

  /**
   * The Availability Zone in which to allocate the Dedicated Host.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html#cfn-ec2-host-availabilityzone)
   */
  public fun availabilityZone(): String

  /**
   * Indicates whether host maintenance is enabled or disabled for the Dedicated Host.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html#cfn-ec2-host-hostmaintenance)
   */
  public fun hostMaintenance(): String? = unwrap(this).getHostMaintenance()

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
   */
  public fun hostRecovery(): String? = unwrap(this).getHostRecovery()

  /**
   * The instance family supported by the Dedicated Host.
   *
   * For example, `m5` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html#cfn-ec2-host-instancefamily)
   */
  public fun instanceFamily(): String? = unwrap(this).getInstanceFamily()

  /**
   * Specifies the instance type to be supported by the Dedicated Hosts.
   *
   * If you specify an instance type, the Dedicated Hosts support instances of the specified
   * instance type only.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html#cfn-ec2-host-instancetype)
   */
  public fun instanceType(): String? = unwrap(this).getInstanceType()

  /**
   * The Amazon Resource Name (ARN) of the AWS Outpost on which the Dedicated Host is allocated.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html#cfn-ec2-host-outpostarn)
   */
  public fun outpostArn(): String? = unwrap(this).getOutpostArn()

  /**
   * A builder for [CfnHostProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param assetId The ID of the Outpost hardware asset on which the Dedicated Host is allocated.
     */
    public fun assetId(assetId: String)

    /**
     * @param autoPlacement Indicates whether the host accepts any untargeted instance launches that
     * match its instance type configuration, or if it only accepts Host tenancy instance launches that
     * specify its unique host ID.
     * For more information, see [Understanding auto-placement and
     * affinity](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/how-dedicated-hosts-work.html#dedicated-hosts-understanding)
     * in the *Amazon EC2 User Guide* .
     *
     * Default: `on`
     */
    public fun autoPlacement(autoPlacement: String)

    /**
     * @param availabilityZone The Availability Zone in which to allocate the Dedicated Host. 
     */
    public fun availabilityZone(availabilityZone: String)

    /**
     * @param hostMaintenance Indicates whether host maintenance is enabled or disabled for the
     * Dedicated Host.
     */
    public fun hostMaintenance(hostMaintenance: String)

    /**
     * @param hostRecovery Indicates whether to enable or disable host recovery for the Dedicated
     * Host.
     * Host recovery is disabled by default. For more information, see [Host
     * recovery](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html) in
     * the *Amazon EC2 User Guide* .
     *
     * Default: `off`
     */
    public fun hostRecovery(hostRecovery: String)

    /**
     * @param instanceFamily The instance family supported by the Dedicated Host.
     * For example, `m5` .
     */
    public fun instanceFamily(instanceFamily: String)

    /**
     * @param instanceType Specifies the instance type to be supported by the Dedicated Hosts.
     * If you specify an instance type, the Dedicated Hosts support instances of the specified
     * instance type only.
     */
    public fun instanceType(instanceType: String)

    /**
     * @param outpostArn The Amazon Resource Name (ARN) of the AWS Outpost on which the Dedicated
     * Host is allocated.
     */
    public fun outpostArn(outpostArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnHostProps.Builder =
        software.amazon.awscdk.services.ec2.CfnHostProps.builder()

    /**
     * @param assetId The ID of the Outpost hardware asset on which the Dedicated Host is allocated.
     */
    override fun assetId(assetId: String) {
      cdkBuilder.assetId(assetId)
    }

    /**
     * @param autoPlacement Indicates whether the host accepts any untargeted instance launches that
     * match its instance type configuration, or if it only accepts Host tenancy instance launches that
     * specify its unique host ID.
     * For more information, see [Understanding auto-placement and
     * affinity](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/how-dedicated-hosts-work.html#dedicated-hosts-understanding)
     * in the *Amazon EC2 User Guide* .
     *
     * Default: `on`
     */
    override fun autoPlacement(autoPlacement: String) {
      cdkBuilder.autoPlacement(autoPlacement)
    }

    /**
     * @param availabilityZone The Availability Zone in which to allocate the Dedicated Host. 
     */
    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * @param hostMaintenance Indicates whether host maintenance is enabled or disabled for the
     * Dedicated Host.
     */
    override fun hostMaintenance(hostMaintenance: String) {
      cdkBuilder.hostMaintenance(hostMaintenance)
    }

    /**
     * @param hostRecovery Indicates whether to enable or disable host recovery for the Dedicated
     * Host.
     * Host recovery is disabled by default. For more information, see [Host
     * recovery](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html) in
     * the *Amazon EC2 User Guide* .
     *
     * Default: `off`
     */
    override fun hostRecovery(hostRecovery: String) {
      cdkBuilder.hostRecovery(hostRecovery)
    }

    /**
     * @param instanceFamily The instance family supported by the Dedicated Host.
     * For example, `m5` .
     */
    override fun instanceFamily(instanceFamily: String) {
      cdkBuilder.instanceFamily(instanceFamily)
    }

    /**
     * @param instanceType Specifies the instance type to be supported by the Dedicated Hosts.
     * If you specify an instance type, the Dedicated Hosts support instances of the specified
     * instance type only.
     */
    override fun instanceType(instanceType: String) {
      cdkBuilder.instanceType(instanceType)
    }

    /**
     * @param outpostArn The Amazon Resource Name (ARN) of the AWS Outpost on which the Dedicated
     * Host is allocated.
     */
    override fun outpostArn(outpostArn: String) {
      cdkBuilder.outpostArn(outpostArn)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnHostProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnHostProps,
  ) : CdkObject(cdkObject), CfnHostProps {
    /**
     * The ID of the Outpost hardware asset on which the Dedicated Host is allocated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html#cfn-ec2-host-assetid)
     */
    override fun assetId(): String? = unwrap(this).getAssetId()

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
     */
    override fun autoPlacement(): String? = unwrap(this).getAutoPlacement()

    /**
     * The Availability Zone in which to allocate the Dedicated Host.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html#cfn-ec2-host-availabilityzone)
     */
    override fun availabilityZone(): String = unwrap(this).getAvailabilityZone()

    /**
     * Indicates whether host maintenance is enabled or disabled for the Dedicated Host.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html#cfn-ec2-host-hostmaintenance)
     */
    override fun hostMaintenance(): String? = unwrap(this).getHostMaintenance()

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
     */
    override fun hostRecovery(): String? = unwrap(this).getHostRecovery()

    /**
     * The instance family supported by the Dedicated Host.
     *
     * For example, `m5` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html#cfn-ec2-host-instancefamily)
     */
    override fun instanceFamily(): String? = unwrap(this).getInstanceFamily()

    /**
     * Specifies the instance type to be supported by the Dedicated Hosts.
     *
     * If you specify an instance type, the Dedicated Hosts support instances of the specified
     * instance type only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html#cfn-ec2-host-instancetype)
     */
    override fun instanceType(): String? = unwrap(this).getInstanceType()

    /**
     * The Amazon Resource Name (ARN) of the AWS Outpost on which the Dedicated Host is allocated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html#cfn-ec2-host-outpostarn)
     */
    override fun outpostArn(): String? = unwrap(this).getOutpostArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnHostProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnHostProps): CfnHostProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnHostProps): software.amazon.awscdk.services.ec2.CfnHostProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnHostProps
  }
}

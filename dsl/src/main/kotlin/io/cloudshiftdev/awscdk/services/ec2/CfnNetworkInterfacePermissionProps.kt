package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface CfnNetworkInterfacePermissionProps {
  /**
   * The AWS account ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfacepermission.html#cfn-ec2-networkinterfacepermission-awsaccountid)
   */
  public fun awsAccountId(): String

  /**
   * The ID of the network interface.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfacepermission.html#cfn-ec2-networkinterfacepermission-networkinterfaceid)
   */
  public fun networkInterfaceId(): String

  /**
   * The type of permission to grant: `INSTANCE-ATTACH` or `EIP-ASSOCIATE` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfacepermission.html#cfn-ec2-networkinterfacepermission-permission)
   */
  public fun permission(): String

  /**
   * A builder for [CfnNetworkInterfacePermissionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param awsAccountId The AWS account ID. 
     */
    public fun awsAccountId(awsAccountId: String)

    /**
     * @param networkInterfaceId The ID of the network interface. 
     */
    public fun networkInterfaceId(networkInterfaceId: String)

    /**
     * @param permission The type of permission to grant: `INSTANCE-ATTACH` or `EIP-ASSOCIATE` . 
     */
    public fun permission(permission: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnNetworkInterfacePermissionProps.Builder =
        software.amazon.awscdk.services.ec2.CfnNetworkInterfacePermissionProps.builder()

    /**
     * @param awsAccountId The AWS account ID. 
     */
    override fun awsAccountId(awsAccountId: String) {
      cdkBuilder.awsAccountId(awsAccountId)
    }

    /**
     * @param networkInterfaceId The ID of the network interface. 
     */
    override fun networkInterfaceId(networkInterfaceId: String) {
      cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    /**
     * @param permission The type of permission to grant: `INSTANCE-ATTACH` or `EIP-ASSOCIATE` . 
     */
    override fun permission(permission: String) {
      cdkBuilder.permission(permission)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnNetworkInterfacePermissionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInterfacePermissionProps,
  ) : CdkObject(cdkObject), CfnNetworkInterfacePermissionProps {
    /**
     * The AWS account ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfacepermission.html#cfn-ec2-networkinterfacepermission-awsaccountid)
     */
    override fun awsAccountId(): String = unwrap(this).getAwsAccountId()

    /**
     * The ID of the network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfacepermission.html#cfn-ec2-networkinterfacepermission-networkinterfaceid)
     */
    override fun networkInterfaceId(): String = unwrap(this).getNetworkInterfaceId()

    /**
     * The type of permission to grant: `INSTANCE-ATTACH` or `EIP-ASSOCIATE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfacepermission.html#cfn-ec2-networkinterfacepermission-permission)
     */
    override fun permission(): String = unwrap(this).getPermission()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnNetworkInterfacePermissionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInterfacePermissionProps):
        CfnNetworkInterfacePermissionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnNetworkInterfacePermissionProps):
        software.amazon.awscdk.services.ec2.CfnNetworkInterfacePermissionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnNetworkInterfacePermissionProps
  }
}

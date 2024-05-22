@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.efs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::EFS::MountTarget` resource is an Amazon EFS resource that creates a mount target for an
 * EFS file system.
 *
 * You can then mount the file system on Amazon EC2 instances or other resources by using the mount
 * target.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.efs.*;
 * CfnMountTarget cfnMountTarget = CfnMountTarget.Builder.create(this, "MyCfnMountTarget")
 * .fileSystemId("fileSystemId")
 * .securityGroups(List.of("securityGroups"))
 * .subnetId("subnetId")
 * // the properties below are optional
 * .ipAddress("ipAddress")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html)
 */
public open class CfnMountTarget(
  cdkObject: software.amazon.awscdk.services.efs.CfnMountTarget,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnMountTargetProps,
  ) :
      this(software.amazon.awscdk.services.efs.CfnMountTarget(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnMountTargetProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnMountTargetProps.Builder.() -> Unit,
  ) : this(scope, id, CfnMountTargetProps(props)
  )

  /**
   * The ID of the Amazon EFS file system that the mount target provides access to.
   *
   * Example: `fs-0123456789111222a`
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The IPv4 address of the mount target.
   *
   * Example: 192.0.2.0
   */
  public open fun attrIpAddress(): String = unwrap(this).getAttrIpAddress()

  /**
   * The ID of the file system for which to create the mount target.
   */
  public open fun fileSystemId(): String = unwrap(this).getFileSystemId()

  /**
   * The ID of the file system for which to create the mount target.
   */
  public open fun fileSystemId(`value`: String) {
    unwrap(this).setFileSystemId(`value`)
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
   * Valid IPv4 address within the address range of the specified subnet.
   */
  public open fun ipAddress(): String? = unwrap(this).getIpAddress()

  /**
   * Valid IPv4 address within the address range of the specified subnet.
   */
  public open fun ipAddress(`value`: String) {
    unwrap(this).setIpAddress(`value`)
  }

  /**
   * Up to five VPC security group IDs, of the form `sg-xxxxxxxx` .
   */
  public open fun securityGroups(): List<String> = unwrap(this).getSecurityGroups()

  /**
   * Up to five VPC security group IDs, of the form `sg-xxxxxxxx` .
   */
  public open fun securityGroups(`value`: List<String>) {
    unwrap(this).setSecurityGroups(`value`)
  }

  /**
   * Up to five VPC security group IDs, of the form `sg-xxxxxxxx` .
   */
  public open fun securityGroups(vararg `value`: String): Unit = securityGroups(`value`.toList())

  /**
   * The ID of the subnet to add the mount target in.
   */
  public open fun subnetId(): String = unwrap(this).getSubnetId()

  /**
   * The ID of the subnet to add the mount target in.
   */
  public open fun subnetId(`value`: String) {
    unwrap(this).setSubnetId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.efs.CfnMountTarget].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the file system for which to create the mount target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-filesystemid)
     * @param fileSystemId The ID of the file system for which to create the mount target. 
     */
    public fun fileSystemId(fileSystemId: String)

    /**
     * Valid IPv4 address within the address range of the specified subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-ipaddress)
     * @param ipAddress Valid IPv4 address within the address range of the specified subnet. 
     */
    public fun ipAddress(ipAddress: String)

    /**
     * Up to five VPC security group IDs, of the form `sg-xxxxxxxx` .
     *
     * These must be for the same VPC as subnet specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-securitygroups)
     * @param securityGroups Up to five VPC security group IDs, of the form `sg-xxxxxxxx` . 
     */
    public fun securityGroups(securityGroups: List<String>)

    /**
     * Up to five VPC security group IDs, of the form `sg-xxxxxxxx` .
     *
     * These must be for the same VPC as subnet specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-securitygroups)
     * @param securityGroups Up to five VPC security group IDs, of the form `sg-xxxxxxxx` . 
     */
    public fun securityGroups(vararg securityGroups: String)

    /**
     * The ID of the subnet to add the mount target in.
     *
     * For One Zone file systems, use the subnet that is associated with the file system's
     * Availability Zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-subnetid)
     * @param subnetId The ID of the subnet to add the mount target in. 
     */
    public fun subnetId(subnetId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.efs.CfnMountTarget.Builder =
        software.amazon.awscdk.services.efs.CfnMountTarget.Builder.create(scope, id)

    /**
     * The ID of the file system for which to create the mount target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-filesystemid)
     * @param fileSystemId The ID of the file system for which to create the mount target. 
     */
    override fun fileSystemId(fileSystemId: String) {
      cdkBuilder.fileSystemId(fileSystemId)
    }

    /**
     * Valid IPv4 address within the address range of the specified subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-ipaddress)
     * @param ipAddress Valid IPv4 address within the address range of the specified subnet. 
     */
    override fun ipAddress(ipAddress: String) {
      cdkBuilder.ipAddress(ipAddress)
    }

    /**
     * Up to five VPC security group IDs, of the form `sg-xxxxxxxx` .
     *
     * These must be for the same VPC as subnet specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-securitygroups)
     * @param securityGroups Up to five VPC security group IDs, of the form `sg-xxxxxxxx` . 
     */
    override fun securityGroups(securityGroups: List<String>) {
      cdkBuilder.securityGroups(securityGroups)
    }

    /**
     * Up to five VPC security group IDs, of the form `sg-xxxxxxxx` .
     *
     * These must be for the same VPC as subnet specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-securitygroups)
     * @param securityGroups Up to five VPC security group IDs, of the form `sg-xxxxxxxx` . 
     */
    override fun securityGroups(vararg securityGroups: String): Unit =
        securityGroups(securityGroups.toList())

    /**
     * The ID of the subnet to add the mount target in.
     *
     * For One Zone file systems, use the subnet that is associated with the file system's
     * Availability Zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-subnetid)
     * @param subnetId The ID of the subnet to add the mount target in. 
     */
    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    public fun build(): software.amazon.awscdk.services.efs.CfnMountTarget = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.efs.CfnMountTarget.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMountTarget {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMountTarget(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.efs.CfnMountTarget): CfnMountTarget
        = CfnMountTarget(cdkObject)

    internal fun unwrap(wrapped: CfnMountTarget): software.amazon.awscdk.services.efs.CfnMountTarget
        = wrapped.cdkObject as software.amazon.awscdk.services.efs.CfnMountTarget
  }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.fsx

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import kotlin.String
import kotlin.Unit

/**
 * Properties that describe an existing FSx file system.
 *
 * Example:
 *
 * ```
 * ISecurityGroup sg = SecurityGroup.fromSecurityGroupId(this, "FsxSecurityGroup",
 * "{SECURITY-GROUP-ID}");
 * IFileSystem fs = LustreFileSystem.fromLustreFileSystemAttributes(this, "FsxLustreFileSystem",
 * FileSystemAttributes.builder()
 * .dnsName("{FILE-SYSTEM-DNS-NAME}")
 * .fileSystemId("{FILE-SYSTEM-ID}")
 * .securityGroup(sg)
 * .build());
 * IVpc vpc = Vpc.fromVpcAttributes(this, "Vpc", VpcAttributes.builder()
 * .availabilityZones(List.of("us-west-2a", "us-west-2b"))
 * .publicSubnetIds(List.of("{US-WEST-2A-SUBNET-ID}", "{US-WEST-2B-SUBNET-ID}"))
 * .vpcId("{VPC-ID}")
 * .build());
 * Instance inst = Instance.Builder.create(this, "inst")
 * .instanceType(InstanceType.of(InstanceClass.T2, InstanceSize.LARGE))
 * .machineImage(AmazonLinuxImage.Builder.create()
 * .generation(AmazonLinuxGeneration.AMAZON_LINUX_2)
 * .build())
 * .vpc(vpc)
 * .vpcSubnets(SubnetSelection.builder()
 * .subnetType(SubnetType.PUBLIC)
 * .build())
 * .build();
 * fs.connections.allowDefaultPortFrom(inst);
 * ```
 */
public interface FileSystemAttributes {
  /**
   * The DNS name assigned to this file system.
   */
  public fun dnsName(): String

  /**
   * The ID of the file system, assigned by Amazon FSx.
   */
  public fun fileSystemId(): String

  /**
   * The security group of the file system.
   */
  public fun securityGroup(): ISecurityGroup

  /**
   * A builder for [FileSystemAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param dnsName The DNS name assigned to this file system. 
     */
    public fun dnsName(dnsName: String)

    /**
     * @param fileSystemId The ID of the file system, assigned by Amazon FSx. 
     */
    public fun fileSystemId(fileSystemId: String)

    /**
     * @param securityGroup The security group of the file system. 
     */
    public fun securityGroup(securityGroup: ISecurityGroup)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.fsx.FileSystemAttributes.Builder =
        software.amazon.awscdk.services.fsx.FileSystemAttributes.builder()

    /**
     * @param dnsName The DNS name assigned to this file system. 
     */
    override fun dnsName(dnsName: String) {
      cdkBuilder.dnsName(dnsName)
    }

    /**
     * @param fileSystemId The ID of the file system, assigned by Amazon FSx. 
     */
    override fun fileSystemId(fileSystemId: String) {
      cdkBuilder.fileSystemId(fileSystemId)
    }

    /**
     * @param securityGroup The security group of the file system. 
     */
    override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.fsx.FileSystemAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.fsx.FileSystemAttributes,
  ) : CdkObject(cdkObject), FileSystemAttributes {
    /**
     * The DNS name assigned to this file system.
     */
    override fun dnsName(): String = unwrap(this).getDnsName()

    /**
     * The ID of the file system, assigned by Amazon FSx.
     */
    override fun fileSystemId(): String = unwrap(this).getFileSystemId()

    /**
     * The security group of the file system.
     */
    override fun securityGroup(): ISecurityGroup =
        unwrap(this).getSecurityGroup().let(ISecurityGroup::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FileSystemAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.fsx.FileSystemAttributes):
        FileSystemAttributes = CdkObjectWrappers.wrap(cdkObject) as FileSystemAttributes

    internal fun unwrap(wrapped: FileSystemAttributes):
        software.amazon.awscdk.services.fsx.FileSystemAttributes = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.fsx.FileSystemAttributes
  }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.fsx

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.fsx.FileSystemAttributes

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
@CdkDslMarker
public class FileSystemAttributesDsl {
  private val cdkBuilder: FileSystemAttributes.Builder = FileSystemAttributes.builder()

  /**
   * @param dnsName The DNS name assigned to this file system. 
   */
  public fun dnsName(dnsName: String) {
    cdkBuilder.dnsName(dnsName)
  }

  /**
   * @param fileSystemId The ID of the file system, assigned by Amazon FSx. 
   */
  public fun fileSystemId(fileSystemId: String) {
    cdkBuilder.fileSystemId(fileSystemId)
  }

  /**
   * @param securityGroup The security group of the file system. 
   */
  public fun securityGroup(securityGroup: ISecurityGroup) {
    cdkBuilder.securityGroup(securityGroup)
  }

  public fun build(): FileSystemAttributes = cdkBuilder.build()
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.eks.CfnNodegroup

@CdkDslMarker
public class CfnNodegroupRemoteAccessPropertyDsl {
  private val cdkBuilder: CfnNodegroup.RemoteAccessProperty.Builder =
      CfnNodegroup.RemoteAccessProperty.builder()

  private val _sourceSecurityGroups: MutableList<String> = mutableListOf()

  /**
   * @param ec2SshKey The Amazon EC2 SSH key name that provides access for SSH communication with
   * the nodes in the managed node group. 
   * For more information, see [Amazon EC2 key pairs and Linux
   * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html) in the *Amazon
   * Elastic Compute Cloud User Guide for Linux Instances* . For Windows, an Amazon EC2 SSH key is used
   * to obtain the RDP password. For more information, see [Amazon EC2 key pairs and Windows
   * instances](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-key-pairs.html) in the
   * *Amazon Elastic Compute Cloud User Guide for Windows Instances* .
   */
  public fun ec2SshKey(ec2SshKey: String) {
    cdkBuilder.ec2SshKey(ec2SshKey)
  }

  /**
   * @param sourceSecurityGroups The security group IDs that are allowed SSH access (port 22) to the
   * nodes.
   * For Windows, the port is 3389. If you specify an Amazon EC2 SSH key but don't specify a source
   * security group when you create a managed node group, then the port on the nodes is opened to the
   * internet ( `0.0.0.0/0` ). For more information, see [Security Groups for Your
   * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html) in the *Amazon
   * Virtual Private Cloud User Guide* .
   */
  public fun sourceSecurityGroups(vararg sourceSecurityGroups: String) {
    _sourceSecurityGroups.addAll(listOf(*sourceSecurityGroups))
  }

  /**
   * @param sourceSecurityGroups The security group IDs that are allowed SSH access (port 22) to the
   * nodes.
   * For Windows, the port is 3389. If you specify an Amazon EC2 SSH key but don't specify a source
   * security group when you create a managed node group, then the port on the nodes is opened to the
   * internet ( `0.0.0.0/0` ). For more information, see [Security Groups for Your
   * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html) in the *Amazon
   * Virtual Private Cloud User Guide* .
   */
  public fun sourceSecurityGroups(sourceSecurityGroups: Collection<String>) {
    _sourceSecurityGroups.addAll(sourceSecurityGroups)
  }

  public fun build(): CfnNodegroup.RemoteAccessProperty {
    if(_sourceSecurityGroups.isNotEmpty()) cdkBuilder.sourceSecurityGroups(_sourceSecurityGroups)
    return cdkBuilder.build()
  }
}

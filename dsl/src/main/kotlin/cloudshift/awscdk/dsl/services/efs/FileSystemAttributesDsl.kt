@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.efs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.efs.FileSystemAttributes

@CdkDslMarker
public class FileSystemAttributesDsl {
  private val cdkBuilder: FileSystemAttributes.Builder = FileSystemAttributes.builder()

  /**
   * @param fileSystemArn The File System's Arn.
   */
  public fun fileSystemArn(fileSystemArn: String) {
    cdkBuilder.fileSystemArn(fileSystemArn)
  }

  /**
   * @param fileSystemId The File System's ID.
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

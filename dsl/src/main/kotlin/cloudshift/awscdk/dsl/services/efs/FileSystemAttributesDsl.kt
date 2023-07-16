@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.efs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.efs.FileSystemAttributes

@CdkDslMarker
public class FileSystemAttributesDsl {
  private val cdkBuilder: FileSystemAttributes.Builder = FileSystemAttributes.builder()

  public fun fileSystemArn(fileSystemArn: String) {
    cdkBuilder.fileSystemArn(fileSystemArn)
  }

  public fun fileSystemId(fileSystemId: String) {
    cdkBuilder.fileSystemId(fileSystemId)
  }

  public fun securityGroup(securityGroup: ISecurityGroup) {
    cdkBuilder.securityGroup(securityGroup)
  }

  public fun build(): FileSystemAttributes = cdkBuilder.build()
}

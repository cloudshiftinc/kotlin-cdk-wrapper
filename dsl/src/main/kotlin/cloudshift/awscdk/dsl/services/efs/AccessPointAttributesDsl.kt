@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.efs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.efs.AccessPointAttributes
import software.amazon.awscdk.services.efs.IFileSystem

@CdkDslMarker
public class AccessPointAttributesDsl {
  private val cdkBuilder: AccessPointAttributes.Builder = AccessPointAttributes.builder()

  /**
   * @param accessPointArn The ARN of the AccessPoint One of this, or `accessPointId` is required.
   */
  public fun accessPointArn(accessPointArn: String) {
    cdkBuilder.accessPointArn(accessPointArn)
  }

  /**
   * @param accessPointId The ID of the AccessPoint One of this, or `accessPointArn` is required.
   */
  public fun accessPointId(accessPointId: String) {
    cdkBuilder.accessPointId(accessPointId)
  }

  /**
   * @param fileSystem The EFS file system.
   */
  public fun fileSystem(fileSystem: IFileSystem) {
    cdkBuilder.fileSystem(fileSystem)
  }

  public fun build(): AccessPointAttributes = cdkBuilder.build()
}

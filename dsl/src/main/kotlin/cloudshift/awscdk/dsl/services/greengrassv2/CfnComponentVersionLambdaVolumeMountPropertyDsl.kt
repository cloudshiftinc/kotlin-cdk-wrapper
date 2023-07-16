@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrassv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrassv2.CfnComponentVersion

@CdkDslMarker
public class CfnComponentVersionLambdaVolumeMountPropertyDsl {
  private val cdkBuilder: CfnComponentVersion.LambdaVolumeMountProperty.Builder =
      CfnComponentVersion.LambdaVolumeMountProperty.builder()

  public fun addGroupOwner(addGroupOwner: Boolean) {
    cdkBuilder.addGroupOwner(addGroupOwner)
  }

  public fun addGroupOwner(addGroupOwner: IResolvable) {
    cdkBuilder.addGroupOwner(addGroupOwner)
  }

  public fun destinationPath(destinationPath: String) {
    cdkBuilder.destinationPath(destinationPath)
  }

  public fun permission(permission: String) {
    cdkBuilder.permission(permission)
  }

  public fun sourcePath(sourcePath: String) {
    cdkBuilder.sourcePath(sourcePath)
  }

  public fun build(): CfnComponentVersion.LambdaVolumeMountProperty = cdkBuilder.build()
}

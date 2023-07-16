@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.efs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.efs.CfnAccessPoint

@CdkDslMarker
public class CfnAccessPointRootDirectoryPropertyDsl {
  private val cdkBuilder: CfnAccessPoint.RootDirectoryProperty.Builder =
      CfnAccessPoint.RootDirectoryProperty.builder()

  public fun creationInfo(creationInfo: IResolvable) {
    cdkBuilder.creationInfo(creationInfo)
  }

  public fun creationInfo(creationInfo: CfnAccessPoint.CreationInfoProperty) {
    cdkBuilder.creationInfo(creationInfo)
  }

  public fun path(path: String) {
    cdkBuilder.path(path)
  }

  public fun build(): CfnAccessPoint.RootDirectoryProperty = cdkBuilder.build()
}

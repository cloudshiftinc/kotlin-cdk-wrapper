@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrassv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrassv2.CfnComponentVersion

@CdkDslMarker
public class CfnComponentVersionLambdaDeviceMountPropertyDsl {
  private val cdkBuilder: CfnComponentVersion.LambdaDeviceMountProperty.Builder =
      CfnComponentVersion.LambdaDeviceMountProperty.builder()

  public fun addGroupOwner(addGroupOwner: Boolean) {
    cdkBuilder.addGroupOwner(addGroupOwner)
  }

  public fun addGroupOwner(addGroupOwner: IResolvable) {
    cdkBuilder.addGroupOwner(addGroupOwner)
  }

  public fun path(path: String) {
    cdkBuilder.path(path)
  }

  public fun permission(permission: String) {
    cdkBuilder.permission(permission)
  }

  public fun build(): CfnComponentVersion.LambdaDeviceMountProperty = cdkBuilder.build()
}

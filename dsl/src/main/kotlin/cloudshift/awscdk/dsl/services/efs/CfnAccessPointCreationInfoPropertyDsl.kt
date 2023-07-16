@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.efs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.efs.CfnAccessPoint

@CdkDslMarker
public class CfnAccessPointCreationInfoPropertyDsl {
  private val cdkBuilder: CfnAccessPoint.CreationInfoProperty.Builder =
      CfnAccessPoint.CreationInfoProperty.builder()

  public fun ownerGid(ownerGid: String) {
    cdkBuilder.ownerGid(ownerGid)
  }

  public fun ownerUid(ownerUid: String) {
    cdkBuilder.ownerUid(ownerUid)
  }

  public fun permissions(permissions: String) {
    cdkBuilder.permissions(permissions)
  }

  public fun build(): CfnAccessPoint.CreationInfoProperty = cdkBuilder.build()
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.mediaconnect.CfnFlowSource

@CdkDslMarker
public class CfnFlowSourceEncryptionPropertyDsl {
  private val cdkBuilder: CfnFlowSource.EncryptionProperty.Builder =
      CfnFlowSource.EncryptionProperty.builder()

  public fun algorithm(algorithm: String) {
    cdkBuilder.algorithm(algorithm)
  }

  public fun constantInitializationVector(constantInitializationVector: String) {
    cdkBuilder.constantInitializationVector(constantInitializationVector)
  }

  public fun deviceId(deviceId: String) {
    cdkBuilder.deviceId(deviceId)
  }

  public fun keyType(keyType: String) {
    cdkBuilder.keyType(keyType)
  }

  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  public fun resourceId(resourceId: String) {
    cdkBuilder.resourceId(resourceId)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun secretArn(secretArn: String) {
    cdkBuilder.secretArn(secretArn)
  }

  public fun url(url: String) {
    cdkBuilder.url(url)
  }

  public fun build(): CfnFlowSource.EncryptionProperty = cdkBuilder.build()
}

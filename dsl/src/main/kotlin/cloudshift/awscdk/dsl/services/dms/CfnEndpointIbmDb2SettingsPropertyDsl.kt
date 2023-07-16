@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dms

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dms.CfnEndpoint

@CdkDslMarker
public class CfnEndpointIbmDb2SettingsPropertyDsl {
  private val cdkBuilder: CfnEndpoint.IbmDb2SettingsProperty.Builder =
      CfnEndpoint.IbmDb2SettingsProperty.builder()

  public fun currentLsn(currentLsn: String) {
    cdkBuilder.currentLsn(currentLsn)
  }

  public fun maxKBytesPerRead(maxKBytesPerRead: Number) {
    cdkBuilder.maxKBytesPerRead(maxKBytesPerRead)
  }

  public fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String) {
    cdkBuilder.secretsManagerAccessRoleArn(secretsManagerAccessRoleArn)
  }

  public fun secretsManagerSecretId(secretsManagerSecretId: String) {
    cdkBuilder.secretsManagerSecretId(secretsManagerSecretId)
  }

  public fun setDataCaptureChanges(setDataCaptureChanges: Boolean) {
    cdkBuilder.setDataCaptureChanges(setDataCaptureChanges)
  }

  public fun setDataCaptureChanges(setDataCaptureChanges: IResolvable) {
    cdkBuilder.setDataCaptureChanges(setDataCaptureChanges)
  }

  public fun build(): CfnEndpoint.IbmDb2SettingsProperty = cdkBuilder.build()
}

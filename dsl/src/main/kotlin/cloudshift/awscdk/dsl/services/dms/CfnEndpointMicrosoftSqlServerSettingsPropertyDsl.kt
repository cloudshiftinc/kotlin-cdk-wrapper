@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dms

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dms.CfnEndpoint

@CdkDslMarker
public class CfnEndpointMicrosoftSqlServerSettingsPropertyDsl {
  private val cdkBuilder: CfnEndpoint.MicrosoftSqlServerSettingsProperty.Builder =
      CfnEndpoint.MicrosoftSqlServerSettingsProperty.builder()

  public fun bcpPacketSize(bcpPacketSize: Number) {
    cdkBuilder.bcpPacketSize(bcpPacketSize)
  }

  public fun controlTablesFileGroup(controlTablesFileGroup: String) {
    cdkBuilder.controlTablesFileGroup(controlTablesFileGroup)
  }

  public fun querySingleAlwaysOnNode(querySingleAlwaysOnNode: Boolean) {
    cdkBuilder.querySingleAlwaysOnNode(querySingleAlwaysOnNode)
  }

  public fun querySingleAlwaysOnNode(querySingleAlwaysOnNode: IResolvable) {
    cdkBuilder.querySingleAlwaysOnNode(querySingleAlwaysOnNode)
  }

  public fun readBackupOnly(readBackupOnly: Boolean) {
    cdkBuilder.readBackupOnly(readBackupOnly)
  }

  public fun readBackupOnly(readBackupOnly: IResolvable) {
    cdkBuilder.readBackupOnly(readBackupOnly)
  }

  public fun safeguardPolicy(safeguardPolicy: String) {
    cdkBuilder.safeguardPolicy(safeguardPolicy)
  }

  public fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String) {
    cdkBuilder.secretsManagerAccessRoleArn(secretsManagerAccessRoleArn)
  }

  public fun secretsManagerSecretId(secretsManagerSecretId: String) {
    cdkBuilder.secretsManagerSecretId(secretsManagerSecretId)
  }

  public fun useBcpFullLoad(useBcpFullLoad: Boolean) {
    cdkBuilder.useBcpFullLoad(useBcpFullLoad)
  }

  public fun useBcpFullLoad(useBcpFullLoad: IResolvable) {
    cdkBuilder.useBcpFullLoad(useBcpFullLoad)
  }

  public fun useThirdPartyBackupDevice(useThirdPartyBackupDevice: Boolean) {
    cdkBuilder.useThirdPartyBackupDevice(useThirdPartyBackupDevice)
  }

  public fun useThirdPartyBackupDevice(useThirdPartyBackupDevice: IResolvable) {
    cdkBuilder.useThirdPartyBackupDevice(useThirdPartyBackupDevice)
  }

  public fun build(): CfnEndpoint.MicrosoftSqlServerSettingsProperty = cdkBuilder.build()
}

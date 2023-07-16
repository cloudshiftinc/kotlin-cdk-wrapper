@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dms

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dms.CfnEndpoint

@CdkDslMarker
public class CfnEndpointPostgreSqlSettingsPropertyDsl {
  private val cdkBuilder: CfnEndpoint.PostgreSqlSettingsProperty.Builder =
      CfnEndpoint.PostgreSqlSettingsProperty.builder()

  public fun afterConnectScript(afterConnectScript: String) {
    cdkBuilder.afterConnectScript(afterConnectScript)
  }

  public fun captureDdls(captureDdls: Boolean) {
    cdkBuilder.captureDdls(captureDdls)
  }

  public fun captureDdls(captureDdls: IResolvable) {
    cdkBuilder.captureDdls(captureDdls)
  }

  public fun ddlArtifactsSchema(ddlArtifactsSchema: String) {
    cdkBuilder.ddlArtifactsSchema(ddlArtifactsSchema)
  }

  public fun executeTimeout(executeTimeout: Number) {
    cdkBuilder.executeTimeout(executeTimeout)
  }

  public fun failTasksOnLobTruncation(failTasksOnLobTruncation: Boolean) {
    cdkBuilder.failTasksOnLobTruncation(failTasksOnLobTruncation)
  }

  public fun failTasksOnLobTruncation(failTasksOnLobTruncation: IResolvable) {
    cdkBuilder.failTasksOnLobTruncation(failTasksOnLobTruncation)
  }

  public fun heartbeatEnable(heartbeatEnable: Boolean) {
    cdkBuilder.heartbeatEnable(heartbeatEnable)
  }

  public fun heartbeatEnable(heartbeatEnable: IResolvable) {
    cdkBuilder.heartbeatEnable(heartbeatEnable)
  }

  public fun heartbeatFrequency(heartbeatFrequency: Number) {
    cdkBuilder.heartbeatFrequency(heartbeatFrequency)
  }

  public fun heartbeatSchema(heartbeatSchema: String) {
    cdkBuilder.heartbeatSchema(heartbeatSchema)
  }

  public fun mapBooleanAsBoolean(mapBooleanAsBoolean: Boolean) {
    cdkBuilder.mapBooleanAsBoolean(mapBooleanAsBoolean)
  }

  public fun mapBooleanAsBoolean(mapBooleanAsBoolean: IResolvable) {
    cdkBuilder.mapBooleanAsBoolean(mapBooleanAsBoolean)
  }

  public fun maxFileSize(maxFileSize: Number) {
    cdkBuilder.maxFileSize(maxFileSize)
  }

  public fun pluginName(pluginName: String) {
    cdkBuilder.pluginName(pluginName)
  }

  public fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String) {
    cdkBuilder.secretsManagerAccessRoleArn(secretsManagerAccessRoleArn)
  }

  public fun secretsManagerSecretId(secretsManagerSecretId: String) {
    cdkBuilder.secretsManagerSecretId(secretsManagerSecretId)
  }

  public fun slotName(slotName: String) {
    cdkBuilder.slotName(slotName)
  }

  public fun build(): CfnEndpoint.PostgreSqlSettingsProperty = cdkBuilder.build()
}

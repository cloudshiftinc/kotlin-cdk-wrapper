@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dms

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.dms.CfnEndpoint

@CdkDslMarker
public class CfnEndpointMongoDbSettingsPropertyDsl {
  private val cdkBuilder: CfnEndpoint.MongoDbSettingsProperty.Builder =
      CfnEndpoint.MongoDbSettingsProperty.builder()

  public fun authMechanism(authMechanism: String) {
    cdkBuilder.authMechanism(authMechanism)
  }

  public fun authSource(authSource: String) {
    cdkBuilder.authSource(authSource)
  }

  public fun authType(authType: String) {
    cdkBuilder.authType(authType)
  }

  public fun databaseName(databaseName: String) {
    cdkBuilder.databaseName(databaseName)
  }

  public fun docsToInvestigate(docsToInvestigate: String) {
    cdkBuilder.docsToInvestigate(docsToInvestigate)
  }

  public fun extractDocId(extractDocId: String) {
    cdkBuilder.extractDocId(extractDocId)
  }

  public fun nestingLevel(nestingLevel: String) {
    cdkBuilder.nestingLevel(nestingLevel)
  }

  public fun password(password: String) {
    cdkBuilder.password(password)
  }

  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  public fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String) {
    cdkBuilder.secretsManagerAccessRoleArn(secretsManagerAccessRoleArn)
  }

  public fun secretsManagerSecretId(secretsManagerSecretId: String) {
    cdkBuilder.secretsManagerSecretId(secretsManagerSecretId)
  }

  public fun serverName(serverName: String) {
    cdkBuilder.serverName(serverName)
  }

  public fun username(username: String) {
    cdkBuilder.username(username)
  }

  public fun build(): CfnEndpoint.MongoDbSettingsProperty = cdkBuilder.build()
}

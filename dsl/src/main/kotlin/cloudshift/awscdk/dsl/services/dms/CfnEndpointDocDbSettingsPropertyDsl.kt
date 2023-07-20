@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dms

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dms.CfnEndpoint

@CdkDslMarker
public class CfnEndpointDocDbSettingsPropertyDsl {
  private val cdkBuilder: CfnEndpoint.DocDbSettingsProperty.Builder =
      CfnEndpoint.DocDbSettingsProperty.builder()

  public fun docsToInvestigate(docsToInvestigate: Number) {
    cdkBuilder.docsToInvestigate(docsToInvestigate)
  }

  public fun extractDocId(extractDocId: Boolean) {
    cdkBuilder.extractDocId(extractDocId)
  }

  public fun extractDocId(extractDocId: IResolvable) {
    cdkBuilder.extractDocId(extractDocId)
  }

  public fun nestingLevel(nestingLevel: String) {
    cdkBuilder.nestingLevel(nestingLevel)
  }

  public fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String) {
    cdkBuilder.secretsManagerAccessRoleArn(secretsManagerAccessRoleArn)
  }

  public fun secretsManagerSecretId(secretsManagerSecretId: String) {
    cdkBuilder.secretsManagerSecretId(secretsManagerSecretId)
  }

  public fun build(): CfnEndpoint.DocDbSettingsProperty = cdkBuilder.build()
}

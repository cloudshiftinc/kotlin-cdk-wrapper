@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.secretsmanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachment
import software.constructs.Construct

@CdkDslMarker
public class CfnSecretTargetAttachmentDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnSecretTargetAttachment.Builder =
      CfnSecretTargetAttachment.Builder.create(scope, id)

  public fun secretId(secretId: String) {
    cdkBuilder.secretId(secretId)
  }

  public fun targetId(targetId: String) {
    cdkBuilder.targetId(targetId)
  }

  public fun targetType(targetType: String) {
    cdkBuilder.targetType(targetType)
  }

  public fun build(): CfnSecretTargetAttachment = cdkBuilder.build()
}

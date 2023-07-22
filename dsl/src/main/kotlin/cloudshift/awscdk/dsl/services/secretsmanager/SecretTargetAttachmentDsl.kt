@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.secretsmanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.secretsmanager.ISecret
import software.amazon.awscdk.services.secretsmanager.ISecretAttachmentTarget
import software.amazon.awscdk.services.secretsmanager.SecretTargetAttachment
import software.constructs.Construct

@CdkDslMarker
public class SecretTargetAttachmentDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: SecretTargetAttachment.Builder =
      SecretTargetAttachment.Builder.create(scope, id)

  /**
   * The secret to attach to the target.
   *
   * @param secret The secret to attach to the target. 
   */
  public fun secret(secret: ISecret) {
    cdkBuilder.secret(secret)
  }

  /**
   * The target to attach the secret to.
   *
   * @param target The target to attach the secret to. 
   */
  public fun target(target: ISecretAttachmentTarget) {
    cdkBuilder.target(target)
  }

  public fun build(): SecretTargetAttachment = cdkBuilder.build()
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.secretsmanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.secretsmanager.AttachmentTargetType
import software.amazon.awscdk.services.secretsmanager.SecretAttachmentTargetProps

@CdkDslMarker
public class SecretAttachmentTargetPropsDsl {
  private val cdkBuilder: SecretAttachmentTargetProps.Builder =
      SecretAttachmentTargetProps.builder()

  /**
   * @param targetId The id of the target to attach the secret to. 
   */
  public fun targetId(targetId: String) {
    cdkBuilder.targetId(targetId)
  }

  /**
   * @param targetType The type of the target to attach the secret to. 
   */
  public fun targetType(targetType: AttachmentTargetType) {
    cdkBuilder.targetType(targetType)
  }

  public fun build(): SecretAttachmentTargetProps = cdkBuilder.build()
}

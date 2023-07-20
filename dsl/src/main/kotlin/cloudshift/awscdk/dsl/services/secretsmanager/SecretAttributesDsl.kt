@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.secretsmanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.secretsmanager.SecretAttributes

@CdkDslMarker
public class SecretAttributesDsl {
  private val cdkBuilder: SecretAttributes.Builder = SecretAttributes.builder()

  public fun encryptionKey(encryptionKey: IKey) {
    cdkBuilder.encryptionKey(encryptionKey)
  }

  public fun secretCompleteArn(secretCompleteArn: String) {
    cdkBuilder.secretCompleteArn(secretCompleteArn)
  }

  public fun secretPartialArn(secretPartialArn: String) {
    cdkBuilder.secretPartialArn(secretPartialArn)
  }

  public fun build(): SecretAttributes = cdkBuilder.build()
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.secretsmanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.secretsmanager.SecretAttributes

@CdkDslMarker
public class SecretAttributesDsl {
  private val cdkBuilder: SecretAttributes.Builder = SecretAttributes.builder()

  /**
   * @param encryptionKey The encryption key that is used to encrypt the secret, unless the default
   * SecretsManager key is used.
   */
  public fun encryptionKey(encryptionKey: IKey) {
    cdkBuilder.encryptionKey(encryptionKey)
  }

  /**
   * @param secretCompleteArn The complete ARN of the secret in SecretsManager.
   * This is the ARN including the Secrets Manager 6-character suffix.
   * Cannot be used with `secretArn` or `secretPartialArn`.
   */
  public fun secretCompleteArn(secretCompleteArn: String) {
    cdkBuilder.secretCompleteArn(secretCompleteArn)
  }

  /**
   * @param secretPartialArn The partial ARN of the secret in SecretsManager.
   * This is the ARN without the Secrets Manager 6-character suffix.
   * Cannot be used with `secretArn` or `secretCompleteArn`.
   */
  public fun secretPartialArn(secretPartialArn: String) {
    cdkBuilder.secretPartialArn(secretPartialArn)
  }

  public fun build(): SecretAttributes = cdkBuilder.build()
}

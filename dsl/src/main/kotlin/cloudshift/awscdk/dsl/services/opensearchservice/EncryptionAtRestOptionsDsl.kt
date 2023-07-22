@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opensearchservice

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.opensearchservice.EncryptionAtRestOptions

@CdkDslMarker
public class EncryptionAtRestOptionsDsl {
  private val cdkBuilder: EncryptionAtRestOptions.Builder = EncryptionAtRestOptions.builder()

  /**
   * @param enabled Specify true to enable encryption at rest.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param kmsKey Supply if using KMS key for encryption at rest.
   */
  public fun kmsKey(kmsKey: IKey) {
    cdkBuilder.kmsKey(kmsKey)
  }

  public fun build(): EncryptionAtRestOptions = cdkBuilder.build()
}

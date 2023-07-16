@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticsearch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.elasticsearch.EncryptionAtRestOptions
import software.amazon.awscdk.services.kms.IKey

@CdkDslMarker
public class EncryptionAtRestOptionsDsl {
  private val cdkBuilder: EncryptionAtRestOptions.Builder = EncryptionAtRestOptions.builder()

  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun kmsKey(kmsKey: IKey) {
    cdkBuilder.kmsKey(kmsKey)
  }

  public fun build(): EncryptionAtRestOptions = cdkBuilder.build()
}

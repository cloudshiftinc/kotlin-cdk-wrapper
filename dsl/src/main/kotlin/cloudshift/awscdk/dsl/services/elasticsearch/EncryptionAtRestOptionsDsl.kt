@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticsearch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Deprecated
import software.amazon.awscdk.services.elasticsearch.EncryptionAtRestOptions
import software.amazon.awscdk.services.kms.IKey

@CdkDslMarker
@Deprecated(message = "deprecated in CDK")
public class EncryptionAtRestOptionsDsl {
  private val cdkBuilder: EncryptionAtRestOptions.Builder = EncryptionAtRestOptions.builder()

  @Deprecated(message = "deprecated in CDK")
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  @Deprecated(message = "deprecated in CDK")
  public fun kmsKey(kmsKey: IKey) {
    cdkBuilder.kmsKey(kmsKey)
  }

  public fun build(): EncryptionAtRestOptions = cdkBuilder.build()
}

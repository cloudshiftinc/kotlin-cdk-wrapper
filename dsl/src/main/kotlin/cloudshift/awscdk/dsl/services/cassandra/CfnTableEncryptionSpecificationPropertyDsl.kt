@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cassandra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cassandra.CfnTable

@CdkDslMarker
public class CfnTableEncryptionSpecificationPropertyDsl {
  private val cdkBuilder: CfnTable.EncryptionSpecificationProperty.Builder =
      CfnTable.EncryptionSpecificationProperty.builder()

  public fun encryptionType(encryptionType: String) {
    cdkBuilder.encryptionType(encryptionType)
  }

  public fun kmsKeyIdentifier(kmsKeyIdentifier: String) {
    cdkBuilder.kmsKeyIdentifier(kmsKeyIdentifier)
  }

  public fun build(): CfnTable.EncryptionSpecificationProperty = cdkBuilder.build()
}

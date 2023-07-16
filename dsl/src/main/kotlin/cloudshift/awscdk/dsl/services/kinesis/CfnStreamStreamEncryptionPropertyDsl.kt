@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesis

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesis.CfnStream

@CdkDslMarker
public class CfnStreamStreamEncryptionPropertyDsl {
  private val cdkBuilder: CfnStream.StreamEncryptionProperty.Builder =
      CfnStream.StreamEncryptionProperty.builder()

  public fun encryptionType(encryptionType: String) {
    cdkBuilder.encryptionType(encryptionType)
  }

  public fun keyId(keyId: String) {
    cdkBuilder.keyId(keyId)
  }

  public fun build(): CfnStream.StreamEncryptionProperty = cdkBuilder.build()
}

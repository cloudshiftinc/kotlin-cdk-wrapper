@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kendra.CfnIndex

@CdkDslMarker
public class CfnIndexServerSideEncryptionConfigurationPropertyDsl {
  private val cdkBuilder: CfnIndex.ServerSideEncryptionConfigurationProperty.Builder =
      CfnIndex.ServerSideEncryptionConfigurationProperty.builder()

  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  public fun build(): CfnIndex.ServerSideEncryptionConfigurationProperty = cdkBuilder.build()
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.athena

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.athena.CfnWorkGroup

@CdkDslMarker
public class CfnWorkGroupEncryptionConfigurationPropertyDsl {
  private val cdkBuilder: CfnWorkGroup.EncryptionConfigurationProperty.Builder =
      CfnWorkGroup.EncryptionConfigurationProperty.builder()

  /**
   * @param encryptionOption Indicates whether Amazon S3 server-side encryption with Amazon
   * S3-managed keys ( `SSE_S3` ), server-side encryption with KMS-managed keys ( `SSE_KMS` ), or
   * client-side encryption with KMS-managed keys ( `CSE_KMS` ) is used. 
   * If a query runs in a workgroup and the workgroup overrides client-side settings, then the
   * workgroup's setting for encryption is used. It specifies whether query results must be encrypted,
   * for all queries that run in this workgroup.
   */
  public fun encryptionOption(encryptionOption: String) {
    cdkBuilder.encryptionOption(encryptionOption)
  }

  /**
   * @param kmsKey For `SSE_KMS` and `CSE_KMS` , this is the KMS key ARN or ID.
   */
  public fun kmsKey(kmsKey: String) {
    cdkBuilder.kmsKey(kmsKey)
  }

  public fun build(): CfnWorkGroup.EncryptionConfigurationProperty = cdkBuilder.build()
}

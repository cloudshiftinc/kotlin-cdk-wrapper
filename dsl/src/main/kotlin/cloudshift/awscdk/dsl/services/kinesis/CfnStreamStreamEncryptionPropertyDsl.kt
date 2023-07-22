@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesis

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesis.CfnStream

@CdkDslMarker
public class CfnStreamStreamEncryptionPropertyDsl {
  private val cdkBuilder: CfnStream.StreamEncryptionProperty.Builder =
      CfnStream.StreamEncryptionProperty.builder()

  /**
   * @param encryptionType The encryption type to use. 
   * The only valid value is `KMS` .
   */
  public fun encryptionType(encryptionType: String) {
    cdkBuilder.encryptionType(encryptionType)
  }

  /**
   * @param keyId The GUID for the customer-managed AWS KMS key to use for encryption. 
   * This value can be a globally unique identifier, a fully specified Amazon Resource Name (ARN) to
   * either an alias or a key, or an alias name prefixed by "alias/".You can also use a master key
   * owned by Kinesis Data Streams by specifying the alias `aws/kinesis` .
   *
   * * Key ARN example:
   * `arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012`
   * * Alias ARN example: `arn:aws:kms:us-east-1:123456789012:alias/MyAliasName`
   * * Globally unique key ID example: `12345678-1234-1234-1234-123456789012`
   * * Alias name example: `alias/MyAliasName`
   * * Master key owned by Kinesis Data Streams: `alias/aws/kinesis`
   */
  public fun keyId(keyId: String) {
    cdkBuilder.keyId(keyId)
  }

  public fun build(): CfnStream.StreamEncryptionProperty = cdkBuilder.build()
}

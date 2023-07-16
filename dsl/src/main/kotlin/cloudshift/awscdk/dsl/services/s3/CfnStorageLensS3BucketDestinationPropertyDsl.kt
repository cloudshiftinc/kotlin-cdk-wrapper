@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnStorageLens

@CdkDslMarker
public class CfnStorageLensS3BucketDestinationPropertyDsl {
  private val cdkBuilder: CfnStorageLens.S3BucketDestinationProperty.Builder =
      CfnStorageLens.S3BucketDestinationProperty.builder()

  public fun accountId(accountId: String) {
    cdkBuilder.accountId(accountId)
  }

  public fun arn(arn: String) {
    cdkBuilder.arn(arn)
  }

  public fun encryption(encryption: IResolvable) {
    cdkBuilder.encryption(encryption)
  }

  public fun encryption(encryption: CfnStorageLens.EncryptionProperty) {
    cdkBuilder.encryption(encryption)
  }

  public fun format(format: String) {
    cdkBuilder.format(format)
  }

  public fun outputSchemaVersion(outputSchemaVersion: String) {
    cdkBuilder.outputSchemaVersion(outputSchemaVersion)
  }

  public fun prefix(prefix: String) {
    cdkBuilder.prefix(prefix)
  }

  public fun build(): CfnStorageLens.S3BucketDestinationProperty = cdkBuilder.build()
}

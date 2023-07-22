@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnStorageLens

@CdkDslMarker
public class CfnStorageLensEncryptionPropertyDsl {
  private val cdkBuilder: CfnStorageLens.EncryptionProperty.Builder =
      CfnStorageLens.EncryptionProperty.builder()

  /**
   * @param ssekms Specifies the use of AWS Key Management Service keys (SSE-KMS) to encrypt the S3
   * Storage Lens metrics export file.
   */
  public fun ssekms(ssekms: IResolvable) {
    cdkBuilder.ssekms(ssekms)
  }

  /**
   * @param ssekms Specifies the use of AWS Key Management Service keys (SSE-KMS) to encrypt the S3
   * Storage Lens metrics export file.
   */
  public fun ssekms(ssekms: CfnStorageLens.SSEKMSProperty) {
    cdkBuilder.ssekms(ssekms)
  }

  /**
   * @param sses3 Specifies the use of an Amazon S3-managed key (SSE-S3) to encrypt the S3 Storage
   * Lens metrics export file.
   */
  public fun sses3(sses3: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(sses3)
    cdkBuilder.sses3(builder.map)
  }

  /**
   * @param sses3 Specifies the use of an Amazon S3-managed key (SSE-S3) to encrypt the S3 Storage
   * Lens metrics export file.
   */
  public fun sses3(sses3: Any) {
    cdkBuilder.sses3(sses3)
  }

  public fun build(): CfnStorageLens.EncryptionProperty = cdkBuilder.build()
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.secretsmanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.secretsmanager.ReplicaRegion

/**
 * Secret replica region.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kms.*;
 * import software.amazon.awscdk.services.secretsmanager.*;
 * Key key;
 * ReplicaRegion replicaRegion = ReplicaRegion.builder()
 * .region("region")
 * // the properties below are optional
 * .encryptionKey(key)
 * .build();
 * ```
 */
@CdkDslMarker
public class ReplicaRegionDsl {
  private val cdkBuilder: ReplicaRegion.Builder = ReplicaRegion.builder()

  /**
   * @param encryptionKey The customer-managed encryption key to use for encrypting the secret
   * value.
   */
  public fun encryptionKey(encryptionKey: IKey) {
    cdkBuilder.encryptionKey(encryptionKey)
  }

  /**
   * @param region The name of the region. 
   */
  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  public fun build(): ReplicaRegion = cdkBuilder.build()
}

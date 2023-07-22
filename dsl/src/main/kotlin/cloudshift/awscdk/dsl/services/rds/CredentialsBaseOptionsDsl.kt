@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.secretsmanager.ReplicaRegionDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.rds.CredentialsBaseOptions
import software.amazon.awscdk.services.secretsmanager.ReplicaRegion

@CdkDslMarker
public class CredentialsBaseOptionsDsl {
  private val cdkBuilder: CredentialsBaseOptions.Builder = CredentialsBaseOptions.builder()

  private val _replicaRegions: MutableList<ReplicaRegion> = mutableListOf()

  /**
   * @param encryptionKey KMS encryption key to encrypt the generated secret.
   */
  public fun encryptionKey(encryptionKey: IKey) {
    cdkBuilder.encryptionKey(encryptionKey)
  }

  /**
   * @param excludeCharacters The characters to exclude from the generated password.
   * Has no effect if `password` has been provided.
   */
  public fun excludeCharacters(excludeCharacters: String) {
    cdkBuilder.excludeCharacters(excludeCharacters)
  }

  /**
   * @param replicaRegions A list of regions where to replicate this secret.
   */
  public fun replicaRegions(replicaRegions: ReplicaRegionDsl.() -> Unit) {
    _replicaRegions.add(ReplicaRegionDsl().apply(replicaRegions).build())
  }

  /**
   * @param replicaRegions A list of regions where to replicate this secret.
   */
  public fun replicaRegions(replicaRegions: Collection<ReplicaRegion>) {
    _replicaRegions.addAll(replicaRegions)
  }

  /**
   * @param secretName The name of the secret.
   */
  public fun secretName(secretName: String) {
    cdkBuilder.secretName(secretName)
  }

  public fun build(): CredentialsBaseOptions {
    if(_replicaRegions.isNotEmpty()) cdkBuilder.replicaRegions(_replicaRegions)
    return cdkBuilder.build()
  }
}

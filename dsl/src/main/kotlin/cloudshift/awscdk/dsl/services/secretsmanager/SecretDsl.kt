@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.secretsmanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.SecretValue
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.secretsmanager.ReplicaRegion
import software.amazon.awscdk.services.secretsmanager.Secret
import software.amazon.awscdk.services.secretsmanager.SecretStringGenerator
import software.amazon.awscdk.services.secretsmanager.SecretStringValueBeta1
import software.constructs.Construct

@CdkDslMarker
public class SecretDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: Secret.Builder = Secret.Builder.create(scope, id)

  private val _replicaRegions: MutableList<ReplicaRegion> = mutableListOf()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun encryptionKey(encryptionKey: IKey) {
    cdkBuilder.encryptionKey(encryptionKey)
  }

  public fun generateSecretString(block: SecretStringGeneratorDsl.() -> Unit = {}) {
    val builder = SecretStringGeneratorDsl()
    builder.apply(block)
    cdkBuilder.generateSecretString(builder.build())
  }

  public fun generateSecretString(generateSecretString: SecretStringGenerator) {
    cdkBuilder.generateSecretString(generateSecretString)
  }

  public fun removalPolicy(removalPolicy: RemovalPolicy) {
    cdkBuilder.removalPolicy(removalPolicy)
  }

  public fun replicaRegions(replicaRegions: ReplicaRegionDsl.() -> Unit) {
    _replicaRegions.add(ReplicaRegionDsl().apply(replicaRegions).build())
  }

  public fun replicaRegions(replicaRegions: Collection<ReplicaRegion>) {
    _replicaRegions.addAll(replicaRegions)
  }

  public fun secretName(secretName: String) {
    cdkBuilder.secretName(secretName)
  }

  public fun secretObjectValue(secretObjectValue: Map<String, SecretValue>) {
    cdkBuilder.secretObjectValue(secretObjectValue)
  }

  public fun secretStringBeta1(secretStringBeta1: SecretStringValueBeta1) {
    cdkBuilder.secretStringBeta1(secretStringBeta1)
  }

  public fun secretStringValue(secretStringValue: SecretValue) {
    cdkBuilder.secretStringValue(secretStringValue)
  }

  public fun build(): Secret {
    if(_replicaRegions.isNotEmpty()) cdkBuilder.replicaRegions(_replicaRegions)
    return cdkBuilder.build()
  }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.secretsmanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.SecretValue
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.secretsmanager.ReplicaRegion
import software.amazon.awscdk.services.secretsmanager.SecretProps
import software.amazon.awscdk.services.secretsmanager.SecretStringGenerator
import software.amazon.awscdk.services.secretsmanager.SecretStringValueBeta1

@CdkDslMarker
public class SecretPropsDsl {
  private val cdkBuilder: SecretProps.Builder = SecretProps.builder()

  private val _replicaRegions: MutableList<ReplicaRegion> = mutableListOf()

  /**
   * @param description An optional, human-friendly description of the secret.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param encryptionKey The customer-managed encryption key to use for encrypting the secret
   * value.
   */
  public fun encryptionKey(encryptionKey: IKey) {
    cdkBuilder.encryptionKey(encryptionKey)
  }

  /**
   * @param generateSecretString Configuration for how to generate a secret value.
   * Only one of `secretString` and `generateSecretString` can be provided.
   */
  public fun generateSecretString(generateSecretString: SecretStringGeneratorDsl.() -> Unit = {}) {
    val builder = SecretStringGeneratorDsl()
    builder.apply(generateSecretString)
    cdkBuilder.generateSecretString(builder.build())
  }

  /**
   * @param generateSecretString Configuration for how to generate a secret value.
   * Only one of `secretString` and `generateSecretString` can be provided.
   */
  public fun generateSecretString(generateSecretString: SecretStringGenerator) {
    cdkBuilder.generateSecretString(generateSecretString)
  }

  /**
   * @param removalPolicy Policy to apply when the secret is removed from this stack.
   */
  public fun removalPolicy(removalPolicy: RemovalPolicy) {
    cdkBuilder.removalPolicy(removalPolicy)
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
   * @param secretName A name for the secret.
   * Note that deleting secrets from SecretsManager does not happen immediately, but after a 7 to
   * 30 days blackout period. During that period, it is not possible to create another secret that
   * shares the same name.
   */
  public fun secretName(secretName: String) {
    cdkBuilder.secretName(secretName)
  }

  /**
   * @param secretObjectValue Initial value for a JSON secret.
   * **NOTE:** *It is **highly** encouraged to leave this field undefined and allow SecretsManager
   * to create the secret value.
   * The secret object -- if provided -- will be included in the output of the cdk as part of
   * synthesis,
   * and will appear in the CloudFormation template in the console. This can be secure(-ish) if that
   * value is merely reference to
   * another resource (or one of its attributes), but if the value is a plaintext string, it will be
   * visible to anyone with access
   * to the CloudFormation template (via the AWS Console, SDKs, or CLI).
   *
   * Specifies a JSON object that you want to encrypt and store in this new version of the secret.
   * To specify a simple string value instead, use `SecretProps.secretStringValue`
   *
   * Only one of `secretStringBeta1`, `secretStringValue`, 'secretObjectValue', and
   * `generateSecretString` can be provided.
   */
  public fun secretObjectValue(secretObjectValue: Map<String, SecretValue>) {
    cdkBuilder.secretObjectValue(secretObjectValue)
  }

  /**
   * @param secretStringBeta1 Initial value for the secret.
   * **NOTE:** *It is **highly** encouraged to leave this field undefined and allow SecretsManager
   * to create the secret value.
   * The secret string -- if provided -- will be included in the output of the cdk as part of
   * synthesis,
   * and will appear in the CloudFormation template in the console. This can be secure(-ish) if that
   * value is merely reference to
   * another resource (or one of its attributes), but if the value is a plaintext string, it will be
   * visible to anyone with access
   * to the CloudFormation template (via the AWS Console, SDKs, or CLI).
   *
   * Specifies text data that you want to encrypt and store in this new version of the secret.
   * May be a simple string value, or a string representation of a JSON structure.
   *
   * Only one of `secretStringBeta1`, `secretStringValue`, and `generateSecretString` can be
   * provided.
   * @deprecated Use `secretStringValue` instead.
   */
  @Deprecated(message = "deprecated in CDK")
  public fun secretStringBeta1(secretStringBeta1: SecretStringValueBeta1) {
    cdkBuilder.secretStringBeta1(secretStringBeta1)
  }

  /**
   * @param secretStringValue Initial value for the secret.
   * **NOTE:** *It is **highly** encouraged to leave this field undefined and allow SecretsManager
   * to create the secret value.
   * The secret string -- if provided -- will be included in the output of the cdk as part of
   * synthesis,
   * and will appear in the CloudFormation template in the console. This can be secure(-ish) if that
   * value is merely reference to
   * another resource (or one of its attributes), but if the value is a plaintext string, it will be
   * visible to anyone with access
   * to the CloudFormation template (via the AWS Console, SDKs, or CLI).
   *
   * Specifies text data that you want to encrypt and store in this new version of the secret.
   * May be a simple string value. To provide a string representation of JSON structure, use
   * `SecretProps.secretObjectValue` instead.
   *
   * Only one of `secretStringBeta1`, `secretStringValue`, 'secretObjectValue', and
   * `generateSecretString` can be provided.
   */
  public fun secretStringValue(secretStringValue: SecretValue) {
    cdkBuilder.secretStringValue(secretStringValue)
  }

  public fun build(): SecretProps {
    if(_replicaRegions.isNotEmpty()) cdkBuilder.replicaRegions(_replicaRegions)
    return cdkBuilder.build()
  }
}

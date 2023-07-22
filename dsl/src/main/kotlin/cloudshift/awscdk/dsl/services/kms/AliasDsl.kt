@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kms

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.kms.Alias
import software.amazon.awscdk.services.kms.IKey
import software.constructs.Construct

/**
 * Defines a display name for a customer master key (CMK) in AWS Key Management Service (AWS KMS).
 *
 * Using an alias to refer to a key can help you simplify key
 * management. For example, when rotating keys, you can just update the alias
 * mapping instead of tracking and changing key IDs. For more information, see
 * Working with Aliases in the AWS Key Management Service Developer Guide.
 *
 * You can also add an alias for a key by calling `key.addAlias(alias)`.
 *
 * Example:
 *
 * ```
 * // Passing an encrypted replication bucket created in a different stack.
 * App app = new App();
 * Stack replicationStack = Stack.Builder.create(app, "ReplicationStack")
 * .env(Environment.builder()
 * .region("us-west-1")
 * .build())
 * .build();
 * Key key = new Key(replicationStack, "ReplicationKey");
 * Alias alias = Alias.Builder.create(replicationStack, "ReplicationAlias")
 * // aliasName is required
 * .aliasName(PhysicalName.GENERATE_IF_NEEDED)
 * .targetKey(key)
 * .build();
 * Bucket replicationBucket = Bucket.Builder.create(replicationStack, "ReplicationBucket")
 * .bucketName(PhysicalName.GENERATE_IF_NEEDED)
 * .encryptionKey(alias)
 * .build();
 * ```
 */
@CdkDslMarker
public class AliasDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: Alias.Builder = Alias.Builder.create(scope, id)

  /**
   * The name of the alias.
   *
   * The name must start with alias followed by a
   * forward slash, such as alias/. You can't specify aliases that begin with
   * alias/AWS. These aliases are reserved.
   *
   * @param aliasName The name of the alias. 
   */
  public fun aliasName(aliasName: String) {
    cdkBuilder.aliasName(aliasName)
  }

  /**
   * Policy to apply when the alias is removed from this stack.
   *
   * Default: - The alias will be deleted
   *
   * @param removalPolicy Policy to apply when the alias is removed from this stack. 
   */
  public fun removalPolicy(removalPolicy: RemovalPolicy) {
    cdkBuilder.removalPolicy(removalPolicy)
  }

  /**
   * The ID of the key for which you are creating the alias.
   *
   * Specify the key's
   * globally unique identifier or Amazon Resource Name (ARN). You can't
   * specify another alias.
   *
   * @param targetKey The ID of the key for which you are creating the alias. 
   */
  public fun targetKey(targetKey: IKey) {
    cdkBuilder.targetKey(targetKey)
  }

  public fun build(): Alias = cdkBuilder.build()
}

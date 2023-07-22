@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kms

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.kms.AliasProps
import software.amazon.awscdk.services.kms.IKey

/**
 * Construction properties for a KMS Key Alias object.
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
public class AliasPropsDsl {
  private val cdkBuilder: AliasProps.Builder = AliasProps.builder()

  /**
   * @param aliasName The name of the alias. 
   * The name must start with alias followed by a
   * forward slash, such as alias/. You can't specify aliases that begin with
   * alias/AWS. These aliases are reserved.
   */
  public fun aliasName(aliasName: String) {
    cdkBuilder.aliasName(aliasName)
  }

  /**
   * @param removalPolicy Policy to apply when the alias is removed from this stack.
   */
  public fun removalPolicy(removalPolicy: RemovalPolicy) {
    cdkBuilder.removalPolicy(removalPolicy)
  }

  /**
   * @param targetKey The ID of the key for which you are creating the alias. 
   * Specify the key's
   * globally unique identifier or Amazon Resource Name (ARN). You can't
   * specify another alias.
   */
  public fun targetKey(targetKey: IKey) {
    cdkBuilder.targetKey(targetKey)
  }

  public fun build(): AliasProps = cdkBuilder.build()
}

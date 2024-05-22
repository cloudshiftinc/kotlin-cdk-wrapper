@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.String
import kotlin.collections.Map

/**
 * Represents server-side encryption for a DynamoDB table.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.kms.*;
 * App app = new App();
 * Stack stack = Stack.Builder.create(app,
 * "Stack").env(Environment.builder().region("us-west-2").build()).build();
 * Key tableKey = new Key(stack, "Key");
 * Map&lt;String, String&gt; replicaKeyArns = Map.of(
 * "us-east-1", "arn:aws:kms:us-east-1:123456789012:key/g24efbna-az9b-42ro-m3bp-cq249l94fca6",
 * "us-east-2", "arn:aws:kms:us-east-2:123456789012:key/h90bkasj-bs1j-92wp-s2ka-bh857d60bkj8");
 * TableV2 globalTable = TableV2.Builder.create(stack, "GlobalTable")
 * .partitionKey(Attribute.builder().name("pk").type(AttributeType.STRING).build())
 * .encryption(TableEncryptionV2.customerManagedKey(tableKey, replicaKeyArns))
 * .replicas(List.of(ReplicaTableProps.builder().region("us-east-1").build(),
 * ReplicaTableProps.builder().region("us-east-2").build()))
 * .build();
 * ```
 */
public abstract class TableEncryptionV2(
  cdkObject: software.amazon.awscdk.services.dynamodb.TableEncryptionV2,
) : CdkObject(cdkObject) {
  /**
   *
   */
  public open fun replicaKeyArns(): Map<String, String> = unwrap(this).getReplicaKeyArns() ?:
      emptyMap()

  /**
   *
   */
  public open fun tableKey(): IKey? = unwrap(this).getTableKey()?.let(IKey::wrap)

  /**
   *
   */
  public open fun type(): TableEncryption = unwrap(this).getType().let(TableEncryption::wrap)

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.dynamodb.TableEncryptionV2,
  ) : TableEncryptionV2(cdkObject)

  public companion object {
    public fun awsManagedKey(): TableEncryptionV2 =
        software.amazon.awscdk.services.dynamodb.TableEncryptionV2.awsManagedKey().let(TableEncryptionV2::wrap)

    public fun customerManagedKey(tableKey: IKey): TableEncryptionV2 =
        software.amazon.awscdk.services.dynamodb.TableEncryptionV2.customerManagedKey(tableKey.let(IKey.Companion::unwrap)).let(TableEncryptionV2::wrap)

    public fun customerManagedKey(tableKey: IKey, replicaKeyArns: Map<String, String>):
        TableEncryptionV2 =
        software.amazon.awscdk.services.dynamodb.TableEncryptionV2.customerManagedKey(tableKey.let(IKey.Companion::unwrap),
        replicaKeyArns).let(TableEncryptionV2::wrap)

    public fun dynamoOwnedKey(): TableEncryptionV2 =
        software.amazon.awscdk.services.dynamodb.TableEncryptionV2.dynamoOwnedKey().let(TableEncryptionV2::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.TableEncryptionV2):
        TableEncryptionV2 = CdkObjectWrappers.wrap(cdkObject) as? TableEncryptionV2 ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: TableEncryptionV2):
        software.amazon.awscdk.services.dynamodb.TableEncryptionV2 = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.dynamodb.TableEncryptionV2
  }
}

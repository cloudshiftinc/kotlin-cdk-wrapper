package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.String
import kotlin.collections.Map

public abstract class TableEncryptionV2 internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.dynamodb.TableEncryptionV2,
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
    override val cdkObject: software.amazon.awscdk.services.dynamodb.TableEncryptionV2,
  ) : TableEncryptionV2(cdkObject)

  public companion object {
    public fun awsManagedKey(): TableEncryptionV2 =
        software.amazon.awscdk.services.dynamodb.TableEncryptionV2.awsManagedKey().let(TableEncryptionV2::wrap)

    public fun customerManagedKey(tableKey: IKey): TableEncryptionV2 =
        software.amazon.awscdk.services.dynamodb.TableEncryptionV2.customerManagedKey(tableKey.let(IKey::unwrap)).let(TableEncryptionV2::wrap)

    public fun customerManagedKey(tableKey: IKey, replicaKeyArns: Map<String, String>):
        TableEncryptionV2 =
        software.amazon.awscdk.services.dynamodb.TableEncryptionV2.customerManagedKey(tableKey.let(IKey::unwrap),
        replicaKeyArns).let(TableEncryptionV2::wrap)

    public fun dynamoOwnedKey(): TableEncryptionV2 =
        software.amazon.awscdk.services.dynamodb.TableEncryptionV2.dynamoOwnedKey().let(TableEncryptionV2::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.TableEncryptionV2):
        TableEncryptionV2 = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TableEncryptionV2):
        software.amazon.awscdk.services.dynamodb.TableEncryptionV2 = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.dynamodb.TableEncryptionV2
  }
}

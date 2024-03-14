package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface TableAttributesV2 {
  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  public fun globalIndexes(): List<String> = unwrap(this).getGlobalIndexes() ?: emptyList()

  public fun grantIndexPermissions(): Boolean? = unwrap(this).getGrantIndexPermissions()

  public fun localIndexes(): List<String> = unwrap(this).getLocalIndexes() ?: emptyList()

  public fun tableArn(): String? = unwrap(this).getTableArn()

  public fun tableId(): String? = unwrap(this).getTableId()

  public fun tableName(): String? = unwrap(this).getTableName()

  public fun tableStreamArn(): String? = unwrap(this).getTableStreamArn()

  public interface Builder {
    public fun encryptionKey(encryptionKey: IKey)

    public fun globalIndexes(globalIndexes: List<String>)

    public fun grantIndexPermissions(grantIndexPermissions: Boolean)

    public fun localIndexes(localIndexes: List<String>)

    public fun tableArn(tableArn: String)

    public fun tableId(tableId: String)

    public fun tableName(tableName: String)

    public fun tableStreamArn(tableStreamArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dynamodb.TableAttributesV2.Builder =
        software.amazon.awscdk.services.dynamodb.TableAttributesV2.builder()

    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
    }

    override fun globalIndexes(globalIndexes: List<String>) {
      cdkBuilder.globalIndexes(globalIndexes)
    }

    override fun grantIndexPermissions(grantIndexPermissions: Boolean) {
      cdkBuilder.grantIndexPermissions(grantIndexPermissions)
    }

    override fun localIndexes(localIndexes: List<String>) {
      cdkBuilder.localIndexes(localIndexes)
    }

    override fun tableArn(tableArn: String) {
      cdkBuilder.tableArn(tableArn)
    }

    override fun tableId(tableId: String) {
      cdkBuilder.tableId(tableId)
    }

    override fun tableName(tableName: String) {
      cdkBuilder.tableName(tableName)
    }

    override fun tableStreamArn(tableStreamArn: String) {
      cdkBuilder.tableStreamArn(tableStreamArn)
    }

    public fun build(): software.amazon.awscdk.services.dynamodb.TableAttributesV2 =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.dynamodb.TableAttributesV2,
  ) : TableAttributesV2 {
    override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    override fun globalIndexes(): List<String> = unwrap(this).getGlobalIndexes() ?: emptyList()

    override fun grantIndexPermissions(): Boolean? = unwrap(this).getGrantIndexPermissions()

    override fun localIndexes(): List<String> = unwrap(this).getLocalIndexes() ?: emptyList()

    override fun tableArn(): String? = unwrap(this).getTableArn()

    override fun tableId(): String? = unwrap(this).getTableId()

    override fun tableName(): String? = unwrap(this).getTableName()

    override fun tableStreamArn(): String? = unwrap(this).getTableStreamArn()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): TableAttributesV2 {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.TableAttributesV2):
        TableAttributesV2 = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TableAttributesV2):
        software.amazon.awscdk.services.dynamodb.TableAttributesV2 = (wrapped as Wrapper).cdkObject
  }
}

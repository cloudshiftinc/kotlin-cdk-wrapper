package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface TableAttributes {
  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  public fun globalIndexes(): List<String> = unwrap(this).getGlobalIndexes() ?: emptyList()

  public fun grantIndexPermissions(): Boolean? = unwrap(this).getGrantIndexPermissions()

  public fun localIndexes(): List<String> = unwrap(this).getLocalIndexes() ?: emptyList()

  public fun tableArn(): String? = unwrap(this).getTableArn()

  public fun tableName(): String? = unwrap(this).getTableName()

  public fun tableStreamArn(): String? = unwrap(this).getTableStreamArn()

  public interface Builder {
    public fun encryptionKey(encryptionKey: IKey) {
    }

    public fun globalIndexes(globalIndexes: List<String>) {
    }

    public fun grantIndexPermissions(grantIndexPermissions: Boolean) {
    }

    public fun localIndexes(localIndexes: List<String>) {
    }

    public fun tableArn(tableArn: String) {
    }

    public fun tableName(tableName: String) {
    }

    public fun tableStreamArn(tableStreamArn: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dynamodb.TableAttributes.Builder =
        software.amazon.awscdk.services.dynamodb.TableAttributes.builder()

    public override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
    }

    public override fun globalIndexes(globalIndexes: List<String>) {
      cdkBuilder.globalIndexes(globalIndexes)
    }

    public override fun grantIndexPermissions(grantIndexPermissions: Boolean) {
      cdkBuilder.grantIndexPermissions(grantIndexPermissions)
    }

    public override fun localIndexes(localIndexes: List<String>) {
      cdkBuilder.localIndexes(localIndexes)
    }

    public override fun tableArn(tableArn: String) {
      cdkBuilder.tableArn(tableArn)
    }

    public override fun tableName(tableName: String) {
      cdkBuilder.tableName(tableName)
    }

    public override fun tableStreamArn(tableStreamArn: String) {
      cdkBuilder.tableStreamArn(tableStreamArn)
    }

    public fun build(): software.amazon.awscdk.services.dynamodb.TableAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.dynamodb.TableAttributes,
  ) : TableAttributes {
    public override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    public override fun globalIndexes(): List<String> = unwrap(this).getGlobalIndexes() ?:
        emptyList()

    public override fun grantIndexPermissions(): Boolean? = unwrap(this).getGrantIndexPermissions()

    public override fun localIndexes(): List<String> = unwrap(this).getLocalIndexes() ?: emptyList()

    public override fun tableArn(): String? = unwrap(this).getTableArn()

    public override fun tableName(): String? = unwrap(this).getTableName()

    public override fun tableStreamArn(): String? = unwrap(this).getTableStreamArn()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): TableAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.TableAttributes):
        TableAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TableAttributes):
        software.amazon.awscdk.services.dynamodb.TableAttributes = (wrapped as Wrapper).cdkObject
  }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Reference to a dynamodb table.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.dynamodb.*;
 * import io.cloudshiftdev.awscdk.services.kms.*;
 * Key key;
 * TableAttributes tableAttributes = TableAttributes.builder()
 * .encryptionKey(key)
 * .globalIndexes(List.of("globalIndexes"))
 * .grantIndexPermissions(false)
 * .localIndexes(List.of("localIndexes"))
 * .tableArn("tableArn")
 * .tableName("tableName")
 * .tableStreamArn("tableStreamArn")
 * .build();
 * ```
 */
public interface TableAttributes {
  /**
   * KMS encryption key, if this table uses a customer-managed encryption key.
   *
   * Default: - no key
   */
  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  /**
   * The name of the global indexes set for this Table.
   *
   * Note that you need to set either this property,
   * or `localIndexes`,
   * if you want methods like grantReadData()
   * to grant permissions for indexes as well as the table itself.
   *
   * Default: - no global indexes
   */
  public fun globalIndexes(): List<String> = unwrap(this).getGlobalIndexes() ?: emptyList()

  /**
   * If set to true, grant methods always grant permissions for all indexes.
   *
   * If false is provided, grant methods grant the permissions
   * only when `globalIndexes` or `localIndexes` is specified.
   *
   * Default: - false
   */
  public fun grantIndexPermissions(): Boolean? = unwrap(this).getGrantIndexPermissions()

  /**
   * The name of the local indexes set for this Table.
   *
   * Note that you need to set either this property,
   * or `globalIndexes`,
   * if you want methods like grantReadData()
   * to grant permissions for indexes as well as the table itself.
   *
   * Default: - no local indexes
   */
  public fun localIndexes(): List<String> = unwrap(this).getLocalIndexes() ?: emptyList()

  /**
   * The ARN of the dynamodb table.
   *
   * One of this, or `tableName`, is required.
   *
   * Default: - no table arn
   */
  public fun tableArn(): String? = unwrap(this).getTableArn()

  /**
   * The table name of the dynamodb table.
   *
   * One of this, or `tableArn`, is required.
   *
   * Default: - no table name
   */
  public fun tableName(): String? = unwrap(this).getTableName()

  /**
   * The ARN of the table's stream.
   *
   * Default: - no table stream
   */
  public fun tableStreamArn(): String? = unwrap(this).getTableStreamArn()

  /**
   * A builder for [TableAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param encryptionKey KMS encryption key, if this table uses a customer-managed encryption
     * key.
     */
    public fun encryptionKey(encryptionKey: IKey)

    /**
     * @param globalIndexes The name of the global indexes set for this Table.
     * Note that you need to set either this property,
     * or `localIndexes`,
     * if you want methods like grantReadData()
     * to grant permissions for indexes as well as the table itself.
     */
    public fun globalIndexes(globalIndexes: List<String>)

    /**
     * @param globalIndexes The name of the global indexes set for this Table.
     * Note that you need to set either this property,
     * or `localIndexes`,
     * if you want methods like grantReadData()
     * to grant permissions for indexes as well as the table itself.
     */
    public fun globalIndexes(vararg globalIndexes: String)

    /**
     * @param grantIndexPermissions If set to true, grant methods always grant permissions for all
     * indexes.
     * If false is provided, grant methods grant the permissions
     * only when `globalIndexes` or `localIndexes` is specified.
     */
    public fun grantIndexPermissions(grantIndexPermissions: Boolean)

    /**
     * @param localIndexes The name of the local indexes set for this Table.
     * Note that you need to set either this property,
     * or `globalIndexes`,
     * if you want methods like grantReadData()
     * to grant permissions for indexes as well as the table itself.
     */
    public fun localIndexes(localIndexes: List<String>)

    /**
     * @param localIndexes The name of the local indexes set for this Table.
     * Note that you need to set either this property,
     * or `globalIndexes`,
     * if you want methods like grantReadData()
     * to grant permissions for indexes as well as the table itself.
     */
    public fun localIndexes(vararg localIndexes: String)

    /**
     * @param tableArn The ARN of the dynamodb table.
     * One of this, or `tableName`, is required.
     */
    public fun tableArn(tableArn: String)

    /**
     * @param tableName The table name of the dynamodb table.
     * One of this, or `tableArn`, is required.
     */
    public fun tableName(tableName: String)

    /**
     * @param tableStreamArn The ARN of the table's stream.
     */
    public fun tableStreamArn(tableStreamArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dynamodb.TableAttributes.Builder =
        software.amazon.awscdk.services.dynamodb.TableAttributes.builder()

    /**
     * @param encryptionKey KMS encryption key, if this table uses a customer-managed encryption
     * key.
     */
    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
    }

    /**
     * @param globalIndexes The name of the global indexes set for this Table.
     * Note that you need to set either this property,
     * or `localIndexes`,
     * if you want methods like grantReadData()
     * to grant permissions for indexes as well as the table itself.
     */
    override fun globalIndexes(globalIndexes: List<String>) {
      cdkBuilder.globalIndexes(globalIndexes)
    }

    /**
     * @param globalIndexes The name of the global indexes set for this Table.
     * Note that you need to set either this property,
     * or `localIndexes`,
     * if you want methods like grantReadData()
     * to grant permissions for indexes as well as the table itself.
     */
    override fun globalIndexes(vararg globalIndexes: String): Unit =
        globalIndexes(globalIndexes.toList())

    /**
     * @param grantIndexPermissions If set to true, grant methods always grant permissions for all
     * indexes.
     * If false is provided, grant methods grant the permissions
     * only when `globalIndexes` or `localIndexes` is specified.
     */
    override fun grantIndexPermissions(grantIndexPermissions: Boolean) {
      cdkBuilder.grantIndexPermissions(grantIndexPermissions)
    }

    /**
     * @param localIndexes The name of the local indexes set for this Table.
     * Note that you need to set either this property,
     * or `globalIndexes`,
     * if you want methods like grantReadData()
     * to grant permissions for indexes as well as the table itself.
     */
    override fun localIndexes(localIndexes: List<String>) {
      cdkBuilder.localIndexes(localIndexes)
    }

    /**
     * @param localIndexes The name of the local indexes set for this Table.
     * Note that you need to set either this property,
     * or `globalIndexes`,
     * if you want methods like grantReadData()
     * to grant permissions for indexes as well as the table itself.
     */
    override fun localIndexes(vararg localIndexes: String): Unit =
        localIndexes(localIndexes.toList())

    /**
     * @param tableArn The ARN of the dynamodb table.
     * One of this, or `tableName`, is required.
     */
    override fun tableArn(tableArn: String) {
      cdkBuilder.tableArn(tableArn)
    }

    /**
     * @param tableName The table name of the dynamodb table.
     * One of this, or `tableArn`, is required.
     */
    override fun tableName(tableName: String) {
      cdkBuilder.tableName(tableName)
    }

    /**
     * @param tableStreamArn The ARN of the table's stream.
     */
    override fun tableStreamArn(tableStreamArn: String) {
      cdkBuilder.tableStreamArn(tableStreamArn)
    }

    public fun build(): software.amazon.awscdk.services.dynamodb.TableAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.dynamodb.TableAttributes,
  ) : CdkObject(cdkObject), TableAttributes {
    /**
     * KMS encryption key, if this table uses a customer-managed encryption key.
     *
     * Default: - no key
     */
    override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    /**
     * The name of the global indexes set for this Table.
     *
     * Note that you need to set either this property,
     * or `localIndexes`,
     * if you want methods like grantReadData()
     * to grant permissions for indexes as well as the table itself.
     *
     * Default: - no global indexes
     */
    override fun globalIndexes(): List<String> = unwrap(this).getGlobalIndexes() ?: emptyList()

    /**
     * If set to true, grant methods always grant permissions for all indexes.
     *
     * If false is provided, grant methods grant the permissions
     * only when `globalIndexes` or `localIndexes` is specified.
     *
     * Default: - false
     */
    override fun grantIndexPermissions(): Boolean? = unwrap(this).getGrantIndexPermissions()

    /**
     * The name of the local indexes set for this Table.
     *
     * Note that you need to set either this property,
     * or `globalIndexes`,
     * if you want methods like grantReadData()
     * to grant permissions for indexes as well as the table itself.
     *
     * Default: - no local indexes
     */
    override fun localIndexes(): List<String> = unwrap(this).getLocalIndexes() ?: emptyList()

    /**
     * The ARN of the dynamodb table.
     *
     * One of this, or `tableName`, is required.
     *
     * Default: - no table arn
     */
    override fun tableArn(): String? = unwrap(this).getTableArn()

    /**
     * The table name of the dynamodb table.
     *
     * One of this, or `tableArn`, is required.
     *
     * Default: - no table name
     */
    override fun tableName(): String? = unwrap(this).getTableName()

    /**
     * The ARN of the table's stream.
     *
     * Default: - no table stream
     */
    override fun tableStreamArn(): String? = unwrap(this).getTableStreamArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TableAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.TableAttributes):
        TableAttributes = CdkObjectWrappers.wrap(cdkObject) as? TableAttributes ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: TableAttributes):
        software.amazon.awscdk.services.dynamodb.TableAttributes = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.dynamodb.TableAttributes
  }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.dynamodb.TableAttributes
import software.amazon.awscdk.services.kms.IKey

/**
 * Reference to a dynamodb table.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dynamodb.*;
 * import software.amazon.awscdk.services.kms.*;
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
@CdkDslMarker
public class TableAttributesDsl {
  private val cdkBuilder: TableAttributes.Builder = TableAttributes.builder()

  private val _globalIndexes: MutableList<String> = mutableListOf()

  private val _localIndexes: MutableList<String> = mutableListOf()

  /**
   * @param encryptionKey KMS encryption key, if this table uses a customer-managed encryption key.
   */
  public fun encryptionKey(encryptionKey: IKey) {
    cdkBuilder.encryptionKey(encryptionKey)
  }

  /**
   * @param globalIndexes The name of the global indexes set for this Table.
   * Note that you need to set either this property,
   * or `localIndexes`,
   * if you want methods like grantReadData()
   * to grant permissions for indexes as well as the table itself.
   */
  public fun globalIndexes(vararg globalIndexes: String) {
    _globalIndexes.addAll(listOf(*globalIndexes))
  }

  /**
   * @param globalIndexes The name of the global indexes set for this Table.
   * Note that you need to set either this property,
   * or `localIndexes`,
   * if you want methods like grantReadData()
   * to grant permissions for indexes as well as the table itself.
   */
  public fun globalIndexes(globalIndexes: Collection<String>) {
    _globalIndexes.addAll(globalIndexes)
  }

  /**
   * @param grantIndexPermissions If set to true, grant methods always grant permissions for all
   * indexes.
   * If false is provided, grant methods grant the permissions
   * only when `globalIndexes` or `localIndexes` is specified.
   */
  public fun grantIndexPermissions(grantIndexPermissions: Boolean) {
    cdkBuilder.grantIndexPermissions(grantIndexPermissions)
  }

  /**
   * @param localIndexes The name of the local indexes set for this Table.
   * Note that you need to set either this property,
   * or `globalIndexes`,
   * if you want methods like grantReadData()
   * to grant permissions for indexes as well as the table itself.
   */
  public fun localIndexes(vararg localIndexes: String) {
    _localIndexes.addAll(listOf(*localIndexes))
  }

  /**
   * @param localIndexes The name of the local indexes set for this Table.
   * Note that you need to set either this property,
   * or `globalIndexes`,
   * if you want methods like grantReadData()
   * to grant permissions for indexes as well as the table itself.
   */
  public fun localIndexes(localIndexes: Collection<String>) {
    _localIndexes.addAll(localIndexes)
  }

  /**
   * @param tableArn The ARN of the dynamodb table.
   * One of this, or `tableName`, is required.
   */
  public fun tableArn(tableArn: String) {
    cdkBuilder.tableArn(tableArn)
  }

  /**
   * @param tableName The table name of the dynamodb table.
   * One of this, or `tableArn`, is required.
   */
  public fun tableName(tableName: String) {
    cdkBuilder.tableName(tableName)
  }

  /**
   * @param tableStreamArn The ARN of the table's stream.
   */
  public fun tableStreamArn(tableStreamArn: String) {
    cdkBuilder.tableStreamArn(tableStreamArn)
  }

  public fun build(): TableAttributes {
    if(_globalIndexes.isNotEmpty()) cdkBuilder.globalIndexes(_globalIndexes)
    if(_localIndexes.isNotEmpty()) cdkBuilder.localIndexes(_localIndexes)
    return cdkBuilder.build()
  }
}

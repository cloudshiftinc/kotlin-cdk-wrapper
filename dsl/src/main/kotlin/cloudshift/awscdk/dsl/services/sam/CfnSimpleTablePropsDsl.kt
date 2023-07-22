@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnSimpleTable
import software.amazon.awscdk.services.sam.CfnSimpleTableProps

@CdkDslMarker
public class CfnSimpleTablePropsDsl {
  private val cdkBuilder: CfnSimpleTableProps.Builder = CfnSimpleTableProps.builder()

  /**
   * @param primaryKey the value to be set.
   */
  public fun primaryKey(primaryKey: IResolvable) {
    cdkBuilder.primaryKey(primaryKey)
  }

  /**
   * @param primaryKey the value to be set.
   */
  public fun primaryKey(primaryKey: CfnSimpleTable.PrimaryKeyProperty) {
    cdkBuilder.primaryKey(primaryKey)
  }

  /**
   * @param provisionedThroughput the value to be set.
   */
  public fun provisionedThroughput(provisionedThroughput: IResolvable) {
    cdkBuilder.provisionedThroughput(provisionedThroughput)
  }

  /**
   * @param provisionedThroughput the value to be set.
   */
  public
      fun provisionedThroughput(provisionedThroughput: CfnSimpleTable.ProvisionedThroughputProperty) {
    cdkBuilder.provisionedThroughput(provisionedThroughput)
  }

  /**
   * @param sseSpecification the value to be set.
   */
  public fun sseSpecification(sseSpecification: IResolvable) {
    cdkBuilder.sseSpecification(sseSpecification)
  }

  /**
   * @param sseSpecification the value to be set.
   */
  public fun sseSpecification(sseSpecification: CfnSimpleTable.SSESpecificationProperty) {
    cdkBuilder.sseSpecification(sseSpecification)
  }

  /**
   * @param tableName the value to be set.
   */
  public fun tableName(tableName: String) {
    cdkBuilder.tableName(tableName)
  }

  /**
   * @param tags the value to be set.
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnSimpleTableProps = cdkBuilder.build()
}

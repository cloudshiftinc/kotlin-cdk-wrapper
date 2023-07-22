@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnSimpleTable
import software.amazon.awscdk.services.sam.CfnSimpleTableProps

/**
 * Properties for defining a `CfnSimpleTable`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * CfnSimpleTableProps cfnSimpleTableProps = CfnSimpleTableProps.builder()
 * .primaryKey(PrimaryKeyProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .name("name")
 * .build())
 * .provisionedThroughput(ProvisionedThroughputProperty.builder()
 * .writeCapacityUnits(123)
 * // the properties below are optional
 * .readCapacityUnits(123)
 * .build())
 * .sseSpecification(SSESpecificationProperty.builder()
 * .sseEnabled(false)
 * .build())
 * .tableName("tableName")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-simpletable.html)
 */
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

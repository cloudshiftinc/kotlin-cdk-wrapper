@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSet

@CdkDslMarker
public class CfnDataSetPhysicalTablePropertyDsl {
  private val cdkBuilder: CfnDataSet.PhysicalTableProperty.Builder =
      CfnDataSet.PhysicalTableProperty.builder()

  /**
   * @param customSql A physical table type built from the results of the custom SQL query.
   */
  public fun customSql(customSql: IResolvable) {
    cdkBuilder.customSql(customSql)
  }

  /**
   * @param customSql A physical table type built from the results of the custom SQL query.
   */
  public fun customSql(customSql: CfnDataSet.CustomSqlProperty) {
    cdkBuilder.customSql(customSql)
  }

  /**
   * @param relationalTable A physical table type for relational data sources.
   */
  public fun relationalTable(relationalTable: IResolvable) {
    cdkBuilder.relationalTable(relationalTable)
  }

  /**
   * @param relationalTable A physical table type for relational data sources.
   */
  public fun relationalTable(relationalTable: CfnDataSet.RelationalTableProperty) {
    cdkBuilder.relationalTable(relationalTable)
  }

  /**
   * @param s3Source A physical table type for as S3 data source.
   */
  public fun s3Source(s3Source: IResolvable) {
    cdkBuilder.s3Source(s3Source)
  }

  /**
   * @param s3Source A physical table type for as S3 data source.
   */
  public fun s3Source(s3Source: CfnDataSet.S3SourceProperty) {
    cdkBuilder.s3Source(s3Source)
  }

  public fun build(): CfnDataSet.PhysicalTableProperty = cdkBuilder.build()
}

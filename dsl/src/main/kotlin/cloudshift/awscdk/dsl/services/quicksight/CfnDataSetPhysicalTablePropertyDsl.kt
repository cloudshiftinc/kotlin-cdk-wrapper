@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSet

@CdkDslMarker
public class CfnDataSetPhysicalTablePropertyDsl {
  private val cdkBuilder: CfnDataSet.PhysicalTableProperty.Builder =
      CfnDataSet.PhysicalTableProperty.builder()

  public fun customSql(customSql: IResolvable) {
    cdkBuilder.customSql(customSql)
  }

  public fun customSql(customSql: CfnDataSet.CustomSqlProperty) {
    cdkBuilder.customSql(customSql)
  }

  public fun relationalTable(relationalTable: IResolvable) {
    cdkBuilder.relationalTable(relationalTable)
  }

  public fun relationalTable(relationalTable: CfnDataSet.RelationalTableProperty) {
    cdkBuilder.relationalTable(relationalTable)
  }

  public fun s3Source(s3Source: IResolvable) {
    cdkBuilder.s3Source(s3Source)
  }

  public fun s3Source(s3Source: CfnDataSet.S3SourceProperty) {
    cdkBuilder.s3Source(s3Source)
  }

  public fun build(): CfnDataSet.PhysicalTableProperty = cdkBuilder.build()
}

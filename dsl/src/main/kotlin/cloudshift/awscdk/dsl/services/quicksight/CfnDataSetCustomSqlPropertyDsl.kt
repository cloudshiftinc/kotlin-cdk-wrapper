@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSet

@CdkDslMarker
public class CfnDataSetCustomSqlPropertyDsl {
  private val cdkBuilder: CfnDataSet.CustomSqlProperty.Builder =
      CfnDataSet.CustomSqlProperty.builder()

  private val _columns: MutableList<Any> = mutableListOf()

  /**
   * @param columns The column schema from the SQL query result set. 
   */
  public fun columns(vararg columns: Any) {
    _columns.addAll(listOf(*columns))
  }

  /**
   * @param columns The column schema from the SQL query result set. 
   */
  public fun columns(columns: Collection<Any>) {
    _columns.addAll(columns)
  }

  /**
   * @param columns The column schema from the SQL query result set. 
   */
  public fun columns(columns: IResolvable) {
    cdkBuilder.columns(columns)
  }

  /**
   * @param dataSourceArn The Amazon Resource Name (ARN) of the data source. 
   */
  public fun dataSourceArn(dataSourceArn: String) {
    cdkBuilder.dataSourceArn(dataSourceArn)
  }

  /**
   * @param name A display name for the SQL query result. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param sqlQuery The SQL query. 
   */
  public fun sqlQuery(sqlQuery: String) {
    cdkBuilder.sqlQuery(sqlQuery)
  }

  public fun build(): CfnDataSet.CustomSqlProperty {
    if(_columns.isNotEmpty()) cdkBuilder.columns(_columns)
    return cdkBuilder.build()
  }
}

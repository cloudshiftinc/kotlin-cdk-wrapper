@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.athena

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.athena.CfnNamedQueryProps

@CdkDslMarker
public class CfnNamedQueryPropsDsl {
  private val cdkBuilder: CfnNamedQueryProps.Builder = CfnNamedQueryProps.builder()

  /**
   * @param database The database to which the query belongs. 
   */
  public fun database(database: String) {
    cdkBuilder.database(database)
  }

  /**
   * @param description The query description.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param name The query name.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param queryString The SQL statements that make up the query. 
   */
  public fun queryString(queryString: String) {
    cdkBuilder.queryString(queryString)
  }

  /**
   * @param workGroup The name of the workgroup that contains the named query.
   */
  public fun workGroup(workGroup: String) {
    cdkBuilder.workGroup(workGroup)
  }

  public fun build(): CfnNamedQueryProps = cdkBuilder.build()
}

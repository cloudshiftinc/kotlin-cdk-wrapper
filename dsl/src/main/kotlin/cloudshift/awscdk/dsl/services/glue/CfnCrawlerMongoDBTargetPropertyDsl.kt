@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.glue.CfnCrawler

@CdkDslMarker
public class CfnCrawlerMongoDBTargetPropertyDsl {
  private val cdkBuilder: CfnCrawler.MongoDBTargetProperty.Builder =
      CfnCrawler.MongoDBTargetProperty.builder()

  /**
   * @param connectionName The name of the connection to use to connect to the Amazon DocumentDB or
   * MongoDB target.
   */
  public fun connectionName(connectionName: String) {
    cdkBuilder.connectionName(connectionName)
  }

  /**
   * @param path The path of the Amazon DocumentDB or MongoDB target (database/collection).
   */
  public fun path(path: String) {
    cdkBuilder.path(path)
  }

  public fun build(): CfnCrawler.MongoDBTargetProperty = cdkBuilder.build()
}

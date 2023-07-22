@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opensearchservice

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.logs.ILogGroup
import software.amazon.awscdk.services.opensearchservice.LoggingOptions

@CdkDslMarker
public class LoggingOptionsDsl {
  private val cdkBuilder: LoggingOptions.Builder = LoggingOptions.builder()

  /**
   * @param appLogEnabled Specify if Amazon OpenSearch Service application logging should be set up.
   * Requires Elasticsearch version 5.1 or later or OpenSearch version 1.0 or later.
   */
  public fun appLogEnabled(appLogEnabled: Boolean) {
    cdkBuilder.appLogEnabled(appLogEnabled)
  }

  /**
   * @param appLogGroup Log Amazon OpenSearch Service application logs to this log group.
   */
  public fun appLogGroup(appLogGroup: ILogGroup) {
    cdkBuilder.appLogGroup(appLogGroup)
  }

  /**
   * @param auditLogEnabled Specify if Amazon OpenSearch Service audit logging should be set up.
   * Requires Elasticsearch version 6.7 or later or OpenSearch version 1.0 or later and fine grained
   * access control to be enabled.
   */
  public fun auditLogEnabled(auditLogEnabled: Boolean) {
    cdkBuilder.auditLogEnabled(auditLogEnabled)
  }

  /**
   * @param auditLogGroup Log Amazon OpenSearch Service audit logs to this log group.
   */
  public fun auditLogGroup(auditLogGroup: ILogGroup) {
    cdkBuilder.auditLogGroup(auditLogGroup)
  }

  /**
   * @param slowIndexLogEnabled Specify if slow index logging should be set up.
   * Requires Elasticsearch version 5.1 or later or OpenSearch version 1.0 or later.
   */
  public fun slowIndexLogEnabled(slowIndexLogEnabled: Boolean) {
    cdkBuilder.slowIndexLogEnabled(slowIndexLogEnabled)
  }

  /**
   * @param slowIndexLogGroup Log slow indices to this log group.
   */
  public fun slowIndexLogGroup(slowIndexLogGroup: ILogGroup) {
    cdkBuilder.slowIndexLogGroup(slowIndexLogGroup)
  }

  /**
   * @param slowSearchLogEnabled Specify if slow search logging should be set up.
   * Requires Elasticsearch version 5.1 or later or OpenSearch version 1.0 or later.
   */
  public fun slowSearchLogEnabled(slowSearchLogEnabled: Boolean) {
    cdkBuilder.slowSearchLogEnabled(slowSearchLogEnabled)
  }

  /**
   * @param slowSearchLogGroup Log slow searches to this log group.
   */
  public fun slowSearchLogGroup(slowSearchLogGroup: ILogGroup) {
    cdkBuilder.slowSearchLogGroup(slowSearchLogGroup)
  }

  public fun build(): LoggingOptions = cdkBuilder.build()
}

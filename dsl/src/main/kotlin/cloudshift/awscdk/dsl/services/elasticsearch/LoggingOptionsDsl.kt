@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticsearch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Deprecated
import software.amazon.awscdk.services.elasticsearch.LoggingOptions
import software.amazon.awscdk.services.logs.ILogGroup

@CdkDslMarker
@Deprecated(message = "deprecated in CDK")
public class LoggingOptionsDsl {
  private val cdkBuilder: LoggingOptions.Builder = LoggingOptions.builder()

  /**
   * @param appLogEnabled Specify if Elasticsearch application logging should be set up.
   * Requires Elasticsearch version 5.1 or later.
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun appLogEnabled(appLogEnabled: Boolean) {
    cdkBuilder.appLogEnabled(appLogEnabled)
  }

  /**
   * @param appLogGroup Log Elasticsearch application logs to this log group.
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun appLogGroup(appLogGroup: ILogGroup) {
    cdkBuilder.appLogGroup(appLogGroup)
  }

  /**
   * @param auditLogEnabled Specify if Elasticsearch audit logging should be set up.
   * Requires Elasticsearch version 6.7 or later and fine grained access control to be enabled.
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun auditLogEnabled(auditLogEnabled: Boolean) {
    cdkBuilder.auditLogEnabled(auditLogEnabled)
  }

  /**
   * @param auditLogGroup Log Elasticsearch audit logs to this log group.
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun auditLogGroup(auditLogGroup: ILogGroup) {
    cdkBuilder.auditLogGroup(auditLogGroup)
  }

  /**
   * @param slowIndexLogEnabled Specify if slow index logging should be set up.
   * Requires Elasticsearch version 5.1 or later.
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun slowIndexLogEnabled(slowIndexLogEnabled: Boolean) {
    cdkBuilder.slowIndexLogEnabled(slowIndexLogEnabled)
  }

  /**
   * @param slowIndexLogGroup Log slow indices to this log group.
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun slowIndexLogGroup(slowIndexLogGroup: ILogGroup) {
    cdkBuilder.slowIndexLogGroup(slowIndexLogGroup)
  }

  /**
   * @param slowSearchLogEnabled Specify if slow search logging should be set up.
   * Requires Elasticsearch version 5.1 or later.
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun slowSearchLogEnabled(slowSearchLogEnabled: Boolean) {
    cdkBuilder.slowSearchLogEnabled(slowSearchLogEnabled)
  }

  /**
   * @param slowSearchLogGroup Log slow searches to this log group.
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun slowSearchLogGroup(slowSearchLogGroup: ILogGroup) {
    cdkBuilder.slowSearchLogGroup(slowSearchLogGroup)
  }

  public fun build(): LoggingOptions = cdkBuilder.build()
}

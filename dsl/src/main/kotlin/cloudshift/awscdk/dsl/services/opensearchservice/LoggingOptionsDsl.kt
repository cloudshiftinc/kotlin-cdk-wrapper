@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opensearchservice

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.logs.ILogGroup
import software.amazon.awscdk.services.opensearchservice.LoggingOptions

@CdkDslMarker
public class LoggingOptionsDsl {
  private val cdkBuilder: LoggingOptions.Builder = LoggingOptions.builder()

  public fun appLogEnabled(appLogEnabled: Boolean) {
    cdkBuilder.appLogEnabled(appLogEnabled)
  }

  public fun appLogGroup(appLogGroup: ILogGroup) {
    cdkBuilder.appLogGroup(appLogGroup)
  }

  public fun auditLogEnabled(auditLogEnabled: Boolean) {
    cdkBuilder.auditLogEnabled(auditLogEnabled)
  }

  public fun auditLogGroup(auditLogGroup: ILogGroup) {
    cdkBuilder.auditLogGroup(auditLogGroup)
  }

  public fun slowIndexLogEnabled(slowIndexLogEnabled: Boolean) {
    cdkBuilder.slowIndexLogEnabled(slowIndexLogEnabled)
  }

  public fun slowIndexLogGroup(slowIndexLogGroup: ILogGroup) {
    cdkBuilder.slowIndexLogGroup(slowIndexLogGroup)
  }

  public fun slowSearchLogEnabled(slowSearchLogEnabled: Boolean) {
    cdkBuilder.slowSearchLogEnabled(slowSearchLogEnabled)
  }

  public fun slowSearchLogGroup(slowSearchLogGroup: ILogGroup) {
    cdkBuilder.slowSearchLogGroup(slowSearchLogGroup)
  }

  public fun build(): LoggingOptions = cdkBuilder.build()
}

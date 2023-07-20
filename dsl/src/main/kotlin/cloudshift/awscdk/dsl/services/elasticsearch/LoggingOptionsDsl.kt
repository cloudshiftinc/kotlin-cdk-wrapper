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

  @Deprecated(message = "deprecated in CDK")
  public fun appLogEnabled(appLogEnabled: Boolean) {
    cdkBuilder.appLogEnabled(appLogEnabled)
  }

  @Deprecated(message = "deprecated in CDK")
  public fun appLogGroup(appLogGroup: ILogGroup) {
    cdkBuilder.appLogGroup(appLogGroup)
  }

  @Deprecated(message = "deprecated in CDK")
  public fun auditLogEnabled(auditLogEnabled: Boolean) {
    cdkBuilder.auditLogEnabled(auditLogEnabled)
  }

  @Deprecated(message = "deprecated in CDK")
  public fun auditLogGroup(auditLogGroup: ILogGroup) {
    cdkBuilder.auditLogGroup(auditLogGroup)
  }

  @Deprecated(message = "deprecated in CDK")
  public fun slowIndexLogEnabled(slowIndexLogEnabled: Boolean) {
    cdkBuilder.slowIndexLogEnabled(slowIndexLogEnabled)
  }

  @Deprecated(message = "deprecated in CDK")
  public fun slowIndexLogGroup(slowIndexLogGroup: ILogGroup) {
    cdkBuilder.slowIndexLogGroup(slowIndexLogGroup)
  }

  @Deprecated(message = "deprecated in CDK")
  public fun slowSearchLogEnabled(slowSearchLogEnabled: Boolean) {
    cdkBuilder.slowSearchLogEnabled(slowSearchLogEnabled)
  }

  @Deprecated(message = "deprecated in CDK")
  public fun slowSearchLogGroup(slowSearchLogGroup: ILogGroup) {
    cdkBuilder.slowSearchLogGroup(slowSearchLogGroup)
  }

  public fun build(): LoggingOptions = cdkBuilder.build()
}

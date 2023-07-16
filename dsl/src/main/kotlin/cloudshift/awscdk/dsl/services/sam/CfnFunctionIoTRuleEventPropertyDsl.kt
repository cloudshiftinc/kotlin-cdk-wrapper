@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sam.CfnFunction

@CdkDslMarker
public class CfnFunctionIoTRuleEventPropertyDsl {
  private val cdkBuilder: CfnFunction.IoTRuleEventProperty.Builder =
      CfnFunction.IoTRuleEventProperty.builder()

  public fun awsIotSqlVersion(awsIotSqlVersion: String) {
    cdkBuilder.awsIotSqlVersion(awsIotSqlVersion)
  }

  public fun sql(sql: String) {
    cdkBuilder.sql(sql)
  }

  public fun build(): CfnFunction.IoTRuleEventProperty = cdkBuilder.build()
}

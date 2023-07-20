@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnLogging
import software.constructs.Construct

@CdkDslMarker
public class CfnLoggingDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnLogging.Builder = CfnLogging.Builder.create(scope, id)

  public fun accountId(accountId: String) {
    cdkBuilder.accountId(accountId)
  }

  public fun defaultLogLevel(defaultLogLevel: String) {
    cdkBuilder.defaultLogLevel(defaultLogLevel)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun build(): CfnLogging = cdkBuilder.build()
}

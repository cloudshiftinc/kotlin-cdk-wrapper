@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cognito.CfnUserPoolClient

@CdkDslMarker
public class CfnUserPoolClientAnalyticsConfigurationPropertyDsl {
  private val cdkBuilder: CfnUserPoolClient.AnalyticsConfigurationProperty.Builder =
      CfnUserPoolClient.AnalyticsConfigurationProperty.builder()

  public fun applicationArn(applicationArn: String) {
    cdkBuilder.applicationArn(applicationArn)
  }

  public fun applicationId(applicationId: String) {
    cdkBuilder.applicationId(applicationId)
  }

  public fun externalId(externalId: String) {
    cdkBuilder.externalId(externalId)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun userDataShared(userDataShared: Boolean) {
    cdkBuilder.userDataShared(userDataShared)
  }

  public fun userDataShared(userDataShared: IResolvable) {
    cdkBuilder.userDataShared(userDataShared)
  }

  public fun build(): CfnUserPoolClient.AnalyticsConfigurationProperty = cdkBuilder.build()
}

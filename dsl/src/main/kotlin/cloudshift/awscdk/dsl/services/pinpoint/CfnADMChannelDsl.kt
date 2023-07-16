@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnADMChannel
import software.constructs.Construct

@CdkDslMarker
public class CfnADMChannelDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnADMChannel.Builder = CfnADMChannel.Builder.create(scope, id)

  public fun applicationId(applicationId: String) {
    cdkBuilder.applicationId(applicationId)
  }

  public fun clientId(clientId: String) {
    cdkBuilder.clientId(clientId)
  }

  public fun clientSecret(clientSecret: String) {
    cdkBuilder.clientSecret(clientSecret)
  }

  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun build(): CfnADMChannel = cdkBuilder.build()
}

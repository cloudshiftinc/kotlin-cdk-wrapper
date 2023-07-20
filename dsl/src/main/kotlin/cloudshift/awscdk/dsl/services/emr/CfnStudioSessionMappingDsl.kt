@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.emr.CfnStudioSessionMapping
import software.constructs.Construct

@CdkDslMarker
public class CfnStudioSessionMappingDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnStudioSessionMapping.Builder =
      CfnStudioSessionMapping.Builder.create(scope, id)

  public fun identityName(identityName: String) {
    cdkBuilder.identityName(identityName)
  }

  public fun identityType(identityType: String) {
    cdkBuilder.identityType(identityType)
  }

  public fun sessionPolicyArn(sessionPolicyArn: String) {
    cdkBuilder.sessionPolicyArn(sessionPolicyArn)
  }

  public fun studioId(studioId: String) {
    cdkBuilder.studioId(studioId)
  }

  public fun build(): CfnStudioSessionMapping = cdkBuilder.build()
}

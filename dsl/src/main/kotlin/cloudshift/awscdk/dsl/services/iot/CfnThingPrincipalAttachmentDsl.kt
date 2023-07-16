@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnThingPrincipalAttachment
import software.constructs.Construct

@CdkDslMarker
public class CfnThingPrincipalAttachmentDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnThingPrincipalAttachment.Builder =
      CfnThingPrincipalAttachment.Builder.create(scope, id)

  public fun principal(principal: String) {
    cdkBuilder.principal(principal)
  }

  public fun thingName(thingName: String) {
    cdkBuilder.thingName(thingName)
  }

  public fun build(): CfnThingPrincipalAttachment = cdkBuilder.build()
}

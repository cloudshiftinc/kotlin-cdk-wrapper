@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appstream

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appstream.CfnApplicationEntitlementAssociationProps

@CdkDslMarker
public class CfnApplicationEntitlementAssociationPropsDsl {
  private val cdkBuilder: CfnApplicationEntitlementAssociationProps.Builder =
      CfnApplicationEntitlementAssociationProps.builder()

  /**
   * @param applicationIdentifier The identifier of the application. 
   */
  public fun applicationIdentifier(applicationIdentifier: String) {
    cdkBuilder.applicationIdentifier(applicationIdentifier)
  }

  /**
   * @param entitlementName The name of the entitlement. 
   */
  public fun entitlementName(entitlementName: String) {
    cdkBuilder.entitlementName(entitlementName)
  }

  /**
   * @param stackName The name of the stack. 
   */
  public fun stackName(stackName: String) {
    cdkBuilder.stackName(stackName)
  }

  public fun build(): CfnApplicationEntitlementAssociationProps = cdkBuilder.build()
}

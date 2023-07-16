@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lakeformation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lakeformation.CfnResourceProps

@CdkDslMarker
public class CfnResourcePropsDsl {
  private val cdkBuilder: CfnResourceProps.Builder = CfnResourceProps.builder()

  public fun resourceArn(resourceArn: String) {
    cdkBuilder.resourceArn(resourceArn)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun useServiceLinkedRole(useServiceLinkedRole: Boolean) {
    cdkBuilder.useServiceLinkedRole(useServiceLinkedRole)
  }

  public fun useServiceLinkedRole(useServiceLinkedRole: IResolvable) {
    cdkBuilder.useServiceLinkedRole(useServiceLinkedRole)
  }

  public fun withFederation(withFederation: Boolean) {
    cdkBuilder.withFederation(withFederation)
  }

  public fun withFederation(withFederation: IResolvable) {
    cdkBuilder.withFederation(withFederation)
  }

  public fun build(): CfnResourceProps = cdkBuilder.build()
}

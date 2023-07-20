@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53resolver

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.route53resolver.CfnResolverConfigProps

@CdkDslMarker
public class CfnResolverConfigPropsDsl {
  private val cdkBuilder: CfnResolverConfigProps.Builder = CfnResolverConfigProps.builder()

  public fun autodefinedReverseFlag(autodefinedReverseFlag: String) {
    cdkBuilder.autodefinedReverseFlag(autodefinedReverseFlag)
  }

  public fun resourceId(resourceId: String) {
    cdkBuilder.resourceId(resourceId)
  }

  public fun build(): CfnResolverConfigProps = cdkBuilder.build()
}

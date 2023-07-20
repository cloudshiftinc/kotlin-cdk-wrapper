@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53resolver

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.route53resolver.CfnResolverConfig
import software.constructs.Construct

@CdkDslMarker
public class CfnResolverConfigDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnResolverConfig.Builder = CfnResolverConfig.Builder.create(scope, id)

  public fun autodefinedReverseFlag(autodefinedReverseFlag: String) {
    cdkBuilder.autodefinedReverseFlag(autodefinedReverseFlag)
  }

  public fun resourceId(resourceId: String) {
    cdkBuilder.resourceId(resourceId)
  }

  public fun build(): CfnResolverConfig = cdkBuilder.build()
}

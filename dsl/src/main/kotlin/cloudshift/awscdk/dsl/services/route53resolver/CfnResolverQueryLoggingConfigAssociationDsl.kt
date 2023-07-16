@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53resolver

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigAssociation
import software.constructs.Construct

@CdkDslMarker
public class CfnResolverQueryLoggingConfigAssociationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnResolverQueryLoggingConfigAssociation.Builder =
      CfnResolverQueryLoggingConfigAssociation.Builder.create(scope, id)

  public fun resolverQueryLogConfigId(resolverQueryLogConfigId: String) {
    cdkBuilder.resolverQueryLogConfigId(resolverQueryLogConfigId)
  }

  public fun resourceId(resourceId: String) {
    cdkBuilder.resourceId(resourceId)
  }

  public fun build(): CfnResolverQueryLoggingConfigAssociation = cdkBuilder.build()
}

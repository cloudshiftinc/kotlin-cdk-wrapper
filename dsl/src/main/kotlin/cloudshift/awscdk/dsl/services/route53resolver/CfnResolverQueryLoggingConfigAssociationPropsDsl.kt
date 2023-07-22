@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53resolver

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigAssociationProps

@CdkDslMarker
public class CfnResolverQueryLoggingConfigAssociationPropsDsl {
  private val cdkBuilder: CfnResolverQueryLoggingConfigAssociationProps.Builder =
      CfnResolverQueryLoggingConfigAssociationProps.builder()

  /**
   * @param resolverQueryLogConfigId The ID of the query logging configuration that a VPC is
   * associated with.
   */
  public fun resolverQueryLogConfigId(resolverQueryLogConfigId: String) {
    cdkBuilder.resolverQueryLogConfigId(resolverQueryLogConfigId)
  }

  /**
   * @param resourceId The ID of the Amazon VPC that is associated with the query logging
   * configuration.
   */
  public fun resourceId(resourceId: String) {
    cdkBuilder.resourceId(resourceId)
  }

  public fun build(): CfnResolverQueryLoggingConfigAssociationProps = cdkBuilder.build()
}

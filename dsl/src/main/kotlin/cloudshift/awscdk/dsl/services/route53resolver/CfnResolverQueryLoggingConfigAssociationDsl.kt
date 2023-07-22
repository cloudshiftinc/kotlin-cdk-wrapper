@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53resolver

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigAssociation
import software.constructs.Construct

/**
 * The AWS::Route53Resolver::ResolverQueryLoggingConfigAssociation resource is a configuration for
 * DNS query logging.
 *
 * After you create a query logging configuration, Amazon Route 53 begins to publish log data to an
 * Amazon CloudWatch Logs log group.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.route53resolver.*;
 * CfnResolverQueryLoggingConfigAssociation cfnResolverQueryLoggingConfigAssociation =
 * CfnResolverQueryLoggingConfigAssociation.Builder.create(this,
 * "MyCfnResolverQueryLoggingConfigAssociation")
 * .resolverQueryLogConfigId("resolverQueryLogConfigId")
 * .resourceId("resourceId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverqueryloggingconfigassociation.html)
 */
@CdkDslMarker
public class CfnResolverQueryLoggingConfigAssociationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnResolverQueryLoggingConfigAssociation.Builder =
      CfnResolverQueryLoggingConfigAssociation.Builder.create(scope, id)

  /**
   * The ID of the query logging configuration that a VPC is associated with.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverqueryloggingconfigassociation.html#cfn-route53resolver-resolverqueryloggingconfigassociation-resolverquerylogconfigid)
   * @param resolverQueryLogConfigId The ID of the query logging configuration that a VPC is
   * associated with. 
   */
  public fun resolverQueryLogConfigId(resolverQueryLogConfigId: String) {
    cdkBuilder.resolverQueryLogConfigId(resolverQueryLogConfigId)
  }

  /**
   * The ID of the Amazon VPC that is associated with the query logging configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverqueryloggingconfigassociation.html#cfn-route53resolver-resolverqueryloggingconfigassociation-resourceid)
   * @param resourceId The ID of the Amazon VPC that is associated with the query logging
   * configuration. 
   */
  public fun resourceId(resourceId: String) {
    cdkBuilder.resourceId(resourceId)
  }

  public fun build(): CfnResolverQueryLoggingConfigAssociation = cdkBuilder.build()
}

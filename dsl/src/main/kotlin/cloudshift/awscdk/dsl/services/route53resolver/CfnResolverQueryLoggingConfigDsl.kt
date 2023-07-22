@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53resolver

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfig
import software.constructs.Construct

@CdkDslMarker
public class CfnResolverQueryLoggingConfigDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnResolverQueryLoggingConfig.Builder =
      CfnResolverQueryLoggingConfig.Builder.create(scope, id)

  /**
   * The ARN of the resource that you want Resolver to send query logs: an Amazon S3 bucket, a
   * CloudWatch Logs log group, or a Kinesis Data Firehose delivery stream.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverqueryloggingconfig.html#cfn-route53resolver-resolverqueryloggingconfig-destinationarn)
   * @param destinationArn The ARN of the resource that you want Resolver to send query logs: an
   * Amazon S3 bucket, a CloudWatch Logs log group, or a Kinesis Data Firehose delivery stream. 
   */
  public fun destinationArn(destinationArn: String) {
    cdkBuilder.destinationArn(destinationArn)
  }

  /**
   * The name of the query logging configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverqueryloggingconfig.html#cfn-route53resolver-resolverqueryloggingconfig-name)
   * @param name The name of the query logging configuration. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnResolverQueryLoggingConfig = cdkBuilder.build()
}

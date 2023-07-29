@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.route53resolver

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigProps

/**
 * Properties for defining a `CfnResolverQueryLoggingConfig`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.route53resolver.*;
 * CfnResolverQueryLoggingConfigProps cfnResolverQueryLoggingConfigProps =
 * CfnResolverQueryLoggingConfigProps.builder()
 * .destinationArn("destinationArn")
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverqueryloggingconfig.html)
 */
@CdkDslMarker
public class CfnResolverQueryLoggingConfigPropsDsl {
    private val cdkBuilder: CfnResolverQueryLoggingConfigProps.Builder =
        CfnResolverQueryLoggingConfigProps.builder()

    /**
     * @param destinationArn The ARN of the resource that you want Resolver to send query logs: an
     *   Amazon S3 bucket, a CloudWatch Logs log group, or a Kinesis Data Firehose delivery stream.
     */
    public fun destinationArn(destinationArn: String) {
        cdkBuilder.destinationArn(destinationArn)
    }

    /** @param name The name of the query logging configuration. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnResolverQueryLoggingConfigProps = cdkBuilder.build()
}

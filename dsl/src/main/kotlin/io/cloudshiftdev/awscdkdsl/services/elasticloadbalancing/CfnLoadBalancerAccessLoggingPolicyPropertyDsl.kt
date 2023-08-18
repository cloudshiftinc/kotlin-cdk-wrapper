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

package io.cloudshiftdev.awscdkdsl.services.elasticloadbalancing

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer

/**
 * Specifies where and how access logs are stored for your Classic Load Balancer.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticloadbalancing.*;
 * AccessLoggingPolicyProperty accessLoggingPolicyProperty = AccessLoggingPolicyProperty.builder()
 * .enabled(false)
 * .s3BucketName("s3BucketName")
 * // the properties below are optional
 * .emitInterval(123)
 * .s3BucketPrefix("s3BucketPrefix")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-accessloggingpolicy.html)
 */
@CdkDslMarker
public class CfnLoadBalancerAccessLoggingPolicyPropertyDsl {
    private val cdkBuilder: CfnLoadBalancer.AccessLoggingPolicyProperty.Builder =
        CfnLoadBalancer.AccessLoggingPolicyProperty.builder()

    /**
     * @param emitInterval The interval for publishing the access logs. You can specify an interval
     *   of either 5 minutes or 60 minutes. Default: 60 minutes
     */
    public fun emitInterval(emitInterval: Number) {
        cdkBuilder.emitInterval(emitInterval)
    }

    /** @param enabled Specifies whether access logs are enabled for the load balancer. */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /** @param enabled Specifies whether access logs are enabled for the load balancer. */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /** @param s3BucketName The name of the Amazon S3 bucket where the access logs are stored. */
    public fun s3BucketName(s3BucketName: String) {
        cdkBuilder.s3BucketName(s3BucketName)
    }

    /**
     * @param s3BucketPrefix The logical hierarchy you created for your Amazon S3 bucket, for
     *   example `my-bucket-prefix/prod` . If the prefix is not provided, the log is placed at the
     *   root level of the bucket.
     */
    public fun s3BucketPrefix(s3BucketPrefix: String) {
        cdkBuilder.s3BucketPrefix(s3BucketPrefix)
    }

    public fun build(): CfnLoadBalancer.AccessLoggingPolicyProperty = cdkBuilder.build()
}

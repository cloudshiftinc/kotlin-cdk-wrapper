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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

/**
 * The metadata options for the instance.
 *
 * For more information, see
 * [Instance metadata and user data](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html)
 * in the *Amazon EC2 User Guide* .
 *
 * `MetadataOptions` is a property of
 * [AWS::EC2::LaunchTemplate LaunchTemplateData](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * MetadataOptionsProperty metadataOptionsProperty = MetadataOptionsProperty.builder()
 * .httpEndpoint("httpEndpoint")
 * .httpProtocolIpv6("httpProtocolIpv6")
 * .httpPutResponseHopLimit(123)
 * .httpTokens("httpTokens")
 * .instanceMetadataTags("instanceMetadataTags")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-metadataoptions.html)
 */
@CdkDslMarker
public class CfnLaunchTemplateMetadataOptionsPropertyDsl {
    private val cdkBuilder: CfnLaunchTemplate.MetadataOptionsProperty.Builder =
        CfnLaunchTemplate.MetadataOptionsProperty.builder()

    /**
     * @param httpEndpoint Enables or disables the HTTP metadata endpoint on your instances. If the
     *   parameter is not specified, the default state is `enabled` .
     *
     * If you specify a value of `disabled` , you will not be able to access your instance metadata.
     */
    public fun httpEndpoint(httpEndpoint: String) {
        cdkBuilder.httpEndpoint(httpEndpoint)
    }

    /**
     * @param httpProtocolIpv6 Enables or disables the IPv6 endpoint for the instance metadata
     *   service. Default: `disabled`
     */
    public fun httpProtocolIpv6(httpProtocolIpv6: String) {
        cdkBuilder.httpProtocolIpv6(httpProtocolIpv6)
    }

    /**
     * @param httpPutResponseHopLimit The desired HTTP PUT response hop limit for instance metadata
     *   requests. The larger the number, the further instance metadata requests can travel.
     *
     * Default: `1`
     *
     * Possible values: Integers from 1 to 64
     */
    public fun httpPutResponseHopLimit(httpPutResponseHopLimit: Number) {
        cdkBuilder.httpPutResponseHopLimit(httpPutResponseHopLimit)
    }

    /**
     * @param httpTokens Indicates whether IMDSv2 is required.
     * * `optional` - IMDSv2 is optional. You can choose whether to send a session token in your
     *   instance metadata retrieval requests. If you retrieve IAM role credentials without a
     *   session token, you receive the IMDSv1 role credentials. If you retrieve IAM role
     *   credentials using a valid session token, you receive the IMDSv2 role credentials.
     * * `required` - IMDSv2 is required. You must send a session token in your instance metadata
     *   retrieval requests. With this option, retrieving the IAM role credentials always returns
     *   IMDSv2 credentials; IMDSv1 credentials are not available.
     *
     * Default: If the value of `ImdsSupport` for the Amazon Machine Image (AMI) for your instance
     * is `v2.0` , the default is `required` .
     */
    public fun httpTokens(httpTokens: String) {
        cdkBuilder.httpTokens(httpTokens)
    }

    /**
     * @param instanceMetadataTags Set to `enabled` to allow access to instance tags from the
     *   instance metadata. Set to `disabled` to turn off access to instance tags from the instance
     *   metadata. For more information, see
     *   [Work with instance tags using the instance metadata](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#work-with-tags-in-IMDS)
     *   .
     *
     * Default: `disabled`
     */
    public fun instanceMetadataTags(instanceMetadataTags: String) {
        cdkBuilder.instanceMetadataTags(instanceMetadataTags)
    }

    public fun build(): CfnLaunchTemplate.MetadataOptionsProperty = cdkBuilder.build()
}

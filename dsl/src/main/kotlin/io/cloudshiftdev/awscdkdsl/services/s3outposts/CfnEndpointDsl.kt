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

package io.cloudshiftdev.awscdkdsl.services.s3outposts

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3outposts.CfnEndpoint
import software.constructs.Construct

/**
 * This AWS::S3Outposts::Endpoint resource specifies an endpoint and associates it with the
 * specified Outpost.
 *
 * Amazon S3 on Outposts access points simplify managing data access at scale for shared datasets in
 * S3 on Outposts. S3 on Outposts uses endpoints to connect to S3 on Outposts buckets so that you
 * can perform actions within your virtual private cloud (VPC). For more information, see
 * [Accessing S3 on Outposts using VPC-only access points](https://docs.aws.amazon.com/AmazonS3/latest/userguide/AccessingS3Outposts.html)
 * .
 *
 * It can take up to 5 minutes for this resource to be created.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3outposts.*;
 * CfnEndpoint cfnEndpoint = CfnEndpoint.Builder.create(this, "MyCfnEndpoint")
 * .outpostId("outpostId")
 * .securityGroupId("securityGroupId")
 * .subnetId("subnetId")
 * // the properties below are optional
 * .accessType("accessType")
 * .customerOwnedIpv4Pool("customerOwnedIpv4Pool")
 * .failedReason(FailedReasonProperty.builder()
 * .errorCode("errorCode")
 * .message("message")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-endpoint.html)
 */
@CdkDslMarker
public class CfnEndpointDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnEndpoint.Builder = CfnEndpoint.Builder.create(scope, id)

    /**
     * The container for the type of connectivity used to access the Amazon S3 on Outposts endpoint.
     *
     * To use the Amazon VPC , choose `Private` . To use the endpoint with an on-premises network,
     * choose `CustomerOwnedIp` . If you choose `CustomerOwnedIp` , you must also provide the
     * customer-owned IP address pool (CoIP pool).
     *
     * `Private` is the default access type value.
     *
     * Default: - "Private"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-endpoint.html#cfn-s3outposts-endpoint-accesstype)
     *
     * @param accessType The container for the type of connectivity used to access the Amazon S3 on
     *   Outposts endpoint.
     */
    public fun accessType(accessType: String) {
        cdkBuilder.accessType(accessType)
    }

    /**
     * The ID of the customer-owned IPv4 address pool (CoIP pool) for the endpoint.
     *
     * IP addresses are allocated from this pool for the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-endpoint.html#cfn-s3outposts-endpoint-customerownedipv4pool)
     *
     * @param customerOwnedIpv4Pool The ID of the customer-owned IPv4 address pool (CoIP pool) for
     *   the endpoint.
     */
    public fun customerOwnedIpv4Pool(customerOwnedIpv4Pool: String) {
        cdkBuilder.customerOwnedIpv4Pool(customerOwnedIpv4Pool)
    }

    /**
     * The failure reason, if any, for a create or delete endpoint operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-endpoint.html#cfn-s3outposts-endpoint-failedreason)
     *
     * @param failedReason The failure reason, if any, for a create or delete endpoint operation.
     */
    public fun failedReason(failedReason: IResolvable) {
        cdkBuilder.failedReason(failedReason)
    }

    /**
     * The failure reason, if any, for a create or delete endpoint operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-endpoint.html#cfn-s3outposts-endpoint-failedreason)
     *
     * @param failedReason The failure reason, if any, for a create or delete endpoint operation.
     */
    public fun failedReason(failedReason: CfnEndpoint.FailedReasonProperty) {
        cdkBuilder.failedReason(failedReason)
    }

    /**
     * The ID of the Outpost.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-endpoint.html#cfn-s3outposts-endpoint-outpostid)
     *
     * @param outpostId The ID of the Outpost.
     */
    public fun outpostId(outpostId: String) {
        cdkBuilder.outpostId(outpostId)
    }

    /**
     * The ID of the security group used for the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-endpoint.html#cfn-s3outposts-endpoint-securitygroupid)
     *
     * @param securityGroupId The ID of the security group used for the endpoint.
     */
    public fun securityGroupId(securityGroupId: String) {
        cdkBuilder.securityGroupId(securityGroupId)
    }

    /**
     * The ID of the subnet used for the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-endpoint.html#cfn-s3outposts-endpoint-subnetid)
     *
     * @param subnetId The ID of the subnet used for the endpoint.
     */
    public fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
    }

    public fun build(): CfnEndpoint = cdkBuilder.build()
}

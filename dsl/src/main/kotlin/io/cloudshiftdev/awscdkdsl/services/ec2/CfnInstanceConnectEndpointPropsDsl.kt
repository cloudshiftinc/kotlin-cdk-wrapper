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

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnInstanceConnectEndpointProps

/**
 * Properties for defining a `CfnInstanceConnectEndpoint`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnInstanceConnectEndpointProps cfnInstanceConnectEndpointProps =
 * CfnInstanceConnectEndpointProps.builder()
 * .subnetId("subnetId")
 * // the properties below are optional
 * .clientToken("clientToken")
 * .preserveClientIp(false)
 * .securityGroupIds(List.of("securityGroupIds"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instanceconnectendpoint.html)
 */
@CdkDslMarker
public class CfnInstanceConnectEndpointPropsDsl {
    private val cdkBuilder: CfnInstanceConnectEndpointProps.Builder =
        CfnInstanceConnectEndpointProps.builder()

    private val _securityGroupIds: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param clientToken Unique, case-sensitive identifier that you provide to ensure the
     *   idempotency of the request.
     */
    public fun clientToken(clientToken: String) {
        cdkBuilder.clientToken(clientToken)
    }

    /**
     * @param preserveClientIp Indicates whether your client's IP address is preserved as the
     *   source. The value is `true` or `false` .
     * * If `true` , your client's IP address is used when you connect to a resource.
     * * If `false` , the elastic network interface IP address is used when you connect to a
     *   resource.
     *
     * Default: `true`
     */
    public fun preserveClientIp(preserveClientIp: Boolean) {
        cdkBuilder.preserveClientIp(preserveClientIp)
    }

    /**
     * @param preserveClientIp Indicates whether your client's IP address is preserved as the
     *   source. The value is `true` or `false` .
     * * If `true` , your client's IP address is used when you connect to a resource.
     * * If `false` , the elastic network interface IP address is used when you connect to a
     *   resource.
     *
     * Default: `true`
     */
    public fun preserveClientIp(preserveClientIp: IResolvable) {
        cdkBuilder.preserveClientIp(preserveClientIp)
    }

    /**
     * @param securityGroupIds One or more security groups to associate with the endpoint. If you
     *   don't specify a security group, the default security group for your VPC will be associated
     *   with the endpoint.
     */
    public fun securityGroupIds(vararg securityGroupIds: String) {
        _securityGroupIds.addAll(listOf(*securityGroupIds))
    }

    /**
     * @param securityGroupIds One or more security groups to associate with the endpoint. If you
     *   don't specify a security group, the default security group for your VPC will be associated
     *   with the endpoint.
     */
    public fun securityGroupIds(securityGroupIds: Collection<String>) {
        _securityGroupIds.addAll(securityGroupIds)
    }

    /**
     * @param subnetId The ID of the subnet in which to create the EC2 Instance Connect Endpoint.
     */
    public fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
    }

    /** @param tags The tags to apply to the EC2 Instance Connect Endpoint during creation. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags to apply to the EC2 Instance Connect Endpoint during creation. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnInstanceConnectEndpointProps {
        if (_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}

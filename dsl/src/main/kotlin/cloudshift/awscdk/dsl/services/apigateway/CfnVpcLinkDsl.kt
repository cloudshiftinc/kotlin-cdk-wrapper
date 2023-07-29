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

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.apigateway.CfnVpcLink
import software.constructs.Construct

/**
 * The `AWS::ApiGateway::VpcLink` resource creates an API Gateway VPC link for a REST API to access
 * resources in an Amazon Virtual Private Cloud (VPC).
 *
 * For more information, see
 * [vpclink:create](https://docs.aws.amazon.com/apigateway/latest/api/API_CreateVpcLink.html) in the
 * `Amazon API Gateway REST API Reference` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigateway.*;
 * CfnVpcLink cfnVpcLink = CfnVpcLink.Builder.create(this, "MyCfnVpcLink")
 * .name("name")
 * .targetArns(List.of("targetArns"))
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-vpclink.html)
 */
@CdkDslMarker
public class CfnVpcLinkDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnVpcLink.Builder = CfnVpcLink.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _targetArns: MutableList<String> = mutableListOf()

    /**
     * The description of the VPC link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-vpclink.html#cfn-apigateway-vpclink-description)
     *
     * @param description The description of the VPC link.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The name used to label and identify the VPC link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-vpclink.html#cfn-apigateway-vpclink-name)
     *
     * @param name The name used to label and identify the VPC link.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * An array of arbitrary tags (key-value pairs) to associate with the VPC link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-vpclink.html#cfn-apigateway-vpclink-tags)
     *
     * @param tags An array of arbitrary tags (key-value pairs) to associate with the VPC link.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An array of arbitrary tags (key-value pairs) to associate with the VPC link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-vpclink.html#cfn-apigateway-vpclink-tags)
     *
     * @param tags An array of arbitrary tags (key-value pairs) to associate with the VPC link.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The ARN of the network load balancer of the VPC targeted by the VPC link.
     *
     * The network load balancer must be owned by the same AWS account of the API owner.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-vpclink.html#cfn-apigateway-vpclink-targetarns)
     *
     * @param targetArns The ARN of the network load balancer of the VPC targeted by the VPC link.
     */
    public fun targetArns(vararg targetArns: String) {
        _targetArns.addAll(listOf(*targetArns))
    }

    /**
     * The ARN of the network load balancer of the VPC targeted by the VPC link.
     *
     * The network load balancer must be owned by the same AWS account of the API owner.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-vpclink.html#cfn-apigateway-vpclink-targetarns)
     *
     * @param targetArns The ARN of the network load balancer of the VPC targeted by the VPC link.
     */
    public fun targetArns(targetArns: Collection<String>) {
        _targetArns.addAll(targetArns)
    }

    public fun build(): CfnVpcLink {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_targetArns.isNotEmpty()) cdkBuilder.targetArns(_targetArns)
        return cdkBuilder.build()
    }
}

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

package io.cloudshiftdev.awscdkdsl.services.route53resolver

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.route53resolver.CfnOutpostResolver
import software.constructs.Construct

/**
 * Creates a Amazon Route 53 Resolver on an Outpost.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.route53resolver.*;
 * CfnOutpostResolver cfnOutpostResolver = CfnOutpostResolver.Builder.create(this,
 * "MyCfnOutpostResolver")
 * .name("name")
 * .outpostArn("outpostArn")
 * .preferredInstanceType("preferredInstanceType")
 * // the properties below are optional
 * .instanceCount(123)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-outpostresolver.html)
 */
@CdkDslMarker
public class CfnOutpostResolverDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnOutpostResolver.Builder =
        CfnOutpostResolver.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * Amazon EC2 instance count for the Resolver on the Outpost.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-outpostresolver.html#cfn-route53resolver-outpostresolver-instancecount)
     *
     * @param instanceCount Amazon EC2 instance count for the Resolver on the Outpost.
     */
    public fun instanceCount(instanceCount: Number) {
        cdkBuilder.instanceCount(instanceCount)
    }

    /**
     * Name of the Resolver.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-outpostresolver.html#cfn-route53resolver-outpostresolver-name)
     *
     * @param name Name of the Resolver.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The ARN (Amazon Resource Name) for the Outpost.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-outpostresolver.html#cfn-route53resolver-outpostresolver-outpostarn)
     *
     * @param outpostArn The ARN (Amazon Resource Name) for the Outpost.
     */
    public fun outpostArn(outpostArn: String) {
        cdkBuilder.outpostArn(outpostArn)
    }

    /**
     * The Amazon EC2 instance type.
     *
     * If you specify this, you must also specify a value for the `OutpostArn` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-outpostresolver.html#cfn-route53resolver-outpostresolver-preferredinstancetype)
     *
     * @param preferredInstanceType The Amazon EC2 instance type.
     */
    public fun preferredInstanceType(preferredInstanceType: String) {
        cdkBuilder.preferredInstanceType(preferredInstanceType)
    }

    /**
     * A key value pair that helps you identify a Route 53 Resolver .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-outpostresolver.html#cfn-route53resolver-outpostresolver-tags)
     *
     * @param tags A key value pair that helps you identify a Route 53 Resolver .
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * A key value pair that helps you identify a Route 53 Resolver .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-outpostresolver.html#cfn-route53resolver-outpostresolver-tags)
     *
     * @param tags A key value pair that helps you identify a Route 53 Resolver .
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnOutpostResolver {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}

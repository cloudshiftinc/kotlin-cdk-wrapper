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
import software.amazon.awscdk.services.route53resolver.CfnOutpostResolverProps

/**
 * Properties for defining a `CfnOutpostResolver`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.route53resolver.*;
 * CfnOutpostResolverProps cfnOutpostResolverProps = CfnOutpostResolverProps.builder()
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
public class CfnOutpostResolverPropsDsl {
    private val cdkBuilder: CfnOutpostResolverProps.Builder = CfnOutpostResolverProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param instanceCount Amazon EC2 instance count for the Resolver on the Outpost. */
    public fun instanceCount(instanceCount: Number) {
        cdkBuilder.instanceCount(instanceCount)
    }

    /** @param name Name of the Resolver. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param outpostArn The ARN (Amazon Resource Name) for the Outpost. */
    public fun outpostArn(outpostArn: String) {
        cdkBuilder.outpostArn(outpostArn)
    }

    /**
     * @param preferredInstanceType The Amazon EC2 instance type. If you specify this, you must also
     *   specify a value for the `OutpostArn` .
     */
    public fun preferredInstanceType(preferredInstanceType: String) {
        cdkBuilder.preferredInstanceType(preferredInstanceType)
    }

    /** @param tags A key value pair that helps you identify a Route 53 Resolver . */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags A key value pair that helps you identify a Route 53 Resolver . */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnOutpostResolverProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}

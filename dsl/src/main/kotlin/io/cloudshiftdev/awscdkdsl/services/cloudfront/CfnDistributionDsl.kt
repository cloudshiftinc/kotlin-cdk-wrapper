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

package io.cloudshiftdev.awscdkdsl.services.cloudfront

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnDistribution
import software.constructs.Construct

/**
 * A distribution tells CloudFront where you want content to be delivered from, and the details
 * about how to track and manage content delivery.
 *
 * Example:
 * ```
 * Bucket sourceBucket;
 * Distribution myDistribution = Distribution.Builder.create(this, "MyCfWebDistribution")
 * .defaultBehavior(BehaviorOptions.builder()
 * .origin(new S3Origin(sourceBucket))
 * .build())
 * .build();
 * CfnDistribution cfnDistribution = (CfnDistribution)myDistribution.getNode().getDefaultChild();
 * cfnDistribution.overrideLogicalId("MyDistributionCFDistribution3H55TI9Q");
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distribution.html)
 */
@CdkDslMarker
public class CfnDistributionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDistribution.Builder = CfnDistribution.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The distribution's configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distribution.html#cfn-cloudfront-distribution-distributionconfig)
     *
     * @param distributionConfig The distribution's configuration.
     */
    public fun distributionConfig(distributionConfig: IResolvable) {
        cdkBuilder.distributionConfig(distributionConfig)
    }

    /**
     * The distribution's configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distribution.html#cfn-cloudfront-distribution-distributionconfig)
     *
     * @param distributionConfig The distribution's configuration.
     */
    public fun distributionConfig(distributionConfig: CfnDistribution.DistributionConfigProperty) {
        cdkBuilder.distributionConfig(distributionConfig)
    }

    /**
     * A complex type that contains zero or more `Tag` elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distribution.html#cfn-cloudfront-distribution-tags)
     *
     * @param tags A complex type that contains zero or more `Tag` elements.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * A complex type that contains zero or more `Tag` elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distribution.html#cfn-cloudfront-distribution-tags)
     *
     * @param tags A complex type that contains zero or more `Tag` elements.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDistribution {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}

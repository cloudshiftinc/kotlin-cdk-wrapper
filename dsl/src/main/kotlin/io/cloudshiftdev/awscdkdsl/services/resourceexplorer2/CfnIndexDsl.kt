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

package io.cloudshiftdev.awscdkdsl.services.resourceexplorer2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.resourceexplorer2.CfnIndex
import software.constructs.Construct

/**
 * Turns on Resource Explorer in the AWS Region in which you called this operation by creating an
 * index.
 *
 * Resource Explorer begins discovering the resources in this Region and stores the details about
 * the resources in the index so that they can be queried by using the
 * [Search](https://docs.aws.amazon.com/resource-explorer/latest/apireference/API_Search.html)
 * operation.
 *
 * You can create either a local index that returns search results from only the AWS Region in which
 * the index exists, or you can create an aggregator index that returns search results from all AWS
 * Regions in the AWS account .
 *
 * For more details about what happens when you turn on Resource Explorer in an AWS Region , see
 * [Turning on Resource Explorer to index your resources in an AWS Region](https://docs.aws.amazon.com/resource-explorer/latest/userguide/manage-service-activate.html)
 * in the *AWS Resource Explorer User Guide.*
 *
 * If this is the first AWS Region in which you've created an index for Resource Explorer, this
 * operation also creates a service-linked role in your AWS account that allows Resource Explorer to
 * search for your resources and populate the index.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.resourceexplorer2.*;
 * CfnIndex cfnIndex = CfnIndex.Builder.create(this, "MyCfnIndex")
 * .type("type")
 * // the properties below are optional
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-index.html)
 */
@CdkDslMarker
public class CfnIndexDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnIndex.Builder = CfnIndex.Builder.create(scope, id)

    /**
     * The specified tags are attached to only the index created in this AWS Region .
     *
     * The tags don't attach to any of the resources listed in the index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-index.html#cfn-resourceexplorer2-index-tags)
     *
     * @param tags The specified tags are attached to only the index created in this AWS Region .
     */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    /**
     * Specifies the type of the index in this Region.
     *
     * For information about the aggregator index and how it differs from a local index, see
     * [Turning on cross-Region search by creating an aggregator index](https://docs.aws.amazon.com/resource-explorer/latest/userguide/manage-aggregator-region.html)
     * in the *AWS Resource Explorer User Guide.* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-index.html#cfn-resourceexplorer2-index-type)
     *
     * @param type Specifies the type of the index in this Region.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnIndex = cdkBuilder.build()
}

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

package io.cloudshiftdev.awscdkdsl.services.s3

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnStorageLensGroup
import software.constructs.Construct

/**
 * The `AWS::S3::StorageLensGroup` resource creates an S3 Storage Lens group.
 *
 * A Storage Lens group is a custom grouping of objects that include filters for prefixes, suffixes,
 * object tags, object size, or object age. You can create an S3 Storage Lens group that includes a
 * single filter or multiple filter conditions. To specify multiple filter conditions, you use `AND`
 * or `OR` logical operators. For more information about S3 Storage Lens groups, see
 * [Working with S3 Storage Lens groups](https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage-lens-groups-overview.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * CfnStorageLensGroup cfnStorageLensGroup = CfnStorageLensGroup.Builder.create(this,
 * "MyCfnStorageLensGroup")
 * .filter(FilterProperty.builder()
 * .and(AndProperty.builder()
 * .matchAnyPrefix(List.of("matchAnyPrefix"))
 * .matchAnySuffix(List.of("matchAnySuffix"))
 * .matchAnyTag(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .matchObjectAge(MatchObjectAgeProperty.builder()
 * .daysGreaterThan(123)
 * .daysLessThan(123)
 * .build())
 * .matchObjectSize(MatchObjectSizeProperty.builder()
 * .bytesGreaterThan(123)
 * .bytesLessThan(123)
 * .build())
 * .build())
 * .matchAnyPrefix(List.of("matchAnyPrefix"))
 * .matchAnySuffix(List.of("matchAnySuffix"))
 * .matchAnyTag(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .matchObjectAge(MatchObjectAgeProperty.builder()
 * .daysGreaterThan(123)
 * .daysLessThan(123)
 * .build())
 * .matchObjectSize(MatchObjectSizeProperty.builder()
 * .bytesGreaterThan(123)
 * .bytesLessThan(123)
 * .build())
 * .or(OrProperty.builder()
 * .matchAnyPrefix(List.of("matchAnyPrefix"))
 * .matchAnySuffix(List.of("matchAnySuffix"))
 * .matchAnyTag(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .matchObjectAge(MatchObjectAgeProperty.builder()
 * .daysGreaterThan(123)
 * .daysLessThan(123)
 * .build())
 * .matchObjectSize(MatchObjectSizeProperty.builder()
 * .bytesGreaterThan(123)
 * .bytesLessThan(123)
 * .build())
 * .build())
 * .build())
 * .name("name")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelensgroup.html)
 */
@CdkDslMarker
public class CfnStorageLensGroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnStorageLensGroup.Builder =
        CfnStorageLensGroup.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * This property contains the criteria for the Storage Lens group data that is displayed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelensgroup.html#cfn-s3-storagelensgroup-filter)
     *
     * @param filter This property contains the criteria for the Storage Lens group data that is
     *   displayed.
     */
    public fun filter(filter: IResolvable) {
        cdkBuilder.filter(filter)
    }

    /**
     * This property contains the criteria for the Storage Lens group data that is displayed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelensgroup.html#cfn-s3-storagelensgroup-filter)
     *
     * @param filter This property contains the criteria for the Storage Lens group data that is
     *   displayed.
     */
    public fun filter(filter: CfnStorageLensGroup.FilterProperty) {
        cdkBuilder.filter(filter)
    }

    /**
     * This property contains the Storage Lens group name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelensgroup.html#cfn-s3-storagelensgroup-name)
     *
     * @param name This property contains the Storage Lens group name.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * This property contains the AWS resource tags that you're adding to your Storage Lens group.
     *
     * This parameter is optional.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelensgroup.html#cfn-s3-storagelensgroup-tags)
     *
     * @param tags This property contains the AWS resource tags that you're adding to your Storage
     *   Lens group.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * This property contains the AWS resource tags that you're adding to your Storage Lens group.
     *
     * This parameter is optional.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelensgroup.html#cfn-s3-storagelensgroup-tags)
     *
     * @param tags This property contains the AWS resource tags that you're adding to your Storage
     *   Lens group.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnStorageLensGroup {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}

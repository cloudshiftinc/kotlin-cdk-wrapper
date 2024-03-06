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
import software.amazon.awscdk.services.s3.CfnStorageLensGroupProps

/**
 * Properties for defining a `CfnStorageLensGroup`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * CfnStorageLensGroupProps cfnStorageLensGroupProps = CfnStorageLensGroupProps.builder()
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
public class CfnStorageLensGroupPropsDsl {
    private val cdkBuilder: CfnStorageLensGroupProps.Builder = CfnStorageLensGroupProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param filter This property contains the criteria for the Storage Lens group data that is
     *   displayed.
     */
    public fun filter(filter: IResolvable) {
        cdkBuilder.filter(filter)
    }

    /**
     * @param filter This property contains the criteria for the Storage Lens group data that is
     *   displayed.
     */
    public fun filter(filter: CfnStorageLensGroup.FilterProperty) {
        cdkBuilder.filter(filter)
    }

    /** @param name This property contains the Storage Lens group name. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param tags This property contains the AWS resource tags that you're adding to your Storage
     *   Lens group. This parameter is optional.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags This property contains the AWS resource tags that you're adding to your Storage
     *   Lens group. This parameter is optional.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnStorageLensGroupProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}

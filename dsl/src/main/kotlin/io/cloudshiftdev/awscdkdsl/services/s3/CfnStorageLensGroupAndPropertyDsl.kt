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

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnStorageLensGroup

/**
 * This resource is a logical operator that allows multiple filter conditions to be joined for more
 * complex comparisons of Storage Lens group data.
 *
 * Objects must match all of the listed filter conditions that are joined by the `And` logical
 * operator. Only one of each filter condition is allowed.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * AndProperty andProperty = AndProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-and.html)
 */
@CdkDslMarker
public class CfnStorageLensGroupAndPropertyDsl {
    private val cdkBuilder: CfnStorageLensGroup.AndProperty.Builder =
        CfnStorageLensGroup.AndProperty.builder()

    private val _matchAnyPrefix: MutableList<String> = mutableListOf()

    private val _matchAnySuffix: MutableList<String> = mutableListOf()

    private val _matchAnyTag: MutableList<Any> = mutableListOf()

    /**
     * @param matchAnyPrefix This property contains a list of prefixes. At least one prefix must be
     *   specified. Up to 10 prefixes are allowed.
     */
    public fun matchAnyPrefix(vararg matchAnyPrefix: String) {
        _matchAnyPrefix.addAll(listOf(*matchAnyPrefix))
    }

    /**
     * @param matchAnyPrefix This property contains a list of prefixes. At least one prefix must be
     *   specified. Up to 10 prefixes are allowed.
     */
    public fun matchAnyPrefix(matchAnyPrefix: Collection<String>) {
        _matchAnyPrefix.addAll(matchAnyPrefix)
    }

    /**
     * @param matchAnySuffix This property contains a list of suffixes. At least one suffix must be
     *   specified. Up to 10 suffixes are allowed.
     */
    public fun matchAnySuffix(vararg matchAnySuffix: String) {
        _matchAnySuffix.addAll(listOf(*matchAnySuffix))
    }

    /**
     * @param matchAnySuffix This property contains a list of suffixes. At least one suffix must be
     *   specified. Up to 10 suffixes are allowed.
     */
    public fun matchAnySuffix(matchAnySuffix: Collection<String>) {
        _matchAnySuffix.addAll(matchAnySuffix)
    }

    /**
     * @param matchAnyTag This property contains the list of object tags. At least one object tag
     *   must be specified. Up to 10 object tags are allowed.
     */
    public fun matchAnyTag(vararg matchAnyTag: Any) {
        _matchAnyTag.addAll(listOf(*matchAnyTag))
    }

    /**
     * @param matchAnyTag This property contains the list of object tags. At least one object tag
     *   must be specified. Up to 10 object tags are allowed.
     */
    public fun matchAnyTag(matchAnyTag: Collection<Any>) {
        _matchAnyTag.addAll(matchAnyTag)
    }

    /**
     * @param matchAnyTag This property contains the list of object tags. At least one object tag
     *   must be specified. Up to 10 object tags are allowed.
     */
    public fun matchAnyTag(matchAnyTag: IResolvable) {
        cdkBuilder.matchAnyTag(matchAnyTag)
    }

    /**
     * @param matchObjectAge This property contains `DaysGreaterThan` and `DaysLessThan` properties
     *   to define the object age range (minimum and maximum number of days).
     */
    public fun matchObjectAge(matchObjectAge: IResolvable) {
        cdkBuilder.matchObjectAge(matchObjectAge)
    }

    /**
     * @param matchObjectAge This property contains `DaysGreaterThan` and `DaysLessThan` properties
     *   to define the object age range (minimum and maximum number of days).
     */
    public fun matchObjectAge(matchObjectAge: CfnStorageLensGroup.MatchObjectAgeProperty) {
        cdkBuilder.matchObjectAge(matchObjectAge)
    }

    /**
     * @param matchObjectSize This property contains `BytesGreaterThan` and `BytesLessThan` to
     *   define the object size range (minimum and maximum number of Bytes).
     */
    public fun matchObjectSize(matchObjectSize: IResolvable) {
        cdkBuilder.matchObjectSize(matchObjectSize)
    }

    /**
     * @param matchObjectSize This property contains `BytesGreaterThan` and `BytesLessThan` to
     *   define the object size range (minimum and maximum number of Bytes).
     */
    public fun matchObjectSize(matchObjectSize: CfnStorageLensGroup.MatchObjectSizeProperty) {
        cdkBuilder.matchObjectSize(matchObjectSize)
    }

    public fun build(): CfnStorageLensGroup.AndProperty {
        if (_matchAnyPrefix.isNotEmpty()) cdkBuilder.matchAnyPrefix(_matchAnyPrefix)
        if (_matchAnySuffix.isNotEmpty()) cdkBuilder.matchAnySuffix(_matchAnySuffix)
        if (_matchAnyTag.isNotEmpty()) cdkBuilder.matchAnyTag(_matchAnyTag)
        return cdkBuilder.build()
    }
}

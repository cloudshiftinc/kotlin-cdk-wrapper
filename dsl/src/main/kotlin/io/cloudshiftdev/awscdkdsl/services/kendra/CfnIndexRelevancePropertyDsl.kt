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

package io.cloudshiftdev.awscdkdsl.services.kendra

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnIndex

/**
 * Provides information for tuning the relevance of a field in a search.
 *
 * When a query includes terms that match the field, the results are given a boost in the response
 * based on these tuning parameters.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kendra.*;
 * RelevanceProperty relevanceProperty = RelevanceProperty.builder()
 * .duration("duration")
 * .freshness(false)
 * .importance(123)
 * .rankOrder("rankOrder")
 * .valueImportanceItems(List.of(ValueImportanceItemProperty.builder()
 * .key("key")
 * .value(123)
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-relevance.html)
 */
@CdkDslMarker
public class CfnIndexRelevancePropertyDsl {
    private val cdkBuilder: CfnIndex.RelevanceProperty.Builder =
        CfnIndex.RelevanceProperty.builder()

    private val _valueImportanceItems: MutableList<Any> = mutableListOf()

    /**
     * @param duration Specifies the time period that the boost applies to. For example, to make the
     *   boost apply to documents with the field value within the last month, you would use
     *   "2628000s". Once the field value is beyond the specified range, the effect of the boost
     *   drops off. The higher the importance, the faster the effect drops off. If you don't specify
     *   a value, the default is 3 months. The value of the field is a numeric string followed by
     *   the character "s", for example "86400s" for one day, or "604800s" for one week.
     *
     * Only applies to `DATE` fields.
     */
    public fun duration(duration: String) {
        cdkBuilder.duration(duration)
    }

    /**
     * @param freshness Indicates that this field determines how "fresh" a document is. For example,
     *   if document 1 was created on November 5, and document 2 was created on October 31, document
     *   1 is "fresher" than document 2. You can only set the `Freshness` field on one `DATE` type
     *   field. Only applies to `DATE` fields.
     */
    public fun freshness(freshness: Boolean) {
        cdkBuilder.freshness(freshness)
    }

    /**
     * @param freshness Indicates that this field determines how "fresh" a document is. For example,
     *   if document 1 was created on November 5, and document 2 was created on October 31, document
     *   1 is "fresher" than document 2. You can only set the `Freshness` field on one `DATE` type
     *   field. Only applies to `DATE` fields.
     */
    public fun freshness(freshness: IResolvable) {
        cdkBuilder.freshness(freshness)
    }

    /**
     * @param importance The relative importance of the field in the search. Larger numbers provide
     *   more of a boost than smaller numbers.
     */
    public fun importance(importance: Number) {
        cdkBuilder.importance(importance)
    }

    /**
     * @param rankOrder Determines how values should be interpreted. When the `RankOrder` field is
     *   `ASCENDING` , higher numbers are better. For example, a document with a rating score of 10
     *   is higher ranking than a document with a rating score of 1.
     *
     * When the `RankOrder` field is `DESCENDING` , lower numbers are better. For example, in a task
     * tracking application, a priority 1 task is more important than a priority 5 task.
     *
     * Only applies to `LONG` and `DOUBLE` fields.
     */
    public fun rankOrder(rankOrder: String) {
        cdkBuilder.rankOrder(rankOrder)
    }

    /**
     * @param valueImportanceItems An array of key-value pairs for different boosts when they appear
     *   in the search result list. For example, if you want to boost query terms that match the
     *   "department" field in the result, query terms that match this field are boosted in the
     *   result. You can add entries from the department field to boost documents with those values
     *   higher.
     *
     * For example, you can add entries to the map with names of departments. If you add "HR", 5 and
     * "Legal",3 those departments are given special attention when they appear in the metadata of a
     * document.
     */
    public fun valueImportanceItems(vararg valueImportanceItems: Any) {
        _valueImportanceItems.addAll(listOf(*valueImportanceItems))
    }

    /**
     * @param valueImportanceItems An array of key-value pairs for different boosts when they appear
     *   in the search result list. For example, if you want to boost query terms that match the
     *   "department" field in the result, query terms that match this field are boosted in the
     *   result. You can add entries from the department field to boost documents with those values
     *   higher.
     *
     * For example, you can add entries to the map with names of departments. If you add "HR", 5 and
     * "Legal",3 those departments are given special attention when they appear in the metadata of a
     * document.
     */
    public fun valueImportanceItems(valueImportanceItems: Collection<Any>) {
        _valueImportanceItems.addAll(valueImportanceItems)
    }

    /**
     * @param valueImportanceItems An array of key-value pairs for different boosts when they appear
     *   in the search result list. For example, if you want to boost query terms that match the
     *   "department" field in the result, query terms that match this field are boosted in the
     *   result. You can add entries from the department field to boost documents with those values
     *   higher.
     *
     * For example, you can add entries to the map with names of departments. If you add "HR", 5 and
     * "Legal",3 those departments are given special attention when they appear in the metadata of a
     * document.
     */
    public fun valueImportanceItems(valueImportanceItems: IResolvable) {
        cdkBuilder.valueImportanceItems(valueImportanceItems)
    }

    public fun build(): CfnIndex.RelevanceProperty {
        if (_valueImportanceItems.isNotEmpty())
            cdkBuilder.valueImportanceItems(_valueImportanceItems)
        return cdkBuilder.build()
    }
}

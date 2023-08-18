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

package io.cloudshiftdev.awscdkdsl.services.sns

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.sns.StringConditions

/**
 * Conditions that can be applied to string attributes.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.lambda.*;
 * Function fn;
 * Topic myTopic = new Topic(this, "MyTopic");
 * // Lambda should receive only message matching the following conditions on attributes:
 * // color: 'red' or 'orange' or begins with 'bl'
 * // size: anything but 'small' or 'medium'
 * // price: between 100 and 200 or greater than 300
 * // store: attribute must be present
 * myTopic.addSubscription(LambdaSubscription.Builder.create(fn)
 * .filterPolicy(Map.of(
 * "color", SubscriptionFilter.stringFilter(StringConditions.builder()
 * .allowlist(List.of("red", "orange"))
 * .matchPrefixes(List.of("bl"))
 * .build()),
 * "size", SubscriptionFilter.stringFilter(StringConditions.builder()
 * .denylist(List.of("small", "medium"))
 * .build()),
 * "price", SubscriptionFilter.numericFilter(NumericConditions.builder()
 * .between(BetweenCondition.builder().start(100).stop(200).build())
 * .greaterThan(300)
 * .build()),
 * "store", SubscriptionFilter.existsFilter()))
 * .build());
 * ```
 */
@CdkDslMarker
public class StringConditionsDsl {
    private val cdkBuilder: StringConditions.Builder = StringConditions.builder()

    private val _allowlist: MutableList<String> = mutableListOf()

    private val _denylist: MutableList<String> = mutableListOf()

    private val _matchPrefixes: MutableList<String> = mutableListOf()

    /** @param allowlist Match one or more values. */
    public fun allowlist(vararg allowlist: String) {
        _allowlist.addAll(listOf(*allowlist))
    }

    /** @param allowlist Match one or more values. */
    public fun allowlist(allowlist: Collection<String>) {
        _allowlist.addAll(allowlist)
    }

    /** @param denylist Match any value that doesn't include any of the specified values. */
    public fun denylist(vararg denylist: String) {
        _denylist.addAll(listOf(*denylist))
    }

    /** @param denylist Match any value that doesn't include any of the specified values. */
    public fun denylist(denylist: Collection<String>) {
        _denylist.addAll(denylist)
    }

    /** @param matchPrefixes Matches values that begins with the specified prefixes. */
    public fun matchPrefixes(vararg matchPrefixes: String) {
        _matchPrefixes.addAll(listOf(*matchPrefixes))
    }

    /** @param matchPrefixes Matches values that begins with the specified prefixes. */
    public fun matchPrefixes(matchPrefixes: Collection<String>) {
        _matchPrefixes.addAll(matchPrefixes)
    }

    public fun build(): StringConditions {
        if (_allowlist.isNotEmpty()) cdkBuilder.allowlist(_allowlist)
        if (_denylist.isNotEmpty()) cdkBuilder.denylist(_denylist)
        if (_matchPrefixes.isNotEmpty()) cdkBuilder.matchPrefixes(_matchPrefixes)
        return cdkBuilder.build()
    }
}

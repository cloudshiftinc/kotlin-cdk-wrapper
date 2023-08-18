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

package io.cloudshiftdev.awscdkdsl.services.cloudtrail

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudtrail.CfnEventDataStore

/**
 * Advanced event selectors let you create fine-grained selectors for the following AWS CloudTrail
 * event record ﬁelds.
 *
 * They help you control costs by logging only those events that are important to you. For more
 * information about advanced event selectors, see
 * [Logging data events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html)
 * in the *AWS CloudTrail User Guide* .
 * * `readOnly`
 * * `eventSource`
 * * `eventName`
 * * `eventCategory`
 * * `resources.type`
 * * `resources.ARN`
 *
 * You cannot apply both event selectors and advanced event selectors to a trail.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudtrail.*;
 * AdvancedEventSelectorProperty advancedEventSelectorProperty =
 * AdvancedEventSelectorProperty.builder()
 * .fieldSelectors(List.of(AdvancedFieldSelectorProperty.builder()
 * .field("field")
 * // the properties below are optional
 * .endsWith(List.of("endsWith"))
 * .equalTo(List.of("equalTo"))
 * .notEndsWith(List.of("notEndsWith"))
 * .notEquals(List.of("notEquals"))
 * .notStartsWith(List.of("notStartsWith"))
 * .startsWith(List.of("startsWith"))
 * .build()))
 * // the properties below are optional
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-eventdatastore-advancedeventselector.html)
 */
@CdkDslMarker
public class CfnEventDataStoreAdvancedEventSelectorPropertyDsl {
    private val cdkBuilder: CfnEventDataStore.AdvancedEventSelectorProperty.Builder =
        CfnEventDataStore.AdvancedEventSelectorProperty.builder()

    private val _fieldSelectors: MutableList<Any> = mutableListOf()

    /** @param fieldSelectors Contains all selector statements in an advanced event selector. */
    public fun fieldSelectors(vararg fieldSelectors: Any) {
        _fieldSelectors.addAll(listOf(*fieldSelectors))
    }

    /** @param fieldSelectors Contains all selector statements in an advanced event selector. */
    public fun fieldSelectors(fieldSelectors: Collection<Any>) {
        _fieldSelectors.addAll(fieldSelectors)
    }

    /** @param fieldSelectors Contains all selector statements in an advanced event selector. */
    public fun fieldSelectors(fieldSelectors: IResolvable) {
        cdkBuilder.fieldSelectors(fieldSelectors)
    }

    /**
     * @param name An optional, descriptive name for an advanced event selector, such as "Log data
     *   events for only two S3 buckets".
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnEventDataStore.AdvancedEventSelectorProperty {
        if (_fieldSelectors.isNotEmpty()) cdkBuilder.fieldSelectors(_fieldSelectors)
        return cdkBuilder.build()
    }
}

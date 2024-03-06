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

package io.cloudshiftdev.awscdkdsl.services.imagebuilder

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy

/**
 * Defines filters that the lifecycle policy uses to determine impacted resource.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.imagebuilder.*;
 * FilterProperty filterProperty = FilterProperty.builder()
 * .type("type")
 * .value(123)
 * // the properties below are optional
 * .retainAtLeast(123)
 * .unit("unit")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-filter.html)
 */
@CdkDslMarker
public class CfnLifecyclePolicyFilterPropertyDsl {
    private val cdkBuilder: CfnLifecyclePolicy.FilterProperty.Builder =
        CfnLifecyclePolicy.FilterProperty.builder()

    /**
     * @param retainAtLeast For age-based filters, this is the number of resources to keep on hand
     *   after the lifecycle `DELETE` action is applied. Impacted resources are only deleted if you
     *   have more than this number of resources. If you have fewer resources than this number, the
     *   impacted resource is not deleted.
     */
    public fun retainAtLeast(retainAtLeast: Number) {
        cdkBuilder.retainAtLeast(retainAtLeast)
    }

    /** @param type Filter resources based on either `age` or `count` . */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    /**
     * @param unit Defines the unit of time that the lifecycle policy uses to determine impacted
     *   resources. This is required for age-based rules.
     */
    public fun unit(unit: String) {
        cdkBuilder.unit(unit)
    }

    /**
     * @param value The number of units for the time period or for the count. For example, a value
     *   of `6` might refer to six months or six AMIs.
     *
     * For count-based filters, this value represents the minimum number of resources to keep on
     * hand. If you have fewer resources than this number, the resource is excluded from lifecycle
     * actions.
     */
    public fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnLifecyclePolicy.FilterProperty = cdkBuilder.build()
}

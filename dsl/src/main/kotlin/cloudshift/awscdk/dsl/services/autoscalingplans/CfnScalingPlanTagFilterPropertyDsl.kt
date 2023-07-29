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

package cloudshift.awscdk.dsl.services.autoscalingplans

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan

/**
 * `TagFilter` is a subproperty of
 * [ApplicationSource](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-applicationsource.html)
 * that specifies a tag for an application source to use with AWS Auto Scaling ( Auto Scaling Plans
 * ).
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.autoscalingplans.*;
 * TagFilterProperty tagFilterProperty = TagFilterProperty.builder()
 * .key("key")
 * // the properties below are optional
 * .values(List.of("values"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-tagfilter.html)
 */
@CdkDslMarker
public class CfnScalingPlanTagFilterPropertyDsl {
    private val cdkBuilder: CfnScalingPlan.TagFilterProperty.Builder =
        CfnScalingPlan.TagFilterProperty.builder()

    private val _values: MutableList<String> = mutableListOf()

    /** @param key The tag key. */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /** @param values The tag values (0 to 20). */
    public fun values(vararg values: String) {
        _values.addAll(listOf(*values))
    }

    /** @param values The tag values (0 to 20). */
    public fun values(values: Collection<String>) {
        _values.addAll(values)
    }

    public fun build(): CfnScalingPlan.TagFilterProperty {
        if (_values.isNotEmpty()) cdkBuilder.values(_values)
        return cdkBuilder.build()
    }
}

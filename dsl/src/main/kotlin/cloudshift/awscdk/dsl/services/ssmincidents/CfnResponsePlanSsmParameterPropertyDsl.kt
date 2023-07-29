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

package cloudshift.awscdk.dsl.services.ssmincidents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ssmincidents.CfnResponsePlan

/**
 * The key-value pair parameters to use when running the automation document.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssmincidents.*;
 * SsmParameterProperty ssmParameterProperty = SsmParameterProperty.builder()
 * .key("key")
 * .values(List.of("values"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-ssmparameter.html)
 */
@CdkDslMarker
public class CfnResponsePlanSsmParameterPropertyDsl {
    private val cdkBuilder: CfnResponsePlan.SsmParameterProperty.Builder =
        CfnResponsePlan.SsmParameterProperty.builder()

    private val _values: MutableList<String> = mutableListOf()

    /** @param key The key parameter to use when running the automation document. */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /** @param values The value parameter to use when running the automation document. */
    public fun values(vararg values: String) {
        _values.addAll(listOf(*values))
    }

    /** @param values The value parameter to use when running the automation document. */
    public fun values(values: Collection<String>) {
        _values.addAll(values)
    }

    public fun build(): CfnResponsePlan.SsmParameterProperty {
        if (_values.isNotEmpty()) cdkBuilder.values(_values)
        return cdkBuilder.build()
    }
}

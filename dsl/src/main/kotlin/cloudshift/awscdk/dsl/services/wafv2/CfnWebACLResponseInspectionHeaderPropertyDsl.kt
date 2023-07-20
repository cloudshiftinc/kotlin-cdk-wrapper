@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.wafv2.CfnWebACL
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnWebACLResponseInspectionHeaderPropertyDsl {
    private val cdkBuilder: CfnWebACL.ResponseInspectionHeaderProperty.Builder =
        CfnWebACL.ResponseInspectionHeaderProperty.builder()

    private val _failureValues: MutableList<String> = mutableListOf()

    private val _successValues: MutableList<String> = mutableListOf()

    public fun failureValues(vararg failureValues: String) {
        _failureValues.addAll(listOf(*failureValues))
    }

    public fun failureValues(failureValues: Collection<String>) {
        _failureValues.addAll(failureValues)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun successValues(vararg successValues: String) {
        _successValues.addAll(listOf(*successValues))
    }

    public fun successValues(successValues: Collection<String>) {
        _successValues.addAll(successValues)
    }

    public fun build(): CfnWebACL.ResponseInspectionHeaderProperty {
        if (_failureValues.isNotEmpty()) cdkBuilder.failureValues(_failureValues)
        if (_successValues.isNotEmpty()) cdkBuilder.successValues(_successValues)
        return cdkBuilder.build()
    }
}

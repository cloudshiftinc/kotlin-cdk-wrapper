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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnWebACL
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnWebACLResponseInspectionStatusCodePropertyDsl {
    private val cdkBuilder: CfnWebACL.ResponseInspectionStatusCodeProperty.Builder =
        CfnWebACL.ResponseInspectionStatusCodeProperty.builder()

    private val _failureCodes: MutableList<Number> = mutableListOf()

    private val _successCodes: MutableList<Number> = mutableListOf()

    public fun failureCodes(vararg failureCodes: Number) {
        _failureCodes.addAll(listOf(*failureCodes))
    }

    public fun failureCodes(failureCodes: Collection<Number>) {
        _failureCodes.addAll(failureCodes)
    }

    public fun failureCodes(failureCodes: IResolvable) {
        cdkBuilder.failureCodes(failureCodes)
    }

    public fun successCodes(vararg successCodes: Number) {
        _successCodes.addAll(listOf(*successCodes))
    }

    public fun successCodes(successCodes: Collection<Number>) {
        _successCodes.addAll(successCodes)
    }

    public fun successCodes(successCodes: IResolvable) {
        cdkBuilder.successCodes(successCodes)
    }

    public fun build(): CfnWebACL.ResponseInspectionStatusCodeProperty {
        if (_failureCodes.isNotEmpty()) cdkBuilder.failureCodes(_failureCodes)
        if (_successCodes.isNotEmpty()) cdkBuilder.successCodes(_successCodes)
        return cdkBuilder.build()
    }
}

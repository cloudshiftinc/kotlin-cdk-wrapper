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

package cloudshift.awscdk.dsl.services.macie

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.macie.CfnFindingsFilter
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnFindingsFilterCriterionAdditionalPropertiesPropertyDsl {
    private val cdkBuilder: CfnFindingsFilter.CriterionAdditionalPropertiesProperty.Builder =
        CfnFindingsFilter.CriterionAdditionalPropertiesProperty.builder()

    private val _eq: MutableList<String> = mutableListOf()

    private val _neq: MutableList<String> = mutableListOf()

    public fun eq(vararg eq: String) {
        _eq.addAll(listOf(*eq))
    }

    public fun eq(eq: Collection<String>) {
        _eq.addAll(eq)
    }

    public fun gt(gt: Number) {
        cdkBuilder.gt(gt)
    }

    public fun gte(gte: Number) {
        cdkBuilder.gte(gte)
    }

    public fun lt(lt: Number) {
        cdkBuilder.lt(lt)
    }

    public fun lte(lte: Number) {
        cdkBuilder.lte(lte)
    }

    public fun neq(vararg neq: String) {
        _neq.addAll(listOf(*neq))
    }

    public fun neq(neq: Collection<String>) {
        _neq.addAll(neq)
    }

    public fun build(): CfnFindingsFilter.CriterionAdditionalPropertiesProperty {
        if (_eq.isNotEmpty()) cdkBuilder.eq(_eq)
        if (_neq.isNotEmpty()) cdkBuilder.neq(_neq)
        return cdkBuilder.build()
    }
}

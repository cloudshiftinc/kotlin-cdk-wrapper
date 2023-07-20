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

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.codebuild.CfnProject
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnProjectBatchRestrictionsPropertyDsl {
    private val cdkBuilder: CfnProject.BatchRestrictionsProperty.Builder =
        CfnProject.BatchRestrictionsProperty.builder()

    private val _computeTypesAllowed: MutableList<String> = mutableListOf()

    public fun computeTypesAllowed(vararg computeTypesAllowed: String) {
        _computeTypesAllowed.addAll(listOf(*computeTypesAllowed))
    }

    public fun computeTypesAllowed(computeTypesAllowed: Collection<String>) {
        _computeTypesAllowed.addAll(computeTypesAllowed)
    }

    public fun maximumBuildsAllowed(maximumBuildsAllowed: Number) {
        cdkBuilder.maximumBuildsAllowed(maximumBuildsAllowed)
    }

    public fun build(): CfnProject.BatchRestrictionsProperty {
        if (_computeTypesAllowed.isNotEmpty()) cdkBuilder.computeTypesAllowed(_computeTypesAllowed)
        return cdkBuilder.build()
    }
}

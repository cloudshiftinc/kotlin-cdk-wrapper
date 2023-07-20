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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.macie.CfnFindingsFilter
import software.constructs.Construct
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnFindingsFilterDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnFindingsFilter.Builder = CfnFindingsFilter.Builder.create(scope, id)

    public fun action(action: String) {
        cdkBuilder.action(action)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun findingCriteria(findingCriteria: IResolvable) {
        cdkBuilder.findingCriteria(findingCriteria)
    }

    public fun findingCriteria(findingCriteria: CfnFindingsFilter.FindingCriteriaProperty) {
        cdkBuilder.findingCriteria(findingCriteria)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun position(position: Number) {
        cdkBuilder.position(position)
    }

    public fun build(): CfnFindingsFilter = cdkBuilder.build()
}

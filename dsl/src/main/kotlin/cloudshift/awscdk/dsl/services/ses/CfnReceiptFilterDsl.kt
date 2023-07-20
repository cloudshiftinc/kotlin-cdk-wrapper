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

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ses.CfnReceiptFilter
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnReceiptFilterDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnReceiptFilter.Builder = CfnReceiptFilter.Builder.create(scope, id)

    public fun filter(filter: IResolvable) {
        cdkBuilder.filter(filter)
    }

    public fun filter(filter: CfnReceiptFilter.FilterProperty) {
        cdkBuilder.filter(filter)
    }

    public fun build(): CfnReceiptFilter = cdkBuilder.build()
}

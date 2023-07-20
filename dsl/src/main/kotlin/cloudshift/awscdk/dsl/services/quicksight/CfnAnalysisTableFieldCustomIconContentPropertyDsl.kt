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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.String

@CdkDslMarker
public class CfnAnalysisTableFieldCustomIconContentPropertyDsl {
    private val cdkBuilder: CfnAnalysis.TableFieldCustomIconContentProperty.Builder =
        CfnAnalysis.TableFieldCustomIconContentProperty.builder()

    public fun icon(icon: String) {
        cdkBuilder.icon(icon)
    }

    public fun build(): CfnAnalysis.TableFieldCustomIconContentProperty = cdkBuilder.build()
}

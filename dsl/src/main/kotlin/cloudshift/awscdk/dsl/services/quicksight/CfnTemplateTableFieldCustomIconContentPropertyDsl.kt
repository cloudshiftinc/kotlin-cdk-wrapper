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
import software.amazon.awscdk.services.quicksight.CfnTemplate
import kotlin.String

@CdkDslMarker
public class CfnTemplateTableFieldCustomIconContentPropertyDsl {
    private val cdkBuilder: CfnTemplate.TableFieldCustomIconContentProperty.Builder =
        CfnTemplate.TableFieldCustomIconContentProperty.builder()

    public fun icon(icon: String) {
        cdkBuilder.icon(icon)
    }

    public fun build(): CfnTemplate.TableFieldCustomIconContentProperty = cdkBuilder.build()
}

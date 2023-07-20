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
public class CfnTemplateDataSetReferencePropertyDsl {
    private val cdkBuilder: CfnTemplate.DataSetReferenceProperty.Builder =
        CfnTemplate.DataSetReferenceProperty.builder()

    public fun dataSetArn(dataSetArn: String) {
        cdkBuilder.dataSetArn(dataSetArn)
    }

    public fun dataSetPlaceholder(dataSetPlaceholder: String) {
        cdkBuilder.dataSetPlaceholder(dataSetPlaceholder)
    }

    public fun build(): CfnTemplate.DataSetReferenceProperty = cdkBuilder.build()
}

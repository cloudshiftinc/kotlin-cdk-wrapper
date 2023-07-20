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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition
import kotlin.Boolean

@CdkDslMarker
public class CfnModelQualityJobDefinitionCsvPropertyDsl {
    private val cdkBuilder: CfnModelQualityJobDefinition.CsvProperty.Builder =
        CfnModelQualityJobDefinition.CsvProperty.builder()

    public fun `header`(`header`: Boolean) {
        cdkBuilder.`header`(`header`)
    }

    public fun `header`(`header`: IResolvable) {
        cdkBuilder.`header`(`header`)
    }

    public fun build(): CfnModelQualityJobDefinition.CsvProperty = cdkBuilder.build()
}

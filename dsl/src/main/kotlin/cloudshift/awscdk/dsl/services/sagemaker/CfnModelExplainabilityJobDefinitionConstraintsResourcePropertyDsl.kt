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
import software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition
import kotlin.String

@CdkDslMarker
public class CfnModelExplainabilityJobDefinitionConstraintsResourcePropertyDsl {
    private val cdkBuilder: CfnModelExplainabilityJobDefinition.ConstraintsResourceProperty.Builder =
        CfnModelExplainabilityJobDefinition.ConstraintsResourceProperty.builder()

    public fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
    }

    public fun build(): CfnModelExplainabilityJobDefinition.ConstraintsResourceProperty =
        cdkBuilder.build()
}

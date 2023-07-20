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
import software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition
import kotlin.String

@CdkDslMarker
public class CfnModelBiasJobDefinitionConstraintsResourcePropertyDsl {
    private val cdkBuilder: CfnModelBiasJobDefinition.ConstraintsResourceProperty.Builder =
        CfnModelBiasJobDefinition.ConstraintsResourceProperty.builder()

    public fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
    }

    public fun build(): CfnModelBiasJobDefinition.ConstraintsResourceProperty = cdkBuilder.build()
}

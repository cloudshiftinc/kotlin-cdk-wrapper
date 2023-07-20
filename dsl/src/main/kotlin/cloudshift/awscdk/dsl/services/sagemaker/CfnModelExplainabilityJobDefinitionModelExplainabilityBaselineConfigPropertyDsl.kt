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
import software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition
import kotlin.String

@CdkDslMarker
public class CfnModelExplainabilityJobDefinitionModelExplainabilityBaselineConfigPropertyDsl {
    private val cdkBuilder:
        CfnModelExplainabilityJobDefinition.ModelExplainabilityBaselineConfigProperty.Builder =
        CfnModelExplainabilityJobDefinition.ModelExplainabilityBaselineConfigProperty.builder()

    public fun baseliningJobName(baseliningJobName: String) {
        cdkBuilder.baseliningJobName(baseliningJobName)
    }

    public fun constraintsResource(constraintsResource: IResolvable) {
        cdkBuilder.constraintsResource(constraintsResource)
    }

    public fun constraintsResource(constraintsResource: CfnModelExplainabilityJobDefinition.ConstraintsResourceProperty) {
        cdkBuilder.constraintsResource(constraintsResource)
    }

    public fun build(): CfnModelExplainabilityJobDefinition.ModelExplainabilityBaselineConfigProperty =
        cdkBuilder.build()
}

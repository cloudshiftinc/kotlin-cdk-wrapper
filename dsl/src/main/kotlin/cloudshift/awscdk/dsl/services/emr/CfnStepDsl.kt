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

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emr.CfnStep
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnStepDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnStep.Builder = CfnStep.Builder.create(scope, id)

    public fun actionOnFailure(actionOnFailure: String) {
        cdkBuilder.actionOnFailure(actionOnFailure)
    }

    public fun hadoopJarStep(hadoopJarStep: IResolvable) {
        cdkBuilder.hadoopJarStep(hadoopJarStep)
    }

    public fun hadoopJarStep(hadoopJarStep: CfnStep.HadoopJarStepConfigProperty) {
        cdkBuilder.hadoopJarStep(hadoopJarStep)
    }

    public fun jobFlowId(jobFlowId: String) {
        cdkBuilder.jobFlowId(jobFlowId)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnStep = cdkBuilder.build()
}

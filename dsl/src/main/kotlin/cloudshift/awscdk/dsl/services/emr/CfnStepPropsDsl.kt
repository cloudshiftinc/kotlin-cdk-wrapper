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
import software.amazon.awscdk.services.emr.CfnStepProps
import kotlin.String

@CdkDslMarker
public class CfnStepPropsDsl {
    private val cdkBuilder: CfnStepProps.Builder = CfnStepProps.builder()

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

    public fun build(): CfnStepProps = cdkBuilder.build()
}

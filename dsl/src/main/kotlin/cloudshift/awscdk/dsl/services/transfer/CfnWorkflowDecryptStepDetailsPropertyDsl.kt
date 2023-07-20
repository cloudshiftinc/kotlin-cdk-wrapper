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

package cloudshift.awscdk.dsl.services.transfer

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.transfer.CfnWorkflow
import kotlin.String

@CdkDslMarker
public class CfnWorkflowDecryptStepDetailsPropertyDsl {
    private val cdkBuilder: CfnWorkflow.DecryptStepDetailsProperty.Builder =
        CfnWorkflow.DecryptStepDetailsProperty.builder()

    public fun destinationFileLocation(destinationFileLocation: IResolvable) {
        cdkBuilder.destinationFileLocation(destinationFileLocation)
    }

    public fun destinationFileLocation(destinationFileLocation: CfnWorkflow.InputFileLocationProperty) {
        cdkBuilder.destinationFileLocation(destinationFileLocation)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun overwriteExisting(overwriteExisting: String) {
        cdkBuilder.overwriteExisting(overwriteExisting)
    }

    public fun sourceFileLocation(sourceFileLocation: String) {
        cdkBuilder.sourceFileLocation(sourceFileLocation)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnWorkflow.DecryptStepDetailsProperty = cdkBuilder.build()
}

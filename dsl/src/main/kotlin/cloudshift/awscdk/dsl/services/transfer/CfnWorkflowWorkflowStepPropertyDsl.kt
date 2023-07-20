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
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.transfer.CfnWorkflow
import kotlin.Any
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class CfnWorkflowWorkflowStepPropertyDsl {
    private val cdkBuilder: CfnWorkflow.WorkflowStepProperty.Builder =
        CfnWorkflow.WorkflowStepProperty.builder()

    public fun copyStepDetails(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.copyStepDetails(builder.map)
    }

    public fun copyStepDetails(copyStepDetails: Any) {
        cdkBuilder.copyStepDetails(copyStepDetails)
    }

    public fun customStepDetails(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.customStepDetails(builder.map)
    }

    public fun customStepDetails(customStepDetails: Any) {
        cdkBuilder.customStepDetails(customStepDetails)
    }

    public fun decryptStepDetails(decryptStepDetails: IResolvable) {
        cdkBuilder.decryptStepDetails(decryptStepDetails)
    }

    public fun decryptStepDetails(decryptStepDetails: CfnWorkflow.DecryptStepDetailsProperty) {
        cdkBuilder.decryptStepDetails(decryptStepDetails)
    }

    public fun deleteStepDetails(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.deleteStepDetails(builder.map)
    }

    public fun deleteStepDetails(deleteStepDetails: Any) {
        cdkBuilder.deleteStepDetails(deleteStepDetails)
    }

    public fun tagStepDetails(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.tagStepDetails(builder.map)
    }

    public fun tagStepDetails(tagStepDetails: Any) {
        cdkBuilder.tagStepDetails(tagStepDetails)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnWorkflow.WorkflowStepProperty = cdkBuilder.build()
}

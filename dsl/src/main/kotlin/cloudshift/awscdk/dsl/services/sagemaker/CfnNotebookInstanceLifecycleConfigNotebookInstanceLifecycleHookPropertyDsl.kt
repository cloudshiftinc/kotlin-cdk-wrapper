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
import software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfig
import kotlin.String

@CdkDslMarker
public class CfnNotebookInstanceLifecycleConfigNotebookInstanceLifecycleHookPropertyDsl {
    private val cdkBuilder:
        CfnNotebookInstanceLifecycleConfig.NotebookInstanceLifecycleHookProperty.Builder =
        CfnNotebookInstanceLifecycleConfig.NotebookInstanceLifecycleHookProperty.builder()

    public fun content(content: String) {
        cdkBuilder.content(content)
    }

    public fun build(): CfnNotebookInstanceLifecycleConfig.NotebookInstanceLifecycleHookProperty =
        cdkBuilder.build()
}

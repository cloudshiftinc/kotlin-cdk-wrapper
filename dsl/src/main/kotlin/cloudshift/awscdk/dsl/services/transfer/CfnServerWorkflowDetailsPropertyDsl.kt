@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.transfer

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.transfer.CfnServer

/**
 * Container for the `WorkflowDetail` data type.
 *
 * It is used by actions that trigger a workflow to begin execution.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.transfer.*;
 * WorkflowDetailsProperty workflowDetailsProperty = WorkflowDetailsProperty.builder()
 * .onPartialUpload(List.of(WorkflowDetailProperty.builder()
 * .executionRole("executionRole")
 * .workflowId("workflowId")
 * .build()))
 * .onUpload(List.of(WorkflowDetailProperty.builder()
 * .executionRole("executionRole")
 * .workflowId("workflowId")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-workflowdetails.html)
 */
@CdkDslMarker
public class CfnServerWorkflowDetailsPropertyDsl {
    private val cdkBuilder: CfnServer.WorkflowDetailsProperty.Builder =
        CfnServer.WorkflowDetailsProperty.builder()

    private val _onPartialUpload: MutableList<Any> = mutableListOf()

    private val _onUpload: MutableList<Any> = mutableListOf()

    /**
     * @param onPartialUpload A trigger that starts a workflow if a file is only partially uploaded.
     *   You can attach a workflow to a server that executes whenever there is a partial upload.
     *
     * A *partial upload* occurs when a file is open when the session disconnects.
     */
    public fun onPartialUpload(vararg onPartialUpload: Any) {
        _onPartialUpload.addAll(listOf(*onPartialUpload))
    }

    /**
     * @param onPartialUpload A trigger that starts a workflow if a file is only partially uploaded.
     *   You can attach a workflow to a server that executes whenever there is a partial upload.
     *
     * A *partial upload* occurs when a file is open when the session disconnects.
     */
    public fun onPartialUpload(onPartialUpload: Collection<Any>) {
        _onPartialUpload.addAll(onPartialUpload)
    }

    /**
     * @param onPartialUpload A trigger that starts a workflow if a file is only partially uploaded.
     *   You can attach a workflow to a server that executes whenever there is a partial upload.
     *
     * A *partial upload* occurs when a file is open when the session disconnects.
     */
    public fun onPartialUpload(onPartialUpload: IResolvable) {
        cdkBuilder.onPartialUpload(onPartialUpload)
    }

    /**
     * @param onUpload A trigger that starts a workflow: the workflow begins to execute after a file
     *   is uploaded. To remove an associated workflow from a server, you can provide an empty
     *   `OnUpload` object, as in the following example.
     *
     * `aws transfer update-server --server-id s-01234567890abcdef --workflow-details
     * '{"OnUpload":[]}'`
     */
    public fun onUpload(vararg onUpload: Any) {
        _onUpload.addAll(listOf(*onUpload))
    }

    /**
     * @param onUpload A trigger that starts a workflow: the workflow begins to execute after a file
     *   is uploaded. To remove an associated workflow from a server, you can provide an empty
     *   `OnUpload` object, as in the following example.
     *
     * `aws transfer update-server --server-id s-01234567890abcdef --workflow-details
     * '{"OnUpload":[]}'`
     */
    public fun onUpload(onUpload: Collection<Any>) {
        _onUpload.addAll(onUpload)
    }

    /**
     * @param onUpload A trigger that starts a workflow: the workflow begins to execute after a file
     *   is uploaded. To remove an associated workflow from a server, you can provide an empty
     *   `OnUpload` object, as in the following example.
     *
     * `aws transfer update-server --server-id s-01234567890abcdef --workflow-details
     * '{"OnUpload":[]}'`
     */
    public fun onUpload(onUpload: IResolvable) {
        cdkBuilder.onUpload(onUpload)
    }

    public fun build(): CfnServer.WorkflowDetailsProperty {
        if (_onPartialUpload.isNotEmpty()) cdkBuilder.onPartialUpload(_onPartialUpload)
        if (_onUpload.isNotEmpty()) cdkBuilder.onUpload(_onUpload)
        return cdkBuilder.build()
    }
}

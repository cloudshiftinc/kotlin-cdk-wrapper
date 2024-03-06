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

package io.cloudshiftdev.awscdkdsl.services.dlm

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy

/**
 * *[Custom snapshot policies that target instances only]* Information about pre and/or post scripts
 * for a snapshot lifecycle policy that targets instances.
 *
 * For more information, see
 * [Automating application-consistent snapshots with pre and post scripts](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/automate-app-consistent-backups.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dlm.*;
 * ScriptProperty scriptProperty = ScriptProperty.builder()
 * .executeOperationOnScriptFailure(false)
 * .executionHandler("executionHandler")
 * .executionHandlerService("executionHandlerService")
 * .executionTimeout(123)
 * .maximumRetryCount(123)
 * .stages(List.of("stages"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-script.html)
 */
@CdkDslMarker
public class CfnLifecyclePolicyScriptPropertyDsl {
    private val cdkBuilder: CfnLifecyclePolicy.ScriptProperty.Builder =
        CfnLifecyclePolicy.ScriptProperty.builder()

    private val _stages: MutableList<String> = mutableListOf()

    /**
     * @param executeOperationOnScriptFailure Indicates whether Amazon Data Lifecycle Manager should
     *   default to crash-consistent snapshots if the pre script fails.
     * * To default to crash consistent snapshot if the pre script fails, specify `true` .
     * * To skip the instance for snapshot creation if the pre script fails, specify `false` .
     *
     * This parameter is supported only if you run a pre script. If you run a post script only, omit
     * this parameter.
     *
     * Default: true
     */
    public fun executeOperationOnScriptFailure(executeOperationOnScriptFailure: Boolean) {
        cdkBuilder.executeOperationOnScriptFailure(executeOperationOnScriptFailure)
    }

    /**
     * @param executeOperationOnScriptFailure Indicates whether Amazon Data Lifecycle Manager should
     *   default to crash-consistent snapshots if the pre script fails.
     * * To default to crash consistent snapshot if the pre script fails, specify `true` .
     * * To skip the instance for snapshot creation if the pre script fails, specify `false` .
     *
     * This parameter is supported only if you run a pre script. If you run a post script only, omit
     * this parameter.
     *
     * Default: true
     */
    public fun executeOperationOnScriptFailure(executeOperationOnScriptFailure: IResolvable) {
        cdkBuilder.executeOperationOnScriptFailure(executeOperationOnScriptFailure)
    }

    /**
     * @param executionHandler The SSM document that includes the pre and/or post scripts to run.
     * * If you are automating VSS backups, specify `AWS_VSS_BACKUP` . In this case, Amazon Data
     *   Lifecycle Manager automatically uses the `AWSEC2-CreateVssSnapshot` SSM document.
     * * If you are automating application-consistent snapshots for SAP HANA workloads, specify
     *   `AWSSystemsManagerSAP-CreateDLMSnapshotForSAPHANA` .
     * * If you are using a custom SSM document that you own, specify either the name or ARN of the
     *   SSM document. If you are using a custom SSM document that is shared with you, specify the
     *   ARN of the SSM document.
     */
    public fun executionHandler(executionHandler: String) {
        cdkBuilder.executionHandler(executionHandler)
    }

    /**
     * @param executionHandlerService Indicates the service used to execute the pre and/or post
     *   scripts.
     * * If you are using custom SSM documents or automating application-consistent snapshots of SAP
     *   HANA workloads, specify `AWS_SYSTEMS_MANAGER` .
     * * If you are automating VSS Backups, omit this parameter.
     *
     * Default: AWS_SYSTEMS_MANAGER
     */
    public fun executionHandlerService(executionHandlerService: String) {
        cdkBuilder.executionHandlerService(executionHandlerService)
    }

    /**
     * @param executionTimeout Specifies a timeout period, in seconds, after which Amazon Data
     *   Lifecycle Manager fails the script run attempt if it has not completed. If a script does
     *   not complete within its timeout period, Amazon Data Lifecycle Manager fails the attempt.
     *   The timeout period applies to the pre and post scripts individually.
     *
     * If you are automating VSS Backups, omit this parameter.
     *
     * Default: 10
     */
    public fun executionTimeout(executionTimeout: Number) {
        cdkBuilder.executionTimeout(executionTimeout)
    }

    /**
     * @param maximumRetryCount Specifies the number of times Amazon Data Lifecycle Manager should
     *   retry scripts that fail.
     * * If the pre script fails, Amazon Data Lifecycle Manager retries the entire snapshot creation
     *   process, including running the pre and post scripts.
     * * If the post script fails, Amazon Data Lifecycle Manager retries the post script only; in
     *   this case, the pre script will have completed and the snapshot might have been created.
     *
     * If you do not want Amazon Data Lifecycle Manager to retry failed scripts, specify `0` .
     *
     * Default: 0
     */
    public fun maximumRetryCount(maximumRetryCount: Number) {
        cdkBuilder.maximumRetryCount(maximumRetryCount)
    }

    /**
     * @param stages Indicate which scripts Amazon Data Lifecycle Manager should run on target
     *   instances. Pre scripts run before Amazon Data Lifecycle Manager initiates snapshot
     *   creation. Post scripts run after Amazon Data Lifecycle Manager initiates snapshot creation.
     * * To run a pre script only, specify `PRE` . In this case, Amazon Data Lifecycle Manager calls
     *   the SSM document with the `pre-script` parameter before initiating snapshot creation.
     * * To run a post script only, specify `POST` . In this case, Amazon Data Lifecycle Manager
     *   calls the SSM document with the `post-script` parameter after initiating snapshot creation.
     * * To run both pre and post scripts, specify both `PRE` and `POST` . In this case, Amazon Data
     *   Lifecycle Manager calls the SSM document with the `pre-script` parameter before initiating
     *   snapshot creation, and then it calls the SSM document again with the `post-script`
     *   parameter after initiating snapshot creation.
     *
     * If you are automating VSS Backups, omit this parameter.
     *
     * Default: PRE and POST
     */
    public fun stages(vararg stages: String) {
        _stages.addAll(listOf(*stages))
    }

    /**
     * @param stages Indicate which scripts Amazon Data Lifecycle Manager should run on target
     *   instances. Pre scripts run before Amazon Data Lifecycle Manager initiates snapshot
     *   creation. Post scripts run after Amazon Data Lifecycle Manager initiates snapshot creation.
     * * To run a pre script only, specify `PRE` . In this case, Amazon Data Lifecycle Manager calls
     *   the SSM document with the `pre-script` parameter before initiating snapshot creation.
     * * To run a post script only, specify `POST` . In this case, Amazon Data Lifecycle Manager
     *   calls the SSM document with the `post-script` parameter after initiating snapshot creation.
     * * To run both pre and post scripts, specify both `PRE` and `POST` . In this case, Amazon Data
     *   Lifecycle Manager calls the SSM document with the `pre-script` parameter before initiating
     *   snapshot creation, and then it calls the SSM document again with the `post-script`
     *   parameter after initiating snapshot creation.
     *
     * If you are automating VSS Backups, omit this parameter.
     *
     * Default: PRE and POST
     */
    public fun stages(stages: Collection<String>) {
        _stages.addAll(stages)
    }

    public fun build(): CfnLifecyclePolicy.ScriptProperty {
        if (_stages.isNotEmpty()) cdkBuilder.stages(_stages)
        return cdkBuilder.build()
    }
}

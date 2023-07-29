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
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.transfer.CfnWorkflowProps

/**
 * Properties for defining a `CfnWorkflow`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.transfer.*;
 * Object copyStepDetails;
 * Object customStepDetails;
 * Object deleteStepDetails;
 * Object tagStepDetails;
 * CfnWorkflowProps cfnWorkflowProps = CfnWorkflowProps.builder()
 * .steps(List.of(WorkflowStepProperty.builder()
 * .copyStepDetails(copyStepDetails)
 * .customStepDetails(customStepDetails)
 * .decryptStepDetails(DecryptStepDetailsProperty.builder()
 * .destinationFileLocation(InputFileLocationProperty.builder()
 * .efsFileLocation(EfsInputFileLocationProperty.builder()
 * .fileSystemId("fileSystemId")
 * .path("path")
 * .build())
 * .s3FileLocation(S3InputFileLocationProperty.builder()
 * .bucket("bucket")
 * .key("key")
 * .build())
 * .build())
 * .name("name")
 * .overwriteExisting("overwriteExisting")
 * .sourceFileLocation("sourceFileLocation")
 * .type("type")
 * .build())
 * .deleteStepDetails(deleteStepDetails)
 * .tagStepDetails(tagStepDetails)
 * .type("type")
 * .build()))
 * // the properties below are optional
 * .description("description")
 * .onExceptionSteps(List.of(WorkflowStepProperty.builder()
 * .copyStepDetails(copyStepDetails)
 * .customStepDetails(customStepDetails)
 * .decryptStepDetails(DecryptStepDetailsProperty.builder()
 * .destinationFileLocation(InputFileLocationProperty.builder()
 * .efsFileLocation(EfsInputFileLocationProperty.builder()
 * .fileSystemId("fileSystemId")
 * .path("path")
 * .build())
 * .s3FileLocation(S3InputFileLocationProperty.builder()
 * .bucket("bucket")
 * .key("key")
 * .build())
 * .build())
 * .name("name")
 * .overwriteExisting("overwriteExisting")
 * .sourceFileLocation("sourceFileLocation")
 * .type("type")
 * .build())
 * .deleteStepDetails(deleteStepDetails)
 * .tagStepDetails(tagStepDetails)
 * .type("type")
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-workflow.html)
 */
@CdkDslMarker
public class CfnWorkflowPropsDsl {
    private val cdkBuilder: CfnWorkflowProps.Builder = CfnWorkflowProps.builder()

    private val _onExceptionSteps: MutableList<Any> = mutableListOf()

    private val _steps: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param description Specifies the text description for the workflow. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param onExceptionSteps Specifies the steps (actions) to take if errors are encountered
     *   during execution of the workflow.
     */
    public fun onExceptionSteps(vararg onExceptionSteps: Any) {
        _onExceptionSteps.addAll(listOf(*onExceptionSteps))
    }

    /**
     * @param onExceptionSteps Specifies the steps (actions) to take if errors are encountered
     *   during execution of the workflow.
     */
    public fun onExceptionSteps(onExceptionSteps: Collection<Any>) {
        _onExceptionSteps.addAll(onExceptionSteps)
    }

    /**
     * @param onExceptionSteps Specifies the steps (actions) to take if errors are encountered
     *   during execution of the workflow.
     */
    public fun onExceptionSteps(onExceptionSteps: IResolvable) {
        cdkBuilder.onExceptionSteps(onExceptionSteps)
    }

    /** @param steps Specifies the details for the steps that are in the specified workflow. */
    public fun steps(vararg steps: Any) {
        _steps.addAll(listOf(*steps))
    }

    /** @param steps Specifies the details for the steps that are in the specified workflow. */
    public fun steps(steps: Collection<Any>) {
        _steps.addAll(steps)
    }

    /** @param steps Specifies the details for the steps that are in the specified workflow. */
    public fun steps(steps: IResolvable) {
        cdkBuilder.steps(steps)
    }

    /**
     * @param tags Key-value pairs that can be used to group and search for workflows. Tags are
     *   metadata attached to workflows for any purpose.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags Key-value pairs that can be used to group and search for workflows. Tags are
     *   metadata attached to workflows for any purpose.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnWorkflowProps {
        if (_onExceptionSteps.isNotEmpty()) cdkBuilder.onExceptionSteps(_onExceptionSteps)
        if (_steps.isNotEmpty()) cdkBuilder.steps(_steps)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}

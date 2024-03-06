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

package io.cloudshiftdev.awscdkdsl.services.imagebuilder

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.imagebuilder.CfnWorkflowProps

/**
 * Properties for defining a `CfnWorkflow`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.imagebuilder.*;
 * CfnWorkflowProps cfnWorkflowProps = CfnWorkflowProps.builder()
 * .name("name")
 * .type("type")
 * .version("version")
 * // the properties below are optional
 * .changeDescription("changeDescription")
 * .data("data")
 * .description("description")
 * .kmsKeyId("kmsKeyId")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .uri("uri")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-workflow.html)
 */
@CdkDslMarker
public class CfnWorkflowPropsDsl {
    private val cdkBuilder: CfnWorkflowProps.Builder = CfnWorkflowProps.builder()

    /**
     * @param changeDescription Describes what change has been made in this version of the workflow,
     *   or what makes this version different from other versions of the workflow.
     */
    public fun changeDescription(changeDescription: String) {
        cdkBuilder.changeDescription(changeDescription)
    }

    /**
     * @param data Contains the UTF-8 encoded YAML document content for the workflow. Alternatively,
     *   you can specify the `uri` of a YAML document file stored in Amazon S3. However, you cannot
     *   specify both properties.
     */
    public fun `data`(`data`: String) {
        cdkBuilder.`data`(`data`)
    }

    /** @param description Describes the workflow. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param kmsKeyId The ID of the KMS key that is used to encrypt this workflow resource. */
    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /** @param name The name of the workflow to create. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param tags Tags that apply to the workflow resource. */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    /**
     * @param type The phase in the image build process for which the workflow resource is
     *   responsible.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    /**
     * @param uri The `uri` of a YAML component document file. This must be an S3 URL (
     *   `s3://bucket/key` ), and the requester must have permission to access the S3 bucket it
     *   points to. If you use Amazon S3, you can specify component content up to your service
     *   quota.
     *
     * Alternatively, you can specify the YAML document inline, using the component `data` property.
     * You cannot specify both properties.
     */
    public fun uri(uri: String) {
        cdkBuilder.uri(uri)
    }

    /**
     * @param version The semantic version of this workflow resource. The semantic version syntax
     *   adheres to the following rules.
     *
     * The semantic version has four nodes: <major>.<minor>.<patch>/<build>. You can assign values
     * for the first three, and can filter on all of them.
     *
     * *Assignment:* For the first three nodes you can assign any positive integer value, including
     * zero, with an upper limit of 2^30-1, or 1073741823 for each node. Image Builder automatically
     * assigns the build number to the fourth node.
     *
     * *Patterns:* You can use any numeric pattern that adheres to the assignment requirements for
     * the nodes that you can assign. For example, you might choose a software version pattern, such
     * as 1.0.0, or a date, such as 2021.01.01.
     */
    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    public fun build(): CfnWorkflowProps = cdkBuilder.build()
}

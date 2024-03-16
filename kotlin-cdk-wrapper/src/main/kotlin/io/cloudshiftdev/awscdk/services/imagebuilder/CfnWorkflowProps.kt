@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.imagebuilder

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Properties for defining a `CfnWorkflow`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.imagebuilder.*;
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
public interface CfnWorkflowProps {
  /**
   * Describes what change has been made in this version of the workflow, or what makes this version
   * different from other versions of the workflow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-workflow.html#cfn-imagebuilder-workflow-changedescription)
   */
  public fun changeDescription(): String? = unwrap(this).getChangeDescription()

  /**
   * Contains the UTF-8 encoded YAML document content for the workflow.
   *
   * Alternatively, you can specify the `uri` of a YAML document file stored in Amazon S3. However,
   * you cannot specify both properties.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-workflow.html#cfn-imagebuilder-workflow-data)
   */
  public fun `data`(): String? = unwrap(this).getData()

  /**
   * Describes the workflow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-workflow.html#cfn-imagebuilder-workflow-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The ID of the KMS key that is used to encrypt this workflow resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-workflow.html#cfn-imagebuilder-workflow-kmskeyid)
   */
  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * The name of the workflow to create.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-workflow.html#cfn-imagebuilder-workflow-name)
   */
  public fun name(): String

  /**
   * Tags that apply to the workflow resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-workflow.html#cfn-imagebuilder-workflow-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * The phase in the image build process for which the workflow resource is responsible.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-workflow.html#cfn-imagebuilder-workflow-type)
   */
  public fun type(): String

  /**
   * The `uri` of a YAML component document file.
   *
   * This must be an S3 URL ( `s3://bucket/key` ), and the requester must have permission to access
   * the S3 bucket it points to. If you use Amazon S3, you can specify component content up to your
   * service quota.
   *
   * Alternatively, you can specify the YAML document inline, using the component `data` property.
   * You cannot specify both properties.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-workflow.html#cfn-imagebuilder-workflow-uri)
   */
  public fun uri(): String? = unwrap(this).getUri()

  /**
   * The semantic version of this workflow resource. The semantic version syntax adheres to the
   * following rules.
   *
   *
   * The semantic version has four nodes: <major>.<minor>.<patch>/<build>. You can assign values for
   * the first three, and can filter on all of them.
   *
   * *Assignment:* For the first three nodes you can assign any positive integer value, including
   * zero, with an upper limit of 2^30-1, or 1073741823 for each node. Image Builder automatically
   * assigns the build number to the fourth node.
   *
   * *Patterns:* You can use any numeric pattern that adheres to the assignment requirements for the
   * nodes that you can assign. For example, you might choose a software version pattern, such as
   * 1.0.0, or a date, such as 2021.01.01.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-workflow.html#cfn-imagebuilder-workflow-version)
   */
  public fun version(): String

  /**
   * A builder for [CfnWorkflowProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param changeDescription Describes what change has been made in this version of the workflow,
     * or what makes this version different from other versions of the workflow.
     */
    public fun changeDescription(changeDescription: String)

    /**
     * @param data Contains the UTF-8 encoded YAML document content for the workflow.
     * Alternatively, you can specify the `uri` of a YAML document file stored in Amazon S3.
     * However, you cannot specify both properties.
     */
    public fun `data`(`data`: String)

    /**
     * @param description Describes the workflow.
     */
    public fun description(description: String)

    /**
     * @param kmsKeyId The ID of the KMS key that is used to encrypt this workflow resource.
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * @param name The name of the workflow to create. 
     */
    public fun name(name: String)

    /**
     * @param tags Tags that apply to the workflow resource.
     */
    public fun tags(tags: Map<String, String>)

    /**
     * @param type The phase in the image build process for which the workflow resource is
     * responsible. 
     */
    public fun type(type: String)

    /**
     * @param uri The `uri` of a YAML component document file.
     * This must be an S3 URL ( `s3://bucket/key` ), and the requester must have permission to
     * access the S3 bucket it points to. If you use Amazon S3, you can specify component content up to
     * your service quota.
     *
     * Alternatively, you can specify the YAML document inline, using the component `data` property.
     * You cannot specify both properties.
     */
    public fun uri(uri: String)

    /**
     * @param version The semantic version of this workflow resource. The semantic version syntax
     * adheres to the following rules. 
     *
     * The semantic version has four nodes: <major>.<minor>.<patch>/<build>. You can assign values
     * for the first three, and can filter on all of them.
     *
     * *Assignment:* For the first three nodes you can assign any positive integer value, including
     * zero, with an upper limit of 2^30-1, or 1073741823 for each node. Image Builder automatically
     * assigns the build number to the fourth node.
     *
     * *Patterns:* You can use any numeric pattern that adheres to the assignment requirements for
     * the nodes that you can assign. For example, you might choose a software version pattern, such as
     * 1.0.0, or a date, such as 2021.01.01.
     */
    public fun version(version: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.imagebuilder.CfnWorkflowProps.Builder =
        software.amazon.awscdk.services.imagebuilder.CfnWorkflowProps.builder()

    /**
     * @param changeDescription Describes what change has been made in this version of the workflow,
     * or what makes this version different from other versions of the workflow.
     */
    override fun changeDescription(changeDescription: String) {
      cdkBuilder.changeDescription(changeDescription)
    }

    /**
     * @param data Contains the UTF-8 encoded YAML document content for the workflow.
     * Alternatively, you can specify the `uri` of a YAML document file stored in Amazon S3.
     * However, you cannot specify both properties.
     */
    override fun `data`(`data`: String) {
      cdkBuilder.`data`(`data`)
    }

    /**
     * @param description Describes the workflow.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param kmsKeyId The ID of the KMS key that is used to encrypt this workflow resource.
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param name The name of the workflow to create. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags Tags that apply to the workflow resource.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param type The phase in the image build process for which the workflow resource is
     * responsible. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    /**
     * @param uri The `uri` of a YAML component document file.
     * This must be an S3 URL ( `s3://bucket/key` ), and the requester must have permission to
     * access the S3 bucket it points to. If you use Amazon S3, you can specify component content up to
     * your service quota.
     *
     * Alternatively, you can specify the YAML document inline, using the component `data` property.
     * You cannot specify both properties.
     */
    override fun uri(uri: String) {
      cdkBuilder.uri(uri)
    }

    /**
     * @param version The semantic version of this workflow resource. The semantic version syntax
     * adheres to the following rules. 
     *
     * The semantic version has four nodes: <major>.<minor>.<patch>/<build>. You can assign values
     * for the first three, and can filter on all of them.
     *
     * *Assignment:* For the first three nodes you can assign any positive integer value, including
     * zero, with an upper limit of 2^30-1, or 1073741823 for each node. Image Builder automatically
     * assigns the build number to the fourth node.
     *
     * *Patterns:* You can use any numeric pattern that adheres to the assignment requirements for
     * the nodes that you can assign. For example, you might choose a software version pattern, such as
     * 1.0.0, or a date, such as 2021.01.01.
     */
    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.imagebuilder.CfnWorkflowProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.imagebuilder.CfnWorkflowProps,
  ) : CdkObject(cdkObject), CfnWorkflowProps {
    /**
     * Describes what change has been made in this version of the workflow, or what makes this
     * version different from other versions of the workflow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-workflow.html#cfn-imagebuilder-workflow-changedescription)
     */
    override fun changeDescription(): String? = unwrap(this).getChangeDescription()

    /**
     * Contains the UTF-8 encoded YAML document content for the workflow.
     *
     * Alternatively, you can specify the `uri` of a YAML document file stored in Amazon S3.
     * However, you cannot specify both properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-workflow.html#cfn-imagebuilder-workflow-data)
     */
    override fun `data`(): String? = unwrap(this).getData()

    /**
     * Describes the workflow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-workflow.html#cfn-imagebuilder-workflow-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The ID of the KMS key that is used to encrypt this workflow resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-workflow.html#cfn-imagebuilder-workflow-kmskeyid)
     */
    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * The name of the workflow to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-workflow.html#cfn-imagebuilder-workflow-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Tags that apply to the workflow resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-workflow.html#cfn-imagebuilder-workflow-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    /**
     * The phase in the image build process for which the workflow resource is responsible.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-workflow.html#cfn-imagebuilder-workflow-type)
     */
    override fun type(): String = unwrap(this).getType()

    /**
     * The `uri` of a YAML component document file.
     *
     * This must be an S3 URL ( `s3://bucket/key` ), and the requester must have permission to
     * access the S3 bucket it points to. If you use Amazon S3, you can specify component content up to
     * your service quota.
     *
     * Alternatively, you can specify the YAML document inline, using the component `data` property.
     * You cannot specify both properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-workflow.html#cfn-imagebuilder-workflow-uri)
     */
    override fun uri(): String? = unwrap(this).getUri()

    /**
     * The semantic version of this workflow resource. The semantic version syntax adheres to the
     * following rules.
     *
     *
     * The semantic version has four nodes: <major>.<minor>.<patch>/<build>. You can assign values
     * for the first three, and can filter on all of them.
     *
     * *Assignment:* For the first three nodes you can assign any positive integer value, including
     * zero, with an upper limit of 2^30-1, or 1073741823 for each node. Image Builder automatically
     * assigns the build number to the fourth node.
     *
     * *Patterns:* You can use any numeric pattern that adheres to the assignment requirements for
     * the nodes that you can assign. For example, you might choose a software version pattern, such as
     * 1.0.0, or a date, such as 2021.01.01.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-workflow.html#cfn-imagebuilder-workflow-version)
     */
    override fun version(): String = unwrap(this).getVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnWorkflowProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnWorkflowProps):
        CfnWorkflowProps = CdkObjectWrappers.wrap(cdkObject) as CfnWorkflowProps

    internal fun unwrap(wrapped: CfnWorkflowProps):
        software.amazon.awscdk.services.imagebuilder.CfnWorkflowProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.imagebuilder.CfnWorkflowProps
  }
}

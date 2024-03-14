package io.cloudshiftdev.awscdk.services.imagebuilder

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnWorkflow internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.imagebuilder.CfnWorkflow,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The Amazon Resource Name (ARN) of the workflow resource.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Describes what change has been made in this version of the workflow, or what makes this version
   * different from other versions of the workflow.
   */
  public open fun changeDescription(): String? = unwrap(this).getChangeDescription()

  /**
   * Describes what change has been made in this version of the workflow, or what makes this version
   * different from other versions of the workflow.
   */
  public open fun changeDescription(`value`: String) {
    unwrap(this).setChangeDescription(`value`)
  }

  /**
   * Contains the UTF-8 encoded YAML document content for the workflow.
   */
  public open fun `data`(): String? = unwrap(this).getData()

  /**
   * Contains the UTF-8 encoded YAML document content for the workflow.
   */
  public open fun `data`(`value`: String) {
    unwrap(this).setData(`value`)
  }

  /**
   * Describes the workflow.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * Describes the workflow.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The ID of the KMS key that is used to encrypt this workflow resource.
   */
  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * The ID of the KMS key that is used to encrypt this workflow resource.
   */
  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  /**
   * The name of the workflow to create.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the workflow to create.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Tags that apply to the workflow resource.
   */
  public open fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * Tags that apply to the workflow resource.
   */
  public open fun tags(`value`: Map<String, String>) {
    unwrap(this).setTags(`value`)
  }

  /**
   * The phase in the image build process for which the workflow resource is responsible.
   */
  public open fun type(): String = unwrap(this).getType()

  /**
   * The phase in the image build process for which the workflow resource is responsible.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * The `uri` of a YAML component document file.
   */
  public open fun uri(): String? = unwrap(this).getUri()

  /**
   * The `uri` of a YAML component document file.
   */
  public open fun uri(`value`: String) {
    unwrap(this).setUri(`value`)
  }

  /**
   * The semantic version of this workflow resource.
   *
   * The semantic version syntax adheres to the following rules.
   */
  public open fun version(): String = unwrap(this).getVersion()

  /**
   * The semantic version of this workflow resource.
   *
   * The semantic version syntax adheres to the following rules.
   */
  public open fun version(`value`: String) {
    unwrap(this).setVersion(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.imagebuilder.CfnWorkflow].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Describes what change has been made in this version of the workflow, or what makes this
     * version different from other versions of the workflow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-workflow.html#cfn-imagebuilder-workflow-changedescription)
     * @param changeDescription Describes what change has been made in this version of the workflow,
     * or what makes this version different from other versions of the workflow. 
     */
    public fun changeDescription(changeDescription: String)

    /**
     * Contains the UTF-8 encoded YAML document content for the workflow.
     *
     * Alternatively, you can specify the `uri` of a YAML document file stored in Amazon S3.
     * However, you cannot specify both properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-workflow.html#cfn-imagebuilder-workflow-data)
     * @param data Contains the UTF-8 encoded YAML document content for the workflow. 
     */
    public fun `data`(`data`: String)

    /**
     * Describes the workflow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-workflow.html#cfn-imagebuilder-workflow-description)
     * @param description Describes the workflow. 
     */
    public fun description(description: String)

    /**
     * The ID of the KMS key that is used to encrypt this workflow resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-workflow.html#cfn-imagebuilder-workflow-kmskeyid)
     * @param kmsKeyId The ID of the KMS key that is used to encrypt this workflow resource. 
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * The name of the workflow to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-workflow.html#cfn-imagebuilder-workflow-name)
     * @param name The name of the workflow to create. 
     */
    public fun name(name: String)

    /**
     * Tags that apply to the workflow resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-workflow.html#cfn-imagebuilder-workflow-tags)
     * @param tags Tags that apply to the workflow resource. 
     */
    public fun tags(tags: Map<String, String>)

    /**
     * The phase in the image build process for which the workflow resource is responsible.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-workflow.html#cfn-imagebuilder-workflow-type)
     * @param type The phase in the image build process for which the workflow resource is
     * responsible. 
     */
    public fun type(type: String)

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
     * @param uri The `uri` of a YAML component document file. 
     */
    public fun uri(uri: String)

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
     * @param version The semantic version of this workflow resource. The semantic version syntax
     * adheres to the following rules. 
     */
    public fun version(version: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.imagebuilder.CfnWorkflow.Builder =
        software.amazon.awscdk.services.imagebuilder.CfnWorkflow.Builder.create(scope, id)

    /**
     * Describes what change has been made in this version of the workflow, or what makes this
     * version different from other versions of the workflow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-workflow.html#cfn-imagebuilder-workflow-changedescription)
     * @param changeDescription Describes what change has been made in this version of the workflow,
     * or what makes this version different from other versions of the workflow. 
     */
    override fun changeDescription(changeDescription: String) {
      cdkBuilder.changeDescription(changeDescription)
    }

    /**
     * Contains the UTF-8 encoded YAML document content for the workflow.
     *
     * Alternatively, you can specify the `uri` of a YAML document file stored in Amazon S3.
     * However, you cannot specify both properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-workflow.html#cfn-imagebuilder-workflow-data)
     * @param data Contains the UTF-8 encoded YAML document content for the workflow. 
     */
    override fun `data`(`data`: String) {
      cdkBuilder.`data`(`data`)
    }

    /**
     * Describes the workflow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-workflow.html#cfn-imagebuilder-workflow-description)
     * @param description Describes the workflow. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The ID of the KMS key that is used to encrypt this workflow resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-workflow.html#cfn-imagebuilder-workflow-kmskeyid)
     * @param kmsKeyId The ID of the KMS key that is used to encrypt this workflow resource. 
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * The name of the workflow to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-workflow.html#cfn-imagebuilder-workflow-name)
     * @param name The name of the workflow to create. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Tags that apply to the workflow resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-workflow.html#cfn-imagebuilder-workflow-tags)
     * @param tags Tags that apply to the workflow resource. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * The phase in the image build process for which the workflow resource is responsible.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-workflow.html#cfn-imagebuilder-workflow-type)
     * @param type The phase in the image build process for which the workflow resource is
     * responsible. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

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
     * @param uri The `uri` of a YAML component document file. 
     */
    override fun uri(uri: String) {
      cdkBuilder.uri(uri)
    }

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
     * @param version The semantic version of this workflow resource. The semantic version syntax
     * adheres to the following rules. 
     */
    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.imagebuilder.CfnWorkflow =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnWorkflow {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnWorkflow(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnWorkflow):
        CfnWorkflow = CfnWorkflow(cdkObject)

    internal fun unwrap(wrapped: CfnWorkflow):
        software.amazon.awscdk.services.imagebuilder.CfnWorkflow = wrapped.cdkObject
  }
}

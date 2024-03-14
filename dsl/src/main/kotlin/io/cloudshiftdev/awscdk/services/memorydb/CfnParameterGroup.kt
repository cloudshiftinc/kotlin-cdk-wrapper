package io.cloudshiftdev.awscdk.services.memorydb

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnParameterGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.memorydb.CfnParameterGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * When you pass the logical ID of this resource to the intrinsic `Ref` function, Ref returns the
   * ARN of the parameter group, such as
   * `arn:aws:memorydb:us-east-1:123456789012:parametergroup/my-parameter-group`.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * A description of the parameter group.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the parameter group.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The name of the parameter group family that this parameter group is compatible with.
   */
  public open fun family(): String = unwrap(this).getFamily()

  /**
   * The name of the parameter group family that this parameter group is compatible with.
   */
  public open fun family(`value`: String) {
    unwrap(this).setFamily(`value`)
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
   * The name of the parameter group.
   */
  public open fun parameterGroupName(): String = unwrap(this).getParameterGroupName()

  /**
   * The name of the parameter group.
   */
  public open fun parameterGroupName(`value`: String) {
    unwrap(this).setParameterGroupName(`value`)
  }

  /**
   * Returns the detailed parameter list for the parameter group.
   */
  public open fun parameters(): Any? = unwrap(this).getParameters()

  /**
   * Returns the detailed parameter list for the parameter group.
   */
  public open fun parameters(`value`: Any) {
    unwrap(this).setParameters(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.memorydb.CfnParameterGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A description of the parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-parametergroup.html#cfn-memorydb-parametergroup-description)
     * @param description A description of the parameter group. 
     */
    public fun description(description: String)

    /**
     * The name of the parameter group family that this parameter group is compatible with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-parametergroup.html#cfn-memorydb-parametergroup-family)
     * @param family The name of the parameter group family that this parameter group is compatible
     * with. 
     */
    public fun family(family: String)

    /**
     * The name of the parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-parametergroup.html#cfn-memorydb-parametergroup-parametergroupname)
     * @param parameterGroupName The name of the parameter group. 
     */
    public fun parameterGroupName(parameterGroupName: String)

    /**
     * Returns the detailed parameter list for the parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-parametergroup.html#cfn-memorydb-parametergroup-parameters)
     * @param parameters Returns the detailed parameter list for the parameter group. 
     */
    public fun parameters(parameters: Any)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-parametergroup.html#cfn-memorydb-parametergroup-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-parametergroup.html#cfn-memorydb-parametergroup-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.memorydb.CfnParameterGroup.Builder =
        software.amazon.awscdk.services.memorydb.CfnParameterGroup.Builder.create(scope, id)

    /**
     * A description of the parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-parametergroup.html#cfn-memorydb-parametergroup-description)
     * @param description A description of the parameter group. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the parameter group family that this parameter group is compatible with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-parametergroup.html#cfn-memorydb-parametergroup-family)
     * @param family The name of the parameter group family that this parameter group is compatible
     * with. 
     */
    override fun family(family: String) {
      cdkBuilder.family(family)
    }

    /**
     * The name of the parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-parametergroup.html#cfn-memorydb-parametergroup-parametergroupname)
     * @param parameterGroupName The name of the parameter group. 
     */
    override fun parameterGroupName(parameterGroupName: String) {
      cdkBuilder.parameterGroupName(parameterGroupName)
    }

    /**
     * Returns the detailed parameter list for the parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-parametergroup.html#cfn-memorydb-parametergroup-parameters)
     * @param parameters Returns the detailed parameter list for the parameter group. 
     */
    override fun parameters(parameters: Any) {
      cdkBuilder.parameters(parameters)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-parametergroup.html#cfn-memorydb-parametergroup-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-parametergroup.html#cfn-memorydb-parametergroup-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.memorydb.CfnParameterGroup =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnParameterGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnParameterGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.memorydb.CfnParameterGroup):
        CfnParameterGroup = CfnParameterGroup(cdkObject)

    internal fun unwrap(wrapped: CfnParameterGroup):
        software.amazon.awscdk.services.memorydb.CfnParameterGroup = wrapped.cdkObject
  }
}

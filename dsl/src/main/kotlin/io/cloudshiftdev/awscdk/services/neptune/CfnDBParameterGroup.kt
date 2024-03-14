package io.cloudshiftdev.awscdk.services.neptune

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

public open class CfnDBParameterGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.neptune.CfnDBParameterGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Provides the customer-specified description for this DB parameter group.
   */
  public open fun description(): String = unwrap(this).getDescription()

  /**
   * Provides the customer-specified description for this DB parameter group.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Must be `neptune1` for engine versions prior to
   * [1.2.0.0](https://docs.aws.amazon.com/neptune/latest/userguide/engine-releases-1.2.0.0.html) , or
   * `neptune1.2` for engine version `1.2.0.0` and higher.
   */
  public open fun family(): String = unwrap(this).getFamily()

  /**
   * Must be `neptune1` for engine versions prior to
   * [1.2.0.0](https://docs.aws.amazon.com/neptune/latest/userguide/engine-releases-1.2.0.0.html) , or
   * `neptune1.2` for engine version `1.2.0.0` and higher.
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
   * Provides the name of the DB parameter group.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * Provides the name of the DB parameter group.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The parameters to set for this DB parameter group.
   */
  public open fun parameters(): Any = unwrap(this).getParameters()

  /**
   * The parameters to set for this DB parameter group.
   */
  public open fun parameters(`value`: Any) {
    unwrap(this).setParameters(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags that you want to attach to this parameter group.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags that you want to attach to this parameter group.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags that you want to attach to this parameter group.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.neptune.CfnDBParameterGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Provides the customer-specified description for this DB parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbparametergroup.html#cfn-neptune-dbparametergroup-description)
     * @param description Provides the customer-specified description for this DB parameter group. 
     */
    public fun description(description: String)

    /**
     * Must be `neptune1` for engine versions prior to
     * [1.2.0.0](https://docs.aws.amazon.com/neptune/latest/userguide/engine-releases-1.2.0.0.html) ,
     * or `neptune1.2` for engine version `1.2.0.0` and higher.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbparametergroup.html#cfn-neptune-dbparametergroup-family)
     * @param family Must be `neptune1` for engine versions prior to
     * [1.2.0.0](https://docs.aws.amazon.com/neptune/latest/userguide/engine-releases-1.2.0.0.html) ,
     * or `neptune1.2` for engine version `1.2.0.0` and higher. 
     */
    public fun family(family: String)

    /**
     * Provides the name of the DB parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbparametergroup.html#cfn-neptune-dbparametergroup-name)
     * @param name Provides the name of the DB parameter group. 
     */
    public fun name(name: String)

    /**
     * The parameters to set for this DB parameter group.
     *
     * The parameters are expressed as a JSON object consisting of key-value pairs.
     *
     * Changes to dynamic parameters are applied immediately. During an update, if you have static
     * parameters (whether they were changed or not), it triggers AWS CloudFormation to reboot the
     * associated DB instance without failover.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbparametergroup.html#cfn-neptune-dbparametergroup-parameters)
     * @param parameters The parameters to set for this DB parameter group. 
     */
    public fun parameters(parameters: Any)

    /**
     * The tags that you want to attach to this parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbparametergroup.html#cfn-neptune-dbparametergroup-tags)
     * @param tags The tags that you want to attach to this parameter group. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags that you want to attach to this parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbparametergroup.html#cfn-neptune-dbparametergroup-tags)
     * @param tags The tags that you want to attach to this parameter group. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.neptune.CfnDBParameterGroup.Builder =
        software.amazon.awscdk.services.neptune.CfnDBParameterGroup.Builder.create(scope, id)

    /**
     * Provides the customer-specified description for this DB parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbparametergroup.html#cfn-neptune-dbparametergroup-description)
     * @param description Provides the customer-specified description for this DB parameter group. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Must be `neptune1` for engine versions prior to
     * [1.2.0.0](https://docs.aws.amazon.com/neptune/latest/userguide/engine-releases-1.2.0.0.html) ,
     * or `neptune1.2` for engine version `1.2.0.0` and higher.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbparametergroup.html#cfn-neptune-dbparametergroup-family)
     * @param family Must be `neptune1` for engine versions prior to
     * [1.2.0.0](https://docs.aws.amazon.com/neptune/latest/userguide/engine-releases-1.2.0.0.html) ,
     * or `neptune1.2` for engine version `1.2.0.0` and higher. 
     */
    override fun family(family: String) {
      cdkBuilder.family(family)
    }

    /**
     * Provides the name of the DB parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbparametergroup.html#cfn-neptune-dbparametergroup-name)
     * @param name Provides the name of the DB parameter group. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The parameters to set for this DB parameter group.
     *
     * The parameters are expressed as a JSON object consisting of key-value pairs.
     *
     * Changes to dynamic parameters are applied immediately. During an update, if you have static
     * parameters (whether they were changed or not), it triggers AWS CloudFormation to reboot the
     * associated DB instance without failover.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbparametergroup.html#cfn-neptune-dbparametergroup-parameters)
     * @param parameters The parameters to set for this DB parameter group. 
     */
    override fun parameters(parameters: Any) {
      cdkBuilder.parameters(parameters)
    }

    /**
     * The tags that you want to attach to this parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbparametergroup.html#cfn-neptune-dbparametergroup-tags)
     * @param tags The tags that you want to attach to this parameter group. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags that you want to attach to this parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbparametergroup.html#cfn-neptune-dbparametergroup-tags)
     * @param tags The tags that you want to attach to this parameter group. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.neptune.CfnDBParameterGroup =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDBParameterGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDBParameterGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.neptune.CfnDBParameterGroup):
        CfnDBParameterGroup = CfnDBParameterGroup(cdkObject)

    internal fun unwrap(wrapped: CfnDBParameterGroup):
        software.amazon.awscdk.services.neptune.CfnDBParameterGroup = wrapped.cdkObject
  }
}

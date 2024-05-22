@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

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

/**
 * `AWS::Neptune::DBParameterGroup` creates a new DB parameter group.
 *
 * This type can be declared in a template and referenced in the `DBParameterGroupName` parameter of
 * `AWS::Neptune::DBInstance` .
 *
 *
 * Applying a parameter group to a DB instance might require the instance to reboot, resulting in a
 * database outage for the duration of the reboot. &gt; If you provide a custom `DBParameterGroup` that
 * you associate with `DBInstance` , it is best to specify an `EngineVersion` property in `DBCluster` .
 * That `EngineVersion` needs to be compatible with the value of the `Family` property in the
 * `DBParameterGroup` .
 *
 *
 * A DB parameter group is initially created with the default parameters for the database engine
 * used by the DB instance. To provide custom values for any of the parameters, you must modify the
 * group after creating it using *ModifyDBParameterGroup* . Once you've created a DB parameter group,
 * you need to associate it with your DB instance using *ModifyDBInstance* . When you associate a new
 * DB parameter group with a running DB instance, you need to reboot the DB instance without failover
 * for the new DB parameter group and associated settings to take effect.
 *
 *
 * After you create a DB parameter group, you should wait at least 5 minutes before creating your
 * first DB instance that uses that DB parameter group as the default parameter group. This allows
 * Amazon Neptune to fully complete the create action before the parameter group is used as the default
 * for a new DB instance. This is especially important for parameters that are critical when creating
 * the default database for a DB instance, such as the character set for the default database defined
 * by the `character_set_database` parameter. You can use the *Parameter Groups* option of the Amazon
 * Neptune console or the *DescribeDBParameters* command to verify that your DB parameter group has
 * been created or modified.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.neptune.*;
 * Object parameters;
 * CfnDBParameterGroup cfnDBParameterGroup = CfnDBParameterGroup.Builder.create(this,
 * "MyCfnDBParameterGroup")
 * .description("description")
 * .family("family")
 * .parameters(parameters)
 * // the properties below are optional
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbparametergroup.html)
 */
public open class CfnDBParameterGroup(
  cdkObject: software.amazon.awscdk.services.neptune.CfnDBParameterGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDBParameterGroupProps,
  ) :
      this(software.amazon.awscdk.services.neptune.CfnDBParameterGroup(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnDBParameterGroupProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDBParameterGroupProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDBParameterGroupProps(props)
  )

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
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
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
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
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
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
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
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.neptune.CfnDBParameterGroup.CFN_RESOURCE_TYPE_NAME

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
        software.amazon.awscdk.services.neptune.CfnDBParameterGroup = wrapped.cdkObject as
        software.amazon.awscdk.services.neptune.CfnDBParameterGroup
  }
}

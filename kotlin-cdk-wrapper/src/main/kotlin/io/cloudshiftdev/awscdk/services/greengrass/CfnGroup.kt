@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * AWS IoT Greengrass seamlessly extends AWS to edge devices so they can act locally on the data
 * they generate, while still using the cloud for management, analytics, and durable storage.
 *
 * With AWS IoT Greengrass , connected devices can run AWS Lambda functions, execute predictions
 * based on machine learning models, keep device data in sync, and communicate with other devices
 * securely – even when not connected to the internet. For more information, see the [Developer
 * Guide](https://docs.aws.amazon.com/greengrass/v1/developerguide/what-is-gg.html) .
 *
 *
 * For AWS Region support, see [AWS CloudFormation Support for AWS IoT
 * Greengrass](https://docs.aws.amazon.com/greengrass/v1/developerguide/cloudformation-support.html) in
 * the *Developer Guide* .
 *
 *
 * The `AWS::Greengrass::Group` resource represents a group in AWS IoT Greengrass . In the AWS IoT
 * Greengrass API, groups are used to organize your group versions.
 *
 * Groups can reference multiple group versions. All group versions must be associated with a group.
 * A group version references a device definition version, subscription definition version, and other
 * version types that contain the components you want to deploy to a Greengrass core device.
 *
 * To deploy a group version, the group version must reference a core definition version that
 * contains one core. Other version types are optionally included, depending on your business need.
 *
 *
 * When you create a group, you can optionally include an initial group version. To associate a
 * group version later, create a
 * [`AWS::Greengrass::GroupVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html)
 * resource and specify the ID of this group.
 *
 * To change group components (such as devices, subscriptions, or functions), you must create new
 * versions. This is because versions are immutable. For example, to add a function, you create a
 * function definition version that contains the new function (and all other functions that you want to
 * deploy). Then you create a group version that references the new function definition version (and
 * all other version types that you want to deploy).
 *
 *
 * *Deploying a Group Version*
 *
 * After you create the group version in your AWS CloudFormation template, you can deploy it using
 * the [`aws greengrass
 * create-deployment`](https://docs.aws.amazon.com/greengrass/v1/apireference/createdeployment-post.html)
 * command in the AWS CLI or from the *Greengrass* node in the AWS IoT console. To deploy a group
 * version, you must have a Greengrass service role associated with your AWS account . For more
 * information, see [AWS CloudFormation Support for AWS IoT
 * Greengrass](https://docs.aws.amazon.com/greengrass/v1/developerguide/cloudformation-support.html) in
 * the *Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.greengrass.*;
 * Object tags;
 * CfnGroup cfnGroup = CfnGroup.Builder.create(this, "MyCfnGroup")
 * .name("name")
 * // the properties below are optional
 * .initialVersion(GroupVersionProperty.builder()
 * .connectorDefinitionVersionArn("connectorDefinitionVersionArn")
 * .coreDefinitionVersionArn("coreDefinitionVersionArn")
 * .deviceDefinitionVersionArn("deviceDefinitionVersionArn")
 * .functionDefinitionVersionArn("functionDefinitionVersionArn")
 * .loggerDefinitionVersionArn("loggerDefinitionVersionArn")
 * .resourceDefinitionVersionArn("resourceDefinitionVersionArn")
 * .subscriptionDefinitionVersionArn("subscriptionDefinitionVersionArn")
 * .build())
 * .roleArn("roleArn")
 * .tags(tags)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
 */
public open class CfnGroup(
  cdkObject: software.amazon.awscdk.services.greengrass.CfnGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnGroupProps,
  ) :
      this(software.amazon.awscdk.services.greengrass.CfnGroup(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnGroupProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnGroupProps.Builder.() -> Unit,
  ) : this(scope, id, CfnGroupProps(props)
  )

  /**
   * The ARN of the `Group` , such as `arn:aws:greengrass:us-east-1: 
   * :/greengrass/definition/groups/1234a5b6-78cd-901e-2fgh-3i45j6k178l9` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The ID of the `Group` , such as `1234a5b6-78cd-901e-2fgh-3i45j6k178l9` .
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The ARN of the last `GroupVersion` that was added to the `Group` , such as
   * `arn:aws:greengrass:us-east-1: 
   * :/greengrass/definition/groups/1234a5b6-78cd-901e-2fgh-3i45j6k178l9/versions/9876ac30-4bdb-4f9d-95af-b5fdb66be1a2`
   * .
   */
  public open fun attrLatestVersionArn(): String = unwrap(this).getAttrLatestVersionArn()

  /**
   * The name of the `Group` , such as `MyGroup` .
   */
  public open fun attrName(): String = unwrap(this).getAttrName()

  /**
   * The ARN of the IAM role that's attached to the `Group` , such as `arn:aws:iam:: 
   * :role/role-name` .
   */
  public open fun attrRoleArn(): String = unwrap(this).getAttrRoleArn()

  /**
   * The time (in milliseconds since the epoch) when the group role was attached to the `Group` .
   */
  public open fun attrRoleAttachedAt(): String = unwrap(this).getAttrRoleAttachedAt()

  /**
   * The group version to include when the group is created.
   */
  public open fun initialVersion(): Any? = unwrap(this).getInitialVersion()

  /**
   * The group version to include when the group is created.
   */
  public open fun initialVersion(`value`: IResolvable) {
    unwrap(this).setInitialVersion(`value`.let(IResolvable::unwrap))
  }

  /**
   * The group version to include when the group is created.
   */
  public open fun initialVersion(`value`: GroupVersionProperty) {
    unwrap(this).setInitialVersion(`value`.let(GroupVersionProperty::unwrap))
  }

  /**
   * The group version to include when the group is created.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("cf3623d32b961b954570d28feb9ce7cea2345601c196dd92ae445713d6e75b0e")
  public open fun initialVersion(`value`: GroupVersionProperty.Builder.() -> Unit): Unit =
      initialVersion(GroupVersionProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the group.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the group.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the IAM role attached to the group.
   */
  public open fun roleArn(): String? = unwrap(this).getRoleArn()

  /**
   * The Amazon Resource Name (ARN) of the IAM role attached to the group.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Application-specific metadata to attach to the group.
   */
  public open fun tagsRaw(): Any? = unwrap(this).getTagsRaw()

  /**
   * Application-specific metadata to attach to the group.
   */
  public open fun tagsRaw(`value`: Any) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.greengrass.CfnGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The group version to include when the group is created.
     *
     * A group version references the Amazon Resource Name (ARN) of a core definition version,
     * device definition version, subscription definition version, and other version types. The group
     * version must reference a core definition version that contains one core. Other version types are
     * optionally included, depending on your business need.
     *
     *
     * To associate a group version after the group is created, create an
     * [`AWS::Greengrass::GroupVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html)
     * resource and specify the ID of this group.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html#cfn-greengrass-group-initialversion)
     * @param initialVersion The group version to include when the group is created. 
     */
    public fun initialVersion(initialVersion: IResolvable)

    /**
     * The group version to include when the group is created.
     *
     * A group version references the Amazon Resource Name (ARN) of a core definition version,
     * device definition version, subscription definition version, and other version types. The group
     * version must reference a core definition version that contains one core. Other version types are
     * optionally included, depending on your business need.
     *
     *
     * To associate a group version after the group is created, create an
     * [`AWS::Greengrass::GroupVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html)
     * resource and specify the ID of this group.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html#cfn-greengrass-group-initialversion)
     * @param initialVersion The group version to include when the group is created. 
     */
    public fun initialVersion(initialVersion: GroupVersionProperty)

    /**
     * The group version to include when the group is created.
     *
     * A group version references the Amazon Resource Name (ARN) of a core definition version,
     * device definition version, subscription definition version, and other version types. The group
     * version must reference a core definition version that contains one core. Other version types are
     * optionally included, depending on your business need.
     *
     *
     * To associate a group version after the group is created, create an
     * [`AWS::Greengrass::GroupVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html)
     * resource and specify the ID of this group.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html#cfn-greengrass-group-initialversion)
     * @param initialVersion The group version to include when the group is created. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d1a22b88e72663b90cea6aa2128dac78794d50e3d0b1a80477de81af9140da84")
    public fun initialVersion(initialVersion: GroupVersionProperty.Builder.() -> Unit)

    /**
     * The name of the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html#cfn-greengrass-group-name)
     * @param name The name of the group. 
     */
    public fun name(name: String)

    /**
     * The Amazon Resource Name (ARN) of the IAM role attached to the group.
     *
     * This role contains the permissions that Lambda functions and connectors use to interact with
     * other AWS services.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html#cfn-greengrass-group-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role attached to the group. 
     */
    public fun roleArn(roleArn: String)

    /**
     * Application-specific metadata to attach to the group.
     *
     * You can use tags in IAM policies to control access to AWS IoT Greengrass resources. You can
     * also use tags to categorize your resources. For more information, see [Tagging Your AWS IoT
     * Greengrass Resources](https://docs.aws.amazon.com/greengrass/v1/developerguide/tagging.html) in
     * the *Developer Guide* .
     *
     * This `Json` property type is processed as a map of key-value pairs. It uses the following
     * format, which is different from most `Tags` implementations in AWS CloudFormation templates.
     *
     * ```
     * "Tags": { "KeyName0": "value", "KeyName1": "value", "KeyName2": "value"
     * }
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html#cfn-greengrass-group-tags)
     * @param tags Application-specific metadata to attach to the group. 
     */
    public fun tags(tags: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.greengrass.CfnGroup.Builder =
        software.amazon.awscdk.services.greengrass.CfnGroup.Builder.create(scope, id)

    /**
     * The group version to include when the group is created.
     *
     * A group version references the Amazon Resource Name (ARN) of a core definition version,
     * device definition version, subscription definition version, and other version types. The group
     * version must reference a core definition version that contains one core. Other version types are
     * optionally included, depending on your business need.
     *
     *
     * To associate a group version after the group is created, create an
     * [`AWS::Greengrass::GroupVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html)
     * resource and specify the ID of this group.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html#cfn-greengrass-group-initialversion)
     * @param initialVersion The group version to include when the group is created. 
     */
    override fun initialVersion(initialVersion: IResolvable) {
      cdkBuilder.initialVersion(initialVersion.let(IResolvable::unwrap))
    }

    /**
     * The group version to include when the group is created.
     *
     * A group version references the Amazon Resource Name (ARN) of a core definition version,
     * device definition version, subscription definition version, and other version types. The group
     * version must reference a core definition version that contains one core. Other version types are
     * optionally included, depending on your business need.
     *
     *
     * To associate a group version after the group is created, create an
     * [`AWS::Greengrass::GroupVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html)
     * resource and specify the ID of this group.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html#cfn-greengrass-group-initialversion)
     * @param initialVersion The group version to include when the group is created. 
     */
    override fun initialVersion(initialVersion: GroupVersionProperty) {
      cdkBuilder.initialVersion(initialVersion.let(GroupVersionProperty::unwrap))
    }

    /**
     * The group version to include when the group is created.
     *
     * A group version references the Amazon Resource Name (ARN) of a core definition version,
     * device definition version, subscription definition version, and other version types. The group
     * version must reference a core definition version that contains one core. Other version types are
     * optionally included, depending on your business need.
     *
     *
     * To associate a group version after the group is created, create an
     * [`AWS::Greengrass::GroupVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html)
     * resource and specify the ID of this group.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html#cfn-greengrass-group-initialversion)
     * @param initialVersion The group version to include when the group is created. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d1a22b88e72663b90cea6aa2128dac78794d50e3d0b1a80477de81af9140da84")
    override fun initialVersion(initialVersion: GroupVersionProperty.Builder.() -> Unit): Unit =
        initialVersion(GroupVersionProperty(initialVersion))

    /**
     * The name of the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html#cfn-greengrass-group-name)
     * @param name The name of the group. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM role attached to the group.
     *
     * This role contains the permissions that Lambda functions and connectors use to interact with
     * other AWS services.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html#cfn-greengrass-group-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role attached to the group. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * Application-specific metadata to attach to the group.
     *
     * You can use tags in IAM policies to control access to AWS IoT Greengrass resources. You can
     * also use tags to categorize your resources. For more information, see [Tagging Your AWS IoT
     * Greengrass Resources](https://docs.aws.amazon.com/greengrass/v1/developerguide/tagging.html) in
     * the *Developer Guide* .
     *
     * This `Json` property type is processed as a map of key-value pairs. It uses the following
     * format, which is different from most `Tags` implementations in AWS CloudFormation templates.
     *
     * ```
     * "Tags": { "KeyName0": "value", "KeyName1": "value", "KeyName2": "value"
     * }
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html#cfn-greengrass-group-tags)
     * @param tags Application-specific metadata to attach to the group. 
     */
    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.greengrass.CfnGroup = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.greengrass.CfnGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnGroup): CfnGroup =
        CfnGroup(cdkObject)

    internal fun unwrap(wrapped: CfnGroup): software.amazon.awscdk.services.greengrass.CfnGroup =
        wrapped.cdkObject as software.amazon.awscdk.services.greengrass.CfnGroup
  }

  /**
   * A group version in AWS IoT Greengrass , which references of a core definition version, device
   * definition version, subscription definition version, and other version types that contain the
   * components you want to deploy to a Greengrass core device.
   *
   * The group version must reference a core definition version that contains one core. Other
   * version types are optionally included, depending on your business need.
   *
   * In an AWS CloudFormation template, `GroupVersion` is the property type of the `InitialVersion`
   * property in the
   * [`AWS::Greengrass::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
   * resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.greengrass.*;
   * GroupVersionProperty groupVersionProperty = GroupVersionProperty.builder()
   * .connectorDefinitionVersionArn("connectorDefinitionVersionArn")
   * .coreDefinitionVersionArn("coreDefinitionVersionArn")
   * .deviceDefinitionVersionArn("deviceDefinitionVersionArn")
   * .functionDefinitionVersionArn("functionDefinitionVersionArn")
   * .loggerDefinitionVersionArn("loggerDefinitionVersionArn")
   * .resourceDefinitionVersionArn("resourceDefinitionVersionArn")
   * .subscriptionDefinitionVersionArn("subscriptionDefinitionVersionArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-group-groupversion.html)
   */
  public interface GroupVersionProperty {
    /**
     * The Amazon Resource Name (ARN) of the connector definition version that contains the
     * connectors you want to deploy with the group version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-group-groupversion.html#cfn-greengrass-group-groupversion-connectordefinitionversionarn)
     */
    public fun connectorDefinitionVersionArn(): String? =
        unwrap(this).getConnectorDefinitionVersionArn()

    /**
     * The ARN of the core definition version that contains the core you want to deploy with the
     * group version.
     *
     * Currently, the core definition version can contain only one core.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-group-groupversion.html#cfn-greengrass-group-groupversion-coredefinitionversionarn)
     */
    public fun coreDefinitionVersionArn(): String? = unwrap(this).getCoreDefinitionVersionArn()

    /**
     * The ARN of the device definition version that contains the devices you want to deploy with
     * the group version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-group-groupversion.html#cfn-greengrass-group-groupversion-devicedefinitionversionarn)
     */
    public fun deviceDefinitionVersionArn(): String? = unwrap(this).getDeviceDefinitionVersionArn()

    /**
     * The ARN of the function definition version that contains the functions you want to deploy
     * with the group version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-group-groupversion.html#cfn-greengrass-group-groupversion-functiondefinitionversionarn)
     */
    public fun functionDefinitionVersionArn(): String? =
        unwrap(this).getFunctionDefinitionVersionArn()

    /**
     * The ARN of the logger definition version that contains the loggers you want to deploy with
     * the group version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-group-groupversion.html#cfn-greengrass-group-groupversion-loggerdefinitionversionarn)
     */
    public fun loggerDefinitionVersionArn(): String? = unwrap(this).getLoggerDefinitionVersionArn()

    /**
     * The ARN of the resource definition version that contains the resources you want to deploy
     * with the group version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-group-groupversion.html#cfn-greengrass-group-groupversion-resourcedefinitionversionarn)
     */
    public fun resourceDefinitionVersionArn(): String? =
        unwrap(this).getResourceDefinitionVersionArn()

    /**
     * The ARN of the subscription definition version that contains the subscriptions you want to
     * deploy with the group version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-group-groupversion.html#cfn-greengrass-group-groupversion-subscriptiondefinitionversionarn)
     */
    public fun subscriptionDefinitionVersionArn(): String? =
        unwrap(this).getSubscriptionDefinitionVersionArn()

    /**
     * A builder for [GroupVersionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param connectorDefinitionVersionArn The Amazon Resource Name (ARN) of the connector
       * definition version that contains the connectors you want to deploy with the group version.
       */
      public fun connectorDefinitionVersionArn(connectorDefinitionVersionArn: String)

      /**
       * @param coreDefinitionVersionArn The ARN of the core definition version that contains the
       * core you want to deploy with the group version.
       * Currently, the core definition version can contain only one core.
       */
      public fun coreDefinitionVersionArn(coreDefinitionVersionArn: String)

      /**
       * @param deviceDefinitionVersionArn The ARN of the device definition version that contains
       * the devices you want to deploy with the group version.
       */
      public fun deviceDefinitionVersionArn(deviceDefinitionVersionArn: String)

      /**
       * @param functionDefinitionVersionArn The ARN of the function definition version that
       * contains the functions you want to deploy with the group version.
       */
      public fun functionDefinitionVersionArn(functionDefinitionVersionArn: String)

      /**
       * @param loggerDefinitionVersionArn The ARN of the logger definition version that contains
       * the loggers you want to deploy with the group version.
       */
      public fun loggerDefinitionVersionArn(loggerDefinitionVersionArn: String)

      /**
       * @param resourceDefinitionVersionArn The ARN of the resource definition version that
       * contains the resources you want to deploy with the group version.
       */
      public fun resourceDefinitionVersionArn(resourceDefinitionVersionArn: String)

      /**
       * @param subscriptionDefinitionVersionArn The ARN of the subscription definition version that
       * contains the subscriptions you want to deploy with the group version.
       */
      public fun subscriptionDefinitionVersionArn(subscriptionDefinitionVersionArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnGroup.GroupVersionProperty.Builder =
          software.amazon.awscdk.services.greengrass.CfnGroup.GroupVersionProperty.builder()

      /**
       * @param connectorDefinitionVersionArn The Amazon Resource Name (ARN) of the connector
       * definition version that contains the connectors you want to deploy with the group version.
       */
      override fun connectorDefinitionVersionArn(connectorDefinitionVersionArn: String) {
        cdkBuilder.connectorDefinitionVersionArn(connectorDefinitionVersionArn)
      }

      /**
       * @param coreDefinitionVersionArn The ARN of the core definition version that contains the
       * core you want to deploy with the group version.
       * Currently, the core definition version can contain only one core.
       */
      override fun coreDefinitionVersionArn(coreDefinitionVersionArn: String) {
        cdkBuilder.coreDefinitionVersionArn(coreDefinitionVersionArn)
      }

      /**
       * @param deviceDefinitionVersionArn The ARN of the device definition version that contains
       * the devices you want to deploy with the group version.
       */
      override fun deviceDefinitionVersionArn(deviceDefinitionVersionArn: String) {
        cdkBuilder.deviceDefinitionVersionArn(deviceDefinitionVersionArn)
      }

      /**
       * @param functionDefinitionVersionArn The ARN of the function definition version that
       * contains the functions you want to deploy with the group version.
       */
      override fun functionDefinitionVersionArn(functionDefinitionVersionArn: String) {
        cdkBuilder.functionDefinitionVersionArn(functionDefinitionVersionArn)
      }

      /**
       * @param loggerDefinitionVersionArn The ARN of the logger definition version that contains
       * the loggers you want to deploy with the group version.
       */
      override fun loggerDefinitionVersionArn(loggerDefinitionVersionArn: String) {
        cdkBuilder.loggerDefinitionVersionArn(loggerDefinitionVersionArn)
      }

      /**
       * @param resourceDefinitionVersionArn The ARN of the resource definition version that
       * contains the resources you want to deploy with the group version.
       */
      override fun resourceDefinitionVersionArn(resourceDefinitionVersionArn: String) {
        cdkBuilder.resourceDefinitionVersionArn(resourceDefinitionVersionArn)
      }

      /**
       * @param subscriptionDefinitionVersionArn The ARN of the subscription definition version that
       * contains the subscriptions you want to deploy with the group version.
       */
      override fun subscriptionDefinitionVersionArn(subscriptionDefinitionVersionArn: String) {
        cdkBuilder.subscriptionDefinitionVersionArn(subscriptionDefinitionVersionArn)
      }

      public fun build(): software.amazon.awscdk.services.greengrass.CfnGroup.GroupVersionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.greengrass.CfnGroup.GroupVersionProperty,
    ) : CdkObject(cdkObject), GroupVersionProperty {
      /**
       * The Amazon Resource Name (ARN) of the connector definition version that contains the
       * connectors you want to deploy with the group version.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-group-groupversion.html#cfn-greengrass-group-groupversion-connectordefinitionversionarn)
       */
      override fun connectorDefinitionVersionArn(): String? =
          unwrap(this).getConnectorDefinitionVersionArn()

      /**
       * The ARN of the core definition version that contains the core you want to deploy with the
       * group version.
       *
       * Currently, the core definition version can contain only one core.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-group-groupversion.html#cfn-greengrass-group-groupversion-coredefinitionversionarn)
       */
      override fun coreDefinitionVersionArn(): String? = unwrap(this).getCoreDefinitionVersionArn()

      /**
       * The ARN of the device definition version that contains the devices you want to deploy with
       * the group version.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-group-groupversion.html#cfn-greengrass-group-groupversion-devicedefinitionversionarn)
       */
      override fun deviceDefinitionVersionArn(): String? =
          unwrap(this).getDeviceDefinitionVersionArn()

      /**
       * The ARN of the function definition version that contains the functions you want to deploy
       * with the group version.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-group-groupversion.html#cfn-greengrass-group-groupversion-functiondefinitionversionarn)
       */
      override fun functionDefinitionVersionArn(): String? =
          unwrap(this).getFunctionDefinitionVersionArn()

      /**
       * The ARN of the logger definition version that contains the loggers you want to deploy with
       * the group version.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-group-groupversion.html#cfn-greengrass-group-groupversion-loggerdefinitionversionarn)
       */
      override fun loggerDefinitionVersionArn(): String? =
          unwrap(this).getLoggerDefinitionVersionArn()

      /**
       * The ARN of the resource definition version that contains the resources you want to deploy
       * with the group version.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-group-groupversion.html#cfn-greengrass-group-groupversion-resourcedefinitionversionarn)
       */
      override fun resourceDefinitionVersionArn(): String? =
          unwrap(this).getResourceDefinitionVersionArn()

      /**
       * The ARN of the subscription definition version that contains the subscriptions you want to
       * deploy with the group version.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-group-groupversion.html#cfn-greengrass-group-groupversion-subscriptiondefinitionversionarn)
       */
      override fun subscriptionDefinitionVersionArn(): String? =
          unwrap(this).getSubscriptionDefinitionVersionArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GroupVersionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnGroup.GroupVersionProperty):
          GroupVersionProperty = CdkObjectWrappers.wrap(cdkObject) as? GroupVersionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: GroupVersionProperty):
          software.amazon.awscdk.services.greengrass.CfnGroup.GroupVersionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnGroup.GroupVersionProperty
    }
  }
}

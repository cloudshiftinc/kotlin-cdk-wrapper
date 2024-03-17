@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.greengrass.*;
 * Object tags;
 * CfnGroupProps cfnGroupProps = CfnGroupProps.builder()
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
public interface CfnGroupProps {
  /**
   * The group version to include when the group is created.
   *
   * A group version references the Amazon Resource Name (ARN) of a core definition version, device
   * definition version, subscription definition version, and other version types. The group version
   * must reference a core definition version that contains one core. Other version types are
   * optionally included, depending on your business need.
   *
   *
   * To associate a group version after the group is created, create an
   * [`AWS::Greengrass::GroupVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html)
   * resource and specify the ID of this group.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html#cfn-greengrass-group-initialversion)
   */
  public fun initialVersion(): Any? = unwrap(this).getInitialVersion()

  /**
   * The name of the group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html#cfn-greengrass-group-name)
   */
  public fun name(): String

  /**
   * The Amazon Resource Name (ARN) of the IAM role attached to the group.
   *
   * This role contains the permissions that Lambda functions and connectors use to interact with
   * other AWS services.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html#cfn-greengrass-group-rolearn)
   */
  public fun roleArn(): String? = unwrap(this).getRoleArn()

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
   */
  public fun tags(): Any? = unwrap(this).getTags()

  /**
   * A builder for [CfnGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param initialVersion The group version to include when the group is created.
     * A group version references the Amazon Resource Name (ARN) of a core definition version,
     * device definition version, subscription definition version, and other version types. The group
     * version must reference a core definition version that contains one core. Other version types are
     * optionally included, depending on your business need.
     *
     *
     * To associate a group version after the group is created, create an
     * [`AWS::Greengrass::GroupVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html)
     * resource and specify the ID of this group.
     */
    public fun initialVersion(initialVersion: IResolvable)

    /**
     * @param initialVersion The group version to include when the group is created.
     * A group version references the Amazon Resource Name (ARN) of a core definition version,
     * device definition version, subscription definition version, and other version types. The group
     * version must reference a core definition version that contains one core. Other version types are
     * optionally included, depending on your business need.
     *
     *
     * To associate a group version after the group is created, create an
     * [`AWS::Greengrass::GroupVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html)
     * resource and specify the ID of this group.
     */
    public fun initialVersion(initialVersion: CfnGroup.GroupVersionProperty)

    /**
     * @param initialVersion The group version to include when the group is created.
     * A group version references the Amazon Resource Name (ARN) of a core definition version,
     * device definition version, subscription definition version, and other version types. The group
     * version must reference a core definition version that contains one core. Other version types are
     * optionally included, depending on your business need.
     *
     *
     * To associate a group version after the group is created, create an
     * [`AWS::Greengrass::GroupVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html)
     * resource and specify the ID of this group.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("742fa2edf54bc8935b58750fee1e5fa9d9eda7d1c4fd8d42a763d6ee334ad548")
    public fun initialVersion(initialVersion: CfnGroup.GroupVersionProperty.Builder.() -> Unit)

    /**
     * @param name The name of the group. 
     */
    public fun name(name: String)

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role attached to the group.
     * This role contains the permissions that Lambda functions and connectors use to interact with
     * other AWS services.
     */
    public fun roleArn(roleArn: String)

    /**
     * @param tags Application-specific metadata to attach to the group.
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
     */
    public fun tags(tags: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.greengrass.CfnGroupProps.Builder =
        software.amazon.awscdk.services.greengrass.CfnGroupProps.builder()

    /**
     * @param initialVersion The group version to include when the group is created.
     * A group version references the Amazon Resource Name (ARN) of a core definition version,
     * device definition version, subscription definition version, and other version types. The group
     * version must reference a core definition version that contains one core. Other version types are
     * optionally included, depending on your business need.
     *
     *
     * To associate a group version after the group is created, create an
     * [`AWS::Greengrass::GroupVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html)
     * resource and specify the ID of this group.
     */
    override fun initialVersion(initialVersion: IResolvable) {
      cdkBuilder.initialVersion(initialVersion.let(IResolvable::unwrap))
    }

    /**
     * @param initialVersion The group version to include when the group is created.
     * A group version references the Amazon Resource Name (ARN) of a core definition version,
     * device definition version, subscription definition version, and other version types. The group
     * version must reference a core definition version that contains one core. Other version types are
     * optionally included, depending on your business need.
     *
     *
     * To associate a group version after the group is created, create an
     * [`AWS::Greengrass::GroupVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html)
     * resource and specify the ID of this group.
     */
    override fun initialVersion(initialVersion: CfnGroup.GroupVersionProperty) {
      cdkBuilder.initialVersion(initialVersion.let(CfnGroup.GroupVersionProperty::unwrap))
    }

    /**
     * @param initialVersion The group version to include when the group is created.
     * A group version references the Amazon Resource Name (ARN) of a core definition version,
     * device definition version, subscription definition version, and other version types. The group
     * version must reference a core definition version that contains one core. Other version types are
     * optionally included, depending on your business need.
     *
     *
     * To associate a group version after the group is created, create an
     * [`AWS::Greengrass::GroupVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html)
     * resource and specify the ID of this group.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("742fa2edf54bc8935b58750fee1e5fa9d9eda7d1c4fd8d42a763d6ee334ad548")
    override fun initialVersion(initialVersion: CfnGroup.GroupVersionProperty.Builder.() -> Unit):
        Unit = initialVersion(CfnGroup.GroupVersionProperty(initialVersion))

    /**
     * @param name The name of the group. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role attached to the group.
     * This role contains the permissions that Lambda functions and connectors use to interact with
     * other AWS services.
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param tags Application-specific metadata to attach to the group.
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
     */
    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.greengrass.CfnGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.greengrass.CfnGroupProps,
  ) : CdkObject(cdkObject), CfnGroupProps {
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
     */
    override fun initialVersion(): Any? = unwrap(this).getInitialVersion()

    /**
     * The name of the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html#cfn-greengrass-group-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The Amazon Resource Name (ARN) of the IAM role attached to the group.
     *
     * This role contains the permissions that Lambda functions and connectors use to interact with
     * other AWS services.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html#cfn-greengrass-group-rolearn)
     */
    override fun roleArn(): String? = unwrap(this).getRoleArn()

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
     */
    override fun tags(): Any? = unwrap(this).getTags()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnGroupProps):
        CfnGroupProps = CdkObjectWrappers.wrap(cdkObject) as? CfnGroupProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnGroupProps):
        software.amazon.awscdk.services.greengrass.CfnGroupProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.greengrass.CfnGroupProps
  }
}

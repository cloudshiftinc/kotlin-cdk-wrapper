@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ram

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
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
 * Creates a customer managed permission for a specified resource type that you can attach to
 * resource shares.
 *
 * It is created in the AWS Region in which you call the operation.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ram.*;
 * Object policyTemplate;
 * CfnPermission cfnPermission = CfnPermission.Builder.create(this, "MyCfnPermission")
 * .name("name")
 * .policyTemplate(policyTemplate)
 * .resourceType("resourceType")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-permission.html)
 */
public open class CfnPermission internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ram.CfnPermission,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The Amazon Resource Name (ARN) of the new permission.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Specifies whether this permission is the default for new resource shares that include resources
   * of the associated resource type.
   */
  public open fun attrIsResourceTypeDefault(): IResolvable =
      unwrap(this).getAttrIsResourceTypeDefault().let(IResolvable::wrap)

  /**
   * The type of managed permission. This can be one of the following values:.
   *
   * * *AWS_MANAGED_PERMISSION* – AWS created and manages this managed permission. You can associate
   * it with your resource shares, but you can't modify it.
   * * *CUSTOMER_MANAGED_PERMISSION* – You, or another principal in your account created this
   * managed permission. You can associate it with your resource shares and create new versions that
   * have different permissions.
   */
  public open fun attrPermissionType(): String = unwrap(this).getAttrPermissionType()

  /**
   * The version number for this version of the permission.
   */
  public open fun attrVersion(): String = unwrap(this).getAttrVersion()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Specifies the name of the customer managed permission.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * Specifies the name of the customer managed permission.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * A string in JSON format string that contains the following elements of a resource-based
   * policy:.
   */
  public open fun policyTemplate(): Any = unwrap(this).getPolicyTemplate()

  /**
   * A string in JSON format string that contains the following elements of a resource-based
   * policy:.
   */
  public open fun policyTemplate(`value`: Any) {
    unwrap(this).setPolicyTemplate(`value`)
  }

  /**
   * Specifies the name of the resource type that this customer managed permission applies to.
   */
  public open fun resourceType(): String = unwrap(this).getResourceType()

  /**
   * Specifies the name of the resource type that this customer managed permission applies to.
   */
  public open fun resourceType(`value`: String) {
    unwrap(this).setResourceType(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Specifies a list of one or more tag key and value pairs to attach to the permission.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Specifies a list of one or more tag key and value pairs to attach to the permission.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Specifies a list of one or more tag key and value pairs to attach to the permission.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ram.CfnPermission].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies the name of the customer managed permission.
     *
     * The name must be unique within the AWS Region .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-permission.html#cfn-ram-permission-name)
     * @param name Specifies the name of the customer managed permission. 
     */
    public fun name(name: String)

    /**
     * A string in JSON format string that contains the following elements of a resource-based
     * policy:.
     *
     * * *Effect* : must be set to `ALLOW` .
     * * *Action* : specifies the actions that are allowed by this customer managed permission. The
     * list must contain only actions that are supported by the specified resource type. For a list of
     * all actions supported by each resource type, see [Actions, resources, and condition keys for AWS
     * services](https://docs.aws.amazon.com/service-authorization/latest/reference/reference_policies_actions-resources-contextkeys.html)
     * in the *AWS Identity and Access Management User Guide* .
     * * *Condition* : (optional) specifies conditional parameters that must evaluate to true when a
     * user attempts an action for that action to be allowed. For more information about the Condition
     * element, see [IAM policies: Condition
     * element](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_condition.html)
     * in the *AWS Identity and Access Management User Guide* .
     *
     * This template can't include either the `Resource` or `Principal` elements. Those are both
     * filled in by AWS RAM when it instantiates the resource-based policy on each resource shared
     * using this managed permission. The `Resource` comes from the ARN of the specific resource that
     * you are sharing. The `Principal` comes from the list of identities added to the resource share.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-permission.html#cfn-ram-permission-policytemplate)
     * @param policyTemplate A string in JSON format string that contains the following elements of
     * a resource-based policy:. 
     */
    public fun policyTemplate(policyTemplate: Any)

    /**
     * Specifies the name of the resource type that this customer managed permission applies to.
     *
     * The format is `*&lt;service-code&gt;* : *&lt;resource-type&gt;*` and is not case sensitive.
     * For example, to specify an Amazon EC2 Subnet, you can use the string `ec2:subnet` . To see the
     * list of valid values for this parameter, query the
     * [ListResourceTypes](https://docs.aws.amazon.com/ram/latest/APIReference/API_ListResourceTypes.html)
     * operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-permission.html#cfn-ram-permission-resourcetype)
     * @param resourceType Specifies the name of the resource type that this customer managed
     * permission applies to. 
     */
    public fun resourceType(resourceType: String)

    /**
     * Specifies a list of one or more tag key and value pairs to attach to the permission.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-permission.html#cfn-ram-permission-tags)
     * @param tags Specifies a list of one or more tag key and value pairs to attach to the
     * permission. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Specifies a list of one or more tag key and value pairs to attach to the permission.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-permission.html#cfn-ram-permission-tags)
     * @param tags Specifies a list of one or more tag key and value pairs to attach to the
     * permission. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ram.CfnPermission.Builder =
        software.amazon.awscdk.services.ram.CfnPermission.Builder.create(scope, id)

    /**
     * Specifies the name of the customer managed permission.
     *
     * The name must be unique within the AWS Region .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-permission.html#cfn-ram-permission-name)
     * @param name Specifies the name of the customer managed permission. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * A string in JSON format string that contains the following elements of a resource-based
     * policy:.
     *
     * * *Effect* : must be set to `ALLOW` .
     * * *Action* : specifies the actions that are allowed by this customer managed permission. The
     * list must contain only actions that are supported by the specified resource type. For a list of
     * all actions supported by each resource type, see [Actions, resources, and condition keys for AWS
     * services](https://docs.aws.amazon.com/service-authorization/latest/reference/reference_policies_actions-resources-contextkeys.html)
     * in the *AWS Identity and Access Management User Guide* .
     * * *Condition* : (optional) specifies conditional parameters that must evaluate to true when a
     * user attempts an action for that action to be allowed. For more information about the Condition
     * element, see [IAM policies: Condition
     * element](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_condition.html)
     * in the *AWS Identity and Access Management User Guide* .
     *
     * This template can't include either the `Resource` or `Principal` elements. Those are both
     * filled in by AWS RAM when it instantiates the resource-based policy on each resource shared
     * using this managed permission. The `Resource` comes from the ARN of the specific resource that
     * you are sharing. The `Principal` comes from the list of identities added to the resource share.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-permission.html#cfn-ram-permission-policytemplate)
     * @param policyTemplate A string in JSON format string that contains the following elements of
     * a resource-based policy:. 
     */
    override fun policyTemplate(policyTemplate: Any) {
      cdkBuilder.policyTemplate(policyTemplate)
    }

    /**
     * Specifies the name of the resource type that this customer managed permission applies to.
     *
     * The format is `*&lt;service-code&gt;* : *&lt;resource-type&gt;*` and is not case sensitive.
     * For example, to specify an Amazon EC2 Subnet, you can use the string `ec2:subnet` . To see the
     * list of valid values for this parameter, query the
     * [ListResourceTypes](https://docs.aws.amazon.com/ram/latest/APIReference/API_ListResourceTypes.html)
     * operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-permission.html#cfn-ram-permission-resourcetype)
     * @param resourceType Specifies the name of the resource type that this customer managed
     * permission applies to. 
     */
    override fun resourceType(resourceType: String) {
      cdkBuilder.resourceType(resourceType)
    }

    /**
     * Specifies a list of one or more tag key and value pairs to attach to the permission.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-permission.html#cfn-ram-permission-tags)
     * @param tags Specifies a list of one or more tag key and value pairs to attach to the
     * permission. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Specifies a list of one or more tag key and value pairs to attach to the permission.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-permission.html#cfn-ram-permission-tags)
     * @param tags Specifies a list of one or more tag key and value pairs to attach to the
     * permission. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ram.CfnPermission = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ram.CfnPermission.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPermission {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPermission(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ram.CfnPermission): CfnPermission =
        CfnPermission(cdkObject)

    internal fun unwrap(wrapped: CfnPermission): software.amazon.awscdk.services.ram.CfnPermission =
        wrapped.cdkObject
  }
}

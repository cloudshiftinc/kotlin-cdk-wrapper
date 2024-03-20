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
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a resource share.
 *
 * You can provide a list of the Amazon Resource Names (ARNs) for the resources that you want to
 * share, a list of principals you want to share the resources with, and the permissions to grant those
 * principals.
 *
 *
 * Sharing a resource makes it available for use by principals outside of the AWS account that
 * created the resource. Sharing doesn't change any permissions or quotas that apply to the resource in
 * the account that created it.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ram.*;
 * CfnResourceShare cfnResourceShare = CfnResourceShare.Builder.create(this, "MyCfnResourceShare")
 * .name("name")
 * // the properties below are optional
 * .allowExternalPrincipals(false)
 * .permissionArns(List.of("permissionArns"))
 * .principals(List.of("principals"))
 * .resourceArns(List.of("resourceArns"))
 * .sources(List.of("sources"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-resourceshare.html)
 */
public open class CfnResourceShare internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ram.CfnResourceShare,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnResourceShareProps,
  ) :
      this(software.amazon.awscdk.services.ram.CfnResourceShare(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnResourceShareProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnResourceShareProps.Builder.() -> Unit,
  ) : this(scope, id, CfnResourceShareProps(props)
  )

  /**
   * Specifies whether principals outside your organization in AWS Organizations can be associated
   * with a resource share.
   */
  public open fun allowExternalPrincipals(): Any? = unwrap(this).getAllowExternalPrincipals()

  /**
   * Specifies whether principals outside your organization in AWS Organizations can be associated
   * with a resource share.
   */
  public open fun allowExternalPrincipals(`value`: Boolean) {
    unwrap(this).setAllowExternalPrincipals(`value`)
  }

  /**
   * Specifies whether principals outside your organization in AWS Organizations can be associated
   * with a resource share.
   */
  public open fun allowExternalPrincipals(`value`: IResolvable) {
    unwrap(this).setAllowExternalPrincipals(`value`.let(IResolvable::unwrap))
  }

  /**
   * The Amazon Resource Name (ARN) of the resource share.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Specifies the name of the resource share.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * Specifies the name of the resource share.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Specifies the [Amazon Resource Names
   * (ARNs)](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html) of the AWS
   * RAM permission to associate with the resource share. If you do not specify an ARN for the
   * permission, AWS RAM automatically attaches the default version of the permission for each resource
   * type. You can associate only one permission with each resource type included in the resource
   * share.
   */
  public open fun permissionArns(): List<String> = unwrap(this).getPermissionArns() ?: emptyList()

  /**
   * Specifies the [Amazon Resource Names
   * (ARNs)](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html) of the AWS
   * RAM permission to associate with the resource share. If you do not specify an ARN for the
   * permission, AWS RAM automatically attaches the default version of the permission for each resource
   * type. You can associate only one permission with each resource type included in the resource
   * share.
   */
  public open fun permissionArns(`value`: List<String>) {
    unwrap(this).setPermissionArns(`value`)
  }

  /**
   * Specifies the [Amazon Resource Names
   * (ARNs)](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html) of the AWS
   * RAM permission to associate with the resource share. If you do not specify an ARN for the
   * permission, AWS RAM automatically attaches the default version of the permission for each resource
   * type. You can associate only one permission with each resource type included in the resource
   * share.
   */
  public open fun permissionArns(vararg `value`: String): Unit = permissionArns(`value`.toList())

  /**
   * Specifies the principals to associate with the resource share.
   *
   * The possible values are:.
   */
  public open fun principals(): List<String> = unwrap(this).getPrincipals() ?: emptyList()

  /**
   * Specifies the principals to associate with the resource share.
   *
   * The possible values are:.
   */
  public open fun principals(`value`: List<String>) {
    unwrap(this).setPrincipals(`value`)
  }

  /**
   * Specifies the principals to associate with the resource share.
   *
   * The possible values are:.
   */
  public open fun principals(vararg `value`: String): Unit = principals(`value`.toList())

  /**
   * Specifies a list of one or more ARNs of the resources to associate with the resource share.
   */
  public open fun resourceArns(): List<String> = unwrap(this).getResourceArns() ?: emptyList()

  /**
   * Specifies a list of one or more ARNs of the resources to associate with the resource share.
   */
  public open fun resourceArns(`value`: List<String>) {
    unwrap(this).setResourceArns(`value`)
  }

  /**
   * Specifies a list of one or more ARNs of the resources to associate with the resource share.
   */
  public open fun resourceArns(vararg `value`: String): Unit = resourceArns(`value`.toList())

  /**
   *
   */
  public open fun sources(): List<String> = unwrap(this).getSources() ?: emptyList()

  /**
   *
   */
  public open fun sources(`value`: List<String>) {
    unwrap(this).setSources(`value`)
  }

  /**
   *
   */
  public open fun sources(vararg `value`: String): Unit = sources(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Specifies one or more tags to attach to the resource share itself.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Specifies one or more tags to attach to the resource share itself.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Specifies one or more tags to attach to the resource share itself.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ram.CfnResourceShare].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies whether principals outside your organization in AWS Organizations can be associated
     * with a resource share.
     *
     * A value of `true` lets you share with individual AWS accounts that are *not* in your
     * organization. A value of `false` only has meaning if your account is a member of an AWS
     * Organization. The default value is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-resourceshare.html#cfn-ram-resourceshare-allowexternalprincipals)
     * @param allowExternalPrincipals Specifies whether principals outside your organization in AWS
     * Organizations can be associated with a resource share. 
     */
    public fun allowExternalPrincipals(allowExternalPrincipals: Boolean)

    /**
     * Specifies whether principals outside your organization in AWS Organizations can be associated
     * with a resource share.
     *
     * A value of `true` lets you share with individual AWS accounts that are *not* in your
     * organization. A value of `false` only has meaning if your account is a member of an AWS
     * Organization. The default value is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-resourceshare.html#cfn-ram-resourceshare-allowexternalprincipals)
     * @param allowExternalPrincipals Specifies whether principals outside your organization in AWS
     * Organizations can be associated with a resource share. 
     */
    public fun allowExternalPrincipals(allowExternalPrincipals: IResolvable)

    /**
     * Specifies the name of the resource share.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-resourceshare.html#cfn-ram-resourceshare-name)
     * @param name Specifies the name of the resource share. 
     */
    public fun name(name: String)

    /**
     * Specifies the [Amazon Resource Names
     * (ARNs)](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html) of the AWS
     * RAM permission to associate with the resource share. If you do not specify an ARN for the
     * permission, AWS RAM automatically attaches the default version of the permission for each
     * resource type. You can associate only one permission with each resource type included in the
     * resource share.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-resourceshare.html#cfn-ram-resourceshare-permissionarns)
     * @param permissionArns Specifies the [Amazon Resource Names
     * (ARNs)](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html) of the AWS
     * RAM permission to associate with the resource share. If you do not specify an ARN for the
     * permission, AWS RAM automatically attaches the default version of the permission for each
     * resource type. You can associate only one permission with each resource type included in the
     * resource share. 
     */
    public fun permissionArns(permissionArns: List<String>)

    /**
     * Specifies the [Amazon Resource Names
     * (ARNs)](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html) of the AWS
     * RAM permission to associate with the resource share. If you do not specify an ARN for the
     * permission, AWS RAM automatically attaches the default version of the permission for each
     * resource type. You can associate only one permission with each resource type included in the
     * resource share.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-resourceshare.html#cfn-ram-resourceshare-permissionarns)
     * @param permissionArns Specifies the [Amazon Resource Names
     * (ARNs)](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html) of the AWS
     * RAM permission to associate with the resource share. If you do not specify an ARN for the
     * permission, AWS RAM automatically attaches the default version of the permission for each
     * resource type. You can associate only one permission with each resource type included in the
     * resource share. 
     */
    public fun permissionArns(vararg permissionArns: String)

    /**
     * Specifies the principals to associate with the resource share. The possible values are:.
     *
     * * An AWS account ID
     * * An Amazon Resource Name (ARN) of an organization in AWS Organizations
     * * An ARN of an organizational unit (OU) in AWS Organizations
     * * An ARN of an IAM role
     * * An ARN of an IAM user
     *
     *
     * Not all resource types can be shared with IAM roles and users. For more information, see the
     * column *Can share with IAM roles and users* in the tables on [Shareable AWS
     * resources](https://docs.aws.amazon.com/ram/latest/userguide/shareable.html) in the *AWS Resource
     * Access Manager User Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-resourceshare.html#cfn-ram-resourceshare-principals)
     * @param principals Specifies the principals to associate with the resource share. The possible
     * values are:. 
     */
    public fun principals(principals: List<String>)

    /**
     * Specifies the principals to associate with the resource share. The possible values are:.
     *
     * * An AWS account ID
     * * An Amazon Resource Name (ARN) of an organization in AWS Organizations
     * * An ARN of an organizational unit (OU) in AWS Organizations
     * * An ARN of an IAM role
     * * An ARN of an IAM user
     *
     *
     * Not all resource types can be shared with IAM roles and users. For more information, see the
     * column *Can share with IAM roles and users* in the tables on [Shareable AWS
     * resources](https://docs.aws.amazon.com/ram/latest/userguide/shareable.html) in the *AWS Resource
     * Access Manager User Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-resourceshare.html#cfn-ram-resourceshare-principals)
     * @param principals Specifies the principals to associate with the resource share. The possible
     * values are:. 
     */
    public fun principals(vararg principals: String)

    /**
     * Specifies a list of one or more ARNs of the resources to associate with the resource share.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-resourceshare.html#cfn-ram-resourceshare-resourcearns)
     * @param resourceArns Specifies a list of one or more ARNs of the resources to associate with
     * the resource share. 
     */
    public fun resourceArns(resourceArns: List<String>)

    /**
     * Specifies a list of one or more ARNs of the resources to associate with the resource share.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-resourceshare.html#cfn-ram-resourceshare-resourcearns)
     * @param resourceArns Specifies a list of one or more ARNs of the resources to associate with
     * the resource share. 
     */
    public fun resourceArns(vararg resourceArns: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-resourceshare.html#cfn-ram-resourceshare-sources)
     * @param sources 
     */
    public fun sources(sources: List<String>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-resourceshare.html#cfn-ram-resourceshare-sources)
     * @param sources 
     */
    public fun sources(vararg sources: String)

    /**
     * Specifies one or more tags to attach to the resource share itself.
     *
     * It doesn't attach the tags to the resources associated with the resource share.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-resourceshare.html#cfn-ram-resourceshare-tags)
     * @param tags Specifies one or more tags to attach to the resource share itself. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Specifies one or more tags to attach to the resource share itself.
     *
     * It doesn't attach the tags to the resources associated with the resource share.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-resourceshare.html#cfn-ram-resourceshare-tags)
     * @param tags Specifies one or more tags to attach to the resource share itself. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ram.CfnResourceShare.Builder =
        software.amazon.awscdk.services.ram.CfnResourceShare.Builder.create(scope, id)

    /**
     * Specifies whether principals outside your organization in AWS Organizations can be associated
     * with a resource share.
     *
     * A value of `true` lets you share with individual AWS accounts that are *not* in your
     * organization. A value of `false` only has meaning if your account is a member of an AWS
     * Organization. The default value is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-resourceshare.html#cfn-ram-resourceshare-allowexternalprincipals)
     * @param allowExternalPrincipals Specifies whether principals outside your organization in AWS
     * Organizations can be associated with a resource share. 
     */
    override fun allowExternalPrincipals(allowExternalPrincipals: Boolean) {
      cdkBuilder.allowExternalPrincipals(allowExternalPrincipals)
    }

    /**
     * Specifies whether principals outside your organization in AWS Organizations can be associated
     * with a resource share.
     *
     * A value of `true` lets you share with individual AWS accounts that are *not* in your
     * organization. A value of `false` only has meaning if your account is a member of an AWS
     * Organization. The default value is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-resourceshare.html#cfn-ram-resourceshare-allowexternalprincipals)
     * @param allowExternalPrincipals Specifies whether principals outside your organization in AWS
     * Organizations can be associated with a resource share. 
     */
    override fun allowExternalPrincipals(allowExternalPrincipals: IResolvable) {
      cdkBuilder.allowExternalPrincipals(allowExternalPrincipals.let(IResolvable::unwrap))
    }

    /**
     * Specifies the name of the resource share.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-resourceshare.html#cfn-ram-resourceshare-name)
     * @param name Specifies the name of the resource share. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Specifies the [Amazon Resource Names
     * (ARNs)](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html) of the AWS
     * RAM permission to associate with the resource share. If you do not specify an ARN for the
     * permission, AWS RAM automatically attaches the default version of the permission for each
     * resource type. You can associate only one permission with each resource type included in the
     * resource share.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-resourceshare.html#cfn-ram-resourceshare-permissionarns)
     * @param permissionArns Specifies the [Amazon Resource Names
     * (ARNs)](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html) of the AWS
     * RAM permission to associate with the resource share. If you do not specify an ARN for the
     * permission, AWS RAM automatically attaches the default version of the permission for each
     * resource type. You can associate only one permission with each resource type included in the
     * resource share. 
     */
    override fun permissionArns(permissionArns: List<String>) {
      cdkBuilder.permissionArns(permissionArns)
    }

    /**
     * Specifies the [Amazon Resource Names
     * (ARNs)](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html) of the AWS
     * RAM permission to associate with the resource share. If you do not specify an ARN for the
     * permission, AWS RAM automatically attaches the default version of the permission for each
     * resource type. You can associate only one permission with each resource type included in the
     * resource share.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-resourceshare.html#cfn-ram-resourceshare-permissionarns)
     * @param permissionArns Specifies the [Amazon Resource Names
     * (ARNs)](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html) of the AWS
     * RAM permission to associate with the resource share. If you do not specify an ARN for the
     * permission, AWS RAM automatically attaches the default version of the permission for each
     * resource type. You can associate only one permission with each resource type included in the
     * resource share. 
     */
    override fun permissionArns(vararg permissionArns: String): Unit =
        permissionArns(permissionArns.toList())

    /**
     * Specifies the principals to associate with the resource share. The possible values are:.
     *
     * * An AWS account ID
     * * An Amazon Resource Name (ARN) of an organization in AWS Organizations
     * * An ARN of an organizational unit (OU) in AWS Organizations
     * * An ARN of an IAM role
     * * An ARN of an IAM user
     *
     *
     * Not all resource types can be shared with IAM roles and users. For more information, see the
     * column *Can share with IAM roles and users* in the tables on [Shareable AWS
     * resources](https://docs.aws.amazon.com/ram/latest/userguide/shareable.html) in the *AWS Resource
     * Access Manager User Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-resourceshare.html#cfn-ram-resourceshare-principals)
     * @param principals Specifies the principals to associate with the resource share. The possible
     * values are:. 
     */
    override fun principals(principals: List<String>) {
      cdkBuilder.principals(principals)
    }

    /**
     * Specifies the principals to associate with the resource share. The possible values are:.
     *
     * * An AWS account ID
     * * An Amazon Resource Name (ARN) of an organization in AWS Organizations
     * * An ARN of an organizational unit (OU) in AWS Organizations
     * * An ARN of an IAM role
     * * An ARN of an IAM user
     *
     *
     * Not all resource types can be shared with IAM roles and users. For more information, see the
     * column *Can share with IAM roles and users* in the tables on [Shareable AWS
     * resources](https://docs.aws.amazon.com/ram/latest/userguide/shareable.html) in the *AWS Resource
     * Access Manager User Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-resourceshare.html#cfn-ram-resourceshare-principals)
     * @param principals Specifies the principals to associate with the resource share. The possible
     * values are:. 
     */
    override fun principals(vararg principals: String): Unit = principals(principals.toList())

    /**
     * Specifies a list of one or more ARNs of the resources to associate with the resource share.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-resourceshare.html#cfn-ram-resourceshare-resourcearns)
     * @param resourceArns Specifies a list of one or more ARNs of the resources to associate with
     * the resource share. 
     */
    override fun resourceArns(resourceArns: List<String>) {
      cdkBuilder.resourceArns(resourceArns)
    }

    /**
     * Specifies a list of one or more ARNs of the resources to associate with the resource share.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-resourceshare.html#cfn-ram-resourceshare-resourcearns)
     * @param resourceArns Specifies a list of one or more ARNs of the resources to associate with
     * the resource share. 
     */
    override fun resourceArns(vararg resourceArns: String): Unit =
        resourceArns(resourceArns.toList())

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-resourceshare.html#cfn-ram-resourceshare-sources)
     * @param sources 
     */
    override fun sources(sources: List<String>) {
      cdkBuilder.sources(sources)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-resourceshare.html#cfn-ram-resourceshare-sources)
     * @param sources 
     */
    override fun sources(vararg sources: String): Unit = sources(sources.toList())

    /**
     * Specifies one or more tags to attach to the resource share itself.
     *
     * It doesn't attach the tags to the resources associated with the resource share.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-resourceshare.html#cfn-ram-resourceshare-tags)
     * @param tags Specifies one or more tags to attach to the resource share itself. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Specifies one or more tags to attach to the resource share itself.
     *
     * It doesn't attach the tags to the resources associated with the resource share.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-resourceshare.html#cfn-ram-resourceshare-tags)
     * @param tags Specifies one or more tags to attach to the resource share itself. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ram.CfnResourceShare = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ram.CfnResourceShare.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResourceShare {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResourceShare(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ram.CfnResourceShare):
        CfnResourceShare = CfnResourceShare(cdkObject)

    internal fun unwrap(wrapped: CfnResourceShare):
        software.amazon.awscdk.services.ram.CfnResourceShare = wrapped.cdkObject
  }
}

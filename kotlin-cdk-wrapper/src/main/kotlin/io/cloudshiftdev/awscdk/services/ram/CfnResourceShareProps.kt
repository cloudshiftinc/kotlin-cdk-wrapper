@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ram

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnResourceShare`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ram.*;
 * CfnResourceShareProps cfnResourceShareProps = CfnResourceShareProps.builder()
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
public interface CfnResourceShareProps {
  /**
   * Specifies whether principals outside your organization in AWS Organizations can be associated
   * with a resource share.
   *
   * A value of `true` lets you share with individual AWS accounts that are *not* in your
   * organization. A value of `false` only has meaning if your account is a member of an AWS
   * Organization. The default value is `true` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-resourceshare.html#cfn-ram-resourceshare-allowexternalprincipals)
   */
  public fun allowExternalPrincipals(): Any? = unwrap(this).getAllowExternalPrincipals()

  /**
   * Specifies the name of the resource share.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-resourceshare.html#cfn-ram-resourceshare-name)
   */
  public fun name(): String

  /**
   * Specifies the [Amazon Resource Names
   * (ARNs)](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html) of the AWS
   * RAM permission to associate with the resource share. If you do not specify an ARN for the
   * permission, AWS RAM automatically attaches the default version of the permission for each resource
   * type. You can associate only one permission with each resource type included in the resource
   * share.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-resourceshare.html#cfn-ram-resourceshare-permissionarns)
   */
  public fun permissionArns(): List<String> = unwrap(this).getPermissionArns() ?: emptyList()

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
   */
  public fun principals(): List<String> = unwrap(this).getPrincipals() ?: emptyList()

  /**
   * Specifies a list of one or more ARNs of the resources to associate with the resource share.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-resourceshare.html#cfn-ram-resourceshare-resourcearns)
   */
  public fun resourceArns(): List<String> = unwrap(this).getResourceArns() ?: emptyList()

  /**
   * Specifies from which source accounts the service principal has access to the resources in this
   * resource share.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-resourceshare.html#cfn-ram-resourceshare-sources)
   */
  public fun sources(): List<String> = unwrap(this).getSources() ?: emptyList()

  /**
   * Specifies one or more tags to attach to the resource share itself.
   *
   * It doesn't attach the tags to the resources associated with the resource share.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-resourceshare.html#cfn-ram-resourceshare-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnResourceShareProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allowExternalPrincipals Specifies whether principals outside your organization in AWS
     * Organizations can be associated with a resource share.
     * A value of `true` lets you share with individual AWS accounts that are *not* in your
     * organization. A value of `false` only has meaning if your account is a member of an AWS
     * Organization. The default value is `true` .
     */
    public fun allowExternalPrincipals(allowExternalPrincipals: Boolean)

    /**
     * @param allowExternalPrincipals Specifies whether principals outside your organization in AWS
     * Organizations can be associated with a resource share.
     * A value of `true` lets you share with individual AWS accounts that are *not* in your
     * organization. A value of `false` only has meaning if your account is a member of an AWS
     * Organization. The default value is `true` .
     */
    public fun allowExternalPrincipals(allowExternalPrincipals: IResolvable)

    /**
     * @param name Specifies the name of the resource share. 
     */
    public fun name(name: String)

    /**
     * @param permissionArns Specifies the [Amazon Resource Names
     * (ARNs)](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html) of the AWS
     * RAM permission to associate with the resource share. If you do not specify an ARN for the
     * permission, AWS RAM automatically attaches the default version of the permission for each
     * resource type. You can associate only one permission with each resource type included in the
     * resource share.
     */
    public fun permissionArns(permissionArns: List<String>)

    /**
     * @param permissionArns Specifies the [Amazon Resource Names
     * (ARNs)](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html) of the AWS
     * RAM permission to associate with the resource share. If you do not specify an ARN for the
     * permission, AWS RAM automatically attaches the default version of the permission for each
     * resource type. You can associate only one permission with each resource type included in the
     * resource share.
     */
    public fun permissionArns(vararg permissionArns: String)

    /**
     * @param principals Specifies the principals to associate with the resource share. The possible
     * values are:.
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
     */
    public fun principals(principals: List<String>)

    /**
     * @param principals Specifies the principals to associate with the resource share. The possible
     * values are:.
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
     */
    public fun principals(vararg principals: String)

    /**
     * @param resourceArns Specifies a list of one or more ARNs of the resources to associate with
     * the resource share.
     */
    public fun resourceArns(resourceArns: List<String>)

    /**
     * @param resourceArns Specifies a list of one or more ARNs of the resources to associate with
     * the resource share.
     */
    public fun resourceArns(vararg resourceArns: String)

    /**
     * @param sources Specifies from which source accounts the service principal has access to the
     * resources in this resource share.
     */
    public fun sources(sources: List<String>)

    /**
     * @param sources Specifies from which source accounts the service principal has access to the
     * resources in this resource share.
     */
    public fun sources(vararg sources: String)

    /**
     * @param tags Specifies one or more tags to attach to the resource share itself.
     * It doesn't attach the tags to the resources associated with the resource share.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Specifies one or more tags to attach to the resource share itself.
     * It doesn't attach the tags to the resources associated with the resource share.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ram.CfnResourceShareProps.Builder =
        software.amazon.awscdk.services.ram.CfnResourceShareProps.builder()

    /**
     * @param allowExternalPrincipals Specifies whether principals outside your organization in AWS
     * Organizations can be associated with a resource share.
     * A value of `true` lets you share with individual AWS accounts that are *not* in your
     * organization. A value of `false` only has meaning if your account is a member of an AWS
     * Organization. The default value is `true` .
     */
    override fun allowExternalPrincipals(allowExternalPrincipals: Boolean) {
      cdkBuilder.allowExternalPrincipals(allowExternalPrincipals)
    }

    /**
     * @param allowExternalPrincipals Specifies whether principals outside your organization in AWS
     * Organizations can be associated with a resource share.
     * A value of `true` lets you share with individual AWS accounts that are *not* in your
     * organization. A value of `false` only has meaning if your account is a member of an AWS
     * Organization. The default value is `true` .
     */
    override fun allowExternalPrincipals(allowExternalPrincipals: IResolvable) {
      cdkBuilder.allowExternalPrincipals(allowExternalPrincipals.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param name Specifies the name of the resource share. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
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
     * @param principals Specifies the principals to associate with the resource share. The possible
     * values are:.
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
     */
    override fun principals(principals: List<String>) {
      cdkBuilder.principals(principals)
    }

    /**
     * @param principals Specifies the principals to associate with the resource share. The possible
     * values are:.
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
     */
    override fun principals(vararg principals: String): Unit = principals(principals.toList())

    /**
     * @param resourceArns Specifies a list of one or more ARNs of the resources to associate with
     * the resource share.
     */
    override fun resourceArns(resourceArns: List<String>) {
      cdkBuilder.resourceArns(resourceArns)
    }

    /**
     * @param resourceArns Specifies a list of one or more ARNs of the resources to associate with
     * the resource share.
     */
    override fun resourceArns(vararg resourceArns: String): Unit =
        resourceArns(resourceArns.toList())

    /**
     * @param sources Specifies from which source accounts the service principal has access to the
     * resources in this resource share.
     */
    override fun sources(sources: List<String>) {
      cdkBuilder.sources(sources)
    }

    /**
     * @param sources Specifies from which source accounts the service principal has access to the
     * resources in this resource share.
     */
    override fun sources(vararg sources: String): Unit = sources(sources.toList())

    /**
     * @param tags Specifies one or more tags to attach to the resource share itself.
     * It doesn't attach the tags to the resources associated with the resource share.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Specifies one or more tags to attach to the resource share itself.
     * It doesn't attach the tags to the resources associated with the resource share.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ram.CfnResourceShareProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ram.CfnResourceShareProps,
  ) : CdkObject(cdkObject),
      CfnResourceShareProps {
    /**
     * Specifies whether principals outside your organization in AWS Organizations can be associated
     * with a resource share.
     *
     * A value of `true` lets you share with individual AWS accounts that are *not* in your
     * organization. A value of `false` only has meaning if your account is a member of an AWS
     * Organization. The default value is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-resourceshare.html#cfn-ram-resourceshare-allowexternalprincipals)
     */
    override fun allowExternalPrincipals(): Any? = unwrap(this).getAllowExternalPrincipals()

    /**
     * Specifies the name of the resource share.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-resourceshare.html#cfn-ram-resourceshare-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Specifies the [Amazon Resource Names
     * (ARNs)](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html) of the AWS
     * RAM permission to associate with the resource share. If you do not specify an ARN for the
     * permission, AWS RAM automatically attaches the default version of the permission for each
     * resource type. You can associate only one permission with each resource type included in the
     * resource share.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-resourceshare.html#cfn-ram-resourceshare-permissionarns)
     */
    override fun permissionArns(): List<String> = unwrap(this).getPermissionArns() ?: emptyList()

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
     */
    override fun principals(): List<String> = unwrap(this).getPrincipals() ?: emptyList()

    /**
     * Specifies a list of one or more ARNs of the resources to associate with the resource share.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-resourceshare.html#cfn-ram-resourceshare-resourcearns)
     */
    override fun resourceArns(): List<String> = unwrap(this).getResourceArns() ?: emptyList()

    /**
     * Specifies from which source accounts the service principal has access to the resources in
     * this resource share.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-resourceshare.html#cfn-ram-resourceshare-sources)
     */
    override fun sources(): List<String> = unwrap(this).getSources() ?: emptyList()

    /**
     * Specifies one or more tags to attach to the resource share itself.
     *
     * It doesn't attach the tags to the resources associated with the resource share.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-resourceshare.html#cfn-ram-resourceshare-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResourceShareProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ram.CfnResourceShareProps):
        CfnResourceShareProps = CdkObjectWrappers.wrap(cdkObject) as? CfnResourceShareProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResourceShareProps):
        software.amazon.awscdk.services.ram.CfnResourceShareProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ram.CfnResourceShareProps
  }
}

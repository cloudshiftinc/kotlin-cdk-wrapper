@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.ram

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ram.CfnResourceShare
import software.constructs.Construct

/**
 * Creates a resource share.
 *
 * You can provide a list of the Amazon Resource Names (ARNs) for the resources that you want to
 * share, a list of principals you want to share the resources with, and the permissions to grant
 * those principals.
 *
 * Sharing a resource makes it available for use by principals outside of the AWS account that
 * created the resource. Sharing doesn't change any permissions or quotas that apply to the resource
 * in the account that created it.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ram.*;
 * CfnResourceShare cfnResourceShare = CfnResourceShare.Builder.create(this, "MyCfnResourceShare")
 * .name("name")
 * // the properties below are optional
 * .allowExternalPrincipals(false)
 * .permissionArns(List.of("permissionArns"))
 * .principals(List.of("principals"))
 * .resourceArns(List.of("resourceArns"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-resourceshare.html)
 */
@CdkDslMarker
public class CfnResourceShareDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnResourceShare.Builder = CfnResourceShare.Builder.create(scope, id)

    private val _permissionArns: MutableList<String> = mutableListOf()

    private val _principals: MutableList<String> = mutableListOf()

    private val _resourceArns: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * Specifies whether principals outside your organization in AWS Organizations can be associated
     * with a resource share.
     *
     * A value of `true` lets you share with individual AWS accounts that are *not* in your
     * organization. A value of `false` only has meaning if your account is a member of an AWS
     * Organization. The default value is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-resourceshare.html#cfn-ram-resourceshare-allowexternalprincipals)
     *
     * @param allowExternalPrincipals Specifies whether principals outside your organization in AWS
     *   Organizations can be associated with a resource share.
     */
    public fun allowExternalPrincipals(allowExternalPrincipals: Boolean) {
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
     *
     * @param allowExternalPrincipals Specifies whether principals outside your organization in AWS
     *   Organizations can be associated with a resource share.
     */
    public fun allowExternalPrincipals(allowExternalPrincipals: IResolvable) {
        cdkBuilder.allowExternalPrincipals(allowExternalPrincipals)
    }

    /**
     * Specifies the name of the resource share.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-resourceshare.html#cfn-ram-resourceshare-name)
     *
     * @param name Specifies the name of the resource share.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * Specifies the
     * [Amazon Resource Names (ARNs)](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html)
     * of the AWS RAM permission to associate with the resource share. If you do not specify an ARN
     * for the permission, AWS RAM automatically attaches the default version of the permission for
     * each resource type. You can associate only one permission with each resource type included in
     * the resource share.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-resourceshare.html#cfn-ram-resourceshare-permissionarns)
     *
     * @param permissionArns Specifies the
     *   [Amazon Resource Names (ARNs)](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html)
     *   of the AWS RAM permission to associate with the resource share. If you do not specify an
     *   ARN for the permission, AWS RAM automatically attaches the default version of the
     *   permission for each resource type. You can associate only one permission with each resource
     *   type included in the resource share.
     */
    public fun permissionArns(vararg permissionArns: String) {
        _permissionArns.addAll(listOf(*permissionArns))
    }

    /**
     * Specifies the
     * [Amazon Resource Names (ARNs)](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html)
     * of the AWS RAM permission to associate with the resource share. If you do not specify an ARN
     * for the permission, AWS RAM automatically attaches the default version of the permission for
     * each resource type. You can associate only one permission with each resource type included in
     * the resource share.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-resourceshare.html#cfn-ram-resourceshare-permissionarns)
     *
     * @param permissionArns Specifies the
     *   [Amazon Resource Names (ARNs)](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html)
     *   of the AWS RAM permission to associate with the resource share. If you do not specify an
     *   ARN for the permission, AWS RAM automatically attaches the default version of the
     *   permission for each resource type. You can associate only one permission with each resource
     *   type included in the resource share.
     */
    public fun permissionArns(permissionArns: Collection<String>) {
        _permissionArns.addAll(permissionArns)
    }

    /**
     * Specifies the principals to associate with the resource share. The possible values are:.
     * * An AWS account ID
     * * An Amazon Resource Name (ARN) of an organization in AWS Organizations
     * * An ARN of an organizational unit (OU) in AWS Organizations
     * * An ARN of an IAM role
     * * An ARN of an IAM user
     *
     * Not all resource types can be shared with IAM roles and users. For more information, see the
     * column *Can share with IAM roles and users* in the tables on
     * [Shareable AWS resources](https://docs.aws.amazon.com/ram/latest/userguide/shareable.html) in
     * the *AWS Resource Access Manager User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-resourceshare.html#cfn-ram-resourceshare-principals)
     *
     * @param principals Specifies the principals to associate with the resource share. The possible
     *   values are:.
     */
    public fun principals(vararg principals: String) {
        _principals.addAll(listOf(*principals))
    }

    /**
     * Specifies the principals to associate with the resource share. The possible values are:.
     * * An AWS account ID
     * * An Amazon Resource Name (ARN) of an organization in AWS Organizations
     * * An ARN of an organizational unit (OU) in AWS Organizations
     * * An ARN of an IAM role
     * * An ARN of an IAM user
     *
     * Not all resource types can be shared with IAM roles and users. For more information, see the
     * column *Can share with IAM roles and users* in the tables on
     * [Shareable AWS resources](https://docs.aws.amazon.com/ram/latest/userguide/shareable.html) in
     * the *AWS Resource Access Manager User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-resourceshare.html#cfn-ram-resourceshare-principals)
     *
     * @param principals Specifies the principals to associate with the resource share. The possible
     *   values are:.
     */
    public fun principals(principals: Collection<String>) {
        _principals.addAll(principals)
    }

    /**
     * Specifies a list of one or more ARNs of the resources to associate with the resource share.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-resourceshare.html#cfn-ram-resourceshare-resourcearns)
     *
     * @param resourceArns Specifies a list of one or more ARNs of the resources to associate with
     *   the resource share.
     */
    public fun resourceArns(vararg resourceArns: String) {
        _resourceArns.addAll(listOf(*resourceArns))
    }

    /**
     * Specifies a list of one or more ARNs of the resources to associate with the resource share.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-resourceshare.html#cfn-ram-resourceshare-resourcearns)
     *
     * @param resourceArns Specifies a list of one or more ARNs of the resources to associate with
     *   the resource share.
     */
    public fun resourceArns(resourceArns: Collection<String>) {
        _resourceArns.addAll(resourceArns)
    }

    /**
     * Specifies one or more tags to attach to the resource share itself.
     *
     * It doesn't attach the tags to the resources associated with the resource share.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-resourceshare.html#cfn-ram-resourceshare-tags)
     *
     * @param tags Specifies one or more tags to attach to the resource share itself.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * Specifies one or more tags to attach to the resource share itself.
     *
     * It doesn't attach the tags to the resources associated with the resource share.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-resourceshare.html#cfn-ram-resourceshare-tags)
     *
     * @param tags Specifies one or more tags to attach to the resource share itself.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnResourceShare {
        if (_permissionArns.isNotEmpty()) cdkBuilder.permissionArns(_permissionArns)
        if (_principals.isNotEmpty()) cdkBuilder.principals(_principals)
        if (_resourceArns.isNotEmpty()) cdkBuilder.resourceArns(_resourceArns)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}

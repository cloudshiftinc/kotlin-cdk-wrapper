@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sso

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates an instance of IAM Identity Center for a standalone AWS account that is not managed by
 * AWS Organizations or a member AWS account in an organization.
 *
 * You can create only one instance per account and across all AWS Regions .
 *
 * The CreateInstance request is rejected if the following apply:
 *
 * * The instance is created within the organization management account.
 * * An instance already exists in the same account.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sso.*;
 * CfnInstance cfnInstance = CfnInstance.Builder.create(this, "MyCfnInstance")
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-instance.html)
 */
public open class CfnInstance(
  cdkObject: software.amazon.awscdk.services.sso.CfnInstance,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.sso.CfnInstance(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnInstanceProps,
  ) :
      this(software.amazon.awscdk.services.sso.CfnInstance(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnInstanceProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnInstanceProps.Builder.() -> Unit,
  ) : this(scope, id, CfnInstanceProps(props)
  )

  /**
   * The identifier of the identity store that is connected to the Identity Center instance.
   */
  public open fun attrIdentityStoreId(): String = unwrap(this).getAttrIdentityStoreId()

  /**
   * The ARN of the Identity Center instance under which the operation will be executed.
   *
   * For more information about ARNs, see <a
   * href="https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource
   * Names (ARNs) and AWS Service Namespaces</a> in the *AWS General Reference* .
   */
  public open fun attrInstanceArn(): String = unwrap(this).getAttrInstanceArn()

  /**
   * The AWS account ID number of the owner of the Identity Center instance.
   */
  public open fun attrOwnerAccountId(): String = unwrap(this).getAttrOwnerAccountId()

  /**
   * The current status of this Identity Center instance.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of the Identity Center instance.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the Identity Center instance.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Specifies tags to be attached to the instance of IAM Identity Center.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Specifies tags to be attached to the instance of IAM Identity Center.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Specifies tags to be attached to the instance of IAM Identity Center.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.sso.CfnInstance].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the Identity Center instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-instance.html#cfn-sso-instance-name)
     * @param name The name of the Identity Center instance. 
     */
    public fun name(name: String)

    /**
     * Specifies tags to be attached to the instance of IAM Identity Center.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-instance.html#cfn-sso-instance-tags)
     * @param tags Specifies tags to be attached to the instance of IAM Identity Center. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Specifies tags to be attached to the instance of IAM Identity Center.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-instance.html#cfn-sso-instance-tags)
     * @param tags Specifies tags to be attached to the instance of IAM Identity Center. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sso.CfnInstance.Builder =
        software.amazon.awscdk.services.sso.CfnInstance.Builder.create(scope, id)

    /**
     * The name of the Identity Center instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-instance.html#cfn-sso-instance-name)
     * @param name The name of the Identity Center instance. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Specifies tags to be attached to the instance of IAM Identity Center.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-instance.html#cfn-sso-instance-tags)
     * @param tags Specifies tags to be attached to the instance of IAM Identity Center. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * Specifies tags to be attached to the instance of IAM Identity Center.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-instance.html#cfn-sso-instance-tags)
     * @param tags Specifies tags to be attached to the instance of IAM Identity Center. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sso.CfnInstance = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sso.CfnInstance.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnInstance {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnInstance(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sso.CfnInstance): CfnInstance =
        CfnInstance(cdkObject)

    internal fun unwrap(wrapped: CfnInstance): software.amazon.awscdk.services.sso.CfnInstance =
        wrapped.cdkObject as software.amazon.awscdk.services.sso.CfnInstance
  }
}

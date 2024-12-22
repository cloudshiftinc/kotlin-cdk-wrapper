@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

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
 * Create new email address in the specified Amazon Connect instance.
 *
 * For more information about email addresses, see [Create email
 * addresses](https://docs.aws.amazon.com/connect/latest/adminguide/create-email-address1.html) in the
 * Amazon Connect Administrator Guide.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.connect.*;
 * CfnEmailAddress cfnEmailAddress = CfnEmailAddress.Builder.create(this, "MyCfnEmailAddress")
 * .emailAddress("emailAddress")
 * .instanceArn("instanceArn")
 * // the properties below are optional
 * .description("description")
 * .displayName("displayName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-emailaddress.html)
 */
public open class CfnEmailAddress(
  cdkObject: software.amazon.awscdk.services.connect.CfnEmailAddress,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEmailAddressProps,
  ) :
      this(software.amazon.awscdk.services.connect.CfnEmailAddress(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnEmailAddressProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEmailAddressProps.Builder.() -> Unit,
  ) : this(scope, id, CfnEmailAddressProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the email address.
   */
  public open fun attrEmailAddressArn(): String = unwrap(this).getAttrEmailAddressArn()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The description of the email address.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the email address.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The display name of email address.
   */
  public open fun displayName(): String? = unwrap(this).getDisplayName()

  /**
   * The display name of email address.
   */
  public open fun displayName(`value`: String) {
    unwrap(this).setDisplayName(`value`)
  }

  /**
   * The email address with the instance, in [^\s&#64;]+&#64;[^\s&#64;]+.[^\s&#64;]+ format.
   */
  public open fun emailAddress(): String = unwrap(this).getEmailAddress()

  /**
   * The email address with the instance, in [^\s&#64;]+&#64;[^\s&#64;]+.[^\s&#64;]+ format.
   */
  public open fun emailAddress(`value`: String) {
    unwrap(this).setEmailAddress(`value`)
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
   * The Amazon Resource Name (ARN) of the instance.
   */
  public open fun instanceArn(): String = unwrap(this).getInstanceArn()

  /**
   * The Amazon Resource Name (ARN) of the instance.
   */
  public open fun instanceArn(`value`: String) {
    unwrap(this).setInstanceArn(`value`)
  }

  /**
   * One or more tags.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * One or more tags.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * One or more tags.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.connect.CfnEmailAddress].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of the email address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-emailaddress.html#cfn-connect-emailaddress-description)
     * @param description The description of the email address. 
     */
    public fun description(description: String)

    /**
     * The display name of email address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-emailaddress.html#cfn-connect-emailaddress-displayname)
     * @param displayName The display name of email address. 
     */
    public fun displayName(displayName: String)

    /**
     * The email address with the instance, in [^\s&#64;]+&#64;[^\s&#64;]+.[^\s&#64;]+ format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-emailaddress.html#cfn-connect-emailaddress-emailaddress)
     * @param emailAddress The email address with the instance, in
     * [^\s&#64;]+&#64;[^\s&#64;]+.[^\s&#64;]+ format. 
     */
    public fun emailAddress(emailAddress: String)

    /**
     * The Amazon Resource Name (ARN) of the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-emailaddress.html#cfn-connect-emailaddress-instancearn)
     * @param instanceArn The Amazon Resource Name (ARN) of the instance. 
     */
    public fun instanceArn(instanceArn: String)

    /**
     * One or more tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-emailaddress.html#cfn-connect-emailaddress-tags)
     * @param tags One or more tags. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * One or more tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-emailaddress.html#cfn-connect-emailaddress-tags)
     * @param tags One or more tags. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnEmailAddress.Builder =
        software.amazon.awscdk.services.connect.CfnEmailAddress.Builder.create(scope, id)

    /**
     * The description of the email address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-emailaddress.html#cfn-connect-emailaddress-description)
     * @param description The description of the email address. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The display name of email address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-emailaddress.html#cfn-connect-emailaddress-displayname)
     * @param displayName The display name of email address. 
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * The email address with the instance, in [^\s&#64;]+&#64;[^\s&#64;]+.[^\s&#64;]+ format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-emailaddress.html#cfn-connect-emailaddress-emailaddress)
     * @param emailAddress The email address with the instance, in
     * [^\s&#64;]+&#64;[^\s&#64;]+.[^\s&#64;]+ format. 
     */
    override fun emailAddress(emailAddress: String) {
      cdkBuilder.emailAddress(emailAddress)
    }

    /**
     * The Amazon Resource Name (ARN) of the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-emailaddress.html#cfn-connect-emailaddress-instancearn)
     * @param instanceArn The Amazon Resource Name (ARN) of the instance. 
     */
    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    /**
     * One or more tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-emailaddress.html#cfn-connect-emailaddress-tags)
     * @param tags One or more tags. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * One or more tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-emailaddress.html#cfn-connect-emailaddress-tags)
     * @param tags One or more tags. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.connect.CfnEmailAddress = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.connect.CfnEmailAddress.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEmailAddress {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEmailAddress(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnEmailAddress):
        CfnEmailAddress = CfnEmailAddress(cdkObject)

    internal fun unwrap(wrapped: CfnEmailAddress):
        software.amazon.awscdk.services.connect.CfnEmailAddress = wrapped.cdkObject as
        software.amazon.awscdk.services.connect.CfnEmailAddress
  }
}

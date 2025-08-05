@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.notificationscontacts

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Configures email contacts for AWS User Notifications .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.notificationscontacts.*;
 * CfnEmailContact cfnEmailContact = CfnEmailContact.Builder.create(this, "MyCfnEmailContact")
 * .emailAddress("emailAddress")
 * .name("name")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notificationscontacts-emailcontact.html)
 */
public open class CfnEmailContact(
  cdkObject: software.amazon.awscdk.services.notificationscontacts.CfnEmailContact,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEmailContactProps,
  ) :
      this(software.amazon.awscdk.services.notificationscontacts.CfnEmailContact(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnEmailContactProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEmailContactProps.Builder.() -> Unit,
  ) : this(scope, id, CfnEmailContactProps(props)
  )

  /**
   * Returns the ARN of the contact.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   *
   */
  public open fun attrEmailContact(): IResolvable =
      unwrap(this).getAttrEmailContact().let(IResolvable::wrap)

  /**
   * The email address of the contact.
   */
  public open fun attrEmailContactAddress(): String = unwrap(this).getAttrEmailContactAddress()

  /**
   * The Amazon Resource Name (ARN) of the contact.
   */
  public open fun attrEmailContactArn(): String = unwrap(this).getAttrEmailContactArn()

  /**
   * The creation time of the `EmailContact` .
   */
  public open fun attrEmailContactCreationTime(): String =
      unwrap(this).getAttrEmailContactCreationTime()

  /**
   * The name of the contact.
   */
  public open fun attrEmailContactName(): String = unwrap(this).getAttrEmailContactName()

  /**
   * The status of the contact.
   *
   * Only activated contacts receive emails.
   */
  public open fun attrEmailContactStatus(): String = unwrap(this).getAttrEmailContactStatus()

  /**
   * The time the `EmailContact` was last updated.
   */
  public open fun attrEmailContactUpdateTime(): String =
      unwrap(this).getAttrEmailContactUpdateTime()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The email address of the contact.
   */
  public open fun emailAddress(): String = unwrap(this).getEmailAddress()

  /**
   * The email address of the contact.
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
   * The name of the contact.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the contact.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * A list of tags to apply to the email contact.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A list of tags to apply to the email contact.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A list of tags to apply to the email contact.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.notificationscontacts.CfnEmailContact].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The email address of the contact.
     *
     * The activation and notification emails are sent here.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notificationscontacts-emailcontact.html#cfn-notificationscontacts-emailcontact-emailaddress)
     * @param emailAddress The email address of the contact. 
     */
    public fun emailAddress(emailAddress: String)

    /**
     * The name of the contact.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notificationscontacts-emailcontact.html#cfn-notificationscontacts-emailcontact-name)
     * @param name The name of the contact. 
     */
    public fun name(name: String)

    /**
     * A list of tags to apply to the email contact.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notificationscontacts-emailcontact.html#cfn-notificationscontacts-emailcontact-tags)
     * @param tags A list of tags to apply to the email contact. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of tags to apply to the email contact.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notificationscontacts-emailcontact.html#cfn-notificationscontacts-emailcontact-tags)
     * @param tags A list of tags to apply to the email contact. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.notificationscontacts.CfnEmailContact.Builder =
        software.amazon.awscdk.services.notificationscontacts.CfnEmailContact.Builder.create(scope,
        id)

    /**
     * The email address of the contact.
     *
     * The activation and notification emails are sent here.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notificationscontacts-emailcontact.html#cfn-notificationscontacts-emailcontact-emailaddress)
     * @param emailAddress The email address of the contact. 
     */
    override fun emailAddress(emailAddress: String) {
      cdkBuilder.emailAddress(emailAddress)
    }

    /**
     * The name of the contact.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notificationscontacts-emailcontact.html#cfn-notificationscontacts-emailcontact-name)
     * @param name The name of the contact. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * A list of tags to apply to the email contact.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notificationscontacts-emailcontact.html#cfn-notificationscontacts-emailcontact-tags)
     * @param tags A list of tags to apply to the email contact. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * A list of tags to apply to the email contact.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notificationscontacts-emailcontact.html#cfn-notificationscontacts-emailcontact-tags)
     * @param tags A list of tags to apply to the email contact. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.notificationscontacts.CfnEmailContact =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.notificationscontacts.CfnEmailContact.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEmailContact {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEmailContact(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.notificationscontacts.CfnEmailContact):
        CfnEmailContact = CfnEmailContact(cdkObject)

    internal fun unwrap(wrapped: CfnEmailContact):
        software.amazon.awscdk.services.notificationscontacts.CfnEmailContact = wrapped.cdkObject as
        software.amazon.awscdk.services.notificationscontacts.CfnEmailContact
  }

  /**
   * Configures email contacts for AWS User Notifications .
   *
   * You must activate the email contact using the activation token that you will receive when the
   * email contact is set up.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.notificationscontacts.*;
   * EmailContactProperty emailContactProperty = EmailContactProperty.builder()
   * .address("address")
   * .arn("arn")
   * .creationTime("creationTime")
   * .name("name")
   * .status("status")
   * .updateTime("updateTime")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-notificationscontacts-emailcontact-emailcontact.html)
   */
  public interface EmailContactProperty {
    /**
     * The email address of the contact.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-notificationscontacts-emailcontact-emailcontact.html#cfn-notificationscontacts-emailcontact-emailcontact-address)
     */
    public fun address(): String

    /**
     * The Amazon Resource Name (ARN) of the contact.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-notificationscontacts-emailcontact-emailcontact.html#cfn-notificationscontacts-emailcontact-emailcontact-arn)
     */
    public fun arn(): String

    /**
     * The creation time of the `EmailContact` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-notificationscontacts-emailcontact-emailcontact.html#cfn-notificationscontacts-emailcontact-emailcontact-creationtime)
     */
    public fun creationTime(): String

    /**
     * The name of the contact.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-notificationscontacts-emailcontact-emailcontact.html#cfn-notificationscontacts-emailcontact-emailcontact-name)
     */
    public fun name(): String

    /**
     * The status of the contact.
     *
     * Only activated contacts receive emails.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-notificationscontacts-emailcontact-emailcontact.html#cfn-notificationscontacts-emailcontact-emailcontact-status)
     */
    public fun status(): String

    /**
     * The time the `EmailContact` was last updated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-notificationscontacts-emailcontact-emailcontact.html#cfn-notificationscontacts-emailcontact-emailcontact-updatetime)
     */
    public fun updateTime(): String

    /**
     * A builder for [EmailContactProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param address The email address of the contact. 
       */
      public fun address(address: String)

      /**
       * @param arn The Amazon Resource Name (ARN) of the contact. 
       */
      public fun arn(arn: String)

      /**
       * @param creationTime The creation time of the `EmailContact` . 
       */
      public fun creationTime(creationTime: String)

      /**
       * @param name The name of the contact. 
       */
      public fun name(name: String)

      /**
       * @param status The status of the contact. 
       * Only activated contacts receive emails.
       */
      public fun status(status: String)

      /**
       * @param updateTime The time the `EmailContact` was last updated. 
       */
      public fun updateTime(updateTime: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.notificationscontacts.CfnEmailContact.EmailContactProperty.Builder
          =
          software.amazon.awscdk.services.notificationscontacts.CfnEmailContact.EmailContactProperty.builder()

      /**
       * @param address The email address of the contact. 
       */
      override fun address(address: String) {
        cdkBuilder.address(address)
      }

      /**
       * @param arn The Amazon Resource Name (ARN) of the contact. 
       */
      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      /**
       * @param creationTime The creation time of the `EmailContact` . 
       */
      override fun creationTime(creationTime: String) {
        cdkBuilder.creationTime(creationTime)
      }

      /**
       * @param name The name of the contact. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param status The status of the contact. 
       * Only activated contacts receive emails.
       */
      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      /**
       * @param updateTime The time the `EmailContact` was last updated. 
       */
      override fun updateTime(updateTime: String) {
        cdkBuilder.updateTime(updateTime)
      }

      public fun build():
          software.amazon.awscdk.services.notificationscontacts.CfnEmailContact.EmailContactProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.notificationscontacts.CfnEmailContact.EmailContactProperty,
    ) : CdkObject(cdkObject),
        EmailContactProperty {
      /**
       * The email address of the contact.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-notificationscontacts-emailcontact-emailcontact.html#cfn-notificationscontacts-emailcontact-emailcontact-address)
       */
      override fun address(): String = unwrap(this).getAddress()

      /**
       * The Amazon Resource Name (ARN) of the contact.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-notificationscontacts-emailcontact-emailcontact.html#cfn-notificationscontacts-emailcontact-emailcontact-arn)
       */
      override fun arn(): String = unwrap(this).getArn()

      /**
       * The creation time of the `EmailContact` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-notificationscontacts-emailcontact-emailcontact.html#cfn-notificationscontacts-emailcontact-emailcontact-creationtime)
       */
      override fun creationTime(): String = unwrap(this).getCreationTime()

      /**
       * The name of the contact.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-notificationscontacts-emailcontact-emailcontact.html#cfn-notificationscontacts-emailcontact-emailcontact-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The status of the contact.
       *
       * Only activated contacts receive emails.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-notificationscontacts-emailcontact-emailcontact.html#cfn-notificationscontacts-emailcontact-emailcontact-status)
       */
      override fun status(): String = unwrap(this).getStatus()

      /**
       * The time the `EmailContact` was last updated.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-notificationscontacts-emailcontact-emailcontact.html#cfn-notificationscontacts-emailcontact-emailcontact-updatetime)
       */
      override fun updateTime(): String = unwrap(this).getUpdateTime()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EmailContactProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.notificationscontacts.CfnEmailContact.EmailContactProperty):
          EmailContactProperty = CdkObjectWrappers.wrap(cdkObject) as? EmailContactProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: EmailContactProperty):
          software.amazon.awscdk.services.notificationscontacts.CfnEmailContact.EmailContactProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.notificationscontacts.CfnEmailContact.EmailContactProperty
    }
  }
}

package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnPhoneNumber internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.connect.CfnPhoneNumber,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The phone number, in E.164 format.
   */
  public open fun attrAddress(): String = unwrap(this).getAttrAddress()

  /**
   * The Amazon Resource Name (ARN) of the phone number.
   */
  public open fun attrPhoneNumberArn(): String = unwrap(this).getAttrPhoneNumberArn()

  /**
   * The ISO country code.
   */
  public open fun countryCode(): String? = unwrap(this).getCountryCode()

  /**
   * The ISO country code.
   */
  public open fun countryCode(`value`: String) {
    unwrap(this).setCountryCode(`value`)
  }

  /**
   * The description of the phone number.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the phone number.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The prefix of the phone number.
   *
   * If provided, it must contain `+` as part of the country code.
   */
  public open fun prefix(): String? = unwrap(this).getPrefix()

  /**
   * The prefix of the phone number.
   *
   * If provided, it must contain `+` as part of the country code.
   */
  public open fun prefix(`value`: String) {
    unwrap(this).setPrefix(`value`)
  }

  /**
   * The claimed phone number ARN that was previously imported from the external service, such as
   * Amazon Pinpoint.
   */
  public open fun sourcePhoneNumberArn(): String? = unwrap(this).getSourcePhoneNumberArn()

  /**
   * The claimed phone number ARN that was previously imported from the external service, such as
   * Amazon Pinpoint.
   */
  public open fun sourcePhoneNumberArn(`value`: String) {
    unwrap(this).setSourcePhoneNumberArn(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The Amazon Resource Name (ARN) for Amazon Connect instances or traffic distribution group that
   * phone numbers are claimed to.
   */
  public open fun targetArn(): String = unwrap(this).getTargetArn()

  /**
   * The Amazon Resource Name (ARN) for Amazon Connect instances or traffic distribution group that
   * phone numbers are claimed to.
   */
  public open fun targetArn(`value`: String) {
    unwrap(this).setTargetArn(`value`)
  }

  /**
   * The type of phone number.
   */
  public open fun type(): String? = unwrap(this).getType()

  /**
   * The type of phone number.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.connect.CfnPhoneNumber].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ISO country code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-phonenumber.html#cfn-connect-phonenumber-countrycode)
     * @param countryCode The ISO country code. 
     */
    public fun countryCode(countryCode: String)

    /**
     * The description of the phone number.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-phonenumber.html#cfn-connect-phonenumber-description)
     * @param description The description of the phone number. 
     */
    public fun description(description: String)

    /**
     * The prefix of the phone number. If provided, it must contain `+` as part of the country code.
     *
     * *Pattern* : `^\\+[0-9]{1,15}`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-phonenumber.html#cfn-connect-phonenumber-prefix)
     * @param prefix The prefix of the phone number. If provided, it must contain `+` as part of the
     * country code. 
     */
    public fun prefix(prefix: String)

    /**
     * The claimed phone number ARN that was previously imported from the external service, such as
     * Amazon Pinpoint.
     *
     * If it is from Amazon Pinpoint, it looks like the ARN of the phone number that was imported
     * from Amazon Pinpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-phonenumber.html#cfn-connect-phonenumber-sourcephonenumberarn)
     * @param sourcePhoneNumberArn The claimed phone number ARN that was previously imported from
     * the external service, such as Amazon Pinpoint. 
     */
    public fun sourcePhoneNumberArn(sourcePhoneNumberArn: String)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-phonenumber.html#cfn-connect-phonenumber-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-phonenumber.html#cfn-connect-phonenumber-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The Amazon Resource Name (ARN) for Amazon Connect instances or traffic distribution group
     * that phone numbers are claimed to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-phonenumber.html#cfn-connect-phonenumber-targetarn)
     * @param targetArn The Amazon Resource Name (ARN) for Amazon Connect instances or traffic
     * distribution group that phone numbers are claimed to. 
     */
    public fun targetArn(targetArn: String)

    /**
     * The type of phone number.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-phonenumber.html#cfn-connect-phonenumber-type)
     * @param type The type of phone number. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnPhoneNumber.Builder =
        software.amazon.awscdk.services.connect.CfnPhoneNumber.Builder.create(scope, id)

    /**
     * The ISO country code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-phonenumber.html#cfn-connect-phonenumber-countrycode)
     * @param countryCode The ISO country code. 
     */
    override fun countryCode(countryCode: String) {
      cdkBuilder.countryCode(countryCode)
    }

    /**
     * The description of the phone number.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-phonenumber.html#cfn-connect-phonenumber-description)
     * @param description The description of the phone number. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The prefix of the phone number. If provided, it must contain `+` as part of the country code.
     *
     * *Pattern* : `^\\+[0-9]{1,15}`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-phonenumber.html#cfn-connect-phonenumber-prefix)
     * @param prefix The prefix of the phone number. If provided, it must contain `+` as part of the
     * country code. 
     */
    override fun prefix(prefix: String) {
      cdkBuilder.prefix(prefix)
    }

    /**
     * The claimed phone number ARN that was previously imported from the external service, such as
     * Amazon Pinpoint.
     *
     * If it is from Amazon Pinpoint, it looks like the ARN of the phone number that was imported
     * from Amazon Pinpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-phonenumber.html#cfn-connect-phonenumber-sourcephonenumberarn)
     * @param sourcePhoneNumberArn The claimed phone number ARN that was previously imported from
     * the external service, such as Amazon Pinpoint. 
     */
    override fun sourcePhoneNumberArn(sourcePhoneNumberArn: String) {
      cdkBuilder.sourcePhoneNumberArn(sourcePhoneNumberArn)
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-phonenumber.html#cfn-connect-phonenumber-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-phonenumber.html#cfn-connect-phonenumber-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The Amazon Resource Name (ARN) for Amazon Connect instances or traffic distribution group
     * that phone numbers are claimed to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-phonenumber.html#cfn-connect-phonenumber-targetarn)
     * @param targetArn The Amazon Resource Name (ARN) for Amazon Connect instances or traffic
     * distribution group that phone numbers are claimed to. 
     */
    override fun targetArn(targetArn: String) {
      cdkBuilder.targetArn(targetArn)
    }

    /**
     * The type of phone number.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-phonenumber.html#cfn-connect-phonenumber-type)
     * @param type The type of phone number. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.connect.CfnPhoneNumber = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.connect.CfnPhoneNumber.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPhoneNumber {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPhoneNumber(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnPhoneNumber):
        CfnPhoneNumber = CfnPhoneNumber(cdkObject)

    internal fun unwrap(wrapped: CfnPhoneNumber):
        software.amazon.awscdk.services.connect.CfnPhoneNumber = wrapped.cdkObject
  }
}

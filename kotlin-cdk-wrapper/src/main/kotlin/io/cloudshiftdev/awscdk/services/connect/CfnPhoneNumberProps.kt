@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnPhoneNumber`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.connect.*;
 * CfnPhoneNumberProps cfnPhoneNumberProps = CfnPhoneNumberProps.builder()
 * .targetArn("targetArn")
 * // the properties below are optional
 * .countryCode("countryCode")
 * .description("description")
 * .prefix("prefix")
 * .sourcePhoneNumberArn("sourcePhoneNumberArn")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-phonenumber.html)
 */
public interface CfnPhoneNumberProps {
  /**
   * The ISO country code.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-phonenumber.html#cfn-connect-phonenumber-countrycode)
   */
  public fun countryCode(): String? = unwrap(this).getCountryCode()

  /**
   * The description of the phone number.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-phonenumber.html#cfn-connect-phonenumber-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The prefix of the phone number. If provided, it must contain `+` as part of the country code.
   *
   * *Pattern* : `^\\+[0-9]{1,15}`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-phonenumber.html#cfn-connect-phonenumber-prefix)
   */
  public fun prefix(): String? = unwrap(this).getPrefix()

  /**
   * The claimed phone number ARN that was previously imported from the external service, such as
   * Amazon Pinpoint.
   *
   * If it is from Amazon Pinpoint, it looks like the ARN of the phone number that was imported from
   * Amazon Pinpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-phonenumber.html#cfn-connect-phonenumber-sourcephonenumberarn)
   */
  public fun sourcePhoneNumberArn(): String? = unwrap(this).getSourcePhoneNumberArn()

  /**
   * The tags used to organize, track, or control access for this resource.
   *
   * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-phonenumber.html#cfn-connect-phonenumber-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The Amazon Resource Name (ARN) for Amazon Connect instances or traffic distribution group that
   * phone numbers are claimed to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-phonenumber.html#cfn-connect-phonenumber-targetarn)
   */
  public fun targetArn(): String

  /**
   * The type of phone number.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-phonenumber.html#cfn-connect-phonenumber-type)
   */
  public fun type(): String? = unwrap(this).getType()

  /**
   * A builder for [CfnPhoneNumberProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param countryCode The ISO country code.
     */
    public fun countryCode(countryCode: String)

    /**
     * @param description The description of the phone number.
     */
    public fun description(description: String)

    /**
     * @param prefix The prefix of the phone number. If provided, it must contain `+` as part of the
     * country code.
     * *Pattern* : `^\\+[0-9]{1,15}`
     */
    public fun prefix(prefix: String)

    /**
     * @param sourcePhoneNumberArn The claimed phone number ARN that was previously imported from
     * the external service, such as Amazon Pinpoint.
     * If it is from Amazon Pinpoint, it looks like the ARN of the phone number that was imported
     * from Amazon Pinpoint.
     */
    public fun sourcePhoneNumberArn(sourcePhoneNumberArn: String)

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param targetArn The Amazon Resource Name (ARN) for Amazon Connect instances or traffic
     * distribution group that phone numbers are claimed to. 
     */
    public fun targetArn(targetArn: String)

    /**
     * @param type The type of phone number.
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnPhoneNumberProps.Builder =
        software.amazon.awscdk.services.connect.CfnPhoneNumberProps.builder()

    /**
     * @param countryCode The ISO country code.
     */
    override fun countryCode(countryCode: String) {
      cdkBuilder.countryCode(countryCode)
    }

    /**
     * @param description The description of the phone number.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param prefix The prefix of the phone number. If provided, it must contain `+` as part of the
     * country code.
     * *Pattern* : `^\\+[0-9]{1,15}`
     */
    override fun prefix(prefix: String) {
      cdkBuilder.prefix(prefix)
    }

    /**
     * @param sourcePhoneNumberArn The claimed phone number ARN that was previously imported from
     * the external service, such as Amazon Pinpoint.
     * If it is from Amazon Pinpoint, it looks like the ARN of the phone number that was imported
     * from Amazon Pinpoint.
     */
    override fun sourcePhoneNumberArn(sourcePhoneNumberArn: String) {
      cdkBuilder.sourcePhoneNumberArn(sourcePhoneNumberArn)
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param targetArn The Amazon Resource Name (ARN) for Amazon Connect instances or traffic
     * distribution group that phone numbers are claimed to. 
     */
    override fun targetArn(targetArn: String) {
      cdkBuilder.targetArn(targetArn)
    }

    /**
     * @param type The type of phone number.
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.connect.CfnPhoneNumberProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.connect.CfnPhoneNumberProps,
  ) : CdkObject(cdkObject), CfnPhoneNumberProps {
    /**
     * The ISO country code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-phonenumber.html#cfn-connect-phonenumber-countrycode)
     */
    override fun countryCode(): String? = unwrap(this).getCountryCode()

    /**
     * The description of the phone number.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-phonenumber.html#cfn-connect-phonenumber-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The prefix of the phone number. If provided, it must contain `+` as part of the country code.
     *
     * *Pattern* : `^\\+[0-9]{1,15}`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-phonenumber.html#cfn-connect-phonenumber-prefix)
     */
    override fun prefix(): String? = unwrap(this).getPrefix()

    /**
     * The claimed phone number ARN that was previously imported from the external service, such as
     * Amazon Pinpoint.
     *
     * If it is from Amazon Pinpoint, it looks like the ARN of the phone number that was imported
     * from Amazon Pinpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-phonenumber.html#cfn-connect-phonenumber-sourcephonenumberarn)
     */
    override fun sourcePhoneNumberArn(): String? = unwrap(this).getSourcePhoneNumberArn()

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-phonenumber.html#cfn-connect-phonenumber-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The Amazon Resource Name (ARN) for Amazon Connect instances or traffic distribution group
     * that phone numbers are claimed to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-phonenumber.html#cfn-connect-phonenumber-targetarn)
     */
    override fun targetArn(): String = unwrap(this).getTargetArn()

    /**
     * The type of phone number.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-phonenumber.html#cfn-connect-phonenumber-type)
     */
    override fun type(): String? = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPhoneNumberProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnPhoneNumberProps):
        CfnPhoneNumberProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPhoneNumberProps):
        software.amazon.awscdk.services.connect.CfnPhoneNumberProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.connect.CfnPhoneNumberProps
  }
}

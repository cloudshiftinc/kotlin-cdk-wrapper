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

package io.cloudshiftdev.awscdkdsl.services.connect

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.connect.CfnPhoneNumber
import software.constructs.Construct

/**
 * Claims a phone number to the specified Amazon Connect instance or traffic distribution group.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * CfnPhoneNumber cfnPhoneNumber = CfnPhoneNumber.Builder.create(this, "MyCfnPhoneNumber")
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
@CdkDslMarker
public class CfnPhoneNumberDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnPhoneNumber.Builder = CfnPhoneNumber.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The ISO country code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-phonenumber.html#cfn-connect-phonenumber-countrycode)
     *
     * @param countryCode The ISO country code.
     */
    public fun countryCode(countryCode: String) {
        cdkBuilder.countryCode(countryCode)
    }

    /**
     * The description of the phone number.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-phonenumber.html#cfn-connect-phonenumber-description)
     *
     * @param description The description of the phone number.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The prefix of the phone number. If provided, it must contain `+` as part of the country code.
     *
     * *Pattern* : `^\\+[0-9]{1,15}`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-phonenumber.html#cfn-connect-phonenumber-prefix)
     *
     * @param prefix The prefix of the phone number. If provided, it must contain `+` as part of the
     *   country code.
     */
    public fun prefix(prefix: String) {
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
     *
     * @param sourcePhoneNumberArn The claimed phone number ARN that was previously imported from
     *   the external service, such as Amazon Pinpoint.
     */
    public fun sourcePhoneNumberArn(sourcePhoneNumberArn: String) {
        cdkBuilder.sourcePhoneNumberArn(sourcePhoneNumberArn)
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-phonenumber.html#cfn-connect-phonenumber-tags)
     *
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-phonenumber.html#cfn-connect-phonenumber-tags)
     *
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The Amazon Resource Name (ARN) for Amazon Connect instances or traffic distribution group
     * that phone numbers are claimed to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-phonenumber.html#cfn-connect-phonenumber-targetarn)
     *
     * @param targetArn The Amazon Resource Name (ARN) for Amazon Connect instances or traffic
     *   distribution group that phone numbers are claimed to.
     */
    public fun targetArn(targetArn: String) {
        cdkBuilder.targetArn(targetArn)
    }

    /**
     * The type of phone number.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-phonenumber.html#cfn-connect-phonenumber-type)
     *
     * @param type The type of phone number.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnPhoneNumber {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}

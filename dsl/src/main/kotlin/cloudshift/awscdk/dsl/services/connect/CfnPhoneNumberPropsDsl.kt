@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.connect.CfnPhoneNumberProps

/**
 * Properties for defining a `CfnPhoneNumber`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * CfnPhoneNumberProps cfnPhoneNumberProps = CfnPhoneNumberProps.builder()
 * .countryCode("countryCode")
 * .targetArn("targetArn")
 * .type("type")
 * // the properties below are optional
 * .description("description")
 * .prefix("prefix")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-phonenumber.html)
 */
@CdkDslMarker
public class CfnPhoneNumberPropsDsl {
  private val cdkBuilder: CfnPhoneNumberProps.Builder = CfnPhoneNumberProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param countryCode The ISO country code. 
   */
  public fun countryCode(countryCode: String) {
    cdkBuilder.countryCode(countryCode)
  }

  /**
   * @param description The description of the phone number.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param prefix The prefix of the phone number. If provided, it must contain `+` as part of the
   * country code.
   * *Pattern* : `^\\+[0-9]{1,15}`
   */
  public fun prefix(prefix: String) {
    cdkBuilder.prefix(prefix)
  }

  /**
   * @param tags The tags used to organize, track, or control access for this resource.
   * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The tags used to organize, track, or control access for this resource.
   * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param targetArn The Amazon Resource Name (ARN) for Amazon Connect instances or traffic
   * distribution group that phone numbers are claimed to. 
   */
  public fun targetArn(targetArn: String) {
    cdkBuilder.targetArn(targetArn)
  }

  /**
   * @param type The type of phone number. 
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnPhoneNumberProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.macie

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.macie.CfnAllowList
import software.constructs.Construct

/**
 * The `AWS::Macie::AllowList` resource specifies an allow list.
 *
 * In Amazon Macie , an allow list defines specific text or a text pattern for Macie to ignore when
 * it inspects data sources for sensitive data. If data matches text or a text pattern in an allow
 * list, Macie doesn’t report the data in sensitive data findings or sensitive data discovery results,
 * even if the data matches the criteria of a custom data identifier or a managed data identifier. You
 * can create and use allow lists in all the AWS Regions where Macie is currently available except the
 * Asia Pacific (Osaka) Region.
 *
 * Macie supports two types of allow lists:
 *
 * * *Predefined text* - For this type of list ( `S3WordsList` ), you create a line-delimited
 * plaintext file that lists specific text to ignore, and you store the file in an Amazon Simple
 * Storage Service ( Amazon S3 ) bucket. You then configure settings for Macie to access the list in
 * the bucket.
 *
 * This type of list typically contains specific words, phrases, and other kinds of character
 * sequences that aren’t sensitive, aren't likely to change, and don’t necessarily adhere to a common
 * pattern. If you use this type of list, Macie doesn't report occurrences of text that exactly match a
 * complete entry in the list. Macie treats each entry in the list as a string literal value. Matches
 * aren't case sensitive.
 *
 * * *Regular expression* - For this type of list ( `Regex` ), you specify a regular expression that
 * defines a text pattern to ignore. Unlike an allow list with predefined text, you store the regex and
 * all other list settings in Macie .
 *
 * This type of list is helpful if you want to specify text that isn’t sensitive but varies or is
 * likely to change while also adhering to a common pattern. If you use this type of list, Macie
 * doesn't report occurrences of text that completely match the pattern defined by the list.
 *
 * For more information, see [Defining sensitive data exceptions with allow
 * lists](https://docs.aws.amazon.com/macie/latest/user/allow-lists.html) in the *Amazon Macie User
 * Guide* .
 *
 * An `AWS::Macie::Session` resource must exist for an AWS account before you can create an
 * `AWS::Macie::AllowList` resource for the account. Use a [DependsOn
 * attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
 * to ensure that an `AWS::Macie::Session` resource is created before other Macie resources are created
 * for an account. For example, `"DependsOn": "Session"` .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.macie.*;
 * CfnAllowList cfnAllowList = CfnAllowList.Builder.create(this, "MyCfnAllowList")
 * .criteria(CriteriaProperty.builder()
 * .regex("regex")
 * .s3WordsList(S3WordsListProperty.builder()
 * .bucketName("bucketName")
 * .objectKey("objectKey")
 * .build())
 * .build())
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-allowlist.html)
 */
@CdkDslMarker
public class CfnAllowListDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnAllowList.Builder = CfnAllowList.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The criteria that specify the text or text pattern to ignore.
   *
   * The criteria can be the location and name of an Amazon S3 object that lists specific text to
   * ignore ( `S3WordsList` ), or a regular expression ( `Regex` ) that defines a text pattern to
   * ignore.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-allowlist.html#cfn-macie-allowlist-criteria)
   * @param criteria The criteria that specify the text or text pattern to ignore. 
   */
  public fun criteria(criteria: IResolvable) {
    cdkBuilder.criteria(criteria)
  }

  /**
   * The criteria that specify the text or text pattern to ignore.
   *
   * The criteria can be the location and name of an Amazon S3 object that lists specific text to
   * ignore ( `S3WordsList` ), or a regular expression ( `Regex` ) that defines a text pattern to
   * ignore.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-allowlist.html#cfn-macie-allowlist-criteria)
   * @param criteria The criteria that specify the text or text pattern to ignore. 
   */
  public fun criteria(criteria: CfnAllowList.CriteriaProperty) {
    cdkBuilder.criteria(criteria)
  }

  /**
   * A custom description of the allow list.
   *
   * The description can contain 1-512 characters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-allowlist.html#cfn-macie-allowlist-description)
   * @param description A custom description of the allow list. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * A custom name for the allow list.
   *
   * The name can contain 1-128 characters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-allowlist.html#cfn-macie-allowlist-name)
   * @param name A custom name for the allow list. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * An array of key-value pairs to apply to the allow list.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-allowlist.html#cfn-macie-allowlist-tags)
   * @param tags An array of key-value pairs to apply to the allow list. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * An array of key-value pairs to apply to the allow list.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-allowlist.html#cfn-macie-allowlist-tags)
   * @param tags An array of key-value pairs to apply to the allow list. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnAllowList {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}

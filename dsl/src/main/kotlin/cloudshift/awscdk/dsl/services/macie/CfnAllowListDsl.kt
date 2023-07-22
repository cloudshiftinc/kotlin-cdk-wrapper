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

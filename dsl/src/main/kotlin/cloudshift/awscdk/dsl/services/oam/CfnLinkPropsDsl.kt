@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.oam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.oam.CfnLinkProps

/**
 * Properties for defining a `CfnLink`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.oam.*;
 * CfnLinkProps cfnLinkProps = CfnLinkProps.builder()
 * .resourceTypes(List.of("resourceTypes"))
 * .sinkIdentifier("sinkIdentifier")
 * // the properties below are optional
 * .labelTemplate("labelTemplate")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-oam-link.html)
 */
@CdkDslMarker
public class CfnLinkPropsDsl {
  private val cdkBuilder: CfnLinkProps.Builder = CfnLinkProps.builder()

  private val _resourceTypes: MutableList<String> = mutableListOf()

  /**
   * @param labelTemplate Specify a friendly human-readable name to use to identify this source
   * account when you are viewing data from it in the monitoring account.
   * You can include the following variables in your template:
   *
   * * `$AccountName` is the name of the account
   * * `$AccountEmail` is a globally-unique email address, which includes the email domain, such as
   * `mariagarcia&#64;example.com`
   * * `$AccountEmailNoDomain` is an email address without the domain name, such as `mariagarcia`
   */
  public fun labelTemplate(labelTemplate: String) {
    cdkBuilder.labelTemplate(labelTemplate)
  }

  /**
   * @param resourceTypes An array of strings that define which types of data that the source
   * account shares with the monitoring account. 
   * Valid values are `AWS::CloudWatch::Metric | AWS::Logs::LogGroup | AWS::XRay::Trace` .
   */
  public fun resourceTypes(vararg resourceTypes: String) {
    _resourceTypes.addAll(listOf(*resourceTypes))
  }

  /**
   * @param resourceTypes An array of strings that define which types of data that the source
   * account shares with the monitoring account. 
   * Valid values are `AWS::CloudWatch::Metric | AWS::Logs::LogGroup | AWS::XRay::Trace` .
   */
  public fun resourceTypes(resourceTypes: Collection<String>) {
    _resourceTypes.addAll(resourceTypes)
  }

  /**
   * @param sinkIdentifier The ARN of the sink in the monitoring account that you want to link to. 
   * You can use [ListSinks](https://docs.aws.amazon.com/OAM/latest/APIReference/API_ListSinks.html)
   * to find the ARNs of sinks.
   */
  public fun sinkIdentifier(sinkIdentifier: String) {
    cdkBuilder.sinkIdentifier(sinkIdentifier)
  }

  /**
   * @param tags An array of key-value pairs to apply to the link.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnLinkProps {
    if(_resourceTypes.isNotEmpty()) cdkBuilder.resourceTypes(_resourceTypes)
    return cdkBuilder.build()
  }
}

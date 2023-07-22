@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.datasync

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.datasync.CfnLocationFSxLustreProps

/**
 * Properties for defining a `CfnLocationFSxLustre`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datasync.*;
 * CfnLocationFSxLustreProps cfnLocationFSxLustreProps = CfnLocationFSxLustreProps.builder()
 * .securityGroupArns(List.of("securityGroupArns"))
 * // the properties below are optional
 * .fsxFilesystemArn("fsxFilesystemArn")
 * .subdirectory("subdirectory")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxlustre.html)
 */
@CdkDslMarker
public class CfnLocationFSxLustrePropsDsl {
  private val cdkBuilder: CfnLocationFSxLustreProps.Builder = CfnLocationFSxLustreProps.builder()

  private val _securityGroupArns: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param fsxFilesystemArn The Amazon Resource Name (ARN) for the FSx for Lustre file system.
   */
  public fun fsxFilesystemArn(fsxFilesystemArn: String) {
    cdkBuilder.fsxFilesystemArn(fsxFilesystemArn)
  }

  /**
   * @param securityGroupArns The ARNs of the security groups that are used to configure the FSx for
   * Lustre file system. 
   * *Pattern* :
   * `^arn:(aws|aws-cn|aws-us-gov|aws-iso|aws-iso-b):ec2:[a-z\-0-9]*:[0-9]{12}:security-group/.*$`
   *
   * *Length constraints* : Maximum length of 128.
   */
  public fun securityGroupArns(vararg securityGroupArns: String) {
    _securityGroupArns.addAll(listOf(*securityGroupArns))
  }

  /**
   * @param securityGroupArns The ARNs of the security groups that are used to configure the FSx for
   * Lustre file system. 
   * *Pattern* :
   * `^arn:(aws|aws-cn|aws-us-gov|aws-iso|aws-iso-b):ec2:[a-z\-0-9]*:[0-9]{12}:security-group/.*$`
   *
   * *Length constraints* : Maximum length of 128.
   */
  public fun securityGroupArns(securityGroupArns: Collection<String>) {
    _securityGroupArns.addAll(securityGroupArns)
  }

  /**
   * @param subdirectory A subdirectory in the location's path.
   * This subdirectory in the FSx for Lustre file system is used to read data from the FSx for
   * Lustre source location or write data to the FSx for Lustre destination.
   */
  public fun subdirectory(subdirectory: String) {
    cdkBuilder.subdirectory(subdirectory)
  }

  /**
   * @param tags The key-value pair that represents a tag that you want to add to the resource.
   * The value can be an empty string. This value helps you manage, filter, and search for your
   * resources. We recommend that you create a name tag for your location.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The key-value pair that represents a tag that you want to add to the resource.
   * The value can be an empty string. This value helps you manage, filter, and search for your
   * resources. We recommend that you create a name tag for your location.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnLocationFSxLustreProps {
    if(_securityGroupArns.isNotEmpty()) cdkBuilder.securityGroupArns(_securityGroupArns)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}

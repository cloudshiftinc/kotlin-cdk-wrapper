@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.datasync

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS
import software.constructs.Construct

/**
 * The `AWS::DataSync::LocationFSxOpenZFS` resource specifies an endpoint for an Amazon FSx for
 * OpenZFS file system.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datasync.*;
 * CfnLocationFSxOpenZFS cfnLocationFSxOpenZFS = CfnLocationFSxOpenZFS.Builder.create(this,
 * "MyCfnLocationFSxOpenZFS")
 * .protocol(ProtocolProperty.builder()
 * .nfs(NFSProperty.builder()
 * .mountOptions(MountOptionsProperty.builder()
 * .version("version")
 * .build())
 * .build())
 * .build())
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxopenzfs.html)
 */
@CdkDslMarker
public class CfnLocationFSxOpenZFSDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnLocationFSxOpenZFS.Builder =
      CfnLocationFSxOpenZFS.Builder.create(scope, id)

  private val _securityGroupArns: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The Amazon Resource Name (ARN) of the FSx for OpenZFS file system.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxopenzfs.html#cfn-datasync-locationfsxopenzfs-fsxfilesystemarn)
   * @param fsxFilesystemArn The Amazon Resource Name (ARN) of the FSx for OpenZFS file system. 
   */
  public fun fsxFilesystemArn(fsxFilesystemArn: String) {
    cdkBuilder.fsxFilesystemArn(fsxFilesystemArn)
  }

  /**
   * The type of protocol that AWS DataSync uses to access your file system.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxopenzfs.html#cfn-datasync-locationfsxopenzfs-protocol)
   * @param protocol The type of protocol that AWS DataSync uses to access your file system. 
   */
  public fun protocol(protocol: IResolvable) {
    cdkBuilder.protocol(protocol)
  }

  /**
   * The type of protocol that AWS DataSync uses to access your file system.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxopenzfs.html#cfn-datasync-locationfsxopenzfs-protocol)
   * @param protocol The type of protocol that AWS DataSync uses to access your file system. 
   */
  public fun protocol(protocol: CfnLocationFSxOpenZFS.ProtocolProperty) {
    cdkBuilder.protocol(protocol)
  }

  /**
   * The ARNs of the security groups that are used to configure the FSx for OpenZFS file system.
   *
   * *Pattern* :
   * `^arn:(aws|aws-cn|aws-us-gov|aws-iso|aws-iso-b):ec2:[a-z\-0-9]*:[0-9]{12}:security-group/.*$`
   *
   * *Length constraints* : Maximum length of 128.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxopenzfs.html#cfn-datasync-locationfsxopenzfs-securitygrouparns)
   * @param securityGroupArns The ARNs of the security groups that are used to configure the FSx for
   * OpenZFS file system. 
   */
  public fun securityGroupArns(vararg securityGroupArns: String) {
    _securityGroupArns.addAll(listOf(*securityGroupArns))
  }

  /**
   * The ARNs of the security groups that are used to configure the FSx for OpenZFS file system.
   *
   * *Pattern* :
   * `^arn:(aws|aws-cn|aws-us-gov|aws-iso|aws-iso-b):ec2:[a-z\-0-9]*:[0-9]{12}:security-group/.*$`
   *
   * *Length constraints* : Maximum length of 128.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxopenzfs.html#cfn-datasync-locationfsxopenzfs-securitygrouparns)
   * @param securityGroupArns The ARNs of the security groups that are used to configure the FSx for
   * OpenZFS file system. 
   */
  public fun securityGroupArns(securityGroupArns: Collection<String>) {
    _securityGroupArns.addAll(securityGroupArns)
  }

  /**
   * A subdirectory in the location's path that must begin with `/fsx` .
   *
   * DataSync uses this subdirectory to read or write data (depending on whether the file system is
   * a source or destination location).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxopenzfs.html#cfn-datasync-locationfsxopenzfs-subdirectory)
   * @param subdirectory A subdirectory in the location's path that must begin with `/fsx` . 
   */
  public fun subdirectory(subdirectory: String) {
    cdkBuilder.subdirectory(subdirectory)
  }

  /**
   * The key-value pair that represents a tag that you want to add to the resource.
   *
   * The value can be an empty string. This value helps you manage, filter, and search for your
   * resources. We recommend that you create a name tag for your location.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxopenzfs.html#cfn-datasync-locationfsxopenzfs-tags)
   * @param tags The key-value pair that represents a tag that you want to add to the resource. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * The key-value pair that represents a tag that you want to add to the resource.
   *
   * The value can be an empty string. This value helps you manage, filter, and search for your
   * resources. We recommend that you create a name tag for your location.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxopenzfs.html#cfn-datasync-locationfsxopenzfs-tags)
   * @param tags The key-value pair that represents a tag that you want to add to the resource. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnLocationFSxOpenZFS {
    if(_securityGroupArns.isNotEmpty()) cdkBuilder.securityGroupArns(_securityGroupArns)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}

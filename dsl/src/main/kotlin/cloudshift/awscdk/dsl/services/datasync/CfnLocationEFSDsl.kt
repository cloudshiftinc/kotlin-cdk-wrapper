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
import software.amazon.awscdk.services.datasync.CfnLocationEFS
import software.constructs.Construct

/**
 * The `AWS::DataSync::LocationEFS` resource creates an endpoint for an Amazon EFS file system.
 *
 * AWS DataSync can access this endpoint as a source or destination location.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datasync.*;
 * CfnLocationEFS cfnLocationEFS = CfnLocationEFS.Builder.create(this, "MyCfnLocationEFS")
 * .ec2Config(Ec2ConfigProperty.builder()
 * .securityGroupArns(List.of("securityGroupArns"))
 * .subnetArn("subnetArn")
 * .build())
 * // the properties below are optional
 * .accessPointArn("accessPointArn")
 * .efsFilesystemArn("efsFilesystemArn")
 * .fileSystemAccessRoleArn("fileSystemAccessRoleArn")
 * .inTransitEncryption("inTransitEncryption")
 * .subdirectory("subdirectory")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationefs.html)
 */
@CdkDslMarker
public class CfnLocationEFSDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnLocationEFS.Builder = CfnLocationEFS.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * Specifies the Amazon Resource Name (ARN) of the access point that DataSync uses to access the
   * Amazon EFS file system.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationefs.html#cfn-datasync-locationefs-accesspointarn)
   * @param accessPointArn Specifies the Amazon Resource Name (ARN) of the access point that
   * DataSync uses to access the Amazon EFS file system. 
   */
  public fun accessPointArn(accessPointArn: String) {
    cdkBuilder.accessPointArn(accessPointArn)
  }

  /**
   * Specifies the subnet and security groups DataSync uses to access your Amazon EFS file system.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationefs.html#cfn-datasync-locationefs-ec2config)
   * @param ec2Config Specifies the subnet and security groups DataSync uses to access your Amazon
   * EFS file system. 
   */
  public fun ec2Config(ec2Config: IResolvable) {
    cdkBuilder.ec2Config(ec2Config)
  }

  /**
   * Specifies the subnet and security groups DataSync uses to access your Amazon EFS file system.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationefs.html#cfn-datasync-locationefs-ec2config)
   * @param ec2Config Specifies the subnet and security groups DataSync uses to access your Amazon
   * EFS file system. 
   */
  public fun ec2Config(ec2Config: CfnLocationEFS.Ec2ConfigProperty) {
    cdkBuilder.ec2Config(ec2Config)
  }

  /**
   * Specifies the ARN for the Amazon EFS file system.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationefs.html#cfn-datasync-locationefs-efsfilesystemarn)
   * @param efsFilesystemArn Specifies the ARN for the Amazon EFS file system. 
   */
  public fun efsFilesystemArn(efsFilesystemArn: String) {
    cdkBuilder.efsFilesystemArn(efsFilesystemArn)
  }

  /**
   * Specifies an AWS Identity and Access Management (IAM) role that DataSync assumes when mounting
   * the Amazon EFS file system.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationefs.html#cfn-datasync-locationefs-filesystemaccessrolearn)
   * @param fileSystemAccessRoleArn Specifies an AWS Identity and Access Management (IAM) role that
   * DataSync assumes when mounting the Amazon EFS file system. 
   */
  public fun fileSystemAccessRoleArn(fileSystemAccessRoleArn: String) {
    cdkBuilder.fileSystemAccessRoleArn(fileSystemAccessRoleArn)
  }

  /**
   * Specifies whether you want DataSync to use Transport Layer Security (TLS) 1.2 encryption when
   * it copies data to or from the Amazon EFS file system.
   *
   * If you specify an access point using `AccessPointArn` or an IAM role using
   * `FileSystemAccessRoleArn` , you must set this parameter to `TLS1_2` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationefs.html#cfn-datasync-locationefs-intransitencryption)
   * @param inTransitEncryption Specifies whether you want DataSync to use Transport Layer Security
   * (TLS) 1.2 encryption when it copies data to or from the Amazon EFS file system. 
   */
  public fun inTransitEncryption(inTransitEncryption: String) {
    cdkBuilder.inTransitEncryption(inTransitEncryption)
  }

  /**
   * Specifies a mount path for your Amazon EFS file system.
   *
   * This is where DataSync reads or writes data (depending on if this is a source or destination
   * location). By default, DataSync uses the root directory, but you can also include subdirectories.
   *
   *
   * You must specify a value with forward slashes (for example, `/path/to/folder` ).
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationefs.html#cfn-datasync-locationefs-subdirectory)
   * @param subdirectory Specifies a mount path for your Amazon EFS file system. 
   */
  public fun subdirectory(subdirectory: String) {
    cdkBuilder.subdirectory(subdirectory)
  }

  /**
   * Specifies the key-value pair that represents a tag that you want to add to the resource.
   *
   * The value can be an empty string. This value helps you manage, filter, and search for your
   * resources. We recommend that you create a name tag for your location.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationefs.html#cfn-datasync-locationefs-tags)
   * @param tags Specifies the key-value pair that represents a tag that you want to add to the
   * resource. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * Specifies the key-value pair that represents a tag that you want to add to the resource.
   *
   * The value can be an empty string. This value helps you manage, filter, and search for your
   * resources. We recommend that you create a name tag for your location.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationefs.html#cfn-datasync-locationefs-tags)
   * @param tags Specifies the key-value pair that represents a tag that you want to add to the
   * resource. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnLocationEFS {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}

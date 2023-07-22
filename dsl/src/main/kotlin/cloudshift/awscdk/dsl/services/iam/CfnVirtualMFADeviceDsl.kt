@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.iam.CfnVirtualMFADevice
import software.constructs.Construct

@CdkDslMarker
public class CfnVirtualMFADeviceDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnVirtualMFADevice.Builder = CfnVirtualMFADevice.Builder.create(scope,
      id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  private val _users: MutableList<String> = mutableListOf()

  /**
   * The path for the virtual MFA device.
   *
   * For more information about paths, see [IAM
   * identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) in the *IAM
   * User Guide* .
   *
   * This parameter is optional. If it is not included, it defaults to a slash (/).
   *
   * This parameter allows (through its [regex
   * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
   * consisting of either a forward slash (/) by itself or a string that must begin and end with
   * forward slashes. In addition, it can contain any ASCII character from the ! ( `\u0021` ) through
   * the DEL character ( `\u007F` ), including most punctuation characters, digits, and upper and
   * lowercased letters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-virtualmfadevice.html#cfn-iam-virtualmfadevice-path)
   * @param path The path for the virtual MFA device. 
   */
  public fun path(path: String) {
    cdkBuilder.path(path)
  }

  /**
   * A list of tags that you want to attach to the new IAM virtual MFA device.
   *
   * Each tag consists of a key name and an associated value. For more information about tagging,
   * see [Tagging IAM resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in the
   * *IAM User Guide* .
   *
   *
   * If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the
   * entire request fails and the resource is not created.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-virtualmfadevice.html#cfn-iam-virtualmfadevice-tags)
   * @param tags A list of tags that you want to attach to the new IAM virtual MFA device. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * A list of tags that you want to attach to the new IAM virtual MFA device.
   *
   * Each tag consists of a key name and an associated value. For more information about tagging,
   * see [Tagging IAM resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in the
   * *IAM User Guide* .
   *
   *
   * If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the
   * entire request fails and the resource is not created.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-virtualmfadevice.html#cfn-iam-virtualmfadevice-tags)
   * @param tags A list of tags that you want to attach to the new IAM virtual MFA device. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * The IAM user associated with this virtual MFA device.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-virtualmfadevice.html#cfn-iam-virtualmfadevice-users)
   * @param users The IAM user associated with this virtual MFA device. 
   */
  public fun users(vararg users: String) {
    _users.addAll(listOf(*users))
  }

  /**
   * The IAM user associated with this virtual MFA device.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-virtualmfadevice.html#cfn-iam-virtualmfadevice-users)
   * @param users The IAM user associated with this virtual MFA device. 
   */
  public fun users(users: Collection<String>) {
    _users.addAll(users)
  }

  /**
   * The name of the virtual MFA device, which must be unique.
   *
   * Use with path to uniquely identify a virtual MFA device.
   *
   * This parameter allows (through its [regex
   * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
   * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any
   * of the following characters: _+=,.&#64;-
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-virtualmfadevice.html#cfn-iam-virtualmfadevice-virtualmfadevicename)
   * @param virtualMfaDeviceName The name of the virtual MFA device, which must be unique. 
   */
  public fun virtualMfaDeviceName(virtualMfaDeviceName: String) {
    cdkBuilder.virtualMfaDeviceName(virtualMfaDeviceName)
  }

  public fun build(): CfnVirtualMFADevice {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    if(_users.isNotEmpty()) cdkBuilder.users(_users)
    return cdkBuilder.build()
  }
}

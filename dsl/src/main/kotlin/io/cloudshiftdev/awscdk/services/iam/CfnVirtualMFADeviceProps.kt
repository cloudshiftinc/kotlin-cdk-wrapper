package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnVirtualMFADeviceProps {
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
   */
  public fun path(): String? = unwrap(this).getPath()

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
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The IAM user associated with this virtual MFA device.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-virtualmfadevice.html#cfn-iam-virtualmfadevice-users)
   */
  public fun users(): List<String>

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
   */
  public fun virtualMfaDeviceName(): String? = unwrap(this).getVirtualMfaDeviceName()

  /**
   * A builder for [CfnVirtualMFADeviceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param path The path for the virtual MFA device.
     * For more information about paths, see [IAM
     * identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) in the
     * *IAM User Guide* .
     *
     * This parameter is optional. If it is not included, it defaults to a slash (/).
     *
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of either a forward slash (/) by itself or a string that must begin and end with
     * forward slashes. In addition, it can contain any ASCII character from the ! ( `\u0021` ) through
     * the DEL character ( `\u007F` ), including most punctuation characters, digits, and upper and
     * lowercased letters.
     */
    public fun path(path: String)

    /**
     * @param tags A list of tags that you want to attach to the new IAM virtual MFA device.
     * Each tag consists of a key name and an associated value. For more information about tagging,
     * see [Tagging IAM resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in
     * the *IAM User Guide* .
     *
     *
     * If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then
     * the entire request fails and the resource is not created.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of tags that you want to attach to the new IAM virtual MFA device.
     * Each tag consists of a key name and an associated value. For more information about tagging,
     * see [Tagging IAM resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in
     * the *IAM User Guide* .
     *
     *
     * If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then
     * the entire request fails and the resource is not created.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param users The IAM user associated with this virtual MFA device. 
     */
    public fun users(users: List<String>)

    /**
     * @param users The IAM user associated with this virtual MFA device. 
     */
    public fun users(vararg users: String)

    /**
     * @param virtualMfaDeviceName The name of the virtual MFA device, which must be unique.
     * Use with path to uniquely identify a virtual MFA device.
     *
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     */
    public fun virtualMfaDeviceName(virtualMfaDeviceName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.CfnVirtualMFADeviceProps.Builder =
        software.amazon.awscdk.services.iam.CfnVirtualMFADeviceProps.builder()

    /**
     * @param path The path for the virtual MFA device.
     * For more information about paths, see [IAM
     * identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) in the
     * *IAM User Guide* .
     *
     * This parameter is optional. If it is not included, it defaults to a slash (/).
     *
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of either a forward slash (/) by itself or a string that must begin and end with
     * forward slashes. In addition, it can contain any ASCII character from the ! ( `\u0021` ) through
     * the DEL character ( `\u007F` ), including most punctuation characters, digits, and upper and
     * lowercased letters.
     */
    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    /**
     * @param tags A list of tags that you want to attach to the new IAM virtual MFA device.
     * Each tag consists of a key name and an associated value. For more information about tagging,
     * see [Tagging IAM resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in
     * the *IAM User Guide* .
     *
     *
     * If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then
     * the entire request fails and the resource is not created.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A list of tags that you want to attach to the new IAM virtual MFA device.
     * Each tag consists of a key name and an associated value. For more information about tagging,
     * see [Tagging IAM resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in
     * the *IAM User Guide* .
     *
     *
     * If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then
     * the entire request fails and the resource is not created.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param users The IAM user associated with this virtual MFA device. 
     */
    override fun users(users: List<String>) {
      cdkBuilder.users(users)
    }

    /**
     * @param users The IAM user associated with this virtual MFA device. 
     */
    override fun users(vararg users: String): Unit = users(users.toList())

    /**
     * @param virtualMfaDeviceName The name of the virtual MFA device, which must be unique.
     * Use with path to uniquely identify a virtual MFA device.
     *
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     */
    override fun virtualMfaDeviceName(virtualMfaDeviceName: String) {
      cdkBuilder.virtualMfaDeviceName(virtualMfaDeviceName)
    }

    public fun build(): software.amazon.awscdk.services.iam.CfnVirtualMFADeviceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.CfnVirtualMFADeviceProps,
  ) : CdkObject(cdkObject), CfnVirtualMFADeviceProps {
    /**
     * The path for the virtual MFA device.
     *
     * For more information about paths, see [IAM
     * identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) in the
     * *IAM User Guide* .
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
     */
    override fun path(): String? = unwrap(this).getPath()

    /**
     * A list of tags that you want to attach to the new IAM virtual MFA device.
     *
     * Each tag consists of a key name and an associated value. For more information about tagging,
     * see [Tagging IAM resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in
     * the *IAM User Guide* .
     *
     *
     * If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then
     * the entire request fails and the resource is not created.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-virtualmfadevice.html#cfn-iam-virtualmfadevice-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The IAM user associated with this virtual MFA device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-virtualmfadevice.html#cfn-iam-virtualmfadevice-users)
     */
    override fun users(): List<String> = unwrap(this).getUsers()

    /**
     * The name of the virtual MFA device, which must be unique.
     *
     * Use with path to uniquely identify a virtual MFA device.
     *
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-virtualmfadevice.html#cfn-iam-virtualmfadevice-virtualmfadevicename)
     */
    override fun virtualMfaDeviceName(): String? = unwrap(this).getVirtualMfaDeviceName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVirtualMFADeviceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnVirtualMFADeviceProps):
        CfnVirtualMFADeviceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVirtualMFADeviceProps):
        software.amazon.awscdk.services.iam.CfnVirtualMFADeviceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iam.CfnVirtualMFADeviceProps
  }
}

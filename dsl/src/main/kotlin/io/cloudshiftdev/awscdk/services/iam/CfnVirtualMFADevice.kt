package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnVirtualMFADevice internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iam.CfnVirtualMFADevice,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * Returns the serial number for the specified `AWS::IAM::VirtualMFADevice` resource.
   */
  public open fun attrSerialNumber(): String = unwrap(this).getAttrSerialNumber()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The path for the virtual MFA device.
   */
  public open fun path(): String? = unwrap(this).getPath()

  /**
   * The path for the virtual MFA device.
   */
  public open fun path(`value`: String) {
    unwrap(this).setPath(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A list of tags that you want to attach to the new IAM virtual MFA device.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A list of tags that you want to attach to the new IAM virtual MFA device.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * A list of tags that you want to attach to the new IAM virtual MFA device.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The IAM user associated with this virtual MFA device.
   */
  public open fun users(): List<String> = unwrap(this).getUsers()

  /**
   * The IAM user associated with this virtual MFA device.
   */
  public open fun users(`value`: List<String>) {
    unwrap(this).setUsers(`value`)
  }

  /**
   * The IAM user associated with this virtual MFA device.
   */
  public open fun users(vararg `value`: String): Unit = users(`value`.toList())

  /**
   * The name of the virtual MFA device, which must be unique.
   */
  public open fun virtualMfaDeviceName(): String? = unwrap(this).getVirtualMfaDeviceName()

  /**
   * The name of the virtual MFA device, which must be unique.
   */
  public open fun virtualMfaDeviceName(`value`: String) {
    unwrap(this).setVirtualMfaDeviceName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iam.CfnVirtualMFADevice].
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param path The path for the virtual MFA device. 
     */
    public fun path(path: String)

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
     * @param tags A list of tags that you want to attach to the new IAM virtual MFA device. 
     */
    public fun tags(tags: List<CfnTag>)

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
     * @param tags A list of tags that you want to attach to the new IAM virtual MFA device. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The IAM user associated with this virtual MFA device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-virtualmfadevice.html#cfn-iam-virtualmfadevice-users)
     * @param users The IAM user associated with this virtual MFA device. 
     */
    public fun users(users: List<String>)

    /**
     * The IAM user associated with this virtual MFA device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-virtualmfadevice.html#cfn-iam-virtualmfadevice-users)
     * @param users The IAM user associated with this virtual MFA device. 
     */
    public fun users(vararg users: String)

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
     * @param virtualMfaDeviceName The name of the virtual MFA device, which must be unique. 
     */
    public fun virtualMfaDeviceName(virtualMfaDeviceName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.CfnVirtualMFADevice.Builder =
        software.amazon.awscdk.services.iam.CfnVirtualMFADevice.Builder.create(scope, id)

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
     * @param path The path for the virtual MFA device. 
     */
    override fun path(path: String) {
      cdkBuilder.path(path)
    }

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
     * @param tags A list of tags that you want to attach to the new IAM virtual MFA device. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

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
     * @param tags A list of tags that you want to attach to the new IAM virtual MFA device. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The IAM user associated with this virtual MFA device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-virtualmfadevice.html#cfn-iam-virtualmfadevice-users)
     * @param users The IAM user associated with this virtual MFA device. 
     */
    override fun users(users: List<String>) {
      cdkBuilder.users(users)
    }

    /**
     * The IAM user associated with this virtual MFA device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-virtualmfadevice.html#cfn-iam-virtualmfadevice-users)
     * @param users The IAM user associated with this virtual MFA device. 
     */
    override fun users(vararg users: String): Unit = users(users.toList())

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
     * @param virtualMfaDeviceName The name of the virtual MFA device, which must be unique. 
     */
    override fun virtualMfaDeviceName(virtualMfaDeviceName: String) {
      cdkBuilder.virtualMfaDeviceName(virtualMfaDeviceName)
    }

    public fun build(): software.amazon.awscdk.services.iam.CfnVirtualMFADevice = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVirtualMFADevice {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVirtualMFADevice(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnVirtualMFADevice):
        CfnVirtualMFADevice = CfnVirtualMFADevice(cdkObject)

    internal fun unwrap(wrapped: CfnVirtualMFADevice):
        software.amazon.awscdk.services.iam.CfnVirtualMFADevice = wrapped.cdkObject
  }
}

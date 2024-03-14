package io.cloudshiftdev.awscdk.services.datasync

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

public open class CfnLocationFSxWindows internal constructor(
  private val cdkObject: software.amazon.awscdk.services.datasync.CfnLocationFSxWindows,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The ARN of the specified FSx for Windows Server file system location.
   */
  public open fun attrLocationArn(): String = unwrap(this).getAttrLocationArn()

  /**
   * The URI of the specified FSx for Windows Server file system location.
   */
  public open fun attrLocationUri(): String = unwrap(this).getAttrLocationUri()

  /**
   * Specifies the name of the Microsoft Active Directory domain that the FSx for Windows File
   * Server file system belongs to.
   */
  public open fun domain(): String? = unwrap(this).getDomain()

  /**
   * Specifies the name of the Microsoft Active Directory domain that the FSx for Windows File
   * Server file system belongs to.
   */
  public open fun domain(`value`: String) {
    unwrap(this).setDomain(`value`)
  }

  /**
   * Specifies the Amazon Resource Name (ARN) for the FSx for Windows File Server file system.
   */
  public open fun fsxFilesystemArn(): String? = unwrap(this).getFsxFilesystemArn()

  /**
   * Specifies the Amazon Resource Name (ARN) for the FSx for Windows File Server file system.
   */
  public open fun fsxFilesystemArn(`value`: String) {
    unwrap(this).setFsxFilesystemArn(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Specifies the password of the user with the permissions to mount and access the files, folders,
   * and file metadata in your FSx for Windows File Server file system.
   */
  public open fun password(): String? = unwrap(this).getPassword()

  /**
   * Specifies the password of the user with the permissions to mount and access the files, folders,
   * and file metadata in your FSx for Windows File Server file system.
   */
  public open fun password(`value`: String) {
    unwrap(this).setPassword(`value`)
  }

  /**
   * The Amazon Resource Names (ARNs) of the security groups that are used to configure the FSx for
   * Windows File Server file system.
   */
  public open fun securityGroupArns(): List<String> = unwrap(this).getSecurityGroupArns()

  /**
   * The Amazon Resource Names (ARNs) of the security groups that are used to configure the FSx for
   * Windows File Server file system.
   */
  public open fun securityGroupArns(`value`: List<String>) {
    unwrap(this).setSecurityGroupArns(`value`)
  }

  /**
   * The Amazon Resource Names (ARNs) of the security groups that are used to configure the FSx for
   * Windows File Server file system.
   */
  public open fun securityGroupArns(vararg `value`: String): Unit =
      securityGroupArns(`value`.toList())

  /**
   * Specifies a mount path for your file system using forward slashes.
   */
  public open fun subdirectory(): String? = unwrap(this).getSubdirectory()

  /**
   * Specifies a mount path for your file system using forward slashes.
   */
  public open fun subdirectory(`value`: String) {
    unwrap(this).setSubdirectory(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Specifies labels that help you categorize, filter, and search for your AWS resources.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Specifies labels that help you categorize, filter, and search for your AWS resources.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Specifies labels that help you categorize, filter, and search for your AWS resources.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The user who has the permissions to access files and folders in the FSx for Windows File Server
   * file system.
   */
  public open fun user(): String = unwrap(this).getUser()

  /**
   * The user who has the permissions to access files and folders in the FSx for Windows File Server
   * file system.
   */
  public open fun user(`value`: String) {
    unwrap(this).setUser(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.datasync.CfnLocationFSxWindows].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies the name of the Microsoft Active Directory domain that the FSx for Windows File
     * Server file system belongs to.
     *
     * If you have multiple Active Directory domains in your environment, configuring this parameter
     * makes sure that DataSync connects to the right file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxwindows.html#cfn-datasync-locationfsxwindows-domain)
     * @param domain Specifies the name of the Microsoft Active Directory domain that the FSx for
     * Windows File Server file system belongs to. 
     */
    public fun domain(domain: String)

    /**
     * Specifies the Amazon Resource Name (ARN) for the FSx for Windows File Server file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxwindows.html#cfn-datasync-locationfsxwindows-fsxfilesystemarn)
     * @param fsxFilesystemArn Specifies the Amazon Resource Name (ARN) for the FSx for Windows File
     * Server file system. 
     */
    public fun fsxFilesystemArn(fsxFilesystemArn: String)

    /**
     * Specifies the password of the user with the permissions to mount and access the files,
     * folders, and file metadata in your FSx for Windows File Server file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxwindows.html#cfn-datasync-locationfsxwindows-password)
     * @param password Specifies the password of the user with the permissions to mount and access
     * the files, folders, and file metadata in your FSx for Windows File Server file system. 
     */
    public fun password(password: String)

    /**
     * The Amazon Resource Names (ARNs) of the security groups that are used to configure the FSx
     * for Windows File Server file system.
     *
     * *Pattern* :
     * `^arn:(aws|aws-cn|aws-us-gov|aws-iso|aws-iso-b):ec2:[a-z\-0-9]*:[0-9]{12}:security-group/.*$`
     *
     * *Length constraints* : Maximum length of 128.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxwindows.html#cfn-datasync-locationfsxwindows-securitygrouparns)
     * @param securityGroupArns The Amazon Resource Names (ARNs) of the security groups that are
     * used to configure the FSx for Windows File Server file system. 
     */
    public fun securityGroupArns(securityGroupArns: List<String>)

    /**
     * The Amazon Resource Names (ARNs) of the security groups that are used to configure the FSx
     * for Windows File Server file system.
     *
     * *Pattern* :
     * `^arn:(aws|aws-cn|aws-us-gov|aws-iso|aws-iso-b):ec2:[a-z\-0-9]*:[0-9]{12}:security-group/.*$`
     *
     * *Length constraints* : Maximum length of 128.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxwindows.html#cfn-datasync-locationfsxwindows-securitygrouparns)
     * @param securityGroupArns The Amazon Resource Names (ARNs) of the security groups that are
     * used to configure the FSx for Windows File Server file system. 
     */
    public fun securityGroupArns(vararg securityGroupArns: String)

    /**
     * Specifies a mount path for your file system using forward slashes.
     *
     * This is where DataSync reads or writes data (depending on if this is a source or destination
     * location).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxwindows.html#cfn-datasync-locationfsxwindows-subdirectory)
     * @param subdirectory Specifies a mount path for your file system using forward slashes. 
     */
    public fun subdirectory(subdirectory: String)

    /**
     * Specifies labels that help you categorize, filter, and search for your AWS resources.
     *
     * We recommend creating at least a name tag for your location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxwindows.html#cfn-datasync-locationfsxwindows-tags)
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Specifies labels that help you categorize, filter, and search for your AWS resources.
     *
     * We recommend creating at least a name tag for your location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxwindows.html#cfn-datasync-locationfsxwindows-tags)
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The user who has the permissions to access files and folders in the FSx for Windows File
     * Server file system.
     *
     * For information about choosing a user name that ensures sufficient permissions to files,
     * folders, and metadata, see
     * [user](https://docs.aws.amazon.com/datasync/latest/userguide/create-fsx-location.html#FSxWuser)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxwindows.html#cfn-datasync-locationfsxwindows-user)
     * @param user The user who has the permissions to access files and folders in the FSx for
     * Windows File Server file system. 
     */
    public fun user(user: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datasync.CfnLocationFSxWindows.Builder =
        software.amazon.awscdk.services.datasync.CfnLocationFSxWindows.Builder.create(scope, id)

    /**
     * Specifies the name of the Microsoft Active Directory domain that the FSx for Windows File
     * Server file system belongs to.
     *
     * If you have multiple Active Directory domains in your environment, configuring this parameter
     * makes sure that DataSync connects to the right file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxwindows.html#cfn-datasync-locationfsxwindows-domain)
     * @param domain Specifies the name of the Microsoft Active Directory domain that the FSx for
     * Windows File Server file system belongs to. 
     */
    override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    /**
     * Specifies the Amazon Resource Name (ARN) for the FSx for Windows File Server file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxwindows.html#cfn-datasync-locationfsxwindows-fsxfilesystemarn)
     * @param fsxFilesystemArn Specifies the Amazon Resource Name (ARN) for the FSx for Windows File
     * Server file system. 
     */
    override fun fsxFilesystemArn(fsxFilesystemArn: String) {
      cdkBuilder.fsxFilesystemArn(fsxFilesystemArn)
    }

    /**
     * Specifies the password of the user with the permissions to mount and access the files,
     * folders, and file metadata in your FSx for Windows File Server file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxwindows.html#cfn-datasync-locationfsxwindows-password)
     * @param password Specifies the password of the user with the permissions to mount and access
     * the files, folders, and file metadata in your FSx for Windows File Server file system. 
     */
    override fun password(password: String) {
      cdkBuilder.password(password)
    }

    /**
     * The Amazon Resource Names (ARNs) of the security groups that are used to configure the FSx
     * for Windows File Server file system.
     *
     * *Pattern* :
     * `^arn:(aws|aws-cn|aws-us-gov|aws-iso|aws-iso-b):ec2:[a-z\-0-9]*:[0-9]{12}:security-group/.*$`
     *
     * *Length constraints* : Maximum length of 128.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxwindows.html#cfn-datasync-locationfsxwindows-securitygrouparns)
     * @param securityGroupArns The Amazon Resource Names (ARNs) of the security groups that are
     * used to configure the FSx for Windows File Server file system. 
     */
    override fun securityGroupArns(securityGroupArns: List<String>) {
      cdkBuilder.securityGroupArns(securityGroupArns)
    }

    /**
     * The Amazon Resource Names (ARNs) of the security groups that are used to configure the FSx
     * for Windows File Server file system.
     *
     * *Pattern* :
     * `^arn:(aws|aws-cn|aws-us-gov|aws-iso|aws-iso-b):ec2:[a-z\-0-9]*:[0-9]{12}:security-group/.*$`
     *
     * *Length constraints* : Maximum length of 128.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxwindows.html#cfn-datasync-locationfsxwindows-securitygrouparns)
     * @param securityGroupArns The Amazon Resource Names (ARNs) of the security groups that are
     * used to configure the FSx for Windows File Server file system. 
     */
    override fun securityGroupArns(vararg securityGroupArns: String): Unit =
        securityGroupArns(securityGroupArns.toList())

    /**
     * Specifies a mount path for your file system using forward slashes.
     *
     * This is where DataSync reads or writes data (depending on if this is a source or destination
     * location).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxwindows.html#cfn-datasync-locationfsxwindows-subdirectory)
     * @param subdirectory Specifies a mount path for your file system using forward slashes. 
     */
    override fun subdirectory(subdirectory: String) {
      cdkBuilder.subdirectory(subdirectory)
    }

    /**
     * Specifies labels that help you categorize, filter, and search for your AWS resources.
     *
     * We recommend creating at least a name tag for your location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxwindows.html#cfn-datasync-locationfsxwindows-tags)
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Specifies labels that help you categorize, filter, and search for your AWS resources.
     *
     * We recommend creating at least a name tag for your location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxwindows.html#cfn-datasync-locationfsxwindows-tags)
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The user who has the permissions to access files and folders in the FSx for Windows File
     * Server file system.
     *
     * For information about choosing a user name that ensures sufficient permissions to files,
     * folders, and metadata, see
     * [user](https://docs.aws.amazon.com/datasync/latest/userguide/create-fsx-location.html#FSxWuser)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxwindows.html#cfn-datasync-locationfsxwindows-user)
     * @param user The user who has the permissions to access files and folders in the FSx for
     * Windows File Server file system. 
     */
    override fun user(user: String) {
      cdkBuilder.user(user)
    }

    public fun build(): software.amazon.awscdk.services.datasync.CfnLocationFSxWindows =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLocationFSxWindows {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLocationFSxWindows(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationFSxWindows):
        CfnLocationFSxWindows = CfnLocationFSxWindows(cdkObject)

    internal fun unwrap(wrapped: CfnLocationFSxWindows):
        software.amazon.awscdk.services.datasync.CfnLocationFSxWindows = wrapped.cdkObject
  }
}

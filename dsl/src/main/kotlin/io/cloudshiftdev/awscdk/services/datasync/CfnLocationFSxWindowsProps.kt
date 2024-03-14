package io.cloudshiftdev.awscdk.services.datasync

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnLocationFSxWindowsProps {
  /**
   * Specifies the name of the Microsoft Active Directory domain that the FSx for Windows File
   * Server file system belongs to.
   *
   * If you have multiple Active Directory domains in your environment, configuring this parameter
   * makes sure that DataSync connects to the right file system.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxwindows.html#cfn-datasync-locationfsxwindows-domain)
   */
  public fun domain(): String? = unwrap(this).getDomain()

  /**
   * Specifies the Amazon Resource Name (ARN) for the FSx for Windows File Server file system.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxwindows.html#cfn-datasync-locationfsxwindows-fsxfilesystemarn)
   */
  public fun fsxFilesystemArn(): String? = unwrap(this).getFsxFilesystemArn()

  /**
   * Specifies the password of the user with the permissions to mount and access the files, folders,
   * and file metadata in your FSx for Windows File Server file system.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxwindows.html#cfn-datasync-locationfsxwindows-password)
   */
  public fun password(): String? = unwrap(this).getPassword()

  /**
   * The Amazon Resource Names (ARNs) of the security groups that are used to configure the FSx for
   * Windows File Server file system.
   *
   * *Pattern* :
   * `^arn:(aws|aws-cn|aws-us-gov|aws-iso|aws-iso-b):ec2:[a-z\-0-9]*:[0-9]{12}:security-group/.*$`
   *
   * *Length constraints* : Maximum length of 128.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxwindows.html#cfn-datasync-locationfsxwindows-securitygrouparns)
   */
  public fun securityGroupArns(): List<String>

  /**
   * Specifies a mount path for your file system using forward slashes.
   *
   * This is where DataSync reads or writes data (depending on if this is a source or destination
   * location).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxwindows.html#cfn-datasync-locationfsxwindows-subdirectory)
   */
  public fun subdirectory(): String? = unwrap(this).getSubdirectory()

  /**
   * Specifies labels that help you categorize, filter, and search for your AWS resources.
   *
   * We recommend creating at least a name tag for your location.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxwindows.html#cfn-datasync-locationfsxwindows-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The user who has the permissions to access files and folders in the FSx for Windows File Server
   * file system.
   *
   * For information about choosing a user name that ensures sufficient permissions to files,
   * folders, and metadata, see
   * [user](https://docs.aws.amazon.com/datasync/latest/userguide/create-fsx-location.html#FSxWuser) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxwindows.html#cfn-datasync-locationfsxwindows-user)
   */
  public fun user(): String

  /**
   * A builder for [CfnLocationFSxWindowsProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param domain Specifies the name of the Microsoft Active Directory domain that the FSx for
     * Windows File Server file system belongs to.
     * If you have multiple Active Directory domains in your environment, configuring this parameter
     * makes sure that DataSync connects to the right file system.
     */
    public fun domain(domain: String)

    /**
     * @param fsxFilesystemArn Specifies the Amazon Resource Name (ARN) for the FSx for Windows File
     * Server file system.
     */
    public fun fsxFilesystemArn(fsxFilesystemArn: String)

    /**
     * @param password Specifies the password of the user with the permissions to mount and access
     * the files, folders, and file metadata in your FSx for Windows File Server file system.
     */
    public fun password(password: String)

    /**
     * @param securityGroupArns The Amazon Resource Names (ARNs) of the security groups that are
     * used to configure the FSx for Windows File Server file system. 
     * *Pattern* :
     * `^arn:(aws|aws-cn|aws-us-gov|aws-iso|aws-iso-b):ec2:[a-z\-0-9]*:[0-9]{12}:security-group/.*$`
     *
     * *Length constraints* : Maximum length of 128.
     */
    public fun securityGroupArns(securityGroupArns: List<String>)

    /**
     * @param securityGroupArns The Amazon Resource Names (ARNs) of the security groups that are
     * used to configure the FSx for Windows File Server file system. 
     * *Pattern* :
     * `^arn:(aws|aws-cn|aws-us-gov|aws-iso|aws-iso-b):ec2:[a-z\-0-9]*:[0-9]{12}:security-group/.*$`
     *
     * *Length constraints* : Maximum length of 128.
     */
    public fun securityGroupArns(vararg securityGroupArns: String)

    /**
     * @param subdirectory Specifies a mount path for your file system using forward slashes.
     * This is where DataSync reads or writes data (depending on if this is a source or destination
     * location).
     */
    public fun subdirectory(subdirectory: String)

    /**
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources.
     * We recommend creating at least a name tag for your location.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources.
     * We recommend creating at least a name tag for your location.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param user The user who has the permissions to access files and folders in the FSx for
     * Windows File Server file system. 
     * For information about choosing a user name that ensures sufficient permissions to files,
     * folders, and metadata, see
     * [user](https://docs.aws.amazon.com/datasync/latest/userguide/create-fsx-location.html#FSxWuser)
     * .
     */
    public fun user(user: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.datasync.CfnLocationFSxWindowsProps.Builder =
        software.amazon.awscdk.services.datasync.CfnLocationFSxWindowsProps.builder()

    /**
     * @param domain Specifies the name of the Microsoft Active Directory domain that the FSx for
     * Windows File Server file system belongs to.
     * If you have multiple Active Directory domains in your environment, configuring this parameter
     * makes sure that DataSync connects to the right file system.
     */
    override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    /**
     * @param fsxFilesystemArn Specifies the Amazon Resource Name (ARN) for the FSx for Windows File
     * Server file system.
     */
    override fun fsxFilesystemArn(fsxFilesystemArn: String) {
      cdkBuilder.fsxFilesystemArn(fsxFilesystemArn)
    }

    /**
     * @param password Specifies the password of the user with the permissions to mount and access
     * the files, folders, and file metadata in your FSx for Windows File Server file system.
     */
    override fun password(password: String) {
      cdkBuilder.password(password)
    }

    /**
     * @param securityGroupArns The Amazon Resource Names (ARNs) of the security groups that are
     * used to configure the FSx for Windows File Server file system. 
     * *Pattern* :
     * `^arn:(aws|aws-cn|aws-us-gov|aws-iso|aws-iso-b):ec2:[a-z\-0-9]*:[0-9]{12}:security-group/.*$`
     *
     * *Length constraints* : Maximum length of 128.
     */
    override fun securityGroupArns(securityGroupArns: List<String>) {
      cdkBuilder.securityGroupArns(securityGroupArns)
    }

    /**
     * @param securityGroupArns The Amazon Resource Names (ARNs) of the security groups that are
     * used to configure the FSx for Windows File Server file system. 
     * *Pattern* :
     * `^arn:(aws|aws-cn|aws-us-gov|aws-iso|aws-iso-b):ec2:[a-z\-0-9]*:[0-9]{12}:security-group/.*$`
     *
     * *Length constraints* : Maximum length of 128.
     */
    override fun securityGroupArns(vararg securityGroupArns: String): Unit =
        securityGroupArns(securityGroupArns.toList())

    /**
     * @param subdirectory Specifies a mount path for your file system using forward slashes.
     * This is where DataSync reads or writes data (depending on if this is a source or destination
     * location).
     */
    override fun subdirectory(subdirectory: String) {
      cdkBuilder.subdirectory(subdirectory)
    }

    /**
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources.
     * We recommend creating at least a name tag for your location.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources.
     * We recommend creating at least a name tag for your location.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param user The user who has the permissions to access files and folders in the FSx for
     * Windows File Server file system. 
     * For information about choosing a user name that ensures sufficient permissions to files,
     * folders, and metadata, see
     * [user](https://docs.aws.amazon.com/datasync/latest/userguide/create-fsx-location.html#FSxWuser)
     * .
     */
    override fun user(user: String) {
      cdkBuilder.user(user)
    }

    public fun build(): software.amazon.awscdk.services.datasync.CfnLocationFSxWindowsProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.datasync.CfnLocationFSxWindowsProps,
  ) : CdkObject(cdkObject), CfnLocationFSxWindowsProps {
    /**
     * Specifies the name of the Microsoft Active Directory domain that the FSx for Windows File
     * Server file system belongs to.
     *
     * If you have multiple Active Directory domains in your environment, configuring this parameter
     * makes sure that DataSync connects to the right file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxwindows.html#cfn-datasync-locationfsxwindows-domain)
     */
    override fun domain(): String? = unwrap(this).getDomain()

    /**
     * Specifies the Amazon Resource Name (ARN) for the FSx for Windows File Server file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxwindows.html#cfn-datasync-locationfsxwindows-fsxfilesystemarn)
     */
    override fun fsxFilesystemArn(): String? = unwrap(this).getFsxFilesystemArn()

    /**
     * Specifies the password of the user with the permissions to mount and access the files,
     * folders, and file metadata in your FSx for Windows File Server file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxwindows.html#cfn-datasync-locationfsxwindows-password)
     */
    override fun password(): String? = unwrap(this).getPassword()

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
     */
    override fun securityGroupArns(): List<String> = unwrap(this).getSecurityGroupArns()

    /**
     * Specifies a mount path for your file system using forward slashes.
     *
     * This is where DataSync reads or writes data (depending on if this is a source or destination
     * location).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxwindows.html#cfn-datasync-locationfsxwindows-subdirectory)
     */
    override fun subdirectory(): String? = unwrap(this).getSubdirectory()

    /**
     * Specifies labels that help you categorize, filter, and search for your AWS resources.
     *
     * We recommend creating at least a name tag for your location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxwindows.html#cfn-datasync-locationfsxwindows-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

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
     */
    override fun user(): String = unwrap(this).getUser()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLocationFSxWindowsProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationFSxWindowsProps):
        CfnLocationFSxWindowsProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLocationFSxWindowsProps):
        software.amazon.awscdk.services.datasync.CfnLocationFSxWindowsProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.datasync.CfnLocationFSxWindowsProps
  }
}

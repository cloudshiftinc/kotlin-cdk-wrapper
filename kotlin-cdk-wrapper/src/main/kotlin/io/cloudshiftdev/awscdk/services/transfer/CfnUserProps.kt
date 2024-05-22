@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.transfer

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnUser`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.transfer.*;
 * CfnUserProps cfnUserProps = CfnUserProps.builder()
 * .role("role")
 * .serverId("serverId")
 * .userName("userName")
 * // the properties below are optional
 * .homeDirectory("homeDirectory")
 * .homeDirectoryMappings(List.of(HomeDirectoryMapEntryProperty.builder()
 * .entry("entry")
 * .target("target")
 * // the properties below are optional
 * .type("type")
 * .build()))
 * .homeDirectoryType("homeDirectoryType")
 * .policy("policy")
 * .posixProfile(PosixProfileProperty.builder()
 * .gid(123)
 * .uid(123)
 * // the properties below are optional
 * .secondaryGids(List.of(123))
 * .build())
 * .sshPublicKeys(List.of("sshPublicKeys"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html)
 */
public interface CfnUserProps {
  /**
   * The landing directory (folder) for a user when they log in to the server using the client.
   *
   * A `HomeDirectory` example is `/bucket_name/home/mydirectory` .
   *
   *
   * The `HomeDirectory` parameter is only used if `HomeDirectoryType` is set to `PATH` .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-homedirectory)
   */
  public fun homeDirectory(): String? = unwrap(this).getHomeDirectory()

  /**
   * Logical directory mappings that specify what Amazon S3 or Amazon EFS paths and keys should be
   * visible to your user and how you want to make them visible.
   *
   * You must specify the `Entry` and `Target` pair, where `Entry` shows how the path is made
   * visible and `Target` is the actual Amazon S3 or Amazon EFS path. If you only specify a target, it
   * is displayed as is. You also must ensure that your AWS Identity and Access Management (IAM) role
   * provides access to paths in `Target` . This value can be set only when `HomeDirectoryType` is set
   * to *LOGICAL* .
   *
   * The following is an `Entry` and `Target` pair example.
   *
   * `[ { "Entry": "/directory1", "Target": "/bucket_name/home/mydirectory" } ]`
   *
   * In most cases, you can use this value instead of the session policy to lock your user down to
   * the designated home directory (" `chroot` "). To do this, you can set `Entry` to `/` and set
   * `Target` to the value the user should see for their home directory when they log in.
   *
   * The following is an `Entry` and `Target` pair example for `chroot` .
   *
   * `[ { "Entry": "/", "Target": "/bucket_name/home/mydirectory" } ]`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-homedirectorymappings)
   */
  public fun homeDirectoryMappings(): Any? = unwrap(this).getHomeDirectoryMappings()

  /**
   * The type of landing directory (folder) that you want your users' home directory to be when they
   * log in to the server.
   *
   * If you set it to `PATH` , the user will see the absolute Amazon S3 bucket or Amazon EFS path as
   * is in their file transfer protocol clients. If you set it to `LOGICAL` , you need to provide
   * mappings in the `HomeDirectoryMappings` for how you want to make Amazon S3 or Amazon EFS paths
   * visible to your users.
   *
   *
   * If `HomeDirectoryType` is `LOGICAL` , you must provide mappings, using the
   * `HomeDirectoryMappings` parameter. If, on the other hand, `HomeDirectoryType` is `PATH` , you
   * provide an absolute path using the `HomeDirectory` parameter. You cannot have both `HomeDirectory`
   * and `HomeDirectoryMappings` in your template.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-homedirectorytype)
   */
  public fun homeDirectoryType(): String? = unwrap(this).getHomeDirectoryType()

  /**
   * A session policy for your user so you can use the same IAM role across multiple users.
   *
   * This policy restricts user access to portions of their Amazon S3 bucket. Variables that you can
   * use inside this policy include `${Transfer:UserName}` , `${Transfer:HomeDirectory}` , and
   * `${Transfer:HomeBucket}` .
   *
   *
   * For session policies, AWS Transfer Family stores the policy as a JSON blob, instead of the
   * Amazon Resource Name (ARN) of the policy. You save the policy as a JSON blob and pass it in the
   * `Policy` argument.
   *
   * For an example of a session policy, see [Example session
   * policy](https://docs.aws.amazon.com/transfer/latest/userguide/session-policy.html) .
   *
   * For more information, see
   * [AssumeRole](https://docs.aws.amazon.com/STS/latest/APIReference/API_AssumeRole.html) in the *AWS
   * Security Token Service API Reference* .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-policy)
   */
  public fun policy(): String? = unwrap(this).getPolicy()

  /**
   * Specifies the full POSIX identity, including user ID ( `Uid` ), group ID ( `Gid` ), and any
   * secondary groups IDs ( `SecondaryGids` ), that controls your users' access to your Amazon Elastic
   * File System (Amazon EFS) file systems.
   *
   * The POSIX permissions that are set on files and directories in your file system determine the
   * level of access your users get when transferring files into and out of your Amazon EFS file
   * systems.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-posixprofile)
   */
  public fun posixProfile(): Any? = unwrap(this).getPosixProfile()

  /**
   * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that
   * controls your users' access to your Amazon S3 bucket or Amazon EFS file system.
   *
   * The policies attached to this role determine the level of access that you want to provide your
   * users when transferring files into and out of your Amazon S3 bucket or Amazon EFS file system. The
   * IAM role should also contain a trust relationship that allows the server to access your resources
   * when servicing your users' transfer requests.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-role)
   */
  public fun role(): String

  /**
   * A system-assigned unique identifier for a server instance.
   *
   * This is the specific server that you added your user to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-serverid)
   */
  public fun serverId(): String

  /**
   * Specifies the public key portion of the Secure Shell (SSH) keys stored for the described user.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-sshpublickeys)
   */
  public fun sshPublicKeys(): List<String> = unwrap(this).getSshPublicKeys() ?: emptyList()

  /**
   * Key-value pairs that can be used to group and search for users.
   *
   * Tags are metadata attached to users for any purpose.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A unique string that identifies a user and is associated with a `ServerId` .
   *
   * This user name must be a minimum of 3 and a maximum of 100 characters long. The following are
   * valid characters: a-z, A-Z, 0-9, underscore '_', hyphen '-', period '.', and at sign '&#64;'. The
   * user name can't start with a hyphen, period, or at sign.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-username)
   */
  public fun userName(): String

  /**
   * A builder for [CfnUserProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param homeDirectory The landing directory (folder) for a user when they log in to the server
     * using the client.
     * A `HomeDirectory` example is `/bucket_name/home/mydirectory` .
     *
     *
     * The `HomeDirectory` parameter is only used if `HomeDirectoryType` is set to `PATH` .
     */
    public fun homeDirectory(homeDirectory: String)

    /**
     * @param homeDirectoryMappings Logical directory mappings that specify what Amazon S3 or Amazon
     * EFS paths and keys should be visible to your user and how you want to make them visible.
     * You must specify the `Entry` and `Target` pair, where `Entry` shows how the path is made
     * visible and `Target` is the actual Amazon S3 or Amazon EFS path. If you only specify a target,
     * it is displayed as is. You also must ensure that your AWS Identity and Access Management (IAM)
     * role provides access to paths in `Target` . This value can be set only when `HomeDirectoryType`
     * is set to *LOGICAL* .
     *
     * The following is an `Entry` and `Target` pair example.
     *
     * `[ { "Entry": "/directory1", "Target": "/bucket_name/home/mydirectory" } ]`
     *
     * In most cases, you can use this value instead of the session policy to lock your user down to
     * the designated home directory (" `chroot` "). To do this, you can set `Entry` to `/` and set
     * `Target` to the value the user should see for their home directory when they log in.
     *
     * The following is an `Entry` and `Target` pair example for `chroot` .
     *
     * `[ { "Entry": "/", "Target": "/bucket_name/home/mydirectory" } ]`
     */
    public fun homeDirectoryMappings(homeDirectoryMappings: IResolvable)

    /**
     * @param homeDirectoryMappings Logical directory mappings that specify what Amazon S3 or Amazon
     * EFS paths and keys should be visible to your user and how you want to make them visible.
     * You must specify the `Entry` and `Target` pair, where `Entry` shows how the path is made
     * visible and `Target` is the actual Amazon S3 or Amazon EFS path. If you only specify a target,
     * it is displayed as is. You also must ensure that your AWS Identity and Access Management (IAM)
     * role provides access to paths in `Target` . This value can be set only when `HomeDirectoryType`
     * is set to *LOGICAL* .
     *
     * The following is an `Entry` and `Target` pair example.
     *
     * `[ { "Entry": "/directory1", "Target": "/bucket_name/home/mydirectory" } ]`
     *
     * In most cases, you can use this value instead of the session policy to lock your user down to
     * the designated home directory (" `chroot` "). To do this, you can set `Entry` to `/` and set
     * `Target` to the value the user should see for their home directory when they log in.
     *
     * The following is an `Entry` and `Target` pair example for `chroot` .
     *
     * `[ { "Entry": "/", "Target": "/bucket_name/home/mydirectory" } ]`
     */
    public fun homeDirectoryMappings(homeDirectoryMappings: List<Any>)

    /**
     * @param homeDirectoryMappings Logical directory mappings that specify what Amazon S3 or Amazon
     * EFS paths and keys should be visible to your user and how you want to make them visible.
     * You must specify the `Entry` and `Target` pair, where `Entry` shows how the path is made
     * visible and `Target` is the actual Amazon S3 or Amazon EFS path. If you only specify a target,
     * it is displayed as is. You also must ensure that your AWS Identity and Access Management (IAM)
     * role provides access to paths in `Target` . This value can be set only when `HomeDirectoryType`
     * is set to *LOGICAL* .
     *
     * The following is an `Entry` and `Target` pair example.
     *
     * `[ { "Entry": "/directory1", "Target": "/bucket_name/home/mydirectory" } ]`
     *
     * In most cases, you can use this value instead of the session policy to lock your user down to
     * the designated home directory (" `chroot` "). To do this, you can set `Entry` to `/` and set
     * `Target` to the value the user should see for their home directory when they log in.
     *
     * The following is an `Entry` and `Target` pair example for `chroot` .
     *
     * `[ { "Entry": "/", "Target": "/bucket_name/home/mydirectory" } ]`
     */
    public fun homeDirectoryMappings(vararg homeDirectoryMappings: Any)

    /**
     * @param homeDirectoryType The type of landing directory (folder) that you want your users'
     * home directory to be when they log in to the server.
     * If you set it to `PATH` , the user will see the absolute Amazon S3 bucket or Amazon EFS path
     * as is in their file transfer protocol clients. If you set it to `LOGICAL` , you need to provide
     * mappings in the `HomeDirectoryMappings` for how you want to make Amazon S3 or Amazon EFS paths
     * visible to your users.
     *
     *
     * If `HomeDirectoryType` is `LOGICAL` , you must provide mappings, using the
     * `HomeDirectoryMappings` parameter. If, on the other hand, `HomeDirectoryType` is `PATH` , you
     * provide an absolute path using the `HomeDirectory` parameter. You cannot have both
     * `HomeDirectory` and `HomeDirectoryMappings` in your template.
     */
    public fun homeDirectoryType(homeDirectoryType: String)

    /**
     * @param policy A session policy for your user so you can use the same IAM role across multiple
     * users.
     * This policy restricts user access to portions of their Amazon S3 bucket. Variables that you
     * can use inside this policy include `${Transfer:UserName}` , `${Transfer:HomeDirectory}` , and
     * `${Transfer:HomeBucket}` .
     *
     *
     * For session policies, AWS Transfer Family stores the policy as a JSON blob, instead of the
     * Amazon Resource Name (ARN) of the policy. You save the policy as a JSON blob and pass it in the
     * `Policy` argument.
     *
     * For an example of a session policy, see [Example session
     * policy](https://docs.aws.amazon.com/transfer/latest/userguide/session-policy.html) .
     *
     * For more information, see
     * [AssumeRole](https://docs.aws.amazon.com/STS/latest/APIReference/API_AssumeRole.html) in the
     * *AWS Security Token Service API Reference* .
     */
    public fun policy(policy: String)

    /**
     * @param posixProfile Specifies the full POSIX identity, including user ID ( `Uid` ), group ID
     * ( `Gid` ), and any secondary groups IDs ( `SecondaryGids` ), that controls your users' access to
     * your Amazon Elastic File System (Amazon EFS) file systems.
     * The POSIX permissions that are set on files and directories in your file system determine the
     * level of access your users get when transferring files into and out of your Amazon EFS file
     * systems.
     */
    public fun posixProfile(posixProfile: IResolvable)

    /**
     * @param posixProfile Specifies the full POSIX identity, including user ID ( `Uid` ), group ID
     * ( `Gid` ), and any secondary groups IDs ( `SecondaryGids` ), that controls your users' access to
     * your Amazon Elastic File System (Amazon EFS) file systems.
     * The POSIX permissions that are set on files and directories in your file system determine the
     * level of access your users get when transferring files into and out of your Amazon EFS file
     * systems.
     */
    public fun posixProfile(posixProfile: CfnUser.PosixProfileProperty)

    /**
     * @param posixProfile Specifies the full POSIX identity, including user ID ( `Uid` ), group ID
     * ( `Gid` ), and any secondary groups IDs ( `SecondaryGids` ), that controls your users' access to
     * your Amazon Elastic File System (Amazon EFS) file systems.
     * The POSIX permissions that are set on files and directories in your file system determine the
     * level of access your users get when transferring files into and out of your Amazon EFS file
     * systems.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("727a4e60b21450c81f954f6c7ee847833f2a30081c313382cb7a44f1be76fbfd")
    public fun posixProfile(posixProfile: CfnUser.PosixProfileProperty.Builder.() -> Unit)

    /**
     * @param role The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM)
     * role that controls your users' access to your Amazon S3 bucket or Amazon EFS file system. 
     * The policies attached to this role determine the level of access that you want to provide
     * your users when transferring files into and out of your Amazon S3 bucket or Amazon EFS file
     * system. The IAM role should also contain a trust relationship that allows the server to access
     * your resources when servicing your users' transfer requests.
     */
    public fun role(role: String)

    /**
     * @param serverId A system-assigned unique identifier for a server instance. 
     * This is the specific server that you added your user to.
     */
    public fun serverId(serverId: String)

    /**
     * @param sshPublicKeys Specifies the public key portion of the Secure Shell (SSH) keys stored
     * for the described user.
     */
    public fun sshPublicKeys(sshPublicKeys: List<String>)

    /**
     * @param sshPublicKeys Specifies the public key portion of the Secure Shell (SSH) keys stored
     * for the described user.
     */
    public fun sshPublicKeys(vararg sshPublicKeys: String)

    /**
     * @param tags Key-value pairs that can be used to group and search for users.
     * Tags are metadata attached to users for any purpose.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Key-value pairs that can be used to group and search for users.
     * Tags are metadata attached to users for any purpose.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param userName A unique string that identifies a user and is associated with a `ServerId` . 
     * This user name must be a minimum of 3 and a maximum of 100 characters long. The following are
     * valid characters: a-z, A-Z, 0-9, underscore '_', hyphen '-', period '.', and at sign '&#64;'.
     * The user name can't start with a hyphen, period, or at sign.
     */
    public fun userName(userName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.transfer.CfnUserProps.Builder =
        software.amazon.awscdk.services.transfer.CfnUserProps.builder()

    /**
     * @param homeDirectory The landing directory (folder) for a user when they log in to the server
     * using the client.
     * A `HomeDirectory` example is `/bucket_name/home/mydirectory` .
     *
     *
     * The `HomeDirectory` parameter is only used if `HomeDirectoryType` is set to `PATH` .
     */
    override fun homeDirectory(homeDirectory: String) {
      cdkBuilder.homeDirectory(homeDirectory)
    }

    /**
     * @param homeDirectoryMappings Logical directory mappings that specify what Amazon S3 or Amazon
     * EFS paths and keys should be visible to your user and how you want to make them visible.
     * You must specify the `Entry` and `Target` pair, where `Entry` shows how the path is made
     * visible and `Target` is the actual Amazon S3 or Amazon EFS path. If you only specify a target,
     * it is displayed as is. You also must ensure that your AWS Identity and Access Management (IAM)
     * role provides access to paths in `Target` . This value can be set only when `HomeDirectoryType`
     * is set to *LOGICAL* .
     *
     * The following is an `Entry` and `Target` pair example.
     *
     * `[ { "Entry": "/directory1", "Target": "/bucket_name/home/mydirectory" } ]`
     *
     * In most cases, you can use this value instead of the session policy to lock your user down to
     * the designated home directory (" `chroot` "). To do this, you can set `Entry` to `/` and set
     * `Target` to the value the user should see for their home directory when they log in.
     *
     * The following is an `Entry` and `Target` pair example for `chroot` .
     *
     * `[ { "Entry": "/", "Target": "/bucket_name/home/mydirectory" } ]`
     */
    override fun homeDirectoryMappings(homeDirectoryMappings: IResolvable) {
      cdkBuilder.homeDirectoryMappings(homeDirectoryMappings.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param homeDirectoryMappings Logical directory mappings that specify what Amazon S3 or Amazon
     * EFS paths and keys should be visible to your user and how you want to make them visible.
     * You must specify the `Entry` and `Target` pair, where `Entry` shows how the path is made
     * visible and `Target` is the actual Amazon S3 or Amazon EFS path. If you only specify a target,
     * it is displayed as is. You also must ensure that your AWS Identity and Access Management (IAM)
     * role provides access to paths in `Target` . This value can be set only when `HomeDirectoryType`
     * is set to *LOGICAL* .
     *
     * The following is an `Entry` and `Target` pair example.
     *
     * `[ { "Entry": "/directory1", "Target": "/bucket_name/home/mydirectory" } ]`
     *
     * In most cases, you can use this value instead of the session policy to lock your user down to
     * the designated home directory (" `chroot` "). To do this, you can set `Entry` to `/` and set
     * `Target` to the value the user should see for their home directory when they log in.
     *
     * The following is an `Entry` and `Target` pair example for `chroot` .
     *
     * `[ { "Entry": "/", "Target": "/bucket_name/home/mydirectory" } ]`
     */
    override fun homeDirectoryMappings(homeDirectoryMappings: List<Any>) {
      cdkBuilder.homeDirectoryMappings(homeDirectoryMappings.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param homeDirectoryMappings Logical directory mappings that specify what Amazon S3 or Amazon
     * EFS paths and keys should be visible to your user and how you want to make them visible.
     * You must specify the `Entry` and `Target` pair, where `Entry` shows how the path is made
     * visible and `Target` is the actual Amazon S3 or Amazon EFS path. If you only specify a target,
     * it is displayed as is. You also must ensure that your AWS Identity and Access Management (IAM)
     * role provides access to paths in `Target` . This value can be set only when `HomeDirectoryType`
     * is set to *LOGICAL* .
     *
     * The following is an `Entry` and `Target` pair example.
     *
     * `[ { "Entry": "/directory1", "Target": "/bucket_name/home/mydirectory" } ]`
     *
     * In most cases, you can use this value instead of the session policy to lock your user down to
     * the designated home directory (" `chroot` "). To do this, you can set `Entry` to `/` and set
     * `Target` to the value the user should see for their home directory when they log in.
     *
     * The following is an `Entry` and `Target` pair example for `chroot` .
     *
     * `[ { "Entry": "/", "Target": "/bucket_name/home/mydirectory" } ]`
     */
    override fun homeDirectoryMappings(vararg homeDirectoryMappings: Any): Unit =
        homeDirectoryMappings(homeDirectoryMappings.toList())

    /**
     * @param homeDirectoryType The type of landing directory (folder) that you want your users'
     * home directory to be when they log in to the server.
     * If you set it to `PATH` , the user will see the absolute Amazon S3 bucket or Amazon EFS path
     * as is in their file transfer protocol clients. If you set it to `LOGICAL` , you need to provide
     * mappings in the `HomeDirectoryMappings` for how you want to make Amazon S3 or Amazon EFS paths
     * visible to your users.
     *
     *
     * If `HomeDirectoryType` is `LOGICAL` , you must provide mappings, using the
     * `HomeDirectoryMappings` parameter. If, on the other hand, `HomeDirectoryType` is `PATH` , you
     * provide an absolute path using the `HomeDirectory` parameter. You cannot have both
     * `HomeDirectory` and `HomeDirectoryMappings` in your template.
     */
    override fun homeDirectoryType(homeDirectoryType: String) {
      cdkBuilder.homeDirectoryType(homeDirectoryType)
    }

    /**
     * @param policy A session policy for your user so you can use the same IAM role across multiple
     * users.
     * This policy restricts user access to portions of their Amazon S3 bucket. Variables that you
     * can use inside this policy include `${Transfer:UserName}` , `${Transfer:HomeDirectory}` , and
     * `${Transfer:HomeBucket}` .
     *
     *
     * For session policies, AWS Transfer Family stores the policy as a JSON blob, instead of the
     * Amazon Resource Name (ARN) of the policy. You save the policy as a JSON blob and pass it in the
     * `Policy` argument.
     *
     * For an example of a session policy, see [Example session
     * policy](https://docs.aws.amazon.com/transfer/latest/userguide/session-policy.html) .
     *
     * For more information, see
     * [AssumeRole](https://docs.aws.amazon.com/STS/latest/APIReference/API_AssumeRole.html) in the
     * *AWS Security Token Service API Reference* .
     */
    override fun policy(policy: String) {
      cdkBuilder.policy(policy)
    }

    /**
     * @param posixProfile Specifies the full POSIX identity, including user ID ( `Uid` ), group ID
     * ( `Gid` ), and any secondary groups IDs ( `SecondaryGids` ), that controls your users' access to
     * your Amazon Elastic File System (Amazon EFS) file systems.
     * The POSIX permissions that are set on files and directories in your file system determine the
     * level of access your users get when transferring files into and out of your Amazon EFS file
     * systems.
     */
    override fun posixProfile(posixProfile: IResolvable) {
      cdkBuilder.posixProfile(posixProfile.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param posixProfile Specifies the full POSIX identity, including user ID ( `Uid` ), group ID
     * ( `Gid` ), and any secondary groups IDs ( `SecondaryGids` ), that controls your users' access to
     * your Amazon Elastic File System (Amazon EFS) file systems.
     * The POSIX permissions that are set on files and directories in your file system determine the
     * level of access your users get when transferring files into and out of your Amazon EFS file
     * systems.
     */
    override fun posixProfile(posixProfile: CfnUser.PosixProfileProperty) {
      cdkBuilder.posixProfile(posixProfile.let(CfnUser.PosixProfileProperty.Companion::unwrap))
    }

    /**
     * @param posixProfile Specifies the full POSIX identity, including user ID ( `Uid` ), group ID
     * ( `Gid` ), and any secondary groups IDs ( `SecondaryGids` ), that controls your users' access to
     * your Amazon Elastic File System (Amazon EFS) file systems.
     * The POSIX permissions that are set on files and directories in your file system determine the
     * level of access your users get when transferring files into and out of your Amazon EFS file
     * systems.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("727a4e60b21450c81f954f6c7ee847833f2a30081c313382cb7a44f1be76fbfd")
    override fun posixProfile(posixProfile: CfnUser.PosixProfileProperty.Builder.() -> Unit): Unit =
        posixProfile(CfnUser.PosixProfileProperty(posixProfile))

    /**
     * @param role The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM)
     * role that controls your users' access to your Amazon S3 bucket or Amazon EFS file system. 
     * The policies attached to this role determine the level of access that you want to provide
     * your users when transferring files into and out of your Amazon S3 bucket or Amazon EFS file
     * system. The IAM role should also contain a trust relationship that allows the server to access
     * your resources when servicing your users' transfer requests.
     */
    override fun role(role: String) {
      cdkBuilder.role(role)
    }

    /**
     * @param serverId A system-assigned unique identifier for a server instance. 
     * This is the specific server that you added your user to.
     */
    override fun serverId(serverId: String) {
      cdkBuilder.serverId(serverId)
    }

    /**
     * @param sshPublicKeys Specifies the public key portion of the Secure Shell (SSH) keys stored
     * for the described user.
     */
    override fun sshPublicKeys(sshPublicKeys: List<String>) {
      cdkBuilder.sshPublicKeys(sshPublicKeys)
    }

    /**
     * @param sshPublicKeys Specifies the public key portion of the Secure Shell (SSH) keys stored
     * for the described user.
     */
    override fun sshPublicKeys(vararg sshPublicKeys: String): Unit =
        sshPublicKeys(sshPublicKeys.toList())

    /**
     * @param tags Key-value pairs that can be used to group and search for users.
     * Tags are metadata attached to users for any purpose.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Key-value pairs that can be used to group and search for users.
     * Tags are metadata attached to users for any purpose.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param userName A unique string that identifies a user and is associated with a `ServerId` . 
     * This user name must be a minimum of 3 and a maximum of 100 characters long. The following are
     * valid characters: a-z, A-Z, 0-9, underscore '_', hyphen '-', period '.', and at sign '&#64;'.
     * The user name can't start with a hyphen, period, or at sign.
     */
    override fun userName(userName: String) {
      cdkBuilder.userName(userName)
    }

    public fun build(): software.amazon.awscdk.services.transfer.CfnUserProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.transfer.CfnUserProps,
  ) : CdkObject(cdkObject), CfnUserProps {
    /**
     * The landing directory (folder) for a user when they log in to the server using the client.
     *
     * A `HomeDirectory` example is `/bucket_name/home/mydirectory` .
     *
     *
     * The `HomeDirectory` parameter is only used if `HomeDirectoryType` is set to `PATH` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-homedirectory)
     */
    override fun homeDirectory(): String? = unwrap(this).getHomeDirectory()

    /**
     * Logical directory mappings that specify what Amazon S3 or Amazon EFS paths and keys should be
     * visible to your user and how you want to make them visible.
     *
     * You must specify the `Entry` and `Target` pair, where `Entry` shows how the path is made
     * visible and `Target` is the actual Amazon S3 or Amazon EFS path. If you only specify a target,
     * it is displayed as is. You also must ensure that your AWS Identity and Access Management (IAM)
     * role provides access to paths in `Target` . This value can be set only when `HomeDirectoryType`
     * is set to *LOGICAL* .
     *
     * The following is an `Entry` and `Target` pair example.
     *
     * `[ { "Entry": "/directory1", "Target": "/bucket_name/home/mydirectory" } ]`
     *
     * In most cases, you can use this value instead of the session policy to lock your user down to
     * the designated home directory (" `chroot` "). To do this, you can set `Entry` to `/` and set
     * `Target` to the value the user should see for their home directory when they log in.
     *
     * The following is an `Entry` and `Target` pair example for `chroot` .
     *
     * `[ { "Entry": "/", "Target": "/bucket_name/home/mydirectory" } ]`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-homedirectorymappings)
     */
    override fun homeDirectoryMappings(): Any? = unwrap(this).getHomeDirectoryMappings()

    /**
     * The type of landing directory (folder) that you want your users' home directory to be when
     * they log in to the server.
     *
     * If you set it to `PATH` , the user will see the absolute Amazon S3 bucket or Amazon EFS path
     * as is in their file transfer protocol clients. If you set it to `LOGICAL` , you need to provide
     * mappings in the `HomeDirectoryMappings` for how you want to make Amazon S3 or Amazon EFS paths
     * visible to your users.
     *
     *
     * If `HomeDirectoryType` is `LOGICAL` , you must provide mappings, using the
     * `HomeDirectoryMappings` parameter. If, on the other hand, `HomeDirectoryType` is `PATH` , you
     * provide an absolute path using the `HomeDirectory` parameter. You cannot have both
     * `HomeDirectory` and `HomeDirectoryMappings` in your template.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-homedirectorytype)
     */
    override fun homeDirectoryType(): String? = unwrap(this).getHomeDirectoryType()

    /**
     * A session policy for your user so you can use the same IAM role across multiple users.
     *
     * This policy restricts user access to portions of their Amazon S3 bucket. Variables that you
     * can use inside this policy include `${Transfer:UserName}` , `${Transfer:HomeDirectory}` , and
     * `${Transfer:HomeBucket}` .
     *
     *
     * For session policies, AWS Transfer Family stores the policy as a JSON blob, instead of the
     * Amazon Resource Name (ARN) of the policy. You save the policy as a JSON blob and pass it in the
     * `Policy` argument.
     *
     * For an example of a session policy, see [Example session
     * policy](https://docs.aws.amazon.com/transfer/latest/userguide/session-policy.html) .
     *
     * For more information, see
     * [AssumeRole](https://docs.aws.amazon.com/STS/latest/APIReference/API_AssumeRole.html) in the
     * *AWS Security Token Service API Reference* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-policy)
     */
    override fun policy(): String? = unwrap(this).getPolicy()

    /**
     * Specifies the full POSIX identity, including user ID ( `Uid` ), group ID ( `Gid` ), and any
     * secondary groups IDs ( `SecondaryGids` ), that controls your users' access to your Amazon
     * Elastic File System (Amazon EFS) file systems.
     *
     * The POSIX permissions that are set on files and directories in your file system determine the
     * level of access your users get when transferring files into and out of your Amazon EFS file
     * systems.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-posixprofile)
     */
    override fun posixProfile(): Any? = unwrap(this).getPosixProfile()

    /**
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that
     * controls your users' access to your Amazon S3 bucket or Amazon EFS file system.
     *
     * The policies attached to this role determine the level of access that you want to provide
     * your users when transferring files into and out of your Amazon S3 bucket or Amazon EFS file
     * system. The IAM role should also contain a trust relationship that allows the server to access
     * your resources when servicing your users' transfer requests.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-role)
     */
    override fun role(): String = unwrap(this).getRole()

    /**
     * A system-assigned unique identifier for a server instance.
     *
     * This is the specific server that you added your user to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-serverid)
     */
    override fun serverId(): String = unwrap(this).getServerId()

    /**
     * Specifies the public key portion of the Secure Shell (SSH) keys stored for the described
     * user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-sshpublickeys)
     */
    override fun sshPublicKeys(): List<String> = unwrap(this).getSshPublicKeys() ?: emptyList()

    /**
     * Key-value pairs that can be used to group and search for users.
     *
     * Tags are metadata attached to users for any purpose.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * A unique string that identifies a user and is associated with a `ServerId` .
     *
     * This user name must be a minimum of 3 and a maximum of 100 characters long. The following are
     * valid characters: a-z, A-Z, 0-9, underscore '_', hyphen '-', period '.', and at sign '&#64;'.
     * The user name can't start with a hyphen, period, or at sign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-username)
     */
    override fun userName(): String = unwrap(this).getUserName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnUserProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnUserProps):
        CfnUserProps = CdkObjectWrappers.wrap(cdkObject) as? CfnUserProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUserProps):
        software.amazon.awscdk.services.transfer.CfnUserProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.transfer.CfnUserProps
  }
}

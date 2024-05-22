@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.transfer

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::Transfer::User` resource creates a user and associates them with an existing server.
 *
 * You can only create and associate users with servers that have the `IdentityProviderType` set to
 * `SERVICE_MANAGED` . Using parameters for `CreateUser` , you can specify the user name, set the home
 * directory, store the user's public key, and assign the user's AWS Identity and Access Management
 * (IAM) role. You can also optionally add a session policy, and assign metadata with tags that can be
 * used to group and search for users.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.transfer.*;
 * CfnUser cfnUser = CfnUser.Builder.create(this, "MyCfnUser")
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
public open class CfnUser(
  cdkObject: software.amazon.awscdk.services.transfer.CfnUser,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnUserProps,
  ) :
      this(software.amazon.awscdk.services.transfer.CfnUser(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnUserProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnUserProps.Builder.() -> Unit,
  ) : this(scope, id, CfnUserProps(props)
  )

  /**
   * The Amazon Resource Name associated with the user, in the form `arn:aws:transfer:region:
   * *account-id* :user/ *server-id* / *username*` .
   *
   * An example of a user ARN is: `arn:aws:transfer:us-east-1:123456789012:user/user1` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The ID of the server to which the user is attached.
   *
   * An example `ServerId` is `s-01234567890abcdef` .
   */
  public open fun attrServerId(): String = unwrap(this).getAttrServerId()

  /**
   * A unique string that identifies a Transfer Family user account associated with a server.
   *
   * An example `UserName` is `transfer-user-1` .
   */
  public open fun attrUserName(): String = unwrap(this).getAttrUserName()

  /**
   * The landing directory (folder) for a user when they log in to the server using the client.
   */
  public open fun homeDirectory(): String? = unwrap(this).getHomeDirectory()

  /**
   * The landing directory (folder) for a user when they log in to the server using the client.
   */
  public open fun homeDirectory(`value`: String) {
    unwrap(this).setHomeDirectory(`value`)
  }

  /**
   * Logical directory mappings that specify what Amazon S3 or Amazon EFS paths and keys should be
   * visible to your user and how you want to make them visible.
   */
  public open fun homeDirectoryMappings(): Any? = unwrap(this).getHomeDirectoryMappings()

  /**
   * Logical directory mappings that specify what Amazon S3 or Amazon EFS paths and keys should be
   * visible to your user and how you want to make them visible.
   */
  public open fun homeDirectoryMappings(`value`: IResolvable) {
    unwrap(this).setHomeDirectoryMappings(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Logical directory mappings that specify what Amazon S3 or Amazon EFS paths and keys should be
   * visible to your user and how you want to make them visible.
   */
  public open fun homeDirectoryMappings(`value`: List<Any>) {
    unwrap(this).setHomeDirectoryMappings(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * Logical directory mappings that specify what Amazon S3 or Amazon EFS paths and keys should be
   * visible to your user and how you want to make them visible.
   */
  public open fun homeDirectoryMappings(vararg `value`: Any): Unit =
      homeDirectoryMappings(`value`.toList())

  /**
   * The type of landing directory (folder) that you want your users' home directory to be when they
   * log in to the server.
   */
  public open fun homeDirectoryType(): String? = unwrap(this).getHomeDirectoryType()

  /**
   * The type of landing directory (folder) that you want your users' home directory to be when they
   * log in to the server.
   */
  public open fun homeDirectoryType(`value`: String) {
    unwrap(this).setHomeDirectoryType(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * A session policy for your user so you can use the same IAM role across multiple users.
   */
  public open fun policy(): String? = unwrap(this).getPolicy()

  /**
   * A session policy for your user so you can use the same IAM role across multiple users.
   */
  public open fun policy(`value`: String) {
    unwrap(this).setPolicy(`value`)
  }

  /**
   * Specifies the full POSIX identity, including user ID ( `Uid` ), group ID ( `Gid` ), and any
   * secondary groups IDs ( `SecondaryGids` ), that controls your users' access to your Amazon Elastic
   * File System (Amazon EFS) file systems.
   */
  public open fun posixProfile(): Any? = unwrap(this).getPosixProfile()

  /**
   * Specifies the full POSIX identity, including user ID ( `Uid` ), group ID ( `Gid` ), and any
   * secondary groups IDs ( `SecondaryGids` ), that controls your users' access to your Amazon Elastic
   * File System (Amazon EFS) file systems.
   */
  public open fun posixProfile(`value`: IResolvable) {
    unwrap(this).setPosixProfile(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specifies the full POSIX identity, including user ID ( `Uid` ), group ID ( `Gid` ), and any
   * secondary groups IDs ( `SecondaryGids` ), that controls your users' access to your Amazon Elastic
   * File System (Amazon EFS) file systems.
   */
  public open fun posixProfile(`value`: PosixProfileProperty) {
    unwrap(this).setPosixProfile(`value`.let(PosixProfileProperty.Companion::unwrap))
  }

  /**
   * Specifies the full POSIX identity, including user ID ( `Uid` ), group ID ( `Gid` ), and any
   * secondary groups IDs ( `SecondaryGids` ), that controls your users' access to your Amazon Elastic
   * File System (Amazon EFS) file systems.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9acbc61c138bcd43bae61b7caeebe7f56ffa1b4768a4a4dd26b111394137ea5e")
  public open fun posixProfile(`value`: PosixProfileProperty.Builder.() -> Unit): Unit =
      posixProfile(PosixProfileProperty(`value`))

  /**
   * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that
   * controls your users' access to your Amazon S3 bucket or Amazon EFS file system.
   */
  public open fun role(): String = unwrap(this).getRole()

  /**
   * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that
   * controls your users' access to your Amazon S3 bucket or Amazon EFS file system.
   */
  public open fun role(`value`: String) {
    unwrap(this).setRole(`value`)
  }

  /**
   * A system-assigned unique identifier for a server instance.
   */
  public open fun serverId(): String = unwrap(this).getServerId()

  /**
   * A system-assigned unique identifier for a server instance.
   */
  public open fun serverId(`value`: String) {
    unwrap(this).setServerId(`value`)
  }

  /**
   * Specifies the public key portion of the Secure Shell (SSH) keys stored for the described user.
   */
  public open fun sshPublicKeys(): List<String> = unwrap(this).getSshPublicKeys() ?: emptyList()

  /**
   * Specifies the public key portion of the Secure Shell (SSH) keys stored for the described user.
   */
  public open fun sshPublicKeys(`value`: List<String>) {
    unwrap(this).setSshPublicKeys(`value`)
  }

  /**
   * Specifies the public key portion of the Secure Shell (SSH) keys stored for the described user.
   */
  public open fun sshPublicKeys(vararg `value`: String): Unit = sshPublicKeys(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Key-value pairs that can be used to group and search for users.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Key-value pairs that can be used to group and search for users.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Key-value pairs that can be used to group and search for users.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A unique string that identifies a user and is associated with a `ServerId` .
   */
  public open fun userName(): String = unwrap(this).getUserName()

  /**
   * A unique string that identifies a user and is associated with a `ServerId` .
   */
  public open fun userName(`value`: String) {
    unwrap(this).setUserName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.transfer.CfnUser].
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param homeDirectory The landing directory (folder) for a user when they log in to the server
     * using the client. 
     */
    public fun homeDirectory(homeDirectory: String)

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
     * @param homeDirectoryMappings Logical directory mappings that specify what Amazon S3 or Amazon
     * EFS paths and keys should be visible to your user and how you want to make them visible. 
     */
    public fun homeDirectoryMappings(homeDirectoryMappings: IResolvable)

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
     * @param homeDirectoryMappings Logical directory mappings that specify what Amazon S3 or Amazon
     * EFS paths and keys should be visible to your user and how you want to make them visible. 
     */
    public fun homeDirectoryMappings(homeDirectoryMappings: List<Any>)

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
     * @param homeDirectoryMappings Logical directory mappings that specify what Amazon S3 or Amazon
     * EFS paths and keys should be visible to your user and how you want to make them visible. 
     */
    public fun homeDirectoryMappings(vararg homeDirectoryMappings: Any)

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
     * @param homeDirectoryType The type of landing directory (folder) that you want your users'
     * home directory to be when they log in to the server. 
     */
    public fun homeDirectoryType(homeDirectoryType: String)

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
     * @param policy A session policy for your user so you can use the same IAM role across multiple
     * users. 
     */
    public fun policy(policy: String)

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
     * @param posixProfile Specifies the full POSIX identity, including user ID ( `Uid` ), group ID
     * ( `Gid` ), and any secondary groups IDs ( `SecondaryGids` ), that controls your users' access to
     * your Amazon Elastic File System (Amazon EFS) file systems. 
     */
    public fun posixProfile(posixProfile: IResolvable)

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
     * @param posixProfile Specifies the full POSIX identity, including user ID ( `Uid` ), group ID
     * ( `Gid` ), and any secondary groups IDs ( `SecondaryGids` ), that controls your users' access to
     * your Amazon Elastic File System (Amazon EFS) file systems. 
     */
    public fun posixProfile(posixProfile: PosixProfileProperty)

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
     * @param posixProfile Specifies the full POSIX identity, including user ID ( `Uid` ), group ID
     * ( `Gid` ), and any secondary groups IDs ( `SecondaryGids` ), that controls your users' access to
     * your Amazon Elastic File System (Amazon EFS) file systems. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5007726d81f440483919b487ad7f5f371e433e8973771f56d69ef691dc88b486")
    public fun posixProfile(posixProfile: PosixProfileProperty.Builder.() -> Unit)

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
     * @param role The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM)
     * role that controls your users' access to your Amazon S3 bucket or Amazon EFS file system. 
     */
    public fun role(role: String)

    /**
     * A system-assigned unique identifier for a server instance.
     *
     * This is the specific server that you added your user to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-serverid)
     * @param serverId A system-assigned unique identifier for a server instance. 
     */
    public fun serverId(serverId: String)

    /**
     * Specifies the public key portion of the Secure Shell (SSH) keys stored for the described
     * user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-sshpublickeys)
     * @param sshPublicKeys Specifies the public key portion of the Secure Shell (SSH) keys stored
     * for the described user. 
     */
    public fun sshPublicKeys(sshPublicKeys: List<String>)

    /**
     * Specifies the public key portion of the Secure Shell (SSH) keys stored for the described
     * user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-sshpublickeys)
     * @param sshPublicKeys Specifies the public key portion of the Secure Shell (SSH) keys stored
     * for the described user. 
     */
    public fun sshPublicKeys(vararg sshPublicKeys: String)

    /**
     * Key-value pairs that can be used to group and search for users.
     *
     * Tags are metadata attached to users for any purpose.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-tags)
     * @param tags Key-value pairs that can be used to group and search for users. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Key-value pairs that can be used to group and search for users.
     *
     * Tags are metadata attached to users for any purpose.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-tags)
     * @param tags Key-value pairs that can be used to group and search for users. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * A unique string that identifies a user and is associated with a `ServerId` .
     *
     * This user name must be a minimum of 3 and a maximum of 100 characters long. The following are
     * valid characters: a-z, A-Z, 0-9, underscore '_', hyphen '-', period '.', and at sign '&#64;'.
     * The user name can't start with a hyphen, period, or at sign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-username)
     * @param userName A unique string that identifies a user and is associated with a `ServerId` . 
     */
    public fun userName(userName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.transfer.CfnUser.Builder =
        software.amazon.awscdk.services.transfer.CfnUser.Builder.create(scope, id)

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
     * @param homeDirectory The landing directory (folder) for a user when they log in to the server
     * using the client. 
     */
    override fun homeDirectory(homeDirectory: String) {
      cdkBuilder.homeDirectory(homeDirectory)
    }

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
     * @param homeDirectoryMappings Logical directory mappings that specify what Amazon S3 or Amazon
     * EFS paths and keys should be visible to your user and how you want to make them visible. 
     */
    override fun homeDirectoryMappings(homeDirectoryMappings: IResolvable) {
      cdkBuilder.homeDirectoryMappings(homeDirectoryMappings.let(IResolvable.Companion::unwrap))
    }

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
     * @param homeDirectoryMappings Logical directory mappings that specify what Amazon S3 or Amazon
     * EFS paths and keys should be visible to your user and how you want to make them visible. 
     */
    override fun homeDirectoryMappings(homeDirectoryMappings: List<Any>) {
      cdkBuilder.homeDirectoryMappings(homeDirectoryMappings.map{CdkObjectWrappers.unwrap(it)})
    }

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
     * @param homeDirectoryMappings Logical directory mappings that specify what Amazon S3 or Amazon
     * EFS paths and keys should be visible to your user and how you want to make them visible. 
     */
    override fun homeDirectoryMappings(vararg homeDirectoryMappings: Any): Unit =
        homeDirectoryMappings(homeDirectoryMappings.toList())

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
     * @param homeDirectoryType The type of landing directory (folder) that you want your users'
     * home directory to be when they log in to the server. 
     */
    override fun homeDirectoryType(homeDirectoryType: String) {
      cdkBuilder.homeDirectoryType(homeDirectoryType)
    }

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
     * @param policy A session policy for your user so you can use the same IAM role across multiple
     * users. 
     */
    override fun policy(policy: String) {
      cdkBuilder.policy(policy)
    }

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
     * @param posixProfile Specifies the full POSIX identity, including user ID ( `Uid` ), group ID
     * ( `Gid` ), and any secondary groups IDs ( `SecondaryGids` ), that controls your users' access to
     * your Amazon Elastic File System (Amazon EFS) file systems. 
     */
    override fun posixProfile(posixProfile: IResolvable) {
      cdkBuilder.posixProfile(posixProfile.let(IResolvable.Companion::unwrap))
    }

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
     * @param posixProfile Specifies the full POSIX identity, including user ID ( `Uid` ), group ID
     * ( `Gid` ), and any secondary groups IDs ( `SecondaryGids` ), that controls your users' access to
     * your Amazon Elastic File System (Amazon EFS) file systems. 
     */
    override fun posixProfile(posixProfile: PosixProfileProperty) {
      cdkBuilder.posixProfile(posixProfile.let(PosixProfileProperty.Companion::unwrap))
    }

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
     * @param posixProfile Specifies the full POSIX identity, including user ID ( `Uid` ), group ID
     * ( `Gid` ), and any secondary groups IDs ( `SecondaryGids` ), that controls your users' access to
     * your Amazon Elastic File System (Amazon EFS) file systems. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5007726d81f440483919b487ad7f5f371e433e8973771f56d69ef691dc88b486")
    override fun posixProfile(posixProfile: PosixProfileProperty.Builder.() -> Unit): Unit =
        posixProfile(PosixProfileProperty(posixProfile))

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
     * @param role The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM)
     * role that controls your users' access to your Amazon S3 bucket or Amazon EFS file system. 
     */
    override fun role(role: String) {
      cdkBuilder.role(role)
    }

    /**
     * A system-assigned unique identifier for a server instance.
     *
     * This is the specific server that you added your user to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-serverid)
     * @param serverId A system-assigned unique identifier for a server instance. 
     */
    override fun serverId(serverId: String) {
      cdkBuilder.serverId(serverId)
    }

    /**
     * Specifies the public key portion of the Secure Shell (SSH) keys stored for the described
     * user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-sshpublickeys)
     * @param sshPublicKeys Specifies the public key portion of the Secure Shell (SSH) keys stored
     * for the described user. 
     */
    override fun sshPublicKeys(sshPublicKeys: List<String>) {
      cdkBuilder.sshPublicKeys(sshPublicKeys)
    }

    /**
     * Specifies the public key portion of the Secure Shell (SSH) keys stored for the described
     * user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-sshpublickeys)
     * @param sshPublicKeys Specifies the public key portion of the Secure Shell (SSH) keys stored
     * for the described user. 
     */
    override fun sshPublicKeys(vararg sshPublicKeys: String): Unit =
        sshPublicKeys(sshPublicKeys.toList())

    /**
     * Key-value pairs that can be used to group and search for users.
     *
     * Tags are metadata attached to users for any purpose.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-tags)
     * @param tags Key-value pairs that can be used to group and search for users. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * Key-value pairs that can be used to group and search for users.
     *
     * Tags are metadata attached to users for any purpose.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-tags)
     * @param tags Key-value pairs that can be used to group and search for users. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * A unique string that identifies a user and is associated with a `ServerId` .
     *
     * This user name must be a minimum of 3 and a maximum of 100 characters long. The following are
     * valid characters: a-z, A-Z, 0-9, underscore '_', hyphen '-', period '.', and at sign '&#64;'.
     * The user name can't start with a hyphen, period, or at sign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-username)
     * @param userName A unique string that identifies a user and is associated with a `ServerId` . 
     */
    override fun userName(userName: String) {
      cdkBuilder.userName(userName)
    }

    public fun build(): software.amazon.awscdk.services.transfer.CfnUser = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.transfer.CfnUser.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnUser {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnUser(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnUser): CfnUser =
        CfnUser(cdkObject)

    internal fun unwrap(wrapped: CfnUser): software.amazon.awscdk.services.transfer.CfnUser =
        wrapped.cdkObject as software.amazon.awscdk.services.transfer.CfnUser
  }

  /**
   * Represents an object that contains entries and targets for `HomeDirectoryMappings` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.transfer.*;
   * HomeDirectoryMapEntryProperty homeDirectoryMapEntryProperty =
   * HomeDirectoryMapEntryProperty.builder()
   * .entry("entry")
   * .target("target")
   * // the properties below are optional
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-user-homedirectorymapentry.html)
   */
  public interface HomeDirectoryMapEntryProperty {
    /**
     * Represents an entry for `HomeDirectoryMappings` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-user-homedirectorymapentry.html#cfn-transfer-user-homedirectorymapentry-entry)
     */
    public fun entry(): String

    /**
     * Represents the map target that is used in a `HomeDirectoryMapEntry` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-user-homedirectorymapentry.html#cfn-transfer-user-homedirectorymapentry-target)
     */
    public fun target(): String

    /**
     * Specifies the type of mapping.
     *
     * Set the type to `FILE` if you want the mapping to point to a file, or `DIRECTORY` for the
     * directory to point to a directory.
     *
     *
     * By default, home directory mappings have a `Type` of `DIRECTORY` when you create a Transfer
     * Family server. You would need to explicitly set `Type` to `FILE` if you want a mapping to have a
     * file target.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-user-homedirectorymapentry.html#cfn-transfer-user-homedirectorymapentry-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * A builder for [HomeDirectoryMapEntryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param entry Represents an entry for `HomeDirectoryMappings` . 
       */
      public fun entry(entry: String)

      /**
       * @param target Represents the map target that is used in a `HomeDirectoryMapEntry` . 
       */
      public fun target(target: String)

      /**
       * @param type Specifies the type of mapping.
       * Set the type to `FILE` if you want the mapping to point to a file, or `DIRECTORY` for the
       * directory to point to a directory.
       *
       *
       * By default, home directory mappings have a `Type` of `DIRECTORY` when you create a Transfer
       * Family server. You would need to explicitly set `Type` to `FILE` if you want a mapping to have
       * a file target.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.transfer.CfnUser.HomeDirectoryMapEntryProperty.Builder =
          software.amazon.awscdk.services.transfer.CfnUser.HomeDirectoryMapEntryProperty.builder()

      /**
       * @param entry Represents an entry for `HomeDirectoryMappings` . 
       */
      override fun entry(entry: String) {
        cdkBuilder.entry(entry)
      }

      /**
       * @param target Represents the map target that is used in a `HomeDirectoryMapEntry` . 
       */
      override fun target(target: String) {
        cdkBuilder.target(target)
      }

      /**
       * @param type Specifies the type of mapping.
       * Set the type to `FILE` if you want the mapping to point to a file, or `DIRECTORY` for the
       * directory to point to a directory.
       *
       *
       * By default, home directory mappings have a `Type` of `DIRECTORY` when you create a Transfer
       * Family server. You would need to explicitly set `Type` to `FILE` if you want a mapping to have
       * a file target.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.transfer.CfnUser.HomeDirectoryMapEntryProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.transfer.CfnUser.HomeDirectoryMapEntryProperty,
    ) : CdkObject(cdkObject), HomeDirectoryMapEntryProperty {
      /**
       * Represents an entry for `HomeDirectoryMappings` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-user-homedirectorymapentry.html#cfn-transfer-user-homedirectorymapentry-entry)
       */
      override fun entry(): String = unwrap(this).getEntry()

      /**
       * Represents the map target that is used in a `HomeDirectoryMapEntry` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-user-homedirectorymapentry.html#cfn-transfer-user-homedirectorymapentry-target)
       */
      override fun target(): String = unwrap(this).getTarget()

      /**
       * Specifies the type of mapping.
       *
       * Set the type to `FILE` if you want the mapping to point to a file, or `DIRECTORY` for the
       * directory to point to a directory.
       *
       *
       * By default, home directory mappings have a `Type` of `DIRECTORY` when you create a Transfer
       * Family server. You would need to explicitly set `Type` to `FILE` if you want a mapping to have
       * a file target.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-user-homedirectorymapentry.html#cfn-transfer-user-homedirectorymapentry-type)
       */
      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HomeDirectoryMapEntryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnUser.HomeDirectoryMapEntryProperty):
          HomeDirectoryMapEntryProperty = CdkObjectWrappers.wrap(cdkObject) as?
          HomeDirectoryMapEntryProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: HomeDirectoryMapEntryProperty):
          software.amazon.awscdk.services.transfer.CfnUser.HomeDirectoryMapEntryProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.transfer.CfnUser.HomeDirectoryMapEntryProperty
    }
  }

  /**
   * The full POSIX identity, including user ID ( `Uid` ), group ID ( `Gid` ), and any secondary
   * groups IDs ( `SecondaryGids` ), that controls your users' access to your Amazon EFS file systems.
   *
   * The POSIX permissions that are set on files and directories in your file system determine the
   * level of access your users get when transferring files into and out of your Amazon EFS file
   * systems.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.transfer.*;
   * PosixProfileProperty posixProfileProperty = PosixProfileProperty.builder()
   * .gid(123)
   * .uid(123)
   * // the properties below are optional
   * .secondaryGids(List.of(123))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-user-posixprofile.html)
   */
  public interface PosixProfileProperty {
    /**
     * The POSIX group ID used for all EFS operations by this user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-user-posixprofile.html#cfn-transfer-user-posixprofile-gid)
     */
    public fun gid(): Number

    /**
     * The secondary POSIX group IDs used for all EFS operations by this user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-user-posixprofile.html#cfn-transfer-user-posixprofile-secondarygids)
     */
    public fun secondaryGids(): Any? = unwrap(this).getSecondaryGids()

    /**
     * The POSIX user ID used for all EFS operations by this user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-user-posixprofile.html#cfn-transfer-user-posixprofile-uid)
     */
    public fun uid(): Number

    /**
     * A builder for [PosixProfileProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param gid The POSIX group ID used for all EFS operations by this user. 
       */
      public fun gid(gid: Number)

      /**
       * @param secondaryGids The secondary POSIX group IDs used for all EFS operations by this
       * user.
       */
      public fun secondaryGids(secondaryGids: IResolvable)

      /**
       * @param secondaryGids The secondary POSIX group IDs used for all EFS operations by this
       * user.
       */
      public fun secondaryGids(secondaryGids: List<Number>)

      /**
       * @param secondaryGids The secondary POSIX group IDs used for all EFS operations by this
       * user.
       */
      public fun secondaryGids(vararg secondaryGids: Number)

      /**
       * @param uid The POSIX user ID used for all EFS operations by this user. 
       */
      public fun uid(uid: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.transfer.CfnUser.PosixProfileProperty.Builder =
          software.amazon.awscdk.services.transfer.CfnUser.PosixProfileProperty.builder()

      /**
       * @param gid The POSIX group ID used for all EFS operations by this user. 
       */
      override fun gid(gid: Number) {
        cdkBuilder.gid(gid)
      }

      /**
       * @param secondaryGids The secondary POSIX group IDs used for all EFS operations by this
       * user.
       */
      override fun secondaryGids(secondaryGids: IResolvable) {
        cdkBuilder.secondaryGids(secondaryGids.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param secondaryGids The secondary POSIX group IDs used for all EFS operations by this
       * user.
       */
      override fun secondaryGids(secondaryGids: List<Number>) {
        cdkBuilder.secondaryGids(secondaryGids)
      }

      /**
       * @param secondaryGids The secondary POSIX group IDs used for all EFS operations by this
       * user.
       */
      override fun secondaryGids(vararg secondaryGids: Number): Unit =
          secondaryGids(secondaryGids.toList())

      /**
       * @param uid The POSIX user ID used for all EFS operations by this user. 
       */
      override fun uid(uid: Number) {
        cdkBuilder.uid(uid)
      }

      public fun build(): software.amazon.awscdk.services.transfer.CfnUser.PosixProfileProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.transfer.CfnUser.PosixProfileProperty,
    ) : CdkObject(cdkObject), PosixProfileProperty {
      /**
       * The POSIX group ID used for all EFS operations by this user.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-user-posixprofile.html#cfn-transfer-user-posixprofile-gid)
       */
      override fun gid(): Number = unwrap(this).getGid()

      /**
       * The secondary POSIX group IDs used for all EFS operations by this user.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-user-posixprofile.html#cfn-transfer-user-posixprofile-secondarygids)
       */
      override fun secondaryGids(): Any? = unwrap(this).getSecondaryGids()

      /**
       * The POSIX user ID used for all EFS operations by this user.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-user-posixprofile.html#cfn-transfer-user-posixprofile-uid)
       */
      override fun uid(): Number = unwrap(this).getUid()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PosixProfileProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnUser.PosixProfileProperty):
          PosixProfileProperty = CdkObjectWrappers.wrap(cdkObject) as? PosixProfileProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: PosixProfileProperty):
          software.amazon.awscdk.services.transfer.CfnUser.PosixProfileProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.transfer.CfnUser.PosixProfileProperty
    }
  }
}

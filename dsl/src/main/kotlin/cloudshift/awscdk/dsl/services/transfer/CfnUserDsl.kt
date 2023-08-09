@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.transfer

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.transfer.CfnUser
import software.constructs.Construct

/**
 * The `AWS::Transfer::User` resource creates a user and associates them with an existing server.
 *
 * You can only create and associate users with servers that have the `IdentityProviderType` set to
 * `SERVICE_MANAGED` . Using parameters for `CreateUser` , you can specify the user name, set the
 * home directory, store the user's public key, and assign the user's AWS Identity and Access
 * Management (IAM) role. You can also optionally add a session policy, and assign metadata with
 * tags that can be used to group and search for users.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.transfer.*;
 * CfnUser cfnUser = CfnUser.Builder.create(this, "MyCfnUser")
 * .role("role")
 * .serverId("serverId")
 * .userName("userName")
 * // the properties below are optional
 * .homeDirectory("homeDirectory")
 * .homeDirectoryMappings(List.of(HomeDirectoryMapEntryProperty.builder()
 * .entry("entry")
 * .target("target")
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
@CdkDslMarker
public class CfnUserDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnUser.Builder = CfnUser.Builder.create(scope, id)

    private val _homeDirectoryMappings: MutableList<Any> = mutableListOf()

    private val _sshPublicKeys: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The landing directory (folder) for a user when they log in to the server using the client.
     *
     * A `HomeDirectory` example is `/bucket_name/home/mydirectory` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-homedirectory)
     *
     * @param homeDirectory The landing directory (folder) for a user when they log in to the server
     *   using the client.
     */
    public fun homeDirectory(homeDirectory: String) {
        cdkBuilder.homeDirectory(homeDirectory)
    }

    /**
     * Logical directory mappings that specify what Amazon S3 or Amazon EFS paths and keys should be
     * visible to your user and how you want to make them visible.
     *
     * You must specify the `Entry` and `Target` pair, where `Entry` shows how the path is made
     * visible and `Target` is the actual Amazon S3 or Amazon EFS path. If you only specify a
     * target, it is displayed as is. You also must ensure that your AWS Identity and Access
     * Management (IAM) role provides access to paths in `Target` . This value can be set only when
     * `HomeDirectoryType` is set to *LOGICAL* .
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
     *
     * @param homeDirectoryMappings Logical directory mappings that specify what Amazon S3 or Amazon
     *   EFS paths and keys should be visible to your user and how you want to make them visible.
     */
    public fun homeDirectoryMappings(vararg homeDirectoryMappings: Any) {
        _homeDirectoryMappings.addAll(listOf(*homeDirectoryMappings))
    }

    /**
     * Logical directory mappings that specify what Amazon S3 or Amazon EFS paths and keys should be
     * visible to your user and how you want to make them visible.
     *
     * You must specify the `Entry` and `Target` pair, where `Entry` shows how the path is made
     * visible and `Target` is the actual Amazon S3 or Amazon EFS path. If you only specify a
     * target, it is displayed as is. You also must ensure that your AWS Identity and Access
     * Management (IAM) role provides access to paths in `Target` . This value can be set only when
     * `HomeDirectoryType` is set to *LOGICAL* .
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
     *
     * @param homeDirectoryMappings Logical directory mappings that specify what Amazon S3 or Amazon
     *   EFS paths and keys should be visible to your user and how you want to make them visible.
     */
    public fun homeDirectoryMappings(homeDirectoryMappings: Collection<Any>) {
        _homeDirectoryMappings.addAll(homeDirectoryMappings)
    }

    /**
     * Logical directory mappings that specify what Amazon S3 or Amazon EFS paths and keys should be
     * visible to your user and how you want to make them visible.
     *
     * You must specify the `Entry` and `Target` pair, where `Entry` shows how the path is made
     * visible and `Target` is the actual Amazon S3 or Amazon EFS path. If you only specify a
     * target, it is displayed as is. You also must ensure that your AWS Identity and Access
     * Management (IAM) role provides access to paths in `Target` . This value can be set only when
     * `HomeDirectoryType` is set to *LOGICAL* .
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
     *
     * @param homeDirectoryMappings Logical directory mappings that specify what Amazon S3 or Amazon
     *   EFS paths and keys should be visible to your user and how you want to make them visible.
     */
    public fun homeDirectoryMappings(homeDirectoryMappings: IResolvable) {
        cdkBuilder.homeDirectoryMappings(homeDirectoryMappings)
    }

    /**
     * The type of landing directory (folder) that you want your users' home directory to be when
     * they log in to the server.
     *
     * If you set it to `PATH` , the user will see the absolute Amazon S3 bucket or EFS paths as is
     * in their file transfer protocol clients. If you set it `LOGICAL` , you need to provide
     * mappings in the `HomeDirectoryMappings` for how you want to make Amazon S3 or Amazon EFS
     * paths visible to your users.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-homedirectorytype)
     *
     * @param homeDirectoryType The type of landing directory (folder) that you want your users'
     *   home directory to be when they log in to the server.
     */
    public fun homeDirectoryType(homeDirectoryType: String) {
        cdkBuilder.homeDirectoryType(homeDirectoryType)
    }

    /**
     * A session policy for your user so you can use the same IAM role across multiple users.
     *
     * This policy restricts user access to portions of their Amazon S3 bucket. Variables that you
     * can use inside this policy include `${Transfer:UserName}` , `${Transfer:HomeDirectory}` , and
     * `${Transfer:HomeBucket}` .
     *
     * For session policies, AWS Transfer Family stores the policy as a JSON blob, instead of the
     * Amazon Resource Name (ARN) of the policy. You save the policy as a JSON blob and pass it in
     * the `Policy` argument.
     *
     * For an example of a session policy, see
     * [Example session policy](https://docs.aws.amazon.com/transfer/latest/userguide/session-policy.html)
     * .
     *
     * For more information, see
     * [AssumeRole](https://docs.aws.amazon.com/STS/latest/APIReference/API_AssumeRole.html) in the
     * *AWS Security Token Service API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-policy)
     *
     * @param policy A session policy for your user so you can use the same IAM role across multiple
     *   users.
     */
    public fun policy(policy: String) {
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
     *
     * @param posixProfile Specifies the full POSIX identity, including user ID ( `Uid` ), group ID
     *   ( `Gid` ), and any secondary groups IDs ( `SecondaryGids` ), that controls your users'
     *   access to your Amazon Elastic File System (Amazon EFS) file systems.
     */
    public fun posixProfile(posixProfile: IResolvable) {
        cdkBuilder.posixProfile(posixProfile)
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
     *
     * @param posixProfile Specifies the full POSIX identity, including user ID ( `Uid` ), group ID
     *   ( `Gid` ), and any secondary groups IDs ( `SecondaryGids` ), that controls your users'
     *   access to your Amazon Elastic File System (Amazon EFS) file systems.
     */
    public fun posixProfile(posixProfile: CfnUser.PosixProfileProperty) {
        cdkBuilder.posixProfile(posixProfile)
    }

    /**
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that
     * controls your users' access to your Amazon S3 bucket or Amazon EFS file system.
     *
     * The policies attached to this role determine the level of access that you want to provide
     * your users when transferring files into and out of your Amazon S3 bucket or Amazon EFS file
     * system. The IAM role should also contain a trust relationship that allows the server to
     * access your resources when servicing your users' transfer requests.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-role)
     *
     * @param role The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM)
     *   role that controls your users' access to your Amazon S3 bucket or Amazon EFS file system.
     */
    public fun role(role: String) {
        cdkBuilder.role(role)
    }

    /**
     * A system-assigned unique identifier for a server instance.
     *
     * This is the specific server that you added your user to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-serverid)
     *
     * @param serverId A system-assigned unique identifier for a server instance.
     */
    public fun serverId(serverId: String) {
        cdkBuilder.serverId(serverId)
    }

    /**
     * Specifies the public key portion of the Secure Shell (SSH) keys stored for the described
     * user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-sshpublickeys)
     *
     * @param sshPublicKeys Specifies the public key portion of the Secure Shell (SSH) keys stored
     *   for the described user.
     */
    public fun sshPublicKeys(vararg sshPublicKeys: String) {
        _sshPublicKeys.addAll(listOf(*sshPublicKeys))
    }

    /**
     * Specifies the public key portion of the Secure Shell (SSH) keys stored for the described
     * user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-sshpublickeys)
     *
     * @param sshPublicKeys Specifies the public key portion of the Secure Shell (SSH) keys stored
     *   for the described user.
     */
    public fun sshPublicKeys(sshPublicKeys: Collection<String>) {
        _sshPublicKeys.addAll(sshPublicKeys)
    }

    /**
     * Key-value pairs that can be used to group and search for users.
     *
     * Tags are metadata attached to users for any purpose.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-tags)
     *
     * @param tags Key-value pairs that can be used to group and search for users.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * Key-value pairs that can be used to group and search for users.
     *
     * Tags are metadata attached to users for any purpose.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-tags)
     *
     * @param tags Key-value pairs that can be used to group and search for users.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * A unique string that identifies a user and is associated with a `ServerId` .
     *
     * This user name must be a minimum of 3 and a maximum of 100 characters long. The following are
     * valid characters: a-z, A-Z, 0-9, underscore '_', hyphen '-', period '.', and at sign '&#64;'.
     * The user name can't start with a hyphen, period, or at sign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-username)
     *
     * @param userName A unique string that identifies a user and is associated with a `ServerId` .
     */
    public fun userName(userName: String) {
        cdkBuilder.userName(userName)
    }

    public fun build(): CfnUser {
        if (_homeDirectoryMappings.isNotEmpty())
            cdkBuilder.homeDirectoryMappings(_homeDirectoryMappings)
        if (_sshPublicKeys.isNotEmpty()) cdkBuilder.sshPublicKeys(_sshPublicKeys)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}

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

package io.cloudshiftdev.awscdkdsl.services.transfer

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.transfer.CfnUser
import software.amazon.awscdk.services.transfer.CfnUserProps

/**
 * Properties for defining a `CfnUser`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.transfer.*;
 * CfnUserProps cfnUserProps = CfnUserProps.builder()
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
public class CfnUserPropsDsl {
    private val cdkBuilder: CfnUserProps.Builder = CfnUserProps.builder()

    private val _homeDirectoryMappings: MutableList<Any> = mutableListOf()

    private val _sshPublicKeys: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param homeDirectory The landing directory (folder) for a user when they log in to the server
     *   using the client. A `HomeDirectory` example is `/bucket_name/home/mydirectory` .
     */
    public fun homeDirectory(homeDirectory: String) {
        cdkBuilder.homeDirectory(homeDirectory)
    }

    /**
     * @param homeDirectoryMappings Logical directory mappings that specify what Amazon S3 or Amazon
     *   EFS paths and keys should be visible to your user and how you want to make them visible.
     *   You must specify the `Entry` and `Target` pair, where `Entry` shows how the path is made
     *   visible and `Target` is the actual Amazon S3 or Amazon EFS path. If you only specify a
     *   target, it is displayed as is. You also must ensure that your AWS Identity and Access
     *   Management (IAM) role provides access to paths in `Target` . This value can be set only
     *   when `HomeDirectoryType` is set to *LOGICAL* .
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
    public fun homeDirectoryMappings(vararg homeDirectoryMappings: Any) {
        _homeDirectoryMappings.addAll(listOf(*homeDirectoryMappings))
    }

    /**
     * @param homeDirectoryMappings Logical directory mappings that specify what Amazon S3 or Amazon
     *   EFS paths and keys should be visible to your user and how you want to make them visible.
     *   You must specify the `Entry` and `Target` pair, where `Entry` shows how the path is made
     *   visible and `Target` is the actual Amazon S3 or Amazon EFS path. If you only specify a
     *   target, it is displayed as is. You also must ensure that your AWS Identity and Access
     *   Management (IAM) role provides access to paths in `Target` . This value can be set only
     *   when `HomeDirectoryType` is set to *LOGICAL* .
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
    public fun homeDirectoryMappings(homeDirectoryMappings: Collection<Any>) {
        _homeDirectoryMappings.addAll(homeDirectoryMappings)
    }

    /**
     * @param homeDirectoryMappings Logical directory mappings that specify what Amazon S3 or Amazon
     *   EFS paths and keys should be visible to your user and how you want to make them visible.
     *   You must specify the `Entry` and `Target` pair, where `Entry` shows how the path is made
     *   visible and `Target` is the actual Amazon S3 or Amazon EFS path. If you only specify a
     *   target, it is displayed as is. You also must ensure that your AWS Identity and Access
     *   Management (IAM) role provides access to paths in `Target` . This value can be set only
     *   when `HomeDirectoryType` is set to *LOGICAL* .
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
    public fun homeDirectoryMappings(homeDirectoryMappings: IResolvable) {
        cdkBuilder.homeDirectoryMappings(homeDirectoryMappings)
    }

    /**
     * @param homeDirectoryType The type of landing directory (folder) that you want your users'
     *   home directory to be when they log in to the server. If you set it to `PATH` , the user
     *   will see the absolute Amazon S3 bucket or EFS paths as is in their file transfer protocol
     *   clients. If you set it `LOGICAL` , you need to provide mappings in the
     *   `HomeDirectoryMappings` for how you want to make Amazon S3 or Amazon EFS paths visible to
     *   your users.
     */
    public fun homeDirectoryType(homeDirectoryType: String) {
        cdkBuilder.homeDirectoryType(homeDirectoryType)
    }

    /**
     * @param policy A session policy for your user so you can use the same IAM role across multiple
     *   users. This policy restricts user access to portions of their Amazon S3 bucket. Variables
     *   that you can use inside this policy include `${Transfer:UserName}` ,
     *   `${Transfer:HomeDirectory}` , and `${Transfer:HomeBucket}` .
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
     */
    public fun policy(policy: String) {
        cdkBuilder.policy(policy)
    }

    /**
     * @param posixProfile Specifies the full POSIX identity, including user ID ( `Uid` ), group ID
     *   ( `Gid` ), and any secondary groups IDs ( `SecondaryGids` ), that controls your users'
     *   access to your Amazon Elastic File System (Amazon EFS) file systems. The POSIX permissions
     *   that are set on files and directories in your file system determine the level of access
     *   your users get when transferring files into and out of your Amazon EFS file systems.
     */
    public fun posixProfile(posixProfile: IResolvable) {
        cdkBuilder.posixProfile(posixProfile)
    }

    /**
     * @param posixProfile Specifies the full POSIX identity, including user ID ( `Uid` ), group ID
     *   ( `Gid` ), and any secondary groups IDs ( `SecondaryGids` ), that controls your users'
     *   access to your Amazon Elastic File System (Amazon EFS) file systems. The POSIX permissions
     *   that are set on files and directories in your file system determine the level of access
     *   your users get when transferring files into and out of your Amazon EFS file systems.
     */
    public fun posixProfile(posixProfile: CfnUser.PosixProfileProperty) {
        cdkBuilder.posixProfile(posixProfile)
    }

    /**
     * @param role The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM)
     *   role that controls your users' access to your Amazon S3 bucket or Amazon EFS file system.
     *   The policies attached to this role determine the level of access that you want to provide
     *   your users when transferring files into and out of your Amazon S3 bucket or Amazon EFS file
     *   system. The IAM role should also contain a trust relationship that allows the server to
     *   access your resources when servicing your users' transfer requests.
     */
    public fun role(role: String) {
        cdkBuilder.role(role)
    }

    /**
     * @param serverId A system-assigned unique identifier for a server instance. This is the
     *   specific server that you added your user to.
     */
    public fun serverId(serverId: String) {
        cdkBuilder.serverId(serverId)
    }

    /**
     * @param sshPublicKeys Specifies the public key portion of the Secure Shell (SSH) keys stored
     *   for the described user.
     */
    public fun sshPublicKeys(vararg sshPublicKeys: String) {
        _sshPublicKeys.addAll(listOf(*sshPublicKeys))
    }

    /**
     * @param sshPublicKeys Specifies the public key portion of the Secure Shell (SSH) keys stored
     *   for the described user.
     */
    public fun sshPublicKeys(sshPublicKeys: Collection<String>) {
        _sshPublicKeys.addAll(sshPublicKeys)
    }

    /**
     * @param tags Key-value pairs that can be used to group and search for users. Tags are metadata
     *   attached to users for any purpose.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags Key-value pairs that can be used to group and search for users. Tags are metadata
     *   attached to users for any purpose.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param userName A unique string that identifies a user and is associated with a `ServerId` .
     *   This user name must be a minimum of 3 and a maximum of 100 characters long. The following
     *   are valid characters: a-z, A-Z, 0-9, underscore '_', hyphen '-', period '.', and at sign
     *   '&#64;'. The user name can't start with a hyphen, period, or at sign.
     */
    public fun userName(userName: String) {
        cdkBuilder.userName(userName)
    }

    public fun build(): CfnUserProps {
        if (_homeDirectoryMappings.isNotEmpty())
            cdkBuilder.homeDirectoryMappings(_homeDirectoryMappings)
        if (_sshPublicKeys.isNotEmpty()) cdkBuilder.sshPublicKeys(_sshPublicKeys)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}

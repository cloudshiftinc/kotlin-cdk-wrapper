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

package cloudshift.awscdk.dsl.services.datasync

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.datasync.CfnLocationFSxWindowsProps

/**
 * Properties for defining a `CfnLocationFSxWindows`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datasync.*;
 * CfnLocationFSxWindowsProps cfnLocationFSxWindowsProps = CfnLocationFSxWindowsProps.builder()
 * .securityGroupArns(List.of("securityGroupArns"))
 * .user("user")
 * // the properties below are optional
 * .domain("domain")
 * .fsxFilesystemArn("fsxFilesystemArn")
 * .password("password")
 * .subdirectory("subdirectory")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxwindows.html)
 */
@CdkDslMarker
public class CfnLocationFSxWindowsPropsDsl {
    private val cdkBuilder: CfnLocationFSxWindowsProps.Builder =
        CfnLocationFSxWindowsProps.builder()

    private val _securityGroupArns: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param domain Specifies the name of the Windows domain that the FSx for Windows File Server
     *   belongs to.
     */
    public fun domain(domain: String) {
        cdkBuilder.domain(domain)
    }

    /**
     * @param fsxFilesystemArn Specifies the Amazon Resource Name (ARN) for the FSx for Windows File
     *   Server file system.
     */
    public fun fsxFilesystemArn(fsxFilesystemArn: String) {
        cdkBuilder.fsxFilesystemArn(fsxFilesystemArn)
    }

    /**
     * @param password Specifies the password of the user who has the permissions to access files
     *   and folders in the file system.
     */
    public fun password(password: String) {
        cdkBuilder.password(password)
    }

    /**
     * @param securityGroupArns The Amazon Resource Names (ARNs) of the security groups that are
     *   used to configure the FSx for Windows File Server file system. *Pattern* :
     *   `^arn:(aws|aws-cn|aws-us-gov|aws-iso|aws-iso-b):ec2:[a-z\-0-9]*:[0-9]{12}:security-group/.*$`
     *
     * *Length constraints* : Maximum length of 128.
     */
    public fun securityGroupArns(vararg securityGroupArns: String) {
        _securityGroupArns.addAll(listOf(*securityGroupArns))
    }

    /**
     * @param securityGroupArns The Amazon Resource Names (ARNs) of the security groups that are
     *   used to configure the FSx for Windows File Server file system. *Pattern* :
     *   `^arn:(aws|aws-cn|aws-us-gov|aws-iso|aws-iso-b):ec2:[a-z\-0-9]*:[0-9]{12}:security-group/.*$`
     *
     * *Length constraints* : Maximum length of 128.
     */
    public fun securityGroupArns(securityGroupArns: Collection<String>) {
        _securityGroupArns.addAll(securityGroupArns)
    }

    /**
     * @param subdirectory Specifies a mount path for your file system using forward slashes. This
     *   is where DataSync reads or writes data (depending on if this is a source or destination
     *   location).
     */
    public fun subdirectory(subdirectory: String) {
        cdkBuilder.subdirectory(subdirectory)
    }

    /**
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     *   resources. We recommend creating at least a name tag for your location.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     *   resources. We recommend creating at least a name tag for your location.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param user The user who has the permissions to access files and folders in the FSx for
     *   Windows File Server file system. For information about choosing a user name that ensures
     *   sufficient permissions to files, folders, and metadata, see
     *   [user](https://docs.aws.amazon.com/datasync/latest/userguide/create-fsx-location.html#FSxWuser)
     *   .
     */
    public fun user(user: String) {
        cdkBuilder.user(user)
    }

    public fun build(): CfnLocationFSxWindowsProps {
        if (_securityGroupArns.isNotEmpty()) cdkBuilder.securityGroupArns(_securityGroupArns)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}

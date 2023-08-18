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

package io.cloudshiftdev.awscdkdsl.services.datasync

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.datasync.CfnLocationFSxWindows
import software.constructs.Construct

/**
 * The `AWS::DataSync::LocationFSxWindows` resource specifies an endpoint for an Amazon FSx for
 * Windows Server file system.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datasync.*;
 * CfnLocationFSxWindows cfnLocationFSxWindows = CfnLocationFSxWindows.Builder.create(this,
 * "MyCfnLocationFSxWindows")
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
public class CfnLocationFSxWindowsDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnLocationFSxWindows.Builder =
        CfnLocationFSxWindows.Builder.create(scope, id)

    private val _securityGroupArns: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * Specifies the name of the Windows domain that the FSx for Windows File Server belongs to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxwindows.html#cfn-datasync-locationfsxwindows-domain)
     *
     * @param domain Specifies the name of the Windows domain that the FSx for Windows File Server
     *   belongs to.
     */
    public fun domain(domain: String) {
        cdkBuilder.domain(domain)
    }

    /**
     * Specifies the Amazon Resource Name (ARN) for the FSx for Windows File Server file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxwindows.html#cfn-datasync-locationfsxwindows-fsxfilesystemarn)
     *
     * @param fsxFilesystemArn Specifies the Amazon Resource Name (ARN) for the FSx for Windows File
     *   Server file system.
     */
    public fun fsxFilesystemArn(fsxFilesystemArn: String) {
        cdkBuilder.fsxFilesystemArn(fsxFilesystemArn)
    }

    /**
     * Specifies the password of the user who has the permissions to access files and folders in the
     * file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxwindows.html#cfn-datasync-locationfsxwindows-password)
     *
     * @param password Specifies the password of the user who has the permissions to access files
     *   and folders in the file system.
     */
    public fun password(password: String) {
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
     *
     * @param securityGroupArns The Amazon Resource Names (ARNs) of the security groups that are
     *   used to configure the FSx for Windows File Server file system.
     */
    public fun securityGroupArns(vararg securityGroupArns: String) {
        _securityGroupArns.addAll(listOf(*securityGroupArns))
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
     *
     * @param securityGroupArns The Amazon Resource Names (ARNs) of the security groups that are
     *   used to configure the FSx for Windows File Server file system.
     */
    public fun securityGroupArns(securityGroupArns: Collection<String>) {
        _securityGroupArns.addAll(securityGroupArns)
    }

    /**
     * Specifies a mount path for your file system using forward slashes.
     *
     * This is where DataSync reads or writes data (depending on if this is a source or destination
     * location).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxwindows.html#cfn-datasync-locationfsxwindows-subdirectory)
     *
     * @param subdirectory Specifies a mount path for your file system using forward slashes.
     */
    public fun subdirectory(subdirectory: String) {
        cdkBuilder.subdirectory(subdirectory)
    }

    /**
     * Specifies labels that help you categorize, filter, and search for your AWS resources.
     *
     * We recommend creating at least a name tag for your location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxwindows.html#cfn-datasync-locationfsxwindows-tags)
     *
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     *   resources.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * Specifies labels that help you categorize, filter, and search for your AWS resources.
     *
     * We recommend creating at least a name tag for your location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxwindows.html#cfn-datasync-locationfsxwindows-tags)
     *
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     *   resources.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

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
     *
     * @param user The user who has the permissions to access files and folders in the FSx for
     *   Windows File Server file system.
     */
    public fun user(user: String) {
        cdkBuilder.user(user)
    }

    public fun build(): CfnLocationFSxWindows {
        if (_securityGroupArns.isNotEmpty()) cdkBuilder.securityGroupArns(_securityGroupArns)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}

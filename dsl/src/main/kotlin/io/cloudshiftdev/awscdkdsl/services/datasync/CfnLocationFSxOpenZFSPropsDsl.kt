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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS
import software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFSProps

/**
 * Properties for defining a `CfnLocationFSxOpenZFS`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datasync.*;
 * CfnLocationFSxOpenZFSProps cfnLocationFSxOpenZFSProps = CfnLocationFSxOpenZFSProps.builder()
 * .protocol(ProtocolProperty.builder()
 * .nfs(NFSProperty.builder()
 * .mountOptions(MountOptionsProperty.builder()
 * .version("version")
 * .build())
 * .build())
 * .build())
 * .securityGroupArns(List.of("securityGroupArns"))
 * // the properties below are optional
 * .fsxFilesystemArn("fsxFilesystemArn")
 * .subdirectory("subdirectory")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxopenzfs.html)
 */
@CdkDslMarker
public class CfnLocationFSxOpenZFSPropsDsl {
    private val cdkBuilder: CfnLocationFSxOpenZFSProps.Builder =
        CfnLocationFSxOpenZFSProps.builder()

    private val _securityGroupArns: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param fsxFilesystemArn The Amazon Resource Name (ARN) of the FSx for OpenZFS file system.
     */
    public fun fsxFilesystemArn(fsxFilesystemArn: String) {
        cdkBuilder.fsxFilesystemArn(fsxFilesystemArn)
    }

    /** @param protocol The type of protocol that AWS DataSync uses to access your file system. */
    public fun protocol(protocol: IResolvable) {
        cdkBuilder.protocol(protocol)
    }

    /** @param protocol The type of protocol that AWS DataSync uses to access your file system. */
    public fun protocol(protocol: CfnLocationFSxOpenZFS.ProtocolProperty) {
        cdkBuilder.protocol(protocol)
    }

    /**
     * @param securityGroupArns The ARNs of the security groups that are used to configure the FSx
     *   for OpenZFS file system. *Pattern* :
     *   `^arn:(aws|aws-cn|aws-us-gov|aws-iso|aws-iso-b):ec2:[a-z\-0-9]*:[0-9]{12}:security-group/.*$`
     *
     * *Length constraints* : Maximum length of 128.
     */
    public fun securityGroupArns(vararg securityGroupArns: String) {
        _securityGroupArns.addAll(listOf(*securityGroupArns))
    }

    /**
     * @param securityGroupArns The ARNs of the security groups that are used to configure the FSx
     *   for OpenZFS file system. *Pattern* :
     *   `^arn:(aws|aws-cn|aws-us-gov|aws-iso|aws-iso-b):ec2:[a-z\-0-9]*:[0-9]{12}:security-group/.*$`
     *
     * *Length constraints* : Maximum length of 128.
     */
    public fun securityGroupArns(securityGroupArns: Collection<String>) {
        _securityGroupArns.addAll(securityGroupArns)
    }

    /**
     * @param subdirectory A subdirectory in the location's path that must begin with `/fsx` .
     *   DataSync uses this subdirectory to read or write data (depending on whether the file system
     *   is a source or destination location).
     */
    public fun subdirectory(subdirectory: String) {
        cdkBuilder.subdirectory(subdirectory)
    }

    /**
     * @param tags The key-value pair that represents a tag that you want to add to the resource.
     *   The value can be an empty string. This value helps you manage, filter, and search for your
     *   resources. We recommend that you create a name tag for your location.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags The key-value pair that represents a tag that you want to add to the resource.
     *   The value can be an empty string. This value helps you manage, filter, and search for your
     *   resources. We recommend that you create a name tag for your location.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnLocationFSxOpenZFSProps {
        if (_securityGroupArns.isNotEmpty()) cdkBuilder.securityGroupArns(_securityGroupArns)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}

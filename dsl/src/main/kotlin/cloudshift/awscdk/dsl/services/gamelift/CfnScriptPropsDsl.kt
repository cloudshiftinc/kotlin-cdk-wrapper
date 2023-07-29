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

package cloudshift.awscdk.dsl.services.gamelift

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.gamelift.CfnScript
import software.amazon.awscdk.services.gamelift.CfnScriptProps

/**
 * Properties for defining a `CfnScript`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.gamelift.*;
 * CfnScriptProps cfnScriptProps = CfnScriptProps.builder()
 * .storageLocation(S3LocationProperty.builder()
 * .bucket("bucket")
 * .key("key")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .objectVersion("objectVersion")
 * .build())
 * // the properties below are optional
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .version("version")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-script.html)
 */
@CdkDslMarker
public class CfnScriptPropsDsl {
    private val cdkBuilder: CfnScriptProps.Builder = CfnScriptProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param name A descriptive label that is associated with a script. Script names do not need to
     *   be unique.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param storageLocation The location of the Amazon S3 bucket where a zipped file containing
     *   your Realtime scripts is stored. The storage location must specify the Amazon S3 bucket
     *   name, the zip file name (the "key"), and a role ARN that allows Amazon GameLift to access
     *   the Amazon S3 storage location. The S3 bucket must be in the same Region where you want to
     *   create a new script. By default, Amazon GameLift uploads the latest version of the zip
     *   file; if you have S3 object versioning turned on, you can use the `ObjectVersion` parameter
     *   to specify an earlier version.
     */
    public fun storageLocation(storageLocation: IResolvable) {
        cdkBuilder.storageLocation(storageLocation)
    }

    /**
     * @param storageLocation The location of the Amazon S3 bucket where a zipped file containing
     *   your Realtime scripts is stored. The storage location must specify the Amazon S3 bucket
     *   name, the zip file name (the "key"), and a role ARN that allows Amazon GameLift to access
     *   the Amazon S3 storage location. The S3 bucket must be in the same Region where you want to
     *   create a new script. By default, Amazon GameLift uploads the latest version of the zip
     *   file; if you have S3 object versioning turned on, you can use the `ObjectVersion` parameter
     *   to specify an earlier version.
     */
    public fun storageLocation(storageLocation: CfnScript.S3LocationProperty) {
        cdkBuilder.storageLocation(storageLocation)
    }

    /**
     * @param tags A list of labels to assign to the new script resource. Tags are developer-defined
     *   key-value pairs. Tagging AWS resources are useful for resource management, access
     *   management and cost allocation. For more information, see
     *   [Tagging AWS Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in
     *   the *AWS General Reference* . Once the resource is created, you can use TagResource,
     *   UntagResource, and ListTagsForResource to add, remove, and view tags. The maximum tag limit
     *   may be lower than stated. See the AWS General Reference for actual tagging limits.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags A list of labels to assign to the new script resource. Tags are developer-defined
     *   key-value pairs. Tagging AWS resources are useful for resource management, access
     *   management and cost allocation. For more information, see
     *   [Tagging AWS Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in
     *   the *AWS General Reference* . Once the resource is created, you can use TagResource,
     *   UntagResource, and ListTagsForResource to add, remove, and view tags. The maximum tag limit
     *   may be lower than stated. See the AWS General Reference for actual tagging limits.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param version The version that is associated with a build or script. Version strings do not
     *   need to be unique.
     */
    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    public fun build(): CfnScriptProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}

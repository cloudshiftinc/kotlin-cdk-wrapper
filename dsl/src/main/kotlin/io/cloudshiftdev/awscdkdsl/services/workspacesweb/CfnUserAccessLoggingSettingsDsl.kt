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

package io.cloudshiftdev.awscdkdsl.services.workspacesweb

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.workspacesweb.CfnUserAccessLoggingSettings
import software.constructs.Construct

/**
 * This resource specifies user access logging settings that can be associated with a web portal.
 *
 * In order to receive logs from WorkSpaces Web, you must have an Amazon Kinesis Data Stream that
 * starts with "amazon-workspaces-web-*". Your Amazon Kinesis data stream must either have
 * server-side encryption turned off, or must use AWS managed keys for server-side encryption.
 *
 * For more information about setting server-side encryption in Amazon Kinesis , see
 * [How Do I Get Started with Server-Side Encryption?](https://docs.aws.amazon.com/streams/latest/dev/getting-started-with-sse.html)
 * .
 *
 * For more information about setting up user access logging, see
 * [Set up user access logging](https://docs.aws.amazon.com/workspaces-web/latest/adminguide/user-logging.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.workspacesweb.*;
 * CfnUserAccessLoggingSettings cfnUserAccessLoggingSettings =
 * CfnUserAccessLoggingSettings.Builder.create(this, "MyCfnUserAccessLoggingSettings")
 * .kinesisStreamArn("kinesisStreamArn")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-useraccessloggingsettings.html)
 */
@CdkDslMarker
public class CfnUserAccessLoggingSettingsDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnUserAccessLoggingSettings.Builder =
        CfnUserAccessLoggingSettings.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The ARN of the Kinesis stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-useraccessloggingsettings.html#cfn-workspacesweb-useraccessloggingsettings-kinesisstreamarn)
     *
     * @param kinesisStreamArn The ARN of the Kinesis stream.
     */
    public fun kinesisStreamArn(kinesisStreamArn: String) {
        cdkBuilder.kinesisStreamArn(kinesisStreamArn)
    }

    /**
     * The tags to add to the user access logging settings resource.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-useraccessloggingsettings.html#cfn-workspacesweb-useraccessloggingsettings-tags)
     *
     * @param tags The tags to add to the user access logging settings resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags to add to the user access logging settings resource.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-useraccessloggingsettings.html#cfn-workspacesweb-useraccessloggingsettings-tags)
     *
     * @param tags The tags to add to the user access logging settings resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnUserAccessLoggingSettings {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}

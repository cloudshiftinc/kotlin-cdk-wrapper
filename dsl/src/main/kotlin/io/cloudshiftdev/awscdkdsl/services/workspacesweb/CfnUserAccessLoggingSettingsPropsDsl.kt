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
import software.amazon.awscdk.services.workspacesweb.CfnUserAccessLoggingSettingsProps

/**
 * Properties for defining a `CfnUserAccessLoggingSettings`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.workspacesweb.*;
 * CfnUserAccessLoggingSettingsProps cfnUserAccessLoggingSettingsProps =
 * CfnUserAccessLoggingSettingsProps.builder()
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
public class CfnUserAccessLoggingSettingsPropsDsl {
    private val cdkBuilder: CfnUserAccessLoggingSettingsProps.Builder =
        CfnUserAccessLoggingSettingsProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param kinesisStreamArn The ARN of the Kinesis stream. */
    public fun kinesisStreamArn(kinesisStreamArn: String) {
        cdkBuilder.kinesisStreamArn(kinesisStreamArn)
    }

    /**
     * @param tags The tags to add to the user access logging settings resource. A tag is a
     *   key-value pair.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags The tags to add to the user access logging settings resource. A tag is a
     *   key-value pair.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnUserAccessLoggingSettingsProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}

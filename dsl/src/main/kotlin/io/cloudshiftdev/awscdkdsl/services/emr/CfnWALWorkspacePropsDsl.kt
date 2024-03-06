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

package io.cloudshiftdev.awscdkdsl.services.emr

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.emr.CfnWALWorkspaceProps

/**
 * Properties for defining a `CfnWALWorkspace`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.emr.*;
 * CfnWALWorkspaceProps cfnWALWorkspaceProps = CfnWALWorkspaceProps.builder()
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .walWorkspaceName("walWorkspaceName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-walworkspace.html)
 */
@CdkDslMarker
public class CfnWALWorkspacePropsDsl {
    private val cdkBuilder: CfnWALWorkspaceProps.Builder = CfnWALWorkspaceProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param tags You can add tags when you create a new workspace. You can add, remove, or list
     *   tags from an active workspace, but you can't update tags. Instead, remove the tag and add a
     *   new one. For more information, see see
     *   [Tag your Amazon EMR WAL workspaces](https://docs.aws.amazon.com/emr/latest/ReleaseGuide/emr-hbase-wal.html#emr-hbase-wal-tagging)
     *   .
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags You can add tags when you create a new workspace. You can add, remove, or list
     *   tags from an active workspace, but you can't update tags. Instead, remove the tag and add a
     *   new one. For more information, see see
     *   [Tag your Amazon EMR WAL workspaces](https://docs.aws.amazon.com/emr/latest/ReleaseGuide/emr-hbase-wal.html#emr-hbase-wal-tagging)
     *   .
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /** @param walWorkspaceName The name of the WAL workspace. */
    public fun walWorkspaceName(walWorkspaceName: String) {
        cdkBuilder.walWorkspaceName(walWorkspaceName)
    }

    public fun build(): CfnWALWorkspaceProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}

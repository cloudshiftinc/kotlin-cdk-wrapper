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
import software.amazon.awscdk.services.emr.CfnWALWorkspace
import software.constructs.Construct

/**
 * A WAL workspace is a logical container of write-ahead logs (WALs).
 *
 * All WALs in Amazon EMR WAL are encapsulated by a WAL workspace.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.emr.*;
 * CfnWALWorkspace cfnWALWorkspace = CfnWALWorkspace.Builder.create(this, "MyCfnWALWorkspace")
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
public class CfnWALWorkspaceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnWALWorkspace.Builder = CfnWALWorkspace.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * You can add tags when you create a new workspace.
     *
     * You can add, remove, or list tags from an active workspace, but you can't update tags.
     * Instead, remove the tag and add a new one. For more information, see see
     * [Tag your Amazon EMR WAL workspaces](https://docs.aws.amazon.com/emr/latest/ReleaseGuide/emr-hbase-wal.html#emr-hbase-wal-tagging)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-walworkspace.html#cfn-emr-walworkspace-tags)
     *
     * @param tags You can add tags when you create a new workspace.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * You can add tags when you create a new workspace.
     *
     * You can add, remove, or list tags from an active workspace, but you can't update tags.
     * Instead, remove the tag and add a new one. For more information, see see
     * [Tag your Amazon EMR WAL workspaces](https://docs.aws.amazon.com/emr/latest/ReleaseGuide/emr-hbase-wal.html#emr-hbase-wal-tagging)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-walworkspace.html#cfn-emr-walworkspace-tags)
     *
     * @param tags You can add tags when you create a new workspace.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The name of the WAL workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-walworkspace.html#cfn-emr-walworkspace-walworkspacename)
     *
     * @param walWorkspaceName The name of the WAL workspace.
     */
    public fun walWorkspaceName(walWorkspaceName: String) {
        cdkBuilder.walWorkspaceName(walWorkspaceName)
    }

    public fun build(): CfnWALWorkspace {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}

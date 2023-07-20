@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.redshiftserverless

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.redshiftserverless.CfnNamespaceProps
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnNamespacePropsDsl {
    private val cdkBuilder: CfnNamespaceProps.Builder = CfnNamespaceProps.builder()

    private val _iamRoles: MutableList<String> = mutableListOf()

    private val _logExports: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun adminUserPassword(adminUserPassword: String) {
        cdkBuilder.adminUserPassword(adminUserPassword)
    }

    public fun adminUsername(adminUsername: String) {
        cdkBuilder.adminUsername(adminUsername)
    }

    public fun dbName(dbName: String) {
        cdkBuilder.dbName(dbName)
    }

    public fun defaultIamRoleArn(defaultIamRoleArn: String) {
        cdkBuilder.defaultIamRoleArn(defaultIamRoleArn)
    }

    public fun finalSnapshotName(finalSnapshotName: String) {
        cdkBuilder.finalSnapshotName(finalSnapshotName)
    }

    public fun finalSnapshotRetentionPeriod(finalSnapshotRetentionPeriod: Number) {
        cdkBuilder.finalSnapshotRetentionPeriod(finalSnapshotRetentionPeriod)
    }

    public fun iamRoles(vararg iamRoles: String) {
        _iamRoles.addAll(listOf(*iamRoles))
    }

    public fun iamRoles(iamRoles: Collection<String>) {
        _iamRoles.addAll(iamRoles)
    }

    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    public fun logExports(vararg logExports: String) {
        _logExports.addAll(listOf(*logExports))
    }

    public fun logExports(logExports: Collection<String>) {
        _logExports.addAll(logExports)
    }

    public fun namespaceName(namespaceName: String) {
        cdkBuilder.namespaceName(namespaceName)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnNamespaceProps {
        if (_iamRoles.isNotEmpty()) cdkBuilder.iamRoles(_iamRoles)
        if (_logExports.isNotEmpty()) cdkBuilder.logExports(_logExports)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}

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

package cloudshift.awscdk.dsl.services.redshiftserverless

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.redshiftserverless.CfnNamespaceProps

/**
 * Properties for defining a `CfnNamespace`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.redshiftserverless.*;
 * CfnNamespaceProps cfnNamespaceProps = CfnNamespaceProps.builder()
 * .namespaceName("namespaceName")
 * // the properties below are optional
 * .adminUsername("adminUsername")
 * .adminUserPassword("adminUserPassword")
 * .dbName("dbName")
 * .defaultIamRoleArn("defaultIamRoleArn")
 * .finalSnapshotName("finalSnapshotName")
 * .finalSnapshotRetentionPeriod(123)
 * .iamRoles(List.of("iamRoles"))
 * .kmsKeyId("kmsKeyId")
 * .logExports(List.of("logExports"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html)
 */
@CdkDslMarker
public class CfnNamespacePropsDsl {
    private val cdkBuilder: CfnNamespaceProps.Builder = CfnNamespaceProps.builder()

    private val _iamRoles: MutableList<String> = mutableListOf()

    private val _logExports: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param adminUserPassword The password of the administrator for the primary database created
     *   in the namespace.
     */
    public fun adminUserPassword(adminUserPassword: String) {
        cdkBuilder.adminUserPassword(adminUserPassword)
    }

    /**
     * @param adminUsername The username of the administrator for the primary database created in
     *   the namespace.
     */
    public fun adminUsername(adminUsername: String) {
        cdkBuilder.adminUsername(adminUsername)
    }

    /** @param dbName The name of the primary database created in the namespace. */
    public fun dbName(dbName: String) {
        cdkBuilder.dbName(dbName)
    }

    /**
     * @param defaultIamRoleArn The Amazon Resource Name (ARN) of the IAM role to set as a default
     *   in the namespace.
     */
    public fun defaultIamRoleArn(defaultIamRoleArn: String) {
        cdkBuilder.defaultIamRoleArn(defaultIamRoleArn)
    }

    /**
     * @param finalSnapshotName The name of the snapshot to be created before the namespace is
     *   deleted.
     */
    public fun finalSnapshotName(finalSnapshotName: String) {
        cdkBuilder.finalSnapshotName(finalSnapshotName)
    }

    /** @param finalSnapshotRetentionPeriod How long to retain the final snapshot. */
    public fun finalSnapshotRetentionPeriod(finalSnapshotRetentionPeriod: Number) {
        cdkBuilder.finalSnapshotRetentionPeriod(finalSnapshotRetentionPeriod)
    }

    /** @param iamRoles A list of IAM roles to associate with the namespace. */
    public fun iamRoles(vararg iamRoles: String) {
        _iamRoles.addAll(listOf(*iamRoles))
    }

    /** @param iamRoles A list of IAM roles to associate with the namespace. */
    public fun iamRoles(iamRoles: Collection<String>) {
        _iamRoles.addAll(iamRoles)
    }

    /** @param kmsKeyId The ID of the AWS Key Management Service key used to encrypt your data. */
    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param logExports The types of logs the namespace can export. Available export types are
     *   `userlog` , `connectionlog` , and `useractivitylog` .
     */
    public fun logExports(vararg logExports: String) {
        _logExports.addAll(listOf(*logExports))
    }

    /**
     * @param logExports The types of logs the namespace can export. Available export types are
     *   `userlog` , `connectionlog` , and `useractivitylog` .
     */
    public fun logExports(logExports: Collection<String>) {
        _logExports.addAll(logExports)
    }

    /**
     * @param namespaceName The name of the namespace. Must be between 3-64 alphanumeric characters
     *   in lowercase, and it cannot be a reserved word. A list of reserved words can be found in
     *   [Reserved Words](https://docs.aws.amazon.com//redshift/latest/dg/r_pg_keywords.html) in the
     *   Amazon Redshift Database Developer Guide.
     */
    public fun namespaceName(namespaceName: String) {
        cdkBuilder.namespaceName(namespaceName)
    }

    /** @param tags The map of the key-value pairs used to tag the namespace. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The map of the key-value pairs used to tag the namespace. */
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

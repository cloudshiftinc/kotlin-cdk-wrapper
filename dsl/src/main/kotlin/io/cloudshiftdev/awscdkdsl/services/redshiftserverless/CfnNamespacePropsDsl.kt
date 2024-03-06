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

package io.cloudshiftdev.awscdkdsl.services.redshiftserverless

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.redshiftserverless.CfnNamespaceProps

/**
 * Properties for defining a `CfnNamespace`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.redshiftserverless.*;
 * Object namespaceResourcePolicy;
 * CfnNamespaceProps cfnNamespaceProps = CfnNamespaceProps.builder()
 * .namespaceName("namespaceName")
 * // the properties below are optional
 * .adminPasswordSecretKmsKeyId("adminPasswordSecretKmsKeyId")
 * .adminUsername("adminUsername")
 * .adminUserPassword("adminUserPassword")
 * .dbName("dbName")
 * .defaultIamRoleArn("defaultIamRoleArn")
 * .finalSnapshotName("finalSnapshotName")
 * .finalSnapshotRetentionPeriod(123)
 * .iamRoles(List.of("iamRoles"))
 * .kmsKeyId("kmsKeyId")
 * .logExports(List.of("logExports"))
 * .manageAdminPassword(false)
 * .namespaceResourcePolicy(namespaceResourcePolicy)
 * .redshiftIdcApplicationArn("redshiftIdcApplicationArn")
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
     * @param adminPasswordSecretKmsKeyId The ID of the AWS Key Management Service (KMS) key used to
     *   encrypt and store the namespace's admin credentials secret. You can only use this parameter
     *   if `ManageAdminPassword` is `true` .
     */
    public fun adminPasswordSecretKmsKeyId(adminPasswordSecretKmsKeyId: String) {
        cdkBuilder.adminPasswordSecretKmsKeyId(adminPasswordSecretKmsKeyId)
    }

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
     * @param manageAdminPassword If true, Amazon Redshift uses AWS Secrets Manager to manage the
     *   namespace's admin credentials. You can't use `AdminUserPassword` if `ManageAdminPassword`
     *   is true. If `ManageAdminPassword` is `false` or not set, Amazon Redshift uses
     *   `AdminUserPassword` for the admin user account's password.
     */
    public fun manageAdminPassword(manageAdminPassword: Boolean) {
        cdkBuilder.manageAdminPassword(manageAdminPassword)
    }

    /**
     * @param manageAdminPassword If true, Amazon Redshift uses AWS Secrets Manager to manage the
     *   namespace's admin credentials. You can't use `AdminUserPassword` if `ManageAdminPassword`
     *   is true. If `ManageAdminPassword` is `false` or not set, Amazon Redshift uses
     *   `AdminUserPassword` for the admin user account's password.
     */
    public fun manageAdminPassword(manageAdminPassword: IResolvable) {
        cdkBuilder.manageAdminPassword(manageAdminPassword)
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

    /**
     * @param namespaceResourcePolicy The resource policy that will be attached to the namespace.
     */
    public fun namespaceResourcePolicy(namespaceResourcePolicy: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(namespaceResourcePolicy)
        cdkBuilder.namespaceResourcePolicy(builder.map)
    }

    /**
     * @param namespaceResourcePolicy The resource policy that will be attached to the namespace.
     */
    public fun namespaceResourcePolicy(namespaceResourcePolicy: Any) {
        cdkBuilder.namespaceResourcePolicy(namespaceResourcePolicy)
    }

    /**
     * @param redshiftIdcApplicationArn The ARN for the Redshift application that integrates with
     *   IAM Identity Center.
     */
    public fun redshiftIdcApplicationArn(redshiftIdcApplicationArn: String) {
        cdkBuilder.redshiftIdcApplicationArn(redshiftIdcApplicationArn)
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

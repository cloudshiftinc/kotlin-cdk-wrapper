@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.redshiftserverless

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnNamespace`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.redshiftserverless.*;
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
 * .snapshotCopyConfigurations(List.of(SnapshotCopyConfigurationProperty.builder()
 * .destinationRegion("destinationRegion")
 * // the properties below are optional
 * .destinationKmsKeyId("destinationKmsKeyId")
 * .snapshotRetentionPeriod(123)
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html)
 */
public interface CfnNamespaceProps {
  /**
   * The ID of the AWS Key Management Service (KMS) key used to encrypt and store the namespace's
   * admin credentials secret.
   *
   * You can only use this parameter if `ManageAdminPassword` is `true` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-adminpasswordsecretkmskeyid)
   */
  public fun adminPasswordSecretKmsKeyId(): String? = unwrap(this).getAdminPasswordSecretKmsKeyId()

  /**
   * The password of the administrator for the primary database created in the namespace.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-adminuserpassword)
   */
  public fun adminUserPassword(): String? = unwrap(this).getAdminUserPassword()

  /**
   * The username of the administrator for the primary database created in the namespace.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-adminusername)
   */
  public fun adminUsername(): String? = unwrap(this).getAdminUsername()

  /**
   * The name of the primary database created in the namespace.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-dbname)
   */
  public fun dbName(): String? = unwrap(this).getDbName()

  /**
   * The Amazon Resource Name (ARN) of the IAM role to set as a default in the namespace.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-defaultiamrolearn)
   */
  public fun defaultIamRoleArn(): String? = unwrap(this).getDefaultIamRoleArn()

  /**
   * The name of the snapshot to be created before the namespace is deleted.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-finalsnapshotname)
   */
  public fun finalSnapshotName(): String? = unwrap(this).getFinalSnapshotName()

  /**
   * How long to retain the final snapshot.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-finalsnapshotretentionperiod)
   */
  public fun finalSnapshotRetentionPeriod(): Number? =
      unwrap(this).getFinalSnapshotRetentionPeriod()

  /**
   * A list of IAM roles to associate with the namespace.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-iamroles)
   */
  public fun iamRoles(): List<String> = unwrap(this).getIamRoles() ?: emptyList()

  /**
   * The ID of the AWS Key Management Service key used to encrypt your data.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-kmskeyid)
   */
  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * The types of logs the namespace can export.
   *
   * Available export types are `userlog` , `connectionlog` , and `useractivitylog` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-logexports)
   */
  public fun logExports(): List<String> = unwrap(this).getLogExports() ?: emptyList()

  /**
   * If true, Amazon Redshift uses AWS Secrets Manager to manage the namespace's admin credentials.
   *
   * You can't use `AdminUserPassword` if `ManageAdminPassword` is true. If `ManageAdminPassword` is
   * `false` or not set, Amazon Redshift uses `AdminUserPassword` for the admin user account's
   * password.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-manageadminpassword)
   */
  public fun manageAdminPassword(): Any? = unwrap(this).getManageAdminPassword()

  /**
   * The name of the namespace.
   *
   * Must be between 3-64 alphanumeric characters in lowercase, and it cannot be a reserved word. A
   * list of reserved words can be found in [Reserved
   * Words](https://docs.aws.amazon.com//redshift/latest/dg/r_pg_keywords.html) in the Amazon Redshift
   * Database Developer Guide.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-namespacename)
   */
  public fun namespaceName(): String

  /**
   * The resource policy that will be attached to the namespace.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-namespaceresourcepolicy)
   */
  public fun namespaceResourcePolicy(): Any? = unwrap(this).getNamespaceResourcePolicy()

  /**
   * The ARN for the Redshift application that integrates with IAM Identity Center.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-redshiftidcapplicationarn)
   */
  public fun redshiftIdcApplicationArn(): String? = unwrap(this).getRedshiftIdcApplicationArn()

  /**
   * The snapshot copy configurations for the namespace.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-snapshotcopyconfigurations)
   */
  public fun snapshotCopyConfigurations(): Any? = unwrap(this).getSnapshotCopyConfigurations()

  /**
   * The map of the key-value pairs used to tag the namespace.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnNamespaceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param adminPasswordSecretKmsKeyId The ID of the AWS Key Management Service (KMS) key used to
     * encrypt and store the namespace's admin credentials secret.
     * You can only use this parameter if `ManageAdminPassword` is `true` .
     */
    public fun adminPasswordSecretKmsKeyId(adminPasswordSecretKmsKeyId: String)

    /**
     * @param adminUserPassword The password of the administrator for the primary database created
     * in the namespace.
     */
    public fun adminUserPassword(adminUserPassword: String)

    /**
     * @param adminUsername The username of the administrator for the primary database created in
     * the namespace.
     */
    public fun adminUsername(adminUsername: String)

    /**
     * @param dbName The name of the primary database created in the namespace.
     */
    public fun dbName(dbName: String)

    /**
     * @param defaultIamRoleArn The Amazon Resource Name (ARN) of the IAM role to set as a default
     * in the namespace.
     */
    public fun defaultIamRoleArn(defaultIamRoleArn: String)

    /**
     * @param finalSnapshotName The name of the snapshot to be created before the namespace is
     * deleted.
     */
    public fun finalSnapshotName(finalSnapshotName: String)

    /**
     * @param finalSnapshotRetentionPeriod How long to retain the final snapshot.
     */
    public fun finalSnapshotRetentionPeriod(finalSnapshotRetentionPeriod: Number)

    /**
     * @param iamRoles A list of IAM roles to associate with the namespace.
     */
    public fun iamRoles(iamRoles: List<String>)

    /**
     * @param iamRoles A list of IAM roles to associate with the namespace.
     */
    public fun iamRoles(vararg iamRoles: String)

    /**
     * @param kmsKeyId The ID of the AWS Key Management Service key used to encrypt your data.
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * @param logExports The types of logs the namespace can export.
     * Available export types are `userlog` , `connectionlog` , and `useractivitylog` .
     */
    public fun logExports(logExports: List<String>)

    /**
     * @param logExports The types of logs the namespace can export.
     * Available export types are `userlog` , `connectionlog` , and `useractivitylog` .
     */
    public fun logExports(vararg logExports: String)

    /**
     * @param manageAdminPassword If true, Amazon Redshift uses AWS Secrets Manager to manage the
     * namespace's admin credentials.
     * You can't use `AdminUserPassword` if `ManageAdminPassword` is true. If `ManageAdminPassword`
     * is `false` or not set, Amazon Redshift uses `AdminUserPassword` for the admin user account's
     * password.
     */
    public fun manageAdminPassword(manageAdminPassword: Boolean)

    /**
     * @param manageAdminPassword If true, Amazon Redshift uses AWS Secrets Manager to manage the
     * namespace's admin credentials.
     * You can't use `AdminUserPassword` if `ManageAdminPassword` is true. If `ManageAdminPassword`
     * is `false` or not set, Amazon Redshift uses `AdminUserPassword` for the admin user account's
     * password.
     */
    public fun manageAdminPassword(manageAdminPassword: IResolvable)

    /**
     * @param namespaceName The name of the namespace. 
     * Must be between 3-64 alphanumeric characters in lowercase, and it cannot be a reserved word.
     * A list of reserved words can be found in [Reserved
     * Words](https://docs.aws.amazon.com//redshift/latest/dg/r_pg_keywords.html) in the Amazon
     * Redshift Database Developer Guide.
     */
    public fun namespaceName(namespaceName: String)

    /**
     * @param namespaceResourcePolicy The resource policy that will be attached to the namespace.
     */
    public fun namespaceResourcePolicy(namespaceResourcePolicy: Any)

    /**
     * @param redshiftIdcApplicationArn The ARN for the Redshift application that integrates with
     * IAM Identity Center.
     */
    public fun redshiftIdcApplicationArn(redshiftIdcApplicationArn: String)

    /**
     * @param snapshotCopyConfigurations The snapshot copy configurations for the namespace.
     */
    public fun snapshotCopyConfigurations(snapshotCopyConfigurations: IResolvable)

    /**
     * @param snapshotCopyConfigurations The snapshot copy configurations for the namespace.
     */
    public fun snapshotCopyConfigurations(snapshotCopyConfigurations: List<Any>)

    /**
     * @param snapshotCopyConfigurations The snapshot copy configurations for the namespace.
     */
    public fun snapshotCopyConfigurations(vararg snapshotCopyConfigurations: Any)

    /**
     * @param tags The map of the key-value pairs used to tag the namespace.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The map of the key-value pairs used to tag the namespace.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.redshiftserverless.CfnNamespaceProps.Builder =
        software.amazon.awscdk.services.redshiftserverless.CfnNamespaceProps.builder()

    /**
     * @param adminPasswordSecretKmsKeyId The ID of the AWS Key Management Service (KMS) key used to
     * encrypt and store the namespace's admin credentials secret.
     * You can only use this parameter if `ManageAdminPassword` is `true` .
     */
    override fun adminPasswordSecretKmsKeyId(adminPasswordSecretKmsKeyId: String) {
      cdkBuilder.adminPasswordSecretKmsKeyId(adminPasswordSecretKmsKeyId)
    }

    /**
     * @param adminUserPassword The password of the administrator for the primary database created
     * in the namespace.
     */
    override fun adminUserPassword(adminUserPassword: String) {
      cdkBuilder.adminUserPassword(adminUserPassword)
    }

    /**
     * @param adminUsername The username of the administrator for the primary database created in
     * the namespace.
     */
    override fun adminUsername(adminUsername: String) {
      cdkBuilder.adminUsername(adminUsername)
    }

    /**
     * @param dbName The name of the primary database created in the namespace.
     */
    override fun dbName(dbName: String) {
      cdkBuilder.dbName(dbName)
    }

    /**
     * @param defaultIamRoleArn The Amazon Resource Name (ARN) of the IAM role to set as a default
     * in the namespace.
     */
    override fun defaultIamRoleArn(defaultIamRoleArn: String) {
      cdkBuilder.defaultIamRoleArn(defaultIamRoleArn)
    }

    /**
     * @param finalSnapshotName The name of the snapshot to be created before the namespace is
     * deleted.
     */
    override fun finalSnapshotName(finalSnapshotName: String) {
      cdkBuilder.finalSnapshotName(finalSnapshotName)
    }

    /**
     * @param finalSnapshotRetentionPeriod How long to retain the final snapshot.
     */
    override fun finalSnapshotRetentionPeriod(finalSnapshotRetentionPeriod: Number) {
      cdkBuilder.finalSnapshotRetentionPeriod(finalSnapshotRetentionPeriod)
    }

    /**
     * @param iamRoles A list of IAM roles to associate with the namespace.
     */
    override fun iamRoles(iamRoles: List<String>) {
      cdkBuilder.iamRoles(iamRoles)
    }

    /**
     * @param iamRoles A list of IAM roles to associate with the namespace.
     */
    override fun iamRoles(vararg iamRoles: String): Unit = iamRoles(iamRoles.toList())

    /**
     * @param kmsKeyId The ID of the AWS Key Management Service key used to encrypt your data.
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param logExports The types of logs the namespace can export.
     * Available export types are `userlog` , `connectionlog` , and `useractivitylog` .
     */
    override fun logExports(logExports: List<String>) {
      cdkBuilder.logExports(logExports)
    }

    /**
     * @param logExports The types of logs the namespace can export.
     * Available export types are `userlog` , `connectionlog` , and `useractivitylog` .
     */
    override fun logExports(vararg logExports: String): Unit = logExports(logExports.toList())

    /**
     * @param manageAdminPassword If true, Amazon Redshift uses AWS Secrets Manager to manage the
     * namespace's admin credentials.
     * You can't use `AdminUserPassword` if `ManageAdminPassword` is true. If `ManageAdminPassword`
     * is `false` or not set, Amazon Redshift uses `AdminUserPassword` for the admin user account's
     * password.
     */
    override fun manageAdminPassword(manageAdminPassword: Boolean) {
      cdkBuilder.manageAdminPassword(manageAdminPassword)
    }

    /**
     * @param manageAdminPassword If true, Amazon Redshift uses AWS Secrets Manager to manage the
     * namespace's admin credentials.
     * You can't use `AdminUserPassword` if `ManageAdminPassword` is true. If `ManageAdminPassword`
     * is `false` or not set, Amazon Redshift uses `AdminUserPassword` for the admin user account's
     * password.
     */
    override fun manageAdminPassword(manageAdminPassword: IResolvable) {
      cdkBuilder.manageAdminPassword(manageAdminPassword.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param namespaceName The name of the namespace. 
     * Must be between 3-64 alphanumeric characters in lowercase, and it cannot be a reserved word.
     * A list of reserved words can be found in [Reserved
     * Words](https://docs.aws.amazon.com//redshift/latest/dg/r_pg_keywords.html) in the Amazon
     * Redshift Database Developer Guide.
     */
    override fun namespaceName(namespaceName: String) {
      cdkBuilder.namespaceName(namespaceName)
    }

    /**
     * @param namespaceResourcePolicy The resource policy that will be attached to the namespace.
     */
    override fun namespaceResourcePolicy(namespaceResourcePolicy: Any) {
      cdkBuilder.namespaceResourcePolicy(namespaceResourcePolicy)
    }

    /**
     * @param redshiftIdcApplicationArn The ARN for the Redshift application that integrates with
     * IAM Identity Center.
     */
    override fun redshiftIdcApplicationArn(redshiftIdcApplicationArn: String) {
      cdkBuilder.redshiftIdcApplicationArn(redshiftIdcApplicationArn)
    }

    /**
     * @param snapshotCopyConfigurations The snapshot copy configurations for the namespace.
     */
    override fun snapshotCopyConfigurations(snapshotCopyConfigurations: IResolvable) {
      cdkBuilder.snapshotCopyConfigurations(snapshotCopyConfigurations.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param snapshotCopyConfigurations The snapshot copy configurations for the namespace.
     */
    override fun snapshotCopyConfigurations(snapshotCopyConfigurations: List<Any>) {
      cdkBuilder.snapshotCopyConfigurations(snapshotCopyConfigurations.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param snapshotCopyConfigurations The snapshot copy configurations for the namespace.
     */
    override fun snapshotCopyConfigurations(vararg snapshotCopyConfigurations: Any): Unit =
        snapshotCopyConfigurations(snapshotCopyConfigurations.toList())

    /**
     * @param tags The map of the key-value pairs used to tag the namespace.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The map of the key-value pairs used to tag the namespace.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.redshiftserverless.CfnNamespaceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.redshiftserverless.CfnNamespaceProps,
  ) : CdkObject(cdkObject),
      CfnNamespaceProps {
    /**
     * The ID of the AWS Key Management Service (KMS) key used to encrypt and store the namespace's
     * admin credentials secret.
     *
     * You can only use this parameter if `ManageAdminPassword` is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-adminpasswordsecretkmskeyid)
     */
    override fun adminPasswordSecretKmsKeyId(): String? =
        unwrap(this).getAdminPasswordSecretKmsKeyId()

    /**
     * The password of the administrator for the primary database created in the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-adminuserpassword)
     */
    override fun adminUserPassword(): String? = unwrap(this).getAdminUserPassword()

    /**
     * The username of the administrator for the primary database created in the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-adminusername)
     */
    override fun adminUsername(): String? = unwrap(this).getAdminUsername()

    /**
     * The name of the primary database created in the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-dbname)
     */
    override fun dbName(): String? = unwrap(this).getDbName()

    /**
     * The Amazon Resource Name (ARN) of the IAM role to set as a default in the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-defaultiamrolearn)
     */
    override fun defaultIamRoleArn(): String? = unwrap(this).getDefaultIamRoleArn()

    /**
     * The name of the snapshot to be created before the namespace is deleted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-finalsnapshotname)
     */
    override fun finalSnapshotName(): String? = unwrap(this).getFinalSnapshotName()

    /**
     * How long to retain the final snapshot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-finalsnapshotretentionperiod)
     */
    override fun finalSnapshotRetentionPeriod(): Number? =
        unwrap(this).getFinalSnapshotRetentionPeriod()

    /**
     * A list of IAM roles to associate with the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-iamroles)
     */
    override fun iamRoles(): List<String> = unwrap(this).getIamRoles() ?: emptyList()

    /**
     * The ID of the AWS Key Management Service key used to encrypt your data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-kmskeyid)
     */
    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * The types of logs the namespace can export.
     *
     * Available export types are `userlog` , `connectionlog` , and `useractivitylog` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-logexports)
     */
    override fun logExports(): List<String> = unwrap(this).getLogExports() ?: emptyList()

    /**
     * If true, Amazon Redshift uses AWS Secrets Manager to manage the namespace's admin
     * credentials.
     *
     * You can't use `AdminUserPassword` if `ManageAdminPassword` is true. If `ManageAdminPassword`
     * is `false` or not set, Amazon Redshift uses `AdminUserPassword` for the admin user account's
     * password.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-manageadminpassword)
     */
    override fun manageAdminPassword(): Any? = unwrap(this).getManageAdminPassword()

    /**
     * The name of the namespace.
     *
     * Must be between 3-64 alphanumeric characters in lowercase, and it cannot be a reserved word.
     * A list of reserved words can be found in [Reserved
     * Words](https://docs.aws.amazon.com//redshift/latest/dg/r_pg_keywords.html) in the Amazon
     * Redshift Database Developer Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-namespacename)
     */
    override fun namespaceName(): String = unwrap(this).getNamespaceName()

    /**
     * The resource policy that will be attached to the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-namespaceresourcepolicy)
     */
    override fun namespaceResourcePolicy(): Any? = unwrap(this).getNamespaceResourcePolicy()

    /**
     * The ARN for the Redshift application that integrates with IAM Identity Center.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-redshiftidcapplicationarn)
     */
    override fun redshiftIdcApplicationArn(): String? = unwrap(this).getRedshiftIdcApplicationArn()

    /**
     * The snapshot copy configurations for the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-snapshotcopyconfigurations)
     */
    override fun snapshotCopyConfigurations(): Any? = unwrap(this).getSnapshotCopyConfigurations()

    /**
     * The map of the key-value pairs used to tag the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnNamespaceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.redshiftserverless.CfnNamespaceProps):
        CfnNamespaceProps = CdkObjectWrappers.wrap(cdkObject) as? CfnNamespaceProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnNamespaceProps):
        software.amazon.awscdk.services.redshiftserverless.CfnNamespaceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.redshiftserverless.CfnNamespaceProps
  }
}

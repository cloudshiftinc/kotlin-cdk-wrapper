@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.redshiftserverless

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A collection of database objects and users.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.redshiftserverless.*;
 * Object namespaceResourcePolicy;
 * CfnNamespace cfnNamespace = CfnNamespace.Builder.create(this, "MyCfnNamespace")
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
public open class CfnNamespace(
  cdkObject: software.amazon.awscdk.services.redshiftserverless.CfnNamespace,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnNamespaceProps,
  ) :
      this(software.amazon.awscdk.services.redshiftserverless.CfnNamespace(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnNamespaceProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnNamespaceProps.Builder.() -> Unit,
  ) : this(scope, id, CfnNamespaceProps(props)
  )

  /**
   * The ID of the AWS Key Management Service (KMS) key used to encrypt and store the namespace's
   * admin credentials secret.
   */
  public open fun adminPasswordSecretKmsKeyId(): String? =
      unwrap(this).getAdminPasswordSecretKmsKeyId()

  /**
   * The ID of the AWS Key Management Service (KMS) key used to encrypt and store the namespace's
   * admin credentials secret.
   */
  public open fun adminPasswordSecretKmsKeyId(`value`: String) {
    unwrap(this).setAdminPasswordSecretKmsKeyId(`value`)
  }

  /**
   * The password of the administrator for the primary database created in the namespace.
   */
  public open fun adminUserPassword(): String? = unwrap(this).getAdminUserPassword()

  /**
   * The password of the administrator for the primary database created in the namespace.
   */
  public open fun adminUserPassword(`value`: String) {
    unwrap(this).setAdminUserPassword(`value`)
  }

  /**
   * The username of the administrator for the primary database created in the namespace.
   */
  public open fun adminUsername(): String? = unwrap(this).getAdminUsername()

  /**
   * The username of the administrator for the primary database created in the namespace.
   */
  public open fun adminUsername(`value`: String) {
    unwrap(this).setAdminUsername(`value`)
  }

  /**
   *
   */
  public open fun attrNamespace(): IResolvable =
      unwrap(this).getAttrNamespace().let(IResolvable::wrap)

  /**
   * The username of the administrator for the first database created in the namespace.
   */
  public open fun attrNamespaceAdminUsername(): String =
      unwrap(this).getAttrNamespaceAdminUsername()

  /**
   * The date of when the namespace was created.
   */
  public open fun attrNamespaceCreationDate(): String = unwrap(this).getAttrNamespaceCreationDate()

  /**
   * The name of the first database created in the namespace.
   */
  public open fun attrNamespaceDbName(): String = unwrap(this).getAttrNamespaceDbName()

  /**
   * The Amazon Resource Name (ARN) of the IAM role to set as a default in the namespace.
   */
  public open fun attrNamespaceDefaultIamRoleArn(): String =
      unwrap(this).getAttrNamespaceDefaultIamRoleArn()

  /**
   * A list of IAM roles to associate with the namespace.
   */
  public open fun attrNamespaceIamRoles(): List<String> = unwrap(this).getAttrNamespaceIamRoles()

  /**
   * The ID of the AWS Key Management Service key used to encrypt your data.
   */
  public open fun attrNamespaceKmsKeyId(): String = unwrap(this).getAttrNamespaceKmsKeyId()

  /**
   * The types of logs the namespace can export.
   *
   * Available export types are `User log` , `Connection log` , and `User activity log` .
   */
  public open fun attrNamespaceLogExports(): List<String> =
      unwrap(this).getAttrNamespaceLogExports()

  /**
   * The Amazon Resource Name (ARN) associated with a namespace.
   */
  public open fun attrNamespaceNamespaceArn(): String = unwrap(this).getAttrNamespaceNamespaceArn()

  /**
   * The unique identifier of a namespace.
   */
  public open fun attrNamespaceNamespaceId(): String = unwrap(this).getAttrNamespaceNamespaceId()

  /**
   * The name of the namespace.
   *
   * Must be between 3-64 alphanumeric characters in lowercase, and it cannot be a reserved word. A
   * list of reserved words can be found in [Reserved
   * Words](https://docs.aws.amazon.com//redshift/latest/dg/r_pg_keywords.html) in the Amazon Redshift
   * Database Developer Guide.
   */
  public open fun attrNamespaceNamespaceName(): String =
      unwrap(this).getAttrNamespaceNamespaceName()

  /**
   * The status of the namespace.
   */
  public open fun attrNamespaceStatus(): String = unwrap(this).getAttrNamespaceStatus()

  /**
   * The name of the primary database created in the namespace.
   */
  public open fun dbName(): String? = unwrap(this).getDbName()

  /**
   * The name of the primary database created in the namespace.
   */
  public open fun dbName(`value`: String) {
    unwrap(this).setDbName(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the IAM role to set as a default in the namespace.
   */
  public open fun defaultIamRoleArn(): String? = unwrap(this).getDefaultIamRoleArn()

  /**
   * The Amazon Resource Name (ARN) of the IAM role to set as a default in the namespace.
   */
  public open fun defaultIamRoleArn(`value`: String) {
    unwrap(this).setDefaultIamRoleArn(`value`)
  }

  /**
   * The name of the snapshot to be created before the namespace is deleted.
   */
  public open fun finalSnapshotName(): String? = unwrap(this).getFinalSnapshotName()

  /**
   * The name of the snapshot to be created before the namespace is deleted.
   */
  public open fun finalSnapshotName(`value`: String) {
    unwrap(this).setFinalSnapshotName(`value`)
  }

  /**
   * How long to retain the final snapshot.
   */
  public open fun finalSnapshotRetentionPeriod(): Number? =
      unwrap(this).getFinalSnapshotRetentionPeriod()

  /**
   * How long to retain the final snapshot.
   */
  public open fun finalSnapshotRetentionPeriod(`value`: Number) {
    unwrap(this).setFinalSnapshotRetentionPeriod(`value`)
  }

  /**
   * A list of IAM roles to associate with the namespace.
   */
  public open fun iamRoles(): List<String> = unwrap(this).getIamRoles() ?: emptyList()

  /**
   * A list of IAM roles to associate with the namespace.
   */
  public open fun iamRoles(`value`: List<String>) {
    unwrap(this).setIamRoles(`value`)
  }

  /**
   * A list of IAM roles to associate with the namespace.
   */
  public open fun iamRoles(vararg `value`: String): Unit = iamRoles(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The ID of the AWS Key Management Service key used to encrypt your data.
   */
  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * The ID of the AWS Key Management Service key used to encrypt your data.
   */
  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  /**
   * The types of logs the namespace can export.
   */
  public open fun logExports(): List<String> = unwrap(this).getLogExports() ?: emptyList()

  /**
   * The types of logs the namespace can export.
   */
  public open fun logExports(`value`: List<String>) {
    unwrap(this).setLogExports(`value`)
  }

  /**
   * The types of logs the namespace can export.
   */
  public open fun logExports(vararg `value`: String): Unit = logExports(`value`.toList())

  /**
   * If true, Amazon Redshift uses AWS Secrets Manager to manage the namespace's admin credentials.
   */
  public open fun manageAdminPassword(): Any? = unwrap(this).getManageAdminPassword()

  /**
   * If true, Amazon Redshift uses AWS Secrets Manager to manage the namespace's admin credentials.
   */
  public open fun manageAdminPassword(`value`: Boolean) {
    unwrap(this).setManageAdminPassword(`value`)
  }

  /**
   * If true, Amazon Redshift uses AWS Secrets Manager to manage the namespace's admin credentials.
   */
  public open fun manageAdminPassword(`value`: IResolvable) {
    unwrap(this).setManageAdminPassword(`value`.let(IResolvable::unwrap))
  }

  /**
   * The name of the namespace.
   */
  public open fun namespaceName(): String = unwrap(this).getNamespaceName()

  /**
   * The name of the namespace.
   */
  public open fun namespaceName(`value`: String) {
    unwrap(this).setNamespaceName(`value`)
  }

  /**
   * The resource policy that will be attached to the namespace.
   */
  public open fun namespaceResourcePolicy(): Any? = unwrap(this).getNamespaceResourcePolicy()

  /**
   * The resource policy that will be attached to the namespace.
   */
  public open fun namespaceResourcePolicy(`value`: Any) {
    unwrap(this).setNamespaceResourcePolicy(`value`)
  }

  /**
   * The ARN for the Redshift application that integrates with IAM Identity Center.
   */
  public open fun redshiftIdcApplicationArn(): String? = unwrap(this).getRedshiftIdcApplicationArn()

  /**
   * The ARN for the Redshift application that integrates with IAM Identity Center.
   */
  public open fun redshiftIdcApplicationArn(`value`: String) {
    unwrap(this).setRedshiftIdcApplicationArn(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The map of the key-value pairs used to tag the namespace.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The map of the key-value pairs used to tag the namespace.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The map of the key-value pairs used to tag the namespace.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.redshiftserverless.CfnNamespace].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the AWS Key Management Service (KMS) key used to encrypt and store the namespace's
     * admin credentials secret.
     *
     * You can only use this parameter if `ManageAdminPassword` is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-adminpasswordsecretkmskeyid)
     * @param adminPasswordSecretKmsKeyId The ID of the AWS Key Management Service (KMS) key used to
     * encrypt and store the namespace's admin credentials secret. 
     */
    public fun adminPasswordSecretKmsKeyId(adminPasswordSecretKmsKeyId: String)

    /**
     * The password of the administrator for the primary database created in the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-adminuserpassword)
     * @param adminUserPassword The password of the administrator for the primary database created
     * in the namespace. 
     */
    public fun adminUserPassword(adminUserPassword: String)

    /**
     * The username of the administrator for the primary database created in the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-adminusername)
     * @param adminUsername The username of the administrator for the primary database created in
     * the namespace. 
     */
    public fun adminUsername(adminUsername: String)

    /**
     * The name of the primary database created in the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-dbname)
     * @param dbName The name of the primary database created in the namespace. 
     */
    public fun dbName(dbName: String)

    /**
     * The Amazon Resource Name (ARN) of the IAM role to set as a default in the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-defaultiamrolearn)
     * @param defaultIamRoleArn The Amazon Resource Name (ARN) of the IAM role to set as a default
     * in the namespace. 
     */
    public fun defaultIamRoleArn(defaultIamRoleArn: String)

    /**
     * The name of the snapshot to be created before the namespace is deleted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-finalsnapshotname)
     * @param finalSnapshotName The name of the snapshot to be created before the namespace is
     * deleted. 
     */
    public fun finalSnapshotName(finalSnapshotName: String)

    /**
     * How long to retain the final snapshot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-finalsnapshotretentionperiod)
     * @param finalSnapshotRetentionPeriod How long to retain the final snapshot. 
     */
    public fun finalSnapshotRetentionPeriod(finalSnapshotRetentionPeriod: Number)

    /**
     * A list of IAM roles to associate with the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-iamroles)
     * @param iamRoles A list of IAM roles to associate with the namespace. 
     */
    public fun iamRoles(iamRoles: List<String>)

    /**
     * A list of IAM roles to associate with the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-iamroles)
     * @param iamRoles A list of IAM roles to associate with the namespace. 
     */
    public fun iamRoles(vararg iamRoles: String)

    /**
     * The ID of the AWS Key Management Service key used to encrypt your data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-kmskeyid)
     * @param kmsKeyId The ID of the AWS Key Management Service key used to encrypt your data. 
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * The types of logs the namespace can export.
     *
     * Available export types are `userlog` , `connectionlog` , and `useractivitylog` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-logexports)
     * @param logExports The types of logs the namespace can export. 
     */
    public fun logExports(logExports: List<String>)

    /**
     * The types of logs the namespace can export.
     *
     * Available export types are `userlog` , `connectionlog` , and `useractivitylog` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-logexports)
     * @param logExports The types of logs the namespace can export. 
     */
    public fun logExports(vararg logExports: String)

    /**
     * If true, Amazon Redshift uses AWS Secrets Manager to manage the namespace's admin
     * credentials.
     *
     * You can't use `AdminUserPassword` if `ManageAdminPassword` is true. If `ManageAdminPassword`
     * is `false` or not set, Amazon Redshift uses `AdminUserPassword` for the admin user account's
     * password.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-manageadminpassword)
     * @param manageAdminPassword If true, Amazon Redshift uses AWS Secrets Manager to manage the
     * namespace's admin credentials. 
     */
    public fun manageAdminPassword(manageAdminPassword: Boolean)

    /**
     * If true, Amazon Redshift uses AWS Secrets Manager to manage the namespace's admin
     * credentials.
     *
     * You can't use `AdminUserPassword` if `ManageAdminPassword` is true. If `ManageAdminPassword`
     * is `false` or not set, Amazon Redshift uses `AdminUserPassword` for the admin user account's
     * password.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-manageadminpassword)
     * @param manageAdminPassword If true, Amazon Redshift uses AWS Secrets Manager to manage the
     * namespace's admin credentials. 
     */
    public fun manageAdminPassword(manageAdminPassword: IResolvable)

    /**
     * The name of the namespace.
     *
     * Must be between 3-64 alphanumeric characters in lowercase, and it cannot be a reserved word.
     * A list of reserved words can be found in [Reserved
     * Words](https://docs.aws.amazon.com//redshift/latest/dg/r_pg_keywords.html) in the Amazon
     * Redshift Database Developer Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-namespacename)
     * @param namespaceName The name of the namespace. 
     */
    public fun namespaceName(namespaceName: String)

    /**
     * The resource policy that will be attached to the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-namespaceresourcepolicy)
     * @param namespaceResourcePolicy The resource policy that will be attached to the namespace. 
     */
    public fun namespaceResourcePolicy(namespaceResourcePolicy: Any)

    /**
     * The ARN for the Redshift application that integrates with IAM Identity Center.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-redshiftidcapplicationarn)
     * @param redshiftIdcApplicationArn The ARN for the Redshift application that integrates with
     * IAM Identity Center. 
     */
    public fun redshiftIdcApplicationArn(redshiftIdcApplicationArn: String)

    /**
     * The map of the key-value pairs used to tag the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-tags)
     * @param tags The map of the key-value pairs used to tag the namespace. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The map of the key-value pairs used to tag the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-tags)
     * @param tags The map of the key-value pairs used to tag the namespace. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.redshiftserverless.CfnNamespace.Builder
        = software.amazon.awscdk.services.redshiftserverless.CfnNamespace.Builder.create(scope, id)

    /**
     * The ID of the AWS Key Management Service (KMS) key used to encrypt and store the namespace's
     * admin credentials secret.
     *
     * You can only use this parameter if `ManageAdminPassword` is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-adminpasswordsecretkmskeyid)
     * @param adminPasswordSecretKmsKeyId The ID of the AWS Key Management Service (KMS) key used to
     * encrypt and store the namespace's admin credentials secret. 
     */
    override fun adminPasswordSecretKmsKeyId(adminPasswordSecretKmsKeyId: String) {
      cdkBuilder.adminPasswordSecretKmsKeyId(adminPasswordSecretKmsKeyId)
    }

    /**
     * The password of the administrator for the primary database created in the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-adminuserpassword)
     * @param adminUserPassword The password of the administrator for the primary database created
     * in the namespace. 
     */
    override fun adminUserPassword(adminUserPassword: String) {
      cdkBuilder.adminUserPassword(adminUserPassword)
    }

    /**
     * The username of the administrator for the primary database created in the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-adminusername)
     * @param adminUsername The username of the administrator for the primary database created in
     * the namespace. 
     */
    override fun adminUsername(adminUsername: String) {
      cdkBuilder.adminUsername(adminUsername)
    }

    /**
     * The name of the primary database created in the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-dbname)
     * @param dbName The name of the primary database created in the namespace. 
     */
    override fun dbName(dbName: String) {
      cdkBuilder.dbName(dbName)
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM role to set as a default in the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-defaultiamrolearn)
     * @param defaultIamRoleArn The Amazon Resource Name (ARN) of the IAM role to set as a default
     * in the namespace. 
     */
    override fun defaultIamRoleArn(defaultIamRoleArn: String) {
      cdkBuilder.defaultIamRoleArn(defaultIamRoleArn)
    }

    /**
     * The name of the snapshot to be created before the namespace is deleted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-finalsnapshotname)
     * @param finalSnapshotName The name of the snapshot to be created before the namespace is
     * deleted. 
     */
    override fun finalSnapshotName(finalSnapshotName: String) {
      cdkBuilder.finalSnapshotName(finalSnapshotName)
    }

    /**
     * How long to retain the final snapshot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-finalsnapshotretentionperiod)
     * @param finalSnapshotRetentionPeriod How long to retain the final snapshot. 
     */
    override fun finalSnapshotRetentionPeriod(finalSnapshotRetentionPeriod: Number) {
      cdkBuilder.finalSnapshotRetentionPeriod(finalSnapshotRetentionPeriod)
    }

    /**
     * A list of IAM roles to associate with the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-iamroles)
     * @param iamRoles A list of IAM roles to associate with the namespace. 
     */
    override fun iamRoles(iamRoles: List<String>) {
      cdkBuilder.iamRoles(iamRoles)
    }

    /**
     * A list of IAM roles to associate with the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-iamroles)
     * @param iamRoles A list of IAM roles to associate with the namespace. 
     */
    override fun iamRoles(vararg iamRoles: String): Unit = iamRoles(iamRoles.toList())

    /**
     * The ID of the AWS Key Management Service key used to encrypt your data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-kmskeyid)
     * @param kmsKeyId The ID of the AWS Key Management Service key used to encrypt your data. 
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * The types of logs the namespace can export.
     *
     * Available export types are `userlog` , `connectionlog` , and `useractivitylog` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-logexports)
     * @param logExports The types of logs the namespace can export. 
     */
    override fun logExports(logExports: List<String>) {
      cdkBuilder.logExports(logExports)
    }

    /**
     * The types of logs the namespace can export.
     *
     * Available export types are `userlog` , `connectionlog` , and `useractivitylog` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-logexports)
     * @param logExports The types of logs the namespace can export. 
     */
    override fun logExports(vararg logExports: String): Unit = logExports(logExports.toList())

    /**
     * If true, Amazon Redshift uses AWS Secrets Manager to manage the namespace's admin
     * credentials.
     *
     * You can't use `AdminUserPassword` if `ManageAdminPassword` is true. If `ManageAdminPassword`
     * is `false` or not set, Amazon Redshift uses `AdminUserPassword` for the admin user account's
     * password.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-manageadminpassword)
     * @param manageAdminPassword If true, Amazon Redshift uses AWS Secrets Manager to manage the
     * namespace's admin credentials. 
     */
    override fun manageAdminPassword(manageAdminPassword: Boolean) {
      cdkBuilder.manageAdminPassword(manageAdminPassword)
    }

    /**
     * If true, Amazon Redshift uses AWS Secrets Manager to manage the namespace's admin
     * credentials.
     *
     * You can't use `AdminUserPassword` if `ManageAdminPassword` is true. If `ManageAdminPassword`
     * is `false` or not set, Amazon Redshift uses `AdminUserPassword` for the admin user account's
     * password.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-manageadminpassword)
     * @param manageAdminPassword If true, Amazon Redshift uses AWS Secrets Manager to manage the
     * namespace's admin credentials. 
     */
    override fun manageAdminPassword(manageAdminPassword: IResolvable) {
      cdkBuilder.manageAdminPassword(manageAdminPassword.let(IResolvable::unwrap))
    }

    /**
     * The name of the namespace.
     *
     * Must be between 3-64 alphanumeric characters in lowercase, and it cannot be a reserved word.
     * A list of reserved words can be found in [Reserved
     * Words](https://docs.aws.amazon.com//redshift/latest/dg/r_pg_keywords.html) in the Amazon
     * Redshift Database Developer Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-namespacename)
     * @param namespaceName The name of the namespace. 
     */
    override fun namespaceName(namespaceName: String) {
      cdkBuilder.namespaceName(namespaceName)
    }

    /**
     * The resource policy that will be attached to the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-namespaceresourcepolicy)
     * @param namespaceResourcePolicy The resource policy that will be attached to the namespace. 
     */
    override fun namespaceResourcePolicy(namespaceResourcePolicy: Any) {
      cdkBuilder.namespaceResourcePolicy(namespaceResourcePolicy)
    }

    /**
     * The ARN for the Redshift application that integrates with IAM Identity Center.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-redshiftidcapplicationarn)
     * @param redshiftIdcApplicationArn The ARN for the Redshift application that integrates with
     * IAM Identity Center. 
     */
    override fun redshiftIdcApplicationArn(redshiftIdcApplicationArn: String) {
      cdkBuilder.redshiftIdcApplicationArn(redshiftIdcApplicationArn)
    }

    /**
     * The map of the key-value pairs used to tag the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-tags)
     * @param tags The map of the key-value pairs used to tag the namespace. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The map of the key-value pairs used to tag the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-tags)
     * @param tags The map of the key-value pairs used to tag the namespace. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.redshiftserverless.CfnNamespace =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.redshiftserverless.CfnNamespace.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnNamespace {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnNamespace(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.redshiftserverless.CfnNamespace):
        CfnNamespace = CfnNamespace(cdkObject)

    internal fun unwrap(wrapped: CfnNamespace):
        software.amazon.awscdk.services.redshiftserverless.CfnNamespace = wrapped.cdkObject as
        software.amazon.awscdk.services.redshiftserverless.CfnNamespace
  }

  /**
   * A collection of database objects and users.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.redshiftserverless.*;
   * NamespaceProperty namespaceProperty = NamespaceProperty.builder()
   * .adminPasswordSecretArn("adminPasswordSecretArn")
   * .adminPasswordSecretKmsKeyId("adminPasswordSecretKmsKeyId")
   * .adminUsername("adminUsername")
   * .creationDate("creationDate")
   * .dbName("dbName")
   * .defaultIamRoleArn("defaultIamRoleArn")
   * .iamRoles(List.of("iamRoles"))
   * .kmsKeyId("kmsKeyId")
   * .logExports(List.of("logExports"))
   * .namespaceArn("namespaceArn")
   * .namespaceId("namespaceId")
   * .namespaceName("namespaceName")
   * .status("status")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-namespace-namespace.html)
   */
  public interface NamespaceProperty {
    /**
     * The Amazon Resource Name (ARN) for the namespace's admin user credentials secret.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-namespace-namespace.html#cfn-redshiftserverless-namespace-namespace-adminpasswordsecretarn)
     */
    public fun adminPasswordSecretArn(): String? = unwrap(this).getAdminPasswordSecretArn()

    /**
     * The ID of the AWS Key Management Service (KMS) key used to encrypt and store the namespace's
     * admin credentials secret.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-namespace-namespace.html#cfn-redshiftserverless-namespace-namespace-adminpasswordsecretkmskeyid)
     */
    public fun adminPasswordSecretKmsKeyId(): String? =
        unwrap(this).getAdminPasswordSecretKmsKeyId()

    /**
     * The username of the administrator for the first database created in the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-namespace-namespace.html#cfn-redshiftserverless-namespace-namespace-adminusername)
     */
    public fun adminUsername(): String? = unwrap(this).getAdminUsername()

    /**
     * The date of when the namespace was created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-namespace-namespace.html#cfn-redshiftserverless-namespace-namespace-creationdate)
     */
    public fun creationDate(): String? = unwrap(this).getCreationDate()

    /**
     * The name of the first database created in the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-namespace-namespace.html#cfn-redshiftserverless-namespace-namespace-dbname)
     */
    public fun dbName(): String? = unwrap(this).getDbName()

    /**
     * The Amazon Resource Name (ARN) of the IAM role to set as a default in the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-namespace-namespace.html#cfn-redshiftserverless-namespace-namespace-defaultiamrolearn)
     */
    public fun defaultIamRoleArn(): String? = unwrap(this).getDefaultIamRoleArn()

    /**
     * A list of IAM roles to associate with the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-namespace-namespace.html#cfn-redshiftserverless-namespace-namespace-iamroles)
     */
    public fun iamRoles(): List<String> = unwrap(this).getIamRoles() ?: emptyList()

    /**
     * The ID of the AWS Key Management Service key used to encrypt your data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-namespace-namespace.html#cfn-redshiftserverless-namespace-namespace-kmskeyid)
     */
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * The types of logs the namespace can export.
     *
     * Available export types are User log, Connection log, and User activity log.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-namespace-namespace.html#cfn-redshiftserverless-namespace-namespace-logexports)
     */
    public fun logExports(): List<String> = unwrap(this).getLogExports() ?: emptyList()

    /**
     * The Amazon Resource Name (ARN) associated with a namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-namespace-namespace.html#cfn-redshiftserverless-namespace-namespace-namespacearn)
     */
    public fun namespaceArn(): String? = unwrap(this).getNamespaceArn()

    /**
     * The unique identifier of a namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-namespace-namespace.html#cfn-redshiftserverless-namespace-namespace-namespaceid)
     */
    public fun namespaceId(): String? = unwrap(this).getNamespaceId()

    /**
     * The name of the namespace.
     *
     * Must be between 3-64 alphanumeric characters in lowercase, and it cannot be a reserved word.
     * A list of reserved words can be found in [Reserved
     * Words](https://docs.aws.amazon.com//redshift/latest/dg/r_pg_keywords.html) in the Amazon
     * Redshift Database Developer Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-namespace-namespace.html#cfn-redshiftserverless-namespace-namespace-namespacename)
     */
    public fun namespaceName(): String? = unwrap(this).getNamespaceName()

    /**
     * The status of the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-namespace-namespace.html#cfn-redshiftserverless-namespace-namespace-status)
     */
    public fun status(): String? = unwrap(this).getStatus()

    /**
     * A builder for [NamespaceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param adminPasswordSecretArn The Amazon Resource Name (ARN) for the namespace's admin user
       * credentials secret.
       */
      public fun adminPasswordSecretArn(adminPasswordSecretArn: String)

      /**
       * @param adminPasswordSecretKmsKeyId The ID of the AWS Key Management Service (KMS) key used
       * to encrypt and store the namespace's admin credentials secret.
       */
      public fun adminPasswordSecretKmsKeyId(adminPasswordSecretKmsKeyId: String)

      /**
       * @param adminUsername The username of the administrator for the first database created in
       * the namespace.
       */
      public fun adminUsername(adminUsername: String)

      /**
       * @param creationDate The date of when the namespace was created.
       */
      public fun creationDate(creationDate: String)

      /**
       * @param dbName The name of the first database created in the namespace.
       */
      public fun dbName(dbName: String)

      /**
       * @param defaultIamRoleArn The Amazon Resource Name (ARN) of the IAM role to set as a default
       * in the namespace.
       */
      public fun defaultIamRoleArn(defaultIamRoleArn: String)

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
       * Available export types are User log, Connection log, and User activity log.
       */
      public fun logExports(logExports: List<String>)

      /**
       * @param logExports The types of logs the namespace can export.
       * Available export types are User log, Connection log, and User activity log.
       */
      public fun logExports(vararg logExports: String)

      /**
       * @param namespaceArn The Amazon Resource Name (ARN) associated with a namespace.
       */
      public fun namespaceArn(namespaceArn: String)

      /**
       * @param namespaceId The unique identifier of a namespace.
       */
      public fun namespaceId(namespaceId: String)

      /**
       * @param namespaceName The name of the namespace.
       * Must be between 3-64 alphanumeric characters in lowercase, and it cannot be a reserved
       * word. A list of reserved words can be found in [Reserved
       * Words](https://docs.aws.amazon.com//redshift/latest/dg/r_pg_keywords.html) in the Amazon
       * Redshift Database Developer Guide.
       */
      public fun namespaceName(namespaceName: String)

      /**
       * @param status The status of the namespace.
       */
      public fun status(status: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.redshiftserverless.CfnNamespace.NamespaceProperty.Builder
          =
          software.amazon.awscdk.services.redshiftserverless.CfnNamespace.NamespaceProperty.builder()

      /**
       * @param adminPasswordSecretArn The Amazon Resource Name (ARN) for the namespace's admin user
       * credentials secret.
       */
      override fun adminPasswordSecretArn(adminPasswordSecretArn: String) {
        cdkBuilder.adminPasswordSecretArn(adminPasswordSecretArn)
      }

      /**
       * @param adminPasswordSecretKmsKeyId The ID of the AWS Key Management Service (KMS) key used
       * to encrypt and store the namespace's admin credentials secret.
       */
      override fun adminPasswordSecretKmsKeyId(adminPasswordSecretKmsKeyId: String) {
        cdkBuilder.adminPasswordSecretKmsKeyId(adminPasswordSecretKmsKeyId)
      }

      /**
       * @param adminUsername The username of the administrator for the first database created in
       * the namespace.
       */
      override fun adminUsername(adminUsername: String) {
        cdkBuilder.adminUsername(adminUsername)
      }

      /**
       * @param creationDate The date of when the namespace was created.
       */
      override fun creationDate(creationDate: String) {
        cdkBuilder.creationDate(creationDate)
      }

      /**
       * @param dbName The name of the first database created in the namespace.
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
       * Available export types are User log, Connection log, and User activity log.
       */
      override fun logExports(logExports: List<String>) {
        cdkBuilder.logExports(logExports)
      }

      /**
       * @param logExports The types of logs the namespace can export.
       * Available export types are User log, Connection log, and User activity log.
       */
      override fun logExports(vararg logExports: String): Unit = logExports(logExports.toList())

      /**
       * @param namespaceArn The Amazon Resource Name (ARN) associated with a namespace.
       */
      override fun namespaceArn(namespaceArn: String) {
        cdkBuilder.namespaceArn(namespaceArn)
      }

      /**
       * @param namespaceId The unique identifier of a namespace.
       */
      override fun namespaceId(namespaceId: String) {
        cdkBuilder.namespaceId(namespaceId)
      }

      /**
       * @param namespaceName The name of the namespace.
       * Must be between 3-64 alphanumeric characters in lowercase, and it cannot be a reserved
       * word. A list of reserved words can be found in [Reserved
       * Words](https://docs.aws.amazon.com//redshift/latest/dg/r_pg_keywords.html) in the Amazon
       * Redshift Database Developer Guide.
       */
      override fun namespaceName(namespaceName: String) {
        cdkBuilder.namespaceName(namespaceName)
      }

      /**
       * @param status The status of the namespace.
       */
      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build():
          software.amazon.awscdk.services.redshiftserverless.CfnNamespace.NamespaceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.redshiftserverless.CfnNamespace.NamespaceProperty,
    ) : CdkObject(cdkObject), NamespaceProperty {
      /**
       * The Amazon Resource Name (ARN) for the namespace's admin user credentials secret.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-namespace-namespace.html#cfn-redshiftserverless-namespace-namespace-adminpasswordsecretarn)
       */
      override fun adminPasswordSecretArn(): String? = unwrap(this).getAdminPasswordSecretArn()

      /**
       * The ID of the AWS Key Management Service (KMS) key used to encrypt and store the
       * namespace's admin credentials secret.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-namespace-namespace.html#cfn-redshiftserverless-namespace-namespace-adminpasswordsecretkmskeyid)
       */
      override fun adminPasswordSecretKmsKeyId(): String? =
          unwrap(this).getAdminPasswordSecretKmsKeyId()

      /**
       * The username of the administrator for the first database created in the namespace.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-namespace-namespace.html#cfn-redshiftserverless-namespace-namespace-adminusername)
       */
      override fun adminUsername(): String? = unwrap(this).getAdminUsername()

      /**
       * The date of when the namespace was created.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-namespace-namespace.html#cfn-redshiftserverless-namespace-namespace-creationdate)
       */
      override fun creationDate(): String? = unwrap(this).getCreationDate()

      /**
       * The name of the first database created in the namespace.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-namespace-namespace.html#cfn-redshiftserverless-namespace-namespace-dbname)
       */
      override fun dbName(): String? = unwrap(this).getDbName()

      /**
       * The Amazon Resource Name (ARN) of the IAM role to set as a default in the namespace.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-namespace-namespace.html#cfn-redshiftserverless-namespace-namespace-defaultiamrolearn)
       */
      override fun defaultIamRoleArn(): String? = unwrap(this).getDefaultIamRoleArn()

      /**
       * A list of IAM roles to associate with the namespace.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-namespace-namespace.html#cfn-redshiftserverless-namespace-namespace-iamroles)
       */
      override fun iamRoles(): List<String> = unwrap(this).getIamRoles() ?: emptyList()

      /**
       * The ID of the AWS Key Management Service key used to encrypt your data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-namespace-namespace.html#cfn-redshiftserverless-namespace-namespace-kmskeyid)
       */
      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      /**
       * The types of logs the namespace can export.
       *
       * Available export types are User log, Connection log, and User activity log.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-namespace-namespace.html#cfn-redshiftserverless-namespace-namespace-logexports)
       */
      override fun logExports(): List<String> = unwrap(this).getLogExports() ?: emptyList()

      /**
       * The Amazon Resource Name (ARN) associated with a namespace.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-namespace-namespace.html#cfn-redshiftserverless-namespace-namespace-namespacearn)
       */
      override fun namespaceArn(): String? = unwrap(this).getNamespaceArn()

      /**
       * The unique identifier of a namespace.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-namespace-namespace.html#cfn-redshiftserverless-namespace-namespace-namespaceid)
       */
      override fun namespaceId(): String? = unwrap(this).getNamespaceId()

      /**
       * The name of the namespace.
       *
       * Must be between 3-64 alphanumeric characters in lowercase, and it cannot be a reserved
       * word. A list of reserved words can be found in [Reserved
       * Words](https://docs.aws.amazon.com//redshift/latest/dg/r_pg_keywords.html) in the Amazon
       * Redshift Database Developer Guide.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-namespace-namespace.html#cfn-redshiftserverless-namespace-namespace-namespacename)
       */
      override fun namespaceName(): String? = unwrap(this).getNamespaceName()

      /**
       * The status of the namespace.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-namespace-namespace.html#cfn-redshiftserverless-namespace-namespace-status)
       */
      override fun status(): String? = unwrap(this).getStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NamespaceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.redshiftserverless.CfnNamespace.NamespaceProperty):
          NamespaceProperty = CdkObjectWrappers.wrap(cdkObject) as? NamespaceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: NamespaceProperty):
          software.amazon.awscdk.services.redshiftserverless.CfnNamespace.NamespaceProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.redshiftserverless.CfnNamespace.NamespaceProperty
    }
  }
}

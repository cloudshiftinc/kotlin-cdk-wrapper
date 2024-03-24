@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lakeformation

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnDataLakeSettings`.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.glue.alpha.S3Table;
 * import io.cloudshiftdev.awscdk.services.glue.alpha.Database;
 * import io.cloudshiftdev.awscdk.services.glue.alpha.DataFormat;
 * import io.cloudshiftdev.awscdk.services.glue.alpha.Schema;
 * import io.cloudshiftdev.awscdk.services.lakeformation.CfnDataLakeSettings;
 * import io.cloudshiftdev.awscdk.services.lakeformation.CfnTag;
 * import io.cloudshiftdev.awscdk.services.lakeformation.CfnTagAssociation;
 * Stack stack;
 * String accountId;
 * String tagKey = "aws";
 * String[] tagValues = List.of("dev");
 * Database database = new Database(this, "Database");
 * S3Table table = S3Table.Builder.create(this, "Table")
 * .database(database)
 * .columns(List.of(Column.builder()
 * .name("col1")
 * .type(Schema.STRING)
 * .build(), Column.builder()
 * .name("col2")
 * .type(Schema.STRING)
 * .build()))
 * .dataFormat(DataFormat.CSV)
 * .build();
 * DefaultStackSynthesizer synthesizer = (DefaultStackSynthesizer)stack.getSynthesizer();
 * CfnDataLakeSettings.Builder.create(this, "DataLakeSettings")
 * .admins(List.of(DataLakePrincipalProperty.builder()
 * .dataLakePrincipalIdentifier(stack.formatArn(ArnComponents.builder()
 * .service("iam")
 * .resource("role")
 * .region("")
 * .account(accountId)
 * .resourceName("Admin")
 * .build()))
 * .build(), DataLakePrincipalProperty.builder()
 * // The CDK cloudformation execution role.
 * .dataLakePrincipalIdentifier(synthesizer.cloudFormationExecutionRoleArn.replace("${AWS::Partition}",
 * "aws"))
 * .build()))
 * .build();
 * CfnTag tag = CfnTag.Builder.create(this, "Tag")
 * .catalogId(accountId)
 * .tagKey(tagKey)
 * .tagValues(tagValues)
 * .build();
 * LFTagPairProperty lfTagPairProperty = LFTagPairProperty.builder()
 * .catalogId(accountId)
 * .tagKey(tagKey)
 * .tagValues(tagValues)
 * .build();
 * CfnTagAssociation tagAssociation = CfnTagAssociation.Builder.create(this, "TagAssociation")
 * .lfTags(List.of(lfTagPairProperty))
 * .resource(ResourceProperty.builder()
 * .tableWithColumns(TableWithColumnsResourceProperty.builder()
 * .databaseName(database.getDatabaseName())
 * .columnNames(List.of("col1", "col2"))
 * .catalogId(accountId)
 * .name(table.getTableName())
 * .build())
 * .build())
 * .build();
 * tagAssociation.node.addDependency(tag);
 * tagAssociation.node.addDependency(table);
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datalakesettings.html)
 */
public interface CfnDataLakeSettingsProps {
  /**
   * A list of AWS Lake Formation principals.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datalakesettings.html#cfn-lakeformation-datalakesettings-admins)
   */
  public fun admins(): Any? = unwrap(this).getAdmins()

  /**
   * Whether to allow Amazon EMR clusters or other third-party query engines to access data managed
   * by Lake Formation .
   *
   * If set to true, you allow Amazon EMR clusters or other third-party engines to access data in
   * Amazon S3 locations that are registered with Lake Formation .
   *
   * If false or null, no third-party query engines will be able to access data in Amazon S3
   * locations that are registered with Lake Formation.
   *
   * For more information, see [External data filtering
   * setting](https://docs.aws.amazon.com/lake-formation/latest/dg/initial-LF-setup.html#external-data-filter)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datalakesettings.html#cfn-lakeformation-datalakesettings-allowexternaldatafiltering)
   */
  public fun allowExternalDataFiltering(): Any? = unwrap(this).getAllowExternalDataFiltering()

  /**
   * Specifies whether query engines and applications can get credentials without IAM session tags
   * if the user has full table access.
   *
   * It provides query engines and applications performance benefits as well as simplifies data
   * access. Amazon EMR on Amazon EC2 is able to leverage this setting.
   *
   * For more information, see
   * [](https://docs.aws.amazon.com/lake-formation/latest/dg/using-cred-vending.html)
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datalakesettings.html#cfn-lakeformation-datalakesettings-allowfulltableexternaldataaccess)
   */
  public fun allowFullTableExternalDataAccess(): Any? =
      unwrap(this).getAllowFullTableExternalDataAccess()

  /**
   * Lake Formation relies on a privileged process secured by Amazon EMR or the third party
   * integrator to tag the user's role while assuming it.
   *
   * Lake Formation will publish the acceptable key-value pair, for example key =
   * "LakeFormationTrustedCaller" and value = "TRUE" and the third party integrator must properly tag
   * the temporary security credentials that will be used to call Lake Formation 's administrative API
   * operations.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datalakesettings.html#cfn-lakeformation-datalakesettings-authorizedsessiontagvaluelist)
   */
  public fun authorizedSessionTagValueList(): List<String> =
      unwrap(this).getAuthorizedSessionTagValueList() ?: emptyList()

  /**
   * Specifies whether access control on a newly created database is managed by Lake Formation
   * permissions or exclusively by IAM permissions.
   *
   * A null value indicates that the access is controlled by Lake Formation permissions. `ALL`
   * permissions assigned to `IAM_ALLOWED_PRINCIPALS` group indicates that the user's IAM permissions
   * determine the access to the database. This is referred to as the setting "Use only IAM access
   * control," and is to support backward compatibility with the AWS Glue permission model implemented
   * by IAM permissions.
   *
   * The only permitted values are an empty array or an array that contains a single JSON object
   * that grants `ALL` to `IAM_ALLOWED_PRINCIPALS` .
   *
   * For more information, see [Changing the default security settings for your data
   * lake](https://docs.aws.amazon.com/lake-formation/latest/dg/change-settings.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datalakesettings.html#cfn-lakeformation-datalakesettings-createdatabasedefaultpermissions)
   */
  public fun createDatabaseDefaultPermissions(): Any? =
      unwrap(this).getCreateDatabaseDefaultPermissions()

  /**
   * Specifies whether access control on a newly created table is managed by Lake Formation
   * permissions or exclusively by IAM permissions.
   *
   * A null value indicates that the access is controlled by Lake Formation permissions. `ALL`
   * permissions assigned to `IAM_ALLOWED_PRINCIPALS` group indicate that the user's IAM permissions
   * determine the access to the table. This is referred to as the setting "Use only IAM access
   * control," and is to support the backward compatibility with the AWS Glue permission model
   * implemented by IAM permissions.
   *
   * The only permitted values are an empty array or an array that contains a single JSON object
   * that grants `ALL` permissions to `IAM_ALLOWED_PRINCIPALS` .
   *
   * For more information, see [Changing the default security settings for your data
   * lake](https://docs.aws.amazon.com/lake-formation/latest/dg/change-settings.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datalakesettings.html#cfn-lakeformation-datalakesettings-createtabledefaultpermissions)
   */
  public fun createTableDefaultPermissions(): Any? = unwrap(this).getCreateTableDefaultPermissions()

  /**
   * A list of the account IDs of AWS accounts with Amazon EMR clusters or third-party engines that
   * are allwed to perform data filtering.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datalakesettings.html#cfn-lakeformation-datalakesettings-externaldatafilteringallowlist)
   */
  public fun externalDataFilteringAllowList(): Any? =
      unwrap(this).getExternalDataFilteringAllowList()

  /**
   * Specifies whether the data lake settings are updated by adding new values to the current
   * settings ( `APPEND` ) or by replacing the current settings with new settings ( `REPLACE` ).
   *
   *
   * If you choose `REPLACE` , your current data lake settings will be replaced with the new values
   * in your template.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datalakesettings.html#cfn-lakeformation-datalakesettings-mutationtype)
   */
  public fun mutationType(): String? = unwrap(this).getMutationType()

  /**
   * A key-value map that provides an additional configuration on your data lake.
   *
   * `CrossAccountVersion` is the key you can configure in the `Parameters` field. Accepted values
   * for the `CrossAccountVersion` key are 1, 2, and 3.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datalakesettings.html#cfn-lakeformation-datalakesettings-parameters)
   */
  public fun parameters(): Any? = unwrap(this).getParameters()

  /**
   * An array of UTF-8 strings.
   *
   * A list of the resource-owning account IDs that the caller's account can use to share their user
   * access details (user ARNs). The user ARNs can be logged in the resource owner's CloudTrail log.
   * You may want to specify this property when you are in a high-trust boundary, such as the same team
   * or company.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datalakesettings.html#cfn-lakeformation-datalakesettings-trustedresourceowners)
   */
  public fun trustedResourceOwners(): List<String> = unwrap(this).getTrustedResourceOwners() ?:
      emptyList()

  /**
   * A builder for [CfnDataLakeSettingsProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param admins A list of AWS Lake Formation principals.
     */
    public fun admins(admins: IResolvable)

    /**
     * @param admins A list of AWS Lake Formation principals.
     */
    public fun admins(admins: List<Any>)

    /**
     * @param admins A list of AWS Lake Formation principals.
     */
    public fun admins(vararg admins: Any)

    /**
     * @param allowExternalDataFiltering Whether to allow Amazon EMR clusters or other third-party
     * query engines to access data managed by Lake Formation .
     * If set to true, you allow Amazon EMR clusters or other third-party engines to access data in
     * Amazon S3 locations that are registered with Lake Formation .
     *
     * If false or null, no third-party query engines will be able to access data in Amazon S3
     * locations that are registered with Lake Formation.
     *
     * For more information, see [External data filtering
     * setting](https://docs.aws.amazon.com/lake-formation/latest/dg/initial-LF-setup.html#external-data-filter)
     * .
     */
    public fun allowExternalDataFiltering(allowExternalDataFiltering: Boolean)

    /**
     * @param allowExternalDataFiltering Whether to allow Amazon EMR clusters or other third-party
     * query engines to access data managed by Lake Formation .
     * If set to true, you allow Amazon EMR clusters or other third-party engines to access data in
     * Amazon S3 locations that are registered with Lake Formation .
     *
     * If false or null, no third-party query engines will be able to access data in Amazon S3
     * locations that are registered with Lake Formation.
     *
     * For more information, see [External data filtering
     * setting](https://docs.aws.amazon.com/lake-formation/latest/dg/initial-LF-setup.html#external-data-filter)
     * .
     */
    public fun allowExternalDataFiltering(allowExternalDataFiltering: IResolvable)

    /**
     * @param allowFullTableExternalDataAccess Specifies whether query engines and applications can
     * get credentials without IAM session tags if the user has full table access.
     * It provides query engines and applications performance benefits as well as simplifies data
     * access. Amazon EMR on Amazon EC2 is able to leverage this setting.
     *
     * For more information, see
     * [](https://docs.aws.amazon.com/lake-formation/latest/dg/using-cred-vending.html)
     */
    public fun allowFullTableExternalDataAccess(allowFullTableExternalDataAccess: Boolean)

    /**
     * @param allowFullTableExternalDataAccess Specifies whether query engines and applications can
     * get credentials without IAM session tags if the user has full table access.
     * It provides query engines and applications performance benefits as well as simplifies data
     * access. Amazon EMR on Amazon EC2 is able to leverage this setting.
     *
     * For more information, see
     * [](https://docs.aws.amazon.com/lake-formation/latest/dg/using-cred-vending.html)
     */
    public fun allowFullTableExternalDataAccess(allowFullTableExternalDataAccess: IResolvable)

    /**
     * @param authorizedSessionTagValueList Lake Formation relies on a privileged process secured by
     * Amazon EMR or the third party integrator to tag the user's role while assuming it.
     * Lake Formation will publish the acceptable key-value pair, for example key =
     * "LakeFormationTrustedCaller" and value = "TRUE" and the third party integrator must properly tag
     * the temporary security credentials that will be used to call Lake Formation 's administrative
     * API operations.
     */
    public fun authorizedSessionTagValueList(authorizedSessionTagValueList: List<String>)

    /**
     * @param authorizedSessionTagValueList Lake Formation relies on a privileged process secured by
     * Amazon EMR or the third party integrator to tag the user's role while assuming it.
     * Lake Formation will publish the acceptable key-value pair, for example key =
     * "LakeFormationTrustedCaller" and value = "TRUE" and the third party integrator must properly tag
     * the temporary security credentials that will be used to call Lake Formation 's administrative
     * API operations.
     */
    public fun authorizedSessionTagValueList(vararg authorizedSessionTagValueList: String)

    /**
     * @param createDatabaseDefaultPermissions Specifies whether access control on a newly created
     * database is managed by Lake Formation permissions or exclusively by IAM permissions.
     * A null value indicates that the access is controlled by Lake Formation permissions. `ALL`
     * permissions assigned to `IAM_ALLOWED_PRINCIPALS` group indicates that the user's IAM permissions
     * determine the access to the database. This is referred to as the setting "Use only IAM access
     * control," and is to support backward compatibility with the AWS Glue permission model
     * implemented by IAM permissions.
     *
     * The only permitted values are an empty array or an array that contains a single JSON object
     * that grants `ALL` to `IAM_ALLOWED_PRINCIPALS` .
     *
     * For more information, see [Changing the default security settings for your data
     * lake](https://docs.aws.amazon.com/lake-formation/latest/dg/change-settings.html) .
     */
    public fun createDatabaseDefaultPermissions(createDatabaseDefaultPermissions: IResolvable)

    /**
     * @param createDatabaseDefaultPermissions Specifies whether access control on a newly created
     * database is managed by Lake Formation permissions or exclusively by IAM permissions.
     * A null value indicates that the access is controlled by Lake Formation permissions. `ALL`
     * permissions assigned to `IAM_ALLOWED_PRINCIPALS` group indicates that the user's IAM permissions
     * determine the access to the database. This is referred to as the setting "Use only IAM access
     * control," and is to support backward compatibility with the AWS Glue permission model
     * implemented by IAM permissions.
     *
     * The only permitted values are an empty array or an array that contains a single JSON object
     * that grants `ALL` to `IAM_ALLOWED_PRINCIPALS` .
     *
     * For more information, see [Changing the default security settings for your data
     * lake](https://docs.aws.amazon.com/lake-formation/latest/dg/change-settings.html) .
     */
    public fun createDatabaseDefaultPermissions(createDatabaseDefaultPermissions: List<Any>)

    /**
     * @param createDatabaseDefaultPermissions Specifies whether access control on a newly created
     * database is managed by Lake Formation permissions or exclusively by IAM permissions.
     * A null value indicates that the access is controlled by Lake Formation permissions. `ALL`
     * permissions assigned to `IAM_ALLOWED_PRINCIPALS` group indicates that the user's IAM permissions
     * determine the access to the database. This is referred to as the setting "Use only IAM access
     * control," and is to support backward compatibility with the AWS Glue permission model
     * implemented by IAM permissions.
     *
     * The only permitted values are an empty array or an array that contains a single JSON object
     * that grants `ALL` to `IAM_ALLOWED_PRINCIPALS` .
     *
     * For more information, see [Changing the default security settings for your data
     * lake](https://docs.aws.amazon.com/lake-formation/latest/dg/change-settings.html) .
     */
    public fun createDatabaseDefaultPermissions(vararg createDatabaseDefaultPermissions: Any)

    /**
     * @param createTableDefaultPermissions Specifies whether access control on a newly created
     * table is managed by Lake Formation permissions or exclusively by IAM permissions.
     * A null value indicates that the access is controlled by Lake Formation permissions. `ALL`
     * permissions assigned to `IAM_ALLOWED_PRINCIPALS` group indicate that the user's IAM permissions
     * determine the access to the table. This is referred to as the setting "Use only IAM access
     * control," and is to support the backward compatibility with the AWS Glue permission model
     * implemented by IAM permissions.
     *
     * The only permitted values are an empty array or an array that contains a single JSON object
     * that grants `ALL` permissions to `IAM_ALLOWED_PRINCIPALS` .
     *
     * For more information, see [Changing the default security settings for your data
     * lake](https://docs.aws.amazon.com/lake-formation/latest/dg/change-settings.html) .
     */
    public fun createTableDefaultPermissions(createTableDefaultPermissions: IResolvable)

    /**
     * @param createTableDefaultPermissions Specifies whether access control on a newly created
     * table is managed by Lake Formation permissions or exclusively by IAM permissions.
     * A null value indicates that the access is controlled by Lake Formation permissions. `ALL`
     * permissions assigned to `IAM_ALLOWED_PRINCIPALS` group indicate that the user's IAM permissions
     * determine the access to the table. This is referred to as the setting "Use only IAM access
     * control," and is to support the backward compatibility with the AWS Glue permission model
     * implemented by IAM permissions.
     *
     * The only permitted values are an empty array or an array that contains a single JSON object
     * that grants `ALL` permissions to `IAM_ALLOWED_PRINCIPALS` .
     *
     * For more information, see [Changing the default security settings for your data
     * lake](https://docs.aws.amazon.com/lake-formation/latest/dg/change-settings.html) .
     */
    public fun createTableDefaultPermissions(createTableDefaultPermissions: List<Any>)

    /**
     * @param createTableDefaultPermissions Specifies whether access control on a newly created
     * table is managed by Lake Formation permissions or exclusively by IAM permissions.
     * A null value indicates that the access is controlled by Lake Formation permissions. `ALL`
     * permissions assigned to `IAM_ALLOWED_PRINCIPALS` group indicate that the user's IAM permissions
     * determine the access to the table. This is referred to as the setting "Use only IAM access
     * control," and is to support the backward compatibility with the AWS Glue permission model
     * implemented by IAM permissions.
     *
     * The only permitted values are an empty array or an array that contains a single JSON object
     * that grants `ALL` permissions to `IAM_ALLOWED_PRINCIPALS` .
     *
     * For more information, see [Changing the default security settings for your data
     * lake](https://docs.aws.amazon.com/lake-formation/latest/dg/change-settings.html) .
     */
    public fun createTableDefaultPermissions(vararg createTableDefaultPermissions: Any)

    /**
     * @param externalDataFilteringAllowList A list of the account IDs of AWS accounts with Amazon
     * EMR clusters or third-party engines that are allwed to perform data filtering.
     */
    public fun externalDataFilteringAllowList(externalDataFilteringAllowList: IResolvable)

    /**
     * @param externalDataFilteringAllowList A list of the account IDs of AWS accounts with Amazon
     * EMR clusters or third-party engines that are allwed to perform data filtering.
     */
    public fun externalDataFilteringAllowList(externalDataFilteringAllowList: List<Any>)

    /**
     * @param externalDataFilteringAllowList A list of the account IDs of AWS accounts with Amazon
     * EMR clusters or third-party engines that are allwed to perform data filtering.
     */
    public fun externalDataFilteringAllowList(vararg externalDataFilteringAllowList: Any)

    /**
     * @param mutationType Specifies whether the data lake settings are updated by adding new values
     * to the current settings ( `APPEND` ) or by replacing the current settings with new settings (
     * `REPLACE` ).
     *
     * If you choose `REPLACE` , your current data lake settings will be replaced with the new
     * values in your template.
     */
    public fun mutationType(mutationType: String)

    /**
     * @param parameters A key-value map that provides an additional configuration on your data
     * lake.
     * `CrossAccountVersion` is the key you can configure in the `Parameters` field. Accepted values
     * for the `CrossAccountVersion` key are 1, 2, and 3.
     */
    public fun parameters(parameters: Any)

    /**
     * @param trustedResourceOwners An array of UTF-8 strings.
     * A list of the resource-owning account IDs that the caller's account can use to share their
     * user access details (user ARNs). The user ARNs can be logged in the resource owner's CloudTrail
     * log. You may want to specify this property when you are in a high-trust boundary, such as the
     * same team or company.
     */
    public fun trustedResourceOwners(trustedResourceOwners: List<String>)

    /**
     * @param trustedResourceOwners An array of UTF-8 strings.
     * A list of the resource-owning account IDs that the caller's account can use to share their
     * user access details (user ARNs). The user ARNs can be logged in the resource owner's CloudTrail
     * log. You may want to specify this property when you are in a high-trust boundary, such as the
     * same team or company.
     */
    public fun trustedResourceOwners(vararg trustedResourceOwners: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lakeformation.CfnDataLakeSettingsProps.Builder =
        software.amazon.awscdk.services.lakeformation.CfnDataLakeSettingsProps.builder()

    /**
     * @param admins A list of AWS Lake Formation principals.
     */
    override fun admins(admins: IResolvable) {
      cdkBuilder.admins(admins.let(IResolvable::unwrap))
    }

    /**
     * @param admins A list of AWS Lake Formation principals.
     */
    override fun admins(admins: List<Any>) {
      cdkBuilder.admins(admins.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param admins A list of AWS Lake Formation principals.
     */
    override fun admins(vararg admins: Any): Unit = admins(admins.toList())

    /**
     * @param allowExternalDataFiltering Whether to allow Amazon EMR clusters or other third-party
     * query engines to access data managed by Lake Formation .
     * If set to true, you allow Amazon EMR clusters or other third-party engines to access data in
     * Amazon S3 locations that are registered with Lake Formation .
     *
     * If false or null, no third-party query engines will be able to access data in Amazon S3
     * locations that are registered with Lake Formation.
     *
     * For more information, see [External data filtering
     * setting](https://docs.aws.amazon.com/lake-formation/latest/dg/initial-LF-setup.html#external-data-filter)
     * .
     */
    override fun allowExternalDataFiltering(allowExternalDataFiltering: Boolean) {
      cdkBuilder.allowExternalDataFiltering(allowExternalDataFiltering)
    }

    /**
     * @param allowExternalDataFiltering Whether to allow Amazon EMR clusters or other third-party
     * query engines to access data managed by Lake Formation .
     * If set to true, you allow Amazon EMR clusters or other third-party engines to access data in
     * Amazon S3 locations that are registered with Lake Formation .
     *
     * If false or null, no third-party query engines will be able to access data in Amazon S3
     * locations that are registered with Lake Formation.
     *
     * For more information, see [External data filtering
     * setting](https://docs.aws.amazon.com/lake-formation/latest/dg/initial-LF-setup.html#external-data-filter)
     * .
     */
    override fun allowExternalDataFiltering(allowExternalDataFiltering: IResolvable) {
      cdkBuilder.allowExternalDataFiltering(allowExternalDataFiltering.let(IResolvable::unwrap))
    }

    /**
     * @param allowFullTableExternalDataAccess Specifies whether query engines and applications can
     * get credentials without IAM session tags if the user has full table access.
     * It provides query engines and applications performance benefits as well as simplifies data
     * access. Amazon EMR on Amazon EC2 is able to leverage this setting.
     *
     * For more information, see
     * [](https://docs.aws.amazon.com/lake-formation/latest/dg/using-cred-vending.html)
     */
    override fun allowFullTableExternalDataAccess(allowFullTableExternalDataAccess: Boolean) {
      cdkBuilder.allowFullTableExternalDataAccess(allowFullTableExternalDataAccess)
    }

    /**
     * @param allowFullTableExternalDataAccess Specifies whether query engines and applications can
     * get credentials without IAM session tags if the user has full table access.
     * It provides query engines and applications performance benefits as well as simplifies data
     * access. Amazon EMR on Amazon EC2 is able to leverage this setting.
     *
     * For more information, see
     * [](https://docs.aws.amazon.com/lake-formation/latest/dg/using-cred-vending.html)
     */
    override fun allowFullTableExternalDataAccess(allowFullTableExternalDataAccess: IResolvable) {
      cdkBuilder.allowFullTableExternalDataAccess(allowFullTableExternalDataAccess.let(IResolvable::unwrap))
    }

    /**
     * @param authorizedSessionTagValueList Lake Formation relies on a privileged process secured by
     * Amazon EMR or the third party integrator to tag the user's role while assuming it.
     * Lake Formation will publish the acceptable key-value pair, for example key =
     * "LakeFormationTrustedCaller" and value = "TRUE" and the third party integrator must properly tag
     * the temporary security credentials that will be used to call Lake Formation 's administrative
     * API operations.
     */
    override fun authorizedSessionTagValueList(authorizedSessionTagValueList: List<String>) {
      cdkBuilder.authorizedSessionTagValueList(authorizedSessionTagValueList)
    }

    /**
     * @param authorizedSessionTagValueList Lake Formation relies on a privileged process secured by
     * Amazon EMR or the third party integrator to tag the user's role while assuming it.
     * Lake Formation will publish the acceptable key-value pair, for example key =
     * "LakeFormationTrustedCaller" and value = "TRUE" and the third party integrator must properly tag
     * the temporary security credentials that will be used to call Lake Formation 's administrative
     * API operations.
     */
    override fun authorizedSessionTagValueList(vararg authorizedSessionTagValueList: String): Unit =
        authorizedSessionTagValueList(authorizedSessionTagValueList.toList())

    /**
     * @param createDatabaseDefaultPermissions Specifies whether access control on a newly created
     * database is managed by Lake Formation permissions or exclusively by IAM permissions.
     * A null value indicates that the access is controlled by Lake Formation permissions. `ALL`
     * permissions assigned to `IAM_ALLOWED_PRINCIPALS` group indicates that the user's IAM permissions
     * determine the access to the database. This is referred to as the setting "Use only IAM access
     * control," and is to support backward compatibility with the AWS Glue permission model
     * implemented by IAM permissions.
     *
     * The only permitted values are an empty array or an array that contains a single JSON object
     * that grants `ALL` to `IAM_ALLOWED_PRINCIPALS` .
     *
     * For more information, see [Changing the default security settings for your data
     * lake](https://docs.aws.amazon.com/lake-formation/latest/dg/change-settings.html) .
     */
    override fun createDatabaseDefaultPermissions(createDatabaseDefaultPermissions: IResolvable) {
      cdkBuilder.createDatabaseDefaultPermissions(createDatabaseDefaultPermissions.let(IResolvable::unwrap))
    }

    /**
     * @param createDatabaseDefaultPermissions Specifies whether access control on a newly created
     * database is managed by Lake Formation permissions or exclusively by IAM permissions.
     * A null value indicates that the access is controlled by Lake Formation permissions. `ALL`
     * permissions assigned to `IAM_ALLOWED_PRINCIPALS` group indicates that the user's IAM permissions
     * determine the access to the database. This is referred to as the setting "Use only IAM access
     * control," and is to support backward compatibility with the AWS Glue permission model
     * implemented by IAM permissions.
     *
     * The only permitted values are an empty array or an array that contains a single JSON object
     * that grants `ALL` to `IAM_ALLOWED_PRINCIPALS` .
     *
     * For more information, see [Changing the default security settings for your data
     * lake](https://docs.aws.amazon.com/lake-formation/latest/dg/change-settings.html) .
     */
    override fun createDatabaseDefaultPermissions(createDatabaseDefaultPermissions: List<Any>) {
      cdkBuilder.createDatabaseDefaultPermissions(createDatabaseDefaultPermissions.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param createDatabaseDefaultPermissions Specifies whether access control on a newly created
     * database is managed by Lake Formation permissions or exclusively by IAM permissions.
     * A null value indicates that the access is controlled by Lake Formation permissions. `ALL`
     * permissions assigned to `IAM_ALLOWED_PRINCIPALS` group indicates that the user's IAM permissions
     * determine the access to the database. This is referred to as the setting "Use only IAM access
     * control," and is to support backward compatibility with the AWS Glue permission model
     * implemented by IAM permissions.
     *
     * The only permitted values are an empty array or an array that contains a single JSON object
     * that grants `ALL` to `IAM_ALLOWED_PRINCIPALS` .
     *
     * For more information, see [Changing the default security settings for your data
     * lake](https://docs.aws.amazon.com/lake-formation/latest/dg/change-settings.html) .
     */
    override fun createDatabaseDefaultPermissions(vararg createDatabaseDefaultPermissions: Any):
        Unit = createDatabaseDefaultPermissions(createDatabaseDefaultPermissions.toList())

    /**
     * @param createTableDefaultPermissions Specifies whether access control on a newly created
     * table is managed by Lake Formation permissions or exclusively by IAM permissions.
     * A null value indicates that the access is controlled by Lake Formation permissions. `ALL`
     * permissions assigned to `IAM_ALLOWED_PRINCIPALS` group indicate that the user's IAM permissions
     * determine the access to the table. This is referred to as the setting "Use only IAM access
     * control," and is to support the backward compatibility with the AWS Glue permission model
     * implemented by IAM permissions.
     *
     * The only permitted values are an empty array or an array that contains a single JSON object
     * that grants `ALL` permissions to `IAM_ALLOWED_PRINCIPALS` .
     *
     * For more information, see [Changing the default security settings for your data
     * lake](https://docs.aws.amazon.com/lake-formation/latest/dg/change-settings.html) .
     */
    override fun createTableDefaultPermissions(createTableDefaultPermissions: IResolvable) {
      cdkBuilder.createTableDefaultPermissions(createTableDefaultPermissions.let(IResolvable::unwrap))
    }

    /**
     * @param createTableDefaultPermissions Specifies whether access control on a newly created
     * table is managed by Lake Formation permissions or exclusively by IAM permissions.
     * A null value indicates that the access is controlled by Lake Formation permissions. `ALL`
     * permissions assigned to `IAM_ALLOWED_PRINCIPALS` group indicate that the user's IAM permissions
     * determine the access to the table. This is referred to as the setting "Use only IAM access
     * control," and is to support the backward compatibility with the AWS Glue permission model
     * implemented by IAM permissions.
     *
     * The only permitted values are an empty array or an array that contains a single JSON object
     * that grants `ALL` permissions to `IAM_ALLOWED_PRINCIPALS` .
     *
     * For more information, see [Changing the default security settings for your data
     * lake](https://docs.aws.amazon.com/lake-formation/latest/dg/change-settings.html) .
     */
    override fun createTableDefaultPermissions(createTableDefaultPermissions: List<Any>) {
      cdkBuilder.createTableDefaultPermissions(createTableDefaultPermissions.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param createTableDefaultPermissions Specifies whether access control on a newly created
     * table is managed by Lake Formation permissions or exclusively by IAM permissions.
     * A null value indicates that the access is controlled by Lake Formation permissions. `ALL`
     * permissions assigned to `IAM_ALLOWED_PRINCIPALS` group indicate that the user's IAM permissions
     * determine the access to the table. This is referred to as the setting "Use only IAM access
     * control," and is to support the backward compatibility with the AWS Glue permission model
     * implemented by IAM permissions.
     *
     * The only permitted values are an empty array or an array that contains a single JSON object
     * that grants `ALL` permissions to `IAM_ALLOWED_PRINCIPALS` .
     *
     * For more information, see [Changing the default security settings for your data
     * lake](https://docs.aws.amazon.com/lake-formation/latest/dg/change-settings.html) .
     */
    override fun createTableDefaultPermissions(vararg createTableDefaultPermissions: Any): Unit =
        createTableDefaultPermissions(createTableDefaultPermissions.toList())

    /**
     * @param externalDataFilteringAllowList A list of the account IDs of AWS accounts with Amazon
     * EMR clusters or third-party engines that are allwed to perform data filtering.
     */
    override fun externalDataFilteringAllowList(externalDataFilteringAllowList: IResolvable) {
      cdkBuilder.externalDataFilteringAllowList(externalDataFilteringAllowList.let(IResolvable::unwrap))
    }

    /**
     * @param externalDataFilteringAllowList A list of the account IDs of AWS accounts with Amazon
     * EMR clusters or third-party engines that are allwed to perform data filtering.
     */
    override fun externalDataFilteringAllowList(externalDataFilteringAllowList: List<Any>) {
      cdkBuilder.externalDataFilteringAllowList(externalDataFilteringAllowList.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param externalDataFilteringAllowList A list of the account IDs of AWS accounts with Amazon
     * EMR clusters or third-party engines that are allwed to perform data filtering.
     */
    override fun externalDataFilteringAllowList(vararg externalDataFilteringAllowList: Any): Unit =
        externalDataFilteringAllowList(externalDataFilteringAllowList.toList())

    /**
     * @param mutationType Specifies whether the data lake settings are updated by adding new values
     * to the current settings ( `APPEND` ) or by replacing the current settings with new settings (
     * `REPLACE` ).
     *
     * If you choose `REPLACE` , your current data lake settings will be replaced with the new
     * values in your template.
     */
    override fun mutationType(mutationType: String) {
      cdkBuilder.mutationType(mutationType)
    }

    /**
     * @param parameters A key-value map that provides an additional configuration on your data
     * lake.
     * `CrossAccountVersion` is the key you can configure in the `Parameters` field. Accepted values
     * for the `CrossAccountVersion` key are 1, 2, and 3.
     */
    override fun parameters(parameters: Any) {
      cdkBuilder.parameters(parameters)
    }

    /**
     * @param trustedResourceOwners An array of UTF-8 strings.
     * A list of the resource-owning account IDs that the caller's account can use to share their
     * user access details (user ARNs). The user ARNs can be logged in the resource owner's CloudTrail
     * log. You may want to specify this property when you are in a high-trust boundary, such as the
     * same team or company.
     */
    override fun trustedResourceOwners(trustedResourceOwners: List<String>) {
      cdkBuilder.trustedResourceOwners(trustedResourceOwners)
    }

    /**
     * @param trustedResourceOwners An array of UTF-8 strings.
     * A list of the resource-owning account IDs that the caller's account can use to share their
     * user access details (user ARNs). The user ARNs can be logged in the resource owner's CloudTrail
     * log. You may want to specify this property when you are in a high-trust boundary, such as the
     * same team or company.
     */
    override fun trustedResourceOwners(vararg trustedResourceOwners: String): Unit =
        trustedResourceOwners(trustedResourceOwners.toList())

    public fun build(): software.amazon.awscdk.services.lakeformation.CfnDataLakeSettingsProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lakeformation.CfnDataLakeSettingsProps,
  ) : CdkObject(cdkObject), CfnDataLakeSettingsProps {
    /**
     * A list of AWS Lake Formation principals.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datalakesettings.html#cfn-lakeformation-datalakesettings-admins)
     */
    override fun admins(): Any? = unwrap(this).getAdmins()

    /**
     * Whether to allow Amazon EMR clusters or other third-party query engines to access data
     * managed by Lake Formation .
     *
     * If set to true, you allow Amazon EMR clusters or other third-party engines to access data in
     * Amazon S3 locations that are registered with Lake Formation .
     *
     * If false or null, no third-party query engines will be able to access data in Amazon S3
     * locations that are registered with Lake Formation.
     *
     * For more information, see [External data filtering
     * setting](https://docs.aws.amazon.com/lake-formation/latest/dg/initial-LF-setup.html#external-data-filter)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datalakesettings.html#cfn-lakeformation-datalakesettings-allowexternaldatafiltering)
     */
    override fun allowExternalDataFiltering(): Any? = unwrap(this).getAllowExternalDataFiltering()

    /**
     * Specifies whether query engines and applications can get credentials without IAM session tags
     * if the user has full table access.
     *
     * It provides query engines and applications performance benefits as well as simplifies data
     * access. Amazon EMR on Amazon EC2 is able to leverage this setting.
     *
     * For more information, see
     * [](https://docs.aws.amazon.com/lake-formation/latest/dg/using-cred-vending.html)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datalakesettings.html#cfn-lakeformation-datalakesettings-allowfulltableexternaldataaccess)
     */
    override fun allowFullTableExternalDataAccess(): Any? =
        unwrap(this).getAllowFullTableExternalDataAccess()

    /**
     * Lake Formation relies on a privileged process secured by Amazon EMR or the third party
     * integrator to tag the user's role while assuming it.
     *
     * Lake Formation will publish the acceptable key-value pair, for example key =
     * "LakeFormationTrustedCaller" and value = "TRUE" and the third party integrator must properly tag
     * the temporary security credentials that will be used to call Lake Formation 's administrative
     * API operations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datalakesettings.html#cfn-lakeformation-datalakesettings-authorizedsessiontagvaluelist)
     */
    override fun authorizedSessionTagValueList(): List<String> =
        unwrap(this).getAuthorizedSessionTagValueList() ?: emptyList()

    /**
     * Specifies whether access control on a newly created database is managed by Lake Formation
     * permissions or exclusively by IAM permissions.
     *
     * A null value indicates that the access is controlled by Lake Formation permissions. `ALL`
     * permissions assigned to `IAM_ALLOWED_PRINCIPALS` group indicates that the user's IAM permissions
     * determine the access to the database. This is referred to as the setting "Use only IAM access
     * control," and is to support backward compatibility with the AWS Glue permission model
     * implemented by IAM permissions.
     *
     * The only permitted values are an empty array or an array that contains a single JSON object
     * that grants `ALL` to `IAM_ALLOWED_PRINCIPALS` .
     *
     * For more information, see [Changing the default security settings for your data
     * lake](https://docs.aws.amazon.com/lake-formation/latest/dg/change-settings.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datalakesettings.html#cfn-lakeformation-datalakesettings-createdatabasedefaultpermissions)
     */
    override fun createDatabaseDefaultPermissions(): Any? =
        unwrap(this).getCreateDatabaseDefaultPermissions()

    /**
     * Specifies whether access control on a newly created table is managed by Lake Formation
     * permissions or exclusively by IAM permissions.
     *
     * A null value indicates that the access is controlled by Lake Formation permissions. `ALL`
     * permissions assigned to `IAM_ALLOWED_PRINCIPALS` group indicate that the user's IAM permissions
     * determine the access to the table. This is referred to as the setting "Use only IAM access
     * control," and is to support the backward compatibility with the AWS Glue permission model
     * implemented by IAM permissions.
     *
     * The only permitted values are an empty array or an array that contains a single JSON object
     * that grants `ALL` permissions to `IAM_ALLOWED_PRINCIPALS` .
     *
     * For more information, see [Changing the default security settings for your data
     * lake](https://docs.aws.amazon.com/lake-formation/latest/dg/change-settings.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datalakesettings.html#cfn-lakeformation-datalakesettings-createtabledefaultpermissions)
     */
    override fun createTableDefaultPermissions(): Any? =
        unwrap(this).getCreateTableDefaultPermissions()

    /**
     * A list of the account IDs of AWS accounts with Amazon EMR clusters or third-party engines
     * that are allwed to perform data filtering.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datalakesettings.html#cfn-lakeformation-datalakesettings-externaldatafilteringallowlist)
     */
    override fun externalDataFilteringAllowList(): Any? =
        unwrap(this).getExternalDataFilteringAllowList()

    /**
     * Specifies whether the data lake settings are updated by adding new values to the current
     * settings ( `APPEND` ) or by replacing the current settings with new settings ( `REPLACE` ).
     *
     *
     * If you choose `REPLACE` , your current data lake settings will be replaced with the new
     * values in your template.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datalakesettings.html#cfn-lakeformation-datalakesettings-mutationtype)
     */
    override fun mutationType(): String? = unwrap(this).getMutationType()

    /**
     * A key-value map that provides an additional configuration on your data lake.
     *
     * `CrossAccountVersion` is the key you can configure in the `Parameters` field. Accepted values
     * for the `CrossAccountVersion` key are 1, 2, and 3.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datalakesettings.html#cfn-lakeformation-datalakesettings-parameters)
     */
    override fun parameters(): Any? = unwrap(this).getParameters()

    /**
     * An array of UTF-8 strings.
     *
     * A list of the resource-owning account IDs that the caller's account can use to share their
     * user access details (user ARNs). The user ARNs can be logged in the resource owner's CloudTrail
     * log. You may want to specify this property when you are in a high-trust boundary, such as the
     * same team or company.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datalakesettings.html#cfn-lakeformation-datalakesettings-trustedresourceowners)
     */
    override fun trustedResourceOwners(): List<String> = unwrap(this).getTrustedResourceOwners() ?:
        emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDataLakeSettingsProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnDataLakeSettingsProps):
        CfnDataLakeSettingsProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDataLakeSettingsProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDataLakeSettingsProps):
        software.amazon.awscdk.services.lakeformation.CfnDataLakeSettingsProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.lakeformation.CfnDataLakeSettingsProps
  }
}

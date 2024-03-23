@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lakeformation

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::LakeFormation::DataLakeSettings` resource is an AWS Lake Formation resource type that
 * manages the data lake settings for your account.
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
public open class CfnDataLakeSettings(
  cdkObject: software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings,
) : CfnResource(cdkObject), IInspectable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDataLakeSettingsProps,
  ) :
      this(software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnDataLakeSettingsProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDataLakeSettingsProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDataLakeSettingsProps(props)
  )

  /**
   * A list of AWS Lake Formation principals.
   */
  public open fun admins(): Any? = unwrap(this).getAdmins()

  /**
   * A list of AWS Lake Formation principals.
   */
  public open fun admins(`value`: IResolvable) {
    unwrap(this).setAdmins(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of AWS Lake Formation principals.
   */
  public open fun admins(`value`: List<Any>) {
    unwrap(this).setAdmins(`value`)
  }

  /**
   * A list of AWS Lake Formation principals.
   */
  public open fun admins(vararg `value`: Any): Unit = admins(`value`.toList())

  /**
   * Whether to allow Amazon EMR clusters or other third-party query engines to access data managed
   * by Lake Formation .
   */
  public open fun allowExternalDataFiltering(): Any? = unwrap(this).getAllowExternalDataFiltering()

  /**
   * Whether to allow Amazon EMR clusters or other third-party query engines to access data managed
   * by Lake Formation .
   */
  public open fun allowExternalDataFiltering(`value`: Boolean) {
    unwrap(this).setAllowExternalDataFiltering(`value`)
  }

  /**
   * Whether to allow Amazon EMR clusters or other third-party query engines to access data managed
   * by Lake Formation .
   */
  public open fun allowExternalDataFiltering(`value`: IResolvable) {
    unwrap(this).setAllowExternalDataFiltering(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies whether query engines and applications can get credentials without IAM session tags
   * if the user has full table access.
   */
  public open fun allowFullTableExternalDataAccess(): Any? =
      unwrap(this).getAllowFullTableExternalDataAccess()

  /**
   * Specifies whether query engines and applications can get credentials without IAM session tags
   * if the user has full table access.
   */
  public open fun allowFullTableExternalDataAccess(`value`: Boolean) {
    unwrap(this).setAllowFullTableExternalDataAccess(`value`)
  }

  /**
   * Specifies whether query engines and applications can get credentials without IAM session tags
   * if the user has full table access.
   */
  public open fun allowFullTableExternalDataAccess(`value`: IResolvable) {
    unwrap(this).setAllowFullTableExternalDataAccess(`value`.let(IResolvable::unwrap))
  }

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Lake Formation relies on a privileged process secured by Amazon EMR or the third party
   * integrator to tag the user's role while assuming it.
   */
  public open fun authorizedSessionTagValueList(): List<String> =
      unwrap(this).getAuthorizedSessionTagValueList() ?: emptyList()

  /**
   * Lake Formation relies on a privileged process secured by Amazon EMR or the third party
   * integrator to tag the user's role while assuming it.
   */
  public open fun authorizedSessionTagValueList(`value`: List<String>) {
    unwrap(this).setAuthorizedSessionTagValueList(`value`)
  }

  /**
   * Lake Formation relies on a privileged process secured by Amazon EMR or the third party
   * integrator to tag the user's role while assuming it.
   */
  public open fun authorizedSessionTagValueList(vararg `value`: String): Unit =
      authorizedSessionTagValueList(`value`.toList())

  /**
   * Specifies whether access control on a newly created database is managed by Lake Formation
   * permissions or exclusively by IAM permissions.
   */
  public open fun createDatabaseDefaultPermissions(): Any? =
      unwrap(this).getCreateDatabaseDefaultPermissions()

  /**
   * Specifies whether access control on a newly created database is managed by Lake Formation
   * permissions or exclusively by IAM permissions.
   */
  public open fun createDatabaseDefaultPermissions(`value`: IResolvable) {
    unwrap(this).setCreateDatabaseDefaultPermissions(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies whether access control on a newly created database is managed by Lake Formation
   * permissions or exclusively by IAM permissions.
   */
  public open fun createDatabaseDefaultPermissions(`value`: List<Any>) {
    unwrap(this).setCreateDatabaseDefaultPermissions(`value`)
  }

  /**
   * Specifies whether access control on a newly created database is managed by Lake Formation
   * permissions or exclusively by IAM permissions.
   */
  public open fun createDatabaseDefaultPermissions(vararg `value`: Any): Unit =
      createDatabaseDefaultPermissions(`value`.toList())

  /**
   * Specifies whether access control on a newly created table is managed by Lake Formation
   * permissions or exclusively by IAM permissions.
   */
  public open fun createTableDefaultPermissions(): Any? =
      unwrap(this).getCreateTableDefaultPermissions()

  /**
   * Specifies whether access control on a newly created table is managed by Lake Formation
   * permissions or exclusively by IAM permissions.
   */
  public open fun createTableDefaultPermissions(`value`: IResolvable) {
    unwrap(this).setCreateTableDefaultPermissions(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies whether access control on a newly created table is managed by Lake Formation
   * permissions or exclusively by IAM permissions.
   */
  public open fun createTableDefaultPermissions(`value`: List<Any>) {
    unwrap(this).setCreateTableDefaultPermissions(`value`)
  }

  /**
   * Specifies whether access control on a newly created table is managed by Lake Formation
   * permissions or exclusively by IAM permissions.
   */
  public open fun createTableDefaultPermissions(vararg `value`: Any): Unit =
      createTableDefaultPermissions(`value`.toList())

  /**
   * A list of the account IDs of AWS accounts with Amazon EMR clusters or third-party engines that
   * are allwed to perform data filtering.
   */
  public open fun externalDataFilteringAllowList(): Any? =
      unwrap(this).getExternalDataFilteringAllowList()

  /**
   * A list of the account IDs of AWS accounts with Amazon EMR clusters or third-party engines that
   * are allwed to perform data filtering.
   */
  public open fun externalDataFilteringAllowList(`value`: IResolvable) {
    unwrap(this).setExternalDataFilteringAllowList(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of the account IDs of AWS accounts with Amazon EMR clusters or third-party engines that
   * are allwed to perform data filtering.
   */
  public open fun externalDataFilteringAllowList(`value`: List<Any>) {
    unwrap(this).setExternalDataFilteringAllowList(`value`)
  }

  /**
   * A list of the account IDs of AWS accounts with Amazon EMR clusters or third-party engines that
   * are allwed to perform data filtering.
   */
  public open fun externalDataFilteringAllowList(vararg `value`: Any): Unit =
      externalDataFilteringAllowList(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Specifies whether the data lake settings are updated by adding new values to the current
   * settings ( `APPEND` ) or by replacing the current settings with new settings ( `REPLACE` ).
   */
  public open fun mutationType(): String? = unwrap(this).getMutationType()

  /**
   * Specifies whether the data lake settings are updated by adding new values to the current
   * settings ( `APPEND` ) or by replacing the current settings with new settings ( `REPLACE` ).
   */
  public open fun mutationType(`value`: String) {
    unwrap(this).setMutationType(`value`)
  }

  /**
   * A key-value map that provides an additional configuration on your data lake.
   */
  public open fun parameters(): Any? = unwrap(this).getParameters()

  /**
   * A key-value map that provides an additional configuration on your data lake.
   */
  public open fun parameters(`value`: Any) {
    unwrap(this).setParameters(`value`)
  }

  /**
   * An array of UTF-8 strings.
   */
  public open fun trustedResourceOwners(): List<String> = unwrap(this).getTrustedResourceOwners() ?:
      emptyList()

  /**
   * An array of UTF-8 strings.
   */
  public open fun trustedResourceOwners(`value`: List<String>) {
    unwrap(this).setTrustedResourceOwners(`value`)
  }

  /**
   * An array of UTF-8 strings.
   */
  public open fun trustedResourceOwners(vararg `value`: String): Unit =
      trustedResourceOwners(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.lakeformation.CfnDataLakeSettings].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A list of AWS Lake Formation principals.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datalakesettings.html#cfn-lakeformation-datalakesettings-admins)
     * @param admins A list of AWS Lake Formation principals. 
     */
    public fun admins(admins: IResolvable)

    /**
     * A list of AWS Lake Formation principals.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datalakesettings.html#cfn-lakeformation-datalakesettings-admins)
     * @param admins A list of AWS Lake Formation principals. 
     */
    public fun admins(admins: List<Any>)

    /**
     * A list of AWS Lake Formation principals.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datalakesettings.html#cfn-lakeformation-datalakesettings-admins)
     * @param admins A list of AWS Lake Formation principals. 
     */
    public fun admins(vararg admins: Any)

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
     * @param allowExternalDataFiltering Whether to allow Amazon EMR clusters or other third-party
     * query engines to access data managed by Lake Formation . 
     */
    public fun allowExternalDataFiltering(allowExternalDataFiltering: Boolean)

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
     * @param allowExternalDataFiltering Whether to allow Amazon EMR clusters or other third-party
     * query engines to access data managed by Lake Formation . 
     */
    public fun allowExternalDataFiltering(allowExternalDataFiltering: IResolvable)

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
     * @param allowFullTableExternalDataAccess Specifies whether query engines and applications can
     * get credentials without IAM session tags if the user has full table access. 
     */
    public fun allowFullTableExternalDataAccess(allowFullTableExternalDataAccess: Boolean)

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
     * @param allowFullTableExternalDataAccess Specifies whether query engines and applications can
     * get credentials without IAM session tags if the user has full table access. 
     */
    public fun allowFullTableExternalDataAccess(allowFullTableExternalDataAccess: IResolvable)

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
     * @param authorizedSessionTagValueList Lake Formation relies on a privileged process secured by
     * Amazon EMR or the third party integrator to tag the user's role while assuming it. 
     */
    public fun authorizedSessionTagValueList(authorizedSessionTagValueList: List<String>)

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
     * @param authorizedSessionTagValueList Lake Formation relies on a privileged process secured by
     * Amazon EMR or the third party integrator to tag the user's role while assuming it. 
     */
    public fun authorizedSessionTagValueList(vararg authorizedSessionTagValueList: String)

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
     * @param createDatabaseDefaultPermissions Specifies whether access control on a newly created
     * database is managed by Lake Formation permissions or exclusively by IAM permissions. 
     */
    public fun createDatabaseDefaultPermissions(createDatabaseDefaultPermissions: IResolvable)

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
     * @param createDatabaseDefaultPermissions Specifies whether access control on a newly created
     * database is managed by Lake Formation permissions or exclusively by IAM permissions. 
     */
    public fun createDatabaseDefaultPermissions(createDatabaseDefaultPermissions: List<Any>)

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
     * @param createDatabaseDefaultPermissions Specifies whether access control on a newly created
     * database is managed by Lake Formation permissions or exclusively by IAM permissions. 
     */
    public fun createDatabaseDefaultPermissions(vararg createDatabaseDefaultPermissions: Any)

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
     * @param createTableDefaultPermissions Specifies whether access control on a newly created
     * table is managed by Lake Formation permissions or exclusively by IAM permissions. 
     */
    public fun createTableDefaultPermissions(createTableDefaultPermissions: IResolvable)

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
     * @param createTableDefaultPermissions Specifies whether access control on a newly created
     * table is managed by Lake Formation permissions or exclusively by IAM permissions. 
     */
    public fun createTableDefaultPermissions(createTableDefaultPermissions: List<Any>)

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
     * @param createTableDefaultPermissions Specifies whether access control on a newly created
     * table is managed by Lake Formation permissions or exclusively by IAM permissions. 
     */
    public fun createTableDefaultPermissions(vararg createTableDefaultPermissions: Any)

    /**
     * A list of the account IDs of AWS accounts with Amazon EMR clusters or third-party engines
     * that are allwed to perform data filtering.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datalakesettings.html#cfn-lakeformation-datalakesettings-externaldatafilteringallowlist)
     * @param externalDataFilteringAllowList A list of the account IDs of AWS accounts with Amazon
     * EMR clusters or third-party engines that are allwed to perform data filtering. 
     */
    public fun externalDataFilteringAllowList(externalDataFilteringAllowList: IResolvable)

    /**
     * A list of the account IDs of AWS accounts with Amazon EMR clusters or third-party engines
     * that are allwed to perform data filtering.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datalakesettings.html#cfn-lakeformation-datalakesettings-externaldatafilteringallowlist)
     * @param externalDataFilteringAllowList A list of the account IDs of AWS accounts with Amazon
     * EMR clusters or third-party engines that are allwed to perform data filtering. 
     */
    public fun externalDataFilteringAllowList(externalDataFilteringAllowList: List<Any>)

    /**
     * A list of the account IDs of AWS accounts with Amazon EMR clusters or third-party engines
     * that are allwed to perform data filtering.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datalakesettings.html#cfn-lakeformation-datalakesettings-externaldatafilteringallowlist)
     * @param externalDataFilteringAllowList A list of the account IDs of AWS accounts with Amazon
     * EMR clusters or third-party engines that are allwed to perform data filtering. 
     */
    public fun externalDataFilteringAllowList(vararg externalDataFilteringAllowList: Any)

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
     * @param mutationType Specifies whether the data lake settings are updated by adding new values
     * to the current settings ( `APPEND` ) or by replacing the current settings with new settings (
     * `REPLACE` ). 
     */
    public fun mutationType(mutationType: String)

    /**
     * A key-value map that provides an additional configuration on your data lake.
     *
     * `CrossAccountVersion` is the key you can configure in the `Parameters` field. Accepted values
     * for the `CrossAccountVersion` key are 1, 2, and 3.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datalakesettings.html#cfn-lakeformation-datalakesettings-parameters)
     * @param parameters A key-value map that provides an additional configuration on your data
     * lake. 
     */
    public fun parameters(parameters: Any)

    /**
     * An array of UTF-8 strings.
     *
     * A list of the resource-owning account IDs that the caller's account can use to share their
     * user access details (user ARNs). The user ARNs can be logged in the resource owner's CloudTrail
     * log. You may want to specify this property when you are in a high-trust boundary, such as the
     * same team or company.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datalakesettings.html#cfn-lakeformation-datalakesettings-trustedresourceowners)
     * @param trustedResourceOwners An array of UTF-8 strings. 
     */
    public fun trustedResourceOwners(trustedResourceOwners: List<String>)

    /**
     * An array of UTF-8 strings.
     *
     * A list of the resource-owning account IDs that the caller's account can use to share their
     * user access details (user ARNs). The user ARNs can be logged in the resource owner's CloudTrail
     * log. You may want to specify this property when you are in a high-trust boundary, such as the
     * same team or company.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datalakesettings.html#cfn-lakeformation-datalakesettings-trustedresourceowners)
     * @param trustedResourceOwners An array of UTF-8 strings. 
     */
    public fun trustedResourceOwners(vararg trustedResourceOwners: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings.Builder =
        software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings.Builder.create(scope, id)

    /**
     * A list of AWS Lake Formation principals.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datalakesettings.html#cfn-lakeformation-datalakesettings-admins)
     * @param admins A list of AWS Lake Formation principals. 
     */
    override fun admins(admins: IResolvable) {
      cdkBuilder.admins(admins.let(IResolvable::unwrap))
    }

    /**
     * A list of AWS Lake Formation principals.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datalakesettings.html#cfn-lakeformation-datalakesettings-admins)
     * @param admins A list of AWS Lake Formation principals. 
     */
    override fun admins(admins: List<Any>) {
      cdkBuilder.admins(admins)
    }

    /**
     * A list of AWS Lake Formation principals.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datalakesettings.html#cfn-lakeformation-datalakesettings-admins)
     * @param admins A list of AWS Lake Formation principals. 
     */
    override fun admins(vararg admins: Any): Unit = admins(admins.toList())

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
     * @param allowExternalDataFiltering Whether to allow Amazon EMR clusters or other third-party
     * query engines to access data managed by Lake Formation . 
     */
    override fun allowExternalDataFiltering(allowExternalDataFiltering: Boolean) {
      cdkBuilder.allowExternalDataFiltering(allowExternalDataFiltering)
    }

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
     * @param allowExternalDataFiltering Whether to allow Amazon EMR clusters or other third-party
     * query engines to access data managed by Lake Formation . 
     */
    override fun allowExternalDataFiltering(allowExternalDataFiltering: IResolvable) {
      cdkBuilder.allowExternalDataFiltering(allowExternalDataFiltering.let(IResolvable::unwrap))
    }

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
     * @param allowFullTableExternalDataAccess Specifies whether query engines and applications can
     * get credentials without IAM session tags if the user has full table access. 
     */
    override fun allowFullTableExternalDataAccess(allowFullTableExternalDataAccess: Boolean) {
      cdkBuilder.allowFullTableExternalDataAccess(allowFullTableExternalDataAccess)
    }

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
     * @param allowFullTableExternalDataAccess Specifies whether query engines and applications can
     * get credentials without IAM session tags if the user has full table access. 
     */
    override fun allowFullTableExternalDataAccess(allowFullTableExternalDataAccess: IResolvable) {
      cdkBuilder.allowFullTableExternalDataAccess(allowFullTableExternalDataAccess.let(IResolvable::unwrap))
    }

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
     * @param authorizedSessionTagValueList Lake Formation relies on a privileged process secured by
     * Amazon EMR or the third party integrator to tag the user's role while assuming it. 
     */
    override fun authorizedSessionTagValueList(authorizedSessionTagValueList: List<String>) {
      cdkBuilder.authorizedSessionTagValueList(authorizedSessionTagValueList)
    }

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
     * @param authorizedSessionTagValueList Lake Formation relies on a privileged process secured by
     * Amazon EMR or the third party integrator to tag the user's role while assuming it. 
     */
    override fun authorizedSessionTagValueList(vararg authorizedSessionTagValueList: String): Unit =
        authorizedSessionTagValueList(authorizedSessionTagValueList.toList())

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
     * @param createDatabaseDefaultPermissions Specifies whether access control on a newly created
     * database is managed by Lake Formation permissions or exclusively by IAM permissions. 
     */
    override fun createDatabaseDefaultPermissions(createDatabaseDefaultPermissions: IResolvable) {
      cdkBuilder.createDatabaseDefaultPermissions(createDatabaseDefaultPermissions.let(IResolvable::unwrap))
    }

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
     * @param createDatabaseDefaultPermissions Specifies whether access control on a newly created
     * database is managed by Lake Formation permissions or exclusively by IAM permissions. 
     */
    override fun createDatabaseDefaultPermissions(createDatabaseDefaultPermissions: List<Any>) {
      cdkBuilder.createDatabaseDefaultPermissions(createDatabaseDefaultPermissions)
    }

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
     * @param createDatabaseDefaultPermissions Specifies whether access control on a newly created
     * database is managed by Lake Formation permissions or exclusively by IAM permissions. 
     */
    override fun createDatabaseDefaultPermissions(vararg createDatabaseDefaultPermissions: Any):
        Unit = createDatabaseDefaultPermissions(createDatabaseDefaultPermissions.toList())

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
     * @param createTableDefaultPermissions Specifies whether access control on a newly created
     * table is managed by Lake Formation permissions or exclusively by IAM permissions. 
     */
    override fun createTableDefaultPermissions(createTableDefaultPermissions: IResolvable) {
      cdkBuilder.createTableDefaultPermissions(createTableDefaultPermissions.let(IResolvable::unwrap))
    }

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
     * @param createTableDefaultPermissions Specifies whether access control on a newly created
     * table is managed by Lake Formation permissions or exclusively by IAM permissions. 
     */
    override fun createTableDefaultPermissions(createTableDefaultPermissions: List<Any>) {
      cdkBuilder.createTableDefaultPermissions(createTableDefaultPermissions)
    }

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
     * @param createTableDefaultPermissions Specifies whether access control on a newly created
     * table is managed by Lake Formation permissions or exclusively by IAM permissions. 
     */
    override fun createTableDefaultPermissions(vararg createTableDefaultPermissions: Any): Unit =
        createTableDefaultPermissions(createTableDefaultPermissions.toList())

    /**
     * A list of the account IDs of AWS accounts with Amazon EMR clusters or third-party engines
     * that are allwed to perform data filtering.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datalakesettings.html#cfn-lakeformation-datalakesettings-externaldatafilteringallowlist)
     * @param externalDataFilteringAllowList A list of the account IDs of AWS accounts with Amazon
     * EMR clusters or third-party engines that are allwed to perform data filtering. 
     */
    override fun externalDataFilteringAllowList(externalDataFilteringAllowList: IResolvable) {
      cdkBuilder.externalDataFilteringAllowList(externalDataFilteringAllowList.let(IResolvable::unwrap))
    }

    /**
     * A list of the account IDs of AWS accounts with Amazon EMR clusters or third-party engines
     * that are allwed to perform data filtering.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datalakesettings.html#cfn-lakeformation-datalakesettings-externaldatafilteringallowlist)
     * @param externalDataFilteringAllowList A list of the account IDs of AWS accounts with Amazon
     * EMR clusters or third-party engines that are allwed to perform data filtering. 
     */
    override fun externalDataFilteringAllowList(externalDataFilteringAllowList: List<Any>) {
      cdkBuilder.externalDataFilteringAllowList(externalDataFilteringAllowList)
    }

    /**
     * A list of the account IDs of AWS accounts with Amazon EMR clusters or third-party engines
     * that are allwed to perform data filtering.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datalakesettings.html#cfn-lakeformation-datalakesettings-externaldatafilteringallowlist)
     * @param externalDataFilteringAllowList A list of the account IDs of AWS accounts with Amazon
     * EMR clusters or third-party engines that are allwed to perform data filtering. 
     */
    override fun externalDataFilteringAllowList(vararg externalDataFilteringAllowList: Any): Unit =
        externalDataFilteringAllowList(externalDataFilteringAllowList.toList())

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
     * @param mutationType Specifies whether the data lake settings are updated by adding new values
     * to the current settings ( `APPEND` ) or by replacing the current settings with new settings (
     * `REPLACE` ). 
     */
    override fun mutationType(mutationType: String) {
      cdkBuilder.mutationType(mutationType)
    }

    /**
     * A key-value map that provides an additional configuration on your data lake.
     *
     * `CrossAccountVersion` is the key you can configure in the `Parameters` field. Accepted values
     * for the `CrossAccountVersion` key are 1, 2, and 3.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datalakesettings.html#cfn-lakeformation-datalakesettings-parameters)
     * @param parameters A key-value map that provides an additional configuration on your data
     * lake. 
     */
    override fun parameters(parameters: Any) {
      cdkBuilder.parameters(parameters)
    }

    /**
     * An array of UTF-8 strings.
     *
     * A list of the resource-owning account IDs that the caller's account can use to share their
     * user access details (user ARNs). The user ARNs can be logged in the resource owner's CloudTrail
     * log. You may want to specify this property when you are in a high-trust boundary, such as the
     * same team or company.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datalakesettings.html#cfn-lakeformation-datalakesettings-trustedresourceowners)
     * @param trustedResourceOwners An array of UTF-8 strings. 
     */
    override fun trustedResourceOwners(trustedResourceOwners: List<String>) {
      cdkBuilder.trustedResourceOwners(trustedResourceOwners)
    }

    /**
     * An array of UTF-8 strings.
     *
     * A list of the resource-owning account IDs that the caller's account can use to share their
     * user access details (user ARNs). The user ARNs can be logged in the resource owner's CloudTrail
     * log. You may want to specify this property when you are in a high-trust boundary, such as the
     * same team or company.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datalakesettings.html#cfn-lakeformation-datalakesettings-trustedresourceowners)
     * @param trustedResourceOwners An array of UTF-8 strings. 
     */
    override fun trustedResourceOwners(vararg trustedResourceOwners: String): Unit =
        trustedResourceOwners(trustedResourceOwners.toList())

    public fun build(): software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDataLakeSettings {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDataLakeSettings(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings):
        CfnDataLakeSettings = CfnDataLakeSettings(cdkObject)

    internal fun unwrap(wrapped: CfnDataLakeSettings):
        software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings = wrapped.cdkObject as
        software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings
  }

  /**
   * The Lake Formation principal.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lakeformation.*;
   * DataLakePrincipalProperty dataLakePrincipalProperty = DataLakePrincipalProperty.builder()
   * .dataLakePrincipalIdentifier("dataLakePrincipalIdentifier")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-datalakesettings-datalakeprincipal.html)
   */
  public interface DataLakePrincipalProperty {
    /**
     * An identifier for the Lake Formation principal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-datalakesettings-datalakeprincipal.html#cfn-lakeformation-datalakesettings-datalakeprincipal-datalakeprincipalidentifier)
     */
    public fun dataLakePrincipalIdentifier(): String

    /**
     * A builder for [DataLakePrincipalProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dataLakePrincipalIdentifier An identifier for the Lake Formation principal. 
       */
      public fun dataLakePrincipalIdentifier(dataLakePrincipalIdentifier: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings.DataLakePrincipalProperty.Builder
          =
          software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings.DataLakePrincipalProperty.builder()

      /**
       * @param dataLakePrincipalIdentifier An identifier for the Lake Formation principal. 
       */
      override fun dataLakePrincipalIdentifier(dataLakePrincipalIdentifier: String) {
        cdkBuilder.dataLakePrincipalIdentifier(dataLakePrincipalIdentifier)
      }

      public fun build():
          software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings.DataLakePrincipalProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings.DataLakePrincipalProperty,
    ) : CdkObject(cdkObject), DataLakePrincipalProperty {
      /**
       * An identifier for the Lake Formation principal.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-datalakesettings-datalakeprincipal.html#cfn-lakeformation-datalakesettings-datalakeprincipal-datalakeprincipalidentifier)
       */
      override fun dataLakePrincipalIdentifier(): String =
          unwrap(this).getDataLakePrincipalIdentifier()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DataLakePrincipalProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings.DataLakePrincipalProperty):
          DataLakePrincipalProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DataLakePrincipalProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataLakePrincipalProperty):
          software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings.DataLakePrincipalProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings.DataLakePrincipalProperty
    }
  }

  /**
   * Permissions granted to a principal.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lakeformation.*;
   * PrincipalPermissionsProperty principalPermissionsProperty =
   * PrincipalPermissionsProperty.builder()
   * .permissions(List.of("permissions"))
   * .principal(DataLakePrincipalProperty.builder()
   * .dataLakePrincipalIdentifier("dataLakePrincipalIdentifier")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-datalakesettings-principalpermissions.html)
   */
  public interface PrincipalPermissionsProperty {
    /**
     * The permissions that are granted to the principal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-datalakesettings-principalpermissions.html#cfn-lakeformation-datalakesettings-principalpermissions-permissions)
     */
    public fun permissions(): List<String>

    /**
     * The principal who is granted permissions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-datalakesettings-principalpermissions.html#cfn-lakeformation-datalakesettings-principalpermissions-principal)
     */
    public fun principal(): Any

    /**
     * A builder for [PrincipalPermissionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param permissions The permissions that are granted to the principal. 
       */
      public fun permissions(permissions: List<String>)

      /**
       * @param permissions The permissions that are granted to the principal. 
       */
      public fun permissions(vararg permissions: String)

      /**
       * @param principal The principal who is granted permissions. 
       */
      public fun principal(principal: IResolvable)

      /**
       * @param principal The principal who is granted permissions. 
       */
      public fun principal(principal: DataLakePrincipalProperty)

      /**
       * @param principal The principal who is granted permissions. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("222db79a76a46d52f0df1a9d6b10094f0536f5fc5b6e298e00d0109b2bab14cf")
      public fun principal(principal: DataLakePrincipalProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings.PrincipalPermissionsProperty.Builder
          =
          software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings.PrincipalPermissionsProperty.builder()

      /**
       * @param permissions The permissions that are granted to the principal. 
       */
      override fun permissions(permissions: List<String>) {
        cdkBuilder.permissions(permissions)
      }

      /**
       * @param permissions The permissions that are granted to the principal. 
       */
      override fun permissions(vararg permissions: String): Unit = permissions(permissions.toList())

      /**
       * @param principal The principal who is granted permissions. 
       */
      override fun principal(principal: IResolvable) {
        cdkBuilder.principal(principal.let(IResolvable::unwrap))
      }

      /**
       * @param principal The principal who is granted permissions. 
       */
      override fun principal(principal: DataLakePrincipalProperty) {
        cdkBuilder.principal(principal.let(DataLakePrincipalProperty::unwrap))
      }

      /**
       * @param principal The principal who is granted permissions. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("222db79a76a46d52f0df1a9d6b10094f0536f5fc5b6e298e00d0109b2bab14cf")
      override fun principal(principal: DataLakePrincipalProperty.Builder.() -> Unit): Unit =
          principal(DataLakePrincipalProperty(principal))

      public fun build():
          software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings.PrincipalPermissionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings.PrincipalPermissionsProperty,
    ) : CdkObject(cdkObject), PrincipalPermissionsProperty {
      /**
       * The permissions that are granted to the principal.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-datalakesettings-principalpermissions.html#cfn-lakeformation-datalakesettings-principalpermissions-permissions)
       */
      override fun permissions(): List<String> = unwrap(this).getPermissions()

      /**
       * The principal who is granted permissions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-datalakesettings-principalpermissions.html#cfn-lakeformation-datalakesettings-principalpermissions-principal)
       */
      override fun principal(): Any = unwrap(this).getPrincipal()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PrincipalPermissionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings.PrincipalPermissionsProperty):
          PrincipalPermissionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PrincipalPermissionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PrincipalPermissionsProperty):
          software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings.PrincipalPermissionsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings.PrincipalPermissionsProperty
    }
  }
}

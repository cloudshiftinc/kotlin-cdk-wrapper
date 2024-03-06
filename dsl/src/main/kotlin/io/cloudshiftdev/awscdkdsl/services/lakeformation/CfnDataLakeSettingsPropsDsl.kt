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

package io.cloudshiftdev.awscdkdsl.services.lakeformation

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lakeformation.CfnDataLakeSettingsProps

/**
 * Properties for defining a `CfnDataLakeSettings`.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.glue.alpha.S3Table;
 * import software.amazon.awscdk.services.glue.alpha.Database;
 * import software.amazon.awscdk.services.glue.alpha.DataFormat;
 * import software.amazon.awscdk.services.glue.alpha.Schema;
 * import software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings;
 * import software.amazon.awscdk.services.lakeformation.CfnTag;
 * import software.amazon.awscdk.services.lakeformation.CfnTagAssociation;
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
@CdkDslMarker
public class CfnDataLakeSettingsPropsDsl {
    private val cdkBuilder: CfnDataLakeSettingsProps.Builder = CfnDataLakeSettingsProps.builder()

    private val _admins: MutableList<Any> = mutableListOf()

    private val _authorizedSessionTagValueList: MutableList<String> = mutableListOf()

    private val _createDatabaseDefaultPermissions: MutableList<Any> = mutableListOf()

    private val _createTableDefaultPermissions: MutableList<Any> = mutableListOf()

    private val _externalDataFilteringAllowList: MutableList<Any> = mutableListOf()

    private val _trustedResourceOwners: MutableList<String> = mutableListOf()

    /** @param admins A list of AWS Lake Formation principals. */
    public fun admins(vararg admins: Any) {
        _admins.addAll(listOf(*admins))
    }

    /** @param admins A list of AWS Lake Formation principals. */
    public fun admins(admins: Collection<Any>) {
        _admins.addAll(admins)
    }

    /** @param admins A list of AWS Lake Formation principals. */
    public fun admins(admins: IResolvable) {
        cdkBuilder.admins(admins)
    }

    /**
     * @param allowExternalDataFiltering Whether to allow Amazon EMR clusters or other third-party
     *   query engines to access data managed by Lake Formation . If set to true, you allow Amazon
     *   EMR clusters or other third-party engines to access data in Amazon S3 locations that are
     *   registered with Lake Formation .
     *
     * If false or null, no third-party query engines will be able to access data in Amazon S3
     * locations that are registered with Lake Formation.
     *
     * For more information, see
     * [External data filtering setting](https://docs.aws.amazon.com/lake-formation/latest/dg/initial-LF-setup.html#external-data-filter)
     * .
     */
    public fun allowExternalDataFiltering(allowExternalDataFiltering: Boolean) {
        cdkBuilder.allowExternalDataFiltering(allowExternalDataFiltering)
    }

    /**
     * @param allowExternalDataFiltering Whether to allow Amazon EMR clusters or other third-party
     *   query engines to access data managed by Lake Formation . If set to true, you allow Amazon
     *   EMR clusters or other third-party engines to access data in Amazon S3 locations that are
     *   registered with Lake Formation .
     *
     * If false or null, no third-party query engines will be able to access data in Amazon S3
     * locations that are registered with Lake Formation.
     *
     * For more information, see
     * [External data filtering setting](https://docs.aws.amazon.com/lake-formation/latest/dg/initial-LF-setup.html#external-data-filter)
     * .
     */
    public fun allowExternalDataFiltering(allowExternalDataFiltering: IResolvable) {
        cdkBuilder.allowExternalDataFiltering(allowExternalDataFiltering)
    }

    /**
     * @param allowFullTableExternalDataAccess Specifies whether query engines and applications can
     *   get credentials without IAM session tags if the user has full table access. It provides
     *   query engines and applications performance benefits as well as simplifies data access.
     *   Amazon EMR on Amazon EC2 is able to leverage this setting.
     *
     * For more information, see
     * [](https://docs.aws.amazon.com/lake-formation/latest/dg/using-cred-vending.html)
     */
    public fun allowFullTableExternalDataAccess(allowFullTableExternalDataAccess: Boolean) {
        cdkBuilder.allowFullTableExternalDataAccess(allowFullTableExternalDataAccess)
    }

    /**
     * @param allowFullTableExternalDataAccess Specifies whether query engines and applications can
     *   get credentials without IAM session tags if the user has full table access. It provides
     *   query engines and applications performance benefits as well as simplifies data access.
     *   Amazon EMR on Amazon EC2 is able to leverage this setting.
     *
     * For more information, see
     * [](https://docs.aws.amazon.com/lake-formation/latest/dg/using-cred-vending.html)
     */
    public fun allowFullTableExternalDataAccess(allowFullTableExternalDataAccess: IResolvable) {
        cdkBuilder.allowFullTableExternalDataAccess(allowFullTableExternalDataAccess)
    }

    /**
     * @param authorizedSessionTagValueList Lake Formation relies on a privileged process secured by
     *   Amazon EMR or the third party integrator to tag the user's role while assuming it. Lake
     *   Formation will publish the acceptable key-value pair, for example key =
     *   "LakeFormationTrustedCaller" and value = "TRUE" and the third party integrator must
     *   properly tag the temporary security credentials that will be used to call Lake Formation 's
     *   administrative API operations.
     */
    public fun authorizedSessionTagValueList(vararg authorizedSessionTagValueList: String) {
        _authorizedSessionTagValueList.addAll(listOf(*authorizedSessionTagValueList))
    }

    /**
     * @param authorizedSessionTagValueList Lake Formation relies on a privileged process secured by
     *   Amazon EMR or the third party integrator to tag the user's role while assuming it. Lake
     *   Formation will publish the acceptable key-value pair, for example key =
     *   "LakeFormationTrustedCaller" and value = "TRUE" and the third party integrator must
     *   properly tag the temporary security credentials that will be used to call Lake Formation 's
     *   administrative API operations.
     */
    public fun authorizedSessionTagValueList(authorizedSessionTagValueList: Collection<String>) {
        _authorizedSessionTagValueList.addAll(authorizedSessionTagValueList)
    }

    /**
     * @param createDatabaseDefaultPermissions Specifies whether access control on a newly created
     *   database is managed by Lake Formation permissions or exclusively by IAM permissions. A null
     *   value indicates that the access is controlled by Lake Formation permissions. `ALL`
     *   permissions assigned to `IAM_ALLOWED_PRINCIPALS` group indicates that the user's IAM
     *   permissions determine the access to the database. This is referred to as the setting "Use
     *   only IAM access control," and is to support backward compatibility with the AWS Glue
     *   permission model implemented by IAM permissions.
     *
     * The only permitted values are an empty array or an array that contains a single JSON object
     * that grants `ALL` to `IAM_ALLOWED_PRINCIPALS` .
     *
     * For more information, see
     * [Changing the default security settings for your data lake](https://docs.aws.amazon.com/lake-formation/latest/dg/change-settings.html)
     * .
     */
    public fun createDatabaseDefaultPermissions(vararg createDatabaseDefaultPermissions: Any) {
        _createDatabaseDefaultPermissions.addAll(listOf(*createDatabaseDefaultPermissions))
    }

    /**
     * @param createDatabaseDefaultPermissions Specifies whether access control on a newly created
     *   database is managed by Lake Formation permissions or exclusively by IAM permissions. A null
     *   value indicates that the access is controlled by Lake Formation permissions. `ALL`
     *   permissions assigned to `IAM_ALLOWED_PRINCIPALS` group indicates that the user's IAM
     *   permissions determine the access to the database. This is referred to as the setting "Use
     *   only IAM access control," and is to support backward compatibility with the AWS Glue
     *   permission model implemented by IAM permissions.
     *
     * The only permitted values are an empty array or an array that contains a single JSON object
     * that grants `ALL` to `IAM_ALLOWED_PRINCIPALS` .
     *
     * For more information, see
     * [Changing the default security settings for your data lake](https://docs.aws.amazon.com/lake-formation/latest/dg/change-settings.html)
     * .
     */
    public fun createDatabaseDefaultPermissions(createDatabaseDefaultPermissions: Collection<Any>) {
        _createDatabaseDefaultPermissions.addAll(createDatabaseDefaultPermissions)
    }

    /**
     * @param createDatabaseDefaultPermissions Specifies whether access control on a newly created
     *   database is managed by Lake Formation permissions or exclusively by IAM permissions. A null
     *   value indicates that the access is controlled by Lake Formation permissions. `ALL`
     *   permissions assigned to `IAM_ALLOWED_PRINCIPALS` group indicates that the user's IAM
     *   permissions determine the access to the database. This is referred to as the setting "Use
     *   only IAM access control," and is to support backward compatibility with the AWS Glue
     *   permission model implemented by IAM permissions.
     *
     * The only permitted values are an empty array or an array that contains a single JSON object
     * that grants `ALL` to `IAM_ALLOWED_PRINCIPALS` .
     *
     * For more information, see
     * [Changing the default security settings for your data lake](https://docs.aws.amazon.com/lake-formation/latest/dg/change-settings.html)
     * .
     */
    public fun createDatabaseDefaultPermissions(createDatabaseDefaultPermissions: IResolvable) {
        cdkBuilder.createDatabaseDefaultPermissions(createDatabaseDefaultPermissions)
    }

    /**
     * @param createTableDefaultPermissions Specifies whether access control on a newly created
     *   table is managed by Lake Formation permissions or exclusively by IAM permissions. A null
     *   value indicates that the access is controlled by Lake Formation permissions. `ALL`
     *   permissions assigned to `IAM_ALLOWED_PRINCIPALS` group indicate that the user's IAM
     *   permissions determine the access to the table. This is referred to as the setting "Use only
     *   IAM access control," and is to support the backward compatibility with the AWS Glue
     *   permission model implemented by IAM permissions.
     *
     * The only permitted values are an empty array or an array that contains a single JSON object
     * that grants `ALL` permissions to `IAM_ALLOWED_PRINCIPALS` .
     *
     * For more information, see
     * [Changing the default security settings for your data lake](https://docs.aws.amazon.com/lake-formation/latest/dg/change-settings.html)
     * .
     */
    public fun createTableDefaultPermissions(vararg createTableDefaultPermissions: Any) {
        _createTableDefaultPermissions.addAll(listOf(*createTableDefaultPermissions))
    }

    /**
     * @param createTableDefaultPermissions Specifies whether access control on a newly created
     *   table is managed by Lake Formation permissions or exclusively by IAM permissions. A null
     *   value indicates that the access is controlled by Lake Formation permissions. `ALL`
     *   permissions assigned to `IAM_ALLOWED_PRINCIPALS` group indicate that the user's IAM
     *   permissions determine the access to the table. This is referred to as the setting "Use only
     *   IAM access control," and is to support the backward compatibility with the AWS Glue
     *   permission model implemented by IAM permissions.
     *
     * The only permitted values are an empty array or an array that contains a single JSON object
     * that grants `ALL` permissions to `IAM_ALLOWED_PRINCIPALS` .
     *
     * For more information, see
     * [Changing the default security settings for your data lake](https://docs.aws.amazon.com/lake-formation/latest/dg/change-settings.html)
     * .
     */
    public fun createTableDefaultPermissions(createTableDefaultPermissions: Collection<Any>) {
        _createTableDefaultPermissions.addAll(createTableDefaultPermissions)
    }

    /**
     * @param createTableDefaultPermissions Specifies whether access control on a newly created
     *   table is managed by Lake Formation permissions or exclusively by IAM permissions. A null
     *   value indicates that the access is controlled by Lake Formation permissions. `ALL`
     *   permissions assigned to `IAM_ALLOWED_PRINCIPALS` group indicate that the user's IAM
     *   permissions determine the access to the table. This is referred to as the setting "Use only
     *   IAM access control," and is to support the backward compatibility with the AWS Glue
     *   permission model implemented by IAM permissions.
     *
     * The only permitted values are an empty array or an array that contains a single JSON object
     * that grants `ALL` permissions to `IAM_ALLOWED_PRINCIPALS` .
     *
     * For more information, see
     * [Changing the default security settings for your data lake](https://docs.aws.amazon.com/lake-formation/latest/dg/change-settings.html)
     * .
     */
    public fun createTableDefaultPermissions(createTableDefaultPermissions: IResolvable) {
        cdkBuilder.createTableDefaultPermissions(createTableDefaultPermissions)
    }

    /**
     * @param externalDataFilteringAllowList A list of the account IDs of AWS accounts with Amazon
     *   EMR clusters or third-party engines that are allwed to perform data filtering.
     */
    public fun externalDataFilteringAllowList(vararg externalDataFilteringAllowList: Any) {
        _externalDataFilteringAllowList.addAll(listOf(*externalDataFilteringAllowList))
    }

    /**
     * @param externalDataFilteringAllowList A list of the account IDs of AWS accounts with Amazon
     *   EMR clusters or third-party engines that are allwed to perform data filtering.
     */
    public fun externalDataFilteringAllowList(externalDataFilteringAllowList: Collection<Any>) {
        _externalDataFilteringAllowList.addAll(externalDataFilteringAllowList)
    }

    /**
     * @param externalDataFilteringAllowList A list of the account IDs of AWS accounts with Amazon
     *   EMR clusters or third-party engines that are allwed to perform data filtering.
     */
    public fun externalDataFilteringAllowList(externalDataFilteringAllowList: IResolvable) {
        cdkBuilder.externalDataFilteringAllowList(externalDataFilteringAllowList)
    }

    /**
     * @param mutationType Specifies whether the data lake settings are updated by adding new values
     *   to the current settings ( `APPEND` ) or by replacing the current settings with new settings
     *   ( `REPLACE` ).
     *
     * If you choose `REPLACE` , your current data lake settings will be replaced with the new
     * values in your template.
     */
    public fun mutationType(mutationType: String) {
        cdkBuilder.mutationType(mutationType)
    }

    /**
     * @param parameters A key-value map that provides an additional configuration on your data
     *   lake. `CrossAccountVersion` is the key you can configure in the `Parameters` field.
     *   Accepted values for the `CrossAccountVersion` key are 1, 2, and 3.
     */
    public fun parameters(parameters: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(parameters)
        cdkBuilder.parameters(builder.map)
    }

    /**
     * @param parameters A key-value map that provides an additional configuration on your data
     *   lake. `CrossAccountVersion` is the key you can configure in the `Parameters` field.
     *   Accepted values for the `CrossAccountVersion` key are 1, 2, and 3.
     */
    public fun parameters(parameters: Any) {
        cdkBuilder.parameters(parameters)
    }

    /**
     * @param trustedResourceOwners An array of UTF-8 strings. A list of the resource-owning account
     *   IDs that the caller's account can use to share their user access details (user ARNs). The
     *   user ARNs can be logged in the resource owner's CloudTrail log. You may want to specify
     *   this property when you are in a high-trust boundary, such as the same team or company.
     */
    public fun trustedResourceOwners(vararg trustedResourceOwners: String) {
        _trustedResourceOwners.addAll(listOf(*trustedResourceOwners))
    }

    /**
     * @param trustedResourceOwners An array of UTF-8 strings. A list of the resource-owning account
     *   IDs that the caller's account can use to share their user access details (user ARNs). The
     *   user ARNs can be logged in the resource owner's CloudTrail log. You may want to specify
     *   this property when you are in a high-trust boundary, such as the same team or company.
     */
    public fun trustedResourceOwners(trustedResourceOwners: Collection<String>) {
        _trustedResourceOwners.addAll(trustedResourceOwners)
    }

    public fun build(): CfnDataLakeSettingsProps {
        if (_admins.isNotEmpty()) cdkBuilder.admins(_admins)
        if (_authorizedSessionTagValueList.isNotEmpty())
            cdkBuilder.authorizedSessionTagValueList(_authorizedSessionTagValueList)
        if (_createDatabaseDefaultPermissions.isNotEmpty())
            cdkBuilder.createDatabaseDefaultPermissions(_createDatabaseDefaultPermissions)
        if (_createTableDefaultPermissions.isNotEmpty())
            cdkBuilder.createTableDefaultPermissions(_createTableDefaultPermissions)
        if (_externalDataFilteringAllowList.isNotEmpty())
            cdkBuilder.externalDataFilteringAllowList(_externalDataFilteringAllowList)
        if (_trustedResourceOwners.isNotEmpty())
            cdkBuilder.trustedResourceOwners(_trustedResourceOwners)
        return cdkBuilder.build()
    }
}

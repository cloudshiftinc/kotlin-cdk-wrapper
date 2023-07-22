@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lakeformation

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings
import software.constructs.Construct

/**
 * The `AWS::LakeFormation::DataLakeSettings` resource is an AWS Lake Formation resource type that
 * manages the data lake settings for your account.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lakeformation.*;
 * Object parameters;
 * CfnDataLakeSettings cfnDataLakeSettings = CfnDataLakeSettings.Builder.create(this,
 * "MyCfnDataLakeSettings")
 * .admins(List.of(DataLakePrincipalProperty.builder()
 * .dataLakePrincipalIdentifier("dataLakePrincipalIdentifier")
 * .build()))
 * .allowExternalDataFiltering(false)
 * .authorizedSessionTagValueList(List.of("authorizedSessionTagValueList"))
 * .createDatabaseDefaultPermissions(List.of(PrincipalPermissionsProperty.builder()
 * .permissions(List.of("permissions"))
 * .principal(DataLakePrincipalProperty.builder()
 * .dataLakePrincipalIdentifier("dataLakePrincipalIdentifier")
 * .build())
 * .build()))
 * .createTableDefaultPermissions(List.of(PrincipalPermissionsProperty.builder()
 * .permissions(List.of("permissions"))
 * .principal(DataLakePrincipalProperty.builder()
 * .dataLakePrincipalIdentifier("dataLakePrincipalIdentifier")
 * .build())
 * .build()))
 * .externalDataFilteringAllowList(List.of(DataLakePrincipalProperty.builder()
 * .dataLakePrincipalIdentifier("dataLakePrincipalIdentifier")
 * .build()))
 * .parameters(parameters)
 * .trustedResourceOwners(List.of("trustedResourceOwners"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datalakesettings.html)
 */
@CdkDslMarker
public class CfnDataLakeSettingsDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDataLakeSettings.Builder = CfnDataLakeSettings.Builder.create(scope,
      id)

  private val _admins: MutableList<Any> = mutableListOf()

  private val _authorizedSessionTagValueList: MutableList<String> = mutableListOf()

  private val _createDatabaseDefaultPermissions: MutableList<Any> = mutableListOf()

  private val _createTableDefaultPermissions: MutableList<Any> = mutableListOf()

  private val _externalDataFilteringAllowList: MutableList<Any> = mutableListOf()

  private val _trustedResourceOwners: MutableList<String> = mutableListOf()

  /**
   * A list of AWS Lake Formation principals.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datalakesettings.html#cfn-lakeformation-datalakesettings-admins)
   * @param admins A list of AWS Lake Formation principals. 
   */
  public fun admins(vararg admins: Any) {
    _admins.addAll(listOf(*admins))
  }

  /**
   * A list of AWS Lake Formation principals.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datalakesettings.html#cfn-lakeformation-datalakesettings-admins)
   * @param admins A list of AWS Lake Formation principals. 
   */
  public fun admins(admins: Collection<Any>) {
    _admins.addAll(admins)
  }

  /**
   * A list of AWS Lake Formation principals.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datalakesettings.html#cfn-lakeformation-datalakesettings-admins)
   * @param admins A list of AWS Lake Formation principals. 
   */
  public fun admins(admins: IResolvable) {
    cdkBuilder.admins(admins)
  }

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
   * @param allowExternalDataFiltering Whether to allow Amazon EMR clusters or other third-party
   * query engines to access data managed by Lake Formation . 
   */
  public fun allowExternalDataFiltering(allowExternalDataFiltering: Boolean) {
    cdkBuilder.allowExternalDataFiltering(allowExternalDataFiltering)
  }

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
   * @param allowExternalDataFiltering Whether to allow Amazon EMR clusters or other third-party
   * query engines to access data managed by Lake Formation . 
   */
  public fun allowExternalDataFiltering(allowExternalDataFiltering: IResolvable) {
    cdkBuilder.allowExternalDataFiltering(allowExternalDataFiltering)
  }

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
   * @param authorizedSessionTagValueList Lake Formation relies on a privileged process secured by
   * Amazon EMR or the third party integrator to tag the user's role while assuming it. 
   */
  public fun authorizedSessionTagValueList(vararg authorizedSessionTagValueList: String) {
    _authorizedSessionTagValueList.addAll(listOf(*authorizedSessionTagValueList))
  }

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
   * @param authorizedSessionTagValueList Lake Formation relies on a privileged process secured by
   * Amazon EMR or the third party integrator to tag the user's role while assuming it. 
   */
  public fun authorizedSessionTagValueList(authorizedSessionTagValueList: Collection<String>) {
    _authorizedSessionTagValueList.addAll(authorizedSessionTagValueList)
  }

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
   * @param createDatabaseDefaultPermissions Specifies whether access control on a newly created
   * database is managed by Lake Formation permissions or exclusively by IAM permissions. 
   */
  public fun createDatabaseDefaultPermissions(vararg createDatabaseDefaultPermissions: Any) {
    _createDatabaseDefaultPermissions.addAll(listOf(*createDatabaseDefaultPermissions))
  }

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
   * @param createDatabaseDefaultPermissions Specifies whether access control on a newly created
   * database is managed by Lake Formation permissions or exclusively by IAM permissions. 
   */
  public fun createDatabaseDefaultPermissions(createDatabaseDefaultPermissions: Collection<Any>) {
    _createDatabaseDefaultPermissions.addAll(createDatabaseDefaultPermissions)
  }

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
   * @param createDatabaseDefaultPermissions Specifies whether access control on a newly created
   * database is managed by Lake Formation permissions or exclusively by IAM permissions. 
   */
  public fun createDatabaseDefaultPermissions(createDatabaseDefaultPermissions: IResolvable) {
    cdkBuilder.createDatabaseDefaultPermissions(createDatabaseDefaultPermissions)
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
   * @param createTableDefaultPermissions Specifies whether access control on a newly created table
   * is managed by Lake Formation permissions or exclusively by IAM permissions. 
   */
  public fun createTableDefaultPermissions(vararg createTableDefaultPermissions: Any) {
    _createTableDefaultPermissions.addAll(listOf(*createTableDefaultPermissions))
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
   * @param createTableDefaultPermissions Specifies whether access control on a newly created table
   * is managed by Lake Formation permissions or exclusively by IAM permissions. 
   */
  public fun createTableDefaultPermissions(createTableDefaultPermissions: Collection<Any>) {
    _createTableDefaultPermissions.addAll(createTableDefaultPermissions)
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
   * @param createTableDefaultPermissions Specifies whether access control on a newly created table
   * is managed by Lake Formation permissions or exclusively by IAM permissions. 
   */
  public fun createTableDefaultPermissions(createTableDefaultPermissions: IResolvable) {
    cdkBuilder.createTableDefaultPermissions(createTableDefaultPermissions)
  }

  /**
   * A list of the account IDs of AWS accounts with Amazon EMR clusters or third-party engines that
   * are allwed to perform data filtering.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datalakesettings.html#cfn-lakeformation-datalakesettings-externaldatafilteringallowlist)
   * @param externalDataFilteringAllowList A list of the account IDs of AWS accounts with Amazon EMR
   * clusters or third-party engines that are allwed to perform data filtering. 
   */
  public fun externalDataFilteringAllowList(vararg externalDataFilteringAllowList: Any) {
    _externalDataFilteringAllowList.addAll(listOf(*externalDataFilteringAllowList))
  }

  /**
   * A list of the account IDs of AWS accounts with Amazon EMR clusters or third-party engines that
   * are allwed to perform data filtering.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datalakesettings.html#cfn-lakeformation-datalakesettings-externaldatafilteringallowlist)
   * @param externalDataFilteringAllowList A list of the account IDs of AWS accounts with Amazon EMR
   * clusters or third-party engines that are allwed to perform data filtering. 
   */
  public fun externalDataFilteringAllowList(externalDataFilteringAllowList: Collection<Any>) {
    _externalDataFilteringAllowList.addAll(externalDataFilteringAllowList)
  }

  /**
   * A list of the account IDs of AWS accounts with Amazon EMR clusters or third-party engines that
   * are allwed to perform data filtering.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datalakesettings.html#cfn-lakeformation-datalakesettings-externaldatafilteringallowlist)
   * @param externalDataFilteringAllowList A list of the account IDs of AWS accounts with Amazon EMR
   * clusters or third-party engines that are allwed to perform data filtering. 
   */
  public fun externalDataFilteringAllowList(externalDataFilteringAllowList: IResolvable) {
    cdkBuilder.externalDataFilteringAllowList(externalDataFilteringAllowList)
  }

  /**
   * A key-value map that provides an additional configuration on your data lake.
   *
   * `CrossAccountVersion` is the key you can configure in the `Parameters` field. Accepted values
   * for the `CrossAccountVersion` key are 1, 2, and 3.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datalakesettings.html#cfn-lakeformation-datalakesettings-parameters)
   * @param parameters A key-value map that provides an additional configuration on your data lake. 
   */
  public fun parameters(parameters: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(parameters)
    cdkBuilder.parameters(builder.map)
  }

  /**
   * A key-value map that provides an additional configuration on your data lake.
   *
   * `CrossAccountVersion` is the key you can configure in the `Parameters` field. Accepted values
   * for the `CrossAccountVersion` key are 1, 2, and 3.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datalakesettings.html#cfn-lakeformation-datalakesettings-parameters)
   * @param parameters A key-value map that provides an additional configuration on your data lake. 
   */
  public fun parameters(parameters: Any) {
    cdkBuilder.parameters(parameters)
  }

  /**
   * An array of UTF-8 strings.
   *
   * A list of the resource-owning account IDs that the caller's account can use to share their user
   * access details (user ARNs). The user ARNs can be logged in the resource owner's CloudTrail log.
   * You may want to specify this property when you are in a high-trust boundary, such as the same team
   * or company.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datalakesettings.html#cfn-lakeformation-datalakesettings-trustedresourceowners)
   * @param trustedResourceOwners An array of UTF-8 strings. 
   */
  public fun trustedResourceOwners(vararg trustedResourceOwners: String) {
    _trustedResourceOwners.addAll(listOf(*trustedResourceOwners))
  }

  /**
   * An array of UTF-8 strings.
   *
   * A list of the resource-owning account IDs that the caller's account can use to share their user
   * access details (user ARNs). The user ARNs can be logged in the resource owner's CloudTrail log.
   * You may want to specify this property when you are in a high-trust boundary, such as the same team
   * or company.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datalakesettings.html#cfn-lakeformation-datalakesettings-trustedresourceowners)
   * @param trustedResourceOwners An array of UTF-8 strings. 
   */
  public fun trustedResourceOwners(trustedResourceOwners: Collection<String>) {
    _trustedResourceOwners.addAll(trustedResourceOwners)
  }

  public fun build(): CfnDataLakeSettings {
    if(_admins.isNotEmpty()) cdkBuilder.admins(_admins)
    if(_authorizedSessionTagValueList.isNotEmpty())
        cdkBuilder.authorizedSessionTagValueList(_authorizedSessionTagValueList)
    if(_createDatabaseDefaultPermissions.isNotEmpty())
        cdkBuilder.createDatabaseDefaultPermissions(_createDatabaseDefaultPermissions)
    if(_createTableDefaultPermissions.isNotEmpty())
        cdkBuilder.createTableDefaultPermissions(_createTableDefaultPermissions)
    if(_externalDataFilteringAllowList.isNotEmpty())
        cdkBuilder.externalDataFilteringAllowList(_externalDataFilteringAllowList)
    if(_trustedResourceOwners.isNotEmpty()) cdkBuilder.trustedResourceOwners(_trustedResourceOwners)
    return cdkBuilder.build()
  }
}

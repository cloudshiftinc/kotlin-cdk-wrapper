@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSource
import software.amazon.awscdk.services.quicksight.CfnDataSourceProps

@CdkDslMarker
public class CfnDataSourcePropsDsl {
  private val cdkBuilder: CfnDataSourceProps.Builder = CfnDataSourceProps.builder()

  private val _alternateDataSourceParameters: MutableList<Any> = mutableListOf()

  private val _permissions: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param alternateDataSourceParameters A set of alternate data source parameters that you want to
   * share for the credentials stored with this data source.
   * The credentials are applied in tandem with the data source parameters when you copy a data
   * source by using a create or update request. The API operation compares the `DataSourceParameters`
   * structure that's in the request with the structures in the `AlternateDataSourceParameters` allow
   * list. If the structures are an exact match, the request is allowed to use the credentials from
   * this existing data source. If the `AlternateDataSourceParameters` list is null, the `Credentials`
   * originally used with this `DataSourceParameters` are automatically allowed.
   */
  public fun alternateDataSourceParameters(vararg alternateDataSourceParameters: Any) {
    _alternateDataSourceParameters.addAll(listOf(*alternateDataSourceParameters))
  }

  /**
   * @param alternateDataSourceParameters A set of alternate data source parameters that you want to
   * share for the credentials stored with this data source.
   * The credentials are applied in tandem with the data source parameters when you copy a data
   * source by using a create or update request. The API operation compares the `DataSourceParameters`
   * structure that's in the request with the structures in the `AlternateDataSourceParameters` allow
   * list. If the structures are an exact match, the request is allowed to use the credentials from
   * this existing data source. If the `AlternateDataSourceParameters` list is null, the `Credentials`
   * originally used with this `DataSourceParameters` are automatically allowed.
   */
  public fun alternateDataSourceParameters(alternateDataSourceParameters: Collection<Any>) {
    _alternateDataSourceParameters.addAll(alternateDataSourceParameters)
  }

  /**
   * @param alternateDataSourceParameters A set of alternate data source parameters that you want to
   * share for the credentials stored with this data source.
   * The credentials are applied in tandem with the data source parameters when you copy a data
   * source by using a create or update request. The API operation compares the `DataSourceParameters`
   * structure that's in the request with the structures in the `AlternateDataSourceParameters` allow
   * list. If the structures are an exact match, the request is allowed to use the credentials from
   * this existing data source. If the `AlternateDataSourceParameters` list is null, the `Credentials`
   * originally used with this `DataSourceParameters` are automatically allowed.
   */
  public fun alternateDataSourceParameters(alternateDataSourceParameters: IResolvable) {
    cdkBuilder.alternateDataSourceParameters(alternateDataSourceParameters)
  }

  /**
   * @param awsAccountId The AWS account ID.
   */
  public fun awsAccountId(awsAccountId: String) {
    cdkBuilder.awsAccountId(awsAccountId)
  }

  /**
   * @param credentials The credentials Amazon QuickSight that uses to connect to your underlying
   * source.
   * Currently, only credentials based on user name and password are supported.
   */
  public fun credentials(credentials: IResolvable) {
    cdkBuilder.credentials(credentials)
  }

  /**
   * @param credentials The credentials Amazon QuickSight that uses to connect to your underlying
   * source.
   * Currently, only credentials based on user name and password are supported.
   */
  public fun credentials(credentials: CfnDataSource.DataSourceCredentialsProperty) {
    cdkBuilder.credentials(credentials)
  }

  /**
   * @param dataSourceId An ID for the data source.
   * This ID is unique per AWS Region for each AWS account.
   */
  public fun dataSourceId(dataSourceId: String) {
    cdkBuilder.dataSourceId(dataSourceId)
  }

  /**
   * @param dataSourceParameters The parameters that Amazon QuickSight uses to connect to your
   * underlying source.
   */
  public fun dataSourceParameters(dataSourceParameters: IResolvable) {
    cdkBuilder.dataSourceParameters(dataSourceParameters)
  }

  /**
   * @param dataSourceParameters The parameters that Amazon QuickSight uses to connect to your
   * underlying source.
   */
  public
      fun dataSourceParameters(dataSourceParameters: CfnDataSource.DataSourceParametersProperty) {
    cdkBuilder.dataSourceParameters(dataSourceParameters)
  }

  /**
   * @param errorInfo Error information from the last update or the creation of the data source.
   */
  public fun errorInfo(errorInfo: IResolvable) {
    cdkBuilder.errorInfo(errorInfo)
  }

  /**
   * @param errorInfo Error information from the last update or the creation of the data source.
   */
  public fun errorInfo(errorInfo: CfnDataSource.DataSourceErrorInfoProperty) {
    cdkBuilder.errorInfo(errorInfo)
  }

  /**
   * @param name A display name for the data source.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param permissions A list of resource permissions on the data source.
   */
  public fun permissions(vararg permissions: Any) {
    _permissions.addAll(listOf(*permissions))
  }

  /**
   * @param permissions A list of resource permissions on the data source.
   */
  public fun permissions(permissions: Collection<Any>) {
    _permissions.addAll(permissions)
  }

  /**
   * @param permissions A list of resource permissions on the data source.
   */
  public fun permissions(permissions: IResolvable) {
    cdkBuilder.permissions(permissions)
  }

  /**
   * @param sslProperties Secure Socket Layer (SSL) properties that apply when Amazon QuickSight
   * connects to your underlying source.
   */
  public fun sslProperties(sslProperties: IResolvable) {
    cdkBuilder.sslProperties(sslProperties)
  }

  /**
   * @param sslProperties Secure Socket Layer (SSL) properties that apply when Amazon QuickSight
   * connects to your underlying source.
   */
  public fun sslProperties(sslProperties: CfnDataSource.SslPropertiesProperty) {
    cdkBuilder.sslProperties(sslProperties)
  }

  /**
   * @param tags Contains a map of the key-value pairs for the resource tag or tags assigned to the
   * data source.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags Contains a map of the key-value pairs for the resource tag or tags assigned to the
   * data source.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param type The type of the data source. To return a list of all data sources, use
   * `ListDataSources` .
   * Use `AMAZON_ELASTICSEARCH` for Amazon OpenSearch Service.
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  /**
   * @param vpcConnectionProperties Use this parameter only when you want Amazon QuickSight to use a
   * VPC connection when connecting to your underlying source.
   */
  public fun vpcConnectionProperties(vpcConnectionProperties: IResolvable) {
    cdkBuilder.vpcConnectionProperties(vpcConnectionProperties)
  }

  /**
   * @param vpcConnectionProperties Use this parameter only when you want Amazon QuickSight to use a
   * VPC connection when connecting to your underlying source.
   */
  public
      fun vpcConnectionProperties(vpcConnectionProperties: CfnDataSource.VpcConnectionPropertiesProperty) {
    cdkBuilder.vpcConnectionProperties(vpcConnectionProperties)
  }

  public fun build(): CfnDataSourceProps {
    if(_alternateDataSourceParameters.isNotEmpty())
        cdkBuilder.alternateDataSourceParameters(_alternateDataSourceParameters)
    if(_permissions.isNotEmpty()) cdkBuilder.permissions(_permissions)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}

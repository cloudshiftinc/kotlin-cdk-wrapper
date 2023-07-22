@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSource

@CdkDslMarker
public class CfnDataSourceCredentialPairPropertyDsl {
  private val cdkBuilder: CfnDataSource.CredentialPairProperty.Builder =
      CfnDataSource.CredentialPairProperty.builder()

  private val _alternateDataSourceParameters: MutableList<Any> = mutableListOf()

  /**
   * @param alternateDataSourceParameters A set of alternate data source parameters that you want to
   * share for these credentials.
   * The credentials are applied in tandem with the data source parameters when you copy a data
   * source by using a create or update request. The API operation compares the `DataSourceParameters`
   * structure that's in the request with the structures in the `AlternateDataSourceParameters` allow
   * list. If the structures are an exact match, the request is allowed to use the new data source with
   * the existing credentials. If the `AlternateDataSourceParameters` list is null, the
   * `DataSourceParameters` originally used with these `Credentials` is automatically allowed.
   */
  public fun alternateDataSourceParameters(vararg alternateDataSourceParameters: Any) {
    _alternateDataSourceParameters.addAll(listOf(*alternateDataSourceParameters))
  }

  /**
   * @param alternateDataSourceParameters A set of alternate data source parameters that you want to
   * share for these credentials.
   * The credentials are applied in tandem with the data source parameters when you copy a data
   * source by using a create or update request. The API operation compares the `DataSourceParameters`
   * structure that's in the request with the structures in the `AlternateDataSourceParameters` allow
   * list. If the structures are an exact match, the request is allowed to use the new data source with
   * the existing credentials. If the `AlternateDataSourceParameters` list is null, the
   * `DataSourceParameters` originally used with these `Credentials` is automatically allowed.
   */
  public fun alternateDataSourceParameters(alternateDataSourceParameters: Collection<Any>) {
    _alternateDataSourceParameters.addAll(alternateDataSourceParameters)
  }

  /**
   * @param alternateDataSourceParameters A set of alternate data source parameters that you want to
   * share for these credentials.
   * The credentials are applied in tandem with the data source parameters when you copy a data
   * source by using a create or update request. The API operation compares the `DataSourceParameters`
   * structure that's in the request with the structures in the `AlternateDataSourceParameters` allow
   * list. If the structures are an exact match, the request is allowed to use the new data source with
   * the existing credentials. If the `AlternateDataSourceParameters` list is null, the
   * `DataSourceParameters` originally used with these `Credentials` is automatically allowed.
   */
  public fun alternateDataSourceParameters(alternateDataSourceParameters: IResolvable) {
    cdkBuilder.alternateDataSourceParameters(alternateDataSourceParameters)
  }

  /**
   * @param password Password. 
   */
  public fun password(password: String) {
    cdkBuilder.password(password)
  }

  /**
   * @param username User name. 
   */
  public fun username(username: String) {
    cdkBuilder.username(username)
  }

  public fun build(): CfnDataSource.CredentialPairProperty {
    if(_alternateDataSourceParameters.isNotEmpty())
        cdkBuilder.alternateDataSourceParameters(_alternateDataSourceParameters)
    return cdkBuilder.build()
  }
}

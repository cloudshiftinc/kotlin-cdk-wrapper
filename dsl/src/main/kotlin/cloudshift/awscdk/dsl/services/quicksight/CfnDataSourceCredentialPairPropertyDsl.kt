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

  public fun alternateDataSourceParameters(vararg alternateDataSourceParameters: Any) {
    _alternateDataSourceParameters.addAll(listOf(*alternateDataSourceParameters))
  }

  public fun alternateDataSourceParameters(alternateDataSourceParameters: Collection<Any>) {
    _alternateDataSourceParameters.addAll(alternateDataSourceParameters)
  }

  public fun alternateDataSourceParameters(alternateDataSourceParameters: IResolvable) {
    cdkBuilder.alternateDataSourceParameters(alternateDataSourceParameters)
  }

  public fun password(password: String) {
    cdkBuilder.password(password)
  }

  public fun username(username: String) {
    cdkBuilder.username(username)
  }

  public fun build(): CfnDataSource.CredentialPairProperty {
    if(_alternateDataSourceParameters.isNotEmpty())
        cdkBuilder.alternateDataSourceParameters(_alternateDataSourceParameters)
    return cdkBuilder.build()
  }
}

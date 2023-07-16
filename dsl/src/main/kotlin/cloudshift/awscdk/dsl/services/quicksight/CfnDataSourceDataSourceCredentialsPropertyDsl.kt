@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSource

@CdkDslMarker
public class CfnDataSourceDataSourceCredentialsPropertyDsl {
  private val cdkBuilder: CfnDataSource.DataSourceCredentialsProperty.Builder =
      CfnDataSource.DataSourceCredentialsProperty.builder()

  public fun copySourceArn(copySourceArn: String) {
    cdkBuilder.copySourceArn(copySourceArn)
  }

  public fun credentialPair(credentialPair: IResolvable) {
    cdkBuilder.credentialPair(credentialPair)
  }

  public fun credentialPair(credentialPair: CfnDataSource.CredentialPairProperty) {
    cdkBuilder.credentialPair(credentialPair)
  }

  public fun secretArn(secretArn: String) {
    cdkBuilder.secretArn(secretArn)
  }

  public fun build(): CfnDataSource.DataSourceCredentialsProperty = cdkBuilder.build()
}

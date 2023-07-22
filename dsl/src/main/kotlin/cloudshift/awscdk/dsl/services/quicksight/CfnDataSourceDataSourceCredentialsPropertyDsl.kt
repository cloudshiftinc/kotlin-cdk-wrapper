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

  /**
   * @param copySourceArn The Amazon Resource Name (ARN) of a data source that has the credential
   * pair that you want to use.
   * When `CopySourceArn` is not null, the credential pair from the data source in the ARN is used
   * as the credentials for the `DataSourceCredentials` structure.
   */
  public fun copySourceArn(copySourceArn: String) {
    cdkBuilder.copySourceArn(copySourceArn)
  }

  /**
   * @param credentialPair Credential pair.
   * For more information, see
   * `[CredentialPair](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_CredentialPair.html)`
   * .
   */
  public fun credentialPair(credentialPair: IResolvable) {
    cdkBuilder.credentialPair(credentialPair)
  }

  /**
   * @param credentialPair Credential pair.
   * For more information, see
   * `[CredentialPair](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_CredentialPair.html)`
   * .
   */
  public fun credentialPair(credentialPair: CfnDataSource.CredentialPairProperty) {
    cdkBuilder.credentialPair(credentialPair)
  }

  /**
   * @param secretArn The Amazon Resource Name (ARN) of the secret associated with the data source
   * in AWS Secrets Manager .
   */
  public fun secretArn(secretArn: String) {
    cdkBuilder.secretArn(secretArn)
  }

  public fun build(): CfnDataSource.DataSourceCredentialsProperty = cdkBuilder.build()
}

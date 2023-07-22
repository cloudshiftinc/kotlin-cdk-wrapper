@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.supportapp

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.supportapp.CfnAccountAlias
import software.constructs.Construct

@CdkDslMarker
public class CfnAccountAliasDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnAccountAlias.Builder = CfnAccountAlias.Builder.create(scope, id)

  /**
   * An alias or short name for an AWS account .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-accountalias.html#cfn-supportapp-accountalias-accountalias)
   * @param accountAlias An alias or short name for an AWS account . 
   */
  public fun accountAlias(accountAlias: String) {
    cdkBuilder.accountAlias(accountAlias)
  }

  public fun build(): CfnAccountAlias = cdkBuilder.build()
}

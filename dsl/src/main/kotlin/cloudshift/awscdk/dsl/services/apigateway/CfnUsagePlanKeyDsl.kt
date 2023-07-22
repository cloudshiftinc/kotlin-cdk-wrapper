@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigateway.CfnUsagePlanKey
import software.constructs.Construct

@CdkDslMarker
public class CfnUsagePlanKeyDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnUsagePlanKey.Builder = CfnUsagePlanKey.Builder.create(scope, id)

  /**
   * The Id of the UsagePlanKey resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplankey.html#cfn-apigateway-usageplankey-keyid)
   * @param keyId The Id of the UsagePlanKey resource. 
   */
  public fun keyId(keyId: String) {
    cdkBuilder.keyId(keyId)
  }

  /**
   * The type of a UsagePlanKey resource for a plan customer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplankey.html#cfn-apigateway-usageplankey-keytype)
   * @param keyType The type of a UsagePlanKey resource for a plan customer. 
   */
  public fun keyType(keyType: String) {
    cdkBuilder.keyType(keyType)
  }

  /**
   * The Id of the UsagePlan resource representing the usage plan containing the UsagePlanKey
   * resource representing a plan customer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplankey.html#cfn-apigateway-usageplankey-usageplanid)
   * @param usagePlanId The Id of the UsagePlan resource representing the usage plan containing the
   * UsagePlanKey resource representing a plan customer. 
   */
  public fun usagePlanId(usagePlanId: String) {
    cdkBuilder.usagePlanId(usagePlanId)
  }

  public fun build(): CfnUsagePlanKey = cdkBuilder.build()
}

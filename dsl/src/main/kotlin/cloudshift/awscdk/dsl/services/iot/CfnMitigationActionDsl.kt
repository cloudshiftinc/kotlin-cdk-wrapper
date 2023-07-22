@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnMitigationAction
import software.constructs.Construct

@CdkDslMarker
public class CfnMitigationActionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnMitigationAction.Builder = CfnMitigationAction.Builder.create(scope,
      id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The friendly name of the mitigation action.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-mitigationaction.html#cfn-iot-mitigationaction-actionname)
   * @param actionName The friendly name of the mitigation action. 
   */
  public fun actionName(actionName: String) {
    cdkBuilder.actionName(actionName)
  }

  /**
   * The set of parameters for this mitigation action.
   *
   * The parameters vary, depending on the kind of action you apply.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-mitigationaction.html#cfn-iot-mitigationaction-actionparams)
   * @param actionParams The set of parameters for this mitigation action. 
   */
  public fun actionParams(actionParams: IResolvable) {
    cdkBuilder.actionParams(actionParams)
  }

  /**
   * The set of parameters for this mitigation action.
   *
   * The parameters vary, depending on the kind of action you apply.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-mitigationaction.html#cfn-iot-mitigationaction-actionparams)
   * @param actionParams The set of parameters for this mitigation action. 
   */
  public fun actionParams(actionParams: CfnMitigationAction.ActionParamsProperty) {
    cdkBuilder.actionParams(actionParams)
  }

  /**
   * The IAM role ARN used to apply this mitigation action.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-mitigationaction.html#cfn-iot-mitigationaction-rolearn)
   * @param roleArn The IAM role ARN used to apply this mitigation action. 
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  /**
   * Metadata that can be used to manage the mitigation action.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-mitigationaction.html#cfn-iot-mitigationaction-tags)
   * @param tags Metadata that can be used to manage the mitigation action. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * Metadata that can be used to manage the mitigation action.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-mitigationaction.html#cfn-iot-mitigationaction-tags)
   * @param tags Metadata that can be used to manage the mitigation action. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnMitigationAction {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}

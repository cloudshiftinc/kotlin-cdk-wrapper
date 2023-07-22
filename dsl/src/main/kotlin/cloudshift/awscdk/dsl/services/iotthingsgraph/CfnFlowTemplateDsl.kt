@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotthingsgraph

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplate
import software.constructs.Construct

@CdkDslMarker
public class CfnFlowTemplateDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnFlowTemplate.Builder = CfnFlowTemplate.Builder.create(scope, id)

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotthingsgraph-flowtemplate.html#cfn-iotthingsgraph-flowtemplate-compatiblenamespaceversion)
   * @param compatibleNamespaceVersion 
   */
  public fun compatibleNamespaceVersion(compatibleNamespaceVersion: Number) {
    cdkBuilder.compatibleNamespaceVersion(compatibleNamespaceVersion)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotthingsgraph-flowtemplate.html#cfn-iotthingsgraph-flowtemplate-definition)
   * @param definition 
   */
  public fun definition(definition: IResolvable) {
    cdkBuilder.definition(definition)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotthingsgraph-flowtemplate.html#cfn-iotthingsgraph-flowtemplate-definition)
   * @param definition 
   */
  public fun definition(definition: CfnFlowTemplate.DefinitionDocumentProperty) {
    cdkBuilder.definition(definition)
  }

  public fun build(): CfnFlowTemplate = cdkBuilder.build()
}

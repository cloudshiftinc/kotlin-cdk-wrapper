@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnProvisioningTemplate
import software.constructs.Construct

@CdkDslMarker
public class CfnProvisioningTemplateDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnProvisioningTemplate.Builder =
      CfnProvisioningTemplate.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The description of the fleet provisioning template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-description)
   * @param description The description of the fleet provisioning template. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * True to enable the fleet provisioning template, otherwise false.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-enabled)
   * @param enabled True to enable the fleet provisioning template, otherwise false. 
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * True to enable the fleet provisioning template, otherwise false.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-enabled)
   * @param enabled True to enable the fleet provisioning template, otherwise false. 
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * Creates a pre-provisioning hook template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-preprovisioninghook)
   * @param preProvisioningHook Creates a pre-provisioning hook template. 
   */
  public fun preProvisioningHook(preProvisioningHook: IResolvable) {
    cdkBuilder.preProvisioningHook(preProvisioningHook)
  }

  /**
   * Creates a pre-provisioning hook template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-preprovisioninghook)
   * @param preProvisioningHook Creates a pre-provisioning hook template. 
   */
  public
      fun preProvisioningHook(preProvisioningHook: CfnProvisioningTemplate.ProvisioningHookProperty) {
    cdkBuilder.preProvisioningHook(preProvisioningHook)
  }

  /**
   * The role ARN for the role associated with the fleet provisioning template.
   *
   * This IoT role grants permission to provision a device.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-provisioningrolearn)
   * @param provisioningRoleArn The role ARN for the role associated with the fleet provisioning
   * template. 
   */
  public fun provisioningRoleArn(provisioningRoleArn: String) {
    cdkBuilder.provisioningRoleArn(provisioningRoleArn)
  }

  /**
   * Metadata that can be used to manage the fleet provisioning template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-tags)
   * @param tags Metadata that can be used to manage the fleet provisioning template. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * Metadata that can be used to manage the fleet provisioning template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-tags)
   * @param tags Metadata that can be used to manage the fleet provisioning template. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * The JSON formatted contents of the fleet provisioning template version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-templatebody)
   * @param templateBody The JSON formatted contents of the fleet provisioning template version. 
   */
  public fun templateBody(templateBody: String) {
    cdkBuilder.templateBody(templateBody)
  }

  /**
   * The name of the fleet provisioning template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-templatename)
   * @param templateName The name of the fleet provisioning template. 
   */
  public fun templateName(templateName: String) {
    cdkBuilder.templateName(templateName)
  }

  /**
   * The type of the provisioning template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-templatetype)
   * @param templateType The type of the provisioning template. 
   */
  public fun templateType(templateType: String) {
    cdkBuilder.templateType(templateType)
  }

  public fun build(): CfnProvisioningTemplate {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}

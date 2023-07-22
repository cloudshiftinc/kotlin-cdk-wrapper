@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate
import software.constructs.Construct

@CdkDslMarker
public class CfnLaunchTemplateDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnLaunchTemplate.Builder = CfnLaunchTemplate.Builder.create(scope, id)

  private val _tagSpecifications: MutableList<Any> = mutableListOf()

  /**
   * The information for the launch template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-launchtemplatedata)
   * @param launchTemplateData The information for the launch template. 
   */
  public fun launchTemplateData(launchTemplateData: IResolvable) {
    cdkBuilder.launchTemplateData(launchTemplateData)
  }

  /**
   * The information for the launch template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-launchtemplatedata)
   * @param launchTemplateData The information for the launch template. 
   */
  public fun launchTemplateData(launchTemplateData: CfnLaunchTemplate.LaunchTemplateDataProperty) {
    cdkBuilder.launchTemplateData(launchTemplateData)
  }

  /**
   * A name for the launch template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-launchtemplatename)
   * @param launchTemplateName A name for the launch template. 
   */
  public fun launchTemplateName(launchTemplateName: String) {
    cdkBuilder.launchTemplateName(launchTemplateName)
  }

  /**
   * The tags to apply to the launch template on creation.
   *
   * To tag the launch template, the resource type must be `launch-template` .
   *
   *
   * To specify the tags for the resources that are created when an instance is launched, you must
   * use the `TagSpecifications` parameter in the [launch template
   * data](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestLaunchTemplateData.html)
   * structure.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-tagspecifications)
   * @param tagSpecifications The tags to apply to the launch template on creation. 
   */
  public fun tagSpecifications(vararg tagSpecifications: Any) {
    _tagSpecifications.addAll(listOf(*tagSpecifications))
  }

  /**
   * The tags to apply to the launch template on creation.
   *
   * To tag the launch template, the resource type must be `launch-template` .
   *
   *
   * To specify the tags for the resources that are created when an instance is launched, you must
   * use the `TagSpecifications` parameter in the [launch template
   * data](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestLaunchTemplateData.html)
   * structure.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-tagspecifications)
   * @param tagSpecifications The tags to apply to the launch template on creation. 
   */
  public fun tagSpecifications(tagSpecifications: Collection<Any>) {
    _tagSpecifications.addAll(tagSpecifications)
  }

  /**
   * The tags to apply to the launch template on creation.
   *
   * To tag the launch template, the resource type must be `launch-template` .
   *
   *
   * To specify the tags for the resources that are created when an instance is launched, you must
   * use the `TagSpecifications` parameter in the [launch template
   * data](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestLaunchTemplateData.html)
   * structure.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-tagspecifications)
   * @param tagSpecifications The tags to apply to the launch template on creation. 
   */
  public fun tagSpecifications(tagSpecifications: IResolvable) {
    cdkBuilder.tagSpecifications(tagSpecifications)
  }

  /**
   * A description for the first version of the launch template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-versiondescription)
   * @param versionDescription A description for the first version of the launch template. 
   */
  public fun versionDescription(versionDescription: String) {
    cdkBuilder.versionDescription(versionDescription)
  }

  public fun build(): CfnLaunchTemplate {
    if(_tagSpecifications.isNotEmpty()) cdkBuilder.tagSpecifications(_tagSpecifications)
    return cdkBuilder.build()
  }
}

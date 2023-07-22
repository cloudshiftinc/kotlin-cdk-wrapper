@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.fis

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.fis.CfnExperimentTemplate
import software.constructs.Construct

@CdkDslMarker
public class CfnExperimentTemplateDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnExperimentTemplate.Builder =
      CfnExperimentTemplate.Builder.create(scope, id)

  private val _stopConditions: MutableList<Any> = mutableListOf()

  /**
   * The actions for the experiment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-actions)
   * @param actions The actions for the experiment. 
   */
  public fun actions(actions: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(actions)
    cdkBuilder.actions(builder.map)
  }

  /**
   * The actions for the experiment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-actions)
   * @param actions The actions for the experiment. 
   */
  public fun actions(actions: Map<String, Any>) {
    cdkBuilder.actions(actions)
  }

  /**
   * The actions for the experiment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-actions)
   * @param actions The actions for the experiment. 
   */
  public fun actions(actions: IResolvable) {
    cdkBuilder.actions(actions)
  }

  /**
   * A description for the experiment template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-description)
   * @param description A description for the experiment template. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The configuration for experiment logging.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-logconfiguration)
   * @param logConfiguration The configuration for experiment logging. 
   */
  public fun logConfiguration(logConfiguration: IResolvable) {
    cdkBuilder.logConfiguration(logConfiguration)
  }

  /**
   * The configuration for experiment logging.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-logconfiguration)
   * @param logConfiguration The configuration for experiment logging. 
   */
  public
      fun logConfiguration(logConfiguration: CfnExperimentTemplate.ExperimentTemplateLogConfigurationProperty) {
    cdkBuilder.logConfiguration(logConfiguration)
  }

  /**
   * The Amazon Resource Name (ARN) of an IAM role that grants the AWS FIS service permission to
   * perform service actions on your behalf.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-rolearn)
   * @param roleArn The Amazon Resource Name (ARN) of an IAM role that grants the AWS FIS service
   * permission to perform service actions on your behalf. 
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  /**
   * The stop conditions.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-stopconditions)
   * @param stopConditions The stop conditions. 
   */
  public fun stopConditions(vararg stopConditions: Any) {
    _stopConditions.addAll(listOf(*stopConditions))
  }

  /**
   * The stop conditions.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-stopconditions)
   * @param stopConditions The stop conditions. 
   */
  public fun stopConditions(stopConditions: Collection<Any>) {
    _stopConditions.addAll(stopConditions)
  }

  /**
   * The stop conditions.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-stopconditions)
   * @param stopConditions The stop conditions. 
   */
  public fun stopConditions(stopConditions: IResolvable) {
    cdkBuilder.stopConditions(stopConditions)
  }

  /**
   * The tags to apply to the experiment template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-tags)
   * @param tags The tags to apply to the experiment template. 
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  /**
   * The targets for the experiment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-targets)
   * @param targets The targets for the experiment. 
   */
  public fun targets(targets: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(targets)
    cdkBuilder.targets(builder.map)
  }

  /**
   * The targets for the experiment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-targets)
   * @param targets The targets for the experiment. 
   */
  public fun targets(targets: Map<String, Any>) {
    cdkBuilder.targets(targets)
  }

  /**
   * The targets for the experiment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-targets)
   * @param targets The targets for the experiment. 
   */
  public fun targets(targets: IResolvable) {
    cdkBuilder.targets(targets)
  }

  public fun build(): CfnExperimentTemplate {
    if(_stopConditions.isNotEmpty()) cdkBuilder.stopConditions(_stopConditions)
    return cdkBuilder.build()
  }
}

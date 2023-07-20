@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticbeanstalk

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate
import software.constructs.Construct

@CdkDslMarker
public class CfnConfigurationTemplateDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnConfigurationTemplate.Builder =
      CfnConfigurationTemplate.Builder.create(scope, id)

  private val _optionSettings: MutableList<Any> = mutableListOf()

  public fun applicationName(applicationName: String) {
    cdkBuilder.applicationName(applicationName)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun environmentId(environmentId: String) {
    cdkBuilder.environmentId(environmentId)
  }

  public fun optionSettings(vararg optionSettings: Any) {
    _optionSettings.addAll(listOf(*optionSettings))
  }

  public fun optionSettings(optionSettings: Collection<Any>) {
    _optionSettings.addAll(optionSettings)
  }

  public fun optionSettings(optionSettings: IResolvable) {
    cdkBuilder.optionSettings(optionSettings)
  }

  public fun platformArn(platformArn: String) {
    cdkBuilder.platformArn(platformArn)
  }

  public fun solutionStackName(solutionStackName: String) {
    cdkBuilder.solutionStackName(solutionStackName)
  }

  public fun sourceConfiguration(sourceConfiguration: IResolvable) {
    cdkBuilder.sourceConfiguration(sourceConfiguration)
  }

  public
      fun sourceConfiguration(sourceConfiguration: CfnConfigurationTemplate.SourceConfigurationProperty) {
    cdkBuilder.sourceConfiguration(sourceConfiguration)
  }

  public fun build(): CfnConfigurationTemplate {
    if(_optionSettings.isNotEmpty()) cdkBuilder.optionSettings(_optionSettings)
    return cdkBuilder.build()
  }
}

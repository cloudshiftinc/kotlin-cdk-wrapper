@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticbeanstalk

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment
import software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironmentProps

@CdkDslMarker
public class CfnEnvironmentPropsDsl {
  private val cdkBuilder: CfnEnvironmentProps.Builder = CfnEnvironmentProps.builder()

  private val _optionSettings: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun applicationName(applicationName: String) {
    cdkBuilder.applicationName(applicationName)
  }

  public fun cnamePrefix(cnamePrefix: String) {
    cdkBuilder.cnamePrefix(cnamePrefix)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun environmentName(environmentName: String) {
    cdkBuilder.environmentName(environmentName)
  }

  public fun operationsRole(operationsRole: String) {
    cdkBuilder.operationsRole(operationsRole)
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

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun templateName(templateName: String) {
    cdkBuilder.templateName(templateName)
  }

  public fun tier(tier: IResolvable) {
    cdkBuilder.tier(tier)
  }

  public fun tier(tier: CfnEnvironment.TierProperty) {
    cdkBuilder.tier(tier)
  }

  public fun versionLabel(versionLabel: String) {
    cdkBuilder.versionLabel(versionLabel)
  }

  public fun build(): CfnEnvironmentProps {
    if(_optionSettings.isNotEmpty()) cdkBuilder.optionSettings(_optionSettings)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wisdom

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.wisdom.CfnKnowledgeBase

@CdkDslMarker
public class CfnKnowledgeBaseAppIntegrationsConfigurationPropertyDsl {
  private val cdkBuilder: CfnKnowledgeBase.AppIntegrationsConfigurationProperty.Builder =
      CfnKnowledgeBase.AppIntegrationsConfigurationProperty.builder()

  private val _objectFields: MutableList<String> = mutableListOf()

  public fun appIntegrationArn(appIntegrationArn: String) {
    cdkBuilder.appIntegrationArn(appIntegrationArn)
  }

  public fun objectFields(vararg objectFields: String) {
    _objectFields.addAll(listOf(*objectFields))
  }

  public fun objectFields(objectFields: Collection<String>) {
    _objectFields.addAll(objectFields)
  }

  public fun build(): CfnKnowledgeBase.AppIntegrationsConfigurationProperty {
    if(_objectFields.isNotEmpty()) cdkBuilder.objectFields(_objectFields)
    return cdkBuilder.build()
  }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wisdom

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wisdom.CfnKnowledgeBase

@CdkDslMarker
public class CfnKnowledgeBaseSourceConfigurationPropertyDsl {
  private val cdkBuilder: CfnKnowledgeBase.SourceConfigurationProperty.Builder =
      CfnKnowledgeBase.SourceConfigurationProperty.builder()

  /**
   * @param appIntegrations Configuration information for Amazon AppIntegrations to automatically
   * ingest content. 
   */
  public fun appIntegrations(appIntegrations: IResolvable) {
    cdkBuilder.appIntegrations(appIntegrations)
  }

  /**
   * @param appIntegrations Configuration information for Amazon AppIntegrations to automatically
   * ingest content. 
   */
  public
      fun appIntegrations(appIntegrations: CfnKnowledgeBase.AppIntegrationsConfigurationProperty) {
    cdkBuilder.appIntegrations(appIntegrations)
  }

  public fun build(): CfnKnowledgeBase.SourceConfigurationProperty = cdkBuilder.build()
}

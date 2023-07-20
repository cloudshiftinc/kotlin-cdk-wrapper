@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnDataSource

@CdkDslMarker
public class CfnDataSourceCustomDocumentEnrichmentConfigurationPropertyDsl {
  private val cdkBuilder: CfnDataSource.CustomDocumentEnrichmentConfigurationProperty.Builder =
      CfnDataSource.CustomDocumentEnrichmentConfigurationProperty.builder()

  private val _inlineConfigurations: MutableList<Any> = mutableListOf()

  public fun inlineConfigurations(vararg inlineConfigurations: Any) {
    _inlineConfigurations.addAll(listOf(*inlineConfigurations))
  }

  public fun inlineConfigurations(inlineConfigurations: Collection<Any>) {
    _inlineConfigurations.addAll(inlineConfigurations)
  }

  public fun inlineConfigurations(inlineConfigurations: IResolvable) {
    cdkBuilder.inlineConfigurations(inlineConfigurations)
  }

  public fun postExtractionHookConfiguration(postExtractionHookConfiguration: IResolvable) {
    cdkBuilder.postExtractionHookConfiguration(postExtractionHookConfiguration)
  }

  public
      fun postExtractionHookConfiguration(postExtractionHookConfiguration: CfnDataSource.HookConfigurationProperty) {
    cdkBuilder.postExtractionHookConfiguration(postExtractionHookConfiguration)
  }

  public fun preExtractionHookConfiguration(preExtractionHookConfiguration: IResolvable) {
    cdkBuilder.preExtractionHookConfiguration(preExtractionHookConfiguration)
  }

  public
      fun preExtractionHookConfiguration(preExtractionHookConfiguration: CfnDataSource.HookConfigurationProperty) {
    cdkBuilder.preExtractionHookConfiguration(preExtractionHookConfiguration)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun build(): CfnDataSource.CustomDocumentEnrichmentConfigurationProperty {
    if(_inlineConfigurations.isNotEmpty()) cdkBuilder.inlineConfigurations(_inlineConfigurations)
    return cdkBuilder.build()
  }
}

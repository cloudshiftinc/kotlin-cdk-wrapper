@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.healthlake

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.healthlake.CfnFHIRDatastore
import software.amazon.awscdk.services.healthlake.CfnFHIRDatastoreProps

@CdkDslMarker
public class CfnFHIRDatastorePropsDsl {
  private val cdkBuilder: CfnFHIRDatastoreProps.Builder = CfnFHIRDatastoreProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun datastoreName(datastoreName: String) {
    cdkBuilder.datastoreName(datastoreName)
  }

  public fun datastoreTypeVersion(datastoreTypeVersion: String) {
    cdkBuilder.datastoreTypeVersion(datastoreTypeVersion)
  }

  public fun identityProviderConfiguration(identityProviderConfiguration: IResolvable) {
    cdkBuilder.identityProviderConfiguration(identityProviderConfiguration)
  }

  public
      fun identityProviderConfiguration(identityProviderConfiguration: CfnFHIRDatastore.IdentityProviderConfigurationProperty) {
    cdkBuilder.identityProviderConfiguration(identityProviderConfiguration)
  }

  public fun preloadDataConfig(preloadDataConfig: IResolvable) {
    cdkBuilder.preloadDataConfig(preloadDataConfig)
  }

  public fun preloadDataConfig(preloadDataConfig: CfnFHIRDatastore.PreloadDataConfigProperty) {
    cdkBuilder.preloadDataConfig(preloadDataConfig)
  }

  public fun sseConfiguration(sseConfiguration: IResolvable) {
    cdkBuilder.sseConfiguration(sseConfiguration)
  }

  public fun sseConfiguration(sseConfiguration: CfnFHIRDatastore.SseConfigurationProperty) {
    cdkBuilder.sseConfiguration(sseConfiguration)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnFHIRDatastoreProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediapackage

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration

@CdkDslMarker
public class CfnPackagingConfigurationDashPackagePropertyDsl {
  private val cdkBuilder: CfnPackagingConfiguration.DashPackageProperty.Builder =
      CfnPackagingConfiguration.DashPackageProperty.builder()

  private val _dashManifests: MutableList<Any> = mutableListOf()

  private val _periodTriggers: MutableList<String> = mutableListOf()

  public fun dashManifests(vararg dashManifests: Any) {
    _dashManifests.addAll(listOf(*dashManifests))
  }

  public fun dashManifests(dashManifests: Collection<Any>) {
    _dashManifests.addAll(dashManifests)
  }

  public fun dashManifests(dashManifests: IResolvable) {
    cdkBuilder.dashManifests(dashManifests)
  }

  public fun encryption(encryption: IResolvable) {
    cdkBuilder.encryption(encryption)
  }

  public fun encryption(encryption: CfnPackagingConfiguration.DashEncryptionProperty) {
    cdkBuilder.encryption(encryption)
  }

  public fun includeEncoderConfigurationInSegments(includeEncoderConfigurationInSegments: Boolean) {
    cdkBuilder.includeEncoderConfigurationInSegments(includeEncoderConfigurationInSegments)
  }

  public
      fun includeEncoderConfigurationInSegments(includeEncoderConfigurationInSegments: IResolvable) {
    cdkBuilder.includeEncoderConfigurationInSegments(includeEncoderConfigurationInSegments)
  }

  public fun includeIframeOnlyStream(includeIframeOnlyStream: Boolean) {
    cdkBuilder.includeIframeOnlyStream(includeIframeOnlyStream)
  }

  public fun includeIframeOnlyStream(includeIframeOnlyStream: IResolvable) {
    cdkBuilder.includeIframeOnlyStream(includeIframeOnlyStream)
  }

  public fun periodTriggers(vararg periodTriggers: String) {
    _periodTriggers.addAll(listOf(*periodTriggers))
  }

  public fun periodTriggers(periodTriggers: Collection<String>) {
    _periodTriggers.addAll(periodTriggers)
  }

  public fun segmentDurationSeconds(segmentDurationSeconds: Number) {
    cdkBuilder.segmentDurationSeconds(segmentDurationSeconds)
  }

  public fun segmentTemplateFormat(segmentTemplateFormat: String) {
    cdkBuilder.segmentTemplateFormat(segmentTemplateFormat)
  }

  public fun build(): CfnPackagingConfiguration.DashPackageProperty {
    if(_dashManifests.isNotEmpty()) cdkBuilder.dashManifests(_dashManifests)
    if(_periodTriggers.isNotEmpty()) cdkBuilder.periodTriggers(_periodTriggers)
    return cdkBuilder.build()
  }
}

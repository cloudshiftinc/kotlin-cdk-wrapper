@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediapackage

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration

@CdkDslMarker
public class CfnPackagingConfigurationCmafPackagePropertyDsl {
  private val cdkBuilder: CfnPackagingConfiguration.CmafPackageProperty.Builder =
      CfnPackagingConfiguration.CmafPackageProperty.builder()

  private val _hlsManifests: MutableList<Any> = mutableListOf()

  public fun encryption(encryption: IResolvable) {
    cdkBuilder.encryption(encryption)
  }

  public fun encryption(encryption: CfnPackagingConfiguration.CmafEncryptionProperty) {
    cdkBuilder.encryption(encryption)
  }

  public fun hlsManifests(vararg hlsManifests: Any) {
    _hlsManifests.addAll(listOf(*hlsManifests))
  }

  public fun hlsManifests(hlsManifests: Collection<Any>) {
    _hlsManifests.addAll(hlsManifests)
  }

  public fun hlsManifests(hlsManifests: IResolvable) {
    cdkBuilder.hlsManifests(hlsManifests)
  }

  public fun includeEncoderConfigurationInSegments(includeEncoderConfigurationInSegments: Boolean) {
    cdkBuilder.includeEncoderConfigurationInSegments(includeEncoderConfigurationInSegments)
  }

  public
      fun includeEncoderConfigurationInSegments(includeEncoderConfigurationInSegments: IResolvable) {
    cdkBuilder.includeEncoderConfigurationInSegments(includeEncoderConfigurationInSegments)
  }

  public fun segmentDurationSeconds(segmentDurationSeconds: Number) {
    cdkBuilder.segmentDurationSeconds(segmentDurationSeconds)
  }

  public fun build(): CfnPackagingConfiguration.CmafPackageProperty {
    if(_hlsManifests.isNotEmpty()) cdkBuilder.hlsManifests(_hlsManifests)
    return cdkBuilder.build()
  }
}

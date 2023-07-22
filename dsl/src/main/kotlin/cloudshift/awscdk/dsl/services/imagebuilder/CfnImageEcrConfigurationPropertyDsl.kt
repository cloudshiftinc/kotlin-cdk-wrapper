@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.imagebuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.imagebuilder.CfnImage

@CdkDslMarker
public class CfnImageEcrConfigurationPropertyDsl {
  private val cdkBuilder: CfnImage.EcrConfigurationProperty.Builder =
      CfnImage.EcrConfigurationProperty.builder()

  private val _containerTags: MutableList<String> = mutableListOf()

  /**
   * @param containerTags Tags for Image Builder to apply the output container image that is
   * scanned.
   * Tags can help you identify and manage your scanned images.
   */
  public fun containerTags(vararg containerTags: String) {
    _containerTags.addAll(listOf(*containerTags))
  }

  /**
   * @param containerTags Tags for Image Builder to apply the output container image that is
   * scanned.
   * Tags can help you identify and manage your scanned images.
   */
  public fun containerTags(containerTags: Collection<String>) {
    _containerTags.addAll(containerTags)
  }

  /**
   * @param repositoryName The name of the container repository that Amazon Inspector scans to
   * identify findings for your container images.
   * The name includes the path for the repository location. If you don’t provide this information,
   * Image Builder creates a repository in your account named image-builder-image-scanning-repository
   * to use for vulnerability scans for your output container images.
   */
  public fun repositoryName(repositoryName: String) {
    cdkBuilder.repositoryName(repositoryName)
  }

  public fun build(): CfnImage.EcrConfigurationProperty {
    if(_containerTags.isNotEmpty()) cdkBuilder.containerTags(_containerTags)
    return cdkBuilder.build()
  }
}

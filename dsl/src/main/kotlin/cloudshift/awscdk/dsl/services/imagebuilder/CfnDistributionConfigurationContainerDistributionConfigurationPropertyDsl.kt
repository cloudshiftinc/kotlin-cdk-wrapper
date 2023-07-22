@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.imagebuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration

/**
 * Container distribution settings for encryption, licensing, and sharing in a specific Region.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.imagebuilder.*;
 * ContainerDistributionConfigurationProperty containerDistributionConfigurationProperty =
 * ContainerDistributionConfigurationProperty.builder()
 * .containerTags(List.of("containerTags"))
 * .description("description")
 * .targetRepository(TargetContainerRepositoryProperty.builder()
 * .repositoryName("repositoryName")
 * .service("service")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-containerdistributionconfiguration.html)
 */
@CdkDslMarker
public class CfnDistributionConfigurationContainerDistributionConfigurationPropertyDsl {
  private val cdkBuilder:
      CfnDistributionConfiguration.ContainerDistributionConfigurationProperty.Builder =
      CfnDistributionConfiguration.ContainerDistributionConfigurationProperty.builder()

  private val _containerTags: MutableList<String> = mutableListOf()

  /**
   * @param containerTags Tags that are attached to the container distribution configuration.
   */
  public fun containerTags(vararg containerTags: String) {
    _containerTags.addAll(listOf(*containerTags))
  }

  /**
   * @param containerTags Tags that are attached to the container distribution configuration.
   */
  public fun containerTags(containerTags: Collection<String>) {
    _containerTags.addAll(containerTags)
  }

  /**
   * @param description The description of the container distribution configuration.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param targetRepository The destination repository for the container distribution
   * configuration.
   */
  public fun targetRepository(targetRepository: IResolvable) {
    cdkBuilder.targetRepository(targetRepository)
  }

  /**
   * @param targetRepository The destination repository for the container distribution
   * configuration.
   */
  public
      fun targetRepository(targetRepository: CfnDistributionConfiguration.TargetContainerRepositoryProperty) {
    cdkBuilder.targetRepository(targetRepository)
  }

  public fun build(): CfnDistributionConfiguration.ContainerDistributionConfigurationProperty {
    if(_containerTags.isNotEmpty()) cdkBuilder.containerTags(_containerTags)
    return cdkBuilder.build()
  }
}

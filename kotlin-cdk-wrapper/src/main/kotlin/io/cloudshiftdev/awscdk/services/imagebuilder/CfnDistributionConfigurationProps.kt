@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.imagebuilder

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Properties for defining a `CfnDistributionConfiguration`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.imagebuilder.*;
 * Object amiDistributionConfiguration;
 * Object containerDistributionConfiguration;
 * CfnDistributionConfigurationProps cfnDistributionConfigurationProps =
 * CfnDistributionConfigurationProps.builder()
 * .distributions(List.of(DistributionProperty.builder()
 * .region("region")
 * // the properties below are optional
 * .amiDistributionConfiguration(amiDistributionConfiguration)
 * .containerDistributionConfiguration(containerDistributionConfiguration)
 * .fastLaunchConfigurations(List.of(FastLaunchConfigurationProperty.builder()
 * .accountId("accountId")
 * .enabled(false)
 * .launchTemplate(FastLaunchLaunchTemplateSpecificationProperty.builder()
 * .launchTemplateId("launchTemplateId")
 * .launchTemplateName("launchTemplateName")
 * .launchTemplateVersion("launchTemplateVersion")
 * .build())
 * .maxParallelLaunches(123)
 * .snapshotConfiguration(FastLaunchSnapshotConfigurationProperty.builder()
 * .targetResourceCount(123)
 * .build())
 * .build()))
 * .launchTemplateConfigurations(List.of(LaunchTemplateConfigurationProperty.builder()
 * .accountId("accountId")
 * .launchTemplateId("launchTemplateId")
 * .setDefaultVersion(false)
 * .build()))
 * .licenseConfigurationArns(List.of("licenseConfigurationArns"))
 * .build()))
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-distributionconfiguration.html)
 */
public interface CfnDistributionConfigurationProps {
  /**
   * The description of this distribution configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-distributionconfiguration.html#cfn-imagebuilder-distributionconfiguration-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The distributions of this distribution configuration formatted as an array of Distribution
   * objects.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-distributionconfiguration.html#cfn-imagebuilder-distributionconfiguration-distributions)
   */
  public fun distributions(): Any

  /**
   * The name of this distribution configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-distributionconfiguration.html#cfn-imagebuilder-distributionconfiguration-name)
   */
  public fun name(): String

  /**
   * The tags of this distribution configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-distributionconfiguration.html#cfn-imagebuilder-distributionconfiguration-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [CfnDistributionConfigurationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of this distribution configuration.
     */
    public fun description(description: String)

    /**
     * @param distributions The distributions of this distribution configuration formatted as an
     * array of Distribution objects. 
     */
    public fun distributions(distributions: IResolvable)

    /**
     * @param distributions The distributions of this distribution configuration formatted as an
     * array of Distribution objects. 
     */
    public fun distributions(distributions: List<Any>)

    /**
     * @param distributions The distributions of this distribution configuration formatted as an
     * array of Distribution objects. 
     */
    public fun distributions(vararg distributions: Any)

    /**
     * @param name The name of this distribution configuration. 
     */
    public fun name(name: String)

    /**
     * @param tags The tags of this distribution configuration.
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.imagebuilder.CfnDistributionConfigurationProps.Builder =
        software.amazon.awscdk.services.imagebuilder.CfnDistributionConfigurationProps.builder()

    /**
     * @param description The description of this distribution configuration.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param distributions The distributions of this distribution configuration formatted as an
     * array of Distribution objects. 
     */
    override fun distributions(distributions: IResolvable) {
      cdkBuilder.distributions(distributions.let(IResolvable::unwrap))
    }

    /**
     * @param distributions The distributions of this distribution configuration formatted as an
     * array of Distribution objects. 
     */
    override fun distributions(distributions: List<Any>) {
      cdkBuilder.distributions(distributions)
    }

    /**
     * @param distributions The distributions of this distribution configuration formatted as an
     * array of Distribution objects. 
     */
    override fun distributions(vararg distributions: Any): Unit =
        distributions(distributions.toList())

    /**
     * @param name The name of this distribution configuration. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags The tags of this distribution configuration.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build():
        software.amazon.awscdk.services.imagebuilder.CfnDistributionConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.imagebuilder.CfnDistributionConfigurationProps,
  ) : CdkObject(cdkObject), CfnDistributionConfigurationProps {
    /**
     * The description of this distribution configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-distributionconfiguration.html#cfn-imagebuilder-distributionconfiguration-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The distributions of this distribution configuration formatted as an array of Distribution
     * objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-distributionconfiguration.html#cfn-imagebuilder-distributionconfiguration-distributions)
     */
    override fun distributions(): Any = unwrap(this).getDistributions()

    /**
     * The name of this distribution configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-distributionconfiguration.html#cfn-imagebuilder-distributionconfiguration-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The tags of this distribution configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-distributionconfiguration.html#cfn-imagebuilder-distributionconfiguration-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDistributionConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnDistributionConfigurationProps):
        CfnDistributionConfigurationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnDistributionConfigurationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDistributionConfigurationProps):
        software.amazon.awscdk.services.imagebuilder.CfnDistributionConfigurationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.imagebuilder.CfnDistributionConfigurationProps
  }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssmquicksetup

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
 * Properties for defining a `CfnConfigurationManager`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ssmquicksetup.*;
 * CfnConfigurationManagerProps cfnConfigurationManagerProps =
 * CfnConfigurationManagerProps.builder()
 * .configurationDefinitions(List.of(ConfigurationDefinitionProperty.builder()
 * .parameters(Map.of(
 * "parametersKey", "parameters"))
 * .type("type")
 * // the properties below are optional
 * .id("id")
 * .localDeploymentAdministrationRoleArn("localDeploymentAdministrationRoleArn")
 * .localDeploymentExecutionRoleName("localDeploymentExecutionRoleName")
 * .typeVersion("typeVersion")
 * .build()))
 * // the properties below are optional
 * .description("description")
 * .name("name")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmquicksetup-configurationmanager.html)
 */
public interface CfnConfigurationManagerProps {
  /**
   * The definition of the Quick Setup configuration that the configuration manager deploys.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmquicksetup-configurationmanager.html#cfn-ssmquicksetup-configurationmanager-configurationdefinitions)
   */
  public fun configurationDefinitions(): Any

  /**
   * The description of the configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmquicksetup-configurationmanager.html#cfn-ssmquicksetup-configurationmanager-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmquicksetup-configurationmanager.html#cfn-ssmquicksetup-configurationmanager-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * Key-value pairs of metadata to assign to the configuration manager.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmquicksetup-configurationmanager.html#cfn-ssmquicksetup-configurationmanager-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [CfnConfigurationManagerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param configurationDefinitions The definition of the Quick Setup configuration that the
     * configuration manager deploys. 
     */
    public fun configurationDefinitions(configurationDefinitions: IResolvable)

    /**
     * @param configurationDefinitions The definition of the Quick Setup configuration that the
     * configuration manager deploys. 
     */
    public fun configurationDefinitions(configurationDefinitions: List<Any>)

    /**
     * @param configurationDefinitions The definition of the Quick Setup configuration that the
     * configuration manager deploys. 
     */
    public fun configurationDefinitions(vararg configurationDefinitions: Any)

    /**
     * @param description The description of the configuration.
     */
    public fun description(description: String)

    /**
     * @param name The name of the configuration.
     */
    public fun name(name: String)

    /**
     * @param tags Key-value pairs of metadata to assign to the configuration manager.
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ssmquicksetup.CfnConfigurationManagerProps.Builder =
        software.amazon.awscdk.services.ssmquicksetup.CfnConfigurationManagerProps.builder()

    /**
     * @param configurationDefinitions The definition of the Quick Setup configuration that the
     * configuration manager deploys. 
     */
    override fun configurationDefinitions(configurationDefinitions: IResolvable) {
      cdkBuilder.configurationDefinitions(configurationDefinitions.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param configurationDefinitions The definition of the Quick Setup configuration that the
     * configuration manager deploys. 
     */
    override fun configurationDefinitions(configurationDefinitions: List<Any>) {
      cdkBuilder.configurationDefinitions(configurationDefinitions.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param configurationDefinitions The definition of the Quick Setup configuration that the
     * configuration manager deploys. 
     */
    override fun configurationDefinitions(vararg configurationDefinitions: Any): Unit =
        configurationDefinitions(configurationDefinitions.toList())

    /**
     * @param description The description of the configuration.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The name of the configuration.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags Key-value pairs of metadata to assign to the configuration manager.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.ssmquicksetup.CfnConfigurationManagerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ssmquicksetup.CfnConfigurationManagerProps,
  ) : CdkObject(cdkObject),
      CfnConfigurationManagerProps {
    /**
     * The definition of the Quick Setup configuration that the configuration manager deploys.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmquicksetup-configurationmanager.html#cfn-ssmquicksetup-configurationmanager-configurationdefinitions)
     */
    override fun configurationDefinitions(): Any = unwrap(this).getConfigurationDefinitions()

    /**
     * The description of the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmquicksetup-configurationmanager.html#cfn-ssmquicksetup-configurationmanager-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmquicksetup-configurationmanager.html#cfn-ssmquicksetup-configurationmanager-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * Key-value pairs of metadata to assign to the configuration manager.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmquicksetup-configurationmanager.html#cfn-ssmquicksetup-configurationmanager-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConfigurationManagerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ssmquicksetup.CfnConfigurationManagerProps):
        CfnConfigurationManagerProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnConfigurationManagerProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConfigurationManagerProps):
        software.amazon.awscdk.services.ssmquicksetup.CfnConfigurationManagerProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ssmquicksetup.CfnConfigurationManagerProps
  }
}

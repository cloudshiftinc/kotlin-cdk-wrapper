@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datazone

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnProjectProfile`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.datazone.*;
 * CfnProjectProfileProps cfnProjectProfileProps = CfnProjectProfileProps.builder()
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .domainIdentifier("domainIdentifier")
 * .domainUnitIdentifier("domainUnitIdentifier")
 * .environmentConfigurations(List.of(EnvironmentConfigurationProperty.builder()
 * .awsRegion(RegionProperty.builder()
 * .regionName("regionName")
 * .build())
 * .environmentBlueprintId("environmentBlueprintId")
 * .name("name")
 * // the properties below are optional
 * .awsAccount(AwsAccountProperty.builder()
 * .awsAccountId("awsAccountId")
 * .build())
 * .configurationParameters(EnvironmentConfigurationParametersDetailsProperty.builder()
 * .parameterOverrides(List.of(EnvironmentConfigurationParameterProperty.builder()
 * .isEditable(false)
 * .name("name")
 * .value("value")
 * .build()))
 * .resolvedParameters(List.of(EnvironmentConfigurationParameterProperty.builder()
 * .isEditable(false)
 * .name("name")
 * .value("value")
 * .build()))
 * .ssmPath("ssmPath")
 * .build())
 * .deploymentMode("deploymentMode")
 * .deploymentOrder(123)
 * .description("description")
 * .id("id")
 * .build()))
 * .status("status")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-projectprofile.html)
 */
public interface CfnProjectProfileProps {
  /**
   * The description of the project profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-projectprofile.html#cfn-datazone-projectprofile-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-projectprofile.html#cfn-datazone-projectprofile-domainidentifier)
   */
  public fun domainIdentifier(): String? = unwrap(this).getDomainIdentifier()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-projectprofile.html#cfn-datazone-projectprofile-domainunitidentifier)
   */
  public fun domainUnitIdentifier(): String? = unwrap(this).getDomainUnitIdentifier()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-projectprofile.html#cfn-datazone-projectprofile-environmentconfigurations)
   */
  public fun environmentConfigurations(): Any? = unwrap(this).getEnvironmentConfigurations()

  /**
   * The name of a project profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-projectprofile.html#cfn-datazone-projectprofile-name)
   */
  public fun name(): String

  /**
   * The status of a project profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-projectprofile.html#cfn-datazone-projectprofile-status)
   */
  public fun status(): String? = unwrap(this).getStatus()

  /**
   * A builder for [CfnProjectProfileProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the project profile.
     */
    public fun description(description: String)

    /**
     * @param domainIdentifier the value to be set.
     */
    public fun domainIdentifier(domainIdentifier: String)

    /**
     * @param domainUnitIdentifier the value to be set.
     */
    public fun domainUnitIdentifier(domainUnitIdentifier: String)

    /**
     * @param environmentConfigurations the value to be set.
     */
    public fun environmentConfigurations(environmentConfigurations: IResolvable)

    /**
     * @param environmentConfigurations the value to be set.
     */
    public fun environmentConfigurations(environmentConfigurations: List<Any>)

    /**
     * @param environmentConfigurations the value to be set.
     */
    public fun environmentConfigurations(vararg environmentConfigurations: Any)

    /**
     * @param name The name of a project profile. 
     */
    public fun name(name: String)

    /**
     * @param status The status of a project profile.
     */
    public fun status(status: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datazone.CfnProjectProfileProps.Builder
        = software.amazon.awscdk.services.datazone.CfnProjectProfileProps.builder()

    /**
     * @param description The description of the project profile.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param domainIdentifier the value to be set.
     */
    override fun domainIdentifier(domainIdentifier: String) {
      cdkBuilder.domainIdentifier(domainIdentifier)
    }

    /**
     * @param domainUnitIdentifier the value to be set.
     */
    override fun domainUnitIdentifier(domainUnitIdentifier: String) {
      cdkBuilder.domainUnitIdentifier(domainUnitIdentifier)
    }

    /**
     * @param environmentConfigurations the value to be set.
     */
    override fun environmentConfigurations(environmentConfigurations: IResolvable) {
      cdkBuilder.environmentConfigurations(environmentConfigurations.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param environmentConfigurations the value to be set.
     */
    override fun environmentConfigurations(environmentConfigurations: List<Any>) {
      cdkBuilder.environmentConfigurations(environmentConfigurations.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param environmentConfigurations the value to be set.
     */
    override fun environmentConfigurations(vararg environmentConfigurations: Any): Unit =
        environmentConfigurations(environmentConfigurations.toList())

    /**
     * @param name The name of a project profile. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param status The status of a project profile.
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    public fun build(): software.amazon.awscdk.services.datazone.CfnProjectProfileProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.datazone.CfnProjectProfileProps,
  ) : CdkObject(cdkObject),
      CfnProjectProfileProps {
    /**
     * The description of the project profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-projectprofile.html#cfn-datazone-projectprofile-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-projectprofile.html#cfn-datazone-projectprofile-domainidentifier)
     */
    override fun domainIdentifier(): String? = unwrap(this).getDomainIdentifier()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-projectprofile.html#cfn-datazone-projectprofile-domainunitidentifier)
     */
    override fun domainUnitIdentifier(): String? = unwrap(this).getDomainUnitIdentifier()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-projectprofile.html#cfn-datazone-projectprofile-environmentconfigurations)
     */
    override fun environmentConfigurations(): Any? = unwrap(this).getEnvironmentConfigurations()

    /**
     * The name of a project profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-projectprofile.html#cfn-datazone-projectprofile-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The status of a project profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-projectprofile.html#cfn-datazone-projectprofile-status)
     */
    override fun status(): String? = unwrap(this).getStatus()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnProjectProfileProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnProjectProfileProps):
        CfnProjectProfileProps = CdkObjectWrappers.wrap(cdkObject) as? CfnProjectProfileProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnProjectProfileProps):
        software.amazon.awscdk.services.datazone.CfnProjectProfileProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.datazone.CfnProjectProfileProps
  }
}

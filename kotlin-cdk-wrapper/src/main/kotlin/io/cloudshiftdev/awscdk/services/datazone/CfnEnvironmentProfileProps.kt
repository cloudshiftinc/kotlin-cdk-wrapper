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
 * Properties for defining a `CfnEnvironmentProfile`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.datazone.*;
 * CfnEnvironmentProfileProps cfnEnvironmentProfileProps = CfnEnvironmentProfileProps.builder()
 * .awsAccountId("awsAccountId")
 * .awsAccountRegion("awsAccountRegion")
 * .domainIdentifier("domainIdentifier")
 * .environmentBlueprintIdentifier("environmentBlueprintIdentifier")
 * .name("name")
 * .projectIdentifier("projectIdentifier")
 * // the properties below are optional
 * .description("description")
 * .userParameters(List.of(EnvironmentParameterProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentprofile.html)
 */
public interface CfnEnvironmentProfileProps {
  /**
   * The identifier of an AWS account in which an environment profile exists.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentprofile.html#cfn-datazone-environmentprofile-awsaccountid)
   */
  public fun awsAccountId(): String

  /**
   * The AWS Region in which an environment profile exists.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentprofile.html#cfn-datazone-environmentprofile-awsaccountregion)
   */
  public fun awsAccountRegion(): String

  /**
   * The description of the environment profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentprofile.html#cfn-datazone-environmentprofile-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The identifier of the Amazon DataZone domain in which the environment profile exists.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentprofile.html#cfn-datazone-environmentprofile-domainidentifier)
   */
  public fun domainIdentifier(): String

  /**
   * The identifier of a blueprint with which an environment profile is created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentprofile.html#cfn-datazone-environmentprofile-environmentblueprintidentifier)
   */
  public fun environmentBlueprintIdentifier(): String

  /**
   * The name of the environment profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentprofile.html#cfn-datazone-environmentprofile-name)
   */
  public fun name(): String

  /**
   * The identifier of a project in which an environment profile exists.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentprofile.html#cfn-datazone-environmentprofile-projectidentifier)
   */
  public fun projectIdentifier(): String

  /**
   * The user parameters of this Amazon DataZone environment profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentprofile.html#cfn-datazone-environmentprofile-userparameters)
   */
  public fun userParameters(): Any? = unwrap(this).getUserParameters()

  /**
   * A builder for [CfnEnvironmentProfileProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param awsAccountId The identifier of an AWS account in which an environment profile exists. 
     */
    public fun awsAccountId(awsAccountId: String)

    /**
     * @param awsAccountRegion The AWS Region in which an environment profile exists. 
     */
    public fun awsAccountRegion(awsAccountRegion: String)

    /**
     * @param description The description of the environment profile.
     */
    public fun description(description: String)

    /**
     * @param domainIdentifier The identifier of the Amazon DataZone domain in which the environment
     * profile exists. 
     */
    public fun domainIdentifier(domainIdentifier: String)

    /**
     * @param environmentBlueprintIdentifier The identifier of a blueprint with which an environment
     * profile is created. 
     */
    public fun environmentBlueprintIdentifier(environmentBlueprintIdentifier: String)

    /**
     * @param name The name of the environment profile. 
     */
    public fun name(name: String)

    /**
     * @param projectIdentifier The identifier of a project in which an environment profile exists. 
     */
    public fun projectIdentifier(projectIdentifier: String)

    /**
     * @param userParameters The user parameters of this Amazon DataZone environment profile.
     */
    public fun userParameters(userParameters: IResolvable)

    /**
     * @param userParameters The user parameters of this Amazon DataZone environment profile.
     */
    public fun userParameters(userParameters: List<Any>)

    /**
     * @param userParameters The user parameters of this Amazon DataZone environment profile.
     */
    public fun userParameters(vararg userParameters: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.datazone.CfnEnvironmentProfileProps.Builder =
        software.amazon.awscdk.services.datazone.CfnEnvironmentProfileProps.builder()

    /**
     * @param awsAccountId The identifier of an AWS account in which an environment profile exists. 
     */
    override fun awsAccountId(awsAccountId: String) {
      cdkBuilder.awsAccountId(awsAccountId)
    }

    /**
     * @param awsAccountRegion The AWS Region in which an environment profile exists. 
     */
    override fun awsAccountRegion(awsAccountRegion: String) {
      cdkBuilder.awsAccountRegion(awsAccountRegion)
    }

    /**
     * @param description The description of the environment profile.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param domainIdentifier The identifier of the Amazon DataZone domain in which the environment
     * profile exists. 
     */
    override fun domainIdentifier(domainIdentifier: String) {
      cdkBuilder.domainIdentifier(domainIdentifier)
    }

    /**
     * @param environmentBlueprintIdentifier The identifier of a blueprint with which an environment
     * profile is created. 
     */
    override fun environmentBlueprintIdentifier(environmentBlueprintIdentifier: String) {
      cdkBuilder.environmentBlueprintIdentifier(environmentBlueprintIdentifier)
    }

    /**
     * @param name The name of the environment profile. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param projectIdentifier The identifier of a project in which an environment profile exists. 
     */
    override fun projectIdentifier(projectIdentifier: String) {
      cdkBuilder.projectIdentifier(projectIdentifier)
    }

    /**
     * @param userParameters The user parameters of this Amazon DataZone environment profile.
     */
    override fun userParameters(userParameters: IResolvable) {
      cdkBuilder.userParameters(userParameters.let(IResolvable::unwrap))
    }

    /**
     * @param userParameters The user parameters of this Amazon DataZone environment profile.
     */
    override fun userParameters(userParameters: List<Any>) {
      cdkBuilder.userParameters(userParameters.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param userParameters The user parameters of this Amazon DataZone environment profile.
     */
    override fun userParameters(vararg userParameters: Any): Unit =
        userParameters(userParameters.toList())

    public fun build(): software.amazon.awscdk.services.datazone.CfnEnvironmentProfileProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.datazone.CfnEnvironmentProfileProps,
  ) : CdkObject(cdkObject), CfnEnvironmentProfileProps {
    /**
     * The identifier of an AWS account in which an environment profile exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentprofile.html#cfn-datazone-environmentprofile-awsaccountid)
     */
    override fun awsAccountId(): String = unwrap(this).getAwsAccountId()

    /**
     * The AWS Region in which an environment profile exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentprofile.html#cfn-datazone-environmentprofile-awsaccountregion)
     */
    override fun awsAccountRegion(): String = unwrap(this).getAwsAccountRegion()

    /**
     * The description of the environment profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentprofile.html#cfn-datazone-environmentprofile-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The identifier of the Amazon DataZone domain in which the environment profile exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentprofile.html#cfn-datazone-environmentprofile-domainidentifier)
     */
    override fun domainIdentifier(): String = unwrap(this).getDomainIdentifier()

    /**
     * The identifier of a blueprint with which an environment profile is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentprofile.html#cfn-datazone-environmentprofile-environmentblueprintidentifier)
     */
    override fun environmentBlueprintIdentifier(): String =
        unwrap(this).getEnvironmentBlueprintIdentifier()

    /**
     * The name of the environment profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentprofile.html#cfn-datazone-environmentprofile-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The identifier of a project in which an environment profile exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentprofile.html#cfn-datazone-environmentprofile-projectidentifier)
     */
    override fun projectIdentifier(): String = unwrap(this).getProjectIdentifier()

    /**
     * The user parameters of this Amazon DataZone environment profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentprofile.html#cfn-datazone-environmentprofile-userparameters)
     */
    override fun userParameters(): Any? = unwrap(this).getUserParameters()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEnvironmentProfileProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnEnvironmentProfileProps):
        CfnEnvironmentProfileProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnEnvironmentProfileProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEnvironmentProfileProps):
        software.amazon.awscdk.services.datazone.CfnEnvironmentProfileProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.datazone.CfnEnvironmentProfileProps
  }
}

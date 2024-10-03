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
 * Properties for defining a `CfnEnvironment`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.datazone.*;
 * CfnEnvironmentProps cfnEnvironmentProps = CfnEnvironmentProps.builder()
 * .domainIdentifier("domainIdentifier")
 * .name("name")
 * .projectIdentifier("projectIdentifier")
 * // the properties below are optional
 * .description("description")
 * .environmentAccountIdentifier("environmentAccountIdentifier")
 * .environmentAccountRegion("environmentAccountRegion")
 * .environmentProfileIdentifier("environmentProfileIdentifier")
 * .environmentRoleArn("environmentRoleArn")
 * .glossaryTerms(List.of("glossaryTerms"))
 * .userParameters(List.of(EnvironmentParameterProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environment.html)
 */
public interface CfnEnvironmentProps {
  /**
   * The description of the environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environment.html#cfn-datazone-environment-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The identifier of the Amazon DataZone domain in which the environment is created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environment.html#cfn-datazone-environment-domainidentifier)
   */
  public fun domainIdentifier(): String

  /**
   * The identifier of the AWS account in which an environment exists.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environment.html#cfn-datazone-environment-environmentaccountidentifier)
   */
  public fun environmentAccountIdentifier(): String? =
      unwrap(this).getEnvironmentAccountIdentifier()

  /**
   * The AWS Region in which an environment exists.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environment.html#cfn-datazone-environment-environmentaccountregion)
   */
  public fun environmentAccountRegion(): String? = unwrap(this).getEnvironmentAccountRegion()

  /**
   * The identifier of the environment profile that is used to create this Amazon DataZone
   * environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environment.html#cfn-datazone-environment-environmentprofileidentifier)
   */
  public fun environmentProfileIdentifier(): String? =
      unwrap(this).getEnvironmentProfileIdentifier()

  /**
   * The ARN of the environment role.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environment.html#cfn-datazone-environment-environmentrolearn)
   */
  public fun environmentRoleArn(): String? = unwrap(this).getEnvironmentRoleArn()

  /**
   * The glossary terms that can be used in this Amazon DataZone environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environment.html#cfn-datazone-environment-glossaryterms)
   */
  public fun glossaryTerms(): List<String> = unwrap(this).getGlossaryTerms() ?: emptyList()

  /**
   * The name of the Amazon DataZone environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environment.html#cfn-datazone-environment-name)
   */
  public fun name(): String

  /**
   * The identifier of the Amazon DataZone project in which this environment is created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environment.html#cfn-datazone-environment-projectidentifier)
   */
  public fun projectIdentifier(): String

  /**
   * The user parameters of this Amazon DataZone environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environment.html#cfn-datazone-environment-userparameters)
   */
  public fun userParameters(): Any? = unwrap(this).getUserParameters()

  /**
   * A builder for [CfnEnvironmentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the environment.
     */
    public fun description(description: String)

    /**
     * @param domainIdentifier The identifier of the Amazon DataZone domain in which the environment
     * is created. 
     */
    public fun domainIdentifier(domainIdentifier: String)

    /**
     * @param environmentAccountIdentifier The identifier of the AWS account in which an environment
     * exists.
     */
    public fun environmentAccountIdentifier(environmentAccountIdentifier: String)

    /**
     * @param environmentAccountRegion The AWS Region in which an environment exists.
     */
    public fun environmentAccountRegion(environmentAccountRegion: String)

    /**
     * @param environmentProfileIdentifier The identifier of the environment profile that is used to
     * create this Amazon DataZone environment.
     */
    public fun environmentProfileIdentifier(environmentProfileIdentifier: String)

    /**
     * @param environmentRoleArn The ARN of the environment role.
     */
    public fun environmentRoleArn(environmentRoleArn: String)

    /**
     * @param glossaryTerms The glossary terms that can be used in this Amazon DataZone environment.
     */
    public fun glossaryTerms(glossaryTerms: List<String>)

    /**
     * @param glossaryTerms The glossary terms that can be used in this Amazon DataZone environment.
     */
    public fun glossaryTerms(vararg glossaryTerms: String)

    /**
     * @param name The name of the Amazon DataZone environment. 
     */
    public fun name(name: String)

    /**
     * @param projectIdentifier The identifier of the Amazon DataZone project in which this
     * environment is created. 
     */
    public fun projectIdentifier(projectIdentifier: String)

    /**
     * @param userParameters The user parameters of this Amazon DataZone environment.
     */
    public fun userParameters(userParameters: IResolvable)

    /**
     * @param userParameters The user parameters of this Amazon DataZone environment.
     */
    public fun userParameters(userParameters: List<Any>)

    /**
     * @param userParameters The user parameters of this Amazon DataZone environment.
     */
    public fun userParameters(vararg userParameters: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datazone.CfnEnvironmentProps.Builder =
        software.amazon.awscdk.services.datazone.CfnEnvironmentProps.builder()

    /**
     * @param description The description of the environment.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param domainIdentifier The identifier of the Amazon DataZone domain in which the environment
     * is created. 
     */
    override fun domainIdentifier(domainIdentifier: String) {
      cdkBuilder.domainIdentifier(domainIdentifier)
    }

    /**
     * @param environmentAccountIdentifier The identifier of the AWS account in which an environment
     * exists.
     */
    override fun environmentAccountIdentifier(environmentAccountIdentifier: String) {
      cdkBuilder.environmentAccountIdentifier(environmentAccountIdentifier)
    }

    /**
     * @param environmentAccountRegion The AWS Region in which an environment exists.
     */
    override fun environmentAccountRegion(environmentAccountRegion: String) {
      cdkBuilder.environmentAccountRegion(environmentAccountRegion)
    }

    /**
     * @param environmentProfileIdentifier The identifier of the environment profile that is used to
     * create this Amazon DataZone environment.
     */
    override fun environmentProfileIdentifier(environmentProfileIdentifier: String) {
      cdkBuilder.environmentProfileIdentifier(environmentProfileIdentifier)
    }

    /**
     * @param environmentRoleArn The ARN of the environment role.
     */
    override fun environmentRoleArn(environmentRoleArn: String) {
      cdkBuilder.environmentRoleArn(environmentRoleArn)
    }

    /**
     * @param glossaryTerms The glossary terms that can be used in this Amazon DataZone environment.
     */
    override fun glossaryTerms(glossaryTerms: List<String>) {
      cdkBuilder.glossaryTerms(glossaryTerms)
    }

    /**
     * @param glossaryTerms The glossary terms that can be used in this Amazon DataZone environment.
     */
    override fun glossaryTerms(vararg glossaryTerms: String): Unit =
        glossaryTerms(glossaryTerms.toList())

    /**
     * @param name The name of the Amazon DataZone environment. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param projectIdentifier The identifier of the Amazon DataZone project in which this
     * environment is created. 
     */
    override fun projectIdentifier(projectIdentifier: String) {
      cdkBuilder.projectIdentifier(projectIdentifier)
    }

    /**
     * @param userParameters The user parameters of this Amazon DataZone environment.
     */
    override fun userParameters(userParameters: IResolvable) {
      cdkBuilder.userParameters(userParameters.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param userParameters The user parameters of this Amazon DataZone environment.
     */
    override fun userParameters(userParameters: List<Any>) {
      cdkBuilder.userParameters(userParameters.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param userParameters The user parameters of this Amazon DataZone environment.
     */
    override fun userParameters(vararg userParameters: Any): Unit =
        userParameters(userParameters.toList())

    public fun build(): software.amazon.awscdk.services.datazone.CfnEnvironmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.datazone.CfnEnvironmentProps,
  ) : CdkObject(cdkObject),
      CfnEnvironmentProps {
    /**
     * The description of the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environment.html#cfn-datazone-environment-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The identifier of the Amazon DataZone domain in which the environment is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environment.html#cfn-datazone-environment-domainidentifier)
     */
    override fun domainIdentifier(): String = unwrap(this).getDomainIdentifier()

    /**
     * The identifier of the AWS account in which an environment exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environment.html#cfn-datazone-environment-environmentaccountidentifier)
     */
    override fun environmentAccountIdentifier(): String? =
        unwrap(this).getEnvironmentAccountIdentifier()

    /**
     * The AWS Region in which an environment exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environment.html#cfn-datazone-environment-environmentaccountregion)
     */
    override fun environmentAccountRegion(): String? = unwrap(this).getEnvironmentAccountRegion()

    /**
     * The identifier of the environment profile that is used to create this Amazon DataZone
     * environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environment.html#cfn-datazone-environment-environmentprofileidentifier)
     */
    override fun environmentProfileIdentifier(): String? =
        unwrap(this).getEnvironmentProfileIdentifier()

    /**
     * The ARN of the environment role.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environment.html#cfn-datazone-environment-environmentrolearn)
     */
    override fun environmentRoleArn(): String? = unwrap(this).getEnvironmentRoleArn()

    /**
     * The glossary terms that can be used in this Amazon DataZone environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environment.html#cfn-datazone-environment-glossaryterms)
     */
    override fun glossaryTerms(): List<String> = unwrap(this).getGlossaryTerms() ?: emptyList()

    /**
     * The name of the Amazon DataZone environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environment.html#cfn-datazone-environment-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The identifier of the Amazon DataZone project in which this environment is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environment.html#cfn-datazone-environment-projectidentifier)
     */
    override fun projectIdentifier(): String = unwrap(this).getProjectIdentifier()

    /**
     * The user parameters of this Amazon DataZone environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environment.html#cfn-datazone-environment-userparameters)
     */
    override fun userParameters(): Any? = unwrap(this).getUserParameters()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEnvironmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnEnvironmentProps):
        CfnEnvironmentProps = CdkObjectWrappers.wrap(cdkObject) as? CfnEnvironmentProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEnvironmentProps):
        software.amazon.awscdk.services.datazone.CfnEnvironmentProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.datazone.CfnEnvironmentProps
  }
}

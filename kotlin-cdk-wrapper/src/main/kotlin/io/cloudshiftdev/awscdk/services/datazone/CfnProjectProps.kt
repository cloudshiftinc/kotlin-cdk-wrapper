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
 * Properties for defining a `CfnProject`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.datazone.*;
 * CfnProjectProps cfnProjectProps = CfnProjectProps.builder()
 * .domainIdentifier("domainIdentifier")
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .domainUnitId("domainUnitId")
 * .glossaryTerms(List.of("glossaryTerms"))
 * .projectProfileId("projectProfileId")
 * .projectProfileVersion("projectProfileVersion")
 * .userParameters(List.of(EnvironmentConfigurationUserParameterProperty.builder()
 * .environmentConfigurationName("environmentConfigurationName")
 * .environmentId("environmentId")
 * .environmentParameters(List.of(EnvironmentParameterProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html)
 */
public interface CfnProjectProps {
  /**
   * The description of a project.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The identifier of a Amazon DataZone domain where the project exists.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-domainidentifier)
   */
  public fun domainIdentifier(): String

  /**
   * The ID of the domain unit.
   *
   * This parameter is not required and if it is not specified, then the project is created at the
   * root domain unit level.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-domainunitid)
   */
  public fun domainUnitId(): String? = unwrap(this).getDomainUnitId()

  /**
   * The glossary terms that can be used in this Amazon DataZone project.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-glossaryterms)
   */
  public fun glossaryTerms(): List<String> = unwrap(this).getGlossaryTerms() ?: emptyList()

  /**
   * The name of a project.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-name)
   */
  public fun name(): String

  /**
   * The project profile ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-projectprofileid)
   */
  public fun projectProfileId(): String? = unwrap(this).getProjectProfileId()

  /**
   * The project profile version to which the project should be updated.
   *
   * You can only specify the following string for this parameter: latest.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-projectprofileversion)
   */
  public fun projectProfileVersion(): String? = unwrap(this).getProjectProfileVersion()

  /**
   * The user parameters of the project.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-userparameters)
   */
  public fun userParameters(): Any? = unwrap(this).getUserParameters()

  /**
   * A builder for [CfnProjectProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of a project.
     */
    public fun description(description: String)

    /**
     * @param domainIdentifier The identifier of a Amazon DataZone domain where the project exists. 
     */
    public fun domainIdentifier(domainIdentifier: String)

    /**
     * @param domainUnitId The ID of the domain unit.
     * This parameter is not required and if it is not specified, then the project is created at the
     * root domain unit level.
     */
    public fun domainUnitId(domainUnitId: String)

    /**
     * @param glossaryTerms The glossary terms that can be used in this Amazon DataZone project.
     */
    public fun glossaryTerms(glossaryTerms: List<String>)

    /**
     * @param glossaryTerms The glossary terms that can be used in this Amazon DataZone project.
     */
    public fun glossaryTerms(vararg glossaryTerms: String)

    /**
     * @param name The name of a project. 
     */
    public fun name(name: String)

    /**
     * @param projectProfileId The project profile ID.
     */
    public fun projectProfileId(projectProfileId: String)

    /**
     * @param projectProfileVersion The project profile version to which the project should be
     * updated.
     * You can only specify the following string for this parameter: latest.
     */
    public fun projectProfileVersion(projectProfileVersion: String)

    /**
     * @param userParameters The user parameters of the project.
     */
    public fun userParameters(userParameters: IResolvable)

    /**
     * @param userParameters The user parameters of the project.
     */
    public fun userParameters(userParameters: List<Any>)

    /**
     * @param userParameters The user parameters of the project.
     */
    public fun userParameters(vararg userParameters: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datazone.CfnProjectProps.Builder =
        software.amazon.awscdk.services.datazone.CfnProjectProps.builder()

    /**
     * @param description The description of a project.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param domainIdentifier The identifier of a Amazon DataZone domain where the project exists. 
     */
    override fun domainIdentifier(domainIdentifier: String) {
      cdkBuilder.domainIdentifier(domainIdentifier)
    }

    /**
     * @param domainUnitId The ID of the domain unit.
     * This parameter is not required and if it is not specified, then the project is created at the
     * root domain unit level.
     */
    override fun domainUnitId(domainUnitId: String) {
      cdkBuilder.domainUnitId(domainUnitId)
    }

    /**
     * @param glossaryTerms The glossary terms that can be used in this Amazon DataZone project.
     */
    override fun glossaryTerms(glossaryTerms: List<String>) {
      cdkBuilder.glossaryTerms(glossaryTerms)
    }

    /**
     * @param glossaryTerms The glossary terms that can be used in this Amazon DataZone project.
     */
    override fun glossaryTerms(vararg glossaryTerms: String): Unit =
        glossaryTerms(glossaryTerms.toList())

    /**
     * @param name The name of a project. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param projectProfileId The project profile ID.
     */
    override fun projectProfileId(projectProfileId: String) {
      cdkBuilder.projectProfileId(projectProfileId)
    }

    /**
     * @param projectProfileVersion The project profile version to which the project should be
     * updated.
     * You can only specify the following string for this parameter: latest.
     */
    override fun projectProfileVersion(projectProfileVersion: String) {
      cdkBuilder.projectProfileVersion(projectProfileVersion)
    }

    /**
     * @param userParameters The user parameters of the project.
     */
    override fun userParameters(userParameters: IResolvable) {
      cdkBuilder.userParameters(userParameters.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param userParameters The user parameters of the project.
     */
    override fun userParameters(userParameters: List<Any>) {
      cdkBuilder.userParameters(userParameters.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param userParameters The user parameters of the project.
     */
    override fun userParameters(vararg userParameters: Any): Unit =
        userParameters(userParameters.toList())

    public fun build(): software.amazon.awscdk.services.datazone.CfnProjectProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.datazone.CfnProjectProps,
  ) : CdkObject(cdkObject),
      CfnProjectProps {
    /**
     * The description of a project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The identifier of a Amazon DataZone domain where the project exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-domainidentifier)
     */
    override fun domainIdentifier(): String = unwrap(this).getDomainIdentifier()

    /**
     * The ID of the domain unit.
     *
     * This parameter is not required and if it is not specified, then the project is created at the
     * root domain unit level.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-domainunitid)
     */
    override fun domainUnitId(): String? = unwrap(this).getDomainUnitId()

    /**
     * The glossary terms that can be used in this Amazon DataZone project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-glossaryterms)
     */
    override fun glossaryTerms(): List<String> = unwrap(this).getGlossaryTerms() ?: emptyList()

    /**
     * The name of a project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The project profile ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-projectprofileid)
     */
    override fun projectProfileId(): String? = unwrap(this).getProjectProfileId()

    /**
     * The project profile version to which the project should be updated.
     *
     * You can only specify the following string for this parameter: latest.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-projectprofileversion)
     */
    override fun projectProfileVersion(): String? = unwrap(this).getProjectProfileVersion()

    /**
     * The user parameters of the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-userparameters)
     */
    override fun userParameters(): Any? = unwrap(this).getUserParameters()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnProjectProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnProjectProps):
        CfnProjectProps = CdkObjectWrappers.wrap(cdkObject) as? CfnProjectProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnProjectProps):
        software.amazon.awscdk.services.datazone.CfnProjectProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.datazone.CfnProjectProps
  }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datazone

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::DataZone::Project` resource specifies an Amazon DataZone project.
 *
 * Projects enable a group of users to collaborate on various business use cases that involve
 * publishing, discovering, subscribing to, and consuming data in the Amazon DataZone catalog. Project
 * members consume assets from the Amazon DataZone catalog and produce new assets using one or more
 * analytical workflows.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.datazone.*;
 * CfnProject cfnProject = CfnProject.Builder.create(this, "MyCfnProject")
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
public open class CfnProject(
  cdkObject: software.amazon.awscdk.services.datazone.CfnProject,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnProjectProps,
  ) :
      this(software.amazon.awscdk.services.datazone.CfnProject(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnProjectProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnProjectProps.Builder.() -> Unit,
  ) : this(scope, id, CfnProjectProps(props)
  )

  /**
   * The timestamp of when a project was created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The Amazon DataZone user who created the project.
   */
  public open fun attrCreatedBy(): String = unwrap(this).getAttrCreatedBy()

  /**
   * The identifier of a Amazon DataZone domain where the project exists.
   */
  public open fun attrDomainId(): String = unwrap(this).getAttrDomainId()

  /**
   * The identifier of a project.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The timestamp of when the project was last updated.
   */
  public open fun attrLastUpdatedAt(): String = unwrap(this).getAttrLastUpdatedAt()

  /**
   * The status of the project.
   */
  public open fun attrProjectStatus(): String = unwrap(this).getAttrProjectStatus()

  /**
   * The description of a project.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of a project.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The identifier of a Amazon DataZone domain where the project exists.
   */
  public open fun domainIdentifier(): String = unwrap(this).getDomainIdentifier()

  /**
   * The identifier of a Amazon DataZone domain where the project exists.
   */
  public open fun domainIdentifier(`value`: String) {
    unwrap(this).setDomainIdentifier(`value`)
  }

  /**
   * The ID of the domain unit.
   */
  public open fun domainUnitId(): String? = unwrap(this).getDomainUnitId()

  /**
   * The ID of the domain unit.
   */
  public open fun domainUnitId(`value`: String) {
    unwrap(this).setDomainUnitId(`value`)
  }

  /**
   * The glossary terms that can be used in this Amazon DataZone project.
   */
  public open fun glossaryTerms(): List<String> = unwrap(this).getGlossaryTerms() ?: emptyList()

  /**
   * The glossary terms that can be used in this Amazon DataZone project.
   */
  public open fun glossaryTerms(`value`: List<String>) {
    unwrap(this).setGlossaryTerms(`value`)
  }

  /**
   * The glossary terms that can be used in this Amazon DataZone project.
   */
  public open fun glossaryTerms(vararg `value`: String): Unit = glossaryTerms(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of a project.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of a project.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The project profile ID.
   */
  public open fun projectProfileId(): String? = unwrap(this).getProjectProfileId()

  /**
   * The project profile ID.
   */
  public open fun projectProfileId(`value`: String) {
    unwrap(this).setProjectProfileId(`value`)
  }

  /**
   * The project profile version to which the project should be updated.
   */
  public open fun projectProfileVersion(): String? = unwrap(this).getProjectProfileVersion()

  /**
   * The project profile version to which the project should be updated.
   */
  public open fun projectProfileVersion(`value`: String) {
    unwrap(this).setProjectProfileVersion(`value`)
  }

  /**
   * The user parameters of the project.
   */
  public open fun userParameters(): Any? = unwrap(this).getUserParameters()

  /**
   * The user parameters of the project.
   */
  public open fun userParameters(`value`: IResolvable) {
    unwrap(this).setUserParameters(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The user parameters of the project.
   */
  public open fun userParameters(`value`: List<Any>) {
    unwrap(this).setUserParameters(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The user parameters of the project.
   */
  public open fun userParameters(vararg `value`: Any): Unit = userParameters(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.datazone.CfnProject].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of a project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-description)
     * @param description The description of a project. 
     */
    public fun description(description: String)

    /**
     * The identifier of a Amazon DataZone domain where the project exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-domainidentifier)
     * @param domainIdentifier The identifier of a Amazon DataZone domain where the project exists. 
     */
    public fun domainIdentifier(domainIdentifier: String)

    /**
     * The ID of the domain unit.
     *
     * This parameter is not required and if it is not specified, then the project is created at the
     * root domain unit level.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-domainunitid)
     * @param domainUnitId The ID of the domain unit. 
     */
    public fun domainUnitId(domainUnitId: String)

    /**
     * The glossary terms that can be used in this Amazon DataZone project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-glossaryterms)
     * @param glossaryTerms The glossary terms that can be used in this Amazon DataZone project. 
     */
    public fun glossaryTerms(glossaryTerms: List<String>)

    /**
     * The glossary terms that can be used in this Amazon DataZone project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-glossaryterms)
     * @param glossaryTerms The glossary terms that can be used in this Amazon DataZone project. 
     */
    public fun glossaryTerms(vararg glossaryTerms: String)

    /**
     * The name of a project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-name)
     * @param name The name of a project. 
     */
    public fun name(name: String)

    /**
     * The project profile ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-projectprofileid)
     * @param projectProfileId The project profile ID. 
     */
    public fun projectProfileId(projectProfileId: String)

    /**
     * The project profile version to which the project should be updated.
     *
     * You can only specify the following string for this parameter: latest.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-projectprofileversion)
     * @param projectProfileVersion The project profile version to which the project should be
     * updated. 
     */
    public fun projectProfileVersion(projectProfileVersion: String)

    /**
     * The user parameters of the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-userparameters)
     * @param userParameters The user parameters of the project. 
     */
    public fun userParameters(userParameters: IResolvable)

    /**
     * The user parameters of the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-userparameters)
     * @param userParameters The user parameters of the project. 
     */
    public fun userParameters(userParameters: List<Any>)

    /**
     * The user parameters of the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-userparameters)
     * @param userParameters The user parameters of the project. 
     */
    public fun userParameters(vararg userParameters: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datazone.CfnProject.Builder =
        software.amazon.awscdk.services.datazone.CfnProject.Builder.create(scope, id)

    /**
     * The description of a project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-description)
     * @param description The description of a project. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The identifier of a Amazon DataZone domain where the project exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-domainidentifier)
     * @param domainIdentifier The identifier of a Amazon DataZone domain where the project exists. 
     */
    override fun domainIdentifier(domainIdentifier: String) {
      cdkBuilder.domainIdentifier(domainIdentifier)
    }

    /**
     * The ID of the domain unit.
     *
     * This parameter is not required and if it is not specified, then the project is created at the
     * root domain unit level.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-domainunitid)
     * @param domainUnitId The ID of the domain unit. 
     */
    override fun domainUnitId(domainUnitId: String) {
      cdkBuilder.domainUnitId(domainUnitId)
    }

    /**
     * The glossary terms that can be used in this Amazon DataZone project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-glossaryterms)
     * @param glossaryTerms The glossary terms that can be used in this Amazon DataZone project. 
     */
    override fun glossaryTerms(glossaryTerms: List<String>) {
      cdkBuilder.glossaryTerms(glossaryTerms)
    }

    /**
     * The glossary terms that can be used in this Amazon DataZone project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-glossaryterms)
     * @param glossaryTerms The glossary terms that can be used in this Amazon DataZone project. 
     */
    override fun glossaryTerms(vararg glossaryTerms: String): Unit =
        glossaryTerms(glossaryTerms.toList())

    /**
     * The name of a project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-name)
     * @param name The name of a project. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The project profile ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-projectprofileid)
     * @param projectProfileId The project profile ID. 
     */
    override fun projectProfileId(projectProfileId: String) {
      cdkBuilder.projectProfileId(projectProfileId)
    }

    /**
     * The project profile version to which the project should be updated.
     *
     * You can only specify the following string for this parameter: latest.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-projectprofileversion)
     * @param projectProfileVersion The project profile version to which the project should be
     * updated. 
     */
    override fun projectProfileVersion(projectProfileVersion: String) {
      cdkBuilder.projectProfileVersion(projectProfileVersion)
    }

    /**
     * The user parameters of the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-userparameters)
     * @param userParameters The user parameters of the project. 
     */
    override fun userParameters(userParameters: IResolvable) {
      cdkBuilder.userParameters(userParameters.let(IResolvable.Companion::unwrap))
    }

    /**
     * The user parameters of the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-userparameters)
     * @param userParameters The user parameters of the project. 
     */
    override fun userParameters(userParameters: List<Any>) {
      cdkBuilder.userParameters(userParameters.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The user parameters of the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-userparameters)
     * @param userParameters The user parameters of the project. 
     */
    override fun userParameters(vararg userParameters: Any): Unit =
        userParameters(userParameters.toList())

    public fun build(): software.amazon.awscdk.services.datazone.CfnProject = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.datazone.CfnProject.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnProject {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnProject(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnProject): CfnProject =
        CfnProject(cdkObject)

    internal fun unwrap(wrapped: CfnProject): software.amazon.awscdk.services.datazone.CfnProject =
        wrapped.cdkObject as software.amazon.awscdk.services.datazone.CfnProject
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datazone.*;
   * EnvironmentConfigurationUserParameterProperty environmentConfigurationUserParameterProperty =
   * EnvironmentConfigurationUserParameterProperty.builder()
   * .environmentConfigurationName("environmentConfigurationName")
   * .environmentId("environmentId")
   * .environmentParameters(List.of(EnvironmentParameterProperty.builder()
   * .name("name")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-project-environmentconfigurationuserparameter.html)
   */
  public interface EnvironmentConfigurationUserParameterProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-project-environmentconfigurationuserparameter.html#cfn-datazone-project-environmentconfigurationuserparameter-environmentconfigurationname)
     */
    public fun environmentConfigurationName(): String? =
        unwrap(this).getEnvironmentConfigurationName()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-project-environmentconfigurationuserparameter.html#cfn-datazone-project-environmentconfigurationuserparameter-environmentid)
     */
    public fun environmentId(): String? = unwrap(this).getEnvironmentId()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-project-environmentconfigurationuserparameter.html#cfn-datazone-project-environmentconfigurationuserparameter-environmentparameters)
     */
    public fun environmentParameters(): Any? = unwrap(this).getEnvironmentParameters()

    /**
     * A builder for [EnvironmentConfigurationUserParameterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param environmentConfigurationName the value to be set.
       */
      public fun environmentConfigurationName(environmentConfigurationName: String)

      /**
       * @param environmentId the value to be set.
       */
      public fun environmentId(environmentId: String)

      /**
       * @param environmentParameters the value to be set.
       */
      public fun environmentParameters(environmentParameters: IResolvable)

      /**
       * @param environmentParameters the value to be set.
       */
      public fun environmentParameters(environmentParameters: List<Any>)

      /**
       * @param environmentParameters the value to be set.
       */
      public fun environmentParameters(vararg environmentParameters: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnProject.EnvironmentConfigurationUserParameterProperty.Builder
          =
          software.amazon.awscdk.services.datazone.CfnProject.EnvironmentConfigurationUserParameterProperty.builder()

      /**
       * @param environmentConfigurationName the value to be set.
       */
      override fun environmentConfigurationName(environmentConfigurationName: String) {
        cdkBuilder.environmentConfigurationName(environmentConfigurationName)
      }

      /**
       * @param environmentId the value to be set.
       */
      override fun environmentId(environmentId: String) {
        cdkBuilder.environmentId(environmentId)
      }

      /**
       * @param environmentParameters the value to be set.
       */
      override fun environmentParameters(environmentParameters: IResolvable) {
        cdkBuilder.environmentParameters(environmentParameters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param environmentParameters the value to be set.
       */
      override fun environmentParameters(environmentParameters: List<Any>) {
        cdkBuilder.environmentParameters(environmentParameters.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param environmentParameters the value to be set.
       */
      override fun environmentParameters(vararg environmentParameters: Any): Unit =
          environmentParameters(environmentParameters.toList())

      public fun build():
          software.amazon.awscdk.services.datazone.CfnProject.EnvironmentConfigurationUserParameterProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.datazone.CfnProject.EnvironmentConfigurationUserParameterProperty,
    ) : CdkObject(cdkObject),
        EnvironmentConfigurationUserParameterProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-project-environmentconfigurationuserparameter.html#cfn-datazone-project-environmentconfigurationuserparameter-environmentconfigurationname)
       */
      override fun environmentConfigurationName(): String? =
          unwrap(this).getEnvironmentConfigurationName()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-project-environmentconfigurationuserparameter.html#cfn-datazone-project-environmentconfigurationuserparameter-environmentid)
       */
      override fun environmentId(): String? = unwrap(this).getEnvironmentId()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-project-environmentconfigurationuserparameter.html#cfn-datazone-project-environmentconfigurationuserparameter-environmentparameters)
       */
      override fun environmentParameters(): Any? = unwrap(this).getEnvironmentParameters()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          EnvironmentConfigurationUserParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnProject.EnvironmentConfigurationUserParameterProperty):
          EnvironmentConfigurationUserParameterProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EnvironmentConfigurationUserParameterProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnvironmentConfigurationUserParameterProperty):
          software.amazon.awscdk.services.datazone.CfnProject.EnvironmentConfigurationUserParameterProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.datazone.CfnProject.EnvironmentConfigurationUserParameterProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datazone.*;
   * EnvironmentParameterProperty environmentParameterProperty =
   * EnvironmentParameterProperty.builder()
   * .name("name")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-project-environmentparameter.html)
   */
  public interface EnvironmentParameterProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-project-environmentparameter.html#cfn-datazone-project-environmentparameter-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-project-environmentparameter.html#cfn-datazone-project-environmentparameter-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [EnvironmentParameterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name the value to be set.
       */
      public fun name(name: String)

      /**
       * @param value the value to be set.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnProject.EnvironmentParameterProperty.Builder =
          software.amazon.awscdk.services.datazone.CfnProject.EnvironmentParameterProperty.builder()

      /**
       * @param name the value to be set.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param value the value to be set.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.datazone.CfnProject.EnvironmentParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.datazone.CfnProject.EnvironmentParameterProperty,
    ) : CdkObject(cdkObject),
        EnvironmentParameterProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-project-environmentparameter.html#cfn-datazone-project-environmentparameter-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-project-environmentparameter.html#cfn-datazone-project-environmentparameter-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EnvironmentParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnProject.EnvironmentParameterProperty):
          EnvironmentParameterProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EnvironmentParameterProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnvironmentParameterProperty):
          software.amazon.awscdk.services.datazone.CfnProject.EnvironmentParameterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.datazone.CfnProject.EnvironmentParameterProperty
    }
  }
}

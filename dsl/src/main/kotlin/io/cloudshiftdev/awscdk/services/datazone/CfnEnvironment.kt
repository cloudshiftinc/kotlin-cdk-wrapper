package io.cloudshiftdev.awscdk.services.datazone

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnEnvironment internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.datazone.CfnEnvironment,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The identifier of the AWS account in which an environment exists.
   */
  public open fun attrAwsAccountId(): String = unwrap(this).getAttrAwsAccountId()

  /**
   * The AWS Region in which an environment exists.
   */
  public open fun attrAwsAccountRegion(): String = unwrap(this).getAttrAwsAccountRegion()

  /**
   * The timestamp of when the environment was created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The Amazon DataZone user who created the environment.
   */
  public open fun attrCreatedBy(): String = unwrap(this).getAttrCreatedBy()

  /**
   * The identifier of the Amazon DataZone domain in which the environment exists.
   */
  public open fun attrDomainId(): String = unwrap(this).getAttrDomainId()

  /**
   * The identifier of a blueprint with which an environment profile is created.
   */
  public open fun attrEnvironmentBlueprintId(): String =
      unwrap(this).getAttrEnvironmentBlueprintId()

  /**
   * The identifier of the environment profile with which the environment was created.
   */
  public open fun attrEnvironmentProfileId(): String = unwrap(this).getAttrEnvironmentProfileId()

  /**
   * The identifier of the environment.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The identifier of the project in which the environment exists.
   */
  public open fun attrProjectId(): String = unwrap(this).getAttrProjectId()

  /**
   * The provider of the environment.
   */
  public open fun attrProvider(): String = unwrap(this).getAttrProvider()

  /**
   * The status of the environment.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * The timestamp of when the environment was updated.
   */
  public open fun attrUpdatedAt(): String = unwrap(this).getAttrUpdatedAt()

  /**
   * The description of the environment.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the environment.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The identifier of the Amazon DataZone domain in which the environment is created.
   */
  public open fun domainIdentifier(): String = unwrap(this).getDomainIdentifier()

  /**
   * The identifier of the Amazon DataZone domain in which the environment is created.
   */
  public open fun domainIdentifier(`value`: String) {
    unwrap(this).setDomainIdentifier(`value`)
  }

  /**
   * The identifier of the environment profile that is used to create this Amazon DataZone
   * environment.
   */
  public open fun environmentProfileIdentifier(): String =
      unwrap(this).getEnvironmentProfileIdentifier()

  /**
   * The identifier of the environment profile that is used to create this Amazon DataZone
   * environment.
   */
  public open fun environmentProfileIdentifier(`value`: String) {
    unwrap(this).setEnvironmentProfileIdentifier(`value`)
  }

  /**
   * The glossary terms that can be used in this Amazon DataZone environment.
   */
  public open fun glossaryTerms(): List<String> = unwrap(this).getGlossaryTerms() ?: emptyList()

  /**
   * The glossary terms that can be used in this Amazon DataZone environment.
   */
  public open fun glossaryTerms(`value`: List<String>) {
    unwrap(this).setGlossaryTerms(`value`)
  }

  /**
   * The glossary terms that can be used in this Amazon DataZone environment.
   */
  public open fun glossaryTerms(vararg `value`: String): Unit = glossaryTerms(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the Amazon DataZone environment.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the Amazon DataZone environment.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The identifier of the Amazon DataZone project in which this environment is created.
   */
  public open fun projectIdentifier(): String = unwrap(this).getProjectIdentifier()

  /**
   * The identifier of the Amazon DataZone project in which this environment is created.
   */
  public open fun projectIdentifier(`value`: String) {
    unwrap(this).setProjectIdentifier(`value`)
  }

  /**
   * The user parameters of this Amazon DataZone environment.
   */
  public open fun userParameters(): Any? = unwrap(this).getUserParameters()

  /**
   * The user parameters of this Amazon DataZone environment.
   */
  public open fun userParameters(`value`: IResolvable) {
    unwrap(this).setUserParameters(`value`.let(IResolvable::unwrap))
  }

  /**
   * The user parameters of this Amazon DataZone environment.
   */
  public open fun userParameters(__idx_ac66f0: List<Any>) {
    unwrap(this).setUserParameters(__idx_ac66f0)
  }

  /**
   * The user parameters of this Amazon DataZone environment.
   */
  public open fun userParameters(vararg __idx_ac66f0: Any): Unit =
      userParameters(__idx_ac66f0.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.datazone.CfnEnvironment].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environment.html#cfn-datazone-environment-description)
     * @param description The description of the environment. 
     */
    public fun description(description: String)

    /**
     * The identifier of the Amazon DataZone domain in which the environment is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environment.html#cfn-datazone-environment-domainidentifier)
     * @param domainIdentifier The identifier of the Amazon DataZone domain in which the environment
     * is created. 
     */
    public fun domainIdentifier(domainIdentifier: String)

    /**
     * The identifier of the environment profile that is used to create this Amazon DataZone
     * environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environment.html#cfn-datazone-environment-environmentprofileidentifier)
     * @param environmentProfileIdentifier The identifier of the environment profile that is used to
     * create this Amazon DataZone environment. 
     */
    public fun environmentProfileIdentifier(environmentProfileIdentifier: String)

    /**
     * The glossary terms that can be used in this Amazon DataZone environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environment.html#cfn-datazone-environment-glossaryterms)
     * @param glossaryTerms The glossary terms that can be used in this Amazon DataZone environment.
     * 
     */
    public fun glossaryTerms(glossaryTerms: List<String>)

    /**
     * The glossary terms that can be used in this Amazon DataZone environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environment.html#cfn-datazone-environment-glossaryterms)
     * @param glossaryTerms The glossary terms that can be used in this Amazon DataZone environment.
     * 
     */
    public fun glossaryTerms(vararg glossaryTerms: String)

    /**
     * The name of the Amazon DataZone environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environment.html#cfn-datazone-environment-name)
     * @param name The name of the Amazon DataZone environment. 
     */
    public fun name(name: String)

    /**
     * The identifier of the Amazon DataZone project in which this environment is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environment.html#cfn-datazone-environment-projectidentifier)
     * @param projectIdentifier The identifier of the Amazon DataZone project in which this
     * environment is created. 
     */
    public fun projectIdentifier(projectIdentifier: String)

    /**
     * The user parameters of this Amazon DataZone environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environment.html#cfn-datazone-environment-userparameters)
     * @param userParameters The user parameters of this Amazon DataZone environment. 
     */
    public fun userParameters(userParameters: IResolvable)

    /**
     * The user parameters of this Amazon DataZone environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environment.html#cfn-datazone-environment-userparameters)
     * @param userParameters The user parameters of this Amazon DataZone environment. 
     */
    public fun userParameters(userParameters: List<Any>)

    /**
     * The user parameters of this Amazon DataZone environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environment.html#cfn-datazone-environment-userparameters)
     * @param userParameters The user parameters of this Amazon DataZone environment. 
     */
    public fun userParameters(vararg userParameters: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datazone.CfnEnvironment.Builder =
        software.amazon.awscdk.services.datazone.CfnEnvironment.Builder.create(scope, id)

    /**
     * The description of the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environment.html#cfn-datazone-environment-description)
     * @param description The description of the environment. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The identifier of the Amazon DataZone domain in which the environment is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environment.html#cfn-datazone-environment-domainidentifier)
     * @param domainIdentifier The identifier of the Amazon DataZone domain in which the environment
     * is created. 
     */
    override fun domainIdentifier(domainIdentifier: String) {
      cdkBuilder.domainIdentifier(domainIdentifier)
    }

    /**
     * The identifier of the environment profile that is used to create this Amazon DataZone
     * environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environment.html#cfn-datazone-environment-environmentprofileidentifier)
     * @param environmentProfileIdentifier The identifier of the environment profile that is used to
     * create this Amazon DataZone environment. 
     */
    override fun environmentProfileIdentifier(environmentProfileIdentifier: String) {
      cdkBuilder.environmentProfileIdentifier(environmentProfileIdentifier)
    }

    /**
     * The glossary terms that can be used in this Amazon DataZone environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environment.html#cfn-datazone-environment-glossaryterms)
     * @param glossaryTerms The glossary terms that can be used in this Amazon DataZone environment.
     * 
     */
    override fun glossaryTerms(glossaryTerms: List<String>) {
      cdkBuilder.glossaryTerms(glossaryTerms)
    }

    /**
     * The glossary terms that can be used in this Amazon DataZone environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environment.html#cfn-datazone-environment-glossaryterms)
     * @param glossaryTerms The glossary terms that can be used in this Amazon DataZone environment.
     * 
     */
    override fun glossaryTerms(vararg glossaryTerms: String): Unit =
        glossaryTerms(glossaryTerms.toList())

    /**
     * The name of the Amazon DataZone environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environment.html#cfn-datazone-environment-name)
     * @param name The name of the Amazon DataZone environment. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The identifier of the Amazon DataZone project in which this environment is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environment.html#cfn-datazone-environment-projectidentifier)
     * @param projectIdentifier The identifier of the Amazon DataZone project in which this
     * environment is created. 
     */
    override fun projectIdentifier(projectIdentifier: String) {
      cdkBuilder.projectIdentifier(projectIdentifier)
    }

    /**
     * The user parameters of this Amazon DataZone environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environment.html#cfn-datazone-environment-userparameters)
     * @param userParameters The user parameters of this Amazon DataZone environment. 
     */
    override fun userParameters(userParameters: IResolvable) {
      cdkBuilder.userParameters(userParameters.let(IResolvable::unwrap))
    }

    /**
     * The user parameters of this Amazon DataZone environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environment.html#cfn-datazone-environment-userparameters)
     * @param userParameters The user parameters of this Amazon DataZone environment. 
     */
    override fun userParameters(userParameters: List<Any>) {
      cdkBuilder.userParameters(userParameters)
    }

    /**
     * The user parameters of this Amazon DataZone environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environment.html#cfn-datazone-environment-userparameters)
     * @param userParameters The user parameters of this Amazon DataZone environment. 
     */
    override fun userParameters(vararg userParameters: Any): Unit =
        userParameters(userParameters.toList())

    public fun build(): software.amazon.awscdk.services.datazone.CfnEnvironment = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.datazone.CfnEnvironment.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEnvironment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEnvironment(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnEnvironment):
        CfnEnvironment = CfnEnvironment(cdkObject)

    internal fun unwrap(wrapped: CfnEnvironment):
        software.amazon.awscdk.services.datazone.CfnEnvironment = wrapped.cdkObject
  }

  public interface EnvironmentParameterProperty {
    /**
     * The name of the environment parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-environment-environmentparameter.html#cfn-datazone-environment-environmentparameter-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * The value of the environment parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-environment-environmentparameter.html#cfn-datazone-environment-environmentparameter-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [EnvironmentParameterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the environment parameter.
       */
      public fun name(name: String)

      /**
       * @param value The value of the environment parameter.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnEnvironment.EnvironmentParameterProperty.Builder
          =
          software.amazon.awscdk.services.datazone.CfnEnvironment.EnvironmentParameterProperty.builder()

      /**
       * @param name The name of the environment parameter.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param value The value of the environment parameter.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.datazone.CfnEnvironment.EnvironmentParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.datazone.CfnEnvironment.EnvironmentParameterProperty,
    ) : CdkObject(cdkObject), EnvironmentParameterProperty {
      /**
       * The name of the environment parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-environment-environmentparameter.html#cfn-datazone-environment-environmentparameter-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * The value of the environment parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-environment-environmentparameter.html#cfn-datazone-environment-environmentparameter-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EnvironmentParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnEnvironment.EnvironmentParameterProperty):
          EnvironmentParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnvironmentParameterProperty):
          software.amazon.awscdk.services.datazone.CfnEnvironment.EnvironmentParameterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.datazone.CfnEnvironment.EnvironmentParameterProperty
    }
  }
}
